package com.huami.ai.speech.alexa.capability.apigateway;

import com.google.gson.Gson;
import com.huami.ai.speech.alexa.AlexaWebApi;
import com.huami.ai.speech.alexa.AlexaWebApiKt;
import com.huami.ai.speech.alexa.MultipartResponse;
import com.huami.ai.speech.alexa.entity.EventEntity;
import com.huami.ai.speech.alexa.entity.EventEntityWrapper;
import com.huami.ai.speech.alexa.entity.Header;
import com.huami.ai.speech.alexa.entity.payload.EmptyPayload;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/apigateway/ApiGatewayEventsImpl;", "Lcom/huami/ai/speech/alexa/capability/apigateway/ApiGatewayEvents;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "payload", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "a", "", "verifyGateway", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/huami/ai/speech/alexa/AlexaWebApi;Lcom/google/gson/Gson;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class ApiGatewayEventsImpl implements ApiGatewayEvents {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "不需要更改Api Gateway!";
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
            return Intrinsics.stringPlus("检查EndPoint，获取的Json结果:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("需要重新设置EndPoint：", this.a);
        }
    }

    public ApiGatewayEventsImpl(@NotNull AlexaWebApi alexaWebApi, @NotNull Gson gson) {
        this.webApi = alexaWebApi;
        this.gson = gson;
    }

    private final EventEntity<Payload> a(Payload payload) {
        EventEntity.Companion companion = EventEntity.INSTANCE;
        return new EventEntity<>(Header.INSTANCE.withMessage("VerifyGateway", "Alexa.ApiGateway"), payload);
    }

    @Override // com.huami.ai.speech.alexa.capability.apigateway.ApiGatewayEvents
    @Nullable
    public String verifyGateway() {
        JSONObject jSONObjectOptJSONObject;
        MultipartResponse multipartResponse = AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(a(new EmptyPayload())), this.gson).getMultipartResponse();
        String strOptString = null;
        if (multipartResponse.getJsonParts().isEmpty()) {
            HMLog.info("speech", a.a);
            return null;
        }
        String json = multipartResponse.getJsonParts().get(0).getJson();
        HMLog.info("speech", new b(json));
        JSONObject jSONObjectOptJSONObject2 = new JSONObject(json).optJSONObject("directive");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("payload")) != null) {
            strOptString = jSONObjectOptJSONObject.optString("gateway");
        }
        HMLog.info("speech", new c(strOptString));
        return strOptString;
    }
}
