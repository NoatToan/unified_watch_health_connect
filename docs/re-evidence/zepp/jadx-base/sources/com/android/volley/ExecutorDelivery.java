package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorDelivery implements ResponseDelivery {
    private final Executor a;

    public class a implements Executor {
        public final /* synthetic */ Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public class b implements Runnable {
        private final Request a;
        private final Response b;
        private final Runnable c;

        public b(Request request, Response response, Runnable runnable) {
            this.a = request;
            this.b = response;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.isCanceled()) {
                this.a.finish("canceled-at-delivery");
                return;
            }
            if (this.b.isSuccess()) {
                this.a.deliverResponse(this.b.result);
            } else {
                this.a.deliverError(this.b.error);
            }
            if (this.b.intermediate) {
                this.a.addMarker("intermediate-response");
            } else {
                this.a.finish("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExecutorDelivery(Handler handler) {
        this.a = new a(handler);
    }

    @Override // com.android.volley.ResponseDelivery
    public void postError(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.a.execute(new b(request, Response.error(volleyError), null));
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(Request<?> request, Response<?> response) {
        postResponse(request, response, null);
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(Request<?> request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.a.execute(new b(request, response, runnable));
    }

    public ExecutorDelivery(Executor executor) {
        this.a = executor;
    }
}
