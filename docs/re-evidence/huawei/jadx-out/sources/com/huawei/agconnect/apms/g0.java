package com.huawei.agconnect.apms;

import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 extends Response.Builder {
    public Response.Builder abc;

    public g0(Response.Builder builder) {
        this.abc = builder;
    }

    public final Response.Builder addHeader(String str, String str2) {
        return this.abc.addHeader(str, str2);
    }

    public final Response.Builder body(ResponseBody responseBody) {
        return this.abc.body(responseBody);
    }

    public final Response build() {
        return this.abc.build();
    }

    public final Response.Builder cacheResponse(Response response) {
        return this.abc.cacheResponse(response);
    }

    public final Response.Builder code(int i) {
        return this.abc.code(i);
    }

    public final Response.Builder handshake(Handshake handshake) {
        return this.abc.handshake(handshake);
    }

    public final Response.Builder header(String str, String str2) {
        return this.abc.header(str, str2);
    }

    public final Response.Builder headers(Headers headers) {
        return this.abc.headers(headers);
    }

    public final Response.Builder message(String str) {
        return this.abc.message(str);
    }

    public final Response.Builder networkResponse(Response response) {
        return this.abc.networkResponse(response);
    }

    public final Response.Builder priorResponse(Response response) {
        return this.abc.priorResponse(response);
    }

    public final Response.Builder protocol(Protocol protocol) {
        return this.abc.protocol(protocol);
    }

    public final Response.Builder removeHeader(String str) {
        return this.abc.removeHeader(str);
    }

    public final Response.Builder request(Request request) {
        return this.abc.request(request);
    }
}
