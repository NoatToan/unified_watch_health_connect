package com.huami.discovery.bridge;

import android.content.Context;
import android.webkit.DownloadListener;
import com.huami.discovery.bridge.bracelet.BraceletCallback;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.discovery.bridge.jsbridge.JsBridgeCallback;
import com.huami.discovery.bridge.jsbridge.JsBridgeNativeAPI;
import com.huami.discovery.bridge.jsbridge.JsBridgeWebView;
import com.huami.discovery.bridge.jsbridge.api.JsBridgeApi;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes8.dex */
public class BridgeCallbackBinder {
    private static final String l = "BridgeCallbackBinder";
    private JsBridgeNativeAPI a;
    private JsBridgeCallback b;
    private BraceletHandler c;
    private BraceletCallback d;
    private JsBridgeApi e;
    private WebLoadNewWindow f;
    private WebUserAgenter g;
    private DownloadListener h;
    private WebLoadCallback i;
    private AppNativeFunctionCallback j;
    private double k;

    public static class b {
        private static final BridgeCallbackBinder a = new BridgeCallbackBinder();

        private b() {
        }
    }

    public static BridgeCallbackBinder getInstance() {
        return b.a;
    }

    public void bindBraceletHandler(Context context, WebItem webItem) {
        BraceletHandler braceletHandler = new BraceletHandler(context, webItem);
        this.c = braceletHandler;
        braceletHandler.setBraceletCallback(this.d);
    }

    public void bindJSNativeAPI(Context context, JsBridgeWebView jsBridgeWebView) {
        JsBridgeNativeAPI jsBridgeNativeAPI = new JsBridgeNativeAPI(context, jsBridgeWebView);
        this.a = jsBridgeNativeAPI;
        jsBridgeNativeAPI.setJsBridgeListener(this.b);
        this.a.setJsBridgeApi(this.e);
    }

    public void deinit() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.b = null;
        this.a = null;
        this.j = null;
        this.d = null;
        this.c = null;
    }

    public AppNativeFunctionCallback getAppNativeFunctionCallback() {
        return this.j;
    }

    public double getReactRootViewHeight() {
        return this.k;
    }

    public WebUserAgenter getUserAgenter() {
        return this.g;
    }

    public BraceletCallback getmBraceletCallback() {
        return this.d;
    }

    public BraceletHandler getmBraceletHandler() {
        return this.c;
    }

    public JsBridgeApi getmJsBridgeApi() {
        return this.e;
    }

    public JsBridgeCallback getmJsBridgeCallback() {
        return this.b;
    }

    public JsBridgeNativeAPI getmJsNativeAPI() {
        return this.a;
    }

    public WebLoadNewWindow getmNewWindow() {
        return this.f;
    }

    @Deprecated
    public void initSoLoader(Context context) {
    }

    public void setAppNativeFunctionCallback(AppNativeFunctionCallback appNativeFunctionCallback) {
        this.j = appNativeFunctionCallback;
    }

    public void setBraceletCallback(BraceletCallback braceletCallback) {
        HMLog.i(l, "setBraceletCallback", new Object[0]);
        this.d = braceletCallback;
    }

    public void setJsBridgeApi(JsBridgeApi jsBridgeApi) {
        this.e = jsBridgeApi;
    }

    public void setJsBridgeCallback(JsBridgeCallback jsBridgeCallback) {
        this.b = jsBridgeCallback;
        HMLog.i(l, "setJsBridgeCallback", new Object[0]);
    }

    public void setLoadingCallback(WebLoadCallback webLoadCallback) {
        HMLog.i(l, "setLoadingCallback", new Object[0]);
        this.i = webLoadCallback;
    }

    public void setReactRootViewHeight(double d) {
        this.k = d;
    }

    public void setWebDownloadCallback(DownloadListener downloadListener) {
        this.h = downloadListener;
    }

    public void setWebLoadNewWindow(WebLoadNewWindow webLoadNewWindow) {
        this.f = webLoadNewWindow;
    }

    public void setWebUserAgenter(WebUserAgenter webUserAgenter) {
        this.g = webUserAgenter;
    }

    private BridgeCallbackBinder() {
    }
}
