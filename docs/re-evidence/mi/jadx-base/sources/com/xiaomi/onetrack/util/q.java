package com.xiaomi.onetrack.util;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13989a = 29;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13990b = 25;
    public static final int c = 24;
    public static final int d = 23;
    public static final int e = 22;
    public static final int f = 21;
    public static final int g = 19;
    public static final int h = 17;
    public static final int i = 28;
    private static final String j = "OsUtil";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Class f13991k = null;
    private static Method l = null;
    private static Boolean m = null;
    private static final String n = "";
    private static Method o = null;
    private static boolean p = false;
    private static String q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f13992r = false;
    private static int s;

    static {
        try {
            o = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Throwable th) {
            p.b(j, "sGetProp init failed ex: " + th.getMessage());
        }
        try {
            f13991k = Class.forName("miui.os.Build");
        } catch (Throwable th2) {
            p.b(j, "sMiuiBuild init failed ex: " + th2.getMessage());
        }
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Secure").getDeclaredMethod("isUserExperienceProgramEnable", ContentResolver.class);
            l = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th3) {
            p.b(j, "sMiuiUEPMethod init failed ex: " + th3.getMessage());
        }
    }

    public static boolean a() {
        Boolean bool = m;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TextUtils.isEmpty(b("ro.miui.ui.version.code"))) {
            m = Boolean.FALSE;
        } else {
            m = Boolean.TRUE;
        }
        return m.booleanValue();
    }

    private static String b(String str) {
        try {
            Method method = o;
            if (method != null) {
                return String.valueOf(method.invoke(null, str));
            }
        } catch (Exception e2) {
            p.b(j, "getProp failed ex: " + e2.getMessage());
        }
        return null;
    }

    public static String c() {
        Class cls = f13991k;
        if (cls == null) {
            return "";
        }
        try {
            if (((Boolean) cls.getField("IS_ALPHA_BUILD").get(null)).booleanValue()) {
                return "A";
            }
            if (((Boolean) f13991k.getField("IS_STABLE_VERSION").get(null)).booleanValue()) {
                return "S";
            }
            boolean zContains = Build.VERSION.INCREMENTAL.contains(".DEV");
            boolean zBooleanValue = ((Boolean) f13991k.getField("IS_DEVELOPMENT_VERSION").get(null)).booleanValue();
            if (!zBooleanValue || zContains) {
                return (zBooleanValue && zContains) ? "X" : "";
            }
            return "D";
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRomBuildCode failed: ");
            sb.append(e2.toString());
            return "";
        }
    }

    public static String d() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static int f() {
        Integer num;
        Throwable th;
        try {
            Method declaredMethod = Class.forName("android.os.UserHandle").getDeclaredMethod("getUserId", Integer.TYPE);
            declaredMethod.setAccessible(true);
            int iMyUid = Process.myUid();
            num = (Integer) declaredMethod.invoke(null, Integer.valueOf(iMyUid));
            try {
                p.a(j, String.format("getUserId, uid:%d, userId:%d", Integer.valueOf(iMyUid), num));
            } catch (Throwable th2) {
                th = th2;
                p.a(j);
                StringBuilder sb = new StringBuilder();
                sb.append("getUserId exception: ");
                sb.append(th.getMessage());
            }
        } catch (Throwable th3) {
            num = null;
            th = th3;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    @TargetApi(17)
    public static boolean g() {
        try {
            boolean z = Settings.Global.getInt(com.xiaomi.onetrack.f.a.b().getContentResolver(), "device_provisioned", 0) != 0;
            if (!z) {
                p.c(j, "Provisioned: " + z);
            }
            return z;
        } catch (Exception e2) {
            p.b(j, "isDeviceProvisioned exception", e2);
            return true;
        }
    }

    public static boolean h() {
        return (!a() || f13992r) ? p : l();
    }

    public static String i() {
        if ((!a() || f13992r) && !TextUtils.isEmpty(q)) {
            return q;
        }
        return k();
    }

    public static String j() {
        return k();
    }

    private static String k() {
        try {
            String strA = ab.a("ro.miui.region", "");
            if (TextUtils.isEmpty(strA)) {
                strA = ab.a("ro.product.locale.region", "");
            }
            if (TextUtils.isEmpty(strA)) {
                Object objInvoke = Class.forName("android.os.LocaleList").getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = objInvoke.getClass().getMethod(MediaStoreUtil.MediaInfo.SIZE, new Class[0]).invoke(objInvoke, new Object[0]);
                if ((objInvoke2 instanceof Integer) && ((Integer) objInvoke2).intValue() > 0) {
                    Object objInvoke3 = objInvoke.getClass().getMethod("get", Integer.TYPE).invoke(objInvoke, 0);
                    Object objInvoke4 = objInvoke3.getClass().getMethod("getCountry", new Class[0]).invoke(objInvoke3, new Object[0]);
                    if (objInvoke4 instanceof String) {
                        strA = (String) objInvoke4;
                    }
                }
            }
            if (TextUtils.isEmpty(strA)) {
                strA = Locale.getDefault().getCountry();
            }
            if (!TextUtils.isEmpty(strA)) {
                return strA.trim();
            }
        } catch (Throwable th) {
            p.b(j, "getRegion Exception: " + th.getMessage());
        }
        return "";
    }

    private static boolean l() {
        Class cls = f13991k;
        if (cls != null) {
            try {
                return ((Boolean) cls.getField("IS_INTERNATIONAL_BUILD").get(null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        String strK = k();
        if (TextUtils.isEmpty(strK)) {
            return false;
        }
        return !TextUtils.equals(ServerConstants.NEW_CN_COUNTRY_CODE, strK.toUpperCase());
    }

    public static String b() {
        return a(TimeZone.getDefault().getRawOffset());
    }

    public static String a(int i2) {
        char c2;
        try {
            int i3 = i2 / 60000;
            if (i3 < 0) {
                i3 = -i3;
                c2 = '-';
            } else {
                c2 = '+';
            }
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(c2);
            a(sb, i3 / 60);
            sb.append(AbstractJsonLexerKt.COLON);
            a(sb, i3 % 60);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static void a(StringBuilder sb, int i2) {
        String string = Integer.toString(i2);
        for (int i3 = 0; i3 < 2 - string.length(); i3++) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static boolean a(Context context) {
        if (l == null) {
            try {
                if (a()) {
                    int i2 = Settings.Secure.getInt(context.getContentResolver(), "upload_log_pref", -1);
                    p.a(j, "isUserExperiencePlanEnabled upload_log_value: " + i2);
                    if (i2 != 1 && i2 == 0) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                p.a(j, "Settings failed: " + th.toString());
            }
        }
        try {
            return ((Boolean) l.invoke(null, context.getContentResolver())).booleanValue();
        } catch (Throwable th2) {
            StringBuilder sb = new StringBuilder();
            sb.append("isUserExperiencePlanEnabled failed: ");
            sb.append(th2.getMessage());
            return true;
        }
    }

    public static boolean a(String str) {
        if (!OneTrack.isDisable() && !OneTrack.isUseSystemNetTrafficOnly()) {
            if (!g()) {
                p.c(str, "should not access network or location, not provisioned");
                return true;
            }
            if (com.xiaomi.onetrack.c.i.b()) {
                return false;
            }
            p.c(str, "should not access network or location, cta");
            return true;
        }
        p.c(str, "should not access network or location, cta");
        return true;
    }

    public static void a(boolean z, String str, OneTrack.Mode mode) {
        int i2;
        if (mode == OneTrack.Mode.APP) {
            i2 = 3;
        } else if (mode == OneTrack.Mode.PLUGIN) {
            i2 = 2;
        } else {
            i2 = mode == OneTrack.Mode.SDK ? 1 : 0;
        }
        if (s <= i2) {
            p = z;
            q = str;
            s = i2;
        }
    }

    public static void a(boolean z) {
        f13992r = z;
    }
}
