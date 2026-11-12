package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.health.connect.client.records.metadata.DeviceTypes;

/* JADX INFO: loaded from: classes11.dex */
public class zks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static pls f41412a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f41413b = -1;
    public static String c;

    public static int a(Context context) {
        String str;
        try {
            xbs xbsVarE = obs.e();
            if (xbsVarE == null) {
                j(null);
                return -1;
            }
            if (xbsVarE.a() != 0) {
                if (xbsVarE.a() != 1 && xbsVarE.a() != 6) {
                    j(null);
                    return -1;
                }
                j("WIFI-ID-UNKNOWN");
                return 1;
            }
            String strH = xbsVarE.h();
            if (TextUtils.isEmpty(strH) || DeviceTypes.UNKNOWN.equalsIgnoreCase(strH)) {
                str = null;
            } else {
                str = "M-" + strH;
            }
            j(str);
            return 0;
        } catch (Exception e) {
            x9s.D("DisconnectStatsHelper getNetType occurred error: " + e.getMessage());
            j(null);
            return -1;
        }
    }

    public static synchronized String b() {
        return c;
    }

    public static void c(Context context) {
        if (!h(context)) {
            g("onReconnection shouldSampling = false");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f41413b = a(context);
        fls.i(context, jCurrentTimeMillis);
        g("onReconnection connectedNetworkType = " + f41413b);
    }

    public static void d(Context context, gws gwsVar) {
        if (h(context)) {
            if (f41412a == null) {
                f41412a = new pls(context);
            }
            gwsVar.j(f41412a);
            g("startStats");
        }
    }

    public static void e(Context context, String str) {
        if (!h(context)) {
            g("onWifiChanged shouldSampling = false");
            return;
        }
        g("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j("W-" + str);
    }

    public static void f(Context context, String str, int i) {
        if (!h(context)) {
            g("onDisconnection shouldSampling = false");
            return;
        }
        fls.k(context, str, obs.w(context), System.currentTimeMillis(), i, cdt.c(context).l(), a(context), b(), f41413b);
        g("onDisconnection");
    }

    public static void g(String str) {
        tks.b("Push-DiscntStats", str);
    }

    public static boolean h(Context context) {
        return tks.c(context);
    }

    public static void i(Context context, gws gwsVar) {
        pls plsVar = f41412a;
        if (plsVar != null) {
            gwsVar.x(plsVar);
            f41412a = null;
            g("stopStats");
        }
    }

    public static synchronized void j(String str) {
        try {
            if ("WIFI-ID-UNKNOWN".equals(str)) {
                String str2 = c;
                if (str2 == null || !str2.startsWith("W-")) {
                    c = null;
                }
            } else {
                c = str;
            }
            g("updateNetId new networkId = " + str + ", finally netId = " + c);
        } catch (Throwable th) {
            throw th;
        }
    }
}
