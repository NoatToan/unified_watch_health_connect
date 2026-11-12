package okhttp3;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes23.dex */
public final class ConnectionPool {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    public static final /* synthetic */ boolean h = false;
    private final int a;
    private final long b;
    private final Runnable c;
    private final Deque<RealConnection> d;
    public final RouteDatabase e;
    public boolean f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jA = ConnectionPool.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j = jA / 1000000;
                    long j2 = jA - (1000000 * j);
                    synchronized (ConnectionPool.this) {
                        try {
                            ConnectionPool.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    private int e(RealConnection realConnection, long j) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i = 0;
        while (i < list.size()) {
            Reference<StreamAllocation> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((StreamAllocation.StreamAllocationReference) reference).callStackTrace);
                list.remove(i);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public long a(long j) {
        synchronized (this) {
            RealConnection realConnection = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (RealConnection realConnection2 : this.d) {
                if (e(realConnection2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - realConnection2.idleAtNanos;
                    if (j3 > j2) {
                        realConnection = realConnection2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.b;
            if (j2 < j4 && i <= this.a) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f = false;
                return -1L;
            }
            this.d.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            return 0L;
        }
    }

    public boolean b(RealConnection realConnection) {
        if (realConnection.noNewStreams || this.a == 0) {
            this.d.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    @Nullable
    public Socket c(Address address, StreamAllocation streamAllocation) {
        for (RealConnection realConnection : this.d) {
            if (realConnection.isEligible(address, null) && realConnection.isMultiplexed() && realConnection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(realConnection);
            }
        }
        return null;
    }

    public synchronized int connectionCount() {
        return this.d.size();
    }

    @Nullable
    public RealConnection d(Address address, StreamAllocation streamAllocation, Route route) {
        for (RealConnection realConnection : this.d) {
            if (realConnection.isEligible(address, route)) {
                streamAllocation.acquire(realConnection, true);
                return realConnection;
            }
        }
        return null;
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealConnection> it2 = this.d.iterator();
            while (it2.hasNext()) {
                RealConnection next = it2.next();
                if (next.allocations.isEmpty()) {
                    next.noNewStreams = true;
                    arrayList.add(next);
                    it2.remove();
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Util.closeQuietly(((RealConnection) it3.next()).socket());
        }
    }

    public void f(RealConnection realConnection) {
        if (!this.f) {
            this.f = true;
            g.execute(this.c);
        }
        this.d.add(realConnection);
    }

    public synchronized int idleConnectionCount() {
        int i;
        i = 0;
        Iterator<RealConnection> it2 = this.d.iterator();
        while (it2.hasNext()) {
            if (it2.next().allocations.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this.c = new a();
        this.d = new ArrayDeque();
        this.e = new RouteDatabase();
        this.a = i;
        this.b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }
}
