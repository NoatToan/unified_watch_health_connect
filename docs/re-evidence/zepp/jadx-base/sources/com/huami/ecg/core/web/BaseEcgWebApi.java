package com.huami.ecg.core.web;

import com.huami.ecg.core.EcgCore;
import com.huami.http.HttpKit;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/ecg/core/web/BaseEcgWebApi;", "Lcom/huami/http/HttpKit;", "Lokhttp3/HttpUrl;", "baseUrl", "", "", "header", "headerJson", "param", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface BaseEcgWebApi extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        @NotNull
        public static HttpUrl baseUrl(BaseEcgWebApi baseEcgWebApi) {
            return HttpUrl.get(EcgCore.INSTANCE.getWebSetting().host());
        }

        @NotNull
        public static Map<String, String> header(BaseEcgWebApi baseEcgWebApi) {
            return EcgCore.INSTANCE.getWebSetting().getSystemHeader();
        }

        @NotNull
        public static Map<String, String> headerJson(BaseEcgWebApi baseEcgWebApi) {
            Map<String, String> systemHeader = EcgCore.INSTANCE.getWebSetting().getSystemHeader();
            systemHeader.put("Content-Type", "application/json");
            return systemHeader;
        }

        @NotNull
        public static OkHttpClient okHttpClient(BaseEcgWebApi baseEcgWebApi) {
            return HttpKit.DefaultImpls.okHttpClient(baseEcgWebApi);
        }

        @NotNull
        public static Map<String, String> param(BaseEcgWebApi baseEcgWebApi) {
            return EcgCore.INSTANCE.getWebSetting().getSystemParam();
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    HttpUrl baseUrl();

    @NotNull
    Map<String, String> header();

    @NotNull
    Map<String, String> headerJson();

    @NotNull
    Map<String, String> param();
}
