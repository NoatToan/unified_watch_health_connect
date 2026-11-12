package com.ximalaya.ting.android.sdkdownloader.http.request;

import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.httputil.HttpDNSUtilForOpenSDK;
import com.ximalaya.ting.android.sdkdownloader.http.BaseParams;
import com.ximalaya.ting.android.sdkdownloader.http.ProgressHandler;
import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes22.dex */
class a {
    public static Call a(RequestParams requestParams, ProgressHandler progressHandler) throws IOException {
        OkHttpClient okHttpClientB = b(requestParams, progressHandler);
        if (okHttpClientB == null) {
            return null;
        }
        Request.Builder builderUrl = new Request.Builder().url(requestParams.getUri());
        List<BaseParams.Header> headers = requestParams.getHeaders();
        if (headers != null) {
            for (BaseParams.Header header : headers) {
                String str = header.key;
                String valueStr = header.getValueStr();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(valueStr)) {
                    if (header.setHeader) {
                        builderUrl.header(str, valueStr);
                    } else {
                        builderUrl.addHeader(str, valueStr);
                    }
                }
            }
        }
        return okHttpClientB.newCall(builderUrl.build());
    }

    private static OkHttpClient b(RequestParams requestParams, ProgressHandler progressHandler) {
        try {
            OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
            long connectTimeout = requestParams.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderProxy = builderNewBuilder.connectTimeout(connectTimeout, timeUnit).readTimeout(requestParams.getConnectTimeout(), timeUnit).proxy(requestParams.getProxy());
            builderProxy.addInterceptor(HttpDNSUtilForOpenSDK.getHttpDNSInterceptor());
            return builderProxy.build();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
