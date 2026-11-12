package com.xiaomi.fitness.sport.view.justdance;

import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.onetrack.api.b;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003*\u0002\u0012\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/JDSocketHelper;", "", "<init>", "()V", DeviceInfo.Builder.PrivateDataKey.IP, "", b.F, "socketClient", "Lokhttp3/OkHttpClient;", "init", "", "getImagePath", "path", "createOkhttpClient", "destroyOkhttpClient", "createSSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "myTrustManager", "com/xiaomi/fitness/sport/view/justdance/JDSocketHelper$myTrustManager$1", "Lcom/xiaomi/fitness/sport/view/justdance/JDSocketHelper$myTrustManager$1;", "allHostsValid", "com/xiaomi/fitness/sport/view/justdance/JDSocketHelper$allHostsValid$1", "Lcom/xiaomi/fitness/sport/view/justdance/JDSocketHelper$allHostsValid$1;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JDSocketHelper {

    @Nullable
    private static OkHttpClient socketClient;

    @NotNull
    public static final JDSocketHelper INSTANCE = new JDSocketHelper();

    @NotNull
    private static String ip = "";

    @NotNull
    private static String port = "";

    @NotNull
    private static final JDSocketHelper$myTrustManager$1 myTrustManager = new X509TrustManager() { // from class: com.xiaomi.fitness.sport.view.justdance.JDSocketHelper$myTrustManager$1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    };

    @NotNull
    private static final JDSocketHelper$allHostsValid$1 allHostsValid = new HostnameVerifier() { // from class: com.xiaomi.fitness.sport.view.justdance.JDSocketHelper$allHostsValid$1
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    };

    private JDSocketHelper() {
    }

    private final SSLSocketFactory createSSLSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        JDSocketHelper$myTrustManager$1 jDSocketHelper$myTrustManager$1 = myTrustManager;
        sSLContext.init(null, new JDSocketHelper$myTrustManager$1[]{jDSocketHelper$myTrustManager$1}, new SecureRandom());
        SSLContext sSLContext2 = SSLContext.getInstance("SSL");
        sSLContext2.init(null, new JDSocketHelper$myTrustManager$1[]{jDSocketHelper$myTrustManager$1}, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext2.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
        return socketFactory;
    }

    @NotNull
    public final OkHttpClient createOkhttpClient() {
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().pingInterval(10L, TimeUnit.SECONDS).sslSocketFactory(createSSLSocketFactory(), myTrustManager).hostnameVerifier(allHostsValid).build();
        socketClient = okHttpClientBuild;
        Intrinsics.checkNotNull(okHttpClientBuild);
        return okHttpClientBuild;
    }

    public final void destroyOkhttpClient() {
        Dispatcher dispatcher;
        ExecutorService executorService;
        OkHttpClient okHttpClient = socketClient;
        if (okHttpClient != null && (dispatcher = okHttpClient.dispatcher()) != null && (executorService = dispatcher.executorService()) != null) {
            executorService.shutdown();
        }
        socketClient = null;
    }

    @NotNull
    public final String getImagePath(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "https://" + ip + ":" + port + path;
    }

    public final void init(@NotNull String ip2, @NotNull String port2) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        Intrinsics.checkNotNullParameter(port2, "port");
        ip = ip2;
        port = port2;
    }
}
