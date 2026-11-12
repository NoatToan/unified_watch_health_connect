package com.garmin.android.library.backgroundtaskmanagement;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<List<com.garmin.android.library.backgroundtaskmanagement.d>> f50091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<com.garmin.android.library.backgroundtaskmanagement.d> f50092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f50093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<c> f50094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f50095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f50096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f50097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f50098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SoftReference<a> f50099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SoftReference<InterfaceC0995b> f50100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f50101k;

    public interface a {
        void E(b bVar);

        void J(b bVar, e eVar, Object obj);
    }

    /* JADX INFO: renamed from: com.garmin.android.library.backgroundtaskmanagement.b$b, reason: collision with other inner class name */
    public interface InterfaceC0995b<T> {
        void onComplete(long j8, c cVar);

        void onResults(long j8, e eVar, T t7);
    }

    public enum c {
        SUCCESS,
        RECOVERABLE,
        NO_NETWORK,
        NO_DATA,
        SERVER_UNAVAILABLE,
        UNAUTHORIZED,
        USER_NOT_AUTHENTICATED,
        USER_NOT_AUTHORIZED,
        DEVICE_TIMEOUT,
        UNRECOVERABLE,
        CONTEXT_NULL
    }

    public enum d {
        BACKGROUND_PRIORITY,
        DEFAULT_PRIORITY,
        UI_PRIORITY,
        HIGH_PRIORITY
    }

    public enum e {
        CACHED,
        SOURCE,
        MIXED
    }

    public b(d dVar, a aVar, boolean z14) {
        this.f50094d = new AtomicReference<>(c.SUCCESS);
        this.f50095e = new AtomicInteger(0);
        this.f50098h = new AtomicBoolean(false);
        this.f50091a = new ConcurrentLinkedQueue<>();
        this.f50099i = new SoftReference<>(aVar);
        this.f50093c = dVar;
        this.f50100j = null;
        this.f50097g = new ConcurrentHashMap();
        this.f50101k = z14;
    }

    public void b(com.garmin.android.library.backgroundtaskmanagement.d dVar) {
        if (dVar != null) {
            dVar.f137396a = this.f50093c.ordinal();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(dVar);
            this.f50091a.add(arrayList);
        }
    }

    public void c(List<com.garmin.android.library.backgroundtaskmanagement.d> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f50091a.add(new ArrayList(list));
    }

    public final void d() {
        List<com.garmin.android.library.backgroundtaskmanagement.d> list = this.f50092b;
        if (list != null && !list.isEmpty()) {
            for (com.garmin.android.library.backgroundtaskmanagement.d dVar : this.f50092b) {
                if (dVar != null) {
                    dVar.b();
                    dVar.f50131d.set(true);
                    AtomicReference<Thread> atomicReference = dVar.f50130c;
                    if (atomicReference.get() != null && atomicReference.get().isAlive() && atomicReference.get().isInterrupted()) {
                        atomicReference.get().interrupt();
                    }
                }
            }
        }
        ConcurrentLinkedQueue<List<com.garmin.android.library.backgroundtaskmanagement.d>> concurrentLinkedQueue = this.f50091a;
        if (concurrentLinkedQueue != null) {
            while (!concurrentLinkedQueue.isEmpty()) {
                concurrentLinkedQueue.remove();
            }
        }
        this.f50098h.set(true);
    }

    public final void e() {
        List<com.garmin.android.library.backgroundtaskmanagement.d> listPoll = this.f50091a.poll();
        this.f50092b = listPoll;
        if (listPoll != null) {
            this.f50095e.set(listPoll.size());
            for (com.garmin.android.library.backgroundtaskmanagement.d dVar : this.f50092b) {
                pd2.a aVar = pd2.a.f137390c;
                AtomicLong atomicLong = dVar.f50132e;
                if (atomicLong.get() <= 0) {
                    AtomicLong atomicLong2 = aVar.f137394b;
                    long andIncrement = atomicLong2.getAndIncrement();
                    if (andIncrement == Long.MAX_VALUE) {
                        atomicLong2.set(1L);
                    }
                    atomicLong.set(andIncrement);
                }
                aVar.f137393a.execute(dVar);
                atomicLong.get();
            }
        }
    }

    public final c f() {
        return this.f50094d.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g() {
        AtomicReference<c> atomicReference;
        ConcurrentHashMap concurrentHashMap;
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.f50124a.remove(Long.valueOf(this.f50096f));
        SoftReference<a> softReference = this.f50099i;
        if (softReference == null || softReference.get() == null) {
            return;
        }
        if (!this.f50098h.get() && (atomicReference = this.f50094d) != null && atomicReference.get() == c.SUCCESS && (concurrentHashMap = this.f50097g) != null) {
            e eVar = e.SOURCE;
            Object obj = concurrentHashMap.get(eVar);
            if (obj != null) {
                h(eVar, obj);
            } else {
                e eVar2 = e.CACHED;
                Object obj2 = concurrentHashMap.get(eVar2);
                if (obj2 != null) {
                    h(eVar2, obj2);
                } else {
                    e eVar3 = e.MIXED;
                    Object obj3 = concurrentHashMap.get(eVar3);
                    if (obj3 != null) {
                        h(eVar3, obj3);
                    }
                }
            }
        }
        softReference.get().E(this);
    }

    public final void h(e eVar, T t7) {
        SoftReference<a> softReference;
        a aVar;
        if (this.f50098h.get() || (softReference = this.f50099i) == null || (aVar = softReference.get()) == null) {
            return;
        }
        aVar.J(this, eVar, t7);
    }

    public final void i(e eVar, T t7) {
        this.f50097g.put(eVar, t7);
    }

    public void j(com.garmin.android.library.backgroundtaskmanagement.d dVar, c cVar) {
        AtomicReference<c> atomicReference = this.f50094d;
        c cVar2 = atomicReference.get();
        if (!dVar.f50128h) {
            atomicReference.set(c.SUCCESS);
        } else if (cVar2 == null || cVar2.ordinal() < cVar.ordinal()) {
            atomicReference.set(cVar);
        }
        if (this.f50098h.get() || this.f50095e.decrementAndGet() != 0) {
            return;
        }
        if (this.f50091a.isEmpty()) {
            g();
        } else if (!this.f50101k || atomicReference.get() == c.SUCCESS) {
            e();
        } else {
            g();
        }
    }

    public b(d dVar, a aVar) {
        this(dVar, aVar, true);
    }
}
