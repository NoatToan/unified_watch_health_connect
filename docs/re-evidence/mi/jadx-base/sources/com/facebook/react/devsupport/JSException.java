package com.facebook.react.devsupport;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class JSException extends Exception {
    private final String mStack;

    @v07
    public JSException(String str, String str2, Throwable th) {
        super(str, th);
        this.mStack = str2;
    }

    public String getStack() {
        return this.mStack;
    }

    public JSException(String str, String str2) {
        super(str);
        this.mStack = str2;
    }
}
