package defpackage;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class ncb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ncb f42868b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xgt f42869a;
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: ncb.2
        /* JADX WARN: Code duplicated, block: B:23:0x0062  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b2;
            if (intent == null) {
                LogUtil.a("HwPhoneLockScreenStatusManager", "mPhoneStatusReceiver intent is null");
                return;
            }
            JsonObject jsonObject = new JsonObject();
            LogUtil.a("HwPhoneLockScreenStatusManager", "mPhoneStatusReceiver intent action is", intent.getAction());
            String str = (String) Objects.requireNonNull(intent.getAction());
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != -2128145023) {
                if (iHashCode != -1454123155) {
                    if (iHashCode == 823795052 && str.equals("android.intent.action.USER_PRESENT")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("android.intent.action.SCREEN_ON")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("android.intent.action.SCREEN_OFF")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                jsonObject.addProperty("screenStatus", (Number) 0);
                jsonObject.addProperty("lockStatus", (Number) 1);
            } else if (b2 == 1) {
                jsonObject.addProperty("screenStatus", (Number) 1);
            } else if (b2 != 2) {
                LogUtil.a("HwPhoneLockScreenStatusManager", "action is other");
            } else {
                jsonObject.addProperty("lockStatus", (Number) 0);
            }
            ncb ncbVar = ncb.this;
            ncbVar.d(ncbVar.b(jsonObject.toString()));
        }
    };

    public static ncb d() {
        ncb ncbVar;
        synchronized (mkl.class) {
            if (f42868b == null) {
                f42868b = new ncb();
            }
            ncbVar = f42868b;
        }
        return ncbVar;
    }

    public void a(xgt xgtVar) {
        ReleaseLogUtil.d("Notify_HwPhoneLockScreenStatusManager", "device connected, sendCurrPhoneStatus.");
        this.f42869a = xgtVar;
        BroadcastManager.i(this.d);
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private void c() {
        Object systemService = BaseApplication.getContext().getSystemService("keyguard");
        ?? InKeyguardRestrictedInputMode = systemService instanceof KeyguardManager ? ((KeyguardManager) systemService).inKeyguardRestrictedInputMode() : 0;
        Object systemService2 = BaseApplication.getContext().getSystemService("power");
        ?? IsInteractive = systemService2 instanceof PowerManager ? ((PowerManager) systemService2).isInteractive() : 1;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("screenStatus", Integer.valueOf((int) IsInteractive));
        jsonObject.addProperty("lockStatus", Integer.valueOf((int) InKeyguardRestrictedInputMode));
        d(b(jsonObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(eee eeeVar) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwPhoneLockScreenStatusManager");
        DeviceInfo deviceInfo = deviceList.isEmpty() ? null : deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.a("HwPhoneLockScreenStatusManager", "isSupportSyncIcon deviceInfo is null");
            return;
        }
        if (!eey.d(deviceInfo, 84)) {
            LogUtil.a("HwPhoneLockScreenStatusManager", "sendSampleEventCommand capability is not support.");
            return;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarC = xjf.c(eeeVar);
        if (cmgVarC == null) {
            LogUtil.a("HwPhoneLockScreenStatusManager", "sendSampleEventCommand commandMessage is invalid.");
            return;
        }
        LogUtil.a("HwPhoneLockScreenStatusManager", "sendSampleEventCommand command is ", eeq.e(cmgVarC.b()));
        if (this.f42869a == null) {
            xgt xgtVarB = xgt.b();
            this.f42869a = xgtVarB;
            xgtVarB.a(BaseApplication.getContext());
        }
        this.f42869a.sendCommand(uniteDeviceD, cmgVarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eee b(String str) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.phonelockscreenstatus");
        eeeVar.setWearPkgName("hw.watch.dst.phonelockscreenstatus");
        eeeVar.setCommandId(2);
        eeeVar.a(800100027L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(eeq.a(str)));
        return eeeVar;
    }

    public void b() {
        LogUtil.a("HwPhoneLockScreenStatusManager", "device disconnected,unregisterScreenChangedReceiver and destroy");
        BroadcastManager.p(this.d);
        synchronized (mkl.class) {
            f42868b = null;
        }
    }
}
