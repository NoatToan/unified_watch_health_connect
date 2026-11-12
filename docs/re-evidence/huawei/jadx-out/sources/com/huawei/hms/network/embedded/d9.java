package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes34.dex */
public final class d9 {
    public static final /* synthetic */ boolean r = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f14707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8 f14708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6 f14709c;
    public final g7 d;
    public final za e;

    @Nullable
    public Object f;
    public t7 g;
    public w8 h;
    public y8 i;

    @Nullable
    public v8 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final int p;
    public final int q;

    public void timeoutEnter() {
        this.e.f();
    }

    public void timeoutEarlyExit() {
        if (this.n) {
            throw new IllegalStateException();
        }
        this.n = true;
        this.e.g();
    }

    public ac timeout() {
        return this.e;
    }

    @Nullable
    public Socket releaseConnectionNoEvents() {
        if (!r && !Thread.holdsLock(this.f14708b)) {
            throw new AssertionError();
        }
        int size = this.i.p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.i.p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        y8 y8Var = this.i;
        y8Var.p.remove(i);
        this.i = null;
        if (y8Var.p.isEmpty()) {
            y8Var.q = System.nanoTime();
            if (this.f14708b.b(y8Var)) {
                return y8Var.c();
            }
        }
        return null;
    }

    public void prepareToConnect(t7 t7Var) {
        t7 t7Var2 = this.g;
        if (t7Var2 != null) {
            if (f8.a(t7Var2.k(), t7Var.k()) && this.h.c()) {
                return;
            }
            if (this.j != null) {
                throw new IllegalStateException();
            }
            if (this.h != null) {
                maybeReleaseConnection(null, true);
                this.h = null;
            }
        }
        this.g = t7Var;
        w8 w8Var = new w8(this, this.f14708b, createAddress(t7Var.k()), this.f14709c, this.d, this.p, this.q);
        this.h = w8Var;
        w8Var.f15572b.a(t7Var.a("host"));
    }

    @Nullable
    public IOException noMoreExchanges(@Nullable IOException iOException) {
        synchronized (this.f14708b) {
            this.o = true;
        }
        return maybeReleaseConnection(iOException, false);
    }

    public v8 newExchange(n7.a aVar, boolean z) {
        synchronized (this.f14708b) {
            if (this.o) {
                throw new IllegalStateException("released");
            }
            if (this.j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        v8 v8Var = new v8(this, this.f14709c, this.d, this.h, this.h.a(this.f14707a, aVar, z));
        synchronized (this.f14708b) {
            this.j = v8Var;
            this.k = false;
            this.l = false;
        }
        return v8Var;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.f14708b) {
            z = this.m;
        }
        return z;
    }

    public boolean hasExchange() {
        boolean z;
        synchronized (this.f14708b) {
            z = this.j != null;
        }
        return z;
    }

    public c9.a getSelection() {
        return this.h.b();
    }

    public t7 getRequest() {
        return this.g;
    }

    public w8 getExchangeFinder() {
        return this.h;
    }

    @Nullable
    public IOException exchangeMessageDone(v8 v8Var, boolean z, boolean z2, @Nullable IOException iOException) {
        boolean z3;
        synchronized (this.f14708b) {
            v8 v8Var2 = this.j;
            if (v8Var != v8Var2) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.k;
                this.k = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.l) {
                    z3 = true;
                }
                this.l = true;
            }
            if (this.k && this.l && z3) {
                v8Var2.b().m++;
                this.j = null;
            } else {
                z4 = false;
            }
            return z4 ? maybeReleaseConnection(iOException, false) : iOException;
        }
    }

    public void exchangeDoneDueToException() {
        synchronized (this.f14708b) {
            v8 v8Var = this.j;
            if (v8Var != null) {
                v8Var.c();
            }
            if (this.o) {
                throw new IllegalStateException();
            }
            this.j = null;
        }
    }

    public void cancel() {
        v8 v8Var;
        y8 y8VarA;
        synchronized (this.f14708b) {
            this.m = true;
            v8Var = this.j;
            w8 w8Var = this.h;
            y8VarA = (w8Var == null || w8Var.a() == null) ? this.i : this.h.a();
        }
        if (v8Var != null) {
            v8Var.a();
        } else if (y8VarA != null) {
            y8VarA.e();
        }
    }

    public boolean canRetry() {
        return this.h.d() && this.h.c();
    }

    public void callStart() {
        this.f = ma.f().a("response.body().close()");
        this.d.callStart(this.f14709c);
    }

    public void acquireConnectionNoEvents(y8 y8Var) {
        if (!r && !Thread.holdsLock(this.f14708b)) {
            throw new AssertionError();
        }
        if (this.i != null) {
            throw new IllegalStateException();
        }
        this.i = y8Var;
        y8Var.p.add(new b(this, this.f));
    }

    @Nullable
    private IOException timeoutExit(@Nullable IOException iOException) {
        if (this.n || !this.e.g()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Nullable
    private IOException maybeReleaseConnection(@Nullable IOException iOException, boolean z) {
        y8 y8Var;
        Socket socketReleaseConnectionNoEvents;
        boolean z2;
        synchronized (this.f14708b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            y8Var = this.i;
            socketReleaseConnectionNoEvents = (y8Var != null && this.j == null && (z || this.o)) ? releaseConnectionNoEvents() : null;
            if (this.i != null) {
                y8Var = null;
            }
            z2 = this.o && this.j == null;
        }
        f8.a(socketReleaseConnectionNoEvents);
        if (y8Var != null) {
            this.d.connectionReleased(this.f14709c, y8Var);
        }
        if (z2) {
            boolean z3 = iOException != null;
            iOException = timeoutExit(iOException);
            g7 g7Var = this.d;
            t6 t6Var = this.f14709c;
            if (z3) {
                g7Var.callFailed(t6Var, iOException);
                return iOException;
            }
            g7Var.callEnd(t6Var);
        }
        return iOException;
    }

    public class a extends za {
        @Override // com.huawei.hms.network.embedded.za
        public void timedOut() {
            d9.this.cancel();
        }

        public a() {
        }
    }

    private p6 createAddress(m7 m7Var) {
        SSLSocketFactory sSLSocketFactoryD;
        HostnameVerifier hostnameVerifierQ;
        v6 v6VarD;
        if (m7Var.i()) {
            sSLSocketFactoryD = this.f14707a.D();
            hostnameVerifierQ = this.f14707a.q();
            v6VarD = this.f14707a.d();
        } else {
            sSLSocketFactoryD = null;
            hostnameVerifierQ = null;
            v6VarD = null;
        }
        return new p6(m7Var.h(), m7Var.n(), this.f14707a.k(), this.f14707a.C(), sSLSocketFactoryD, hostnameVerifierQ, v6VarD, this.f14707a.y(), this.f14707a.x(), this.f14707a.w(), this.f14707a.h(), this.f14707a.z());
    }

    public static final class b extends WeakReference<d9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f14710a;

        public b(d9 d9Var, Object obj) {
            super(d9Var);
            this.f14710a = obj;
        }
    }

    public d9(q7 q7Var, t6 t6Var) {
        a aVar = new a();
        this.e = aVar;
        this.f14707a = q7Var;
        this.f14708b = c8.f14676a.a(q7Var.g());
        this.f14709c = t6Var;
        this.d = q7Var.l().create(t6Var);
        aVar.timeout(q7Var.c(), TimeUnit.MILLISECONDS);
        this.p = q7Var.f();
        this.q = q7Var.m();
    }
}
