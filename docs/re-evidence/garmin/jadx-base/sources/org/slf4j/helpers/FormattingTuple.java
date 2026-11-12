package org.slf4j.helpers;

/* JADX INFO: loaded from: classes11.dex */
public class FormattingTuple {
    public static FormattingTuple NULL = new FormattingTuple(null);
    private Object[] argArray;
    private String message;
    private Throwable throwable;

    public FormattingTuple(String str, Object[] objArr, Throwable th3) {
        this.message = str;
        this.throwable = th3;
        this.argArray = objArr;
    }

    public Object[] getArgArray() {
        return this.argArray;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public FormattingTuple(String str) {
        this(str, null, null);
    }
}
