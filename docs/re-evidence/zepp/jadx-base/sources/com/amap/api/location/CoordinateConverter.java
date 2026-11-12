package com.amap.api.location;

import android.content.Context;
import android.text.TextUtils;
import com.loc.ei;
import com.loc.ek;
import com.loc.em;
import com.loc.eo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinateConverter {
    private static int b = 0;
    private static int c = 1;
    private static int d = 2;
    private static int e = 4;
    private static int f = 8;
    private static int g = 16;
    private static int h = 32;
    private static int i = 64;
    private Context j;
    private CoordType k = null;
    private DPoint l = null;
    public DPoint a = null;

    /* JADX INFO: renamed from: com.amap.api.location.CoordinateConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CoordType.values().length];
            a = iArr;
            try {
                iArr[CoordType.BAIDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CoordType.MAPBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CoordType.MAPABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CoordType.SOSOMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CoordType.ALIYUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[CoordType.GOOGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[CoordType.GPS.ordinal()] = 7;
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
            return eo.a(dPoint, dPoint2);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static boolean isAMapDataAvailable(double d2, double d3) {
        return ei.a(d2, d3);
    }

    public synchronized DPoint convert() throws Exception {
        int i2;
        int i3;
        DPoint dPointA;
        if (this.k == null) {
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
        boolean z = false;
        String str = null;
        switch (AnonymousClass1.a[this.k.ordinal()]) {
            case 1:
                this.a = ek.a(this.l);
                i2 = b;
                i3 = c;
                if ((i2 & i3) == 0) {
                    str = "baidu";
                    b = i2 | i3;
                    z = true;
                }
                break;
            case 2:
                this.a = ek.b(this.j, this.l);
                i2 = b;
                i3 = d;
                if ((i2 & i3) == 0) {
                    str = "mapbar";
                    b = i2 | i3;
                    z = true;
                }
                break;
            case 3:
                int i4 = b;
                int i5 = e;
                if ((i4 & i5) == 0) {
                    str = "mapabc";
                    b = i4 | i5;
                    z = true;
                }
                dPointA = this.l;
                this.a = dPointA;
                break;
            case 4:
                int i6 = b;
                int i7 = f;
                if ((i6 & i7) == 0) {
                    str = "sosomap";
                    b = i6 | i7;
                    z = true;
                }
                dPointA = this.l;
                this.a = dPointA;
                break;
            case 5:
                int i8 = b;
                int i9 = g;
                if ((i8 & i9) == 0) {
                    str = "aliyun";
                    b = i8 | i9;
                    z = true;
                }
                dPointA = this.l;
                this.a = dPointA;
                break;
            case 6:
                int i10 = b;
                int i11 = h;
                if ((i10 & i11) == 0) {
                    str = "google";
                    b = i10 | i11;
                    z = true;
                }
                dPointA = this.l;
                this.a = dPointA;
                break;
            case 7:
                int i12 = b;
                int i13 = i;
                if ((i12 & i13) == 0) {
                    str = "gps";
                    b = i12 | i13;
                    z = true;
                }
                dPointA = ek.a(this.j, this.l);
                this.a = dPointA;
                break;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("amap_loc_coordinate", str);
            }
            em.a(this.j, "O021", jSONObject);
        }
        return this.a;
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
        this.k = coordType;
        return this;
    }
}
