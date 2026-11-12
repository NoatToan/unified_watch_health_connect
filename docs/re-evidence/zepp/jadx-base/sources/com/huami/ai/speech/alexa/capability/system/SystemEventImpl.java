package com.huami.ai.speech.alexa.capability.system;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.gson.Gson;
import com.huami.ai.speech.alexa.AlexaWebApi;
import com.huami.ai.speech.alexa.AlexaWebApiKt;
import com.huami.ai.speech.alexa.MultipartResponseResult;
import com.huami.ai.speech.alexa.entity.EventEntity;
import com.huami.ai.speech.alexa.entity.EventEntityWrapper;
import com.huami.ai.speech.alexa.entity.Header;
import com.huami.ai.speech.alexa.entity.payload.EmptyPayload;
import com.huami.ai.speech.alexa.entity.payload.LocalesPayload;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SoftwareInfoPayload;
import com.huami.ai.speech.alexa.entity.payload.TimeZonePayload;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/system/SystemEventImpl;", "Lcom/huami/ai/speech/alexa/capability/system/SystemEvent;", "", "name", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "payload", "Lcom/huami/ai/speech/alexa/MultipartResponseResult;", "b", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "a", "", "synchronizeState", "Lcom/huami/ai/speech/alexa/entity/payload/TimeZonePayload;", "timeZoneReport", "timeZoneChanged", "Lcom/huami/ai/speech/alexa/entity/payload/LocalesPayload;", "localsChanged", "Lcom/huami/ai/speech/alexa/entity/payload/SoftwareInfoPayload;", "softwareInfoPayload", "softwareInfo", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/huami/ai/speech/alexa/AlexaWebApi;Lcom/google/gson/Gson;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SystemEventImpl implements SystemEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SoftwareInfoPayload a;
        public final /* synthetic */ MultipartResponseResult b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SoftwareInfoPayload softwareInfoPayload, MultipartResponseResult multipartResponseResult) {
            super(0);
            this.a = softwareInfoPayload;
            this.b = multipartResponseResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上报SoftWareInfo firmwareVersion= " + this.a.getFirmwareVersion() + "，上报结果：" + this.b.isSuccess() + ",code:" + this.b.getCode();
        }
    }

    public SystemEventImpl(@NotNull AlexaWebApi alexaWebApi, @NotNull Gson gson) {
        this.webApi = alexaWebApi;
        this.gson = gson;
    }

    private final EventEntity<Payload> a(String name, Payload payload) {
        EventEntity.Companion companion = EventEntity.INSTANCE;
        return new EventEntity<>(Header.INSTANCE.withMessage(name, "System"), payload);
    }

    private final MultipartResponseResult b(String name, Payload payload) {
        return AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(a(name, payload)), this.gson);
    }

    @Override // com.huami.ai.speech.alexa.capability.system.SystemEvent
    public void localsChanged(@NotNull LocalesPayload payload) {
        b("LocalesChanged", payload);
    }

    @Override // com.huami.ai.speech.alexa.capability.system.SystemEvent
    public void softwareInfo(@NotNull SoftwareInfoPayload softwareInfoPayload) {
        HMLog.info("speech", new a(softwareInfoPayload, b("SoftwareInfo", softwareInfoPayload)));
    }

    @Override // com.huami.ai.speech.alexa.capability.system.SystemEvent
    public void synchronizeState() {
        b(AVSAPIConstants.System.Events.SynchronizeState.NAME, new EmptyPayload());
    }

    @Override // com.huami.ai.speech.alexa.capability.system.SystemEvent
    public void timeZoneChanged(@NotNull TimeZonePayload payload) {
        b("TimeZoneChanged", payload);
    }

    @Override // com.huami.ai.speech.alexa.capability.system.SystemEvent
    public void timeZoneReport(@NotNull TimeZonePayload payload) {
        b("TimeZoneReport", payload);
    }
}
