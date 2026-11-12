package okhttp3.internal.connection;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
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
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    private static final String j = "throw with null exception";
    private static final int k = 21;
    private final ConnectionPool a;
    private final Route b;
    private Socket c;
    private Socket d;
    private Handshake e;
    private Protocol f;
    private Http2Connection g;
    private BufferedSource h;
    private BufferedSink i;
    public boolean noNewStreams;
    public int successCount;
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    public long idleAtNanos = Long.MAX_VALUE;

    public class a extends RealWebSocket.Streams {
        public final /* synthetic */ StreamAllocation a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, StreamAllocation streamAllocation) {
            super(z, bufferedSource, bufferedSink);
            this.a = streamAllocation;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            StreamAllocation streamAllocation = this.a;
            streamAllocation.streamFinished(true, streamAllocation.codec(), -1L, null);
        }
    }

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.a = connectionPool;
        this.b = route;
    }

    private void a(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Proxy proxy = this.b.proxy();
        this.c = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? this.b.address().socketFactory().createSocket() : new Socket(proxy);
        eventListener.connectStart(call, this.b.socketAddress(), proxy);
        this.c.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.c, this.b.socketAddress(), i);
            try {
                this.h = Okio.buffer(Okio.source(this.c));
                this.i = Okio.buffer(Okio.sink(this.c));
            } catch (NullPointerException e) {
                if (j.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void b(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Address address = this.b.address();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) address.sslSocketFactory().createSocket(this.c, address.url().host(), address.url().port(), true);
                try {
                    ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                    if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                        Platform.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    Handshake handshake = Handshake.get(session);
                    if (address.hostnameVerifier().verify(address.url().host(), session)) {
                        address.certificatePinner().check(address.url().host(), handshake.peerCertificates());
                        String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.get().getSelectedProtocol(sSLSocket2) : null;
                        this.d = sSLSocket2;
                        this.h = Okio.buffer(Okio.source(sSLSocket2));
                        this.i = Okio.buffer(Okio.sink(this.d));
                        this.e = handshake;
                        this.f = selectedProtocol != null ? Protocol.get(selectedProtocol) : Protocol.HTTP_1_1;
                        Platform.get().afterHandshake(sSLSocket2);
                        return;
                    }
                    List<Certificate> listPeerCertificates = handshake.peerCertificates();
                    if (listPeerCertificates.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listPeerCertificates.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified:\n    certificate: " + CertificatePinner.pin(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.allSubjectAltNames(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!Util.isAndroidGetsocknameError(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.get().afterHandshake(sSLSocket);
                    }
                    Util.closeQuietly((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void c(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request requestE = e();
        HttpUrl httpUrlUrl = requestE.url();
        for (int i4 = 0; i4 < 21; i4++) {
            a(i, i2, call, eventListener);
            requestE = d(i2, i3, requestE, httpUrlUrl);
            if (requestE == null) {
                return;
            }
            Util.closeQuietly(this.c);
            this.c = null;
            this.i = null;
            this.h = null;
            eventListener.connectEnd(call, this.b.socketAddress(), this.b.proxy(), null);
        }
    }

    private Request d(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.hostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            Http1Codec http1Codec = new Http1Codec(null, null, this.h, this.i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.h.timeout().timeout(i, timeUnit);
            this.i.timeout().timeout(i2, timeUnit);
            http1Codec.writeRequest(request.headers(), str);
            http1Codec.finishRequest();
            Response responseBuild = http1Codec.readResponseHeaders(false).request(request).build();
            long jContentLength = HttpHeaders.contentLength(responseBuild);
            if (jContentLength == -1) {
                jContentLength = 0;
            }
            Source sourceNewFixedLengthSource = http1Codec.newFixedLengthSource(jContentLength);
            Util.skipAll(sourceNewFixedLengthSource, Integer.MAX_VALUE, timeUnit);
            sourceNewFixedLengthSource.close();
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (this.h.buffer().exhausted() && this.i.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + responseBuild.code());
            }
            Request requestAuthenticate = this.b.address().proxyAuthenticator().authenticate(this.b, responseBuild);
            if (requestAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(responseBuild.header("Connection"))) {
                return requestAuthenticate;
            }
            request = requestAuthenticate;
        }
    }

    private Request e() throws IOException {
        Request requestBuild = new Request.Builder().url(this.b.address().url()).method(FirebasePerformance.HttpMethod.CONNECT, null).header("Host", Util.hostHeader(this.b.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
        Request requestAuthenticate = this.b.address().proxyAuthenticator().authenticate(this.b, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return requestAuthenticate != null ? requestAuthenticate : requestBuild;
    }

    private void f(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws Throwable {
        if (this.b.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            b(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.e);
            if (this.f == Protocol.HTTP_2) {
                g(i);
                return;
            }
            return;
        }
        List<Protocol> listProtocols = this.b.address().protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listProtocols.contains(protocol)) {
            this.d = this.c;
            this.f = Protocol.HTTP_1_1;
        } else {
            this.d = this.c;
            this.f = protocol;
            g(i);
        }
    }

    private void g(int i) throws IOException {
        this.d.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true).socket(this.d, this.b.address().url().host(), this.h, this.i).listener(this).pingIntervalMillis(i).build();
        this.g = http2ConnectionBuild;
        http2ConnectionBuild.start();
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long j2) {
        RealConnection realConnection = new RealConnection(connectionPool, route);
        realConnection.d = socket;
        realConnection.idleAtNanos = j2;
        return realConnection;
    }

    public void cancel() {
        Util.closeQuietly(this.c);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:66:0x0088->B:78:?, LOOP_END, SYNTHETIC] */
    public void connect(int i, int i2, int i3, int i4, boolean z, Call call, EventListener eventListener) throws Throwable {
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List<ConnectionSpec> listConnectionSpecs = this.b.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
        if (this.b.address().sslSocketFactory() == null) {
            if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = this.b.address().url().host();
            if (!Platform.get().isCleartextTrafficPermitted(strHost)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + strHost + " not permitted by network security policy"));
            }
        } else if (this.b.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.b.requiresTunnel()) {
                    c(i, i2, i3, call, eventListener);
                    if (this.c == null) {
                        break;
                    }
                } else {
                    try {
                        a(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        Util.closeQuietly(this.d);
                        Util.closeQuietly(this.c);
                        this.d = null;
                        this.c = null;
                        this.h = null;
                        this.i = null;
                        this.e = null;
                        this.f = null;
                        this.g = null;
                        eventListener.connectFailed(call, this.b.socketAddress(), this.b.proxy(), null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (z) {
                            throw routeException;
                        }
                        if (connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    }
                }
                try {
                    f(connectionSpecSelector, i4, call, eventListener);
                    eventListener.connectEnd(call, this.b.socketAddress(), this.b.proxy(), this.f);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    Util.closeQuietly(this.d);
                    Util.closeQuietly(this.c);
                    this.d = null;
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    eventListener.connectFailed(call, this.b.socketAddress(), this.b.proxy(), null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.addConnectException(e);
                    }
                    if (z) {
                        throw routeException;
                    }
                    if (connectionSpecSelector.connectionFailed(e)) {
                        throw routeException;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        if (this.b.requiresTunnel() && this.c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.g != null) {
            synchronized (this.a) {
                this.allocationLimit = this.g.maxConcurrentStreams();
            }
        }
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.e;
    }

    public boolean isEligible(Address address, @Nullable Route route) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.b.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.g == null || route == null || route.proxy().type() != Proxy.Type.DIRECT || this.b.proxy().type() != Proxy.Type.DIRECT || !this.b.socketAddress().equals(route.socketAddress()) || route.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean isHealthy(boolean z) {
        if (this.d.isClosed() || this.d.isInputShutdown() || this.d.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.g;
        if (http2Connection != null) {
            return http2Connection.isHealthy(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.d.getSoTimeout();
                try {
                    this.d.setSoTimeout(1);
                    if (this.h.exhausted()) {
                        this.d.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.d.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.d.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean isMultiplexed() {
        return this.g != null;
    }

    public HttpCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation) throws SocketException {
        if (this.g != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, this.g);
        }
        this.d.setSoTimeout(chain.readTimeoutMillis());
        Timeout timeout = this.h.timeout();
        long timeoutMillis = chain.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(timeoutMillis, timeUnit);
        this.i.timeout().timeout(chain.writeTimeoutMillis(), timeUnit);
        return new Http1Codec(okHttpClient, streamAllocation, this.h, this.i);
    }

    public RealWebSocket.Streams newWebSocketStreams(StreamAllocation streamAllocation) {
        return new a(true, this.h, this.i, streamAllocation);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection http2Connection) {
        synchronized (this.a) {
            this.allocationLimit = http2Connection.maxConcurrentStreams();
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        return this.f;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.b;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        return this.d;
    }

    public boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port() != this.b.address().url().port()) {
            return false;
        }
        if (httpUrl.host().equals(this.b.address().url().host())) {
            return true;
        }
        return this.e != null && OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.e.peerCertificates().get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.b.address().url().host());
        sb.append(":");
        sb.append(this.b.address().url().port());
        sb.append(", proxy=");
        sb.append(this.b.proxy());
        sb.append(" hostAddress=");
        sb.append(this.b.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.e;
        sb.append(handshake != null ? handshake.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
