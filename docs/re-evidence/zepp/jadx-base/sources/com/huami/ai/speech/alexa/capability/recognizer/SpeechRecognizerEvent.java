package com.huami.ai.speech.alexa.capability.recognizer;

import com.huami.ai.speech.alexa.MultipartResponse;
import com.huami.ai.speech.alexa.capability.EventApi;
import com.huami.ai.speech.alexa.entity.payload.RecognizePayload;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;", "Lcom/huami/ai/speech/alexa/capability/EventApi;", "Lcom/huami/ai/speech/alexa/entity/payload/RecognizePayload;", "payload", "Lokhttp3/RequestBody;", "audioBody", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "recognize", "", "expectSpeechTimedOut", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface SpeechRecognizerEvent extends EventApi {
    void expectSpeechTimedOut();

    @NotNull
    MultipartResponse recognize(@NotNull RecognizePayload payload, @NotNull RequestBody audioBody);
}
