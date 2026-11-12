package com.huami.midong.webview.nativejsapi;

import android.content.Context;
import com.huami.midong.webview.jsbridge.JsBridgeHandler;
import com.huami.midong.webview.jsbridge.JsBridgeWebView;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc;
import com.huami.midong.webview.nativejsapi.apis.JsBtnClickFunc;
import com.huami.midong.webview.nativejsapi.apis.JsCancelAuthFunc;
import com.huami.midong.webview.nativejsapi.apis.JsCheckAppInstallFunc;
import com.huami.midong.webview.nativejsapi.apis.JsDownloadESIMFunc;
import com.huami.midong.webview.nativejsapi.apis.JsExitFunc;
import com.huami.midong.webview.nativejsapi.apis.JsGetLocationFunc;
import com.huami.midong.webview.nativejsapi.apis.JsGetUserInfoFunc;
import com.huami.midong.webview.nativejsapi.apis.JsGetUserTokenFunc;
import com.huami.midong.webview.nativejsapi.apis.JsNavigateFunc;
import com.huami.midong.webview.nativejsapi.apis.JsOpenExternalAppFunc;
import com.huami.midong.webview.nativejsapi.apis.JsOpenInBrowserFunc;
import com.huami.midong.webview.nativejsapi.apis.JsPreVerifyFunc;
import com.huami.midong.webview.nativejsapi.apis.JsPushDeviceNoticeFunc;
import com.huami.midong.webview.nativejsapi.apis.JsRightBtnsFunc;
import com.huami.midong.webview.nativejsapi.apis.JsShareFunc;
import com.huami.midong.webview.nativejsapi.apis.JsShowDeviceXCodeFunc;
import com.huami.midong.webview.nativejsapi.apis.JsSyncWatchSkinFunc;
import com.huami.midong.webview.nativejsapi.apis.JsTitleBgColorFunc;
import com.huami.midong.webview.nativejsapi.apis.JsTitleFgColorFunc;
import com.huami.midong.webview.nativejsapi.apis.JsTitleVisibilityFunc;
import com.huami.midong.webview.nativejsapi.apis.JsWxPayFunc;
import com.huami.watch.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeNativeAPI {
    private static final String TAG = "JsBridge";
    private final Context mContext;
    private IJsBridgeSyncWatchSkinCallback mJsPageCallback;
    private IJsBridgeTitleCallback mJsTitleCallback;
    private final JsBridgeWebView mWebView;
    private String mVerifyHost = null;
    private Map<JsBridgeNativeAPIEnum, JsBridgeFunc> funcMap = new HashMap();

    public JsBridgeNativeAPI(Context context, JsBridgeWebView jsBridgeWebView) {
        Objects.requireNonNull(context.getApplicationContext());
        this.mContext = context.getApplicationContext();
        this.mWebView = jsBridgeWebView;
        loadFunc();
    }

    private void addFunc(JsBridgeFunc jsBridgeFunc) {
        this.funcMap.put(jsBridgeFunc.func(), jsBridgeFunc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$0(JsBridgeNativeAPIEnum jsBridgeNativeAPIEnum, String str, JsCallBackFunction jsCallBackFunction) {
        JsBridgeFunc jsBridgeFunc = this.funcMap.containsKey(jsBridgeNativeAPIEnum) ? this.funcMap.get(jsBridgeNativeAPIEnum) : null;
        if (jsBridgeFunc != null) {
            jsBridgeFunc.setNativeApi(this);
            jsBridgeFunc.handler(str, jsCallBackFunction);
        } else {
            Log.e(TAG, jsBridgeNativeAPIEnum.getFunc() + " not add", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerNativeApi$1(final JsBridgeNativeAPIEnum jsBridgeNativeAPIEnum, final String str, final JsCallBackFunction jsCallBackFunction) {
        this.mWebView.post(new Runnable() { // from class: qj4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$null$0(jsBridgeNativeAPIEnum, str, jsCallBackFunction);
            }
        });
    }

    private void loadFunc() {
        addFunc(new JsBtnClickFunc());
        addFunc(new JsCancelAuthFunc());
        addFunc(new JsCheckAppInstallFunc());
        addFunc(new JsExitFunc());
        addFunc(new JsGetLocationFunc());
        addFunc(new JsGetUserInfoFunc());
        addFunc(new JsGetUserTokenFunc());
        addFunc(new JsNavigateFunc());
        addFunc(new JsOpenExternalAppFunc(this.mContext));
        addFunc(new JsOpenInBrowserFunc());
        addFunc(new JsPreVerifyFunc());
        addFunc(new JsPushDeviceNoticeFunc());
        addFunc(new JsRightBtnsFunc());
        addFunc(new JsShareFunc());
        addFunc(new JsSyncWatchSkinFunc());
        addFunc(new JsTitleBgColorFunc());
        addFunc(new JsTitleFgColorFunc());
        addFunc(new JsTitleVisibilityFunc());
        addFunc(new JsWxPayFunc());
        addFunc(new JsShowDeviceXCodeFunc());
        addFunc(new JsDownloadESIMFunc());
    }

    private void registerNativeApi(final JsBridgeNativeAPIEnum jsBridgeNativeAPIEnum) {
        this.mWebView.registerHandler(jsBridgeNativeAPIEnum.getFunc(), new JsBridgeHandler() { // from class: pj4
            @Override // com.huami.midong.webview.jsbridge.JsBridgeHandler
            public final void handler(String str, JsCallBackFunction jsCallBackFunction) {
                this.a.lambda$registerNativeApi$1(jsBridgeNativeAPIEnum, str, jsCallBackFunction);
            }
        });
    }

    public Context getContext() {
        return this.mContext;
    }

    public IJsBridgeTitleCallback getJsTitleCallback() {
        return this.mJsTitleCallback;
    }

    public IJsBridgeSyncWatchSkinCallback getSyncWatchSkinCallback() {
        return this.mJsPageCallback;
    }

    public String getVerifyHost() {
        return this.mVerifyHost;
    }

    public JsBridgeWebView getWebView() {
        return this.mWebView;
    }

    public void registerAllNativeApi() {
        this.mWebView.clearHandlers();
        for (JsBridgeNativeAPIEnum jsBridgeNativeAPIEnum : JsBridgeNativeAPIEnum.values()) {
            registerNativeApi(jsBridgeNativeAPIEnum);
        }
    }

    public void registerSelectNativeApi(List<String> list) {
        this.mWebView.clearHandlers();
        for (String str : list) {
            JsBridgeNativeAPIEnum jsBridgeNativeAPIEnum = JsBridgeNativeAPIEnum.get(str);
            if (jsBridgeNativeAPIEnum != null) {
                registerNativeApi(jsBridgeNativeAPIEnum);
            } else {
                Log.e(TAG, "api--->" + str + " not found", new Object[0]);
            }
        }
    }

    public void setJsTitleCallback(IJsBridgeTitleCallback iJsBridgeTitleCallback) {
        this.mJsTitleCallback = iJsBridgeTitleCallback;
    }

    public void setSyncWatchSkinCallback(IJsBridgeSyncWatchSkinCallback iJsBridgeSyncWatchSkinCallback) {
        this.mJsPageCallback = iJsBridgeSyncWatchSkinCallback;
    }

    public void setVerifyHost(String str) {
        this.mVerifyHost = str;
    }
}
