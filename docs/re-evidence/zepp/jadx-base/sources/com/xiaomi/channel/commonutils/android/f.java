package com.xiaomi.channel.commonutils.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class f {
    private static volatile int a = 0;
    private static int b = -1;
    private static Map<String, Region> c;

    public static int a() {
        if (a == 0) {
            try {
                int i = 1;
                if (!((TextUtils.isEmpty(m3425a("ro.miui.ui.version.code")) && TextUtils.isEmpty(m3425a("ro.miui.ui.version.name"))) ? false : true)) {
                    i = 2;
                }
                a = i;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a("get isMIUI failed", th);
                a = 0;
            }
            com.xiaomi.channel.commonutils.logger.b.b("isMIUI's value is: " + a);
        }
        return a;
    }

    public static int a(Context context) {
        String strM3425a = m3425a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(strM3425a) || !TextUtils.isDigitsOnly(strM3425a)) {
            return 0;
        }
        return Integer.parseInt(strM3425a);
    }

    public static Region a(String str) {
        Region regionF = f(str);
        return regionF == null ? Region.Global : regionF;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m3424a() {
        int iA = k.a();
        if (!m3426a() || iA <= 0) {
            return "";
        }
        if (iA < 2) {
            return "alpha";
        }
        return iA < 3 ? "development" : "stable";
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    public static String a(Bundle bundle) {
        String strA;
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(com.alipay.sdk.m.n.a.h);
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    strA = Arrays.toString((int[]) obj);
                } else if (obj instanceof byte[]) {
                    strA = Arrays.toString((byte[]) obj);
                } else if (obj instanceof boolean[]) {
                    strA = Arrays.toString((boolean[]) obj);
                } else if (obj instanceof short[]) {
                    strA = Arrays.toString((short[]) obj);
                } else if (obj instanceof long[]) {
                    strA = Arrays.toString((long[]) obj);
                } else if (obj instanceof float[]) {
                    strA = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    strA = Arrays.toString((double[]) obj);
                } else if (obj instanceof String[]) {
                    strA = Arrays.toString((String[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    strA = Arrays.toString((CharSequence[]) obj);
                } else if (obj instanceof Parcelable[]) {
                    strA = Arrays.toString((Parcelable[]) obj);
                } else {
                    if (obj instanceof Bundle) {
                        strA = a((Bundle) obj);
                    } else {
                        sb.append(obj);
                    }
                    z = false;
                }
                sb.append(strA);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m3425a(String str) {
        try {
            try {
                return (String) z.a("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3426a() {
        return a() == 1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3427a(Context context) {
        return context != null && m3428a(context.getPackageName());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3428a(String str) {
        return PkgNameConstants.XMSF.equals(str);
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(PkgNameConstants.XMSF, 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b() {
        String strA = j.a("ro.miui.region", "");
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = g(j.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = j.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("get region from system, region = " + strA);
        }
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String country = Locale.getDefault().getCountry();
        com.xiaomi.channel.commonutils.logger.b.m3434a("locale.default.country = " + country);
        return country;
    }

    public static String b(String str) {
        if (Region.Global.name().equals(str)) {
            return "SG";
        }
        if (Region.Europe.name().equals(str)) {
            return "DE";
        }
        if (Region.Russia.name().equals(str)) {
            return "RU";
        }
        return Region.India.name().equals(str) ? "IN" : "";
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m3429b() {
        if (b < 0) {
            b = !d() ? 1 : 0;
        }
        return b > 0;
    }

    public static String c() {
        return m3425a("ro.miui.ui.version.name");
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static boolean m3430c() {
        return true;
    }

    public static boolean d() {
        String strA = "";
        try {
            strA = j.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(strA);
    }

    private static void e() {
        if (c != null) {
            return;
        }
        HashMap map = new HashMap();
        c = map;
        Region region = Region.Europe;
        map.put("FI", region);
        c.put("SE", region);
        c.put("NO", region);
        c.put("FO", region);
        c.put("EE", region);
        c.put("LV", region);
        c.put("LT", region);
        c.put("BY", region);
        c.put("MD", region);
        c.put("UA", region);
        c.put("PL", region);
        c.put("CZ", region);
        c.put("SK", region);
        c.put("HU", region);
        c.put("DE", region);
        c.put("AT", region);
        c.put("CH", region);
        c.put("LI", region);
        c.put(SelectAreaManager.GB, region);
        c.put("IE", region);
        c.put("NL", region);
        c.put("BE", region);
        c.put("LU", region);
        c.put("FR", region);
        c.put("RO", region);
        c.put("BG", region);
        c.put("RS", region);
        c.put("MK", region);
        c.put("AL", region);
        c.put("GR", region);
        c.put("SI", region);
        c.put("HR", region);
        c.put("IT", region);
        c.put("SM", region);
        c.put("MT", region);
        c.put("ES", region);
        c.put("PT", region);
        c.put("AD", region);
        c.put("CY", region);
        c.put("DK", region);
        c.put("IS", region);
        c.put("EL", region);
        c.put("UK", region);
        c.put("RU", Region.Russia);
        c.put("IN", Region.India);
    }

    private static Region f(String str) {
        e();
        return c.get(str.toUpperCase());
    }

    private static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }
}
