package defpackage;

import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes10.dex */
public class lcr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Integer, String> f39919c;

    static {
        HashMap map = new HashMap();
        f39919c = map;
        map.put(0, "success");
        f39919c.put(1, EventType.FAILED);
        f39919c.put(4, "api state exception");
        f39919c.put(5, "device exception");
        f39919c.put(150, "device not connected");
        f39919c.put(2, "param invalid");
        f39919c.put(3, "data validator error");
        f39919c.put(7, AuthInternalPickerConstant.PARAM_ERROR);
        f39919c.put(25, "screen locked error");
        f39919c.put(1001, "permission exception");
        f39919c.put(Integer.valueOf(HiHealthStatusCodes.USER_OF_BETA_APP_EXCEED_RANGE), "beta scope permission exception");
        f39919c.put(1002, "scope exception");
        f39919c.put(1003, "user privacy denied error");
        f39919c.put(1004, "network exception");
        f39919c.put(1005, "bluetooth not enabled");
        f39919c.put(1006, "location permission denied");
        f39919c.put(1007, "storage permission denied");
        f39919c.put(1008, "HealthKit data sharing not enabled");
        f39919c.put(1009, "token expired");
        f39919c.put(1021, "Transaction too large");
        f39919c.put(201, "healthy living unsubscribed");
        f39919c.put(30, "Health application need to be updated");
        f39919c.put(31, "HiHealthKit service was disconnected");
        f39919c.put(32, "HMS version must be later than or equal to 5.1.0.300");
        f39919c.put(1022, "Failed to synchronize data");
        f39919c.put(153, "device is not supported");
        f39919c.put(1023, "timeout");
        f39919c.put(1024, "business not need to be executed");
        f39919c.put(1025, "device storage permission denied");
    }

    public static String b(int i) {
        String str = f39919c.get(Integer.valueOf(i));
        return str == null ? "UNKNOWN_ERROR" : str;
    }

    public static List e(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(i));
        return arrayList;
    }
}
