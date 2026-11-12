package com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel.HotRouteCalculate;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gdm;
import defpackage.iys;
import defpackage.izt;
import defpackage.njy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HotRouteCalculate extends iys {
    private List<GpsPoint> e;
    private List<GpsPoint> f;
    private a i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f10470a = 111194.9375d;
    private double j = 2.2483037953054293E-4d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f10471c = 2.2483037953054293E-4d;
    private double h = -1.0d;

    public interface CalculateAnchorPointInterface<T> {
        T calculateAnchorPoint(List<T> list, int i, double d);
    }

    public interface CalculateDistanceInterface<T> {
        double calculateDistance(T t, T t2);
    }

    private double b(double d) {
        return d * 0.6d;
    }

    @Override // defpackage.iys
    public void e(final gdm gdmVar) {
        if (gdmVar == null) {
            LogUtil.e("Track_HotRouteCalculate", "hotPathDetailInfo is null in initParams");
            return;
        }
        super.e(gdmVar);
        this.f = gdmVar.p();
        this.h = gdmVar.y();
        ThreadPoolManager.c().execute(new Runnable() { // from class: iyu
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(gdmVar);
            }
        });
    }

    @Override // defpackage.iys
    public boolean d(Map<Long, double[]> map, int i) {
        return a(map, i);
    }

    @Override // defpackage.iys
    public void e() {
        super.e();
        List<GpsPoint> list = this.e;
        if (list != null) {
            list.clear();
        }
        List<GpsPoint> list2 = this.f;
        if (list2 != null) {
            list2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(gdm gdmVar) {
        GpsPoint gpsPointK;
        if (gdmVar == null) {
            LogUtil.e("Track_HotRouteCalculate", "hotPathDetail info is null, return");
            return;
        }
        List<GpsPoint> listP = gdmVar.p();
        if (gdmVar.k() != null) {
            gpsPointK = gdmVar.k();
        } else {
            if (!njy.b(gdmVar.p())) {
                LogUtil.e("Track_HotRouteCalculate", "hotPathDetailInfo is null && pathPoints is null");
                return;
            }
            gpsPointK = gdmVar.p().get(0);
        }
        e(gpsPointK);
        e(listP, gpsPointK);
        this.e = d(listP);
    }

    private void e(List<GpsPoint> list, GpsPoint gpsPoint) {
        this.i = new a(gpsPoint.getLatitude(), gpsPoint.getLatitude(), gpsPoint.getLongitude(), gpsPoint.getLongitude());
        if (njy.b(list)) {
            for (GpsPoint gpsPoint2 : list) {
                this.i.c(gpsPoint2.getLatitude(), gpsPoint2.getLongitude());
            }
        }
        this.i.a(this.f10471c, this.j);
    }

    private void e(GpsPoint gpsPoint) {
        this.f10470a = Math.cos(BigDecimal.valueOf(gpsPoint.getLatitude()).multiply(BigDecimal.valueOf(3.141592653589793d)).divide(BigDecimal.valueOf(180.0d), 7, 4).doubleValue()) * 111194.9375d;
        double dSqrt = Math.sqrt(1525.0d);
        this.j = dSqrt / this.f10470a;
        this.f10471c = dSqrt / 111194.9375d;
    }

    private boolean a(Map<Long, double[]> map, double d) {
        if (d < b(this.h)) {
            LogUtil.a("Track_HotRouteCalculate", "user distance is smaller than the hot path distance, return");
            return false;
        }
        if (map == null || map.size() == 0) {
            LogUtil.a("Track_HotRouteCalculate", "lbsData is empty, return false");
            return false;
        }
        if (njy.e(this.f)) {
            LogUtil.a("Track_HotRouteCalculate", "pathPoints is null, return false");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zD = d(map, this.f);
        double dCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis;
        this.d.put("totalTime", String.valueOf(dCurrentTimeMillis));
        LogUtil.a("Track_HotRouteCalculate", "match calculate time cost is ", Double.valueOf(dCurrentTimeMillis));
        return zD;
    }

    private boolean d(Map<Long, double[]> map, List<GpsPoint> list) {
        List<GpsPoint> list2 = this.e;
        List<GpsPoint> list3 = (list2 == null || list2.isEmpty()) ? list : this.e;
        LogUtil.a("Track_HotRouteCalculate", "pathPoints size is ", Integer.valueOf(list.size()), "compress point size is ", Integer.valueOf(list3.size()));
        ArrayList<double[]> arrayList = new ArrayList<>((Collection<? extends double[]>) map.values());
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<double[]> listB = b(arrayList);
        double dCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis;
        LogUtil.a("Track_HotRouteCalculate", "compress user locations point cost is ", Double.valueOf(dCurrentTimeMillis), "userLocations count is ", Integer.valueOf(arrayList.size()), " compressLocations count is " + listB.size());
        this.d.put("trackLocationsCompressSize", String.valueOf(list3.size()));
        this.d.put("trackLocationsOriginalSize", String.valueOf(list.size()));
        this.d.put("userLocationsOriginalSize", String.valueOf(arrayList.size()));
        this.d.put("userLocationsCompressSize", String.valueOf(listB.size()));
        this.d.put("userLocationsCompressTime", String.valueOf(dCurrentTimeMillis));
        int size = (int) (((double) list3.size()) * 0.57d);
        int iE = 0;
        for (double[] dArr : listB) {
            a aVar = this.i;
            if (aVar == null || aVar.e(dArr[0], dArr[1])) {
                iE += e(dArr, list3);
                if (iE >= size) {
                    LogUtil.a("Track_HotRouteCalculate", "match point threshold, return true");
                    return true;
                }
            }
        }
        this.d.put("matchPointSize", String.valueOf(iE));
        LogUtil.a("Track_HotRouteCalculate", "matchPoint count is ", Integer.valueOf(iE), " point threshold is ", Integer.valueOf(size));
        return false;
    }

    private int e(double[] dArr, List<GpsPoint> list) {
        Iterator<GpsPoint> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            GpsPoint next = it.next();
            if (e(dArr[0], dArr[1], next.getLatitude(), next.getLongitude())) {
                i++;
                it.remove();
            }
        }
        return i;
    }

    private List<double[]> b(ArrayList<double[]> arrayList) {
        c(arrayList);
        if (arrayList.size() <= 2000) {
            LogUtil.a("Track_HotRouteCalculate", "userLocation smaller than 2000, no need to compress");
            return arrayList;
        }
        List<Double> listE = e(arrayList, new CalculateDistanceInterface() { // from class: iyo
            @Override // com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel.HotRouteCalculate.CalculateDistanceInterface
            public final double calculateDistance(Object obj, Object obj2) {
                return this.f38215c.b((double[]) obj, (double[]) obj2);
            }
        });
        final double[] dArr = arrayList.get(0);
        return c(arrayList, listE, 25.0d, new CalculateAnchorPointInterface() { // from class: iyt
            @Override // com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel.HotRouteCalculate.CalculateAnchorPointInterface
            public final Object calculateAnchorPoint(List list, int i, double d) {
                return HotRouteCalculate.b(dArr, list, i, d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ double b(double[] dArr, double[] dArr2) {
        return a(dArr[1], dArr[0], dArr2[1], dArr2[0]);
    }

    public static /* synthetic */ double[] b(double[] dArr, List list, int i, double d) {
        if (njy.e(list, i)) {
            LogUtil.e("Track_HotRouteCalculate", "userLocations out of bound, & index is ", Integer.valueOf(i));
            return dArr;
        }
        double[] dArr2 = (double[]) list.get(i);
        double[] dArr3 = (double[]) list.get(i - 1);
        double d2 = dArr2[0];
        double d3 = dArr3[0];
        double d4 = dArr2[1];
        double d5 = dArr3[1];
        return new double[]{((d2 - d3) * d) + d3, ((d4 - d5) * d) + d5};
    }

    private void c(List<double[]> list) {
        Iterator<double[]> it = list.iterator();
        while (it.hasNext()) {
            double[] next = it.next();
            if (izt.d(next[0], next[1])) {
                it.remove();
            }
        }
    }

    private List<GpsPoint> d(List<GpsPoint> list) {
        if (njy.e(list)) {
            LogUtil.a("Track_HotRouteCalculate", "trackLocations is empty, return");
            return Collections.EMPTY_LIST;
        }
        if (list.size() <= 2000) {
            LogUtil.a("Track_HotRouteCalculate", "trackLocation smaller than 2000, no need to compress");
            return list;
        }
        List<Double> listE = e(list, new CalculateDistanceInterface() { // from class: iyq
            @Override // com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel.HotRouteCalculate.CalculateDistanceInterface
            public final double calculateDistance(Object obj, Object obj2) {
                return this.f38219c.a((GpsPoint) obj, (GpsPoint) obj2);
            }
        });
        final GpsPoint gpsPoint = list.get(0);
        return c(list, listE, 25.0d, new CalculateAnchorPointInterface() { // from class: iyr
            @Override // com.huawei.healthcloud.plugintrack.manager.hwhealthalgormodel.HotRouteCalculate.CalculateAnchorPointInterface
            public final Object calculateAnchorPoint(List list2, int i, double d) {
                return HotRouteCalculate.c(gpsPoint, list2, i, d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ double a(GpsPoint gpsPoint, GpsPoint gpsPoint2) {
        return a(gpsPoint.getLongitude(), gpsPoint.getLatitude(), gpsPoint2.getLongitude(), gpsPoint2.getLatitude());
    }

    public static /* synthetic */ GpsPoint c(GpsPoint gpsPoint, List list, int i, double d) {
        if (njy.e(list, i)) {
            LogUtil.e("Track_HotRouteCalculate", "trackLocation out of bound, & index is ", Integer.valueOf(i));
            return gpsPoint;
        }
        GpsPoint gpsPoint2 = (GpsPoint) list.get(i);
        GpsPoint gpsPoint3 = (GpsPoint) list.get(i - 1);
        return new GpsPoint(((gpsPoint2.getLatitude() - gpsPoint3.getLatitude()) * d) + gpsPoint3.getLatitude(), ((gpsPoint2.getLongitude() - gpsPoint3.getLongitude()) * d) + gpsPoint3.getLongitude());
    }

    private <T> List<T> c(List<T> list, List<Double> list2, double d, CalculateAnchorPointInterface<T> calculateAnchorPointInterface) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            if (list2.get(i).doubleValue() > ((double) arrayList.size()) * d) {
                int i2 = i - 1;
                arrayList.add(calculateAnchorPointInterface.calculateAnchorPoint(list, i, ((((double) arrayList.size()) * d) - list2.get(i2).doubleValue()) / (list2.get(i).doubleValue() - list2.get(i2).doubleValue())));
            }
        }
        return arrayList;
    }

    private <T> List<Double> e(List<T> list, CalculateDistanceInterface<T> calculateDistanceInterface) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                arrayList.add(Double.valueOf(0.0d));
            } else {
                int i2 = i - 1;
                arrayList.add(Double.valueOf(calculateDistanceInterface.calculateDistance(list.get(i), list.get(i2)) + ((Double) arrayList.get(i2)).doubleValue()));
            }
        }
        return arrayList;
    }

    private double a(double d, double d2, double d3, double d4) {
        double dAbs = Math.abs(d - d3) * this.f10470a;
        double dAbs2 = Math.abs(d2 - d4) * 111194.9375d;
        return Math.sqrt((dAbs * dAbs) + (dAbs2 * dAbs2));
    }

    private boolean e(double d, double d2, double d3, double d4) {
        return Math.abs(d - d3) <= this.f10471c && Math.abs(d2 - d4) <= this.j;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f10472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f10473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f10474c;
        private double e;

        private a() {
            this(0.0d, 0.0d, 0.0d, 0.0d);
        }

        a(double d, double d2, double d3, double d4) {
            this.e = d;
            this.f10473b = d2;
            this.f10472a = d3;
            this.f10474c = d4;
        }

        public void c(double d, double d2) {
            this.f10474c = Math.min(this.f10474c, d2);
            this.f10472a = Math.max(this.f10472a, d2);
            this.f10473b = Math.min(this.f10473b, d);
            this.e = Math.max(this.e, d);
        }

        public boolean e(double d, double d2) {
            return this.f10473b <= d && d <= this.e && this.f10474c <= d2 && d2 <= this.f10472a;
        }

        public void a(double d, double d2) {
            this.f10474c -= d2;
            this.f10473b -= d;
            this.f10472a += d2;
            this.e += d;
        }
    }
}
