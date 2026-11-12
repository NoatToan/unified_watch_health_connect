package com.garmin.android.framework.garminonline.query;

/* JADX INFO: loaded from: classes8.dex */
public class InvalidResponseException extends QueryException {
    public static final int INVALID_RESPONSE = 0;
    public static final int INVALID_RESPONSE_ENCODING = 5;
    public static final int INVALID_RESPONSE_RECORD = 3;
    public static final int INVALID_RESPONSE_VALUE = 1;
    public static final int MISSING_RESPONSE_RECORD = 4;
    public static final int MISSING_RESPONSE_VALUE = 2;

    public InvalidResponseException(int i14) {
        super(getErrorCode(i14));
    }

    public static int getErrorCode(int i14) {
        if (i14 == 1) {
            return 501;
        }
        if (i14 == 2) {
            return 502;
        }
        if (i14 == 3) {
            return 503;
        }
        if (i14 != 4) {
            return i14 != 5 ? 500 : 505;
        }
        return 504;
    }

    public InvalidResponseException(String str, int i14) {
        super(str, getErrorCode(i14));
    }

    public InvalidResponseException(String str, Throwable th3, int i14) {
        super(str, th3, getErrorCode(i14));
    }

    public InvalidResponseException(Throwable th3, int i14) {
        super(th3, getErrorCode(i14));
    }
}
