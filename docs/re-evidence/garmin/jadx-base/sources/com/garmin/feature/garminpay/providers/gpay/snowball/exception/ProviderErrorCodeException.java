package com.garmin.feature.garminpay.providers.gpay.snowball.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/ProviderErrorCodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorCode", "", "<init>", "(Ljava/lang/String;)V", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ProviderErrorCodeException extends RuntimeException {
    public static final int $stable = 8;
    private final String errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProviderErrorCodeException(String str, String str2) {
        super(str2);
        str.getClass();
        str2.getClass();
        this.errorCode = str;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public ProviderErrorCodeException(String str) {
        str.getClass();
        this.errorCode = str;
    }
}
