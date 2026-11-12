package com.huami.midong.webview.URLUtils;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/* JADX INFO: loaded from: classes11.dex */
public class RawRequest {
    private StringRequest stringRequest;

    public RawRequest() {
    }

    public Request getRequest() {
        return this.stringRequest;
    }

    public RawRequest(int i, String str, final ResponseListener responseListener) {
        this.stringRequest = new StringRequest(i, str, new Response.Listener<String>() { // from class: com.huami.midong.webview.URLUtils.RawRequest.1
            @Override // com.android.volley.Response.Listener
            public void onResponse(String str2) {
                responseListener.onResponse(str2);
            }
        }, new Response.ErrorListener() { // from class: com.huami.midong.webview.URLUtils.RawRequest.2
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                responseListener.onErrorResponse(volleyError);
            }
        });
    }
}
