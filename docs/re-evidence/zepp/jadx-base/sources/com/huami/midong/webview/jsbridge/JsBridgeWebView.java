package com.huami.midong.webview.jsbridge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.huami.midong.webview.utils.JsBridgeUtil;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class JsBridgeWebView extends ObservableWebView implements WebViewJavascriptBridge {
    private final String TAG;
    private JsBridgeHandler defaultHandler;
    private Map<String, JsBridgeHandler> messageHandlers;
    private Map<String, JsCallBackFunction> responseCallbacks;
    private List<JsMessage> startupMessage;
    private long uniqueId;

    public JsBridgeWebView(Context context) {
        super(context);
        this.TAG = "JsBridgeWebView";
        this.responseCallbacks = new HashMap();
        this.messageHandlers = new HashMap();
        this.defaultHandler = new JsBridgeDefaultHandler();
        this.startupMessage = new ArrayList();
        this.uniqueId = 0L;
        init();
    }

    private void doSend(String str, String str2, JsCallBackFunction jsCallBackFunction) {
        JsMessage jsMessage = new JsMessage();
        if (!TextUtils.isEmpty(str2)) {
            jsMessage.setData(str2);
        }
        if (jsCallBackFunction != null) {
            StringBuilder sb = new StringBuilder();
            long j = this.uniqueId + 1;
            this.uniqueId = j;
            sb.append(j);
            sb.append("_");
            sb.append(SystemClock.currentThreadTimeMillis());
            String str3 = String.format("JAVA_CB_%s", sb.toString());
            this.responseCallbacks.put(str3, jsCallBackFunction);
            jsMessage.setCallbackId(str3);
        }
        if (!TextUtils.isEmpty(str)) {
            jsMessage.setHandlerName(str);
        }
        queueMessage(jsMessage);
    }

    private void init() {
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueMessage(JsMessage jsMessage) {
        List<JsMessage> list = this.startupMessage;
        if (list != null) {
            list.add(jsMessage);
        } else {
            dispatchMessage(jsMessage);
        }
    }

    public void callHandler(String str, String str2, JsCallBackFunction jsCallBackFunction) {
        doSend(str, str2, jsCallBackFunction);
    }

    public void clearHandlers() {
        this.messageHandlers.clear();
    }

    public void dispatchMessage(JsMessage jsMessage) {
        String str = String.format("javascript:HM_JsBridge._handleMessageFromNative('%s');", jsMessage.toJson().replaceAll("(\\\\)([^utrn])", "\\\\\\\\$1$2").replaceAll("(?<=[^\\\\])(\")", "\\\\\"").replace("'", "\\'"));
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Should call this in ui main thread");
        }
        loadUrl(str);
    }

    public void flushMessageQueue() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            loadUrl("javascript:HM_JsBridge._fetchQueue();", new JsCallBackFunction() { // from class: com.huami.midong.webview.jsbridge.JsBridgeWebView.1
                @Override // com.huami.midong.webview.jsbridge.JsCallBackFunction
                public void onCallBack(String str) {
                    try {
                        List<JsMessage> arrayList = JsMessage.toArrayList(str);
                        if (arrayList == null || arrayList.size() == 0) {
                            return;
                        }
                        for (int i = 0; i < arrayList.size(); i++) {
                            JsMessage jsMessage = arrayList.get(i);
                            String responseId = jsMessage.getResponseId();
                            if (TextUtils.isEmpty(responseId)) {
                                final String callbackId = jsMessage.getCallbackId();
                                JsCallBackFunction jsCallBackFunction = !TextUtils.isEmpty(callbackId) ? new JsCallBackFunction() { // from class: com.huami.midong.webview.jsbridge.JsBridgeWebView.1.1
                                    @Override // com.huami.midong.webview.jsbridge.JsCallBackFunction
                                    public void onCallBack(String str2) {
                                        Log.d("JsBridgeWebView", "=============data" + str2, new Object[0]);
                                        JsMessage jsMessage2 = new JsMessage();
                                        jsMessage2.setResponseId(callbackId);
                                        jsMessage2.setResponseData(str2);
                                        JsBridgeWebView.this.queueMessage(jsMessage2);
                                    }
                                } : new JsCallBackFunction() { // from class: com.huami.midong.webview.jsbridge.JsBridgeWebView.1.2
                                    @Override // com.huami.midong.webview.jsbridge.JsCallBackFunction
                                    public void onCallBack(String str2) {
                                        Log.d("JsBridgeWebView", "1=============data" + str2, new Object[0]);
                                    }
                                };
                                JsBridgeHandler jsBridgeHandler = !TextUtils.isEmpty(jsMessage.getHandlerName()) ? (JsBridgeHandler) JsBridgeWebView.this.messageHandlers.get(jsMessage.getHandlerName()) : JsBridgeWebView.this.defaultHandler;
                                if (jsBridgeHandler != null) {
                                    jsBridgeHandler.handler(jsMessage.getData(), jsCallBackFunction);
                                }
                            } else {
                                ((JsCallBackFunction) JsBridgeWebView.this.responseCallbacks.get(responseId)).onCallBack(jsMessage.getResponseData());
                                JsBridgeWebView.this.responseCallbacks.remove(responseId);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public List<JsMessage> getStartupMessage() {
        return this.startupMessage;
    }

    public void handlerReturnData(String str) {
        String functionFromReturnUrl = JsBridgeUtil.getFunctionFromReturnUrl(str);
        JsCallBackFunction jsCallBackFunction = this.responseCallbacks.get(functionFromReturnUrl);
        String dataFromReturnUrl = JsBridgeUtil.getDataFromReturnUrl(str);
        if (jsCallBackFunction != null) {
            jsCallBackFunction.onCallBack(dataFromReturnUrl);
            this.responseCallbacks.remove(functionFromReturnUrl);
        }
    }

    public void loadUrl(String str, JsCallBackFunction jsCallBackFunction) {
        loadUrl(str);
        clearCache(true);
        this.responseCallbacks.put(JsBridgeUtil.parseFunctionName(str), jsCallBackFunction);
    }

    public void registerHandler(String str, JsBridgeHandler jsBridgeHandler) {
        if (jsBridgeHandler != null) {
            this.messageHandlers.put(str, jsBridgeHandler);
        }
    }

    @Override // com.huami.midong.webview.jsbridge.WebViewJavascriptBridge
    public void send(String str) {
        send(str, null);
    }

    public void setDefaultHandler(JsBridgeHandler jsBridgeHandler) {
        this.defaultHandler = jsBridgeHandler;
    }

    public void setStartupMessage(List<JsMessage> list) {
        this.startupMessage = list;
    }

    @Override // com.huami.midong.webview.jsbridge.WebViewJavascriptBridge
    public void send(String str, JsCallBackFunction jsCallBackFunction) {
        doSend(null, str, jsCallBackFunction);
    }

    public JsBridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "JsBridgeWebView";
        this.responseCallbacks = new HashMap();
        this.messageHandlers = new HashMap();
        this.defaultHandler = new JsBridgeDefaultHandler();
        this.startupMessage = new ArrayList();
        this.uniqueId = 0L;
        init();
    }

    public JsBridgeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "JsBridgeWebView";
        this.responseCallbacks = new HashMap();
        this.messageHandlers = new HashMap();
        this.defaultHandler = new JsBridgeDefaultHandler();
        this.startupMessage = new ArrayList();
        this.uniqueId = 0L;
        init();
    }
}
