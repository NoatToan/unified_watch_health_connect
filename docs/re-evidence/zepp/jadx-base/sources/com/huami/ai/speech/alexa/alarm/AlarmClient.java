package com.huami.ai.speech.alexa.alarm;

import com.huami.ai.speech.alexa.alarm.AlarmClient;
import com.huami.ai.speech.alexa.http.AlexaClient;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/speech/alexa/alarm/AlarmClient;", "Lcom/huami/ai/speech/alexa/http/AlexaClient;", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "userResponse", "b", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "", "a", "Ljava/lang/String;", "token", "countryCode", "c", "Lokhttp3/OkHttpClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlarmClient implements AlexaClient {
    private static final int d = 307;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OkHttpClient client;

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
            return "alexa country code:" + AlarmClient.this.countryCode + ",Alarm base url:" + this.b;
        }
    }

    public AlarmClient(@NotNull String str, @NotNull String str2) {
        this.token = str;
        this.countryCode = str2;
    }

    private final Request b(Request request, Response userResponse) {
        Request.Builder builderNewBuilder = request.newBuilder();
        builderNewBuilder.method(request.method(), request.body());
        builderNewBuilder.addHeader("Authorization", this.token);
        String string = userResponse.headers().get("Location");
        if (string == null) {
            string = userResponse.request().url().toString();
        }
        return builderNewBuilder.url(string).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response c(AlarmClient alarmClient, Interceptor.Chain chain) throws IOException {
        Request requestBuild = chain.request().newBuilder().addHeader("Authorization", alarmClient.token).build();
        HttpUrl httpUrlUrl = requestBuild.url();
        Response responseProceed = chain.proceed(requestBuild);
        HttpUrl httpUrlUrl2 = responseProceed.request().url();
        if (!Intrinsics.areEqual(httpUrlUrl, httpUrlUrl2) || responseProceed.code() == 307) {
            return (Intrinsics.areEqual(httpUrlUrl.scheme(), httpUrlUrl2.scheme()) && Intrinsics.areEqual(requestBuild.method(), "GET")) ? responseProceed : chain.proceed(alarmClient.b(requestBuild, responseProceed));
        }
        return responseProceed;
    }

    @Override // com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        String baseUrl = AlarmBaseUrl.INSTANCE.getEndPoint(this.countryCode).getBaseUrl();
        HMLog.info("speech", new a(baseUrl));
        return HttpUrl.get(baseUrl);
    }

    @Override // com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        if (this.client == null) {
            this.client = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() { // from class: ta
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    return AlarmClient.c(this.a, chain);
                }
            }).followRedirects(true).build();
        }
        return this.client;
    }
}
