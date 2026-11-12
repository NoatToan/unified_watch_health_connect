package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class v0 extends Submit<ResponseBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15477c = "BuildInSubmit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f15478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15479b;

    @Override // com.huawei.hms.network.httpclient.Submit
    public h1.d request() {
        return this.f15478a.request();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.f15479b;
        }
        return z;
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public boolean isCanceled() {
        return this.f15478a.isCanceled();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f15478a.getFinishedInfo();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public Response<ResponseBody> execute() throws IOException {
        synchronized (this) {
            if (this.f15479b) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15479b = true;
        }
        return this.f15478a.execute();
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void enqueue(Callback<ResponseBody> callback) {
        if (callback == null) {
            throw new NullPointerException("callback cannot be null");
        }
        synchronized (this) {
            if (this.f15479b) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15479b = true;
        }
        e1.getInstance().execute(new a(new h1.a(callback)));
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callback<ResponseBody> f15480a;

        @Override // java.lang.Runnable
        public void run() {
            AutoCloseable autoCloseable = null;
            try {
                Response<ResponseBody> responseExecute = v0.this.f15478a.execute();
                if (v0.this.isCanceled()) {
                    throw t0.a("Canceled");
                }
                this.f15480a.onResponse(get(), responseExecute);
            } catch (IOException e) {
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException unused) {
                        Logger.w(v0.f15477c, "close response catch IOException", e);
                    }
                }
                if (0 != 0) {
                    Logger.w(v0.f15477c, "catch Exception", e);
                } else {
                    this.f15480a.onFailure(get(), e);
                }
            }
        }

        public Submit<ResponseBody> get() {
            return v0.this;
        }

        public a(Callback<ResponseBody> callback) {
            this.f15480a = callback;
        }
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    /* JADX INFO: renamed from: clone */
    public Submit<ResponseBody> mo1386clone() {
        return new v0(this.f15478a.getClient(), this.f15478a.request(), this.f15478a.getWebSocket());
    }

    @Override // com.huawei.hms.network.httpclient.Submit
    public void cancel() {
        this.f15478a.cancel();
    }

    public v0(a1 a1Var, h1.d dVar, WebSocket webSocket) {
        this.f15478a = new p2(this, a1Var, dVar, webSocket);
    }
}
