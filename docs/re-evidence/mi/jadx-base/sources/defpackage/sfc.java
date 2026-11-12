package defpackage;

import com.xiaomi.fitness.net.di.HttpClientModule;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes9.dex */
public final class sfc implements dei {
    public static OkHttpClient a(HttpClientModule httpClientModule, OkHttpClient.Builder builder) {
        return (OkHttpClient) f6i.c(httpClientModule.provideOkHttpClient(builder));
    }
}
