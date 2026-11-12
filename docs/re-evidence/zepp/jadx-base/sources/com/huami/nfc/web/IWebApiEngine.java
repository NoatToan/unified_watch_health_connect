package com.huami.nfc.web;

import kotlin.Metadata;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/nfc/web/IWebApiEngine;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lretrofit2/Retrofit;", "retrofitClient", "web_release"}, k = 1, mv = {1, 5, 1})
public interface IWebApiEngine {
    @NotNull
    OkHttpClient okHttpClient();

    @NotNull
    Retrofit retrofitClient();
}
