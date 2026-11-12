package com.ximalaya.ting.android.opensdk.httputil;

import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public interface IHttpCallBack {
    void onFailure(int i, String str);

    void onResponse(Response response);
}
