package com.huami.ai.speech.alexa.capability.recognizer;

import com.huami.ai.speech.alexa.entity.payload.Initiator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "", "Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "getInitiator", "initiator", "", "setInitiator", "a", "Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "expectSpeechInitiator", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class InitiatorWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Initiator expectSpeechInitiator;

    @NotNull
    public final Initiator getInitiator() {
        Initiator initiator = this.expectSpeechInitiator;
        return initiator == null ? new Initiator(null, null, 3, null) : initiator;
    }

    public final void setInitiator(@Nullable Initiator initiator) {
        this.expectSpeechInitiator = initiator;
    }
}
