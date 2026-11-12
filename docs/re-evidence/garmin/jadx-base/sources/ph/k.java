package ph;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import i3.e5;
import java.lang.reflect.Method;
import nh.n;

/* JADX INFO: loaded from: classes7.dex */
public class k extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Handler f137679k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f137680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f137681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f137682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f137683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f137684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f137685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f137686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f137687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f137688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f137689j;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: ph.k$a$a, reason: collision with other inner class name */
        public class RunnableC2611a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f137691a;

            public RunnableC2611a(a aVar, View view2) {
                this.f137691a = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f137691a.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            h hVar = k.this.f137688i;
            if (hVar != null) {
                view2.setEnabled(false);
                k.f137679k.postDelayed(new RunnableC2611a(this, view2), 256L);
                k kVar = k.this;
                if (view2 == kVar.f137680a) {
                    j jVar = (j) hVar;
                    synchronized (jVar) {
                        jVar.h();
                    }
                } else if (view2 == kVar.f137682c) {
                    synchronized (((j) hVar)) {
                        kVar.getWebView().reload();
                        kVar.getRefreshButton().setVisibility(4);
                    }
                }
            }
        }
    }

    public class b implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f137692a;

        public b(k kVar, Context context) {
            this.f137692a = context;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f137692a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            j jVar = (j) k.this.f137686g;
            synchronized (jVar) {
                try {
                    if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                        jVar.f137654a.runOnUiThread(new ph.f(jVar));
                    }
                    jsPromptResult.cancel();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i14) {
            k kVar = k.this;
            if (!kVar.f137685f.f137696b) {
                kVar.f137683d.setVisibility(8);
            } else {
                if (i14 > 90) {
                    kVar.f137683d.setVisibility(4);
                    return;
                }
                if (kVar.f137683d.getVisibility() == 4) {
                    kVar.f137683d.setVisibility(0);
                }
                kVar.f137683d.setProgress(i14);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            k kVar = k.this;
            j jVar = (j) kVar.f137686g;
            synchronized (jVar) {
                if (!str.startsWith("http") && !kVar.getUrl().endsWith(str)) {
                    jVar.f137671i.getTitle().setText(str);
                }
            }
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            k kVar = k.this;
            j jVar = (j) kVar.f137687h;
            synchronized (jVar) {
                wg.a.c(jVar.f137669g, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + n.s(str));
                k kVar2 = jVar.f137671i;
                if (kVar2 != null) {
                    kVar2.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                }
                kVar.getRefreshButton().setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            k kVar;
            j jVar = (j) k.this.f137687h;
            synchronized (jVar) {
                wg.a.c(jVar.f137669g, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + n.s(str));
                if (!TextUtils.isEmpty(str) && !str.endsWith(".apk") && (kVar = jVar.f137671i) != null) {
                    kVar.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                }
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i14, String str, String str2) {
            k kVar = k.this;
            j jVar = (j) kVar.f137687h;
            synchronized (jVar) {
                jVar.f137670h = true;
                wg.a.g(jVar.f137669g, "net", "webError", "onReceivedError:" + i14 + "|" + str2);
                kVar.getRefreshButton().setVisibility(0);
            }
            super.onReceivedError(webView, i14, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            j jVar = (j) k.this.f137687h;
            synchronized (jVar) {
                Activity activity = jVar.f137654a;
                if (activity == null) {
                    return;
                }
                wg.a.g(jVar.f137669g, "net", "SSLError", "2-" + sslError);
                activity.runOnUiThread(new i(jVar, activity, sslErrorHandler));
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            j jVar = (j) k.this.f137687h;
            synchronized (jVar) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Activity activity = jVar.f137654a;
                    if (activity == null) {
                        return true;
                    }
                    if (n.h(activity, jVar.f137669g, str)) {
                        return true;
                    }
                    if (str.startsWith("alipayjsbridge://")) {
                        jVar.e(str.substring(17));
                    } else if (TextUtils.equals(str, "sdklite://h5quit")) {
                        jVar.c(false);
                    } else if (str.startsWith("http://") || str.startsWith("https://")) {
                        jVar.f137671i.b(str);
                    } else {
                        try {
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            activity.startActivity(intent);
                        } catch (Throwable th3) {
                            lh.a aVar = jVar.f137669g;
                            if (aVar != null) {
                                wg.c cVar = aVar.f112386k;
                                String simpleName = th3.getClass().getSimpleName();
                                cVar.getClass();
                                cVar.f("biz", simpleName, wg.c.c(th3));
                            }
                        }
                    }
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f137695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f137696b;

        public e(boolean z14, boolean z15) {
            this.f137695a = z14;
            this.f137696b = z15;
        }
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
    }

    public k(Context context, AttributeSet attributeSet, lh.a aVar, e eVar) {
        super(context, attributeSet);
        a aVar2 = new a();
        eVar = eVar == null ? new e(false, false) : eVar;
        this.f137685f = eVar;
        this.f137689j = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(eVar.f137695a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f137680a = imageView;
        imageView.setOnClickListener(aVar2);
        ImageView imageView2 = this.f137680a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f137680a.setImageDrawable(nh.l.a(context, "iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg=="));
        this.f137680a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f137680a, new LinearLayout.LayoutParams(-2, -2));
        View view2 = new View(context);
        view2.setBackgroundColor(-2500135);
        linearLayout.addView(view2, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f137681b = textView;
        textView.setTextColor(-15658735);
        this.f137681b.setTextSize(17.0f);
        this.f137681b.setMaxLines(1);
        this.f137681b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f137681b, layoutParams);
        ImageView imageView3 = new ImageView(context);
        this.f137682c = imageView3;
        imageView3.setOnClickListener(aVar2);
        this.f137682c.setScaleType(scaleType);
        this.f137682c.setImageDrawable(nh.l.a(context, "iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII="));
        this.f137682c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f137682c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f137683d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f137683d.setMax(100);
        this.f137683d.setBackgroundColor(-218103809);
        addView(this.f137683d, new LinearLayout.LayoutParams(-1, a(2)));
        d(context);
    }

    public final int a(int i14) {
        return (int) (i14 * this.f137689j);
    }

    public final void b(String str) {
        this.f137684e.loadUrl(str);
        WebView webView = this.f137684e;
        int i14 = ph.e.f137653c;
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public final void c() {
        removeAllViews();
        this.f137684e.removeAllViews();
        this.f137684e.setWebViewClient(null);
        this.f137684e.setWebChromeClient(null);
        this.f137684e.destroy();
    }

    public final void d(Context context) {
        WebView webView = new WebView(context);
        this.f137684e = webView;
        webView.setVerticalScrollbarOverlay(true);
        WebView webView2 = this.f137684e;
        String userAgentString = webView2.getSettings().getUserAgentString();
        WebSettings settings = webView2.getSettings();
        StringBuilder sbK = e5.k(userAgentString);
        sbK.append(e5.h(p6.b.i(" (", "Android " + Build.VERSION.RELEASE, ";", n.o(), ";"), context.getResources().getConfiguration().locale.toString(), ";;", n.q(context), ")(sdk android)"));
        settings.setUserAgentString(sbK.toString());
        WebSettings settings2 = this.f137684e.getSettings();
        settings2.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings2.setSupportMultipleWindows(true);
        settings2.setUseWideViewPort(true);
        settings2.setAppCacheMaxSize(CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        settings2.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings2.setAllowFileAccess(false);
        settings2.setTextSize(WebSettings.TextSize.NORMAL);
        settings2.setAllowFileAccessFromFileURLs(false);
        settings2.setAllowUniversalAccessFromFileURLs(false);
        settings2.setAppCacheEnabled(true);
        settings2.setJavaScriptEnabled(true);
        settings2.setSavePassword(false);
        settings2.setJavaScriptCanOpenWindowsAutomatically(true);
        settings2.setCacheMode(1);
        settings2.setDomStorageEnabled(true);
        settings2.setAllowContentAccess(false);
        this.f137684e.setVerticalScrollbarOverlay(true);
        this.f137684e.setDownloadListener(new b(this, context));
        try {
            try {
                this.f137684e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f137684e.removeJavascriptInterface("accessibility");
                this.f137684e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.f137684e.getClass().getMethod("removeJavascriptInterface", null);
            if (method != null) {
                method.invoke(this.f137684e, "searchBoxJavaBridge_");
                method.invoke(this.f137684e, "accessibility");
                method.invoke(this.f137684e, "accessibilityTraversal");
            }
        }
        WebView webView3 = this.f137684e;
        int i14 = ph.e.f137653c;
        if (webView3 != null) {
            try {
                webView3.resumeTimers();
            } catch (Throwable unused3) {
            }
        }
        addView(this.f137684e, new LinearLayout.LayoutParams(-1, -1));
    }

    public ImageView getBackButton() {
        return this.f137680a;
    }

    public ProgressBar getProgressbar() {
        return this.f137683d;
    }

    public ImageView getRefreshButton() {
        return this.f137682c;
    }

    public TextView getTitle() {
        return this.f137681b;
    }

    public String getUrl() {
        return this.f137684e.getUrl();
    }

    public WebView getWebView() {
        return this.f137684e;
    }

    public void setChromeProxy(f fVar) {
        this.f137686g = fVar;
        WebView webView = this.f137684e;
        if (fVar == null) {
            webView.setWebChromeClient(null);
        } else {
            webView.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f137687h = gVar;
        WebView webView = this.f137684e;
        if (gVar == null) {
            webView.setWebViewClient(null);
        } else {
            webView.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f137688i = hVar;
    }

    public k(Context context, lh.a aVar, e eVar) {
        this(context, null, aVar, eVar);
    }
}
