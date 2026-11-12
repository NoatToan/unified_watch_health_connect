package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lti {
    public static void d() {
        c(OperationKey.HEALTH_APP_SLEEP_DATA_REPORT_85070001.value(), 0);
    }

    public static void e(int i) {
        c(OperationKey.HEALTH_APP_SLEEP_DATA_REPORT_85070001.value(), i);
    }

    public static void e() {
        c(OperationKey.HEALTH_APP_SLEEP_DATA_REPORT_85070001.value(), 10002);
    }

    public static void c() {
        c(OperationKey.HEALTH_APP_SLEEP_DATA_REPORT_85070001.value(), 1);
    }

    private static void c(String str, int i) {
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(str, i);
    }

    public static void e(int i, int i2, long j, int i3, DeviceInfo deviceInfo) {
        LogUtil.a("CoreSleepOperationUtil", "enter coreSleepSyncEvent. state=", Integer.valueOf(i), "; errorMessage=", Integer.valueOf(i2));
        if (deviceInfo == null) {
            LogUtil.j("CoreSleepOperationUtil", "coreSleepSyncEvent deviceInfo is null.");
            return;
        }
        if (j == 0) {
            LogUtil.j("CoreSleepOperationUtil", "coreSleepSyncEvent startTime is error.");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        e(linkedHashMap, deviceInfo, j);
        LogUtil.a("CoreSleepOperationUtil", "coreSleepSyncEvent dataNum=", Integer.valueOf(i3));
        linkedHashMap.put("count", String.valueOf(i3));
        if (i == 3) {
            linkedHashMap.put("result_code", "0");
        } else if (i == 21000) {
            linkedHashMap.put("result_code", "1");
        } else if (i == 0) {
            linkedHashMap.put("result_code", "2");
        } else {
            linkedHashMap.put("result_code", "3");
            linkedHashMap.put("error_code", String.valueOf(i2));
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_CORE_SLEEP_DATA_SYNC_80020013.value(), linkedHashMap);
    }

    private static void e(LinkedHashMap<String, String> linkedHashMap, DeviceInfo deviceInfo, long j) {
        if (linkedHashMap == null) {
            LogUtil.j("CoreSleepOperationUtil", "fillCommonData map is null.");
            return;
        }
        int productType = deviceInfo.getProductType();
        if (productType == -1) {
            LogUtil.j("CoreSleepOperationUtil", "fillCommonData productType is unkonw");
            return;
        }
        linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(productType));
        linkedHashMap.put("device_classfication", String.valueOf(eev.d(productType)));
        if (deviceInfo.getDeviceConnectState() == 2) {
            linkedHashMap.put("connect_status", "1");
        } else {
            linkedHashMap.put("connect_status", "0");
        }
        linkedHashMap.put("starttime", String.valueOf(j));
        long jCurrentTimeMillis = System.currentTimeMillis();
        linkedHashMap.put("endtime", String.valueOf(jCurrentTimeMillis));
        long j2 = jCurrentTimeMillis - j;
        if (j2 > 0) {
            linkedHashMap.put("duration", String.valueOf(j2));
        }
    }
}
