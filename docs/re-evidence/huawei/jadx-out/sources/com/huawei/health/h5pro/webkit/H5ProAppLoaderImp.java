package com.huawei.health.h5pro.webkit;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.vengine.H5ProExecJsValueCbk;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProPackageManager;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProAppLoaderImp implements H5ProAppLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<H5ProInstance> f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<H5ProAppLoadListener> f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7017c = false;
    private WeakReference<WebView> d;
    private WeakReference<H5ProPackageManager> e;

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader
    public void preloadLightApp(String str, H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) {
    }

    H5ProAppLoaderImp() {
    }

    public H5ProAppLoaderImp b(H5ProPackageManager h5ProPackageManager) {
        this.e = new WeakReference<>(h5ProPackageManager);
        return this;
    }

    public H5ProAppLoaderImp c(H5ProInstance h5ProInstance) {
        this.f7015a = new WeakReference<>(h5ProInstance);
        return this;
    }

    public H5ProAppLoaderImp e(H5ProAppLoadListener h5ProAppLoadListener) {
        this.f7016b = new WeakReference<>(h5ProAppLoadListener);
        return this;
    }

    public H5ProAppLoaderImp c(WebView webView) {
        this.d = new WeakReference<>(webView);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        return LogUtil.getTag(this.f7015a.get(), "AppLoaderIml");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2) {
        String strJoinUrl;
        H5ProPackageManager h5ProPackageManager = (H5ProPackageManager) GeneralUtil.getReferent(this.e);
        H5ProInstance h5ProInstance = (H5ProInstance) GeneralUtil.getReferent(this.f7015a);
        H5ProAppLoadListener h5ProAppLoadListener = (H5ProAppLoadListener) GeneralUtil.getReferent(this.f7016b);
        WebView webView = (WebView) GeneralUtil.getReferent(this.d);
        if (h5ProPackageManager == null || webView == null || h5ProInstance == null || h5ProAppLoadListener == null) {
            return;
        }
        h5ProInstance.setAppInfo(h5ProPackageManager.getAppInfo(str));
        try {
            if (TextUtils.isEmpty(str2)) {
                strJoinUrl = h5ProPackageManager.joinUrl(str);
            } else {
                strJoinUrl = h5ProPackageManager.joinUrl(str) + str2;
            }
            if (WebKitUtil.d(webView.getContext(), strJoinUrl)) {
                LogUtil.i(e(), "doLoad trusted.");
                webView.loadUrl(strJoinUrl);
                a(false);
            } else {
                h5ProAppLoadListener.onException(h5ProInstance, str + ": url not trusted");
            }
        } catch (FileNotFoundException e) {
            h5ProAppLoadListener.onException(h5ProInstance, str + ":" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str, final String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new a(Looper.getMainLooper()).post(new HandlerRunnable() { // from class: com.huawei.health.h5pro.webkit.H5ProAppLoaderImp.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // java.lang.Runnable
                public void run() {
                    H5ProAppLoaderImp.this.e(str, str2);
                }
            });
        } else {
            e(str, str2);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader
    public void preloadMiniProgram(String str, H5ProAppLoader.H5ProPreloadCbk h5ProPreloadCbk) {
        H5ProPackageManager h5ProPackageManager = (H5ProPackageManager) GeneralUtil.getReferent(this.e);
        if (h5ProPackageManager != null) {
            h5ProPackageManager.installApp(str, h5ProPreloadCbk);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader
    public void loadMiniProgram(final String str, final String str2) {
        preloadMiniProgram(str, new H5ProAppLoader.H5ProPreloadCbk() { // from class: com.huawei.health.h5pro.webkit.H5ProAppLoaderImp.5
            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onSuccess() {
                LogUtil.i(H5ProAppLoaderImp.this.e(), "loadMiniProgram onSuccess.");
                H5ProAppLoaderImp.this.d(str, str2);
            }

            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onFailure(int i, String str3) {
                LogUtil.e(H5ProAppLoaderImp.this.e(), String.format(Locale.ROOT, "loadMiniProgram onFailure: %s", str3));
                H5ProAppLoadListener h5ProAppLoadListener = (H5ProAppLoadListener) GeneralUtil.getReferent(H5ProAppLoaderImp.this.f7016b);
                if (h5ProAppLoadListener != null) {
                    H5ProInstance h5ProInstance = (H5ProInstance) GeneralUtil.getReferent(H5ProAppLoaderImp.this.f7015a);
                    if (h5ProInstance != null && h5ProInstance.getAppInfo() == null) {
                        H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
                        h5ProAppInfo.setPkgName(str);
                        h5ProInstance.setAppInfo(h5ProAppInfo);
                    }
                    h5ProAppLoadListener.onException(h5ProInstance, str3);
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader
    public void loadLightApp(String str) {
        if (H5ProTrustListChecker.disableHttpLoad(str)) {
            LogUtil.w(e(), "loadLightApp: disableHttpLoad -> " + str);
            return;
        }
        H5ProInstance h5ProInstance = (H5ProInstance) GeneralUtil.getReferent(this.f7015a);
        WebView webView = (WebView) GeneralUtil.getReferent(this.d);
        if (webView == null || h5ProInstance == null || !WebKitUtil.d(webView.getContext(), str)) {
            return;
        }
        LogUtil.i(e(), "loadLightApp trusted");
        H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
        try {
            URL url = new URL(str);
            h5ProAppInfo.setBaseUrl(url.getProtocol() + "://" + url.getHost());
        } catch (MalformedURLException e) {
            LogUtil.e(e(), "loadLightApp==>parse URL fail:", e.getMessage());
        }
        h5ProAppInfo.setH5ProAppType(H5ProAppInfo.H5ProAppType.H5_LIGHT_APP);
        h5ProInstance.setAppInfo(h5ProAppInfo);
        webView.loadUrl(str);
        a(false);
    }

    private void a(boolean z) {
        H5ProAppLoadListener h5ProAppLoadListener = (H5ProAppLoadListener) GeneralUtil.getReferent(this.f7016b);
        if (!z) {
            if (h5ProAppLoadListener != null) {
                h5ProAppLoadListener.onViewCreated((H5ProInstance) GeneralUtil.getReferent(this.f7015a), (View) GeneralUtil.getReferent(this.d));
            }
        } else {
            this.f7017c = true;
            if (h5ProAppLoadListener != null) {
                h5ProAppLoadListener.onViewPreCreate((H5ProInstance) GeneralUtil.getReferent(this.f7015a), (View) GeneralUtil.getReferent(this.d));
            }
        }
    }

    public void b(WebView webView, String str) {
        synchronized (H5ProAppLoaderImp.class) {
            if (this.f7017c && webView != null) {
                this.f7017c = false;
                H5ProAppLoadListener h5ProAppLoadListener = (H5ProAppLoadListener) GeneralUtil.getReferent(this.f7016b);
                if (h5ProAppLoadListener != null) {
                    h5ProAppLoadListener.onViewCreated((H5ProInstance) GeneralUtil.getReferent(this.f7015a), webView);
                }
            }
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader
    public void execJs(final String str, final H5ProExecJsValueCbk h5ProExecJsValueCbk) {
        new a(Looper.getMainLooper()).post(new HandlerRunnable() { // from class: com.huawei.health.h5pro.webkit.H5ProAppLoaderImp.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.lang.Runnable
            public void run() {
                WebView webView = (WebView) GeneralUtil.getReferent(H5ProAppLoaderImp.this.d);
                if (webView != null) {
                    if (h5ProExecJsValueCbk == null) {
                        webView.evaluateJavascript(str, null);
                    } else {
                        webView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.huawei.health.h5pro.webkit.H5ProAppLoaderImp.4.4
                            @Override // android.webkit.ValueCallback
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onReceiveValue(String str2) {
                                h5ProExecJsValueCbk.onReceiveValue(str2);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader
    public void loadData(String str, String str2, String str3) {
        WebView webView = (WebView) GeneralUtil.getReferent(this.d);
        if (webView != null) {
            webView.loadData(str, str2, str3);
        }
    }

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }
    }

    static abstract class HandlerRunnable implements Runnable {
        private HandlerRunnable() {
        }
    }
}
