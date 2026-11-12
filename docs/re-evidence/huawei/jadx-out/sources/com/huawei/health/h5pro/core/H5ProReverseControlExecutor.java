package com.huawei.health.h5pro.core;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProReverseControlExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H5ProReverseControlExecutor f6746b = new H5ProReverseControlExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, H5ProInstance> f6745a = new HashMap();

    /* JADX INFO: loaded from: classes28.dex */
    public interface OnReverseControlCallback {
        void onCallback(int i, String str);
    }

    /* JADX INFO: loaded from: classes28.dex */
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }
    }

    private H5ProReverseControlExecutor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str, OnReverseControlCallback onReverseControlCallback) {
        if (onReverseControlCallback != null) {
            onReverseControlCallback.onCallback(i, str);
        } else {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "onReverseControlCallback： callback is null");
        }
    }

    public boolean containsKey(String str) {
        Map<String, H5ProInstance> map = f6745a;
        return map != null && map.containsKey(str);
    }

    public boolean containsValue(H5ProInstance h5ProInstance) {
        Map<String, H5ProInstance> map = f6745a;
        return map != null && map.containsValue(h5ProInstance);
    }

    public void execute(String str, String str2, final OnReverseControlCallback onReverseControlCallback) {
        H5ProInstance h5ProInstance = f6745a.get(str);
        if (h5ProInstance == null) {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "execute: h5ProInstance is null");
            c(-1, a.a("invalid parameter : ", str), onReverseControlCallback);
            return;
        }
        final WebView webView = h5ProInstance.getWebView();
        if (webView == null) {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "execute: webView is null");
            c(-1, "webView is null", onReverseControlCallback);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        Locale locale = Locale.ENGLISH;
        final String str3 = "javascript:onReverseControlListener('" + str2 + com.huawei.operation.utils.Constants.RIGHT_BRACKET;
        if (onReverseControlCallback == null) {
            webView.evaluateJavascript(str3, null);
        } else {
            new b(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.health.h5pro.core.H5ProReverseControlExecutor.3
                @Override // java.lang.Runnable
                public void run() {
                    webView.evaluateJavascript(str3, new ValueCallback<String>() { // from class: com.huawei.health.h5pro.core.H5ProReverseControlExecutor.3.2
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str4) {
                            LogUtil.i("H5PRO_H5ProReverseControlExecutor", "execute: onReceiveValue");
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            H5ProReverseControlExecutor.this.c(0, str4, onReverseControlCallback);
                        }
                    });
                }
            });
        }
    }

    public void put(H5ProInstance h5ProInstance) {
        if (h5ProInstance == null) {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "put: instance is null");
            return;
        }
        H5ProAppInfo appInfo = h5ProInstance.getAppInfo();
        if (appInfo == null) {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "put: appInfo is null");
        } else if (appInfo.getH5ProAppType() == H5ProAppInfo.H5ProAppType.H5_MINI_PROGRAM) {
            f6745a.put(appInfo.getPkgName(), h5ProInstance);
        } else {
            f6745a.put(appInfo.getBaseUrl(), h5ProInstance);
        }
    }

    public void remove(H5ProInstance h5ProInstance) {
        if (h5ProInstance == null) {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "remove: instance is null");
            return;
        }
        H5ProAppInfo appInfo = h5ProInstance.getAppInfo();
        if (appInfo == null) {
            LogUtil.w("H5PRO_H5ProReverseControlExecutor", "remove: appInfo is null");
        } else if (appInfo.getH5ProAppType() == H5ProAppInfo.H5ProAppType.H5_MINI_PROGRAM) {
            f6745a.remove(appInfo.getPkgName());
        } else {
            f6745a.remove(appInfo.getBaseUrl());
        }
    }
}
