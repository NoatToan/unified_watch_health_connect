package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mud {
    public static boolean e() {
        return eey.d(b(), OldToNewMotionPath.SPORT_TYPE_BASKETBALL);
    }

    public static DeviceInfo b() {
        DeviceInfo next;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "SportContactPermissionUtils");
        if (deviceList.size() == 0) {
            LogUtil.j("SportContactPermissionUtils", "getContactedDeviceMac: the object of HwDeviceMgr is null. ");
            return null;
        }
        if (deviceList.size() <= 0) {
            next = null;
            break;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (eel.d(next.getProductType()));
        if (next != null) {
            return next;
        }
        LogUtil.j("SportContactPermissionUtils", "getContactedDeviceMac: the object of DeviceInfo is null. ");
        return null;
    }
}
