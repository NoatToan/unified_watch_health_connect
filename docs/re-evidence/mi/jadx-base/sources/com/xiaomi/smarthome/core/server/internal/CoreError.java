package com.xiaomi.smarthome.core.server.internal;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class CoreError {
    private int mCode;
    private String mDetail;

    public CoreError(int i, String str) {
        this.mCode = i;
        this.mDetail = str;
    }

    public final int getCode() {
        return this.mCode;
    }

    public final String getDetail() {
        return this.mDetail;
    }

    public String toString() {
        return "CoreError{mCode=" + this.mCode + ", mDetail='" + this.mDetail + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
