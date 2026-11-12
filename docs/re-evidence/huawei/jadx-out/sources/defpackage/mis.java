package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class mis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Integer> f41724a;
    private static mis d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41726c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41725b = new Object();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f41724a = copyOnWriteArrayList;
        copyOnWriteArrayList.add(0);
        f41724a.add(2);
        f41724a.add(3);
        f41724a.add(4);
        f41724a.add(5);
        f41724a.add(6);
        f41724a.add(7);
        f41724a.add(8);
        f41724a.add(9);
        f41724a.add(10);
        f41724a.add(12);
        f41724a.add(13);
        f41724a.add(14);
        f41724a.add(15);
        c(16);
        f41724a.add(17);
        f41724a.add(20);
        f41724a.add(21);
        f41724a.add(22);
        f41724a.add(25);
        f41724a.add(27);
        f41724a.add(28);
        f41724a.add(30);
        f41724a.add(31);
        f41724a.add(29);
        f41724a.add(40);
        f41724a.add(41);
        f41724a.add(35);
        f41724a.add(32);
        f41724a.add(44);
        f41724a.add(42);
        f41724a.add(45);
        f41724a.add(47);
        f41724a.add(48);
        f41724a.add(49);
        f41724a.add(43);
        f41724a.add(51);
        f41724a.add(52);
        f41724a.add(53);
        g();
    }

    private static void g() {
        if (CommonUtil.bg()) {
            f41724a.add(36);
        } else {
            f41724a.add(37);
        }
    }

    private static void c(final Integer num) {
        if (ipe.d()) {
            f41724a.add(num);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        BroadcastManagerUtil.d(BaseApplication.getContext(), new BroadcastReceiver() { // from class: mis.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                    if (ipe.d()) {
                        if (mis.f41724a.contains(num)) {
                            return;
                        } else {
                            mis.f41724a.add(num);
                        }
                    } else if (!mis.f41724a.contains(num)) {
                        return;
                    } else {
                        mis.f41724a.remove(num);
                    }
                    Collections.sort(mis.f41724a);
                    mis.f();
                    ReleaseLogUtil.c("R_ReverseCapabilityConfigUtil", "checkHealthSummaryCapability sReverseCapability:", mis.f41724a);
                }
            }
        }, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ReverseCapabilityConfigUtil");
        if (njy.e(deviceList)) {
            LogUtil.e("ReverseCapabilityConfigUtil", "checkNotifyDeviceConnect deviceInfoList isEmpty");
            return;
        }
        final String deviceIdentify = deviceList.get(0).getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            ReleaseLogUtil.c("R_ReverseCapabilityConfigUtil", "checkNotifyDeviceConnect deviceIdentify isEmpty");
            return;
        }
        mjn.d("ReverseCapabilityConfigUtil", new DeviceStatusCallback() { // from class: mis.3
            @Override // com.huawei.callback.DeviceStatusCallback
            public void onDeviceConnectedChanged(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) {
                if (i == 3 && deviceIdentify.equals(deviceInfo.getDeviceIdentify())) {
                    mjn.e("ReverseCapabilityConfigUtil");
                    List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "ReverseCapabilityConfigUtil");
                    for (DeviceInfo deviceInfo2 : deviceList2) {
                        if (deviceIdentify.equals(deviceInfo2.getDeviceIdentify())) {
                            deviceInfo2.setDeviceActiveState(1);
                        }
                    }
                    mkf.e(BaseApplication.getContext()).switchDevice(deviceList2, deviceIdentify);
                    ReleaseLogUtil.c("R_ReverseCapabilityConfigUtil", "checkNotifyDeviceConnect switchDevice");
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(deviceIdentify);
        mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
        ReleaseLogUtil.c("R_ReverseCapabilityConfigUtil", "checkNotifyDeviceConnect unPair deviceIdentify:", CommonUtil.n(deviceIdentify));
    }

    private mis() {
    }

    public static mis e() {
        mis misVar;
        synchronized (f41726c) {
            if (d == null) {
                d = new mis();
            }
            misVar = d;
        }
        return misVar;
    }

    public void b() {
        Collections.sort(f41724a);
        ReleaseLogUtil.c("R_ReverseCapabilityConfigUtil", "initCapability sReverseCapability: ", Arrays.asList(f41724a));
    }

    public int d(Integer num, boolean z, String str) {
        List<Integer> list;
        synchronized (f41725b) {
            LogUtil.b("ReverseCapabilityConfigUtil", "setCapabilitySupport capabilityIndex: ", num, " isSupport: ", Boolean.valueOf(z), " tag: ", str);
            if (num.intValue() >= 0 && (list = f41724a) != null) {
                if (z) {
                    if (!list.contains(num)) {
                        f41724a.add(num);
                    }
                } else if (list.contains(num)) {
                    f41724a.remove(num);
                }
                LogUtil.b("ReverseCapabilityConfigUtil", "setCapabilitySupport set success.");
                return 0;
            }
            return -1;
        }
    }

    public List<Integer> a() {
        j();
        b();
        return f41724a;
    }

    private void j() {
        h();
    }

    private void h() {
        if (!CommonUtil.bg()) {
            LogUtil.b("ReverseCapabilityConfigUtil", "third phone need not add capability.");
            return;
        }
        boolean z = false;
        boolean z2 = ncp.i() && ncp.d();
        if (ncg.b().i() && eei.e() != 1) {
            z = true;
        }
        LogUtil.b("ReverseCapabilityConfigUtil", "mIsSupportSmartNotify：", Boolean.valueOf(z2), "mIsSupportNotify: ", Boolean.valueOf(z));
        if (z2 || z) {
            d(34, true, "checkSmartNotifyCapability");
            LogUtil.b("ReverseCapabilityConfigUtil", "add support smart switch capability.");
        }
    }
}
