package org.cybergarage.upnp.std.av.server.object;

/* JADX INFO: loaded from: classes23.dex */
public class SearchCriteria {
    public static final String AND = "and";
    public static final String CLASS = "upnp:class";
    public static final String CONTAINS = "contains";
    public static final String CREATOR = "dc:creator";
    public static final String DATE = "dc:date";
    public static final String DERIVEDFROM = "derivedfrom";
    public static final String DOESNOTCONTAIN = "doesNotContain";
    public static final String EQ = "=";
    public static final String EXISTS = "exists";
    public static final String FALSE = "false";
    public static final String GE = ">=";
    public static final String GT = ">";
    public static final String ID = "@id";
    public static final String LE = "<=";
    public static final String LT = "<";
    public static final String NEQ = "!=";
    public static final String OR = "or";
    public static final String PARENT_ID = "@parentID";
    public static final String TITLE = "dc:title";
    public static final String TRUE = "true";
    public static final String WCHARS = " \t\n\f\r";
    private String logic;
    private String operation;
    private String property;
    private boolean result;
    private String value;

    public SearchCriteria() {
        setProperty("");
        setOperation("");
        setValue("");
        setLogic("");
    }

    public String getLogic() {
        return this.logic;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getProperty() {
        return this.property;
    }

    public boolean getResult() {
        return this.result;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isContains() {
        return this.operation.compareTo(CONTAINS) == 0;
    }

    public boolean isDerivedFrom() {
        return this.operation.compareTo(DERIVEDFROM) == 0;
    }

    public boolean isDoesNotContain() {
        return this.operation.compareTo(DOESNOTCONTAIN) == 0;
    }

    public boolean isEQ() {
        return this.operation.compareTo(EQ) == 0;
    }

    public boolean isExists() {
        return this.operation.compareTo(EXISTS) == 0;
    }

    public boolean isFalseValue() {
        return this.value.compareTo("false") == 0;
    }

    public boolean isGE() {
        return this.operation.compareTo(GE) == 0;
    }

    public boolean isGT() {
        return this.operation.compareTo(GT) == 0;
    }

    public boolean isLE() {
        return this.operation.compareTo(LE) == 0;
    }

    public boolean isLT() {
        return this.operation.compareTo(LT) == 0;
    }

    public boolean isLogicalAND() {
        return this.logic.compareTo(AND) == 0;
    }

    public boolean isLogicalOR() {
        return this.logic.compareTo(OR) == 0;
    }

    public boolean isNEQ() {
        return this.operation.compareTo(NEQ) == 0;
    }

    public boolean isTrueValue() {
        return this.value.compareTo("true") == 0;
    }

    public void setLogic(String str) {
        this.logic = str;
    }

    public void setOperation(String str) {
        this.operation = str;
    }

    public void setProperty(String str) {
        this.property = str;
    }

    public void setResult(boolean z) {
        this.result = z;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public SearchCriteria(SearchCriteria searchCriteria) {
        setProperty(searchCriteria.getProperty());
        setOperation(searchCriteria.getOperation());
        setValue(searchCriteria.getValue());
        setLogic(searchCriteria.getLogic());
        setResult(searchCriteria.getResult());
    }
}
