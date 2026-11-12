package com.huami.ai.speech.alexa.capability.alerts;

import com.huami.ai.speech.alexa.capability.DirectiveApi;
import com.huami.ai.speech.alexa.entity.payload.SetAlertPayload;
import com.huami.ai.speech.alexa.entity.payload.TokenPayload;
import com.huami.ai.speech.alexa.entity.payload.TokensPayload;
import com.huami.ai.speech.alexa.entity.payload.VolumePayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/alerts/AlertsDirective;", "Lcom/huami/ai/speech/alexa/capability/DirectiveApi;", "Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;", "payload", "", "setAlert", "(Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/TokenPayload;", "deleteAlert", "(Lcom/huami/ai/speech/alexa/entity/payload/TokenPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;", "deleteAlerts", "(Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;", "", "setVolume", "(Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adjustVolume", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AlertsDirective extends DirectiveApi {
    @Nullable
    Object adjustVolume(@NotNull VolumePayload volumePayload, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteAlert(@NotNull TokenPayload tokenPayload, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteAlerts(@NotNull TokensPayload tokensPayload, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setAlert(@NotNull SetAlertPayload setAlertPayload, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setVolume(@NotNull VolumePayload volumePayload, @NotNull Continuation<? super Unit> continuation);
}
