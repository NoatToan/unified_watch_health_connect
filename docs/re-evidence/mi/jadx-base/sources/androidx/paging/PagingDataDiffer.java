package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u001e\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010%\u001a\u00020\u001a2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019J\u001f\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\nH\u0002J\u001a\u0010-\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010.\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0002\u0010/J\u0017\u00100\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010.\u001a\u00020\u0010¢\u0006\u0002\u0010/J\b\u00101\u001a\u00020\u0012H\u0016JM\u00102\u001a\u0004\u0018\u00010\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0006\u00106\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a08H¦@ø\u0001\u0000¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u001aJ\u001a\u0010;\u001a\u00020\u001a2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019J\u0006\u0010<\u001a\u00020\u001aJ\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/paging/PagingDataDiffer;", "T", "", "differCallback", "Landroidx/paging/DifferCallback;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/paging/DifferCallback;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_combinedLoadState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/CombinedLoadStates;", "collectFromRunner", "Landroidx/paging/SingleRunner;", "combinedLoadStates", "Landroidx/paging/MutableLoadStateCollection;", "lastAccessedIndex", "", "lastAccessedIndexUnfulfilled", "", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "loadStateListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "presenter", "Landroidx/paging/PagePresenter;", "processPageEventCallback", "androidx/paging/PagingDataDiffer$processPageEventCallback$1", "Landroidx/paging/PagingDataDiffer$processPageEventCallback$1;", "receiver", "Landroidx/paging/UiReceiver;", MediaStoreUtil.MediaInfo.SIZE, "getSize", "()I", "addLoadStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "collectFrom", "pagingData", "Landroidx/paging/PagingData;", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchLoadStates", "states", "get", "index", "(I)Ljava/lang/Object;", "peek", "postEvents", "presentNewList", "previousList", "Landroidx/paging/NullPaddedList;", "newList", "newCombinedLoadStates", "onListPresentable", "Lkotlin/Function0;", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;Landroidx/paging/CombinedLoadStates;ILkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "removeLoadStateListener", b.M, "snapshot", "Landroidx/paging/ItemSnapshotList;", "paging-common"}, k = 1, mv = {1, 4, 2})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class PagingDataDiffer<T> {
    private final MutableStateFlow<CombinedLoadStates> _combinedLoadState;
    private final SingleRunner collectFromRunner;
    private final MutableLoadStateCollection combinedLoadStates;
    private final DifferCallback differCallback;
    private volatile int lastAccessedIndex;
    private volatile boolean lastAccessedIndexUnfulfilled;
    private final CopyOnWriteArrayList<Function1<CombinedLoadStates, Unit>> loadStateListeners;
    private final CoroutineDispatcher mainDispatcher;
    private PagePresenter<T> presenter;
    private final PagingDataDiffer$processPageEventCallback$1 processPageEventCallback;
    private UiReceiver receiver;

    /* JADX INFO: renamed from: androidx.paging.PagingDataDiffer$collectFrom$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PagingData $pagingData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PagingData pagingData, Continuation continuation) {
            super(1, continuation);
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass2(this.$pagingData, completion);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PagingDataDiffer.this.receiver = this.$pagingData.getReceiver();
                Flow<PageEvent<T>> flow$paging_common = this.$pagingData.getFlow$paging_common();
                PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 = new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(this);
                this.label = 1;
                if (flow$paging_common.collect(pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.paging.PagingDataDiffer$processPageEventCallback$1] */
    public PagingDataDiffer(@NotNull DifferCallback differCallback, @NotNull CoroutineDispatcher mainDispatcher) {
        Intrinsics.checkNotNullParameter(differCallback, "differCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.differCallback = differCallback;
        this.mainDispatcher = mainDispatcher;
        this.presenter = PagePresenter.INSTANCE.initial$paging_common();
        MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
        this.combinedLoadStates = mutableLoadStateCollection;
        this.loadStateListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, null);
        this.processPageEventCallback = new PagePresenter.ProcessPageEventCallback() { // from class: androidx.paging.PagingDataDiffer$processPageEventCallback$1
            @Override // androidx.paging.PagePresenter.ProcessPageEventCallback
            public void onChanged(int position, int count) {
                this.this$0.differCallback.onChanged(position, count);
            }

            @Override // androidx.paging.PagePresenter.ProcessPageEventCallback
            public void onInserted(int position, int count) {
                this.this$0.differCallback.onInserted(position, count);
            }

            @Override // androidx.paging.PagePresenter.ProcessPageEventCallback
            public void onRemoved(int position, int count) {
                this.this$0.differCallback.onRemoved(position, count);
            }

            @Override // androidx.paging.PagePresenter.ProcessPageEventCallback
            public void onStateUpdate(@NotNull LoadType loadType, boolean fromMediator, @NotNull LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (Intrinsics.areEqual(this.this$0.combinedLoadStates.get(loadType, fromMediator), loadState)) {
                    return;
                }
                this.this$0.combinedLoadStates.set(loadType, fromMediator, loadState);
                CombinedLoadStates combinedLoadStatesSnapshot = this.this$0.combinedLoadStates.snapshot();
                Iterator it = this.this$0.loadStateListeners.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke2(combinedLoadStatesSnapshot);
                }
            }
        };
        this._combinedLoadState = StateFlowKt.MutableStateFlow(mutableLoadStateCollection.snapshot());
        addLoadStateListener(new Function1<CombinedLoadStates, Unit>() { // from class: androidx.paging.PagingDataDiffer.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(CombinedLoadStates combinedLoadStates) {
                invoke2(combinedLoadStates);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CombinedLoadStates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PagingDataDiffer.this._combinedLoadState.setValue(it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchLoadStates(CombinedLoadStates states) {
        if (Intrinsics.areEqual(this.combinedLoadStates.snapshot(), states)) {
            return;
        }
        this.combinedLoadStates.set(states);
        Iterator<T> it = this.loadStateListeners.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(states);
        }
    }

    public final void addLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.loadStateListeners.add(listener);
        listener.invoke2(this.combinedLoadStates.snapshot());
    }

    @Nullable
    public final Object collectFrom(@NotNull PagingData<T> pagingData, @NotNull Continuation<? super Unit> continuation) {
        Object objRunInIsolation$default = SingleRunner.runInIsolation$default(this.collectFromRunner, 0, new AnonymousClass2(pagingData, null), continuation, 1, null);
        return objRunInIsolation$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunInIsolation$default : Unit.INSTANCE;
    }

    @Nullable
    public final T get(@IntRange(from = 0) int index) {
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = index;
        UiReceiver uiReceiver = this.receiver;
        if (uiReceiver != null) {
            uiReceiver.accessHint(this.presenter.accessHintForPresenterIndex(index));
        }
        return this.presenter.get(index);
    }

    @NotNull
    public final Flow<CombinedLoadStates> getLoadStateFlow() {
        return this._combinedLoadState;
    }

    public final int getSize() {
        return this.presenter.getSize();
    }

    @Nullable
    public final T peek(@IntRange(from = 0) int index) {
        return this.presenter.get(index);
    }

    public boolean postEvents() {
        return false;
    }

    @Nullable
    public abstract Object presentNewList(@NotNull NullPaddedList<T> nullPaddedList, @NotNull NullPaddedList<T> nullPaddedList2, @NotNull CombinedLoadStates combinedLoadStates, int i, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Integer> continuation);

    public final void refresh() {
        UiReceiver uiReceiver = this.receiver;
        if (uiReceiver != null) {
            uiReceiver.refresh();
        }
    }

    public final void removeLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.loadStateListeners.remove(listener);
    }

    public final void retry() {
        UiReceiver uiReceiver = this.receiver;
        if (uiReceiver != null) {
            uiReceiver.retry();
        }
    }

    @NotNull
    public final ItemSnapshotList<T> snapshot() {
        return this.presenter.snapshot();
    }

    public /* synthetic */ PagingDataDiffer(DifferCallback differCallback, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(differCallback, (i & 2) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }
}
