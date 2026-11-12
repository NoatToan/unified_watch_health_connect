package com.amazon.identity.auth.device;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ParcelCreator"})
public class InvalidGrantAuthError extends AuthError {
    private static final long serialVersionUID = 1;

    public InvalidGrantAuthError(String str) {
        super(str, AuthError.ERROR_TYPE.ERROR_INVALID_GRANT);
    }
}
