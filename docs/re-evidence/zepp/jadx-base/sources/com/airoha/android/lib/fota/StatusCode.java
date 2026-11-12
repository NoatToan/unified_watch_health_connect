package com.airoha.android.lib.fota;

/* JADX INFO: loaded from: classes2.dex */
public class StatusCode {
    public static final byte FOTA_ERRCODE_CHECK_INTEGRITY_FAIL = 3;
    public static final byte FOTA_ERRCODE_COMMIT_FAIL_DUE_TO_INTEGRITY_NOT_CHECKED = 7;
    public static final byte FOTA_ERRCODE_READ_FOTA_DATA_FAIL = 2;
    public static final byte FOTA_ERRCODE_READ_FOTA_HEADER_FAIL = 1;
    public static final byte FOTA_ERRCODE_SHA256_IS_NOT_SUPPORTED = 6;
    public static final byte FOTA_ERRCODE_SUCESS = 0;
    public static final byte FOTA_ERRCODE_UNINITIALIZED = -3;
    public static final byte FOTA_ERRCODE_UNKNOWN_INTEGRITY_CHECK_TYPE = 5;
    public static final byte FOTA_ERRCODE_UNKNOWN_PARTITION_ID = 8;
    public static final byte FOTA_ERRCODE_UNKNOWN_STORAGE_TYPE = 4;
    public static final byte FOTA_ERRCODE_UNSUPPORTED = -2;
    public static final byte FOTA_ERRCODE_UNSUPPORTED_PARTITION_ID = 9;
    public static final byte FOTA_ERROCODE = -1;
}
