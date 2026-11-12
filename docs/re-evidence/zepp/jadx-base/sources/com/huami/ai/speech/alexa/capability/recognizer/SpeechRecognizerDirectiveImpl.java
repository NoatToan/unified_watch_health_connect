package com.huami.ai.speech.alexa.capability.recognizer;

import com.huami.ai.notify.VoiceCaptureNotify;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerDirectiveImpl;", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerDirective;", "", "stopCapture", "expectSpeech", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "a", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "voiceCaptureNotify", "<init>", "(Lcom/huami/ai/notify/VoiceCaptureNotify;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechRecognizerDirectiveImpl implements SpeechRecognizerDirective {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceCaptureNotify voiceCaptureNotify;

    public SpeechRecognizerDirectiveImpl(@NotNull VoiceCaptureNotify voiceCaptureNotify) {
        this.voiceCaptureNotify = voiceCaptureNotify;
    }

    @Override // com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerDirective
    @Nullable
    public Object expectSpeech(@NotNull Continuation<? super Unit> continuation) {
        Object objExpectCapture = this.voiceCaptureNotify.expectCapture(continuation);
        return objExpectCapture == a.getCOROUTINE_SUSPENDED() ? objExpectCapture : Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerDirective
    public void stopCapture() {
        this.voiceCaptureNotify.stopCapture();
    }
}
