package com.huawei.hihealth.data.constant;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class HiErrorCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<Object> f12250a;

    static {
        SparseArray<Object> sparseArray = new SparseArray<>();
        f12250a = sparseArray;
        sparseArray.append(0, true);
        f12250a.append(1, "ERR_API_EXCEPTION ");
        f12250a.append(2, "ERR_BINDER_EXCEPTION ");
        f12250a.append(3, "ERR_DATA_VALIDATOR ");
        f12250a.append(4, "ERR_DATA_INSERT ");
        f12250a.append(5, "ERR_DATA_READ ");
        f12250a.append(6, "ERR_DATA_STAT ");
        f12250a.append(8, "ERR_AUTHORIZATION ");
        f12250a.append(9, "ERR_DATA_DELETE ");
        f12250a.append(10, "ERR_NO_FIND_CLIENT ");
        f12250a.append(11, "ERR_SQLITE_EXCEPTION ");
        f12250a.append(7, "ERR_PARAMETER_ERROR ");
        f12250a.append(12, "ERR_LOGIN ");
        f12250a.append(13, "ERR_LOGOUT ");
        f12250a.append(14, "ERR_USER_INFO ");
        f12250a.append(15, "ERR_ACCOUNT_INFO ");
        f12250a.append(16, "ERR_GOAL_INFO ");
        f12250a.append(17, "ERR_VALID_APP");
        f12250a.append(18, "ERR_VALID_UPDATE_OPTION");
        f12250a.append(19, "ERR_IS_NO_CLOUD_VERSION");
        f12250a.append(20, "ERR_HEALTH_USER_HAS_BEEN_CHANGED");
        f12250a.append(21, "ERR_TIMEOUT");
        f12250a.append(22, "ERR_THREAD_DISPOSE_EXCEPTION");
        f12250a.append(23, "ERR_AT_INVALID");
        f12250a.append(24, "ERR_HEALTH_NO_RUN");
        f12250a.append(25, "ERR_SCREEN_LOCKED");
        f12250a.append(1001, "ERR_PERMISSION_EXCEPTION");
        f12250a.append(1002, "ERR_SCOPE_EXCEPTION");
        f12250a.append(1003, "ERR_PRIVACY_USER_DENIED");
        f12250a.append(26, "ERR_SENSITIVE_DATABASE");
        f12250a.append(27, "ERR_PARTIAL_DATA_INVALID");
    }

    private HiErrorCode() {
    }

    public static Object c(int i) {
        Object obj = f12250a.get(i);
        return obj == null ? "unknown error" : obj;
    }
}
