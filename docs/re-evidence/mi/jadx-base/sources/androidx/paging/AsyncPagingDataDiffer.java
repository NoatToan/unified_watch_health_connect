package androidx.paging;

import androidx.annotation.IntRange;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.api.b;
import defpackage.ghe;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001*\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0007\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010<\u001a\u00020;\u0012\b\b\u0002\u0010>\u001a\u00020;¢\u0006\u0004\bB\u0010CJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u001b\u0010\u001aR \u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R(\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u0017008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0011\u0010A\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", "T", "Landroidx/paging/PagingData;", "pagingData", "", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V", b.M, "()V", "refresh", "", "index", "getItem", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "Landroidx/paging/DifferCallback;", "differCallback", "Landroidx/paging/DifferCallback;", "getDifferCallback$paging_runtime_release", "()Landroidx/paging/DifferCallback;", "getDifferCallback$paging_runtime_release$annotations", "", "inGetItem", "Z", "getInGetItem$paging_runtime_release", "()Z", "setInGetItem$paging_runtime_release", "(Z)V", "getInGetItem$paging_runtime_release$annotations", "androidx/paging/AsyncPagingDataDiffer$differBase$1", "differBase", "Landroidx/paging/AsyncPagingDataDiffer$differBase$1;", "Ljava/util/concurrent/atomic/AtomicInteger;", "submitDataId", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/flow/Flow;", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "Landroidx/recyclerview/widget/h$f;", "Lghe;", "updateCallback", "Lghe;", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "workerDispatcher", "getItemCount", "()I", "itemCount", "<init>", "(Landroidx/recyclerview/widget/h$f;Lghe;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class AsyncPagingDataDiffer<T> {
    private final h.f<T> diffCallback;
    private final AsyncPagingDataDiffer$differBase$1 differBase;

    @NotNull
    private final DifferCallback differCallback;
    private boolean inGetItem;

    @NotNull
    private final Flow<CombinedLoadStates> loadStateFlow;
    private final CoroutineDispatcher mainDispatcher;
    private final AtomicInteger submitDataId;
    private final ghe updateCallback;
    private final CoroutineDispatcher workerDispatcher;

    /* JADX INFO: renamed from: androidx.paging.AsyncPagingDataDiffer$submitData$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", f = "AsyncPagingDataDiffer.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $id;
        final /* synthetic */ PagingData $pagingData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, PagingData pagingData, Continuation continuation) {
            super(2, continuation);
            this.$id = i;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass2(this.$id, this.$pagingData, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (AsyncPagingDataDiffer.this.submitDataId.get() == this.$id) {
                    AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = AsyncPagingDataDiffer.this.differBase;
                    PagingData<T> pagingData = this.$pagingData;
                    this.label = 1;
                    if (asyncPagingDataDiffer$differBase$1.collectFrom(pagingData, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @JvmOverloads
    public AsyncPagingDataDiffer(@NotNull h.f<T> fVar, @NotNull ghe gheVar) {
        this(fVar, gheVar, null, null, 12, null);
    }

    public static /* synthetic */ void getDifferCallback$paging_runtime_release$annotations() {
    }

    public static /* synthetic */ void getInGetItem$paging_runtime_release$annotations() {
    }

    public final void addLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differBase.addLoadStateListener(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: getDifferCallback$paging_runtime_release, reason: from getter */
    public final DifferCallback getDifferCallback() {
        return this.differCallback;
    }

    /* JADX INFO: renamed from: getInGetItem$paging_runtime_release, reason: from getter */
    public final boolean getInGetItem() {
        return this.inGetItem;
    }

    @Nullable
    public final T getItem(@IntRange(from = 0) int index) {
        try {
            this.inGetItem = true;
            return this.differBase.get(index);
        } finally {
            this.inGetItem = false;
        }
    }

    public final int getItemCount() {
        return this.differBase.getSize();
    }

    @NotNull
    public final Flow<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    @Nullable
    public final T peek(@IntRange(from = 0) int index) {
        return this.differBase.peek(index);
    }

    public final void refresh() {
        this.differBase.refresh();
    }

    public final void removeLoadStateListener(@NotNull Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differBase.removeLoadStateListener(listener);
    }

    public final void retry() {
        this.differBase.retry();
    }

    public final void setInGetItem$paging_runtime_release(boolean z) {
        this.inGetItem = z;
    }

    @NotNull
    public final ItemSnapshotList<T> snapshot() {
        return this.differBase.snapshot();
    }

    @Nullable
    public final Object submitData(@NotNull PagingData<T> pagingData, @NotNull Continuation<? super Unit> continuation) {
        this.submitDataId.incrementAndGet();
        Object objCollectFrom = this.differBase.collectFrom(pagingData, continuation);
        return objCollectFrom == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectFrom : Unit.INSTANCE;
    }

    @JvmOverloads
    public AsyncPagingDataDiffer(@NotNull h.f<T> fVar, @NotNull ghe gheVar, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(fVar, gheVar, coroutineDispatcher, null, 8, null);
    }

    @JvmOverloads
    public AsyncPagingDataDiffer(@NotNull h.f<T> diffCallback, @NotNull ghe updateCallback, @NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.diffCallback = diffCallback;
        this.updateCallback = updateCallback;
        this.mainDispatcher = mainDispatcher;
        this.workerDispatcher = workerDispatcher;
        DifferCallback differCallback = new DifferCallback() { // from class: androidx.paging.AsyncPagingDataDiffer$differCallback$1
            @Override // androidx.paging.DifferCallback
            public void onChanged(int position, int count) {
                if (count > 0) {
                    this.this$0.updateCallback.onChanged(position, count, null);
                }
            }

            @Override // androidx.paging.DifferCallback
            public void onInserted(int position, int count) {
                if (count > 0) {
                    this.this$0.updateCallback.onInserted(position, count);
                }
            }

            @Override // androidx.paging.DifferCallback
            public void onRemoved(int position, int count) {
                if (count > 0) {
                    this.this$0.updateCallback.onRemoved(position, count);
                }
            }
        };
        this.differCallback = differCallback;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, differCallback, mainDispatcher);
        this.differBase = asyncPagingDataDiffer$differBase$1;
        this.submitDataId = new AtomicInteger(0);
        this.loadStateFlow = asyncPagingDataDiffer$differBase$1.getLoadStateFlow();
    }

    public final void submitData(@NotNull Lifecycle lifecycle, @NotNull PagingData<T> pagingData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new AnonymousClass2(this.submitDataId.incrementAndGet(), pagingData, null), 3, null);
    }

    public /* synthetic */ AsyncPagingDataDiffer(h.f fVar, ghe gheVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, gheVar, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 8) != 0 ? Dispatchers.getDefault() : coroutineDispatcher2);
    }
}
