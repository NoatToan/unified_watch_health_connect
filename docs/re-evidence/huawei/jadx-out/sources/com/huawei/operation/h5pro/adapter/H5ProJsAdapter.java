package com.huawei.operation.h5pro.adapter;

import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.huawei.health.h5pro.core.H5ProEngineFactory;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.TrustListCheckerImpl;
import com.huawei.operation.h5pro.jsmodules.CampaignJsApi;
import com.huawei.operation.h5pro.jsmodules.InnerApi;
import com.huawei.operation.h5pro.jsmodules.trade.JsTradeApi;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class H5ProJsAdapter {
    private static final String TAG = "H5PRO_H5ProJsAdapter";
    private H5ProInstance h5ProInstance;
    private WeakHashMap<String, JsBaseModule> jsApiMap = new WeakHashMap<>();
    private WeakReference<WebView> mWebView;

    public H5ProJsAdapter(WebView webView, RelativeLayout relativeLayout) {
        LogUtil.a(TAG, "H5ProJsAdapter start.");
        this.mWebView = new WeakReference<>(webView);
        this.h5ProInstance = initH5ProInstance(webView, relativeLayout);
    }

    public void mountH5ProInterfaces(String str) {
        mountInnerApi(str);
        mountJsTradeApi();
        mountCampaignJsApi(str);
    }

    public void cleanH5ProInterfaces() {
        WeakHashMap<String, JsBaseModule> weakHashMap = this.jsApiMap;
        if (weakHashMap == null || weakHashMap.isEmpty()) {
            return;
        }
        JsBaseModule jsBaseModule = this.jsApiMap.get("innerapi");
        if (jsBaseModule != null) {
            jsBaseModule.onDestroy();
            this.jsApiMap.remove("innerapi");
            LogUtil.a(TAG, "cleanH5ProInterfaces: innerApi");
        }
        JsBaseModule jsBaseModule2 = this.jsApiMap.get("tradeApi");
        if (jsBaseModule2 != null) {
            jsBaseModule2.onDestroy();
            this.jsApiMap.remove("tradeApi");
            LogUtil.a(TAG, "cleanH5ProInterfaces: tradeApi");
        }
        JsBaseModule jsBaseModule3 = this.jsApiMap.get(CampaignJsApi.CAMPAIGN_JS_API);
        if (jsBaseModule3 != null) {
            jsBaseModule3.onDestroy();
            this.jsApiMap.remove(CampaignJsApi.CAMPAIGN_JS_API);
            LogUtil.a(TAG, "cleanH5ProInterfaces: campaignJsApi");
        }
    }

    private H5ProInstance initH5ProInstance(WebView webView, RelativeLayout relativeLayout) {
        H5ProInstance h5ProInstanceCreateInstance = H5ProEngineFactory.getH5ProEngine().createInstance(webView, (H5ProAppLoadListener) null);
        h5ProInstanceCreateInstance.setJsCbkInvoker(new JsCbkInvoker(webView));
        h5ProInstanceCreateInstance.setViewControls(new H5ViewControls(relativeLayout));
        return h5ProInstanceCreateInstance;
    }

    private void mountInnerApi(String str) {
        LogUtil.a(TAG, "mountInnerApi start.");
        WeakReference<WebView> weakReference = this.mWebView;
        if (weakReference == null) {
            LogUtil.j(TAG, "mountInnerApi:", "mWebView is null");
            return;
        }
        WebView webView = weakReference.get();
        if (webView == null) {
            LogUtil.j(TAG, "mountInnerApi:", "webView is null");
            return;
        }
        if (!TrustListCheckerImpl.isMountSpecialJsModule(false, str)) {
            LogUtil.j(TAG, "mountInnerApi: untrusted -> " + str);
        } else {
            InnerApi innerApi = new InnerApi();
            innerApi.onMount(webView.getContext(), this.h5ProInstance);
            webView.addJavascriptInterface(innerApi, "innerapi");
            this.jsApiMap.put("innerapi", innerApi);
        }
    }

    private void mountJsTradeApi() {
        LogUtil.a(TAG, "mountJsTradeApi start.");
        WeakReference<WebView> weakReference = this.mWebView;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.j(TAG, "mountJsTradeApi:", "webView is null");
            return;
        }
        WebView webView = this.mWebView.get();
        JsTradeApi jsTradeApi = new JsTradeApi();
        jsTradeApi.onMount(webView.getContext(), this.h5ProInstance);
        webView.addJavascriptInterface(jsTradeApi, "tradeApi");
        this.jsApiMap.put("tradeApi", jsTradeApi);
    }

    private void mountCampaignJsApi(String str) {
        if (CampaignJsApi.isCampaignUrl(str)) {
            LogUtil.a(TAG, "mountCampaignJsApi start.");
            WeakReference<WebView> weakReference = this.mWebView;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.j(TAG, "mountCampaignJsApi:", "webView is null");
                return;
            }
            WebView webView = this.mWebView.get();
            CampaignJsApi campaignJsApi = new CampaignJsApi();
            campaignJsApi.onMount(webView.getContext(), this.h5ProInstance);
            webView.addJavascriptInterface(campaignJsApi, CampaignJsApi.CAMPAIGN_JS_API);
            this.jsApiMap.put(CampaignJsApi.CAMPAIGN_JS_API, campaignJsApi);
        }
    }
}
