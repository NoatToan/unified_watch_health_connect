package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 implements FlowCollector<LoadStates> {
    final /* synthetic */ Ref.ObjectRef $prev$inlined;
    final /* synthetic */ PageFetcher.C12491.AnonymousClass2 this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\u0007"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcher.kt", i = {0, 0, 1, 1, 2, 2}, l = {135, 139, 143}, m = "emit", n = {"this", "it", "this", "it", "this", "it"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1(PageFetcher.C12491.AnonymousClass2 anonymousClass2, Ref.ObjectRef objectRef) {
        this.this$0 = anonymousClass2;
        this.$prev$inlined = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(LoadStates loadStates, @NotNull Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
        LoadStates loadStates2;
        LoadStates loadStates3;
        boolean z;
        LoadType loadType;
        PageFetcher.C12491.C00541 c00541;
        LoadState append;
        PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2;
        T t;
        LoadStates loadStates4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                LoadStates loadStates5 = (LoadStates) anonymousClass1.L$1;
                pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = (PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                loadStates2 = loadStates5;
            } else {
                if (i2 == 2) {
                    LoadStates loadStates6 = (LoadStates) anonymousClass1.L$1;
                    pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = (PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                    loadStates3 = loadStates6;
                    loadStates3 = loadStates2;
                    z = !Intrinsics.areEqual(((LoadStates) pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.$prev$inlined.element).getAppend(), loadStates3.getAppend());
                    t = loadStates3;
                    if (z) {
                        MutableLoadStateCollection mutableLoadStateCollection = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this$0.$loadStates;
                        loadType = LoadType.APPEND;
                        mutableLoadStateCollection.set(loadType, true, loadStates3.getAppend());
                        c00541 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this$0.$dispatchIfValid$1;
                        append = loadStates3.getAppend();
                        anonymousClass1.L$0 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
                        anonymousClass1.L$1 = loadStates3;
                        anonymousClass1.label = 3;
                        if (c00541.invoke(loadType, append, (Continuation<? super Unit>) anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
                        loadStates4 = loadStates3;
                    }
                    pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.$prev$inlined.element = t;
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LoadStates loadStates7 = (LoadStates) anonymousClass1.L$1;
                pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2 = (PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                loadStates4 = loadStates7;
            }
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2;
            t = loadStates4;
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.$prev$inlined.element = t;
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        LoadStates loadStates8 = loadStates;
        if (!Intrinsics.areEqual(((LoadStates) this.$prev$inlined.element).getRefresh(), loadStates8.getRefresh())) {
            MutableLoadStateCollection mutableLoadStateCollection2 = this.this$0.$loadStates;
            LoadType loadType2 = LoadType.REFRESH;
            mutableLoadStateCollection2.set(loadType2, true, loadStates8.getRefresh());
            PageFetcher.C12491.C00541 c00542 = this.this$0.$dispatchIfValid$1;
            LoadState refresh = loadStates8.getRefresh();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = loadStates8;
            anonymousClass1.label = 1;
            if (c00542.invoke(loadType2, refresh, (Continuation<? super Unit>) anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = this;
        loadStates2 = loadStates8;
        boolean z2 = !Intrinsics.areEqual(((LoadStates) pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.$prev$inlined.element).getPrepend(), loadStates2.getPrepend());
        loadStates3 = loadStates2;
        if (z2) {
            MutableLoadStateCollection mutableLoadStateCollection3 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this$0.$loadStates;
            LoadType loadType3 = LoadType.PREPEND;
            mutableLoadStateCollection3.set(loadType3, true, loadStates2.getPrepend());
            PageFetcher.C12491.C00541 c00543 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this$0.$dispatchIfValid$1;
            LoadState prepend = loadStates2.getPrepend();
            anonymousClass1.L$0 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
            anonymousClass1.L$1 = loadStates2;
            anonymousClass1.label = 2;
            if (c00543.invoke(loadType3, prepend, (Continuation<? super Unit>) anonymousClass1) == coroutine_suspended) {
                loadStates3 = loadStates2;
                return coroutine_suspended;
            }
        }
        loadStates3 = loadStates2;
        z = !Intrinsics.areEqual(((LoadStates) pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.$prev$inlined.element).getAppend(), loadStates3.getAppend());
        t = loadStates3;
        if (z) {
            MutableLoadStateCollection mutableLoadStateCollection4 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this$0.$loadStates;
            loadType = LoadType.APPEND;
            mutableLoadStateCollection4.set(loadType, true, loadStates3.getAppend());
            c00541 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.this$0.$dispatchIfValid$1;
            append = loadStates3.getAppend();
            anonymousClass1.L$0 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
            anonymousClass1.L$1 = loadStates3;
            anonymousClass1.label = 3;
            if (c00541.invoke(loadType, append, (Continuation<? super Unit>) anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1;
            loadStates4 = loadStates3;
            pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$2;
            t = loadStates4;
        }
        pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.$prev$inlined.element = t;
        return Unit.INSTANCE;
    }
}
