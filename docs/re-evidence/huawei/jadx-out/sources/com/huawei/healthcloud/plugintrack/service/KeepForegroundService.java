package com.huawei.healthcloud.plugintrack.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.lsb;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class KeepForegroundService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSportingNotificationHelper f10624b;
    private Map<String, e> e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<String> f10625c = new LinkedList<>();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("Track_KeepForegroundService", "KeepForegroundService onCreate");
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(20200523, lsb.d().c().build(), 8);
            } else {
                startForeground(20200523, lsb.d().c().build());
            }
        } catch (Exception e2) {
            ReleaseLogUtil.e("Track_KeepForegroundService", "startForeground error exception ", LogAnonymous.b(e2));
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (b(intent)) {
            LogUtil.j("Track_KeepForegroundService", "start fail wrong input");
            return 2;
        }
        String stringExtra = intent.getStringExtra("id");
        if (d(intent) && !this.f10625c.contains(stringExtra) && "HwGpsLocationManager".equals(stringExtra)) {
            LogUtil.a("Track_KeepForegroundService", "not exists HwGpsLocationManager info, should not to stop");
            return 2;
        }
        if (!c(intent)) {
            LogUtil.j("Track_KeepForegroundService", "start fail");
            stopSelf(i2);
            return 2;
        }
        if (this.f10625c.isEmpty()) {
            LogUtil.a("Track_KeepForegroundService", "stop success");
            stopSelf();
            return 2;
        }
        if (a(intent) && !d(intent)) {
            lsb.d().e(10012);
            e(intent);
            LogUtil.a("Track_KeepForegroundService", "is Not To Stop createSportNotification");
        } else {
            b();
            LogUtil.a("Track_KeepForegroundService", "is Not To Stop createDefaultNotification");
        }
        LogUtil.a("Track_KeepForegroundService", "onStartCommand");
        return 2;
    }

    private boolean b(Intent intent) {
        return (intent != null && intent.hasExtra("stringKey") && intent.hasExtra("id")) ? false : true;
    }

    private boolean a(Intent intent) {
        return intent != null && intent.getIntExtra("NOTIFICATION_TYPE", 0) == 1;
    }

    private void b() {
        Notification notificationB = b(this.e.get(this.f10625c.getLast()).c());
        lsb.d().c(20200523, notificationB);
        startForeground(20200523, notificationB);
    }

    private void e(Intent intent) {
        boolean booleanExtra;
        boolean z;
        boolean z2;
        int intExtra = 258;
        if (intent != null) {
            intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, 258);
            boolean booleanExtra2 = intent.getBooleanExtra("isFromTreadmill", false);
            boolean booleanExtra3 = intent.getBooleanExtra("isNeedControlAction", false);
            booleanExtra = intent.getBooleanExtra("isSportFromWear", false);
            z = booleanExtra2;
            z2 = booleanExtra3;
        } else {
            booleanExtra = false;
            z = false;
            z2 = false;
        }
        HealthSportingNotificationHelper healthSportingNotificationHelper = new HealthSportingNotificationHelper(BaseApplication.getContext(), intExtra, true, z, false);
        this.f10624b = healthSportingNotificationHelper;
        healthSportingNotificationHelper.e(z2);
        this.f10624b.a(booleanExtra);
        Bundle bundle = new Bundle();
        bundle.putInt(BleConstants.SPORT_TYPE, intExtra);
        bundle.putString("duration", UnitUtil.e(0));
        bundle.putString("bundle_key_service", UnitUtil.e(0));
        this.f10624b.updateSportViewFragment(bundle);
        startForeground(10012, lsb.d().c().build());
    }

    private boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            String string = BaseApplication.getContext().getString(intent.getIntExtra("stringKey", 0));
            e eVar = new e(string);
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(stringExtra)) {
                LogUtil.e("Track_KeepForegroundService", "wrong input");
                return false;
            }
            if (d(intent)) {
                this.e.remove(stringExtra);
                this.f10625c.remove(stringExtra);
            } else {
                this.f10625c.remove(stringExtra);
                this.f10625c.add(stringExtra);
                this.e.put(stringExtra, eVar);
            }
            LogUtil.a("Track_KeepForegroundService", "id ", stringExtra, "mIds ", this.f10625c.toString());
            return true;
        } catch (Resources.NotFoundException e2) {
            LogUtil.e("Track_KeepForegroundService", "String NotFoundException", e2.toString());
            return false;
        }
    }

    private boolean d(Intent intent) {
        return intent.getBooleanExtra("isStop", false);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        lsb.d().e(20200523);
        lsb.d().e(10012);
        HealthSportingNotificationHelper healthSportingNotificationHelper = this.f10624b;
        if (healthSportingNotificationHelper != null) {
            healthSportingNotificationHelper.e();
            this.f10624b = null;
        }
        ReleaseLogUtil.d("Track_KeepForegroundService", "KeepForegroundService onDestroy");
    }

    private Notification b(String str) {
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setContentIntent(c());
        builderC.setOngoing(true);
        builderC.setAutoCancel(false);
        lsb.d().c(builderC);
        if (str != null) {
            builderC.setContentText(str);
            builderC.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        return builderC.build();
    }

    private PendingIntent c() {
        Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(BaseApplication.getAppPackage());
        if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
            return PendingIntent.getActivity(getApplicationContext(), 0, new Intent().setPackage(BaseApplication.getAppPackage()), 201326592);
        }
        launchIntentForPackage.setComponent(new ComponentName(BaseApplication.getAppPackage(), launchIntentForPackage.getComponent().getClassName()));
        launchIntentForPackage.setAction("android.intent.action.MAIN");
        launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        launchIntentForPackage.setFlags(268435456);
        launchIntentForPackage.putExtra("mLaunchSource", 5);
        return PendingIntent.getActivity(getApplicationContext(), 0, launchIntentForPackage, 201326592);
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10626a;

        public e(String str) {
            this.f10626a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f10626a;
        }
    }
}
