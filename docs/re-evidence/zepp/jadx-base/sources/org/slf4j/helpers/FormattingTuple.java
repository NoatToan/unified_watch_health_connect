package org.slf4j.helpers;

/* JADX INFO: loaded from: classes23.dex */
public class FormattingTuple {
    public static FormattingTuple NULL = new FormattingTuple(null);
    private String a;
    private Throwable b;
    private Object[] c;

    public FormattingTuple(String str) {
        this(str, null, null);
    }

    public Object[] getArgArray() {
        return this.c;
    }

    public String getMessage() {
        return this.a;
    }

    public Throwable getThrowable() {
        return this.b;
    }

    public FormattingTuple(String str, Object[] objArr, Throwable th) {
        this.a = str;
        this.b = th;
        this.c = objArr;
    }
}
