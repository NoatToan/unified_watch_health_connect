package com.huami.ai.speech.alexa;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/huami/ai/speech/alexa/DataDistributor;", "", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "data", "", "deliver", "(Lcom/huami/ai/speech/alexa/MultipartResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface DataDistributor {
    @Nullable
    Object deliver(@NotNull MultipartResponse multipartResponse, @NotNull Continuation<? super Unit> continuation);
}
