package defpackage;

import android.util.Pair;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.network.embedded.y;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.LogUtil;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes11.dex */
public class mom implements HttpProxyInterface {
    private final oet e = oet.c(d());

    static /* synthetic */ boolean c(String str, SSLSession sSLSession) {
        return true;
    }

    private static HttpClient d() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        Pair<SSLSocketFactory, TrustManager> pairE = e();
        HttpClient.Builder builderHostnameVerifier = new HttpClient.Builder().connectTimeout(y.f15619c).writeTimeout(5000).readTimeout(5000).hostnameVerifier(c());
        if (pairE.first != null) {
            builderHostnameVerifier.sslSocketFactory((SSLSocketFactory) pairE.first, (X509TrustManager) pairE.second);
        }
        return builderHostnameVerifier.build();
    }

    private static Pair<SSLSocketFactory, TrustManager> e() {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: mom.3
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            return Pair.create(sSLContext.getSocketFactory(), trustManagerArr[0]);
        } catch (Exception e) {
            LogUtil.d("HttpProxyUnsafe", "sslUnsafeFactory exception: " + e.getMessage());
            return Pair.create(null, trustManagerArr[0]);
        }
    }

    private static HostnameVerifier c() {
        return new HostnameVerifier() { // from class: mos
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return mom.c(str, sSLSession);
            }
        };
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void post(String str, Map<String, String> map, String str2, ResultCallback<oeq> resultCallback) {
        this.e.c(str, map, str2, oeq.class, resultCallback);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void get(String str, Map<String, String> map, Map<String, String> map2, ResultCallback<oeq> resultCallback) {
        this.e.e(str, map, map2, oeq.class, resultCallback);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void put(String str, Map<String, String> map, String str2, ResultCallback<oeq> resultCallback) {
        this.e.d(str, map, str2, oeq.class, resultCallback);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface
    public void delete(String str, Map<String, String> map, ResultCallback<oeq> resultCallback) {
        this.e.c(str, map, oeq.class, resultCallback);
    }
}
