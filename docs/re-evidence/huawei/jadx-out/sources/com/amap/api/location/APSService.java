package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amap.api.col.p0003sl.f;
import com.amap.api.col.p0003sl.jt;
import com.autonavi.aps.amapapi.utils.c;

/* JADX INFO: loaded from: classes4.dex */
public class APSService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f3352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3353b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f3354c = false;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f3352a.a(intent);
        } catch (Throwable th) {
            c.a(th, "APSService", "onBind");
            return null;
        }
    }

    private void a(Context context) {
        try {
            if (this.f3352a == null) {
                this.f3352a = new f(context);
            }
            this.f3352a.a();
        } catch (Throwable th) {
            c.a(th, "APSService", "onCreate");
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onCreate() {
        a(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(jt.f, 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, 0);
                    Notification notification = (Notification) intent.getParcelableExtra("h");
                    if (intExtra2 != 0 && notification != null) {
                        startForeground(intExtra2, notification);
                        this.f3354c = true;
                        this.f3353b++;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra("j", true) && (i3 = this.f3353b) > 0) {
                        this.f3353b = i3 - 1;
                    }
                    if (this.f3353b <= 0) {
                        stopForeground(true);
                        this.f3354c = false;
                    } else {
                        stopForeground(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        try {
            return this.f3352a.b();
        } catch (Throwable th) {
            c.a(th, "APSService", "onStartCommand");
            return super.onStartCommand(intent, i, i2);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f3352a.c();
            if (this.f3354c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            c.a(th, "APSService", "onDestroy");
        }
        super.onDestroy();
    }
}
