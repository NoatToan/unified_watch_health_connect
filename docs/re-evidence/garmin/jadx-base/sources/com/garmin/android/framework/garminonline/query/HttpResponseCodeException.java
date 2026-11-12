package com.garmin.android.framework.garminonline.query;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class HttpResponseCodeException extends QueryException {
    private final HashMap mHeaders;
    private final int mResponseCode;

    public HttpResponseCodeException(int i14, HashMap map) {
        super(getErrorCode(i14));
        this.mResponseCode = i14;
        this.mHeaders = map;
    }

    private static int getErrorCode(int i14) {
        if (i14 > 0) {
            return i14 + 99000;
        }
        return 99000;
    }

    public String getHeader(String str) {
        return (String) this.mHeaders.get(str);
    }

    @Override // com.garmin.android.framework.garminonline.query.QueryException, java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer("Response Code: ");
        stringBuffer.append(this.mResponseCode);
        stringBuffer.append("\nHeaders: ");
        stringBuffer.append(this.mHeaders);
        return stringBuffer.toString();
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public HttpResponseCodeException(int i14) {
        this(i14, null);
    }
}
