package xqt.model.declarations;

import java.text.MessageFormat;
import java.util.ArrayList;

import com.vaiona.commons.logging.LoggerHelper;

import xqt.model.Keywords;
import xqt.model.PhraseDescriptor;
import xqt.model.expressions.Expression;
import xqt.model.expressions.MemberExpression;

/**
 *
 * @author jfd
 */
public class PerspectiveAttributeDescriptor extends PhraseDescriptor {
    
    private PerspectiveDescriptor perspective;
    private String dataType;
    private String semanticKey;
    private Expression forwardExpression;
    private Expression reverseExpression;
    private PerspectiveAttributeDescriptor reference;
    private boolean auxiliary = false; // aux attributes are those used in the where, orderby or group clauses witout appearing in the result set
    
    public PerspectiveAttributeDescriptor(){
        
    }
    
    public PerspectiveAttributeDescriptor(PerspectiveAttributeDescriptor original){
        this.perspective = original.perspective;
        this.dataType = original.dataType;
        this.semanticKey = original.semanticKey;
        this.forwardExpression = original.forwardExpression;
        this.reverseExpression = original.reverseExpression;
        this.orderInParent = original.orderInParent;
        this.id = original.id;
        this.type = original.type;
        this.parserContext = original.parserContext;
        this.setExtra(original.getExtra());
        this.reference = original;
        this.languageExceptions = new ArrayList<>(original.languageExceptions);
    }

    public PerspectiveAttributeDescriptor getReference() {
        return reference;
    }
        
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getSemanticKey() {
        return semanticKey;
    }

    public void setSemanticKey(String semanticKey) {
        this.semanticKey = semanticKey;
    }

    public Expression getForwardExpression() {
        return forwardExpression;
    }

    public void setForwardExpression(Expression forwardExpression) {
        this.forwardExpression = forwardExpression;
    }

    public Expression getReverseExpression() {
        return reverseExpression;
    }

    public void setReverseExpression(Expression reverseExpression) {
        this.reverseExpression = reverseExpression;
    }

    public PerspectiveDescriptor getPerspective() {
        return perspective;
    }

    public void setPerspective(PerspectiveDescriptor perspective) {
        this.perspective = perspective;
    }

    public boolean isAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(boolean auxiliary) {
        this.auxiliary = auxiliary;
    }
    
    @Override
    public void setId(String value){
    	if(Keywords.attributeNames.containsKey(value)){
    		id  = Keywords.attributeNames.get(value);
    		String msg = MessageFormat.format("Attribute name changed from {0} to {1}.", value, id);
    		LoggerHelper.logError(msg);
    		//System.out.println(msg);
    	}
    	else
    		id = value;
    }
    
    public static PerspectiveAttributeDescriptor createCanonic(String name, String dataType, boolean auxiliary){
        PerspectiveAttributeDescriptor attribute = new PerspectiveAttributeDescriptor();
        attribute.setAuxiliary(auxiliary);
        attribute.setId(name);
        attribute.setDataType(dataType);
        MemberExpression fwd = Expression.Member(attribute.getId(), attribute.getDataType());
        MemberExpression rvs = Expression.Member(attribute.getId(), attribute.getDataType());
        attribute.setForwardExpression(fwd);
        attribute.setReverseExpression(rvs);
        return attribute;
    }
        
}
