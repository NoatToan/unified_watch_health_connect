package com.huawei.agconnect.apms;

import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import java.net.URL;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends Request.Builder {
    public Request.Builder abc;

    public y(Request.Builder builder) {
        this.abc = builder;
    }

    public final Request.Builder addHeader(String str, String str2) {
        return this.abc.addHeader(str, str2);
    }

    public final Request build() {
        return this.abc.build();
    }

    public final Request.Builder cacheControl(CacheControl cacheControl) {
        return this.abc.cacheControl(cacheControl);
    }

    public final Request.Builder delete(RequestBody requestBody) {
        return this.abc.delete(requestBody);
    }

    public final Request.Builder get() {
        return this.abc.get();
    }

    public final Request.Builder head() {
        return this.abc.head();
    }

    public final Request.Builder header(String str, String str2) {
        return this.abc.header(str, str2);
    }

    public final Request.Builder headers(Headers headers) {
        return this.abc.headers(headers);
    }

    public final Request.Builder method(String str, RequestBody requestBody) {
        return this.abc.method(str, requestBody);
    }

    public final Request.Builder patch(RequestBody requestBody) {
        return this.abc.patch(requestBody);
    }

    public final Request.Builder post(RequestBody requestBody) {
        return this.abc.post(requestBody);
    }

    public final Request.Builder put(RequestBody requestBody) {
        return this.abc.put(requestBody);
    }

    public final Request.Builder removeHeader(String str) {
        return this.abc.removeHeader(str);
    }

    public final Request.Builder tag(Object obj) {
        return this.abc.tag(obj);
    }

    public final Request.Builder url(HttpUrl httpUrl) {
        return this.abc.url(httpUrl);
    }

    public final Request.Builder delete() {
        return this.abc.delete();
    }

    public final Request.Builder url(String str) {
        return this.abc.url(str);
    }

    public final Request.Builder url(URL url) {
        return this.abc.url(url);
    }
}
