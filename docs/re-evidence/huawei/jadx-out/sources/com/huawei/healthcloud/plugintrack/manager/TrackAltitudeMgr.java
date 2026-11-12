package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Pair;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.LocalPressureCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ive;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njm;
import defpackage.njy;
import defpackage.nsp;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TrackAltitudeMgr implements ISportStateChangeListener {
    private Sensor i;
    private SensorManager m;
    private List<njm> d = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<njm> f10459b = new ArrayList(10);
    private long n = 0;
    private boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f10458a = -1.0d;
    private double f = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f10460c = 0.0d;
    private double e = 0.0d;
    private float h = 0.0f;
    private float j = 0.0f;
    private b o = new b();
    private LocalPressureCallback k = new LocalPressureCallback() { // from class: com.huawei.healthcloud.plugintrack.manager.TrackAltitudeMgr.4
        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.LocalPressureCallback
        public void onUpdateLocalPressure(double d) {
            LogUtil.a("Track_TrackAltitudeMgr", "onUpdateLocalPressure= ", Double.valueOf(d));
            if (d <= 0.0d) {
                LogUtil.j("Track_TrackAltitudeMgr", "exception localPressure= ", Double.valueOf(d));
                TrackAltitudeMgr.this.j();
            } else {
                TrackAltitudeMgr.this.f10458a = d;
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.LocalPressureCallback
        public void onFailed(String str) {
            TrackAltitudeMgr.this.j();
            ReleaseLogUtil.e("R_Track_TrackAltitudeMgr", "exception localPressure= ", str);
        }
    };

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
    }

    public TrackAltitudeMgr(Context context) {
        this.m = null;
        this.i = null;
        if (context == null) {
            throw new RuntimeException("Track_TrackAltitudeMgrsystem error with null context");
        }
        PluginSportTrackAdapter pluginSportTrackAdapterA = ive.c().a();
        if (pluginSportTrackAdapterA != null) {
            pluginSportTrackAdapterA.requestLocalPressure(this.k, 0);
        }
        LogUtil.a("Track_TrackAltitudeMgr", "new TrackAltitudeMgr");
        SensorManager sensorManagerR = CommonUtil.r();
        this.m = sensorManagerR;
        if (sensorManagerR != null) {
            this.i = sensorManagerR.getDefaultSensor(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f10458a = 1013.25d;
    }

    public void a(List<njm> list) {
        ReleaseLogUtil.d("Track_TrackAltitudeMgr", "recoveryAltitudeList");
        this.d.clear();
        this.f10459b.clear();
        this.f10460c = 0.0d;
        this.e = 0.0d;
        if (njy.e(list)) {
            return;
        }
        this.d.addAll(list);
        ReleaseLogUtil.d("Track_TrackAltitudeMgr", "recovery AltitudeList size", Integer.valueOf(list.size()));
        i();
    }

    public void e() {
        LogUtil.a("Track_TrackAltitudeMgr", "startAltitudeMgr");
        k();
        this.d.clear();
    }

    public void f() {
        LogUtil.a("Track_TrackAltitudeMgr", "stopAltitudeMgr mAltitudeList", Integer.valueOf(this.d.size()));
        i();
        l();
    }

    public void i() {
        Pair<Double, Double> pairG = g();
        double dDoubleValue = ((Double) pairG.first).doubleValue();
        double dDoubleValue2 = ((Double) pairG.second).doubleValue();
        if (this.f10460c < dDoubleValue) {
            this.f10460c = dDoubleValue;
        }
        if (this.e < dDoubleValue2) {
            this.e = dDoubleValue2;
        }
    }

    public ArrayList<njm> d(boolean z) {
        ArrayList<njm> arrayList = new ArrayList<>(this.f10459b.size());
        if (!this.f10459b.isEmpty()) {
            arrayList.addAll(this.f10459b);
            if (z) {
                this.f10459b.clear();
            }
        }
        return arrayList;
    }

    public double c() {
        LogUtil.a("Track_TrackAltitudeMgr", "CW = ", Double.valueOf(this.f10460c));
        return this.f10460c;
    }

    public double a() {
        LogUtil.a("Track_TrackAltitudeMgr", "DW = ", Double.valueOf(this.e));
        return this.e;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        l();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        k();
    }

    public float d() {
        return this.j;
    }

    private void k() {
        ReleaseLogUtil.d("Track_TrackAltitudeMgr", "registerPressureSensor");
        if (this.i == null || this.m == null) {
            ReleaseLogUtil.e("Track_TrackAltitudeMgr", "registerPressureSensor mPressure or mSensorManager is null");
            return;
        }
        LogUtil.a("Track_TrackAltitudeMgr", "use Sensor");
        SensorManager sensorManager = this.m;
        b bVar = this.o;
        sensorManager.registerListener(bVar, this.i, bVar.c());
    }

    private void l() {
        SensorManager sensorManager;
        ReleaseLogUtil.d("Track_TrackAltitudeMgr", "unregisterPressureSensor");
        if (this.i == null || (sensorManager = this.m) == null) {
            ReleaseLogUtil.e("Track_TrackAltitudeMgr", "unregisterPressureSensor mPressure or mSensorManager is null");
        } else {
            sensorManager.unregisterListener(this.o);
        }
    }

    private Pair<Double, Double> g() {
        return b(h(), 0.6d);
    }

    class b implements SensorEventListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f10464c;
        private long d;

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return 100000;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        private b() {
            this.f10464c = new float[51];
            this.d = 0L;
        }

        private double a() {
            int i;
            if (this.f10463b <= 0) {
                LogUtil.j("Track_TrackAltitudeMgr", "Sensor error,Pressure not report");
                return Double.MIN_VALUE;
            }
            float f = 0.0f;
            float f2 = Float.MIN_VALUE;
            float f3 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                i = this.f10463b;
                if (i2 >= i) {
                    break;
                }
                float f4 = this.f10464c[i2];
                if (f2 < f4) {
                    f2 = f4;
                }
                if (f3 > f4) {
                    f3 = f4;
                }
                f += f4;
                i2++;
            }
            float f5 = f2 - f3;
            if (f5 >= 15.0f) {
                LogUtil.j("Track_TrackAltitudeMgr", "Pressure change over thres = ", LogAnonymous.d((int) f5));
                return Double.MIN_VALUE;
            }
            return (1.0d - Math.pow(((double) (f / i)) / TrackAltitudeMgr.this.f10458a, 0.19029495120048523d)) * 44330.0d;
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent == null || sensorEvent.values == null) {
                LogUtil.j("Track_TrackAltitudeMgr", "onSensorChanged SensorEvent is invalid.");
                return;
            }
            if (sensorEvent.values.length == 0) {
                return;
            }
            TrackAltitudeMgr.this.h = sensorEvent.values[0];
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (TrackAltitudeMgr.this.f == 0.0d) {
                TrackAltitudeMgr.this.f = jCurrentTimeMillis;
            } else if (TrackAltitudeMgr.this.f10458a == -1.0d && jCurrentTimeMillis - TrackAltitudeMgr.this.f > 60000.0d) {
                TrackAltitudeMgr.this.j();
            }
            if (TrackAltitudeMgr.this.f10458a == -1.0d) {
                return;
            }
            if (TrackAltitudeMgr.this.h < TrackAltitudeMgr.this.f10458a && TrackAltitudeMgr.this.h != 0.0f) {
                TrackAltitudeMgr trackAltitudeMgr = TrackAltitudeMgr.this;
                trackAltitudeMgr.j = (float) ((1.0d - Math.pow(((double) trackAltitudeMgr.h) / TrackAltitudeMgr.this.f10458a, 0.19029495120048523d)) * 44330.0d);
            }
            if (this.d == 0) {
                this.d = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.d >= 5000) {
                double dA = a();
                if (Math.abs(dA - Double.MIN_VALUE) < 1.0E-6d) {
                    if (TrackAltitudeMgr.this.d.size() == 0) {
                        this.f10463b = 0;
                        this.d = jCurrentTimeMillis;
                        return;
                    }
                    dA = ((njm) TrackAltitudeMgr.this.d.get(TrackAltitudeMgr.this.d.size() - 1)).a();
                }
                LogUtil.a("Track_TrackAltitudeMgr", "h = ", Double.valueOf(dA));
                njm njmVar = new njm(jCurrentTimeMillis, dA);
                TrackAltitudeMgr.this.d.add(njmVar);
                TrackAltitudeMgr.this.f10459b.add(njmVar);
                TrackAltitudeMgr.this.i();
                this.f10463b = 0;
                this.d = jCurrentTimeMillis;
                return;
            }
            int i = this.f10463b;
            if (i < 51) {
                float[] fArr = this.f10464c;
                this.f10463b = i + 1;
                fArr[i] = sensorEvent.values[0];
            }
        }
    }

    private double[] h() {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.size() == 0) {
            return new double[0];
        }
        double[] dArr = new double[arrayList.size() / 2];
        for (int i = 0; i < arrayList.size() - 1; i += 2) {
            dArr[i / 2] = (((njm) arrayList.get(i)).a() + ((njm) arrayList.get(i + 1)).a()) / 2.0d;
        }
        return dArr;
    }

    private Pair<Double, Double> b(double[] dArr, double d) {
        int i;
        int i2;
        double d2 = 0.0d;
        Double dValueOf = Double.valueOf(0.0d);
        if (dArr != null) {
            if (dArr.length > 1) {
                int length = dArr.length;
                double d3 = dArr[0];
                int iA = 0;
                int i3 = 0;
                while (iA < length - 1) {
                    double d4 = dArr[iA];
                    int i4 = iA + 1;
                    if (dArr[i4] - d4 < d2) {
                        int iC = c(dArr, iA);
                        double d5 = dArr[iC];
                        if (d4 - d5 > d || d5 < d3) {
                            i = iC;
                            LogUtil.a("Track_TrackAltitudeMgr", "upS = ", Integer.valueOf(i3), " upE = ", Integer.valueOf(iA), " downS = ", Integer.valueOf(iA), " downE = ", Integer.valueOf(iC), " creepingWave = ", dValueOf);
                            d3 = dArr[i];
                            i2 = i;
                        } else {
                            while (i4 <= iC) {
                                dArr[i4] = d4;
                                i4++;
                            }
                            i2 = i3;
                            i = iC;
                        }
                        i3 = i2;
                        iA = i;
                    } else {
                        length = length;
                        i3 = iA;
                        iA = a(dArr, iA);
                    }
                    length = length;
                    d2 = 0.0d;
                }
                int i5 = length;
                double d6 = 0.0d;
                double d7 = 0.0d;
                for (int i6 = 1; i6 < i5; i6++) {
                    double d8 = dArr[i6];
                    double d9 = dArr[i6 - 1];
                    if (d8 >= d9) {
                        d6 += d8 - d9;
                    } else {
                        d7 += d9 - d8;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (double d10 : dArr) {
                    arrayList.add(Double.valueOf(d10));
                }
                LogUtil.a("Track_TrackAltitudeMgr", "getCreepingWave = ", Double.valueOf(d6), " getDescentWave = ", Double.valueOf(d7), " heightList = ", arrayList);
                return new Pair<>(Double.valueOf(d6), Double.valueOf(d7));
            }
        }
        return new Pair<>(dValueOf, dValueOf);
    }

    private int a(double[] dArr, int i) {
        int length = dArr.length;
        while (true) {
            int i2 = length - 1;
            if (i >= i2) {
                return i2;
            }
            int i3 = i + 1;
            if (dArr[i] > dArr[i3]) {
                return i;
            }
            i = i3;
        }
    }

    private int c(double[] dArr, int i) {
        int length = dArr.length;
        while (true) {
            int i2 = length - 1;
            if (i >= i2) {
                return i2;
            }
            int i3 = i + 1;
            if (dArr[i] < dArr[i3]) {
                return i;
            }
            i = i3;
        }
    }

    public boolean b() {
        return this.i != null;
    }

    private void a(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put("query", str);
        lmf.d().c(BaseApplication.getContext(), str2, map, 0);
    }

    public void e(nsp nspVar) {
        if (nspVar == null) {
            LogUtil.j("Track_TrackAltitudeMgr", " reportData == null");
            return;
        }
        float fC = nspVar.c() / 10.0f;
        this.f10460c = ((double) nspVar.t()) / 10.0d;
        this.e = ((double) nspVar.s()) / 10.0d;
        if (!this.g) {
            this.g = true;
            lsy.a(new Runnable() { // from class: ixt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38181c.m();
                }
            });
        }
        this.j = fC;
        long jM = nspVar.m();
        if (this.n == 0) {
            this.n = jM;
        }
        if (jM - this.n >= 5000) {
            double dA = fC;
            if (Math.abs(dA - Double.MIN_VALUE) < 1.0E-6d) {
                if (this.d.size() == 0) {
                    this.n = jM;
                    return;
                } else {
                    List<njm> list = this.d;
                    dA = list.get(list.size() - 1).a();
                }
            }
            LogUtil.a("Track_TrackAltitudeMgr", "h = ", Double.valueOf(dA), "creepWave= ", Double.valueOf(this.f10460c), "descentWave= ", Double.valueOf(this.e));
            njm njmVar = new njm(jM, dA);
            this.d.add(njmVar);
            this.f10459b.add(njmVar);
            this.n = jM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        LogUtil.a("Track_TrackAltitudeMgr", "use reportData");
        a("query_devices_altitude", AnalyticsValue.HEALTH_QUARE_DEVICS_ALTITUDE_1040062.value());
    }
}
