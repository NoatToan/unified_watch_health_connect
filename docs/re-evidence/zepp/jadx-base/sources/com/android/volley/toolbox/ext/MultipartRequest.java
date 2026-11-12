package com.android.volley.toolbox.ext;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MultipartRequest extends Request<String> {
    public MultipartEntity a;
    public Map<String, String> b;
    private final Response.Listener<String> c;

    public MultipartRequest(String str, Response.Listener<String> listener) {
        this(str, listener, null);
    }

    public void addHeader(String str, String str2) {
        this.b.put(str, str2);
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.a.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
            VolleyLog.e("IOException writing to ByteArrayOutputStream", new Object[0]);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        return this.a.getContentType().getValue();
    }

    @Override // com.android.volley.Request
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> map = this.b;
        return map != null ? map : super.getHeaders();
    }

    public MultipartEntity getMultiPartEntity() {
        return this.a;
    }

    @Override // com.android.volley.Request
    public Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
        String str;
        try {
            str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (UnsupportedEncodingException unused) {
            str = new String(networkResponse.data);
        }
        return Response.success(str, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    public void setHeaders(Map<String, String> map) {
        this.b = map;
    }

    public MultipartRequest(String str, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(1, str, errorListener);
        this.a = new MultipartEntity();
        this.b = new HashMap();
        this.c = listener;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(String str) {
        Response.Listener<String> listener = this.c;
        if (listener != null) {
            listener.onResponse(str);
        }
    }
}
