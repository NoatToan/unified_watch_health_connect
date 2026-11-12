package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41640a;

    public zss(Context context) {
        this.f41640a = context.getApplicationContext();
    }

    public static String b() {
        return DebugKt.DEBUG_PROPERTY_VALUE_OFF;
    }

    public static String c() {
        return "ANDA0605000";
    }

    public static String d() {
        return "";
    }

    public static String f() {
        return "9.7.4";
    }

    public static String g() {
        return "";
    }

    public static String h() {
        return h0t.N();
    }

    public static String i() {
        return "";
    }

    public static String j() {
        return "";
    }

    public static String k() {
        return "";
    }

    public static String l() {
        return "";
    }

    public static String m() {
        return "";
    }

    public static String n() {
        return "";
    }

    public static String o() {
        return "";
    }

    public static String p() {
        return "ANDH070308";
    }

    public static String q() {
        return PluginPackageConstant.RN_DIR_A;
    }

    public static String r() {
        return "";
    }

    public static String s() {
        return "";
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("");
        sb.append("personal_switch=");
        sb.append(b());
        sb.append("&autodiv=");
        sb.append(c());
        String strD = d();
        if (!TextUtils.isEmpty(strD)) {
            sb.append("&tid=");
            sb.append(strD);
        }
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            sb.append("&adiu=");
            sb.append(strE);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            sb.append("&app_version=");
            sb.append(strF);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            sb.append("&cifa=");
            sb.append(strG);
        }
        String strH = h();
        if (!TextUtils.isEmpty(strH)) {
            sb.append("&deviceid=");
            sb.append(strH);
        }
        String strI = i();
        if (!TextUtils.isEmpty(strI)) {
            sb.append("&did=");
            sb.append(strI);
        }
        String strJ = j();
        if (!TextUtils.isEmpty(strJ)) {
            sb.append("&didv=");
            sb.append(strJ);
        }
        String strK = k();
        if (!TextUtils.isEmpty(strK)) {
            sb.append("&dic=");
            sb.append(strK);
        }
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            sb.append("&dip=");
            sb.append(strL);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            sb.append("&diu=");
            sb.append(strM);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            sb.append("&diu2=");
            sb.append(strN);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            sb.append("&diu3=");
            sb.append(strO);
        }
        String strP = p();
        if (!TextUtils.isEmpty(strP)) {
            sb.append("&div=");
            sb.append(strP);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            sb.append("&os=");
            sb.append(strQ);
        }
        String strR = r();
        if (!TextUtils.isEmpty(strR)) {
            sb.append("&stepid=");
            sb.append(strR);
        }
        String strS = s();
        if (!TextUtils.isEmpty(strS)) {
            sb.append("&session=");
            sb.append(strS);
        }
        return sb.toString();
    }

    public final String e() {
        return h0t.n(this.f41640a);
    }
}
