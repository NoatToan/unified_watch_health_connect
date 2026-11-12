package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.huawei.treadmill.CallBackToReportStepsOrEvent;
import com.huawei.treadmill.JniTest;

/* JADX INFO: loaded from: classes15.dex */
public class qhs implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile qhs f46247a;
    private Context e;
    private Runnable f;
    private CallBackToReportStepsOrEvent g;
    private JniTest h;
    private Handler j;
    private boolean k;
    private SensorManager m;
    private boolean i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46248b = false;
    private int d = 1000;
    private int n = 0;
    private int l = 0;
    private int s = -1;
    private int o = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46249c = 1000;
    private int t = 0;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    private qhs(Context context, boolean z) {
        this.e = context;
        this.k = z;
    }

    public static qhs e(Context context, boolean z) {
        synchronized (qhs.class) {
            try {
                if (context == null) {
                    Log.i("Track_stepCounter", "getInstance of StepsCounter, context is null, return null");
                    return null;
                }
                if (f46247a == null) {
                    f46247a = new qhs(context, z);
                    Log.i("Track_stepCounter", "getInstance of StepsCounter, instance == null, create a new one");
                } else {
                    f46247a.e = context;
                    f46247a.k = z;
                    Log.i("Track_stepCounter", "getInstance of StepsCounter, instance is not null, no need to create a new one, just refresh context and stop last counter");
                    f46247a.c();
                }
                return f46247a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.f46248b || this.h == null) {
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            int[] iArrProcessAlg = this.h.processAlg(new int[]{(int) (((double) (fArr[0] * 2048.0f)) / 9.8d), (int) (((double) (fArr[1] * 2048.0f)) / 9.8d), (int) (((double) (fArr[2] * 2048.0f)) / 9.8d)}, new int[]{this.f46249c, this.o, this.n, this.t});
            if (iArrProcessAlg.length != 2 || 1 == iArrProcessAlg[0]) {
                CallBackToReportStepsOrEvent callBackToReportStepsOrEvent = this.g;
                if (callBackToReportStepsOrEvent != null) {
                    callBackToReportStepsOrEvent.onUpdateStepsOrEvent(-1, -1);
                }
                c();
                return;
            }
            this.l += iArrProcessAlg[1];
            return;
        }
        if (this.k || sensorEvent.sensor.getType() != 19) {
            return;
        }
        Log.d("Track_stepCounter", " get a sensorStep value from TYPE_STEP_COUNTER");
        if (sensorEvent.values[0] > this.n) {
            this.n = Math.round(sensorEvent.values[0]);
        }
    }

    public boolean d(qht qhtVar, CallBackToReportStepsOrEvent callBackToReportStepsOrEvent, int i) {
        Log.i("Track_stepCounter", "just into initAndStartCountSteps");
        if (this.i) {
            Log.i("Track_stepCounter", "counter is running already, return false");
            return false;
        }
        if (this.e == null) {
            Log.i("Track_stepCounter", "context is null, return false");
            this.m = null;
            this.h = null;
            this.g = null;
            this.j = null;
            this.f = null;
            return false;
        }
        if (!a()) {
            Log.i("Track_stepCounter", "no write/read permissions, return false");
            this.m = null;
            this.h = null;
            this.g = null;
            this.j = null;
            this.f = null;
            return false;
        }
        if (qhtVar == null || callBackToReportStepsOrEvent == null || i < 100 || i > 10000) {
            Log.i("Track_stepCounter", "input invalid, return false");
            this.m = null;
            this.h = null;
            this.g = null;
            this.j = null;
            this.f = null;
            return false;
        }
        SensorManager sensorManager = (SensorManager) this.e.getSystemService("sensor");
        if (sensorManager == null) {
            Log.i("Track_stepCounter", "cannot get sensormanager, return false");
            this.m = null;
            this.h = null;
            this.g = null;
            this.j = null;
            this.f = null;
            return false;
        }
        this.g = callBackToReportStepsOrEvent;
        if (this.h == null) {
            this.h = new JniTest();
        }
        if (this.j == null) {
            this.j = new Handler();
        }
        int[] iArrD = qhtVar.d();
        Log.i("Track_stepCounter", "will initAlg, length of personInfo is " + iArrD.length);
        if (1 == this.h.initAlg(iArrD)) {
            Log.i("Track_stepCounter", "init alg error, return false");
            this.m = null;
            this.h = null;
            this.g = null;
            this.j = null;
            this.f = null;
            return false;
        }
        this.i = true;
        this.f46248b = true;
        b();
        this.d = i;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 10000);
        if (this.k) {
            Log.i("Track_stepCounter", "flag is true and will use steps outside, do not need to register TYPE_STEP_COUNTER");
        } else {
            Log.i("Track_stepCounter", "flag is false and will not use steps outside, need to register TYPE_STEP_COUNTER");
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(19), 500000);
        }
        this.m = sensorManager;
        Runnable runnable = new Runnable() { // from class: qhs.1
            @Override // java.lang.Runnable
            public void run() {
                if (qhs.this.f46248b) {
                    if (qhs.this.g != null) {
                        if (qhs.this.h == null) {
                            qhs.this.s = -1;
                        } else {
                            qhs qhsVar = qhs.this;
                            qhsVar.s = qhsVar.h.getCurrentStepSource();
                        }
                        Log.d("Track_stepCounter", "report steps: ***,stepSource:" + qhs.this.s);
                        qhs.this.g.onUpdateStepsOrEvent(qhs.this.l, qhs.this.s);
                    } else {
                        Log.d("Track_stepCounter", "cannot report steps, mCallBackToReportStepsOrEvent is null");
                    }
                    if (qhs.this.j == null || qhs.this.f == null) {
                        return;
                    }
                    qhs.this.j.postDelayed(qhs.this.f, qhs.f46247a.d);
                    return;
                }
                Log.d("Track_stepCounter", "cannot report steps,isAllowedCounterRunning:" + qhs.this.f46248b);
            }
        };
        this.f = runnable;
        this.j.postDelayed(runnable, f46247a.d);
        Log.i("Track_stepCounter", "start stepcounter success, return true");
        return true;
    }

    public void c() {
        Log.i("Track_stepCounter", "just into stopCountSteps.");
        this.f46248b = false;
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!a()) {
            Log.i("Track_stepCounter", "stopCountSteps. no read/write permissions");
        } else {
            JniTest jniTest = this.h;
            if (jniTest != null && this.e != null) {
                jniTest.stopAlg();
            }
        }
        SensorManager sensorManager = this.m;
        if (sensorManager != null) {
            sensorManager.unregisterListener(f46247a, this.m.getDefaultSensor(1));
            if (this.k) {
                Log.i("Track_stepCounter", "flag is true and use steps outside, do not need to unregister TYPE_STEP_COUNTER");
            } else {
                Log.i("Track_stepCounter", "flag is false and not use steps outside, now unregister TYPE_STEP_COUNTER");
                this.m.unregisterListener(f46247a, this.m.getDefaultSensor(19));
            }
        }
        this.m = null;
        this.h = null;
        this.g = null;
        this.j = null;
        this.f = null;
        this.i = false;
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ContextCompat.checkSelfPermission(this.e, "android.permission.READ_MEDIA_VIDEO") == 0;
        }
        return ContextCompat.checkSelfPermission(this.e, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean c(int i, int i2, int i3) {
        Log.d("Track_stepCounter", "just into refreshWorkoutParameters");
        int i4 = (i + 50) / 100;
        if (i4 < 0 || i4 > 300 || i2 < -1 || i2 > 9999999 || i3 < 0 || i3 > 2) {
            Log.d("Track_stepCounter", "input invalid, return false");
            return false;
        }
        this.o = i4;
        this.f46249c = i2;
        this.t = i3;
        return true;
    }

    public int d() {
        Log.d("Track_stepCounter", "getCurrentsteps: ***");
        return this.l;
    }

    public void d(int i) {
        if (this.k) {
            Log.d("Track_stepCounter", "setCurStepsFromStepCountModule: ***");
            this.n = i;
        } else {
            Log.d("Track_stepCounter", "setCurStepsFromStepCountModule: flag is false and not allowed to use steps outside");
        }
    }

    private void b() {
        this.n = 0;
        this.l = 0;
        this.s = -1;
        this.o = 100;
        this.f46249c = 1000;
        this.t = 0;
    }
}
