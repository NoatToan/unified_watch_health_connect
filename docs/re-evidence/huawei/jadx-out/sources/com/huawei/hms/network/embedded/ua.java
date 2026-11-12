package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class ua implements z7, wa.a {
    public static final List<r7> G = Collections.singletonList(r7.HTTP_1_1);
    public static final long H = 16777216;
    public static final long I = 60000;
    public static final int J = 1000;
    public static final int K = 1200000;
    public static final String L = "Sec-WebSocket-Extensions";
    public static final String M = "permessage-deflate";
    public static final String N = "client_no_context_takeover";
    public static final String O = "server_no_context_takeover";
    public static final int P = 4;
    public static final /* synthetic */ boolean Q = true;
    public boolean B;
    public bb C;
    public bb D;
    public Deflater E;
    public fb F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7 f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8 f15457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f15458c;
    public long d;
    public final String e;
    public ScheduledFuture<?> f;
    public t6 g;
    public final Runnable h;
    public wa i;
    public xa j;
    public ScheduledExecutorService k;
    public f l;
    public long o;
    public boolean p;
    public ScheduledFuture<?> q;
    public String s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public long y;
    public final ArrayDeque<eb> m = new ArrayDeque<>();
    public final ArrayDeque<Object> n = new ArrayDeque<>();
    public int r = -1;
    public LinkedList<Long> z = new LinkedList<>();
    public boolean A = false;

    @Override // com.huawei.hms.network.embedded.z7
    public t7 request() {
        return this.f15456a;
    }

    public void l() {
        synchronized (this) {
            if (this.t) {
                return;
            }
            xa xaVar = this.j;
            int i = this.x ? this.u : -1;
            this.u++;
            this.x = true;
            if (i == -1) {
                try {
                    xaVar.a(eb.f);
                    this.y = System.currentTimeMillis();
                    return;
                } catch (IOException e2) {
                    a(e2, (v7) null);
                    return;
                }
            }
            a(new SocketTimeoutException("sent ping but didn't receive pong within " + this.d + "ms (after " + (i - 1) + " successful ping/pongs)"), (v7) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public boolean k() throws IOException {
        ?? r4;
        String str;
        synchronized (this) {
            if (!this.t) {
                xa xaVar = this.j;
                eb ebVarPoll = this.m.poll();
                int i = -1;
                Object obj = null;
                if (ebVarPoll == null) {
                    Object objPoll = this.n.poll();
                    if (objPoll instanceof c) {
                        int i2 = this.r;
                        str = this.s;
                        if (i2 != -1) {
                            f fVar = this.l;
                            this.l = null;
                            this.k.shutdown();
                            obj = fVar;
                        } else {
                            this.q = this.k.schedule(new b(), ((c) objPoll).f15464c, TimeUnit.MILLISECONDS);
                        }
                        i = i2;
                    } else if (objPoll != null) {
                        str = null;
                    }
                    r4 = obj;
                    obj = objPoll;
                } else {
                    r4 = 0;
                    str = null;
                }
                try {
                    if (ebVarPoll != null) {
                        xaVar.b(ebVarPoll);
                    } else if (obj instanceof d) {
                        eb ebVar = ((d) obj).f15466b;
                        cb cbVarA = ob.a(xaVar.a(((d) obj).f15465a, ebVar.j()));
                        cbVarA.a(ebVar);
                        cbVarA.close();
                        synchronized (this) {
                            this.o -= (long) ebVar.j();
                        }
                    } else {
                        if (!(obj instanceof c)) {
                            throw new AssertionError();
                        }
                        c cVar = (c) obj;
                        xaVar.a(cVar.f15462a, cVar.f15463b);
                        if (r4 != 0) {
                            this.f15457b.onClosed(this, i, str);
                        }
                    }
                    f8.a((Closeable) r4);
                    return true;
                } catch (Throwable th) {
                    f8.a((Closeable) r4);
                    throw th;
                }
            }
            return false;
        }
    }

    public void j() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.k.shutdown();
        this.k.awaitTermination(10L, TimeUnit.SECONDS);
    }

    public int i() {
        int i;
        synchronized (this) {
            i = this.u;
        }
        return i;
    }

    public int h() {
        int i;
        synchronized (this) {
            i = this.w;
        }
        return i;
    }

    public int g() {
        int i;
        synchronized (this) {
            i = this.v;
        }
        return i;
    }

    public boolean f() throws IOException {
        try {
            this.i.a();
            return this.r == -1;
        } catch (Exception e2) {
            a(e2, (v7) null);
            return false;
        }
    }

    public boolean e(eb ebVar) {
        synchronized (this) {
            if (!this.t && (!this.p || !this.n.isEmpty())) {
                this.m.add(ebVar);
                o();
                return true;
            }
            return false;
        }
    }

    public void e() throws IOException {
        while (this.r == -1) {
            this.i.a();
        }
    }

    @Override // com.huawei.hms.network.embedded.wa.a
    public void d(eb ebVar) throws IOException {
        this.f15457b.onMessage(this, ebVar);
    }

    public LinkedList<Long> d() {
        return this.z;
    }

    @Override // com.huawei.hms.network.embedded.z7
    public void cancel() {
        this.g.cancel();
    }

    @Override // com.huawei.hms.network.embedded.wa.a
    public void c(eb ebVar) {
        synchronized (this) {
            if (!this.t && (!this.p || !this.n.isEmpty())) {
                this.m.add(ebVar);
                o();
                this.v++;
            }
        }
    }

    public t6 c() {
        return this.g;
    }

    @Override // com.huawei.hms.network.embedded.z7
    public boolean b(String str) {
        if (str != null) {
            return a(eb.d(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // com.huawei.hms.network.embedded.z7
    public boolean b(eb ebVar) {
        if (ebVar != null) {
            return a(ebVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    @Override // com.huawei.hms.network.embedded.wa.a
    public void b(int i, String str) {
        f fVar;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.r != -1) {
                throw new IllegalStateException("already closed");
            }
            this.r = i;
            this.s = str;
            fVar = null;
            if (this.p && this.n.isEmpty()) {
                f fVar2 = this.l;
                this.l = null;
                ScheduledFuture<?> scheduledFuture = this.q;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.k.shutdown();
                fVar = fVar2;
            }
        }
        try {
            this.f15457b.onClosing(this, i, str);
            if (fVar != null) {
                this.f15457b.onClosed(this, i, str);
            }
        } finally {
            m();
            f8.a(fVar);
        }
    }

    public void b() {
        this.f.cancel(true);
        ma.f().a(4, "After sentPingCount = " + this.u + " receivedPongCount = " + this.w + " reset the ping interver to " + this.d, (Throwable) null);
        this.u = 0;
        this.w = 0;
        this.v = 0;
    }

    public boolean a(int i, String str, long j) {
        eb ebVarD;
        synchronized (this) {
            va.b(i);
            if (str != null) {
                ebVarD = eb.d(str);
                if (ebVarD.j() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: " + str);
                }
            } else {
                ebVarD = null;
            }
            if (!this.t && !this.p) {
                this.p = true;
                this.n.add(new c(i, ebVarD, j));
                o();
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.network.embedded.z7
    public boolean a(int i, String str) {
        return a(i, str, 60000L);
    }

    public void a(String str, f fVar) throws IOException {
        synchronized (this) {
            try {
                this.l = fVar;
                this.j = new xa(fVar.f15468a, fVar.f15470c, this.f15458c, this.A);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f8.a(str, false));
                this.k = scheduledThreadPoolExecutor;
                if (this.d != 0) {
                    e eVar = new e();
                    long j = this.d;
                    this.f = scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.n.isEmpty()) {
                    o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = new wa(fVar.f15468a, fVar.f15469b, this, this.A, this.B);
    }

    @Override // com.huawei.hms.network.embedded.wa.a
    public void a(String str) throws IOException {
        this.f15457b.onMessage(this, str);
    }

    public void a(Exception exc, @Nullable v7 v7Var) {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            f fVar = this.l;
            this.l = null;
            ScheduledFuture<?> scheduledFuture = this.q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.k;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                ma.f().a(5, "failWebSocket", exc);
                this.f15457b.onFailure(this, exc, v7Var);
            } finally {
                f8.a(fVar);
                m();
            }
        }
    }

    public void a(v7 v7Var, @Nullable v8 v8Var) throws IOException {
        if (v7Var.w() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + v7Var.w() + " " + v7Var.B() + "'");
        }
        String strB = v7Var.b("Connection");
        if (!"Upgrade".equalsIgnoreCase(strB)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strB + "'");
        }
        String strB2 = v7Var.b("Upgrade");
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strB2 + "'");
        }
        String strB3 = v7Var.b("Sec-WebSocket-Accept");
        String strB4 = eb.d(this.e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").g().b();
        if (strB4.equals(strB3)) {
            if (v8Var == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strB4 + "' but was '" + strB3 + "'");
    }

    public void a(v7 v7Var) {
        if (v7Var.b(L) != null && v7Var.b(L).contains(M)) {
            this.A = true;
            if (v7Var.b(L).contains(N) && v7Var.b(L).contains(O)) {
                this.B = true;
            }
        }
        if (this.A) {
            this.C = new bb();
            this.D = new bb();
            Deflater deflater = new Deflater(-1, true);
            this.E = deflater;
            this.F = new fb((cb) this.D, deflater);
        }
    }

    public void a(q7 q7Var) {
        q7 q7VarA = q7Var.u().b(G).a();
        t7 t7VarA = this.f15456a.i().b("Upgrade", "websocket").b("Connection", "Upgrade").b("Sec-WebSocket-Key", this.e).b("Sec-WebSocket-Version", "13").a();
        t6 t6VarA = c8.f14676a.a(q7VarA, t7VarA);
        this.g = t6VarA;
        t6VarA.enqueue(new a(t7VarA));
    }

    @Override // com.huawei.hms.network.embedded.wa.a
    public void a(eb ebVar) {
        synchronized (this) {
            this.w++;
            this.x = false;
            if (this.y != 0) {
                this.z.add(Long.valueOf(System.currentTimeMillis() - this.y));
                if (this.z.size() > 5) {
                    this.z.remove(0);
                }
            }
            this.f15457b.onReadPong(this.d, this.z);
        }
    }

    public void a(long j) {
        if (j < 1000 || j > 1200000 || this.f == null) {
            ma.f().a(5, "WebSocket resetPingInterval param " + j + " error. The interval ranges are [1000,1200000]ms", (Throwable) null);
            return;
        }
        this.d = j;
        try {
            b();
            ScheduledExecutorService scheduledExecutorService = this.k;
            e eVar = new e();
            long j2 = this.d;
            this.f = scheduledExecutorService.scheduleAtFixedRate(eVar, j2, j2, TimeUnit.MILLISECONDS);
        } catch (RuntimeException e2) {
            ma.f().a(4, "Start new websocket interval ping error", e2);
        }
    }

    public void a(int i, TimeUnit timeUnit) throws InterruptedException {
        this.k.awaitTermination(i, timeUnit);
    }

    @Override // com.huawei.hms.network.embedded.z7
    public long a() {
        long j;
        synchronized (this) {
            j = this.o;
        }
        return j;
    }

    private void o() {
        if (!Q && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ScheduledExecutorService scheduledExecutorService = this.k;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        do {
            try {
            } catch (IOException e2) {
                a(e2, (v7) null);
                return;
            }
        } while (k());
    }

    private void m() {
        synchronized (this) {
            if (this.A) {
                f8.a(this.C);
                f8.a(this.D);
                f8.a(this.F);
                this.A = false;
            }
        }
    }

    private eb f(eb ebVar) throws IOException {
        if (this.B) {
            this.E.reset();
        }
        this.C.a(ebVar);
        fb fbVar = this.F;
        bb bbVar = this.C;
        fbVar.write(bbVar, bbVar.B());
        this.F.flush();
        eb ebVarR = this.D.r();
        return ebVarR.a(0, ebVarR.j() - 4);
    }

    public class a implements u6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t7 f15459a;

        @Override // com.huawei.hms.network.embedded.u6
        public void onResponse(t6 t6Var, v7 v7Var) {
            v8 v8VarA = c8.f14676a.a(v7Var);
            try {
                ua.this.a(v7Var, v8VarA);
                f fVarG = v8VarA.g();
                ua.this.a(v7Var);
                try {
                    ua.this.a("OkHttp WebSocket " + this.f15459a.k().r(), fVarG);
                    ua.this.f15457b.onOpen(ua.this, v7Var);
                    ua.this.e();
                } catch (Exception e) {
                    ua.this.a(e, (v7) null);
                }
            } catch (IOException e2) {
                if (v8VarA != null) {
                    v8VarA.m();
                }
                ua.this.a(e2, v7Var);
                f8.a(v7Var);
            }
        }

        @Override // com.huawei.hms.network.embedded.u6
        public void onFailure(t6 t6Var, IOException iOException) {
            ua.this.a(iOException, (v7) null);
        }

        public a(t7 t7Var) {
            this.f15459a = t7Var;
        }
    }

    private boolean a(eb ebVar, int i) {
        synchronized (this) {
            if (!this.t && !this.p) {
                if (this.A) {
                    try {
                        ebVar = f(ebVar);
                    } catch (Exception e2) {
                        ma.f().a(5, e2.getMessage(), e2);
                        a(e2, (v7) null);
                    }
                }
                if (ebVar == null) {
                    return false;
                }
                if (this.o + ((long) ebVar.j()) > H) {
                    a(1001, (String) null);
                    return false;
                }
                this.o += (long) ebVar.j();
                this.n.add(new d(i, ebVar));
                o();
                return true;
            }
            return false;
        }
    }

    public final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ua.this.cancel();
        }

        public b() {
        }
    }

    public final class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ua.this.l();
        }

        public e() {
        }
    }

    public ua(t7 t7Var, a8 a8Var, Random random, long j) {
        if (!"GET".equals(t7Var.h())) {
            throw new IllegalArgumentException("Request must be GET: " + t7Var.h());
        }
        this.f15456a = t7Var;
        this.f15457b = a8Var;
        this.f15458c = random;
        this.d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.e = eb.e(bArr).b();
        this.h = new Runnable() { // from class: com.huawei.hms.network.embedded.ua$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.n();
            }
        };
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final eb f15463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f15464c;

        public c(int i, eb ebVar, long j) {
            this.f15462a = i;
            this.f15463b = ebVar;
            this.f15464c = j;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final eb f15466b;

        public d(int i, eb ebVar) {
            this.f15465a = i;
            this.f15466b = ebVar;
        }
    }

    public static abstract class f implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f15468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final db f15469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cb f15470c;

        public f(boolean z, db dbVar, cb cbVar) {
            this.f15468a = z;
            this.f15469b = dbVar;
            this.f15470c = cbVar;
        }
    }
}
