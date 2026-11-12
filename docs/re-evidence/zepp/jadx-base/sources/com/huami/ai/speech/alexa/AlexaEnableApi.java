package com.huami.ai.speech.alexa;

import com.amazon.identity.auth.device.authorization.AuthorizationResponseParser;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaEnableApi;", "", "", "skillId", StepsInfo.KEY_STAGE, AuthorizationResponseParser.REDIRECT_URI_STATE, Configs.Params.AUTHCODE, "Lokhttp3/Response;", "enableSkill", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AlexaEnableApi {
    @NotNull
    Response enableSkill(@NotNull String skillId, @NotNull String stage, @NotNull String redirectUri, @NotNull String authCode);
}
