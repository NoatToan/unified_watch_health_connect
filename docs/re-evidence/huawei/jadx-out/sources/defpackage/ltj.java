package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcoresleepmgr.SyncBaseFunction;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ltj {
    public static String b(SyncBaseFunction syncBaseFunction) {
        DeviceInfo deviceInfoD = d(syncBaseFunction);
        if (deviceInfoD != null) {
            return deviceInfoD.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static DeviceInfo d(SyncBaseFunction syncBaseFunction) {
        LogUtil.a("DeviceUtil", "phonservice getDeviceInfo ");
        return syncBaseFunction.getDeviceInfo();
    }

    public static void c(SyncBaseFunction syncBaseFunction) {
        HashMap map = new HashMap();
        map.put(1, Integer.toString(1));
        syncBaseFunction.sendCommandToDevice(24, map, d(syncBaseFunction));
    }

    public static void d(int i, SyncBaseFunction syncBaseFunction) {
        HashMap map = new HashMap();
        map.put(1, Integer.toString(i));
        syncBaseFunction.sendCommandToDevice(25, map, d(syncBaseFunction));
    }

    public static DeviceCapability b(DeviceInfo deviceInfo, SyncBaseFunction syncBaseFunction) {
        return syncBaseFunction.getDeviceCapability(deviceInfo);
    }
}
