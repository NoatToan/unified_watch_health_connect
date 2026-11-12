package com.huawei.watchface.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.watchface.b3;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g4;
import com.huawei.watchface.mvp.model.datatype.PackageNameForH5;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.n1;
import com.huawei.watchface.videoedit.utils.Utils;
import com.huawei.watchface.w3;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class WebViewUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30614a = "WebViewUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f30615b = new CopyOnWriteArrayList(Arrays.asList("myhuawei:", "huaweihealth", "wallet:", "weixin://wap/pay?", "huaweischeme", "geo:", "hiapplink:", ClickDestination.APPMARKET, "hwt:", "hwmediacenter:", "himovie:", "alipays:", "alipay", "cmblife://pay?", "mailto:", KakaConstants.SCHEME_TEL));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map f30616c = new a();

    public class a extends ConcurrentHashMap {
        public a() {
            put("weixin://wap/pay?", "com.tencent.mm");
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strD = d(str);
        String str2 = f30614a;
        FlavorConfig.safeHwLog(str2, "getCloudScheme getSchemeFromCloudConfig :" + strD);
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        HwLog.i(str2, "getCloudScheme from localList");
        for (String str3 : f30615b) {
            if (str.startsWith(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static void b(Context context, String str) {
        try {
            HwLog.i(f30614a, "jumpToHuaweiMarketDetailActivity enter");
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.appmarket.intent.action.AppDetail.withid");
            intent.setFlags(268435456);
            intent.putExtra("appId", str);
            intent.setSelector(null);
            intent.setPackage("com.huawei.appmarket");
            CommonUtils.a(context, intent);
        } catch (ActivityNotFoundException unused) {
            HwLog.e(f30614a, "jumpToActivity ActivityNotFoundException");
        } catch (IllegalArgumentException unused2) {
            HwLog.e(f30614a, "jumpToActivity IllegalArgumentException");
        } catch (Exception unused3) {
            HwLog.e(f30614a, "jumpToActivity exception");
        }
    }

    public static String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (String) f30616c.get(str);
        }
        HwLog.i(f30614a, "getPackageNameByUrl url is null ");
        return "";
    }

    public static String d(String str) {
        g4 g4VarC = b3.b().c();
        if (g4VarC == null) {
            HwLog.i(f30614a, "getSchemeFromCloudConfig supportType is null");
            return "";
        }
        List<String> listC = g4VarC.c();
        String str2 = f30614a;
        FlavorConfig.safeHwLog(str2, "watchfaceWhiteList:" + GsonHelper.toJson(listC));
        if (ArrayUtils.isEmpty(listC)) {
            HwLog.i(str2, "getSchemeFromCloudConfig watchfaceWhiteList is null");
            return "";
        }
        for (String str3 : listC) {
            if (str.startsWith(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static String e(String str) {
        return Constants.JAVA_SCRIPT + str;
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        return lowerCase.startsWith("https://") || lowerCase.startsWith("http://") || lowerCase.startsWith(Constants.PREFIX_FILE);
    }

    public static String g(String str) {
        return TextUtils.isEmpty(str) ? "" : SafeString.replace(str, " ", Constants.PERCENT_20);
    }

    public static String getUrl(String str, String str2) {
        return Constants.JAVA_SCRIPT + str + Constants.LEFT_BRACKET + str2 + Constants.RIGHT_BRACKET;
    }

    public static void c(Context context, String str) {
        try {
            HwLog.i(f30614a, "jumpToHuaweiMarketDetailActivity enter");
            SafeIntent safeIntent = new SafeIntent(new Intent());
            safeIntent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            safeIntent.putExtra("APP_PACKAGENAME", str);
            safeIntent.setPackage("com.huawei.appmarket");
            safeIntent.addFlags(268435456);
            safeIntent.setSelector(null);
            CommonUtils.a(context, safeIntent);
        } catch (ActivityNotFoundException unused) {
            HwLog.e(f30614a, "jumpToHuaweiMarketDetailByPackageName ActivityNotFoundException");
        } catch (IllegalArgumentException unused2) {
            HwLog.e(f30614a, "jumpToHuaweiMarketDetailByPackageName IllegalArgumentException");
        } catch (Exception unused3) {
            HwLog.e(f30614a, "jumpToHuaweiMarketDetailByPackageName exception");
        }
    }

    public static void a(Context context, String str) {
        String str2 = f30614a;
        HwLog.i(str2, "jumpToActivity");
        try {
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setSelector(null);
            if (CommonUtils.setIntentComponent(context, intent)) {
                context.startActivity(intent);
            }
            HwLog.i(str2, "jump to scheme view");
        } catch (ActivityNotFoundException unused) {
            HwLog.e(f30614a, "jumpToActivity ActivityNotFoundException");
        } catch (Exception unused2) {
            HwLog.e(f30614a, "jumpToActivity exception");
        }
    }

    public static String b(String str) {
        String path = Uri.parse(str).getPath();
        String str2 = "text/html";
        if (path == null) {
            HwLog.i(f30614a, "path == null");
            return "text/html";
        }
        if (path.endsWith(".css")) {
            str2 = "text/css";
        } else if (path.endsWith(".js")) {
            str2 = "application/x-javascript";
        } else if (path.endsWith(".jpg") || path.endsWith(Utils.SUFFIX_GIF) || path.endsWith(".png") || path.endsWith(".jpeg") || path.endsWith(".webp") || path.endsWith(".bmp")) {
            str2 = Constants.IMAGE_TYPE;
        }
        HwLog.i(f30614a, "getMime ".concat(str2));
        return str2;
    }

    public static void a(SslError sslError) {
        switch (sslError.getPrimaryError()) {
            case 0:
                HwLog.i(f30614a, "onReceivedSslError SSL_NOTYETVALID");
                break;
            case 1:
                HwLog.i(f30614a, "onReceivedSslError SSL_EXPIRED");
                break;
            case 2:
                HwLog.i(f30614a, "onReceivedSslError SSL_IDMISMATCH");
                break;
            case 3:
                HwLog.i(f30614a, "onReceivedSslError SSL_UNTRUSTED");
                break;
            case 4:
                HwLog.i(f30614a, "onReceivedSslError SSL_DATE_INVALID");
                break;
            case 5:
                HwLog.i(f30614a, "onReceivedSslError SSL_INVALID");
                break;
            case 6:
                HwLog.i(f30614a, "onReceivedSslError SSL_MAX_ERROR");
                break;
        }
    }

    public static String a(WebView webView) {
        try {
            w3 w3Var = new w3(webView);
            if (webView != null) {
                Object tag = webView.getTag();
                if (tag != null && (tag instanceof Integer) && tag == "0") {
                    return "";
                }
                return w3Var.a();
            }
        } catch (Throwable th) {
            HwLog.i(f30614a, "getUrlMethod error: " + HwLog.printException(th));
        }
        return "";
    }

    public static void a(Activity activity, WebView webView, String str) {
        if (activity != null && webView != null) {
            if (Build.VERSION.SDK_INT > 28 && !CommonUtils.isAndroid13()) {
                try {
                    if (JsSafeUrlSystemParamManager.getInstance().b(str)) {
                        webView.getSettings().setForceDark(0);
                        return;
                    } else {
                        n1.a(activity, webView);
                        return;
                    }
                } catch (Exception e) {
                    HwLog.e(f30614a, "setDarkMode error = " + HwLog.printException(e));
                    return;
                }
            }
            HwLog.e(f30614a, "setDarkMode Build.VERSION.SDK_INT <= Build.VERSION_CODES.P or isAndroid13 ");
            return;
        }
        HwLog.e(f30614a, "setDarkMode params is null");
    }

    public static void a(SafeWebView safeWebView) {
        if (safeWebView != null) {
            HwLog.i(f30614a, "onDestroy destroyWebView");
            ViewParent parent = safeWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(safeWebView);
            }
            safeWebView.stopLoading();
            safeWebView.getSettings().setJavaScriptEnabled(false);
            safeWebView.clearHistory();
            safeWebView.clearView();
            safeWebView.removeAllViews();
            safeWebView.destroy();
        }
    }

    public static String a(PackageNameForH5 packageNameForH5) {
        if (packageNameForH5 == null) {
            HwLog.i(f30614a, "getApplicationNameByPackageName packageNameObj is null");
            return "";
        }
        String packageName = packageNameForH5.getPackageName();
        if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty(packageNameForH5.getUrl())) {
            String str = f30614a;
            HwLog.i(str, "getApplicationNameByPackageName packageName:" + packageName);
            StringBuilder sb = new StringBuilder(CommonUtils.c(Environment.getApplicationContext(), packageName));
            sb.append("_");
            String strA = a(packageNameForH5.getUrl());
            if (!TextUtils.isEmpty(strA)) {
                HwLog.i(str, "getApplicationNameByPackageName add cloudSchemePackageMap value");
                f30616c.put(strA, packageName);
                sb.append(strA);
            }
            return sb.toString();
        }
        HwLog.i(f30614a, "getApplicationNameByPackageName packageName or url is null");
        return "";
    }
}
