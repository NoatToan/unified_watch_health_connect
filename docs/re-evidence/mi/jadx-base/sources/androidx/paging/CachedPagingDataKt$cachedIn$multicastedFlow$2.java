package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/paging/MulticastedPagingData;", "T", "", "prev", "next", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$2", f = "CachedPagingData.kt", i = {0}, l = {93}, m = "invokeSuspend", n = {"next"}, s = {"L$0"})
public final class CachedPagingDataKt$cachedIn$multicastedFlow$2<T> extends SuspendLambda implements Function3<MulticastedPagingData<T>, MulticastedPagingData<T>, Continuation<? super MulticastedPagingData<T>>, Object> {
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    int label;

    public CachedPagingDataKt$cachedIn$multicastedFlow$2(Continuation continuation) {
        super(3, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@NotNull MulticastedPagingData<T> prev, @NotNull MulticastedPagingData<T> next, @NotNull Continuation<? super MulticastedPagingData<T>> continuation) {
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        CachedPagingDataKt$cachedIn$multicastedFlow$2 cachedPagingDataKt$cachedIn$multicastedFlow$2 = new CachedPagingDataKt$cachedIn$multicastedFlow$2(continuation);
        cachedPagingDataKt$cachedIn$multicastedFlow$2.L$0 = prev;
        cachedPagingDataKt$cachedIn$multicastedFlow$2.L$1 = next;
        return cachedPagingDataKt$cachedIn$multicastedFlow$2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((CachedPagingDataKt$cachedIn$multicastedFlow$2) create((MulticastedPagingData) obj, (MulticastedPagingData) obj2, (Continuation) obj3)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$0;
            ResultKt.throwOnFailure(obj);
            return multicastedPagingData;
        }
        ResultKt.throwOnFailure(obj);
        MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
        MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.L$1;
        this.L$0 = multicastedPagingData3;
        this.label = 1;
        return multicastedPagingData2.close(this) == coroutine_suspended ? coroutine_suspended : multicastedPagingData3;
    }
}
