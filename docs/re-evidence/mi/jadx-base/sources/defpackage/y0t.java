package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.push.m;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class y0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f39668a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f39669b = -1;
    public static Map<String, m> c;

    public static int a() {
        if (f39668a == 0) {
            try {
                f39668a = (TextUtils.isEmpty(g("ro.miui.ui.version.code")) && TextUtils.isEmpty(g("ro.miui.ui.version.name"))) ? 2 : 1;
            } catch (Throwable th) {
                x9s.q("get isMIUI failed", th);
                f39668a = 0;
            }
            x9s.y("isMIUI's value is: " + f39668a);
        }
        return f39668a;
    }

    public static int b(Context context) {
        String strG = g("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(strG) || !TextUtils.isDigitsOnly(strG)) {
            return 0;
        }
        return Integer.parseInt(strG);
    }

    public static m c(String str) {
        m mVarM = m(str);
        return mVarM == null ? m.Global : mVarM;
    }

    public static String d() {
        int iA = odt.a();
        if (!i() || iA <= 0) {
            return "";
        }
        if (iA < 2) {
            return SleepAnalyzerAlpha.NAME_ALPHA;
        }
        return iA < 3 ? "development" : "stable";
    }

    public static String e(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + f(intent.getExtras());
    }

    public static String f(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(f((Bundle) obj));
                } else {
                    sb.append(obj);
                }
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String g(String str) {
        try {
            try {
                return (String) zbs.g("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                x9s.D("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void h() {
        if (c != null) {
            return;
        }
        HashMap map = new HashMap();
        c = map;
        map.put(ServerConstants.NEW_CN_COUNTRY_CODE, m.China);
        Map<String, m> map2 = c;
        m mVar = m.Europe;
        map2.put("FI", mVar);
        c.put("SE", mVar);
        c.put("NO", mVar);
        c.put("FO", mVar);
        c.put("EE", mVar);
        c.put("LV", mVar);
        c.put("LT", mVar);
        c.put("BY", mVar);
        c.put("MD", mVar);
        c.put("UA", mVar);
        c.put("PL", mVar);
        c.put("CZ", mVar);
        c.put("SK", mVar);
        c.put("HU", mVar);
        c.put(ServerConstants.NEW_DE_COUNTRY_CODE, mVar);
        c.put("AT", mVar);
        c.put("CH", mVar);
        c.put("LI", mVar);
        c.put(ServerConstants.GB_COUNTRY_CODE, mVar);
        c.put("IE", mVar);
        c.put("NL", mVar);
        c.put("BE", mVar);
        c.put("LU", mVar);
        c.put(ServerConstants.FR_COUNTRY_CODE, mVar);
        c.put("RO", mVar);
        c.put("BG", mVar);
        c.put("RS", mVar);
        c.put("MK", mVar);
        c.put("AL", mVar);
        c.put("GR", mVar);
        c.put("SI", mVar);
        c.put("HR", mVar);
        c.put(ServerConstants.IT_COUNTRY_CODE, mVar);
        c.put("SM", mVar);
        c.put("MT", mVar);
        c.put(ServerConstants.ES_COUNTRY_CODE, mVar);
        c.put("PT", mVar);
        c.put("AD", mVar);
        c.put("CY", mVar);
        c.put("DK", mVar);
        c.put("IS", mVar);
        c.put("UK", mVar);
        c.put("EL", mVar);
        c.put(ServerConstants.NEW_RU_COUNTRY_CODE, m.Russia);
        c.put("IN", m.India);
    }

    public static boolean i() {
        return a() == 1;
    }

    public static boolean j(Context context) {
        return context != null && k(context.getPackageName());
    }

    public static boolean k(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    public static int l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static m m(String str) {
        h();
        return c.get(str.toUpperCase());
    }

    public static String n() {
        String strA = bdt.a("ro.miui.region", "");
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = o(bdt.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = bdt.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(strA)) {
            x9s.o("get region from system, region = " + strA);
        }
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String country = Locale.getDefault().getCountry();
        x9s.o("locale.default.country = " + country);
        return country;
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split("-");
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    public static boolean p() {
        return a() == 2;
    }

    public static String q() {
        return g("ro.miui.ui.version.name");
    }

    public static boolean r() {
        if (f39669b < 0) {
            f39669b = !v() ? 1 : 0;
        }
        return f39669b > 0;
    }

    public static String s() {
        return g("ro.build.characteristics");
    }

    public static boolean t() {
        return !m.China.name().equalsIgnoreCase(c(n()).name());
    }

    public static String u() {
        return g("ro.product.manufacturer");
    }

    public static boolean v() {
        String strA = "";
        try {
            strA = bdt.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(strA);
    }
}
