package defpackage;

import android.util.Pair;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38548a;
    private int h;
    private MotionPath i;
    private MotionPathSimplify j;
    private ReTrackSimplify n;
    private List<njj> g = null;
    private List<njj> f = null;
    private jfk e = new jfk();
    private jfj d = new jfj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<Double> f38549b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38550c = 0;

    public jfm(MotionPath motionPath, MotionPathSimplify motionPathSimplify, ReTrackSimplify reTrackSimplify) {
        this.j = null;
        this.i = null;
        this.n = null;
        this.i = motionPath;
        this.j = motionPathSimplify;
        this.n = reTrackSimplify;
    }

    public jfm b(List<njj> list) {
        this.g = list;
        return this;
    }

    public jfm c(List<njj> list) {
        this.f = list;
        return this;
    }

    public ArrayList<LatLong> c() {
        LatLong latLongB;
        LogUtil.a("Track_TrackDataFilter", "go into convertReTrackData");
        MotionPath motionPath = this.i;
        if (motionPath == null || motionPath.requestLbsDataMap() == null || this.j == null) {
            return new ArrayList<>(16);
        }
        this.d.c(this.i).d(this.j);
        ArrayList<Double> arrayListG = this.d.g();
        this.f38549b = arrayListG;
        if (arrayListG == null || arrayListG.size() <= 0) {
            return new ArrayList<>(16);
        }
        this.e.d();
        ArrayList<LatLong> arrayList = new ArrayList<>(300);
        Map<Long, double[]> mapE = izt.e(this.i.requestLbsDataMap(), this.h);
        this.f38550c = this.i.requestLbsDataMap().size();
        LogUtil.a("Track_TrackDataFilter", "curve data size is " + this.f38549b.size());
        LogUtil.a("Track_TrackDataFilter", "original gps data size is " + mapE.size());
        int i = -1;
        for (Map.Entry<Long, double[]> entry : mapE.entrySet()) {
            i++;
            try {
                if (entry.getValue() != null && entry.getValue().length >= 2) {
                    if (jfn.a(entry.getValue()[0], entry.getValue()[1])) {
                        if (arrayList.size() > 0) {
                            arrayList.get(arrayList.size() - 1).setLineStatus(-1);
                        }
                    } else if (!jfn.b(entry.getValue()[0], entry.getValue()[1]) && (latLongB = b(i, entry)) != null) {
                        this.e.a(latLongB);
                        arrayList.add(latLongB);
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
                LogUtil.j("Track_TrackDataFilter", "IndexOutOfBoundsException");
            }
        }
        if (arrayList.size() > 0 && this.f38549b.size() > 0) {
            LatLong latLong = arrayList.get(arrayList.size() - 1);
            ArrayList<Double> arrayList2 = this.f38549b;
            latLong.setMultiplexField(arrayList2.get(arrayList2.size() - 1).doubleValue());
        }
        LogUtil.a("Track_TrackDataFilter", "go out convertReTrackData");
        return arrayList;
    }

    private LatLong b(int i, Map.Entry<Long, double[]> entry) {
        if (i >= this.f38549b.size() || this.f38549b.get(i) == null) {
            return null;
        }
        return new LatLong(entry.getValue()[0], entry.getValue()[1], (Double.isInfinite(this.f38549b.get(i).doubleValue()) || Double.isNaN(this.f38549b.get(i).doubleValue())) ? 0.0d : this.f38549b.get(i).doubleValue()).setLineStatus(1);
    }

    public void e(int i) {
        ReTrackSimplify reTrackSimplify;
        LogUtil.a("Track_TrackDataFilter", "go into keyDataFilling");
        if (this.j == null || (reTrackSimplify = this.n) == null) {
            LogUtil.j("Track_TrackDataFilter", "Motion Path Simplify data is null");
        } else {
            reTrackSimplify.setMaxBoundary(this.e.c()).setMinBoundary(this.e.e()).setCenterPoint(this.e.b()).setStartTimeStamp(this.j.requestStartTime()).setValidTotalDistance(this.j.requestTotalDistance()).setTotalTime(this.j.requestTotalTime()).setTotalCalories(this.j.requestTotalCalories()).setAvgSpeedField(f()).setMaxHeartRate(c(i)).setMaxAltitude(d(i)).setMaxSpeedField(h(i)).setSportType(this.j.requestSportType()).setAvgUpSlope((int) this.j.getExtendDataFloat("avgUpSlope", 101.0f)).setCreepingWave(jho.b(((double) this.j.requestCreepingWave()) / 10.0d, this.d.f()).doubleValue()).setCurveType(this.d.d()).setMaxSpeedType(this.d.i()).setAvgSpeedType(this.d.a()).setDeviceId(this.f38548a).setProductId(this.j.requestProductId()).setSubProductId(this.j.requestSubProductId()).setIsTrackComplete(d());
            LogUtil.a("Track_TrackDataFilter", "go out keyDataFilling");
        }
    }

    public LatLong a() {
        return this.e.c();
    }

    public LatLong b() {
        return this.e.e();
    }

    public double e() {
        return this.e.a();
    }

    private Pair<Integer, Double> c(int i) {
        if (this.d.b().c().intValue() != -1 && this.f38550c - 1 > 0) {
            this.d.b().d(Integer.valueOf((this.d.b().c().intValue() * (i - 1)) / (this.f38550c - 1)));
        }
        return new Pair<>(this.d.b().c(), this.d.b().a());
    }

    private void j() {
        MotionPathSimplify motionPathSimplify = this.j;
        if (motionPathSimplify != null && jpq.e(motionPathSimplify.requestMinAltitude(), this.j.requestMaxAltitude())) {
            this.d.e().e(Double.valueOf(this.j.requestMaxAltitude()));
        }
    }

    private Pair<Integer, Double> d(int i) {
        j();
        if (this.d.e().c().intValue() != -1 && this.f38550c - 1 > 0) {
            this.d.e().d(Integer.valueOf((this.d.e().c().intValue() * (i - 1)) / (this.f38550c - 1)));
        }
        if (this.d.e().a().doubleValue() >= 8440.0d) {
            this.d.e().d(-1);
        }
        return new Pair<>(this.d.e().c(), this.d.e().a());
    }

    private Pair<Integer, Double> h(int i) {
        if (this.j == null) {
            LogUtil.j("Track_TrackDataFilter", "data is null");
            return new Pair<>(-1, Double.valueOf(0.0d));
        }
        g();
        if (this.d.c().c().intValue() != -1 && this.f38550c - 1 > 0) {
            this.d.c().d(Integer.valueOf((this.d.c().c().intValue() * (i - 1)) / (this.f38550c - 1)));
        }
        return new Pair<>(this.d.c().c(), this.d.c().a());
    }

    private double f() {
        if (this.j == null) {
            LogUtil.j("Track_TrackDataFilter", "data is null");
            return -1.0d;
        }
        if (this.d.a() == 18) {
            return this.j.requestAvgStepRate();
        }
        if (this.d.a() == 16) {
            return this.j.requestAvgPace();
        }
        return 3600.0d / ((double) this.j.requestAvgPace());
    }

    private boolean d() {
        List<njj> list = this.f;
        if (list == null) {
            LogUtil.d("Track_TrackDataFilter", "mOriginalPaceList is null");
            return true;
        }
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        int i2 = 0;
        for (njj njjVar : list) {
            int iC = njjVar.c() / 1000;
            int iE = njjVar.e();
            if (iE != i) {
                z = true;
            } else if (iC > i2 + 20) {
                z = false;
            }
            if (z2 && iC >= 100) {
                if (iE == 0) {
                    return false;
                }
                z2 = false;
            }
            i = iE;
            i2 = iC;
        }
        return z;
    }

    private void g() {
        List<njj> list = this.g;
        if (list == null || list.size() < 1) {
            if (this.d.i() == 16) {
                if (this.d.c().a().doubleValue() < 1.0E-6d) {
                    this.d.c().e(Double.valueOf((this.j.requestTotalTime() * 1.0d) / ((double) this.j.requestTotalDistance())));
                    return;
                } else {
                    this.d.c().e(Double.valueOf(3600.0d / this.d.c().a().doubleValue()));
                    return;
                }
            }
            return;
        }
        Float[] fArrB = njv.b(this.g);
        if (this.d.i() == 17 && this.d.j() == -1) {
            if (fArrB[0].floatValue() < 1.0E-6d) {
                this.d.c().e(Double.valueOf((this.j.requestTotalTime() * 1.0d) / ((double) this.j.requestTotalDistance())));
            } else {
                double dFloatValue = 3600.0d / ((double) fArrB[0].floatValue());
                if (UnitUtil.f()) {
                    dFloatValue = UnitUtil.c(dFloatValue, 3);
                }
                this.d.c().e(Double.valueOf(dFloatValue));
            }
        }
        if (this.d.i() == 16) {
            this.d.c().e(Double.valueOf(fArrB[0].floatValue()));
        }
    }

    public jfm a(int i) {
        this.f38548a = i;
        return this;
    }

    public jfm b(int i) {
        this.h = i;
        return this;
    }
}
