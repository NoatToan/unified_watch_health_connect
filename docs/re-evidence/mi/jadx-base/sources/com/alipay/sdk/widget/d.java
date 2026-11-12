package com.alipay.sdk.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import com.alipay.sdk.util.k;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.onetrack.OneTrack;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends c implements e.b, e.c, e.d {
    public boolean c;
    public String d;
    public boolean e;
    public final com.alipay.sdk.sys.a f;
    public boolean g;
    public e h;
    public f i;

    public abstract class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public d(Activity activity, com.alipay.sdk.sys.a aVar, String str) {
        super(activity, str);
        this.c = true;
        this.d = "GET";
        this.e = false;
        this.h = null;
        this.i = new f();
        this.f = aVar;
        y();
    }

    public final synchronized void A() {
        try {
            WebView webView = this.h.getWebView();
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                f fVar = this.i;
                if (fVar == null || fVar.c()) {
                    s(false);
                } else {
                    B();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean B() {
        try {
            if (this.i.c()) {
                this.f5899a.finish();
            } else {
                this.e = true;
                final e eVar = this.h;
                this.h = this.i.a();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new a() { // from class: com.alipay.sdk.widget.d.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.alipay.sdk.widget.d.a, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        eVar.c();
                        d.this.e = false;
                    }
                });
                eVar.setAnimation(translateAnimation);
                removeView(eVar);
                addView(this.h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return true;
    }

    @Override // com.alipay.sdk.widget.e.c
    public synchronized boolean a(e eVar, int i, String str, String str2) {
        this.g = true;
        com.alipay.sdk.app.statistic.a.c(this.f, OneTrack.Param.NET, "SSLError", "onReceivedError:" + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.widget.e.b
    public synchronized boolean b(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                this.f5899a.runOnUiThread(new Runnable() { // from class: com.alipay.sdk.widget.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.f5899a.finish();
                    }
                });
            }
            jsPromptResult.cancel();
        } catch (Throwable th) {
            throw th;
        }
        return true;
    }

    @Override // com.alipay.sdk.widget.e.c
    public synchronized boolean c(e eVar, String str) {
        com.alipay.sdk.app.statistic.a.h(this.f, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + k.D(str));
        return false;
    }

    @Override // com.alipay.sdk.widget.e.c
    public synchronized boolean d(e eVar, final SslErrorHandler sslErrorHandler, SslError sslError) {
        final Activity activity = this.f5899a;
        if (activity == null) {
            return true;
        }
        com.alipay.sdk.app.statistic.a.c(this.f, OneTrack.Param.NET, "SSLError", "2-" + sslError);
        activity.runOnUiThread(new Runnable() { // from class: com.alipay.sdk.widget.d.4
            @Override // java.lang.Runnable
            public void run() {
                b.b(activity, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new DialogInterface.OnClickListener() { // from class: com.alipay.sdk.widget.d.4.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        sslErrorHandler.cancel();
                        com.alipay.sdk.app.statistic.a.c(d.this.f, OneTrack.Param.NET, "SSLDenied", "2");
                        com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.f());
                        activity.finish();
                    }
                }, null, null);
            }
        });
        return true;
    }

    @Override // com.alipay.sdk.widget.e.c
    public synchronized boolean e(e eVar, String str) {
        com.alipay.sdk.app.statistic.a.h(this.f, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + k.D(str));
        eVar.f("javascript:window.prompt('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.widget.e.b
    public synchronized void f(e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.h.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.widget.e.c
    public synchronized boolean g(e eVar, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Activity activity = this.f5899a;
            if (activity == null) {
                return true;
            }
            if (k.o(this.f, str, activity)) {
                return true;
            }
            if (str.startsWith("alipayjsbridge://")) {
                v(str.substring(17));
            } else if (TextUtils.equals(str, "sdklite://h5quit")) {
                s(false);
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                this.h.f(str);
            } else {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    activity.startActivity(intent);
                } catch (Throwable th) {
                    com.alipay.sdk.app.statistic.a.f(this.f, "biz", th);
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.alipay.sdk.widget.e.d
    public synchronized void h(e eVar) {
        z();
    }

    @Override // com.alipay.sdk.widget.e.d
    public synchronized void i(e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.widget.c
    public synchronized void j() {
        this.h.c();
        this.i.d();
    }

    @Override // com.alipay.sdk.widget.c
    public synchronized boolean m() {
        try {
            Activity activity = this.f5899a;
            if (activity == null) {
                return true;
            }
            if (!n()) {
                if (!this.e) {
                    z();
                }
                return true;
            }
            e eVar = this.h;
            if (eVar != null && eVar.getWebView() != null) {
                if (!eVar.getWebView().canGoBack()) {
                    com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.f());
                    activity.finish();
                } else if (x()) {
                    com.alipay.sdk.app.c cVarB = com.alipay.sdk.app.c.b(com.alipay.sdk.app.c.NETWORK_ERROR.a());
                    com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.b(cVarB.a(), cVarB.b(), ""));
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.e ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void p(String str) {
        try {
            if ("POST".equals(this.d)) {
                this.h.g(str, null);
            } else {
                this.h.f(str);
            }
            c.k(this.h.getWebView());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void q(String str, String str2, String str3) {
        try {
            e eVar = this.h;
            if (eVar == null) {
                return;
            }
            JSONObject jSONObjectY = k.y(str3);
            if ("title".equals(str) && jSONObjectY.has("title")) {
                eVar.getTitle().setText(jSONObjectY.optString("title", ""));
            } else if ("refresh".equals(str)) {
                eVar.getWebView().reload();
            } else if ("back".equals(str)) {
                A();
            } else {
                int i = 0;
                if (LifecycleConstantKt.ACTION_EXIT.equals(str)) {
                    com.alipay.sdk.app.b.c(jSONObjectY.optString("result", null));
                    s(jSONObjectY.optBoolean("success", false));
                } else if ("backButton".equals(str)) {
                    boolean zOptBoolean = jSONObjectY.optBoolean("show", true);
                    ImageView backButton = eVar.getBackButton();
                    if (!zOptBoolean) {
                        i = 4;
                    }
                    backButton.setVisibility(i);
                } else if ("refreshButton".equals(str)) {
                    boolean zOptBoolean2 = jSONObjectY.optBoolean("show", true);
                    ImageView refreshButton = eVar.getRefreshButton();
                    if (!zOptBoolean2) {
                        i = 4;
                    }
                    refreshButton.setVisibility(i);
                } else if ("pushWindow".equals(str) && jSONObjectY.optString("url", null) != null) {
                    w(jSONObjectY.optString("url"), jSONObjectY.optString("title", ""));
                } else if ("sdkInfo".equals(str)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("sdk_version", "15.7.5");
                        jSONObject.put(FeedbackConstants.KEY_APP_NAME, this.f.g());
                        jSONObject.put("app_version", this.f.j());
                    } catch (Throwable th) {
                        com.alipay.sdk.app.statistic.a.d(this.f, "biz", "jInfoErr", th);
                    }
                    eVar.f(String.format("window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", str2, jSONObject.toString().replace("'", "")));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void r(String str, String str2, boolean z) {
        this.d = str2;
        this.h.getTitle().setText(str);
        this.c = z;
    }

    public final synchronized void s(boolean z) {
        com.alipay.sdk.app.b.d(z);
        this.f5899a.finish();
    }

    public final synchronized void v(String str) {
        try {
            Map<String, String> mapK = k.k(this.f, str);
            if (str.startsWith("callNativeFunc")) {
                q(mapK.get("func"), mapK.get("cbId"), mapK.get("data"));
            } else if (str.startsWith("onBack")) {
                A();
            } else if (str.startsWith("setTitle") && mapK.containsKey("title")) {
                this.h.getTitle().setText(mapK.get("title"));
            } else if (str.startsWith("onRefresh")) {
                this.h.getWebView().reload();
            } else if (str.startsWith("showBackButton") && mapK.containsKey("bshow")) {
                this.h.getBackButton().setVisibility(TextUtils.equals("true", mapK.get("bshow")) ? 0 : 4);
            } else if (str.startsWith("onExit")) {
                com.alipay.sdk.app.b.c(mapK.get("result"));
                s(TextUtils.equals("true", mapK.get("bsucc")));
            } else if (str.startsWith("onLoadJs")) {
                this.h.f("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean w(final String str, String str2) {
        final e eVar = this.h;
        try {
            e eVar2 = new e(this.f5899a, this.f, new e.a(!n(), !n()));
            this.h = eVar2;
            eVar2.setChromeProxy(this);
            this.h.setWebClientProxy(this);
            this.h.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.h.getTitle().setText(str2);
            }
            this.e = true;
            this.i.b(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new a() { // from class: com.alipay.sdk.widget.d.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.alipay.sdk.widget.d.a, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    d.this.removeView(eVar);
                    d.this.h.f(str);
                    d.this.e = false;
                }
            });
            this.h.setAnimation(translateAnimation);
            addView(this.h);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    public boolean x() {
        return this.g;
    }

    public final synchronized boolean y() {
        try {
            e eVar = new e(this.f5899a, this.f, new e.a(!n(), !n()));
            this.h = eVar;
            eVar.setChromeProxy(this);
            this.h.setWebClientProxy(this);
            this.h.setWebEventProxy(this);
            addView(this.h);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    public final synchronized void z() {
        try {
            Activity activity = this.f5899a;
            e eVar = this.h;
            if (activity != null && eVar != null) {
                if (this.c) {
                    activity.finish();
                } else {
                    eVar.f("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
