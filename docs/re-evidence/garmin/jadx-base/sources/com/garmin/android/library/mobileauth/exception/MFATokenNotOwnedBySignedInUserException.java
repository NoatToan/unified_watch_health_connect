package com.garmin.android.library.mobileauth.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/exception/MFATokenNotOwnedBySignedInUserException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MFATokenNotOwnedBySignedInUserException extends Exception {
    public static final int $stable = 8;

    public MFATokenNotOwnedBySignedInUserException() {
        super("MFA token not owned by signed-in user.");
    }
}
