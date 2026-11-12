package androidx.paging;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 implements FlowCollector<Unit> {
    final /* synthetic */ CoroutineScope $this_launch$inlined;
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4 this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\u0007"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 13, 14, 14, 15, 15, 15}, l = {140, 162, 155, 180, 170, SportReportBaseParser.ReportType.oxygenPartialPressureThreshold, 214, 155, 226, 170, 238, VibrateModeSetViewModel.DEFAULT_BBJI, 155, 263, 170, 275}, m = "emit", n = {"this", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "this", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "this", "this_$iv", "$this$withLock$iv$iv", "this_$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "$this$withLock$iv$iv", "this", "loadType", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "this", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
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
            return PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4 anonymousClass4, CoroutineScope coroutineScope) {
        this.this$0 = anonymousClass4;
        this.$this_launch$inlined = coroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x033b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x033c  */
    /* JADX WARN: Code duplicated, block: B:108:0x034a  */
    /* JADX WARN: Code duplicated, block: B:111:0x035d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0383 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0384  */
    /* JADX WARN: Code duplicated, block: B:120:0x039f  */
    /* JADX WARN: Code duplicated, block: B:123:0x03ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0409 A[PHI: r5 r12
      0x0409: PHI (r5v49 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) = 
      (r5v23 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
      (r5v50 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
     binds: [B:91:0x02ef, B:134:0x0402] A[DONT_GENERATE, DONT_INLINE]
      0x0409: PHI (r12v59 androidx.paging.LoadStates) = (r12v33 androidx.paging.LoadStates), (r12v67 androidx.paging.LoadStates) binds: [B:91:0x02ef, B:134:0x0402] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x0415  */
    /* JADX WARN: Code duplicated, block: B:143:0x0419  */
    /* JADX WARN: Code duplicated, block: B:145:0x0439 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x0456 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x0457  */
    /* JADX WARN: Code duplicated, block: B:155:0x0463  */
    /* JADX WARN: Code duplicated, block: B:158:0x0475  */
    /* JADX WARN: Code duplicated, block: B:160:0x0499 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x049a  */
    /* JADX WARN: Code duplicated, block: B:167:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:170:0x04d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:174:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:176:0x04f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:177:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:181:0x050d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0219  */
    /* JADX WARN: Code duplicated, block: B:60:0x022a  */
    /* JADX WARN: Code duplicated, block: B:63:0x023e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0263 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0264  */
    /* JADX WARN: Code duplicated, block: B:72:0x027f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0299 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x029a  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x02bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x02e7 A[PHI: r5 r12
      0x02e7: PHI (r5v23 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) = 
      (r5v1 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
      (r5v25 androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1)
     binds: [B:58:0x0226, B:86:0x02e0] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r12v33 androidx.paging.LoadStates) = (r12v11 androidx.paging.LoadStates), (r12v34 androidx.paging.LoadStates) binds: [B:58:0x0226, B:86:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0318 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0319  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v79, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v48, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Unit unit, @NotNull Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        PageFetcherSnapshotState.Holder holder;
        Mutex mutex;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
        LoadStates loadStates;
        PagingState pagingState;
        RemoteMediatorConnection remoteMediatorConnection;
        LoadType loadType;
        LoadType loadType2;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
        LoadType loadType3;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3;
        LoadStates loadStates2;
        PageFetcherSnapshot pageFetcherSnapshot;
        ViewportHint viewportHint;
        LoadStates loadStates3;
        LoadType loadType4;
        PageFetcherSnapshotState.Holder holder2;
        Mutex mutex2;
        LoadType loadType5;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
        PageFetcherSnapshotState.Holder holder3;
        Mutex mutex3;
        LoadType loadType6;
        LoadType loadType7;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
        PageFetcherSnapshotState.Holder holder4;
        Mutex mutex4;
        PageFetcherSnapshotState.Holder holder5;
        Mutex mutex5;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
        LoadState loadState;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        PageFetcherSnapshot pageFetcherSnapshot2;
        LoadType loadType8;
        LoadStates loadStates4;
        PageFetcherSnapshot pageFetcherSnapshot3;
        ViewportHint viewportHint2;
        LoadStates loadStates5;
        LoadType loadType9;
        PageFetcherSnapshotState.Holder holder6;
        Mutex mutex6;
        LoadType loadType10;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
        PageFetcherSnapshotState.Holder holder7;
        Mutex mutex7;
        LoadType loadType11;
        LoadType loadType12;
        PageFetcherSnapshotState.Holder holder8;
        Mutex mutex8;
        LoadState loadState2;
        Mutex mutex9;
        PageFetcherSnapshotState pageFetcherSnapshotState2;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
        PageFetcherSnapshot pageFetcherSnapshot5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        LoadType loadType13;
        LoadType loadType14;
        ViewportHint viewportHint3;
        PageFetcherSnapshotState.Holder holder9;
        Mutex mutex10;
        LoadType loadType15;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
        PageFetcherSnapshotState.Holder holder10;
        Mutex mutex11;
        PageFetcherSnapshotState.Holder holder11;
        Mutex mutex12;
        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10;
        LoadState loadState3;
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
        ?? r2 = anonymousClass1.label;
        try {
            try {
                try {
                    switch (r2) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            holder = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                            mutex = holder.lock;
                            anonymousClass1.L$0 = this;
                            anonymousClass1.L$1 = holder;
                            anonymousClass1.L$2 = mutex;
                            anonymousClass1.label = 1;
                            if (mutex.lock(null, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = this;
                            try {
                                PageFetcherSnapshotState pageFetcherSnapshotState3 = holder.state;
                                Pair pair = TuplesKt.to(pageFetcherSnapshotState3.getSourceLoadStates(), pageFetcherSnapshotState3.currentPagingState$paging_common(PageFetcherSnapshot$pageEventFlow$1.this.this$0.lastHint));
                                mutex.unlock(null);
                                loadStates = (LoadStates) pair.component1();
                                pagingState = (PagingState) pair.component2();
                                remoteMediatorConnection = PageFetcherSnapshot$pageEventFlow$1.this.this$0.getRemoteMediatorConnection();
                                if (remoteMediatorConnection != null) {
                                    remoteMediatorConnection.retryFailed(pagingState);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                loadType = LoadType.REFRESH;
                                if (!(loadStates.getRefresh() instanceof LoadState.Error)) {
                                    loadType6 = LoadType.PREPEND;
                                    if (loadStates.getPrepend() instanceof LoadState.Error) {
                                        if (loadType6 != LoadType.REFRESH) {
                                            holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                            mutex4 = holder4.lock;
                                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                            anonymousClass1.L$1 = loadType6;
                                            anonymousClass1.L$2 = holder4;
                                            anonymousClass1.L$3 = mutex4;
                                            anonymousClass1.L$4 = loadStates;
                                            anonymousClass1.label = 7;
                                            if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$11 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                            holder5 = holder4;
                                            mutex5 = mutex4;
                                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$11;
                                            pageFetcherSnapshotState = holder5.state;
                                            pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                            anonymousClass1.L$1 = loadType6;
                                            anonymousClass1.L$2 = mutex5;
                                            anonymousClass1.L$3 = loadStates;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.label = 8;
                                            if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType8 = loadType6;
                                            r2 = mutex5;
                                            Unit unit3 = Unit.INSTANCE;
                                            r2.unlock(null);
                                            loadType7 = loadType8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                        } else {
                                            loadType7 = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        }
                                        loadStates4 = loadStates;
                                        pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                            holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                            mutex6 = holder6.lock;
                                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                            anonymousClass1.L$1 = loadType7;
                                            anonymousClass1.L$2 = holder6;
                                            anonymousClass1.L$3 = mutex6;
                                            anonymousClass1.L$4 = loadStates4;
                                            anonymousClass1.L$5 = loadType7;
                                            anonymousClass1.L$6 = pageFetcherSnapshot3;
                                            anonymousClass1.label = 9;
                                            if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            loadType10 = loadType7;
                                            try {
                                                viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                                mutex6.unlock(null);
                                                loadStates5 = loadStates4;
                                                loadType9 = loadType7;
                                                loadType7 = loadType10;
                                            } catch (Throwable th) {
                                                mutex6.unlock(null);
                                                throw th;
                                            }
                                        } else {
                                            viewportHint2 = null;
                                            loadStates5 = loadStates4;
                                            loadType9 = loadType7;
                                        }
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        anonymousClass1.L$1 = loadType7;
                                        anonymousClass1.L$2 = loadStates5;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.L$4 = null;
                                        anonymousClass1.L$5 = null;
                                        anonymousClass1.L$6 = null;
                                        anonymousClass1.label = 10;
                                        if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadStates = loadStates5;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        if (loadType7 == LoadType.REFRESH) {
                                            holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                            mutex7 = holder7.lock;
                                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                            anonymousClass1.L$1 = holder7;
                                            anonymousClass1.L$2 = mutex7;
                                            anonymousClass1.L$3 = loadStates;
                                            anonymousClass1.label = 11;
                                            if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            try {
                                                loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(loadState2 instanceof LoadState.Error)) {
                                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                                }
                                            } catch (Throwable th2) {
                                                mutex7.unlock(null);
                                                throw th2;
                                            }
                                        }
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    }
                                    return Unit.INSTANCE;
                                }
                                loadType2 = loadType;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                loadStates2 = loadStates;
                                pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] != 1) {
                                    holder2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex2 = holder2.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                    anonymousClass1.L$1 = loadType2;
                                    anonymousClass1.L$2 = holder2;
                                    anonymousClass1.L$3 = mutex2;
                                    anonymousClass1.L$4 = loadStates2;
                                    anonymousClass1.L$5 = loadType2;
                                    anonymousClass1.L$6 = pageFetcherSnapshot;
                                    anonymousClass1.label = 4;
                                    if (mutex2.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType5 = loadType2;
                                    try {
                                        viewportHint = holder2.state.getFailedHintsByLoadType$paging_common().get(loadType5);
                                        mutex2.unlock(null);
                                        loadStates3 = loadStates2;
                                        loadType4 = loadType2;
                                        loadType2 = loadType5;
                                    } catch (Throwable th3) {
                                        mutex2.unlock(null);
                                        throw th3;
                                    }
                                } else {
                                    viewportHint = null;
                                    loadStates3 = loadStates2;
                                    loadType4 = loadType2;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.L$1 = loadType2;
                                anonymousClass1.L$2 = loadStates3;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 5;
                                if (pageFetcherSnapshot.retryLoadError(loadType4, viewportHint, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates3;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                if (loadType2 == LoadType.REFRESH) {
                                    holder3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex3 = holder3.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                    anonymousClass1.L$1 = holder3;
                                    anonymousClass1.L$2 = mutex3;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 6;
                                    if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    try {
                                        loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(loadState instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                                        }
                                    } catch (Throwable th4) {
                                        mutex3.unlock(null);
                                        throw th4;
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                loadType6 = LoadType.PREPEND;
                                if (loadStates.getPrepend() instanceof LoadState.Error) {
                                    if (loadType6 != LoadType.REFRESH) {
                                        holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex4 = holder4.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType6;
                                        anonymousClass1.L$2 = holder4;
                                        anonymousClass1.L$3 = mutex4;
                                        anonymousClass1.L$4 = loadStates;
                                        anonymousClass1.label = 7;
                                        if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$12 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        holder5 = holder4;
                                        mutex5 = mutex4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$12;
                                        pageFetcherSnapshotState = holder5.state;
                                        pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                        anonymousClass1.L$1 = loadType6;
                                        anonymousClass1.L$2 = mutex5;
                                        anonymousClass1.L$3 = loadStates;
                                        anonymousClass1.L$4 = null;
                                        anonymousClass1.label = 8;
                                        if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType8 = loadType6;
                                        r2 = mutex5;
                                        Unit unit4 = Unit.INSTANCE;
                                        r2.unlock(null);
                                        loadType7 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    } else {
                                        loadType7 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    }
                                    loadStates4 = loadStates;
                                    pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                        holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex6 = holder6.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        anonymousClass1.L$1 = loadType7;
                                        anonymousClass1.L$2 = holder6;
                                        anonymousClass1.L$3 = mutex6;
                                        anonymousClass1.L$4 = loadStates4;
                                        anonymousClass1.L$5 = loadType7;
                                        anonymousClass1.L$6 = pageFetcherSnapshot3;
                                        anonymousClass1.label = 9;
                                        if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType10 = loadType7;
                                        viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                        mutex6.unlock(null);
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                        loadType7 = loadType10;
                                    } else {
                                        viewportHint2 = null;
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = loadStates5;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.L$6 = null;
                                    anonymousClass1.label = 10;
                                    if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadStates = loadStates5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    if (loadType7 == LoadType.REFRESH) {
                                        holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex7 = holder7.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                        anonymousClass1.L$1 = holder7;
                                        anonymousClass1.L$2 = mutex7;
                                        anonymousClass1.L$3 = loadStates;
                                        anonymousClass1.label = 11;
                                        if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(loadState2 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                        }
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                }
                                return Unit.INSTANCE;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit5 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        try {
                                            ViewportHint viewportHint4 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                            mutex10.unlock(null);
                                            loadType14 = loadType12;
                                            viewportHint3 = viewportHint4;
                                            pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                            loadType13 = loadType15;
                                        } catch (Throwable th5) {
                                            mutex10.unlock(null);
                                            throw th5;
                                        }
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        try {
                                            loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                            mutex12.unlock(null);
                                            if (!(loadState3 instanceof LoadState.Error)) {
                                                PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                            }
                                        } catch (Throwable th6) {
                                            mutex12.unlock(null);
                                            throw th6;
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th7) {
                                mutex.unlock(null);
                                throw th7;
                            }
                        case 1:
                            mutex = (Mutex) anonymousClass1.L$2;
                            holder = (PageFetcherSnapshotState.Holder) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            PageFetcherSnapshotState pageFetcherSnapshotState4 = holder.state;
                            Pair pair2 = TuplesKt.to(pageFetcherSnapshotState4.getSourceLoadStates(), pageFetcherSnapshotState4.currentPagingState$paging_common(PageFetcherSnapshot$pageEventFlow$1.this.this$0.lastHint));
                            mutex.unlock(null);
                            loadStates = (LoadStates) pair2.component1();
                            pagingState = (PagingState) pair2.component2();
                            remoteMediatorConnection = PageFetcherSnapshot$pageEventFlow$1.this.this$0.getRemoteMediatorConnection();
                            if (remoteMediatorConnection != null) {
                                remoteMediatorConnection.retryFailed(pagingState);
                                Unit unit6 = Unit.INSTANCE;
                            }
                            loadType = LoadType.REFRESH;
                            if (!(loadStates.getRefresh() instanceof LoadState.Error)) {
                                loadType6 = LoadType.PREPEND;
                                if (loadStates.getPrepend() instanceof LoadState.Error) {
                                    if (loadType6 != LoadType.REFRESH) {
                                        holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex4 = holder4.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType6;
                                        anonymousClass1.L$2 = holder4;
                                        anonymousClass1.L$3 = mutex4;
                                        anonymousClass1.L$4 = loadStates;
                                        anonymousClass1.label = 7;
                                        if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$13 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        holder5 = holder4;
                                        mutex5 = mutex4;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$13;
                                        pageFetcherSnapshotState = holder5.state;
                                        pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                        anonymousClass1.L$1 = loadType6;
                                        anonymousClass1.L$2 = mutex5;
                                        anonymousClass1.L$3 = loadStates;
                                        anonymousClass1.L$4 = null;
                                        anonymousClass1.label = 8;
                                        if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType8 = loadType6;
                                        r2 = mutex5;
                                        Unit unit7 = Unit.INSTANCE;
                                        r2.unlock(null);
                                        loadType7 = loadType8;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    } else {
                                        loadType7 = loadType6;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    }
                                    loadStates4 = loadStates;
                                    pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                        holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex6 = holder6.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                        anonymousClass1.L$1 = loadType7;
                                        anonymousClass1.L$2 = holder6;
                                        anonymousClass1.L$3 = mutex6;
                                        anonymousClass1.L$4 = loadStates4;
                                        anonymousClass1.L$5 = loadType7;
                                        anonymousClass1.L$6 = pageFetcherSnapshot3;
                                        anonymousClass1.label = 9;
                                        if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType10 = loadType7;
                                        viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                        mutex6.unlock(null);
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                        loadType7 = loadType10;
                                    } else {
                                        viewportHint2 = null;
                                        loadStates5 = loadStates4;
                                        loadType9 = loadType7;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = loadStates5;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.L$6 = null;
                                    anonymousClass1.label = 10;
                                    if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadStates = loadStates5;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    if (loadType7 == LoadType.REFRESH) {
                                        holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex7 = holder7.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                        anonymousClass1.L$1 = holder7;
                                        anonymousClass1.L$2 = mutex7;
                                        anonymousClass1.L$3 = loadStates;
                                        anonymousClass1.label = 11;
                                        if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex7.unlock(null);
                                        if (!(loadState2 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                        }
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                }
                                return Unit.INSTANCE;
                            }
                            loadType2 = loadType;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            loadStates2 = loadStates;
                            pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] != 1) {
                                holder2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex2 = holder2.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.L$1 = loadType2;
                                anonymousClass1.L$2 = holder2;
                                anonymousClass1.L$3 = mutex2;
                                anonymousClass1.L$4 = loadStates2;
                                anonymousClass1.L$5 = loadType2;
                                anonymousClass1.L$6 = pageFetcherSnapshot;
                                anonymousClass1.label = 4;
                                if (mutex2.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType5 = loadType2;
                                viewportHint = holder2.state.getFailedHintsByLoadType$paging_common().get(loadType5);
                                mutex2.unlock(null);
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                                loadType2 = loadType5;
                            } else {
                                viewportHint = null;
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.L$1 = loadType2;
                            anonymousClass1.L$2 = loadStates3;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 5;
                            if (pageFetcherSnapshot.retryLoadError(loadType4, viewportHint, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex3 = holder3.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.L$1 = holder3;
                                anonymousClass1.L$2 = mutex3;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 6;
                                if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex3.unlock(null);
                                if (!(loadState instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex4 = holder4.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = holder4;
                                    anonymousClass1.L$3 = mutex4;
                                    anonymousClass1.L$4 = loadStates;
                                    anonymousClass1.label = 7;
                                    if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$14 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    mutex5 = mutex4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$14;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = mutex5;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType8 = loadType6;
                                    r2 = mutex5;
                                    Unit unit8 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex6 = holder6.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = holder6;
                                    anonymousClass1.L$3 = mutex6;
                                    anonymousClass1.L$4 = loadStates4;
                                    anonymousClass1.L$5 = loadType7;
                                    anonymousClass1.L$6 = pageFetcherSnapshot3;
                                    anonymousClass1.label = 9;
                                    if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType10 = loadType7;
                                    viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                    mutex6.unlock(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    viewportHint2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = loadStates5;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 10;
                                if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex7 = holder7.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.L$1 = holder7;
                                    anonymousClass1.L$2 = mutex7;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 11;
                                    if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(loadState2 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            }
                            return Unit.INSTANCE;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex8 = holder8.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = holder8;
                                    anonymousClass1.L$3 = mutex8;
                                    anonymousClass1.label = 12;
                                    if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                        mutex9 = mutex8;
                                        return coroutine_suspended;
                                    }
                                    mutex9 = mutex8;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = mutex9;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.label = 13;
                                    if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    unit = mutex9;
                                    Unit unit9 = Unit.INSTANCE;
                                    unit.unlock(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex10 = holder9.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType12;
                                    anonymousClass1.L$2 = holder9;
                                    anonymousClass1.L$3 = mutex10;
                                    anonymousClass1.L$4 = loadType12;
                                    anonymousClass1.L$5 = pageFetcherSnapshot5;
                                    anonymousClass1.label = 14;
                                    if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType12;
                                    ViewportHint viewportHint5 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                    mutex10.unlock(null);
                                    loadType14 = loadType12;
                                    viewportHint3 = viewportHint5;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    viewportHint3 = null;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType13;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.label = 15;
                                if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex11 = holder10.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.L$1 = holder10;
                                    anonymousClass1.L$2 = mutex11;
                                    anonymousClass1.label = 16;
                                    if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    holder11 = holder10;
                                    mutex12 = mutex11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(loadState3 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 2:
                            loadStates = (LoadStates) anonymousClass1.L$4;
                            Mutex mutex13 = (Mutex) anonymousClass1.L$3;
                            PageFetcherSnapshotState.Holder holder12 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$2;
                            LoadType loadType16 = (LoadType) anonymousClass1.L$1;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$15 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            PageFetcherSnapshotState pageFetcherSnapshotState5 = holder12.state;
                            PageFetcherSnapshot pageFetcherSnapshot7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$15;
                            anonymousClass1.L$1 = loadType16;
                            anonymousClass1.L$2 = mutex13;
                            anonymousClass1.L$3 = loadStates;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.label = 3;
                            if (pageFetcherSnapshot7.setLoading(pageFetcherSnapshotState5, loadType16, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadType3 = loadType16;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$15;
                            r2 = mutex13;
                            Unit unit10 = Unit.INSTANCE;
                            r2.unlock(null);
                            loadType2 = loadType3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3;
                            loadStates2 = loadStates;
                            pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] != 1) {
                                holder2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex2 = holder2.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.L$1 = loadType2;
                                anonymousClass1.L$2 = holder2;
                                anonymousClass1.L$3 = mutex2;
                                anonymousClass1.L$4 = loadStates2;
                                anonymousClass1.L$5 = loadType2;
                                anonymousClass1.L$6 = pageFetcherSnapshot;
                                anonymousClass1.label = 4;
                                if (mutex2.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType5 = loadType2;
                                viewportHint = holder2.state.getFailedHintsByLoadType$paging_common().get(loadType5);
                                mutex2.unlock(null);
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                                loadType2 = loadType5;
                            } else {
                                viewportHint = null;
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.L$1 = loadType2;
                            anonymousClass1.L$2 = loadStates3;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 5;
                            if (pageFetcherSnapshot.retryLoadError(loadType4, viewportHint, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex3 = holder3.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.L$1 = holder3;
                                anonymousClass1.L$2 = mutex3;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 6;
                                if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex3.unlock(null);
                                if (!(loadState instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex4 = holder4.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = holder4;
                                    anonymousClass1.L$3 = mutex4;
                                    anonymousClass1.L$4 = loadStates;
                                    anonymousClass1.label = 7;
                                    if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$16 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    mutex5 = mutex4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$16;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = mutex5;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType8 = loadType6;
                                    r2 = mutex5;
                                    Unit unit11 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex6 = holder6.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = holder6;
                                    anonymousClass1.L$3 = mutex6;
                                    anonymousClass1.L$4 = loadStates4;
                                    anonymousClass1.L$5 = loadType7;
                                    anonymousClass1.L$6 = pageFetcherSnapshot3;
                                    anonymousClass1.label = 9;
                                    if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType10 = loadType7;
                                    viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                    mutex6.unlock(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    viewportHint2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = loadStates5;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 10;
                                if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex7 = holder7.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.L$1 = holder7;
                                    anonymousClass1.L$2 = mutex7;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 11;
                                    if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(loadState2 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit12 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint6 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint6;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit13 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint7 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint7;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 3:
                            loadStates = (LoadStates) anonymousClass1.L$3;
                            Mutex mutex14 = (Mutex) anonymousClass1.L$2;
                            loadType3 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            r2 = mutex14;
                            Unit unit14 = Unit.INSTANCE;
                            r2.unlock(null);
                            loadType2 = loadType3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$3;
                            loadStates2 = loadStates;
                            pageFetcherSnapshot = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] != 1) {
                                holder2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex2 = holder2.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                                anonymousClass1.L$1 = loadType2;
                                anonymousClass1.L$2 = holder2;
                                anonymousClass1.L$3 = mutex2;
                                anonymousClass1.L$4 = loadStates2;
                                anonymousClass1.L$5 = loadType2;
                                anonymousClass1.L$6 = pageFetcherSnapshot;
                                anonymousClass1.label = 4;
                                if (mutex2.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType5 = loadType2;
                                viewportHint = holder2.state.getFailedHintsByLoadType$paging_common().get(loadType5);
                                mutex2.unlock(null);
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                                loadType2 = loadType5;
                            } else {
                                viewportHint = null;
                                loadStates3 = loadStates2;
                                loadType4 = loadType2;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.L$1 = loadType2;
                            anonymousClass1.L$2 = loadStates3;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 5;
                            if (pageFetcherSnapshot.retryLoadError(loadType4, viewportHint, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex3 = holder3.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.L$1 = holder3;
                                anonymousClass1.L$2 = mutex3;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 6;
                                if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex3.unlock(null);
                                if (!(loadState instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex4 = holder4.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = holder4;
                                    anonymousClass1.L$3 = mutex4;
                                    anonymousClass1.L$4 = loadStates;
                                    anonymousClass1.label = 7;
                                    if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$17 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    mutex5 = mutex4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$17;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = mutex5;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType8 = loadType6;
                                    r2 = mutex5;
                                    Unit unit15 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex6 = holder6.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = holder6;
                                    anonymousClass1.L$3 = mutex6;
                                    anonymousClass1.L$4 = loadStates4;
                                    anonymousClass1.L$5 = loadType7;
                                    anonymousClass1.L$6 = pageFetcherSnapshot3;
                                    anonymousClass1.label = 9;
                                    if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType10 = loadType7;
                                    viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                    mutex6.unlock(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    viewportHint2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = loadStates5;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 10;
                                if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex7 = holder7.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.L$1 = holder7;
                                    anonymousClass1.L$2 = mutex7;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 11;
                                    if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(loadState2 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit16 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint8 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint8;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit17 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint9 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint9;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 4:
                            pageFetcherSnapshot = (PageFetcherSnapshot) anonymousClass1.L$6;
                            loadType2 = (LoadType) anonymousClass1.L$5;
                            loadStates2 = (LoadStates) anonymousClass1.L$4;
                            mutex2 = (Mutex) anonymousClass1.L$3;
                            holder2 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$2;
                            loadType5 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            viewportHint = holder2.state.getFailedHintsByLoadType$paging_common().get(loadType5);
                            mutex2.unlock(null);
                            loadStates3 = loadStates2;
                            loadType4 = loadType2;
                            loadType2 = loadType5;
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            anonymousClass1.L$1 = loadType2;
                            anonymousClass1.L$2 = loadStates3;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 5;
                            if (pageFetcherSnapshot.retryLoadError(loadType4, viewportHint, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates3;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$2;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex3 = holder3.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.L$1 = holder3;
                                anonymousClass1.L$2 = mutex3;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 6;
                                if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex3.unlock(null);
                                if (!(loadState instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex4 = holder4.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = holder4;
                                    anonymousClass1.L$3 = mutex4;
                                    anonymousClass1.L$4 = loadStates;
                                    anonymousClass1.label = 7;
                                    if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$18 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    mutex5 = mutex4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$18;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = mutex5;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType8 = loadType6;
                                    r2 = mutex5;
                                    Unit unit18 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex6 = holder6.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = holder6;
                                    anonymousClass1.L$3 = mutex6;
                                    anonymousClass1.L$4 = loadStates4;
                                    anonymousClass1.L$5 = loadType7;
                                    anonymousClass1.L$6 = pageFetcherSnapshot3;
                                    anonymousClass1.label = 9;
                                    if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType10 = loadType7;
                                    viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                    mutex6.unlock(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    viewportHint2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = loadStates5;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 10;
                                if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex7 = holder7.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.L$1 = holder7;
                                    anonymousClass1.L$2 = mutex7;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 11;
                                    if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(loadState2 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit19 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint10 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint10;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit110 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint11 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint11;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 5:
                            loadStates = (LoadStates) anonymousClass1.L$2;
                            loadType2 = (LoadType) anonymousClass1.L$1;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$19 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$19;
                            if (loadType2 == LoadType.REFRESH) {
                                holder3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex3 = holder3.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                                anonymousClass1.L$1 = holder3;
                                anonymousClass1.L$2 = mutex3;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 6;
                                if (mutex3.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex3.unlock(null);
                                if (!(loadState instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex4 = holder4.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = holder4;
                                    anonymousClass1.L$3 = mutex4;
                                    anonymousClass1.L$4 = loadStates;
                                    anonymousClass1.label = 7;
                                    if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$110 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    mutex5 = mutex4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$110;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = mutex5;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType8 = loadType6;
                                    r2 = mutex5;
                                    Unit unit111 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex6 = holder6.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = holder6;
                                    anonymousClass1.L$3 = mutex6;
                                    anonymousClass1.L$4 = loadStates4;
                                    anonymousClass1.L$5 = loadType7;
                                    anonymousClass1.L$6 = pageFetcherSnapshot3;
                                    anonymousClass1.label = 9;
                                    if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType10 = loadType7;
                                    viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                    mutex6.unlock(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    viewportHint2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = loadStates5;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 10;
                                if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex7 = holder7.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.L$1 = holder7;
                                    anonymousClass1.L$2 = mutex7;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 11;
                                    if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(loadState2 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit112 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint12 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint12;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit113 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint13 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint13;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 6:
                            loadStates = (LoadStates) anonymousClass1.L$3;
                            mutex3 = (Mutex) anonymousClass1.L$2;
                            holder3 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            loadState = holder3.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                            mutex3.unlock(null);
                            if (!(loadState instanceof LoadState.Error)) {
                                PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4.$this_launch$inlined);
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$4;
                            loadType6 = LoadType.PREPEND;
                            if (loadStates.getPrepend() instanceof LoadState.Error) {
                                if (loadType6 != LoadType.REFRESH) {
                                    holder4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex4 = holder4.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = holder4;
                                    anonymousClass1.L$3 = mutex4;
                                    anonymousClass1.L$4 = loadStates;
                                    anonymousClass1.label = 7;
                                    if (mutex4.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$111 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    holder5 = holder4;
                                    mutex5 = mutex4;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$111;
                                    pageFetcherSnapshotState = holder5.state;
                                    pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                    anonymousClass1.L$1 = loadType6;
                                    anonymousClass1.L$2 = mutex5;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType8 = loadType6;
                                    r2 = mutex5;
                                    Unit unit114 = Unit.INSTANCE;
                                    r2.unlock(null);
                                    loadType7 = loadType8;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                                } else {
                                    loadType7 = loadType6;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                }
                                loadStates4 = loadStates;
                                pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                    holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex6 = holder6.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                    anonymousClass1.L$1 = loadType7;
                                    anonymousClass1.L$2 = holder6;
                                    anonymousClass1.L$3 = mutex6;
                                    anonymousClass1.L$4 = loadStates4;
                                    anonymousClass1.L$5 = loadType7;
                                    anonymousClass1.L$6 = pageFetcherSnapshot3;
                                    anonymousClass1.label = 9;
                                    if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType10 = loadType7;
                                    viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                    mutex6.unlock(null);
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                    loadType7 = loadType10;
                                } else {
                                    viewportHint2 = null;
                                    loadStates5 = loadStates4;
                                    loadType9 = loadType7;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = loadStates5;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 10;
                                if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadStates = loadStates5;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                if (loadType7 == LoadType.REFRESH) {
                                    holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex7 = holder7.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                    anonymousClass1.L$1 = holder7;
                                    anonymousClass1.L$2 = mutex7;
                                    anonymousClass1.L$3 = loadStates;
                                    anonymousClass1.label = 11;
                                    if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex7.unlock(null);
                                    if (!(loadState2 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                    }
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit115 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint14 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint14;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            } else {
                                loadType11 = LoadType.APPEND;
                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                    if (loadType11 != LoadType.REFRESH) {
                                        holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex8 = holder8.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = holder8;
                                        anonymousClass1.L$3 = mutex8;
                                        anonymousClass1.label = 12;
                                        if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                            mutex9 = mutex8;
                                            return coroutine_suspended;
                                        }
                                        mutex9 = mutex8;
                                        pageFetcherSnapshotState2 = holder8.state;
                                        pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                        anonymousClass1.L$1 = loadType11;
                                        anonymousClass1.L$2 = mutex9;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.label = 13;
                                        if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType12 = loadType11;
                                        unit = mutex9;
                                        Unit unit116 = Unit.INSTANCE;
                                        unit.unlock(null);
                                    } else {
                                        loadType12 = loadType11;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                        holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex10 = holder9.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                        anonymousClass1.L$1 = loadType12;
                                        anonymousClass1.L$2 = holder9;
                                        anonymousClass1.L$3 = mutex10;
                                        anonymousClass1.L$4 = loadType12;
                                        anonymousClass1.L$5 = pageFetcherSnapshot5;
                                        anonymousClass1.label = 14;
                                        if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadType15 = loadType12;
                                        ViewportHint viewportHint15 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                        mutex10.unlock(null);
                                        loadType14 = loadType12;
                                        viewportHint3 = viewportHint15;
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType15;
                                    } else {
                                        pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                        loadType13 = loadType12;
                                        loadType14 = loadType13;
                                        viewportHint3 = null;
                                    }
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType13;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.label = 15;
                                    if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    if (loadType13 == LoadType.REFRESH) {
                                        holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                        mutex11 = holder10.lock;
                                        anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        anonymousClass1.L$1 = holder10;
                                        anonymousClass1.L$2 = mutex11;
                                        anonymousClass1.label = 16;
                                        if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        holder11 = holder10;
                                        mutex12 = mutex11;
                                        pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                        loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                        mutex12.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 7:
                            loadStates = (LoadStates) anonymousClass1.L$4;
                            Mutex mutex15 = (Mutex) anonymousClass1.L$3;
                            holder5 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$2;
                            LoadType loadType17 = (LoadType) anonymousClass1.L$1;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$20 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            loadType6 = loadType17;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$20;
                            mutex5 = mutex15;
                            pageFetcherSnapshotState = holder5.state;
                            pageFetcherSnapshot2 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                            anonymousClass1.L$1 = loadType6;
                            anonymousClass1.L$2 = mutex5;
                            anonymousClass1.L$3 = loadStates;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.label = 8;
                            if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType6, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadType8 = loadType6;
                            r2 = mutex5;
                            Unit unit117 = Unit.INSTANCE;
                            r2.unlock(null);
                            loadType7 = loadType8;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                            loadStates4 = loadStates;
                            pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex6 = holder6.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = holder6;
                                anonymousClass1.L$3 = mutex6;
                                anonymousClass1.L$4 = loadStates4;
                                anonymousClass1.L$5 = loadType7;
                                anonymousClass1.L$6 = pageFetcherSnapshot3;
                                anonymousClass1.label = 9;
                                if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType10 = loadType7;
                                viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                mutex6.unlock(null);
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                                loadType7 = loadType10;
                            } else {
                                viewportHint2 = null;
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            anonymousClass1.L$1 = loadType7;
                            anonymousClass1.L$2 = loadStates5;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 10;
                            if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates5;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex7 = holder7.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.L$1 = holder7;
                                anonymousClass1.L$2 = mutex7;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 11;
                                if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex7.unlock(null);
                                if (!(loadState2 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex8 = holder8.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = holder8;
                                    anonymousClass1.L$3 = mutex8;
                                    anonymousClass1.label = 12;
                                    if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                        mutex9 = mutex8;
                                        return coroutine_suspended;
                                    }
                                    mutex9 = mutex8;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = mutex9;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.label = 13;
                                    if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    unit = mutex9;
                                    Unit unit118 = Unit.INSTANCE;
                                    unit.unlock(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex10 = holder9.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType12;
                                    anonymousClass1.L$2 = holder9;
                                    anonymousClass1.L$3 = mutex10;
                                    anonymousClass1.L$4 = loadType12;
                                    anonymousClass1.L$5 = pageFetcherSnapshot5;
                                    anonymousClass1.label = 14;
                                    if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType12;
                                    ViewportHint viewportHint16 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                    mutex10.unlock(null);
                                    loadType14 = loadType12;
                                    viewportHint3 = viewportHint16;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    viewportHint3 = null;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType13;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.label = 15;
                                if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex11 = holder10.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.L$1 = holder10;
                                    anonymousClass1.L$2 = mutex11;
                                    anonymousClass1.label = 16;
                                    if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    holder11 = holder10;
                                    mutex12 = mutex11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(loadState3 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 8:
                            loadStates = (LoadStates) anonymousClass1.L$3;
                            Mutex mutex16 = (Mutex) anonymousClass1.L$2;
                            loadType8 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            r2 = mutex16;
                            Unit unit119 = Unit.INSTANCE;
                            r2.unlock(null);
                            loadType7 = loadType8;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$6;
                            loadStates4 = loadStates;
                            pageFetcherSnapshot3 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] != 1) {
                                holder6 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex6 = holder6.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                                anonymousClass1.L$1 = loadType7;
                                anonymousClass1.L$2 = holder6;
                                anonymousClass1.L$3 = mutex6;
                                anonymousClass1.L$4 = loadStates4;
                                anonymousClass1.L$5 = loadType7;
                                anonymousClass1.L$6 = pageFetcherSnapshot3;
                                anonymousClass1.label = 9;
                                if (mutex6.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType10 = loadType7;
                                viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                                mutex6.unlock(null);
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                                loadType7 = loadType10;
                            } else {
                                viewportHint2 = null;
                                loadStates5 = loadStates4;
                                loadType9 = loadType7;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            anonymousClass1.L$1 = loadType7;
                            anonymousClass1.L$2 = loadStates5;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 10;
                            if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates5;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex7 = holder7.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.L$1 = holder7;
                                anonymousClass1.L$2 = mutex7;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 11;
                                if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex7.unlock(null);
                                if (!(loadState2 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex8 = holder8.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = holder8;
                                    anonymousClass1.L$3 = mutex8;
                                    anonymousClass1.label = 12;
                                    if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                        mutex9 = mutex8;
                                        return coroutine_suspended;
                                    }
                                    mutex9 = mutex8;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = mutex9;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.label = 13;
                                    if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    unit = mutex9;
                                    Unit unit1110 = Unit.INSTANCE;
                                    unit.unlock(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex10 = holder9.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType12;
                                    anonymousClass1.L$2 = holder9;
                                    anonymousClass1.L$3 = mutex10;
                                    anonymousClass1.L$4 = loadType12;
                                    anonymousClass1.L$5 = pageFetcherSnapshot5;
                                    anonymousClass1.label = 14;
                                    if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType12;
                                    ViewportHint viewportHint17 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                    mutex10.unlock(null);
                                    loadType14 = loadType12;
                                    viewportHint3 = viewportHint17;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    viewportHint3 = null;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType13;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.label = 15;
                                if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex11 = holder10.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.L$1 = holder10;
                                    anonymousClass1.L$2 = mutex11;
                                    anonymousClass1.label = 16;
                                    if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    holder11 = holder10;
                                    mutex12 = mutex11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(loadState3 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 9:
                            pageFetcherSnapshot3 = (PageFetcherSnapshot) anonymousClass1.L$6;
                            loadType7 = (LoadType) anonymousClass1.L$5;
                            loadStates4 = (LoadStates) anonymousClass1.L$4;
                            mutex6 = (Mutex) anonymousClass1.L$3;
                            holder6 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$2;
                            loadType10 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            viewportHint2 = holder6.state.getFailedHintsByLoadType$paging_common().get(loadType10);
                            mutex6.unlock(null);
                            loadStates5 = loadStates4;
                            loadType9 = loadType7;
                            loadType7 = loadType10;
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            anonymousClass1.L$1 = loadType7;
                            anonymousClass1.L$2 = loadStates5;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 10;
                            if (pageFetcherSnapshot3.retryLoadError(loadType9, viewportHint2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadStates = loadStates5;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$5;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex7 = holder7.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.L$1 = holder7;
                                anonymousClass1.L$2 = mutex7;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 11;
                                if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex7.unlock(null);
                                if (!(loadState2 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex8 = holder8.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = holder8;
                                    anonymousClass1.L$3 = mutex8;
                                    anonymousClass1.label = 12;
                                    if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                        mutex9 = mutex8;
                                        return coroutine_suspended;
                                    }
                                    mutex9 = mutex8;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = mutex9;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.label = 13;
                                    if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    unit = mutex9;
                                    Unit unit1111 = Unit.INSTANCE;
                                    unit.unlock(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex10 = holder9.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType12;
                                    anonymousClass1.L$2 = holder9;
                                    anonymousClass1.L$3 = mutex10;
                                    anonymousClass1.L$4 = loadType12;
                                    anonymousClass1.L$5 = pageFetcherSnapshot5;
                                    anonymousClass1.label = 14;
                                    if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType12;
                                    ViewportHint viewportHint18 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                    mutex10.unlock(null);
                                    loadType14 = loadType12;
                                    viewportHint3 = viewportHint18;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    viewportHint3 = null;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType13;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.label = 15;
                                if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex11 = holder10.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.L$1 = holder10;
                                    anonymousClass1.L$2 = mutex11;
                                    anonymousClass1.label = 16;
                                    if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    holder11 = holder10;
                                    mutex12 = mutex11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(loadState3 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 10:
                            loadStates = (LoadStates) anonymousClass1.L$2;
                            loadType7 = (LoadType) anonymousClass1.L$1;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$21 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$21;
                            if (loadType7 == LoadType.REFRESH) {
                                holder7 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex7 = holder7.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                                anonymousClass1.L$1 = holder7;
                                anonymousClass1.L$2 = mutex7;
                                anonymousClass1.L$3 = loadStates;
                                anonymousClass1.label = 11;
                                if (mutex7.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex7.unlock(null);
                                if (!(loadState2 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                                }
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex8 = holder8.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = holder8;
                                    anonymousClass1.L$3 = mutex8;
                                    anonymousClass1.label = 12;
                                    if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                        mutex9 = mutex8;
                                        return coroutine_suspended;
                                    }
                                    mutex9 = mutex8;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = mutex9;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.label = 13;
                                    if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    unit = mutex9;
                                    Unit unit1112 = Unit.INSTANCE;
                                    unit.unlock(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex10 = holder9.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType12;
                                    anonymousClass1.L$2 = holder9;
                                    anonymousClass1.L$3 = mutex10;
                                    anonymousClass1.L$4 = loadType12;
                                    anonymousClass1.L$5 = pageFetcherSnapshot5;
                                    anonymousClass1.label = 14;
                                    if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType12;
                                    ViewportHint viewportHint19 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                    mutex10.unlock(null);
                                    loadType14 = loadType12;
                                    viewportHint3 = viewportHint19;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    viewportHint3 = null;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType13;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.label = 15;
                                if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex11 = holder10.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.L$1 = holder10;
                                    anonymousClass1.L$2 = mutex11;
                                    anonymousClass1.label = 16;
                                    if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    holder11 = holder10;
                                    mutex12 = mutex11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(loadState3 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 11:
                            loadStates = (LoadStates) anonymousClass1.L$3;
                            mutex7 = (Mutex) anonymousClass1.L$2;
                            holder7 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            loadState2 = holder7.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                            mutex7.unlock(null);
                            if (!(loadState2 instanceof LoadState.Error)) {
                                PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7.$this_launch$inlined);
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$7;
                            loadType11 = LoadType.APPEND;
                            if (loadStates.getAppend() instanceof LoadState.Error) {
                                if (loadType11 != LoadType.REFRESH) {
                                    holder8 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex8 = holder8.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = holder8;
                                    anonymousClass1.L$3 = mutex8;
                                    anonymousClass1.label = 12;
                                    if (mutex8.lock(null, anonymousClass1) == coroutine_suspended) {
                                        mutex9 = mutex8;
                                        return coroutine_suspended;
                                    }
                                    mutex9 = mutex8;
                                    pageFetcherSnapshotState2 = holder8.state;
                                    pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                    anonymousClass1.L$1 = loadType11;
                                    anonymousClass1.L$2 = mutex9;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.label = 13;
                                    if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType12 = loadType11;
                                    unit = mutex9;
                                    Unit unit1113 = Unit.INSTANCE;
                                    unit.unlock(null);
                                } else {
                                    loadType12 = loadType11;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                                pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                                if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                    holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex10 = holder9.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                    anonymousClass1.L$1 = loadType12;
                                    anonymousClass1.L$2 = holder9;
                                    anonymousClass1.L$3 = mutex10;
                                    anonymousClass1.L$4 = loadType12;
                                    anonymousClass1.L$5 = pageFetcherSnapshot5;
                                    anonymousClass1.label = 14;
                                    if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType15 = loadType12;
                                    ViewportHint viewportHint110 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                    mutex10.unlock(null);
                                    loadType14 = loadType12;
                                    viewportHint3 = viewportHint110;
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType15;
                                } else {
                                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                    loadType13 = loadType12;
                                    loadType14 = loadType13;
                                    viewportHint3 = null;
                                }
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType13;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.label = 15;
                                if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                if (loadType13 == LoadType.REFRESH) {
                                    holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                    mutex11 = holder10.lock;
                                    anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    anonymousClass1.L$1 = holder10;
                                    anonymousClass1.L$2 = mutex11;
                                    anonymousClass1.label = 16;
                                    if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    holder11 = holder10;
                                    mutex12 = mutex11;
                                    pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                    loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                    mutex12.unlock(null);
                                    if (!(loadState3 instanceof LoadState.Error)) {
                                        PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 12:
                            Mutex mutex17 = (Mutex) anonymousClass1.L$3;
                            holder8 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$2;
                            LoadType loadType18 = (LoadType) anonymousClass1.L$1;
                            PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$22 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            loadType11 = loadType18;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$22;
                            mutex9 = mutex17;
                            mutex9 = mutex8;
                            pageFetcherSnapshotState2 = holder8.state;
                            pageFetcherSnapshot4 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            anonymousClass1.L$1 = loadType11;
                            anonymousClass1.L$2 = mutex9;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.label = 13;
                            if (pageFetcherSnapshot4.setLoading(pageFetcherSnapshotState2, loadType11, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadType12 = loadType11;
                            unit = mutex9;
                            Unit unit1114 = Unit.INSTANCE;
                            unit.unlock(null);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex10 = holder9.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType12;
                                anonymousClass1.L$2 = holder9;
                                anonymousClass1.L$3 = mutex10;
                                anonymousClass1.L$4 = loadType12;
                                anonymousClass1.L$5 = pageFetcherSnapshot5;
                                anonymousClass1.label = 14;
                                if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType15 = loadType12;
                                ViewportHint viewportHint111 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                mutex10.unlock(null);
                                loadType14 = loadType12;
                                viewportHint3 = viewportHint111;
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType15;
                            } else {
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType12;
                                loadType14 = loadType13;
                                viewportHint3 = null;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            anonymousClass1.L$1 = loadType13;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 15;
                            if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex11 = holder10.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.L$1 = holder10;
                                anonymousClass1.L$2 = mutex11;
                                anonymousClass1.label = 16;
                                if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                holder11 = holder10;
                                mutex12 = mutex11;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex12.unlock(null);
                                if (!(loadState3 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                }
                            }
                            return Unit.INSTANCE;
                        case 13:
                            Mutex mutex18 = (Mutex) anonymousClass1.L$2;
                            loadType12 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            unit = mutex18;
                            Unit unit1115 = Unit.INSTANCE;
                            unit.unlock(null);
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1;
                            pageFetcherSnapshot5 = PageFetcherSnapshot$pageEventFlow$1.this.this$0;
                            if (PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] != 1) {
                                holder9 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex10 = holder9.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                                anonymousClass1.L$1 = loadType12;
                                anonymousClass1.L$2 = holder9;
                                anonymousClass1.L$3 = mutex10;
                                anonymousClass1.L$4 = loadType12;
                                anonymousClass1.L$5 = pageFetcherSnapshot5;
                                anonymousClass1.label = 14;
                                if (mutex10.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadType15 = loadType12;
                                ViewportHint viewportHint112 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                                mutex10.unlock(null);
                                loadType14 = loadType12;
                                viewportHint3 = viewportHint112;
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType15;
                            } else {
                                pageFetcherSnapshot6 = pageFetcherSnapshot5;
                                loadType13 = loadType12;
                                loadType14 = loadType13;
                                viewportHint3 = null;
                            }
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            anonymousClass1.L$1 = loadType13;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 15;
                            if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex11 = holder10.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.L$1 = holder10;
                                anonymousClass1.L$2 = mutex11;
                                anonymousClass1.label = 16;
                                if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                holder11 = holder10;
                                mutex12 = mutex11;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex12.unlock(null);
                                if (!(loadState3 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                }
                            }
                            return Unit.INSTANCE;
                        case 14:
                            pageFetcherSnapshot5 = (PageFetcherSnapshot) anonymousClass1.L$5;
                            loadType12 = (LoadType) anonymousClass1.L$4;
                            mutex10 = (Mutex) anonymousClass1.L$3;
                            holder9 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$2;
                            loadType15 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            ViewportHint viewportHint113 = holder9.state.getFailedHintsByLoadType$paging_common().get(loadType15);
                            mutex10.unlock(null);
                            loadType14 = loadType12;
                            viewportHint3 = viewportHint113;
                            pageFetcherSnapshot6 = pageFetcherSnapshot5;
                            loadType13 = loadType15;
                            anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            anonymousClass1.L$1 = loadType13;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 15;
                            if (pageFetcherSnapshot6.retryLoadError(loadType14, viewportHint3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$8;
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex11 = holder10.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.L$1 = holder10;
                                anonymousClass1.L$2 = mutex11;
                                anonymousClass1.label = 16;
                                if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                holder11 = holder10;
                                mutex12 = mutex11;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex12.unlock(null);
                                if (!(loadState3 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                }
                            }
                            return Unit.INSTANCE;
                        case 15:
                            loadType13 = (LoadType) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (loadType13 == LoadType.REFRESH) {
                                holder10 = PageFetcherSnapshot$pageEventFlow$1.this.this$0.stateHolder;
                                mutex11 = holder10.lock;
                                anonymousClass1.L$0 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                anonymousClass1.L$1 = holder10;
                                anonymousClass1.L$2 = mutex11;
                                anonymousClass1.label = 16;
                                if (mutex11.lock(null, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                holder11 = holder10;
                                mutex12 = mutex11;
                                pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$9;
                                loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                                mutex12.unlock(null);
                                if (!(loadState3 instanceof LoadState.Error)) {
                                    PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                                }
                            }
                            return Unit.INSTANCE;
                        case 16:
                            mutex12 = (Mutex) anonymousClass1.L$2;
                            holder11 = (PageFetcherSnapshotState.Holder) anonymousClass1.L$1;
                            pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10 = (PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj);
                            loadState3 = holder11.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                            mutex12.unlock(null);
                            if (!(loadState3 instanceof LoadState.Error)) {
                                PageFetcherSnapshot$pageEventFlow$1.this.this$0.startConsumingHints(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$10.$this_launch$inlined);
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th8) {
                    r2.unlock(null);
                    throw th8;
                }
            } catch (Throwable th9) {
                unit.unlock(null);
                throw th9;
            }
        } catch (Throwable th10) {
            r2.unlock(null);
            throw th10;
        }
    }
}
