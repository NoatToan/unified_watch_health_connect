package androidx.paging;

import androidx.annotation.IntRange;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0007\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@\u0012\b\b\u0002\u0010C\u001a\u00020B\u0012\b\b\u0002\u0010D\u001a\u00020B¢\u0006\u0004\bE\u0010FJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001e\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010 \u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0'¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0'¢\u0006\u0004\b,\u0010+J\u0019\u00100\u001a\u00020/2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020/2\n\u00102\u001a\u0006\u0012\u0002\b\u00030-¢\u0006\u0004\b3\u00101J%\u00104\u001a\u00020/2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-2\n\u00102\u001a\u0006\u0012\u0002\b\u00030-¢\u0006\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020(0;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Landroidx/paging/PagingDataAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$d0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;", "strategy", "", "setStateRestorationPolicy", "(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V", "", "position", "", "getItemId", "(I)J", "", "hasStableIds", "setHasStableIds", "(Z)V", "Landroidx/paging/PagingData;", "pagingData", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V", b.M, "()V", "refresh", "getItem", "(I)Ljava/lang/Object;", "index", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "getItemCount", "()I", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "Landroidx/paging/LoadStateAdapter;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "userSetRestorationPolicy", "Z", "Landroidx/paging/AsyncPagingDataDiffer;", "differ", "Landroidx/paging/AsyncPagingDataDiffer;", "Lkotlinx/coroutines/flow/Flow;", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/h$f;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public abstract class PagingDataAdapter<T, VH extends RecyclerView.d0> extends RecyclerView.Adapter<VH> {
    private final AsyncPagingDataDiffer<T> differ;

    @NotNull
    private final Flow<CombinedLoadStates> loadStateFlow;
    private boolean userSetRestorationPolicy;

    /* JADX INFO: renamed from: androidx.paging.PagingDataAdapter$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$d0;", "VH", "", "invoke", "()V", "considerAllowingStateRestoration"}, k = 3, mv = {1, 4, 2})
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (PagingDataAdapter.this.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT || PagingDataAdapter.this.userSetRestorationPolicy) {
                return;
            }
            PagingDataAdapter.this.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
        }
    }

    @JvmOverloads
    public PagingDataAdapter(@NotNull h.f<T> fVar) {
        this(fVar, null, null, 6, null);
    }

    public final void addLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    @Nullable
    public final T getItem(@IntRange(from = 0) int position) {
        return this.differ.getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int position) {
        return super.getItemId(position);
    }

    @NotNull
    public final Flow<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    @Nullable
    public final T peek(@IntRange(from = 0) int index) {
        return this.differ.peek(index);
    }

    public final void refresh() {
        this.differ.refresh();
    }

    public final void removeLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public final void retry() {
        this.differ.retry();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean hasStableIds) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(@NotNull RecyclerView.Adapter.StateRestorationPolicy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.userSetRestorationPolicy = true;
        super.setStateRestorationPolicy(strategy);
    }

    @NotNull
    public final ItemSnapshotList<T> snapshot() {
        return this.differ.snapshot();
    }

    @Nullable
    public final Object submitData(@NotNull PagingData<T> pagingData, @NotNull Continuation<? super Unit> continuation) {
        Object objSubmitData = this.differ.submitData(pagingData, continuation);
        return objSubmitData == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSubmitData : Unit.INSTANCE;
    }

    @NotNull
    public final ConcatAdapter withLoadStateFooter(@NotNull final LoadStateAdapter<?> footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        addLoadStateListener(new Function1<CombinedLoadStates, Unit>() { // from class: androidx.paging.PagingDataAdapter.withLoadStateFooter.1
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
            public final void invoke2(@NotNull CombinedLoadStates loadStates) {
                Intrinsics.checkNotNullParameter(loadStates, "loadStates");
                footer.setLoadState(loadStates.getAppend());
            }
        });
        return new ConcatAdapter(this, footer);
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeader(@NotNull final LoadStateAdapter<?> header) {
        Intrinsics.checkNotNullParameter(header, "header");
        addLoadStateListener(new Function1<CombinedLoadStates, Unit>() { // from class: androidx.paging.PagingDataAdapter.withLoadStateHeader.1
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
            public final void invoke2(@NotNull CombinedLoadStates loadStates) {
                Intrinsics.checkNotNullParameter(loadStates, "loadStates");
                header.setLoadState(loadStates.getPrepend());
            }
        });
        return new ConcatAdapter(header, this);
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeaderAndFooter(@NotNull final LoadStateAdapter<?> header, @NotNull final LoadStateAdapter<?> footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        addLoadStateListener(new Function1<CombinedLoadStates, Unit>() { // from class: androidx.paging.PagingDataAdapter.withLoadStateHeaderAndFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
            public final void invoke2(@NotNull CombinedLoadStates loadStates) {
                Intrinsics.checkNotNullParameter(loadStates, "loadStates");
                header.setLoadState(loadStates.getPrepend());
                footer.setLoadState(loadStates.getAppend());
            }
        });
        return new ConcatAdapter(header, this, footer);
    }

    @JvmOverloads
    public PagingDataAdapter(@NotNull h.f<T> fVar, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(fVar, coroutineDispatcher, null, 4, null);
    }

    public /* synthetic */ PagingDataAdapter(h.f fVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i & 2) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 4) != 0 ? Dispatchers.getDefault() : coroutineDispatcher2);
    }

    public final void submitData(@NotNull Lifecycle lifecycle, @NotNull PagingData<T> pagingData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        this.differ.submitData(lifecycle, pagingData);
    }

    @JvmOverloads
    public PagingDataAdapter(@NotNull h.f<T> diffCallback, @NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = new AsyncPagingDataDiffer<>(diffCallback, new androidx.recyclerview.widget.b(this), mainDispatcher, workerDispatcher);
        this.differ = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        registerAdapterDataObserver(new RecyclerView.i() { // from class: androidx.paging.PagingDataAdapter.2
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                anonymousClass1.invoke2();
                PagingDataAdapter.this.unregisterAdapterDataObserver(this);
                super.onItemRangeInserted(positionStart, itemCount);
            }
        });
        addLoadStateListener(new Function1<CombinedLoadStates, Unit>() { // from class: androidx.paging.PagingDataAdapter.3
            private boolean ignoreNextEvent = true;

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(CombinedLoadStates combinedLoadStates) {
                invoke2(combinedLoadStates);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull CombinedLoadStates loadStates) {
                Intrinsics.checkNotNullParameter(loadStates, "loadStates");
                if (this.ignoreNextEvent) {
                    this.ignoreNextEvent = false;
                } else if (loadStates.getSource().getRefresh() instanceof LoadState.NotLoading) {
                    anonymousClass1.invoke2();
                    PagingDataAdapter.this.removeLoadStateListener(this);
                }
            }
        });
        this.loadStateFlow = asyncPagingDataDiffer.getLoadStateFlow();
    }
}
