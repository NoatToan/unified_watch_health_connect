package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.NotificationUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class neo {
    private static final Object d = new Object();
    private static neo e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43005a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f43007c;
    private NotificationManager g;
    private DeviceInfo i;
    private Context j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Notification.Builder f43006b = null;
    private Notification h = null;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i) {
        return i == 1 || i == 11;
    }

    private boolean d(int i) {
        return i == 2;
    }

    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "laguage ischange");
            neo.this.j();
        }
    }

    class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null || intent.getAction() == null) {
                LogUtil.j("KeepDeviceNotificationUtil", "NotificationClickReceiver action is null");
                return;
            }
            ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", " action: ", intent.getAction());
            if (intent.getAction().equals("com.huawei.plugin.account.login")) {
                neo.this.e();
                return;
            }
            if (intent.getAction().equals("device_notification_click")) {
                neo neoVar = neo.this;
                if (neoVar.d(neoVar.i)) {
                    neo.this.a();
                    neo.this.d(context);
                    return;
                }
                neo neoVar2 = neo.this;
                if (neoVar2.c(neoVar2.i.getDeviceConnectState())) {
                    neo.this.d(context);
                    if (neo.this.i.getDeviceConnectState() == 1 || CommonUtil.i(BaseApplication.getContext(), "com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity") || CommonUtil.i(BaseApplication.getContext(), "com.huawei.ui.device.activity.agreement.EnhancementImprovementActivity")) {
                        return;
                    }
                    neo.this.i.setDeviceConnectState(3);
                    neo neoVar3 = neo.this;
                    neoVar3.b(neoVar3.i);
                    return;
                }
                neo.this.d(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        mhs.a().getSwitchSetting("device_notification_key", new IBaseResponseCallback() { // from class: neo.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                boolean zEquals = true;
                if (i == 0 && (obj instanceof String)) {
                    zEquals = true ^ "0".equals((String) obj);
                }
                ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "checkLoginStatus: ", Boolean.valueOf(zEquals), "errorCode:", Integer.valueOf(i));
                if (zEquals) {
                    return;
                }
                neo.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context.getPackageName(), packageManager.getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
            intent.putExtra("SHORTCUT", "SC_DEVICE");
            context.startActivity(intent);
        } catch (ActivityNotFoundException | IllegalStateException unused) {
            LogUtil.e("KeepDeviceNotificationUtil", "goHealthApp, exception");
        }
    }

    public static neo b(Context context) {
        neo neoVar;
        synchronized (d) {
            if (e == null) {
                e = new neo(context);
            }
            neoVar = e;
        }
        return neoVar;
    }

    private neo(Context context) {
        if (context == null) {
            LogUtil.j("KeepDeviceNotificationUtil", "KeepDeviceNotificationUtil context is null");
            this.j = BaseApplication.getContext();
        } else {
            this.j = context;
        }
    }

    public void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "deviceInfo is null");
            return;
        }
        if (!a(deviceInfo)) {
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "this is not wear device");
            return;
        }
        if (c(deviceInfo)) {
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "this device is not main device");
            return;
        }
        if (this.i == null) {
            this.i = deviceInfo;
        }
        ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "deviceInfo: ", deviceInfo.getDeviceName(), ",", Integer.valueOf(deviceInfo.getDeviceConnectState()), ", isPairUpdate:", Boolean.valueOf(this.f43005a));
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (c(deviceConnectState) && (d(deviceInfo) || this.f43005a)) {
            return;
        }
        if (a(deviceConnectState)) {
            if (!e(deviceInfo)) {
                return;
            }
            if (d(deviceInfo)) {
                LogUtil.j("KeepDeviceNotificationUtil", "this device is delete");
                a();
                return;
            }
        }
        this.i = deviceInfo;
        e(BaseApplication.getContext());
        j(deviceInfo);
    }

    private boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo.getProductType() == 11) {
            LogUtil.j("KeepDeviceNotificationUtil", "this is not wear device");
            return false;
        }
        int iD = mmx.d(deviceInfo.getProductType()).d();
        return (iD == 6 || iD == 3) ? false : true;
    }

    private void j(DeviceInfo deviceInfo) {
        Notification.Builder builder = this.f43006b;
        if (builder == null) {
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "updateNotificationView, mDeviceBuilder is null");
            return;
        }
        try {
            String strD = d(BaseApplication.getContext(), deviceInfo);
            String strE = e(deviceInfo.getDeviceConnectState());
            builder.setContentTitle(strD);
            builder.setContentText(strE);
            this.h = builder.build();
            nen.d().e(2021126);
            if (this.j instanceof Service) {
                ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "startForeground notify");
                if (PermissionUtil.a()) {
                    ((Service) this.j).startForeground(2021126, this.h, 16);
                    return;
                } else {
                    ((Service) this.j).startForeground(2021126, this.h);
                    return;
                }
            }
            ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "updateNotificationView notify");
            nen.d().c(2021126, this.h);
        } catch (Exception e2) {
            ReleaseLogUtil.a("DEVMGR_KeepDeviceNotificationUtil", "updateNotificationView Exception ", ExceptionUtils.c(e2));
        }
    }

    public void c(String str, DeviceInfo deviceInfo) {
        if (TextUtils.isEmpty(str)) {
            i(deviceInfo);
            return;
        }
        if (str.equalsIgnoreCase("1")) {
            i();
            return;
        }
        if (str.equalsIgnoreCase("0")) {
            a();
        } else if (str.equals(String.valueOf(true))) {
            this.f43005a = true;
        } else if (str.equals(String.valueOf(false))) {
            this.f43005a = false;
        }
    }

    private void i(DeviceInfo deviceInfo) {
        if (nzz.c()) {
            if (this.f43006b == null || this.h == null) {
                ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "updateNotifyState, mBuilder or mDeviceNotification is null");
                return;
            }
            if (deviceInfo == null || this.i == null) {
                ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "updateNotifyState, deleteDeviceInfo is null");
                return;
            }
            if (c(deviceInfo)) {
                ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "updateNotifyState, this device is not main device");
                return;
            }
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            String deviceIdentify2 = this.i.getDeviceIdentify();
            if (d(this.i) || deviceIdentify.equalsIgnoreCase(deviceIdentify2)) {
                ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "updateNotifyState, cancel notify");
                a();
            }
        }
    }

    private void i() {
        ArrayList<DeviceInfo> arrayList = new ArrayList(16);
        arrayList.addAll(ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "KeepDeviceNotificationUtil"));
        if (njy.e(arrayList)) {
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "app not has wearDevice");
            return;
        }
        Collections.sort(arrayList, new Comparator<DeviceInfo>() { // from class: neo.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
                if (deviceInfo == null || deviceInfo2 == null) {
                    return 1;
                }
                return Long.compare(deviceInfo2.getLastConnectedTime(), deviceInfo.getLastConnectedTime());
            }
        });
        for (DeviceInfo deviceInfo : arrayList) {
            if (!c(deviceInfo)) {
                if (a(deviceInfo)) {
                    b(deviceInfo);
                    return;
                }
                return;
            }
        }
    }

    public void a() {
        ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "closeDeviceNotification()");
        Context context = this.j;
        if (context instanceof Service) {
            ((Service) context).stopForeground(true);
        }
        nen.d().e(2021126);
        this.f43006b = null;
        this.h = null;
        this.i = null;
    }

    private boolean c(DeviceInfo deviceInfo) {
        String relationship = deviceInfo.getRelationship();
        if (!TextUtils.isEmpty(relationship) && "followed_relationship".equals(deviceInfo.getRelationship())) {
            if (eel.d(deviceInfo.getProductType())) {
                return false;
            }
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "isOtherDevice: ", relationship);
            return true;
        }
        if (mkl.d().a(deviceInfo.getProductType())) {
            ReleaseLogUtil.e("DEVMGR_KeepDeviceNotificationUtil", "this device is relation ship");
            return true;
        }
        ReleaseLogUtil.d("DEVMGR_KeepDeviceNotificationUtil", "isOtherDevice: ", relationship);
        return false;
    }

    private boolean a(int i) {
        return (c(i) || d(i)) ? false : true;
    }

    private String e(int i) {
        if (d(i)) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_wearhome_connected);
        }
        if (c(i)) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_device_connecting_21);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_device_wear_device_disconnect);
    }

    private void e(Context context) {
        if (this.f43006b == null) {
            b();
            Intent intentA = NotificationUtil.a(context);
            intentA.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
            Notification.Builder ongoing = nen.d().c().setSmallIcon(R.drawable.healthlogo_ic_notification).setShowWhen(true).setAutoCancel(false).setContentIntent(PendingIntent.getActivity(context, 1001, intentA, 335544320)).setPriority(0).setOngoing(true);
            this.f43006b = ongoing;
            ongoing.setGroup("KeepDeviceNotificationUtil");
        }
        this.f43006b.setWhen(System.currentTimeMillis()).setTimeoutAfter(14400000L);
    }

    private String d(Context context, DeviceInfo deviceInfo) {
        if (context == null || deviceInfo == null) {
            LogUtil.j("KeepDeviceNotificationUtil", "getTitle, context is null");
            return "";
        }
        String deviceName = deviceInfo.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            return mmx.d(deviceInfo.getProductType()).b();
        }
        return ((TextUtils.isEmpty(deviceName) || !TextUtils.equals(deviceName, "PORSCHE DESIGN")) && (TextUtils.isEmpty(deviceInfo.getDeviceModel()) || !TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) ? deviceName : "PORSCHE DESIGN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("KeepDeviceNotificationUtil", "updateNotifyState, mDeviceInfo is null");
            return true;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "KeepDeviceNotificationUtil");
        if (njy.e(deviceList)) {
            LogUtil.j("KeepDeviceNotificationUtil", "deviceInfos is null");
            return true;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            if (deviceIdentify.equalsIgnoreCase(it.next().getDeviceIdentify())) {
                return false;
            }
        }
        return true;
    }

    private boolean e(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfo2 = this.i;
        if (deviceInfo2 == null) {
            return false;
        }
        if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            return true;
        }
        LogUtil.j("KeepDeviceNotificationUtil", "this is not current device");
        return false;
    }

    private void b() {
        try {
            BroadcastManager.c(new e());
            this.f43007c = new b();
            IntentFilter intentFilter = new IntentFilter("device_notification_click");
            intentFilter.addAction("com.huawei.plugin.account.login");
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.f43007c, intentFilter, LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e("KeepDeviceNotificationUtil", "registerReceiver is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.g == null) {
            NotificationManager notificationManagerL = CommonUtils.l();
            this.g = notificationManagerL;
            if (notificationManagerL == null) {
                LogUtil.j("KeepDeviceNotificationUtil", "updateNotifyLanguage, mManager is null");
                return;
            }
        }
        if (this.i == null) {
            LogUtil.j("KeepDeviceNotificationUtil", "current device is null");
            return;
        }
        StatusBarNotification[] activeNotifications = this.g.getActiveNotifications();
        if (activeNotifications == null) {
            LogUtil.j("KeepDeviceNotificationUtil", "activeNotifications is null");
            return;
        }
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getId() == 2021126) {
                j(this.i);
                return;
            }
        }
    }

    public void c() {
        a();
        d();
        try {
            BroadcastManager.l(new e());
            BaseApplication.getContext().unregisterReceiver(this.f43007c);
        } catch (IllegalArgumentException unused) {
            LogUtil.j("KeepDeviceNotificationUtil", "onDestroy is exception");
        }
    }

    private static void d() {
        synchronized (d) {
            e = null;
        }
    }
}
