package com.huami.ai.speech.alexa.capability.synthesizer;

import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SpeakPayload;
import com.huami.ai.speech.api.Commander;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerCommander;", "Lcom/huami/ai/speech/api/Commander;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "content", "direct", "(Lcom/huami/ai/speech/alexa/entity/DirectiveContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerDirective;", "a", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerDirective;", "directive", "", "getType", "()Ljava/lang/String;", "type", "<init>", "(Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerDirective;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechSynthesizerCommander implements Commander<DirectiveContent<Payload>, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechSynthesizerDirective directive;

    public SpeechSynthesizerCommander(@NotNull SpeechSynthesizerDirective speechSynthesizerDirective) {
        this.directive = speechSynthesizerDirective;
    }

    @Override // com.huami.ai.speech.api.Commander
    @NotNull
    public String getType() {
        return AlexaCommander.SpeechSynthesizer.getNamespace();
    }

    @Override // com.huami.ai.speech.api.Commander
    @Nullable
    public Object direct(@NotNull DirectiveContent<Payload> directiveContent, @NotNull Continuation<? super Unit> continuation) {
        if (AlexaCommander.INSTANCE.from(directiveContent.getHeader().getNamespace()) != AlexaCommander.SpeechSynthesizer) {
            return Unit.INSTANCE;
        }
        this.directive.speak((SpeakPayload) directiveContent.getPayload());
        return Unit.INSTANCE;
    }
}
