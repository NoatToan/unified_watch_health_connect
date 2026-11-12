package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes11.dex */
public class nuw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43779c;
    private static String d;
    private static String j;
    private static String m;
    private static String o;
    private static num e = new num();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static num f43777a = new num();
    private static Map<String, num> f = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static num f43778b = new num();
    private static num k = new num();
    private static String n = "https://query.hicloud.com/accessory/v2/checkEx.action";
    private static int i = -1;
    private static int l = 0;
    private static long h = -1;
    private static boolean g = false;

    public static String b(boolean z) {
        return c(z, false);
    }

    public static String c(boolean z, boolean z2) {
        String str;
        GRSManager gRSManagerC = GRSManager.c(BaseApplication.getContext());
        LogUtil.a("HwSelfUpdateUtility", "getUpdateUrl isHonor: ", Boolean.valueOf(z));
        if (z) {
            return nvd.a() + "/ring2/v2/" + c(z2);
        }
        if (CommonUtil.cl()) {
            str = "com.huawei.cloud.hotaTest";
        } else {
            str = "com.huawei.cloud.hota";
        }
        return gRSManagerC.getNoCheckUrl("ROOT", str, gRSManagerC.getCommonCountryCode()) + "/ring2/v2/" + c(z2);
    }

    public static String c(boolean z) {
        return z ? "onestopCheck.action" : "CheckEx.action?ruleAttr=true";
    }

    public static String i() {
        return f43779c;
    }

    public static void d(String str) {
        f43779c = str;
    }

    public static String e() {
        return n;
    }

    public static void a(String str) {
        n = str;
    }

    public static String k() {
        return o;
    }

    public static long f() {
        return h;
    }

    public static void b(long j2) {
        h = j2;
    }

    public static boolean g() {
        return g;
    }

    public static void d(boolean z) {
        g = z;
    }

    public static int j() {
        return i;
    }

    public static void d(int i2) {
        i = i2;
    }

    public static int l() {
        return l;
    }

    public static void a(int i2) {
        l = i2;
    }

    public static void e(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("HwSelfUpdateUtility", "installApk context is null");
        } else {
            new nvk(context, str, str2).a();
        }
    }

    private static boolean f(String str) {
        return new File(str).exists();
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.j("HwSelfUpdateUtility", "isSoFileExist context is null");
            return false;
        }
        return f(context.getApplicationInfo().dataDir + "/files/libbspatchforselfupdate.so");
    }

    public static String h() {
        return j;
    }

    public static void g(String str) {
        j = str;
    }

    public static String d() {
        return d;
    }

    public static void b(String str) {
        d = str;
    }

    public static String n() {
        return m;
    }

    public static void i(String str) {
        m = str;
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context == null) {
            LogUtil.j("HwSelfUpdateUtility", "isNetworkAvailable context is null");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager != null && a(connectivityManager.getAllNetworkInfo());
    }

    private static boolean a(NetworkInfo[] networkInfoArr) {
        if (networkInfoArr != null) {
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void aq_(HttpRequest httpRequest, HttpClient httpClient, Context context) {
        if (httpRequest == null || httpClient == null || context == null) {
            LogUtil.j("HwSelfUpdateUtility", "setHttpProxy param is null");
            return;
        }
        String host = Proxy.getHost(context);
        int port = Proxy.getPort(context);
        NetworkInfo networkInfoD = d(context);
        if (networkInfoD != null && networkInfoD.getType() == 1) {
            LogUtil.d("HwSelfUpdateUtility", "setHttpProxy networkInfo is not null and networkInfo type is wifi");
            return;
        }
        if (host == null || host.length() <= 0 || port == -1) {
            return;
        }
        HttpParams params = httpClient.getParams();
        ConnRouteParams.setDefaultProxy(params, new HttpHost(host, port));
        httpRequest.setParams(params);
    }

    private static NetworkInfo d(Context context) {
        ConnectivityManager connectivityManager = context.getSystemService("connectivity") instanceof ConnectivityManager ? (ConnectivityManager) context.getSystemService("connectivity") : null;
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static num b() {
        return e;
    }

    public static void c(num numVar) {
        e = numVar;
    }

    public static num a() {
        return f43777a;
    }

    public static void e(num numVar) {
        f43777a = numVar;
    }

    public static void c(String str, num numVar) {
        f.put(str, numVar);
    }

    public static num c() {
        return f43778b;
    }

    public static num o() {
        return k;
    }

    public static void a(num numVar) {
        k = numVar;
    }

    public static String c(String str, Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            LogUtil.j("HwSelfUpdateUtility", "getPackageVersionCode context is null");
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwSelfUpdateUtility", "getPackageVersionCode exception.");
            packageInfo = null;
        }
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return null;
    }

    public static void c(int i2, boolean z, boolean z2, boolean z3) {
        if (z3) {
            i2 += 10000;
        } else if (z2) {
            i2 += 1000;
        } else if (z) {
            i2 += 100;
        }
        LogUtil.a("HwSelfUpdateUtility", "eventErrorCode = ", Integer.valueOf(i2));
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_OTA_DOWNLOAD_85070033.value(), i2);
    }

    public static num e(String str) {
        if (f.containsKey(str)) {
            return f.get(str);
        }
        return null;
    }
}
