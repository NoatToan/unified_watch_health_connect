package com.xiaomi.fitness.sport_manager.location;

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
import com.xiaomi.fitness.sport_manager.sensor.SportFuncRequest;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorManager;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.aje;
import defpackage.dzc;
import defpackage.g1j;
import defpackage.upn;
import defpackage.ywi;
import defpackage.yyc;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportService extends Service implements yyc, dzc {
    public static String j = "com.xiaomi.wearable-location";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f13187k = 110;
    public static final long l = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationManager f13188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public upn f13189b;
    public boolean c;
    public boolean d;
    public boolean e;
    public SportSensorManager f;
    public int g;
    public Handler h = new Handler(Looper.getMainLooper());
    public Runnable i = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FitnessLogUtils.i("SportService", "runnable.run");
            SportService.this.stopForeground(true);
            if (SportService.this.f13189b != null && SportService.this.c) {
                SportService.this.f13189b.i();
            }
            if (SportService.this.f != null) {
                SportService.this.f.pauseOrStopSensor(4);
                SportService.this.f = null;
            }
            SportService.this.stopSelf();
        }
    }

    private void j() {
        upn upnVar = this.f13189b;
        if (upnVar != null && this.c) {
            upnVar.i();
        }
        SportSensorManager sportSensorManager = this.f;
        if (sportSensorManager != null) {
            sportSensorManager.pauseOrStopSensor(this.g);
        }
    }

    @Override // defpackage.dzc
    public void b(SportSensorResult sportSensorResult) {
        Intent intent = new Intent("sport_sensor_update_broadcast");
        intent.putExtra("sport_update_sendor", sportSensorResult);
        aje.b(getApplicationContext()).d(intent);
    }

    public final Notification f(Context context) {
        context.getPackageName();
        i(context).createNotificationChannel(new NotificationChannel(j, getString(g1j.i), 4));
        Notification.Builder builder = new Notification.Builder(context, j);
        return builder.setSmallIcon(ywi.f40644a).setContentTitle(context.getString(g1j.f18470a)).setContentText(context.getString(g1j.j)).setAutoCancel(true).setOngoing(true).setGroup("com.mi.health").build();
    }

    public final boolean g(String str) {
        return checkSelfPermission(str) == 0;
    }

    public final void h() {
        FitnessLogUtils.i("SportService", "delayStop");
        this.h.postDelayed(this.i, 500L);
    }

    public final NotificationManager i(Context context) {
        if (this.f13188a == null) {
            this.f13188a = (NotificationManager) context.getSystemService("notification");
        }
        return this.f13188a;
    }

    public final void k(int i, SportFuncRequest sportFuncRequest) {
        FitnessLogUtils.i("SportService", StatConstants.PARAM_START);
        if (sportFuncRequest == null) {
            FitnessLogUtils.w("SportService", "sportFuncRequest is null");
            return;
        }
        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
        this.c = fitnessSportTypeUtils.supportGpsSport(i);
        this.d = fitnessSportTypeUtils.supportSensorSport(i);
        this.e = fitnessSportTypeUtils.supportStepSensorSport(i);
        l();
        if (this.f13189b == null && this.c) {
            this.f13189b = new upn(this, l, new yyc() { // from class: f0o
                @Override // defpackage.yyc
                public final void onLocationChanged(SportLocationResult sportLocationResult) {
                    this.f17269a.onLocationChanged(sportLocationResult);
                }
            });
        }
        if (this.c && sportFuncRequest.f13197a) {
            this.f13189b.h();
        }
        if (this.f == null) {
            this.f = new SportSensorManager(this);
        }
        if (this.e && sportFuncRequest.f13198b) {
            this.f.startGymSensor();
        }
        if ((this.e || i == 6) && sportFuncRequest.f13198b && this.g == 1) {
            this.f.startStepSensor();
        }
        if ((this.d || i == 6) && sportFuncRequest.c && this.g == 1) {
            this.f.startAccSensor(3);
        }
        if (this.d && sportFuncRequest.c && this.g == 3) {
            this.f.restartAccSensor();
        }
        this.h.removeCallbacksAndMessages(null);
    }

    public final void l() {
        try {
            if (Build.VERSION.SDK_INT < 34) {
                startForeground(f13187k, f(this));
                return;
            }
            int i = g("android.permission.BLUETOOTH_CONNECT") ? 16 : 0;
            if (g("android.permission.ACCESS_FINE_LOCATION")) {
                i |= 8;
            }
            if (g("android.permission.ACTIVITY_RECOGNITION")) {
                i |= 256;
            }
            FitnessLogUtils.i("SportService", "startForeground serviceType = " + i);
            startForeground(f13187k, f(this), i);
        } catch (Throwable th) {
            FitnessLogUtils.i("SportService", "startForeground exception", th);
        }
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
        upn upnVar = this.f13189b;
        if (upnVar != null && this.c) {
            upnVar.i();
        }
        SportSensorManager sportSensorManager = this.f;
        if (sportSensorManager != null) {
            sportSensorManager.pauseOrStopSensor(4);
            this.f = null;
        }
        this.h.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.yyc
    public void onLocationChanged(SportLocationResult sportLocationResult) {
        Intent intent = new Intent("sport_location_update_broadcast");
        intent.putExtra("sport_update_location", sportLocationResult);
        aje.b(getApplicationContext()).d(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        FitnessLogUtils.i("SportService", "onStartCommand");
        if (intent == null) {
            return 2;
        }
        int intExtra = intent.getIntExtra("EXTRA_SPORT_TYPE_KEY", 0);
        this.g = intent.getIntExtra("EXTRA_SPORT_STATE_KEY", 0);
        SportFuncRequest sportFuncRequest = (SportFuncRequest) intent.getParcelableExtra("EXTRA_SPORT_FUNCTION");
        if (1 == intent.getIntExtra("EXTRA_KEY", 0)) {
            h();
        } else if (2 == intent.getIntExtra("EXTRA_KEY", 0)) {
            k(intExtra, sportFuncRequest);
        } else if (3 == intent.getIntExtra("EXTRA_KEY", 0)) {
            FitnessLogUtils.i("SportService", "pre_start");
        } else if (4 == intent.getIntExtra("EXTRA_KEY", 0)) {
            j();
        } else if (5 == intent.getIntExtra("EXTRA_KEY", 0)) {
            SportSensorManager sportSensorManager = this.f;
            if (sportSensorManager != null) {
                sportSensorManager.startAccSensor(intent.getIntExtra("EXTRA_ACC_KEY", 3));
            }
            l();
        }
        return 2;
    }
}
