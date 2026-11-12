package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkDispatcher extends Thread {
    private final BlockingQueue<Request<?>> a;
    private final Network b;
    private final Cache c;
    private final ResponseDelivery d;
    private volatile boolean e = false;

    public NetworkDispatcher(BlockingQueue<Request<?>> blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.a = blockingQueue;
        this.b = network;
        this.c = cache;
        this.d = responseDelivery;
    }

    @TargetApi(14)
    private void a(Request<?> request) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
        }
    }

    private void b(Request<?> request, VolleyError volleyError) {
        this.d.postError(request, request.parseNetworkError(volleyError));
    }

    public void quit() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                Request<?> requestTake = this.a.take();
                try {
                    requestTake.addMarker("network-queue-take");
                    if (requestTake.isCanceled()) {
                        requestTake.finish("network-discard-cancelled");
                    } else {
                        a(requestTake);
                        NetworkResponse networkResponsePerformRequest = this.b.performRequest(requestTake);
                        requestTake.addMarker("network-http-complete");
                        if (networkResponsePerformRequest.notModified && requestTake.hasHadResponseDelivered()) {
                            requestTake.finish("not-modified");
                        } else {
                            Response<?> networkResponse = requestTake.parseNetworkResponse(networkResponsePerformRequest);
                            requestTake.addMarker("network-parse-complete");
                            if (requestTake.shouldCache() && networkResponse.cacheEntry != null && networkResponse.isSuccess()) {
                                this.c.put(requestTake.getCacheKey(), networkResponse.cacheEntry);
                                requestTake.addMarker("network-cache-written");
                            }
                            requestTake.markDelivered();
                            this.d.postResponse(requestTake, networkResponse);
                        }
                    }
                } catch (VolleyError e) {
                    e.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    b(requestTake, e);
                } catch (Exception e2) {
                    VolleyLog.e(e2, "Unhandled exception %s", e2.toString());
                    VolleyError volleyError = new VolleyError(e2);
                    volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.d.postError(requestTake, volleyError);
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
