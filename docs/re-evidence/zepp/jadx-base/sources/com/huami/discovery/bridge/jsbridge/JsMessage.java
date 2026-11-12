package com.huami.discovery.bridge.jsbridge;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class JsMessage {
    private static final String f = "callbackId";
    private static final String g = "responseId";
    private static final String h = "responseData";
    private static final String i = "data";
    private static final String j = "handlerName";
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public static List<JsMessage> i(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JsMessage jsMessage = new JsMessage();
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                jsMessage.f(jSONObject.has(j) ? jSONObject.getString(j) : null);
                jsMessage.e(jSONObject.has(f) ? jSONObject.getString(f) : null);
                jsMessage.g(jSONObject.has(h) ? jSONObject.getString(h) : null);
                jsMessage.h(jSONObject.has(g) ? jSONObject.getString(g) : null);
                jsMessage.setData(jSONObject.has("data") ? jSONObject.getString("data") : null);
                arrayList.add(jsMessage);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static JsMessage toObject(String str) {
        JsMessage jsMessage = new JsMessage();
        try {
            JSONObject jSONObject = new JSONObject(str);
            jsMessage.f(jSONObject.has(j) ? jSONObject.getString(j) : null);
            jsMessage.e(jSONObject.has(f) ? jSONObject.getString(f) : null);
            jsMessage.g(jSONObject.has(h) ? jSONObject.getString(h) : null);
            jsMessage.h(jSONObject.has(g) ? jSONObject.getString(g) : null);
            jsMessage.setData(jSONObject.has("data") ? jSONObject.getString("data") : null);
            return jsMessage;
        } catch (JSONException e) {
            e.printStackTrace();
            return jsMessage;
        }
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public void e(String str) {
        this.a = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void g(String str) {
        this.c = str;
    }

    public String getData() {
        return this.d;
    }

    public void h(String str) {
        this.b = str;
    }

    public void setData(String str) {
        this.d = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f, a());
            jSONObject.put("data", getData());
            jSONObject.put(j, b());
            jSONObject.put(h, c());
            jSONObject.put(g, d());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
