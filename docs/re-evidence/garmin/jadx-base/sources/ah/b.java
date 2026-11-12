package ah;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import i3.e5;
import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import nh.c;
import nh.n;
import oh.e;
import oh.g;
import org.apache.commons.lang3.StringUtils;
import v.e0;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f3278d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3281c;

    public b() {
        this.f3280b = "sdk-and-lite";
        String str = ug.a.f170547a;
        if (TextUtils.isEmpty(str) || TextUtils.equals("cn", ug.a.f170547a)) {
            return;
        }
        this.f3280b = "sdk-and-lite_" + str;
    }

    public static synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(lh.b.b().f112390a).edit().putString("trideskey", str).apply();
        yg.a.f196899a = str;
    }

    public static synchronized b c() {
        try {
            if (f3278d == null) {
                f3278d = new b();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f3278d;
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb3 = new StringBuilder("(");
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb3.append(packageName);
            sb3.append(";");
            sb3.append(packageInfo.versionCode);
            sb3.append(")");
            return sb3.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbK = e5.k(hexString);
        sbK.append(random.nextInt(9000) + 1000);
        return sbK.toString();
    }

    public final String a(lh.a aVar, mh.a aVar2) {
        String str;
        Context context = lh.b.b().f112390a;
        if (c.f126109a == null) {
            c.f126109a = new c(context);
        }
        c cVar = c.f126109a;
        boolean z14 = false;
        if (TextUtils.isEmpty(this.f3279a)) {
            String str2 = "Android " + Build.VERSION.RELEASE;
            String strO = n.o();
            String string = context.getResources().getConfiguration().locale.toString();
            if (fg.b.f71198a == fg.b.a.PRE_SANDBOX) {
                str = "https://mobilegw.alipaydev.com/mgw.htm";
            } else if (fg.b.f71198a == fg.b.a.SANDBOX) {
                str = "https://mobilegw.dl.alipaydev.com/mgw.htm";
            } else {
                str = "https://mobilegw.alipay.com/mgw.htm";
                TextUtils.isEmpty("https://mobilegw.alipay.com/mgw.htm");
            }
            String strSubstring = str.substring(0, str.indexOf("://"));
            String strQ = n.q(context);
            String string2 = Float.toString(new TextView(context).getTextSize());
            StringBuilder sbI = p6.b.i("Msp/15.8.30 (", str2, ";", strO, ";");
            sn.a.t(sbI, string, ";", strSubstring, ";");
            this.f3279a = e0.h(sbI, strQ, ";", string2);
        }
        String str3 = c.a(context).f126114b;
        cVar.getClass();
        Context context2 = lh.b.b().f112390a;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("virtualImeiAndImsi", 0);
        String string3 = sharedPreferences.getString("virtual_imsi", null);
        String strE = "000000000000000";
        if (TextUtils.isEmpty(string3)) {
            if (TextUtils.isEmpty(mh.a.a(context2).f118448a)) {
                String strA = lh.b.b().a();
                string3 = (TextUtils.isEmpty(strA) || strA.length() < 18) ? e() : strA.substring(3, 18);
            } else {
                if (c.f126109a == null) {
                    c.f126109a = new c(context2);
                }
                c.f126109a.getClass();
                string3 = "000000000000000";
            }
            sharedPreferences.edit().putString("virtual_imsi", string3).apply();
        }
        Context context3 = lh.b.b().f112390a;
        SharedPreferences sharedPreferences2 = context3.getSharedPreferences("virtualImeiAndImsi", 0);
        String string4 = sharedPreferences2.getString("virtual_imei", null);
        if (TextUtils.isEmpty(string4)) {
            if (TextUtils.isEmpty(mh.a.a(context3).f118448a)) {
                strE = e();
            } else {
                if (c.f126109a == null) {
                    c.f126109a = new c(context3);
                }
                c.f126109a.getClass();
            }
            sharedPreferences2.edit().putString("virtual_imei", strE).apply();
            string4 = strE;
        }
        this.f3281c = aVar2.f118449b;
        String strReplace = Build.MANUFACTURER.replace(";", StringUtils.SPACE);
        String strReplace2 = Build.MODEL.replace(";", StringUtils.SPACE);
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i14 = 0; i14 < 10; i14++) {
            if (new File(strArr[i14]).exists()) {
                z14 = true;
                break;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sn.a.t(sb3, this.f3279a, ";", str3, ";-1;-1;1;000000000000000;000000000000000;");
        sn.a.t(sb3, this.f3281c, ";", strReplace, ";");
        h.C(strReplace2, ";", ";00:00:00:00:00:00;-1;-1;", sb3, z14);
        sn.a.t(sb3, this.f3280b, ";", string3, ";");
        sb3.append(string4);
        sb3.append(";-1;00");
        String strB = oh.b.b(context, aVar);
        String str4 = mh.a.a(context).f118448a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        e eVar = new e();
        g gVar = new g(str4, strB, applicationContext, aVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        String str5 = (String) oh.a.b(4, 10L, timeUnit, eVar, gVar, true, 3L, timeUnit, aVar, true);
        if (!TextUtils.isEmpty(str5)) {
            sb3.append(";;;");
            sb3.append(str5);
        }
        sb3.append(")");
        return sb3.toString();
    }
}
