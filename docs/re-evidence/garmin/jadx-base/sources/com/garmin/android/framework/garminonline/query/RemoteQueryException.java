package com.garmin.android.framework.garminonline.query;

/* JADX INFO: loaded from: classes8.dex */
public class RemoteQueryException extends QueryException {
    public static final int REMOTE_QUERY_FAILED = 0;
    public static final int REMOTE_QUERY_FAIL_STATUS = 6;
    public static final int REMOTE_QUERY_INVALID_RECORD = 1;
    public static final int REMOTE_QUERY_INVALID_VALUE = 3;
    public static final int REMOTE_QUERY_MISSING_RECORD = 2;
    public static final int REMOTE_QUERY_MISSING_RESPONSE = 5;
    public static final int REMOTE_QUERY_MISSING_VALUE = 4;

    public RemoteQueryException(int i14) {
        super(getErrorCode(i14));
    }

    public static int getErrorCode(int i14) {
        switch (i14) {
            case 1:
                return 801;
            case 2:
                return 802;
            case 3:
                return 803;
            case 4:
                return 804;
            case 5:
                return 805;
            case 6:
                return 806;
            default:
                return 800;
        }
    }

    public RemoteQueryException(String str, int i14) {
        super(str, getErrorCode(i14));
    }

    public RemoteQueryException(String str, Throwable th3, int i14) {
        super(str, th3, getErrorCode(i14));
    }

    public RemoteQueryException(Throwable th3, int i14) {
        super(th3, getErrorCode(i14));
    }
}
