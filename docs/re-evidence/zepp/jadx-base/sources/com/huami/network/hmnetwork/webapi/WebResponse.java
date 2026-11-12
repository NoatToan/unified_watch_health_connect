package com.huami.network.hmnetwork.webapi;

import com.huami.tools.log.HMLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class WebResponse {
    public static final int CODE_AUTH_INVALID = 0;
    public static final int CODE_MUTEX = -1;
    public static final int CODE_OK = 1;
    private static final String c = "WebResponse";
    private static final int d = -2;
    private static final int e = 2;
    private static final int f = 50001;
    private String a = "";
    public int code = -2;
    public String message = "";
    public String data = "";
    private String b = "";

    public static WebResponse createNoBodySuccessResponse() {
        WebResponse webResponse = new WebResponse();
        webResponse.code = 1;
        webResponse.message = "";
        webResponse.data = null;
        webResponse.b = "";
        webResponse.a = "";
        return webResponse;
    }

    public static WebResponse parse(JSONObject jSONObject) {
        WebResponse webResponse = new WebResponse();
        webResponse.code = jSONObject.optInt("code", 2);
        webResponse.message = jSONObject.optString("message", "");
        webResponse.data = jSONObject.optString("data", "");
        webResponse.b = jSONObject.optString("correlation_id", "");
        webResponse.a = jSONObject.toString();
        return webResponse;
    }

    public void copy(WebResponse webResponse) {
        this.code = webResponse.code;
        this.message = webResponse.message;
        this.data = webResponse.data;
        this.b = webResponse.b;
    }

    public boolean empty() {
        return this.code == 50001;
    }

    public boolean equals(Object obj) {
        return ((WebResponse) obj).code == this.code;
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
        } catch (JSONException e2) {
            HMLog.e(c, e2.getMessage(), new Object[0]);
            WebResponse webResponse = new WebResponse();
            webResponse.code = 2;
            return webResponse;
        }
    }
}
