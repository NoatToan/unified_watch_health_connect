package com.xiaomi.fitness.share.mapbox;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.video.share.util.DownloadMusicUtil;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import defpackage.axi;
import defpackage.bhl;
import defpackage.j1j;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 21)
public class ScreenRecorderService extends Service {
    public static String h = "STOP";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f12876b;
    public String c;
    public MediaProjectionManager d;
    public MediaProjection e;
    public Handler f = new Handler(Looper.getMainLooper());
    public Runnable g = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreenRecorderService.this.stopForeground(true);
            ScreenRecorderService.this.stopSelf();
        }
    }

    public final void a() {
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(getPackageName(), KeepAliveService.MAIN_ACTIVITY));
        builder.setContentIntent(PendingIntentExtKt.getActivityPendingIntent(this, 0, intent, 0)).setSmallIcon(axi.f3541a).setContentText(AppUtil.getApp().getString(j1j.qa)).setWhen(System.currentTimeMillis());
        int i = Build.VERSION.SDK_INT;
        builder.setChannelId("notification_id");
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("notification_id", "notification_name", 2));
        builder.setGroup("com.mi.health");
        builder.setOngoing(true);
        Notification notificationBuild = builder.build();
        notificationBuild.defaults = 1;
        if (i >= 29) {
            startForeground(110, notificationBuild, 32);
        } else {
            startForeground(110, notificationBuild);
        }
    }

    public final void b() {
        this.f.post(this.g);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        Logger.e("TAG", LifecycleConstantKt.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if (intent.getBooleanExtra(h, false)) {
                b();
            } else {
                a();
                this.f12875a = intent.getIntExtra("code", -1);
                this.f12876b = (Intent) intent.getParcelableExtra("data");
                this.c = intent.getStringExtra(DownloadMusicUtil.appUpgradeDirectory);
                MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
                this.d = mediaProjectionManager;
                int i3 = this.f12875a;
                Intent intent2 = this.f12876b;
                Objects.requireNonNull(intent2);
                this.e = mediaProjectionManager.getMediaProjection(i3, intent2);
                bhl.q(null).A(this.e, this.c);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
