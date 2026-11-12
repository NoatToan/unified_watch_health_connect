package com.huami.watchfacesstore.repo;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u0002H&J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "", "Lkotlinx/coroutines/flow/Flow;", "", "observerPurchased", "id", "", "notifyPurchased", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "observerUpdate", "notifyUpdate", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface WatchFaceStatusRepo {
    @Nullable
    Object notifyPurchased(int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object notifyUpdate(int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object notifyUpdate(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Flow<Integer> observerPurchased();

    @NotNull
    Flow<List<Integer>> observerUpdate();
}
