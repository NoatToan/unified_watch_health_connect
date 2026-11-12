package com.huami.passport.net;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ext.RequestManager;

/* JADX INFO: loaded from: classes12.dex */
public class RequestQueueHolder {
    private static final String TAG = "RequestQueueHolder";
    private static volatile RequestQueue requestQueue;

    public static void addRequest(Context context, Request<?> request) {
        getRequestQueue(context).add(request);
    }

    public static synchronized RequestQueue getRequestQueue(Context context) {
        if (requestQueue == null) {
            requestQueue = RequestManager.getDefault(context.getApplicationContext()).getRequestQueue();
        }
        return requestQueue;
    }

    public static synchronized void setRequestQueue(RequestQueue requestQueue2) {
        requestQueue = requestQueue2;
    }
}
