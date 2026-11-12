package com.huami.ai.speech.alexa.http;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.alexa.AlexaBaseUrl;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.ConnectionPool;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/ai/speech/alexa/http/AlexaClient;", "Lcom/huami/http/HttpKit;", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AlexaClient extends HttpKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/speech/alexa/http/AlexaClient$Companion;", "", "", "b", "Ljava/lang/String;", "CLIENT_KEY", "", "c", "J", "PING_INTERVAL", GoogleApiAvailabilityLight.a, "READ_TIMEOUT", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String CLIENT_KEY = "com.huami.ai.alexa.AlexaHttp";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final long PING_INTERVAL = 5;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final long READ_TIMEOUT = 60;

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/OkHttpClient;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<OkHttpClient> {
            public final /* synthetic */ OkHttpClient a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OkHttpClient okHttpClient) {
                super(0);
                this.a = okHttpClient;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient invoke() {
                return this.a;
            }
        }

        @NotNull
        public static HttpUrl baseUrl(@NotNull AlexaClient alexaClient) {
            return HttpUrl.get(AlexaBaseUrl.NorthAmerica.getBaseUrl());
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull AlexaClient alexaClient) {
            try {
                return HttpKitContext.INSTANCE.getClientOrThrow("com.huami.ai.alexa.AlexaHttp");
            } catch (Exception unused) {
                OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                builderNewBuilder.pingInterval(5L, timeUnit);
                builderNewBuilder.connectionPool(new ConnectionPool(1, 5L, timeUnit));
                builderNewBuilder.readTimeout(60L, timeUnit);
                builderNewBuilder.connectTimeout(60L, timeUnit);
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                HttpKitContext.INSTANCE.setClient("com.huami.ai.alexa.AlexaHttp", new a(okHttpClientBuild));
                return okHttpClientBuild;
            }
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    HttpUrl baseUrl();

    @Override // com.huami.http.HttpKit
    @NotNull
    OkHttpClient okHttpClient();
}
