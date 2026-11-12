package ph;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import com.google.firebase.perf.FirebasePerformance;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import nh.n;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONException;
import org.json.JSONObject;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public class j extends e implements k.f, k.g, k.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f137666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f137667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f137668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lh.a f137669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f137670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f137671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f137672j;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f137673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f137674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f137675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f137676d = false;

        public b(k kVar, String str, String str2, JSONObject jSONObject) {
            this.f137673a = new WeakReference<>(kVar);
            this.f137674b = str;
            this.f137675c = str2;
        }

        public final void a(JSONObject jSONObject) {
            if (this.f137676d) {
                return;
            }
            WeakReference<k> weakReference = this.f137673a;
            k kVar = weakReference == null ? null : weakReference.get();
            if (kVar == null) {
                return;
            }
            this.f137676d = true;
            String str = this.f137675c;
            String strReplace = TextUtils.isEmpty(str) ? "" : str.replace("'", "");
            String string = jSONObject.toString();
            kVar.b(e0.g("javascript:window.AlipayJSBridge.callBackFromNativeFunc('", strReplace, "','", TextUtils.isEmpty(string) ? "" : string.replace("'", ""), "');"));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f137677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f137678b;

        public c(b bVar, String str) {
            this.f137677a = bVar;
            this.f137678b = str;
        }

        public final void a(boolean z14, JSONObject jSONObject, String str) {
            try {
                this.f137677a.a(new JSONObject().put("success", z14).put("random", this.f137678b).put("code", jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public j(Activity activity, lh.a aVar, String str) {
        super(activity, str);
        this.f137666d = true;
        this.f137667e = FirebasePerformance.HttpMethod.GET;
        this.f137668f = false;
        this.f137671i = null;
        this.f137672j = new l();
        this.f137669g = aVar;
        synchronized (this) {
            try {
                k kVar = new k(this.f137654a, aVar, new k.e(!a(), true ^ a()));
                this.f137671i = kVar;
                kVar.setChromeProxy(this);
                this.f137671i.setWebClientProxy(this);
                this.f137671i.setWebEventProxy(this);
                addView(this.f137671i);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void b(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            k kVar = this.f137671i;
            if (kVar == null) {
                return;
            }
            try {
                jSONObject = new JSONObject(str3);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            b bVar = new b(kVar, str, str2, jSONObject);
            Context context = kVar.getContext();
            try {
                String str4 = bVar.f137674b;
                switch (str4.hashCode()) {
                    case -1785164386:
                        if (str4.equals("canUseTaoLogin")) {
                            String url = kVar.getUrl();
                            if (n.i(url, this.f137669g)) {
                                JSONObject jSONObject2 = new JSONObject();
                                boolean zJ = n.j(this.f137669g, context, Collections.singletonList(new ah.a.b("com.taobao.taobao", 0, "")), false);
                                jSONObject2.put("enabled", zJ);
                                wg.a.c(this.f137669g, "biz", "TbChk", String.valueOf(zJ));
                                bVar.a(jSONObject2);
                            } else {
                                wg.a.g(this.f137669g, "biz", "jsUrlErr", url);
                            }
                        }
                        return;
                    case -552487705:
                        if (str4.equals("taoLogin")) {
                            String url2 = kVar.getUrl();
                            if (n.i(url2, this.f137669g)) {
                                String strOptString = jSONObject.optString("random");
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("options");
                                if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                                    String strOptString3 = jSONObjectOptJSONObject.optString("action");
                                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                        lh.a aVar = this.f137669g;
                                        Activity activity = (Activity) context;
                                        c cVar = new c(bVar, strOptString);
                                        try {
                                            wg.a.b("TbStart", aVar);
                                            activity.startActivityForResult(new Intent(strOptString3, Uri.parse(strOptString2)), 1010);
                                            ug.d.f170564a = cVar;
                                        } catch (Throwable th3) {
                                            cVar.a(false, null, "UNKNOWN_ERROR");
                                            wg.a.d(aVar, "biz", "TbActFail", th3);
                                        }
                                    }
                                }
                            } else {
                                wg.a.g(this.f137669g, "biz", "jsUrlErr", url2);
                            }
                            break;
                        }
                        return;
                    case 3015911:
                        if (str4.equals("back")) {
                            i();
                        }
                        return;
                    case 3127582:
                        if (str4.equals("exit")) {
                            ug.b.f170552b = jSONObject.optString("result", null);
                            c(jSONObject.optBoolean("success", false));
                        }
                        return;
                    case 110371416:
                        if (str4.equals("title") && jSONObject.has("title")) {
                            kVar.getTitle().setText(jSONObject.optString("title", ""));
                        }
                        return;
                    case 1085444827:
                        if (str4.equals("refresh")) {
                            kVar.getWebView().reload();
                        }
                        return;
                    case 1703426986:
                        if (str4.equals("pushWindow")) {
                            f(jSONObject.optString("url"), jSONObject.optString("title", ""));
                        }
                        return;
                    case 1906413305:
                        if (str4.equals("backButton")) {
                            kVar.getBackButton().setVisibility(jSONObject.optBoolean("show", true) ? 0 : 4);
                        }
                        return;
                    case 1947723784:
                        if (str4.equals("sdkInfo")) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("sdk_version", "15.8.30");
                            jSONObject3.put("app_name", this.f137669g.f112377b);
                            jSONObject3.put("app_version", this.f137669g.f112376a);
                            bVar.a(jSONObject3);
                        }
                        return;
                    case 2033767917:
                        if (str4.equals("refreshButton")) {
                            kVar.getRefreshButton().setVisibility(jSONObject.optBoolean("show", true) ? 0 : 4);
                        }
                        return;
                    default:
                        return;
                }
            } catch (Throwable th4) {
                wg.a.e(this.f137669g, "jInfoErr", th4, str);
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized void c(boolean z14) {
        ug.b.f170551a = z14;
        this.f137654a.finish();
    }

    public final synchronized void d() {
        try {
            Activity activity = this.f137654a;
            if (activity == null) {
                return;
            }
            if (!a()) {
                if (!this.f137668f) {
                    h();
                }
                return;
            }
            k kVar = this.f137671i;
            if (kVar != null && kVar.getWebView() != null) {
                if (!kVar.getWebView().canGoBack()) {
                    ug.b.f170552b = ug.b.a();
                    activity.finish();
                } else if (this.f137670h) {
                    ug.c cVarA = ug.c.a(ug.c.NETWORK_ERROR.f170562a);
                    ug.b.f170552b = ug.b.b(cVarA.f170562a, cVarA.f170563b, "");
                    activity.finish();
                }
                return;
            }
            activity.finish();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void e(String str) {
        try {
            HashMap mapM = n.m(str, this.f137669g);
            if (str.startsWith("callNativeFunc")) {
                b((String) mapM.get("func"), (String) mapM.get("cbId"), (String) mapM.get("data"));
            } else if (str.startsWith("onBack")) {
                i();
            } else if (str.startsWith("setTitle") && mapM.containsKey("title")) {
                this.f137671i.getTitle().setText((CharSequence) mapM.get("title"));
            } else if (str.startsWith("onRefresh")) {
                this.f137671i.getWebView().reload();
            } else if (str.startsWith("showBackButton") && mapM.containsKey("bshow")) {
                this.f137671i.getBackButton().setVisibility(TextUtils.equals(BooleanUtils.TRUE, (CharSequence) mapM.get("bshow")) ? 0 : 4);
            } else if (str.startsWith("onExit")) {
                ug.b.f170552b = (String) mapM.get("result");
                c(TextUtils.equals(BooleanUtils.TRUE, (CharSequence) mapM.get("bsucc")));
            } else if (str.startsWith("onLoadJs")) {
                this.f137671i.b("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void f(String str, String str2) {
        k kVar = this.f137671i;
        try {
            k kVar2 = new k(this.f137654a, this.f137669g, new k.e(!a(), !a()));
            this.f137671i = kVar2;
            kVar2.setChromeProxy(this);
            this.f137671i.setWebClientProxy(this);
            this.f137671i.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f137671i.getTitle().setText(str2);
            }
            this.f137668f = true;
            this.f137672j.f137697a.push(kVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new h(this, kVar, str));
            this.f137671i.setAnimation(translateAnimation);
            addView(this.f137671i);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void g() {
        try {
            if (this.f137672j.f137697a.isEmpty()) {
                this.f137654a.finish();
            } else {
                this.f137668f = true;
                k kVar = this.f137671i;
                this.f137671i = this.f137672j.f137697a.pop();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new g(this, kVar));
                kVar.setAnimation(translateAnimation);
                removeView(kVar);
                addView(this.f137671i);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void h() {
        try {
            Activity activity = this.f137654a;
            k kVar = this.f137671i;
            if (activity != null && kVar != null) {
                if (this.f137666d) {
                    activity.finish();
                } else {
                    kVar.b("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void i() {
        try {
            WebView webView = this.f137671i.getWebView();
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                l lVar = this.f137672j;
                if (lVar == null || lVar.f137697a.isEmpty()) {
                    c(false);
                } else {
                    g();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.view.ViewGroup
    public final synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f137668f ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public static abstract class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
