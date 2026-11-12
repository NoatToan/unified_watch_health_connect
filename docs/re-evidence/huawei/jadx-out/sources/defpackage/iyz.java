package defpackage;

import android.os.SystemClock;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportDistanceTimeCallback;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class iyz implements ISportStateChangeListener, ISportDistanceTimeCallback {
    private static final Object d = new Object();
    private Map<Double, Double> v = new TreeMap();
    private Map<Double, Double> e = new TreeMap();
    private Map<Integer, Float> u = new TreeMap();
    private Map<Integer, Float> ae = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, Float> f38229a = new TreeMap();
    private Map<Integer, Float> af = new TreeMap();
    private Map<Integer, Float> ab = new TreeMap();
    private Map<Integer, Float> z = new TreeMap();
    private List<njj> y = new ArrayList();
    private List<njj> ag = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<njj> f38231c = new ArrayList();
    private List<njj> ad = new ArrayList();
    private List<njj> aa = new ArrayList();
    private List<njj> ac = new ArrayList();
    private long q = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38230b = 0;
    private long f = 0;
    private long g = 0;
    private long p = 0;
    private long m = 0;
    private long x = 0;
    private long s = 0;
    private long r = 0;
    private int o = 0;
    private int t = 0;
    private long w = 0;
    private float h = 0.3f;
    private boolean n = false;
    private boolean l = false;
    private long j = 0;
    private iyx i = new iyx();
    private iwp k = null;

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
    }

    public void a(int i, int i2, boolean z) {
        if (this.s == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.s = jCurrentTimeMillis;
            this.p = jCurrentTimeMillis - (this.j - (((long) a(0, c(0))) * 1000));
            this.m = this.s - (this.j - (((long) a(1, c(1))) * 1000));
            ReleaseLogUtil.b("Track_PaceManager", "No mLastLocatedTime yet , recovery it");
        }
        synchronized (d) {
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            TreeMap treeMap3 = new TreeMap();
            TreeMap treeMap4 = new TreeMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                c(this.u, treeMap);
                c(this.ae, treeMap2);
                c(this.f38229a, treeMap3);
                c(this.af, treeMap4);
                e(this.y, arrayList);
                e(this.ag, arrayList2);
                e(this.f38231c, arrayList3);
                e(this.ad, arrayList4);
                b(i, this.s, i2);
                c(this.u, this.ab);
                c(this.f38229a, this.z);
                e(this.y, this.aa);
                e(this.f38231c, this.ac);
                c(treeMap, this.u);
                c(treeMap2, this.ae);
                c(treeMap3, this.f38229a);
                c(treeMap4, this.af);
                e(arrayList, this.y);
                e(arrayList2, this.ag);
                e(arrayList3, this.f38231c);
                e(arrayList4, this.ad);
            } else {
                b(i, this.s, i2);
            }
        }
    }

    private void e(List<njj> list, List<njj> list2) {
        list2.clear();
        list2.addAll(list);
    }

    public boolean b(boolean z) {
        return !z || System.currentTimeMillis() - this.x > 30000;
    }

    private void c(Map<Integer, Float> map, Map<Integer, Float> map2) {
        map2.clear();
        map2.putAll(map);
    }

    public void a(Map<Integer, Float> map, Map<Integer, Float> map2) {
        LogUtil.d("Track_PaceManager", this.u, " ", Long.valueOf(this.s));
        if (map != null) {
            this.u.clear();
            this.u.putAll(map);
            LogUtil.a("Track_PaceManager", "recoveryPaceMap paceMap");
        }
        if (map2 != null) {
            this.f38229a.clear();
            this.f38229a.putAll(map2);
            LogUtil.a("Track_PaceManager", "recoveryPaceMap mBritishPaceMap");
        }
        this.x = System.currentTimeMillis();
    }

    public void c(List<njj> list, List<njj> list2) {
        if (!CollectionUtils.a(list)) {
            this.y.clear();
            this.y.addAll(list);
            LogUtil.a("Track_PaceManager", "recoveryPaceList mPaceDataList", list);
        }
        if (CollectionUtils.a(list2)) {
            return;
        }
        this.f38231c.clear();
        this.f38231c.addAll(list2);
        LogUtil.a("Track_PaceManager", "recoveryPaceList mBriPaceDataList", list);
    }

    public void d(Map<Double, Double> map, Map<Double, Double> map2) {
        Map<Double, Double> map3 = this.v;
        if (map3 == null || this.e == null) {
            return;
        }
        if (map != null) {
            map3.clear();
            this.v.putAll(map);
            LogUtil.a("Track_PaceManager", "recoveryPartTimeMap mNormalPartTimeMap");
        }
        if (map2 != null) {
            this.e.clear();
            this.e.putAll(map2);
            LogUtil.a("Track_PaceManager", "recoveryPartTimeMap mBritishPartTimeMap size");
        }
        this.o = c(0);
        this.t = c(1);
        if (this.v.containsKey(Double.valueOf(42.195d)) && this.v.containsKey(Double.valueOf(21.0975d))) {
            this.l = true;
            this.n = true;
        } else if (this.v.containsKey(Double.valueOf(21.0975d))) {
            this.n = true;
            this.l = false;
        } else {
            this.n = false;
            this.l = false;
        }
    }

    private int c(int i) {
        int size;
        Map<Double, Double> map;
        Map<Double, Double> map2;
        if (i != 0 || (map2 = this.v) == null) {
            size = 0;
        } else {
            size = map2.size();
            if (this.v.containsKey(Double.valueOf(21.0975d))) {
                size--;
            }
            if (this.v.containsKey(Double.valueOf(42.195d))) {
                size--;
            }
        }
        if (i != 1 || (map = this.e) == null) {
            return size;
        }
        int size2 = map.size();
        if (this.e.containsKey(Double.valueOf(13.1099865d))) {
            size2--;
        }
        return this.e.containsKey(Double.valueOf(26.219973d)) ? size2 - 1 : size2;
    }

    public void c(long j) {
        if (j > 0) {
            this.j = j;
        }
        LogUtil.a("Track_PaceManager", "mCrashSportDuration = ", Long.valueOf(this.j));
    }

    private void b(double d2, double d3) {
        LogUtil.a("Track_PaceManager", "before updateNormalPartTimeMap");
        if (this.v == null) {
            this.v = new TreeMap();
        }
        synchronized (d) {
            e(d2, d3);
        }
        LogUtil.a("Track_PaceManager", "after updateNormalPartTimeMap");
    }

    private void e(double d2, double d3) {
        if (d2 != 21.0975d && d2 != 42.195d) {
            double d4 = this.o;
            double d5 = d2 - d4;
            if (d5 <= 1.0d) {
                if (d5 == 1.0d) {
                    this.v.put(Double.valueOf(d2), Double.valueOf(d3));
                    this.o++;
                    return;
                } else {
                    LogUtil.a("Track_PaceManager", "updateNormalPartTimeMap less than 1km");
                    return;
                }
            }
            double dA = a(0, d4);
            int i = this.o;
            double d6 = (d3 - dA) / (d2 - ((double) i));
            double d7 = dA + d6;
            while (true) {
                i++;
                double d8 = i;
                if (d8 > d2) {
                    return;
                }
                this.v.put(Double.valueOf(d8), Double.valueOf(d7));
                d7 += d6;
                this.o++;
            }
        } else {
            this.v.put(Double.valueOf(d2), Double.valueOf(d3));
        }
    }

    private void d(double d2, double d3) {
        LogUtil.a("Track_PaceManager", "before updateBritishPartTimeMap");
        if (this.e == null) {
            this.e = new TreeMap();
        }
        synchronized (d) {
            c(d2, d3);
        }
        LogUtil.a("Track_PaceManager", "after updateBritishPartTimeMap");
    }

    private void c(double d2, double d3) {
        if (d2 != 13.1099865d && d2 != 26.219973d) {
            double d4 = this.t;
            double d5 = d2 - d4;
            if (d5 <= 1.0d) {
                if (d5 == 1.0d) {
                    this.e.put(Double.valueOf(d2), Double.valueOf(d3));
                    this.t++;
                    return;
                } else {
                    LogUtil.a("Track_PaceManager", "updateBritishPartTimeMap less than 1km");
                    return;
                }
            }
            double dA = a(1, d4);
            int i = this.t;
            double d6 = d3 - (dA / (d2 - ((double) i)));
            double d7 = dA + d6;
            int i2 = i + 1;
            while (true) {
                double d8 = i2;
                if (d8 > d2) {
                    return;
                }
                this.e.put(Double.valueOf(d8), Double.valueOf(d7));
                d7 += d6;
                this.t++;
                i2++;
            }
        } else {
            this.e.put(Double.valueOf(d2), Double.valueOf(d3));
        }
    }

    private void d(int i, float f, int i2) {
        synchronized (d) {
            char c2 = 2;
            char c3 = 3;
            ReleaseLogUtil.c("Track_PaceManager", "before updatePaceMap", Integer.valueOf(this.y.size()), " duration=", Float.valueOf(f));
            int size = this.y.size();
            int i3 = i - size;
            if (i3 > 1) {
                float f2 = f / i3;
                int i4 = size + 1;
                while (i4 <= i) {
                    int i5 = i4 * 1000;
                    int iB = b(i5, i2);
                    if (iB != -1) {
                        Object[] objArr = new Object[4];
                        objArr[0] = " updatePaceMap, index";
                        objArr[1] = Integer.valueOf(iB);
                        objArr[c2] = " duration=";
                        objArr[c3] = Float.valueOf(f);
                        ReleaseLogUtil.e("Track_PaceManager", objArr);
                        this.u.put(Integer.valueOf(iB), Float.valueOf(f2));
                        this.ae.put(Integer.valueOf(iB), Float.valueOf(f2));
                    }
                    this.y.add(new njj(i5, i2, f2));
                    this.ag.add(new njj(i5, i2, f2));
                    i4++;
                    c2 = 2;
                    c3 = 3;
                }
            } else if (i3 == 1) {
                int i6 = i * 1000;
                int iB2 = b(i6, i2);
                if (iB2 != -1) {
                    ReleaseLogUtil.e("Track_PaceManager", " updatePaceMap, index", Integer.valueOf(iB2), " duration=", Float.valueOf(f));
                    this.u.put(Integer.valueOf(iB2), Float.valueOf(f));
                    this.ae.put(Integer.valueOf(iB2), Float.valueOf(f));
                }
                this.y.add(new njj(i6, i2, f));
                this.ag.add(new njj(i6, i2, f));
            } else {
                LogUtil.a("Track_PaceManager", "updatePaceMap less than 1km");
            }
            LogUtil.a("Track_PaceManager", "after updatePaceMap, mPaceDataList: ", this.y);
        }
    }

    private void b(int i, float f, int i2) {
        synchronized (d) {
            LogUtil.a("Track_PaceManager", "before updateBritishPaceMap", Integer.valueOf(this.f38231c.size()), " duration=", Long.valueOf((long) f));
            int size = this.f38231c.size();
            int i3 = i - size;
            if (i3 > 1) {
                float f2 = f / i3;
                for (int i4 = size + 1; i4 <= i; i4++) {
                    int i5 = i4 * 1000;
                    int iB = b(i5, i2);
                    if (iB != -1) {
                        this.f38229a.put(Integer.valueOf(iB), Float.valueOf(f2));
                        this.af.put(Integer.valueOf(iB), Float.valueOf(f2));
                    }
                    this.f38231c.add(new njj(i5, i2, f2));
                    this.ad.add(new njj(i5, i2, f2));
                }
            } else if (i3 == 1) {
                int i6 = i * 1000;
                int iB2 = b(i6, i2);
                if (iB2 != -1) {
                    this.f38229a.put(Integer.valueOf(iB2), Float.valueOf(f));
                    this.af.put(Integer.valueOf(iB2), Float.valueOf(f));
                }
                this.f38231c.add(new njj(i6, i2, f));
                this.ad.add(new njj(i6, i2, f));
            } else {
                LogUtil.a("Track_PaceManager", "updateBritishPaceMap less than 1km");
            }
            LogUtil.a("Track_PaceManager", "after updateBritishPaceMap");
        }
    }

    private void b(int i, long j, int i2) {
        e(i, j, i2);
        a(i, j, i2);
        LogUtil.e("Track_PaceManager", "before addZeroPace, distance:", Integer.valueOf(i), " time:", Long.valueOf(j), " locationNums:", Integer.valueOf(i2));
        int i3 = i % 10;
        int i4 = i3 >= 5 ? (i + 10) - i3 : i;
        int iB = b(i4, i2);
        float size = i4 - (this.y.size() * 1000);
        float fD = (float) jaa.d((j - this.p) - this.q);
        if (size >= 1.0f && fD > 0.0f) {
            float fC = size < 5.0f ? (c(this.o, 0) / 1000) + fD : fD / (size / 1000.0f);
            ReleaseLogUtil.e("Track_PaceManager", " addZeroPace, index", Integer.valueOf(iB), " pace=", Float.valueOf(fC));
            if (iB != -1) {
                this.u.put(Integer.valueOf(iB), Float.valueOf(fC));
                this.ae.put(Integer.valueOf(iB), Float.valueOf(fC));
            }
            this.y.add(new njj(i4, i2, fC));
            this.ag.add(new njj(i4, i2, fC));
            LogUtil.a("Track_PaceManager", "after updatePaceMap, mPaceDataList: ", qqt.b(this.y));
        }
        int iF = (int) jaa.f(i);
        int i5 = iF % 10;
        if (i5 >= 5) {
            iF = (iF + 10) - i5;
        }
        int iB2 = b(iF, i2);
        float size2 = iF - (this.f38231c.size() * 1000);
        float fD2 = (float) jaa.d((j - this.m) - this.f38230b);
        if (size2 >= 1.0f && fD2 > 0.0f) {
            float fC2 = size2 < 5.0f ? (c(this.t, 1) / 1000) + fD2 : fD2 / (size2 / 1000.0f);
            if (iB2 != -1) {
                this.f38229a.put(Integer.valueOf(iB2), Float.valueOf(fC2));
                this.af.put(Integer.valueOf(iB2), Float.valueOf(fC2));
            }
            this.f38231c.add(new njj(iF, i2, fC2));
            this.ad.add(new njj(iF, i2, fC2));
            LogUtil.a("Track_PaceManager", "after updatePaceMap, mBriPaceDataList: ", qqt.b(this.f38231c));
        }
        LogUtil.a("Track_PaceManager", "after addBritishZeroPace");
    }

    public long d(int i) {
        if (UnitUtil.f()) {
            return c((int) UnitUtil.e((((double) i) * 1.0d) / 1000.0d, 3), 1);
        }
        return c(i / 1000, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    public long c(int i, int i2) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        if (i2 == 1) {
            if (i > this.t) {
                LogUtil.j("Track_PaceManager", "The ", Integer.valueOf(i), "miles is not update yet");
                return 1000L;
            }
            Map<Double, Double> map = this.e;
            if (map == null || map.size() <= 0) {
                dDoubleValue3 = 0.0d;
            } else if (this.e.size() == 1) {
                dDoubleValue3 = this.e.get(Double.valueOf(i)).doubleValue();
            } else {
                dDoubleValue = this.e.get(Double.valueOf(i)).doubleValue();
                dDoubleValue2 = this.e.get(Double.valueOf(i - 1)).doubleValue();
                dDoubleValue3 = dDoubleValue - dDoubleValue2;
            }
        } else {
            if (i > this.o) {
                LogUtil.j("Track_PaceManager", "The ", Integer.valueOf(i), "kilos is not update yet");
                return 1000L;
            }
            Map<Double, Double> map2 = this.v;
            if (map2 == null || map2.size() <= 0) {
                dDoubleValue3 = 0.0d;
            } else if (this.v.size() == 1) {
                dDoubleValue3 = this.v.get(Double.valueOf(i)).doubleValue();
            } else {
                dDoubleValue = this.v.get(Double.valueOf(i)).doubleValue();
                dDoubleValue2 = this.v.get(Double.valueOf(i - 1)).doubleValue();
                dDoubleValue3 = dDoubleValue - dDoubleValue2;
            }
        }
        if (dDoubleValue3 < 1.0d) {
            return 1000L;
        }
        return (long) (dDoubleValue3 * 1000.0d);
    }

    public Map<Double, Double> f() {
        TreeMap treeMap;
        synchronized (d) {
            treeMap = new TreeMap(this.v);
        }
        return treeMap;
    }

    public void a(Map<Double, Double> map) {
        this.v = map;
    }

    public Map<Double, Double> b() {
        TreeMap treeMap;
        synchronized (d) {
            treeMap = new TreeMap(this.e);
        }
        return treeMap;
    }

    public void c(Map<Double, Double> map) {
        this.e = map;
    }

    public Map<Integer, Float> i() {
        TreeMap treeMap;
        synchronized (d) {
            treeMap = new TreeMap(this.u);
        }
        return treeMap;
    }

    public void d(Map<Integer, Float> map) {
        this.u = map;
    }

    public void e(List<njj> list) {
        this.y = list;
    }

    public List<njj> h() {
        ArrayList arrayList;
        synchronized (d) {
            arrayList = new ArrayList(this.y);
        }
        return arrayList;
    }

    public void c(List<njj> list) {
        this.f38231c = list;
    }

    public List<njj> e() {
        ArrayList arrayList;
        synchronized (d) {
            arrayList = new ArrayList(this.f38231c);
        }
        return arrayList;
    }

    public List<njj> m() {
        ArrayList arrayList;
        synchronized (d) {
            arrayList = new ArrayList(this.aa);
        }
        return arrayList;
    }

    public List<njj> k() {
        ArrayList arrayList;
        synchronized (d) {
            arrayList = new ArrayList(this.ac);
        }
        return arrayList;
    }

    public void e(Map<Integer, Float> map) {
        this.f38229a = map;
    }

    public Map<Integer, Float> d() {
        TreeMap treeMap;
        synchronized (d) {
            treeMap = new TreeMap(this.f38229a);
        }
        return treeMap;
    }

    public Map<Integer, Float> o() {
        TreeMap treeMap;
        synchronized (d) {
            treeMap = new TreeMap(this.ab);
        }
        return treeMap;
    }

    public Map<Integer, Float> l() {
        TreeMap treeMap;
        synchronized (d) {
            treeMap = new TreeMap(this.z);
        }
        return treeMap;
    }

    public Map<Integer, Float> d(boolean z) {
        TreeMap treeMap = new TreeMap();
        Map<Integer, Float> map = this.ae;
        if (map != null) {
            treeMap.putAll(map);
            if (z) {
                this.ae.clear();
            }
        }
        return treeMap;
    }

    public Map<Integer, Float> a(boolean z) {
        TreeMap treeMap = new TreeMap();
        Map<Integer, Float> map = this.af;
        if (map != null) {
            treeMap.putAll(map);
            if (z) {
                this.af.clear();
            }
        }
        return treeMap;
    }

    public List<njj> c(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<njj> list = this.ag;
        if (list != null) {
            arrayList.addAll(list);
            if (z) {
                this.ag.clear();
            }
        }
        return arrayList;
    }

    public List<njj> e(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<njj> list = this.ad;
        if (list != null) {
            arrayList.addAll(list);
            if (z) {
                this.ad.clear();
            }
        }
        return arrayList;
    }

    private void a(double d2, double d3) {
        if (d2 >= 21.0975d && !this.n) {
            LogUtil.a("Track_PaceManager", "update partTimeMap HALF_MARATHON distance: ", Integer.valueOf((int) d2), " duration: ", Long.valueOf((long) d3));
            b(21.0975d, d3);
            d(13.1099865d, d3);
            this.n = true;
            return;
        }
        if (d2 < 42.195d || this.l) {
            return;
        }
        LogUtil.a("Track_PaceManager", "update partTimeMap FULL_MARATHON distance: ", Integer.valueOf((int) d2), " duration: ", Long.valueOf((long) d3));
        b(42.195d, d3);
        d(26.219973d, d3);
        this.l = true;
    }

    private double a(int i, double d2) {
        Map<Double, Double> map;
        Map<Double, Double> map2;
        double dDoubleValue = (i == 0 && (map2 = this.v) != null && map2.containsKey(Double.valueOf(d2))) ? this.v.get(Double.valueOf(d2)).doubleValue() : 0.0d;
        if (i == 1 && (map = this.e) != null && map.containsKey(Double.valueOf(d2))) {
            dDoubleValue = this.e.get(Double.valueOf(d2)).doubleValue();
        }
        ReleaseLogUtil.c("Track_PaceManager", "total spend ", Double.valueOf(dDoubleValue), " key: ", Double.valueOf(d2));
        return dDoubleValue;
    }

    private static int b(int i, int i2) {
        ReleaseLogUtil.e("Track_PaceManager", " getPaceIndex distance:", Integer.valueOf(i), " locationNum:", Integer.valueOf(i2));
        if (i / 1000 > 214) {
            ReleaseLogUtil.e("Track_PaceManager", " pace", " getPaceIndex UNIT_TYPE_NORMAL over pace value max! dis:", Integer.valueOf(i));
            return -1;
        }
        int i3 = i / 10;
        if (i2 == 0) {
            i2 = 0;
        }
        if (i2 > 60000) {
            LogUtil.e("Track_PaceManager", " pace", " updatePacesData over point value max! point:", Integer.valueOf(i2));
            return -1;
        }
        int i4 = (100000 * i3) + i2;
        ReleaseLogUtil.e("Track_PaceManager", " getPaceIndex index:", Integer.valueOf(i4), " currentDistance:", Integer.valueOf(i3), "pointIndex:", Integer.valueOf(i2));
        return i4;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportDistanceTimeCallback
    public void onDistanceChange(int i, long j, int i2) {
        this.i.c(i, j);
        if (d(j)) {
            this.r = j;
            return;
        }
        if (j - this.r > 8000) {
            ReleaseLogUtil.c("Track_PaceManager", "distance=", Integer.valueOf(i), " time=", Long.valueOf(j), " location=", Integer.valueOf(i2));
            this.r = j;
        }
        this.s = j;
        n();
        e(i, j, i2);
        a(i, j, i2);
        if (this.n && this.l) {
            return;
        }
        a(((double) i) / 1000.0d, jaa.d((j - this.p) - this.q) + a(0, i / 1000));
    }

    private void e(int i, long j, int i2) {
        if (jaa.c(i) >= this.o + 1) {
            double d2 = jaa.d((j - this.p) - this.q);
            int iC = jaa.c(i);
            double dB = b(i / 1000.0f, this.o, d2, 0);
            b(iC, a(0, this.o) + dB);
            d(iC, (float) dB, i2);
            this.p = j - ((long) ((d2 - dB) * 1000.0d));
            this.q = 0L;
        }
    }

    private void a(int i, long j, int i2) {
        if (jaa.a(i) >= this.t + 1) {
            double d2 = jaa.d((j - this.m) - this.f38230b);
            double dB = b(((float) jaa.f(i)) / 1000.0f, this.t, d2, 1);
            d(jaa.a(i), a(1, this.t) + dB);
            b(jaa.a(i), (float) dB, i2);
            this.m = j - ((long) ((d2 - dB) * 1000.0d));
            this.f38230b = 0L;
        }
    }

    private double b(float f, float f2, double d2, int i) {
        double dC;
        if (d2 < 1.0d) {
            LogUtil.j("Track_PaceManager", "correctSportTime lastKiloTime < 1");
            dC = c((int) f2, i) / 1000.0d;
            LogUtil.a("Track_PaceManager", "correctSportTime lastKiloTime is correct to ", Long.valueOf((long) dC));
        } else {
            dC = d2;
        }
        float f3 = (int) f;
        if (f - f3 > this.h) {
            float f4 = f - f2;
            if (f4 > 0.0f) {
                dC = (dC * ((double) (f3 - f2))) / ((double) f4);
            }
        }
        LogUtil.a("Track_PaceManager", "correctSportTime: curDistance = ", Float.valueOf(f), " lastKiloTime = ", Double.valueOf(d2), " duration = ", Double.valueOf(dC));
        return dC;
    }

    private boolean d(long j) {
        boolean z = false;
        if (this.g == 0) {
            this.g = j;
            boolean z2 = true;
            if (this.f38229a.size() > 0) {
                this.m = Math.min(j - (this.j - ((long) (a(1, this.t) * 1000.0d))), j);
                z2 = false;
            } else {
                this.m = j - this.j;
            }
            if (this.u.size() > 0) {
                this.p = Math.min(j - (this.j - ((long) (a(0, this.o) * 1000.0d))), j);
            } else {
                this.p = j - this.j;
                z = z2;
            }
            LogUtil.a("Track_PaceManager", "CurTime = ", Long.valueOf(j), " lastNormalPartTime = ", Long.valueOf(this.p), " lastBritishPartTime = ", Long.valueOf(this.m));
        }
        return z;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.w = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        if (this.p == 0) {
            ReleaseLogUtil.c("Track_PaceManager", "Pause-Resume before located, don't calculate the rest time");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.w;
        long j2 = jElapsedRealtime - j;
        LogUtil.a("Track_PaceManager", "onResumeSport ", Long.valueOf(j2), "pauseTime - resumeTime : ", Long.valueOf(j), Constants.LINK, Long.valueOf(SystemClock.elapsedRealtime()));
        this.f += j2;
    }

    private void n() {
        long j = this.f;
        if (j > 0) {
            this.q += j;
            this.f38230b += j;
            this.f = 0L;
        }
    }

    public float a() {
        float fC = this.i.c();
        LogUtil.d("Track_PaceManager", "old speed:" + fC);
        iwp iwpVar = this.k;
        return (iwpVar == null || !iwpVar.h() || this.k.b()) ? fC : this.k.a();
    }

    public float j() {
        return this.i.c();
    }

    public float g() {
        iwp iwpVar = this.k;
        if (iwpVar == null) {
            return 0.0f;
        }
        return iwpVar.a();
    }

    public void c() {
        this.i.e();
    }

    public void a(iwp iwpVar) {
        this.k = iwpVar;
    }
}
