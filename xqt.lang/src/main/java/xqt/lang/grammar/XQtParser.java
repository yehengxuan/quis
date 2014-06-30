// Generated from D:\Projects\PhD\Src\XQt\xqt.lang\src\main\java\xqt\lang\grammar\source\XQt.g4 by ANTLR 4.2.2
package xqt.lang.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQtParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, PERSPECTIVE=6, SELECT=7, FROM=8, 
		EXTENDS=9, ATTRIBUTE=10, MapTo=11, REVERSEMAP=12, CONNECTION=13, ADAPTER=14, 
		SOURCE_URI=15, PARAMETERS=16, BIND=17, SCOPE=18, VERSION=19, LATEST=20, 
		DISTINCT=21, UNION=22, ON=23, JOIN=24, INTO=25, ANCHOR=26, START=27, STOP=28, 
		WHERE=29, ORDERBY=30, ASC=31, DESC=32, NULL=33, FIRST=34, LAST=35, LIMIT=36, 
		SKIP=37, TAKE=38, GROUPBY=39, IS=40, NoT=41, NUMBER=42, DatE=43, EMPTY=44, 
		Boolean=45, String=46, Byte=47, Integer=48, Long=49, Real=50, Date=51, 
		EQ=52, NotEQ=53, GT=54, GTEQ=55, LT=56, LTEQ=57, LIKE=58, PLUS=59, MINUS=60, 
		NEGATE=61, MULT=62, DIV=63, MOD=64, POW=65, NOT=66, ASN=67, AOR=68, AAND=69, 
		COMMA=70, UNDERSCORE=71, LPAR=72, RPAR=73, DOT=74, LCUR=75, RCUR=76, DCOLON=77, 
		COLON=78, OR=79, AND=80, RELATIONSHIP=81, RELATION_FW=82, RELATION_RW=83, 
		RELATION_UN=84, RELATION_BI=85, CHAR=86, STRING=87, LINE_COMMENT=88, COMMENT=89, 
		NEWLINE=90, WS=91, ID=92, BOOLEAN=93, DATE=94, UINT=95, INT=96, FLOAT=97;
	public static final String[] tokenNames = {
		"<INVALID>", "'after'", "'#'", "'$'", "'exact'", "'before'", "PERSPECTIVE", 
		"SELECT", "FROM", "EXTENDS", "ATTRIBUTE", "MapTo", "REVERSEMAP", "CONNECTION", 
		"ADAPTER", "SOURCE_URI", "PARAMETERS", "BIND", "SCOPE", "VERSION", "LATEST", 
		"DISTINCT", "UNION", "ON", "JOIN", "INTO", "ANCHOR", "START", "STOP", 
		"WHERE", "ORDERBY", "ASC", "DESC", "NULL", "FIRST", "LAST", "LIMIT", "SKIP", 
		"TAKE", "GROUPBY", "IS", "NoT", "NUMBER", "DatE", "EMPTY", "Boolean", 
		"String", "Byte", "Integer", "Long", "Real", "Date", "'=='", "'<>'", "'>'", 
		"'>='", "'<'", "'<='", "'~'", "'+'", "'-'", "NEGATE", "'*'", "'/'", "'%'", 
		"'^'", "'!'", "'='", "'|'", "'&'", "','", "'_'", "'('", "')'", "'.'", 
		"'{'", "'}'", "'::'", "':'", "OR", "AND", "RELATIONSHIP", "'->'", "'<-'", 
		"'--'", "'<->'", "CHAR", "STRING", "LINE_COMMENT", "COMMENT", "NEWLINE", 
		"WS", "ID", "BOOLEAN", "DATE", "UINT", "INT", "FLOAT"
	};
	public static final int
		RULE_createProcessModel = 0, RULE_process = 1, RULE_perspective = 2, RULE_attribute_def = 3, 
		RULE_connection = 4, RULE_parameter_def = 5, RULE_binding = 6, RULE_binding_scope_def = 7, 
		RULE_statement = 8, RULE_dataStatement = 9, RULE_dataRetrievalStatement = 10, 
		RULE_selectStatement = 11, RULE_setQualifierClause = 12, RULE_projectionClause = 13, 
		RULE_sourceSelectionClause = 14, RULE_sourceRef = 15, RULE_joinedSource = 16, 
		RULE_joinDescription = 17, RULE_joinSpecification = 18, RULE_simpleSource = 19, 
		RULE_bindingRef = 20, RULE_containerRef = 21, RULE_targetSelectionClause = 22, 
		RULE_anchorClause = 23, RULE_filterClause = 24, RULE_orderClause = 25, 
		RULE_sortSpecification = 26, RULE_sortKey = 27, RULE_sortOrder = 28, RULE_nullOrder = 29, 
		RULE_limitClause = 30, RULE_groupClause = 31, RULE_variable = 32, RULE_searchPhrase = 33, 
		RULE_intNumber = 34, RULE_floatNumber = 35, RULE_expression = 36, RULE_function = 37, 
		RULE_argument = 38, RULE_packagedIdentifier = 39, RULE_smartId = 40, RULE_dataType = 41, 
		RULE_semanticKey = 42, RULE_value = 43, RULE_idExpr = 44, RULE_versionSelector = 45, 
		RULE_labelVersionSelector = 46, RULE_sequenceVersionSelector = 47, RULE_dateVersionSelector = 48, 
		RULE_simpleIdentifier = 49, RULE_qualifiedIdentifier = 50, RULE_literal = 51, 
		RULE_path = 52, RULE_pathEntity = 53, RULE_pathAttribute = 54;
	public static final String[] ruleNames = {
		"createProcessModel", "process", "perspective", "attribute_def", "connection", 
		"parameter_def", "binding", "binding_scope_def", "statement", "dataStatement", 
		"dataRetrievalStatement", "selectStatement", "setQualifierClause", "projectionClause", 
		"sourceSelectionClause", "sourceRef", "joinedSource", "joinDescription", 
		"joinSpecification", "simpleSource", "bindingRef", "containerRef", "targetSelectionClause", 
		"anchorClause", "filterClause", "orderClause", "sortSpecification", "sortKey", 
		"sortOrder", "nullOrder", "limitClause", "groupClause", "variable", "searchPhrase", 
		"intNumber", "floatNumber", "expression", "function", "argument", "packagedIdentifier", 
		"smartId", "dataType", "semanticKey", "value", "idExpr", "versionSelector", 
		"labelVersionSelector", "sequenceVersionSelector", "dateVersionSelector", 
		"simpleIdentifier", "qualifiedIdentifier", "literal", "path", "pathEntity", 
		"pathAttribute"
	};

	@Override
	public String getGrammarFileName() { return "XQt.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CreateProcessModelContext extends ParserRuleContext {
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public CreateProcessModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcessModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterCreateProcessModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitCreateProcessModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitCreateProcessModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcessModelContext createProcessModel() throws RecognitionException {
		CreateProcessModelContext _localctx = new CreateProcessModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_createProcessModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); process();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(XQtParser.EOF, 0); }
		public List<PerspectiveContext> perspective() {
			return getRuleContexts(PerspectiveContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XQtParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XQtParser.NEWLINE, i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public PerspectiveContext perspective(int i) {
			return getRuleContext(PerspectiveContext.class,i);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_process);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERSPECTIVE) {
				{
				{
				setState(112); perspective();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONNECTION) {
				{
				{
				setState(118); connection();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIND) {
				{
				{
				setState(124); binding();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130); statement();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(131); match(NEWLINE);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			setState(141); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerspectiveContext extends ParserRuleContext {
		public Token name;
		public Token superPerspective;
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode PERSPECTIVE() { return getToken(XQtParser.PERSPECTIVE, 0); }
		public TerminalNode RCUR() { return getToken(XQtParser.RCUR, 0); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public List<Attribute_defContext> attribute_def() {
			return getRuleContexts(Attribute_defContext.class);
		}
		public Attribute_defContext attribute_def(int i) {
			return getRuleContext(Attribute_defContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(XQtParser.EXTENDS, 0); }
		public TerminalNode LCUR() { return getToken(XQtParser.LCUR, 0); }
		public PerspectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perspective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPerspective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPerspective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPerspective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerspectiveContext perspective() throws RecognitionException {
		PerspectiveContext _localctx = new PerspectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perspective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(PERSPECTIVE);
			setState(144); ((PerspectiveContext)_localctx).name = match(ID);
			setState(147);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(145); match(EXTENDS);
				setState(146); ((PerspectiveContext)_localctx).superPerspective = match(ID);
				}
			}

			setState(149); match(LCUR);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150); attribute_def();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTRIBUTE );
			setState(155); match(RCUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_defContext extends ParserRuleContext {
		public ExpressionContext fwd;
		public ExpressionContext rvs;
		public TerminalNode MapTo() { return getToken(XQtParser.MapTo, 0); }
		public TerminalNode ASN(int i) {
			return getToken(XQtParser.ASN, i);
		}
		public SmartIdContext smartId() {
			return getRuleContext(SmartIdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQtParser.COMMA, 0); }
		public List<TerminalNode> ASN() { return getTokens(XQtParser.ASN); }
		public TerminalNode ATTRIBUTE() { return getToken(XQtParser.ATTRIBUTE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REVERSEMAP() { return getToken(XQtParser.REVERSEMAP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Attribute_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterAttribute_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitAttribute_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitAttribute_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_defContext attribute_def() throws RecognitionException {
		Attribute_defContext _localctx = new Attribute_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(ATTRIBUTE);
			setState(158); smartId();
			setState(162);
			_la = _input.LA(1);
			if (_la==MapTo) {
				{
				setState(159); match(MapTo);
				setState(160); match(ASN);
				setState(161); ((Attribute_defContext)_localctx).fwd = expression(0);
				}
			}

			setState(167);
			_la = _input.LA(1);
			if (_la==REVERSEMAP) {
				{
				setState(164); match(REVERSEMAP);
				setState(165); match(ASN);
				setState(166); ((Attribute_defContext)_localctx).rvs = expression(0);
				}
			}

			setState(169); match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectionContext extends ParserRuleContext {
		public Token name;
		public Token adapterName;
		public Token srcURI;
		public TerminalNode ASN(int i) {
			return getToken(XQtParser.ASN, i);
		}
		public TerminalNode ADAPTER() { return getToken(XQtParser.ADAPTER, 0); }
		public List<Parameter_defContext> parameter_def() {
			return getRuleContexts(Parameter_defContext.class);
		}
		public TerminalNode CONNECTION() { return getToken(XQtParser.CONNECTION, 0); }
		public List<TerminalNode> ASN() { return getTokens(XQtParser.ASN); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public Parameter_defContext parameter_def(int i) {
			return getRuleContext(Parameter_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode PARAMETERS() { return getToken(XQtParser.PARAMETERS, 0); }
		public TerminalNode SOURCE_URI() { return getToken(XQtParser.SOURCE_URI, 0); }
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(CONNECTION);
			setState(172); ((ConnectionContext)_localctx).name = match(ID);
			setState(173); match(ADAPTER);
			setState(174); match(ASN);
			setState(175); ((ConnectionContext)_localctx).adapterName = match(ID);
			setState(176); match(SOURCE_URI);
			setState(177); match(ASN);
			setState(178); ((ConnectionContext)_localctx).srcURI = match(STRING);
			setState(189);
			_la = _input.LA(1);
			if (_la==PARAMETERS) {
				{
				setState(179); match(PARAMETERS);
				setState(180); match(ASN);
				{
				setState(181); parameter_def();
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182); match(COMMA);
					setState(183); parameter_def();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parameter_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterParameter_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitParameter_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitParameter_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_defContext parameter_def() throws RecognitionException {
		Parameter_defContext _localctx = new Parameter_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(ID);
			setState(192); match(COLON);
			setState(193); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingContext extends ParserRuleContext {
		public Token name;
		public Token connectionName;
		public TerminalNode ASN(int i) {
			return getToken(XQtParser.ASN, i);
		}
		public TerminalNode VERSION() { return getToken(XQtParser.VERSION, 0); }
		public TerminalNode CONNECTION() { return getToken(XQtParser.CONNECTION, 0); }
		public List<TerminalNode> ASN() { return getTokens(XQtParser.ASN); }
		public Binding_scope_defContext binding_scope_def(int i) {
			return getRuleContext(Binding_scope_defContext.class,i);
		}
		public TerminalNode BIND() { return getToken(XQtParser.BIND, 0); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public VersionSelectorContext versionSelector() {
			return getRuleContext(VersionSelectorContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public List<Binding_scope_defContext> binding_scope_def() {
			return getRuleContexts(Binding_scope_defContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode SCOPE() { return getToken(XQtParser.SCOPE, 0); }
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(BIND);
			setState(196); ((BindingContext)_localctx).name = match(ID);
			setState(197); match(CONNECTION);
			setState(198); match(ASN);
			setState(199); ((BindingContext)_localctx).connectionName = match(ID);
			setState(210);
			_la = _input.LA(1);
			if (_la==SCOPE) {
				{
				setState(200); match(SCOPE);
				setState(201); match(ASN);
				setState(202); binding_scope_def();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203); match(COMMA);
					setState(204); binding_scope_def();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(215);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(212); match(VERSION);
				setState(213); match(ASN);
				setState(214); versionSelector();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binding_scope_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public Binding_scope_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding_scope_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterBinding_scope_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitBinding_scope_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitBinding_scope_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binding_scope_defContext binding_scope_def() throws RecognitionException {
		Binding_scope_defContext _localctx = new Binding_scope_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binding_scope_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); dataStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataStatementContext extends ParserRuleContext {
		public DataRetrievalStatementContext dataRetrievalStatement() {
			return getRuleContext(DataRetrievalStatementContext.class,0);
		}
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); dataRetrievalStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataRetrievalStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DataRetrievalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRetrievalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDataRetrievalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDataRetrievalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDataRetrievalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRetrievalStatementContext dataRetrievalStatement() throws RecognitionException {
		DataRetrievalStatementContext _localctx = new DataRetrievalStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataRetrievalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); selectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public SourceSelectionClauseContext sourceSelectionClause() {
			return getRuleContext(SourceSelectionClauseContext.class,0);
		}
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public TargetSelectionClauseContext targetSelectionClause() {
			return getRuleContext(TargetSelectionClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(XQtParser.SELECT, 0); }
		public AnchorClauseContext anchorClause() {
			return getRuleContext(AnchorClauseContext.class,0);
		}
		public ProjectionClauseContext projectionClause() {
			return getRuleContext(ProjectionClauseContext.class,0);
		}
		public SetQualifierClauseContext setQualifierClause() {
			return getRuleContext(SetQualifierClauseContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(SELECT);
			setState(227);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==UNION) {
				{
				setState(226); setQualifierClause();
				}
			}

			setState(230);
			_la = _input.LA(1);
			if (_la==PERSPECTIVE) {
				{
				setState(229); projectionClause();
				}
			}

			setState(232); sourceSelectionClause();
			setState(234);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(233); targetSelectionClause();
				}
			}

			setState(237);
			_la = _input.LA(1);
			if (_la==ANCHOR) {
				{
				setState(236); anchorClause();
				}
			}

			setState(240);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(239); filterClause();
				}
			}

			setState(243);
			_la = _input.LA(1);
			if (_la==ORDERBY) {
				{
				setState(242); orderClause();
				}
			}

			setState(246);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(245); limitClause();
				}
			}

			setState(249);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(248); groupClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQualifierClauseContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(XQtParser.UNION, 0); }
		public TerminalNode DISTINCT() { return getToken(XQtParser.DISTINCT, 0); }
		public SetQualifierClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQualifierClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSetQualifierClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSetQualifierClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSetQualifierClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQualifierClauseContext setQualifierClause() throws RecognitionException {
		SetQualifierClauseContext _localctx = new SetQualifierClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setQualifierClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionClauseContext extends ParserRuleContext {
		public SimpleIdentifierContext perspectiveName;
		public TerminalNode PERSPECTIVE() { return getToken(XQtParser.PERSPECTIVE, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ProjectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterProjectionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitProjectionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitProjectionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionClauseContext projectionClause() throws RecognitionException {
		ProjectionClauseContext _localctx = new ProjectionClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_projectionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(PERSPECTIVE);
			setState(254); ((ProjectionClauseContext)_localctx).perspectiveName = simpleIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceSelectionClauseContext extends ParserRuleContext {
		public SourceRefContext sourceRef() {
			return getRuleContext(SourceRefContext.class,0);
		}
		public TerminalNode FROM() { return getToken(XQtParser.FROM, 0); }
		public SourceSelectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSelectionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSourceSelectionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSourceSelectionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSourceSelectionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceSelectionClauseContext sourceSelectionClause() throws RecognitionException {
		SourceSelectionClauseContext _localctx = new SourceSelectionClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sourceSelectionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(FROM);
			setState(257); sourceRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceRefContext extends ParserRuleContext {
		public SimpleSourceContext simpleSource() {
			return getRuleContext(SimpleSourceContext.class,0);
		}
		public JoinedSourceContext joinedSource() {
			return getRuleContext(JoinedSourceContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SourceRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSourceRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSourceRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSourceRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceRefContext sourceRef() throws RecognitionException {
		SourceRefContext _localctx = new SourceRefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sourceRef);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); joinedSource();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); simpleSource();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261); variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinedSourceContext extends ParserRuleContext {
		public List<SimpleSourceContext> simpleSource() {
			return getRuleContexts(SimpleSourceContext.class);
		}
		public TerminalNode ON() { return getToken(XQtParser.ON, 0); }
		public JoinDescriptionContext joinDescription() {
			return getRuleContext(JoinDescriptionContext.class,0);
		}
		public SimpleSourceContext simpleSource(int i) {
			return getRuleContext(SimpleSourceContext.class,i);
		}
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public JoinedSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterJoinedSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitJoinedSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitJoinedSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedSourceContext joinedSource() throws RecognitionException {
		JoinedSourceContext _localctx = new JoinedSourceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_joinedSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); simpleSource();
			setState(265); joinDescription();
			setState(266); simpleSource();
			setState(267); match(ON);
			setState(268); joinSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinDescriptionContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(XQtParser.JOIN, 0); }
		public JoinDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterJoinDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitJoinDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitJoinDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinDescriptionContext joinDescription() throws RecognitionException {
		JoinDescriptionContext _localctx = new JoinDescriptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_joinDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSpecificationContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode NotEQ() { return getToken(XQtParser.NotEQ, 0); }
		public TerminalNode LTEQ() { return getToken(XQtParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(XQtParser.LT, 0); }
		public TerminalNode GT() { return getToken(XQtParser.GT, 0); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(XQtParser.EQ, 0); }
		public TerminalNode LIKE() { return getToken(XQtParser.LIKE, 0); }
		public TerminalNode GTEQ() { return getToken(XQtParser.GTEQ, 0); }
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterJoinSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitJoinSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(ID);
			setState(273);
			((JoinSpecificationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NotEQ) | (1L << GT) | (1L << GTEQ) | (1L << LT) | (1L << LTEQ) | (1L << LIKE))) != 0)) ) {
				((JoinSpecificationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(274); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleSourceContext extends ParserRuleContext {
		public ContainerRefContext containerRef() {
			return getRuleContext(ContainerRefContext.class,0);
		}
		public TerminalNode DOT() { return getToken(XQtParser.DOT, 0); }
		public BindingRefContext bindingRef() {
			return getRuleContext(BindingRefContext.class,0);
		}
		public SimpleSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSimpleSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSimpleSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSimpleSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSourceContext simpleSource() throws RecognitionException {
		SimpleSourceContext _localctx = new SimpleSourceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simpleSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); bindingRef();
			setState(277); match(DOT);
			setState(278); containerRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public BindingRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterBindingRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitBindingRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitBindingRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingRefContext bindingRef() throws RecognitionException {
		BindingRefContext _localctx = new BindingRefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bindingRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public TerminalNode UINT() { return getToken(XQtParser.UINT, 0); }
		public ContainerRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterContainerRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitContainerRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitContainerRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerRefContext containerRef() throws RecognitionException {
		ContainerRefContext _localctx = new ContainerRefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_containerRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==UINT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetSelectionClauseContext extends ParserRuleContext {
		public SimpleSourceContext simpleSource() {
			return getRuleContext(SimpleSourceContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INTO() { return getToken(XQtParser.INTO, 0); }
		public TargetSelectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetSelectionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterTargetSelectionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitTargetSelectionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitTargetSelectionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetSelectionClauseContext targetSelectionClause() throws RecognitionException {
		TargetSelectionClauseContext _localctx = new TargetSelectionClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_targetSelectionClause);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); match(INTO);
				setState(285); variable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(INTO);
				setState(287); simpleSource();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnchorClauseContext extends ParserRuleContext {
		public SearchPhraseContext startAnchor;
		public SearchPhraseContext stopAnchor;
		public TerminalNode STOP() { return getToken(XQtParser.STOP, 0); }
		public TerminalNode START() { return getToken(XQtParser.START, 0); }
		public List<SearchPhraseContext> searchPhrase() {
			return getRuleContexts(SearchPhraseContext.class);
		}
		public TerminalNode ANCHOR() { return getToken(XQtParser.ANCHOR, 0); }
		public SearchPhraseContext searchPhrase(int i) {
			return getRuleContext(SearchPhraseContext.class,i);
		}
		public AnchorClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchorClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterAnchorClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitAnchorClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitAnchorClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorClauseContext anchorClause() throws RecognitionException {
		AnchorClauseContext _localctx = new AnchorClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_anchorClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(ANCHOR);
			setState(293);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(291); match(START);
				setState(292); ((AnchorClauseContext)_localctx).startAnchor = searchPhrase();
				}
			}

			setState(297);
			_la = _input.LA(1);
			if (_la==STOP) {
				{
				setState(295); match(STOP);
				setState(296); ((AnchorClauseContext)_localctx).stopAnchor = searchPhrase();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XQtParser.WHERE, 0); }
		public SearchPhraseContext searchPhrase() {
			return getRuleContext(SearchPhraseContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(WHERE);
			setState(300); match(LPAR);
			setState(301); searchPhrase();
			setState(302); match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(XQtParser.ORDERBY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public SortSpecificationContext sortSpecification(int i) {
			return getRuleContext(SortSpecificationContext.class,i);
		}
		public List<SortSpecificationContext> sortSpecification() {
			return getRuleContexts(SortSpecificationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitOrderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(ORDERBY);
			setState(305); sortSpecification();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306); match(COMMA);
				setState(307); sortSpecification();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortSpecificationContext extends ParserRuleContext {
		public SortOrderContext sortOrder() {
			return getRuleContext(SortOrderContext.class,0);
		}
		public NullOrderContext nullOrder() {
			return getRuleContext(NullOrderContext.class,0);
		}
		public SortKeyContext sortKey() {
			return getRuleContext(SortKeyContext.class,0);
		}
		public SortSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSortSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSortSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSortSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortSpecificationContext sortSpecification() throws RecognitionException {
		SortSpecificationContext _localctx = new SortSpecificationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sortSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); sortKey();
			setState(315);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(314); sortOrder();
				}
			}

			setState(318);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(317); nullOrder();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortKeyContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public SortKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSortKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSortKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSortKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortKeyContext sortKey() throws RecognitionException {
		SortKeyContext _localctx = new SortKeyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sortKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); simpleIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortOrderContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(XQtParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(XQtParser.DESC, 0); }
		public SortOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSortOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSortOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSortOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortOrderContext sortOrder() throws RecognitionException {
		SortOrderContext _localctx = new SortOrderContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sortOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullOrderContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(XQtParser.NULL, 0); }
		public TerminalNode FIRST() { return getToken(XQtParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(XQtParser.LAST, 0); }
		public NullOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterNullOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitNullOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitNullOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullOrderContext nullOrder() throws RecognitionException {
		NullOrderContext _localctx = new NullOrderContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nullOrder);
		try {
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); match(NULL);
				setState(325); match(FIRST);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(NULL);
				setState(327); match(LAST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public Token skip;
		public Token take;
		public TerminalNode TAKE() { return getToken(XQtParser.TAKE, 0); }
		public TerminalNode LIMIT() { return getToken(XQtParser.LIMIT, 0); }
		public List<TerminalNode> UINT() { return getTokens(XQtParser.UINT); }
		public TerminalNode SKIP() { return getToken(XQtParser.SKIP, 0); }
		public TerminalNode UINT(int i) {
			return getToken(XQtParser.UINT, i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(LIMIT);
			setState(333);
			_la = _input.LA(1);
			if (_la==SKIP) {
				{
				setState(331); match(SKIP);
				setState(332); ((LimitClauseContext)_localctx).skip = match(UINT);
				}
			}

			setState(337);
			_la = _input.LA(1);
			if (_la==TAKE) {
				{
				setState(335); match(TAKE);
				setState(336); ((LimitClauseContext)_localctx).take = match(UINT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupClauseContext extends ParserRuleContext {
		public TerminalNode GROUPBY() { return getToken(XQtParser.GROUPBY, 0); }
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterGroupClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitGroupClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitGroupClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(GROUPBY);
			setState(340); simpleIdentifier();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341); match(COMMA);
				setState(342); simpleIdentifier();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchPhraseContext extends ParserRuleContext {
		public ExpressionContext phrase;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSearchPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSearchPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSearchPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchPhraseContext searchPhrase() throws RecognitionException {
		SearchPhraseContext _localctx = new SearchPhraseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_searchPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); ((SearchPhraseContext)_localctx).phrase = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XQtParser.INT, 0); }
		public IntNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterIntNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitIntNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitIntNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntNumberContext intNumber() throws RecognitionException {
		IntNumberContext _localctx = new IntNumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_intNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatNumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(XQtParser.FLOAT, 0); }
		public FloatNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFloatNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFloatNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFloatNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatNumberContext floatNumber() throws RecognitionException {
		FloatNumberContext _localctx = new FloatNumberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_floatNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_notContext extends ExpressionContext {
		public Token op;
		public ExpressionContext operand;
		public TerminalNode NOT() { return getToken(XQtParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_notContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_nestContext extends ExpressionContext {
		public ExpressionContext operand;
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_nestContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_nest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_nest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_nest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_functionContext extends ExpressionContext {
		public FunctionContext operand;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Expression_functionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_valueContext extends ExpressionContext {
		public ValueContext operand;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression_valueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_multContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public TerminalNode MULT() { return getToken(XQtParser.MULT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(XQtParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(XQtParser.DIV, 0); }
		public Expression_multContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_mult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_powerContext extends ExpressionContext {
		public ExpressionContext x;
		public Token op;
		public ExpressionContext y;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_powerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_power(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_power(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_aAndOrContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AAND() { return getToken(XQtParser.AAND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode AOR() { return getToken(XQtParser.AOR, 0); }
		public Expression_aAndOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_aAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_aAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_aAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_andOrContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQtParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQtParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_andOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_andOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_andOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_andOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_addContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(XQtParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XQtParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_addContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_isContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token not;
		public Token isType;
		public TerminalNode IS() { return getToken(XQtParser.IS, 0); }
		public TerminalNode NULL() { return getToken(XQtParser.NULL, 0); }
		public TerminalNode NoT() { return getToken(XQtParser.NoT, 0); }
		public TerminalNode DatE() { return getToken(XQtParser.DatE, 0); }
		public TerminalNode NUMBER() { return getToken(XQtParser.NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EMPTY() { return getToken(XQtParser.EMPTY, 0); }
		public Expression_isContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_idExprContext extends ExpressionContext {
		public IdExprContext operand;
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public Expression_idExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_idExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_idExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_idExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_negateContext extends ExpressionContext {
		public Token op;
		public ExpressionContext operand;
		public TerminalNode NEGATE() { return getToken(XQtParser.NEGATE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_negateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_negate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_negate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_negate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_compareContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public TerminalNode NotEQ() { return getToken(XQtParser.NotEQ, 0); }
		public TerminalNode LTEQ() { return getToken(XQtParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(XQtParser.LT, 0); }
		public TerminalNode GT() { return getToken(XQtParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQtParser.EQ, 0); }
		public TerminalNode LIKE() { return getToken(XQtParser.LIKE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GTEQ() { return getToken(XQtParser.GTEQ, 0); }
		public Expression_compareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_compare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_smartContext extends ExpressionContext {
		public SmartIdContext operand;
		public SmartIdContext smartId() {
			return getRuleContext(SmartIdContext.class,0);
		}
		public Expression_smartContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterExpression_smart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitExpression_smart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitExpression_smart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_negateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(357); ((Expression_negateContext)_localctx).op = match(NEGATE);
				setState(358); ((Expression_negateContext)_localctx).operand = expression(13);
				}
				break;

			case 2:
				{
				_localctx = new Expression_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359); ((Expression_notContext)_localctx).op = match(NOT);
				setState(360); ((Expression_notContext)_localctx).operand = expression(7);
				}
				break;

			case 3:
				{
				_localctx = new Expression_functionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361); ((Expression_functionContext)_localctx).operand = function();
				}
				break;

			case 4:
				{
				_localctx = new Expression_nestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362); match(LPAR);
				setState(363); ((Expression_nestContext)_localctx).operand = expression(0);
				setState(364); match(RPAR);
				}
				break;

			case 5:
				{
				_localctx = new Expression_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366); ((Expression_valueContext)_localctx).operand = value();
				}
				break;

			case 6:
				{
				_localctx = new Expression_idExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367); ((Expression_idExprContext)_localctx).operand = idExpr();
				}
				break;

			case 7:
				{
				_localctx = new Expression_smartContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368); ((Expression_smartContext)_localctx).operand = smartId();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(395);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_powerContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_powerContext)_localctx).x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(372); ((Expression_powerContext)_localctx).op = match(POW);
						setState(373); ((Expression_powerContext)_localctx).y = expression(15);
						}
						break;

					case 2:
						{
						_localctx = new Expression_multContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_multContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(375);
						((Expression_multContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MULT - 62)) | (1L << (DIV - 62)) | (1L << (MOD - 62)))) != 0)) ) {
							((Expression_multContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(376); ((Expression_multContext)_localctx).right = expression(13);
						}
						break;

					case 3:
						{
						_localctx = new Expression_addContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_addContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(378);
						((Expression_addContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Expression_addContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(379); ((Expression_addContext)_localctx).right = expression(12);
						}
						break;

					case 4:
						{
						_localctx = new Expression_aAndOrContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_aAndOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(381);
						((Expression_aAndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AOR || _la==AAND) ) {
							((Expression_aAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(382); ((Expression_aAndOrContext)_localctx).right = expression(11);
						}
						break;

					case 5:
						{
						_localctx = new Expression_compareContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_compareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(384);
						((Expression_compareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NotEQ) | (1L << GT) | (1L << GTEQ) | (1L << LT) | (1L << LTEQ) | (1L << LIKE))) != 0)) ) {
							((Expression_compareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(385); ((Expression_compareContext)_localctx).right = expression(10);
						}
						break;

					case 6:
						{
						_localctx = new Expression_andOrContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_andOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(386);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(387);
						((Expression_andOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
							((Expression_andOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(388); ((Expression_andOrContext)_localctx).right = expression(7);
						}
						break;

					case 7:
						{
						_localctx = new Expression_isContext(new ExpressionContext(_parentctx, _parentState));
						((Expression_isContext)_localctx).operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(390); match(IS);
						setState(392);
						_la = _input.LA(1);
						if (_la==NoT) {
							{
							setState(391); ((Expression_isContext)_localctx).not = match(NoT);
							}
						}

						setState(394);
						((Expression_isContext)_localctx).isType = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << NUMBER) | (1L << DatE) | (1L << EMPTY))) != 0)) ) {
							((Expression_isContext)_localctx).isType = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_packageContext extends FunctionContext {
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public PackagedIdentifierContext packagedIdentifier() {
			return getRuleContext(PackagedIdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public Function_packageContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFunction_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFunction_package(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFunction_package(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_simpleContext extends FunctionContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQtParser.COMMA); }
		public TerminalNode LPAR() { return getToken(XQtParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(XQtParser.RPAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(XQtParser.COMMA, i);
		}
		public Function_simpleContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterFunction_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitFunction_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitFunction_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function);
		int _la;
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new Function_simpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400); simpleIdentifier();
				setState(401); match(LPAR);
				setState(410);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NEGATE - 61)) | (1L << (NOT - 61)) | (1L << (LPAR - 61)) | (1L << (STRING - 61)) | (1L << (ID - 61)) | (1L << (BOOLEAN - 61)) | (1L << (DATE - 61)) | (1L << (UINT - 61)) | (1L << (INT - 61)) | (1L << (FLOAT - 61)))) != 0)) {
					{
					setState(402); argument();
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(403); match(COMMA);
						setState(404); argument();
						}
						}
						setState(409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(412); match(RPAR);
				}
				break;

			case 2:
				_localctx = new Function_packageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414); packagedIdentifier();
				setState(415); match(LPAR);
				setState(424);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NEGATE - 61)) | (1L << (NOT - 61)) | (1L << (LPAR - 61)) | (1L << (STRING - 61)) | (1L << (ID - 61)) | (1L << (BOOLEAN - 61)) | (1L << (DATE - 61)) | (1L << (UINT - 61)) | (1L << (INT - 61)) | (1L << (FLOAT - 61)))) != 0)) {
					{
					setState(416); argument();
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(417); match(COMMA);
						setState(418); argument();
						}
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(426); match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagedIdentifierContext extends ParserRuleContext {
		public Token packageId;
		public Token id;
		public TerminalNode DOT() { return getToken(XQtParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public PackagedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPackagedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPackagedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPackagedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagedIdentifierContext packagedIdentifier() throws RecognitionException {
		PackagedIdentifierContext _localctx = new PackagedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_packagedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); ((PackagedIdentifierContext)_localctx).packageId = match(ID);
			setState(433); match(DOT);
			setState(434); ((PackagedIdentifierContext)_localctx).id = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmartIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public SemanticKeyContext semanticKey() {
			return getRuleContext(SemanticKeyContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public SmartIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smartId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSmartId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSmartId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSmartId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmartIdContext smartId() throws RecognitionException {
		SmartIdContext _localctx = new SmartIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_smartId);
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); match(ID);
				setState(437); match(COLON);
				setState(438); dataType();
				setState(439); match(DCOLON);
				setState(440); semanticKey();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442); match(ID);
				setState(443); match(DCOLON);
				setState(444); semanticKey();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445); match(ID);
				setState(446); match(COLON);
				setState(447); dataType();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(448); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Long() { return getToken(XQtParser.Long, 0); }
		public TerminalNode Byte() { return getToken(XQtParser.Byte, 0); }
		public TerminalNode Date() { return getToken(XQtParser.Date, 0); }
		public List<TerminalNode> String() { return getTokens(XQtParser.String); }
		public TerminalNode String(int i) {
			return getToken(XQtParser.String, i);
		}
		public TerminalNode Integer() { return getToken(XQtParser.Integer, 0); }
		public TerminalNode Real() { return getToken(XQtParser.Real, 0); }
		public TerminalNode Boolean() { return getToken(XQtParser.Boolean, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << String) | (1L << Byte) | (1L << Integer) | (1L << Long) | (1L << Real) | (1L << Date))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemanticKeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public SemanticKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSemanticKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSemanticKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSemanticKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemanticKeyContext semanticKey() throws RecognitionException {
		SemanticKeyContext _localctx = new SemanticKeyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_semanticKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode UINT() { return getToken(XQtParser.UINT, 0); }
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(XQtParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(XQtParser.DATE, 0); }
		public TerminalNode INT() { return getToken(XQtParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(XQtParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (STRING - 87)) | (1L << (BOOLEAN - 87)) | (1L << (DATE - 87)) | (1L << (UINT - 87)) | (1L << (INT - 87)) | (1L << (FLOAT - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdExprContext extends ParserRuleContext {
		public IdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpr; }
	 
		public IdExprContext() { }
		public void copyFrom(IdExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExpr_simpleContext extends IdExprContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public IdExpr_simpleContext(IdExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterIdExpr_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitIdExpr_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitIdExpr_simple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExpr_qulaifiedContext extends IdExprContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public IdExpr_qulaifiedContext(IdExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterIdExpr_qulaified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitIdExpr_qulaified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitIdExpr_qulaified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExprContext idExpr() throws RecognitionException {
		IdExprContext _localctx = new IdExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_idExpr);
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new IdExpr_simpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457); simpleIdentifier();
				}
				break;

			case 2:
				_localctx = new IdExpr_qulaifiedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458); qualifiedIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionSelectorContext extends ParserRuleContext {
		public LabelVersionSelectorContext labelVersionSelector() {
			return getRuleContext(LabelVersionSelectorContext.class,0);
		}
		public SequenceVersionSelectorContext sequenceVersionSelector() {
			return getRuleContext(SequenceVersionSelectorContext.class,0);
		}
		public VersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionSelectorContext versionSelector() throws RecognitionException {
		VersionSelectorContext _localctx = new VersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_versionSelector);
		try {
			setState(463);
			switch (_input.LA(1)) {
			case LATEST:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(461); labelVersionSelector();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(462); sequenceVersionSelector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelVersionSelectorContext extends ParserRuleContext {
		public TerminalNode LATEST() { return getToken(XQtParser.LATEST, 0); }
		public TerminalNode STRING() { return getToken(XQtParser.STRING, 0); }
		public LabelVersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelVersionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterLabelVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitLabelVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitLabelVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelVersionSelectorContext labelVersionSelector() throws RecognitionException {
		LabelVersionSelectorContext _localctx = new LabelVersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_labelVersionSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==LATEST || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceVersionSelectorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XQtParser.INT, 0); }
		public SequenceVersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceVersionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSequenceVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSequenceVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSequenceVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceVersionSelectorContext sequenceVersionSelector() throws RecognitionException {
		SequenceVersionSelectorContext _localctx = new SequenceVersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sequenceVersionSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateVersionSelectorContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(XQtParser.DATE, 0); }
		public DateVersionSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateVersionSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterDateVersionSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitDateVersionSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitDateVersionSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateVersionSelectorContext dateVersionSelector() throws RecognitionException {
		DateVersionSelectorContext _localctx = new DateVersionSelectorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dateVersionSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(470); match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(XQtParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQtParser.ID); }
		public List<TerminalNode> DOT() { return getTokens(XQtParser.DOT); }
		public TerminalNode ID(int i) {
			return getToken(XQtParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(XQtParser.INT); }
		public TerminalNode DOT(int i) {
			return getToken(XQtParser.DOT, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitQualifiedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474); match(ID);
			setState(477); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(475); match(DOT);
					setState(476);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(479); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<PathEntityContext> pathEntity() {
			return getRuleContexts(PathEntityContext.class);
		}
		public List<TerminalNode> RELATIONSHIP() { return getTokens(XQtParser.RELATIONSHIP); }
		public PathAttributeContext pathAttribute() {
			return getRuleContext(PathAttributeContext.class,0);
		}
		public TerminalNode RELATIONSHIP(int i) {
			return getToken(XQtParser.RELATIONSHIP, i);
		}
		public PathEntityContext pathEntity(int i) {
			return getRuleContext(PathEntityContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_path);
		int _la;
		try {
			int _alt;
			setState(524);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); pathEntity();
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(484); match(RELATIONSHIP);
					setState(485); pathEntity();
					}
					}
					setState(488); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RELATIONSHIP );
				setState(492);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(490); match(2);
					setState(491); pathAttribute();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494); pathEntity();
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(495); match(RELATIONSHIP);
						setState(496); pathEntity();
						}
						} 
					}
					setState(501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				{
				setState(502); match(RELATIONSHIP);
				setState(503); pathEntity();
				}
				setState(507);
				_la = _input.LA(1);
				if (_la==3) {
					{
					setState(505); match(3);
					setState(506); pathAttribute();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509); pathEntity();
				setState(512);
				_la = _input.LA(1);
				if (_la==3) {
					{
					setState(510); match(3);
					setState(511); pathAttribute();
					}
				}

				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(514); match(RELATIONSHIP);
					setState(515); pathEntity();
					}
					}
					setState(518); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RELATIONSHIP );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(520); pathEntity();
				setState(521); match(2);
				setState(522); pathAttribute();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathEntityContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public PathEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPathEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPathEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPathEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathEntityContext pathEntity() throws RecognitionException {
		PathEntityContext _localctx = new PathEntityContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pathEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQtParser.ID, 0); }
		public PathAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).enterPathAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQtListener ) ((XQtListener)listener).exitPathAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQtVisitor ) return ((XQtVisitor<? extends T>)visitor).visitPathAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathAttributeContext pathAttribute() throws RecognitionException {
		PathAttributeContext _localctx = new PathAttributeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_pathAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 14);

		case 1: return precpred(_ctx, 12);

		case 2: return precpred(_ctx, 11);

		case 3: return precpred(_ctx, 10);

		case 4: return precpred(_ctx, 9);

		case 5: return precpred(_ctx, 6);

		case 6: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3c\u0215\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\7\3t\n\3\f\3\16\3"+
		"w\13\3\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13"+
		"\3\3\3\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\6\3\u008c\n\3\r\3\16\3\u008d"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0096\n\4\3\4\3\4\6\4\u009a\n\4\r\4\16\4"+
		"\u009b\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a5\n\5\3\5\3\5\3\5\5\5\u00aa"+
		"\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00bb"+
		"\n\6\f\6\16\6\u00be\13\6\5\6\u00c0\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d0\n\b\f\b\16\b\u00d3\13\b\5\b\u00d5\n"+
		"\b\3\b\3\b\3\b\5\b\u00da\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\5\r\u00e6\n\r\3\r\5\r\u00e9\n\r\3\r\3\r\5\r\u00ed\n\r\3\r\5\r\u00f0\n"+
		"\r\3\r\5\r\u00f3\n\r\3\r\5\r\u00f6\n\r\3\r\5\r\u00f9\n\r\3\r\5\r\u00fc"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0109"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0123\n\30"+
		"\3\31\3\31\3\31\5\31\u0128\n\31\3\31\3\31\5\31\u012c\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0137\n\33\f\33\16\33\u013a\13"+
		"\33\3\34\3\34\5\34\u013e\n\34\3\34\5\34\u0141\n\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\5\37\u014b\n\37\3 \3 \3 \5 \u0150\n \3 \3 \5 \u0154"+
		"\n \3!\3!\3!\3!\7!\u015a\n!\f!\16!\u015d\13!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0174\n&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u018b\n&\3&\7&\u018e"+
		"\n&\f&\16&\u0191\13&\3\'\3\'\3\'\3\'\3\'\7\'\u0198\n\'\f\'\16\'\u019b"+
		"\13\'\5\'\u019d\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01a6\n\'\f\'\16\'"+
		"\u01a9\13\'\5\'\u01ab\n\'\3\'\3\'\5\'\u01af\n\'\3(\3(\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01c4\n*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\5.\u01ce\n.\3/\3/\5/\u01d2\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\6\64\u01e0\n\64\r\64\16\64\u01e1\3\65\3\65\3\66\3"+
		"\66\3\66\6\66\u01e9\n\66\r\66\16\66\u01ea\3\66\3\66\5\66\u01ef\n\66\3"+
		"\66\3\66\3\66\7\66\u01f4\n\66\f\66\16\66\u01f7\13\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u01fe\n\66\3\66\3\66\3\66\5\66\u0203\n\66\3\66\3\66\6\66"+
		"\u0207\n\66\r\66\16\66\u0208\3\66\3\66\3\66\3\66\5\66\u020f\n\66\3\67"+
		"\3\67\38\38\38\2\3J9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\20\3\2\27\30\3\2\66<\4\2^^aa"+
		"\3\2!\"\3\2@B\3\2=>\3\2FG\3\2QR\4\2##,.\3\2/\65\4\2YY_c\4\2\26\26YY\4"+
		"\2\3\3\6\7\4\2^^bb\u0221\2p\3\2\2\2\4u\3\2\2\2\6\u0091\3\2\2\2\b\u009f"+
		"\3\2\2\2\n\u00ad\3\2\2\2\f\u00c1\3\2\2\2\16\u00c5\3\2\2\2\20\u00db\3\2"+
		"\2\2\22\u00dd\3\2\2\2\24\u00df\3\2\2\2\26\u00e1\3\2\2\2\30\u00e3\3\2\2"+
		"\2\32\u00fd\3\2\2\2\34\u00ff\3\2\2\2\36\u0102\3\2\2\2 \u0108\3\2\2\2\""+
		"\u010a\3\2\2\2$\u0110\3\2\2\2&\u0112\3\2\2\2(\u0116\3\2\2\2*\u011a\3\2"+
		"\2\2,\u011c\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62\u012d\3\2\2\2\64"+
		"\u0132\3\2\2\2\66\u013b\3\2\2\28\u0142\3\2\2\2:\u0144\3\2\2\2<\u014a\3"+
		"\2\2\2>\u014c\3\2\2\2@\u0155\3\2\2\2B\u015e\3\2\2\2D\u0160\3\2\2\2F\u0162"+
		"\3\2\2\2H\u0164\3\2\2\2J\u0173\3\2\2\2L\u01ae\3\2\2\2N\u01b0\3\2\2\2P"+
		"\u01b2\3\2\2\2R\u01c3\3\2\2\2T\u01c5\3\2\2\2V\u01c7\3\2\2\2X\u01c9\3\2"+
		"\2\2Z\u01cd\3\2\2\2\\\u01d1\3\2\2\2^\u01d3\3\2\2\2`\u01d5\3\2\2\2b\u01d7"+
		"\3\2\2\2d\u01da\3\2\2\2f\u01dc\3\2\2\2h\u01e3\3\2\2\2j\u020e\3\2\2\2l"+
		"\u0210\3\2\2\2n\u0212\3\2\2\2pq\5\4\3\2q\3\3\2\2\2rt\5\6\4\2sr\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v{\3\2\2\2wu\3\2\2\2xz\5\n\6\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0081\3\2\2\2}{\3\2\2\2~\u0080\5\16\b"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u008b\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\5\22\n\2\u0085"+
		"\u0087\7\\\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u0084\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\2\2\3\u0090\5\3\2\2\2\u0091\u0092"+
		"\7\b\2\2\u0092\u0095\7^\2\2\u0093\u0094\7\13\2\2\u0094\u0096\7^\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7M"+
		"\2\2\u0098\u009a\5\b\5\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7N"+
		"\2\2\u009e\7\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a4\5R*\2\u00a1\u00a2"+
		"\7\r\2\2\u00a2\u00a3\7E\2\2\u00a3\u00a5\5J&\2\u00a4\u00a1\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\7"+
		"E\2\2\u00a8\u00aa\5J&\2\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7H\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\17\2\2"+
		"\u00ae\u00af\7^\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\7E\2\2\u00b1\u00b2"+
		"\7^\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7E\2\2\u00b4\u00bf\7Y\2\2\u00b5"+
		"\u00b6\7\22\2\2\u00b6\u00b7\7E\2\2\u00b7\u00bc\5\f\7\2\u00b8\u00b9\7H"+
		"\2\2\u00b9\u00bb\5\f\7\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\13\3\2\2\2\u00c1\u00c2"+
		"\7^\2\2\u00c2\u00c3\7P\2\2\u00c3\u00c4\5J&\2\u00c4\r\3\2\2\2\u00c5\u00c6"+
		"\7\23\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c8\7\17\2\2\u00c8\u00c9\7E\2\2\u00c9"+
		"\u00d4\7^\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\7E\2\2\u00cc\u00d1\5\20"+
		"\t\2\u00cd\u00ce\7H\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d9\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7\u00d8\7E\2\2\u00d8\u00da\5\\"+
		"/\2\u00d9\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\17\3\2\2\2\u00db\u00dc"+
		"\7^\2\2\u00dc\21\3\2\2\2\u00dd\u00de\5\24\13\2\u00de\23\3\2\2\2\u00df"+
		"\u00e0\5\26\f\2\u00e0\25\3\2\2\2\u00e1\u00e2\5\30\r\2\u00e2\27\3\2\2\2"+
		"\u00e3\u00e5\7\t\2\2\u00e4\u00e6\5\32\16\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5\34\17\2\u00e8\u00e7\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\5\36\20\2\u00eb\u00ed"+
		"\5.\30\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00f0\5\60\31\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00f3\5\62\32\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f6\5\64\33\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5> \2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\5@!\2\u00fb\u00fa\3\2\2"+
		"\2\u00fb\u00fc\3\2\2\2\u00fc\31\3\2\2\2\u00fd\u00fe\t\2\2\2\u00fe\33\3"+
		"\2\2\2\u00ff\u0100\7\b\2\2\u0100\u0101\5d\63\2\u0101\35\3\2\2\2\u0102"+
		"\u0103\7\n\2\2\u0103\u0104\5 \21\2\u0104\37\3\2\2\2\u0105\u0109\5\"\22"+
		"\2\u0106\u0109\5(\25\2\u0107\u0109\5B\"\2\u0108\u0105\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0107\3\2\2\2\u0109!\3\2\2\2\u010a\u010b\5(\25\2\u010b"+
		"\u010c\5$\23\2\u010c\u010d\5(\25\2\u010d\u010e\7\31\2\2\u010e\u010f\5"+
		"&\24\2\u010f#\3\2\2\2\u0110\u0111\7\32\2\2\u0111%\3\2\2\2\u0112\u0113"+
		"\7^\2\2\u0113\u0114\t\3\2\2\u0114\u0115\7^\2\2\u0115\'\3\2\2\2\u0116\u0117"+
		"\5*\26\2\u0117\u0118\7L\2\2\u0118\u0119\5,\27\2\u0119)\3\2\2\2\u011a\u011b"+
		"\7^\2\2\u011b+\3\2\2\2\u011c\u011d\t\4\2\2\u011d-\3\2\2\2\u011e\u011f"+
		"\7\33\2\2\u011f\u0123\5B\"\2\u0120\u0121\7\33\2\2\u0121\u0123\5(\25\2"+
		"\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123/\3\2\2\2\u0124\u0127\7"+
		"\34\2\2\u0125\u0126\7\35\2\2\u0126\u0128\5D#\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\7\36\2\2\u012a\u012c\5"+
		"D#\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\61\3\2\2\2\u012d\u012e"+
		"\7\37\2\2\u012e\u012f\7J\2\2\u012f\u0130\5D#\2\u0130\u0131\7K\2\2\u0131"+
		"\63\3\2\2\2\u0132\u0133\7 \2\2\u0133\u0138\5\66\34\2\u0134\u0135\7H\2"+
		"\2\u0135\u0137\5\66\34\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\65\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013b\u013d\58\35\2\u013c\u013e\5:\36\2\u013d\u013c\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141\5<\37\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\67\3\2\2\2\u0142\u0143\5d\63\2\u01439\3\2\2\2\u0144"+
		"\u0145\t\5\2\2\u0145;\3\2\2\2\u0146\u0147\7#\2\2\u0147\u014b\7$\2\2\u0148"+
		"\u0149\7#\2\2\u0149\u014b\7%\2\2\u014a\u0146\3\2\2\2\u014a\u0148\3\2\2"+
		"\2\u014b=\3\2\2\2\u014c\u014f\7&\2\2\u014d\u014e\7\'\2\2\u014e\u0150\7"+
		"a\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u0152\7(\2\2\u0152\u0154\7a\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154?\3\2\2\2\u0155\u0156\7)\2\2\u0156\u015b\5d\63\2\u0157\u0158\7"+
		"H\2\2\u0158\u015a\5d\63\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cA\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015e\u015f\7^\2\2\u015fC\3\2\2\2\u0160\u0161\5J&\2\u0161E\3\2\2\2\u0162"+
		"\u0163\7b\2\2\u0163G\3\2\2\2\u0164\u0165\7c\2\2\u0165I\3\2\2\2\u0166\u0167"+
		"\b&\1\2\u0167\u0168\7?\2\2\u0168\u0174\5J&\17\u0169\u016a\7D\2\2\u016a"+
		"\u0174\5J&\t\u016b\u0174\5L\'\2\u016c\u016d\7J\2\2\u016d\u016e\5J&\2\u016e"+
		"\u016f\7K\2\2\u016f\u0174\3\2\2\2\u0170\u0174\5X-\2\u0171\u0174\5Z.\2"+
		"\u0172\u0174\5R*\2\u0173\u0166\3\2\2\2\u0173\u0169\3\2\2\2\u0173\u016b"+
		"\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u018f\3\2\2\2\u0175\u0176\f\20\2\2\u0176\u0177\7"+
		"C\2\2\u0177\u018e\5J&\21\u0178\u0179\f\16\2\2\u0179\u017a\t\6\2\2\u017a"+
		"\u018e\5J&\17\u017b\u017c\f\r\2\2\u017c\u017d\t\7\2\2\u017d\u018e\5J&"+
		"\16\u017e\u017f\f\f\2\2\u017f\u0180\t\b\2\2\u0180\u018e\5J&\r\u0181\u0182"+
		"\f\13\2\2\u0182\u0183\t\3\2\2\u0183\u018e\5J&\f\u0184\u0185\f\b\2\2\u0185"+
		"\u0186\t\t\2\2\u0186\u018e\5J&\t\u0187\u0188\f\n\2\2\u0188\u018a\7*\2"+
		"\2\u0189\u018b\7+\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\t\n\2\2\u018d\u0175\3\2\2\2\u018d\u0178\3\2\2\2\u018d"+
		"\u017b\3\2\2\2\u018d\u017e\3\2\2\2\u018d\u0181\3\2\2\2\u018d\u0184\3\2"+
		"\2\2\u018d\u0187\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190K\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\5d\63\2"+
		"\u0193\u019c\7J\2\2\u0194\u0199\5N(\2\u0195\u0196\7H\2\2\u0196\u0198\5"+
		"N(\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u0194\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7K\2\2\u019f"+
		"\u01af\3\2\2\2\u01a0\u01a1\5P)\2\u01a1\u01aa\7J\2\2\u01a2\u01a7\5N(\2"+
		"\u01a3\u01a4\7H\2\2\u01a4\u01a6\5N(\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\7K\2\2\u01ad\u01af\3\2\2\2\u01ae\u0192\3\2\2\2\u01ae"+
		"\u01a0\3\2\2\2\u01afM\3\2\2\2\u01b0\u01b1\5J&\2\u01b1O\3\2\2\2\u01b2\u01b3"+
		"\7^\2\2\u01b3\u01b4\7L\2\2\u01b4\u01b5\7^\2\2\u01b5Q\3\2\2\2\u01b6\u01b7"+
		"\7^\2\2\u01b7\u01b8\7P\2\2\u01b8\u01b9\5T+\2\u01b9\u01ba\7O\2\2\u01ba"+
		"\u01bb\5V,\2\u01bb\u01c4\3\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01be\7O\2\2"+
		"\u01be\u01c4\5V,\2\u01bf\u01c0\7^\2\2\u01c0\u01c1\7P\2\2\u01c1\u01c4\5"+
		"T+\2\u01c2\u01c4\7^\2\2\u01c3\u01b6\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c3"+
		"\u01bf\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4S\3\2\2\2\u01c5\u01c6\t\13\2\2"+
		"\u01c6U\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8W\3\2\2\2\u01c9\u01ca\t\f\2\2"+
		"\u01caY\3\2\2\2\u01cb\u01ce\5d\63\2\u01cc\u01ce\5f\64\2\u01cd\u01cb\3"+
		"\2\2\2\u01cd\u01cc\3\2\2\2\u01ce[\3\2\2\2\u01cf\u01d2\5^\60\2\u01d0\u01d2"+
		"\5`\61\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2]\3\2\2\2\u01d3"+
		"\u01d4\t\r\2\2\u01d4_\3\2\2\2\u01d5\u01d6\7b\2\2\u01d6a\3\2\2\2\u01d7"+
		"\u01d8\t\16\2\2\u01d8\u01d9\7`\2\2\u01d9c\3\2\2\2\u01da\u01db\7^\2\2\u01db"+
		"e\3\2\2\2\u01dc\u01df\7^\2\2\u01dd\u01de\7L\2\2\u01de\u01e0\t\17\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2g\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4i\3\2\2\2\u01e5\u01e8\5l"+
		"\67\2\u01e6\u01e7\7S\2\2\u01e7\u01e9\5l\67\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ed\7\4\2\2\u01ed\u01ef\5n8\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u020f\3\2\2\2\u01f0\u01f5\5l\67\2\u01f1\u01f2\7S\2\2\u01f2"+
		"\u01f4\5l\67\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\7S\2\2\u01f9\u01fa\5l\67\2\u01fa\u01fd\3\2\2\2\u01fb\u01fc\7\5"+
		"\2\2\u01fc\u01fe\5n8\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u020f"+
		"\3\2\2\2\u01ff\u0202\5l\67\2\u0200\u0201\7\5\2\2\u0201\u0203\5n8\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0205\7S"+
		"\2\2\u0205\u0207\5l\67\2\u0206\u0204\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020f\3\2\2\2\u020a\u020b\5l"+
		"\67\2\u020b\u020c\7\4\2\2\u020c\u020d\5n8\2\u020d\u020f\3\2\2\2\u020e"+
		"\u01e5\3\2\2\2\u020e\u01f0\3\2\2\2\u020e\u01ff\3\2\2\2\u020e\u020a\3\2"+
		"\2\2\u020fk\3\2\2\2\u0210\u0211\7^\2\2\u0211m\3\2\2\2\u0212\u0213\7^\2"+
		"\2\u0213o\3\2\2\2\67u{\u0081\u0088\u008d\u0095\u009b\u00a4\u00a9\u00bc"+
		"\u00bf\u00d1\u00d4\u00d9\u00e5\u00e8\u00ec\u00ef\u00f2\u00f5\u00f8\u00fb"+
		"\u0108\u0122\u0127\u012b\u0138\u013d\u0140\u014a\u014f\u0153\u015b\u0173"+
		"\u018a\u018d\u018f\u0199\u019c\u01a7\u01aa\u01ae\u01c3\u01cd\u01d1\u01e1"+
		"\u01ea\u01ee\u01f5\u01fd\u0202\u0208\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}