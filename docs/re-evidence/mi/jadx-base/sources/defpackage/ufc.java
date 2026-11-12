package defpackage;

import com.google.gson.Gson;
import com.xiaomi.fitness.net.HttpConfig;
import com.xiaomi.fitness.net.di.HttpClientModule;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes9.dex */
public final class ufc implements dei {
    public static etk a(HttpClientModule httpClientModule, OkHttpClient okHttpClient, HttpConfig httpConfig, Gson gson) {
        return (etk) f6i.c(httpClientModule.providerRetrofit(okHttpClient, httpConfig, gson));
    }
}
