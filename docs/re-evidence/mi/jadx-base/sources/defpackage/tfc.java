package defpackage;

import com.google.gson.Gson;
import com.xiaomi.fitness.net.di.HttpClientModule;

/* JADX INFO: loaded from: classes9.dex */
public final class tfc implements dei {
    public static Gson a(HttpClientModule httpClientModule) {
        return (Gson) f6i.c(httpClientModule.providerGson());
    }
}
