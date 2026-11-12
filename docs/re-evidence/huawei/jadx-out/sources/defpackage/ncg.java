package defpackage;

import android.app.KeyguardManager;
import android.content.ContentValues;
import android.net.Uri;
import android.os.PowerManager;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ncg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ncg f42876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42877c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42878a;
    private boolean d;
    private boolean e = false;
    private PowerManager f;
    private boolean g;
    private KeyguardManager j;

    private ncg() {
        this.g = false;
        boolean zD = ncp.d();
        this.g = zD;
        LogUtil.a("NotificationCollaborateManager", "NotificationCollaborateManager init phoneNotificationCollaboration3: ", Boolean.valueOf(zD));
    }

    public static ncg b() {
        ncg ncgVar;
        synchronized (f42877c) {
            if (f42876b == null) {
                f42876b = new ncg();
            }
            ncgVar = f42876b;
        }
        return ncgVar;
    }

    public void f() {
        if (!i() && !ncp.i()) {
            LogUtil.j("NotificationCollaborateManager", "onDeviceConnected not support");
        } else {
            g();
        }
    }

    public boolean h() {
        boolean zInKeyguardRestrictedInputMode;
        boolean zIsInteractive;
        ReleaseLogUtil.d("R_NotificationCollaborateManager", "isReminder switch is ", Boolean.valueOf(this.d));
        KeyguardManager keyguardManager = this.j;
        if (keyguardManager != null) {
            zInKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
        } else {
            Object systemService = BaseApplication.getContext().getSystemService("keyguard");
            zInKeyguardRestrictedInputMode = systemService instanceof KeyguardManager ? ((KeyguardManager) systemService).inKeyguardRestrictedInputMode() : false;
        }
        PowerManager powerManager = this.f;
        if (powerManager != null) {
            zIsInteractive = powerManager.isInteractive();
        } else {
            Object systemService2 = BaseApplication.getContext().getSystemService("power");
            zIsInteractive = systemService2 instanceof PowerManager ? ((PowerManager) systemService2).isInteractive() : true;
        }
        ReleaseLogUtil.d("R_NotificationCollaborateManager", "isReminder isLockScreen:", Boolean.valueOf(zInKeyguardRestrictedInputMode), " isScreenOn:", Boolean.valueOf(zIsInteractive));
        if (this.d && this.j != null && this.f != null) {
            return zInKeyguardRestrictedInputMode || !zIsInteractive;
        }
        ReleaseLogUtil.d("R_NotificationCollaborateManager", "isReminder switch is false or systemService is null");
        return true;
    }

    public boolean e() {
        LogUtil.a("NotificationCollaborateManager", "packagingReminderHex isJoinHarmonyReminder phoneCollaboration3: ", Boolean.valueOf(this.g));
        if (!this.e) {
            ReleaseLogUtil.e("R_NotificationCollaborateManager", "packagingReminderHex isJoinHarmonyReminder mIsSuccessGetSmartSwitch is false");
            return false;
        }
        if (!ncp.i() || !this.g) {
            ReleaseLogUtil.e("R_NotificationCollaborateManager", "packagingReminderHex isJoinHarmonyReminder not support");
            return false;
        }
        ReleaseLogUtil.d("R_NotificationCollaborateManager", "packagingReminderHex isJoinHarmonyReminder join success");
        return true;
    }

    public boolean c() {
        return this.f42878a;
    }

    private void g() {
        if (this.j == null) {
            Object systemService = BaseApplication.getContext().getSystemService("keyguard");
            if (systemService instanceof KeyguardManager) {
                this.j = (KeyguardManager) systemService;
            }
        }
        if (this.f == null) {
            Object systemService2 = BaseApplication.getContext().getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.f = (PowerManager) systemService2;
            }
        }
    }

    public boolean i() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotificationCollaborateManager");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("NotificationCollaborateManager", "isSupportNotifyReminderCollaborate deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 33);
    }

    public void d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500010");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: ncg.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("NotificationCollaborateManager", "getSmartSwitch onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (coq.e(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (!coq.d(list)) {
                        String strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "switch_smart_notify_reminder");
                        ReleaseLogUtil.d("R_NotificationCollaborateManager", "getReminderControlSwitch cloudReminderSwitchState=", strA);
                        lzi.a().a(strA);
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        if (ncp.i() && ncg.this.g) {
                            ncg.this.e = true;
                            boolean z = !"0".equals(strA);
                            ReleaseLogUtil.d("R_NotificationCollaborateManager", "getReminderControlSwitch harmony 3.0 cloudSwitchState isChecked:", Boolean.valueOf(z));
                            ncg.this.f42878a = z;
                            LogUtil.a("NotificationCollaborateManager", "saveHarmonyNotificationCollaboration enter");
                            BaseApplication.getContext().getContentResolver().insert(Uri.parse(lsu.f40768c), new ContentValues());
                            return;
                        }
                        ReleaseLogUtil.d("R_NotificationCollaborateManager", "DeviceCommonUtil.isForbidden() is" + coy.a());
                        if (!ncg.b().i() || coy.a() == 1) {
                            return;
                        }
                        LogUtil.a("NotificationCollaborateManager", "getReminderControlSwitch 2.0 cloudReminderSwitchState");
                        ncg.this.d = !"0".equals(strA);
                        ReleaseLogUtil.d("R_NotificationCollaborateManager", "getReminderControlSwitch 2.0 cloudSwitchState mIsRemindLockScreenSwitch=", Boolean.valueOf(ncg.this.d));
                        return;
                    }
                }
                ReleaseLogUtil.d("R_NotificationCollaborateManager", "getReminderControlSwitch failer,begin getOldReminderControlSwitch.");
                ncg.this.a();
            }
        });
    }

    public void a() {
        mhs.a().getSwitchSetting("switch_silent_notify_using_phone", new IBaseResponseCallback() { // from class: ncf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f42875b.a(i, obj);
            }
        });
        mhs.a().getSwitchSetting("switch_smart_notify_reminder", new IBaseResponseCallback() { // from class: nck
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f42882c.c(i, obj);
            }
        });
    }

    /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("NotificationCollaborateManager", "getReminderControlSwitch errorCode:", Integer.valueOf(i));
        if (i == 0) {
            boolean zEquals = obj instanceof String ? true ^ "0".equals(obj) : true;
            LogUtil.a("NotificationCollaborateManager", "getReminderControlSwitch isChecked:", Boolean.valueOf(zEquals));
            this.d = zEquals;
            ReleaseLogUtil.d("R_NotificationCollaborateManager", "getOldReminderControlSwitch mIsRemindLockScreenSwitch=", Boolean.valueOf(zEquals));
            return;
        }
        j();
    }

    /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("NotificationCollaborateManager", "getReminderControlSwitch harmony errorCode:", Integer.valueOf(i));
        if (i != 0) {
            return;
        }
        if (!(obj instanceof String)) {
            LogUtil.a("NotificationCollaborateManager", "getReminderControlSwitch harmony objectData not instanceof String");
            return;
        }
        this.e = true;
        boolean zEquals = true ^ "0".equals(obj);
        LogUtil.a("NotificationCollaborateManager", "getReminderControlSwitch harmony isChecked:", Boolean.valueOf(zEquals));
        this.f42878a = zEquals;
    }

    private void j() {
        mhs.a().getSwitchSetting("lock_screen_reminder_switch", new IBaseResponseCallback() { // from class: ncm
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f42887c.d(i, obj);
            }
        });
    }

    /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("NotificationCollaborateManager", "getReminderOldSwitch errorCode:", Integer.valueOf(i));
        boolean z = i != 0 && ncp.o();
        if (i == 0 && (obj instanceof String)) {
            z = !"0".equals(obj);
            LogUtil.a("NotificationCollaborateManager", "getReminderOldSwitch isChecked:", Boolean.valueOf(z));
        }
        boolean z2 = !z;
        this.d = z2;
        ReleaseLogUtil.d("R_NotificationCollaborateManager", "getReminderOldSwitch mIsRemindLockScreenSwitch=", Boolean.valueOf(z2));
    }
}
