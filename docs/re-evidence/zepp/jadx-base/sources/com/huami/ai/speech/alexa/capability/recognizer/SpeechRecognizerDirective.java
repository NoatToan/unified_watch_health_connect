package com.huami.ai.speech.alexa.capability.recognizer;

import com.huami.ai.speech.alexa.capability.DirectiveApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0013\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerDirective;", "Lcom/huami/ai/speech/alexa/capability/DirectiveApi;", "", "stopCapture", "expectSpeech", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface SpeechRecognizerDirective extends DirectiveApi {
    @Nullable
    Object expectSpeech(@NotNull Continuation<? super Unit> continuation);

    void stopCapture();
}
