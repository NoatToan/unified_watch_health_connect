package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class em {
    public SparseArray<Long> a = new SparseArray<>();
    public int b = -1;
    public long c = 0;
    public String[] d = {"ol", "cl", "gl", "ha", "bs", "ds"};
    public int e = -1;
    public long f = -1;
    private static List<ba> i = new ArrayList();
    private static JSONArray j = null;
    public static AMapLocation g = null;
    public static boolean h = false;

    /* JADX INFO: renamed from: com.loc.em$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(long j2, long j3) {
        try {
            if (h) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("gpsTime:");
            stringBuffer.append(eo.a(j2, TrainingDateUtils.PATTERN_YMD_HMSS));
            stringBuffer.append(",");
            stringBuffer.append("sysTime:");
            stringBuffer.append(eo.a(j3, TrainingDateUtils.PATTERN_YMD_HMSS));
            stringBuffer.append(",");
            long jB = eh.B();
            String strA = 0 != jB ? eo.a(jB, TrainingDateUtils.PATTERN_YMD_HMSS) : "0";
            stringBuffer.append("serverTime:");
            stringBuffer.append(strA);
            a("checkgpstime", stringBuffer.toString());
            if (0 != jB && Math.abs(j2 - jB) < 31536000000L) {
                stringBuffer.append(", correctError");
                a("checkgpstimeerror", stringBuffer.toString());
            }
            stringBuffer.delete(0, stringBuffer.length());
            h = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized void a(Context context) {
        if (context != null) {
            try {
                if (eh.f()) {
                    List<ba> list = i;
                    if (list != null && list.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(i);
                        bb.a(arrayList, context);
                        i.clear();
                    }
                    f(context);
                }
            } catch (Throwable th) {
                ei.a(th, "ReportUtil", "destroy");
            }
        }
    }

    public static void a(Context context, int i2, int i3, long j2, long j3) {
        if (i2 == -1 || i3 == -1 || context == null) {
            return;
        }
        try {
            if (eh.f()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("param_int_first", i2);
                jSONObject.put("param_int_second", i3);
                jSONObject.put("param_long_first", j2);
                jSONObject.put("param_long_second", j3);
                a(context, "O012", jSONObject);
            }
        } catch (Throwable th) {
            try {
                ei.a(th, "ReportUtil", "applyStatisticsEx");
            } catch (Throwable th2) {
                ei.a(th2, "ReportUtil", "reportServiceAliveTime");
            }
        }
    }

    public static void a(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (eh.f()) {
                    int iIntValue = Long.valueOf(j2).intValue();
                    String str = z ? "domestic" : "abroad";
                    try {
                        if (eh.f()) {
                            JSONObject jSONObject = new JSONObject();
                            if (!TextUtils.isEmpty(str)) {
                                jSONObject.put("param_string_first", str);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                jSONObject.put("param_string_second", (Object) null);
                            }
                            if (iIntValue != Integer.MAX_VALUE) {
                                jSONObject.put("param_int_first", iIntValue);
                            }
                            a(context, "O015", jSONObject);
                        }
                    } catch (Throwable th) {
                        ei.a(th, "ReportUtil", "applyStatisticsEx");
                    }
                }
            } catch (Throwable th2) {
                ei.a(th2, "ReportUtil", "reportGPSLocUseTime");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002e A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #1 {all -> 0x00e9, blocks: (B:4:0x0003, B:8:0x000b, B:24:0x002e, B:33:0x003e, B:35:0x0042, B:36:0x0049, B:38:0x0084, B:41:0x0091, B:42:0x00d2, B:44:0x00e4, B:39:0x008a), top: B:56:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:30:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x003c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:35:0x0042 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:4:0x0003, B:8:0x000b, B:24:0x002e, B:33:0x003e, B:35:0x0042, B:36:0x0049, B:38:0x0084, B:41:0x0091, B:42:0x00d2, B:44:0x00e4, B:39:0x008a), top: B:56:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:4:0x0003, B:8:0x000b, B:24:0x002e, B:33:0x003e, B:35:0x0042, B:36:0x0049, B:38:0x0084, B:41:0x0091, B:42:0x00d2, B:44:0x00e4, B:39:0x008a), top: B:56:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:4:0x0003, B:8:0x000b, B:24:0x002e, B:33:0x003e, B:35:0x0042, B:36:0x0049, B:38:0x0084, B:41:0x0091, B:42:0x00d2, B:44:0x00e4, B:39:0x008a), top: B:56:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:4:0x0003, B:8:0x000b, B:24:0x002e, B:33:0x003e, B:35:0x0042, B:36:0x0049, B:38:0x0084, B:41:0x0091, B:42:0x00d2, B:44:0x00e4, B:39:0x008a), top: B:56:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #1 {all -> 0x00e9, blocks: (B:4:0x0003, B:8:0x000b, B:24:0x002e, B:33:0x003e, B:35:0x0042, B:36:0x0049, B:38:0x0084, B:41:0x0091, B:42:0x00d2, B:44:0x00e4, B:39:0x008a), top: B:56:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0038, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x003c, please report this as an issue */
    public static synchronized void a(Context context, AMapLocation aMapLocation) {
        int i2;
        int iH;
        JSONObject jSONObject;
        JSONArray jSONArrayPut;
        try {
            if (eo.a(aMapLocation)) {
                int locationType = aMapLocation.getLocationType();
                boolean z = false;
                if (locationType == 1) {
                    i2 = 0;
                } else if (locationType == 2 || locationType == 4) {
                    i2 = 1;
                } else {
                    if (locationType != 8) {
                        if (locationType != 9) {
                            i2 = 0;
                        } else {
                            i2 = 2;
                        }
                        if (z) {
                            iH = eh.h();
                            if (iH != 0) {
                                if (i2 == 0) {
                                    if (iH == 2) {
                                        return;
                                    }
                                } else if (iH == 1) {
                                    return;
                                }
                            }
                            if (j == null) {
                                j = new JSONArray();
                            }
                            jSONObject = new JSONObject();
                            jSONObject.put(GPXBasePoint.XML.ATTR_LON, eo.b(aMapLocation.getLongitude()));
                            jSONObject.put(GPXBasePoint.XML.ATTR_LAT, eo.b(aMapLocation.getLatitude()));
                            jSONObject.put("type", i2);
                            jSONObject.put("timestamp", eo.a());
                            if (aMapLocation.getCoordType().equalsIgnoreCase(AMapLocation.COORD_TYPE_WGS84)) {
                                jSONObject.put("coordType", 1);
                            } else {
                                jSONObject.put("coordType", 2);
                            }
                            if (i2 == 0) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("accuracy", eo.c(aMapLocation.getAccuracy()));
                                jSONObject2.put("altitude", eo.c(aMapLocation.getAltitude()));
                                jSONObject2.put("bearing", eo.c(aMapLocation.getBearing()));
                                jSONObject2.put("speed", eo.c(aMapLocation.getSpeed()));
                                jSONObject.put("extension", jSONObject2);
                            }
                            jSONArrayPut = j.put(jSONObject);
                            j = jSONArrayPut;
                            if (jSONArrayPut.length() >= eh.g()) {
                                f(context);
                            }
                        }
                    }
                    i2 = 3;
                }
                z = true;
                if (z) {
                    iH = eh.h();
                    if (iH != 0) {
                        if (i2 == 0) {
                            if (iH == 2) {
                                return;
                            }
                        } else if (iH == 1) {
                            return;
                        }
                    }
                    if (j == null) {
                        j = new JSONArray();
                    }
                    jSONObject = new JSONObject();
                    jSONObject.put(GPXBasePoint.XML.ATTR_LON, eo.b(aMapLocation.getLongitude()));
                    jSONObject.put(GPXBasePoint.XML.ATTR_LAT, eo.b(aMapLocation.getLatitude()));
                    jSONObject.put("type", i2);
                    jSONObject.put("timestamp", eo.a());
                    if (aMapLocation.getCoordType().equalsIgnoreCase(AMapLocation.COORD_TYPE_WGS84)) {
                        jSONObject.put("coordType", 1);
                    } else {
                        jSONObject.put("coordType", 2);
                    }
                    if (i2 == 0) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("accuracy", eo.c(aMapLocation.getAccuracy()));
                        jSONObject3.put("altitude", eo.c(aMapLocation.getAltitude()));
                        jSONObject3.put("bearing", eo.c(aMapLocation.getBearing()));
                        jSONObject3.put("speed", eo.c(aMapLocation.getSpeed()));
                        jSONObject.put("extension", jSONObject3);
                    }
                    jSONArrayPut = j.put(jSONObject);
                    j = jSONArrayPut;
                    if (jSONArrayPut.length() >= eh.g()) {
                        f(context);
                    }
                }
            }
        } catch (Throwable th) {
            ei.a(th, "ReportUtil", "recordOfflineLocLog");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public static void a(Context context, AMapLocation aMapLocation, dl dlVar) {
        boolean z;
        if (aMapLocation == null) {
            return;
        }
        try {
            if ("gps".equalsIgnoreCase(aMapLocation.getProvider())) {
                return;
            }
            int i2 = 1;
            if (aMapLocation.getLocationType() == 1) {
                return;
            }
            if (eo.a(aMapLocation)) {
                if (ei.a(aMapLocation.getLatitude(), aMapLocation.getLongitude())) {
                    z = false;
                } else {
                    z = true;
                }
            } else if ("http://abroad.apilocate.amap.com/mobile/binary".equals(ei.a)) {
                z = true;
            } else {
                z = false;
            }
            String str = z ? "abroad" : "domestic";
            String str2 = "cache";
            if (aMapLocation.getErrorCode() != 0) {
                int errorCode = aMapLocation.getErrorCode();
                if (errorCode == 4 || errorCode == 5 || errorCode == 6 || errorCode == 11) {
                    str2 = com.alipay.sdk.m.k.b.k;
                }
                i2 = 0;
            } else {
                int locationType = aMapLocation.getLocationType();
                if (locationType == 5 || locationType == 6) {
                    str2 = com.alipay.sdk.m.k.b.k;
                }
            }
            int errorCode2 = aMapLocation.getErrorCode();
            if (context != null) {
                try {
                    if (eh.f()) {
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("param_string_first", str2);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("param_string_second", str);
                        }
                        if (i2 != Integer.MAX_VALUE) {
                            jSONObject.put("param_int_first", i2);
                        }
                        if (errorCode2 != Integer.MAX_VALUE) {
                            jSONObject.put("param_int_second", errorCode2);
                        }
                        if (dlVar != null) {
                            if (!TextUtils.isEmpty(dlVar.d())) {
                                jSONObject.put("dns", dlVar.d());
                            }
                            if (!TextUtils.isEmpty(dlVar.e())) {
                                jSONObject.put("domain", dlVar.e());
                            }
                            if (!TextUtils.isEmpty(dlVar.f())) {
                                jSONObject.put("type", dlVar.f());
                            }
                            if (!TextUtils.isEmpty(dlVar.g())) {
                                jSONObject.put("reason", dlVar.g());
                            }
                            if (!TextUtils.isEmpty(dlVar.c())) {
                                jSONObject.put("ip", dlVar.c());
                            }
                            if (!TextUtils.isEmpty(dlVar.b())) {
                                jSONObject.put("stack", dlVar.b());
                            }
                            if (dlVar.h() > 0) {
                                jSONObject.put("ctime", String.valueOf(dlVar.h()));
                            }
                            if (dlVar.a() > 0) {
                                jSONObject.put("ntime", String.valueOf(dlVar.a()));
                            }
                        }
                        a(context, "O016", jSONObject);
                    }
                } catch (Throwable th) {
                    ei.a(th, "ReportUtil", "applyStatisticsEx");
                }
            }
        } catch (Throwable th2) {
            ei.a(th2, "ReportUtil", "reportBatting");
        }
    }

    public static synchronized void a(Context context, String str, JSONObject jSONObject) {
        if (context != null) {
            try {
                if (eh.f()) {
                    ba baVar = new ba(context, "loc", "5.0.0", str);
                    if (jSONObject != null) {
                        baVar.a(jSONObject.toString());
                    }
                    i.add(baVar);
                    if (i.size() >= 30) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(i);
                        bb.a(arrayList, context);
                        i.clear();
                    }
                }
            } catch (Throwable th) {
                ei.a(th, "ReportUtil", "applyStatistics");
            }
        }
    }

    public static void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        try {
            if (g == null) {
                if (!eo.a(aMapLocation)) {
                    g = aMapLocation2;
                    return;
                }
                g = aMapLocation.m3277clone();
            }
            if (eo.a(g) && eo.a(aMapLocation2)) {
                AMapLocation aMapLocationM3277clone = aMapLocation2.m3277clone();
                if (g.getLocationType() != 1 && g.getLocationType() != 9 && !"gps".equalsIgnoreCase(g.getProvider()) && g.getLocationType() != 7 && aMapLocationM3277clone.getLocationType() != 1 && aMapLocationM3277clone.getLocationType() != 9 && !"gps".equalsIgnoreCase(aMapLocationM3277clone.getProvider()) && aMapLocationM3277clone.getLocationType() != 7) {
                    long jAbs = Math.abs(aMapLocationM3277clone.getTime() - g.getTime()) / 1000;
                    if (jAbs <= 0) {
                        jAbs = 1;
                    }
                    if (jAbs <= TimeUtils.TIME_30_MINUTE) {
                        float fA = eo.a(g, aMapLocationM3277clone);
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
                                sb.append(eo.a(g.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(g.getTime());
                            }
                            sb.append(UpdateUtils.CMD_FILTER);
                            sb.append(aMapLocationM3277clone.getLatitude());
                            sb.append(",");
                            sb.append(aMapLocationM3277clone.getLongitude());
                            sb.append(",");
                            sb.append(aMapLocationM3277clone.getAccuracy());
                            sb.append(",");
                            sb.append(aMapLocationM3277clone.getLocationType());
                            sb.append(",");
                            if (aMapLocationM3277clone.getTime() != 0) {
                                sb.append(eo.a(aMapLocationM3277clone.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(aMapLocationM3277clone.getTime());
                            }
                            a("bigshiftstatistics", sb.toString());
                            sb.delete(0, sb.length());
                        }
                    }
                }
                g = aMapLocationM3277clone;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, int i2) {
        String str2;
        String strValueOf = String.valueOf(i2);
        if (i2 == 2011) {
            str2 = "ContextIsNull";
        } else if (i2 == 2031) {
            str2 = "CreateApsReqException";
        } else if (i2 == 2041) {
            str2 = "ResponseResultIsNull";
        } else if (i2 == 2081) {
            str2 = "LocalLocException";
        } else if (i2 == 2091) {
            str2 = "InitException";
        } else if (i2 == 2111) {
            str2 = "ErrorCgiInfo";
        } else if (i2 == 2121) {
            str2 = "NotLocPermission";
        } else if (i2 == 2141) {
            str2 = "NoEnoughStatellites";
        } else if (i2 == 2021) {
            str2 = "OnlyMainWifi";
        } else if (i2 == 2022) {
            str2 = "OnlyOneWifiButNotMain";
        } else if (i2 == 2061) {
            str2 = "ServerRetypeError";
        } else if (i2 == 2062) {
            str2 = "ServerLocFail";
        } else if (i2 == 2151) {
            str2 = "MaybeMockNetLoc";
        } else if (i2 != 2152) {
            switch (i2) {
                case 2051:
                    str2 = "NeedLoginNetWork\t";
                    break;
                case 2052:
                    str2 = "MaybeIntercepted";
                    break;
                case 2053:
                    str2 = "DecryptResponseException";
                    break;
                case 2054:
                    str2 = "ParserDataException";
                    break;
                default:
                    switch (i2) {
                        case 2101:
                            str2 = "BindAPSServiceException";
                            break;
                        case 2102:
                            str2 = "AuthClientScodeFail";
                            break;
                        case 2103:
                            str2 = "NotConfigAPSService";
                            break;
                        default:
                            switch (i2) {
                                case 2131:
                                    str2 = "NoCgiOAndWifiInfo";
                                    break;
                                case 2132:
                                    str2 = "AirPlaneModeAndWifiOff";
                                    break;
                                case 2133:
                                    str2 = "NoCgiAndWifiOff";
                                    break;
                                default:
                                    str2 = "";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str2 = "MaybeMockGPSLoc";
        }
        a(str, strValueOf, str2);
    }

    public static void a(String str, String str2) {
        try {
            ab.b(ei.c(), str2, str);
        } catch (Throwable th) {
            ei.a(th, "ReportUtil", "reportLog");
        }
    }

    public static void a(String str, String str2, String str3) {
        try {
            ab.a(ei.c(), "/mobile/binary", str3, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Throwable th) {
        try {
            if (th instanceof j) {
                ab.a(ei.c(), str, (j) th);
            }
        } catch (Throwable unused) {
        }
    }

    private static void f(Context context) {
        try {
            JSONArray jSONArray = j;
            if (jSONArray == null || jSONArray.length() <= 0) {
                return;
            }
            az.a(new ay(context, ei.c(), j.toString()), context);
            j = null;
        } catch (Throwable th) {
            ei.a(th, "ReportUtil", "writeOfflineLocLog");
        }
    }

    public final void a(Context context, int i2) {
        try {
            int i3 = this.b;
            if (i3 == i2) {
                return;
            }
            if (i3 != -1 && i3 != i2) {
                this.a.append(this.b, Long.valueOf((eo.b() - this.c) + this.a.get(this.b, 0L).longValue()));
            }
            this.c = eo.b() - en.a(context, "pref1", this.d[i2], 0L);
            this.b = i2;
        } catch (Throwable th) {
            ei.a(th, "ReportUtil", "setLocationType");
        }
    }

    public final void a(Context context, AMapLocationClientOption aMapLocationClientOption) {
        try {
            int i2 = AnonymousClass1.a[aMapLocationClientOption.getLocationMode().ordinal()];
            int i3 = 3;
            if (i2 == 1) {
                i3 = 4;
            } else if (i2 == 2) {
                i3 = 5;
            } else if (i2 != 3) {
                i3 = -1;
            }
            int i4 = this.e;
            if (i4 == i3) {
                return;
            }
            if (i4 != -1 && i4 != i3) {
                this.a.append(this.e, Long.valueOf((eo.b() - this.f) + this.a.get(this.e, 0L).longValue()));
            }
            this.f = eo.b() - en.a(context, "pref1", this.d[i3], 0L);
            this.e = i3;
        } catch (Throwable th) {
            ei.a(th, "ReportUtil", "setLocationMode");
        }
    }

    public final void b(Context context) {
        try {
            long jB = eo.b() - this.c;
            int i2 = this.b;
            if (i2 != -1) {
                this.a.append(this.b, Long.valueOf(jB + this.a.get(i2, 0L).longValue()));
            }
            long jB2 = eo.b() - this.f;
            int i3 = this.e;
            if (i3 != -1) {
                this.a.append(this.e, Long.valueOf(jB2 + this.a.get(i3, 0L).longValue()));
            }
            SharedPreferences.Editor editorA = en.a(context, "pref1");
            for (int i4 = 0; i4 < this.d.length; i4++) {
                long jLongValue = this.a.get(i4, 0L).longValue();
                if (jLongValue > 0 && jLongValue > en.a(context, "pref1", this.d[i4], 0L)) {
                    en.a(editorA, this.d[i4], jLongValue);
                }
            }
            en.a(editorA);
        } catch (Throwable th) {
            ei.a(th, "ReportUtil", "saveLocationTypeAndMode");
        }
    }

    public final int c(Context context) {
        try {
            long jA = en.a(context, "pref1", this.d[2], 0L);
            long jA2 = en.a(context, "pref1", this.d[0], 0L);
            long jA3 = en.a(context, "pref1", this.d[1], 0L);
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
            long jA = en.a(context, "pref1", this.d[3], 0L);
            long jA2 = en.a(context, "pref1", this.d[4], 0L);
            long jA3 = en.a(context, "pref1", this.d[5], 0L);
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
            SharedPreferences.Editor editorA = en.a(context, "pref1");
            int i2 = 0;
            while (true) {
                String[] strArr = this.d;
                if (i2 >= strArr.length) {
                    en.a(editorA);
                    return;
                } else {
                    en.a(editorA, strArr[i2], 0L);
                    i2++;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
