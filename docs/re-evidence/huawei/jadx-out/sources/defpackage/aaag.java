package defpackage;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.huawei.hms.network.embedded.w9;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.Principal;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.SerialExecutor;
import org.eclipse.californium.scandium.ConnectionListener;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.Handshaker;
import org.eclipse.californium.scandium.dtls.SessionListener;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class aaag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f25b;
    private static final Logger d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ConnectionListener f26a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aaae f27c;
    private volatile boolean e;
    private long f;
    private final AtomicReference<Handshaker> g;
    private volatile aaak h;
    private long i;
    private Object j;
    private volatile boolean k;
    private InetSocketAddress l;
    private AlertMessage m;
    private InetSocketAddress n;
    private volatile SerialExecutor o;
    private volatile a r;
    private final SessionListener s;

    static {
        Logger loggerA = aaex.a((Class<?>) aaag.class);
        d = loggerA;
        f25b = aaex.a(loggerA.getName() + ".owner");
    }

    public aaag(InetSocketAddress inetSocketAddress) {
        this.g = new AtomicReference<>();
        this.s = new b();
        if (inetSocketAddress == null) {
            throw new NullPointerException("Peer address must not be null");
        }
        long jC = ClockUtil.c();
        this.n = inetSocketAddress;
        this.i = jC;
        this.f = jC;
    }

    public void ac() {
        ConnectionListener connectionListener = this.f26a;
        if (connectionListener != null) {
            connectionListener.updateExecution(this);
        }
    }

    public aaag a(Executor executor, ConnectionListener connectionListener) {
        if (x()) {
            throw new IllegalStateException("Executor already available!");
        }
        this.o = new SerialExecutor(executor);
        this.f26a = connectionListener;
        if (connectionListener == null) {
            this.o.e((SerialExecutor.ExecutionListener) null);
            return this;
        }
        this.o.e(new SerialExecutor.ExecutionListener() { // from class: aaag.4
            @Override // org.eclipse.californium.elements.util.SerialExecutor.ExecutionListener
            public void beforeExecution() {
                aaag.this.f26a.beforeExecution(aaag.this);
            }

            @Override // org.eclipse.californium.elements.util.SerialExecutor.ExecutionListener
            public void afterExecution() {
                aaag.this.f26a.afterExecution(aaag.this);
            }
        });
        return this;
    }

    public SerialExecutor h() {
        return this.o;
    }

    public boolean x() {
        return (this.o == null || this.o.isShutdown()) ? false : true;
    }

    public int ab() {
        SerialExecutor serialExecutorH = h();
        if (serialExecutorH == null) {
            return 0;
        }
        List<Runnable> listShutdownNow = serialExecutorH.shutdownNow();
        zzo.d(listShutdownNow);
        return listShutdownNow.size();
    }

    public final SessionListener q() {
        return this.s;
    }

    public boolean s() {
        return this.h != null;
    }

    public boolean e() {
        aaak aaakVarB = b();
        return aaakVarB != null && aaae.e(aaakVarB.a());
    }

    public aaae c() {
        return this.f27c;
    }

    public void d(aaae aaaeVar) {
        this.f27c = aaaeVar;
        ac();
    }

    public void b(Object obj) {
        this.j = obj;
    }

    public Object l() {
        return this.j;
    }

    public InetSocketAddress m() {
        return this.n;
    }

    public void c(InetSocketAddress inetSocketAddress) {
        if (d(inetSocketAddress)) {
            return;
        }
        if (this.h == null && inetSocketAddress != null) {
            throw new IllegalArgumentException("Address change without established dtls context is not supported!");
        }
        this.i = ClockUtil.c();
        InetSocketAddress inetSocketAddress2 = this.n;
        this.n = inetSocketAddress;
        if (inetSocketAddress == null) {
            Handshaker handshakerO = o();
            if (handshakerO != null) {
                if (this.h == null || handshakerO.getDtlsContext() != this.h) {
                    handshakerO.handshakeFailed(new IOException(zzp.b(inetSocketAddress2) + " address reused during handshake!"));
                    return;
                }
                return;
            }
            return;
        }
        ac();
    }

    public boolean d(InetSocketAddress inetSocketAddress) {
        InetSocketAddress inetSocketAddress2 = this.n;
        if (inetSocketAddress2 == inetSocketAddress) {
            return true;
        }
        if (inetSocketAddress2 == null) {
            return false;
        }
        return inetSocketAddress2.equals(inetSocketAddress);
    }

    public InetSocketAddress n() {
        return this.l;
    }

    public void b(InetSocketAddress inetSocketAddress) {
        InetSocketAddress inetSocketAddress2 = this.l;
        if (inetSocketAddress2 != inetSocketAddress) {
            if (inetSocketAddress2 == null || !inetSocketAddress2.equals(inetSocketAddress)) {
                this.l = inetSocketAddress;
                ac();
            }
        }
    }

    public zxu b(zya.e eVar) {
        if (this.h == null) {
            throw new IllegalStateException("DTLS context must be established!");
        }
        this.h.a(eVar);
        if (this.l != null) {
            eVar.d(zxu.s, "dtls-cid-router");
        }
        aaam aaamVarD = this.h.d();
        return new zxu(this.n, aaamVarD.j(), aaamVarD.n(), eVar);
    }

    public zxu b(zya.e eVar, InetSocketAddress inetSocketAddress) {
        if (this.h == null) {
            throw new IllegalStateException("DTLS context must be established!");
        }
        this.h.e(eVar);
        if (this.l != null) {
            eVar.d(zxu.s, "dtls-cid-router");
        }
        InetSocketAddress inetSocketAddress2 = this.n;
        if (inetSocketAddress2 != null) {
            inetSocketAddress = inetSocketAddress2;
        }
        aaam aaamVarD = this.h.d();
        return new zxu(inetSocketAddress, aaamVarD.j(), aaamVarD.n(), eVar);
    }

    public Principal g() {
        aaak aaakVarF = f();
        if (aaakVarF == null) {
            return null;
        }
        return aaakVarF.d().n();
    }

    public void e(Principal principal) {
        if (principal == null) {
            throw new IllegalStateException("Principal must not be null!");
        }
        aaak aaakVarF = f();
        if (aaakVarF == null) {
            throw new IllegalStateException("DTLS session not established!");
        }
        aaakVarF.d().d(principal);
    }

    public aacd i() {
        aaak aaakVarF = f();
        if (aaakVarF == null) {
            return null;
        }
        return aaakVarF.d().l();
    }

    public aaam j() {
        aaak aaakVarF = f();
        if (aaakVarF == null) {
            return null;
        }
        return aaakVarF.d();
    }

    public boolean p() {
        return this.h != null;
    }

    public aaak f() {
        return this.h;
    }

    public Handshaker o() {
        return this.g.get();
    }

    public boolean r() {
        return this.g.get() != null;
    }

    public boolean w() {
        return this.e;
    }

    public void z() {
        this.e = true;
    }

    public Long t() {
        a aVar = this.r;
        if (aVar != null) {
            return Long.valueOf(aVar.d);
        }
        return null;
    }

    public boolean c(aaai aaaiVar) {
        if (aaaiVar == null) {
            throw new NullPointerException("client hello must not be null!");
        }
        a aVar = this.r;
        if (aVar != null) {
            return aVar.d(aaaiVar);
        }
        return false;
    }

    public void a(aaai aaaiVar) {
        if (aaaiVar == null) {
            this.r = null;
        } else {
            this.r = new a(aaaiVar);
        }
    }

    public aaak c(int i) {
        aaak dtlsContext;
        aaak aaakVar = this.h;
        if (aaakVar != null && aaakVar.b() == i) {
            return aaakVar;
        }
        Handshaker handshaker = this.g.get();
        if (handshaker == null || (dtlsContext = handshaker.getDtlsContext()) == null || dtlsContext.b() != i) {
            return null;
        }
        return dtlsContext;
    }

    public aaak b() {
        Handshaker handshaker;
        aaak aaakVar = this.h;
        return (aaakVar != null || (handshaker = this.g.get()) == null) ? aaakVar : handshaker.getDtlsContext();
    }

    public void aa() {
        if (this.h == null) {
            throw new IllegalStateException("No established context to resume available!");
        }
        aadd.a(this.h);
        this.h = null;
        this.k = false;
        a((aaai) null);
        ac();
    }

    public boolean v() {
        aaak aaakVar = this.h;
        return aaakVar != null && aaakVar.n();
    }

    public void b(aabr aabrVar) {
        aaak aaakVar = this.h;
        if (aaakVar != null) {
            aaakVar.a(aabrVar.c(), aabrVar.f());
        }
    }

    public boolean e(aabr aabrVar) {
        aaak aaakVar = this.h;
        if (aaakVar != null) {
            return aaakVar.e(aabrVar.c(), aabrVar.f());
        }
        return false;
    }

    public boolean b(AlertMessage alertMessage) {
        if (this.m != null) {
            return false;
        }
        this.m = alertMessage;
        return true;
    }

    public boolean y() {
        return this.k;
    }

    public boolean a(Long l) {
        if (!this.k && l != null && this.h != null && ClockUtil.c() - (this.f + TimeUnit.MILLISECONDS.toNanos(l.longValue())) > 0) {
            a(true);
        }
        return this.k;
    }

    public void u() {
        this.f = ClockUtil.c();
    }

    public long k() {
        return this.f;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public int hashCode() {
        aaae aaaeVar = this.f27c;
        int iHashCode = aaaeVar == null ? 0 : aaaeVar.hashCode();
        int iHashCode2 = this.h == null ? 0 : this.h.hashCode();
        long j = this.f;
        int i = (int) (j ^ (j >>> 32));
        InetSocketAddress inetSocketAddress = this.n;
        int iHashCode3 = inetSocketAddress == null ? 0 : inetSocketAddress.hashCode();
        int i2 = this.k ? 1231 : 1237;
        InetSocketAddress inetSocketAddress2 = this.l;
        int iHashCode4 = inetSocketAddress2 == null ? 0 : inetSocketAddress2.hashCode();
        AlertMessage alertMessage = this.m;
        return ((((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + i) * 31) + iHashCode3) * 31) + i2) * 31) + iHashCode4) * 31) + (alertMessage != null ? alertMessage.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaag aaagVar = (aaag) obj;
        return zzg.c(this.f27c, aaagVar.f27c) && this.k == aaagVar.k && this.f == aaagVar.f && Objects.equals(this.h, aaagVar.h) && Objects.equals(this.n, aaagVar.n) && Objects.equals(this.l, aaagVar.l) && Objects.equals(this.m, aaagVar.m);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("dtls-con: ");
        aaae aaaeVar = this.f27c;
        if (aaaeVar != null) {
            sb.append(aaaeVar);
        }
        if (this.n != null) {
            sb.append(", ");
            sb.append(zzp.b(this.n));
            Handshaker handshakerO = o();
            if (handshakerO != null) {
                sb.append(", ongoing handshake ");
                aacd aacdVarL = handshakerO.getDtlsContext().d().l();
                if (aacdVarL != null && !aacdVarL.b()) {
                    sb.append(zzp.a(aacdVarL.d(), (char) 0, 6));
                }
            }
            if (y()) {
                sb.append(", resumption required");
            } else if (p()) {
                sb.append(", session established ");
                aacd aacdVarL2 = j().l();
                if (aacdVarL2 != null && !aacdVarL2.b()) {
                    sb.append(zzp.a(aacdVarL2.d(), (char) 0, 6));
                }
            }
        }
        if (x()) {
            sb.append(", is alive");
        }
        return sb.toString();
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29c;
        private final long d;
        private final aabn e;

        private a(aaai aaaiVar) {
            this.f29c = aaaiVar.getMessageSeq();
            this.e = aaaiVar.getRandom();
            this.d = ClockUtil.c();
        }

        private a(zzf zzfVar, long j) {
            this.f29c = zzfVar.a(16);
            byte[] bArrJ = zzfVar.j(8);
            if (bArrJ != null) {
                this.e = new aabn(bArrJ);
            } else {
                this.e = null;
            }
            this.d = zzfVar.e(64) + j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(aaai aaaiVar) {
            return this.e.equals(aaaiVar.getRandom()) && this.f29c >= aaaiVar.getMessageSeq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(zzl zzlVar) {
            zzlVar.d(this.f29c, 16);
            zzlVar.c(this.e, 8);
            zzlVar.e(this.d, 64);
        }
    }

    class b implements SessionListener {
        @Override // org.eclipse.californium.scandium.dtls.SessionListener
        public void handshakeFlightRetransmitted(Handshaker handshaker, int i) {
        }

        private b() {
        }

        @Override // org.eclipse.californium.scandium.dtls.SessionListener
        public void handshakeStarted(Handshaker handshaker) throws aaay {
            aaag.this.g.set(handshaker);
            aaag.d.debug("Handshake with [{}] has been started", zzp.e(aaag.this.n));
        }

        @Override // org.eclipse.californium.scandium.dtls.SessionListener
        public void contextEstablished(Handshaker handshaker, aaak aaakVar) throws aaay {
            aaag.this.h = aaakVar;
            aaag.d.debug("Session context with [{}] has been established", zzp.e(aaag.this.n));
        }

        @Override // org.eclipse.californium.scandium.dtls.SessionListener
        public void handshakeCompleted(Handshaker handshaker) {
            SerialExecutor serialExecutor = aaag.this.o;
            if (serialExecutor != null && !serialExecutor.isShutdown() && aaag.f25b.isErrorEnabled()) {
                try {
                    serialExecutor.assertOwner();
                } catch (ConcurrentModificationException e) {
                    aaag.f25b.error("on handshake completed: connection {}", e.getMessage(), e);
                    if (aaag.f25b.isDebugEnabled()) {
                        throw e;
                    }
                }
            }
            if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(aaag.this.g, handshaker, null)) {
                aaag.d.debug("Handshake with [{}] has been completed", zzp.e(aaag.this.n));
            }
        }

        @Override // org.eclipse.californium.scandium.dtls.SessionListener
        public void handshakeFailed(Handshaker handshaker, Throwable th) {
            SerialExecutor serialExecutor = aaag.this.o;
            if (serialExecutor != null && !serialExecutor.isShutdown() && aaag.f25b.isErrorEnabled()) {
                try {
                    serialExecutor.assertOwner();
                } catch (ConcurrentModificationException e) {
                    aaag.f25b.error("on handshake failed: connection {}", e.getMessage(), e);
                    if (aaag.f25b.isDebugEnabled()) {
                        throw e;
                    }
                }
            }
            if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(aaag.this.g, handshaker, null)) {
                aaag.this.r = null;
                aaag.d.debug("Handshake with [{}] has failed", zzp.e(aaag.this.n));
            }
        }
    }

    public boolean b(zzl zzlVar) {
        byte b2 = 0;
        if (this.h == null || this.h.n() || this.m != null) {
            return false;
        }
        int iE = zzs.e(zzlVar, 1, 16);
        zzlVar.d(this.k ? (byte) 1 : (byte) 0);
        zzlVar.e(this.f, 64);
        zzlVar.c(this.f27c, 8);
        zzs.b(zzlVar, this.n);
        a aVar = this.r;
        if (aVar == null) {
            zzlVar.d((byte) 0);
        } else {
            zzlVar.d((byte) 1);
            aVar.a(zzlVar);
        }
        this.h.a(zzlVar);
        aaae aaaeVar = this.f27c;
        if (aaaeVar != null && aaaeVar.equals(this.h.a())) {
            b2 = 1;
        }
        zzlVar.d(b2);
        zzlVar.d(this.e ? (byte) 1 : (byte) 0);
        zzs.a(zzlVar, iE, 16);
        return true;
    }

    public static aaag e(zzh zzhVar, long j) {
        int iC = zzs.c(zzhVar, 1, 16);
        if (iC > 0) {
            return new aaag(zzhVar.d(iC), j);
        }
        return null;
    }

    private aaag(zzf zzfVar, long j) {
        this.g = new AtomicReference<>();
        this.s = new b();
        this.k = zzfVar.e() == 1;
        this.f = zzfVar.e(64) + j;
        byte[] bArrJ = zzfVar.j(8);
        if (bArrJ == null) {
            throw new IllegalArgumentException("CID must not be null!");
        }
        this.f27c = new aaae(bArrJ);
        this.n = zzs.b(zzfVar);
        if (zzfVar.e() == 1) {
            this.r = new a(zzfVar, j);
        }
        this.h = aaak.c(zzfVar);
        if (this.h == null) {
            throw new IllegalArgumentException("DTLS Context must not be null!");
        }
        if (zzfVar.e() == 1) {
            this.h.d(this.f27c);
        }
        if (zzfVar.d() && zzfVar.e() == 1) {
            this.e = true;
        }
        zzfVar.b(w9.h);
    }
}
