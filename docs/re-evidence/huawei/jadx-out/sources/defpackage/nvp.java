package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nvp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DeviceInfo f43833c = null;
    private static boolean d = false;

    public static String c() {
        return Build.FINGERPRINT;
    }

    public static String e() {
        return Build.MODEL;
    }

    public static String d() {
        return "ro.build.display.id";
    }

    public static String b(Context context) {
        String strB;
        String country;
        if (context == null) {
            strB = "";
            country = "";
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            strB = LanguageUtil.b(context);
            country = configuration.locale.getCountry();
        }
        return (strB + '-' + country).toLowerCase(Locale.ENGLISH);
    }

    public static String b() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String b(String str, Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            LogUtil.j("checkNewVersionThreadUtil", "getPackageVersionName context is null");
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("checkNewVersionThreadUtil", "getPackageVersionName NameNotFoundException ", str, " does not found");
            packageInfo = null;
        }
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionName);
        }
        return null;
    }

    public static void b(DeviceInfo deviceInfo) {
        f43833c = deviceInfo;
    }

    public static void b(boolean z) {
        d = z;
    }

    public static String d(String str, boolean z, boolean z2) {
        LogUtil.a("checkNewVersionThreadUtil", "getResponse url = ", nuw.i());
        if (eei.d(f43833c) && !z && nvd.a() == null) {
            LogUtil.j("checkNewVersionThreadUtil", "It is honor device but is not config ota");
            return "{\"status\":\"1\"}";
        }
        String strD = d(nuw.i(), str);
        return z2 ? strD : e(strD, str, false, z, true);
    }

    public static String e(String str) {
        LogUtil.a("checkNewVersionThreadUtil", "getResponse url = ", nuw.e());
        String strD = lon.c().d("domain_honor_ota_unavailable");
        if (d && strD != null && strD.equals("YES")) {
            LogUtil.j("checkNewVersionThreadUtil", "getScaleResponse not detected");
            return "{\"status\":\"1\"}";
        }
        if (d && nvd.a() == null) {
            LogUtil.j("checkNewVersionThreadUtil", "getScaleResponse It is honor device but is not config ota");
            return "{\"status\":\"1\"}";
        }
        return e(d(nuw.e(), str), str, true, false, false);
    }

    private static String d(String str, String str2) {
        LogUtil.d("checkNewVersionThreadUtil", "postReq, urlString:", str);
        if (!TextUtils.isEmpty(str)) {
            if (nvd.i(str)) {
                return lta.b(str, str2);
            }
            return ltf.a(str, str2, true);
        }
        return "";
    }

    public static nuo a(Context context, String str) {
        nuo nuoVar = new nuo();
        nuoVar.d(c());
        nuoVar.e(e());
        nuoVar.a(d());
        nuoVar.h("");
        nuoVar.f("");
        nuoVar.j(b(context));
        nuoVar.g(b());
        nuoVar.b("ro.product.CustCVersion");
        nuoVar.c("ro.product.CustDVersion");
        nuo nuoVarB = b(context, str, nuoVar);
        if (nuw.c(context)) {
            nuoVarB.i("1.1.3");
        }
        return nuoVarB;
    }

    private static nuo b(Context context, String str, nuo nuoVar) {
        LogUtil.a("checkNewVersionThreadUtil", "getComponent packageName = ", str, ",versionFilter = ", nuoVar);
        try {
            String strC = nuv.c(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toCharsString());
            nuoVar.l(str);
            nuoVar.k(nuw.c(str, context));
            nuoVar.m(b(str, context));
            nuoVar.n(strC);
            return nuoVar;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("checkNewVersionThreadUtil", "getComponent packageName = ", str, ",exception = NameNotFoundException");
            return nuoVar;
        } catch (Exception unused2) {
            LogUtil.e("checkNewVersionThreadUtil", "getComponent Exception packageName = ", str);
            return nuoVar;
        }
    }

    public static nuf c(num numVar) {
        nuf nufVar = new nuf();
        nufVar.j(numVar.k());
        nufVar.k(numVar.y());
        nufVar.g(numVar.n());
        nufVar.o(numVar.aa());
        nufVar.b(numVar.b());
        nufVar.c(numVar.e());
        nufVar.e(numVar.a());
        nufVar.n(numVar.v());
        nufVar.d(numVar.i());
        nufVar.i(numVar.h());
        nufVar.f(numVar.x());
        nufVar.h(numVar.u());
        nufVar.m(numVar.w());
        nufVar.d(numVar.g());
        nufVar.c(numVar.c());
        nufVar.a(numVar.l());
        nufVar.b(numVar.d());
        nufVar.a(numVar.f());
        return nufVar;
    }

    public static int c(Context context, String str, OutputStream outputStream) throws URISyntaxException, IOException {
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(str);
        nuw.aq_(httpGet, defaultHttpClient, context);
        HttpParams params = httpGet.getParams();
        params.setIntParameter("http.socket.timeout", 20000);
        params.setIntParameter("http.connection.timeout", 20000);
        HttpProtocolParams.setUserAgent(params, nuw.k());
        HttpResponse httpResponseExecute = defaultHttpClient.execute(httpGet);
        int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
        if (outputStream != null) {
            httpResponseExecute.getEntity().writeTo(outputStream);
        }
        httpGet.abort();
        return statusCode;
    }

    private static int c(String str) {
        int i = -1;
        try {
            i = Integer.parseInt(new JSONObject(str).getString("status"));
            LogUtil.a("checkNewVersionThreadUtil", "getNewVersionStatus check new version status = ", Integer.valueOf(i));
            return i;
        } catch (NumberFormatException unused) {
            LogUtil.e("checkNewVersionThreadUtil", "getNewVersionStatus NumberFormatException");
            return i;
        } catch (JSONException unused2) {
            LogUtil.e("checkNewVersionThreadUtil", "getNewVersionStatus JSONException");
            return i;
        }
    }

    private static String e(String str, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        if (str != null && c(str) == 0) {
            return str;
        }
        GRSManager gRSManagerC = GRSManager.c(BaseApplication.getContext());
        LogUtil.a("checkNewVersionThreadUtil", "getFinalReceive isHonorDevice: ", Boolean.valueOf(eei.d(f43833c)), " sIsWeightHonor ", Boolean.valueOf(d));
        if ((d && !z2 && !z3) || (eei.d(f43833c) && !z && !z2)) {
            str4 = nvd.a() + "/Ring/v2/CheckEx.action?ruleAttr=true";
        } else if (CommonUtil.ap() && TextUtils.equals(nvd.i(BaseApplication.getContext()), "test_mode")) {
            str4 = "/ring/v2/CheckEx.action?ruleAttr=true";
        } else {
            if (CommonUtil.cl()) {
                str3 = "com.huawei.cloud.hotaTest";
            } else {
                str3 = "com.huawei.cloud.hota";
            }
            str4 = gRSManagerC.getNoCheckUrl("ROOT", str3, gRSManagerC.getCommonCountryCode()) + "/Ring/v2/CheckEx.action?ruleAttr=true";
        }
        LogUtil.a("checkNewVersionThreadUtil", "getFinalReceive url =", str4);
        return d(str4, str2);
    }
}
