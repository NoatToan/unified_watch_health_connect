package com.huami.midong.webview.nativejsapi.apis;

import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.huami.midong.webview.URLUtils.BaseRequestManager;
import com.huami.midong.webview.URLUtils.RawRequest;
import com.huami.midong.webview.URLUtils.ResponseListener;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.utils.JsBridgeUtil;
import com.huami.watch.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsPreVerifyFunc extends JsBridgeFunc {
    private static final String REQ_VERIFY_URL = "jsbridge/verify";

    private Map<String, String> parseJsVerifySignRequest(String str, JsCallBackFunction jsCallBackFunction) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString(a.p);
        String strOptString2 = jSONObject.optString("timestamp");
        String strOptString3 = jSONObject.optString("nonceStr");
        String strOptString4 = jSONObject.optString("signature");
        StringBuilder sbDeleteCharAt = null;
        if (TextUtils.isEmpty(strOptString)) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError(a.p)));
            return null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("timestamp")));
            return null;
        }
        if (TextUtils.isEmpty(strOptString3)) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("nonceStr")));
            return null;
        }
        if (TextUtils.isEmpty(strOptString4)) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.missParamError("signature")));
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("jsApiList");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                sb.append(jSONArrayOptJSONArray.getString(i));
                sb.append(",");
            }
            sbDeleteCharAt = sb.deleteCharAt(sb.length() - 1);
        }
        String cleanUrl = JsBridgeUtil.getCleanUrl(this.mNativeApi.getWebView().getUrl());
        HashMap map = new HashMap();
        map.put(a.p, strOptString);
        map.put("timestamp", strOptString2);
        map.put("nonceStr", strOptString3);
        map.put("signature", strOptString4);
        if (sbDeleteCharAt != null && !TextUtils.isEmpty(sbDeleteCharAt.toString())) {
            map.put("jsApiList", sbDeleteCharAt.toString());
        }
        if (!TextUtils.isEmpty(cleanUrl)) {
            cleanUrl = URLEncoder.encode(cleanUrl);
        }
        map.put("url", cleanUrl);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> parseVerifySignResponse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") != 1) {
                Log.d(JsBridgeFunc.TAG, "verify no permission reason: " + str, new Object[0]);
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("jsApiList");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    private void verifySign(Map<String, String> map, final JsCallBackFunction jsCallBackFunction) {
        Uri.Builder builderPath = new Uri.Builder().path(this.mNativeApi.getVerifyHost() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + REQ_VERIFY_URL);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderPath.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String strDecode = URLDecoder.decode(builderPath.toString());
        Log.d(JsBridgeFunc.TAG, "verify url :" + strDecode, new Object[0]);
        BaseRequestManager.addRequest(this.mNativeApi.getContext(), new RawRequest(0, strDecode, new ResponseListener<String>() { // from class: com.huami.midong.webview.nativejsapi.apis.JsPreVerifyFunc.1
            @Override // com.huami.midong.webview.URLUtils.ResponseListener
            public void onErrorResponse(VolleyError volleyError) {
                if (volleyError.networkResponse != null) {
                    Log.d(JsBridgeFunc.TAG, "verifySign onErrorResponse:" + volleyError.networkResponse.statusCode, new Object[0]);
                }
                jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4020101L, new String[0])));
            }

            @Override // com.huami.midong.webview.URLUtils.ResponseListener
            public void onResponse(String str) {
                if (JsPreVerifyFunc.this.parseVerifySignResponse(str) != null) {
                    jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
                } else {
                    jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4020101L, new String[0])));
                }
            }
        }).getRequest());
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        try {
            Map<String, String> jsVerifySignRequest = parseJsVerifySignRequest(str, jsCallBackFunction);
            if (jsVerifySignRequest != null) {
                verifySign(jsVerifySignRequest, jsCallBackFunction);
            }
        } catch (JSONException e) {
            jsCallBackFunction.onCallBack(new Gson().toJson(JsBridgeError.jsonParseError()));
            Log.e(JsBridgeFunc.TAG, e.getMessage(), e, new Object[0]);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_VERIFY_JSAPI;
    }
}
