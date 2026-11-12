package com.huawei.healthcloud.plugintrack.ui.fragmentutils.trackanimationutil;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.profile.ProfileExtendConstants;
import defpackage.izt;
import defpackage.jqw;
import defpackage.njy;
import defpackage.qqn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SmoothMarkerUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11211a;
    private AMap e;
    private int g;
    private SmoothMarkerListner h;
    private Marker i;
    private double k;
    private List<jqw> d = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11212b = 5000;
    private List<List<e>> l = new ArrayList(16);
    private List<Polyline> m = new ArrayList(16);
    private List<List<List<LatLng>>> n = new ArrayList(16);
    private List<List<Long>> o = new ArrayList(16);
    private List<List<LatLng>> f = new ArrayList(16);
    private int j = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f11213c = new d(this);

    public interface SmoothMarkerListner {
        void onFinished();
    }

    private int c(int i, int i2, double d2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return (i6 + ((int) (d2 * ((double) ((i2 & 255) - i6))))) | ((i3 + ((int) (((double) (((i2 >> 24) & 255) - i3)) * d2))) << 24) | ((i4 + ((int) (((double) (((i2 >> 16) & 255) - i4)) * d2))) << 16) | ((i5 + ((int) (((double) (((i2 >> 8) & 255) - i5)) * d2))) << 8);
    }

    private long c(double d2, float f) {
        double d3 = f;
        if (d2 < d3) {
            return ProfileExtendConstants.TIME_OUT;
        }
        double d4 = d2 / d3;
        if (d4 > 7.0d) {
            return 7500L;
        }
        return ((long) ((d4 - 1.0d) * 1000.0d)) + ProfileExtendConstants.TIME_OUT;
    }

    public SmoothMarkerUtil(AMap aMap, LatLng latLng) {
        if (aMap == null || latLng == null) {
            throw new RuntimeException("SmoothMarkerUtil invalid params in constructor");
        }
        this.e = aMap;
        this.i = aMap.addMarker(new MarkerOptions().draggable(false).belowMaskLayer(true).position(latLng).icon(BitmapDescriptorFactory.fromBitmap(null)).title("").anchor(0.5f, 0.5f).visible(false));
    }

    public void e(List<jqw> list, float f) {
        if (njy.e(list)) {
            LogUtil.a("Track_SmoothMarkerUtil", "saveData is Empty");
            return;
        }
        this.k = 0.0d;
        this.m.clear();
        this.f.clear();
        this.n.clear();
        this.o.clear();
        this.d.clear();
        this.l.clear();
        a(list);
        if (this.k == 0.0d) {
            this.k = 1.0d;
        }
        this.f11212b = c(this.k, f);
        d(list);
    }

    private void a(List<jqw> list) {
        PolylineOptions polylineOptionsVisible;
        for (jqw jqwVar : list) {
            int iA = jqwVar.a();
            if (iA == 0) {
                polylineOptionsVisible = new PolylineOptions().width(15.0f).zIndex(10.0f).visible(true);
            } else if (iA != 1) {
                polylineOptionsVisible = iA != 2 ? null : new PolylineOptions().color(qqn.d(R.color.pause_line)).width(15.0f).zIndex(10.0f).setDottedLine(true).visible(izt.d());
            } else {
                polylineOptionsVisible = new PolylineOptions().width(15.0f).zIndex(10.0f).visible(true).color(jqwVar.c());
            }
            if (polylineOptionsVisible == null) {
                LogUtil.a("Track_SmoothMarkerUtil", "wrong type");
            } else {
                this.d.add(jqwVar);
                this.m.add(this.e.addPolyline(polylineOptionsVisible));
                ArrayList arrayList = new ArrayList(16);
                List<LatLng> listD = jqwVar.d();
                int i = 0;
                while (i < listD.size() - 1) {
                    LatLng latLng = listD.get(i);
                    i++;
                    double dCalculateLineDistance = AMapUtils.calculateLineDistance(latLng, listD.get(i));
                    arrayList.add(new e(this.k, dCalculateLineDistance));
                    this.k += dCalculateLineDistance;
                }
                this.l.add(arrayList);
                this.f.add(new ArrayList(16));
            }
        }
    }

    private void d(List<jqw> list) {
        int i = 0;
        for (jqw jqwVar : list) {
            int iA = jqwVar.a();
            if (iA == 0) {
                b(jqwVar, i);
            } else if (iA == 1) {
                a(jqwVar, i);
            } else if (iA == 2) {
                e(jqwVar, i);
            }
            i++;
        }
    }

    private void a(jqw jqwVar, int i) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        if (njy.e(this.l, i)) {
            LogUtil.e("Track_SmoothMarkerUtil", "mTimesUtils is out of bound");
            return;
        }
        List<e> list = this.l.get(i);
        List<LatLng> listD = jqwVar.d();
        ArrayList arrayList3 = new ArrayList(16);
        arrayList3.add(listD.get(0));
        LatLng latLng = listD.get(0);
        if (listD.size() == 1) {
            arrayList.add(1L);
            arrayList2.add(arrayList3);
        } else {
            c(arrayList, arrayList2, list, listD, latLng);
        }
        this.o.add(arrayList);
        this.n.add(arrayList2);
    }

    private void c(List<Long> list, List<List<LatLng>> list2, List<e> list3, List<LatLng> list4, LatLng latLng) {
        int i;
        char c2;
        List<LatLng> list5 = list4;
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(list5.get(0));
        int i2 = 0;
        double d2 = -1.0d;
        ArrayList arrayList2 = arrayList;
        LatLng latLng2 = latLng;
        while (true) {
            int i3 = 1;
            if (i2 >= list4.size() - 1) {
                break;
            }
            double d3 = d(list3.get(i2));
            int i4 = i2 + 1;
            LatLng latLng3 = list5.get(i4);
            double d4 = 1.0d + d2;
            if (d4 >= 1.0E-6d || d3 <= 30.0d) {
                LatLng latLng4 = latLng2;
                double d5 = d2;
                i = i4;
                if (d4 < 1.0E-6d && d3 <= 30.0d) {
                    arrayList2.add(latLng3);
                    d2 = d3;
                } else if (d4 > 1.0E-6d && d3 > 30.0d) {
                    list2.add(arrayList2);
                    list.add(Long.valueOf((long) d5));
                    ArrayList arrayList3 = new ArrayList(16);
                    int i5 = ((int) (d3 / 30.0d)) + 1;
                    while (i3 <= i5) {
                        arrayList3.add(d(latLng4, latLng3, e(i3, i5, list3.get(i2))));
                        list2.add(arrayList3);
                        list.add(Long.valueOf(((long) d3) / ((long) i5)));
                        arrayList3 = new ArrayList(16);
                        i3++;
                        list3 = list3;
                    }
                    arrayList2 = arrayList3;
                    c2 = 16;
                    d2 = -1.0d;
                } else if (d4 > 1.0E-6d && d5 + d3 > 30.0d) {
                    list2.add(arrayList2);
                    list.add(Long.valueOf((long) d5));
                    c2 = 16;
                    ArrayList arrayList4 = new ArrayList(16);
                    arrayList4.add(latLng3);
                    arrayList2 = arrayList4;
                    d2 = d3;
                } else {
                    c2 = 16;
                    arrayList2.add(latLng3);
                    d2 = d5 + d3;
                }
                i2 = i;
                latLng2 = latLng3;
                list5 = list4;
            } else {
                double d6 = d2;
                int i6 = ((int) (d3 / 30.0d)) + 1;
                while (i3 <= i6) {
                    arrayList2.add(d(latLng2, latLng3, e(i3, i6, list3.get(i2))));
                    list2.add(arrayList2);
                    list.add(Long.valueOf(((long) d3) / ((long) i6)));
                    arrayList2 = new ArrayList(16);
                    i3++;
                    i4 = i4;
                    latLng2 = latLng2;
                }
                i = i4;
                d2 = d6;
            }
            c2 = 16;
            i2 = i;
            latLng2 = latLng3;
            list5 = list4;
        }
        if (d2 + 1.0d > 1.0E-6d) {
            list2.add(arrayList2);
            list.add(Long.valueOf((long) d2));
        }
    }

    private void e(jqw jqwVar, int i) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        if (njy.e(this.l, i)) {
            LogUtil.e("Track_SmoothMarkerUtil", "mTimesUtils is out of bounds");
            return;
        }
        List<e> list = this.l.get(i);
        LatLng latLng = jqwVar.d().get(0);
        LatLng latLng2 = jqwVar.d().get(1);
        e eVar = list.get(0);
        double d2 = d(eVar);
        ArrayList arrayList3 = new ArrayList(16);
        arrayList3.add(latLng);
        if (d2 <= 30.0d) {
            arrayList3.add(latLng2);
            arrayList2.add(arrayList3);
            arrayList.add(Long.valueOf((long) d2));
        } else {
            int i2 = ((int) (d2 / 30.0d)) + 1;
            for (int i3 = 1; i3 <= i2; i3++) {
                arrayList3.add(d(latLng, latLng2, e(i3, i2, eVar)));
                arrayList2.add(arrayList3);
                arrayList.add(Long.valueOf(((long) d2) / ((long) i2)));
                arrayList3 = new ArrayList(16);
                arrayList3.add(latLng);
            }
        }
        this.o.add(arrayList);
        this.n.add(arrayList2);
    }

    private double d(e eVar) {
        eVar.d = e(eVar.e / this.k) * this.f11212b;
        eVar.f11216c = e((eVar.e + eVar.f11215a) / this.k) * this.f11212b;
        return eVar.f11216c - eVar.d;
    }

    private void b(jqw jqwVar, int i) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        if (njy.e(this.l, i)) {
            LogUtil.e("Track_SmoothMarkerUtil", "mTimesUtils is out of bound");
            return;
        }
        List<Integer> listA = a(jqwVar, arrayList, arrayList2, this.l.get(i), jqwVar.d());
        if (njy.e(this.m, i)) {
            LogUtil.e("Track_SmoothMarkerUtil", "preColorsLineAnimation:mPolylines is out of bound");
            return;
        }
        Polyline polyline = this.m.get(i);
        polyline.setOptions(polyline.getOptions().colorValues(listA));
        this.o.add(arrayList);
        this.n.add(arrayList2);
    }

    private List<Integer> a(jqw jqwVar, List<Long> list, List<List<LatLng>> list2, List<e> list3, List<LatLng> list4) {
        int i;
        int i2;
        char c2;
        List<LatLng> list5 = list4;
        ArrayList arrayList = new ArrayList(16);
        List<Integer> listB = jqwVar.b();
        int i3 = 0;
        arrayList.add(listB.get(0));
        ArrayList arrayList2 = new ArrayList(16);
        arrayList2.add(list5.get(0));
        LatLng latLng = list5.get(0);
        int iIntValue = listB.get(0).intValue();
        double d2 = -1.0d;
        while (i3 < list4.size() - 1) {
            double d3 = d(list3.get(i3));
            int i4 = i3 + 1;
            List<Integer> list6 = listB;
            Integer num = listB.get(i4);
            ArrayList arrayList3 = arrayList2;
            int iIntValue2 = num.intValue();
            LatLng latLng2 = list5.get(i4);
            double d4 = d2 + 1.0d;
            if (d4 >= 1.0E-6d || d3 <= 30.0d) {
                i = i4;
                int i5 = i3;
                i2 = iIntValue2;
                double d5 = d2;
                LatLng latLng3 = latLng;
                if (d4 >= 1.0E-6d || d3 > 30.0d) {
                    arrayList2 = arrayList3;
                    if (d4 > 1.0E-6d && d3 > 30.0d) {
                        list2.add(arrayList2);
                        list.add(Long.valueOf((long) d5));
                        ArrayList arrayList4 = new ArrayList(16);
                        int i6 = ((int) (d3 / 30.0d)) + 1;
                        int i7 = 1;
                        while (i7 <= i6) {
                            double dE = e(i7, i6, list3.get(i5));
                            LatLng latLng4 = latLng3;
                            arrayList4.add(d(latLng4, latLng2, dE));
                            arrayList.add(Integer.valueOf(c(iIntValue, i2, dE)));
                            list2.add(arrayList4);
                            list.add(Long.valueOf(((long) d3) / ((long) i6)));
                            arrayList4 = new ArrayList(16);
                            i7++;
                            latLng3 = latLng4;
                        }
                        arrayList2 = arrayList4;
                        c2 = 16;
                        d2 = -1.0d;
                    } else if (d4 > 1.0E-6d && d5 + d3 > 30.0d) {
                        list2.add(arrayList2);
                        list.add(Long.valueOf((long) d5));
                        c2 = 16;
                        ArrayList arrayList5 = new ArrayList(16);
                        arrayList5.add(latLng2);
                        arrayList.add(num);
                        arrayList2 = arrayList5;
                        d2 = d3;
                    } else {
                        c2 = 16;
                        arrayList2.add(latLng2);
                        arrayList.add(num);
                        d2 = d5 + d3;
                    }
                } else {
                    arrayList2 = arrayList3;
                    arrayList2.add(latLng2);
                    arrayList.add(num);
                    d2 = d3;
                }
                listB = list6;
                latLng = latLng2;
                i3 = i;
                iIntValue = i2;
                list5 = list4;
            } else {
                i = i4;
                int i8 = ((int) (d3 / 30.0d)) + 1;
                double d6 = d2;
                int i9 = 1;
                ArrayList arrayList6 = arrayList3;
                while (i9 <= i8) {
                    double d7 = d3;
                    double dE2 = e(i9, i8, list3.get(i3));
                    arrayList6.add(d(latLng, latLng2, dE2));
                    arrayList.add(Integer.valueOf(c(iIntValue, iIntValue2, dE2)));
                    list2.add(arrayList6);
                    d3 = d7;
                    list.add(Long.valueOf(((long) d3) / ((long) i8)));
                    arrayList6 = new ArrayList(16);
                    i9++;
                    latLng = latLng;
                    iIntValue2 = iIntValue2;
                    i3 = i3;
                }
                i2 = iIntValue2;
                arrayList2 = arrayList6;
                d2 = d6;
            }
            c2 = 16;
            listB = list6;
            latLng = latLng2;
            i3 = i;
            iIntValue = i2;
            list5 = list4;
        }
        double d8 = d2;
        if (d8 + 1.0d > 1.0E-6d) {
            list2.add(arrayList2);
            list.add(Long.valueOf((long) d8));
        }
        return arrayList;
    }

    private double e(int i, int i2, e eVar) {
        if (i == i2) {
            return 1.0d;
        }
        return eVar.f11215a < 1.0E-7d ? (((double) i) * 1.0d) / ((double) i2) : ((a((eVar.d + (((eVar.f11216c - eVar.d) * ((double) i)) / ((double) i2))) / this.f11212b) * this.k) - eVar.e) / eVar.f11215a;
    }

    private LatLng d(LatLng latLng, LatLng latLng2, double d2) {
        return new LatLng(latLng.latitude + ((latLng2.latitude - latLng.latitude) * d2), latLng.longitude + ((latLng2.longitude - latLng.longitude) * d2));
    }

    public void c(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.i.setIcon(bitmapDescriptor);
    }

    public void d() {
        if (njy.e(this.d)) {
            LogUtil.a("Track_SmoothMarkerUtil", "startSmoothMove data is Empty");
            return;
        }
        this.i.setVisible(true);
        this.j = -1;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.g = 0;
        int i = this.j + 1;
        this.j = i;
        if (i >= this.m.size()) {
            this.i.setVisible(false);
            SmoothMarkerListner smoothMarkerListner = this.h;
            if (smoothMarkerListner != null) {
                smoothMarkerListner.onFinished();
                return;
            }
            return;
        }
        if (this.d.get(this.j).a() == 2) {
            c(1);
        } else {
            c(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (njy.e(this.o, this.j) || njy.e(this.o.get(this.j), this.g)) {
            LogUtil.e("Track_SmoothMarkerUtil", "mTimeList is out of bound");
        } else {
            this.f11213c.sendEmptyMessageDelayed(i, this.o.get(this.j).get(this.g).longValue());
        }
    }

    static class d extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<SmoothMarkerUtil> f11214b;

        d(SmoothMarkerUtil smoothMarkerUtil) {
            super(Looper.getMainLooper());
            this.f11214b = new WeakReference<>(smoothMarkerUtil);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            SmoothMarkerUtil smoothMarkerUtil = this.f11214b.get();
            if (smoothMarkerUtil == null || smoothMarkerUtil.f11211a) {
                return;
            }
            if (njy.e(smoothMarkerUtil.m, smoothMarkerUtil.j) || njy.e(smoothMarkerUtil.n, smoothMarkerUtil.j)) {
                LogUtil.e("Track_SmoothMarkerUtil", "mPolylines or list is out of bound");
                return;
            }
            Polyline polyline = (Polyline) smoothMarkerUtil.m.get(smoothMarkerUtil.j);
            List list = (List) smoothMarkerUtil.n.get(smoothMarkerUtil.j);
            int size = list.size();
            List<LatLng> list2 = (List) list.get(smoothMarkerUtil.g);
            LatLng latLng = list2.get(list2.size() - 1);
            int i = message.what;
            if (i == 1) {
                polyline.setPoints(list2);
                smoothMarkerUtil.i.setPosition(latLng);
                int i2 = smoothMarkerUtil.g + 1;
                smoothMarkerUtil.g = i2;
                if (i2 < size) {
                    smoothMarkerUtil.c(1);
                    return;
                } else {
                    smoothMarkerUtil.e();
                    return;
                }
            }
            if (i != 2) {
                LogUtil.a("Track_SmoothMarkerUtil", "wrong handleMessage type");
                return;
            }
            if (njy.e(smoothMarkerUtil.f, smoothMarkerUtil.j)) {
                LogUtil.e("Track_SmoothMarkerUtil", "mPoints is out of bound");
                return;
            }
            List<LatLng> list3 = (List) smoothMarkerUtil.f.get(smoothMarkerUtil.j);
            list3.addAll(list2);
            polyline.setPoints(list3);
            smoothMarkerUtil.i.setPosition(latLng);
            int i3 = smoothMarkerUtil.g + 1;
            smoothMarkerUtil.g = i3;
            if (i3 < size) {
                smoothMarkerUtil.c(2);
            } else {
                smoothMarkerUtil.e();
            }
        }
    }

    public void b() {
        this.f11211a = true;
        this.h = null;
        this.f11213c.removeCallbacksAndMessages(null);
        this.h = null;
    }

    public void c() {
        this.f11211a = true;
        this.i.remove();
        Iterator<Polyline> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.f11213c.removeCallbacksAndMessages(null);
        this.h = null;
    }

    public void e(SmoothMarkerListner smoothMarkerListner) {
        this.h = smoothMarkerListner;
    }

    private double a(double d2) {
        return ((float) (Math.cos((d2 + 1.0d) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }

    private double e(double d2) {
        return (float) (((6.283185307179586d - Math.acos((d2 - 0.5d) * 2.0d)) / 3.141592653589793d) - 1.0d);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f11215a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f11216c;
        double d;
        double e;

        e(double d, double d2) {
            this.e = d;
            this.f11215a = d2;
        }
    }

    public List<Polyline> a() {
        return this.m;
    }
}
