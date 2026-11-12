package com.xiaomi.hm.health.device.esim;

import android.annotation.SuppressLint;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.bluetooth.profile.channel.module.DeviceHttpRequest;
import com.huami.bluetooth.profile.channel.module.DeviceHttpResponse;
import com.huami.bluetooth.profile.channel.module.IHttpRequest;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.discovery.bridge.util.NetUtil;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u000e\u0010B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/esim/ProxyHttpRequestImpl;", "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "", "", "headerMap", "Lokhttp3/Headers;", "c", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "f", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "deviceHttpRequest", "", "a", "Ljavax/net/ssl/SSLSocketFactory;", "b", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpResponse;", "Lokhttp3/OkHttpClient;", "Lkotlin/Lazy;", "e", "()Lokhttp3/OkHttpClient;", "httpClient", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ProxyHttpRequestImpl implements IHttpRequest {
    private static final long b = 10;
    private static final long c = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy httpClient = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"com/xiaomi/hm/health/device/esim/ProxyHttpRequestImpl$a", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        @NotNull
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/esim/ProxyHttpRequestImpl$b", "Ljavax/net/ssl/HostnameVerifier;", "", "hostname", "Ljavax/net/ssl/SSLSession;", com.google.firebase.crashlytics.internal.settings.b.c, "", "verify", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        @SuppressLint({"BadHostnameVerifier"})
        public boolean verify(@NotNull String hostname, @NotNull SSLSession session) {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<OkHttpClient> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            if (ProxyHttpRequestImpl.this.b() == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builder.connectTimeout(10L, timeUnit).hostnameVerifier(new b()).readTimeout(10L, timeUnit).build();
            }
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            return builder2.connectTimeout(10L, timeUnit2).sslSocketFactory(ProxyHttpRequestImpl.this.b()).hostnameVerifier(new b()).readTimeout(10L, timeUnit2).build();
        }
    }

    private final boolean a(DeviceHttpRequest deviceHttpRequest) {
        return (deviceHttpRequest.getUrl() == null || deviceHttpRequest.getMethod() == null || deviceHttpRequest.getHeader() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SSLSocketFactory b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new a[]{new a()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Headers c(Map<String, String> headerMap) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }

    private final OkHttpClient e() {
        return (OkHttpClient) this.httpClient.getValue();
    }

    private final Response f(Request request) {
        return FirebasePerfOkHttpClient.execute(e().newCall(request));
    }

    @Override // com.huami.bluetooth.profile.channel.module.IHttpRequest
    @NotNull
    public DeviceHttpResponse request(@NotNull DeviceHttpRequest deviceHttpRequest) {
        if (!a(deviceHttpRequest)) {
            return new DeviceHttpResponse(6, 0, null, 6, null);
        }
        if (!NetUtil.isNetworkConnected(DeviceXFunctionsKt.getContext())) {
            return new DeviceHttpResponse(3, 0, null, 6, null);
        }
        byte[] bArrBytes = null;
        try {
            Response responseF = f(new Request.Builder().method(deviceHttpRequest.getMethod(), deviceHttpRequest.getBody() != null ? RequestBody.create((MediaType) null, deviceHttpRequest.getBody()) : null).url(deviceHttpRequest.getUrl()).headers(c(deviceHttpRequest.getHeader())).build());
            int iCode = responseF.code();
            ResponseBody responseBodyBody = responseF.body();
            if (responseBodyBody != null) {
                bArrBytes = responseBodyBody.bytes();
            }
            return new DeviceHttpResponse(1, iCode, bArrBytes);
        } catch (SocketTimeoutException unused) {
            return new DeviceHttpResponse(4, 0, null, 6, null);
        } catch (IOException unused2) {
            return new DeviceHttpResponse(5, 0, null, 6, null);
        } catch (IllegalArgumentException unused3) {
            return new DeviceHttpResponse(6, 0, null, 6, null);
        } catch (Exception unused4) {
            return new DeviceHttpResponse(2, 0, null, 6, null);
        }
    }
}
