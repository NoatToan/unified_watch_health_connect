package com.amazon.identity.auth.device;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ParcelCreator"})
public class InsufficientScopeAuthError extends AuthError {
    private static final long serialVersionUID = -6744534043432690103L;

    public InsufficientScopeAuthError(String str) {
        super(str, AuthError.ERROR_TYPE.ERROR_BAD_API_PARAM);
    }
}
