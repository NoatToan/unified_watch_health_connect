package com.android.volley.toolbox.ext;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NormalPostRequest extends Request<JSONObject> {
    private Map<String, String> a;
    private Response.Listener<JSONObject> b;

    public NormalPostRequest(int i, String str, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener, Map<String, String> map) {
        super(i, str, errorListener);
        this.b = listener;
        this.a = map;
    }

    @Override // com.android.volley.Request
    public Map<String, String> getParams() throws AuthFailureError {
        return this.a;
    }

    @Override // com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            String str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            try {
                if (VolleyLog.DEBUG) {
                    VolleyLog.d(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Response.success(new JSONObject(str), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e2) {
            return Response.error(new ParseError(e2));
        } catch (JSONException e3) {
            return Response.error(new ParseError(e3));
        }
    }

    @Override // com.android.volley.Request
    public void deliverResponse(JSONObject jSONObject) {
        this.b.onResponse(jSONObject);
    }
}
