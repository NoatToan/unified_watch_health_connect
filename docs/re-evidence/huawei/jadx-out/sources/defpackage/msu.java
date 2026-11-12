package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class msu {
    public void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mst
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        });
    }

    private void e(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceListChangeHandler", "onDeviceRemoved: removed device list is null or empty.");
        } else {
            LogUtil.a("DeviceListChangeHandler", "onDeviceRemoved: removed device list's size:", Integer.valueOf(list.size()));
            mti.c(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Context context = BaseApplication.getContext();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceListChangeHandler");
        d(a(deviceList), mta.b(context).d());
    }

    private void d(List<String> list, List<String> list2) {
        boolean z = true;
        boolean z2 = list == null || list.isEmpty();
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z2 && z) {
            LogUtil.a("DeviceListChangeHandler", "calculateChanged: SCENARIO 1.");
            return;
        }
        if (z2) {
            LogUtil.a("DeviceListChangeHandler", "calculateChanged: SCENARIO 2.");
            e(list2);
            return;
        }
        if (z) {
            LogUtil.a("DeviceListChangeHandler", "calculateChanged: SCENARIO 3.");
            return;
        }
        LogUtil.a("DeviceListChangeHandler", "calculateChanged: SCENARIO 4.");
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list);
        List<String> arrayList3 = new ArrayList<>(list2);
        if (arrayList.retainAll(list2)) {
            LogUtil.a("DeviceListChangeHandler", "calculateChanged: both of this list is same.");
            return;
        }
        if (arrayList2.removeAll(arrayList)) {
            LogUtil.a("DeviceListChangeHandler", "removeAll ok");
        }
        if (arrayList3.removeAll(arrayList)) {
            e(arrayList3);
        }
    }

    private List<String> a(List<DeviceInfo> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null) {
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (!TextUtils.isEmpty(deviceIdentify)) {
                    arrayList.add(mtr.e(deviceIdentify));
                }
            }
        }
        return arrayList;
    }
}
