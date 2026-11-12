package com.huami.midong.webview.jsbridge;

import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class JsMessage {
    private static final String CALLBACK_ID_STR = "callbackId";
    private static final String DATA_STR = "data";
    private static final String HANDLER_NAME_STR = "handlerName";
    private static final String RESPONSE_DATA_STR = "responseData";
    private static final String RESPONSE_ID_STR = "responseId";
    private static final String TAG = "JsBridgeMessage";
    private String callbackId;
    private String data;
    private String handlerName;
    private String responseData;
    private String responseId;

    public static List<JsMessage> toArrayList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JsMessage jsMessage = new JsMessage();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jsMessage.setHandlerName(jSONObject.has(HANDLER_NAME_STR) ? jSONObject.getString(HANDLER_NAME_STR) : null);
                jsMessage.setCallbackId(jSONObject.has(CALLBACK_ID_STR) ? jSONObject.getString(CALLBACK_ID_STR) : null);
                jsMessage.setResponseData(jSONObject.has(RESPONSE_DATA_STR) ? jSONObject.getString(RESPONSE_DATA_STR) : null);
                jsMessage.setResponseId(jSONObject.has(RESPONSE_ID_STR) ? jSONObject.getString(RESPONSE_ID_STR) : null);
                jsMessage.setData(jSONObject.has("data") ? jSONObject.getString("data") : null);
                arrayList.add(jsMessage);
            }
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage(), e, new Object[0]);
        }
        return arrayList;
    }

    public static JsMessage toObject(String str) {
        JsMessage jsMessage = new JsMessage();
        try {
            JSONObject jSONObject = new JSONObject(str);
            jsMessage.setHandlerName(jSONObject.has(HANDLER_NAME_STR) ? jSONObject.getString(HANDLER_NAME_STR) : null);
            jsMessage.setCallbackId(jSONObject.has(CALLBACK_ID_STR) ? jSONObject.getString(CALLBACK_ID_STR) : null);
            jsMessage.setResponseData(jSONObject.has(RESPONSE_DATA_STR) ? jSONObject.getString(RESPONSE_DATA_STR) : null);
            jsMessage.setResponseId(jSONObject.has(RESPONSE_ID_STR) ? jSONObject.getString(RESPONSE_ID_STR) : null);
            jsMessage.setData(jSONObject.has("data") ? jSONObject.getString("data") : null);
            return jsMessage;
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage(), e, new Object[0]);
            return jsMessage;
        }
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public String getData() {
        return this.data;
    }

    public String getHandlerName() {
        return this.handlerName;
    }

    public String getResponseData() {
        return this.responseData;
    }

    public String getResponseId() {
        return this.responseId;
    }

    public void setCallbackId(String str) {
        this.callbackId = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setHandlerName(String str) {
        this.handlerName = str;
    }

    public void setResponseData(String str) {
        this.responseData = str;
    }

    public void setResponseId(String str) {
        this.responseId = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CALLBACK_ID_STR, getCallbackId());
            jSONObject.put("data", getData());
            jSONObject.put(HANDLER_NAME_STR, getHandlerName());
            jSONObject.put(RESPONSE_DATA_STR, getResponseData());
            jSONObject.put(RESPONSE_ID_STR, getResponseId());
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    public String toString() {
        return this.handlerName + ":" + this.handlerName + "," + CALLBACK_ID_STR + ":" + this.callbackId + ",data:" + this.data + "," + RESPONSE_ID_STR + ":" + this.responseId + "," + RESPONSE_DATA_STR + ":" + this.responseData;
    }
}
