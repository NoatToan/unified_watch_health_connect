package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RequestQueue {
    private static final int l = 5;
    private AtomicInteger a;
    private final Map<String, Queue<Request<?>>> b;
    private final Set<Request<?>> c;
    private final PriorityBlockingQueue<Request<?>> d;
    private final PriorityBlockingQueue<Request<?>> e;
    private final Cache f;
    private final Network g;
    private final ResponseDelivery h;
    private NetworkDispatcher[] i;
    private CacheDispatcher j;
    private List<RequestFinishedListener> k;

    public interface RequestFilter {
        boolean apply(Request<?> request);
    }

    public interface RequestFinishedListener<T> {
        void onRequestFinished(Request<T> request);
    }

    public class a implements RequestFilter {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // com.android.volley.RequestQueue.RequestFilter
        public boolean apply(Request<?> request) {
            return request.getTag() == this.a;
        }
    }

    public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue<>();
        this.e = new PriorityBlockingQueue<>();
        this.k = new ArrayList();
        this.f = cache;
        this.g = network;
        this.i = new NetworkDispatcher[i];
        this.h = responseDelivery;
    }

    public <T> void a(Request<T> request) {
        synchronized (this.c) {
            this.c.remove(request);
        }
        synchronized (this.k) {
            Iterator<RequestFinishedListener> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next().onRequestFinished(request);
            }
        }
        if (request.shouldCache()) {
            synchronized (this.b) {
                String cacheKey = request.getCacheKey();
                Queue<Request<?>> queueRemove = this.b.remove(cacheKey);
                if (queueRemove != null) {
                    if (VolleyLog.DEBUG) {
                        VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queueRemove.size()), cacheKey);
                    }
                    this.d.addAll(queueRemove);
                }
            }
        }
    }

    public <T> Request<T> add(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.c) {
            this.c.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        if (!request.shouldCache()) {
            this.e.add(request);
            return request;
        }
        synchronized (this.b) {
            String cacheKey = request.getCacheKey();
            if (this.b.containsKey(cacheKey)) {
                Queue<Request<?>> linkedList = this.b.get(cacheKey);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                linkedList.add(request);
                this.b.put(cacheKey, linkedList);
                if (VolleyLog.DEBUG) {
                    VolleyLog.v("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                }
            } else {
                this.b.put(cacheKey, null);
                this.d.add(request);
            }
        }
        return request;
    }

    public <T> void addRequestFinishedListener(RequestFinishedListener<T> requestFinishedListener) {
        synchronized (this.k) {
            this.k.add(requestFinishedListener);
        }
    }

    public void cancelAll(RequestFilter requestFilter) {
        synchronized (this.c) {
            for (Request<?> request : this.c) {
                if (requestFilter.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    public Cache getCache() {
        return this.f;
    }

    public int getSequenceNumber() {
        return this.a.incrementAndGet();
    }

    public <T> void removeRequestFinishedListener(RequestFinishedListener<T> requestFinishedListener) {
        synchronized (this.k) {
            this.k.remove(requestFinishedListener);
        }
    }

    public void start() {
        stop();
        CacheDispatcher cacheDispatcher = new CacheDispatcher(this.d, this.e, this.f, this.h);
        this.j = cacheDispatcher;
        cacheDispatcher.start();
        for (int i = 0; i < this.i.length; i++) {
            NetworkDispatcher networkDispatcher = new NetworkDispatcher(this.e, this.g, this.f, this.h);
            this.i[i] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        CacheDispatcher cacheDispatcher = this.j;
        if (cacheDispatcher != null) {
            cacheDispatcher.quit();
        }
        int i = 0;
        while (true) {
            NetworkDispatcher[] networkDispatcherArr = this.i;
            if (i >= networkDispatcherArr.length) {
                return;
            }
            if (networkDispatcherArr[i] != null) {
                networkDispatcherArr[i].quit();
            }
            i++;
        }
    }

    public void cancelAll(Object obj) {
        if (obj != null) {
            cancelAll((RequestFilter) new a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public RequestQueue(Cache cache, Network network, int i) {
        this(cache, network, i, new ExecutorDelivery(new Handler(Looper.getMainLooper())));
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 5);
    }
}
