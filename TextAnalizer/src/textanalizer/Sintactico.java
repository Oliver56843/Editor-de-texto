
package textanalizer;

import java_cup.runtime.*;
import static textanalizer.TextAnalizer.erroresSintacticos;
import static textanalizer.TextAnalizer.erroresSemanticos;


public class Sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\007\000\002\002" +
    "\003\000\002\003\004\000\002\003\003\000\002\005\007" +
    "\000\002\005\007\000\002\005\007\000\002\004\004\000" +
    "\002\004\003\000\002\004\003\000\002\006\007\000\002" +
    "\006\011\000\002\006\007\000\002\007\003\000\002\007" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\011\005\000\002\011\005\000\002\011\005\000" +
    "\002\011\005\000\002\011\006\000\002\011\010\000\002" +
    "\011\005\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\006\003\005\004\004\001\002\000\004\032" +
    "\010\001\002\000\004\002\uffff\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\014\011\001" +
    "\002\000\010\005\016\006\014\007\013\001\002\000\012" +
    "\005\ufffd\006\ufffd\007\ufffd\015\ufffd\001\002\000\004\032" +
    "\062\001\002\000\004\012\056\001\002\000\012\005\016" +
    "\006\014\007\013\015\055\001\002\000\004\031\017\001" +
    "\002\000\004\011\020\001\002\000\020\012\023\024\026" +
    "\025\027\026\024\027\021\030\022\031\030\001\002\000" +
    "\020\013\uffe7\016\uffe7\017\uffe7\020\uffe7\021\uffe7\022\uffe7" +
    "\023\uffe7\001\002\000\020\013\uffe6\016\uffe6\017\uffe6\020" +
    "\uffe6\021\uffe6\022\uffe6\023\uffe6\001\002\000\020\012\023" +
    "\024\026\025\027\026\024\027\021\030\022\031\030\001" +
    "\002\000\020\013\uffe4\016\uffe4\017\uffe4\020\uffe4\021\uffe4" +
    "\022\uffe4\023\uffe4\001\002\000\014\016\033\017\035\020" +
    "\037\021\036\023\051\001\002\000\004\012\046\001\002" +
    "\000\004\012\031\001\002\000\020\013\uffe5\016\uffe5\017" +
    "\uffe5\020\uffe5\021\uffe5\022\uffe5\023\uffe5\001\002\000\020" +
    "\012\023\024\026\025\027\026\024\027\021\030\022\031" +
    "\030\001\002\000\014\016\033\017\035\020\037\021\036" +
    "\022\034\001\002\000\020\012\023\024\026\025\027\026" +
    "\024\027\021\030\022\031\030\001\002\000\020\012\023" +
    "\024\026\025\027\026\024\027\021\030\022\031\030\001" +
    "\002\000\020\012\023\024\026\025\027\026\024\027\021" +
    "\030\022\031\030\001\002\000\020\012\023\024\026\025" +
    "\027\026\024\027\021\030\022\031\030\001\002\000\020" +
    "\012\023\024\026\025\027\026\024\027\021\030\022\031" +
    "\030\001\002\000\020\013\uffec\016\uffec\017\uffec\020\uffec" +
    "\021\uffec\022\uffec\023\uffec\001\002\000\020\013\uffeb\016" +
    "\uffeb\017\uffeb\020\uffeb\021\uffeb\022\uffeb\023\uffeb\001\002" +
    "\000\020\013\uffed\016\uffed\017\uffed\020\037\021\036\022" +
    "\uffed\023\uffed\001\002\000\014\013\044\016\033\017\035" +
    "\020\037\021\036\001\002\000\020\013\uffe9\016\uffe9\017" +
    "\uffe9\020\uffe9\021\uffe9\022\uffe9\023\uffe9\001\002\000\020" +
    "\013\uffee\016\uffee\017\uffee\020\037\021\036\022\uffee\023" +
    "\uffee\001\002\000\020\012\023\024\026\025\027\026\024" +
    "\027\021\030\022\031\030\001\002\000\014\013\050\016" +
    "\033\017\035\020\037\021\036\001\002\000\020\013\uffea" +
    "\016\uffea\017\uffea\020\uffea\021\uffea\022\uffea\023\uffea\001" +
    "\002\000\012\005\ufffc\006\ufffc\007\ufffc\015\ufffc\001\002" +
    "\000\014\013\053\016\033\017\035\020\037\021\036\001" +
    "\002\000\020\013\uffe8\016\uffe8\017\uffe8\020\uffe8\021\uffe8" +
    "\022\uffe8\023\uffe8\001\002\000\012\005\ufffe\006\ufffe\007" +
    "\ufffe\015\ufffe\001\002\000\004\002\000\001\002\000\004" +
    "\031\057\001\002\000\004\013\060\001\002\000\004\023" +
    "\061\001\002\000\012\005\ufffa\006\ufffa\007\ufffa\015\ufffa" +
    "\001\002\000\004\014\063\001\002\000\012\003\064\005" +
    "\070\006\066\010\067\001\002\000\012\005\ufff7\006\ufff7" +
    "\010\ufff7\015\ufff7\001\002\000\012\005\070\006\066\010" +
    "\067\015\115\001\002\000\004\012\111\001\002\000\004" +
    "\014\076\001\002\000\004\031\072\001\002\000\012\005" +
    "\ufff8\006\ufff8\010\ufff8\015\ufff8\001\002\000\004\011\073" +
    "\001\002\000\020\012\023\024\026\025\027\026\024\027" +
    "\021\030\022\031\030\001\002\000\014\016\033\017\035" +
    "\020\037\021\036\023\075\001\002\000\012\005\ufff6\006" +
    "\ufff6\010\ufff6\015\ufff6\001\002\000\006\026\077\031\101" +
    "\001\002\000\004\022\ufff3\001\002\000\004\022\102\001" +
    "\002\000\004\022\ufff2\001\002\000\010\026\104\027\103" +
    "\031\106\001\002\000\004\015\ufff0\001\002\000\004\015" +
    "\ufff1\001\002\000\004\015\107\001\002\000\004\015\uffef" +
    "\001\002\000\004\023\110\001\002\000\012\005\ufff5\006" +
    "\ufff5\010\ufff5\015\ufff5\001\002\000\004\031\112\001\002" +
    "\000\004\013\113\001\002\000\004\023\114\001\002\000" +
    "\012\005\ufff4\006\ufff4\010\ufff4\015\ufff4\001\002\000\012" +
    "\005\ufffb\006\ufffb\007\ufffb\015\ufffb\001\002\000\012\005" +
    "\ufff9\006\ufff9\010\ufff9\015\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\014\005\011\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\053" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\024\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\051\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\031\001\001\000\002\001\001\000\004\011\044\001" +
    "\001\000\004\011\042\001\001\000\004\011\041\001\001" +
    "\000\004\011\040\001\001\000\004\011\037\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\046\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\004\064\006\070\001\001\000\002\001\001\000\004" +
    "\006\115\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\073\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\077\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\104\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    

    }


    
        
    /**Metodo al que se llama automáticamente ante algún error sintactico.*/
    public void syntax_error(Symbol s){
        //listaerrores.insertarError(String.valueOf(s.value),Integer.toString(s.left),Integer.toString(s.right+1),"Sintactico", "Error Recuperable");
        System.out.println("Error sintactico R: en la Línea " + (s.right+1) +" Columna "+(s.left+1)+ ". Identificador " +s.value + " no reconocido." );
        
    }

    /**Metodo al que se llama en el momento en que ya no es posible una recuperación de
    errores.*/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        //listaerrores.insertarError(String.valueOf(s.value),Integer.toString(s.left), Integer.toString(s.right+1),"Sintactico", "Error Fatal");
        System.out.println("Error sintactico NR: en la Línea " + (s.right+1)+ "Columna "+(s.left+1)+". Identificador " + s.value + " no reconocido.");
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintactico$actions {


   //aca las variables que se utilizan en el aanalisis sintactico 

  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // OPE ::= cadena 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // OPE ::= id 
            {
              String RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // OPE ::= decimal 
            {
              String RESULT =null;
		int deleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int deright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String de = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=de;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // OPE ::= numero 
            {
              String RESULT =null;
		int naleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int naright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String na = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT=na;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // OPE ::= par_abre OPE par_cierra 
            {
              String RESULT =null;
		int naleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int naright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String na = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT=na;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // OPE ::= potencia par_abre OPE coma OPE par_cierra 
            {
              String RESULT =null;
		int na1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int na1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		String na1 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int na2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int na2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String na2 = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // OPE ::= raiz par_abre OPE par_cierra 
            {
              String RESULT =null;
		int naleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int naright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String na = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 RESULT=na;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // OPE ::= OPE multi OPE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
    int val1 = Integer.parseInt(a);
    int val2= Integer.parseInt(b);
    int res=val1*val2;
    RESULT= (res)+"";
    
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // OPE ::= OPE divide OPE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
    int val1 = Integer.parseInt(a);
    int val2= Integer.parseInt(b);
    int res=val1/val2;
    RESULT= (res)+"";
    
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OPE ::= OPE menos OPE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
    int val1 = Integer.parseInt(a);
    int val2= Integer.parseInt(b);
    int res=val1-val2;
    RESULT= (res)+"";
    
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OPE ::= OPE mas OPE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
    int val1 = Integer.parseInt(a);
    int val2= Integer.parseInt(b);
    int res=val1+val2;
    RESULT= (res)+"";

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OPE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // PAR2 ::= id 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PAR2",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // PAR2 ::= numero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PAR2",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // PAR2 ::= cadena 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PAR2",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // PAR ::= id 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PAR",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // PAR ::= cadena 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PAR",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DEC2 ::= printer par_abre id par_cierra pycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DEC2",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DEC2 ::= varref llav_abre PAR coma PAR2 llav_cierra pycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DEC2",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DEC2 ::= Var id igual OPE pycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DEC2",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CUERPO2 ::= error 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO2",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CUERPO2 ::= DEC2 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO2",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUERPO2 ::= CUERPO2 DEC2 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO2",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DEC1 ::= printer par_abre id par_cierra pycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DEC1",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DEC1 ::= contexto titulo llav_abre CUERPO2 llav_cierra 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DEC1",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DEC1 ::= Var id igual OPE pycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DEC1",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO ::= DEC1 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= CUERPO DEC1 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INI ::= error 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INI",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INI ::= Proyecto titulo llav_abre CUERPO llav_cierra 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INI",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INI EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

