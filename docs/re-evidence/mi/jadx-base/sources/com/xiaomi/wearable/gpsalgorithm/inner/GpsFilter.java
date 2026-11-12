package com.xiaomi.wearable.gpsalgorithm.inner;

import com.xiaomi.wearable.gpsalgorithm.utils.FitnessSportDistanceUtil;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class GpsFilter {
    private GpsBean[][] geoHash;
    private GpsBean[] gpsArray;
    private double grid_lat;
    private double grid_lng;
    private int grid_size;
    private GpsBean maxGps;
    private GpsBean minGps;
    private boolean needFilter;

    public static class GpsBean {
        private double lat;
        private double lng;

        public GpsBean(double d, double d2) {
            this.lng = d;
            this.lat = d2;
        }

        public double getLat() {
            return this.lat;
        }

        public double getLng() {
            return this.lng;
        }

        public void setLat(double d) {
            this.lat = d;
        }

        public void setLng(double d) {
            this.lng = d;
        }
    }

    public GpsFilter(GpsBean[] gpsBeanArr) {
        this.gpsArray = gpsBeanArr;
        this.needFilter = false;
        this.minGps = null;
        this.maxGps = null;
        this.grid_lng = 0.0d;
        this.grid_lat = 0.0d;
        this.grid_size = 0;
        init();
    }

    private double calDistance(GpsBean gpsBean, GpsBean gpsBean2) {
        return FitnessSportDistanceUtil.computeDistance(gpsBean.getLat(), gpsBean.getLng(), gpsBean2.getLat(), gpsBean2.getLng());
    }

    private void init() {
        if (!initBorder() || calDistance(this.minGps, this.maxGps) > 200.0d) {
            return;
        }
        double dMin = this.grid_size > 0 ? Math.min(this.maxGps.getLng() - this.minGps.getLng(), this.maxGps.getLat() - this.minGps.getLat()) / ((double) this.grid_size) : 4.0E-6d;
        int lng = (int) ((this.maxGps.getLng() - this.minGps.getLng()) / dMin);
        int lat = (int) ((this.maxGps.getLat() - this.minGps.getLat()) / dMin);
        int iMin = Math.min(lng, lat) / 20;
        this.grid_lng = (this.maxGps.getLng() - this.minGps.getLng()) / ((double) lng);
        this.grid_lat = (this.maxGps.getLat() - this.minGps.getLat()) / ((double) lat);
        int i = lng + 1;
        int i2 = lat + 1;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, i, i2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, i, i2);
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, i2);
        this.geoHash = (GpsBean[][]) Array.newInstance((Class<?>) GpsBean.class, i, i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            GpsBean[] gpsBeanArr = this.gpsArray;
            if (i4 >= gpsBeanArr.length) {
                break;
            }
            if (i4 == 0 || (i4 > 1 && calDistance(gpsBeanArr[i4], gpsBeanArr[i4 - 1]) > 0.0d)) {
                double[] dArr4 = dArr[(int) ((this.gpsArray[i4].getLng() - this.minGps.getLng()) / this.grid_lng)];
                int lat2 = (int) ((this.gpsArray[i4].getLat() - this.minGps.getLat()) / this.grid_lat);
                dArr4[lat2] = dArr4[lat2] + 1.0d;
            }
            i4++;
        }
        int i5 = 0;
        while (i5 < i) {
            int i6 = i3;
            while (i6 < i2) {
                int iMax = Math.max(i3, i6 - iMin);
                int iMin2 = Math.min(i2, i6 + iMin + 1);
                double d = 0.0d;
                while (iMax < iMin2) {
                    double d2 = i6 - iMax;
                    double dExp = Math.exp(((d2 * (-1.0d)) * d2) / ((double) ((iMin * 2) * iMin)));
                    d += dExp;
                    double[] dArr5 = dArr2[i5];
                    dArr5[i6] = dArr5[i6] + (dArr[i5][iMax] * dExp);
                    iMax++;
                    lat = lat;
                }
                double[] dArr6 = dArr2[i5];
                dArr6[i6] = dArr6[i6] / d;
                i6++;
                i3 = 0;
            }
            i5++;
            i3 = 0;
        }
        int i7 = lat;
        for (int i8 = 0; i8 < i; i8++) {
            for (int i9 = 0; i9 < i2; i9++) {
                int iMax2 = Math.max(0, i8 - iMin);
                int iMin3 = Math.min(i, i8 + iMin + 1);
                double d3 = 0.0d;
                while (iMax2 < iMin3) {
                    int i10 = iMin3;
                    double d4 = i8 - iMax2;
                    double dExp2 = Math.exp(((d4 * (-1.0d)) * d4) / ((double) ((iMin * 2) * iMin)));
                    d3 += dExp2;
                    double[] dArr7 = dArr3[i8];
                    dArr7[i9] = dArr7[i9] + (dArr2[iMax2][i9] * dExp2);
                    iMax2++;
                    iMin3 = i10;
                }
                double[] dArr8 = dArr3[i8];
                dArr8[i9] = dArr8[i9] / d3;
            }
        }
        int i11 = (int) (((double) iMin) * 3.618d);
        Class cls2 = Double.TYPE;
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls2, i, i2);
        double[][][] dArr10 = (double[][][]) Array.newInstance((Class<?>) cls2, i, i2, 2);
        int i12 = 0;
        while (i12 < i) {
            int i13 = 0;
            double d5 = 0.0d;
            double d6 = 0.0d;
            double d7 = 0.0d;
            while (i13 < i2) {
                double[] dArr11 = dArr3[i12];
                double d8 = dArr11[i13];
                d5 += d8;
                double[][] dArr12 = dArr3;
                double d9 = i12;
                d6 += d8 * d9;
                int i14 = lng;
                int i15 = i;
                d7 += d8 * ((double) i13);
                if (i13 > i11) {
                    int i16 = (i13 - i11) - 1;
                    double d10 = dArr11[i16];
                    d5 -= d10;
                    d6 -= d9 * d10;
                    d7 -= d10 * ((double) i16);
                }
                double[] dArr13 = dArr9[i12];
                dArr13[i13] = dArr13[i13] + d5;
                double[] dArr14 = dArr10[i12][i13];
                dArr14[0] = dArr14[0] + d6;
                dArr14[1] = dArr14[1] + d7;
                i13++;
                dArr3 = dArr12;
                lng = i14;
                i = i15;
            }
            int i17 = lng;
            int i18 = i;
            double[][] dArr15 = dArr3;
            int i19 = i7;
            double d11 = 0.0d;
            double d12 = 0.0d;
            double d13 = 0.0d;
            while (i19 >= 0) {
                double[] dArr16 = dArr15[i12];
                double d14 = dArr16[i19];
                d11 += d14;
                double[][] dArr17 = dArr9;
                double[][][] dArr18 = dArr10;
                double d15 = i12;
                int i20 = i12;
                double d16 = d12 + (d14 * d15);
                double d17 = i19;
                d13 += d14 * d17;
                if (i19 < (i2 - i11) - 1) {
                    int i21 = i19 + i11 + 1;
                    double d18 = dArr16[i21];
                    d16 -= d18 * d15;
                    d13 -= d18 * ((double) i21);
                    d11 -= d18;
                }
                double[] dArr19 = dArr17[i20];
                dArr19[i19] = dArr19[i19] + (d11 - d14);
                double[] dArr20 = dArr18[i20][i19];
                dArr20[0] = dArr20[0] + (d16 - (dArr16[i19] * d15));
                dArr20[1] = dArr20[1] + (d13 - (dArr16[i19] * d17));
                i19--;
                dArr9 = dArr17;
                dArr10 = dArr18;
                i12 = i20;
                d12 = d16;
            }
            i12++;
            dArr3 = dArr15;
            lng = i17;
            i = i18;
        }
        double[][] dArr21 = dArr9;
        double[][][] dArr22 = dArr10;
        int i22 = lng;
        int i23 = i;
        Class cls3 = Double.TYPE;
        double[][] dArr23 = (double[][]) Array.newInstance((Class<?>) cls3, i23, i2);
        double[][][] dArr24 = (double[][][]) Array.newInstance((Class<?>) cls3, i23, i2, 2);
        for (int i24 = 0; i24 < i2; i24++) {
            double d19 = 0.0d;
            double d20 = 0.0d;
            double d21 = 0.0d;
            for (int i25 = 0; i25 < i23; i25++) {
                d19 += dArr21[i25][i24];
                double[] dArr25 = dArr22[i25][i24];
                d20 += dArr25[0];
                d21 += dArr25[1];
                if (i25 > i11) {
                    int i26 = (i25 - i11) - 1;
                    d19 -= dArr21[i26][i24];
                    double[] dArr26 = dArr22[i26][i24];
                    d20 -= dArr26[0];
                    d21 -= dArr26[1];
                }
                double[] dArr27 = dArr23[i25];
                dArr27[i24] = dArr27[i24] + d19;
                double[] dArr28 = dArr24[i25][i24];
                dArr28[0] = dArr28[0] + d20;
                dArr28[1] = dArr28[1] + d21;
            }
            int i27 = i22;
            double d22 = 0.0d;
            double d23 = 0.0d;
            double d24 = 0.0d;
            while (i27 >= 0) {
                double d25 = dArr21[i27][i24];
                d22 += d25;
                double[] dArr29 = dArr22[i27][i24];
                d23 += dArr29[0];
                d24 += dArr29[1];
                int i28 = i2;
                if (i27 < (i23 - i11) - 1) {
                    int i29 = i27 + i11 + 1;
                    d22 -= dArr21[i29][i24];
                    double[] dArr30 = dArr22[i29][i24];
                    d23 -= dArr30[0];
                    d24 -= dArr30[1];
                }
                double[] dArr31 = dArr23[i27];
                dArr31[i24] = dArr31[i24] + (d22 - d25);
                double[] dArr32 = dArr24[i27][i24];
                dArr32[0] = dArr32[0] + (d23 - dArr29[0]);
                dArr32[1] = dArr32[1] + (d24 - dArr29[1]);
                i27--;
                i2 = i28;
            }
        }
        int i30 = i2;
        int i31 = 0;
        while (i31 < i23) {
            int i32 = i30;
            for (int i33 = 0; i33 < i32; i33++) {
                if (dArr23[i31][i33] > 0.0d) {
                    this.geoHash[i31][i33] = new GpsBean(this.minGps.getLng() + ((dArr24[i31][i33][0] / dArr23[i31][i33]) * this.grid_lng), this.minGps.getLat() + ((dArr24[i31][i33][1] / dArr23[i31][i33]) * this.grid_lat));
                }
            }
            i31++;
            i30 = i32;
        }
        this.needFilter = true;
    }

    private boolean initBorder() {
        GpsBean[] gpsBeanArr = this.gpsArray;
        if (gpsBeanArr == null || gpsBeanArr.length < 2) {
            return false;
        }
        this.minGps = new GpsBean(gpsBeanArr[0].getLng(), this.gpsArray[0].getLat());
        this.maxGps = new GpsBean(this.gpsArray[0].getLng(), this.gpsArray[0].getLat());
        for (int i = 1; i < this.gpsArray.length; i++) {
            if (this.minGps.getLng() > this.gpsArray[i].getLng()) {
                this.minGps.setLng(this.gpsArray[i].getLng());
            }
            if (this.minGps.getLat() > this.gpsArray[i].getLat()) {
                this.minGps.setLat(this.gpsArray[i].getLat());
            }
            if (this.maxGps.getLng() < this.gpsArray[i].getLng()) {
                this.maxGps.setLng(this.gpsArray[i].getLng());
            }
            if (this.maxGps.getLat() < this.gpsArray[i].getLat()) {
                this.maxGps.setLat(this.gpsArray[i].getLat());
            }
        }
        return true;
    }

    public GpsBean getCleanGps(GpsBean gpsBean) {
        GpsBean gpsBean2;
        if (this.needFilter && gpsBean != null) {
            int lng = (int) ((gpsBean.getLng() - this.minGps.getLng()) / this.grid_lng);
            int lat = (int) ((gpsBean.getLat() - this.minGps.getLat()) / this.grid_lat);
            GpsBean[][] gpsBeanArr = this.geoHash;
            if (lng < gpsBeanArr.length) {
                GpsBean[] gpsBeanArr2 = gpsBeanArr[lng];
                if (lat < gpsBeanArr2.length && (gpsBean2 = gpsBeanArr2[lat]) != null) {
                    return gpsBean2;
                }
            }
        }
        return gpsBean;
    }

    public int getGrid_size() {
        return this.grid_size;
    }

    public GpsBean[] getCleanGps() {
        if (!this.needFilter) {
            return this.gpsArray;
        }
        int length = this.gpsArray.length;
        GpsBean[] gpsBeanArr = new GpsBean[length];
        for (int i = 0; i < length; i++) {
            gpsBeanArr[i] = getCleanGps(this.gpsArray[i]);
        }
        return gpsBeanArr;
    }

    public GpsFilter(GpsBean[] gpsBeanArr, int i) {
        this.gpsArray = gpsBeanArr;
        this.needFilter = false;
        this.minGps = null;
        this.maxGps = null;
        this.grid_lng = 0.0d;
        this.grid_lat = 0.0d;
        this.grid_size = i;
        init();
    }
}
