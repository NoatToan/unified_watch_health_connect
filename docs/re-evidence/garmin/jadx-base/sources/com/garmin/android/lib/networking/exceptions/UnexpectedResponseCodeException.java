package com.garmin.android.lib.networking.exceptions;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/lib/networking/exceptions/UnexpectedResponseCodeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "url", "", "responseCode", "", "msg", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getResponseCode", "()I", "getMsg", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnexpectedResponseCodeException extends Exception {
    private final String msg;
    private final int responseCode;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnexpectedResponseCodeException(String str, int i14, String str2) {
        super(str2);
        str.getClass();
        str2.getClass();
        this.url = str;
        this.responseCode = i14;
        this.msg = str2;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final String getUrl() {
        return this.url;
    }
}
