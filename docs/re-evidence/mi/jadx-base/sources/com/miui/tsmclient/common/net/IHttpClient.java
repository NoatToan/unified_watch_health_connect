package com.miui.tsmclient.common.net;

import com.miui.tsmclient.common.net.request.BaseRequest;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface IHttpClient {
    void cancel(BaseRequest<?> baseRequest);

    <T> void enqueue(BaseRequest<T> baseRequest);

    <T> Response<T> execute(BaseRequest<T> baseRequest) throws IOException;
}
