package ml2;

import com.garmin.device.multilink.MultiLinkClosedException;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f119361a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f119362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f119363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<Integer, Queue<a>> f119364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pj2.k f119365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UUID f119366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f119367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f119368h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f119369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SettableFuture<Void> f119370b = SettableFuture.create();

        public a(byte[] bArr) {
            this.f119369a = bArr;
        }
    }

    public i0(pj2.k kVar, UUID uuid) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f119362b = reentrantLock;
        this.f119363c = reentrantLock.newCondition();
        this.f119364d = new HashMap<>();
        if (kVar == null) {
            vb.h.s("gatt is null");
            throw null;
        }
        if (uuid == null) {
            vb.h.s("characteristic is null");
            throw null;
        }
        this.f119365e = kVar;
        this.f119366f = uuid;
    }

    public final ListenableFuture<Void> a(int i14, byte[] bArr) {
        HashMap<Integer, Queue<a>> map = this.f119364d;
        ReentrantLock reentrantLock = this.f119362b;
        reentrantLock.lock();
        try {
            if (this.f119361a.get() != 1) {
                return Futures.immediateFailedFuture(new MultiLinkClosedException("Multi-Link connection closed"));
            }
            Queue<a> linkedList = map.get(Integer.valueOf(i14));
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                map.put(Integer.valueOf(i14), linkedList);
            }
            a aVar = new a(bArr);
            linkedList.add(aVar);
            this.f119368h = true;
            this.f119363c.signal();
            return aVar.f119370b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f119362b;
        reentrantLock.lock();
        try {
            if (!this.f119361a.compareAndSet(1, 2)) {
                reentrantLock.unlock();
                return;
            }
            this.f119367g.interrupt();
            for (Queue<a> queue : this.f119364d.values()) {
                while (true) {
                    a aVarPoll = queue.poll();
                    if (aVarPoll != null) {
                        aVarPoll.f119370b.setException(new MultiLinkClosedException("Multi-Link connection closed"));
                    }
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
