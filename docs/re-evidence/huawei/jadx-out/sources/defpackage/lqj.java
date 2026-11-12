package defpackage;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes10.dex */
public class lqj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f40629a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static double f40630c = 0.0d;
    private static double d = 0.0d;
    private static boolean e = false;

    public static void e(int i) {
        f40629a = i;
    }

    public static boolean c() {
        return e;
    }

    public static void d(boolean z) {
        e = z;
        if (z) {
            return;
        }
        d(Double.valueOf(0.0d));
        e(Double.valueOf(0.0d));
    }

    public static double e() {
        return f40630c;
    }

    public static void d(Double d2) {
        f40630c = d2.doubleValue();
    }

    public static double a() {
        return d;
    }

    public static void e(Double d2) {
        d = d2.doubleValue();
    }

    public static boolean b() {
        if (CommonUtil.bu()) {
            return false;
        }
        return !Utils.o();
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeveloperWeatherManagerUtils", "isDeveloperEnableSimulated() location is empty");
            d(false);
            return;
        }
        if (!b()) {
            LogUtil.j("DeveloperWeatherManagerUtils", "isDeveloperEnableSimulated() is not DeveloperTest");
            d(false);
            return;
        }
        if ("OFF".equalsIgnoreCase(str)) {
            LogUtil.j("DeveloperWeatherManagerUtils", "getDeveloperWeatherUrl() location is default location");
            d(false);
            return;
        }
        if ("ON".equalsIgnoreCase(str)) {
            LogUtil.j("DeveloperWeatherManagerUtils", "setDeveloperEnableSimulated location is ON");
            d(Double.valueOf(0.0d));
            e(Double.valueOf(0.0d));
            d(true);
            return;
        }
        try {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length != 2) {
                LogUtil.j("DeveloperWeatherManagerUtils", "setDeveloperEnableSimulated() locations length != 2");
                d(false);
                return;
            }
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                d(Double.valueOf(Double.parseDouble(str2)));
                e(Double.valueOf(Double.parseDouble(str3)));
                d(true);
                return;
            }
            LogUtil.j("DeveloperWeatherManagerUtils", "setDeveloperEnableSimulated() latitude is empty or longitude is empty");
            d(false);
        } catch (NumberFormatException | PatternSyntaxException unused) {
            LogUtil.e("DeveloperWeatherManagerUtils", "mFirstConnectReceiver() ACTION_WEATHER_LOCATION is error");
            d(false);
        }
    }

    public static String d() {
        if (!b()) {
            LogUtil.j("DeveloperWeatherManagerUtils", "getDeveloperWeatherUrl() is not DeveloperTest");
            return "";
        }
        if ((f40629a & 1) == 0) {
            LogUtil.j("DeveloperWeatherManagerUtils", "getDeveloperWeatherUrl() mHttpCode & ACTION_WEATHER_HTTP_YES is 0");
            return "";
        }
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainHagHicloud", "");
        if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j("DeveloperWeatherManagerUtils", "getDeveloperWeatherUrl() url is empty");
            return "";
        }
        return noCheckUrl.replaceFirst(ProxyConfig.MATCH_HTTPS, "http");
    }
}
