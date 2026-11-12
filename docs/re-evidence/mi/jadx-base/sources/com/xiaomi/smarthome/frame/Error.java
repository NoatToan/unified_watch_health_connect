package com.xiaomi.smarthome.frame;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class Error {
    private int mCode;
    private String mDetail;
    private String mExtraMsg;

    public Error(int i, String str) {
        this.mCode = i;
        this.mDetail = str;
    }

    public final int getCode() {
        return this.mCode;
    }

    public final String getDetail() {
        return this.mDetail;
    }

    public String getmExtraMsg() {
        return this.mExtraMsg;
    }

    public String toSimpleString() {
        return this.mCode + Marker.ANY_NON_NULL_MARKER + this.mDetail;
    }

    public String toString() {
        return "Error{mCode=" + this.mCode + ", mDetail='" + this.mDetail + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public Error(int i, String str, String str2) {
        this.mCode = i;
        this.mDetail = str;
        this.mExtraMsg = str2;
    }
}
