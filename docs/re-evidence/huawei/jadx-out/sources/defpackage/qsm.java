package defpackage;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qsm {
    public static void c(WebView webView) {
        if (webView == null) {
            LogUtil.j("WebViewUtils", "webView is null");
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
    }
}
