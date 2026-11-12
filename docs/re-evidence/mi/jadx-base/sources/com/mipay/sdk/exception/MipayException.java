package com.mipay.sdk.exception;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class MipayException extends Exception {
    private static final long serialVersionUID = 1;
    private int mErrorCode;
    private Bundle mErrorResult;

    public MipayException(int i, String str) {
        this(i, str, null);
    }

    public int getError() {
        return this.mErrorCode;
    }

    public Bundle getErrorResult() {
        return this.mErrorResult;
    }

    public MipayException(int i, String str, Bundle bundle) {
        super(str);
        this.mErrorCode = i;
        if (bundle == null) {
            this.mErrorResult = new Bundle();
        } else {
            this.mErrorResult = bundle;
        }
    }

    public MipayException(int i, Throwable th) {
        super(th);
        this.mErrorCode = i;
        this.mErrorResult = new Bundle();
    }
}
