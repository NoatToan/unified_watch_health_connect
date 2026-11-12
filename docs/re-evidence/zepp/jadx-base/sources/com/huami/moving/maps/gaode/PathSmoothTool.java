package com.huami.moving.maps.gaode;

import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PathSmoothTool {
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private int a = 3;
    private float b = 0.3f;
    private float c = 10.0f;
    private double r = 0.0d;
    private double s = 0.0d;

    private static double a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d = latLng.longitude;
        double d2 = latLng2.longitude;
        double d3 = latLng.latitude;
        double d4 = latLng2.latitude;
        double d5 = latLng3.longitude;
        double d6 = d5 - d2;
        double d7 = latLng3.latitude;
        double d8 = d7 - d4;
        double d9 = (((d - d2) * d6) + ((d3 - d4) * d8)) / ((d6 * d6) + (d8 * d8));
        if (d9 >= 0.0d && (d2 != d5 || d4 != d7)) {
            if (d9 > 1.0d) {
                d4 = d7;
                d2 = d5;
            } else {
                d2 += d6 * d9;
                d4 += d9 * d8;
            }
        }
        return AMapUtils.calculateLineDistance(latLng, new LatLng(d4, d2));
    }

    private static LatLng b(List<LatLng> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    private void c() {
        this.j = 0.001d;
        this.k = 0.001d;
        this.l = 5.698402909980532E-4d;
        this.m = 5.698402909980532E-4d;
    }

    private LatLng d(double d, double d2, double d3, double d4) {
        this.d = d;
        this.e = d2;
        double d5 = this.j;
        double d6 = this.l;
        double dSqrt = Math.sqrt((d5 * d5) + (d6 * d6)) + this.s;
        this.n = dSqrt;
        double d7 = this.j;
        double dSqrt2 = Math.sqrt((dSqrt * dSqrt) / ((dSqrt * dSqrt) + (d7 * d7))) + this.r;
        this.p = dSqrt2;
        double d8 = this.e;
        double d9 = this.d;
        this.h = ((d8 - d9) * dSqrt2) + d9;
        double d10 = this.n;
        this.l = Math.sqrt((1.0d - dSqrt2) * d10 * d10);
        this.f = d3;
        this.g = d4;
        double d11 = this.k;
        double d12 = this.m;
        double dSqrt3 = Math.sqrt((d11 * d11) + (d12 * d12)) + this.s;
        this.o = dSqrt3;
        double d13 = this.k;
        double dSqrt4 = Math.sqrt((dSqrt3 * dSqrt3) / ((dSqrt3 * dSqrt3) + (d13 * d13))) + this.r;
        this.q = dSqrt4;
        double d14 = this.g;
        double d15 = this.f;
        this.i = ((d14 - d15) * dSqrt4) + d15;
        double d16 = 1.0d - dSqrt4;
        double d17 = this.o;
        this.m = Math.sqrt(d16 * d17 * d17);
        return new LatLng(this.i, this.h);
    }

    private List<LatLng> e(List<LatLng> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 2) {
            c();
            LatLng latLng = list.get(0);
            arrayList.add(latLng);
            for (int i2 = 1; i2 < list.size(); i2++) {
                LatLng latLngF = f(latLng, list.get(i2), i);
                if (latLngF != null) {
                    arrayList.add(latLngF);
                    latLng = latLngF;
                }
            }
        }
        return arrayList;
    }

    private LatLng f(LatLng latLng, LatLng latLng2, int i) {
        if (this.j == 0.0d || this.k == 0.0d) {
            c();
        }
        LatLng latLngD = null;
        if (latLng != null && latLng2 != null) {
            if (i < 1) {
                i = 1;
            } else if (i > 5) {
                i = 5;
            }
            int i2 = 0;
            while (i2 < i) {
                latLngD = d(latLng.longitude, latLng2.longitude, latLng.latitude, latLng2.latitude);
                i2++;
                latLng2 = latLngD;
            }
        }
        return latLngD;
    }

    private List<LatLng> g(List<LatLng> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            LatLng latLngB = b(arrayList);
            LatLng latLng = list.get(i);
            if (latLngB == null || i == list.size() - 1) {
                arrayList.add(latLng);
            } else if (a(latLng, latLngB, list.get(i + 1)) < f) {
                arrayList.add(latLng);
            }
        }
        return arrayList;
    }

    private List<LatLng> h(List<LatLng> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            LatLng latLngB = b(arrayList);
            LatLng latLng = list.get(i);
            if (latLngB == null || i == list.size() - 1) {
                arrayList.add(latLng);
            } else if (a(latLng, latLngB, list.get(i + 1)) > f) {
                arrayList.add(latLng);
            }
        }
        return arrayList;
    }

    public int getIntensity() {
        return this.a;
    }

    public float getThreshhold() {
        return this.b;
    }

    public List<LatLng> kalmanFilterPath(List<LatLng> list) {
        return e(list, this.a);
    }

    public LatLng kalmanFilterPoint(LatLng latLng, LatLng latLng2) {
        return f(latLng, latLng2, this.a);
    }

    public List<LatLng> pathOptimize(List<LatLng> list) {
        return h(e(removeNoisePoint(list), this.a), this.b);
    }

    public List<LatLng> reducerVerticalThreshold(List<LatLng> list) {
        return h(list, this.b);
    }

    public List<LatLng> removeNoisePoint(List<LatLng> list) {
        return g(list, this.c);
    }

    public void setIntensity(int i) {
        this.a = i;
    }

    public void setNoiseThreshhold(float f) {
        this.c = f;
    }

    public void setThreshhold(float f) {
        this.b = f;
    }
}
