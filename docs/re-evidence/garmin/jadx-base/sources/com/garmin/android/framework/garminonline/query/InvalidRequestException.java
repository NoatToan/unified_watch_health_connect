package com.garmin.android.framework.garminonline.query;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes8.dex */
public class InvalidRequestException extends QueryException {
    public static final int INVALID_REQUEST = 0;
    public static final int INVALID_REQUEST_RECORD = 3;
    public static final int INVALID_REQUEST_URL = 7;
    public static final int INVALID_REQUEST_VALUE = 1;
    public static final int INVALID_TRANSACTION_PROPERTIES = 5;
    public static final int MISSING_DEVICE_PROPERTY = 6;
    public static final int MISSING_REQUEST_RECORD = 4;
    public static final int MISSING_REQUEST_VALUE = 2;

    public InvalidRequestException(int i14) {
        super(getErrorCode(i14));
    }

    public static int getErrorCode(int i14) {
        switch (i14) {
            case 1:
                return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE;
            case 2:
                return 402;
            case 3:
                return 403;
            case 4:
                return WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
            case 5:
                return WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR;
            case 6:
                return WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED;
            case 7:
                return 407;
            default:
                return 400;
        }
    }

    public InvalidRequestException(String str, int i14) {
        super(str, getErrorCode(i14));
    }

    public InvalidRequestException(String str, Throwable th3, int i14) {
        super(str, th3, getErrorCode(i14));
    }

    public InvalidRequestException(Throwable th3, int i14) {
        super(th3, getErrorCode(i14));
    }
}
