package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class j0o extends lc2 implements OnEcoDeviceStatusListener {
    public final Intent d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public a g;
    public int h;
    public int i;
    public ezc j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22308k;

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j0o.this.e((SportSensorResult) intent.getParcelableExtra("sport_update_sendor"));
        }

        public a() {
        }
    }

    public j0o(long j, ezc ezcVar) {
        super(j);
        this.f22308k = false;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(true);
        Intent intent = new Intent("com.xiaomi.fitness.sport_eco_manager.location.foregroundService");
        this.d = intent;
        intent.setPackage(this.f24888a.getPackageName());
        this.g = new a();
        this.j = ezcVar;
        FitnessLogUtils.d("SportLocationClient", "SportServiceClient 构造");
    }

    private void f() {
        if (this.d == null || !this.e.get()) {
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "pause step and location");
        this.e.set(false);
        this.d.putExtra("EXTRA_KEY", 4);
        this.d.putExtra("EXTRA_SPORT_STATE_KEY", this.i);
        try {
            this.f22308k = false;
            this.f24888a.startService(this.d);
        } catch (Exception unused) {
        }
    }

    private void g(boolean z) {
        if (this.d == null || this.c == null || this.e.get()) {
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "startGPSLocation");
        this.e.set(true);
        this.f.set(false);
        if (z) {
            this.f22308k = true;
            this.d.putExtra("EXTRA_KEY", 2);
            this.d.putExtra("EXTRA_SPORT_TYPE_KEY", this.h);
            this.d.putExtra("EXTRA_SPORT_STATE_KEY", this.i);
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SPORT_FUNCTION", this.c);
            this.d.putExtras(bundle);
            if (this.i == 1) {
                aje.b(this.f24888a).c(this.g, new IntentFilter("sport_sensor_update_broadcast"));
            }
        } else {
            this.d.putExtra("EXTRA_KEY", 3);
        }
        this.f24888a.startForegroundService(this.d);
    }

    private void h() {
        if (this.d != null) {
            FitnessLogUtils.i("SportServiceClient", "stop sport service");
            this.d.putExtra("EXTRA_KEY", 1);
            this.d.putExtra("EXTRA_SPORT_STATE_KEY", this.i);
            try {
                this.f24888a.startService(this.d);
                this.f.set(true);
                this.e.set(false);
                this.f22308k = false;
            } catch (Exception unused) {
            }
            aje.b(this.f24888a).e(this.g);
        }
    }

    public void c(int i) {
        if (this.f22308k) {
            FitnessLogUtils.i("SportServiceClient", "changeAccRate");
            Intent intent = this.d;
            if (intent != null) {
                intent.putExtra("EXTRA_KEY", 5);
                this.d.putExtra("EXTRA_ACC_KEY", i);
                this.f24888a.startForegroundService(this.d);
            }
        }
    }

    public void d() {
        if (this.f.get()) {
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "destroy");
        onSportFinished(false, null);
    }

    public final void e(SportSensorResult sportSensorResult) {
        if (this.j == null) {
            return;
        }
        if (sportSensorResult == null) {
            FitnessLogUtils.w("SportServiceClient", "sensorResult is null");
            return;
        }
        FitnessLogUtils.i("SportServiceClient", "sensorResult : " + sportSensorResult.toString());
        this.j.a(sportSensorResult);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(String str, String str2, int i, int i2) {
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(String str, String str2) {
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(String str, String str2) {
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(String str, String str2) {
        h();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
        this.i = 4;
        c0o.p = 0;
        h();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.i = 2;
        f();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.i = 3;
        g(true);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4) {
        this.h = i3;
        this.i = 1;
        g(true);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        g(false);
    }
}
