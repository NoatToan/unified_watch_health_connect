package com.tsmclient.smartcard.terminal.response;

import com.tsmclient.smartcard.ByteArray;

/* JADX INFO: loaded from: classes6.dex */
public interface ScResponse {
    public static final ByteArray STATUS_OK = ByteArray.wrap(new byte[]{-112, 0});
    public static final ByteArray STATUS_MORE_DATA_AVAILABLE = ByteArray.wrap(new byte[]{99, 16});
    public static final ByteArray STATUS_OPERATION_FAILED = ByteArray.wrap(new byte[]{99, 32});
    public static final ByteArray STATUS_ACTIVATION_CONFLICT = ByteArray.wrap(new byte[]{99, 48});
    public static final ByteArray STATUS_REFERENCE_NOT_FOUND = ByteArray.wrap(new byte[]{106, -120});
    public static final ByteArray STATUS_INCORRECT_P1_P2 = ByteArray.wrap(new byte[]{106, -122});
    public static final ByteArray STATUS_INCORRECT_VALUES_IN_DATA_FIELD = ByteArray.wrap(new byte[]{106, -128});
    public static final ByteArray STATUS_APP_NOTE_EXISTS = ByteArray.wrap(new byte[]{106, -126});
    public static final ByteArray STATUS_INCORRECT_LC = ByteArray.wrap(new byte[]{103, 0});
    public static final ByteArray STATUS_SE_RESTRICT = ByteArray.wrap(new byte[]{102, -91});
    public static final ByteArray STATUS_SECURITY_STATUS_NOT_SATISFIED = ByteArray.wrap(new byte[]{105, -126});

    ByteArray getData();

    ByteArray getStatus();

    byte[] toBytes();
}
