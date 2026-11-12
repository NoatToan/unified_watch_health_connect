package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.autonavi.aps.amapapi.utils.c;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.vrs;

/* JADX INFO: loaded from: classes4.dex */
public class APSService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    vrs f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6386b = 0;
    boolean c = false;

    private void a(Context context) {
        try {
            if (this.f6385a == null) {
                this.f6385a = new vrs(context);
            }
            this.f6385a.b();
        } catch (Throwable th) {
            c.a(th, "APSService", "onCreate");
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f6385a.a(intent);
        } catch (Throwable th) {
            c.a(th, "APSService", "onBind");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f6385a.d();
            if (this.c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            c.a(th, "APSService", LifecycleConstantKt.ON_DESTROY);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(PluginDeviceInfo.FLOCALIZATIONS, 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra("i", 0);
                    Notification notification = (Notification) intent.getParcelableExtra("h");
                    if (intExtra2 != 0 && notification != null) {
                        startForeground(intExtra2, notification);
                        this.c = true;
                        this.f6386b++;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra("j", true) && (i3 = this.f6386b) > 0) {
                        this.f6386b = i3 - 1;
                    }
                    if (this.f6386b <= 0) {
                        stopForeground(true);
                        this.c = false;
                    } else {
                        stopForeground(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        try {
            return this.f6385a.c();
        } catch (Throwable th) {
            c.a(th, "APSService", "onStartCommand");
            return super.onStartCommand(intent, i, i2);
        }
    }
}
