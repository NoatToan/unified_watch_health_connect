package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class v9 implements Closeable {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final long D = 1000000000;
    public static final ExecutorService E = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), f8.a("OkHttp Http2Connection", true));
    public static final /* synthetic */ boolean F = true;
    public static final int z = 16777216;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f15514b;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final ScheduledExecutorService h;
    public final ExecutorService i;
    public final ba j;
    public long s;
    public final ca u;
    public final Socket v;
    public final z9 w;
    public final l x;
    public final Set<Integer> y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, y9> f15515c = new LinkedHashMap();
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public long q = 0;
    public long r = 0;
    public ca t = new ca();

    public boolean e(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public void y() throws InterruptedException {
        x();
        s();
    }

    public void x() {
        synchronized (this) {
            this.o++;
        }
        a(false, 3, 1330343787);
    }

    public void w() throws IOException {
        a(true);
    }

    public void v() {
        synchronized (this) {
            long j2 = this.n;
            long j3 = this.m;
            if (j2 < j3) {
                return;
            }
            this.m = j3 + 1;
            this.q = System.nanoTime() + 1000000000;
            try {
                this.h.execute(new c("OkHttp %s ping", this.d));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public int u() {
        int size;
        synchronized (this) {
            size = this.f15515c.size();
        }
        return size;
    }

    public int t() {
        int iB;
        synchronized (this) {
            iB = this.u.b(Integer.MAX_VALUE);
        }
        return iB;
    }

    public void s() throws InterruptedException {
        synchronized (this) {
            while (this.p < this.o) {
                wait();
            }
        }
    }

    public void k(long j2) {
        synchronized (this) {
            long j3 = this.r + j2;
            this.r = j3;
            if (j3 >= this.t.c() / 2) {
                a(0, this.r);
                this.r = 0L;
            }
        }
    }

    public boolean j(long j2) {
        synchronized (this) {
            if (this.g) {
                return false;
            }
            return this.n >= this.m || j2 < this.q;
        }
    }

    public void flush() throws IOException {
        this.w.flush();
    }

    public y9 f(int i2) {
        y9 y9VarRemove;
        synchronized (this) {
            y9VarRemove = this.f15515c.remove(Integer.valueOf(i2));
            notifyAll();
        }
        return y9VarRemove;
    }

    public y9 d(int i2) {
        y9 y9Var;
        synchronized (this) {
            y9Var = this.f15515c.get(Integer.valueOf(i2));
        }
        return y9Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(r9.NO_ERROR, r9.CANCEL, (IOException) null);
    }

    public void c(int i2, r9 r9Var) {
        try {
            this.h.execute(new a("OkHttp %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}, i2, r9Var));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void b(int i2, r9 r9Var) throws IOException {
        this.w.a(i2, r9Var);
    }

    public y9 b(int i2, List<s9> list, boolean z2) throws IOException {
        if (this.f15513a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return c(i2, list, z2);
    }

    public void a(boolean z2, int i2, int i3) {
        try {
            this.w.a(z2, i2, i3);
        } catch (IOException e2) {
            a(e2);
        }
    }

    public void a(boolean z2) throws IOException {
        if (z2) {
            this.w.s();
            this.w.b(this.t);
            int iC = this.t.c();
            if (iC != 65535) {
                this.w.a(0, iC - 65535);
            }
        }
        new Thread(this.x).start();
    }

    public void a(r9 r9Var, r9 r9Var2, @Nullable IOException iOException) {
        y9[] y9VarArr;
        if (!F && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        try {
            a(r9Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f15515c.isEmpty()) {
                y9VarArr = null;
            } else {
                y9VarArr = (y9[]) this.f15515c.values().toArray(new y9[this.f15515c.size()]);
                this.f15515c.clear();
            }
        }
        if (y9VarArr != null) {
            for (y9 y9Var : y9VarArr) {
                try {
                    y9Var.a(r9Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.h.shutdown();
        this.i.shutdown();
    }

    public void a(r9 r9Var) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    this.w.a(this.e, r9Var, f8.f14776a);
                }
            }
        }
    }

    public void a(ca caVar) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (this.g) {
                    throw new q9();
                }
                this.t.a(caVar);
            }
            this.w.b(caVar);
        }
    }

    public void a(int i2, boolean z2, List<s9> list) throws IOException {
        this.w.a(z2, i2, list);
    }

    public void a(int i2, boolean z2, bb bbVar, long j2) throws IOException {
        long j3;
        int iMin;
        long j4;
        if (j2 == 0) {
            this.w.a(z2, i2, bbVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j3 = this.s;
                        if (j3 <= 0) {
                            if (!this.f15515c.containsKey(Integer.valueOf(i2))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j2, j3), this.w.t());
                j4 = iMin;
                this.s -= j4;
            }
            j2 -= j4;
            this.w.a(z2 && j2 == 0, i2, bbVar, iMin);
        }
    }

    public void a(int i2, List<s9> list, boolean z2) {
        try {
            a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(int i2, List<s9> list) {
        synchronized (this) {
            try {
                if (this.y.contains(Integer.valueOf(i2))) {
                    c(i2, r9.PROTOCOL_ERROR);
                    return;
                }
                this.y.add(Integer.valueOf(i2));
                try {
                    a(new d("OkHttp %s Push Request[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, list));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i2, r9 r9Var) {
        a(new g("OkHttp %s Push Reset[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, r9Var));
    }

    public void a(int i2, db dbVar, int i3, boolean z2) throws IOException {
        bb bbVar = new bb();
        long j2 = i3;
        dbVar.i(j2);
        dbVar.read(bbVar, j2);
        if (bbVar.B() == j2) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, bbVar, i3, z2));
            return;
        }
        throw new IOException(bbVar.B() + " != " + i3);
    }

    public void a(int i2, long j2) {
        try {
            this.h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public y9 a(List<s9> list, boolean z2) throws IOException {
        return c(0, list, z2);
    }

    public class l extends d8 implements x9.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x9 f15536b;

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a() {
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(int i, int i2, int i3, boolean z) {
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(int i, String str, eb ebVar, String str2, int i2, long j) {
        }

        public void b(boolean z, ca caVar) {
            y9[] y9VarArr;
            long j;
            synchronized (v9.this.w) {
                synchronized (v9.this) {
                    int iC = v9.this.u.c();
                    if (z) {
                        v9.this.u.a();
                    }
                    v9.this.u.a(caVar);
                    int iC2 = v9.this.u.c();
                    y9VarArr = null;
                    if (iC2 == -1 || iC2 == iC) {
                        j = 0;
                    } else {
                        j = iC2 - iC;
                        if (!v9.this.f15515c.isEmpty()) {
                            y9VarArr = (y9[]) v9.this.f15515c.values().toArray(new y9[v9.this.f15515c.size()]);
                        }
                    }
                }
                try {
                    v9.this.w.a(v9.this.u);
                } catch (IOException e) {
                    v9.this.a(e);
                }
            }
            if (y9VarArr != null) {
                for (y9 y9Var : y9VarArr) {
                    synchronized (y9Var) {
                        y9Var.a(j);
                    }
                }
            }
            v9.E.execute(new c("OkHttp %s settings", v9.this.d));
        }

        @Override // com.huawei.hms.network.embedded.d8
        public void b() throws Throwable {
            Throwable th;
            NullPointerException e;
            r9 r9Var;
            r9 r9Var2;
            r9 r9Var3 = r9.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.f15536b.a(this);
                    while (this.f15536b.a(false, (x9.b) this)) {
                    }
                    r9Var = r9.NO_ERROR;
                    try {
                        r9Var2 = r9.CANCEL;
                    } catch (IOException e3) {
                        e2 = e3;
                        r9Var = r9.PROTOCOL_ERROR;
                        r9Var2 = r9.PROTOCOL_ERROR;
                    } catch (NullPointerException e4) {
                        e = e4;
                        ma.f().a(5, e.getMessage(), e);
                        v9.this.a(r9Var, r9Var3, new IOException(e));
                        f8.a(this.f15536b);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    v9.this.a(r9Var3, r9Var3, (IOException) null);
                    f8.a(this.f15536b);
                    throw th;
                }
            } catch (IOException e5) {
                e2 = e5;
            } catch (NullPointerException e6) {
                e = e6;
                r9Var = r9Var3;
            } catch (Throwable th3) {
                th = th3;
                v9.this.a(r9Var3, r9Var3, (IOException) null);
                f8.a(this.f15536b);
                throw th;
            }
            v9.this.a(r9Var, r9Var2, e2);
            f8.a(this.f15536b);
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(boolean z, ca caVar) {
            try {
                v9.this.h.execute(new b("OkHttp %s ACK Settings", new Object[]{v9.this.d}, z, caVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(boolean z, int i, db dbVar, int i2) throws IOException {
            if (v9.this.e(i)) {
                v9.this.a(i, dbVar, i2, z);
                return;
            }
            y9 y9VarD = v9.this.d(i);
            if (y9VarD == null) {
                v9.this.c(i, r9.PROTOCOL_ERROR);
                long j = i2;
                v9.this.k(j);
                dbVar.skip(j);
                return;
            }
            y9VarD.a(dbVar, i2);
            if (z) {
                y9VarD.a(f8.f14778c, true);
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(boolean z, int i, int i2, List<s9> list) {
            if (v9.this.e(i)) {
                v9.this.a(i, list, z);
                return;
            }
            synchronized (v9.this) {
                y9 y9VarD = v9.this.d(i);
                if (y9VarD != null) {
                    y9VarD.a(f8.b(list), z);
                    return;
                }
                if (!v9.this.g && i > v9.this.e && i % 2 != v9.this.f % 2) {
                    y9 y9Var = new y9(i, v9.this, false, z, f8.b(list));
                    v9.this.e = i;
                    v9.this.f15515c.put(Integer.valueOf(i), y9Var);
                    v9.E.execute(new a("OkHttp %s stream %d", new Object[]{v9.this.d, Integer.valueOf(i)}, y9Var));
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(boolean z, int i, int i2) {
            if (!z) {
                try {
                    v9.this.h.execute(v9.this.new k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (v9.this) {
                try {
                    if (i == 1) {
                        v9.b(v9.this);
                    } else if (i == 2) {
                        v9.g(v9.this);
                    } else if (i == 3) {
                        v9.h(v9.this);
                        v9.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(int i, r9 r9Var, eb ebVar) {
            y9[] y9VarArr;
            ebVar.j();
            synchronized (v9.this) {
                y9VarArr = (y9[]) v9.this.f15515c.values().toArray(new y9[v9.this.f15515c.size()]);
                v9.this.g = true;
            }
            for (y9 y9Var : y9VarArr) {
                if (y9Var.e() > i && y9Var.h()) {
                    y9Var.b(r9.REFUSED_STREAM);
                    v9.this.f(y9Var.e());
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(int i, r9 r9Var) {
            if (v9.this.e(i)) {
                v9.this.a(i, r9Var);
                return;
            }
            y9 y9VarF = v9.this.f(i);
            if (y9VarF != null) {
                y9VarF.b(r9Var);
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(int i, long j) {
            v9 v9Var = v9.this;
            if (i == 0) {
                synchronized (v9Var) {
                    v9.this.s += j;
                    v9.this.notifyAll();
                }
                return;
            }
            y9 y9VarD = v9Var.d(i);
            if (y9VarD != null) {
                synchronized (y9VarD) {
                    y9VarD.a(j);
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.x9.b
        public void a(int i, int i2, List<s9> list) {
            v9.this.a(i2, list);
        }

        public class a extends d8 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y9 f15538b;

            @Override // com.huawei.hms.network.embedded.d8
            public void b() {
                try {
                    v9.this.f15514b.a(this.f15538b);
                } catch (IOException e) {
                    ma.f().a(4, "Http2Connection.Listener failure for " + v9.this.d, e);
                    try {
                        this.f15538b.a(r9.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, y9 y9Var) {
                super(str, objArr);
                this.f15538b = y9Var;
            }
        }

        public class b extends d8 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f15540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ca f15541c;

            @Override // com.huawei.hms.network.embedded.d8
            public void b() {
                l.this.b(this.f15540b, this.f15541c);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z, ca caVar) {
                super(str, objArr);
                this.f15540b = z;
                this.f15541c = caVar;
            }
        }

        public class c extends d8 {
            @Override // com.huawei.hms.network.embedded.d8
            public void b() {
                v9 v9Var = v9.this;
                v9Var.f15514b.a(v9Var);
            }

            public c(String str, Object... objArr) {
                super(str, objArr);
            }
        }

        public l(x9 x9Var) {
            super("OkHttp %s", v9.this.d);
            this.f15536b = x9Var;
        }
    }

    public static /* synthetic */ long h(v9 v9Var) {
        long j2 = v9Var.p;
        v9Var.p = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long g(v9 v9Var) {
        long j2 = v9Var.n;
        v9Var.n = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long d(v9 v9Var) {
        long j2 = v9Var.k;
        v9Var.k = 1 + j2;
        return j2;
    }

    private y9 c(int i2, List<s9> list, boolean z2) throws IOException {
        int i3;
        y9 y9Var;
        boolean z3;
        boolean z4 = !z2;
        synchronized (this.w) {
            synchronized (this) {
                try {
                    if (this.f > 1073741823) {
                        a(r9.REFUSED_STREAM);
                    }
                    if (this.g) {
                        throw new q9();
                    }
                    i3 = this.f;
                    this.f = i3 + 2;
                    y9Var = new y9(i3, this, z4, false, null);
                    z3 = !z2 || this.s == 0 || y9Var.f15635b == 0;
                    if (y9Var.i()) {
                        this.f15515c.put(Integer.valueOf(i3), y9Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == 0) {
                this.w.a(z4, i3, list);
            } else {
                if (this.f15513a) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.w.a(i2, i3, list);
            }
        }
        if (z3) {
            this.w.flush();
        }
        return y9Var;
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f15529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public db f15531c;
        public cb d;
        public j e = j.f15533a;
        public ba f = ba.f14650a;
        public boolean g;
        public int h;

        public v9 a() {
            return new v9(this);
        }

        public h a(Socket socket, String str, db dbVar, cb cbVar) {
            this.f15529a = socket;
            this.f15530b = str;
            this.f15531c = dbVar;
            this.d = cbVar;
            return this;
        }

        public h a(Socket socket) throws IOException {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            return a(socket, remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString(), ob.a(ob.b(socket)), ob.a(ob.a(socket)));
        }

        public h a(j jVar) {
            this.e = jVar;
            return this;
        }

        public h a(ba baVar) {
            this.f = baVar;
            return this;
        }

        public h a(int i) {
            this.h = i;
            return this;
        }

        public h(boolean z) {
            this.g = z;
        }
    }

    public static /* synthetic */ long b(v9 v9Var) {
        long j2 = v9Var.l;
        v9Var.l = 1 + j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@Nullable IOException iOException) {
        r9 r9Var = r9.PROTOCOL_ERROR;
        a(r9Var, r9Var, iOException);
    }

    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f15533a = new a();

        public void a(v9 v9Var) {
        }

        public abstract void a(y9 y9Var) throws IOException;

        public class a extends j {
            @Override // com.huawei.hms.network.embedded.v9.j
            public void a(y9 y9Var) throws IOException {
                y9Var.a(r9.REFUSED_STREAM, (IOException) null);
            }
        }
    }

    private void a(d8 d8Var) {
        synchronized (this) {
            if (!this.g) {
                this.i.execute(d8Var);
            }
        }
    }

    public class a extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r9 f15517c;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            try {
                v9.this.b(this.f15516b, this.f15517c);
            } catch (IOException e) {
                v9.this.a(e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, r9 r9Var) {
            super(str, objArr);
            this.f15516b = i;
            this.f15517c = r9Var;
        }
    }

    public class b extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f15519c;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            try {
                v9.this.w.a(this.f15518b, this.f15519c);
            } catch (IOException e) {
                v9.this.a(e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f15518b = i;
            this.f15519c = j;
        }
    }

    public class c extends d8 {
        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            v9.this.a(false, 2, 0);
        }

        public c(String str, Object... objArr) {
            super(str, objArr);
        }
    }

    public class d extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f15522c;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            if (v9.this.j.a(this.f15521b, this.f15522c)) {
                try {
                    v9.this.w.a(this.f15521b, r9.CANCEL);
                    synchronized (v9.this) {
                        try {
                            v9.this.y.remove(Integer.valueOf(this.f15521b));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f15521b = i;
            this.f15522c = list;
        }
    }

    public class e extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f15524c;
        public final /* synthetic */ boolean d;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            boolean zA = v9.this.j.a(this.f15523b, this.f15524c, this.d);
            if (zA) {
                try {
                    v9.this.w.a(this.f15523b, r9.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.d) {
                synchronized (v9.this) {
                    try {
                        v9.this.y.remove(Integer.valueOf(this.f15523b));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f15523b = i;
            this.f15524c = list;
            this.d = z;
        }
    }

    public class f extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bb f15526c;
        public final /* synthetic */ int d;
        public final /* synthetic */ boolean e;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            try {
                boolean zA = v9.this.j.a(this.f15525b, this.f15526c, this.d, this.e);
                if (zA) {
                    v9.this.w.a(this.f15525b, r9.CANCEL);
                }
                if (zA || this.e) {
                    synchronized (v9.this) {
                        v9.this.y.remove(Integer.valueOf(this.f15525b));
                    }
                }
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i, bb bbVar, int i2, boolean z) {
            super(str, objArr);
            this.f15525b = i;
            this.f15526c = bbVar;
            this.d = i2;
            this.e = z;
        }
    }

    public class g extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r9 f15528c;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            v9.this.j.a(this.f15527b, this.f15528c);
            synchronized (v9.this) {
                v9.this.y.remove(Integer.valueOf(this.f15527b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, int i, r9 r9Var) {
            super(str, objArr);
            this.f15527b = i;
            this.f15528c = r9Var;
        }
    }

    public final class i extends d8 {
        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            boolean z;
            synchronized (v9.this) {
                if (v9.this.l < v9.this.k) {
                    z = true;
                } else {
                    v9.d(v9.this);
                    z = false;
                }
            }
            v9 v9Var = v9.this;
            if (z) {
                v9Var.a((IOException) null);
            } else {
                v9Var.a(false, 1, 0);
            }
        }

        public i() {
            super("OkHttp %s ping", v9.this.d);
        }
    }

    public final class k extends d8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15535c;
        public final int d;

        @Override // com.huawei.hms.network.embedded.d8
        public void b() {
            v9.this.a(this.f15534b, this.f15535c, this.d);
        }

        public k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", v9.this.d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f15534b = z;
            this.f15535c = i;
            this.d = i2;
        }
    }

    public v9(h hVar) {
        ca caVar = new ca();
        this.u = caVar;
        this.y = new LinkedHashSet();
        this.j = hVar.f;
        boolean z2 = hVar.g;
        this.f15513a = z2;
        this.f15514b = hVar.e;
        this.f = z2 ? 1 : 2;
        if (hVar.g) {
            this.f += 2;
        }
        if (hVar.g) {
            this.t.a(7, 16777216);
        }
        String str = hVar.f15530b;
        this.d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f8.a(f8.a("OkHttp %s Writer", str), false));
        this.h = scheduledThreadPoolExecutor;
        if (hVar.h != 0) {
            i iVar = new i();
            long j2 = hVar.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f8.a(f8.a("OkHttp %s Push Observer", str), true));
        caVar.a(7, 65535);
        caVar.a(5, 16384);
        this.s = caVar.c();
        this.v = hVar.f15529a;
        this.w = new z9(hVar.d, z2);
        this.x = new l(new x9(hVar.f15531c, z2));
    }
}
