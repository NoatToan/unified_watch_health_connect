package com.amap.api.maps;

import android.content.Context;
import com.amap.api.col.p0003sl.aq;
import com.amap.api.col.p0003sl.du;
import com.amap.api.col.p0003sl.dy;
import com.amap.api.col.p0003sl.jv;
import com.amap.api.maps.model.LatLng;
import com.amap.api.services.geocoder.GeocodeSearch;

/* JADX INFO: loaded from: classes4.dex */
public class CoordinateConverter {
    private static final String TAG = "CoordinateConverter";
    private Context ctx;
    private CoordType coordType = null;
    private LatLng sourceLatLng = null;

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

    public CoordinateConverter from(CoordType coordType) {
        this.coordType = coordType;
        return this;
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.sourceLatLng = latLng;
        return this;
    }

    public LatLng convert() {
        String str;
        LatLng latLngA = null;
        if (this.coordType == null || this.sourceLatLng == null) {
            return null;
        }
        try {
            switch (AnonymousClass1.f3393a[this.coordType.ordinal()]) {
                case 1:
                    latLngA = aq.a(this.sourceLatLng);
                    str = "baidu";
                    break;
                case 2:
                    latLngA = aq.b(this.ctx, this.sourceLatLng);
                    str = "mapbar";
                    break;
                case 3:
                    latLngA = this.sourceLatLng;
                    str = "mapabc";
                    break;
                case 4:
                    latLngA = this.sourceLatLng;
                    str = "sosomap";
                    break;
                case 5:
                    latLngA = this.sourceLatLng;
                    str = "aliyun";
                    break;
                case 6:
                    latLngA = this.sourceLatLng;
                    str = "google";
                    break;
                case 7:
                    latLngA = aq.a(this.ctx, this.sourceLatLng);
                    str = GeocodeSearch.GPS;
                    break;
                default:
                    str = "";
                    break;
            }
            dy.a(this.ctx, str);
            return latLngA;
        } catch (Throwable th) {
            th.printStackTrace();
            jv.c(th, TAG, "convert");
            return this.sourceLatLng;
        }
    }

    /* JADX INFO: renamed from: com.amap.api.maps.CoordinateConverter$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3393a;

        static {
            int[] iArr = new int[CoordType.values().length];
            f3393a = iArr;
            try {
                iArr[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3393a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3393a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3393a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3393a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3393a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3393a[CoordType.GPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static boolean isAMapDataAvailable(double d, double d2) {
        return du.a(d, d2);
    }
}
