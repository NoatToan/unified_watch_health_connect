package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class i6<T> extends Submit<T> {
    public static final String g = "RealSubmit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6<T, ?> f14910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f14911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Submit.Factory f14912c;
    public h1.h<T> d;
    public volatile boolean e;
    public boolean f;

    @Override // com.huawei.hms.network.httpclient.Submit
    public Request request() throws IOException {
        Request request;
        synchronized (this) {
            if (this.d == null) {
                this.d = a();
            }
            request = this.d.request();
        }
        return request;
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.f;
        }
        return z;
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public boolean isCanceled() {
        if (this.e) {
            return true;
        }
        h1.h<T> hVar = this.d;
        return hVar != null && hVar.isCanceled();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public RequestFinishedInfo getRequestFinishedInfo() {
        h1.h<T> hVar = this.d;
        if (hVar == null) {
            return null;
        }
        return hVar.getRequestFinishedInfo();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public Response<T> execute() throws IOException {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        if (this.e) {
            throw t0.a("Canceled");
        }
        if (this.d == null) {
            this.d = a();
        }
        return a(this.d.execute());
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void enqueue(Callback<T> callback) {
        if (callback == null) {
            throw new NullPointerException("callback cannot be null");
        }
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        try {
            if (this.e) {
                throw t0.a("Canceled");
            }
            if (this.d == null) {
                this.d = a();
            }
            this.d.enqueue(new a(callback));
        } catch (Exception e) {
            callback.onFailure(this, e);
        }
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    /* JADX INFO: renamed from: clone */
    public Submit<T> mo1386clone() {
        return new i6(this.f14912c, this.f14910a, this.f14911b);
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void cancel() {
        this.e = true;
        h1.h<T> hVar = this.d;
        if (hVar != null) {
            hVar.cancel();
        }
    }

    public class a extends Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14913a;

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit<T> submit, Response<T> response) {
            try {
                this.f14913a.onResponse(submit, i6.this.a(response));
            } catch (Exception e) {
                this.f14913a.onFailure(submit, e);
            }
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit<T> submit, Throwable th) {
            this.f14913a.onFailure(submit, th);
        }

        public a(Callback callback) {
            this.f14913a = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<T> a(Response<ResponseBody> response) throws IOException {
        u0.b bVar = new u0.b();
        bVar.headers(response.getHeaders());
        bVar.code(response.getCode());
        bVar.message(response.getMessage());
        bVar.url(response.getUrl());
        bVar.errorBody(response.getErrorBody());
        if (response.getBody() != null) {
            k6<T, ?> k6Var = this.f14910a;
            bVar.body(k6Var != null ? k6Var.a(response.getBody()) : null);
        }
        return bVar.build();
    }

    private h1.h<T> a() throws IOException {
        Submit.Factory factory = this.f14912c;
        Submit<ResponseBody> submitNewSubmit = factory.newSubmit(this.f14910a.a(factory, this.f14911b));
        if (submitNewSubmit != null) {
            return submitNewSubmit instanceof h1.h ? (h1.h) submitNewSubmit : new h1.h<>(submitNewSubmit);
        }
        throw new IOException("create submit error");
    }

    public i6(Submit.Factory factory, k6<T, ?> k6Var, Object[] objArr) {
        this.f14912c = factory;
        this.f14910a = k6Var;
        this.f14911b = objArr;
    }
}
