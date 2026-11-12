package defpackage;

import com.xiaomi.fitness.net.HttpConfig;
import com.xiaomi.fitness.net.di.HttpClientModule;
import com.xiaomi.fitness.net.interceptor.HttpHandlerInterceptor;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes9.dex */
public final class rfc implements dei {
    public static OkHttpClient.Builder a(HttpClientModule httpClientModule, HttpConfig httpConfig, HttpHandlerInterceptor httpHandlerInterceptor, Set<Interceptor> set) {
        return (OkHttpClient.Builder) f6i.c(httpClientModule.provideOkHttpBuilder(httpConfig, httpHandlerInterceptor, set));
    }
}
