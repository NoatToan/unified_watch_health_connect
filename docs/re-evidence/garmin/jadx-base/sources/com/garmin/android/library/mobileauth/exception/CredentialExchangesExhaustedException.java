package com.garmin.android.library.mobileauth.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/mobileauth/exception/CredentialExchangesExhaustedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "customerGUID", "", "<init>", "(Ljava/lang/String;)V", "getCustomerGUID", "()Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialExchangesExhaustedException extends Exception {
    public static final int $stable = 8;
    private final String customerGUID;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialExchangesExhaustedException(String str) {
        super("credential exchanges exhausted, customerGUID ".concat(str));
        str.getClass();
        this.customerGUID = str;
    }

    public final String getCustomerGUID() {
        return this.customerGUID;
    }
}
