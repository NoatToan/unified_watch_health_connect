package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class mjo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f41766b = new AtomicBoolean(false);

    public void a(List<String> list) {
        if (f41766b.get()) {
            return;
        }
        b(list);
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("relationShipMap");
        LogUtil.a("CompatibilityFitter", "CompatibilityFitter isUpdated is ", strC);
        if (!TextUtils.isEmpty(strC)) {
            f41766b.set(true);
            return;
        }
        mkl mklVarD = mkl.d();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "CompatibilityFitter");
        for (DeviceInfo deviceInfo : deviceList) {
            LogUtil.a("CompatibilityFitter", "CompatibilityFitter deviceInfo is ", deviceInfo.getDeviceName());
            if (deviceInfo.getDeviceActiveState() == 1) {
                if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
                    deviceInfo.setRelationship("followed_relationship");
                } else if (mklVarD.a(deviceInfo.getProductType())) {
                    deviceInfo.setRelationship("followed_relationship");
                } else {
                    deviceInfo.setRelationship("main_relationship");
                }
            } else if (!deviceInfo.getRelationship().equals("assistant_relationship")) {
                deviceInfo.setRelationship("unactive_relationship");
            } else {
                LogUtil.a("CompatibilityFitter", "device is assistant relationship:", cpl.a(deviceInfo.getDeviceIdentify()));
            }
        }
        mklVarD.c(deviceList, "CompatibilityFitter");
        KeyValDbManager.d(BaseApplication.getContext()).b("relationShipMap", "true");
        f41766b.set(true);
        LogUtil.a("CompatibilityFitter", "CompatibilityFitter end, with deviceInfoList size is ", Integer.valueOf(deviceList.size()));
    }

    private void b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("CompatibilityFitter", "refreshAssistantRelationship enter");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "CompatibilityFitter");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            d(deviceList, it.next());
        }
        mxg.b().d(deviceList);
        mkl.d().c(deviceList, "CompatibilityFitter");
    }

    private void d(List<DeviceInfo> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && str.equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.a("CompatibilityFitter", "refreshAssistantRelationship: ", cpl.a(str));
                deviceInfo.setRelationship("assistant_relationship");
            }
        }
    }
}
