package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
public final class Http1Codec implements HttpCodec {
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 5;
    private static final int m = 6;
    private static final int n = 262144;
    public final OkHttpClient a;
    public final StreamAllocation b;
    public final BufferedSource c;
    public final BufferedSink d;
    public int e = 0;
    private long f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    public abstract class b implements Source {
        public final ForwardingTimeout a;
        public boolean b;
        public long c;

        private b() {
            this.a = new ForwardingTimeout(Http1Codec.this.c.timeout());
            this.c = 0L;
        }

        public final void a(boolean z, IOException iOException) throws IOException {
            Http1Codec http1Codec = Http1Codec.this;
            int i = http1Codec.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + Http1Codec.this.e);
            }
            http1Codec.a(this.a);
            Http1Codec http1Codec2 = Http1Codec.this;
            http1Codec2.e = 6;
            StreamAllocation streamAllocation = http1Codec2.b;
            if (streamAllocation != null) {
                streamAllocation.streamFinished(!z, http1Codec2, this.c, iOException);
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            try {
                long j2 = Http1Codec.this.c.read(buffer, j);
                if (j2 > 0) {
                    this.c += j2;
                }
                return j2;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.a;
        }
    }

    public final class c implements Sink {
        private final ForwardingTimeout a;
        private boolean b;

        public c() {
            this.a = new ForwardingTimeout(Http1Codec.this.d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1Codec.this.d.writeUtf8("0\r\n\r\n");
            Http1Codec.this.a(this.a);
            Http1Codec.this.e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.b) {
                return;
            }
            Http1Codec.this.d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.a;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1Codec.this.d.writeHexadecimalUnsignedLong(j);
            Http1Codec.this.d.writeUtf8("\r\n");
            Http1Codec.this.d.write(buffer, j);
            Http1Codec.this.d.writeUtf8("\r\n");
        }
    }

    public class d extends b {
        private static final long i = -1;
        private final HttpUrl e;
        private long f;
        private boolean g;

        public d(HttpUrl httpUrl) {
            super();
            this.f = -1L;
            this.g = true;
            this.e = httpUrl;
        }

        private void b() throws IOException {
            if (this.f != -1) {
                Http1Codec.this.c.readUtf8LineStrict();
            }
            try {
                this.f = Http1Codec.this.c.readHexadecimalUnsignedLong();
                String strTrim = Http1Codec.this.c.readUtf8LineStrict().trim();
                if (this.f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + strTrim + "\"");
                }
                if (this.f == 0) {
                    this.g = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.a.cookieJar(), this.e, Http1Codec.this.readHeaders());
                    a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.g && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.b = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (!this.g) {
                return -1L;
            }
            long j2 = this.f;
            if (j2 == 0 || j2 == -1) {
                b();
                if (!this.g) {
                    return -1L;
                }
            }
            long j3 = super.read(buffer, Math.min(j, this.f));
            if (j3 != -1) {
                this.f -= j3;
                return j3;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }
    }

    public final class e implements Sink {
        private final ForwardingTimeout a;
        private boolean b;
        private long c;

        public e(long j) {
            this.a = new ForwardingTimeout(Http1Codec.this.d.timeout());
            this.c = j;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec.this.a(this.a);
            Http1Codec.this.e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.b) {
                return;
            }
            Http1Codec.this.d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.a;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(buffer.size(), 0L, j);
            if (j <= this.c) {
                Http1Codec.this.d.write(buffer, j);
                this.c -= j;
                return;
            }
            throw new ProtocolException("expected " + this.c + " bytes but received " + j);
        }
    }

    public class f extends b {
        private long e;

        public f(long j) throws IOException {
            super();
            this.e = j;
            if (j == 0) {
                a(true, null);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.e != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.b = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(buffer, Math.min(j2, j));
            if (j3 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j4 = this.e - j3;
            this.e = j4;
            if (j4 == 0) {
                a(true, null);
            }
            return j3;
        }
    }

    public class g extends b {
        private boolean e;

        public g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            if (!this.e) {
                a(false, null);
            }
            this.b = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.e) {
                return -1L;
            }
            long j2 = super.read(buffer, j);
            if (j2 != -1) {
                return j2;
            }
            this.e = true;
            a(true, null);
            return -1L;
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.a = okHttpClient;
        this.b = streamAllocation;
        this.c = bufferedSource;
        this.d = bufferedSink;
    }

    private String b() throws IOException {
        String utf8LineStrict = this.c.readUtf8LineStrict(this.f);
        this.f -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }

    public void a(ForwardingTimeout forwardingTimeout) {
        Timeout timeoutDelegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        timeoutDelegate.clearDeadline();
        timeoutDelegate.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection realConnectionConnection = this.b.connection();
        if (realConnectionConnection != null) {
            realConnectionConnection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Sink createRequestBody(Request request, long j2) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j2 != -1) {
            return newFixedLengthSink(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() throws IOException {
        this.d.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() throws IOException {
        this.d.flush();
    }

    public boolean isClosed() {
        return this.e == 6;
    }

    public Sink newChunkedSink() {
        if (this.e == 1) {
            this.e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public Source newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new d(httpUrl);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public Sink newFixedLengthSink(long j2) {
        if (this.e == 1) {
            this.e = 2;
            return new e(j2);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public Source newFixedLengthSource(long j2) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new f(j2);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public Source newUnknownLengthSource() throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        StreamAllocation streamAllocation = this.b;
        if (streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.e = 5;
        streamAllocation.noNewStreams();
        return new g();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        StreamAllocation streamAllocation = this.b;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        String strHeader = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(strHeader, 0L, Okio.buffer(newFixedLengthSource(0L)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(strHeader, -1L, Okio.buffer(newChunkedSource(response.request().url())));
        }
        long jContentLength = HttpHeaders.contentLength(response);
        return jContentLength != -1 ? new RealResponseBody(strHeader, jContentLength, Okio.buffer(newFixedLengthSource(jContentLength))) : new RealResponseBody(strHeader, -1L, Okio.buffer(newUnknownLengthSource()));
    }

    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, strB);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        int i2 = this.e;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        try {
            StatusLine statusLine = StatusLine.parse(b());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(readHeaders());
            if (z && statusLine.code == 100) {
                return null;
            }
            if (statusLine.code == 100) {
                this.e = 3;
                return builderHeaders;
            }
            this.e = 4;
            return builderHeaders;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.writeUtf8(str).writeUtf8("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.writeUtf8(headers.name(i2)).writeUtf8(": ").writeUtf8(headers.value(i2)).writeUtf8("\r\n");
        }
        this.d.writeUtf8("\r\n");
        this.e = 1;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.b.connection().route().proxy().type()));
    }
}
