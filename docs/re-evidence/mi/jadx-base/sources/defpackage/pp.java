package defpackage;

import android.annotation.SuppressLint;
import com.huami.bluetooth.profile.channel.module.DeviceHttpRequest;
import com.huami.bluetooth.profile.channel.module.DeviceHttpResponse;
import com.huami.bluetooth.profile.channel.module.IHttpRequest;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.sdk.proxy.RequestInterceptor;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0015B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\u0005\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000eH\u0002J\u0010\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0011H\u0002R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpp;", "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "Lcom/xiaomi/hm/health/bt/sdk/proxy/RequestInterceptor;", "requestInterceptor", "", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "deviceHttpRequest", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpResponse;", "request", "", "", "headerMap", "Lokhttp3/Headers;", "Lokhttp3/Request;", "Lokhttp3/Response;", "", "Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/OkHttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FDESC, "()Lokhttp3/OkHttpClient;", "httpClient", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class pp implements IHttpRequest {

    @NotNull
    public static final a v = new a(null);

    @NotNull
    public final List<RequestInterceptor> t = new ArrayList();

    @NotNull
    public final Lazy u = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lpp$a;", "", "", "NETWORK_CONNECT_TIMEOUT", "J", "NETWORK_READ_TIMEOUT", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lpp$b;", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class b implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        @NotNull
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/OkHttpClient;", PluginDeviceInfo.FMODEL, "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<OkHttpClient> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            SSLSocketFactory sSLSocketFactoryA = pp.this.a();
            if (sSLSocketFactoryA == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).build();
            }
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            return builder2.connectTimeout(10L, timeUnit2).sslSocketFactory(sSLSocketFactoryA, new b()).readTimeout(10L, timeUnit2).build();
        }
    }

    public final OkHttpClient b() {
        return (OkHttpClient) this.u.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.IHttpRequest
    @NotNull
    public DeviceHttpResponse request(@NotNull DeviceHttpRequest deviceHttpRequest) {
        byte[] body;
        Intrinsics.checkNotNullParameter(deviceHttpRequest, "deviceHttpRequest");
        if (!a(deviceHttpRequest)) {
            return new DeviceHttpResponse(6, 0, null, 6, null);
        }
        for (RequestInterceptor requestInterceptor : this.t) {
            if (requestInterceptor.interceptor(deviceHttpRequest)) {
                return requestInterceptor.request(deviceHttpRequest);
            }
        }
        RequestBody requestBodyCreate$default = (deviceHttpRequest.getBody() == null || (body = deviceHttpRequest.getBody()) == null) ? null : RequestBody.Companion.create$default(RequestBody.INSTANCE, body, (MediaType) null, 0, 0, 7, (Object) null);
        Request.Builder builder = new Request.Builder();
        String method = deviceHttpRequest.getMethod();
        Intrinsics.checkNotNull(method);
        Request.Builder builderMethod = builder.method(method, requestBodyCreate$default);
        String url = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url);
        Request.Builder builderUrl = builderMethod.url(url);
        Map<String, String> header = deviceHttpRequest.getHeader();
        Intrinsics.checkNotNull(header);
        try {
            Response responseA = a(builderUrl.headers(a(header)).build());
            int iCode = responseA.code();
            ResponseBody responseBodyBody = responseA.body();
            return new DeviceHttpResponse(1, iCode, responseBodyBody != null ? responseBodyBody.bytes() : null);
        } catch (SocketTimeoutException unused) {
            return new DeviceHttpResponse(4, 0, null, 6, null);
        } catch (IOException unused2) {
            return new DeviceHttpResponse(5, 0, null, 6, null);
        } catch (Exception unused3) {
            return new DeviceHttpResponse(2, 0, null, 6, null);
        }
    }

    public final void a(@NotNull RequestInterceptor requestInterceptor) {
        Intrinsics.checkNotNullParameter(requestInterceptor, "requestInterceptor");
        this.t.add(requestInterceptor);
    }

    public final Headers a(Map<String, String> headerMap) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }

    public final Response a(Request request) {
        return b().newCall(request).execute();
    }

    public final boolean a(DeviceHttpRequest deviceHttpRequest) {
        return (deviceHttpRequest.getUrl() == null || deviceHttpRequest.getMethod() == null || deviceHttpRequest.getHeader() == null) ? false : true;
    }

    public final SSLSocketFactory a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
