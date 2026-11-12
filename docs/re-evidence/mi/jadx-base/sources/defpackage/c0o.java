package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_eco_manager.utils.UserInfo;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class c0o {
    public static int p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SensorManager f4805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ezc f4806b;
    public int c;
    public int d;
    public Sensor e;
    public Sensor f;
    public Sensor g;
    public long i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IFitnessSportAlgo f4807k;
    public int l = 3;
    public boolean m = false;
    public SensorEventListener n = new a();
    public final String o = "miui_step_counter_service";
    public SportSensorResult h = new SportSensorResult();

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 19) {
                int i = (int) sensorEvent.values[0];
                if (c0o.this.j == 0 || c0o.this.m) {
                    c0o.this.j = i;
                }
                if (!c0o.this.m) {
                    c0o c0oVar = c0o.this;
                    c0oVar.c = (i - c0oVar.j) + c0o.p;
                }
            }
            if (sensorEvent.sensor.getType() == 1) {
                c0o.this.h.f13155b = sensorEvent.values[0];
                c0o.this.h.c = sensorEvent.values[1];
                c0o.this.h.d = sensorEvent.values[2];
                c0o.this.f4807k.autoPauseHandle(c0o.this.h.f13155b, c0o.this.h.c, c0o.this.h.d);
            }
            if (sensorEvent.sensor.getType() == 33171041) {
                c0o.this.d += (int) sensorEvent.values[0];
            }
            if (c0o.this.c > c0o.this.d) {
                c0o.this.h.f13154a = c0o.this.c;
            } else {
                c0o.this.h.f13154a = c0o.this.d;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit.toSeconds(System.currentTimeMillis()) - c0o.this.i >= 1) {
                FitnessLogUtils.i("SportSensorManager", "phone step : " + c0o.this.c + ", gymTotalStep : " + c0o.this.d + ", totalStep : " + c0o.this.h.f13154a + ",paseStep : " + c0o.p);
                c0o.this.f4806b.a(c0o.this.h);
                c0o.this.i = timeUnit.toSeconds(System.currentTimeMillis());
            }
        }
    }

    public c0o(ezc ezcVar) {
        this.f4806b = ezcVar;
        SensorManager sensorManager = (SensorManager) AppUtil.getApp().getSystemService("sensor");
        this.f4805a = sensorManager;
        this.e = sensorManager.getDefaultSensor(19);
        this.f = this.f4805a.getDefaultSensor(1);
        this.g = this.f4805a.getDefaultSensor(33171041);
        this.f4807k = FitnessSportAlgo.getInstance(UserInfo.INSTANCE.getUserProfile());
    }

    public void m(int i) {
        FitnessLogUtils.i("SportSensorManager", "pauseOrStopSensor ， sportState : " + i);
        if (i == 2) {
            p = this.c;
            this.m = true;
        }
        if (this.f4805a != null) {
            if (i == 4) {
                FitnessLogUtils.i("SportSensorManager", "ACC unregisterListener , sportstate is finish");
                this.f4805a.unregisterListener(this.n, this.f);
                this.f4805a.unregisterListener(this.n, this.e);
            }
            if (i == 2 && this.l == 3) {
                FitnessLogUtils.i("SportSensorManager", "ACC unregisterListener , sportstate is pause");
                this.f4805a.unregisterListener(this.n, this.f);
            }
            this.f4805a.unregisterListener(this.n, this.g);
            if (Build.VERSION.SDK_INT >= 29 && RomUtils.isXiaomi()) {
                o(false);
            }
        }
        this.j = 0;
        this.d = 0;
        SportSensorResult sportSensorResult = this.h;
        if (sportSensorResult != null) {
            sportSensorResult.f13154a = 0;
        }
    }

    public void n() {
        this.m = false;
        this.f4805a.unregisterListener(this.n, this.f);
        this.f4805a.registerListener(this.n, this.f, this.l);
    }

    @RequiresApi(api = 29)
    public final void o(boolean z) {
    }

    public void p(int i) {
        FitnessLogUtils.i("SportSensorManager", "startAccSensor : " + i);
        this.l = i;
        this.f4805a.unregisterListener(this.n, this.f);
        this.f4805a.registerListener(this.n, this.f, i);
    }

    public void q() {
        FitnessLogUtils.i("SportSensorManager", "startGymSensor()");
        if (Build.VERSION.SDK_INT >= 29 && RomUtils.isXiaomi()) {
            o(true);
        }
        this.f4805a.registerListener(this.n, this.g, 3);
    }

    public void r() {
        FitnessLogUtils.i("SportSensorManager", "startStepSensor()");
        this.f4805a.registerListener(this.n, this.e, 3);
    }
}
