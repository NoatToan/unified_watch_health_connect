package com.huami.ai.speech.alexa;

import com.amazon.identity.auth.device.authorization.AuthorizationResponseParser;
import com.google.gson.JsonObject;
import com.huami.ai.speech.alexa.http.AlexaEnableClient;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaEnableApiImp;", "Lcom/huami/ai/speech/alexa/AlexaEnableApi;", "Lcom/huami/ai/speech/alexa/http/AlexaEnableClient;", "", "skillId", StepsInfo.KEY_STAGE, AuthorizationResponseParser.REDIRECT_URI_STATE, Configs.Params.AUTHCODE, "Lokhttp3/Response;", "enableSkill", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaEnableApiImp implements AlexaEnableApi, AlexaEnableClient {
    @Override // com.huami.ai.speech.alexa.http.AlexaEnableClient, com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return AlexaEnableClient.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.ai.speech.alexa.AlexaEnableApi
    @NotNull
    public Response enableSkill(@NotNull String skillId, @NotNull String stage, @NotNull String redirectUri, @NotNull String authCode) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StepsInfo.KEY_STAGE, stage);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(AuthorizationResponseParser.REDIRECT_URI_STATE, redirectUri);
        jsonObject2.addProperty(Configs.Params.AUTHCODE, authCode);
        jsonObject2.addProperty("type", "AUTH_CODE");
        Unit unit = Unit.INSTANCE;
        jsonObject.add("accountLinkRequest", jsonObject2);
        return HttpKitKtxKt.httpPost$default(this, "/v1/users/~current/skills/" + skillId + "/enablement", OkHttpKtxKt.buildRequestJsonBody(jsonObject.toString()), null, null, 12, null);
    }

    @Override // com.huami.ai.speech.alexa.http.AlexaClient, com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return AlexaEnableClient.DefaultImpls.okHttpClient(this);
    }
}
