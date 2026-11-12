package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.operation.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes28.dex */
public class WebViewPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Queue<WebView> f7050a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7051b = 1;
    private static volatile boolean e = false;

    private WebViewPool() {
    }

    public static void init(Context context) {
        init(context, 1);
    }

    public static void init(Context context, int i) {
        LogUtil.i("H5PRO_WebViewManager", "init -> " + i);
        if (e) {
            return;
        }
        if (context == null) {
            LogUtil.e("H5PRO_WebViewManager", "init -> appContext is null");
            return;
        }
        synchronized (WebViewPool.class) {
            if (e) {
                return;
            }
            f7051b = i;
            f7050a = new ArrayBlockingQueue(f7051b);
            for (int i2 = 0; i2 < f7051b; i2++) {
                f7050a.add(b(context, true));
            }
            e = true;
        }
    }

    public static WebView acquire(Context context) {
        Context context2 = (Context) new WeakReference(context).get();
        if (context2 == null) {
            LogUtil.e("H5PRO_WebViewManager", "get: context is null");
            return null;
        }
        synchronized (WebViewPool.class) {
            if (!e) {
                return b(context2, false);
            }
            WebView webViewPoll = f7050a.poll();
            if (webViewPoll == null) {
                webViewPoll = b(context2, false);
            } else if (webViewPoll.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) webViewPoll.getContext()).setBaseContext(context2);
                LogUtil.i("H5PRO_WebViewManager", "get from cache -> " + webViewPoll);
            }
            return webViewPoll;
        }
    }

    public static void release(WebView webView) {
        LogUtil.i("H5PRO_WebViewManager", "release -> " + webView);
        d(webView);
        e(webView);
    }

    private static WebView b(Context context, boolean z) {
        if (z) {
            context = new MutableContextWrapper(context);
        }
        return new WebView(context);
    }

    private static void d(WebView webView) {
        if (webView == null) {
            LogUtil.w("H5PRO_WebViewManager", "clearWebView: mWebView is null");
            return;
        }
        ViewParent parent = webView.getParent();
        webView.loadUrl(Constants.ABOUT_BLANK);
        if (parent != null) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.stopLoading();
        webView.getSettings().setJavaScriptEnabled(false);
        webView.clearHistory();
    }

    private static void e(WebView webView) {
        LogUtil.i("H5PRO_WebViewManager", "webview destroy");
        if (webView == null) {
            LogUtil.w("H5PRO_WebViewManager", "destroyWebView: mWebView is null");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            LogUtil.e("H5PRO_WebViewManager", "destroyWebView: not in ui thread");
        } else {
            webView.removeAllViews();
            webView.destroy();
        }
    }
}
