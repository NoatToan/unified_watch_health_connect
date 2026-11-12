package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.xiaomi.onetrack.api.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class fls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f17905a;

    public static int a(Context context) {
        if (f17905a <= 0) {
            f17905a = y0t.l(context);
        }
        return f17905a;
    }

    public static int b(boolean z) {
        return z ? 1 : 0;
    }

    public static SharedPreferences c(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    public static String d(String str, int i) {
        return f(str, String.valueOf(i));
    }

    public static String e(String str, long j) {
        return f(str, String.valueOf(j));
    }

    public static String f(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = AbstractJsonLexerKt.NULL;
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + ";" + str2;
    }

    public static List<als> g(Context context) {
        SharedPreferences sharedPreferencesC = c(context);
        String[] strArrL = l(sharedPreferencesC.getString(b.E, null));
        if (strArrL == null || strArrL.length <= 0) {
            x9s.o("DisconnectStatsSP Cached hosts data is empty,drop.");
            return null;
        }
        String[] strArrL2 = l(sharedPreferencesC.getString("network_state", null));
        String[] strArrL3 = l(sharedPreferencesC.getString("reason", null));
        String[] strArrL4 = l(sharedPreferencesC.getString("ping_interval", null));
        String[] strArrL5 = l(sharedPreferencesC.getString("network_type", null));
        String[] strArrL6 = l(sharedPreferencesC.getString("wifi_digest", null));
        String[] strArrL7 = l(sharedPreferencesC.getString("connected_network_type", null));
        String[] strArrL8 = l(sharedPreferencesC.getString("disconnect_time", null));
        String[] strArrL9 = l(sharedPreferencesC.getString("connected_time", null));
        String[] strArrL10 = l(sharedPreferencesC.getString("xmsf_vc", null));
        String[] strArrL11 = l(sharedPreferencesC.getString("android_vc", null));
        if (strArrL2 == null || strArrL3 == null || strArrL4 == null || strArrL5 == null || strArrL6 == null || strArrL7 == null || strArrL8 == null || strArrL9 == null || strArrL10 == null || strArrL11 == null || strArrL.length != strArrL2.length || strArrL.length != strArrL3.length || strArrL.length != strArrL4.length || strArrL.length != strArrL5.length || strArrL.length != strArrL6.length || strArrL.length != strArrL7.length || strArrL.length != strArrL8.length || strArrL.length != strArrL9.length || strArrL.length != strArrL10.length || strArrL.length != strArrL11.length) {
            x9s.o("DisconnectStatsSP Cached data incorrect,drop.");
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrL.length);
        int i = 0;
        while (i < strArrL.length) {
            als alsVar = new als();
            alsVar.d(1);
            alsVar.f(strArrL[i]);
            alsVar.j(det.a(strArrL2[i], -1));
            alsVar.o(det.a(strArrL3[i], -1));
            String[] strArr = strArrL2;
            String[] strArr2 = strArrL;
            ArrayList arrayList2 = arrayList;
            alsVar.e(det.b(strArrL4[i], -1L));
            alsVar.s(det.a(strArrL5[i], -1));
            alsVar.l(strArrL6[i]);
            alsVar.v(det.a(strArrL7[i], -1));
            long jB = det.b(strArrL8[i], -1L);
            long jB2 = det.b(strArrL9[i], -1L);
            alsVar.k(jB2 - jB);
            alsVar.p(jB);
            alsVar.t(jB2);
            alsVar.x(det.a(strArrL10[i], -1));
            alsVar.z(det.a(strArrL11[i], -1));
            arrayList2.add(alsVar);
            i++;
            strArrL2 = strArr;
            arrayList = arrayList2;
            strArrL4 = strArrL4;
            strArrL3 = strArrL3;
            strArrL = strArr2;
            strArrL5 = strArrL5;
        }
        return arrayList;
    }

    public static void h(Context context) {
        zks.g("upload");
        new dls().a(context, g(context));
        m(context);
    }

    public static void i(Context context, long j) {
        k5s.a(context).g(new mls(context, j));
    }

    public static void j(Context context, String str, int i, long j, int i2, long j2, int i3, String str2, int i4) {
        zks.g(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), str2, Integer.valueOf(i4)));
        SharedPreferences sharedPreferencesC = c(context);
        String string = sharedPreferencesC.getString(b.E, null);
        String string2 = sharedPreferencesC.getString("network_state", null);
        String string3 = sharedPreferencesC.getString("reason", null);
        String string4 = sharedPreferencesC.getString("ping_interval", null);
        String string5 = sharedPreferencesC.getString("network_type", null);
        String string6 = sharedPreferencesC.getString("wifi_digest", null);
        String string7 = sharedPreferencesC.getString("connected_network_type", null);
        String string8 = sharedPreferencesC.getString("disconnect_time", null);
        String string9 = sharedPreferencesC.getString("xmsf_vc", null);
        String string10 = sharedPreferencesC.getString("android_vc", null);
        String strF = f(string, str);
        String strD = d(string2, i);
        String strD2 = d(string3, i2);
        String strE = e(string4, j2);
        String strD3 = d(string5, i3);
        String strF2 = f(string6, str2);
        String strD4 = d(string7, i4);
        String strE2 = e(string8, j);
        String strD5 = d(string9, a(context));
        sharedPreferencesC.edit().putString(b.E, strF).putString("network_state", strD).putString("reason", strD2).putString("ping_interval", strE).putString("network_type", strD3).putString("wifi_digest", strF2).putString("connected_network_type", strD4).putString("disconnect_time", strE2).putString("xmsf_vc", strD5).putString("android_vc", d(string10, Build.VERSION.SDK_INT)).apply();
    }

    public static void k(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        k5s.a(context).g(new ils(context, str, z, j, i, j2, i2, str2, i3));
    }

    public static String[] l(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }

    public static void m(Context context) {
        zks.g("resetAfterUpload");
        c(context).edit().putString(b.E, null).putString("network_state", null).putString("reason", null).putString("ping_interval", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    public static synchronized void p(Context context, long j) {
        SharedPreferences sharedPreferencesC = c(context);
        long j2 = sharedPreferencesC.getLong("start_time_for_day", 0L);
        if (j2 == 0) {
            sharedPreferencesC.edit().putLong("start_time_for_day", j).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
            return;
        }
        int i = sharedPreferencesC.getInt("discnt_count", 0);
        int i2 = sharedPreferencesC.getInt("cnt_count", 0);
        if (i > i2) {
            sharedPreferencesC.edit().putInt("cnt_count", i2 + 1).putString("connected_time", e(sharedPreferencesC.getString("connected_time", null), j)).apply();
        }
        if (j - j2 >= 86400000) {
            sharedPreferencesC.edit().putLong("start_time_for_day", j).putInt("discnt_count_in_day", 0).apply();
            h(context);
        } else if (i >= 10) {
            h(context);
        }
    }

    public static synchronized void q(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        SharedPreferences sharedPreferencesC = c(context);
        long j3 = sharedPreferencesC.getLong("start_time_for_day", 0L);
        if (j3 == 0) {
            zks.g("recordDisconnection not initialized");
            return;
        }
        if (j - sharedPreferencesC.getLong("last_discnt_time", 0L) < 60000) {
            zks.g("recordDisconnection anti-shake");
            return;
        }
        if (j - j3 < 86400000) {
            int i4 = sharedPreferencesC.getInt("discnt_count_in_day", 0);
            if (i4 > 100) {
                zks.g("recordDisconnection count > 100 in 24H cycle,abandon.");
                return;
            } else {
                sharedPreferencesC.edit().putInt("discnt_count_in_day", i4 + 1).apply();
            }
        } else {
            zks.g("recordDisconnection with the current time exceeds 24H cycle, go on.");
        }
        int i5 = sharedPreferencesC.getInt("discnt_count", 0);
        if (i5 == sharedPreferencesC.getInt("cnt_count", 0)) {
            j(context, str, b(z), j, i, j2, i2, str2, i3);
            sharedPreferencesC.edit().putLong("last_discnt_time", j).putInt("discnt_count", i5 + 1).apply();
        }
        zks.g("recordDisconnection complete");
    }
}
