package com.android.volley.toolbox.ext;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GsonRequest<T> extends Request<T> {
    private final Class<T> clazz;
    private final Gson gson;
    private Map<String, String> headers;
    private final Response.Listener<T> listener;
    private Map<String, String> params;

    public GsonRequest(int i, String str, Map<String, String> map, Class<T> cls, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.gson = new Gson();
        this.clazz = cls;
        this.params = map;
        this.listener = listener;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(T t) {
        this.listener.onResponse(t);
    }

    @Override // com.android.volley.Request
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> map = this.headers;
        return map != null ? map : super.getHeaders();
    }

    @Override // com.android.volley.Request
    public Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> map = this.params;
        return map != null ? map : super.getParams();
    }

    @Override // com.android.volley.Request
    public Response<T> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            try {
                if (VolleyLog.DEBUG) {
                    VolleyLog.d(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Response.success(this.gson.fromJson(str, (Class) this.clazz), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (JsonSyntaxException e2) {
            return Response.error(new ParseError(e2));
        } catch (UnsupportedEncodingException e3) {
            return Response.error(new ParseError(e3));
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setParams(Map<String, String> map) {
        this.params = map;
    }

    public GsonRequest(int i, String str, Class<T> cls, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.gson = new Gson();
        this.clazz = cls;
        this.listener = listener;
    }
}
