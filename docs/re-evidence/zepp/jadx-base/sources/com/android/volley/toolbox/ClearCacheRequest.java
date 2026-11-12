package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/* JADX INFO: loaded from: classes2.dex */
public class ClearCacheRequest extends Request<Object> {
    private final Cache a;
    private final Runnable b;

    public ClearCacheRequest(Cache cache, Runnable runnable) {
        super(0, null, null);
        this.a = cache;
        this.b = runnable;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(Object obj) {
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }

    @Override // com.android.volley.Request
    public boolean isCanceled() {
        this.a.clear();
        if (this.b == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.b);
        return true;
    }

    @Override // com.android.volley.Request
    public Response<Object> parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }
}
