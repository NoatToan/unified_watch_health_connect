package wg;

import am.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import i3.e5;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import nh.n;
import org.apache.commons.lang3.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f185036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f185037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f185038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f185039g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f185040h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f185041i;

    public c(Context context, boolean z14) {
        String string;
        String packageName;
        long jA;
        context = context != null ? context.getApplicationContext() : context;
        String str = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
        try {
            string = UUID.randomUUID().toString();
        } catch (Throwable unused) {
            string = "12345678uuid";
        }
        this.f185033a = e5.g(string, ",", str);
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + "|" + a(packageInfo);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                packageName = "-";
            }
        } else {
            packageName = "-";
        }
        this.f185034b = com.nimbusds.jose.shaded.gson.internal.a.h(d(packageName), ",", d(str2), ",-,-,-");
        if (z14) {
            jA = 0;
        } else {
            synchronized (a.e.class) {
                jA = a.d.a(context, "alipay_cashier_statistic_v");
            }
        }
        this.f185035c = j.o(e.e(jA, "~"), ",-", p6.b.i("android,3,", d("15.8.30"), ",", d("h.a.3.8.30"), ",com.alipay.mcpay,5.0,-,"));
        this.f185036d = com.nimbusds.jose.shaded.gson.internal.a.h(d(mh.a.a(lh.b.b().f112390a).f118448a), ",", d(lh.b.b().a()), ",-,-,-");
        String string2 = "";
        if (context != null) {
            try {
                string2 = context.getResources().getConfiguration().locale.toString();
            } catch (Throwable unused4) {
            }
        }
        String strD = d(string2);
        String strD2 = d(Build.VERSION.RELEASE);
        String strD3 = d(Build.MODEL);
        String strD4 = d(nh.c.a(context).f126114b);
        String strD5 = d(oh.b.a(context, null));
        StringBuilder sbL = e5.l(strD, ",android,", strD2, ",", strD3);
        sn.a.t(sbL, ",-,0,", strD4, ",gw,", strD5);
        sbL.append(",-");
        this.f185037e = sbL.toString();
        this.f185038f = "-";
        this.f185041i = "-";
    }

    public static String a(PackageInfo packageInfo) {
        String strSubstring;
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    String strD = n.d(null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strD) ? CallerData.NA : n.r(strD).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb3.append("-");
                sb3.append(strSubstring);
            }
            return sb3.toString();
        } catch (Throwable unused2) {
            return CallerData.NA;
        }
    }

    public static String c(Throwable th3) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th3.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th3.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th3.getStackTrace();
            if (stackTrace != null) {
                int i14 = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i14++;
                    if (i14 > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    public final String b(String str) {
        String string;
        String strReplace;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split("&");
        String str2 = null;
        if (strArrSplit != null) {
            String strReplace2 = null;
            string = null;
            strReplace = null;
            for (String str3 : strArrSplit) {
                String[] strArrSplit2 = str3.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase("partner")) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("out_trade_no")) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("trade_no")) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(n.p(strArrSplit2[1], null));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(strReplace2)) {
                        strReplace2 = strArrSplit2[1];
                    }
                }
            }
            str2 = strReplace2;
        } else {
            string = null;
            strReplace = null;
        }
        StringBuilder sbL = e5.l(d(strReplace), ",", d(string), ",-,", d(str2));
        sbL.append(",-,-,-");
        String string2 = sbL.toString();
        String str4 = this.f185039g;
        if (TextUtils.isEmpty(str4)) {
            str4 = "-";
        }
        String str5 = this.f185040h;
        String str6 = TextUtils.isEmpty(str5) ? "-" : str5;
        StringBuilder sbI = p6.b.i("[(", this.f185033a, "),(", string2, "),(");
        sn.a.t(sbI, this.f185034b, "),(", this.f185035c, "),(");
        sn.a.t(sbI, this.f185036d, "),(", this.f185037e, "),(");
        sn.a.t(sbI, this.f185038f, "),(", str4, "),(");
        return e5.h(sbI, str6, "),(", this.f185041i, ")]");
    }

    public final synchronized void e(String str, String str2) {
        try {
            String str3 = TextUtils.isEmpty(this.f185039g) ? "" : "^";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            String strD = TextUtils.isEmpty("") ? "-" : d("");
            sb3.append(strD + "," + d(str) + "," + d(str2) + ",-,-,-,-,-,-,-,-,-,-," + d(new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date())));
            this.f185039g = this.f185039g.concat(sb3.toString());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void f(String str, String str2, String str3) {
        try {
            String str4 = TextUtils.isEmpty(this.f185040h) ? "" : "^";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            String strD = TextUtils.isEmpty(str3) ? "-" : d(str3);
            sb3.append(str + "," + str2 + "," + strD + "," + d(new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date())));
            this.f185040h = this.f185040h.concat(sb3.toString());
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
