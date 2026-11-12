package com.huami.discovery.bridge.jsbridge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.huami.discovery.bridge.jsbridge.view.ObservableWebView;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class JsBridgeWebView extends ObservableWebView implements WebViewJavascriptBridge {
    public static final String toLoadJs = "jsbridge/HM_JsBridge.js";
    private final String b;
    public Map<String, JsCallBackFunction> c;
    public Map<String, JsBridgeHandler> d;
    public JsBridgeHandler e;
    private List<JsMessage> f;
    private long g;

    public class a implements JsCallBackFunction {

        /* JADX INFO: renamed from: com.huami.discovery.bridge.jsbridge.JsBridgeWebView$a$a, reason: collision with other inner class name */
        public class C0374a implements JsCallBackFunction {
            public final /* synthetic */ String a;

            public C0374a(String str) {
                this.a = str;
            }

            @Override // com.huami.discovery.bridge.jsbridge.JsCallBackFunction
            public void onCallBack(String str) {
                JsMessage jsMessage = new JsMessage();
                jsMessage.h(this.a);
                jsMessage.g(str);
                JsBridgeWebView.this.h(jsMessage);
            }
        }

        public class b implements JsCallBackFunction {
            public b() {
            }

            @Override // com.huami.discovery.bridge.jsbridge.JsCallBackFunction
            public void onCallBack(String str) {
            }
        }

        public a() {
        }

        @Override // com.huami.discovery.bridge.jsbridge.JsCallBackFunction
        public void onCallBack(String str) {
            HMLog.i("BridgeWebView", "flushMessageQueue callback data = " + str, new Object[0]);
            try {
                List<JsMessage> listI = JsMessage.i(str);
                if (listI == null || listI.size() == 0) {
                    return;
                }
                for (int i = 0; i < listI.size(); i++) {
                    JsMessage jsMessage = listI.get(i);
                    String strD = jsMessage.d();
                    if (TextUtils.isEmpty(strD)) {
                        String strA = jsMessage.a();
                        JsCallBackFunction c0374a = !TextUtils.isEmpty(strA) ? new C0374a(strA) : new b();
                        JsBridgeHandler jsBridgeHandler = !TextUtils.isEmpty(jsMessage.b()) ? JsBridgeWebView.this.d.get(jsMessage.b()) : JsBridgeWebView.this.e;
                        if (jsBridgeHandler != null) {
                            jsBridgeHandler.handler(jsMessage.getData(), c0374a);
                        }
                    } else {
                        JsBridgeWebView.this.c.get(strD).onCallBack(jsMessage.c());
                        JsBridgeWebView.this.c.remove(strD);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public JsBridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "BridgeWebView";
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new JsBridgeDefaultHandler();
        this.f = new ArrayList();
        this.g = 0L;
        g();
    }

    private void d(String str, String str2, JsCallBackFunction jsCallBackFunction) {
        JsMessage jsMessage = new JsMessage();
        if (!TextUtils.isEmpty(str2)) {
            jsMessage.setData(str2);
        }
        if (jsCallBackFunction != null) {
            StringBuilder sb = new StringBuilder();
            long j = this.g + 1;
            this.g = j;
            sb.append(j);
            sb.append("_");
            sb.append(SystemClock.currentThreadTimeMillis());
            String str3 = String.format("JAVA_CB_%s", sb.toString());
            this.c.put(str3, jsCallBackFunction);
            jsMessage.e(str3);
        }
        if (!TextUtils.isEmpty(str)) {
            jsMessage.f(str);
        }
        h(jsMessage);
    }

    private void g() {
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(JsMessage jsMessage) {
        List<JsMessage> list = this.f;
        if (list != null) {
            list.add(jsMessage);
        } else {
            c(jsMessage);
        }
    }

    public void c(JsMessage jsMessage) {
        String str = String.format("javascript:HM_JsBridge._handleMessageFromNative('%s');", jsMessage.toJson().replaceAll("(\\\\)([^utrn])", "\\\\\\\\$1$2").replaceAll("(?<=[^\\\\])(\")", "\\\\\""));
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            loadUrl(str);
        }
    }

    public void callHandler(String str, String str2, JsCallBackFunction jsCallBackFunction) {
        d(str, str2, jsCallBackFunction);
    }

    public void clearHandlers() {
        JsBridgeHandler jsBridgeHandler = this.d.get(JsBridgeNativeAPI.FUNC_VERIFY_JSAPI);
        this.d.clear();
        this.d.put(JsBridgeNativeAPI.FUNC_VERIFY_JSAPI, jsBridgeHandler);
    }

    public void e() {
        HMLog.i("BridgeWebView", "flushMessageQueue", new Object[0]);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            loadUrl("javascript:HM_JsBridge._fetchQueue();", new a());
        }
    }

    public void f(String str) {
        String strC = JsBridgeUtil.c(str);
        HMLog.i("BridgeWebView", "handlerReturnData functionName=" + strC, new Object[0]);
        JsCallBackFunction jsCallBackFunction = this.c.get(strC);
        String strB = JsBridgeUtil.b(str);
        HMLog.i("BridgeWebView", "handlerReturnData data=" + strB, new Object[0]);
        if (jsCallBackFunction != null) {
            jsCallBackFunction.onCallBack(strB);
            this.c.remove(strC);
        }
    }

    public List<JsMessage> getStartupMessage() {
        return this.f;
    }

    public void loadUrl(String str, JsCallBackFunction jsCallBackFunction) {
        loadUrl(str);
        HMLog.i("BridgeWebView", "js-loadUrl==" + JsBridgeUtil.e(str), new Object[0]);
        this.c.put(JsBridgeUtil.e(str), jsCallBackFunction);
    }

    public void registerHandler(String str, JsBridgeHandler jsBridgeHandler) {
        if (jsBridgeHandler != null) {
            this.d.put(str, jsBridgeHandler);
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.WebViewJavascriptBridge
    public void send(String str) {
        send(str, null);
    }

    public void setDefaultHandler(JsBridgeHandler jsBridgeHandler) {
        this.e = jsBridgeHandler;
    }

    public void setStartupMessage(List<JsMessage> list) {
        this.f = list;
    }

    @Override // com.huami.discovery.bridge.jsbridge.WebViewJavascriptBridge
    public void send(String str, JsCallBackFunction jsCallBackFunction) {
        d(null, str, jsCallBackFunction);
    }

    public JsBridgeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = "BridgeWebView";
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new JsBridgeDefaultHandler();
        this.f = new ArrayList();
        this.g = 0L;
        g();
    }

    public JsBridgeWebView(Context context) {
        super(context);
        this.b = "BridgeWebView";
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new JsBridgeDefaultHandler();
        this.f = new ArrayList();
        this.g = 0L;
        g();
    }
}
