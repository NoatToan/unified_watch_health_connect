package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CountryConfig;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.cn;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.opendevice.open.c;
import com.huawei.opendevice.open.f;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class ohk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f44322a = "UNKNOWN";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f44323b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f44324c = "";
    private static String d = "";
    private static boolean e = false;
    private static String f = "";
    private static f h;
    private static ohl j;

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context, String str, String str2) {
        String str3 = Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault()) + Constants.LINK + Locale.getDefault().getCountry().toLowerCase(Locale.getDefault());
        String strT = dk.t(context);
        j.c(str2);
        j.e(str3);
        j.b(strT);
        return str + Constants.LANGUAGE + str3 + Constants.VERSION + str2 + Constants.SCRIPT + strT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context, String str, String str2) {
        String str3 = Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault()) + Constants.LINK + Locale.getDefault().getCountry().toLowerCase(Locale.getDefault());
        String strT = dk.t(context);
        j.c(str2);
        j.e(str3);
        j.b(strT);
        return str + Constants.LANGUAGE + str3 + "&branchid=0&version=" + str2 + "&contenttag=default";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, c cVar) {
        if (TextUtils.isEmpty(str)) {
            cVar.g();
        } else {
            hw.b("PrivacyUrlUtil", "statement url= %s", ds.a(str));
            cVar.a(str);
        }
        f fVar = h;
        if (fVar != null) {
            fVar.a(j);
        }
    }

    public static void b(final Context context, final c cVar) {
        o.b(new Runnable() { // from class: ohk.2
            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb;
                String str;
                String str2;
                hw.b("PrivacyUrlUtil", "config whyThisAdStatement url, isChina: %s", Boolean.valueOf(ohk.e));
                ohk.b(context);
                String strA = dg.a(context, "haid_third_ad_info");
                if (ohk.e) {
                    sb = new StringBuilder();
                    sb.append(strA);
                    str = Constants.THIRD_AD_INFO_CN;
                } else {
                    sb = new StringBuilder();
                    sb.append(strA);
                    str = Constants.THIRD_AD_INFO_OVERSEA;
                }
                sb.append(str);
                String string = sb.toString();
                ohk.f += string;
                if (!TextUtils.isEmpty(ohk.d)) {
                    str2 = ohk.d + string;
                } else {
                    hw.b("PrivacyUrlUtil", "grs url return null or empty, use local defalut url.");
                    str2 = ohk.f;
                }
                String unused = ohk.d = str2;
                ohk.b(ohk.c(context, ohk.d, "20221229"), cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        String str;
        boolean zD = cc.a(context).d();
        e = zD;
        if (zD) {
            str = "CN";
        } else {
            String strA = new CountryCodeBean(context).a();
            f44322a = strA;
            str = "UNKNOWN".equalsIgnoreCase(strA) ? "EU" : f44322a;
        }
        f44322a = str;
        cn.a(context).z(f44322a);
        j = new ohl();
        gk gkVarB = fp.b(context);
        f44323b = gkVarB.a(context, "amsServer");
        d = gkVarB.a(context, "h5Server");
        if (hw.a()) {
            hw.a("PrivacyUrlUtil", "base url for %s is: %s; h5Server is: %s", "amsServer", ds.a(f44323b), ds.a(d));
        }
        f44324c = dg.a(context, "hiad_privacyServer");
        f = e(context, f44322a);
    }

    public static void a(f fVar) {
        h = fVar;
    }

    public static void d(final Context context, final c cVar) {
        o.b(new Runnable() { // from class: ohk.3
            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb;
                Context context2;
                String str;
                String str2;
                String str3;
                hw.b("PrivacyUrlUtil", "config privacy statement url, isChina: %s.", Boolean.valueOf(ohk.e));
                ohk.b(context);
                if (ohk.e) {
                    sb = new StringBuilder();
                    context2 = context;
                    str = "hiad_privacyPath";
                } else {
                    sb = new StringBuilder();
                    context2 = context;
                    str = "hiad_thirdPrivacyOverseaPath";
                }
                sb.append(dg.a(context2, str));
                sb.append(ohk.f44322a);
                String string = sb.toString();
                ohk.f44324c += string;
                if (!TextUtils.isEmpty(ohk.f44323b)) {
                    str2 = ohk.f44323b + string;
                } else {
                    hw.b("PrivacyUrlUtil", "grs url return null or empty, use local defalut url.");
                    str2 = ohk.f44324c;
                }
                String unused = ohk.f44323b = str2;
                ohk.j.a("privacy" + ohk.f44322a);
                if (ohk.e) {
                    ohk.j.a("privacyThirdCN");
                    str3 = "20230927";
                } else {
                    str3 = "20240514";
                }
                ohk.b(ohk.b(context, ohk.f44323b, str3), cVar);
            }
        });
    }

    private static String e(Context context, String str) {
        String str2;
        if (CountryConfig.isDR1(str, null)) {
            str2 = "haid_h5_content_server_CN";
        } else if (CountryConfig.isDR2(str, null)) {
            str2 = "haid_h5_content_server_HK";
        } else if (CountryConfig.isDR3(str, null)) {
            str2 = "haid_h5_content_server_EU";
        } else if (CountryConfig.isDR4(str, null)) {
            str2 = "haid_h5_content_server_RU";
        } else {
            hw.c("PrivacyUrlUtil", "getH5LocalUrl error, countryCode not belong to any site.");
            str2 = "haid_h5_content_server";
        }
        return dg.a(context, str2);
    }
}
