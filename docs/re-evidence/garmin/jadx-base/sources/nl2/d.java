package nl2;

import android.util.SparseArray;
import com.garmin.device.multilink.MultiLinkClosedException;
import com.google.common.base.Predicate;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import ha.j;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ml2.m;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pj2.k;
import pj2.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Closeable, l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f126508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f126509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UUID f126510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UUID f126511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f126512g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<a<? extends f>> f126506a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<e> f126507b = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f126513h = Executors.newScheduledThreadPool(1);

    public static final class a<T extends f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SettableFuture<T> f126514a = SettableFuture.create();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Predicate<f> f126515b;

        public a(Predicate<f> predicate) {
            this.f126515b = predicate;
        }
    }

    public d(k kVar, UUID uuid, UUID uuid2, long j8) {
        if (kVar == null) {
            vb.h.s("gatt is null");
            throw null;
        }
        if (uuid == null || uuid2 == null) {
            vb.h.s("characteristic is null");
            throw null;
        }
        this.f126508c = LoggerFactory.getLogger(m.a("CommandManager", kVar.getMacAddress(), this));
        this.f126509d = kVar;
        this.f126510e = uuid;
        this.f126511f = uuid2;
        this.f126512g = j8;
        kVar.a(this, m.f119394a, uuid);
    }

    public static int e(int i14, int i15) {
        return ((i14 & 255) << 16) | (i15 & 65535);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // pj2.l
    public final void a(k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
        byte b14;
        f fVarA;
        a<? extends f> aVar;
        if (this.f126510e.equals(uuid2) && bArr != null && bArr.length >= 13 && (b14 = bArr[0]) == 0) {
            byte b15 = bArr[1];
            if (b15 == -1) {
                fVarA = i.a(bArr);
            } else if (b15 != 1) {
                fVarA = null;
                if (b15 != 6) {
                    if (b15 == 3) {
                        fVarA = b.a(bArr);
                    } else if (b15 != 4) {
                        this.f126508c.warn("Unknown command: {}", Byte.valueOf(b15));
                    } else {
                        fVarA = g.a(bArr);
                    }
                } else if (bArr.length >= 13 && b14 == 0 && b15 == 6) {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 2, bArr.length - 2);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    long j8 = byteBufferWrap.getLong();
                    byteBufferWrap.getShort();
                    fVarA = new nl2.a(j8, byteBufferWrap.get());
                }
            } else {
                fVarA = h.a(bArr);
            }
            if (fVarA == null) {
                this.f126508c.warn("Multi-Link command failed to parse.");
                return;
            }
            int i14 = fVarA.f126516a;
            if (i14 == 4) {
                g gVar = (g) fVarA;
                this.f126508c.trace("Invalid Multi-Link handle: {}", Integer.valueOf(gVar.f126519d));
                e eVar = this.f126507b.get();
                if (eVar != null) {
                    eVar.c(gVar.f126519d);
                    return;
                }
                return;
            }
            if (fVarA.f126517b != this.f126512g) {
                return;
            }
            if (i14 == 3) {
                b bVar = (b) fVarA;
                this.f126508c.trace("Handle closed: {}", Integer.valueOf(bVar.f126502d));
                e eVar2 = this.f126507b.get();
                if (eVar2 != null) {
                    eVar2.a(bVar.f126502d);
                }
            }
            int i15 = fVarA.f126516a;
            if (i15 == -1) {
                i15 = ((i) fVarA).f126525d;
            }
            int iE = e(i15, fVarA.f126518c);
            synchronized (this.f126506a) {
                aVar = this.f126506a.get(iE);
            }
            if (aVar != null) {
                if (fVarA.f126516a == -1) {
                    aVar.f126514a.setException(new IOException("Unknown command type"));
                    return;
                }
                try {
                    if (aVar.f126515b.apply(fVarA)) {
                        aVar.f126514a.set((T) fVarA);
                    }
                } catch (Exception e4) {
                    this.f126508c.warn("Failed to run predicate on handler", (Throwable) e4);
                    aVar.f126514a.setException(e4);
                }
            }
        }
    }

    public final ListenableFuture<nl2.a> c() {
        this.f126508c.trace("Closing all handles");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.putLong(this.f126512g);
        byteBufferAllocate.putShort((short) 0);
        return j(e(6, 0), byteBufferAllocate.array(), new j(2), 5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SparseArray<a<? extends f>> sparseArray;
        this.f126509d.w(this);
        this.f126513h.shutdownNow();
        ArrayList arrayList = new ArrayList();
        synchronized (this.f126506a) {
            int i14 = 0;
            while (true) {
                try {
                    int size = this.f126506a.size();
                    sparseArray = this.f126506a;
                    if (i14 >= size) {
                        break;
                    }
                    arrayList.add(this.f126506a.get(sparseArray.keyAt(i14)).f126514a);
                    i14++;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            sparseArray.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SettableFuture) it.next()).setException(new MultiLinkClosedException("Multi-Link connection closed"));
        }
    }

    public final ListenableFuture<h> f(final int i14, int i15) {
        this.f126508c.trace("Register {}", Integer.valueOf(i14));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(13);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putLong(this.f126512g);
        byteBufferAllocate.putShort((short) i14);
        if (i15 >= 0) {
            byteBufferAllocate.put((byte) i15);
            return j(e(1, i14), byteBufferAllocate.array(), new Predicate() { // from class: nl2.c
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    d dVar = this.f126504a;
                    dVar.getClass();
                    if (((h) ((f) obj)).f126520d != 2) {
                        return true;
                    }
                    dVar.f126508c.debug("Register {} pending auth", Integer.valueOf(i14));
                    return false;
                }
            }, 30);
        }
        vb.h.s("Invalid command flags");
        return null;
    }

    public final <T extends f> ListenableFuture<T> j(int i14, byte[] bArr, Predicate<f> predicate, int i15) {
        ListenableFuture<T> listenableFutureImmediateFailedFuture;
        a<? extends f> aVar = new a<>(predicate);
        synchronized (this.f126506a) {
            this.f126506a.put(i14, aVar);
        }
        try {
            listenableFutureImmediateFailedFuture = Futures.withTimeout(Futures.transformAsync(this.f126509d.j(m.f119394a, this.f126511f, bArr), new jn2.k(aVar, 4), MoreExecutors.directExecutor()), i15, TimeUnit.SECONDS, this.f126513h);
        } catch (RejectedExecutionException unused) {
            this.f126508c.error("Operation rejected. Multi-Link is closed");
            listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(new MultiLinkClosedException("Multi-Link connection closed"));
        }
        listenableFutureImmediateFailedFuture.addListener(new androidx.media3.exoplayer.d(this, i14, 12), MoreExecutors.directExecutor());
        return listenableFutureImmediateFailedFuture;
    }
}
