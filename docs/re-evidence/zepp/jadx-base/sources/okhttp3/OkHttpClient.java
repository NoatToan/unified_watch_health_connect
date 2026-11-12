package okhttp3;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes23.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final List<Protocol> C = Util.immutableList(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<ConnectionSpec> D = Util.immutableList(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    public final int A;
    public final int B;
    public final Dispatcher a;

    @Nullable
    public final Proxy b;
    public final List<Protocol> c;
    public final List<ConnectionSpec> d;
    public final List<Interceptor> e;
    public final List<Interceptor> f;
    public final EventListener.Factory g;
    public final ProxySelector h;
    public final CookieJar i;

    @Nullable
    public final Cache j;

    @Nullable
    public final InternalCache k;
    public final SocketFactory l;
    public final SSLSocketFactory m;
    public final CertificateChainCleaner n;
    public final HostnameVerifier o;
    public final CertificatePinner p;
    public final Authenticator q;
    public final Authenticator r;
    public final ConnectionPool s;
    public final Dns t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;

    public static final class Builder {
        public int A;
        public int B;
        public Dispatcher a;

        @Nullable
        public Proxy b;
        public List<Protocol> c;
        public List<ConnectionSpec> d;
        public final List<Interceptor> e;
        public final List<Interceptor> f;
        public EventListener.Factory g;
        public ProxySelector h;
        public CookieJar i;

        @Nullable
        public Cache j;

        @Nullable
        public InternalCache k;
        public SocketFactory l;

        @Nullable
        public SSLSocketFactory m;

        @Nullable
        public CertificateChainCleaner n;
        public HostnameVerifier o;
        public CertificatePinner p;
        public Authenticator q;
        public Authenticator r;
        public ConnectionPool s;
        public Dns t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        public Builder() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new Dispatcher();
            this.c = OkHttpClient.C;
            this.d = OkHttpClient.D;
            this.g = EventListener.a(EventListener.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new NullProxySelector();
            }
            this.i = CookieJar.NO_COOKIES;
            this.l = SocketFactory.getDefault();
            this.o = OkHostnameVerifier.INSTANCE;
            this.p = CertificatePinner.DEFAULT;
            Authenticator authenticator = Authenticator.NONE;
            this.q = authenticator;
            this.r = authenticator;
            this.s = new ConnectionPool();
            this.t = Dns.SYSTEM;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public void a(@Nullable InternalCache internalCache) {
            this.k = internalCache;
            this.j = null;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.e.add(interceptor);
            return this;
        }

        public Builder addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f.add(interceptor);
            return this;
        }

        public Builder authenticator(Authenticator authenticator) {
            Objects.requireNonNull(authenticator, "authenticator == null");
            this.r = authenticator;
            return this;
        }

        public OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public Builder cache(@Nullable Cache cache) {
            this.j = cache;
            this.k = null;
            return this;
        }

        public Builder callTimeout(long j, TimeUnit timeUnit) {
            this.x = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public Builder certificatePinner(CertificatePinner certificatePinner) {
            Objects.requireNonNull(certificatePinner, "certificatePinner == null");
            this.p = certificatePinner;
            return this;
        }

        public Builder connectTimeout(long j, TimeUnit timeUnit) {
            this.y = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public Builder connectionPool(ConnectionPool connectionPool) {
            Objects.requireNonNull(connectionPool, "connectionPool == null");
            this.s = connectionPool;
            return this;
        }

        public Builder connectionSpecs(List<ConnectionSpec> list) {
            this.d = Util.immutableList(list);
            return this;
        }

        public Builder cookieJar(CookieJar cookieJar) {
            Objects.requireNonNull(cookieJar, "cookieJar == null");
            this.i = cookieJar;
            return this;
        }

        public Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.a = dispatcher;
            return this;
        }

        public Builder dns(Dns dns) {
            Objects.requireNonNull(dns, "dns == null");
            this.t = dns;
            return this;
        }

        public Builder eventListener(EventListener eventListener) {
            Objects.requireNonNull(eventListener, "eventListener == null");
            this.g = EventListener.a(eventListener);
            return this;
        }

        public Builder eventListenerFactory(EventListener.Factory factory) {
            Objects.requireNonNull(factory, "eventListenerFactory == null");
            this.g = factory;
            return this;
        }

        public Builder followRedirects(boolean z) {
            this.v = z;
            return this;
        }

        public Builder followSslRedirects(boolean z) {
            this.u = z;
            return this;
        }

        public Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            Objects.requireNonNull(hostnameVerifier, "hostnameVerifier == null");
            this.o = hostnameVerifier;
            return this;
        }

        public List<Interceptor> interceptors() {
            return this.e;
        }

        public List<Interceptor> networkInterceptors() {
            return this.f;
        }

        public Builder pingInterval(long j, TimeUnit timeUnit) {
            this.B = Util.checkDuration("interval", j, timeUnit);
            return this;
        }

        public Builder protocols(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(Protocol.SPDY_3);
            this.c = Collections.unmodifiableList(arrayList);
            return this;
        }

        public Builder proxy(@Nullable Proxy proxy) {
            this.b = proxy;
            return this;
        }

        public Builder proxyAuthenticator(Authenticator authenticator) {
            Objects.requireNonNull(authenticator, "proxyAuthenticator == null");
            this.q = authenticator;
            return this;
        }

        public Builder proxySelector(ProxySelector proxySelector) {
            Objects.requireNonNull(proxySelector, "proxySelector == null");
            this.h = proxySelector;
            return this;
        }

        public Builder readTimeout(long j, TimeUnit timeUnit) {
            this.z = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public Builder retryOnConnectionFailure(boolean z) {
            this.w = z;
            return this;
        }

        public Builder socketFactory(SocketFactory socketFactory) {
            Objects.requireNonNull(socketFactory, "socketFactory == null");
            this.l = socketFactory;
            return this;
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            this.m = sSLSocketFactory;
            this.n = Platform.get().buildCertificateChainCleaner(sSLSocketFactory);
            return this;
        }

        public Builder writeTimeout(long j, TimeUnit timeUnit) {
            this.A = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public Builder callTimeout(Duration duration) {
            this.x = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public Builder connectTimeout(Duration duration) {
            this.y = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public Builder pingInterval(Duration duration) {
            this.B = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public Builder readTimeout(Duration duration) {
            this.z = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public Builder writeTimeout(Duration duration) {
            this.A = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            Objects.requireNonNull(x509TrustManager, "trustManager == null");
            this.m = sSLSocketFactory;
            this.n = CertificateChainCleaner.get(x509TrustManager);
            return this;
        }

        public Builder(OkHttpClient okHttpClient) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            this.a = okHttpClient.a;
            this.b = okHttpClient.b;
            this.c = okHttpClient.c;
            this.d = okHttpClient.d;
            arrayList.addAll(okHttpClient.e);
            arrayList2.addAll(okHttpClient.f);
            this.g = okHttpClient.g;
            this.h = okHttpClient.h;
            this.i = okHttpClient.i;
            this.k = okHttpClient.k;
            this.j = okHttpClient.j;
            this.l = okHttpClient.l;
            this.m = okHttpClient.m;
            this.n = okHttpClient.n;
            this.o = okHttpClient.o;
            this.p = okHttpClient.p;
            this.q = okHttpClient.q;
            this.r = okHttpClient.r;
            this.s = okHttpClient.s;
            this.t = okHttpClient.t;
            this.u = okHttpClient.u;
            this.v = okHttpClient.v;
            this.w = okHttpClient.w;
            this.x = okHttpClient.x;
            this.y = okHttpClient.y;
            this.z = okHttpClient.z;
            this.A = okHttpClient.A;
            this.B = okHttpClient.B;
        }
    }

    public class a extends Internal {
        @Override // okhttp3.internal.Internal
        public void addLenient(Headers.Builder builder, String str) {
            builder.a(str);
        }

        @Override // okhttp3.internal.Internal
        public void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
            connectionSpec.a(sSLSocket, z);
        }

        @Override // okhttp3.internal.Internal
        public int code(Response.Builder builder) {
            return builder.c;
        }

        @Override // okhttp3.internal.Internal
        public boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
            return connectionPool.b(realConnection);
        }

        @Override // okhttp3.internal.Internal
        public Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
            return connectionPool.c(address, streamAllocation);
        }

        @Override // okhttp3.internal.Internal
        public boolean equalsNonHost(Address address, Address address2) {
            return address.a(address2);
        }

        @Override // okhttp3.internal.Internal
        public RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
            return connectionPool.d(address, streamAllocation, route);
        }

        @Override // okhttp3.internal.Internal
        public boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException) {
            return illegalArgumentException.getMessage().startsWith(HttpUrl.Builder.i);
        }

        @Override // okhttp3.internal.Internal
        public Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
            return okhttp3.a.e(okHttpClient, request, true);
        }

        @Override // okhttp3.internal.Internal
        public void put(ConnectionPool connectionPool, RealConnection realConnection) {
            connectionPool.f(realConnection);
        }

        @Override // okhttp3.internal.Internal
        public RouteDatabase routeDatabase(ConnectionPool connectionPool) {
            return connectionPool.e;
        }

        @Override // okhttp3.internal.Internal
        public void setCache(Builder builder, InternalCache internalCache) {
            builder.a(internalCache);
        }

        @Override // okhttp3.internal.Internal
        public StreamAllocation streamAllocation(Call call) {
            return ((okhttp3.a) call).g();
        }

        @Override // okhttp3.internal.Internal
        @Nullable
        public IOException timeoutExit(Call call, @Nullable IOException iOException) {
            return ((okhttp3.a) call).h(iOException);
        }

        @Override // okhttp3.internal.Internal
        public void addLenient(Headers.Builder builder, String str, String str2) {
            builder.b(str, str2);
        }
    }

    static {
        Internal.instance = new a();
    }

    public OkHttpClient() {
        this(new Builder());
    }

    private static SSLSocketFactory b(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = Platform.get().getSSLContext();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw Util.assertionError("No System TLS", e);
        }
    }

    public InternalCache a() {
        Cache cache = this.j;
        return cache != null ? cache.a : this.k;
    }

    public Authenticator authenticator() {
        return this.r;
    }

    @Nullable
    public Cache cache() {
        return this.j;
    }

    public int callTimeoutMillis() {
        return this.x;
    }

    public CertificatePinner certificatePinner() {
        return this.p;
    }

    public int connectTimeoutMillis() {
        return this.y;
    }

    public ConnectionPool connectionPool() {
        return this.s;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.d;
    }

    public CookieJar cookieJar() {
        return this.i;
    }

    public Dispatcher dispatcher() {
        return this.a;
    }

    public Dns dns() {
        return this.t;
    }

    public EventListener.Factory eventListenerFactory() {
        return this.g;
    }

    public boolean followRedirects() {
        return this.v;
    }

    public boolean followSslRedirects() {
        return this.u;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.o;
    }

    public List<Interceptor> interceptors() {
        return this.e;
    }

    public List<Interceptor> networkInterceptors() {
        return this.f;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        return okhttp3.a.e(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), this.B);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public int pingIntervalMillis() {
        return this.B;
    }

    public List<Protocol> protocols() {
        return this.c;
    }

    @Nullable
    public Proxy proxy() {
        return this.b;
    }

    public Authenticator proxyAuthenticator() {
        return this.q;
    }

    public ProxySelector proxySelector() {
        return this.h;
    }

    public int readTimeoutMillis() {
        return this.z;
    }

    public boolean retryOnConnectionFailure() {
        return this.w;
    }

    public SocketFactory socketFactory() {
        return this.l;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.m;
    }

    public int writeTimeoutMillis() {
        return this.A;
    }

    public OkHttpClient(Builder builder) {
        boolean z;
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        List<ConnectionSpec> list = builder.d;
        this.d = list;
        this.e = Util.immutableList(builder.e);
        this.f = Util.immutableList(builder.f);
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
        Iterator<ConnectionSpec> it2 = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                } else {
                    z = z || it2.next().isTls();
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = builder.m;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerPlatformTrustManager = Util.platformTrustManager();
            this.m = b(x509TrustManagerPlatformTrustManager);
            this.n = CertificateChainCleaner.get(x509TrustManagerPlatformTrustManager);
        } else {
            this.m = sSLSocketFactory;
            this.n = builder.n;
        }
        if (this.m != null) {
            Platform.get().configureSslSocketFactory(this.m);
        }
        this.o = builder.o;
        this.p = builder.p.d(this.n);
        this.q = builder.q;
        this.r = builder.r;
        this.s = builder.s;
        this.t = builder.t;
        this.u = builder.u;
        this.v = builder.v;
        this.w = builder.w;
        this.x = builder.x;
        this.y = builder.y;
        this.z = builder.z;
        this.A = builder.A;
        this.B = builder.B;
        if (this.e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.e);
        }
        if (this.f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f);
        }
    }
}
