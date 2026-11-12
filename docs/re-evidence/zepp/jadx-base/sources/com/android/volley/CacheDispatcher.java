package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class CacheDispatcher extends Thread {
    private static final boolean f = VolleyLog.DEBUG;
    private final BlockingQueue<Request<?>> a;
    private final BlockingQueue<Request<?>> b;
    private final Cache c;
    private final ResponseDelivery d;
    private volatile boolean e = false;

    public class a implements Runnable {
        public final /* synthetic */ Request a;

        public a(Request request) {
            this.a = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CacheDispatcher.this.b.put(this.a);
            } catch (InterruptedException unused) {
            }
        }
    }

    public CacheDispatcher(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.a = blockingQueue;
        this.b = blockingQueue2;
        this.c = cache;
        this.d = responseDelivery;
    }

    public void quit() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f) {
            VolleyLog.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.c.initialize();
        while (true) {
            try {
                Request<?> requestTake = this.a.take();
                requestTake.addMarker("cache-queue-take");
                if (requestTake.isCanceled()) {
                    requestTake.finish("cache-discard-canceled");
                } else {
                    Cache.Entry entry = this.c.get(requestTake.getCacheKey());
                    if (entry == null) {
                        requestTake.addMarker("cache-miss");
                        this.b.put(requestTake);
                    } else if (entry.isExpired()) {
                        requestTake.addMarker("cache-hit-expired");
                        this.b.put(requestTake);
                    } else {
                        requestTake.addMarker("cache-hit");
                        Response<?> networkResponse = requestTake.parseNetworkResponse(new NetworkResponse(entry.data, entry.responseHeaders));
                        requestTake.addMarker("cache-hit-parsed");
                        if (entry.refreshNeeded()) {
                            requestTake.addMarker("cache-hit-refresh-needed");
                            requestTake.setCacheEntry(entry);
                            networkResponse.intermediate = true;
                            this.d.postResponse(requestTake, networkResponse, new a(requestTake));
                        } else {
                            this.d.postResponse(requestTake, networkResponse);
                        }
                    }
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
