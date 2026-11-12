package com.baidu.ocr.sdk.exception;

/* JADX INFO: loaded from: classes2.dex */
public class OCRError extends Exception {
    public Throwable cause;
    public int errorCode;
    public String errorMessage;
    public long logId;

    public interface ErrorCode {
        public static final int SERVICE_DATA_ERROR = 283505;
    }

    public OCRError(int i, String str, Throwable th) {
        super(genMessage(i, str), th);
        this.cause = th;
        this.errorCode = i;
    }

    private static String genMessage(int i, String str) {
        return "[" + i + "] " + str;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public long getLogId() {
        return this.logId;
    }

    public void setLogId(long j) {
        this.logId = j;
    }

    public OCRError(int i, String str) {
        super(genMessage(i, str));
        this.errorCode = i;
        this.errorMessage = str;
    }

    public OCRError(String str) {
        super(str);
    }

    public OCRError() {
    }
}
