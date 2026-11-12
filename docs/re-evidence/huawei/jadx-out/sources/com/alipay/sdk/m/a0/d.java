package com.alipay.sdk.m.a0;

import android.app.Activity;
import android.content.Context;
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
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.braintreepayments.api.PaymentMethod;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.ke;
import defpackage.kf;
import defpackage.mp;
import defpackage.mu;
import defpackage.mx;
import defpackage.np;
import defpackage.on;
import defpackage.op;
import defpackage.oq;
import defpackage.os;
import defpackage.ox;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d extends com.alipay.sdk.m.a0.c implements com.alipay.sdk.m.a0.e.f, com.alipay.sdk.m.a0.e.g, com.alipay.sdk.m.a0.e.h {
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public final on i;
    public boolean j;
    public ke k;
    public com.alipay.sdk.m.a0.e m;

    public class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f2087c;
        public final /* synthetic */ com.alipay.sdk.m.a0.e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.alipay.sdk.m.a0.e eVar, String str) {
            super(null);
            this.d = eVar;
            this.f2087c = str;
        }

        @Override // com.alipay.sdk.m.a0.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.d);
            d.this.m.e(this.f2087c);
            d.this.j = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2085a.finish();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f2090c;
        public final /* synthetic */ Activity d;

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                c.this.f2090c.cancel();
                mu.e(d.this.i, "net", "SSLDenied", "2");
                mp.e(mp.d());
                c.this.d.finish();
            }
        }

        public c(Activity activity, SslErrorHandler sslErrorHandler) {
            this.d = activity;
            this.f2090c = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            kf.c(this.d, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new b(), null, null);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.d$d, reason: collision with other inner class name */
    public class C0016d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.a0.e f2091c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0016d(com.alipay.sdk.m.a0.e eVar) {
            super(null);
            this.f2091c = eVar;
        }

        @Override // com.alipay.sdk.m.a0.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2091c.b();
            d.this.j = false;
        }
    }

    public static abstract class e implements Animation.AnimationListener {
        public e() {
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

        public /* synthetic */ e(b bVar) {
            this();
        }
    }

    public static class h implements com.alipay.sdk.m.l.d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f2095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2096c;

        public h(f fVar, String str) {
            this.f2095b = fVar;
            this.f2096c = str;
        }

        @Override // com.alipay.sdk.m.l.d.a
        public void a(boolean z, JSONObject jSONObject, String str) {
            try {
                this.f2095b.c(new JSONObject().put("success", z).put("random", this.f2096c).put("code", jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, on onVar, String str) {
        super(activity, str);
        this.e = true;
        this.f = "GET";
        this.j = false;
        this.m = null;
        this.k = new ke();
        this.i = onVar;
        j();
    }

    @Override // com.alipay.sdk.m.a0.c
    public void c() {
        synchronized (this) {
            this.m.b();
            this.k.c();
        }
    }

    public final void d() {
        synchronized (this) {
            Activity activity = this.f2085a;
            com.alipay.sdk.m.a0.e eVar = this.m;
            if (activity != null && eVar != null) {
                if (this.e) {
                    activity.finish();
                } else {
                    eVar.e("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
                }
            }
        }
    }

    public final boolean e() {
        synchronized (this) {
            if (this.k.d()) {
                this.f2085a.finish();
            } else {
                this.j = true;
                com.alipay.sdk.m.a0.e eVar = this.m;
                this.m = this.k.b();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new C0016d(eVar));
                eVar.setAnimation(translateAnimation);
                removeView(eVar);
                addView(this.m);
            }
        }
        return true;
    }

    public final void f() {
        mu.b(this.i, "biz", "webViewLoadStart");
        if (!mx.c().e((on) null)) {
            mu.b(this.i, "biz", "webLoad|onlineUrl");
            return;
        }
        if (!np.e().b()) {
            mu.b(this.i, "biz", "webLoad|localUrl");
            return;
        }
        mu.b(this.i, "biz", "webLoad|local|" + np.e().f());
    }

    public boolean g() {
        return this.h;
    }

    public final void h() {
        synchronized (this) {
            WebView webView = this.m.getWebView();
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                ke keVar = this.k;
                if (keVar == null || keVar.d()) {
                    e(false);
                } else {
                    e();
                }
            }
        }
    }

    public final void i() {
        com.alipay.sdk.m.a0.e eVar = this.m;
        if (eVar != null) {
            WebView webView = eVar.getWebView();
            if (TextUtils.isEmpty(this.g)) {
                webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                return;
            }
            String strA = op.a(this.g);
            if (TextUtils.isEmpty(strA)) {
                mu.e(this.i, "biz", "injectJsApi", "escapeCashierBizDataError");
            } else {
                webView.evaluateJavascript("(function() {window.alipayjsbridgeCashierMainData=" + ("'" + strA.substring(1, strA.length() - 1) + "'") + ";})();", null);
            }
            webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    public final boolean j() {
        synchronized (this) {
            try {
                com.alipay.sdk.m.a0.e eVar = new com.alipay.sdk.m.a0.e(this.f2085a, this.i, new com.alipay.sdk.m.a0.e.C0017e(!a(), !a()));
                this.m = eVar;
                eVar.setChromeProxy(this);
                this.m.setWebClientProxy(this);
                this.m.setWebEventProxy(this);
                addView(this.m);
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        synchronized (this) {
            zOnInterceptTouchEvent = this.j ? true : super.onInterceptTouchEvent(motionEvent);
        }
        return zOnInterceptTouchEvent;
    }

    public void setCashierBizData(String str) {
        synchronized (this) {
            this.g = str;
        }
    }

    @Override // com.alipay.sdk.m.a0.c
    public boolean b() {
        synchronized (this) {
            Activity activity = this.f2085a;
            if (activity == null) {
                return true;
            }
            if (!a()) {
                if (!this.j) {
                    d();
                }
                return true;
            }
            com.alipay.sdk.m.a0.e eVar = this.m;
            if (eVar != null && eVar.getWebView() != null) {
                if (!eVar.getWebView().canGoBack()) {
                    mp.e(mp.d());
                    activity.finish();
                } else if (g()) {
                    com.alipay.sdk.m.l.c cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.NETWORK_ERROR.b());
                    mp.e(mp.d(cVarA.b(), cVarA.a(), ""));
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        }
    }

    public void a(String str, String str2, boolean z) {
        synchronized (this) {
            this.f = str2;
            this.m.getTitle().setText(str);
            this.e = z;
        }
    }

    @Override // com.alipay.sdk.m.a0.e.g
    public boolean c(com.alipay.sdk.m.a0.e eVar, String str) {
        synchronized (this) {
            mu.d(this.i, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + ox.i(str));
            if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
                i();
            }
        }
        return false;
    }

    public final void e(boolean z) {
        synchronized (this) {
            mp.a(z);
            this.f2085a.finish();
        }
    }

    @Override // com.alipay.sdk.m.a0.c
    public void a(String str) {
        synchronized (this) {
            f();
            if ("POST".equals(this.f)) {
                this.m.d(str, null);
            } else {
                this.m.e(str);
            }
            com.alipay.sdk.m.a0.c.a(this.m.getWebView());
        }
    }

    @Override // com.alipay.sdk.m.a0.e.f
    public boolean a(com.alipay.sdk.m.a0.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        synchronized (this) {
            if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                this.f2085a.runOnUiThread(new b());
            }
            jsPromptResult.cancel();
        }
        return true;
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2093b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JSONObject f2094c;
        public final String d;
        public final WeakReference<com.alipay.sdk.m.a0.e> e;

        public f(com.alipay.sdk.m.a0.e eVar, String str, String str2, JSONObject jSONObject) {
            this.e = new WeakReference<>(eVar);
            this.d = str;
            this.f2092a = str2;
            this.f2094c = jSONObject;
        }

        public void c(JSONObject jSONObject) {
            com.alipay.sdk.m.a0.e eVar;
            if (this.f2093b || (eVar = (com.alipay.sdk.m.a0.e) ox.e(this.e)) == null) {
                return;
            }
            this.f2093b = true;
            eVar.e(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", d(this.f2092a), d(jSONObject.toString())));
        }

        public static String d(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }
    }

    @Override // com.alipay.sdk.m.a0.e.g
    public boolean d(com.alipay.sdk.m.a0.e eVar, String str) {
        synchronized (this) {
            mu.d(this.i, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + ox.i(str));
            i();
            eVar.getRefreshButton().setVisibility(0);
        }
        return true;
    }

    @Override // com.alipay.sdk.m.a0.e.f
    public void a(com.alipay.sdk.m.a0.e eVar, String str) {
        synchronized (this) {
            if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
                this.m.getTitle().setText(str);
            }
        }
    }

    @Override // com.alipay.sdk.m.a0.e.g
    public WebResourceResponse a(WebView webView, String str) {
        if (!np.e().b()) {
            return null;
        }
        WebResourceResponse webResourceResponseB = os.b(np.e().c(str));
        if (webResourceResponseB != null) {
            oq.b("mspl", "shouldInterceptRequest return not null, url=" + str);
        }
        return webResourceResponseB;
    }

    @Override // com.alipay.sdk.m.a0.e.g
    public boolean a(com.alipay.sdk.m.a0.e eVar, int i, String str, String str2) {
        synchronized (this) {
            this.h = true;
            mu.e(this.i, "net", "webError", "onReceivedError:" + i + "|" + str2);
            eVar.getRefreshButton().setVisibility(0);
        }
        return false;
    }

    @Override // com.alipay.sdk.m.a0.e.g
    public boolean a(com.alipay.sdk.m.a0.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        synchronized (this) {
            Activity activity = this.f2085a;
            if (activity == null) {
                return true;
            }
            mu.e(this.i, "net", "SSLError", "2-" + sslError);
            activity.runOnUiThread(new c(activity, sslErrorHandler));
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    public final void b(String str, String str2, String str3) {
        synchronized (this) {
            com.alipay.sdk.m.a0.e eVar = this.m;
            if (eVar == null) {
                return;
            }
            JSONObject jSONObjectJ = ox.j(str3);
            f fVar = new f(eVar, str, str2, jSONObjectJ);
            Context context = eVar.getContext();
            try {
                switch (fVar.d) {
                    case "title":
                        if (jSONObjectJ.has("title")) {
                            eVar.getTitle().setText(jSONObjectJ.optString("title", ""));
                            break;
                        }
                        break;
                    case "refresh":
                        eVar.getWebView().reload();
                        break;
                    case "back":
                        h();
                        break;
                    case "exit":
                        mp.e(jSONObjectJ.optString("result", null));
                        e(jSONObjectJ.optBoolean("success", false));
                        break;
                    case "backButton":
                        eVar.getBackButton().setVisibility(jSONObjectJ.optBoolean(ParamConstants.CallbackMethod.ON_SHOW, true) ? 0 : 4);
                        break;
                    case "refreshButton":
                        eVar.getRefreshButton().setVisibility(jSONObjectJ.optBoolean(ParamConstants.CallbackMethod.ON_SHOW, true) ? 0 : 4);
                        break;
                    case "pushWindow":
                        b(jSONObjectJ.optString("url"), jSONObjectJ.optString("title", ""));
                        break;
                    case "sdkInfo":
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdk_version", "15.8.35");
                        jSONObject.put("app_name", this.i.b());
                        jSONObject.put("app_version", this.i.a());
                        fVar.c(jSONObject);
                        break;
                    case "canUseTaoLogin":
                        String url = eVar.getUrl();
                        if (!ox.e(this.i, url)) {
                            mu.e(this.i, "biz", "jsUrlErr", url);
                            break;
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            boolean zE = com.alipay.sdk.m.l.d.e(this.i, context);
                            jSONObject2.put("enabled", zE);
                            mu.d(this.i, "biz", "TbChk", String.valueOf(zE));
                            fVar.c(jSONObject2);
                            break;
                        }
                        break;
                    case "taoLogin":
                        String url2 = eVar.getUrl();
                        if (!ox.e(this.i, url2)) {
                            mu.e(this.i, "biz", "jsUrlErr", url2);
                            break;
                        } else {
                            String strOptString = jSONObjectJ.optString("random");
                            JSONObject jSONObjectOptJSONObject = jSONObjectJ.optJSONObject(PaymentMethod.OPTIONS_KEY);
                            if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("url");
                                String strOptString3 = jSONObjectOptJSONObject.optString("action");
                                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                    com.alipay.sdk.m.l.d.a(this.i, (Activity) context, 1010, strOptString2, strOptString3, new h(fVar, strOptString));
                                }
                            }
                            break;
                        }
                        break;
                    case "h5LifeCycle":
                        String strOptString4 = jSONObjectJ.optString("type");
                        mu.b(this.i, "biz", "h5LifeCycle|" + strOptString4);
                        break;
                }
            } catch (Throwable th) {
                mu.e(this.i, "biz", "jInfoErr", th, str);
            }
        }
    }

    public final boolean b(String str, String str2) {
        synchronized (this) {
            com.alipay.sdk.m.a0.e eVar = this.m;
            try {
                com.alipay.sdk.m.a0.e eVar2 = new com.alipay.sdk.m.a0.e(this.f2085a, this.i, new com.alipay.sdk.m.a0.e.C0017e(!a(), !a()));
                this.m = eVar2;
                eVar2.setChromeProxy(this);
                this.m.setWebClientProxy(this);
                this.m.setWebEventProxy(this);
                if (!TextUtils.isEmpty(str2)) {
                    this.m.getTitle().setText(str2);
                }
                this.j = true;
                this.k.e(eVar);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new a(eVar, str));
                this.m.setAnimation(translateAnimation);
                addView(this.m);
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    @Override // com.alipay.sdk.m.a0.e.g
    public boolean b(com.alipay.sdk.m.a0.e eVar, String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Activity activity = this.f2085a;
            if (activity == null) {
                return true;
            }
            if (ox.a(this.i, str, activity)) {
                return true;
            }
            if (str.startsWith("alipayjsbridge://")) {
                d(str.substring(17));
            } else if (TextUtils.equals(str, "sdklite://h5quit")) {
                e(false);
            } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.setData(Uri.parse(str));
                    activity.startActivity(intent);
                } catch (Throwable th) {
                    mu.c(this.i, "biz", th);
                }
            } else {
                this.m.e(str);
            }
            return true;
        }
    }

    public final void d(String str) {
        synchronized (this) {
            oq.c("mspl", "processJsBridge urlContent:" + str);
            Map<String, String> mapB = ox.b(this.i, str);
            if (str.startsWith("callNativeFunc")) {
                b(mapB.get("func"), mapB.get("cbId"), mapB.get("data"));
            } else if (str.startsWith("onBack")) {
                h();
            } else if (str.startsWith("setTitle") && mapB.containsKey("title")) {
                this.m.getTitle().setText(mapB.get("title"));
            } else if (str.startsWith("onRefresh")) {
                this.m.getWebView().reload();
            } else if (str.startsWith("showBackButton") && mapB.containsKey("bshow")) {
                this.m.getBackButton().setVisibility(TextUtils.equals("true", mapB.get("bshow")) ? 0 : 4);
            } else if (str.startsWith("onExit")) {
                mp.e(mapB.get("result"));
                e(TextUtils.equals("true", mapB.get("bsucc")));
            } else if (str.startsWith("onLoadJs")) {
                this.m.e("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        }
    }

    @Override // com.alipay.sdk.m.a0.e.h
    public void b(com.alipay.sdk.m.a0.e eVar) {
        synchronized (this) {
            eVar.getWebView().reload();
            eVar.getRefreshButton().setVisibility(4);
        }
    }

    @Override // com.alipay.sdk.m.a0.e.h
    public void a(com.alipay.sdk.m.a0.e eVar) {
        synchronized (this) {
            d();
        }
    }
}
