package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class u0<T> extends Response<T> {
    public static final int g = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f15419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h1.g f15420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<String>> f15421c;
    public int d;
    public String e;
    public String f;

    public b newBuilder() {
        return new b(this);
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public String getUrl() {
        return this.f;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public String getMessage() {
        return this.e;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public Map<String, List<String>> getHeaders() {
        return this.f15421c;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public ResponseBody getErrorBody() {
        return this.f15420b;
    }

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f15422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h1.g f15423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, List<String>> f15424c;
        public int d;
        public String e;
        public String f;

        public b url(String str) {
            this.f = str;
            return this;
        }

        public b message(String str) {
            this.e = str;
            return this;
        }

        public b headers(Map<String, List<String>> map) {
            this.f15424c = map;
            return this;
        }

        public b errorBody(ResponseBody responseBody) {
            if (responseBody == null || (responseBody instanceof h1.g)) {
                this.f15423b = (h1.g) responseBody;
                return this;
            }
            this.f15423b = new h1.g(responseBody);
            return this;
        }

        public b code(int i) {
            this.d = i;
            return this;
        }

        public u0<T> build() {
            return new u0<>(this);
        }

        public b body(T t) {
            this.f15422a = t;
            return this;
        }

        public b(u0<T> u0Var) {
            this.f15422a = (T) u0Var.f15419a;
            this.f15424c = u0Var.f15421c;
            this.d = u0Var.d;
            this.e = u0Var.e;
            this.f = u0Var.f;
            this.f15423b = u0Var.f15420b;
        }

        public b() {
        }
    }

    public static class c<T> extends Response.Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f15425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h1.g f15426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, List<String>> f15427c;
        public int d;
        public String e;
        public String f;

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response.Builder url(String str) {
            this.f = str;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response.Builder message(String str) {
            this.e = str;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response.Builder headers(Map<String, List<String>> map) {
            this.f15427c = map;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response.Builder errorBody(ResponseBody responseBody) {
            if (responseBody == null || (responseBody instanceof h1.g)) {
                this.f15426b = (h1.g) responseBody;
                return this;
            }
            this.f15426b = new h1.g(responseBody);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response.Builder code(int i) {
            this.d = i;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response<T> build() {
            return new u0(this);
        }

        @Override // com.huawei.hms.network.httpclient.Response.Builder
        public Response.Builder body(T t) {
            this.f15425a = t;
            return this;
        }

        public c(u0<T> u0Var) {
            this.f15425a = (T) u0Var.f15419a;
            this.f15427c = u0Var.f15421c;
            this.d = u0Var.d;
            this.e = u0Var.e;
            this.f = u0Var.f;
            this.f15426b = u0Var.f15420b;
        }

        public c() {
        }
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public int getCode() {
        return this.d;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public T getBody() {
        return this.f15419a;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public Response.Builder createBuilder() {
        return new c(this);
    }

    @Override // com.huawei.hms.network.httpclient.Response, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        T t = this.f15419a;
        if (t instanceof Closeable) {
            ((Closeable) t).close();
            this.f15419a = null;
        }
        h1.g gVar = this.f15420b;
        if (gVar != null) {
            gVar.close();
            this.f15420b = null;
        }
    }

    private void s() {
        if (this.f15420b == null && (this.f15419a instanceof h1.g) && !isSuccessful()) {
            this.f15420b = (h1.g) this.f15419a;
            this.f15419a = null;
        }
    }

    public static boolean hasBody(Response<ResponseBody> response) {
        int code = response.getCode();
        if ((code < 100 || code >= 200) && code != 204 && code != 304) {
            return true;
        }
        Headers headersOf = Headers.of(response.getHeaders());
        String str = headersOf.get("Content-Length");
        return !(str.isEmpty() || StringUtils.stringToLong(str, -1L) == -1) || "chunked".equalsIgnoreCase(headersOf.get("Transfer-Encoding"));
    }

    public u0(c<T> cVar) {
        this.f15419a = (T) cVar.f15425a;
        this.f15420b = cVar.f15426b;
        this.f15421c = cVar.f15427c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        s();
    }

    public u0(b<T> bVar) {
        this.f15419a = (T) bVar.f15422a;
        this.f15420b = bVar.f15423b;
        this.f15421c = bVar.f15424c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        s();
    }
}
