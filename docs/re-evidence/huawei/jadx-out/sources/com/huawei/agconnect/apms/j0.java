package com.huawei.agconnect.apms;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes22.dex */
public final class j0<T> implements ResponseHandler<T> {
    public final ResponseHandler<T> abc;
    public final b bcd;

    public j0(ResponseHandler<T> responseHandler, b bVar) {
        this.abc = responseHandler;
        this.bcd = bVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        nop.abc(httpResponse, this.bcd);
        return this.abc.handleResponse(httpResponse);
    }
}
