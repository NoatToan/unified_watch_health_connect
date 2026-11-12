package com.huami.midong.webview.URLUtils;

import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes11.dex */
public interface ResponseListener<T> {
    void onErrorResponse(VolleyError volleyError);

    void onResponse(T t);
}
