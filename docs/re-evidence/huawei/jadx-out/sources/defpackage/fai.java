package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;

/* JADX INFO: loaded from: classes7.dex */
public class fai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BroadcastReceiver f33770a = null;
    private static boolean d = false;

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f33771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f33772b;
        private final boolean d;

        a(boolean z, boolean z2, boolean z3) {
            this.f33771a = z;
            this.f33772b = z2;
            this.d = z3;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                LogUtil.a("SleepDeviceControl", "fetchDeviceInfoAndChange ConnectionStateReceiver into");
                fai.d(this.f33771a, this.f33772b, this.d, ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "SleepDeviceControl"));
            }
        }
    }

    public static void e(boolean z) {
        LogUtil.a("SleepDeviceControl", "changeHeartRateSwitch into changeToOpen is ", Boolean.valueOf(z));
        boolean zA = lua.a(Integer.toString(10000), "Sleep_HeartRateSwitch", false);
        boolean zA2 = lua.a(Integer.toString(10000), "Sleep_MeasureWay", false);
        if (!zA && !zA2 && !z) {
            LogUtil.a("SleepDeviceControl", "never change switch and measurement");
        } else {
            b(zA, zA2, z);
        }
    }

    private static void b(boolean z, boolean z2, boolean z3) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "SleepDeviceControl");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            a(z, z2, z3);
        } else {
            d(z, z2, z3, deviceInfo);
        }
    }

    private static void a(boolean z, boolean z2, boolean z3) {
        LogUtil.a("SleepDeviceControl", "fetchDeviceInfoAndChange into changeToOpen is ", Boolean.valueOf(z3));
        d = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        f33770a = new a(z, z2, z3);
        BroadcastManagerUtil.c(BaseApplication.getContext(), f33770a, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z, boolean z2, boolean z3, DeviceInfo deviceInfo) {
        LogUtil.a("SleepDeviceControl", "executeSwitchChange into changeToOpen is ", Boolean.valueOf(z3));
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("SleepDeviceControl", "changeHeartRateSwitch deviceInfo is null");
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.e("SleepDeviceControl", "deviceCapability is null");
            return;
        }
        if ((z || z2) && !z3) {
            c(z2, z, deviceCapabilityC);
            lua.d(Integer.toString(10000), "Sleep_HeartRateSwitch", false);
            lua.d(Integer.toString(10000), "Sleep_MeasureWay", false);
            LogUtil.a("SleepDeviceControl", "change to reset, hasChangeSwitch,", Boolean.valueOf(z), " hasChangeMeasure", Boolean.valueOf(z2));
            return;
        }
        if (d) {
            d = false;
            BroadcastManagerUtil.b(BaseApplication.getContext(), f33770a);
        }
        d(deviceCapabilityC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        ecu.d().getSwitchSetting("heart_rate_mode", new IBaseResponseCallback() { // from class: faj
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                fai.c(i, obj);
            }
        });
    }

    static /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("SleepDeviceControl", "HEART_RATE_MODE, errorCode ", Integer.valueOf(i), " objectData ", obj);
        if (i == 0 && (obj instanceof String)) {
            int i2 = Integer.parseInt((String) obj);
            LogUtil.a("SleepDeviceControl", "supportValue:", Integer.valueOf(i2));
            if (i2 != 1) {
                return;
            }
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: fan
            @Override // java.lang.Runnable
            public final void run() {
                fai.a();
            }
        });
    }

    static /* synthetic */ void a() {
        ecu.d().changeContinueMeasureHeartRateStatus(1);
        lua.d(Integer.toString(10000), "Sleep_MeasureWay", true);
        LogUtil.a("SleepDeviceControl", "switchMeasurementMethod");
    }

    private static void d(DeviceCapability deviceCapability) {
        if (deviceCapability.isSupportContinueHeartRate()) {
            ecu.d().getSwitchSetting("continue_heart_rate", new IBaseResponseCallback() { // from class: fap
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    fai.d(i, obj);
                }
            });
        } else if (deviceCapability.isSupportHeartRateEnable()) {
            ecu.d().getSwitchSetting("heart_rate_button", new IBaseResponseCallback() { // from class: faq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    fai.a(i, obj);
                }
            });
        }
    }

    static /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("SleepDeviceControl", "errorCode is ", Integer.valueOf(i), " objData is ", obj);
        int iB = 0;
        if (i == 0 && (obj instanceof String)) {
            iB = CommonUtil.b(BaseApplication.getContext(), (String) obj, 0);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: fah
            @Override // java.lang.Runnable
            public final void run() {
                fai.c();
            }
        });
        if (iB == 0) {
            lua.d(Integer.toString(10000), "Sleep_HeartRateSwitch", true);
            LogUtil.a("SleepDeviceControl", "changeContinueMeasureHeartRateStatus");
        }
    }

    static /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("SleepDeviceControl", "HEART_RATE_BUTTON err_code is ", Integer.valueOf(i));
        boolean zEquals = (i == 0 && (obj instanceof String)) ? "1".equals((String) obj) : false;
        if (!zEquals) {
            ecu.d().changeHeartRateBtValue(true);
            lua.d(Integer.toString(10000), "Sleep_HeartRateSwitch", true);
        }
        LogUtil.a("SleepDeviceControl", "openSwitch isEnable = ", Boolean.valueOf(zEquals));
    }

    private static void c(boolean z, boolean z2, DeviceCapability deviceCapability) {
        if (!deviceCapability.isSupportContinueHeartRate()) {
            if (deviceCapability.isSupportHeartRateEnable() && z2) {
                ecu.d().changeHeartRateBtValue(false);
                return;
            }
            return;
        }
        if (z2 && z) {
            ecu.d().changeCycleMeasureHeartRateStatus(0);
        }
        if (z2 && !z) {
            ecu.d().changeContinueMeasureHeartRateStatus(0);
        }
        if (z2 || !z) {
            return;
        }
        ecu.d().changeCycleMeasureHeartRateStatus(1);
    }
}
