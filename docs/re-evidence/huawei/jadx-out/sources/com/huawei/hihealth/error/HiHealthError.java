package com.huawei.hihealth.error;

import android.util.SparseArray;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthError {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SparseArray<String> f12300c;

    public static int d(int i) {
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 50048) {
                            if (i == 100000) {
                                return 0;
                            }
                            switch (i) {
                                default:
                                    if (i >= 2000 || i <= 0) {
                                        return 4;
                                    }
                                case 1001:
                                case 1002:
                                case 1003:
                                    return i;
                            }
                        }
                    }
                }
            }
            return 2;
        }
        return i;
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f12300c = sparseArray;
        sparseArray.append(0, "success");
        f12300c.append(1, EventType.FAILED);
        f12300c.append(2, "param invalid");
        f12300c.append(4, "api state exception");
        f12300c.append(5, "device exception");
        f12300c.append(150, "device not connected");
        f12300c.append(153, "device not supported");
        f12300c.append(1001, "api permission exception");
        f12300c.append(HiHealthStatusCodes.USER_OF_BETA_APP_EXCEED_RANGE, "beta scope permission exception");
        f12300c.append(1002, "api scope exception");
        f12300c.append(3, "data validator exception");
        f12300c.append(7, AuthInternalPickerConstant.PARAM_ERROR);
        f12300c.append(33, "third-party exception");
        f12300c.append(101, "repeat error");
        f12300c.append(102, "limit error");
        f12300c.append(1003, "privacy user denied error");
        f12300c.append(1005, "bluetooth not enabled");
        f12300c.append(1006, "location permission denied");
        f12300c.append(1007, "storage permission denied");
        f12300c.append(1008, "HealthKit data sharing not enabled");
        f12300c.append(1021, "Transaction too large");
        f12300c.append(100000, "read heart rate success");
        f12300c.append(201, "healthy living unsubscribed");
        f12300c.append(30, "Health application need to be updated");
        f12300c.append(31, "HiHealthKit service was disconnected");
        f12300c.append(32, "HMS version must be later than or equal to 5.1.0.300");
        f12300c.append(1004, "Network request failed. Please try again later");
        f12300c.append(1022, "Failed to synchronize data");
        f12300c.append(1023, "timeout");
        f12300c.append(1025, "storage permission denied");
    }

    private HiHealthError() {
    }

    public static String e(int i) {
        String str = f12300c.get(i);
        return str == null ? "unknown error" : str;
    }
}
