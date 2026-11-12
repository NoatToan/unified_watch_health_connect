package com.facebook.imagepipeline.decoder;

import defpackage.o98;

/* JADX INFO: loaded from: classes4.dex */
public class DecodeException extends RuntimeException {
    private final o98 mEncodedImage;

    public DecodeException(String str, o98 o98Var) {
        super(str);
        this.mEncodedImage = o98Var;
    }

    public o98 getEncodedImage() {
        return this.mEncodedImage;
    }

    public DecodeException(String str, Throwable th, o98 o98Var) {
        super(str, th);
        this.mEncodedImage = o98Var;
    }
}
