package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class BleNetError {
    private int mCode;
    private String mDetail;
    private String mExtraMsg;

    public BleNetError(int i, String str) {
        this.mCode = i;
        this.mDetail = str;
    }

    public final int getCode() {
        return this.mCode;
    }

    public final String getDetail() {
        return this.mDetail;
    }

    public String getExtraMsg() {
        return this.mExtraMsg;
    }

    public String toString() {
        return "BleError{mCode=" + this.mCode + ", mDetail='" + this.mDetail + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public BleNetError(int i, String str, String str2) {
        this.mCode = i;
        this.mDetail = str;
        this.mExtraMsg = str2;
    }
}
