package com.garmin.android.framework.garminonline.query;

/* JADX INFO: loaded from: classes8.dex */
public abstract class QueryException extends Exception {
    private final int mErrorCode;

    public QueryException(int i14) {
        this.mErrorCode = i14;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return Integer.toString(this.mErrorCode) + ": " + super.getMessage();
    }

    public QueryException(String str, Throwable th3, int i14) {
        super(str, th3);
        this.mErrorCode = i14;
    }

    public QueryException(String str, int i14) {
        super(str);
        this.mErrorCode = i14;
    }

    public QueryException(Throwable th3, int i14) {
        super(th3);
        this.mErrorCode = i14;
    }
}
