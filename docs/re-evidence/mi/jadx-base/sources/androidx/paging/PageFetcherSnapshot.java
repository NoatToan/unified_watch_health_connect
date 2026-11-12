package androidx.paging;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u0083\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\u0010\u0014J\u000e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0017J\u0006\u0010/\u001a\u00020\u000bJ\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J\u0011\u00102\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J!\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0082@ø\u0001\u0000¢\u0006\u0002\u00108J%\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u00104\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010<J#\u0010=\u001a\u00020\u000b2\u0006\u00104\u001a\u0002052\b\u0010.\u001a\u0004\u0018\u00010\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>J#\u0010?\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020@0\n2\u0006\u00104\u001a\u000205H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ7\u0010B\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C2\u0006\u00104\u001a\u0002052\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020@H\u0002¢\u0006\u0002\u0010FJ)\u0010G\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C2\u0006\u00104\u001a\u000205H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010HJ\f\u0010I\u001a\u00020\u000b*\u00020JH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0080\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "Key", "", "Value", "initialKey", "pagingSource", "Landroidx/paging/PagingSource;", q.f13857a, "Landroidx/paging/PagingConfig;", "retryFlow", "Lkotlinx/coroutines/flow/Flow;", "", "triggerRemoteRefresh", "", "remoteMediatorConnection", "Landroidx/paging/RemoteMediatorConnection;", "previousPagingState", "Landroidx/paging/PagingState;", "invalidate", "Lkotlin/Function0;", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;ZLandroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V", "hintSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/paging/ViewportHint;", "getInitialKey$paging_common", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lastHint", "Landroidx/paging/ViewportHint$Access;", "pageEventCh", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageEvent;", "pageEventChCollected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChannelFlowJob", "Lkotlinx/coroutines/CompletableJob;", "pageEventFlow", "getPageEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "getPagingSource$paging_common", "()Landroidx/paging/PagingSource;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "stateHolder", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "accessHint", "viewportHint", Constants.EXTRA_CLOSE_TAI, "currentPagingState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doInitialLoad", "doLoad", "loadType", "Landroidx/paging/LoadType;", "generationalHint", "Landroidx/paging/GenerationalViewportHint;", "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadParams", "Landroidx/paging/PagingSource$LoadParams;", "key", "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "retryLoadError", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectAsGenerationalViewportHints", "", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextLoadKeyOrNull", "Landroidx/paging/PageFetcherSnapshotState;", "generationId", "presentedItemsBeyondAnchor", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "setLoading", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumingHints", "Lkotlinx/coroutines/CoroutineScope;", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshot<Key, Value> {
    private final PagingConfig config;
    private final MutableSharedFlow<ViewportHint> hintSharedFlow;

    @Nullable
    private final Key initialKey;
    private final Function0<Unit> invalidate;
    private ViewportHint.Access lastHint;
    private final Channel<PageEvent<Value>> pageEventCh;
    private final AtomicBoolean pageEventChCollected;
    private final CompletableJob pageEventChannelFlowJob;

    @NotNull
    private final Flow<PageEvent<Value>> pageEventFlow;

    @NotNull
    private final PagingSource<Key, Value> pagingSource;
    private final PagingState<Key, Value> previousPagingState;

    @Nullable
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    private final Flow<Unit> retryFlow;
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;
    private final boolean triggerRemoteRefresh;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[LoadType.values().length];
            $EnumSwitchMapping$0 = iArr;
            LoadType loadType = LoadType.REFRESH;
            iArr[loadType.ordinal()] = 1;
            int[] iArr2 = new int[LoadType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[loadType.ordinal()] = 1;
            int[] iArr3 = new int[LoadType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            LoadType loadType2 = LoadType.PREPEND;
            iArr3[loadType2.ordinal()] = 1;
            LoadType loadType3 = LoadType.APPEND;
            iArr3[loadType3.ordinal()] = 2;
            iArr3[loadType.ordinal()] = 3;
            int[] iArr4 = new int[LoadType.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[loadType2.ordinal()] = 1;
            iArr4[loadType3.ordinal()] = 2;
            int[] iArr5 = new int[LoadType.values().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[loadType2.ordinal()] = 1;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/paging/GenerationalViewportHint;", "Key", "", "Value", "previous", "next", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function3<GenerationalViewportHint, GenerationalViewportHint, Continuation<? super GenerationalViewportHint>, Object> {
        final /* synthetic */ LoadType $loadType;
        private /* synthetic */ Object L$0;
        private /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LoadType loadType, Continuation continuation) {
            super(3, continuation);
            this.$loadType = loadType;
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull GenerationalViewportHint previous, @NotNull GenerationalViewportHint next, @NotNull Continuation<? super GenerationalViewportHint> continuation) {
            Intrinsics.checkNotNullParameter(previous, "previous");
            Intrinsics.checkNotNullParameter(next, "next");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$loadType, continuation);
            anonymousClass3.L$0 = previous;
            anonymousClass3.L$1 = next;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, Continuation<? super GenerationalViewportHint> continuation) {
            return ((AnonymousClass3) create(generationalViewportHint, generationalViewportHint2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.L$0;
            GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.L$1;
            return PageFetcherSnapshotKt.shouldPrioritizeOver(generationalViewportHint2, generationalViewportHint, this.$loadType) ? generationalViewportHint2 : generationalViewportHint;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$currentPagingState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0086@"}, d2 = {"currentPagingState", "", "Key", "Value", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/PagingState;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {595}, m = "currentPagingState", n = {"this", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class C12501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12501(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcherSnapshot.this.currentPagingState(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$doInitialLoad$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@"}, d2 = {"doInitialLoad", "", "Key", "Value", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9}, l = {611, 272, 275, 623, 635, 647, 304, 659, 671, 329}, m = "doInitialLoad", n = {"this", "this_$iv", "$this$withLock$iv$iv", "this", "$this$withLock$iv$iv", "this", "this", "result", "this_$iv", "$this$withLock$iv$iv", "this", "result", "this_$iv", "$this$withLock$iv$iv", "insertApplied", "this", "result", "this_$iv", "$this$withLock$iv$iv", "this", "result", "$this$withLock$iv$iv", "this", "result", "this_$iv", "$this$withLock$iv$iv", "this", "result", "this_$iv", "$this$withLock$iv$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class C12511 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C12511(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcherSnapshot.this.doInitialLoad(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$doLoad$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@"}, d2 = {"doLoad", "", "Key", "Value", "loadType", "Landroidx/paging/LoadType;", "generationalHint", "Landroidx/paging/GenerationalViewportHint;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, l = {684, 696, 386, 394, 708, HMSedentaryConfig.INGORE_START_INDEX, 437, 732, 456, 482, 744}, m = "doLoad", n = {"this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "result", "this_$iv", "$this$withLock$iv$iv", "loadType", "generationalHint", "$this$withLock$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "dropType", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "this_$iv", "$this$withLock$iv$iv", "endsPrepend", "endsAppend"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"})
    public static final class C12521 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C12521(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcherSnapshot.this.doLoad(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$setLoading$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@"}, d2 = {"setLoading", "", "Key", "Value", "Landroidx/paging/PageFetcherSnapshotState;", "loadType", "Landroidx/paging/LoadType;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {}, l = {506}, m = "setLoading", n = {}, s = {})
    public static final class C12531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12531(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcherSnapshot.this.setLoading(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/ViewportHint;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<ViewportHint, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass2(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                return C12541.this.new AnonymousClass2(completion);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ViewportHint viewportHint, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(viewportHint, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PageFetcherSnapshot.this.invalidate.invoke();
                return Unit.INSTANCE;
            }
        }

        public C12541(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new C12541(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final MutableSharedFlow mutableSharedFlow = PageFetcherSnapshot.this.hintSharedFlow;
                Flow<ViewportHint> flow = new Flow<ViewportHint>() { // from class: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$1$lambda$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
                    public static final class AnonymousClass2 implements FlowCollector<ViewportHint> {
                        final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                        final /* synthetic */ PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 this$0;

                        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\n"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$1$lambda$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1"}, k = 3, mv = {1, 4, 2})
                        @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1) {
                            this.$this_unsafeFlow$inlined = flowCollector;
                            this.this$0 = pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(ViewportHint viewportHint, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
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
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                ViewportHint viewportHint2 = viewportHint;
                                if (!Boxing.boxBoolean(viewportHint2.getPresentedItemsBefore() * (-1) > PageFetcherSnapshot.this.config.jumpThreshold || viewportHint2.getPresentedItemsAfter() * (-1) > PageFetcherSnapshot.this.config.jumpThreshold).booleanValue()) {
                                    return Unit.INSTANCE;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(viewportHint, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super ViewportHint> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {595, 218}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass2(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PageFetcherSnapshot pageFetcherSnapshot;
            PageFetcherSnapshotState.Holder holder;
            Mutex mutex;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
                        mutex = (Mutex) this.L$1;
                        holder = (PageFetcherSnapshotState.Holder) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                pageFetcherSnapshot = PageFetcherSnapshot.this;
                holder = pageFetcherSnapshot.stateHolder;
                Mutex mutex2 = holder.lock;
                this.L$0 = holder;
                this.L$1 = mutex2;
                this.L$2 = pageFetcherSnapshot;
                this.label = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                Flow<Integer> flowConsumePrependGenerationIdAsFlow = holder.state.consumePrependGenerationIdAsFlow();
                mutex.unlock(null);
                LoadType loadType = LoadType.PREPEND;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (pageFetcherSnapshot.collectAsGenerationalViewportHints(flowConsumePrependGenerationIdAsFlow, loadType, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {595, SportReportBaseParser.ReportType.targetValueNumber}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1"})
    public static final class C12553 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C12553(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new C12553(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12553) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PageFetcherSnapshot pageFetcherSnapshot;
            PageFetcherSnapshotState.Holder holder;
            Mutex mutex;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
                        mutex = (Mutex) this.L$1;
                        holder = (PageFetcherSnapshotState.Holder) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                pageFetcherSnapshot = PageFetcherSnapshot.this;
                holder = pageFetcherSnapshot.stateHolder;
                Mutex mutex2 = holder.lock;
                this.L$0 = holder;
                this.L$1 = mutex2;
                this.L$2 = pageFetcherSnapshot;
                this.label = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                Flow<Integer> flowConsumeAppendGenerationIdAsFlow = holder.state.consumeAppendGenerationIdAsFlow();
                mutex.unlock(null);
                LoadType loadType = LoadType.APPEND;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (pageFetcherSnapshot.collectAsGenerationalViewportHints(flowConsumeAppendGenerationIdAsFlow, loadType, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    public PageFetcherSnapshot(@Nullable Key key, @NotNull PagingSource<Key, Value> pagingSource, @NotNull PagingConfig config, @NotNull Flow<Unit> retryFlow, boolean z, @Nullable RemoteMediatorConnection<Key, Value> remoteMediatorConnection, @Nullable PagingState<Key, Value> pagingState, @NotNull Function0<Unit> invalidate) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(invalidate, "invalidate");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.triggerRemoteRefresh = z;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.previousPagingState = pagingState;
        this.invalidate = invalidate;
        if (!(config.jumpThreshold == Integer.MIN_VALUE || pagingSource.getJumpingSupported())) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.hintSharedFlow = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.pageEventChannelFlowJob = completableJobJob$default;
        this.pageEventFlow = CancelableChannelFlowKt.cancelableChannelFlow(completableJobJob$default, new PageFetcherSnapshot$pageEventFlow$1(this, null));
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.INSTANCE.create(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i == pageFetcherSnapshotState.generationId$paging_common(loadType) && !(pageFetcherSnapshotState.getSourceLoadStates().get$paging_common(loadType) instanceof LoadState.Error) && i2 < this.config.prefetchDistance) {
            return loadType == LoadType.PREPEND ? (Key) ((PagingSource.LoadResult.Page) CollectionsKt___CollectionsKt.first((List) pageFetcherSnapshotState.getPages$paging_common())).getPrevKey() : (Key) ((PagingSource.LoadResult.Page) CollectionsKt___CollectionsKt.last((List) pageFetcherSnapshotState.getPages$paging_common())).getNextKey();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConsumingHints(CoroutineScope coroutineScope) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C12541(null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C12553(null), 3, null);
    }

    public final void accessHint(@NotNull ViewportHint viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        if (viewportHint instanceof ViewportHint.Access) {
            this.lastHint = (ViewportHint.Access) viewportHint;
        }
        this.hintSharedFlow.tryEmit(viewportHint);
    }

    public final void close() {
        Job.DefaultImpls.cancel$default((Job) this.pageEventChannelFlowJob, (CancellationException) null, 1, (Object) null);
    }

    public final /* synthetic */ Object collectAsGenerationalViewportHints(Flow<Integer> flow, final LoadType loadType, Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.conflate(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(flow, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, this, loadType)), new AnonymousClass3(loadType, null))).collect(new FlowCollector<GenerationalViewportHint>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(GenerationalViewportHint generationalViewportHint, @NotNull Continuation continuation2) throws Throwable {
                Object objDoLoad = this.this$0.doLoad(loadType, generationalViewportHint, continuation2);
                return objDoLoad == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDoLoad : Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object currentPagingState(@NotNull Continuation<? super PagingState<Key, Value>> continuation) {
        C12501 c12501;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        Mutex mutex;
        if (continuation instanceof C12501) {
            c12501 = (C12501) continuation;
            int i = c12501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12501.label = i - Integer.MIN_VALUE;
            } else {
                c12501 = new C12501(continuation);
            }
        } else {
            c12501 = new C12501(continuation);
        }
        Object obj = c12501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            holder = this.stateHolder;
            Mutex mutex2 = ((PageFetcherSnapshotState.Holder) holder).lock;
            c12501.L$0 = this;
            c12501.L$1 = holder;
            c12501.L$2 = mutex2;
            c12501.label = 1;
            if (mutex2.lock(null, c12501) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pageFetcherSnapshot = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c12501.L$2;
            holder = (PageFetcherSnapshotState.Holder) c12501.L$1;
            pageFetcherSnapshot = (PageFetcherSnapshot) c12501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return ((PageFetcherSnapshotState.Holder) holder).state.currentPagingState$paging_common(pageFetcherSnapshot.lastHint);
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0271  */
    /* JADX WARN: Code duplicated, block: B:107:0x0275  */
    /* JADX WARN: Code duplicated, block: B:109:0x028d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5 A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #6 {all -> 0x02bf, blocks: (B:110:0x028e, B:112:0x02a5), top: B:137:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x019b A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:56:0x0183, B:58:0x019b, B:61:0x01a8, B:63:0x01b1, B:64:0x01ba), top: B:128:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1 A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:56:0x0183, B:58:0x019b, B:61:0x01a8, B:63:0x01b1, B:64:0x01ba), top: B:128:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0218  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0237  */
    /* JADX WARN: Code duplicated, block: B:93:0x024e  */
    /* JADX WARN: Code duplicated, block: B:96:0x025b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v33, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    public final /* synthetic */ Object doInitialLoad(Continuation<? super Unit> continuation) throws Throwable {
        C12511 c12511;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot pageFetcherSnapshot;
        Mutex mutex;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        LoadType loadType;
        PageFetcherSnapshot pageFetcherSnapshot2;
        PageFetcherSnapshot pageFetcherSnapshot3;
        PagingSource.LoadResult loadResult;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        Mutex mutex2;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        Mutex mutex3;
        boolean zBooleanValue;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        Mutex mutex4;
        PageFetcherSnapshotState pageFetcherSnapshotState2;
        LoadState.NotLoading.Companion companion;
        PagingSource.LoadResult loadResult2;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        Mutex mutex5;
        Mutex mutex6;
        PagingSource.LoadResult loadResult3;
        PageFetcherSnapshot pageFetcherSnapshot5;
        Channel<PageEvent<Value>> channel;
        PageEvent<Value> pageEvent$paging_common;
        PagingSource.LoadResult.Page page;
        PageFetcherSnapshotState.Holder<Key, Value> holder6;
        Mutex mutex7;
        Mutex mutex8;
        PageFetcherSnapshot pageFetcherSnapshot6;
        PagingState<Key, Value> pagingStateCurrentPagingState$paging_common;
        PagingSource.LoadResult.Page page2;
        Mutex mutex9;
        Throwable th;
        PageFetcherSnapshotState pageFetcherSnapshotState3;
        LoadState.Error error;
        LoadType loadType2;
        Channel<PageEvent<Value>> channel2;
        PageEvent.LoadStateUpdate loadStateUpdate;
        if (continuation instanceof C12511) {
            c12511 = (C12511) continuation;
            int i = c12511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12511.label = i - Integer.MIN_VALUE;
            } else {
                c12511 = new C12511(continuation);
            }
        } else {
            c12511 = new C12511(continuation);
        }
        Object objLoad = c12511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c12511.label;
        try {
            try {
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(objLoad);
                        holder = this.stateHolder;
                        Mutex mutex10 = ((PageFetcherSnapshotState.Holder) holder).lock;
                        c12511.L$0 = this;
                        c12511.L$1 = holder;
                        c12511.L$2 = mutex10;
                        c12511.label = 1;
                        if (mutex10.lock(null, c12511) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot = this;
                        mutex = mutex10;
                        pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                        loadType = LoadType.REFRESH;
                        c12511.L$0 = pageFetcherSnapshot;
                        c12511.L$1 = mutex;
                        c12511.L$2 = null;
                        c12511.label = 2;
                        if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState, loadType, c12511) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot2 = pageFetcherSnapshot;
                        r2 = mutex;
                        Unit unit = Unit.INSTANCE;
                        r2.unlock(null);
                        PagingSource.LoadParams<Key> loadParams = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        PagingSource<Key, Value> pagingSource = pageFetcherSnapshot2.pagingSource;
                        c12511.L$0 = pageFetcherSnapshot2;
                        c12511.L$1 = null;
                        c12511.label = 3;
                        objLoad = pagingSource.load(loadParams, c12511);
                        if (objLoad == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                        loadResult = (PagingSource.LoadResult) objLoad;
                        if (loadResult instanceof PagingSource.LoadResult.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            mutex3 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder3;
                            c12511.L$3 = mutex3;
                            c12511.label = 4;
                            if (mutex3.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            try {
                                Boolean boolBoxBoolean = Boxing.boxBoolean(((PageFetcherSnapshotState.Holder) holder3).state.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult));
                                mutex3.unlock(null);
                                zBooleanValue = boolBoxBoolean.booleanValue();
                                holder4 = pageFetcherSnapshot3.stateHolder;
                                mutex4 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                c12511.L$0 = pageFetcherSnapshot3;
                                c12511.L$1 = loadResult;
                                c12511.L$2 = holder4;
                                c12511.L$3 = mutex4;
                                c12511.Z$0 = zBooleanValue;
                                c12511.label = 5;
                                if (mutex4.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                try {
                                    pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                    LoadType loadType3 = LoadType.REFRESH;
                                    companion = LoadState.NotLoading.INSTANCE;
                                    pageFetcherSnapshotState2.setSourceLoadState(loadType3, companion.getIncomplete$paging_common());
                                    if (((PagingSource.LoadResult.Page) loadResult).getPrevKey() == null) {
                                        pageFetcherSnapshotState2.setSourceLoadState(LoadType.PREPEND, companion.getComplete$paging_common());
                                    }
                                    if (((PagingSource.LoadResult.Page) loadResult).getNextKey() == null) {
                                        pageFetcherSnapshotState2.setSourceLoadState(LoadType.APPEND, companion.getComplete$paging_common());
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    mutex4.unlock(null);
                                    if (zBooleanValue) {
                                        holder5 = pageFetcherSnapshot3.stateHolder;
                                        mutex5 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                        c12511.L$0 = pageFetcherSnapshot3;
                                        c12511.L$1 = loadResult;
                                        c12511.L$2 = holder5;
                                        c12511.L$3 = mutex5;
                                        c12511.label = 6;
                                        if (mutex5.lock(null, c12511) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutex6 = mutex5;
                                        loadResult3 = loadResult;
                                        pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                        PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                        channel = pageFetcherSnapshot5.pageEventCh;
                                        pageEvent$paging_common = pageFetcherSnapshotState4.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                                        c12511.L$0 = pageFetcherSnapshot5;
                                        c12511.L$1 = loadResult3;
                                        c12511.L$2 = mutex6;
                                        c12511.L$3 = null;
                                        c12511.label = 7;
                                        if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        loadResult2 = loadResult3;
                                        pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                        r2 = mutex6;
                                        Unit unit3 = Unit.INSTANCE;
                                        r2.unlock(null);
                                    } else {
                                        loadResult2 = loadResult;
                                        pageFetcherSnapshot4 = pageFetcherSnapshot3;
                                    }
                                    if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                        page = (PagingSource.LoadResult.Page) loadResult2;
                                        if (page.getPrevKey() != null || page.getNextKey() == null) {
                                            holder6 = pageFetcherSnapshot4.stateHolder;
                                            mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                            c12511.L$0 = pageFetcherSnapshot4;
                                            c12511.L$1 = loadResult2;
                                            c12511.L$2 = holder6;
                                            c12511.L$3 = mutex7;
                                            c12511.label = 8;
                                            if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex8 = mutex7;
                                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                            try {
                                                pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                                                mutex8.unlock(null);
                                                page2 = (PagingSource.LoadResult.Page) loadResult2;
                                                if (page2.getPrevKey() == null) {
                                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                                                }
                                                if (page2.getNextKey() == null) {
                                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                                                }
                                            } catch (Throwable th2) {
                                                mutex8.unlock(null);
                                                throw th2;
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    mutex4.unlock(null);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                mutex3.unlock(null);
                                throw th4;
                            }
                        } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            mutex2 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder2;
                            c12511.L$3 = mutex2;
                            c12511.label = 9;
                            if (mutex2.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            try {
                                pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                                loadType2 = LoadType.REFRESH;
                                if (pageFetcherSnapshotState3.setSourceLoadState(loadType2, error)) {
                                    channel2 = pageFetcherSnapshot3.pageEventCh;
                                    loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                    c12511.L$0 = mutex2;
                                    c12511.L$1 = null;
                                    c12511.L$2 = null;
                                    c12511.L$3 = null;
                                    c12511.label = 10;
                                    if (channel2.send(loadStateUpdate, c12511) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                mutex9 = mutex2;
                                Unit unit4 = Unit.INSTANCE;
                                mutex9.unlock(null);
                            } catch (Throwable th5) {
                                mutex9 = mutex2;
                                th = th5;
                                mutex9.unlock(null);
                                throw th;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Mutex mutex11 = (Mutex) c12511.L$2;
                        holder = (PageFetcherSnapshotState.Holder) c12511.L$1;
                        pageFetcherSnapshot = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        mutex = mutex11;
                        pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                        loadType = LoadType.REFRESH;
                        c12511.L$0 = pageFetcherSnapshot;
                        c12511.L$1 = mutex;
                        c12511.L$2 = null;
                        c12511.label = 2;
                        if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState, loadType, c12511) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot2 = pageFetcherSnapshot;
                        r2 = mutex;
                        Unit unit5 = Unit.INSTANCE;
                        r2.unlock(null);
                        PagingSource.LoadParams<Key> loadParams2 = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        PagingSource<Key, Value> pagingSource2 = pageFetcherSnapshot2.pagingSource;
                        c12511.L$0 = pageFetcherSnapshot2;
                        c12511.L$1 = null;
                        c12511.label = 3;
                        objLoad = pagingSource2.load(loadParams2, c12511);
                        if (objLoad == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                        loadResult = (PagingSource.LoadResult) objLoad;
                        if (loadResult instanceof PagingSource.LoadResult.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            mutex3 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder3;
                            c12511.L$3 = mutex3;
                            c12511.label = 4;
                            if (mutex3.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean boolBoxBoolean2 = Boxing.boxBoolean(((PageFetcherSnapshotState.Holder) holder3).state.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult));
                            mutex3.unlock(null);
                            zBooleanValue = boolBoxBoolean2.booleanValue();
                            holder4 = pageFetcherSnapshot3.stateHolder;
                            mutex4 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder4;
                            c12511.L$3 = mutex4;
                            c12511.Z$0 = zBooleanValue;
                            c12511.label = 5;
                            if (mutex4.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            LoadType loadType4 = LoadType.REFRESH;
                            companion = LoadState.NotLoading.INSTANCE;
                            pageFetcherSnapshotState2.setSourceLoadState(loadType4, companion.getIncomplete$paging_common());
                            if (((PagingSource.LoadResult.Page) loadResult).getPrevKey() == null) {
                                pageFetcherSnapshotState2.setSourceLoadState(LoadType.PREPEND, companion.getComplete$paging_common());
                            }
                            if (((PagingSource.LoadResult.Page) loadResult).getNextKey() == null) {
                                pageFetcherSnapshotState2.setSourceLoadState(LoadType.APPEND, companion.getComplete$paging_common());
                            }
                            Unit unit6 = Unit.INSTANCE;
                            mutex4.unlock(null);
                            if (zBooleanValue) {
                                holder5 = pageFetcherSnapshot3.stateHolder;
                                mutex5 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                c12511.L$0 = pageFetcherSnapshot3;
                                c12511.L$1 = loadResult;
                                c12511.L$2 = holder5;
                                c12511.L$3 = mutex5;
                                c12511.label = 6;
                                if (mutex5.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex6 = mutex5;
                                loadResult3 = loadResult;
                                pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                PageFetcherSnapshotState pageFetcherSnapshotState5 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                channel = pageFetcherSnapshot5.pageEventCh;
                                pageEvent$paging_common = pageFetcherSnapshotState5.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                                c12511.L$0 = pageFetcherSnapshot5;
                                c12511.L$1 = loadResult3;
                                c12511.L$2 = mutex6;
                                c12511.L$3 = null;
                                c12511.label = 7;
                                if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadResult2 = loadResult3;
                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                r2 = mutex6;
                                Unit unit7 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                loadResult2 = loadResult;
                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                            }
                            if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                page = (PagingSource.LoadResult.Page) loadResult2;
                                if (page.getPrevKey() != null) {
                                }
                                holder6 = pageFetcherSnapshot4.stateHolder;
                                mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                c12511.L$0 = pageFetcherSnapshot4;
                                c12511.L$1 = loadResult2;
                                c12511.L$2 = holder6;
                                c12511.L$3 = mutex7;
                                c12511.label = 8;
                                if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex8 = mutex7;
                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                                mutex8.unlock(null);
                                page2 = (PagingSource.LoadResult.Page) loadResult2;
                                if (page2.getPrevKey() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                                }
                                if (page2.getNextKey() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                                }
                            }
                            break;
                        } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            mutex2 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder2;
                            c12511.L$3 = mutex2;
                            c12511.label = 9;
                            if (mutex2.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                            loadType2 = LoadType.REFRESH;
                            if (pageFetcherSnapshotState3.setSourceLoadState(loadType2, error)) {
                                channel2 = pageFetcherSnapshot3.pageEventCh;
                                loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                c12511.L$0 = mutex2;
                                c12511.L$1 = null;
                                c12511.L$2 = null;
                                c12511.L$3 = null;
                                c12511.label = 10;
                                if (channel2.send(loadStateUpdate, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            mutex9 = mutex2;
                            Unit unit8 = Unit.INSTANCE;
                            mutex9.unlock(null);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        Mutex mutex12 = (Mutex) c12511.L$1;
                        pageFetcherSnapshot2 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        r2 = mutex12;
                        Unit unit9 = Unit.INSTANCE;
                        r2.unlock(null);
                        PagingSource.LoadParams<Key> loadParams3 = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        PagingSource<Key, Value> pagingSource3 = pageFetcherSnapshot2.pagingSource;
                        c12511.L$0 = pageFetcherSnapshot2;
                        c12511.L$1 = null;
                        c12511.label = 3;
                        objLoad = pagingSource3.load(loadParams3, c12511);
                        if (objLoad == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                        loadResult = (PagingSource.LoadResult) objLoad;
                        if (loadResult instanceof PagingSource.LoadResult.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            mutex3 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder3;
                            c12511.L$3 = mutex3;
                            c12511.label = 4;
                            if (mutex3.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean boolBoxBoolean3 = Boxing.boxBoolean(((PageFetcherSnapshotState.Holder) holder3).state.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult));
                            mutex3.unlock(null);
                            zBooleanValue = boolBoxBoolean3.booleanValue();
                            holder4 = pageFetcherSnapshot3.stateHolder;
                            mutex4 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder4;
                            c12511.L$3 = mutex4;
                            c12511.Z$0 = zBooleanValue;
                            c12511.label = 5;
                            if (mutex4.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            LoadType loadType5 = LoadType.REFRESH;
                            companion = LoadState.NotLoading.INSTANCE;
                            pageFetcherSnapshotState2.setSourceLoadState(loadType5, companion.getIncomplete$paging_common());
                            if (((PagingSource.LoadResult.Page) loadResult).getPrevKey() == null) {
                                pageFetcherSnapshotState2.setSourceLoadState(LoadType.PREPEND, companion.getComplete$paging_common());
                            }
                            if (((PagingSource.LoadResult.Page) loadResult).getNextKey() == null) {
                                pageFetcherSnapshotState2.setSourceLoadState(LoadType.APPEND, companion.getComplete$paging_common());
                            }
                            Unit unit10 = Unit.INSTANCE;
                            mutex4.unlock(null);
                            if (zBooleanValue) {
                                holder5 = pageFetcherSnapshot3.stateHolder;
                                mutex5 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                c12511.L$0 = pageFetcherSnapshot3;
                                c12511.L$1 = loadResult;
                                c12511.L$2 = holder5;
                                c12511.L$3 = mutex5;
                                c12511.label = 6;
                                if (mutex5.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex6 = mutex5;
                                loadResult3 = loadResult;
                                pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                PageFetcherSnapshotState pageFetcherSnapshotState6 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                channel = pageFetcherSnapshot5.pageEventCh;
                                pageEvent$paging_common = pageFetcherSnapshotState6.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                                c12511.L$0 = pageFetcherSnapshot5;
                                c12511.L$1 = loadResult3;
                                c12511.L$2 = mutex6;
                                c12511.L$3 = null;
                                c12511.label = 7;
                                if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadResult2 = loadResult3;
                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                r2 = mutex6;
                                Unit unit11 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                loadResult2 = loadResult;
                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                            }
                            if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                page = (PagingSource.LoadResult.Page) loadResult2;
                                if (page.getPrevKey() != null) {
                                }
                                holder6 = pageFetcherSnapshot4.stateHolder;
                                mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                c12511.L$0 = pageFetcherSnapshot4;
                                c12511.L$1 = loadResult2;
                                c12511.L$2 = holder6;
                                c12511.L$3 = mutex7;
                                c12511.label = 8;
                                if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex8 = mutex7;
                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                                mutex8.unlock(null);
                                page2 = (PagingSource.LoadResult.Page) loadResult2;
                                if (page2.getPrevKey() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                                }
                                if (page2.getNextKey() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                                }
                            }
                            break;
                        } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            mutex2 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder2;
                            c12511.L$3 = mutex2;
                            c12511.label = 9;
                            if (mutex2.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                            loadType2 = LoadType.REFRESH;
                            if (pageFetcherSnapshotState3.setSourceLoadState(loadType2, error)) {
                                channel2 = pageFetcherSnapshot3.pageEventCh;
                                loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                c12511.L$0 = mutex2;
                                c12511.L$1 = null;
                                c12511.L$2 = null;
                                c12511.L$3 = null;
                                c12511.label = 10;
                                if (channel2.send(loadStateUpdate, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            mutex9 = mutex2;
                            Unit unit12 = Unit.INSTANCE;
                            mutex9.unlock(null);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        PageFetcherSnapshot pageFetcherSnapshot7 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        pageFetcherSnapshot3 = pageFetcherSnapshot7;
                        loadResult = (PagingSource.LoadResult) objLoad;
                        if (loadResult instanceof PagingSource.LoadResult.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            mutex3 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder3;
                            c12511.L$3 = mutex3;
                            c12511.label = 4;
                            if (mutex3.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean boolBoxBoolean4 = Boxing.boxBoolean(((PageFetcherSnapshotState.Holder) holder3).state.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult));
                            mutex3.unlock(null);
                            zBooleanValue = boolBoxBoolean4.booleanValue();
                            holder4 = pageFetcherSnapshot3.stateHolder;
                            mutex4 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder4;
                            c12511.L$3 = mutex4;
                            c12511.Z$0 = zBooleanValue;
                            c12511.label = 5;
                            if (mutex4.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            LoadType loadType6 = LoadType.REFRESH;
                            companion = LoadState.NotLoading.INSTANCE;
                            pageFetcherSnapshotState2.setSourceLoadState(loadType6, companion.getIncomplete$paging_common());
                            if (((PagingSource.LoadResult.Page) loadResult).getPrevKey() == null) {
                                pageFetcherSnapshotState2.setSourceLoadState(LoadType.PREPEND, companion.getComplete$paging_common());
                            }
                            if (((PagingSource.LoadResult.Page) loadResult).getNextKey() == null) {
                                pageFetcherSnapshotState2.setSourceLoadState(LoadType.APPEND, companion.getComplete$paging_common());
                            }
                            Unit unit13 = Unit.INSTANCE;
                            mutex4.unlock(null);
                            if (zBooleanValue) {
                                holder5 = pageFetcherSnapshot3.stateHolder;
                                mutex5 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                c12511.L$0 = pageFetcherSnapshot3;
                                c12511.L$1 = loadResult;
                                c12511.L$2 = holder5;
                                c12511.L$3 = mutex5;
                                c12511.label = 6;
                                if (mutex5.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex6 = mutex5;
                                loadResult3 = loadResult;
                                pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                PageFetcherSnapshotState pageFetcherSnapshotState7 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                channel = pageFetcherSnapshot5.pageEventCh;
                                pageEvent$paging_common = pageFetcherSnapshotState7.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                                c12511.L$0 = pageFetcherSnapshot5;
                                c12511.L$1 = loadResult3;
                                c12511.L$2 = mutex6;
                                c12511.L$3 = null;
                                c12511.label = 7;
                                if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                loadResult2 = loadResult3;
                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                r2 = mutex6;
                                Unit unit14 = Unit.INSTANCE;
                                r2.unlock(null);
                            } else {
                                loadResult2 = loadResult;
                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                            }
                            if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                page = (PagingSource.LoadResult.Page) loadResult2;
                                if (page.getPrevKey() != null) {
                                }
                                holder6 = pageFetcherSnapshot4.stateHolder;
                                mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                c12511.L$0 = pageFetcherSnapshot4;
                                c12511.L$1 = loadResult2;
                                c12511.L$2 = holder6;
                                c12511.L$3 = mutex7;
                                c12511.label = 8;
                                if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex8 = mutex7;
                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                                mutex8.unlock(null);
                                page2 = (PagingSource.LoadResult.Page) loadResult2;
                                if (page2.getPrevKey() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                                }
                                if (page2.getNextKey() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                                }
                            }
                            break;
                        } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            mutex2 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder2;
                            c12511.L$3 = mutex2;
                            c12511.label = 9;
                            if (mutex2.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                            loadType2 = LoadType.REFRESH;
                            if (pageFetcherSnapshotState3.setSourceLoadState(loadType2, error)) {
                                channel2 = pageFetcherSnapshot3.pageEventCh;
                                loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                c12511.L$0 = mutex2;
                                c12511.L$1 = null;
                                c12511.L$2 = null;
                                c12511.L$3 = null;
                                c12511.label = 10;
                                if (channel2.send(loadStateUpdate, c12511) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            mutex9 = mutex2;
                            Unit unit15 = Unit.INSTANCE;
                            mutex9.unlock(null);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        mutex3 = (Mutex) c12511.L$3;
                        holder3 = (PageFetcherSnapshotState.Holder) c12511.L$2;
                        loadResult = (PagingSource.LoadResult) c12511.L$1;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        Boolean boolBoxBoolean5 = Boxing.boxBoolean(((PageFetcherSnapshotState.Holder) holder3).state.insert(0, LoadType.REFRESH, (PagingSource.LoadResult.Page) loadResult));
                        mutex3.unlock(null);
                        zBooleanValue = boolBoxBoolean5.booleanValue();
                        holder4 = pageFetcherSnapshot3.stateHolder;
                        mutex4 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                        c12511.L$0 = pageFetcherSnapshot3;
                        c12511.L$1 = loadResult;
                        c12511.L$2 = holder4;
                        c12511.L$3 = mutex4;
                        c12511.Z$0 = zBooleanValue;
                        c12511.label = 5;
                        if (mutex4.lock(null, c12511) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                        LoadType loadType7 = LoadType.REFRESH;
                        companion = LoadState.NotLoading.INSTANCE;
                        pageFetcherSnapshotState2.setSourceLoadState(loadType7, companion.getIncomplete$paging_common());
                        if (((PagingSource.LoadResult.Page) loadResult).getPrevKey() == null) {
                            pageFetcherSnapshotState2.setSourceLoadState(LoadType.PREPEND, companion.getComplete$paging_common());
                        }
                        if (((PagingSource.LoadResult.Page) loadResult).getNextKey() == null) {
                            pageFetcherSnapshotState2.setSourceLoadState(LoadType.APPEND, companion.getComplete$paging_common());
                        }
                        Unit unit16 = Unit.INSTANCE;
                        mutex4.unlock(null);
                        if (zBooleanValue) {
                            holder5 = pageFetcherSnapshot3.stateHolder;
                            mutex5 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder5;
                            c12511.L$3 = mutex5;
                            c12511.label = 6;
                            if (mutex5.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex6 = mutex5;
                            loadResult3 = loadResult;
                            pageFetcherSnapshot5 = pageFetcherSnapshot3;
                            PageFetcherSnapshotState pageFetcherSnapshotState8 = ((PageFetcherSnapshotState.Holder) holder5).state;
                            channel = pageFetcherSnapshot5.pageEventCh;
                            pageEvent$paging_common = pageFetcherSnapshotState8.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                            c12511.L$0 = pageFetcherSnapshot5;
                            c12511.L$1 = loadResult3;
                            c12511.L$2 = mutex6;
                            c12511.L$3 = null;
                            c12511.label = 7;
                            if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadResult2 = loadResult3;
                            pageFetcherSnapshot4 = pageFetcherSnapshot5;
                            r2 = mutex6;
                            Unit unit17 = Unit.INSTANCE;
                            r2.unlock(null);
                        } else {
                            loadResult2 = loadResult;
                            pageFetcherSnapshot4 = pageFetcherSnapshot3;
                        }
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (PagingSource.LoadResult.Page) loadResult2;
                            if (page.getPrevKey() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            c12511.L$0 = pageFetcherSnapshot4;
                            c12511.L$1 = loadResult2;
                            c12511.L$2 = holder6;
                            c12511.L$3 = mutex7;
                            c12511.label = 8;
                            if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex8 = mutex7;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                            mutex8.unlock(null);
                            page2 = (PagingSource.LoadResult.Page) loadResult2;
                            if (page2.getPrevKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            if (page2.getNextKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        zBooleanValue = c12511.Z$0;
                        mutex4 = (Mutex) c12511.L$3;
                        holder4 = (PageFetcherSnapshotState.Holder) c12511.L$2;
                        loadResult = (PagingSource.LoadResult) c12511.L$1;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                        LoadType loadType8 = LoadType.REFRESH;
                        companion = LoadState.NotLoading.INSTANCE;
                        pageFetcherSnapshotState2.setSourceLoadState(loadType8, companion.getIncomplete$paging_common());
                        if (((PagingSource.LoadResult.Page) loadResult).getPrevKey() == null) {
                            pageFetcherSnapshotState2.setSourceLoadState(LoadType.PREPEND, companion.getComplete$paging_common());
                        }
                        if (((PagingSource.LoadResult.Page) loadResult).getNextKey() == null) {
                            pageFetcherSnapshotState2.setSourceLoadState(LoadType.APPEND, companion.getComplete$paging_common());
                        }
                        Unit unit18 = Unit.INSTANCE;
                        mutex4.unlock(null);
                        if (zBooleanValue) {
                            holder5 = pageFetcherSnapshot3.stateHolder;
                            mutex5 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                            c12511.L$0 = pageFetcherSnapshot3;
                            c12511.L$1 = loadResult;
                            c12511.L$2 = holder5;
                            c12511.L$3 = mutex5;
                            c12511.label = 6;
                            if (mutex5.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex6 = mutex5;
                            loadResult3 = loadResult;
                            pageFetcherSnapshot5 = pageFetcherSnapshot3;
                            PageFetcherSnapshotState pageFetcherSnapshotState9 = ((PageFetcherSnapshotState.Holder) holder5).state;
                            channel = pageFetcherSnapshot5.pageEventCh;
                            pageEvent$paging_common = pageFetcherSnapshotState9.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                            c12511.L$0 = pageFetcherSnapshot5;
                            c12511.L$1 = loadResult3;
                            c12511.L$2 = mutex6;
                            c12511.L$3 = null;
                            c12511.label = 7;
                            if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            loadResult2 = loadResult3;
                            pageFetcherSnapshot4 = pageFetcherSnapshot5;
                            r2 = mutex6;
                            Unit unit19 = Unit.INSTANCE;
                            r2.unlock(null);
                        } else {
                            loadResult2 = loadResult;
                            pageFetcherSnapshot4 = pageFetcherSnapshot3;
                        }
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (PagingSource.LoadResult.Page) loadResult2;
                            if (page.getPrevKey() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            c12511.L$0 = pageFetcherSnapshot4;
                            c12511.L$1 = loadResult2;
                            c12511.L$2 = holder6;
                            c12511.L$3 = mutex7;
                            c12511.label = 8;
                            if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex8 = mutex7;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                            mutex8.unlock(null);
                            page2 = (PagingSource.LoadResult.Page) loadResult2;
                            if (page2.getPrevKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            if (page2.getNextKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        Mutex mutex13 = (Mutex) c12511.L$3;
                        holder5 = (PageFetcherSnapshotState.Holder) c12511.L$2;
                        loadResult3 = (PagingSource.LoadResult) c12511.L$1;
                        pageFetcherSnapshot5 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        mutex6 = mutex13;
                        PageFetcherSnapshotState pageFetcherSnapshotState10 = ((PageFetcherSnapshotState.Holder) holder5).state;
                        channel = pageFetcherSnapshot5.pageEventCh;
                        pageEvent$paging_common = pageFetcherSnapshotState10.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                        c12511.L$0 = pageFetcherSnapshot5;
                        c12511.L$1 = loadResult3;
                        c12511.L$2 = mutex6;
                        c12511.L$3 = null;
                        c12511.label = 7;
                        if (channel.send(pageEvent$paging_common, c12511) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        loadResult2 = loadResult3;
                        pageFetcherSnapshot4 = pageFetcherSnapshot5;
                        r2 = mutex6;
                        Unit unit110 = Unit.INSTANCE;
                        r2.unlock(null);
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (PagingSource.LoadResult.Page) loadResult2;
                            if (page.getPrevKey() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            c12511.L$0 = pageFetcherSnapshot4;
                            c12511.L$1 = loadResult2;
                            c12511.L$2 = holder6;
                            c12511.L$3 = mutex7;
                            c12511.label = 8;
                            if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex8 = mutex7;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                            mutex8.unlock(null);
                            page2 = (PagingSource.LoadResult.Page) loadResult2;
                            if (page2.getPrevKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            if (page2.getNextKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 7:
                        Mutex mutex14 = (Mutex) c12511.L$2;
                        loadResult2 = (PagingSource.LoadResult) c12511.L$1;
                        pageFetcherSnapshot4 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        r2 = mutex14;
                        Unit unit111 = Unit.INSTANCE;
                        r2.unlock(null);
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (PagingSource.LoadResult.Page) loadResult2;
                            if (page.getPrevKey() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            mutex7 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            c12511.L$0 = pageFetcherSnapshot4;
                            c12511.L$1 = loadResult2;
                            c12511.L$2 = holder6;
                            c12511.L$3 = mutex7;
                            c12511.label = 8;
                            if (mutex7.lock(null, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex8 = mutex7;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                            mutex8.unlock(null);
                            page2 = (PagingSource.LoadResult.Page) loadResult2;
                            if (page2.getPrevKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            if (page2.getNextKey() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 8:
                        mutex8 = (Mutex) c12511.L$3;
                        holder6 = (PageFetcherSnapshotState.Holder) c12511.L$2;
                        loadResult2 = (PagingSource.LoadResult) c12511.L$1;
                        pageFetcherSnapshot6 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        pagingStateCurrentPagingState$paging_common = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common(pageFetcherSnapshot6.lastHint);
                        mutex8.unlock(null);
                        page2 = (PagingSource.LoadResult.Page) loadResult2;
                        if (page2.getPrevKey() == null) {
                            pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common);
                        }
                        if (page2.getNextKey() == null) {
                            pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common);
                        }
                        return Unit.INSTANCE;
                    case 9:
                        Mutex mutex15 = (Mutex) c12511.L$3;
                        holder2 = (PageFetcherSnapshotState.Holder) c12511.L$2;
                        loadResult = (PagingSource.LoadResult) c12511.L$1;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) c12511.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        mutex2 = mutex15;
                        pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                        error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable());
                        loadType2 = LoadType.REFRESH;
                        if (pageFetcherSnapshotState3.setSourceLoadState(loadType2, error)) {
                            channel2 = pageFetcherSnapshot3.pageEventCh;
                            loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                            c12511.L$0 = mutex2;
                            c12511.L$1 = null;
                            c12511.L$2 = null;
                            c12511.L$3 = null;
                            c12511.label = 10;
                            if (channel2.send(loadStateUpdate, c12511) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        mutex9 = mutex2;
                        Unit unit112 = Unit.INSTANCE;
                        mutex9.unlock(null);
                        return Unit.INSTANCE;
                    case 10:
                        mutex9 = (Mutex) c12511.L$0;
                        try {
                            ResultKt.throwOnFailure(objLoad);
                            Unit unit113 = Unit.INSTANCE;
                            mutex9.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th6) {
                            th = th6;
                            mutex9.unlock(null);
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th7) {
                r2.unlock(null);
                throw th7;
            }
        } catch (Throwable th8) {
            r2.unlock(null);
            throw th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:102:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:104:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:115:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0409  */
    /* JADX WARN: Code duplicated, block: B:121:0x042d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x042e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0453  */
    /* JADX WARN: Code duplicated, block: B:129:0x0467  */
    /* JADX WARN: Code duplicated, block: B:133:0x0470  */
    /* JADX WARN: Code duplicated, block: B:143:0x048b  */
    /* JADX WARN: Code duplicated, block: B:145:0x048f  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:151:0x04c6 A[Catch: all -> 0x04eb, TRY_LEAVE, TryCatch #5 {all -> 0x04eb, blocks: (B:149:0x04b1, B:151:0x04c6), top: B:246:0x04b1 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x04e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:164:0x0508  */
    /* JADX WARN: Code duplicated, block: B:167:0x0514  */
    /* JADX WARN: Code duplicated, block: B:168:0x0517  */
    /* JADX WARN: Code duplicated, block: B:171:0x0542 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:0x0543  */
    /* JADX WARN: Code duplicated, block: B:175:0x055c A[Catch: all -> 0x0595, TRY_LEAVE, TryCatch #1 {all -> 0x0595, blocks: (B:173:0x054e, B:175:0x055c), top: B:239:0x054e }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0582 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x0583  */
    /* JADX WARN: Code duplicated, block: B:185:0x05af A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:179:0x058c, B:183:0x059c, B:185:0x05af, B:187:0x05bb, B:189:0x05bf, B:191:0x05cc, B:190:0x05c6, B:192:0x05cf, B:196:0x0605, B:14:0x0083, B:19:0x00bd), top: B:237:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x05bf A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:179:0x058c, B:183:0x059c, B:185:0x05af, B:187:0x05bb, B:189:0x05bf, B:191:0x05cc, B:190:0x05c6, B:192:0x05cf, B:196:0x0605, B:14:0x0083, B:19:0x00bd), top: B:237:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x05c6 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:179:0x058c, B:183:0x059c, B:185:0x05af, B:187:0x05bb, B:189:0x05bf, B:191:0x05cc, B:190:0x05c6, B:192:0x05cf, B:196:0x0605, B:14:0x0083, B:19:0x00bd), top: B:237:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x05f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:195:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:199:0x060f  */
    /* JADX WARN: Code duplicated, block: B:202:0x061a  */
    /* JADX WARN: Code duplicated, block: B:205:0x061f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0629  */
    /* JADX WARN: Code duplicated, block: B:211:0x062e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:215:0x0659 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:219:0x0669  */
    /* JADX WARN: Code duplicated, block: B:221:0x0672  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:91:0x0363  */
    /* JADX WARN: Code duplicated, block: B:93:0x0385 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0386  */
    /* JADX WARN: Code duplicated, block: B:97:0x0394  */
    /* JADX WARN: Code duplicated, block: B:99:0x039f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v57, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r12v54, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [T] */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v39, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v22, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r9v23, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:210:0x062c -> B:222:0x0679). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x0630 -> B:222:0x0679). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x0657 -> B:252:0x065a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final /* synthetic */ java.lang.Object doLoad(androidx.paging.LoadType r18, androidx.paging.GenerationalViewportHint r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doLoad(androidx.paging.LoadType, androidx.paging.GenerationalViewportHint, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Key getInitialKey$paging_common() {
        return this.initialKey;
    }

    @NotNull
    public final Flow<PageEvent<Value>> getPageEventFlow() {
        return this.pageEventFlow;
    }

    @NotNull
    public final PagingSource<Key, Value> getPagingSource$paging_common() {
        return this.pagingSource;
    }

    @Nullable
    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public final /* synthetic */ Object retryLoadError(LoadType loadType, ViewportHint viewportHint, Continuation<? super Unit> continuation) throws Throwable {
        if (WhenMappings.$EnumSwitchMapping$1[loadType.ordinal()] != 1) {
            if (!(viewportHint != null)) {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
            this.hintSharedFlow.tryEmit(viewportHint);
        } else {
            Object objDoInitialLoad = doInitialLoad(continuation);
            if (objDoInitialLoad == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objDoInitialLoad;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, Continuation<? super Unit> continuation) {
        C12531 c12531;
        if (continuation instanceof C12531) {
            c12531 = (C12531) continuation;
            int i = c12531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12531.label = i - Integer.MIN_VALUE;
            } else {
                c12531 = new C12531(continuation);
            }
        } else {
            c12531 = new C12531(continuation);
        }
        Object obj = c12531.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            LoadState.Loading loading = LoadState.Loading.INSTANCE;
            if (pageFetcherSnapshotState.setSourceLoadState(loadType, loading)) {
                Channel<PageEvent<Value>> channel = this.pageEventCh;
                PageEvent.LoadStateUpdate loadStateUpdate = new PageEvent.LoadStateUpdate(loadType, false, loading);
                c12531.label = 1;
                if (channel.send(loadStateUpdate, c12531) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, Flow flow, boolean z, RemoteMediatorConnection remoteMediatorConnection, PagingState pagingState, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, pagingSource, pagingConfig, flow, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : remoteMediatorConnection, (i & 64) != 0 ? null : pagingState, (i & 128) != 0 ? new Function0<Unit>() { // from class: androidx.paging.PageFetcherSnapshot.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0);
    }
}
