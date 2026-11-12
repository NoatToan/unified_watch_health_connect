package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
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
import okhttp3.Protocol;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes23.dex */
public final class Http2Connection implements Closeable {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final long D = 1000000000;
    private static final ExecutorService E = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    public static final /* synthetic */ boolean F = false;
    public static final int z = 16777216;
    public final boolean a;
    public final Listener b;
    public final String d;
    public int e;
    public int f;
    private boolean g;
    private final ScheduledExecutorService h;
    private final ExecutorService i;
    public final PushObserver j;
    public long s;
    public final Settings u;
    public final Socket v;
    public final okhttp3.internal.http2.c w;
    public final j x;
    public final Set<Integer> y;
    public final Map<Integer, Http2Stream> c = new LinkedHashMap();
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    public long r = 0;
    public Settings t = new Settings();

    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new a();

        public class a extends Listener {
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        }

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    public class a extends NamedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ ErrorCode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.a = i;
            this.b = errorCode;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            try {
                Http2Connection.this.E(this.a, this.b);
            } catch (IOException unused) {
                Http2Connection.this.n();
            }
        }
    }

    public class b extends NamedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.a = i;
            this.b = j;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            try {
                Http2Connection.this.w.windowUpdate(this.a, this.b);
            } catch (IOException unused) {
                Http2Connection.this.n();
            }
        }
    }

    public class c extends NamedRunnable {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            Http2Connection.this.B(false, 2, 0);
        }
    }

    public class d extends NamedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.a = i;
            this.b = list;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            if (Http2Connection.this.j.onRequest(this.a, this.b)) {
                try {
                    Http2Connection.this.w.f(this.a, ErrorCode.CANCEL);
                    synchronized (Http2Connection.this) {
                        try {
                            Http2Connection.this.y.remove(Integer.valueOf(this.a));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    public class e extends NamedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.a = i;
            this.b = list;
            this.c = z;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            boolean zOnHeaders = Http2Connection.this.j.onHeaders(this.a, this.b, this.c);
            if (zOnHeaders) {
                try {
                    Http2Connection.this.w.f(this.a, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zOnHeaders || this.c) {
                synchronized (Http2Connection.this) {
                    try {
                        Http2Connection.this.y.remove(Integer.valueOf(this.a));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class f extends NamedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Buffer b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            super(str, objArr);
            this.a = i;
            this.b = buffer;
            this.c = i2;
            this.d = z;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            try {
                boolean zOnData = Http2Connection.this.j.onData(this.a, this.b, this.c, this.d);
                if (zOnData) {
                    Http2Connection.this.w.f(this.a, ErrorCode.CANCEL);
                }
                if (zOnData || this.d) {
                    synchronized (Http2Connection.this) {
                        Http2Connection.this.y.remove(Integer.valueOf(this.a));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public class g extends NamedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ ErrorCode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.a = i;
            this.b = errorCode;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            Http2Connection.this.j.onReset(this.a, this.b);
            synchronized (Http2Connection.this) {
                Http2Connection.this.y.remove(Integer.valueOf(this.a));
            }
        }
    }

    public final class h extends NamedRunnable {
        public h() {
            super("OkHttp %s ping", Http2Connection.this.d);
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            boolean z;
            synchronized (Http2Connection.this) {
                if (Http2Connection.this.l < Http2Connection.this.k) {
                    z = true;
                } else {
                    Http2Connection.e(Http2Connection.this);
                    z = false;
                }
            }
            if (z) {
                Http2Connection.this.n();
            } else {
                Http2Connection.this.B(false, 1, 0);
            }
        }
    }

    public final class i extends NamedRunnable {
        public final boolean a;
        public final int b;
        public final int c;

        public i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.d, Integer.valueOf(i), Integer.valueOf(i2));
            this.a = z;
            this.b = i;
            this.c = i2;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            Http2Connection.this.B(this.a, this.b, this.c);
        }
    }

    public class j extends NamedRunnable implements okhttp3.internal.http2.b.InterfaceC1190b {
        public final okhttp3.internal.http2.b a;

        public class a extends NamedRunnable {
            public final /* synthetic */ Http2Stream a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, Http2Stream http2Stream) {
                super(str, objArr);
                this.a = http2Stream;
            }

            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.b.onStream(this.a);
                } catch (IOException e) {
                    Platform.get().log(4, "Http2Connection.Listener failure for " + Http2Connection.this.d, e);
                    try {
                        this.a.close(ErrorCode.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public class b extends NamedRunnable {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ Settings b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z, Settings settings) {
                super(str, objArr);
                this.a = z;
                this.b = settings;
            }

            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                j.this.e(this.a, this.b);
            }
        }

        public class c extends NamedRunnable {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.b.onSettings(http2Connection);
            }
        }

        public j(okhttp3.internal.http2.b bVar) {
            super("OkHttp %s", Http2Connection.this.d);
            this.a = bVar;
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void a(int i, ErrorCode errorCode) {
            if (Http2Connection.this.v(i)) {
                Http2Connection.this.u(i, errorCode);
                return;
            }
            Http2Stream http2StreamW = Http2Connection.this.w(i);
            if (http2StreamW != null) {
                http2StreamW.j(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void b(int i, ErrorCode errorCode, ByteString byteString) {
            Http2Stream[] http2StreamArr;
            byteString.size();
            synchronized (Http2Connection.this) {
                http2StreamArr = (Http2Stream[]) Http2Connection.this.c.values().toArray(new Http2Stream[Http2Connection.this.c.size()]);
                Http2Connection.this.g = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.j(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.w(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void c(boolean z, Settings settings) {
            try {
                Http2Connection.this.h.execute(new b("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.d}, z, settings));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void d(boolean z, int i, int i2, List<Header> list) {
            if (Http2Connection.this.v(i)) {
                Http2Connection.this.s(i, list, z);
                return;
            }
            synchronized (Http2Connection.this) {
                Http2Stream http2StreamO = Http2Connection.this.o(i);
                if (http2StreamO != null) {
                    http2StreamO.i(list);
                    if (z) {
                        http2StreamO.h();
                        return;
                    }
                    return;
                }
                if (Http2Connection.this.g) {
                    return;
                }
                Http2Connection http2Connection = Http2Connection.this;
                if (i <= http2Connection.e) {
                    return;
                }
                if (i % 2 == http2Connection.f % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, Http2Connection.this, false, z, Util.toHeaders(list));
                Http2Connection http2Connection2 = Http2Connection.this;
                http2Connection2.e = i;
                http2Connection2.c.put(Integer.valueOf(i), http2Stream);
                Http2Connection.E.execute(new a("OkHttp %s stream %d", new Object[]{Http2Connection.this.d, Integer.valueOf(i)}, http2Stream));
            }
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void data(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (Http2Connection.this.v(i)) {
                Http2Connection.this.q(i, bufferedSource, i2, z);
                return;
            }
            Http2Stream http2StreamO = Http2Connection.this.o(i);
            if (http2StreamO == null) {
                Http2Connection.this.F(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                Http2Connection.this.z(j);
                bufferedSource.skip(j);
                return;
            }
            http2StreamO.g(bufferedSource, i2);
            if (z) {
                http2StreamO.h();
            }
        }

        public void e(boolean z, Settings settings) {
            Http2Stream[] http2StreamArr;
            long j;
            synchronized (Http2Connection.this.w) {
                synchronized (Http2Connection.this) {
                    int iE = Http2Connection.this.u.e();
                    if (z) {
                        Http2Connection.this.u.a();
                    }
                    Http2Connection.this.u.j(settings);
                    int iE2 = Http2Connection.this.u.e();
                    http2StreamArr = null;
                    if (iE2 == -1 || iE2 == iE) {
                        j = 0;
                    } else {
                        j = iE2 - iE;
                        if (!Http2Connection.this.c.isEmpty()) {
                            http2StreamArr = (Http2Stream[]) Http2Connection.this.c.values().toArray(new Http2Stream[Http2Connection.this.c.size()]);
                        }
                    }
                }
                try {
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.w.a(http2Connection.u);
                } catch (IOException unused) {
                    Http2Connection.this.n();
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.c(j);
                    }
                }
            }
            Http2Connection.E.execute(new c("OkHttp %s settings", Http2Connection.this.d));
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.a.c(this);
                    while (this.a.b(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        try {
                            Http2Connection.this.m(errorCode, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            Http2Connection.this.m(errorCode3, errorCode3);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Http2Connection.this.m(errorCode, errorCode2);
                        } catch (IOException unused2) {
                        }
                        Util.closeQuietly(this.a);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                errorCode = errorCode2;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                Http2Connection.this.m(errorCode, errorCode2);
                Util.closeQuietly(this.a);
                throw th;
            }
            Util.closeQuietly(this.a);
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void ping(boolean z, int i, int i2) {
            if (!z) {
                try {
                    Http2Connection.this.h.execute(Http2Connection.this.new i(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (Http2Connection.this) {
                try {
                    if (i == 1) {
                        Http2Connection.c(Http2Connection.this);
                    } else if (i == 2) {
                        Http2Connection.j(Http2Connection.this);
                    } else if (i == 3) {
                        Http2Connection.k(Http2Connection.this);
                        Http2Connection.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void pushPromise(int i, int i2, List<Header> list) {
            Http2Connection.this.t(i2, list);
        }

        @Override // okhttp3.internal.http2.b.InterfaceC1190b
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.s += j;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream http2StreamO = Http2Connection.this.o(i);
            if (http2StreamO != null) {
                synchronized (http2StreamO) {
                    http2StreamO.c(j);
                }
            }
        }
    }

    public Http2Connection(Builder builder) {
        Settings settings = new Settings();
        this.u = settings;
        this.y = new LinkedHashSet();
        this.j = builder.f;
        boolean z2 = builder.g;
        this.a = z2;
        this.b = builder.e;
        int i2 = z2 ? 1 : 2;
        this.f = i2;
        if (z2) {
            this.f = i2 + 2;
        }
        if (z2) {
            this.t.k(7, 16777216);
        }
        String str = builder.b;
        this.d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", str), false));
        this.h = scheduledThreadPoolExecutor;
        if (builder.h != 0) {
            h hVar = new h();
            int i3 = builder.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar, i3, i3, TimeUnit.MILLISECONDS);
        }
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", str), true));
        settings.k(7, 65535);
        settings.k(5, 16384);
        this.s = settings.e();
        this.v = builder.a;
        this.w = new okhttp3.internal.http2.c(builder.d, z2);
        this.x = new j(new okhttp3.internal.http2.b(builder.c, z2));
    }

    public static /* synthetic */ long c(Http2Connection http2Connection) {
        long j2 = http2Connection.l;
        http2Connection.l = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long e(Http2Connection http2Connection) {
        long j2 = http2Connection.k;
        http2Connection.k = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long j(Http2Connection http2Connection) {
        long j2 = http2Connection.n;
        http2Connection.n = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long k(Http2Connection http2Connection) {
        long j2 = http2Connection.p;
        http2Connection.p = 1 + j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            m(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    private Http2Stream p(int i2, List<Header> list, boolean z2) throws IOException {
        int i3;
        Http2Stream http2Stream;
        boolean z3;
        boolean z4 = !z2;
        synchronized (this.w) {
            synchronized (this) {
                if (this.f > 1073741823) {
                    shutdown(ErrorCode.REFUSED_STREAM);
                }
                if (this.g) {
                    throw new ConnectionShutdownException();
                }
                i3 = this.f;
                this.f = i3 + 2;
                http2Stream = new Http2Stream(i3, this, z4, false, null);
                z3 = !z2 || this.s == 0 || http2Stream.b == 0;
                if (http2Stream.isOpen()) {
                    this.c.put(Integer.valueOf(i3), http2Stream);
                }
            }
            if (i2 == 0) {
                this.w.h(z4, i3, i2, list);
            } else {
                if (this.a) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.w.pushPromise(i2, i3, list);
            }
        }
        if (z3) {
            this.w.flush();
        }
        return http2Stream;
    }

    private synchronized void r(NamedRunnable namedRunnable) {
        if (!this.g) {
            this.i.execute(namedRunnable);
        }
    }

    public void A() {
        synchronized (this) {
            this.o++;
        }
        B(false, 3, 1330343787);
    }

    public void B(boolean z2, int i2, int i3) {
        try {
            this.w.ping(z2, i2, i3);
        } catch (IOException unused) {
            n();
        }
    }

    public void C() throws InterruptedException {
        A();
        l();
    }

    public void D(int i2, boolean z2, List<Header> list) throws IOException {
        this.w.synReply(z2, i2, list);
    }

    public void E(int i2, ErrorCode errorCode) throws IOException {
        this.w.f(i2, errorCode);
    }

    public void F(int i2, ErrorCode errorCode) {
        try {
            this.h.execute(new a("OkHttp %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}, i2, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void G(int i2, long j2) {
        try {
            this.h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() throws IOException {
        this.w.flush();
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public synchronized boolean isHealthy(long j2) {
        if (this.g) {
            return false;
        }
        return this.n >= this.m || j2 < this.q;
    }

    public synchronized void l() throws InterruptedException {
        while (this.p < this.o) {
            wait();
        }
    }

    public void m(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        Http2Stream[] http2StreamArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.c.isEmpty()) {
                http2StreamArr = (Http2Stream[]) this.c.values().toArray(new Http2Stream[this.c.size()]);
                this.c.clear();
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.v.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.h.shutdown();
        this.i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public synchronized int maxConcurrentStreams() {
        return this.u.f(Integer.MAX_VALUE);
    }

    public Http2Stream newStream(List<Header> list, boolean z2) throws IOException {
        return p(0, list, z2);
    }

    public synchronized Http2Stream o(int i2) {
        return this.c.get(Integer.valueOf(i2));
    }

    public synchronized int openStreamCount() {
        return this.c.size();
    }

    public Http2Stream pushStream(int i2, List<Header> list, boolean z2) throws IOException {
        if (this.a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return p(i2, list, z2);
    }

    public void q(int i2, BufferedSource bufferedSource, int i3, boolean z2) throws IOException {
        Buffer buffer = new Buffer();
        long j2 = i3;
        bufferedSource.require(j2);
        bufferedSource.read(buffer, j2);
        if (buffer.size() == j2) {
            r(new f("OkHttp %s Push Data[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, buffer, i3, z2));
            return;
        }
        throw new IOException(buffer.size() + " != " + i3);
    }

    public void s(int i2, List<Header> list, boolean z2) {
        try {
            r(new e("OkHttp %s Push Headers[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void setSettings(Settings settings) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (this.g) {
                    throw new ConnectionShutdownException();
                }
                this.t.j(settings);
            }
            this.w.g(settings);
        }
    }

    public void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.w.d(this.e, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public void start() throws IOException {
        y(true);
    }

    public void t(int i2, List<Header> list) {
        synchronized (this) {
            if (this.y.contains(Integer.valueOf(i2))) {
                F(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.y.add(Integer.valueOf(i2));
            try {
                r(new d("OkHttp %s Push Request[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void u(int i2, ErrorCode errorCode) {
        r(new g("OkHttp %s Push Reset[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, errorCode));
    }

    public boolean v(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized Http2Stream w(int i2) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.c.remove(Integer.valueOf(i2));
        notifyAll();
        return http2StreamRemove;
    }

    public void writeData(int i2, boolean z2, Buffer buffer, long j2) throws IOException {
        long j3;
        int iMin;
        long j4;
        if (j2 == 0) {
            this.w.data(z2, i2, buffer, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j3 = this.s;
                        if (j3 <= 0) {
                            if (!this.c.containsKey(Integer.valueOf(i2))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j2, j3), this.w.maxDataLength());
                j4 = iMin;
                this.s -= j4;
            }
            j2 -= j4;
            this.w.data(z2 && j2 == 0, i2, buffer, iMin);
        }
    }

    public void x() {
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

    public void y(boolean z2) throws IOException {
        if (z2) {
            this.w.connectionPreface();
            this.w.g(this.t);
            int iE = this.t.e();
            if (iE != 65535) {
                this.w.windowUpdate(0, iE - 65535);
            }
        }
        new Thread(this.x).start();
    }

    public synchronized void z(long j2) {
        long j3 = this.r + j2;
        this.r = j3;
        if (j3 >= this.t.e() / 2) {
            G(0, this.r);
            this.r = 0L;
        }
    }

    public static class Builder {
        public Socket a;
        public String b;
        public BufferedSource c;
        public BufferedSink d;
        public Listener e = Listener.REFUSE_INCOMING_STREAMS;
        public PushObserver f = PushObserver.CANCEL;
        public boolean g;
        public int h;

        public Builder(boolean z) {
            this.g = z;
        }

        public Http2Connection build() {
            return new Http2Connection(this);
        }

        public Builder listener(Listener listener) {
            this.e = listener;
            return this;
        }

        public Builder pingIntervalMillis(int i) {
            this.h = i;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.f = pushObserver;
            return this;
        }

        public Builder socket(Socket socket) throws IOException {
            return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), Okio.buffer(Okio.source(socket)), Okio.buffer(Okio.sink(socket)));
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.a = socket;
            this.b = str;
            this.c = bufferedSource;
            this.d = bufferedSink;
            return this;
        }
    }
}
