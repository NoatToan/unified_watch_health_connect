package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.x.c;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class mw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42547c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String i;
    public String j = "";
    public String g = "";

    public mw(Context context, boolean z) {
        context = context != null ? context.getApplicationContext() : context;
        this.d = c();
        this.e = a(context);
        this.f42546b = a(z ? 0L : mu.a.d(context));
        this.f42547c = b();
        this.f = e(context);
        this.h = Constants.LINK;
        this.i = Constants.LINK;
    }

    public static String d() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public void b(String str, String str2, Throwable th) {
        b(str, str2, a(th));
    }

    public final void c(String str, String str2, String str3) {
        synchronized (this) {
            oq.c("mspl", String.format("event %s %s %s", str, str2, str3));
            String str4 = TextUtils.isEmpty(this.j) ? "" : "^";
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", TextUtils.isEmpty(str) ? Constants.LINK : d(str), d(str2), d(str3), d(a())));
            this.j += sb.toString();
        }
    }

    public void e(String str, String str2, String str3) {
        b(str, str2, str3);
    }

    public static String a() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public final void b(String str, String str2, String str3) {
        synchronized (this) {
            oq.d("mspl", String.format("err %s %s %s", str, str2, str3));
            String str4 = TextUtils.isEmpty(this.g) ? "" : "^";
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(String.format("%s,%s,%s,%s", str, str2, TextUtils.isEmpty(str3) ? Constants.LINK : d(str3), d(a())));
            this.g += sb.toString();
        }
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? Constants.LINK : str;
    }

    public void c(String str, String str2, Throwable th, String str3) {
        b(str, str2, str3 + ": " + a(th));
    }

    public void a(String str, String str2, String str3) {
        c("", str, str2 + "|" + str3);
    }

    public void c(String str, String str2) {
        c("", str, str2);
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName()).append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString()).append(" 》 ");
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

    public String c(String str) {
        String strA = a(str);
        this.f42545a = strA;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.d, strA, this.e, this.f42546b, this.f42547c, this.f, this.h, e(this.j), e(this.g), this.i);
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("[", "【").replace("]", "】").replace(com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY, "（").replace(com.huawei.operation.utils.Constants.RIGHT_BRACKET_ONLY, "）").replace(",", "，").replace("^", AwarenessConstants.SECOND_ACTION_SPLITE_TAG).replace("#", "＃");
    }

    public static String c() {
        return String.format("%s,%s", d(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String a(String str) {
        String str2;
        String string;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split("&");
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
                            JSONObject jSONObject = new JSONObject(ox.c(on.d(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(strReplace)) {
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
        return String.format("%s,%s,-,%s,-,-,-", d(strReplace), d(string), d(str2));
    }

    public static String e(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", d(c.b(context)), OsType.ANDROID, d(Build.VERSION.RELEASE), d(Build.MODEL), Constants.LINK, "0", d(c.a(context).b()), "gw", d(pd.e(null, context)));
    }

    public static String a(Context context) {
        String str;
        String str2 = Constants.LINK;
        if (context == null) {
            str = Constants.LINK;
        } else {
            try {
                Context applicationContext = context.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + "|" + e(packageInfo);
                } catch (Throwable unused) {
                }
                str = str2;
                str2 = packageName;
            } catch (Throwable unused2) {
                str = Constants.LINK;
            }
        }
        return String.format("%s,%s,-,-,-", d(str2), d(str));
    }

    public static String e(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String strSubstring;
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.signatures.length);
                for (Signature signature : packageInfo.signatures) {
                    try {
                        String strC = ox.c((on) null, signature.toByteArray());
                        strSubstring = TextUtils.isEmpty(strC) ? "?" : ox.h(strC).substring(0, 8);
                    } catch (Throwable unused) {
                    }
                    sb.append(Constants.LINK);
                    sb.append(strSubstring);
                }
                return sb.toString();
            } catch (Throwable unused2) {
                return "?";
            }
        }
        return "0";
    }

    public static String a(long j) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", d("15.8.35"), d("h.a.3.8.35"), AwarenessConstants.SECOND_ACTION_SPLITE_TAG + j);
    }

    public static String b() {
        return String.format("%s,%s,-,-,-", d(ok.a(ol.e().c()).e()), d(ol.e().b()));
    }
}
