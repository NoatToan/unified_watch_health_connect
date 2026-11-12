package com.huami.nfc.web;

import com.huami.watch.transdata.transport.Actions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H&¨\u0006\r"}, d2 = {"Lcom/huami/nfc/web/IWebApiConfig;", "", "Lkotlin/Function0;", "", "baseHost", "", Actions.KEY_HEADERS, "", "Lokhttp3/Interceptor;", "okHttpInterceptors", "okHttpNetworkInterceptors", "Lretrofit2/Converter$Factory;", "retrofitConverterFactory", "web_release"}, k = 1, mv = {1, 5, 1})
public interface IWebApiConfig {
    @NotNull
    Function0<String> baseHost();

    @NotNull
    Function0<Map<String, String>> headers();

    @NotNull
    List<Interceptor> okHttpInterceptors();

    @NotNull
    List<Interceptor> okHttpNetworkInterceptors();

    @NotNull
    List<Converter.Factory> retrofitConverterFactory();
}
