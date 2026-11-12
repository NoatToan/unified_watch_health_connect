package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.jv;
import com.amap.api.col.p0003sl.lg;
import com.amap.api.col.p0003sl.lh;
import com.amap.api.col.p0003sl.li;
import com.amap.api.col.p0003sl.lj;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.hms.network.embedded.c0;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<Long> f4007a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4008b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4009c = 0;
    String[] d = {"ol", "cl", "gl", "ha", CmcdConfiguration.KEY_BUFFER_STARVATION, Constants.RELATION_COL_B_KEY};
    public int e = -1;
    public long f = -1;
    private static List<li> i = new ArrayList();
    private static JSONArray j = null;
    static AMapLocation g = null;
    static boolean h = false;

    private static boolean a(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            return !c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        }
        return "http://abroad.apilocate.amap.com/mobile/binary".equals(c.f4000c);
    }

    public static void a(Context context, AMapLocation aMapLocation, com.autonavi.aps.amapapi.a aVar) {
        String str;
        if (aMapLocation == null) {
            return;
        }
        try {
            if (GeocodeSearch.GPS.equalsIgnoreCase(aMapLocation.getProvider())) {
                return;
            }
            int i2 = 1;
            if (aMapLocation.getLocationType() == 1) {
                return;
            }
            if (!a(aMapLocation)) {
                str = "domestic";
            } else {
                str = "abroad";
            }
            String str2 = str;
            String str3 = "net";
            if (aMapLocation.getErrorCode() != 0) {
                int errorCode = aMapLocation.getErrorCode();
                if (errorCode != 4 && errorCode != 5 && errorCode != 6 && errorCode != 11) {
                    str3 = "cache";
                }
                i2 = 0;
            } else {
                int locationType = aMapLocation.getLocationType();
                if (locationType != 5 && locationType != 6) {
                    str3 = "cache";
                }
            }
            a(context, "O016", str3, str2, i2, aMapLocation.getErrorCode(), aVar);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "reportBatting");
        }
    }

    public static void a(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (b.a()) {
                    a(context, j2, z, "O015");
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "reportGPSLocUseTime");
            }
        }
    }

    public static void b(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (b.a()) {
                    a(context, j2, z, "O024");
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "reportCoarseLocUseTime");
            }
        }
    }

    private static void a(Context context, long j2, boolean z, String str) {
        String str2;
        int iIntValue = Long.valueOf(j2).intValue();
        if (z) {
            str2 = "domestic";
        } else {
            str2 = "abroad";
        }
        a(context, str, str2, iIntValue);
    }

    private static void a(Context context, String str, String str2, String str3, int i2, int i3, com.autonavi.aps.amapapi.a aVar) {
        if (context != null) {
            try {
                if (b.a()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("param_string_second", str3);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    if (i3 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_second", i3);
                    }
                    if (aVar != null) {
                        if (!TextUtils.isEmpty(aVar.d())) {
                            jSONObject.put("dns", aVar.d());
                        }
                        if (!TextUtils.isEmpty(aVar.e())) {
                            jSONObject.put("domain", aVar.e());
                        }
                        if (!TextUtils.isEmpty(aVar.f())) {
                            jSONObject.put("type", aVar.f());
                        }
                        if (!TextUtils.isEmpty(aVar.g())) {
                            jSONObject.put("reason", aVar.g());
                        }
                        if (!TextUtils.isEmpty(aVar.c())) {
                            jSONObject.put(c0.h, aVar.c());
                        }
                        if (!TextUtils.isEmpty(aVar.b())) {
                            jSONObject.put("stack", aVar.b());
                        }
                        if (aVar.h() > 0) {
                            jSONObject.put("ctime", String.valueOf(aVar.h()));
                        }
                        if (aVar.a() > 0) {
                            jSONObject.put("ntime", String.valueOf(aVar.a()));
                        }
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    private static void a(Context context, String str, String str2, int i2) {
        if (context != null) {
            try {
                if (b.a()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        jSONObject.put("param_string_second", (Object) null);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    public static void a(Context context, String str, JSONObject jSONObject) {
        synchronized (i.class) {
            if (context != null) {
                try {
                    if (b.a()) {
                        li liVar = new li(context, "loc", "6.4.9", str);
                        if (jSONObject != null) {
                            liVar.a(jSONObject.toString());
                        }
                        i.add(liVar);
                        if (i.size() >= 30) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(i);
                            lj.b(arrayList, context);
                            i.clear();
                        }
                    }
                } catch (Throwable th) {
                    c.a(th, "ReportUtil", "applyStatistics");
                }
            }
        }
    }

    public static void a(Context context) {
        synchronized (i.class) {
            if (context != null) {
                try {
                    if (b.a()) {
                        List<li> list = i;
                        if (list != null && list.size() > 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(i);
                            lj.b(arrayList, context);
                            i.clear();
                        }
                        f(context);
                    }
                } catch (Throwable th) {
                    c.a(th, "ReportUtil", "destroy");
                }
            }
        }
    }

    public static void a(String str, String str2) {
        try {
            jv.b(c.c(), str2, str);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "reportLog");
        }
    }

    public final void a(Context context, int i2) {
        try {
            int i3 = this.f4008b;
            if (i3 == i2) {
                return;
            }
            if (i3 != -1 && i3 != i2) {
                long jB = k.b();
                long j2 = this.f4009c;
                this.f4007a.append(this.f4008b, Long.valueOf((jB - j2) + this.f4007a.get(this.f4008b, 0L).longValue()));
            }
            this.f4009c = k.b() - j.a(context, "pref1", this.d[i2], 0L);
            this.f4008b = i2;
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "setLocationType");
        }
    }

    public final void b(Context context) {
        try {
            long jB = k.b();
            long j2 = this.f4009c;
            int i2 = this.f4008b;
            if (i2 != -1) {
                this.f4007a.append(this.f4008b, Long.valueOf((jB - j2) + this.f4007a.get(i2, 0L).longValue()));
            }
            long jB2 = k.b();
            long j3 = this.f;
            int i3 = this.e;
            if (i3 != -1) {
                this.f4007a.append(this.e, Long.valueOf((jB2 - j3) + this.f4007a.get(i3, 0L).longValue()));
            }
            SharedPreferences.Editor editorA = j.a(context, "pref1");
            for (int i4 = 0; i4 < this.d.length; i4++) {
                long jLongValue = this.f4007a.get(i4, 0L).longValue();
                if (jLongValue > 0 && jLongValue > j.a(context, "pref1", this.d[i4], 0L)) {
                    j.a(editorA, this.d[i4], jLongValue);
                }
            }
            j.a(editorA);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "saveLocationTypeAndMode");
        }
    }

    /* JADX INFO: renamed from: com.autonavi.aps.amapapi.utils.i$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4010a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            f4010a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4010a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4010a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(Context context, AMapLocationClientOption aMapLocationClientOption) {
        int i2;
        try {
            int i3 = AnonymousClass1.f4010a[aMapLocationClientOption.getLocationMode().ordinal()];
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 != 2) {
                i2 = 3;
                if (i3 != 3) {
                    i2 = -1;
                }
            } else {
                i2 = 5;
            }
            int i4 = this.e;
            if (i4 == i2) {
                return;
            }
            if (i4 != -1 && i4 != i2) {
                this.f4007a.append(this.e, Long.valueOf((k.b() - this.f) + this.f4007a.get(this.e, 0L).longValue()));
            }
            this.f = k.b() - j.a(context, "pref1", this.d[i2], 0L);
            this.e = i2;
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "setLocationMode");
        }
    }

    public final int c(Context context) {
        try {
            long jA = j.a(context, "pref1", this.d[2], 0L);
            long jA2 = j.a(context, "pref1", this.d[0], 0L);
            long jA3 = j.a(context, "pref1", this.d[1], 0L);
            if (jA == 0 && jA2 == 0 && jA3 == 0) {
                return -1;
            }
            long j2 = jA2 - jA;
            long j3 = jA3 - jA;
            if (jA > j2) {
                return jA > j3 ? 2 : 1;
            }
            return j2 > j3 ? 0 : 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Context context) {
        try {
            long jA = j.a(context, "pref1", this.d[3], 0L);
            long jA2 = j.a(context, "pref1", this.d[4], 0L);
            long jA3 = j.a(context, "pref1", this.d[5], 0L);
            if (jA == 0 && jA2 == 0 && jA3 == 0) {
                return -1;
            }
            if (jA > jA2) {
                return jA > jA3 ? 3 : 5;
            }
            return jA2 > jA3 ? 4 : 5;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void e(Context context) {
        try {
            SharedPreferences.Editor editorA = j.a(context, "pref1");
            int i2 = 0;
            while (true) {
                String[] strArr = this.d;
                if (i2 < strArr.length) {
                    j.a(editorA, strArr[i2], 0L);
                    i2++;
                } else {
                    j.a(editorA);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i2, int i3, long j2, long j3) {
        if (i2 == -1 || i3 == -1) {
            return;
        }
        try {
            a(context, "O012", i2, i3, j2, j3);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "reportServiceAliveTime");
        }
    }

    private static void a(Context context, String str, int i2, int i3, long j2, long j3) {
        if (context != null) {
            try {
                if (b.a()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("param_int_first", i2);
                    jSONObject.put("param_int_second", i3);
                    jSONObject.put("param_long_first", j2);
                    jSONObject.put("param_long_second", j3);
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    public static void a(Context context, AMapLocation aMapLocation) {
        int i2;
        synchronized (i.class) {
            try {
                if (k.a(aMapLocation)) {
                    int locationType = aMapLocation.getLocationType();
                    int i3 = 0;
                    if (locationType == 1) {
                        i2 = i3;
                        i3 = 1;
                    } else if (locationType == 2 || locationType == 4) {
                        i2 = 1;
                        i3 = 1;
                    } else {
                        if (locationType == 11) {
                            i3 = 4;
                        } else if (locationType == 8) {
                            i3 = 3;
                        } else if (locationType != 9) {
                            i2 = 0;
                        } else {
                            i3 = 2;
                        }
                        i2 = i3;
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        int iC = b.c();
                        if (iC != 0) {
                            if (i2 == 0 || i2 == 4) {
                                if (iC == 2) {
                                    return;
                                }
                            } else if (iC == 1) {
                                return;
                            }
                        }
                        if (j == null) {
                            j = new JSONArray();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lon", k.b(aMapLocation.getLongitude()));
                        jSONObject.put("lat", k.b(aMapLocation.getLatitude()));
                        jSONObject.put("type", i2);
                        jSONObject.put("timestamp", k.a());
                        if (aMapLocation.getCoordType().equalsIgnoreCase(AMapLocation.COORD_TYPE_WGS84)) {
                            jSONObject.put("coordType", 1);
                        } else {
                            jSONObject.put("coordType", 2);
                        }
                        if (i2 == 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("accuracy", k.c(aMapLocation.getAccuracy()));
                            jSONObject2.put("altitude", k.c(aMapLocation.getAltitude()));
                            jSONObject2.put("bearing", k.c(aMapLocation.getBearing()));
                            jSONObject2.put("speed", k.c(aMapLocation.getSpeed()));
                            jSONObject.put("extension", jSONObject2);
                        }
                        JSONArray jSONArrayPut = j.put(jSONObject);
                        j = jSONArrayPut;
                        if (jSONArrayPut.length() >= b.b()) {
                            f(context);
                        }
                    }
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "recordOfflineLocLog");
            }
        }
    }

    private static void f(Context context) {
        try {
            JSONArray jSONArray = j;
            if (jSONArray == null || jSONArray.length() <= 0) {
                return;
            }
            lh.a(new lg(context, c.c(), j.toString()), context);
            j = null;
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "writeOfflineLocLog");
        }
    }

    private static String a(int i2) {
        if (i2 == 2011) {
            return "ContextIsNull";
        }
        if (i2 == 2031) {
            return "CreateApsReqException";
        }
        if (i2 == 2041) {
            return "ResponseResultIsNull";
        }
        if (i2 == 2081) {
            return "LocalLocException";
        }
        if (i2 == 2091) {
            return "InitException";
        }
        if (i2 == 2111) {
            return "ErrorCgiInfo";
        }
        if (i2 == 2121) {
            return "NotLocPermission";
        }
        if (i2 == 2141) {
            return "NoEnoughStatellites";
        }
        if (i2 == 2021) {
            return "OnlyMainWifi";
        }
        if (i2 == 2022) {
            return "OnlyOneWifiButNotMain";
        }
        if (i2 == 2061) {
            return "ServerRetypeError";
        }
        if (i2 != 2062) {
            switch (i2) {
                case 2051:
                    return "NeedLoginNetWork\t";
                case 2052:
                    return "MaybeIntercepted";
                case 2053:
                    return "DecryptResponseException";
                case 2054:
                    return "ParserDataException";
                default:
                    switch (i2) {
                        case 2101:
                            return "BindAPSServiceException";
                        case 2102:
                            return "AuthClientScodeFail";
                        case 2103:
                            return "NotConfigAPSService";
                        default:
                            switch (i2) {
                                case 2131:
                                    return "NoCgiOAndWifiInfo";
                                case 2132:
                                    return "AirPlaneModeAndWifiOff";
                                case 2133:
                                    return "NoCgiAndWifiOff";
                                default:
                                    switch (i2) {
                                        case 2151:
                                            return "MaybeMockNetLoc";
                                        case 2152:
                                            return "MaybeMockGPSLoc";
                                        case 2153:
                                            return "UNSUPPORT_COARSE_LBSLOC";
                                        case 2154:
                                            return "UNSUPPORT_CONTINUE_LOC";
                                        default:
                                            return "";
                                    }
                            }
                    }
            }
        }
        return "ServerLocFail";
    }

    public static void a(String str, int i2) {
        a(str, String.valueOf(i2), a(i2));
    }

    public static void a(String str, String str2, String str3) {
        try {
            jv.a(c.c(), "/mobile/binary", str3, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Throwable th) {
        try {
            if (th instanceof ik) {
                jv.a(c.c(), str, (ik) th);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        try {
            if (g == null) {
                if (!k.a(aMapLocation)) {
                    g = aMapLocation2;
                    return;
                }
                g = aMapLocation.m749clone();
            }
            if (k.a(g) && k.a(aMapLocation2)) {
                AMapLocation aMapLocationM749clone = aMapLocation2.m749clone();
                if (g.getLocationType() != 1 && g.getLocationType() != 9 && !GeocodeSearch.GPS.equalsIgnoreCase(g.getProvider()) && g.getLocationType() != 7 && aMapLocationM749clone.getLocationType() != 1 && aMapLocationM749clone.getLocationType() != 9 && !GeocodeSearch.GPS.equalsIgnoreCase(aMapLocationM749clone.getProvider()) && aMapLocationM749clone.getLocationType() != 7) {
                    long jAbs = Math.abs(aMapLocationM749clone.getTime() - g.getTime()) / 1000;
                    if (jAbs <= 0) {
                        jAbs = 1;
                    }
                    if (jAbs <= 1800) {
                        float fA = k.a(g, aMapLocationM749clone);
                        float f = fA / jAbs;
                        if (fA > 30000.0f && f > 1000.0f) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(g.getLatitude());
                            sb.append(",");
                            sb.append(g.getLongitude());
                            sb.append(",");
                            sb.append(g.getAccuracy());
                            sb.append(",");
                            sb.append(g.getLocationType());
                            sb.append(",");
                            if (aMapLocation.getTime() != 0) {
                                sb.append(k.a(g.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(g.getTime());
                            }
                            sb.append("#");
                            sb.append(aMapLocationM749clone.getLatitude());
                            sb.append(",");
                            sb.append(aMapLocationM749clone.getLongitude());
                            sb.append(",");
                            sb.append(aMapLocationM749clone.getAccuracy());
                            sb.append(",");
                            sb.append(aMapLocationM749clone.getLocationType());
                            sb.append(",");
                            if (aMapLocationM749clone.getTime() != 0) {
                                sb.append(k.a(aMapLocationM749clone.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(aMapLocationM749clone.getTime());
                            }
                            a("bigshiftstatistics", sb.toString());
                            sb.delete(0, sb.length());
                        }
                    }
                }
                g = aMapLocationM749clone;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(long j2, long j3) {
        String strA;
        try {
            if (h) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("gpsTime:").append(k.a(j2, "yyyy-MM-dd HH:mm:ss.SSS")).append(",sysTime:");
            stringBuffer.append(k.a(j3, "yyyy-MM-dd HH:mm:ss.SSS")).append(",serverTime:");
            long jU = b.u();
            if (0 == jU) {
                strA = "0";
            } else {
                strA = k.a(jU, "yyyy-MM-dd HH:mm:ss.SSS");
            }
            stringBuffer.append(strA);
            a("checkgpstime", stringBuffer.toString());
            if (0 != jU && Math.abs(j2 - jU) < 31536000000L) {
                stringBuffer.append(", correctError");
                a("checkgpstimeerror", stringBuffer.toString());
            }
            stringBuffer.delete(0, stringBuffer.length());
            h = true;
        } catch (Throwable unused) {
        }
    }
}
