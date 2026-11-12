package org.apache.commons.lang;

/* JADX INFO: loaded from: classes23.dex */
public class IllegalClassException extends IllegalArgumentException {
    private static final long serialVersionUID = 8063272569377254819L;

    public IllegalClassException(Class cls, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected: ");
        stringBuffer.append(a(cls));
        stringBuffer.append(", actual: ");
        stringBuffer.append(obj == null ? "null" : obj.getClass().getName());
        super(stringBuffer.toString());
    }

    private static final String a(Class cls) {
        if (cls == null) {
            return null;
        }
        return cls.getName();
    }

    public IllegalClassException(Class cls, Class cls2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected: ");
        stringBuffer.append(a(cls));
        stringBuffer.append(", actual: ");
        stringBuffer.append(a(cls2));
        super(stringBuffer.toString());
    }

    public IllegalClassException(String str) {
        super(str);
    }
}
