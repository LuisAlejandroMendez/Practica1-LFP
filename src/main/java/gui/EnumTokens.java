package gui;

public enum EnumTokens {
    //Enumeraciones y variable public, static, final: tipoToken
    ID("  ID-entif   =  "),
    ENTERO("  Entero    =  "),
    DECIMAL("  Decimal =  "),
    SIMBOLO("  Símbolo   =  "),
    ERROR("   ¡Error!   =  ");
  
    private final String tipoToken;
    
    //Constructor
    private EnumTokens(String tipoToken){
        this.tipoToken = tipoToken;
    }
    public String getTipoDeToken(){
        return tipoToken;
    }
}
