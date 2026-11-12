package com.garmin.android.framework.garminonline.query;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes8.dex */
public class ConnectionException extends QueryException {
    public static final int CANNOT_ESTABLISH_CONNECTION = 0;
    public static final int CANNOT_OPEN_STREAM = 3;
    public static final int CANNOT_READ_RESPONSE = 2;
    public static final int CANNOT_SEND_REQUEST = 1;
    public static final int SOCKET_TIMEOUT = 4;
    private final int mConnectivityStatus;

    public ConnectionException(String str, int i14, int i15) {
        super(str, getErrorCode(i15));
        this.mConnectivityStatus = i14;
    }

    public static int getErrorCode(int i14) {
        if (i14 == 1) {
            return MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE;
        }
        if (i14 == 2) {
            return 302;
        }
        if (i14 != 3) {
            return i14 != 4 ? 300 : 304;
        }
        return 303;
    }

    public int getConnectivityStatus() {
        return this.mConnectivityStatus;
    }

    public ConnectionException(String str, Throwable th3, int i14, int i15) {
        super(str, th3, getErrorCode(i15));
        this.mConnectivityStatus = i14;
    }
}
