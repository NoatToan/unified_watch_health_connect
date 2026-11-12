package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.m.x.c;
import com.huawei.operation.utils.Constants;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile my f42684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42685b = "sdk-and-lite";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42686c;
    public String d;

    public my() {
        String strB = mn.b();
        if (mn.c()) {
            return;
        }
        this.f42685b += '_' + strB;
    }

    public static my a() {
        my myVar;
        synchronized (my.class) {
            if (f42684a == null) {
                f42684a = new my();
            }
            myVar = f42684a;
        }
        return myVar;
    }

    public static String b() {
        return "-1;-1";
    }

    public static String c() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public static String d() {
        Context contextC = ol.e().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imei", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strC = TextUtils.isEmpty(ok.a(contextC).e()) ? c() : c.d(contextC).c();
        sharedPreferences.edit().putString("virtual_imei", strC).apply();
        return strC;
    }

    public static String e() {
        return "1";
    }

    public static String f() {
        String strD;
        Context contextC = ol.e().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imsi", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(ok.a(contextC).e())) {
            String strB = ol.e().b();
            strD = (TextUtils.isEmpty(strB) || strB.length() < 18) ? c() : strB.substring(3, 18);
        } else {
            strD = c.d(contextC).d();
        }
        sharedPreferences.edit().putString("virtual_imsi", strD).apply();
        return strD;
    }

    public static String g() {
        return "00";
    }

    public static String i() {
        return "-1";
    }

    public static void b(String str) {
        synchronized (my.class) {
            oq.b("mspl", "setRsaPublicKey");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(ol.e().c()).edit().putString("trideskey", str).apply();
            mz.f42719a = str;
        }
    }

    public static String d(Context context) {
        if (context != null) {
            try {
                StringBuilder sb = new StringBuilder(Constants.LEFT_BRACKET_ONLY);
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                sb.append(packageName);
                sb.append(";");
                sb.append(packageInfo.versionCode);
                sb.append(Constants.RIGHT_BRACKET_ONLY);
                return sb.toString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String b(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public String a(on onVar, ok okVar, boolean z) {
        Context contextC = ol.e().c();
        c cVarD = c.d(contextC);
        if (TextUtils.isEmpty(this.d)) {
            this.d = "Msp/15.8.35 (" + ox.d() + ";" + ox.a() + ";" + ox.e(contextC) + ";" + ox.d(contextC) + ";" + ox.i(contextC) + ";" + b(contextC);
        }
        String strB = c.a(contextC).b();
        String strA = ox.a(contextC);
        String strE = e();
        String strD = cVarD.d();
        String strC = cVarD.c();
        String strF = f();
        String strD2 = d();
        if (okVar != null) {
            this.f42686c = okVar.c();
        }
        String strReplace = Build.MANUFACTURER.replace(";", " ");
        String strReplace2 = Build.MODEL.replace(";", " ");
        boolean zA = ol.a();
        String strB2 = cVarD.b();
        String strI = i();
        String strG = g();
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(";");
        sb.append(strB);
        sb.append(";");
        sb.append(strA);
        sb.append(";");
        sb.append(strE);
        sb.append(";");
        sb.append(strD);
        sb.append(";");
        sb.append(strC);
        sb.append(";");
        sb.append(this.f42686c);
        sb.append(";");
        sb.append(strReplace);
        sb.append(";");
        sb.append(strReplace2);
        sb.append(";");
        sb.append(zA);
        sb.append(";");
        sb.append(strB2);
        sb.append(";");
        sb.append(b());
        sb.append(";");
        sb.append(this.f42685b);
        sb.append(";");
        sb.append(strF);
        sb.append(";");
        sb.append(strD2);
        sb.append(";");
        sb.append(strI);
        sb.append(";");
        sb.append(strG);
        if (okVar != null) {
            String strB3 = pd.b(onVar, contextC, ok.a(contextC).e(), pd.c(onVar, contextC));
            if (!TextUtils.isEmpty(strB3)) {
                sb.append(";;;");
                sb.append(strB3);
            }
        }
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        return sb.toString();
    }
}
