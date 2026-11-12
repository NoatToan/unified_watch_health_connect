package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class qqy {
    private static boolean c() {
        return false;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MarketRouterUtil", "getUrlType linkUrl is null");
            return "0";
        }
        try {
            String queryParameter = Uri.parse(g(str)).getQueryParameter("urlType");
            return TextUtils.isEmpty(queryParameter) ? "0" : queryParameter;
        } catch (UnsupportedOperationException unused) {
            Map<String, String> mapD = d(str);
            if (mapD == null) {
                return "0";
            }
            String str2 = mapD.get("urlType");
            return TextUtils.isEmpty(str2) ? "0" : str2;
        }
    }

    public static Map<String, String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MarketRouterUtil", "getUrlParam linkUrl is null");
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length <= 1) {
            LogUtil.j("MarketRouterUtil", "getUrlParam urlDivided is error");
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : strArrSplit[1].split("&")) {
            String[] strArrSplit2 = str2.split("=");
            if (strArrSplit2.length > 1) {
                map.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
        return map;
    }

    public static boolean f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("http") || str.startsWith(ProxyConfig.MATCH_HTTPS) || str.startsWith("file");
        }
        LogUtil.j("MarketRouterUtil", "isUrlScheme() serviceDetailUrl is empty.");
        return false;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MarketRouterUtil", "decodeUrl url is empty ");
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            LogUtil.e("MarketRouterUtil", "decodeUrl exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String b(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str) || !str.contains("downloadUrl=") || (iIndexOf = str.indexOf("downloadUrl=")) <= 0) {
            return "";
        }
        String strSubstring = str.substring(iIndexOf + 12, str.length());
        try {
            String string = new JSONObject(strSubstring).getString("url");
            LogUtil.a("MarketRouterUtil", "downloadUrl is json");
            return string;
        } catch (JSONException unused) {
            LogUtil.a("MarketRouterUtil", "downloadUrl is string");
            return strSubstring;
        }
    }

    public static String e(String[] strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            String strC = c(str);
            if (lsj.c(BaseApplication.b(), strC)) {
                return strC;
            }
        }
        return "";
    }

    public static String c(String str) {
        return ("com.huawei.health".equals(str) && c()) ? com.huawei.hwcommonmodel.application.BaseApplication.APP_PACKAGE_GOOGLE_HEALTH : str;
    }

    public static void b(String str, String str2) {
        if (!c()) {
            e(str, str2);
        } else {
            LogUtil.j("MarketRouterUtil", "GOOGLE_PLAY_OEM_DISABLE not jump to Market.");
            qpx.e(BaseApplication.b(), BaseApplication.b().getResources().getString(R.string.IDS_main_sns_app_store_content));
        }
    }

    private static void e(String str, String str2) {
        if (lsj.c(BaseApplication.b(), "com.huawei.appmarket")) {
            if (CommonUtil.bd()) {
                LogUtil.a("MarketRouterUtil", "new Honor,jump to downloadUrl.");
                i(str2);
                return;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    LogUtil.j("MarketRouterUtil", "jumpToMarket packageName is empty");
                    return;
                }
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + str));
                intent.addFlags(268435456);
                intent.setPackage("com.huawei.appmarket");
                e(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("MarketRouterUtil", "jumpToMarket ActivityNotFoundException");
                i(str2);
                return;
            }
        }
        i(str2);
    }

    public static void i(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MarketRouterUtil", "jumpBrowsers webUrl is null");
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setFlags(268435456);
            PackageManager packageManager = BaseApplication.b().getPackageManager();
            if (packageManager != null) {
                LogUtil.a("MarketRouterUtil", "jumpToBrowsers packageManager is not null");
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                if (resolveInfoResolveActivity != null) {
                    LogUtil.a("MarketRouterUtil", "jumpToBrowsers resolveInfo is not null");
                    ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
                    intent.setComponent(componentName);
                    qrs.c(intent, componentName.getPackageName(), BaseApplication.j(), BaseApplication.b().getString(R.string.IDS_browser_app_name));
                }
            }
        } catch (ActivityNotFoundException | UnsupportedOperationException e) {
            LogUtil.e("MarketRouterUtil", "jumpBrowsers exception" + e.getMessage());
        }
    }

    private static void e(Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        try {
            qrs.c(intent, "com.huawei.appmarket", BaseApplication.j(), "");
        } catch (ActivityNotFoundException e) {
            LogUtil.e("MarketRouterUtil", "startActivity is error" + e.getMessage());
        }
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.contains("#") ? str.replace("#", "") : str;
        }
        LogUtil.a("MarketRouterUtil", "getUrl url is null");
        return str;
    }
}
