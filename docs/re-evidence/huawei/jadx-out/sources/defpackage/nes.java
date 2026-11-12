package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nes {
    public static void e() {
        if (!CommonUtil.bh()) {
            LogUtil.j("CountryCodeUtil", "startChangeDeviceCountryCode not HuaweiSystemOrHonor");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: nes.5
                @Override // java.lang.Runnable
                public void run() {
                    nes.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a() {
        ReleaseLogUtil.d("CountryCodeUtil", "changeDeviceCountryCode trigger");
        List<DeviceInfo> listD = d();
        if (listD.size() == 0) {
            LogUtil.j("CountryCodeUtil", "connected device list is null,can not change any countryCode");
            return;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (nfi.b(deviceInfo).booleanValue()) {
                nfi.b(BaseApplication.getContext(), deviceInfo);
            }
        }
    }

    private static List<DeviceInfo> d() {
        ArrayList arrayList = new ArrayList(16);
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "CountryCodeUtil")) {
            if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }
}
