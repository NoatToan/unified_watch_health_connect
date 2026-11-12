package com.mapbox.common.module.okhttp;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
class LazyClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_CONNECT_TIMEOUT_SEC = 30;
    private static final long DEFAULT_READ_TIMEOUT_SEC = 60;
    private static final ConnectionPool connectionPool = new ConnectionPool();
    private volatile OkHttpClient client;
    private final boolean disableHttp2;
    private byte maxRequestsPerHost = 0;
    private final SocketFactory socketFactory;

    public LazyClient(SocketFactory socketFactory, boolean z14) {
        this.socketFactory = socketFactory;
        this.disableHttp2 = z14;
    }

    private static OkHttpClient buildOkHttpClient(SocketFactory socketFactory, boolean z14) {
        OkHttpClient.Builder builderEventListenerFactory = new OkHttpClient.Builder().eventListenerFactory(NetworkUsageListener.FACTORY);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectionPool = builderEventListenerFactory.connectTimeout(DEFAULT_CONNECT_TIMEOUT_SEC, timeUnit).readTimeout(60L, timeUnit).connectionPool(connectionPool);
        if (socketFactory != null) {
            builderConnectionPool.socketFactory(socketFactory);
        }
        if (z14) {
            builderConnectionPool.protocols(Arrays.asList(Protocol.HTTP_1_1));
        }
        return builderConnectionPool.build();
    }

    public OkHttpClient get() {
        if (this.client == null) {
            synchronized (this) {
                try {
                    if (this.client == null) {
                        this.client = buildOkHttpClient(this.socketFactory, this.disableHttp2);
                        if (this.maxRequestsPerHost != 0) {
                            this.client.dispatcher().setMaxRequestsPerHost(this.maxRequestsPerHost);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.client;
    }

    public synchronized void setMaxRequestsPerHost(byte b14) {
        this.maxRequestsPerHost = b14;
        if (b14 != 0) {
            synchronized (this) {
                try {
                    OkHttpClient okHttpClient = this.client;
                    if (okHttpClient != null) {
                        okHttpClient.dispatcher().setMaxRequestsPerHost(b14);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
