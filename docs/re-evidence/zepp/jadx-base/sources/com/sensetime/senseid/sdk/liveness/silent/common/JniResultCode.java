package com.sensetime.senseid.sdk.liveness.silent.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes18.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface JniResultCode {
    public static final int AUTH_EXPIRE = -15;
    public static final int CAPABILITY_NOT_SUPPORTED = -2067857410;
    public static final int FAIL = -4;
    public static final int FILE_NOT_FOUND = -7;
    public static final int HANDLE = -2;
    public static final int ILLEGAL_CALL = -1000;
    public static final int INVALID_APP_ID = -14;
    public static final int INVALID_ARG = -1;
    public static final int INVALID_AUTH = -13;
    public static final int INVALID_FILE_FORMAT = -8;
    public static final int INVALID_PIXEL_FORMAT = -6;
    public static final int IO_ERROR = -2067791875;
    public static final int LIMIT_NOT_SUPPORTED = -2067857411;
    public static final int MODEL_FILE_EXPIRE = -9;
    public static final int MODEL_UNZIP_FAILED = -25;
    public static final int MOTION_NOT_PASS = -2064646146;
    public static final int MOTION_NOT_SET = -2064646145;
    public static final int NOT_BEGIN = -2067791873;
    public static final int NOT_END = -2067791874;
    public static final int OK = 0;
    public static final int OUT_OF_MEMORY = -3;
    public static final int PLATFORM_NOT_SUPPORTED = -24;
    public static final int PRODUCT_LICENSE_LOADED = -2067857409;
    public static final int SUBMODULE_NOT_FOUND = -26;
    public static final int UUID_MISMATCH = -16;
    public static final int VERSION_MISMATCH = -23;
}
