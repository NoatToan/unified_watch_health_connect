package com.amap.api.location;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class CoordinateConverter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f3356b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3357c = 1;
    private static int d = 2;
    private static int e = 4;
    private static int f = 8;
    private static int g = 16;
    private static int h = 32;
    private static int i = 64;
    private Context j;
    private CoordType k = null;
    private DPoint l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    DPoint f3358a = null;

    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS
    }

    public CoordinateConverter(Context context) {
        this.j = context;
    }

    public CoordinateConverter from(CoordType coordType) {
        synchronized (this) {
            this.k = coordType;
        }
        return this;
    }

    public CoordinateConverter coord(DPoint dPoint) throws Exception {
        synchronized (this) {
            try {
                if (dPoint == null) {
                    throw new IllegalArgumentException("传入经纬度对象为空");
                }
                if (dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                    throw new IllegalArgumentException("请传入合理经度");
                }
                if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d) {
                    throw new IllegalArgumentException("请传入合理纬度");
                }
                this.l = dPoint;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public DPoint convert() throws Exception {
        DPoint dPoint;
        synchronized (this) {
            if (this.k == null) {
                throw new IllegalArgumentException("转换坐标类型不能为空");
            }
            DPoint dPoint2 = this.l;
            if (dPoint2 == null) {
                throw new IllegalArgumentException("转换坐标源不能为空");
            }
            if (dPoint2.getLongitude() > 180.0d || this.l.getLongitude() < -180.0d) {
                throw new IllegalArgumentException("请传入合理经度");
            }
            if (this.l.getLatitude() > 90.0d || this.l.getLatitude() < -90.0d) {
                throw new IllegalArgumentException("请传入合理纬度");
            }
            boolean z = false;
            String str = null;
            switch (AnonymousClass1.f3359a[this.k.ordinal()]) {
                case 1:
                    this.f3358a = f.a(this.l);
                    int i2 = f3356b;
                    int i3 = f3357c;
                    if ((i2 & i3) == 0) {
                        str = "baidu";
                        f3356b = i2 | i3;
                        z = true;
                    }
                    break;
                case 2:
                    this.f3358a = f.b(this.j, this.l);
                    int i4 = f3356b;
                    int i5 = d;
                    if ((i4 & i5) == 0) {
                        str = "mapbar";
                        f3356b = i4 | i5;
                        z = true;
                    }
                    break;
                case 3:
                    int i6 = f3356b;
                    int i7 = e;
                    if ((i6 & i7) == 0) {
                        str = "mapabc";
                        f3356b = i6 | i7;
                        z = true;
                    }
                    this.f3358a = this.l;
                    break;
                case 4:
                    int i8 = f3356b;
                    int i9 = f;
                    if ((i8 & i9) == 0) {
                        str = "sosomap";
                        f3356b = i8 | i9;
                        z = true;
                    }
                    this.f3358a = this.l;
                    break;
                case 5:
                    int i10 = f3356b;
                    int i11 = g;
                    if ((i10 & i11) == 0) {
                        str = "aliyun";
                        f3356b = i10 | i11;
                        z = true;
                    }
                    this.f3358a = this.l;
                    break;
                case 6:
                    int i12 = f3356b;
                    int i13 = h;
                    if ((i12 & i13) == 0) {
                        str = "google";
                        f3356b = i12 | i13;
                        z = true;
                    }
                    this.f3358a = this.l;
                    break;
                case 7:
                    int i14 = f3356b;
                    int i15 = i;
                    if ((i14 & i15) == 0) {
                        f3356b = i14 | i15;
                        str = GeocodeSearch.GPS;
                        z = true;
                    }
                    this.f3358a = f.a(this.j, this.l);
                    break;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("amap_loc_coordinate", str);
                }
                i.a(this.j, "O021", jSONObject);
            }
            dPoint = this.f3358a;
        }
        return dPoint;
    }

    /* JADX INFO: renamed from: com.amap.api.location.CoordinateConverter$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3359a;

        static {
            int[] iArr = new int[CoordType.values().length];
            f3359a = iArr;
            try {
                iArr[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3359a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3359a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3359a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3359a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3359a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3359a[CoordType.GPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static boolean isAMapDataAvailable(double d2, double d3) {
        return c.a(d2, d3);
    }

    public static float calculateLineDistance(DPoint dPoint, DPoint dPoint2) {
        try {
            return k.a(dPoint, dPoint2);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
