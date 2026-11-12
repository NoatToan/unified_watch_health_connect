package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qqs {
    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    public static Context e(Context context, int i) {
        int i2;
        if (context == null || Build.VERSION.SDK_INT <= 28) {
            return context;
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return context;
                }
                i2 = 32;
            } else {
                i2 = 16;
            }
        } else if (e(BaseApplication.b())) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = i2;
        return context.createConfigurationContext(configuration);
    }

    public static boolean e(Context context) {
        if (context != null) {
            return Build.VERSION.SDK_INT > 28 && (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        LogUtil.j("HealthDarkModeUtils", "isDarkMode: contxet is null");
        return false;
    }

    public static boolean c() {
        return CommonUtil.isFlyme() && e(BaseApplication.b());
    }

    public static WebView c(Context context, WebView webView) {
        PackageInfo currentWebViewPackage;
        if (webView == null || context == null) {
            LogUtil.j("HealthDarkModeUtils", "setForceDarkIfNeed() failed with null webview or context:", webView, context);
            return webView;
        }
        if (Build.VERSION.SDK_INT > 28 && (currentWebViewPackage = WebView.getCurrentWebViewPackage()) != null && "com.huawei.webview".equalsIgnoreCase(currentWebViewPackage.packageName) && health.compact.a.CommonUtil.e(currentWebViewPackage.versionName, "10.0.0.300") >= 0) {
            boolean zE = e(context);
            WebSettings settings = webView.getSettings();
            int forceDark = settings.getForceDark();
            LogUtil.a("HealthDarkModeUtils", "setForceDarkIfNeed: isDarkMode -> " + zE + ", forceDark -> " + forceDark);
            if (zE && forceDark != 2) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
                    LogUtil.a("HealthDarkModeUtils", "setForceDarkIfNeed: setAlgorithmicDarkeningAllowed");
                    WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, true);
                }
                settings.setForceDark(2);
                return webView;
            }
            if (zE || forceDark == 1) {
                LogUtil.a("HealthDarkModeUtils", "setForceDarkIfNeed: no need change");
            } else {
                LogUtil.a("HealthDarkModeUtils", "setForceDarkIfNeed: WebSettings.FORCE_DARK_AUTO");
                settings.setForceDark(1);
                return webView;
            }
        }
        return webView;
    }

    public static void a(Context context, WebView webView) {
        if (webView == null || context == null) {
            LogUtil.j("HealthDarkModeUtils", "setWebViewDarkIfNeed() failed with null webview or context:", webView, context);
            return;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return;
        }
        boolean zE = e(context);
        WebSettings settings = webView.getSettings();
        int forceDark = webView.getSettings().getForceDark();
        if (zE && forceDark != 2) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
                LogUtil.a("HealthDarkModeUtils", "setAlgorithmicDarkeningAllowed:");
                WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, true);
            }
            settings.setForceDark(2);
            return;
        }
        if (zE || forceDark == 1) {
            LogUtil.a("HealthDarkModeUtils", "setMode no need change");
        } else {
            LogUtil.a("HealthDarkModeUtils", "changeLightMode:");
            settings.setForceDark(1);
        }
    }
}
