package com.xiaomi.fitness.sport_eco_manager.location;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportFuncRequest;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.aje;
import defpackage.c0o;
import defpackage.ezc;
import defpackage.f1j;
import defpackage.xwi;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportService extends Service implements ezc {
    public static int h = 110;
    public static final long i = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationManager f13144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13145b;
    public boolean c;
    public c0o d;
    public int e;
    public Handler f = new Handler(Looper.getMainLooper());
    public Runnable g = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FitnessLogUtils.i("SportService", "runnable.run");
            SportService.this.stopForeground(true);
            if (SportService.this.d != null) {
                SportService.this.d.m(4);
                SportService.this.d = null;
            }
            SportService.this.stopSelf();
        }
    }

    @Override // defpackage.ezc
    public void a(SportSensorResult sportSensorResult) {
        Intent intent = new Intent("sport_sensor_update_broadcast");
        intent.putExtra("sport_update_sendor", sportSensorResult);
        aje.b(getApplicationContext()).d(intent);
    }

    public final Notification d(Context context) {
        context.getPackageName();
        g(context).createNotificationChannel(new NotificationChannel("com.xiaomi.wearable-location", getString(f1j.c), 4));
        Notification.Builder builder = new Notification.Builder(context, "com.xiaomi.wearable-location");
        return builder.setSmallIcon(xwi.f39534a).setContentTitle(context.getString(f1j.f17292a)).setContentText(context.getString(f1j.d)).setAutoCancel(true).setGroup("com.mi.health").build();
    }

    public final boolean e(String str) {
        return checkSelfPermission(str) == 0;
    }

    public final void f() {
        FitnessLogUtils.i("SportService", "delayStop");
        this.f.postDelayed(this.g, 500L);
    }

    public final NotificationManager g(Context context) {
        if (this.f13144a == null) {
            this.f13144a = (NotificationManager) context.getSystemService("notification");
        }
        return this.f13144a;
    }

    public final void h() {
        c0o c0oVar = this.d;
        if (c0oVar != null) {
            c0oVar.m(this.e);
        }
    }

    public final void i(int i2, SportFuncRequest sportFuncRequest) {
        FitnessLogUtils.i("SportService", StatConstants.PARAM_START);
        if (sportFuncRequest == null) {
            FitnessLogUtils.w("SportService", "sportFuncRequest is null");
            return;
        }
        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
        this.f13145b = fitnessSportTypeUtils.supportSensorSport(i2);
        this.c = fitnessSportTypeUtils.supportStepSensorSport(i2);
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(h, d(this), e("android.permission.BLUETOOTH_CONNECT") ? 16 : 0);
        } else {
            startForeground(h, d(this));
        }
        if (this.d == null) {
            this.d = new c0o(this);
        }
        if (this.c && sportFuncRequest.f13153b) {
            this.d.q();
        }
        if (this.c && sportFuncRequest.f13153b && this.e == 1) {
            this.d.r();
        }
        if (this.f13145b && sportFuncRequest.c && this.e == 1) {
            this.d.p(3);
        }
        if (this.f13145b && sportFuncRequest.c && this.e == 3) {
            this.d.n();
        }
        this.f.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    @SuppressLint({"MissingPermission"})
    public void onCreate() {
        FitnessLogUtils.i("SportService", "onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        FitnessLogUtils.i("SportService", LifecycleConstantKt.ON_DESTROY);
        c0o c0oVar = this.d;
        if (c0oVar != null) {
            c0oVar.m(4);
            this.d = null;
        }
        this.f.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        c0o c0oVar;
        FitnessLogUtils.i("SportService", "onStartCommand");
        if (intent == null) {
            return 2;
        }
        int intExtra = intent.getIntExtra("EXTRA_SPORT_TYPE_KEY", 0);
        this.e = intent.getIntExtra("EXTRA_SPORT_STATE_KEY", 0);
        SportFuncRequest sportFuncRequest = (SportFuncRequest) intent.getParcelableExtra("EXTRA_SPORT_FUNCTION");
        if (1 == intent.getIntExtra("EXTRA_KEY", 0)) {
            f();
        } else if (2 == intent.getIntExtra("EXTRA_KEY", 0)) {
            i(intExtra, sportFuncRequest);
        } else if (3 == intent.getIntExtra("EXTRA_KEY", 0)) {
            FitnessLogUtils.i("SportService", "pre_start");
        } else if (4 == intent.getIntExtra("EXTRA_KEY", 0)) {
            h();
        } else if (5 == intent.getIntExtra("EXTRA_KEY", 0) && (c0oVar = this.d) != null) {
            c0oVar.p(intent.getIntExtra("EXTRA_ACC_KEY", 3));
        }
        return 2;
    }
}
