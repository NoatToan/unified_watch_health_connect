package com.garmin.samd.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/samd/exception/GHSBaseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "ghsErrorId", "(Ljava/lang/String;Ljava/lang/String;)V", "getGhsErrorId", "()Ljava/lang/String;", "getMsg", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class GHSBaseException extends Exception {
    private final String ghsErrorId;
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GHSBaseException(String str, String str2) {
        super(str);
        str.getClass();
        str2.getClass();
        this.msg = str;
        this.ghsErrorId = str2;
    }

    public final String getGhsErrorId() {
        return this.ghsErrorId;
    }

    public final String getMsg() {
        return this.msg;
    }
}
