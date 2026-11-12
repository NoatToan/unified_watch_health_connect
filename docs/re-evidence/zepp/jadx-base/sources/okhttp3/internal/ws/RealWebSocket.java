package okhttp3.internal.ws;

import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes23.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final /* synthetic */ boolean A = false;
    private static final List<Protocol> x = Collections.singletonList(Protocol.HTTP_1_1);
    private static final long y = 16777216;
    private static final long z = 60000;
    private final Request a;
    public final WebSocketListener b;
    private final Random c;
    private final long d;
    private final String e;
    private Call f;
    private final Runnable g;
    private WebSocketReader h;
    private okhttp3.internal.ws.a i;
    private ScheduledExecutorService j;
    private Streams k;
    private long n;
    private boolean o;
    private ScheduledFuture<?> p;
    private String r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private final ArrayDeque<ByteString> l = new ArrayDeque<>();
    private final ArrayDeque<Object> m = new ArrayDeque<>();
    private int q = -1;

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final BufferedSink sink;
        public final BufferedSource source;

        public Streams(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.client = z;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e) {
                    RealWebSocket.this.failWebSocket(e, null);
                    return;
                }
            } while (RealWebSocket.this.l());
        }
    }

    public class b implements Callback {
        public final /* synthetic */ Request a;

        public b(Request request) {
            this.a = request;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            RealWebSocket.this.failWebSocket(iOException, null);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                RealWebSocket.this.b(response);
                StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                streamAllocation.noNewStreams();
                Streams streamsNewWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                try {
                    RealWebSocket realWebSocket = RealWebSocket.this;
                    realWebSocket.b.onOpen(realWebSocket, response);
                    RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + this.a.url().redact(), streamsNewWebSocketStreams);
                    streamAllocation.connection().socket().setSoTimeout(0);
                    RealWebSocket.this.loopReader();
                } catch (Exception e) {
                    RealWebSocket.this.failWebSocket(e, null);
                }
            } catch (ProtocolException e2) {
                RealWebSocket.this.failWebSocket(e2, response);
                Util.closeQuietly(response);
            }
        }
    }

    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    public static final class d {
        public final int a;
        public final ByteString b;
        public final long c;

        public d(int i, ByteString byteString, long j) {
            this.a = i;
            this.b = byteString;
            this.c = j;
        }
    }

    public static final class e {
        public final int a;
        public final ByteString b;

        public e(int i, ByteString byteString) {
            this.a = i;
            this.b = byteString;
        }
    }

    public final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.m();
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if (!"GET".equals(request.method())) {
            throw new IllegalArgumentException("Request must be GET: " + request.method());
        }
        this.a = request;
        this.b = webSocketListener;
        this.c = random;
        this.d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.e = ByteString.of(bArr).base64();
        this.g = new a();
    }

    private void h() {
        ScheduledExecutorService scheduledExecutorService = this.j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.g);
        }
    }

    private synchronized boolean i(ByteString byteString, int i) {
        if (!this.s && !this.o) {
            if (this.n + ((long) byteString.size()) > y) {
                close(1001, null);
                return false;
            }
            this.n += (long) byteString.size();
            this.m.add(new e(i, byteString));
            h();
            return true;
        }
        return false;
    }

    public void a(int i, TimeUnit timeUnit) throws InterruptedException {
        this.j.awaitTermination(i, timeUnit);
    }

    public void b(Response response) throws ProtocolException {
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
        }
        String strHeader = response.header("Connection");
        if (!HttpHeaders.UPGRADE.equalsIgnoreCase(strHeader)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader + "'");
        }
        String strHeader2 = response.header(HttpHeaders.UPGRADE);
        if (!"websocket".equalsIgnoreCase(strHeader2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader2 + "'");
        }
        String strHeader3 = response.header("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.e + WebSocketProtocol.a).sha1().base64();
        if (strBase64.equals(strHeader3)) {
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader3 + "'");
    }

    public synchronized boolean c(int i, String str, long j) {
        WebSocketProtocol.c(i);
        ByteString byteStringEncodeUtf8 = null;
        if (str != null) {
            byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
            if (byteStringEncodeUtf8.size() > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.s && !this.o) {
            this.o = true;
            this.m.add(new d(i, byteStringEncodeUtf8, j));
            h();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.f.cancel();
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return c(i, str, 60000L);
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(x).build();
        Request requestBuild = this.a.newBuilder().header(HttpHeaders.UPGRADE, "websocket").header("Connection", HttpHeaders.UPGRADE).header("Sec-WebSocket-Key", this.e).header("Sec-WebSocket-Version", "13").build();
        Call callNewWebSocketCall = Internal.instance.newWebSocketCall(okHttpClientBuild, requestBuild);
        this.f = callNewWebSocketCall;
        callNewWebSocketCall.timeout().clearTimeout();
        this.f.enqueue(new b(requestBuild));
    }

    public synchronized boolean d(ByteString byteString) {
        if (!this.s && (!this.o || !this.m.isEmpty())) {
            this.l.add(byteString);
            h();
            return true;
        }
        return false;
    }

    public boolean e() throws IOException {
        try {
            this.h.a();
            return this.q == -1;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return false;
        }
    }

    public synchronized int f() {
        return this.u;
    }

    public void failWebSocket(Exception exc, @Nullable Response response) {
        synchronized (this) {
            if (this.s) {
                return;
            }
            this.s = true;
            Streams streams = this.k;
            this.k = null;
            ScheduledFuture<?> scheduledFuture = this.p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.j;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                this.b.onFailure(this, exc, response);
            } finally {
                Util.closeQuietly(streams);
            }
        }
    }

    public synchronized int g() {
        return this.v;
    }

    public void initReaderAndWriter(String str, Streams streams) throws IOException {
        synchronized (this) {
            this.k = streams;
            this.i = new okhttp3.internal.ws.a(streams.client, streams.sink, this.c);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            this.j = scheduledThreadPoolExecutor;
            if (this.d != 0) {
                f fVar = new f();
                long j = this.d;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(fVar, j, j, TimeUnit.MILLISECONDS);
            }
            if (!this.m.isEmpty()) {
                h();
            }
        }
        this.h = new WebSocketReader(streams.client, streams.source, this);
    }

    public synchronized int j() {
        return this.t;
    }

    public void k() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.j.shutdown();
        this.j.awaitTermination(10L, TimeUnit.SECONDS);
    }

    public boolean l() throws IOException {
        Streams streams;
        String str;
        synchronized (this) {
            if (this.s) {
                return false;
            }
            okhttp3.internal.ws.a aVar = this.i;
            ByteString byteStringPoll = this.l.poll();
            int i = -1;
            Object obj = null;
            if (byteStringPoll == null) {
                Object objPoll = this.m.poll();
                if (objPoll instanceof d) {
                    int i2 = this.q;
                    str = this.r;
                    if (i2 != -1) {
                        Streams streams2 = this.k;
                        this.k = null;
                        this.j.shutdown();
                        obj = objPoll;
                        i = i2;
                        streams = streams2;
                    } else {
                        this.p = this.j.schedule(new c(), ((d) objPoll).c, TimeUnit.MILLISECONDS);
                        i = i2;
                        streams = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    streams = null;
                    str = null;
                }
                obj = objPoll;
            } else {
                streams = null;
                str = null;
            }
            try {
                if (byteStringPoll != null) {
                    aVar.f(byteStringPoll);
                } else if (obj instanceof e) {
                    ByteString byteString = ((e) obj).b;
                    BufferedSink bufferedSinkBuffer = Okio.buffer(aVar.a(((e) obj).a, byteString.size()));
                    bufferedSinkBuffer.write(byteString);
                    bufferedSinkBuffer.close();
                    synchronized (this) {
                        this.n -= (long) byteString.size();
                    }
                } else {
                    if (!(obj instanceof d)) {
                        throw new AssertionError();
                    }
                    d dVar = (d) obj;
                    aVar.b(dVar.a, dVar.b);
                    if (streams != null) {
                        this.b.onClosed(this, i, str);
                    }
                }
                Util.closeQuietly(streams);
                return true;
            } catch (Throwable th) {
                Util.closeQuietly(streams);
                throw th;
            }
        }
    }

    public void loopReader() throws IOException {
        while (this.q == -1) {
            this.h.a();
        }
    }

    public void m() {
        synchronized (this) {
            if (this.s) {
                return;
            }
            okhttp3.internal.ws.a aVar = this.i;
            int i = this.w ? this.t : -1;
            this.t++;
            this.w = true;
            if (i == -1) {
                try {
                    aVar.e(ByteString.EMPTY);
                    return;
                } catch (IOException e2) {
                    failWebSocket(e2, null);
                    return;
                }
            }
            failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.d + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.q != -1) {
                throw new IllegalStateException("already closed");
            }
            this.q = i;
            this.r = str;
            streams = null;
            if (this.o && this.m.isEmpty()) {
                Streams streams2 = this.k;
                this.k = null;
                ScheduledFuture<?> scheduledFuture = this.p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.j.shutdown();
                streams = streams2;
            }
        }
        try {
            this.b.onClosing(this, i, str);
            if (streams != null) {
                this.b.onClosed(this, i, str);
            }
        } finally {
            Util.closeQuietly(streams);
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        this.b.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        if (!this.s && (!this.o || !this.m.isEmpty())) {
            this.l.add(byteString);
            h();
            this.u++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        this.v++;
        this.w = false;
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.n;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.a;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        Objects.requireNonNull(str, "text == null");
        return i(ByteString.encodeUtf8(str), 1);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) throws IOException {
        this.b.onMessage(this, byteString);
    }

    @Override // okhttp3.WebSocket
    public boolean send(ByteString byteString) {
        Objects.requireNonNull(byteString, "bytes == null");
        return i(byteString, 2);
    }
}
