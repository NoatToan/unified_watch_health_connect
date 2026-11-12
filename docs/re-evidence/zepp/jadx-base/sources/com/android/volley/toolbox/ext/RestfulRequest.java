package com.android.volley.toolbox.ext;

import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public class RestfulRequest extends Request<NetworkResponse> {
    private final Response.Listener<NetworkResponse> a;
    private Map<String, String> b;
    private Map<String, String> c;
    private MultiValueMap<String, Object> d;

    public RestfulRequest(int i, String str, Response.Listener<NetworkResponse> listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.a = listener;
    }

    public static StringBuilder buildCommonParams(MultiValueMap<String, Object> multiValueMap, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : multiValueMap.keySet()) {
            for (Object obj : multiValueMap.getValues(str2)) {
                if (obj != null && (obj instanceof CharSequence)) {
                    sb.append(a.l);
                    try {
                        sb.append(URLEncoder.encode(str2, str));
                        sb.append(SearchCriteria.EQ);
                        sb.append(URLEncoder.encode(obj.toString(), str));
                    } catch (UnsupportedEncodingException unused) {
                        VolleyLog.e("Encoding " + str + " format is not supported by the system", new Object[0]);
                        sb.append(str2);
                        sb.append(SearchCriteria.EQ);
                        sb.append(obj.toString());
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb;
    }

    public void addParams(String str, String str2) {
        if (this.d == null) {
            this.d = new LinkedMultiValueMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MultiValueMap<String, Object> multiValueMap = this.d;
        if (str2 == null) {
            str2 = "";
        }
        multiValueMap.add(str, str2);
    }

    @Override // com.android.volley.Request
    public byte[] getBody() throws AuthFailureError {
        MultiValueMap<String, Object> multiValueMap = this.d;
        if (multiValueMap == null || multiValueMap.isEmpty()) {
            byte[] body = super.getBody();
            if (VolleyLog.DEBUG) {
                try {
                    VolleyLog.d("getBody：" + new String(body, getParamsEncoding()));
                } catch (Exception unused) {
                }
            }
            return body;
        }
        try {
            String string = buildCommonParams(this.d, getParamsEncoding()).toString();
            if (VolleyLog.DEBUG) {
                VolleyLog.d("getBody:" + string);
            }
            return string.getBytes(getParamsEncoding());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.android.volley.Request
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> map = this.b;
        return map != null ? map : super.getHeaders();
    }

    @Override // com.android.volley.Request
    public Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> map = this.c;
        return map != null ? map : super.getParams();
    }

    @Override // com.android.volley.Request
    public Response<NetworkResponse> parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    public void setHeaders(Map<String, String> map) {
        this.b = map;
    }

    public void setParams(Map<String, String> map) {
        MultiValueMap<String, Object> multiValueMap = this.d;
        if (multiValueMap != null && !multiValueMap.isEmpty()) {
            throw new IllegalArgumentException("AddParams method has been used, please do not use the setParams method");
        }
        this.c = map;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(NetworkResponse networkResponse) {
        this.a.onResponse(networkResponse);
    }
}
