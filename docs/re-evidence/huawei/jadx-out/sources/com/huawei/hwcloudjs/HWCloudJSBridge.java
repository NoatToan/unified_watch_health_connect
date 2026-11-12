package com.huawei.hwcloudjs;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.huawei.hwcloudjs.api.JsParam;
import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwcloudjs.f.h;
import com.huawei.hwcloudjs.service.jsapi.JsCoreApi;
import com.huawei.hwcloudjs.service.jsmsg.NativeMsg;
import com.huawei.hwcloudjs.support.enables.INoProguard;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HWCloudJSBridge implements com.huawei.hwcloudjs.e.b.b<NativeMsg>, INoProguard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17019a = "HWCloudJSBridge";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17021c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f17020b = null;
    private final List<String> d = new ArrayList();
    private HashMap<String, String> e = new HashMap<>();

    public void setBridgeId(String str) {
        this.f17021c = str;
    }

    @Override // com.huawei.hwcloudjs.e.b.b
    public boolean onReceive(NativeMsg nativeMsg) {
        NativeMsg nativeMsg2;
        JsCoreApi.ChannelMessageReq channelMessageReq;
        if (nativeMsg != null && !TextUtils.isEmpty(nativeMsg.getType())) {
            String strA = com.huawei.hwcloudjs.f.b.a(this.f17020b);
            if (TextUtils.isEmpty(strA)) {
                return true;
            }
            String type = nativeMsg.getType();
            if ("channelMessage".equals(type) && (nativeMsg instanceof JsCoreApi.ChannelMessageReq)) {
                channelMessageReq = (JsCoreApi.ChannelMessageReq) nativeMsg;
                if (!this.e.containsKey(com.huawei.hwcloudjs.c.a.j + channelMessageReq.getChannelName())) {
                    nativeMsg2 = channelMessageReq;
                    return true;
                }
            } else {
                nativeMsg2 = nativeMsg;
                if (!this.e.containsKey(type)) {
                    return true;
                }
            }
            nativeMsg2 = channelMessageReq;
            a(nativeMsg2, strA);
        }
        return true;
    }

    @JavascriptInterface
    public void invoke(String str) {
        com.huawei.hwcloudjs.f.d.c(f17019a, "invoke begin", true);
        JSONObject jSONObjectA = e.a(str);
        if (jSONObjectA == null) {
            com.huawei.hwcloudjs.f.d.b(f17019a, "invoke callJson null", true);
            e.a(this.f17020b, 13);
            return;
        }
        String strOptString = jSONObjectA.optString("_appId");
        String strOptString2 = jSONObjectA.optString("_method");
        String strOptString3 = jSONObjectA.optString("_args");
        String strOptString4 = jSONObjectA.optString("_index");
        String strA = com.huawei.hwcloudjs.f.b.a(this.f17020b);
        if (TextUtils.isEmpty(strA)) {
            com.huawei.hwcloudjs.f.d.b(f17019a, "invoke webViewUrl null", true);
            e.a(this.f17020b, strOptString4, 9999, this.f17021c);
            return;
        }
        if (TextUtils.isEmpty(strOptString) && !a(strA)) {
            com.huawei.hwcloudjs.f.d.b(f17019a, "invoke JS_RET_CODE_METHOD_NOT_AUTH", true);
            e.a(this.f17020b, strOptString4, 10, this.f17021c);
            return;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            com.huawei.hwcloudjs.f.d.b(f17019a, "invoke method isEmpty", true);
            e.a(this.f17020b, strOptString4, 13, this.f17021c);
            return;
        }
        if (strOptString2.equals("listenEvent")) {
            com.huawei.hwcloudjs.f.d.c(f17019a, "invoke method listenEvent", true);
            if (b(strOptString3)) {
                return;
            }
            com.huawei.hwcloudjs.f.d.b(f17019a, "invoke method listenEvent error", true);
            e.a(this.f17020b, strOptString4, 13, this.f17021c);
            return;
        }
        com.huawei.hwcloudjs.f.d.c(f17019a, "invoke method:" + strOptString2, false);
        com.huawei.hwcloudjs.core.a.a aVarA = com.huawei.hwcloudjs.core.a.b.a().a(strOptString2);
        if (aVarA != null) {
            a(strOptString, strOptString3, strOptString4, strA, aVarA);
        } else {
            com.huawei.hwcloudjs.f.d.b(f17019a, "invoke method cannot get!", true);
            e.a(this.f17020b, strOptString4, 12, this.f17021c);
        }
    }

    public String getBridgeId() {
        return this.f17021c;
    }

    public void detach() {
        this.f17020b.removeJavascriptInterface(Constants.HBS_SDK);
        com.huawei.hwcloudjs.service.jsmsg.a.a().a(this);
        com.huawei.hwcloudjs.f.d.c(f17019a, "detach begin", true);
    }

    @JavascriptInterface
    public void config(String str) {
        WebView webView;
        int i;
        String str2;
        com.huawei.hwcloudjs.f.d.c(f17019a, "config begin", true);
        JSONObject jSONObjectA = e.a(str);
        if (jSONObjectA != null) {
            String strOptString = jSONObjectA.optString("appId");
            if (TextUtils.isEmpty(strOptString)) {
                str2 = "appId isEmpty";
            } else {
                String strA = com.huawei.hwcloudjs.f.b.a(this.f17020b);
                if (!TextUtils.isEmpty(strA)) {
                    a(strOptString, strA, com.huawei.hwcloudjs.f.c.a(jSONObjectA.optJSONArray("needConfig")), jSONObjectA);
                    synchronized (this.d) {
                        this.d.add(strOptString);
                    }
                    return;
                }
                com.huawei.hwcloudjs.f.d.b(f17019a, "webViewUrl isEmpty", true);
                webView = this.f17020b;
                i = 9999;
            }
            e.a(webView, i);
        }
        str2 = "callJson == null";
        com.huawei.hwcloudjs.f.d.b(f17019a, str2, true);
        webView = this.f17020b;
        i = 13;
        e.a(webView, i);
    }

    public void attach(WebView webView) {
        this.f17020b = webView;
        webView.addJavascriptInterface(this, Constants.HBS_SDK);
        com.huawei.hwcloudjs.service.jsmsg.a.a().b(this);
        com.huawei.hwcloudjs.f.d.c(f17019a, "attach begin", true);
    }

    private boolean b(String str) {
        JSONObject jSONObjectA = e.a(str);
        if (jSONObjectA == null) {
            return false;
        }
        String strOptString = jSONObjectA.optString("eventName");
        if (this.e.containsKey(strOptString)) {
            return true;
        }
        if (strOptString.length() >= 64 || this.e.size() >= 50) {
            return false;
        }
        this.e.put(strOptString, "");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, List<String> list, JSONObject jSONObject) {
        com.huawei.hwcloudjs.core.d.a().a(this.f17020b.getContext(), str, str2, this.f17021c, list, jSONObject);
    }

    private boolean a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        return com.huawei.hwcloudjs.d.a.c.a().a(str, str2, arrayList);
    }

    private boolean a(String str) {
        return com.huawei.hwcloudjs.d.a.c.a().a(str);
    }

    private void a(String str, String str2, List<String> list, JSONObject jSONObject) {
        com.huawei.hwcloudjs.f.d.c(f17019a, "configAuth begin", true);
        b bVar = new b(this, str, str2, list, jSONObject);
        com.huawei.hwcloudjs.d.a.c.a().a(str, str2, new ArrayList(), bVar, this.f17020b.getContext());
    }

    private void a(String str, String str2, String str3, String str4, com.huawei.hwcloudjs.core.a.a aVar) {
        com.huawei.hwcloudjs.f.d.c(f17019a, "callNativeMethod begin", true);
        if (a(str4)) {
            com.huawei.hwcloudjs.f.d.c(f17019a, "url Allow contains!", true);
            a(aVar, str2, str3, str, str4);
        } else if (!com.huawei.hwcloudjs.f.e.b(aVar)) {
            com.huawei.hwcloudjs.f.d.b(f17019a, "method Is not Open!", true);
            e.a(this.f17020b, str3, 12, this.f17021c);
        } else if (a(str, str4, com.huawei.hwcloudjs.f.e.a(aVar))) {
            com.huawei.hwcloudjs.f.d.c(f17019a, "checkAuth OK", true);
            a(aVar, str2, str3, str, str4);
        } else {
            com.huawei.hwcloudjs.f.d.b(f17019a, "checkAuth fail!", true);
            e.a(this.f17020b, str3, 10, this.f17021c);
        }
    }

    private void a(NativeMsg nativeMsg, String str) {
        if (a(str)) {
            com.huawei.hwcloudjs.f.d.c(f17019a, "url Allow contains!!", true);
            e.a(this.f17020b, nativeMsg);
        } else if (nativeMsg.isOpen()) {
            synchronized (this.d) {
                Iterator<String> it = this.d.iterator();
                while (it.hasNext()) {
                    if (a(it.next(), str, nativeMsg.getPermission())) {
                        e.a(this.f17020b, nativeMsg);
                    }
                }
            }
        }
    }

    private void a(com.huawei.hwcloudjs.core.a.a aVar, String str, String str2, String str3, String str4) {
        Object objA;
        com.huawei.hwcloudjs.f.d.c(f17019a, "callNative begin", true);
        if (aVar.b() == null) {
            objA = null;
        } else if (aVar.b() == JsParam.class) {
            com.huawei.hwcloudjs.f.d.c(f17019a, "callNative paramType is JsParam", true);
            objA = new JsParam(str3, str4, this.f17021c);
        } else {
            com.huawei.hwcloudjs.f.d.c(f17019a, "callNative paramType is not JsParam", true);
            objA = new com.huawei.hwcloudjs.core.b().a(str, aVar.b());
            if (objA != null && (objA instanceof JsParam)) {
                objA = e.a((JsParam) objA, str3, str4, this.f17021c);
            }
        }
        aVar.a(objA, new JsCallback(this.f17020b, str2, this.f17021c));
    }

    public HWCloudJSBridge() {
        this.f17021c = "";
        this.f17021c = (((long) h.a()) + System.currentTimeMillis()) + "";
    }
}
