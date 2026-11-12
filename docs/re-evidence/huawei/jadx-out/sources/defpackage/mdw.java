package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.ToStringConverterFactory;
import com.huawei.hms.framework.network.restclient.converter.gson.GsonConverterFactory;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.secure.android.common.SecureSSLSocketFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
public class mdw {
    private static Map<Integer, RestClient> e = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lock f41487b = new ReentrantLock();

    public static RestClient b(String str, Context context) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        f41487b.lock();
        try {
            RestClient restClient = e.get(Integer.valueOf(str.hashCode()));
            if (restClient != null) {
                return restClient;
            }
            RestClient restClientBuild = new RestClient.Builder(context).baseUrl(str).addConverterFactory(new ToStringConverterFactory()).addConverterFactory(GsonConverterFactory.create()).httpClient(new HttpClient.Builder().retryTimeOnConnectionFailure(0).connectTimeout(60000).readTimeout(60000).hostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER).build()).build();
            e.put(Integer.valueOf(str.hashCode()), restClientBuild);
            return restClientBuild;
        } finally {
            f41487b.unlock();
        }
    }
}
