package com.huawei.hms.network.embedded;

import com.huawei.openalliance.ad.constant.ErrorCode;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes34.dex */
public final class y8 extends v9.j implements y6 {
    public static final int A = 4;
    public static final long B = 1000000000;
    public static final int C = 1000;
    public static final /* synthetic */ boolean D = true;
    public static final String y = "throw with null exception";
    public static final int z = 21;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8 f15632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x7 f15633c;
    public Socket d;
    public Socket e;
    public i7 f;
    public r7 g;
    public v9 h;
    public db i;
    public cb j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final List<Reference<d9>> p = new ArrayList();
    public long q = Long.MAX_VALUE;
    public c9.a r = null;
    public s8 s = null;
    public x7 t = null;
    public long u = 0;
    public int v = 0;
    public int w = 0;
    public long x = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f15633c.a().l().h());
        sb.append(":");
        sb.append(this.f15633c.a().l().n());
        sb.append(", proxy=");
        sb.append(this.f15633c.b());
        sb.append(" hostAddress=");
        sb.append(this.f15633c.d());
        sb.append(" cipherSuite=");
        i7 i7Var = this.f;
        sb.append(i7Var != null ? i7Var.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    public void h() {
        if (!D && Thread.holdsLock(this.f15632b)) {
            throw new AssertionError();
        }
        synchronized (this.f15632b) {
            this.k = true;
        }
    }

    public boolean g() {
        return this.h != null;
    }

    public c9.a f() {
        return this.r;
    }

    public void e() {
        s8 s8Var = this.s;
        if (s8Var != null) {
            s8Var.a();
        }
        f8.a(this.d);
    }

    @Override // com.huawei.hms.network.embedded.y6
    public r7 d() {
        return this.g;
    }

    @Override // com.huawei.hms.network.embedded.y6
    public Socket c() {
        return this.e;
    }

    @Override // com.huawei.hms.network.embedded.y6
    public x7 b() {
        return this.f15633c;
    }

    public boolean a(boolean z2) {
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        v9 v9Var = this.h;
        if (v9Var != null) {
            return v9Var.j(System.nanoTime());
        }
        if (z2) {
            try {
                int soTimeout = this.e.getSoTimeout();
                try {
                    this.e.setSoTimeout(1);
                    if (this.i.i()) {
                        this.e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.e.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean a(p6 p6Var, @Nullable List<x7> list) {
        if (this.p.size() >= this.o || this.k || !c8.f14676a.a(this.f15633c.a(), p6Var)) {
            return false;
        }
        if (p6Var.l().h().equals(b().a().l().h())) {
            return true;
        }
        if (this.h == null || list == null || !a(list) || p6Var.e() != sa.f15355a || !a(p6Var.l())) {
            return false;
        }
        try {
            p6Var.a().a(p6Var.l().h(), a().d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(m7 m7Var) {
        if (m7Var.n() != this.f15633c.a().l().n()) {
            return false;
        }
        if (m7Var.h().equals(this.f15633c.a().l().h())) {
            return true;
        }
        return this.f != null && sa.f15355a.a(m7Var.h(), (X509Certificate) this.f.d().get(0));
    }

    public void a(CopyOnWriteArrayList<InetSocketAddress> copyOnWriteArrayList, int i, int i2, int i3) {
        if (copyOnWriteArrayList != null) {
            this.s = r8.a(copyOnWriteArrayList, i, i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r5 > 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(@Nullable IOException iOException) {
        if (!D && Thread.holdsLock(this.f15632b)) {
            throw new AssertionError();
        }
        synchronized (this.f15632b) {
            if (iOException instanceof da) {
                r9 r9Var = ((da) iOException).f14711a;
                if (r9Var == r9.REFUSED_STREAM) {
                    int i = this.n + 1;
                    this.n = i;
                } else if (r9Var != r9.CANCEL) {
                    this.k = true;
                    this.l++;
                }
            } else if (!g() || (iOException instanceof q9)) {
                this.k = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        this.f15632b.a(this.f15633c, iOException);
                    }
                    this.l++;
                }
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.v9.j
    public void a(y9 y9Var) throws IOException {
        y9Var.a(r9.REFUSED_STREAM, (IOException) null);
    }

    @Override // com.huawei.hms.network.embedded.v9.j
    public void a(v9 v9Var) {
        synchronized (this.f15632b) {
            this.o = v9Var.t();
        }
    }

    public void a(c9.a aVar) {
        this.r = aVar;
    }

    public void a(int i, int i2, int i3, int i4, int i5, boolean z2, t6 t6Var, g7 g7Var) throws Throwable {
        if (this.g != null) {
            throw new IllegalStateException("already connected");
        }
        List<a7> listB = this.f15633c.a().b();
        u8 u8Var = new u8(listB);
        if (this.f15633c.a().k() == null) {
            if (!listB.contains(a7.j)) {
                throw new b9(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strH = this.f15633c.a().l().h();
            if (!ma.f().b(strH)) {
                throw new b9(new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy"));
            }
        } else if (this.f15633c.a().f().contains(r7.H2_PRIOR_KNOWLEDGE)) {
            throw new b9(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        b9 b9Var = null;
        while (true) {
            try {
                if (this.f15633c.c()) {
                    a(i, i2, i3, i5, t6Var, g7Var);
                    if (this.d != null) {
                        break;
                    } else {
                        break;
                    }
                }
                a(i, i2, i5, t6Var, g7Var);
                try {
                    a(u8Var, i4, t6Var, g7Var);
                    g7Var.connectEnd(t6Var, this.f15633c.d(), this.f15633c.b(), this.g);
                    break;
                } catch (IOException e) {
                    e = e;
                    f8.a(this.e);
                    f8.a(this.d);
                    this.e = null;
                    this.d = null;
                    this.i = null;
                    this.j = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    g7Var.connectFailed(t6Var, this.f15633c.d(), this.f15633c.b(), null, e);
                    if (b9Var == null) {
                        b9Var = new b9(e);
                    } else {
                        b9Var.a(e);
                    }
                    if (!z2) {
                        throw b9Var;
                    }
                    if (!u8Var.a(e)) {
                        throw b9Var;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (this.f15633c.c() && this.d == null) {
            throw new b9(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.h != null) {
            synchronized (this.f15632b) {
                this.o = this.h.t();
            }
        }
    }

    public ua.f a(v8 v8Var) throws SocketException {
        this.e.setSoTimeout(0);
        h();
        return new a(true, this.i, this.j, v8Var);
    }

    @Override // com.huawei.hms.network.embedded.y6
    public i7 a() {
        return this.f;
    }

    public g9 a(q7 q7Var, n7.a aVar) throws SocketException {
        v9 v9Var = this.h;
        if (v9Var != null) {
            return new w9(q7Var, this, aVar, v9Var);
        }
        this.e.setSoTimeout(aVar.c());
        this.i.timeout().timeout(aVar.c(), TimeUnit.MILLISECONDS);
        this.j.timeout().timeout(aVar.b(), TimeUnit.MILLISECONDS);
        return new p9(q7Var, this, this.i, this.j);
    }

    private t7 i() throws IOException {
        t7 t7VarA = new t7.a().a(this.f15633c.a().l()).a("CONNECT", (u7) null).b("Host", f8.a(this.f15633c.a().l(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", g8.a()).a();
        t7 t7VarB = this.f15633c.a().h().b(this.f15633c, new v7.a().a(t7VarA).a(r7.HTTP_1_1).a(ErrorCode.ERROR_CODE_NO_SDKVERSION).a("Preemptive Authenticate").a(f8.d).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return t7VarB != null ? t7VarB : t7VarA;
    }

    private boolean a(List<x7> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x7 x7Var = list.get(i);
            if (x7Var.b().type() == Proxy.Type.DIRECT && this.f15633c.b().type() == Proxy.Type.DIRECT && this.f15633c.d().equals(x7Var.d())) {
                return true;
            }
        }
        return false;
    }

    private void a(u8 u8Var, int i, t6 t6Var, g7 g7Var) throws Throwable {
        if (this.f15633c.a().k() != null) {
            g7Var.secureConnectStart(t6Var);
            a(u8Var);
            g7Var.secureConnectEnd(t6Var, this.f);
            if (this.g == r7.HTTP_2) {
                a(i);
                return;
            }
            return;
        }
        if (!this.f15633c.a().f().contains(r7.H2_PRIOR_KNOWLEDGE)) {
            this.e = this.d;
            this.g = r7.HTTP_1_1;
        } else {
            this.e = this.d;
            this.g = r7.H2_PRIOR_KNOWLEDGE;
            a(i);
        }
    }

    private void a(u8 u8Var) throws Throwable {
        SSLSocket sSLSocket;
        p6 p6VarA = this.f15633c.a();
        try {
            try {
                sSLSocket = (SSLSocket) p6VarA.k().createSocket(this.d, p6VarA.l().h(), p6VarA.l().n(), true);
                try {
                    String strD = p6VarA.d();
                    if (strD != null && strD.length() != 0) {
                        strD = m7.f(p6VarA.l().s() + "://" + strD).h();
                    }
                    if (strD == null || strD.length() == 0) {
                        strD = p6VarA.l().h();
                    }
                    a7 a7VarA = u8Var.a(sSLSocket);
                    if (a7VarA.c()) {
                        ma.f().a(sSLSocket, strD, p6VarA.f());
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    i7 i7VarA = i7.a(session);
                    if (p6VarA.e().verify(strD, session)) {
                        p6VarA.a().a(p6VarA.l().h(), i7VarA.d());
                        String strB = a7VarA.c() ? ma.f().b(sSLSocket) : null;
                        this.e = sSLSocket;
                        this.i = ob.a(ob.b(sSLSocket));
                        this.j = ob.a(ob.a(this.e));
                        this.f = i7VarA;
                        this.g = strB != null ? r7.a(strB) : r7.HTTP_1_1;
                        if (sSLSocket != null) {
                            ma.f().a(sSLSocket);
                            return;
                        }
                        return;
                    }
                    List<Certificate> listD = i7VarA.d();
                    if (listD.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + p6VarA.l().h() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listD.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + strD + " not verified:\n    certificate: " + v6.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + sa.a(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!f8.a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        ma.f().a(sSLSocket);
                    }
                    f8.a((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    private void a(int i, int i2, int i3, t6 t6Var, g7 g7Var) throws IOException {
        long jCurrentTimeMillis;
        x7 x7VarE;
        x7 x7Var = this.t;
        if (x7Var == null) {
            x7Var = this.f15633c;
        }
        Proxy proxyB = x7Var.b();
        p6 p6VarA = x7Var.a();
        if (this.s == null || this.t != null) {
            this.d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? p6VarA.j().createSocket() : new Socket(proxyB);
            g7Var.connectStart(t6Var, this.f15633c.d(), proxyB);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.d.setSoTimeout(i2);
            this.d.setTrafficClass(i3);
            try {
                ma.f().a(this.d, x7Var.d(), i);
            } catch (ConnectException e) {
                ConnectException connectException = new ConnectException("Failed to connect to " + x7Var.d());
                connectException.initCause(e);
                throw connectException;
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            this.d = this.s.a(i, p6VarA.j(), proxyB, t6Var, g7Var);
            if (this.s.m != null && (x7VarE = this.r.e()) != null) {
                this.r.b(new x7(x7VarE.a(), x7VarE.b(), this.s.m));
            }
            c9.a aVar = this.r;
            if (aVar != null) {
                aVar.a(this.s.b());
                Socket socket = this.d;
                if (socket != null) {
                    this.r.a((InetSocketAddress) socket.getRemoteSocketAddress());
                }
            }
            if (this.d == null) {
                throw new ConnectException("Failed to connect to host " + this.f15633c.a().l().h());
            }
            x7 x7Var2 = new x7(this.f15633c.a(), this.f15633c.b(), (InetSocketAddress) this.d.getRemoteSocketAddress());
            this.t = x7Var2;
            this.f15633c = x7Var2;
            this.d.setSoTimeout(i2);
            this.d.setTrafficClass(i3);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        this.u = jCurrentTimeMillis2;
        if (i2 != 0) {
            this.w = ((int) ((jCurrentTimeMillis2 * 4) + 1000)) / i2;
        }
        try {
            this.i = ob.a(ob.b(this.d));
            this.j = ob.a(ob.a(this.d));
        } catch (NullPointerException e2) {
            if (y.equals(e2.getMessage())) {
                throw new IOException(e2);
            }
        }
    }

    private void a(int i, int i2, int i3, int i4, t6 t6Var, g7 g7Var) throws IOException {
        t7 t7VarI = i();
        m7 m7VarK = t7VarI.k();
        for (int i5 = 0; i5 < 21; i5++) {
            a(i, i2, i4, t6Var, g7Var);
            t7VarI = a(i2, i3, t7VarI, m7VarK);
            if (t7VarI == null) {
                return;
            }
            f8.a(this.d);
            this.d = null;
            this.j = null;
            this.i = null;
            g7Var.connectEnd(t6Var, this.f15633c.d(), this.f15633c.b(), null);
        }
    }

    private void a(int i) throws IOException {
        this.e.setSoTimeout(0);
        v9 v9VarA = new v9.h(true).a(this.e, this.f15633c.a().l().h(), this.i, this.j).a(this).a(i).a();
        this.h = v9VarA;
        v9VarA.w();
    }

    public static y8 a(z8 z8Var, x7 x7Var, Socket socket, long j) {
        y8 y8Var = new y8(z8Var, x7Var);
        y8Var.e = socket;
        y8Var.q = j;
        return y8Var;
    }

    public class a extends ua.f {
        public final /* synthetic */ v8 d;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.d.a(-1L, true, true, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, db dbVar, cb cbVar, v8 v8Var) {
            super(z, dbVar, cbVar);
            this.d = v8Var;
        }
    }

    private t7 a(int i, int i2, t7 t7Var, m7 m7Var) throws IOException {
        String str = "CONNECT " + f8.a(m7Var, true) + " HTTP/1.1";
        while (true) {
            p9 p9Var = new p9(null, null, this.i, this.j);
            this.i.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.j.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            p9Var.a(t7Var.e(), str);
            p9Var.c();
            v7 v7VarA = p9Var.a(false).a(t7Var).a();
            p9Var.c(v7VarA);
            int iW = v7VarA.w();
            if (iW == 200) {
                if (this.i.g().i() && this.j.a().i()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iW != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + v7VarA.w());
            }
            t7 t7VarB = this.f15633c.a().h().b(this.f15633c, v7VarA);
            if (t7VarB == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(v7VarA.b("Connection"))) {
                return t7VarB;
            }
            t7Var = t7VarB;
        }
    }

    public y8(z8 z8Var, x7 x7Var) {
        this.f15632b = z8Var;
        this.f15633c = x7Var;
    }
}
