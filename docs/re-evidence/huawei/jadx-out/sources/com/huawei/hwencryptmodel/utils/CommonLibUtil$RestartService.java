package com.huawei.hwencryptmodel.utils;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsb;

/* JADX INFO: loaded from: classes2.dex */
public class CommonLibUtil$RestartService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f17565a;
    private final Handler d = new Handler(Looper.getMainLooper());

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("CommonLibUtil", "RestartService onCreate");
        startForeground(20251013, c());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("CommonLibUtil", "onStartCommand", intent);
        Runnable runnable = this.f17565a;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: nja
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        };
        this.f17565a = runnable2;
        this.d.postDelayed(runnable2, 100L);
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    public /* synthetic */ void d() {
        try {
            try {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage == null) {
                    LogUtil.e("CommonLibUtil", "Launch intent is null");
                } else {
                    launchIntentForPackage.addFlags(268468224);
                    startActivity(launchIntentForPackage);
                }
            } catch (SecurityException e) {
                LogUtil.e("CommonLibUtil", "Background activity start blocked", e);
            }
        } finally {
            stopForeground(true);
            stopSelf();
        }
    }

    private Notification c() {
        return lsb.d().c().build();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.f17565a;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
        }
        LogUtil.a("CommonLibUtil", "RestaryService destroyed");
    }
}
