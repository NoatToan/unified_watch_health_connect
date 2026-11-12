package com.huami.ai.speech.alexa;

import com.google.gson.Gson;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.ai.speech.alexa.entity.Capabilities;
import com.huami.ai.speech.alexa.http.AlexaClient;
import com.huami.ai.speech.alexa.http.AlexaToken;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.tools.log.HMLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R%\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaWebApiImpl;", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "Lcom/huami/ai/speech/alexa/http/AlexaClient;", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/Response;", "directives", "Lokhttp3/RequestBody;", "body", "events", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "capabilities", "Lcom/huami/ai/speech/alexa/http/AlexaToken;", "a", "Lcom/huami/ai/speech/alexa/http/AlexaToken;", "tokenApi", "", "b", "Ljava/lang/String;", "countryCode", "", "c", "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "header", "<init>", "(Lcom/huami/ai/speech/alexa/http/AlexaToken;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaWebApiImpl implements AlexaWebApi, AlexaClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaToken tokenApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> header;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "alexa country code:" + AlexaWebApiImpl.this.countryCode + ",base url:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("capability:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lokhttp3/Request$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Request.Builder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ AlexaWebApiImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, AlexaWebApiImpl alexaWebApiImpl) {
            super(1);
            this.a = str;
            this.b = alexaWebApiImpl;
        }

        public final void a(@NotNull Request.Builder builder) {
            builder.url(HttpUrl.get("https://api.amazonalexa.com/v1/devices/@self/capabilities"));
            builder.put(OkHttpKtxKt.buildRequestJsonBody(this.a));
            builder.addHeader("Content-Type", "application/json");
            builder.addHeader("Content-Length", Intrinsics.stringPlus("", Integer.valueOf(m.encodeToByteArray(this.a).length)));
            builder.addHeader("x-amz-access-token", this.b.tokenApi.accessToken());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Request.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    public AlexaWebApiImpl(@NotNull AlexaToken alexaToken, @NotNull String str) {
        this.tokenApi = alexaToken;
        this.countryCode = str;
        this.header = q.mapOf(TuplesKt.to("Authorization", Intrinsics.stringPlus("Bearer ", alexaToken.accessToken())));
    }

    @Override // com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        String strAlexaEndPoint = SpeechKeeper.INSTANCE.alexaEndPoint();
        if (strAlexaEndPoint == null) {
            strAlexaEndPoint = AlexaBaseUrl.INSTANCE.getEndPoint(this.countryCode).getBaseUrl();
        }
        HMLog.info("speech", new a(strAlexaEndPoint));
        return HttpUrl.get(strAlexaEndPoint);
    }

    @Override // com.huami.ai.speech.alexa.AlexaWebApi
    @NotNull
    public Response capabilities(@NotNull VoiceConfig voiceConfig) {
        String json = new Gson().toJson(Capabilities.INSTANCE.create(voiceConfig));
        HMLog.info("speech", new b(json));
        return HttpKitKtxKt.http(this, OkHttpKtxKt.buildRequest(new c(json, this)));
    }

    @Override // com.huami.ai.speech.alexa.AlexaWebApi
    @NotNull
    public Response directives() {
        return HttpKitKtxKt.httpGet$default(this, "v20160207/directives", null, this.header, 2, null);
    }

    @Override // com.huami.ai.speech.alexa.AlexaWebApi
    @NotNull
    public Response events(@NotNull RequestBody body) {
        return HttpKitKtxKt.httpPost$default(this, "v20160207/events", body, null, this.header, 4, null);
    }

    @NotNull
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @Override // com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return AlexaClient.DefaultImpls.okHttpClient(this);
    }
}
