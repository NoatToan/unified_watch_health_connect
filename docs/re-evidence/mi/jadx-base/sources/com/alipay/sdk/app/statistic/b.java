package com.alipay.sdk.app.statistic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.util.c;
import com.alipay.sdk.util.k;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.gv5;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5829b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h = "";
    public String i = "";
    public String j;

    public b(Context context, boolean z) {
        context = context != null ? context.getApplicationContext() : context;
        this.f5828a = n();
        this.c = b(context);
        this.d = a(z ? 0L : a.c.a(context));
        this.e = t();
        this.f = k(context);
        this.g = "-";
        this.j = "-";
    }

    public static String a(long j) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", l("15.7.5"), l("h.a.3.7.5"), "~" + j);
    }

    public static String b(Context context) {
        String packageName;
        String str;
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + "|" + c(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                packageName = "-";
            }
            str = str2;
            str2 = packageName;
        } else {
            str = "-";
        }
        return String.format("%s,%s,-,-,-", l(str2), l(str));
    }

    public static String c(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String strSubstring;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    String strG = k.g(null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strG) ? "?" : k.H(strG).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb.append("-");
                sb.append(strSubstring);
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static String j() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String k(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", l(com.alipay.sdk.util.a.f(context)), PluginPackageConstant.RN_DIR_A, l(Build.VERSION.RELEASE), l(Build.MODEL), "-", l(com.alipay.sdk.util.a.a(context).b()), l(com.alipay.sdk.util.a.c(context).b()), "gw", l(com.alipay.sdk.util.a.a(context).d()));
    }

    public static String l(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, "＃");
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String n() {
        return String.format("%s,%s", q(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String o(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    public static String q() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public static String r(String str) {
        String str2;
        String string;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        String strReplace = null;
        if (strArrSplit != null) {
            string = null;
            String strReplace2 = null;
            for (String str3 : strArrSplit) {
                String[] strArrSplit2 = str3.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase("partner")) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("out_trade_no")) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("trade_no")) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(k.s(com.alipay.sdk.sys.a.a(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase(g.d) && TextUtils.isEmpty(strReplace)) {
                        strReplace = strArrSplit2[1];
                    }
                }
            }
            str2 = strReplace;
            strReplace = strReplace2;
        } else {
            str2 = null;
            string = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", l(strReplace), l(string), l(str2));
    }

    public static String t() {
        return String.format("%s,%s,-,-,-", l(com.alipay.sdk.tid.a.a(com.alipay.sdk.sys.b.a().c()).b()), l(com.alipay.sdk.sys.b.a().f()));
    }

    public String d(String str) {
        String strR = r(str);
        this.f5829b = strR;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f5828a, strR, this.c, this.d, this.e, this.f, this.g, o(this.h), o(this.i), this.j);
    }

    public void f(String str, String str2) {
        s("", str, str2);
    }

    public void g(String str, String str2, String str3) {
        p(str, str2, str3);
    }

    public void h(String str, String str2, Throwable th) {
        p(str, str2, e(th));
    }

    public void i(String str, String str2, Throwable th, String str3) {
        p(str, str2, str3 + ": " + e(th));
    }

    public void m(String str, String str2, String str3) {
        s("", str, str2 + "|" + str3);
    }

    public final synchronized void p(String str, String str2, String str3) {
        try {
            c.h("mspl", String.format("err %s %s %s", str, str2, str3));
            String str4 = "";
            if (!TextUtils.isEmpty(this.i)) {
                str4 = "^";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = TextUtils.isEmpty(str3) ? "-" : l(str3);
            objArr[3] = l(j());
            sb.append(String.format("%s,%s,%s,%s", objArr));
            this.i += sb.toString();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s(String str, String str2, String str3) {
        try {
            c.f("mspl", String.format("event %s %s %s", str, str2, str3));
            String str4 = "";
            if (!TextUtils.isEmpty(this.h)) {
                str4 = "^";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            Object[] objArr = new Object[4];
            objArr[0] = TextUtils.isEmpty(str) ? "-" : l(str);
            objArr[1] = l(str2);
            objArr[2] = l(str3);
            objArr[3] = l(j());
            sb.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
            this.h += sb.toString();
        } catch (Throwable th) {
            throw th;
        }
    }
}
