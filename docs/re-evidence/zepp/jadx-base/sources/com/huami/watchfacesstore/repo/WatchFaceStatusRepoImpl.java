package com.huami.watchfacesstore.repo;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\rR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepoImpl;", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "Lkotlinx/coroutines/flow/Flow;", "", "observerPurchased", "id", "", "notifyPurchased", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "observerUpdate", "notifyUpdate", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "a", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "purchasedFlow", "b", "updateFlow", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceStatusRepoImpl implements WatchFaceStatusRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Integer> purchasedFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<List<Integer>> updateFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @Override // com.huami.watchfacesstore.repo.WatchFaceStatusRepo
    @Nullable
    public Object notifyPurchased(int i, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = this.purchasedFlow.emit(Boxing.boxInt(i), continuation);
        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceStatusRepo
    @Nullable
    public Object notifyUpdate(int i, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = this.updateFlow.emit(e.listOf(Boxing.boxInt(i)), continuation);
        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceStatusRepo
    @NotNull
    public Flow<Integer> observerPurchased() {
        return this.purchasedFlow;
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceStatusRepo
    @NotNull
    public Flow<List<Integer>> observerUpdate() {
        return this.updateFlow;
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceStatusRepo
    @Nullable
    public Object notifyUpdate(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = this.updateFlow.emit(list, continuation);
        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
