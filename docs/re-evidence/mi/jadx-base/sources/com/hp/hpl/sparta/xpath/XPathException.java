package com.hp.hpl.sparta.xpath;

import defpackage.gsr;
import defpackage.mdm;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class XPathException extends Exception {
    private Throwable cause_;

    public XPathException(gsr gsrVar, String str) {
        super(gsrVar + " " + str);
        this.cause_ = null;
    }

    private static String toString(mdm mdmVar) {
        try {
            new StringBuffer().append(tokenToString(mdmVar));
            throw null;
        } catch (IOException e) {
            return "(cannot get  info: " + e + ")";
        }
    }

    private static String tokenToString(mdm mdmVar) {
        throw null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause_;
    }

    public XPathException(gsr gsrVar, String str, mdm mdmVar, String str2) {
        this(gsrVar, str + " got \"" + toString(mdmVar) + "\" instead of expected " + str2);
    }

    public XPathException(gsr gsrVar, Exception exc) {
        super(gsrVar + " " + exc);
        this.cause_ = exc;
    }
}
