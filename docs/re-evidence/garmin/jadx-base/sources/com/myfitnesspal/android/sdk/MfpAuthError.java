package com.myfitnesspal.android.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class MfpAuthError extends RuntimeException {
    private static final long serialVersionUID = 1;
    private int mErrorCode;
    private String mErrorType;

    public MfpAuthError(String str, String str2, int i14) {
        super(str);
        this.mErrorType = str2;
        this.mErrorCode = i14;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorType() {
        return this.mErrorType;
    }

    public MfpAuthError(String str) {
        super(str);
        this.mErrorCode = 0;
    }
}
