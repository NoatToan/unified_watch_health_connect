package com.miuipub.internal.hybrid;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mipay.sdk.web.R;
import defpackage.jh9;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import miuipub.hybrid.Callback;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.LifecycleListener;
import miuipub.hybrid.NativeInterface;
import miuipub.hybrid.PageContext;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;

/* JADX INFO: loaded from: classes6.dex */
public class HybridManager {
    public static final String TAG = "MipayWeb_hybridManager";
    private static ExecutorService sPool = Executors.newCachedThreadPool();
    private Activity mActivity;
    private Config mConfig;
    private Config mDefaultConfig;
    private HybridPermissionManager mDefaultPM;
    private Set<LifecycleListener> mListeners = new CopyOnWriteArraySet();
    private NativeInterface mNativeInterface = new NativeInterface(this);
    private HybridPermissionManager mPM;
    private PageContext mPageContext;
    private WebView mView;

    public class AsyncInvocation implements Runnable {
        private HybridFeature mFeature;
        private String mJsCallback;
        private Request mRequest;

        public AsyncInvocation(HybridFeature hybridFeature, Request request, String str) {
            this.mFeature = hybridFeature;
            this.mRequest = request;
            this.mJsCallback = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Response responseInvoke = this.mFeature.invoke(this.mRequest);
            if (this.mFeature.getInvocationMode(this.mRequest) == HybridFeature.Mode.ASYNC) {
                HybridManager hybridManager = HybridManager.this;
                hybridManager.callback(responseInvoke, hybridManager.mPageContext, this.mJsCallback);
            }
        }
    }

    public class JsInvocation implements Runnable {
        private String mJsCallback;
        private Response mResponse;

        public JsInvocation(Response response, String str) {
            this.mResponse = response;
            this.mJsCallback = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strBuildCallbackJavascript = HybridManager.this.buildCallbackJavascript(this.mResponse, this.mJsCallback);
            HybridManager.this.mView.loadUrl("javascript:" + strBuildCallbackJavascript);
        }
    }

    public HybridManager(Activity activity, WebView webView) {
        this.mActivity = activity;
        this.mView = webView;
        Config configLoadDefaultConfig = loadDefaultConfig(R.xml.mipay_sdk_hybrid_config);
        this.mDefaultConfig = configLoadDefaultConfig;
        config(configLoadDefaultConfig, false);
        this.mDefaultPM = this.mPM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildCallbackJavascript(Response response, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + "('" + response.toString().replace("\\", "\\\\").replace("'", "\\'") + "');";
    }

    private HybridFeature createFeature(String str) throws HybridException {
        String strB = jh9.a().b(str);
        if (TextUtils.isEmpty(strB) || !isValid(str)) {
            throw new HybridException(204, "feature not found: " + str);
        }
        try {
            return (HybridFeature) Class.forName(strB).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new HybridException(204, "feature class not fount: " + strB);
        } catch (IllegalAccessException unused2) {
            throw new HybridException(204, "feature cannot be accessed: " + strB);
        } catch (InstantiationException unused3) {
            throw new HybridException(204, "feature cannot be instantiated: " + strB);
        }
    }

    private Request createRequest(String str, String str2) {
        Request request = new Request();
        request.setAction(str);
        request.setRawParams(str2);
        request.setPageContext(this.mPageContext);
        request.setView(this.mView);
        request.setNativeInterface(this.mNativeInterface);
        return request;
    }

    private boolean isValid(String str) {
        return (this.mDefaultConfig.getFeature(str) != null && this.mDefaultPM.isValid(this.mPageContext.getUrl())) || (this.mConfig.getFeature(str) != null && this.mPM.isValid(this.mPageContext.getUrl()));
    }

    private Config loadDefaultConfig(int i) {
        try {
            return (i == 0 ? XmlConfigParser.create(this.mActivity) : XmlConfigParser.createFromResId(this.mActivity, i)).parse(null);
        } catch (HybridException e) {
            throw new RuntimeException("cannot load config: " + e.getMessage());
        }
    }

    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        this.mListeners.add(lifecycleListener);
    }

    public void callback(Response response, PageContext pageContext, String str) {
        if (pageContext.equals(this.mPageContext)) {
            this.mActivity.runOnUiThread(new JsInvocation(response, str));
        }
    }

    public String config(String str) {
        try {
            return config(JsonConfigParser.createFromString(str).parse(null), true);
        } catch (HybridException e) {
            return new Response(201, e.getMessage()).toString();
        }
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public PageContext getPageContext() {
        return this.mPageContext;
    }

    public String invoke(String str, String str2, String str3, String str4) {
        Request requestCreateRequest = createRequest(str2, str3);
        try {
            HybridFeature hybridFeatureCreateFeature = createFeature(str);
            HybridFeature.Mode invocationMode = hybridFeatureCreateFeature.getInvocationMode(requestCreateRequest);
            if (invocationMode == HybridFeature.Mode.SYNC) {
                callback(new Response(1), requestCreateRequest.getPageContext(), str4);
                return hybridFeatureCreateFeature.invoke(requestCreateRequest).toString();
            }
            if (invocationMode == HybridFeature.Mode.ASYNC) {
                sPool.execute(new AsyncInvocation(hybridFeatureCreateFeature, requestCreateRequest, str4));
                return new Response(2).toString();
            }
            requestCreateRequest.setCallback(new Callback(this, this.mPageContext, str4));
            sPool.execute(new AsyncInvocation(hybridFeatureCreateFeature, requestCreateRequest, str4));
            return new Response(3).toString();
        } catch (HybridException e) {
            Response response = e.getResponse();
            callback(response, this.mPageContext, str4);
            return response.toString();
        }
    }

    public String lookup(String str, String str2) {
        try {
            if (createFeature(str).getInvocationMode(createRequest(str2, null)) != null) {
                return new Response(0).toString();
            }
            return new Response(205, "action not supported: " + str2).toString();
        } catch (HybridException e) {
            return e.getResponse().toString();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public void onDestroy() {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public void onPageChange() {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onPageChange();
        }
    }

    public void onPause() {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public void onStart() {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    public void onStop() {
        Iterator<LifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }

    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        this.mListeners.remove(lifecycleListener);
    }

    public void setPageContext(PageContext pageContext) {
        this.mPageContext = pageContext;
    }

    private String config(Config config, boolean z) {
        if (z) {
            SecurityManager securityManager = new SecurityManager(config, this.mActivity.getApplicationContext());
            if (securityManager.isExpired() || !securityManager.isValidSignature()) {
                return new Response(202).toString();
            }
        }
        this.mConfig = config;
        this.mPM = new HybridPermissionManager(config);
        return new Response(0).toString();
    }
}
