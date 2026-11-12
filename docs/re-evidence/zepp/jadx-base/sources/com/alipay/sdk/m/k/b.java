package com.alipay.sdk.m.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u.c;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static final String A = "H5PayDataAnalysisError";
    public static final String B = "H5AuthDataAnalysisError";
    public static final String C = "PublicKeyUnmatch";
    public static final String D = "ClientBindFailed";
    public static final String E = "TriDesEncryptError";
    public static final String F = "TriDesDecryptError";
    public static final String G = "ClientBindException";
    public static final String H = "SaveTradeTokenError";
    public static final String I = "ClientBindServiceFailed";
    public static final String J = "TryStartServiceEx";
    public static final String K = "BindWaitTimeoutEx";
    public static final String L = "CheckClientExistEx";
    public static final String M = "CheckClientSignEx";
    public static final String N = "GetInstalledAppEx";
    public static final String O = "ParserTidClientKeyEx";
    public static final String P = "PgApiInvoke";
    public static final String Q = "PgBindStarting";
    public static final String R = "PgBinded";
    public static final String S = "PgBindEnd";
    public static final String T = "PgBindPay";
    public static final String U = "PgReturn";
    public static final String V = "PgReturnV";
    public static final String W = "PgWltVer";
    public static final String X = "PgOpenStarting";
    public static final String Y = "ErrIntentEx";
    public static final String Z = "ErrActNull";
    public static final String a0 = "ErrActNull";
    public static final String b0 = "GetInstalledAppEx";
    public static final String c0 = "StartLaunchAppTransEx";
    public static final String d0 = "CheckLaunchAppExistEx";
    public static final String e0 = "LogBindCalledH5";
    public static final String f0 = "LogCalledH5";
    public static final String g0 = "LogHkLoginByIntent";
    public static final String h0 = "SchemePayWrongHashEx";
    public static final String i0 = "LogAppFetchConfigTimeout";
    public static final String j0 = "H5CbUrlEmpty";
    public static final String k = "net";
    public static final String k0 = "H5CbEx";
    public static final String l = "biz";
    public static final String l0 = "StartActivityEx";
    public static final String m = "cp";
    public static final String m0 = "JSONEx";
    public static final String n = "auth";
    public static final String n0 = "ParseBundleSerializableError";
    public static final String o = "third";
    public static final String o0 = "ParseSchemeQueryError";
    public static final String p = "wlt";
    public static final String p0 = "TbChk";
    public static final String q = "FormatResultEx";
    public static final String q0 = "TbStart";
    public static final String r = "GetApdidEx";
    public static final String r0 = "TbCancel";
    public static final String s = "GetApdidNull";
    public static final String s0 = "TbUnknown";
    public static final String t = "GetApdidTimeout";
    public static final String t0 = "TbOk";
    public static final String u = "GetUtdidEx";
    public static final String u0 = "TbActFail";
    public static final String v = "GetPackageInfoEx";
    public static final String v0 = "partner";
    public static final String w = "NotIncludeSignatures";
    public static final String w0 = "out_trade_no";
    public static final String x = "GetPublicKeyFromSignEx";
    public static final String x0 = "trade_no";
    public static final String y = "SSLError";
    public static final String y0 = "biz_content";
    public static final String z = "SSLDenied";
    public static final String z0 = "app_id";
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h = "";
    public String i = "";
    public String j;

    public b(Context context, boolean z2) {
        context = context != null ? context.getApplicationContext() : context;
        this.a = b();
        this.c = a(context);
        this.d = a(z2 ? 0L : a.e.a(context));
        this.e = a();
        this.f = b(context);
        this.g = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        this.j = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    public static String c() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    private synchronized void d(String str, String str2, String str3) {
        e.d(com.alipay.sdk.m.l.a.z, String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.h)) {
            str4 = "^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : c(str);
        objArr[1] = c(str2);
        objArr[2] = c(str3);
        objArr[3] = c(c());
        sb.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        this.h += sb.toString();
    }

    public static String e() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    private boolean f() {
        return TextUtils.isEmpty(this.i);
    }

    public void a(String str, String str2, Throwable th) {
        e(str, str2, a(th));
    }

    public void b(String str, String str2, String str3) {
        e(str, str2, str3);
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String b() {
        return String.format("%s,%s", e(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", Constants.WAVE_SEPARATOR).replace(UpdateUtils.CMD_FILTER, "＃");
    }

    private synchronized void e(String str, String str2, String str3) {
        e.c(com.alipay.sdk.m.l.a.z, String.format("err %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.i)) {
            str4 = "^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = TextUtils.isEmpty(str3) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : c(str3);
        objArr[3] = c(c());
        sb.append(String.format("%s,%s,%s,%s", objArr));
        this.i += sb.toString();
    }

    public void a(String str, String str2, Throwable th, String str3) {
        e(str, str2, str3 + ": " + a(th));
    }

    public static String b(String str) {
        String string;
        String strReplace;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split(com.alipay.sdk.m.s.a.l);
        String strReplace2 = null;
        if (strArrSplit != null) {
            string = null;
            strReplace = null;
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(SearchCriteria.EQ);
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase(v0)) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(w0)) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(x0)) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(y0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(n.e(com.alipay.sdk.m.s.a.f(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString(w0);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(strReplace2)) {
                        strReplace2 = strArrSplit2[1];
                    }
                }
            }
        } else {
            string = null;
            strReplace = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", c(strReplace), c(string), c(strReplace2));
    }

    public void a(String str, String str2, String str3) {
        d("", str, str2 + AESEncryptionHelper.SEPARATOR + str3);
    }

    public void a(String str, String str2) {
        d("", str, str2);
    }

    public static String a(Throwable th) {
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

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : str;
    }

    public String a(String str) {
        String strB = b(str);
        this.b = strB;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.a, strB, this.c, this.d, this.e, this.f, this.g, d(this.h), d(this.i), this.j);
    }

    public static String a(Context context) {
        String packageName;
        String str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str = packageInfo.versionName + AESEncryptionHelper.SEPARATOR + a(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                packageName = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
        } else {
            packageName = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        return String.format("%s,%s,-,-,-", c(packageName), c(str));
    }

    public static String a(PackageInfo packageInfo) {
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
                    String strA = n.a((com.alipay.sdk.m.s.a) null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strA) ? "?" : n.g(strA).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(strSubstring);
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    public static String b(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", c(c.c(context)), "android", c(Build.VERSION.RELEASE), c(Build.MODEL), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "0", c(c.d(context).b()), "gw", c(com.alipay.sdk.m.w.b.b(null, context)));
    }

    public static String a(long j) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", c("15.8.09"), c("h.a.3.8.09"), Constants.WAVE_SEPARATOR + j);
    }

    public static String a() {
        return String.format("%s,%s,-,-,-", c(com.alipay.sdk.m.t.a.a(com.alipay.sdk.m.s.b.d().b()).d()), c(com.alipay.sdk.m.s.b.d().c()));
    }
}
