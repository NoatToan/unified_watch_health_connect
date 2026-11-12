package com.huawei.health.h5pro.webkit;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class WebKitUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f7048c = {"/data/data/", "/data/user/"};

    private WebKitUtil() {
    }

    static void c(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setSavePassword(false);
    }

    static void c(Context context, WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setUseWideViewPort(false);
        settings.setTextZoom(100);
        settings.setLoadWithOverviewMode(true);
        if (Build.VERSION.SDK_INT >= 29) {
            settings.setForceDark(0);
        }
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        settings.setUserAgentString(settings.getUserAgentString() + ";HuaweiHealth");
        try {
            webView.setOverScrollMode(2);
        } catch (AndroidRuntimeException e) {
            LogUtil.w("H5PRO_WebKitUtil", "initWebSetting: " + e.getMessage());
        }
    }

    public static void setTextZoom(Context context, WebView webView) {
        if (context == null || webView == null) {
            LogUtil.w("H5PRO_WebKitUtil", "setTextZoom: context or webView is null");
            return;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.w("H5PRO_WebKitUtil", "setTextZoom: resources is null");
            return;
        }
        Configuration configuration = resources.getConfiguration();
        if (configuration == null) {
            LogUtil.w("H5PRO_WebKitUtil", "setTextZoom: configuration is null");
            return;
        }
        float f = configuration.fontScale;
        if (f <= 0.0f) {
            LogUtil.w("H5PRO_WebKitUtil", "setTextZoom: fontScale -> " + f);
            return;
        }
        int i = (int) (100.0f * f);
        LogUtil.i("H5PRO_WebKitUtil", "setTextZoom: fontScale -> " + f + ", textZoom -> " + i);
        webView.getSettings().setTextZoom(i);
    }

    public static void e(final WebView webView) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            LogUtil.i("H5PRO_WebKitUtil", "closeWebViewSettings: subThread");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.health.h5pro.webkit.WebKitUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    WebKitUtil.e(webView);
                }
            });
        } else if (webView == null) {
            LogUtil.w("H5PRO_WebKitUtil", "closeWebViewSettings: webView is null");
        } else {
            webView.getSettings().setJavaScriptEnabled(false);
        }
    }

    static void b(Context context, WebView webView, int i) {
        WebSettings settings = webView.getSettings();
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            boolean z = i != 1;
            if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
                LogUtil.i("H5PRO_WebKitUtil", "setDarkMode: isAllowAlgorithmicDarkening -> " + z);
                WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, z);
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                    WebSettingsCompat.setForceDark(settings, 2);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    webView.getSettings().setForceDark(2);
                }
                WebSettingsCompat.setForceDarkStrategy(settings, i);
            }
        }
    }

    public static boolean e(String str) {
        return isHttpUrl(str) || isHttpsUrl(str);
    }

    public static boolean isHttpUrl(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("http://");
    }

    public static boolean isHttpsUrl(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("https://");
    }

    public static boolean d(Context context, String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_WebKitUtil", "isUrlTrusted: invalid path");
            return false;
        }
        if (!b() || !c(str) || b(context, str)) {
            return true;
        }
        LogUtil.w("H5PRO_WebKitUtil", "isUrlTrusted: untrusted(local) -> " + str);
        return false;
    }

    public static boolean c(String str) {
        return str.startsWith(Constants.PREFIX_FILE);
    }

    static boolean b(Context context, String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_WebKitUtil", "isLocalUrlTrusted: invalid path");
            return false;
        }
        if (str.startsWith("file:///android_asset/")) {
            return true;
        }
        return e(context, str);
    }

    private static boolean e(Context context, String str) {
        if (context == null) {
            LogUtil.w("H5PRO_WebKitUtil", "get sLocalTrustedDir context null");
            return false;
        }
        try {
            return new File(str.replaceFirst("file:", "")).getCanonicalPath().startsWith(context.getFilesDir().getCanonicalPath() + "/h5pro/");
        } catch (IOException unused) {
            LogUtil.w("H5PRO_WebKitUtil", "get sLocalTrustedDir meet io exception");
            return false;
        }
    }

    public static boolean b() {
        EnvironmentHelper.BuildType buildType = EnvironmentHelper.getInstance().getBuildType();
        return buildType == EnvironmentHelper.BuildType.RELEASE || buildType == EnvironmentHelper.BuildType.BETA || buildType == EnvironmentHelper.BuildType.GREEN;
    }

    public static boolean checkResultUriIsValid(Context context, Uri uri) {
        synchronized (WebKitUtil.class) {
            boolean zEquals = true;
            try {
                if (uri == null) {
                    LogUtil.w("H5PRO_WebKitUtil", "checkResultUriIsValid: uri is null");
                    return false;
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && !path.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                    for (String str : f7048c) {
                        if (path.startsWith(str)) {
                            zEquals = false;
                            break;
                        }
                    }
                }
                if (zEquals) {
                    String userInfo = uri.getUserInfo();
                    if (!TextUtils.isEmpty(userInfo)) {
                        zEquals = TextUtils.equals(userInfo, String.valueOf(((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle())));
                    }
                }
                LogUtil.i("H5PRO_WebKitUtil", "checkResultUriIsValid: isValid -> " + zEquals);
                return zEquals;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean jumpToBrowser(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_WebKitUtil", "jumpToBrowser: param invalid");
            return false;
        }
        try {
            Uri uri = Uri.parse(str.replace("#", "%23"));
            if (!"true".equalsIgnoreCase(uri.getQueryParameter("systemBrower"))) {
                return false;
            }
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
            intent.setFlags(268435456);
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                LogUtil.w("H5PRO_WebKitUtil", "jumpToBrowser: packageManager is null");
                return false;
            }
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null) {
                LogUtil.w("H5PRO_WebKitUtil", "jumpToBrowser: resolveInfo is null");
                return false;
            }
            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            LogUtil.e("H5PRO_WebKitUtil", "jumpToBrowser: exception -> " + e.getMessage());
            return false;
        }
    }
}
