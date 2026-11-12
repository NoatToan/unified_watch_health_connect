package com.ximalaya.ting.android.opensdk.httputil.util.freeflow;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.player.model.HttpConfig;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public class FreeFlowServiceUtil {
    private static Interceptor interceptor;

    public interface ISetHttpUrlConnectAttribute {
        void setHttpUrlConnectAttributes(@NonNull HttpURLConnection httpURLConnection);
    }

    public static HttpURLConnection getHttpURLConnection(@Nullable Config config, String str, String str2, ISetHttpUrlConnectAttribute iSetHttpUrlConnectAttribute) throws IOException {
        throw null;
    }

    @Nullable
    public static Proxy getProxy(@Nullable Config config, boolean z) {
        int i;
        if (config == null || !config.useProxy) {
            return null;
        }
        int i2 = config.proxyPort;
        if (z && (i = config.httpsProxyPort) > 0) {
            i2 = i;
        }
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(config.proxyHost, i2));
    }

    private static boolean shouldUpdateConnectPool(@NonNull OkHttpClient.Builder builder, long j) {
        return true;
    }

    @Nullable
    public static HttpConfig toHttpConfig(@Nullable Config config) {
        if (config == null) {
            return null;
        }
        HttpConfig httpConfig = new HttpConfig();
        httpConfig.useProxy = config.useProxy;
        httpConfig.useCache = config.useCache;
        httpConfig.proxyHost = config.proxyHost;
        httpConfig.proxyPort = config.proxyPort;
        httpConfig.httpsProxyPort = config.httpsProxyPort;
        httpConfig.authorization = config.authorization;
        httpConfig.connectionTimeOut = config.connectionTimeOut;
        httpConfig.readTimeOut = config.readTimeOut;
        httpConfig.writeTimeOut = config.writeTimeOut;
        httpConfig.method = config.method;
        httpConfig.property = config.property;
        return httpConfig;
    }

    public static OkHttpClient.Builder updateProxyToBuilder(@NonNull Context context, @Nullable final Config config, @NonNull OkHttpClient.Builder builder, boolean z) {
        int i;
        builder.retryOnConnectionFailure(true);
        if (config != null) {
            long j = config.connectionTimeOut;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.connectTimeout(j, timeUnit);
            builder.readTimeout(config.connectionTimeOut, timeUnit);
            builder.writeTimeout(config.writeTimeOut, timeUnit);
        }
        if (config == null || !config.useProxy || TextUtils.isEmpty(config.proxyHost) || config.proxyPort <= 0) {
            builder.proxy(null);
            if (interceptor != null) {
                builder.interceptors().remove(interceptor);
            }
            if (shouldUpdateConnectPool(builder, TimeUnit.MINUTES.toNanos(5L))) {
                builder.connectionPool(new ConnectionPool());
            }
            Authenticator authenticator = Authenticator.NONE;
            builder.authenticator(authenticator);
            builder.proxyAuthenticator(authenticator);
        } else {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (shouldUpdateConnectPool(builder, timeUnit2.toNanos(10L))) {
                builder.connectionPool(new ConnectionPool(10, 10L, timeUnit2));
            }
            final int i2 = config.proxyPort;
            if (z && (i = config.httpsProxyPort) > 0) {
                i2 = i;
            }
            final Proxy[] proxyArr = new Proxy[1];
            Thread thread = new Thread(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        proxyArr[0] = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(config.proxyHost, i2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, "Config.java Create Proxy");
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            builder.proxy(proxyArr[0]);
            if (interceptor == null) {
                interceptor = new Interceptor() { // from class: com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil.2
                    @Override // okhttp3.Interceptor
                    public Response intercept(Interceptor.Chain chain) throws IOException {
                        Request.Builder builderNewBuilder = chain.request().newBuilder();
                        Map<String, String> map = config.property;
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                builderNewBuilder.header(entry.getKey(), entry.getValue());
                            }
                        }
                        return chain.proceed(builderNewBuilder.build());
                    }
                };
            }
            if (!builder.interceptors().contains(interceptor)) {
                builder.addInterceptor(interceptor);
            }
        }
        return builder;
    }
}
