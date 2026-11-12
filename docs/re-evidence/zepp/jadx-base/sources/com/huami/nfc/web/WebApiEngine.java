package com.huami.nfc.web;

import java.net.Proxy;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/nfc/web/WebApiEngine;", "Lcom/huami/nfc/web/IWebApiEngine;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lretrofit2/Retrofit;", "retrofitClient", "Lcom/huami/nfc/web/IWebApiConfig;", "a", "Lcom/huami/nfc/web/IWebApiConfig;", "config", "", "b", "Ljava/lang/String;", "baseUrl", "<init>", "(Lcom/huami/nfc/web/IWebApiConfig;)V", "Companion", "web_release"}, k = 1, mv = {1, 5, 1})
public final class WebApiEngine implements IWebApiEngine {
    private static final long c = 30;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IWebApiConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String baseUrl = "https://api-mifit.huami.com/";

    public WebApiEngine(@NotNull IWebApiConfig iWebApiConfig) {
        this.config = iWebApiConfig;
    }

    @Override // com.huami.nfc.web.IWebApiEngine
    @NotNull
    public OkHttpClient okHttpClient() {
        OkHttpClient.Builder builderProxy = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builderProxy.connectTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).readTimeout(30L, timeUnit);
        Iterator<T> it2 = this.config.okHttpInterceptors().iterator();
        while (it2.hasNext()) {
            timeout.addInterceptor((Interceptor) it2.next());
        }
        Iterator<T> it3 = this.config.okHttpNetworkInterceptors().iterator();
        while (it3.hasNext()) {
            timeout.addNetworkInterceptor((Interceptor) it3.next());
        }
        return timeout.build();
    }

    @Override // com.huami.nfc.web.IWebApiEngine
    @NotNull
    public Retrofit retrofitClient() {
        Retrofit.Builder builderBaseUrl = new Retrofit.Builder().client(okHttpClient()).baseUrl(this.baseUrl);
        Iterator<T> it2 = this.config.retrofitConverterFactory().iterator();
        while (it2.hasNext()) {
            builderBaseUrl.addConverterFactory((Converter.Factory) it2.next());
        }
        return builderBaseUrl.build();
    }
}
