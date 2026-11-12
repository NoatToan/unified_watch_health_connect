package com.huami.ai.speech.alexa.capability.recognizer;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.gson.Gson;
import com.huami.ai.speech.alexa.AlexaWebApi;
import com.huami.ai.speech.alexa.AlexaWebApiKt;
import com.huami.ai.speech.alexa.GeoLocation;
import com.huami.ai.speech.alexa.MultipartResponse;
import com.huami.ai.speech.alexa.entity.AlexaEntity;
import com.huami.ai.speech.alexa.entity.AlexaEntityKtxKt;
import com.huami.ai.speech.alexa.entity.EventEntity;
import com.huami.ai.speech.alexa.entity.EventEntityWrapper;
import com.huami.ai.speech.alexa.entity.Header;
import com.huami.ai.speech.alexa.entity.payload.EmptyPayload;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.RecognizePayload;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEventImpl;", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;", "Lcom/huami/ai/speech/alexa/entity/payload/RecognizePayload;", "payload", "Lokhttp3/RequestBody;", "audioBody", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "recognize", "", "expectSpeechTimedOut", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "a", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "gson", "Lcom/huami/ai/speech/alexa/GeoLocation;", "c", "Lcom/huami/ai/speech/alexa/GeoLocation;", "geoLocation", "<init>", "(Lcom/huami/ai/speech/alexa/AlexaWebApi;Lcom/google/gson/Gson;Lcom/huami/ai/speech/alexa/GeoLocation;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechRecognizerEventImpl implements SpeechRecognizerEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Gson gson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GeoLocation geoLocation;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    public SpeechRecognizerEventImpl(@NotNull AlexaWebApi alexaWebApi, @NotNull Gson gson, @NotNull GeoLocation geoLocation) {
        this.webApi = alexaWebApi;
        this.gson = gson;
        this.geoLocation = geoLocation;
    }

    @Override // com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerEvent
    public void expectSpeechTimedOut() {
        AlexaWebApi alexaWebApi = this.webApi;
        EventEntity.Companion companion = EventEntity.INSTANCE;
        AlexaWebApiKt.events(alexaWebApi, (EventEntityWrapper<Payload>) new EventEntityWrapper(new EventEntity(Header.INSTANCE.withMessage(AVSAPIConstants.SpeechRecognizer.Events.ExpectSpeechTimedOut.NAME, "SpeechRecognizer"), new EmptyPayload())), this.gson);
    }

    @Override // com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerEvent
    @NotNull
    public MultipartResponse recognize(@NotNull RecognizePayload payload, @NotNull RequestBody audioBody) {
        AlexaEntity alexaEntity = new AlexaEntity(new ArrayList(), new EventEntity(Header.INSTANCE.withDialog(AVSAPIConstants.SpeechRecognizer.Events.Recognize.NAME, "SpeechRecognizer"), payload));
        AlexaEntityKtxKt.speechRecognizerContext$default(alexaEntity, null, 1, null);
        AlexaEntityKtxKt.speechSynthesizerContext$default(alexaEntity, 0, null, 3, null);
        AlexaEntityKtxKt.alertsContext$default(alexaEntity, null, null, 3, null);
        AlexaEntityKtxKt.speakerContext$default(alexaEntity, 0, false, 3, null);
        String json = this.gson.toJson(alexaEntity);
        HMLog.debug("speech", new a(json));
        return AlexaWebApiKt.events(this.webApi, json, audioBody).getMultipartResponse();
    }
}
