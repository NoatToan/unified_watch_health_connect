package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.preprocess.realtimedata.RealTimeDataParser;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jfj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f38540c;
    private RealTimeDataParser e;
    private RealTimeDataParser h;
    private b i;
    private RealTimeDataParser m;
    private RealTimeDataParser p;
    private int o = 258;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38539b = 33;
    private int d = 17;
    private int j = 17;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<Double> f38538a = null;
    private MotionPath k = null;
    private boolean f = false;
    private long n = 0;
    private long g = 0;
    private long r = 0;
    private int l = 1;

    public jfj() {
        this.f38540c = new c();
        this.i = new b();
        this.h = new jfp().setMaxDataCallBack(this.f38540c.d);
        this.p = new jfw().setMaxDataCallBack(this.f38540c.f38542a);
        this.m = new jfx().setMaxDataCallBack(this.f38540c.e);
        this.e = new jfr().setMaxDataCallBack(this.f38540c.f38544c);
    }

    public jfj c(MotionPath motionPath) {
        this.k = motionPath;
        return this;
    }

    public jfj d(MotionPathSimplify motionPathSimplify) {
        this.o = motionPathSimplify.requestSportType();
        this.n = motionPathSimplify.requestStartTime();
        this.r = motionPathSimplify.requestTotalTime();
        this.g = motionPathSimplify.requestEndTime();
        return this;
    }

    public int j() {
        return this.l;
    }

    public ArrayList<Double> g() {
        LogUtil.a("Track_DynamicDataParser", "go into obtainMultiplexField");
        if (this.i.h()) {
            ArrayList<Double> arrayListE = e(this.k);
            this.f38538a = arrayListE;
            this.f38539b = 34;
            this.d = 18;
            this.j = 18;
            if (arrayListE.size() < 1) {
                this.f38538a = b(this.k);
                this.f38539b = 32;
                this.d = 17;
                this.j = 17;
            }
        } else if (this.i.e()) {
            this.f38538a = b(this.k);
            this.f38539b = 32;
            this.d = 16;
            this.j = 17;
        } else {
            this.f38538a = b(this.k);
            this.f38539b = 32;
            this.d = 17;
            this.j = 17;
        }
        if (this.i.c()) {
            ArrayList<Double> arrayListD = d(this.k);
            if (arrayListD.size() > 0 && this.i.d()) {
                this.f = true;
                this.f38538a = arrayListD;
                this.f38539b = 33;
            }
        }
        if (this.i.b()) {
            ArrayList<Double> arrayListA = a(this.k);
            if (arrayListA.size() > 0 && this.i.a()) {
                this.f38538a = arrayListA;
                this.f38539b = 36;
            }
        }
        LogUtil.a("Track_DynamicDataParser", "go out obtainMultiplexField");
        return this.f38538a;
    }

    public int d() {
        return this.f38539b;
    }

    public int a() {
        return this.d;
    }

    public int i() {
        return this.j;
    }

    public boolean f() {
        return this.f;
    }

    public jfq<Integer, Double> e() {
        return this.f38540c.f38544c;
    }

    public jfq<Integer, Double> b() {
        return this.f38540c.d;
    }

    public jfq<Integer, Double> c() {
        if (this.j == 18) {
            return this.f38540c.f38542a;
        }
        return this.f38540c.e;
    }

    private ArrayList<Double> a(MotionPath motionPath) {
        return this.f38540c.c(motionPath, this.h);
    }

    private ArrayList<Double> e(MotionPath motionPath) {
        return this.f38540c.c(motionPath, this.p);
    }

    private ArrayList<Double> b(MotionPath motionPath) {
        ArrayList<Double> arrayListC = this.f38540c.c(motionPath, this.m);
        this.l = 1;
        if (arrayListC.size() >= 1) {
            return arrayListC;
        }
        ArrayList<Double> arrayListA = this.f38540c.a(motionPath);
        this.l = -1;
        return arrayListA;
    }

    private ArrayList<Double> d(MotionPath motionPath) {
        return this.f38540c.c(motionPath, this.e);
    }

    class b {
        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return false;
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            return jfj.this.o == 257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return jfj.this.o != 233;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return jfj.this.o == 257 || jfj.this.o == 258 || jfj.this.o == 259 || jfj.this.o == 282 || jfj.this.o == 260 || jfj.this.o == 280 || jfj.this.o == 222 || jfj.this.o == 227 || jfj.this.o == 233;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return jfj.this.o == 282 || jfj.this.o == 260 || jfj.this.o == 280 || jfj.this.o == 222 || jfj.this.o == 233;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            return jfj.this.o == 258 || jfj.this.o == 227;
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private jfq<Integer, Double> f38542a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private jfq<Integer, Double> f38544c;
        private jfq<Integer, Double> d;
        private jfq<Integer, Double> e;
        private double f;

        private c() {
            Double dValueOf = Double.valueOf(-1.7976931348623157E308d);
            this.f38544c = new jfq<>(-1, dValueOf);
            this.e = new jfq<>(-1, dValueOf);
            this.f38542a = new jfq<>(-1, dValueOf);
            this.d = new jfq<>(-1, dValueOf);
            this.f = 0.0d;
        }

        private void e(jfq<Integer, Double> jfqVar, int i, double d) {
            if (d > jfqVar.a().doubleValue()) {
                jfqVar.e(Double.valueOf(d));
                jfqVar.d(Integer.valueOf(i));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ArrayList<Double> c(MotionPath motionPath, RealTimeDataParser realTimeDataParser) {
            realTimeDataParser.setMotionPath(motionPath).setStartTime(jfj.this.n).setEndTime(jfj.this.g).setTotalTime(jfj.this.r);
            int size = realTimeDataParser.getSize();
            if (size < 1) {
                return new ArrayList<>(16);
            }
            ArrayList<Double> arrayList = new ArrayList<>(300);
            if (!realTimeDataParser.init()) {
                return new ArrayList<>(16);
            }
            for (int i = 0; i < size; i++) {
                arrayList.add(Double.valueOf(realTimeDataParser.getNextData()));
            }
            return arrayList;
        }

        private void b() {
            this.f = 0.0d;
        }

        private double a(double d, double d2) {
            if (d2 < 1.0E-6d) {
                return this.f;
            }
            if (jfj.this.o == 260) {
                this.f = (d * 3.6d) / d2;
            } else {
                this.f = (d * 3600.0d) / d2;
            }
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ArrayList<Double> a(MotionPath motionPath) {
            Iterator<Map.Entry<Long, double[]>> it;
            LatLong latLong;
            LogUtil.a("Track_DynamicDataParser", "go int countSpeedList");
            if (motionPath == null || motionPath.requestLbsDataMap() == null) {
                return new ArrayList<>();
            }
            ArrayList<Double> arrayList = new ArrayList<>(300);
            b();
            Iterator<Map.Entry<Long, double[]>> it2 = motionPath.requestLbsDataMap().entrySet().iterator();
            LatLong latLong2 = null;
            int i = -1;
            double d = 0.0d;
            while (it2.hasNext()) {
                Map.Entry<Long, double[]> next = it2.next();
                i++;
                try {
                    if (next.getValue() == null || next.getValue().length < 4) {
                        it = it2;
                        arrayList.add(Double.valueOf(this.f));
                    } else {
                        if (jfn.a(next.getValue()[0], next.getValue()[1])) {
                            it = it2;
                        } else {
                            it = it2;
                            try {
                                if (!jfn.b(next.getValue()[0], next.getValue()[1])) {
                                    if (latLong2 == null) {
                                        arrayList.add(Double.valueOf(0.0d));
                                        latLong = new LatLong(next.getValue()[0], next.getValue()[1]);
                                        try {
                                            d = next.getValue()[3];
                                        } catch (IndexOutOfBoundsException unused) {
                                            latLong2 = latLong;
                                            LogUtil.a("Track_DynamicDataParser", "Index Out Of Bounds Exception.");
                                        }
                                    } else {
                                        latLong = new LatLong(next.getValue()[0], next.getValue()[1]);
                                        double dA = a(jfa.b(latLong2, latLong), next.getValue()[3] - d);
                                        arrayList.add(Double.valueOf(dA));
                                        e(this.e, i, dA);
                                        d = next.getValue()[3];
                                    }
                                    latLong2 = latLong;
                                }
                            } catch (IndexOutOfBoundsException unused2) {
                            }
                        }
                        arrayList.add(Double.valueOf(this.f));
                    }
                } catch (IndexOutOfBoundsException unused3) {
                    it = it2;
                }
                it2 = it;
            }
            LogUtil.a("Track_DynamicDataParser", "go out countSpeedList");
            return arrayList;
        }
    }
}
