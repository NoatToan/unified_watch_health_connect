package com.huawei.phoneservice.faq.base.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.secure.android.common.webview.UriUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class s {
    public static void e(SslErrorHandler sslErrorHandler) {
    }

    public static void c(WebView webView) {
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("((http|https)://)(([a-zA-Z0-9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,4})*(/[a-zA-Z0-9\\&%_\\./-~-]*)?", 2).matcher(str).find();
    }

    public static boolean d(Context context, Uri uri) {
        if (context != null && uri != null && !TextUtils.isEmpty(uri.toString())) {
            String lowerCase = uri.toString().toLowerCase(Locale.ROOT);
            if ((lowerCase.startsWith(Constants.PREFIX_FILE) || lowerCase.startsWith("content://")) && !lowerCase.contains("./") && !lowerCase.contains("..") && !lowerCase.contains(".\\.\\") && !lowerCase.contains("%00")) {
                String packageName = context.getPackageName();
                if (!lowerCase.contains("/data/data/" + packageName)) {
                    if (!lowerCase.contains("/data/user/0/" + packageName)) {
                        if (!lowerCase.contains("/data/user_de/0/" + packageName)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(String str, Context context) {
        String sdk = i.d().getSdk(FaqConstants.FAQ_URL_LOAD_WHITELIST);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(sdk)) {
            return true;
        }
        String[] feedbackOpenTypeConfig = ModuleConfigUtils.getFeedbackOpenTypeConfig();
        if (feedbackOpenTypeConfig != null && feedbackOpenTypeConfig.length > 1) {
            String str2 = feedbackOpenTypeConfig[1];
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        String strB = n.b(context, "FAQ_IPCC_FILENAME", "FAQ_IPCC_KEY", "");
        if (!TextUtils.isEmpty(strB)) {
            arrayList.add(strB);
        }
        try {
            if (TextUtils.isEmpty(sdk)) {
                return false;
            }
            arrayList.addAll((List) new Gson().fromJson(sdk, new TypeToken<List<String>>() { // from class: com.huawei.phoneservice.faq.base.util.FaqWebActivityUtil$a
            }.getType()));
            return UriUtil.isUrlHostInWhitelist(str, (String[]) arrayList.toArray(new String[0]));
        } catch (Exception unused) {
            g.c("FaqWebActivityUtil", "fromJson error");
            return true;
        }
    }

    public static void b(WebView webView) {
        if (webView != null) {
            g.e("initWebView", "");
            webView.getSettings().setAllowFileAccess(false);
            webView.getSettings().setAllowContentAccess(false);
            webView.getSettings().setGeolocationEnabled(false);
            webView.getSettings().setSavePassword(false);
        }
    }

    public static void a(Activity activity, String str, boolean z) {
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(str));
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            g.c("FaqWebActivityUtil", "startActivity Exception");
        }
        if (z) {
            activity.finish();
        }
    }

    public static void e(WebView webView) {
        if (webView != null) {
            ViewParent parent = webView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.setDownloadListener(null);
            webView.setWebViewClient(null);
            webView.setWebChromeClient(null);
            webView.stopLoading();
            webView.clearHistory();
            webView.clearCache(true);
            webView.removeAllViews();
            webView.destroy();
        }
    }
}
