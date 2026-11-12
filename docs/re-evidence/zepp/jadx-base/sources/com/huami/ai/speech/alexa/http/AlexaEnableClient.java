package com.huami.ai.speech.alexa.http;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/huami/ai/speech/alexa/http/AlexaEnableClient;", "Lcom/huami/ai/speech/alexa/http/AlexaClient;", "Lokhttp3/HttpUrl;", "baseUrl", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AlexaEnableClient extends AlexaClient {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static HttpUrl baseUrl(@NotNull AlexaEnableClient alexaEnableClient) {
            return HttpUrl.get("https://api.amazonalexa.com");
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull AlexaEnableClient alexaEnableClient) {
            return AlexaClient.DefaultImpls.okHttpClient(alexaEnableClient);
        }
    }

    @Override // com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    HttpUrl baseUrl();
}
