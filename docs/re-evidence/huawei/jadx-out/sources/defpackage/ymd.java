package defpackage;

import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.wearengine.common.SecureX509TrustManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes20.dex */
public class ymd {
    public static void a() {
        try {
            if (yiv.a() == null) {
                yit.b("ScopeHttpUtil", "Networkkit init context is null");
            } else {
                NetworkKit.init(yiv.a(), new NetworkKit.Callback() { // from class: ymd.3
                    @Override // com.huawei.hms.network.NetworkKit.Callback
                    public void onResult(boolean z) {
                        yit.e("ScopeHttpUtil", "Networkkit init result: " + z);
                    }
                });
            }
        } catch (Throwable unused) {
            yit.b("ScopeHttpUtil", "Networkkit init exception");
        }
    }

    private static HttpClient d() {
        yip yipVarB;
        SecureX509TrustManager secureX509TrustManager;
        try {
            yipVarB = yip.b(yiv.a());
            try {
                secureX509TrustManager = new SecureX509TrustManager(yiv.a());
            } catch (FileNotFoundException unused) {
                yit.b("ScopeHttpUtil", "file not found");
                secureX509TrustManager = null;
            } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused2) {
                yit.b("ScopeHttpUtil", "HttpRequest new HealthSafeSocketFactory Exception ");
                secureX509TrustManager = null;
            }
        } catch (FileNotFoundException unused3) {
            yipVarB = null;
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused4) {
            yipVarB = null;
        }
        if (yipVarB == null || secureX509TrustManager == null) {
            yit.b("ScopeHttpUtil", "Class HttpRequest safeSocketFactory or healthX509TrustManager is null");
            return null;
        }
        try {
            return new HttpClient.Builder().connectTimeout(30000).readTimeout(30000).writeTimeout(30000).sslSocketFactory((SSLSocketFactory) yipVarB, (X509TrustManager) secureX509TrustManager).build();
        } catch (Throwable unused5) {
            yit.b("ScopeHttpUtil", "getHttpClient exception");
            return null;
        }
    }

    public static Response c(String str, String str2) {
        yit.e("ScopeHttpUtil", "get scope appID " + str2);
        try {
            HttpClient httpClientD = d();
            Request requestBuild = httpClientD.newRequest().url(str).method("GET").build();
            if (httpClientD == null) {
                yit.b("ScopeHttpUtil", "get okHttpClient is null");
                return null;
            }
            return httpClientD.newSubmit(requestBuild).execute();
        } catch (IOException unused) {
            yit.b("ScopeHttpUtil", "get scope IOException");
            return null;
        }
    }
}
