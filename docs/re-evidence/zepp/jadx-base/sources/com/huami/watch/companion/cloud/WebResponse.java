package com.huami.watch.companion.cloud;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class WebResponse {
    public static final int CODE_AUTH_INVALID = 0;
    public static final int CODE_EMPTY = 50001;
    public static final int CODE_LIKED = 666;
    public static final int CODE_MUTEX = -1;
    public static final int CODE_NONE = -2;
    public static final int CODE_NOT_BETA_APK_USER = 50018;
    public static final int CODE_OK = 1;
    public static final int CODE_PARSE_FAILED = 2;
    private String a = "";
    public int code = -2;
    public String message = "";
    public String data = "";
    public String correlationId = "";

    public static WebResponse parse(JSONObject jSONObject) {
        WebResponse webResponse = new WebResponse();
        webResponse.code = jSONObject.optInt("code", 2);
        webResponse.message = jSONObject.optString("message", "");
        webResponse.data = jSONObject.optString("data", "");
        webResponse.correlationId = jSONObject.optString("correlation_id", "");
        webResponse.a = jSONObject.toString();
        return webResponse;
    }

    public void copy(WebResponse webResponse) {
        this.code = webResponse.code;
        this.message = webResponse.message;
        this.data = webResponse.data;
        this.correlationId = webResponse.correlationId;
    }

    public boolean empty() {
        return this.code == 50001;
    }

    public boolean equals(Object obj) {
        return ((WebResponse) obj).code == this.code;
    }

    public boolean isAuthInvalid() {
        return this.code == 0;
    }

    public boolean success() {
        return this.code == 1;
    }

    public String toString() {
        return this.a;
    }

    public static WebResponse parse(String str) {
        try {
            return parse(new JSONObject(str));
        } catch (JSONException unused) {
            WebResponse webResponse = new WebResponse();
            webResponse.code = 2;
            return webResponse;
        }
    }

    public static WebResponse parse(Context context, JSONObject jSONObject) {
        return parse(jSONObject);
    }

    public static WebResponse parse(Context context, String str) {
        return parse(str);
    }
}
