package com.miui.tsmclient.common.net;

import android.content.Context;
import com.miui.tsmclient.common.net.internal.okhttp.OkHttpClientImpl;
import com.miui.tsmclient.common.net.request.BaseRequest;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class HttpClient implements IHttpClient {
    private static volatile HttpClient sInstance;
    private IHttpClient mHttpClientImpl;

    private HttpClient(Context context) {
        this.mHttpClientImpl = new OkHttpClientImpl(context);
    }

    public static HttpClient getInstance(Context context) {
        if (sInstance == null) {
            synchronized (HttpClient.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new HttpClient(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // com.miui.tsmclient.common.net.IHttpClient
    public void cancel(BaseRequest<?> baseRequest) {
        if (baseRequest != null) {
            this.mHttpClientImpl.cancel(baseRequest);
        }
    }

    @Override // com.miui.tsmclient.common.net.IHttpClient
    public <T> void enqueue(BaseRequest<T> baseRequest) {
        this.mHttpClientImpl.enqueue(baseRequest);
    }

    @Override // com.miui.tsmclient.common.net.IHttpClient
    public <T> Response<T> execute(BaseRequest<T> baseRequest) throws IOException {
        return this.mHttpClientImpl.execute(baseRequest);
    }
}
