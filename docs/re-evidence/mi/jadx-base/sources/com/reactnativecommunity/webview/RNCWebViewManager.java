package com.reactnativecommunity.webview;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.webview.events.TopHttpErrorEvent;
import com.facebook.react.views.webview.events.TopShouldStartLoadWithRequestEvent;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.util.Constants;
import com.reactnativecommunity.webview.events.TopLoadingErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingFinishEvent;
import com.reactnativecommunity.webview.events.TopLoadingProgressEvent;
import com.reactnativecommunity.webview.events.TopLoadingStartEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnNetReport;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ccr;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.hi4;
import defpackage.iej;
import defpackage.jd8;
import defpackage.ndj;
import defpackage.ni4;
import defpackage.q9h;
import defpackage.vhl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = "RNCWebView")
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    protected static final String BRIDGE_NAME = "REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    public static String activeUrl;
    protected Method allowSetFileAccessMethod;
    protected Method canDebugMethod;
    protected Method getHtmlStr;
    protected Method isDarkMode;
    protected Method isInWhiteListMethod;
    protected boolean mAllowsFullscreenVideo;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected d mWebChromeClient;
    protected ccr mWebViewConfig;
    protected Method reportMethod;

    public static class RNCWebView extends WebView implements LifecycleEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10541b;
        public boolean c;
        public e d;
        public boolean e;
        public q9h f;
        public boolean g;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WebView f10542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f10543b;

            public a(WebView webView, String str) {
                this.f10542a = webView;
                this.f10543b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = RNCWebView.this.d;
                if (eVar == null) {
                    return;
                }
                WebView webView = this.f10542a;
                WritableMap writableMapA = eVar.a(webView, webView.getUrl());
                writableMapA.putString("data", this.f10543b);
                RNCWebViewManager.dispatchEvent(this.f10542a, new TopMessageEvent(this.f10542a.getId(), writableMapA));
            }
        }

        public class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public RNCWebView f10544a;

            public b(RNCWebView rNCWebView) {
                this.f10544a = rNCWebView;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f10544a.h(str);
            }
        }

        public class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public RNCWebView f10546a;

            public c(RNCWebView rNCWebView) {
                this.f10546a = rNCWebView;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f10546a.h(str);
            }
        }

        public RNCWebView(g9p g9pVar) {
            super(g9pVar);
            this.c = false;
            this.e = false;
            this.g = false;
        }

        public void a() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f10540a) == null || TextUtils.isEmpty(str)) {
                return;
            }
            f("(function() {\n" + this.f10540a + ";\n})();");
        }

        public void b() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f10541b) == null || TextUtils.isEmpty(str)) {
                return;
            }
            f("(function() {\n" + this.f10541b + ";\n})();");
        }

        public void c() {
            setWebViewClient(null);
            destroy();
        }

        public b d(RNCWebView rNCWebView) {
            return new b(rNCWebView);
        }

        public c e(RNCWebView rNCWebView) {
            return new c(rNCWebView);
        }

        public void f(String str) {
            evaluateJavascript(str, null);
        }

        public void g() {
            if (this.c) {
                f("(function(){window.originalPostMessage = window.postMessage;window.postMessage = function(data) { window.REACT_WEB_VIEW_BRIDGE.postMessage(String(data));}})();");
            }
        }

        public e getRNCWebViewClient() {
            return this.d;
        }

        public void h(String str) {
            if (this.d != null) {
                post(new a(this, str));
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("data", str);
            RNCWebViewManager.dispatchEvent(this, new TopMessageEvent(getId(), writableMapCreateMap));
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            c();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.g) {
                if (this.f == null) {
                    this.f = new q9h();
                }
                if (this.f.c(i, i2)) {
                    RNCWebViewManager.dispatchEvent(this, vhl.b(getId(), ScrollEventType.SCROLL, i, i2, this.f.a(), this.f.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.e) {
                RNCWebViewManager.dispatchEvent(this, new hi4(getId(), i, i2));
            }
        }

        public void setHasScrollEvent(boolean z) {
            this.g = z;
        }

        public void setInjectedJavaScript(String str) {
            this.f10540a = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.f10541b = str;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.c == z) {
                return;
            }
            this.c = z;
            if (!z) {
                removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
                removeJavascriptInterface(RNCWebViewManager.BRIDGE_NAME);
            } else {
                addJavascriptInterface(d(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
                addJavascriptInterface(e(this), RNCWebViewManager.BRIDGE_NAME);
                g();
            }
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.e = z;
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.d = (e) webViewClient;
        }
    }

    public class a implements ccr {
        public a() {
        }

        @Override // defpackage.dcr
        public void a(WebView webView) {
        }
    }

    public class b implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g9p f10549a;

        public b(g9p g9pVar) {
            this.f10549a = g9pVar;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f10549a);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
            String str5 = "Downloading " + strGuessFileName;
            try {
                URL url = new URL(str);
                String cookie = CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost());
                request.addRequestHeader(NetConstants.COOKIE, cookie);
                System.out.println("Got cookie for DownloadManager: " + cookie);
            } catch (MalformedURLException e) {
                System.out.println("Error getting cookie for DownloadManager: " + e.toString());
                e.printStackTrace();
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(strGuessFileName);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
            module.setDownloadRequest(request);
            if (module.grantFileDownloaderPermissions()) {
                module.downloadFile();
            }
        }
    }

    public class c extends d {
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactContext reactContext, WebView webView, int i) {
            super(reactContext, webView);
            this.f = i;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            View view = this.c;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            a().removeView(this.c);
            this.d.onCustomViewHidden();
            this.c = null;
            this.d = null;
            this.f10552b.setVisibility(0);
            this.f10551a.getCurrentActivity().getWindow().clearFlags(512);
            this.f10551a.getCurrentActivity().setRequestedOrientation(this.f);
            this.f10551a.removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.c != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.c = view;
            this.d = customViewCallback;
            this.f10551a.getCurrentActivity().setRequestedOrientation(-1);
            this.c.setSystemUiVisibility(7942);
            this.f10551a.getCurrentActivity().getWindow().setFlags(512, 512);
            this.c.setBackgroundColor(-16777216);
            a().addView(this.c, d.e);
            this.f10552b.setVisibility(8);
            this.f10551a.addLifecycleEventListener(this);
        }
    }

    public static class d extends WebChromeClient implements LifecycleEventListener {
        public static final FrameLayout.LayoutParams e = new FrameLayout.LayoutParams(-1, -1, 17);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ReactContext f10551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f10552b;
        public View c;
        public WebChromeClient.CustomViewCallback d;

        public d(ReactContext reactContext, WebView webView) {
            this.f10551a = reactContext;
            this.f10552b = webView;
        }

        public ViewGroup a() {
            return (ViewGroup) this.f10551a.getCurrentActivity().findViewById(R.id.content);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view = this.c;
            if (view == null || view.getSystemUiVisibility() == 7942) {
                return;
            }
            this.c.setSystemUiVisibility(7942);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String[] resources = permissionRequest.getResources();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < resources.length; i++) {
                if (resources[i].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                } else if (resources[i].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add("android.permission.CAMERA");
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (ni4.a(this.f10551a, (String) arrayList.get(i2)) == 0) {
                    if (((String) arrayList.get(i2)).equals("android.permission.RECORD_AUDIO")) {
                        arrayList2.add("android.webkit.resource.AUDIO_CAPTURE");
                    } else if (((String) arrayList.get(i2)).equals("android.permission.CAMERA")) {
                        arrayList2.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.deny();
            } else {
                permissionRequest.grant((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            String str;
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (url == null || (str = RNCWebViewManager.activeUrl) == null || url.equals(str)) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("target", webView.getId());
                writableMapCreateMap.putString("title", webView.getTitle());
                writableMapCreateMap.putString("url", url);
                writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
                writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
                writableMapCreateMap.putDouble(BroadcastsKt.SILENT_PUSHING_PROGRESS, i / 100.0f);
                RNCWebViewManager.dispatchEvent(webView, new TopLoadingProgressEvent(webView.getId(), writableMapCreateMap));
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return RNCWebViewManager.getModule(this.f10551a).startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.reportMethod = null;
        this.isInWhiteListMethod = null;
        this.getHtmlStr = null;
        this.allowSetFileAccessMethod = null;
        this.isDarkMode = null;
        this.canDebugMethod = null;
        this.mWebViewConfig = new a();
        try {
            this.reportMethod = RnNetReport.class.getMethod("reportWebViewURL", String.class);
            this.isInWhiteListMethod = RnNetReport.class.getMethod("isInWhiteListHost", String.class);
            this.getHtmlStr = RnNetReport.class.getMethod("getInterceptHtmlStr", Context.class);
            this.allowSetFileAccessMethod = RnNetReport.class.getMethod("allowSetFileAccess", new Class[0]);
            this.isDarkMode = RnNetReport.class.getMethod("isDarkMode", new Class[0]);
            this.canDebugMethod = RnNetReport.class.getMethod("canDebug", new Class[0]);
        } catch (ClassNotFoundException e2) {
            this.reportMethod = null;
            this.isInWhiteListMethod = null;
            this.getHtmlStr = null;
            this.allowSetFileAccessMethod = null;
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            this.reportMethod = null;
            this.isInWhiteListMethod = null;
            this.getHtmlStr = null;
            this.allowSetFileAccessMethod = null;
            e3.printStackTrace();
        }
    }

    public static void dispatchEvent(WebView webView, jd8 jd8Var) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(jd8Var);
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String readFileContent(String str) {
        BufferedReader bufferedReader;
        StringBuilder sb;
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append("\r\n");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            bufferedReader = null;
        } catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
            bufferedReader = null;
        }
        sb = new StringBuilder();
        String string = sb.toString();
        try {
            bufferedReader.close();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        return string;
    }

    public boolean allowSetFileAccess() {
        Method method = this.allowSetFileAccessMethod;
        if (method == null) {
            return true;
        }
        try {
            return ((Boolean) method.invoke(null, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return true;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return true;
        }
    }

    public RNCWebView createRNCWebViewInstance(g9p g9pVar) {
        return new RNCWebView(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Map<String, Integer> mapJ = e4f.j("goBack", 1, "goForward", 2, "reload", 3, "stopLoading", 4, "postMessage", 5, "injectJavaScript", 6, "loadUrl", 7);
        mapJ.put("requestFocus", 8);
        return mapJ;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = e4f.b();
        }
        exportedCustomDirectEventTypeConstants.put(com.facebook.react.views.webview.events.TopLoadingProgressEvent.EVENT_NAME, e4f.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put(TopShouldStartLoadWithRequestEvent.EVENT_NAME, e4f.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), e4f.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put(TopHttpErrorEvent.EVENT_NAME, e4f.d("registrationName", "onHttpError"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @iej(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        if (allowSetFileAccess()) {
            webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
        }
    }

    @iej(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z) {
        if (allowSetFileAccess()) {
            webView.getSettings().setAllowFileAccessFromFileURLs(z);
        }
    }

    @iej(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        if (allowSetFileAccess()) {
            webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
        }
    }

    @iej(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @iej(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, String str) {
        if (str != null) {
            this.mUserAgentWithApplicationName = WebSettings.getDefaultUserAgent(webView.getContext()) + " " + str;
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        setUserAgentString(webView);
    }

    @iej(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        if (!z) {
            webView.getSettings().setCacheMode(2);
            webView.getSettings().setAppCacheEnabled(false);
            return;
        }
        Context context = webView.getContext();
        if (context != null) {
            webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
            webView.getSettings().setCacheMode(-1);
            webView.getSettings().setAppCacheEnabled(true);
        }
    }

    @iej(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        byte b2;
        Integer num;
        switch (str) {
            case "LOAD_NO_CACHE":
                b2 = 2;
                break;
            case "LOAD_DEFAULT":
                b2 = 3;
                break;
            case "LOAD_CACHE_ELSE_NETWORK":
                b2 = 1;
                break;
            case "LOAD_CACHE_ONLY":
                b2 = 0;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            num = 3;
        } else if (b2 != 1) {
            num = b2 != 2 ? -1 : 2;
        } else {
            num = 1;
        }
        webView.getSettings().setCacheMode(num.intValue());
    }

    @iej(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @iej(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @iej(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        if (z) {
            webView.setLayerType(1, null);
        }
    }

    @iej(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        CookieManager.getInstance().removeAllCookies(null);
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(!z);
        webView.clearHistory();
        webView.clearCache(z);
        webView.clearFormData();
        webView.getSettings().setSavePassword(!z);
        webView.getSettings().setSaveFormData(!z);
    }

    @iej(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((RNCWebView) webView).setInjectedJavaScript(str);
    }

    @iej(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(WebView webView, String str) {
        ((RNCWebView) webView).setInjectedJavaScriptBeforeContentLoaded(str);
    }

    @iej(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @iej(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @iej(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((RNCWebView) webView).setMessagingEnabled(z);
    }

    @iej(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (str == null || "never".equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if ("always".equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if ("compatibility".equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @iej(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        ((RNCWebView) webView).setSendContentSizeChangeEvents(z);
    }

    @iej(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((RNCWebView) webView).setHasScrollEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    @iej(name = "overScrollMode")
    public void setOverScrollMode(WebView webView, String str) {
        byte b2;
        Integer num;
        int iHashCode = str.hashCode();
        if (iHashCode != -1414557169) {
            if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && str.equals(MiuiCursorConstants.CONTENT)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("never")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (str.equals("always")) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            num = b2 != 1 ? 0 : 1;
        } else {
            num = 2;
        }
        webView.setOverScrollMode(num.intValue());
    }

    @iej(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @iej(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @iej(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @iej(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @iej(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        Method method;
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "", readableMap.getString("html"), HTML_MIME_TYPE, "UTF-8", null);
                return;
            }
            if (readableMap.hasKey(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                String string = readableMap.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
                Method method2 = this.reportMethod;
                byte[] bytes = null;
                if (method2 != null) {
                    try {
                        method2.invoke(null, string);
                        if (string != null && (string.startsWith("http://") || string.startsWith("https://"))) {
                            Method method3 = this.isInWhiteListMethod;
                            if (method3 != null && !((Boolean) method3.invoke(null, string)).booleanValue() && (method = this.getHtmlStr) != null) {
                                String str = (String) method.invoke(null, webView.getContext());
                                if (!TextUtils.isEmpty(str)) {
                                    webView.loadDataWithBaseURL("", str, HTML_MIME_TYPE, "UTF-8", null);
                                    return;
                                }
                            }
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
                String url = webView.getUrl();
                if (url == null || !url.equals(string)) {
                    if (!TextUtils.isEmpty(string) && string.startsWith("file:///") && readableMap.hasKey("__packager_asset") && readableMap.getBoolean("__packager_asset")) {
                        webView.loadDataWithBaseURL("", readFileContent(Uri.parse(string).getPath()), HTML_MIME_TYPE, "UTF-8", null);
                        return;
                    }
                    if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase("POST")) {
                        if (readableMap.hasKey("body")) {
                            String string2 = readableMap.getString("body");
                            try {
                                bytes = string2.getBytes("UTF-8");
                            } catch (UnsupportedEncodingException unused) {
                                bytes = string2.getBytes();
                            }
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        webView.postUrl(string, bytes);
                        return;
                    }
                    HashMap map = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map2 = readableMap.getMap("headers");
                        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map2.keySetIterator();
                        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                            if (!"user-agent".equals(strNextKey.toLowerCase(Locale.ENGLISH))) {
                                map.put(strNextKey, map2.getString(strNextKey));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map2.getString(strNextKey));
                            }
                        }
                    }
                    webView.loadUrl(string, map);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @iej(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @iej(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
    }

    @iej(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        e rNCWebViewClient = ((RNCWebView) webView).getRNCWebViewClient();
        if (rNCWebViewClient == null || readableArray == null) {
            return;
        }
        rNCWebViewClient.c(readableArray);
    }

    @iej(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        setUserAgentString(webView);
    }

    public void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        if (this.mAllowsFullscreenVideo) {
            c cVar = new c(reactContext, webView, reactContext.getCurrentActivity().getRequestedOrientation());
            this.mWebChromeClient = cVar;
            webView.setWebChromeClient(cVar);
        } else {
            d dVar = this.mWebChromeClient;
            if (dVar != null) {
                dVar.onHideCustomView();
            }
            d dVar2 = new d(reactContext, webView);
            this.mWebChromeClient = dVar2;
            webView.setWebChromeClient(dVar2);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, WebView webView) {
        webView.setWebViewClient(new e());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(g9p g9pVar) {
        Method method;
        RNCWebView rNCWebViewCreateRNCWebViewInstance = createRNCWebViewInstance(g9pVar);
        try {
            Method method2 = this.canDebugMethod;
            if (method2 != null) {
                WebView.setWebContentsDebuggingEnabled(((Boolean) method2.invoke(null, new Object[0])).booleanValue());
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        setupWebChromeClient(g9pVar, rNCWebViewCreateRNCWebViewInstance);
        g9pVar.addLifecycleEventListener(rNCWebViewCreateRNCWebViewInstance);
        this.mWebViewConfig.a(rNCWebViewCreateRNCWebViewInstance);
        WebSettings settings = rNCWebViewCreateRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs(rNCWebViewCreateRNCWebViewInstance, false);
        if (i >= 29 && (method = this.isDarkMode) != null) {
            try {
                if (((Boolean) method.invoke(null, new Object[0])).booleanValue()) {
                    settings.setForceDark(2);
                } else {
                    settings.setForceDark(0);
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
        setMixedContentMode(rNCWebViewCreateRNCWebViewInstance, "never");
        rNCWebViewCreateRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        rNCWebViewCreateRNCWebViewInstance.setDownloadListener(new b(g9pVar));
        return rNCWebViewCreateRNCWebViewInstance;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        g9p g9pVar = (g9p) webView.getContext();
        RNCWebView rNCWebView = (RNCWebView) webView;
        g9pVar.removeLifecycleEventListener(rNCWebView);
        rNCWebView.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    RNCWebView rNCWebView = (RNCWebView) webView;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    rNCWebView.f("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    rNCWebView.f("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}window.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                ((RNCWebView) webView).f(readableArray.getString(0));
                return;
            case 7:
                if (readableArray == null) {
                    throw new RuntimeException("Arguments for loading an url are null!");
                }
                webView.loadUrl(readableArray.getString(0));
                return;
            case 8:
                webView.requestFocus();
                return;
            default:
                return;
        }
    }

    public static class e extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10553a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ReadableArray f10554b;

        public WritableMap a(WebView webView, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("target", webView.getId());
            writableMapCreateMap.putString("url", str);
            writableMapCreateMap.putBoolean("loading", (this.f10553a || webView.getProgress() == 100) ? false : true);
            writableMapCreateMap.putString("title", webView.getTitle());
            writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
            writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
            return writableMapCreateMap;
        }

        public void b(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new TopLoadingFinishEvent(webView.getId(), a(webView, str)));
        }

        public void c(ReadableArray readableArray) {
            this.f10554b = readableArray;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f10553a) {
                return;
            }
            RNCWebView rNCWebView = (RNCWebView) webView;
            rNCWebView.a();
            rNCWebView.g();
            b(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f10553a = false;
            ((RNCWebView) webView).b();
            RNCWebViewManager.dispatchEvent(webView, new TopLoadingStartEvent(webView.getId(), a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f10553a = true;
            b(webView, str2);
            WritableMap writableMapA = a(webView, str2);
            writableMapA.putDouble("code", i);
            writableMapA.putString("description", str);
            RNCWebViewManager.dispatchEvent(webView, new TopLoadingErrorEvent(webView.getId(), writableMapA));
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
                writableMapA.putInt(Constants.PARAM_STATUS_CODE, webResourceResponse.getStatusCode());
                writableMapA.putString("description", webResourceResponse.getReasonPhrase());
                RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.events.TopHttpErrorEvent(webView.getId(), writableMapA));
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            RNCWebViewManager.activeUrl = str;
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.events.TopShouldStartLoadWithRequestEvent(webView.getId(), a(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    public RNCWebViewManager(ccr ccrVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.reportMethod = null;
        this.isInWhiteListMethod = null;
        this.getHtmlStr = null;
        this.allowSetFileAccessMethod = null;
        this.isDarkMode = null;
        this.canDebugMethod = null;
        this.mWebViewConfig = ccrVar;
    }
}
