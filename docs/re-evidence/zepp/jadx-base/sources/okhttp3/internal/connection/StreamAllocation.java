package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes23.dex */
public final class StreamAllocation {
    public static final /* synthetic */ boolean l = false;
    private RouteSelector.Selection a;
    public final Address address;
    private Route b;
    private final ConnectionPool c;
    public final Call call;
    private final Object d;
    private final RouteSelector e;
    public final EventListener eventListener;
    private int f;
    private RealConnection g;
    private boolean h;
    private boolean i;
    private boolean j;
    private HttpCodec k;

    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        public StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.c = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.e = new RouteSelector(address, f(), call, eventListener);
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.k = null;
        }
        if (z2) {
            this.i = true;
        }
        RealConnection realConnection = this.g;
        if (realConnection == null) {
            return null;
        }
        if (z) {
            realConnection.noNewStreams = true;
        }
        if (this.k != null) {
            return null;
        }
        if (!this.i && !realConnection.noNewStreams) {
            return null;
        }
        d(realConnection);
        if (this.g.allocations.isEmpty()) {
            this.g.idleAtNanos = System.nanoTime();
            if (Internal.instance.connectionBecameIdle(this.c, this.g)) {
                socket = this.g.socket();
            } else {
                socket = null;
            }
        } else {
            socket = null;
        }
        this.g = null;
        return socket;
    }

    private RealConnection b(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        RealConnection realConnection;
        Socket socketE;
        RealConnection realConnection2;
        Socket socketDeduplicate;
        Route next;
        boolean z2;
        boolean z3;
        RouteSelector.Selection selection;
        synchronized (this.c) {
            if (this.i) {
                throw new IllegalStateException("released");
            }
            if (this.k != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.j) {
                throw new IOException("Canceled");
            }
            realConnection = this.g;
            socketE = e();
            realConnection2 = this.g;
            socketDeduplicate = null;
            if (realConnection2 != null) {
                realConnection = null;
            } else {
                realConnection2 = null;
            }
            if (!this.h) {
                realConnection = null;
            }
            if (realConnection2 == null) {
                Internal.instance.get(this.c, this.address, this, null);
                RealConnection realConnection3 = this.g;
                if (realConnection3 != null) {
                    realConnection2 = realConnection3;
                    z2 = true;
                    next = null;
                } else {
                    next = this.b;
                }
            } else {
                next = null;
            }
            z2 = false;
        }
        Util.closeQuietly(socketE);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            this.b = this.g.route();
            return realConnection2;
        }
        if (next != null || ((selection = this.a) != null && selection.hasNext())) {
            z3 = false;
        } else {
            this.a = this.e.next();
            z3 = true;
        }
        synchronized (this.c) {
            if (this.j) {
                throw new IOException("Canceled");
            }
            if (z3) {
                List<Route> all = this.a.getAll();
                int size = all.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Route route = all.get(i5);
                    Internal.instance.get(this.c, this.address, this, route);
                    RealConnection realConnection4 = this.g;
                    if (realConnection4 != null) {
                        this.b = route;
                        realConnection2 = realConnection4;
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                if (next == null) {
                    next = this.a.next();
                }
                this.b = next;
                this.f = 0;
                realConnection2 = new RealConnection(this.c, next);
                acquire(realConnection2, false);
            }
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
            return realConnection2;
        }
        realConnection2.connect(i, i2, i3, i4, z, this.call, this.eventListener);
        f().connected(realConnection2.route());
        synchronized (this.c) {
            this.h = true;
            Internal.instance.put(this.c, realConnection2);
            if (realConnection2.isMultiplexed()) {
                socketDeduplicate = Internal.instance.deduplicate(this.c, this.address, this);
                realConnection2 = this.g;
            }
        }
        Util.closeQuietly(socketDeduplicate);
        this.eventListener.connectionAcquired(this.call, realConnection2);
        return realConnection2;
    }

    private RealConnection c(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            RealConnection realConnectionB = b(i, i2, i3, i4, z);
            synchronized (this.c) {
                if (realConnectionB.successCount == 0 && !realConnectionB.isMultiplexed()) {
                    return realConnectionB;
                }
                if (realConnectionB.isHealthy(z2)) {
                    return realConnectionB;
                }
                noNewStreams();
            }
        }
    }

    private void d(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket e() {
        RealConnection realConnection = this.g;
        if (realConnection == null || !realConnection.noNewStreams) {
            return null;
        }
        return a(false, false, true);
    }

    private RouteDatabase f() {
        return Internal.instance.routeDatabase(this.c);
    }

    public void acquire(RealConnection realConnection, boolean z) {
        if (this.g != null) {
            throw new IllegalStateException();
        }
        this.g = realConnection;
        this.h = z;
        realConnection.allocations.add(new StreamAllocationReference(this, this.d));
    }

    public void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.c) {
            this.j = true;
            httpCodec = this.k;
            realConnection = this.g;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.c) {
            httpCodec = this.k;
        }
        return httpCodec;
    }

    public synchronized RealConnection connection() {
        return this.g;
    }

    public boolean hasMoreRoutes() {
        RouteSelector.Selection selection;
        return this.b != null || ((selection = this.a) != null && selection.hasNext()) || this.e.hasNext();
    }

    public HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        try {
            HttpCodec httpCodecNewCodec = c(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec(okHttpClient, chain, this);
            synchronized (this.c) {
                this.k = httpCodecNewCodec;
            }
            return httpCodecNewCodec;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    public void noNewStreams() {
        RealConnection realConnection;
        Socket socketA;
        synchronized (this.c) {
            realConnection = this.g;
            socketA = a(true, false, false);
            if (this.g != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(socketA);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void release() {
        RealConnection realConnection;
        Socket socketA;
        synchronized (this.c) {
            realConnection = this.g;
            socketA = a(false, true, false);
            if (this.g != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(socketA);
        if (realConnection != null) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.connectionReleased(this.call, realConnection);
            this.eventListener.callEnd(this.call);
        }
    }

    public Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.k != null || this.g.allocations.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<StreamAllocation> reference = this.g.allocations.get(0);
        Socket socketA = a(true, false, false);
        this.g = realConnection;
        realConnection.allocations.add(reference);
        return socketA;
    }

    public Route route() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    public void streamFailed(IOException iOException) {
        RealConnection realConnection;
        boolean z;
        Socket socketA;
        synchronized (this.c) {
            realConnection = null;
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                if (errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.f + 1;
                    this.f = i;
                    if (i > 1) {
                        this.b = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (errorCode != ErrorCode.CANCEL) {
                    this.b = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                RealConnection realConnection2 = this.g;
                if (realConnection2 == null || (realConnection2.isMultiplexed() && !(iOException instanceof ConnectionShutdownException))) {
                    z = false;
                } else {
                    if (this.g.successCount == 0) {
                        Route route = this.b;
                        if (route != null && iOException != null) {
                            this.e.connectFailed(route, iOException);
                        }
                        this.b = null;
                    }
                    z = true;
                }
            }
            RealConnection realConnection3 = this.g;
            socketA = a(z, false, true);
            if (this.g == null && this.h) {
                realConnection = realConnection3;
            }
        }
        Util.closeQuietly(socketA);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void streamFinished(boolean z, HttpCodec httpCodec, long j, IOException iOException) {
        RealConnection realConnection;
        Socket socketA;
        boolean z2;
        this.eventListener.responseBodyEnd(this.call, j);
        synchronized (this.c) {
            if (httpCodec != null) {
                if (httpCodec == this.k) {
                    if (!z) {
                        this.g.successCount++;
                    }
                    realConnection = this.g;
                    socketA = a(z, false, true);
                    if (this.g != null) {
                        realConnection = null;
                    }
                    z2 = this.i;
                }
            }
            throw new IllegalStateException("expected " + this.k + " but was " + httpCodec);
        }
        Util.closeQuietly(socketA);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, Internal.instance.timeoutExit(this.call, iOException));
        } else if (z2) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.callEnd(this.call);
        }
    }

    public String toString() {
        RealConnection realConnectionConnection = connection();
        return realConnectionConnection != null ? realConnectionConnection.toString() : this.address.toString();
    }
}
