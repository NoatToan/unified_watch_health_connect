package com.loopj.android.http;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes18.dex */
public class AsyncHttpRequest implements Runnable {
    private final AbstractHttpClient client;
    private final HttpContext context;
    private int executionCount;
    private final HttpUriRequest request;
    private final ResponseHandlerInterface responseHandler;
    private boolean isCancelled = false;
    private boolean cancelIsNotified = false;
    private boolean isFinished = false;

    public AsyncHttpRequest(AbstractHttpClient abstractHttpClient, HttpContext httpContext, HttpUriRequest httpUriRequest, ResponseHandlerInterface responseHandlerInterface) {
        this.client = abstractHttpClient;
        this.context = httpContext;
        this.request = httpUriRequest;
        this.responseHandler = responseHandlerInterface;
    }

    private void makeRequest() throws IOException {
        ResponseHandlerInterface responseHandlerInterface;
        if (isCancelled()) {
            return;
        }
        if (this.request.getURI().getScheme() == null) {
            throw new MalformedURLException("No valid URI scheme was provided");
        }
        HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.client, this.request, this.context);
        if (isCancelled() || (responseHandlerInterface = this.responseHandler) == null) {
            return;
        }
        responseHandlerInterface.sendResponseMessage(httpResponseExecute);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0009 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private void makeRequestWithRetries() throws IOException {
        IOException iOException;
        boolean zRetryRequest;
        ResponseHandlerInterface responseHandlerInterface;
        HttpRequestRetryHandler httpRequestRetryHandler = this.client.getHttpRequestRetryHandler();
        IOException e = null;
        boolean zRetryRequest2 = true;
        while (zRetryRequest2) {
            try {
                try {
                    try {
                        makeRequest();
                        return;
                    } catch (UnknownHostException e2) {
                        iOException = new IOException("UnknownHostException exception: " + e2.getMessage());
                        if (this.executionCount > 0) {
                            int i = this.executionCount + 1;
                            this.executionCount = i;
                            if (httpRequestRetryHandler.retryRequest(iOException, i, this.context)) {
                                zRetryRequest = true;
                            } else {
                                zRetryRequest = false;
                            }
                        } else {
                            zRetryRequest = false;
                        }
                        IOException iOException2 = iOException;
                        zRetryRequest2 = zRetryRequest;
                        e = iOException2;
                        if (!zRetryRequest2 && (responseHandlerInterface = this.responseHandler) != null) {
                            responseHandlerInterface.sendRetryMessage(this.executionCount);
                        }
                    }
                } catch (NullPointerException e3) {
                    iOException = new IOException("NPE in HttpClient: " + e3.getMessage());
                    int i2 = this.executionCount + 1;
                    this.executionCount = i2;
                    zRetryRequest = httpRequestRetryHandler.retryRequest(iOException, i2, this.context);
                    IOException iOException3 = iOException;
                    zRetryRequest2 = zRetryRequest;
                    e = iOException3;
                    if (!zRetryRequest2) {
                    }
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    if (isCancelled()) {
                        return;
                    }
                    int i3 = this.executionCount + 1;
                    this.executionCount = i3;
                    zRetryRequest2 = httpRequestRetryHandler.retryRequest(e, i3, this.context);
                    if (!zRetryRequest2) {
                    }
                } catch (Exception e5) {
                    Log.e("AsyncHttpRequest", "Unhandled exception origin cause", e5);
                    throw new IOException("Unhandled exception: " + e5.getMessage());
                }
            }
        }
    }

    private synchronized void sendCancelNotification() {
        if (!this.isFinished && this.isCancelled && !this.cancelIsNotified) {
            this.cancelIsNotified = true;
            ResponseHandlerInterface responseHandlerInterface = this.responseHandler;
            if (responseHandlerInterface != null) {
                responseHandlerInterface.sendCancelMessage();
            }
        }
    }

    public boolean cancel(boolean z) {
        this.isCancelled = true;
        this.request.abort();
        return isCancelled();
    }

    public boolean isCancelled() {
        if (this.isCancelled) {
            sendCancelNotification();
        }
        return this.isCancelled;
    }

    public boolean isDone() {
        return isCancelled() || this.isFinished;
    }

    @Override // java.lang.Runnable
    public void run() {
        ResponseHandlerInterface responseHandlerInterface;
        if (isCancelled()) {
            return;
        }
        ResponseHandlerInterface responseHandlerInterface2 = this.responseHandler;
        if (responseHandlerInterface2 != null) {
            responseHandlerInterface2.sendStartMessage();
        }
        if (isCancelled()) {
            return;
        }
        try {
            makeRequestWithRetries();
        } catch (IOException e) {
            if (isCancelled() || (responseHandlerInterface = this.responseHandler) == null) {
                Log.e("AsyncHttpRequest", "makeRequestWithRetries returned error, but handler is null", e);
            } else {
                responseHandlerInterface.sendFailureMessage(0, null, null, e);
            }
        }
        if (isCancelled()) {
            return;
        }
        ResponseHandlerInterface responseHandlerInterface3 = this.responseHandler;
        if (responseHandlerInterface3 != null) {
            responseHandlerInterface3.sendFinishMessage();
        }
        this.isFinished = true;
    }
}
