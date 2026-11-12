package com.amap.api.maps;

import android.content.Context;
import com.amap.api.maps.model.LatLng;
import defpackage.g7s;
import defpackage.m2t;
import defpackage.mms;
import defpackage.wls;

/* JADX INFO: loaded from: classes4.dex */
public class CoordinateConverter {
    private static final String TAG = "CoordinateConverter";
    private Context ctx;
    private CoordType coordType = null;
    private LatLng sourceLatLng = null;

    /* JADX INFO: renamed from: com.amap.api.maps.CoordinateConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6419a;

        static {
            int[] iArr = new int[CoordType.values().length];
            f6419a = iArr;
            try {
                iArr[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6419a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6419a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6419a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6419a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6419a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6419a[CoordType.GPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum CoordType {
        BAIDU,
        MAPBAR,
        GPS,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE
    }

    public CoordinateConverter(Context context) {
        this.ctx = context;
    }

    public static boolean isAMapDataAvailable(double d, double d2) {
        return wls.a(d, d2);
    }

    public LatLng convert() {
        CoordType coordType = this.coordType;
        LatLng latLngD = null;
        if (coordType == null || this.sourceLatLng == null) {
            return null;
        }
        try {
            String str = "";
            switch (AnonymousClass1.f6419a[coordType.ordinal()]) {
                case 1:
                    latLngD = g7s.d(this.sourceLatLng);
                    str = "baidu";
                    break;
                case 2:
                    latLngD = g7s.i(this.ctx, this.sourceLatLng);
                    str = "mapbar";
                    break;
                case 3:
                    str = "mapabc";
                    latLngD = this.sourceLatLng;
                    break;
                case 4:
                    str = "sosomap";
                    latLngD = this.sourceLatLng;
                    break;
                case 5:
                    str = "aliyun";
                    latLngD = this.sourceLatLng;
                    break;
                case 6:
                    str = "google";
                    latLngD = this.sourceLatLng;
                    break;
                case 7:
                    str = "gps";
                    latLngD = g7s.c(this.ctx, this.sourceLatLng);
                    break;
            }
            mms.f(this.ctx, str);
            return latLngD;
        } catch (Throwable th) {
            th.printStackTrace();
            m2t.r(th, TAG, "convert");
            return this.sourceLatLng;
        }
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.sourceLatLng = latLng;
        return this;
    }

    public CoordinateConverter from(CoordType coordType) {
        this.coordType = coordType;
        return this;
    }
}
