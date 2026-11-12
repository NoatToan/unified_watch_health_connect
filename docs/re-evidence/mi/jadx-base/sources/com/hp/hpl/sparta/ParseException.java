package com.hp.hpl.sparta;

import defpackage.qkh;
import defpackage.rkh;

/* JADX INFO: loaded from: classes5.dex */
public class ParseException extends Exception {
    private Throwable cause_;
    private int lineNumber_;

    public ParseException(qkh qkhVar, String str) {
        throw null;
    }

    public static String charRepr(int i) {
        if (i == -1) {
            return "EOF";
        }
        return "" + ((char) i);
    }

    private static String toMessage(String str, int i, int i2, String str2, String str3) {
        return str + "(" + i + "): \n" + str2 + "\nLast character read was '" + charRepr(i2) + "'\n" + str3;
    }

    private static String toString(char[] cArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cArr[0]);
        for (int i = 1; i < cArr.length; i++) {
            stringBuffer.append("or " + cArr[i]);
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause_;
    }

    public int getLineNumber() {
        return this.lineNumber_;
    }

    public ParseException(rkh rkhVar, String str, int i, int i2, String str2, String str3) {
        this(str, i, i2, str2, str3);
        rkhVar.a(str3, str, i);
    }

    public ParseException(String str) {
        super(str);
        this.lineNumber_ = -1;
        this.cause_ = null;
    }

    public ParseException(String str, Throwable th) {
        super(str + " " + th);
        this.lineNumber_ = -1;
        this.cause_ = th;
    }

    public ParseException(String str, int i, int i2, String str2, String str3) {
        super(toMessage(str, i, i2, str2, str3));
        this.cause_ = null;
        this.lineNumber_ = i;
    }

    public ParseException(qkh qkhVar, char c, char c2) {
        this(qkhVar, "got '" + c + "' instead of expected '" + c2 + "'");
    }

    public ParseException(qkh qkhVar, char c, char[] cArr) {
        this(qkhVar, "got '" + c + "' instead of " + toString(cArr));
    }

    public ParseException(qkh qkhVar, char c, String str) {
        this(qkhVar, "got '" + c + "' instead of " + str + " as expected");
    }

    public ParseException(qkh qkhVar, String str, String str2) {
        this(qkhVar, "got \"" + str + "\" instead of \"" + str2 + "\" as expected");
    }

    public ParseException(qkh qkhVar, String str, char[] cArr) {
        this(qkhVar, str, new String(cArr));
    }
}
