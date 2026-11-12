package com.android.volley.toolbox.ext;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NormalPostStringRequest extends StringRequest {
    private Map<String, String> b;

    public NormalPostStringRequest(int i, String str, Map<String, String> map, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(i, str, listener, errorListener);
        this.b = map;
    }

    @Override // com.android.volley.Request
    public Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> map = this.b;
        return map != null ? map : super.getParams();
    }
}
