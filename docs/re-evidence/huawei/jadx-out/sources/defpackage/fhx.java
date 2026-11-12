package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fhx {
    public static List<DeviceInfo> b(int i) {
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        d(arrayList, i);
        return arrayList;
    }

    private static void d(List<DeviceInfo> list) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HWhealthLinkage_LinkedDeviceInteractor");
        if (njy.e(deviceList)) {
            return;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo == null) {
                LogUtil.j("HWhealthLinkage_LinkedDeviceInteractor", "deviceInfo is null in getDeviceTypeIdList");
            } else if (fhz.d().g() || deviceInfo.getProductType() == 11) {
                list.add(deviceInfo);
            }
        }
    }

    private static void d(List<DeviceInfo> list, int i) {
        if (SportSupportUtil.g(i)) {
            List<ivo.d> listB = ivo.a().b(i);
            if (njy.b(listB)) {
                for (ivo.d dVar : listB) {
                    if (dVar == null || dVar.e() == null) {
                        LogUtil.j("HWhealthLinkage_LinkedDeviceInteractor", "deviceInfo is null in setBoltDeviceId");
                    } else {
                        list.add(dVar.e());
                    }
                }
                return;
            }
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "HWhealthLinkage_LinkedDeviceInteractor");
            if (njy.e(deviceList)) {
                return;
            }
            for (DeviceInfo deviceInfo : deviceList) {
                if (deviceInfo == null || !eel.d(deviceInfo.getProductType(), deviceInfo.getAutoDetectSwitchStatus())) {
                    LogUtil.j("HWhealthLinkage_LinkedDeviceInteractor", "deviceInfo is null or not run posture.");
                } else {
                    list.add(deviceInfo);
                }
            }
        }
    }
}
