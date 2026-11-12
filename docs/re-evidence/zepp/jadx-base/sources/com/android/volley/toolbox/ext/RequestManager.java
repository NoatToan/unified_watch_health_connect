package com.android.volley.toolbox.ext;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/* JADX INFO: loaded from: classes2.dex */
public class RequestManager {
    private static volatile RequestManager c;
    private final Context a;
    private RequestQueue b = getRequestQueue();

    private RequestManager(Context context) {
        this.a = context;
    }

    public static RequestManager getDefault(Context context) {
        if (c == null) {
            synchronized (RequestManager.class) {
                if (c == null) {
                    context.getApplicationContext();
                    c = new RequestManager(context);
                }
            }
        }
        return c;
    }

    public <T> void add(Request<T> request) {
        getRequestQueue().add(request);
    }

    public RequestQueue getRequestQueue() {
        if (this.b == null) {
            this.b = Volley.newRequestQueue(this.a);
        }
        return this.b;
    }
}
