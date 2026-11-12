package com.huami.ai.speech.alexa.capability.synthesizer;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.gson.Gson;
import com.huami.ai.speech.alexa.AlexaWebApi;
import com.huami.ai.speech.alexa.AlexaWebApiKt;
import com.huami.ai.speech.alexa.entity.EventEntity;
import com.huami.ai.speech.alexa.entity.EventEntityWrapper;
import com.huami.ai.speech.alexa.entity.Header;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SpeechSynthesizerEventPayload;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEventImpl;", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", "", "eventName", "", "a", "name", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "payload", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "b", "token", "speechStarted", "speechFinished", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "c", "Ljava/lang/String;", "ttsSpeakToken", "<init>", "(Lcom/huami/ai/speech/alexa/AlexaWebApi;Lcom/google/gson/Gson;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechSynthesizerEventImpl implements SpeechSynthesizerEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private volatile String ttsSpeakToken;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("上报TTS播报的事件错误，token：", SpeechSynthesizerEventImpl.this.ttsSpeakToken);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Throwable th) {
            super(0);
            this.a = str;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上报播放tts音频的事件:" + this.a + " 失败！" + this.b;
        }
    }

    public SpeechSynthesizerEventImpl(@NotNull AlexaWebApi alexaWebApi, @NotNull Gson gson) {
        this.webApi = alexaWebApi;
        this.gson = gson;
    }

    private final void a(String eventName) {
        Object objM3845constructorimpl;
        String str = this.ttsSpeakToken;
        if (str == null || str.length() == 0) {
            HMLog.error$default("speech", null, null, new a(), 6, null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(AlexaWebApiKt.events(this.webApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(b(eventName, new SpeechSynthesizerEventPayload(this.ttsSpeakToken))), this.gson));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default("speech", null, null, new b(eventName, thM3848exceptionOrNullimpl), 6, null);
        }
    }

    private final EventEntity<Payload> b(String name, Payload payload) {
        EventEntity.Companion companion = EventEntity.INSTANCE;
        return new EventEntity<>(Header.INSTANCE.withMessage(name, "SpeechSynthesizer"), payload);
    }

    @Override // com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerEvent
    public void speechFinished() {
        a(AVSAPIConstants.SpeechSynthesizer.Events.SpeechFinished.NAME);
        this.ttsSpeakToken = null;
    }

    @Override // com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerEvent
    public void speechStarted(@NotNull String token) {
        this.ttsSpeakToken = token;
        a(AVSAPIConstants.SpeechSynthesizer.Events.SpeechStarted.NAME);
    }
}
