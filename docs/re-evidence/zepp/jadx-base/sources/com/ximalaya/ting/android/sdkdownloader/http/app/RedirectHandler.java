package com.ximalaya.ting.android.sdkdownloader.http.app;

import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest;

/* JADX INFO: loaded from: classes22.dex */
public interface RedirectHandler {
    RequestParams getRedirectParams(UriRequest uriRequest);
}
