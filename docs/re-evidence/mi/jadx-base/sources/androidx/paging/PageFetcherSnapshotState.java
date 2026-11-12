package androidx.paging;

import androidx.annotation.CheckResult;
import com.xiaomi.onetrack.c.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001JB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0/J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0/J#\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0002\b5J\u0014\u00106\u001a\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000109J\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001092\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0013J\u0015\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0002\b>J,\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0007J\u0016\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020FJ+\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010H*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0002\bIR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\"R$\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020(@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u0006K"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "Key", "", "Value", q.f13857a, "Landroidx/paging/PagingConfig;", "(Landroidx/paging/PagingConfig;)V", "_pages", "", "Landroidx/paging/PagingSource$LoadResult$Page;", "_placeholdersAfter", "", "_placeholdersBefore", "appendGenerationId", "appendGenerationIdCh", "Lkotlinx/coroutines/channels/Channel;", "failedHintsByLoadType", "", "Landroidx/paging/LoadType;", "Landroidx/paging/ViewportHint;", "getFailedHintsByLoadType$paging_common", "()Ljava/util/Map;", "<set-?>", "initialPageIndex", "getInitialPageIndex$paging_common", "()I", "pages", "", "getPages$paging_common", "()Ljava/util/List;", "value", "placeholdersAfter", "getPlaceholdersAfter$paging_common", "setPlaceholdersAfter$paging_common", "(I)V", "placeholdersBefore", "getPlaceholdersBefore$paging_common", "setPlaceholdersBefore$paging_common", "prependGenerationId", "prependGenerationIdCh", "Landroidx/paging/LoadStates;", "sourceLoadStates", "getSourceLoadStates$paging_common", "()Landroidx/paging/LoadStates;", "storageCount", "getStorageCount$paging_common", "consumeAppendGenerationIdAsFlow", "Lkotlinx/coroutines/flow/Flow;", "consumePrependGenerationIdAsFlow", "currentPagingState", "Landroidx/paging/PagingState;", "viewportHint", "Landroidx/paging/ViewportHint$Access;", "currentPagingState$paging_common", "drop", "", "event", "Landroidx/paging/PageEvent$Drop;", "dropEventOrNull", "loadType", "hint", "generationId", "generationId$paging_common", "insert", "", "loadId", "page", "setSourceLoadState", "type", "newState", "Landroidx/paging/LoadState;", "toPageEvent", "Landroidx/paging/PageEvent;", "toPageEvent$paging_common", "Holder", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshotState<Key, Value> {
    private final List<PagingSource.LoadResult.Page<Key, Value>> _pages;
    private int _placeholdersAfter;
    private int _placeholdersBefore;
    private int appendGenerationId;
    private final Channel<Integer> appendGenerationIdCh;
    private final PagingConfig config;

    @NotNull
    private final Map<LoadType, ViewportHint> failedHintsByLoadType;
    private int initialPageIndex;

    @NotNull
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;
    private int prependGenerationId;
    private final Channel<Integer> prependGenerationIdCh;

    @NotNull
    private LoadStates sourceLoadStates;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JF\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0004\u0010\f2-\u0010\r\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t\u0012\u0004\u0012\u0002H\f0\u000eH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "Key", "", "Value", q.f13857a, "Landroidx/paging/PagingConfig;", "(Landroidx/paging/PagingConfig;)V", "lock", "Lkotlinx/coroutines/sync/Mutex;", "state", "Landroidx/paging/PageFetcherSnapshotState;", "withLock", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Holder<Key, Value> {
        private final PagingConfig config;
        private final Mutex lock;
        private final PageFetcherSnapshotState<Key, Value> state;

        public Holder(@NotNull PagingConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
            this.lock = MutexKt.Mutex$default(false, 1, null);
            this.state = new PageFetcherSnapshotState<>(config, null);
        }

        @Nullable
        private final Object withLock$$forInline(@NotNull Function1 function1, @NotNull Continuation continuation) {
            Mutex mutex = this.lock;
            InlineMarker.mark(0);
            mutex.lock(null, continuation);
            InlineMarker.mark(2);
            InlineMarker.mark(1);
            try {
                return function1.invoke2(this.state);
            } finally {
                InlineMarker.finallyStart(1);
                mutex.unlock(null);
                InlineMarker.finallyEnd(1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final <T> Object withLock(@NotNull Function1<? super PageFetcherSnapshotState<Key, Value>, ? extends T> function1, @NotNull Continuation<? super T> continuation) {
            PageFetcherSnapshotState$Holder$withLock$1 pageFetcherSnapshotState$Holder$withLock$1;
            Mutex mutex;
            Holder<Key, Value> holder;
            if (continuation instanceof PageFetcherSnapshotState$Holder$withLock$1) {
                pageFetcherSnapshotState$Holder$withLock$1 = (PageFetcherSnapshotState$Holder$withLock$1) continuation;
                int i = pageFetcherSnapshotState$Holder$withLock$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshotState$Holder$withLock$1.label = i - Integer.MIN_VALUE;
                } else {
                    pageFetcherSnapshotState$Holder$withLock$1 = new PageFetcherSnapshotState$Holder$withLock$1(this, continuation);
                }
            } else {
                pageFetcherSnapshotState$Holder$withLock$1 = new PageFetcherSnapshotState$Holder$withLock$1(this, continuation);
            }
            Object obj = pageFetcherSnapshotState$Holder$withLock$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = pageFetcherSnapshotState$Holder$withLock$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.lock;
                pageFetcherSnapshotState$Holder$withLock$1.L$0 = this;
                pageFetcherSnapshotState$Holder$withLock$1.L$1 = function1;
                pageFetcherSnapshotState$Holder$withLock$1.L$2 = mutex;
                pageFetcherSnapshotState$Holder$withLock$1.label = 1;
                if (mutex.lock(null, pageFetcherSnapshotState$Holder$withLock$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                holder = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex2 = (Mutex) pageFetcherSnapshotState$Holder$withLock$1.L$2;
                Function1<? super PageFetcherSnapshotState<Key, Value>, ? extends T> function2 = (Function1) pageFetcherSnapshotState$Holder$withLock$1.L$1;
                holder = (Holder) pageFetcherSnapshotState$Holder$withLock$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                function1 = function2;
            }
            try {
                return function1.invoke2(holder.state);
            } finally {
                InlineMarker.finallyStart(1);
                mutex.unlock(null);
                InlineMarker.finallyEnd(1);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[LoadType.values().length];
            $EnumSwitchMapping$0 = iArr;
            LoadType loadType = LoadType.REFRESH;
            iArr[loadType.ordinal()] = 1;
            LoadType loadType2 = LoadType.PREPEND;
            iArr[loadType2.ordinal()] = 2;
            LoadType loadType3 = LoadType.APPEND;
            iArr[loadType3.ordinal()] = 3;
            int[] iArr2 = new int[LoadType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[loadType.ordinal()] = 1;
            iArr2[loadType2.ordinal()] = 2;
            iArr2[loadType3.ordinal()] = 3;
            int[] iArr3 = new int[LoadType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[loadType.ordinal()] = 1;
            iArr3[loadType2.ordinal()] = 2;
            iArr3[loadType3.ordinal()] = 3;
            int[] iArr4 = new int[LoadType.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[loadType.ordinal()] = 1;
            iArr4[loadType2.ordinal()] = 2;
            iArr4[loadType3.ordinal()] = 3;
            int[] iArr5 = new int[LoadType.values().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[loadType2.ordinal()] = 1;
            iArr5[loadType3.ordinal()] = 2;
            int[] iArr6 = new int[LoadType.values().length];
            $EnumSwitchMapping$5 = iArr6;
            iArr6[loadType2.ordinal()] = 1;
            int[] iArr7 = new int[LoadType.values().length];
            $EnumSwitchMapping$6 = iArr7;
            iArr7[loadType2.ordinal()] = 1;
            int[] iArr8 = new int[LoadType.values().length];
            $EnumSwitchMapping$7 = iArr8;
            iArr8[loadType2.ordinal()] = 1;
            int[] iArr9 = new int[LoadType.values().length];
            $EnumSwitchMapping$8 = iArr9;
            iArr9[loadType2.ordinal()] = 1;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass1(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PageFetcherSnapshotState.this.appendGenerationIdCh.offer(Boxing.boxInt(PageFetcherSnapshotState.this.appendGenerationId));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12561 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        int label;

        public C12561(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new C12561(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((C12561) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PageFetcherSnapshotState.this.prependGenerationIdCh.offer(Boxing.boxInt(PageFetcherSnapshotState.this.prependGenerationId));
            return Unit.INSTANCE;
        }
    }

    private PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.config = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.appendGenerationIdCh = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        this.sourceLoadStates = LoadStates.INSTANCE.getIDLE();
    }

    @NotNull
    public final Flow<Integer> consumeAppendGenerationIdAsFlow() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.appendGenerationIdCh), new AnonymousClass1(null));
    }

    @NotNull
    public final Flow<Integer> consumePrependGenerationIdAsFlow() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.prependGenerationIdCh), new C12561(null));
    }

    @NotNull
    public final PagingState<Key, Value> currentPagingState$paging_common(@Nullable ViewportHint.Access viewportHint) {
        Integer numValueOf;
        List list = CollectionsKt___CollectionsKt.toList(this.pages);
        if (viewportHint != null) {
            int placeholdersBefore$paging_common = getPlaceholdersBefore$paging_common();
            int i = -this.initialPageIndex;
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex;
            int pageOffset = viewportHint.getPageOffset();
            int i2 = i;
            while (i2 < pageOffset) {
                placeholdersBefore$paging_common += i2 > lastIndex ? this.config.pageSize : this.pages.get(this.initialPageIndex + i2).getData().size();
                i2++;
            }
            int indexInPage = placeholdersBefore$paging_common + viewportHint.getIndexInPage();
            if (viewportHint.getPageOffset() < i) {
                indexInPage -= this.config.pageSize;
            }
            numValueOf = Integer.valueOf(indexInPage);
        } else {
            numValueOf = null;
        }
        return new PagingState<>(list, numValueOf, this.config, getPlaceholdersBefore$paging_common());
    }

    public final void drop(@NotNull PageEvent.Drop<Value> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event.getPageCount() <= this.pages.size())) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.getPageCount()).toString());
        }
        this.failedHintsByLoadType.remove(event.getLoadType());
        this.sourceLoadStates = this.sourceLoadStates.modifyState$paging_common(event.getLoadType(), LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
        int i = WhenMappings.$EnumSwitchMapping$4[event.getLoadType().ordinal()];
        if (i == 1) {
            int pageCount = event.getPageCount();
            for (int i2 = 0; i2 < pageCount; i2++) {
                this._pages.remove(0);
            }
            this.initialPageIndex -= event.getPageCount();
            setPlaceholdersBefore$paging_common(event.getPlaceholdersRemaining());
            int i3 = this.prependGenerationId + 1;
            this.prependGenerationId = i3;
            this.prependGenerationIdCh.offer(Integer.valueOf(i3));
            return;
        }
        if (i != 2) {
            throw new IllegalArgumentException("cannot drop " + event.getLoadType());
        }
        int pageCount2 = event.getPageCount();
        for (int i4 = 0; i4 < pageCount2; i4++) {
            this._pages.remove(this.pages.size() - 1);
        }
        setPlaceholdersAfter$paging_common(event.getPlaceholdersRemaining());
        int i5 = this.appendGenerationId + 1;
        this.appendGenerationId = i5;
        this.appendGenerationIdCh.offer(Integer.valueOf(i5));
    }

    @Nullable
    public final PageEvent.Drop<Value> dropEventOrNull(@NotNull LoadType loadType, @NotNull ViewportHint hint) {
        int lastIndex;
        int i;
        int size;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(hint, "hint");
        PageEvent.Drop<Value> drop = null;
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || getStorageCount$paging_common() <= this.config.maxSize) {
            return null;
        }
        int placeholdersBefore$paging_common = 0;
        if (!(loadType != LoadType.REFRESH)) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.pages.size() && getStorageCount$paging_common() - i3 > this.config.maxSize) {
            if (WhenMappings.$EnumSwitchMapping$5[loadType.ordinal()] != 1) {
                List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
                size = list.get(CollectionsKt__CollectionsKt.getLastIndex(list) - i2).getData().size();
            } else {
                size = this.pages.get(i2).getData().size();
            }
            if (((WhenMappings.$EnumSwitchMapping$6[loadType.ordinal()] != 1 ? hint.getPresentedItemsAfter() : hint.getPresentedItemsBefore()) - i3) - size < this.config.prefetchDistance) {
                break;
            }
            i3 += size;
            i2++;
        }
        if (i2 != 0) {
            int lastIndex2 = WhenMappings.$EnumSwitchMapping$7[loadType.ordinal()] != 1 ? (CollectionsKt__CollectionsKt.getLastIndex(this.pages) - this.initialPageIndex) - (i2 - 1) : -this.initialPageIndex;
            if (WhenMappings.$EnumSwitchMapping$8[loadType.ordinal()] != 1) {
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.pages);
                i = this.initialPageIndex;
            } else {
                lastIndex = i2 - 1;
                i = this.initialPageIndex;
            }
            int i4 = lastIndex - i;
            if (this.config.enablePlaceholders) {
                placeholdersBefore$paging_common = (loadType == LoadType.PREPEND ? getPlaceholdersBefore$paging_common() : getPlaceholdersAfter$paging_common()) + i3;
            }
            drop = new PageEvent.Drop<>(loadType, lastIndex2, i4, placeholdersBefore$paging_common);
        }
        return drop;
    }

    public final int generationId$paging_common(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i == 2) {
            return this.prependGenerationId;
        }
        if (i == 3) {
            return this.appendGenerationId;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final Map<LoadType, ViewportHint> getFailedHintsByLoadType$paging_common() {
        return this.failedHintsByLoadType;
    }

    /* JADX INFO: renamed from: getInitialPageIndex$paging_common, reason: from getter */
    public final int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    @NotNull
    public final List<PagingSource.LoadResult.Page<Key, Value>> getPages$paging_common() {
        return this.pages;
    }

    public final int getPlaceholdersAfter$paging_common() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int getPlaceholdersBefore$paging_common() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: getSourceLoadStates$paging_common, reason: from getter */
    public final LoadStates getSourceLoadStates() {
        return this.sourceLoadStates;
    }

    public final int getStorageCount$paging_common() {
        Iterator<T> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((PagingSource.LoadResult.Page) it.next()).getData().size();
        }
        return size;
    }

    @CheckResult
    public final boolean insert(int loadId, @NotNull LoadType loadType, @NotNull PagingSource.LoadResult.Page<Key, Value> page) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(page, "page");
        int i = WhenMappings.$EnumSwitchMapping$3[loadType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (!(!this.pages.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (loadId != this.appendGenerationId) {
                        return false;
                    }
                    this._pages.add(page);
                    setPlaceholdersAfter$paging_common(page.getItemsAfter() == Integer.MIN_VALUE ? RangesKt___RangesKt.coerceAtLeast(getPlaceholdersAfter$paging_common() - page.getData().size(), 0) : page.getItemsAfter());
                    this.failedHintsByLoadType.remove(LoadType.APPEND);
                }
            } else {
                if (!(!this.pages.isEmpty())) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (loadId != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.initialPageIndex++;
                setPlaceholdersBefore$paging_common(page.getItemsBefore() == Integer.MIN_VALUE ? RangesKt___RangesKt.coerceAtLeast(getPlaceholdersBefore$paging_common() - page.getData().size(), 0) : page.getItemsBefore());
                this.failedHintsByLoadType.remove(LoadType.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (!(loadId == 0)) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this._pages.add(page);
            this.initialPageIndex = 0;
            setPlaceholdersAfter$paging_common(page.getItemsAfter());
            setPlaceholdersBefore$paging_common(page.getItemsBefore());
        }
        return true;
    }

    public final void setPlaceholdersAfter$paging_common(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this._placeholdersAfter = i;
    }

    public final void setPlaceholdersBefore$paging_common(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this._placeholdersBefore = i;
    }

    public final boolean setSourceLoadState(@NotNull LoadType type, @NotNull LoadState newState) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (Intrinsics.areEqual(this.sourceLoadStates.get$paging_common(type), newState)) {
            return false;
        }
        this.sourceLoadStates = this.sourceLoadStates.modifyState$paging_common(type, newState);
        return true;
    }

    @NotNull
    public final PageEvent<Value> toPageEvent$paging_common(@NotNull PagingSource.LoadResult.Page<Key, Value> toPageEvent, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(toPageEvent, "$this$toPageEvent");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$1[loadType.ordinal()];
        int size = 0;
        if (i != 1) {
            if (i == 2) {
                size = 0 - this.initialPageIndex;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(new TransformablePage(size, toPageEvent.getData()));
        int i2 = WhenMappings.$EnumSwitchMapping$2[loadType.ordinal()];
        if (i2 == 1) {
            return PageEvent.Insert.INSTANCE.Refresh(listListOf, getPlaceholdersBefore$paging_common(), getPlaceholdersAfter$paging_common(), new CombinedLoadStates(this.sourceLoadStates.getRefresh(), this.sourceLoadStates.getPrepend(), this.sourceLoadStates.getAppend(), this.sourceLoadStates, null));
        }
        if (i2 == 2) {
            return PageEvent.Insert.INSTANCE.Prepend(listListOf, getPlaceholdersBefore$paging_common(), new CombinedLoadStates(this.sourceLoadStates.getRefresh(), this.sourceLoadStates.getPrepend(), this.sourceLoadStates.getAppend(), this.sourceLoadStates, null));
        }
        if (i2 == 3) {
            return PageEvent.Insert.INSTANCE.Append(listListOf, getPlaceholdersAfter$paging_common(), new CombinedLoadStates(this.sourceLoadStates.getRefresh(), this.sourceLoadStates.getPrepend(), this.sourceLoadStates.getAppend(), this.sourceLoadStates, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ PageFetcherSnapshotState(PagingConfig pagingConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(pagingConfig);
    }
}
