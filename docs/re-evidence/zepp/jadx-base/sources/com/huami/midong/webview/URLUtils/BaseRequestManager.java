package com.huami.midong.webview.URLUtils;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/* JADX INFO: loaded from: classes11.dex */
public class BaseRequestManager {
    private static RequestQueue mQueue;

    public static void addRequest(Context context, Request request) {
        if (mQueue == null) {
            mQueue = Volley.newRequestQueue(context);
        }
        mQueue.add(request);
    }
}
