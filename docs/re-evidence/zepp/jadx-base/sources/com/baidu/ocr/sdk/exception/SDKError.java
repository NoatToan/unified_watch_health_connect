package com.baidu.ocr.sdk.exception;

/* JADX INFO: loaded from: classes2.dex */
public class SDKError extends OCRError {

    public interface ErrorCode {
        public static final int ACCESS_TOKEN_DATA_ERROR = 283505;
        public static final int LOAD_JNI_LIBRARY_ERROR = 283506;
        public static final int NETWORK_REQUEST_ERROR = 283504;
    }

    public SDKError(int i, String str, Throwable th) {
        super(i, str, th);
        this.cause = th;
        this.errorCode = i;
    }

    public SDKError(int i, String str) {
        super(i, str);
        this.errorCode = i;
        this.errorMessage = str;
    }

    public SDKError(String str) {
        super(str);
    }

    public SDKError() {
    }
}
