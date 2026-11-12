package defpackage;

import com.xiaomi.fitness.net.HttpRepository;
import com.xiaomi.fitness.net.url.ApiHolder;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes9.dex */
public final class dhc {
    public static void a(HttpRepository httpRepository, ApiHolder apiHolder) {
        httpRepository.mApiHolder = apiHolder;
    }

    public static void b(HttpRepository httpRepository, OkHttpClient okHttpClient) {
        httpRepository.mOkHttpClient = okHttpClient;
    }

    public static void c(HttpRepository httpRepository, etk etkVar) {
        httpRepository.mRetrofit = etkVar;
    }
}
