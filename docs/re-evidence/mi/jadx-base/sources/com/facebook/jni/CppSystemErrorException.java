package com.facebook.jni;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class CppSystemErrorException extends CppException {
    int errorCode;

    @v07
    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
