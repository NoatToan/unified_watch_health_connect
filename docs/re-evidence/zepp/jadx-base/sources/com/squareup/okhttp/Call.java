package com.squareup.okhttp;

import androidx.core.app.NotificationCompat;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes18.dex */
public class Call {
    public volatile boolean canceled;
    private final OkHttpClient client;
    public HttpEngine engine;
    private boolean executed;
    public Request originalRequest;

    public class ApplicationInterceptorChain implements Interceptor.Chain {
        private final boolean forWebSocket;
        private final int index;
        private final Request request;

        public ApplicationInterceptorChain(int i, Request request, boolean z) {
            this.index = i;
            this.request = request;
            this.forWebSocket = z;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Connection connection() {
            return null;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Response proceed(Request request) throws IOException {
            if (this.index >= Call.this.client.interceptors().size()) {
                return Call.this.getResponse(request, this.forWebSocket);
            }
            ApplicationInterceptorChain applicationInterceptorChain = Call.this.new ApplicationInterceptorChain(this.index + 1, request, this.forWebSocket);
            Interceptor interceptor = Call.this.client.interceptors().get(this.index);
            Response responseIntercept = interceptor.intercept(applicationInterceptorChain);
            if (responseIntercept != null) {
                return responseIntercept;
            }
            throw new NullPointerException("application interceptor " + interceptor + " returned null");
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Request request() {
            return this.request;
        }
    }

    public final class AsyncCall extends NamedRunnable {
        private final boolean forWebSocket;
        private final Callback responseCallback;

        public void cancel() {
            Call.this.cancel();
        }

        @Override // com.squareup.okhttp.internal.NamedRunnable
        public void execute() {
            IOException e;
            boolean z = true;
            try {
                try {
                    Response responseWithInterceptorChain = Call.this.getResponseWithInterceptorChain(this.forWebSocket);
                    try {
                        if (Call.this.canceled) {
                            this.responseCallback.onFailure(Call.this.originalRequest, new IOException("Canceled"));
                        } else {
                            this.responseCallback.onResponse(responseWithInterceptorChain);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            Internal.logger.log(Level.INFO, "Callback failure for " + Call.this.toLoggableString(), (Throwable) e);
                        } else {
                            Call call = Call.this;
                            HttpEngine httpEngine = call.engine;
                            this.responseCallback.onFailure(httpEngine == null ? call.originalRequest : httpEngine.getRequest(), e);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    z = false;
                }
            } finally {
                Call.this.client.getDispatcher().finished(this);
            }
        }

        public Call get() {
            return Call.this;
        }

        public String host() {
            return Call.this.originalRequest.httpUrl().host();
        }

        public Request request() {
            return Call.this.originalRequest;
        }

        public Object tag() {
            return Call.this.originalRequest.tag();
        }

        private AsyncCall(Callback callback, boolean z) {
            super("OkHttp %s", Call.this.originalRequest.urlString());
            this.responseCallback = callback;
            this.forWebSocket = z;
        }
    }

    public Call(OkHttpClient okHttpClient, Request request) {
        this.client = okHttpClient.copyWithDefaults();
        this.originalRequest = request;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response getResponseWithInterceptorChain(boolean z) throws IOException {
        return new ApplicationInterceptorChain(0, this.originalRequest, z).proceed(this.originalRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toLoggableString() {
        return (this.canceled ? "canceled call" : NotificationCompat.CATEGORY_CALL) + " to " + this.originalRequest.httpUrl().resolve("/...");
    }

    public void cancel() {
        this.canceled = true;
        HttpEngine httpEngine = this.engine;
        if (httpEngine != null) {
            httpEngine.cancel();
        }
    }

    public void enqueue(Callback callback) {
        enqueue(callback, false);
    }

    public Response execute() throws IOException {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        try {
            this.client.getDispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain(false);
            if (responseWithInterceptorChain == null) {
                throw new IOException("Canceled");
            }
            this.client.getDispatcher().finished(this);
            return responseWithInterceptorChain;
        } catch (Throwable th) {
            this.client.getDispatcher().finished(this);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    public Response getResponse(Request request, boolean z) throws Throwable {
        StreamAllocation streamAllocation;
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            Request.Builder builderNewBuilder = request.newBuilder();
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                builderNewBuilder.header("Content-Type", mediaTypeContentType.toString());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header("Content-Length", Long.toString(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader("Content-Length");
            }
            request = builderNewBuilder.build();
        }
        this.engine = new HttpEngine(this.client, request, false, false, z, null, null, null);
        int i = 0;
        while (!this.canceled) {
            boolean z2 = true;
            try {
                try {
                    try {
                        this.engine.sendRequest();
                        this.engine.readResponse();
                        Response response = this.engine.getResponse();
                        Request requestFollowUpRequest = this.engine.followUpRequest();
                        if (requestFollowUpRequest == null) {
                            if (!z) {
                                this.engine.releaseStreamAllocation();
                            }
                            return response;
                        }
                        StreamAllocation streamAllocationClose = this.engine.close();
                        i++;
                        if (i > 20) {
                            streamAllocationClose.release();
                            throw new ProtocolException("Too many follow-up requests: " + i);
                        }
                        if (this.engine.sameConnection(requestFollowUpRequest.httpUrl())) {
                            streamAllocation = streamAllocationClose;
                        } else {
                            streamAllocationClose.release();
                            streamAllocation = null;
                        }
                        this.engine = new HttpEngine(this.client, requestFollowUpRequest, false, false, z, streamAllocation, null, response);
                    } catch (IOException e) {
                        HttpEngine httpEngineRecover = this.engine.recover(e, null);
                        if (httpEngineRecover == null) {
                            throw e;
                        }
                        try {
                            this.engine = httpEngineRecover;
                        } catch (Throwable th) {
                            th = th;
                            z2 = false;
                            if (z2) {
                                this.engine.close().release();
                            }
                            throw th;
                        }
                    }
                } catch (RequestException e2) {
                    throw e2.getCause();
                } catch (RouteException e3) {
                    HttpEngine httpEngineRecover2 = this.engine.recover(e3);
                    if (httpEngineRecover2 == null) {
                        throw e3.getLastConnectException();
                    }
                    this.engine = httpEngineRecover2;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z2) {
                    this.engine.close().release();
                }
                throw th;
            }
        }
        this.engine.releaseStreamAllocation();
        throw new IOException("Canceled");
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Object tag() {
        return this.originalRequest.tag();
    }

    public void enqueue(Callback callback, boolean z) {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        this.client.getDispatcher().enqueue(new AsyncCall(callback, z));
    }
}
