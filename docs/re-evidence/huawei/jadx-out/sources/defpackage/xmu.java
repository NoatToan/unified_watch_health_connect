package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.ToStringConverterFactory;
import com.huawei.hms.framework.network.restclient.converter.gson.GsonConverterFactory;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes20.dex */
public class xmu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Integer, RestClient> f53173c = new ConcurrentHashMap();
    private static final Lock d = new ReentrantLock();

    public static RestClient e(String str, Context context) {
        RestClient restClient;
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        RestClient restClientBuild = f53173c.get(Integer.valueOf(str.hashCode()));
        if (restClientBuild != null) {
            return restClientBuild;
        }
        Lock lock = d;
        lock.lock();
        try {
            try {
                restClient = f53173c.get(Integer.valueOf(str.hashCode()));
                if (restClient == null) {
                    try {
                        restClientBuild = new RestClient.Builder(context).baseUrl(str).addConverterFactory(new ToStringConverterFactory()).addConverterFactory(GsonConverterFactory.create()).httpClient(new HttpClient.Builder().retryTimeOnConnectionFailure(0).connectTimeout(60000).readTimeout(60000).sslSocketFactory(SecureSSLSocketFactoryNew.getInstance(context.getApplicationContext(), xpj.e()), new SecureX509TrustManager(context)).hostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER).build()).build();
                        f53173c.put(Integer.valueOf(str.hashCode()), restClientBuild);
                        lock.unlock();
                        return restClientBuild;
                    } catch (Exception unused) {
                    }
                } else {
                    lock.unlock();
                    return restClient;
                }
            } catch (Exception unused2) {
                restClient = restClientBuild;
            }
        } catch (Throwable th) {
            d.unlock();
            throw th;
        }
        xnd.d("RestClientSettings", "catch RestClient getRestClient Exception", false);
        d.unlock();
        return restClient;
    }
}
