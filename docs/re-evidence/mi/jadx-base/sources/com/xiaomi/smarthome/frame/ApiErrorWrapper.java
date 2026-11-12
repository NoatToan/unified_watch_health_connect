package com.xiaomi.smarthome.frame;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ApiErrorWrapper extends Exception {
    public int code;
    public String detail;
    public String mExtra;

    public ApiErrorWrapper(Error error) {
        super(error.getDetail());
        this.detail = "";
        this.code = -1;
        this.detail = error.getDetail();
        this.code = error.getCode();
        this.mExtra = error.getmExtraMsg();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "ApiErrorWrapper {detail: " + this.detail + " ; code: " + this.code + " ; extra: " + this.mExtra + "}";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ApiErrorWrapper{detail='" + this.detail + "', code=" + this.code + ", mExtra='" + this.mExtra + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
