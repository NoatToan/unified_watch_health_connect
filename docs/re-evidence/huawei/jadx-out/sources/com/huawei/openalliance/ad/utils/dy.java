package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.constant.MimeType;
import com.huawei.openalliance.ad.hw;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Pattern f20653a = Pattern.compile("\\S*[?]\\S*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList<String> f20654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f20655c;

    private static String c(String str) {
        Matcher matcher = f20653a.matcher(str);
        String[] strArrSplit = str.split("/");
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (matcher.find()) {
            String[] strArrSplit2 = str2.split("\\?")[0].split("\\.");
            return strArrSplit2.length == 1 ? "" : strArrSplit2[strArrSplit2.length - 1];
        }
        String[] strArrSplit3 = str2.split("\\.");
        return strArrSplit3.length == 1 ? "" : strArrSplit3[strArrSplit3.length - 1];
    }

    public static String b(String str) {
        return f20655c.get(c(str).toLowerCase(Locale.ENGLISH));
    }

    public static boolean a(String str) {
        return f20654b.contains(c(str).toLowerCase(Locale.ENGLISH));
    }

    public static void a(WebView webView) {
        WebSettings settings;
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setLoadsImagesAutomatically(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setCacheMode(2);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
    }

    public static com.huawei.openalliance.ad.views.an a(Context context) {
        String str;
        try {
            hw.b("WebViewUtil", "createWebview android sdk: " + Build.VERSION.SDK_INT);
            try {
                return context.isDeviceProtectedStorage() ? new com.huawei.openalliance.ad.views.linkscroll.e((Context) cr.a(context, "createCredentialProtectedStorageContext", (Class<?>[]) null, (Object[]) null)) : new com.huawei.openalliance.ad.views.linkscroll.e(context);
            } catch (IllegalArgumentException unused) {
                str = "createWebview IllegalArgumentException";
                hw.d("WebViewUtil", str);
                return null;
            } catch (Exception unused2) {
                str = "createWebview Exception";
                hw.d("WebViewUtil", str);
                return null;
            }
        } catch (Throwable th) {
            hw.c("WebViewUtil", "fail to create webview, " + th.getClass().getSimpleName());
            return null;
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f20654b = arrayList;
        HashMap map = new HashMap();
        f20655c = map;
        arrayList.add(Constants.SUFFIX_HTML);
        arrayList.add("js");
        arrayList.add("png");
        arrayList.add("jpg");
        arrayList.add("svg");
        arrayList.add(MetaCreativeType.GIF);
        arrayList.add("css");
        map.put(Constants.SUFFIX_HTML, "text/html");
        map.put("js", "application/x-javascript");
        map.put("png", "image/png");
        map.put("jpg", FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM);
        map.put("svg", "image/svg+xml");
        map.put(MetaCreativeType.GIF, MimeType.GIF);
        map.put("css", "text/css");
    }
}
