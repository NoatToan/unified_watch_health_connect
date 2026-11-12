package com.amap.api.location;

import android.content.Context;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CoordinateConverter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6388b = 0;
    private static int c = 1;
    private static int d = 2;
    private static int e = 4;
    private static int f = 8;
    private static int g = 16;
    private static int h = 32;
    private static int i = 64;
    private Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CoordType f6390k = null;
    private DPoint l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    DPoint f6389a = null;

    /* JADX INFO: renamed from: com.amap.api.location.CoordinateConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6391a;

        static {
            int[] iArr = new int[CoordType.values().length];
            f6391a = iArr;
            try {
                iArr[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6391a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6391a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6391a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6391a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6391a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6391a[CoordType.GPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

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

    public static float calculateLineDistance(DPoint dPoint, DPoint dPoint2) {
        try {
            return k.a(dPoint, dPoint2);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static boolean isAMapDataAvailable(double d2, double d3) {
        return c.a(d2, d3);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    public synchronized DPoint convert() throws Exception {
        try {
            if (this.f6390k == null) {
                throw new IllegalArgumentException("转换坐标类型不能为空");
            }
            DPoint dPoint = this.l;
            if (dPoint == null) {
                throw new IllegalArgumentException("转换坐标源不能为空");
            }
            if (dPoint.getLongitude() > 180.0d || this.l.getLongitude() < -180.0d) {
                throw new IllegalArgumentException("请传入合理经度");
            }
            if (this.l.getLatitude() > 90.0d || this.l.getLatitude() < -90.0d) {
                throw new IllegalArgumentException("请传入合理纬度");
            }
            boolean z = true;
            String str = null;
            switch (AnonymousClass1.f6391a[this.f6390k.ordinal()]) {
                case 1:
                    this.f6389a = f.a(this.l);
                    int i2 = f6388b;
                    int i3 = c;
                    if ((i2 & i3) != 0) {
                        z = false;
                    } else {
                        str = "baidu";
                        f6388b = i2 | i3;
                    }
                    break;
                case 2:
                    this.f6389a = f.b(this.j, this.l);
                    int i4 = f6388b;
                    int i5 = d;
                    if ((i4 & i5) != 0) {
                        z = false;
                    } else {
                        str = "mapbar";
                        f6388b = i4 | i5;
                    }
                    break;
                case 3:
                    int i6 = f6388b;
                    int i7 = e;
                    if ((i6 & i7) == 0) {
                        str = "mapabc";
                        f6388b = i6 | i7;
                    } else {
                        z = false;
                    }
                    this.f6389a = this.l;
                    break;
                case 4:
                    int i8 = f6388b;
                    int i9 = f;
                    if ((i8 & i9) == 0) {
                        str = "sosomap";
                        f6388b = i8 | i9;
                    } else {
                        z = false;
                    }
                    this.f6389a = this.l;
                    break;
                case 5:
                    int i10 = f6388b;
                    int i11 = g;
                    if ((i10 & i11) == 0) {
                        str = "aliyun";
                        f6388b = i10 | i11;
                    } else {
                        z = false;
                    }
                    this.f6389a = this.l;
                    break;
                case 6:
                    int i12 = f6388b;
                    int i13 = h;
                    if ((i12 & i13) == 0) {
                        str = "google";
                        f6388b = i12 | i13;
                    } else {
                        z = false;
                    }
                    this.f6389a = this.l;
                    break;
                case 7:
                    int i14 = f6388b;
                    int i15 = i;
                    if ((i14 & i15) == 0) {
                        str = "gps";
                        f6388b = i14 | i15;
                    } else {
                        z = false;
                    }
                    this.f6389a = f.a(this.j, this.l);
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("amap_loc_coordinate", str);
                }
                i.a(this.j, "O021", jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6389a;
    }

    public synchronized CoordinateConverter coord(DPoint dPoint) throws Exception {
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
        return this;
    }

    public synchronized CoordinateConverter from(CoordType coordType) {
        this.f6390k = coordType;
        return this;
    }
}
