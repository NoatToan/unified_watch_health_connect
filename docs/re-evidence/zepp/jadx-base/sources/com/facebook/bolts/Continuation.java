package com.facebook.bolts;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001f\u0010\u0006\u001a\u0004\u0018\u00018\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/bolts/Continuation;", "TTaskResult", "TContinuationResult", "", "Lcom/facebook/bolts/Task;", "task", "then", "(Lcom/facebook/bolts/Task;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public interface Continuation<TTaskResult, TContinuationResult> {
    @Nullable
    TContinuationResult then(@NotNull Task<TTaskResult> task) throws Exception;
}
