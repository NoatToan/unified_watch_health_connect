package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.util.TypeUtils;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.hms.network.restclient.SubmitAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public class f6 extends SubmitAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f14761a;

    public class b<T> extends Submit<T> {
        public static final String d = "ExecutorSubmit";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Submit<T> f14764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f14765b;

        @Override // com.huawei.hms.network.httpclient.Submit
        public Request request() throws IOException {
            return this.f14764a.request();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isExecuted() {
            return this.f14764a.isExecuted();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isCanceled() {
            return this.f14764a.isCanceled();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public RequestFinishedInfo getRequestFinishedInfo() {
            return this.f14764a.getRequestFinishedInfo();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public Response<T> execute() throws IOException {
            return this.f14764a.execute();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void enqueue(Callback<T> callback) {
            this.f14764a.enqueue(new a(callback));
        }

        public class a extends Callback<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Callback f14767a;

            /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f6$b$a$a, reason: collision with other inner class name */
            public class RunnableC0160a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Submit f14769a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Response f14770b;

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.isCanceled()) {
                        a.this.f14767a.onFailure(this.f14769a, t0.a("Canceled"));
                        return;
                    }
                    try {
                        a.this.f14767a.onResponse(this.f14769a, this.f14770b);
                    } catch (IOException unused) {
                        Logger.w(b.d, "ExecutorSubmit callback onResponse catch IOException");
                    }
                }

                public RunnableC0160a(Submit submit, Response response) {
                    this.f14769a = submit;
                    this.f14770b = response;
                }
            }

            /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f6$b$a$b, reason: collision with other inner class name */
            public class RunnableC0161b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Submit f14772a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Throwable f14773b;

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f14767a.onFailure(this.f14772a, this.f14773b);
                }

                public RunnableC0161b(Submit submit, Throwable th) {
                    this.f14772a = submit;
                    this.f14773b = th;
                }
            }

            @Override // com.huawei.hms.network.httpclient.Callback
            public void onResponse(Submit<T> submit, Response<T> response) {
                b.this.f14765b.execute(new RunnableC0160a(submit, response));
            }

            @Override // com.huawei.hms.network.httpclient.Callback
            public void onFailure(Submit<T> submit, Throwable th) {
                b.this.f14765b.execute(new RunnableC0161b(submit, th));
            }

            public a(Callback callback) {
                this.f14767a = callback;
            }
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        /* JADX INFO: renamed from: clone */
        public Submit mo1386clone() {
            return f6.this.new b(this.f14764a, this.f14765b);
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void cancel() {
            this.f14764a.cancel();
        }

        public b(Submit<T> submit, Executor executor) {
            this.f14764a = submit;
            this.f14765b = executor;
        }
    }

    public class a extends SubmitAdapter<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f14762a;

        @Override // com.huawei.hms.network.restclient.SubmitAdapter
        public Type responseType() {
            return this.f14762a;
        }

        @Override // com.huawei.hms.network.restclient.SubmitAdapter
        /* JADX INFO: renamed from: adapt */
        public Object adapt2(Submit<Object> submit) {
            f6 f6Var = f6.this;
            return f6Var.new b(submit, f6Var.f14761a);
        }

        public a(Type type) {
            this.f14762a = type;
        }
    }

    @Override // com.huawei.hms.network.restclient.SubmitAdapter.Factory
    public SubmitAdapter<?, ?> get(Type type, Annotation[] annotationArr, RestClient restClient) {
        return new a(TypeUtils.getSubmitResponseType(type));
    }

    public f6(Executor executor) {
        this.f14761a = executor;
    }
}
