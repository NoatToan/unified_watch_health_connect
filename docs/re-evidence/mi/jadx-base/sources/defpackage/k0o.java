package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.sport_manager.location.SportService;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorManager;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class k0o extends kc2 implements OnDeviceStatusListener {
    public final Intent e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public a h;
    public b i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23307k;
    public dzc l;
    public boolean m;

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            intent.getAction();
            k0o.this.f((SportLocationResult) intent.getSerializableExtra("sport_update_location"));
        }

        public a() {
        }
    }

    public class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k0o.this.g((SportSensorResult) intent.getParcelableExtra("sport_update_sendor"));
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0o(long j, yyc yycVar, dzc dzcVar) {
        super(j, yycVar);
        this.m = false;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(true);
        this.e = new Intent(AppUtil.getApp(), (Class<?>) SportService.class);
        this.h = new a();
        this.i = new b();
        this.l = dzcVar;
        FitnessLogUtils.d("SportLocationClient", "SportServiceClient 构造");
    }

    private void j() {
        if (this.e != null) {
            FitnessLogUtils.i("SportServiceClient", "stop sport service");
            this.e.putExtra("EXTRA_KEY", 1);
            this.e.putExtra("EXTRA_SPORT_STATE_KEY", this.f23307k);
            try {
                this.f23704a.startService(this.e);
                this.g.set(true);
                this.f.set(false);
                this.m = false;
            } catch (Exception unused) {
            }
            aje.b(this.f23704a).e(this.h);
            aje.b(this.f23704a).e(this.i);
        }
    }

    public void d(int i) {
        if (this.m) {
            FitnessLogUtils.i("SportServiceClient", "changeAccRate");
            Intent intent = this.e;
            if (intent != null) {
                intent.putExtra("EXTRA_KEY", 5);
                this.e.putExtra("EXTRA_ACC_KEY", i);
                try {
                    if (Build.VERSION.SDK_INT >= 34) {
                        this.f23704a.startService(this.e);
                    } else {
                        this.f23704a.startForegroundService(this.e);
                    }
                } catch (Throwable th) {
                    FitnessLogUtils.i("SportServiceClient", "changeAccRate  fail", th);
                }
            }
        }
    }

    public void e() {
        if (this.g.get()) {
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "destroy");
        onSportFinished(false, null, null);
    }

    public final void f(SportLocationResult sportLocationResult) {
        if (this.c == null) {
            return;
        }
        if (sportLocationResult == null) {
            FitnessLogUtils.w("SportServiceClient", "locationResult is null");
        } else {
            FitnessLogUtils.d("SportServiceClient", "notifyLocationChanged");
            this.c.onLocationChanged(sportLocationResult);
        }
    }

    public final void g(SportSensorResult sportSensorResult) {
        if (this.l == null) {
            return;
        }
        if (sportSensorResult == null) {
            FitnessLogUtils.w("SportServiceClient", "sensorResult is null");
            return;
        }
        FitnessLogUtils.d("SportServiceClient", "sensorResult : " + sportSensorResult.toString());
        this.l.b(sportSensorResult);
    }

    public final void h() {
        if (this.e == null || !this.f.get()) {
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "pause step and location");
        this.f.set(false);
        this.e.putExtra("EXTRA_KEY", 4);
        this.e.putExtra("EXTRA_SPORT_STATE_KEY", this.f23307k);
        try {
            this.m = false;
            this.f23704a.startService(this.e);
        } catch (Exception unused) {
        }
    }

    public final void i(boolean z) {
        if ((!FitnessSportTypeUtils.INSTANCE.supportGpsSport(this.j) && f2o.x().K() == 1) || this.e == null || this.d == null || this.f.get()) {
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "startService");
        this.f.set(true);
        this.g.set(false);
        if (z) {
            this.m = true;
            this.e.putExtra("EXTRA_KEY", 2);
            this.e.putExtra("EXTRA_SPORT_TYPE_KEY", this.j);
            this.e.putExtra("EXTRA_SPORT_STATE_KEY", this.f23307k);
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SPORT_FUNCTION", this.d);
            this.e.putExtras(bundle);
            if (this.f23307k == 1) {
                aje.b(this.f23704a).c(this.h, new IntentFilter("sport_location_update_broadcast"));
                aje.b(this.f23704a).c(this.i, new IntentFilter("sport_sensor_update_broadcast"));
            }
        } else {
            this.e.putExtra("EXTRA_KEY", 3);
        }
        try {
            this.f23704a.startForegroundService(this.e);
        } catch (Throwable th) {
            FitnessLogUtils.i("SportServiceClient", "startService  fail", th);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(String str, int i, int i2) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(String str) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(String str) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(String str) {
        j();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr, FinishSportData finishSportData) {
        this.f23307k = 4;
        SportSensorManager.pauseStep = 0;
        j();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.f23307k = 2;
        h();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.f23307k = 3;
        i(true);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4, int i5) {
        this.j = i4;
        this.f23307k = 1;
        i(true);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        i(false);
    }
}
