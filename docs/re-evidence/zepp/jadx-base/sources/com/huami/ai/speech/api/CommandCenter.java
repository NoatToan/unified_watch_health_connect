package com.huami.ai.speech.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/huami/ai/speech/api/CommandCenter;", "", "Lcom/huami/ai/speech/api/Content;", "content", "", "hasCommander", "(Lcom/huami/ai/speech/api/Content;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "direct", "speech-api_release"}, k = 1, mv = {1, 5, 1})
public interface CommandCenter {
    @Nullable
    Object direct(@NotNull Content content, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object hasCommander(@NotNull Content content, @NotNull Continuation<? super Boolean> continuation);
}
