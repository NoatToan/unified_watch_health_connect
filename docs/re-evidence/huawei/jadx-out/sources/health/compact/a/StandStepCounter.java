package health.compact.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.huawei.health.icommon.HwHealthSensorEventListener;
import defpackage.ipb;
import defpackage.lsl;
import defpackage.npt;

/* JADX INFO: loaded from: classes2.dex */
public class StandStepCounter implements HwHealthSensorEventListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f36634c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36636b;
    private int d;
    private SensorManager e;
    private e f;

    public StandStepCounter(Context context) {
        this(context, false);
    }

    public StandStepCounter(Context context, boolean z) {
        this.e = null;
        this.d = -1;
        this.f36635a = -1;
        this.f36636b = context;
        this.f = new e(context);
        if (z) {
            return;
        }
        Object systemService = this.f36636b.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            this.e = (SensorManager) systemService;
        } else {
            com.huawei.hwlogsmodel.LogUtil.j("Step_StandStepCnt", "StandStepCounter object type is not SensorManager.");
        }
    }

    public void a() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_Step_StandStepCnt", "startStepCounter to enter");
        if (!StepCounterSupportUtils.b(this.f36636b)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", " startStepCounter failed with cant step counter.");
            return;
        }
        try {
            SensorManager sensorManager = this.e;
            if (sensorManager != null) {
                boolean zRegisterListener = sensorManager.registerListener(this, sensorManager.getDefaultSensor(19), 0);
                c(zRegisterListener);
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", "startStepCounter registerListener isSensorEnabled = ", Boolean.valueOf(zRegisterListener));
            }
        } catch (RuntimeException unused) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("Step_StandStepCnt", "startStepCounter happened exception");
        }
    }

    public void c() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_Step_StandStepCnt", "stopStepCounter to enter");
        SensorManager sensorManager = this.e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            c(false);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_StandStepCnt", "onSensorChanged SensorEvent is null.");
            return;
        }
        if (sensorEvent.sensor == null || sensorEvent.sensor.getType() != 19) {
            return;
        }
        if (sensorEvent.values == null || sensorEvent.values.length <= 0) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_StandStepCnt", "index is out of Bounds int event.values.");
            return;
        }
        int i = (int) sensorEvent.values[0];
        c(i, 0);
        this.d = i;
    }

    @Override // com.huawei.health.icommon.HwHealthSensorEventListener
    public void dataReport(int i, boolean z) {
        c(i, 1);
        if (z) {
            this.d = i;
        } else {
            this.f36635a = i;
        }
    }

    @Override // com.huawei.health.icommon.HwHealthSensorEventListener
    public void notifyStepCounterError(boolean z) {
        if (z) {
            this.d = -1;
        } else {
            this.f36635a = -1;
        }
    }

    public void c(int i, int i2) {
        int iMax = Math.max(Math.max(i, this.d), this.f36635a);
        if (this.f.a(iMax)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_StandStepCnt", "wrong data,lose it.");
        } else {
            LogicalStepCounter.d(this.f36636b).d(System.currentTimeMillis(), iMax, i2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (sensor == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_StandStepCnt", "onAccuracyChanged sensor == null");
            return;
        }
        int type = sensor.getType();
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", "onAccuracyChanged sensor type:", Integer.valueOf(type), " accuracy:", Integer.valueOf(i));
        if (type != 19 || i == 3) {
            return;
        }
        ipb.d(this.d, this.f36635a, i);
    }

    public void e() {
        if (this.e != null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_StandStepCnt", "flush sensor data");
            this.e.flush(this);
        }
    }

    public void b() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", "reStartStepCounter");
        if (!StepCounterSupportUtils.b(this.f36636b)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", " restartStepCounter failed with cant step counter.");
        } else {
            c();
            a();
        }
    }

    static class e {
        private static long e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f36637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36639c;
        private Context d;

        private e(Context context) {
            this.f36637a = 0L;
            this.f36639c = -1;
            this.f36638b = 0;
            this.d = context;
            this.f36637a = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(int i) {
            if (this.f36639c == -1) {
                String[] strArrY = SharedPerferenceUtils.y(this.d);
                if (strArrY != null && strArrY.length >= 2 && lsl.c(System.currentTimeMillis(), Long.parseLong(strArrY[0]))) {
                    try {
                        this.f36639c = Integer.parseInt(strArrY[1]);
                    } catch (NumberFormatException e2) {
                        com.huawei.hwlogsmodel.LogUtil.a("Step_StandStepCnt", " isAvaliableReport Exception", e2.getMessage());
                    }
                }
                if (this.f36639c == -1) {
                    this.f36639c = i;
                }
            }
            long jA = com.huawei.hwlogsmodel.LogUtil.a(5000, e);
            if (jA != -1) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", npt.d("isAvaliableReport baseStep = ", Integer.valueOf(this.f36639c), " SensorChangedstep = ", Integer.valueOf(i)));
                e = jA;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f36637a;
            Long lValueOf = Long.valueOf(j);
            lValueOf.getClass();
            if (j > 10000) {
                int iRound = Math.round(lValueOf.floatValue() / 10000.0f);
                int i2 = this.f36639c;
                if (i - i2 > iRound * 84) {
                    ipb.c(i, i2, iRound);
                }
            }
            this.f36637a = jElapsedRealtime;
            int i3 = this.f36639c;
            if (i < i3 || i - i3 > 100000) {
                int i4 = this.f36638b + 1;
                this.f36638b = i4;
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_StandStepCnt", npt.d("isAvaliableReport wrong data count = ", Integer.valueOf(i4), " baseStep = ", Integer.valueOf(i3), " wrongstep = ", Integer.valueOf(i)));
                if (this.f36638b <= 3) {
                    return true;
                }
                this.f36638b = 0;
                this.f36639c = i;
                return false;
            }
            if (this.f36638b != 0) {
                this.f36638b = 0;
            }
            this.f36639c = i;
            return false;
        }
    }

    public static boolean d() {
        return f36634c;
    }

    private static void c(boolean z) {
        f36634c = z;
    }
}
