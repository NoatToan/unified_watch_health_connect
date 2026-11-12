package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
public final class Http2Stream {
    public static final /* synthetic */ boolean m = false;
    public long a = 0;
    public long b;
    public final int c;
    public final Http2Connection d;
    private final Deque<Headers> e;
    private Header.a f;
    private boolean g;
    private final b h;
    public final a i;
    public final c j;
    public final c k;
    public ErrorCode l;

    public final class a implements Sink {
        private static final long e = 16384;
        public static final /* synthetic */ boolean f = false;
        private final Buffer a = new Buffer();
        public boolean b;
        public boolean c;

        public a() {
        }

        private void a(boolean z) throws IOException {
            Http2Stream http2Stream;
            long jMin;
            Http2Stream http2Stream2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.k.enter();
                while (true) {
                    try {
                        http2Stream = Http2Stream.this;
                        if (http2Stream.b > 0 || this.c || this.b || http2Stream.l != null) {
                            break;
                        } else {
                            http2Stream.k();
                        }
                    } catch (Throwable th) {
                        Http2Stream.this.k.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.k.exitAndThrowIfTimedOut();
                Http2Stream.this.e();
                jMin = Math.min(Http2Stream.this.b, this.a.size());
                http2Stream2 = Http2Stream.this;
                http2Stream2.b -= jMin;
            }
            http2Stream2.k.enter();
            try {
                Http2Stream http2Stream3 = Http2Stream.this;
                http2Stream3.d.writeData(http2Stream3.c, z && jMin == this.a.size(), this.a, jMin);
            } finally {
                Http2Stream.this.k.exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Http2Stream.this) {
                if (this.b) {
                    return;
                }
                if (!Http2Stream.this.i.c) {
                    if (this.a.size() > 0) {
                        while (this.a.size() > 0) {
                            a(true);
                        }
                    } else {
                        Http2Stream http2Stream = Http2Stream.this;
                        http2Stream.d.writeData(http2Stream.c, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.b = true;
                }
                Http2Stream.this.d.flush();
                Http2Stream.this.d();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.e();
            }
            while (this.a.size() > 0) {
                a(false);
                Http2Stream.this.d.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.k;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            this.a.write(buffer, j);
            while (this.a.size() >= 16384) {
                a(false);
            }
        }
    }

    public final class b implements Source {
        public static final /* synthetic */ boolean g = false;
        private final Buffer a = new Buffer();
        private final Buffer b = new Buffer();
        private final long c;
        public boolean d;
        public boolean e;

        public b(long j) {
            this.c = j;
        }

        private void b(long j) {
            Http2Stream.this.d.z(j);
        }

        public void a(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long size;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.e;
                    z2 = true;
                    z3 = this.b.size() + j > this.c;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    bufferedSource.skip(j);
                    return;
                }
                long j2 = bufferedSource.read(this.a, j);
                if (j2 == -1) {
                    throw new EOFException();
                }
                j -= j2;
                synchronized (Http2Stream.this) {
                    if (this.d) {
                        size = this.a.size();
                        this.a.clear();
                    } else {
                        if (this.b.size() != 0) {
                            z2 = false;
                        }
                        this.b.writeAll(this.a);
                        if (z2) {
                            Http2Stream.this.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    b(size);
                }
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            Header.a aVar;
            ArrayList arrayList;
            synchronized (Http2Stream.this) {
                this.d = true;
                size = this.b.size();
                this.b.clear();
                aVar = null;
                if (Http2Stream.this.e.isEmpty() || Http2Stream.this.f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(Http2Stream.this.e);
                    Http2Stream.this.e.clear();
                    aVar = Http2Stream.this.f;
                    arrayList = arrayList2;
                }
                Http2Stream.this.notifyAll();
            }
            if (size > 0) {
                b(size);
            }
            Http2Stream.this.d();
            if (aVar != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    aVar.a((Headers) it2.next());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            long j2;
            Headers headers;
            Header.a aVar;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            while (true) {
                synchronized (Http2Stream.this) {
                    Http2Stream.this.j.enter();
                    try {
                        Http2Stream http2Stream = Http2Stream.this;
                        ErrorCode errorCode = http2Stream.l;
                        if (errorCode == null) {
                            errorCode = null;
                        }
                        if (this.d) {
                            throw new IOException("stream closed");
                        }
                        if (!http2Stream.e.isEmpty() && Http2Stream.this.f != null) {
                            headers = (Headers) Http2Stream.this.e.removeFirst();
                            aVar = Http2Stream.this.f;
                        } else if (this.b.size() > 0) {
                            Buffer buffer2 = this.b;
                            j2 = buffer2.read(buffer, Math.min(j, buffer2.size()));
                            Http2Stream http2Stream2 = Http2Stream.this;
                            long j3 = http2Stream2.a + j2;
                            http2Stream2.a = j3;
                            if (errorCode == null && j3 >= http2Stream2.d.t.e() / 2) {
                                Http2Stream http2Stream3 = Http2Stream.this;
                                http2Stream3.d.G(http2Stream3.c, http2Stream3.a);
                                Http2Stream.this.a = 0L;
                            }
                            headers = null;
                            aVar = null;
                            Http2Stream.this.j.exitAndThrowIfTimedOut();
                            if (headers != null || aVar == null) {
                                if (j2 != -1) {
                                    b(j2);
                                    return j2;
                                }
                                if (errorCode == null) {
                                    return -1L;
                                }
                                throw new StreamResetException(errorCode);
                            }
                            aVar.a(headers);
                        } else if (this.e || errorCode != null) {
                            headers = null;
                            aVar = null;
                        } else {
                            Http2Stream.this.k();
                            Http2Stream.this.j.exitAndThrowIfTimedOut();
                        }
                        j2 = -1;
                        Http2Stream.this.j.exitAndThrowIfTimedOut();
                        if (headers != null) {
                        }
                        if (j2 != -1) {
                            b(j2);
                            return j2;
                        }
                        if (errorCode == null) {
                            return -1L;
                        }
                        throw new StreamResetException(errorCode);
                    } catch (Throwable th) {
                        Http2Stream.this.j.exitAndThrowIfTimedOut();
                        throw th;
                    }
                    throw th;
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.j;
        }
    }

    public class c extends AsyncTimeout {
        public c() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.d.x();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.j = new c();
        this.k = new c();
        this.l = null;
        Objects.requireNonNull(http2Connection, "connection == null");
        this.c = i;
        this.d = http2Connection;
        this.b = http2Connection.u.e();
        b bVar = new b(http2Connection.t.e());
        this.h = bVar;
        a aVar = new a();
        this.i = aVar;
        bVar.e = z2;
        aVar.c = z;
        if (headers != null) {
            arrayDeque.add(headers);
        }
        if (isLocallyInitiated() && headers != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!isLocallyInitiated() && headers == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean f(ErrorCode errorCode) {
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            if (this.h.e && this.i.c) {
                return false;
            }
            this.l = errorCode;
            notifyAll();
            this.d.w(this.c);
            return true;
        }
    }

    public void c(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void close(ErrorCode errorCode) throws IOException {
        if (f(errorCode)) {
            this.d.E(this.c, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (f(errorCode)) {
            this.d.F(this.c, errorCode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public void d() throws IOException {
        boolean z;
        boolean zIsOpen;
        synchronized (this) {
            b bVar = this.h;
            if (bVar.e || !bVar.d) {
                z = false;
            } else {
                a aVar = this.i;
                if (aVar.c || aVar.b) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zIsOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else {
            if (zIsOpen) {
                return;
            }
            this.d.w(this.c);
        }
    }

    public void e() throws IOException {
        a aVar = this.i;
        if (aVar.b) {
            throw new IOException("stream closed");
        }
        if (aVar.c) {
            throw new IOException("stream finished");
        }
        if (this.l != null) {
            throw new StreamResetException(this.l);
        }
    }

    public void g(BufferedSource bufferedSource, int i) throws IOException {
        this.h.a(bufferedSource, i);
    }

    public Http2Connection getConnection() {
        return this.d;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.l;
    }

    public int getId() {
        return this.c;
    }

    public Sink getSink() {
        synchronized (this) {
            if (!this.g && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.i;
    }

    public Source getSource() {
        return this.h;
    }

    public void h() {
        boolean zIsOpen;
        synchronized (this) {
            this.h.e = true;
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.d.w(this.c);
    }

    public void i(List<Header> list) {
        boolean zIsOpen;
        synchronized (this) {
            this.g = true;
            this.e.add(Util.toHeaders(list));
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.d.w(this.c);
    }

    public boolean isLocallyInitiated() {
        return this.d.a == ((this.c & 1) == 1);
    }

    public synchronized boolean isOpen() {
        if (this.l != null) {
            return false;
        }
        b bVar = this.h;
        if (bVar.e || bVar.d) {
            a aVar = this.i;
            if ((aVar.c || aVar.b) && this.g) {
                return false;
            }
        }
        return true;
    }

    public synchronized void j(ErrorCode errorCode) {
        if (this.l == null) {
            this.l = errorCode;
            notifyAll();
        }
    }

    public void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public Timeout readTimeout() {
        return this.j;
    }

    public synchronized void setHeadersListener(Header.a aVar) {
        this.f = aVar;
        if (!this.e.isEmpty() && aVar != null) {
            notifyAll();
        }
    }

    public synchronized Headers takeHeaders() throws IOException {
        this.j.enter();
        while (this.e.isEmpty() && this.l == null) {
            try {
                k();
            } catch (Throwable th) {
                this.j.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.j.exitAndThrowIfTimedOut();
        if (this.e.isEmpty()) {
            throw new StreamResetException(this.l);
        }
        return this.e.removeFirst();
    }

    public void writeHeaders(List<Header> list, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        Objects.requireNonNull(list, "headers == null");
        synchronized (this) {
            z2 = true;
            this.g = true;
            if (z) {
                z3 = false;
                z4 = false;
            } else {
                this.i.c = true;
                z3 = true;
                z4 = true;
            }
        }
        if (!z3) {
            synchronized (this.d) {
                if (this.d.s != 0) {
                    z2 = false;
                }
            }
            z3 = z2;
        }
        this.d.D(this.c, z4, list);
        if (z3) {
            this.d.flush();
        }
    }

    public Timeout writeTimeout() {
        return this.k;
    }
}
