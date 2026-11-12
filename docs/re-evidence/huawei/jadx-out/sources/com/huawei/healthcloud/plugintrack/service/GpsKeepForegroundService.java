package com.huawei.healthcloud.plugintrack.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsb;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class GpsKeepForegroundService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSportingNotificationHelper f10622b;
    private Map<String, d> e = new HashMap();
    private LinkedList<String> d = new LinkedList<>();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("Track_GpsKeepForegroundService", "GpsKeepForegroundService onCreate");
        try {
            startForeground(20200523, lsb.d().c().build());
        } catch (Exception e) {
            ReleaseLogUtil.e("Track_GpsKeepForegroundService", "startForeground error exception ", LogAnonymous.b(e));
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (c(intent)) {
            LogUtil.j("Track_GpsKeepForegroundService", "start fail wrong input");
            return 2;
        }
        String stringExtra = intent.getStringExtra("id");
        if (e(intent) && !this.d.contains(stringExtra) && "HwGpsLocationManager".equals(stringExtra)) {
            LogUtil.a("Track_GpsKeepForegroundService", "not exists HwGpsLocationManager info, should not to stop");
            return 2;
        }
        if (!a(intent)) {
            LogUtil.j("Track_GpsKeepForegroundService", "start fail");
            stopSelf(i2);
            return 2;
        }
        if (this.d.isEmpty()) {
            LogUtil.a("Track_GpsKeepForegroundService", "stop success");
            stopSelf();
            return 2;
        }
        if (!e(intent)) {
            a();
            LogUtil.a("Track_GpsKeepForegroundService", "is Not To Stop createDefaultNotification");
        }
        LogUtil.a("Track_GpsKeepForegroundService", "onStartCommand");
        return 2;
    }

    private boolean c(Intent intent) {
        return (intent != null && intent.hasExtra("stringKey") && intent.hasExtra("id")) ? false : true;
    }

    private void a() {
        try {
            Notification notificationA = a(this.e.get(this.d.getLast()).b());
            lsb.d().c(20200523, notificationA);
            startForeground(20200523, notificationA);
        } catch (Exception e) {
            ReleaseLogUtil.e("Track_GpsKeepForegroundService", "startForeground error exception ", LogAnonymous.b(e));
        }
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            String string = BaseApplication.getContext().getString(intent.getIntExtra("stringKey", 0));
            d dVar = new d(string);
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(stringExtra)) {
                LogUtil.e("Track_GpsKeepForegroundService", "wrong input");
                return false;
            }
            if (e(intent)) {
                this.e.remove(stringExtra);
                this.d.remove(stringExtra);
            } else {
                this.d.remove(stringExtra);
                this.d.add(stringExtra);
                this.e.put(stringExtra, dVar);
            }
            LogUtil.a("Track_GpsKeepForegroundService", "id ", stringExtra, "mIds ", this.d.toString());
            return true;
        } catch (Resources.NotFoundException e) {
            LogUtil.e("Track_GpsKeepForegroundService", "String NotFoundException", e.toString());
            return false;
        }
    }

    private boolean e(Intent intent) {
        return intent.getBooleanExtra("isStop", false);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        lsb.d().e(20200523);
        lsb.d().e(10012);
        HealthSportingNotificationHelper healthSportingNotificationHelper = this.f10622b;
        if (healthSportingNotificationHelper != null) {
            healthSportingNotificationHelper.e();
            this.f10622b = null;
        }
        ReleaseLogUtil.d("Track_GpsKeepForegroundService", "GpsKeepForegroundService onDestroy");
    }

    private Notification a(String str) {
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setContentIntent(e());
        builderC.setOngoing(true);
        builderC.setAutoCancel(false);
        lsb.d().c(builderC);
        if (str != null) {
            builderC.setContentText(str);
            builderC.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        return builderC.build();
    }

    private PendingIntent e() {
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

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10623c;

        public d(String str) {
            this.f10623c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f10623c;
        }
    }
}
