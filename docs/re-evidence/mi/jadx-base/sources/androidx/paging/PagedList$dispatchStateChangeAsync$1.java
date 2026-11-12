package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PagedList$dispatchStateChangeAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoadState $state;
    final /* synthetic */ LoadType $type;
    int label;
    final /* synthetic */ PagedList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedList$dispatchStateChangeAsync$1(PagedList pagedList, LoadType loadType, LoadState loadState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pagedList;
        this.$type = loadType;
        this.$state = loadState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new PagedList$dispatchStateChangeAsync$1(this.this$0, this.$type, this.$state, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PagedList$dispatchStateChangeAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CollectionsKt__MutableCollectionsKt.removeAll(this.this$0.loadStateListeners, (Function1) new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList$dispatchStateChangeAsync$1.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>> weakReference) {
                return Boolean.valueOf(invoke2((WeakReference<Function2<LoadType, LoadState, Unit>>) weakReference));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull WeakReference<Function2<LoadType, LoadState, Unit>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.get() == null;
            }
        });
        Iterator it = this.this$0.loadStateListeners.iterator();
        while (it.hasNext()) {
            Function2 function2 = (Function2) ((WeakReference) it.next()).get();
            if (function2 != null) {
            }
        }
        return Unit.INSTANCE;
    }
}
