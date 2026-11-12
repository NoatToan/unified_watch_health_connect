package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.c.q;
import defpackage.bj1;
import defpackage.ghe;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002pqB#\b\u0017\u0012\n\u0010i\u001a\u0006\u0012\u0002\b\u00030h\u0012\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j¢\u0006\u0004\bl\u0010mB\u001f\b\u0017\u0012\u0006\u0010n\u001a\u00020)\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\bl\u0010oJ9\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0012JM\u0010\u001c\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J7\u0010\u001f\u001a\u00020\b2(\u0010\"\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0!¢\u0006\u0004\b\u001f\u0010#J\u001d\u0010$\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b$\u0010 J7\u0010$\u001a\u00020\b2(\u0010\"\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0!¢\u0006\u0004\b$\u0010#J)\u0010'\u001a\u00020\b2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0!H\u0016¢\u0006\u0004\b'\u0010#J)\u0010(\u001a\u00020\b2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0!H\u0016¢\u0006\u0004\b(\u0010#R\"\u0010*\u001a\u00020)8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R&\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R\"\u00108\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R,\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0>8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u00106\u001a\u0004\bA\u0010BR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010D\u0012\u0004\bE\u00106R$\u0010F\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bF\u0010D\u0012\u0004\bG\u00106R(\u0010H\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u00106\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bP\u0010Q\u0012\u0004\bR\u00106RD\u0010X\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110&¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020\b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR2\u0010[\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0!0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b`\u0010a\u0012\u0004\bb\u00106R\u0014\u0010d\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010KR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bg\u00106\u001a\u0004\be\u0010f¨\u0006r"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", "T", "Landroidx/paging/PagedList;", "previousList", "currentList", "Ljava/lang/Runnable;", "commitCallback", "", "onCurrentListChanged", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "", "index", "getItem", "(I)Ljava/lang/Object;", "pagedList", "submitList", "(Landroidx/paging/PagedList;)V", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "newList", "diffSnapshot", "Landroidx/paging/NullPaddedDiffResult;", "diffResult", "Landroidx/paging/RecordingCallback;", "recordingCallback", "lastAccessIndex", "latchPagedList$paging_runtime_release", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/NullPaddedDiffResult;Landroidx/paging/RecordingCallback;ILjava/lang/Runnable;)V", "latchPagedList", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addPagedListListener", "(Landroidx/paging/AsyncPagedListDiffer$PagedListListener;)V", "Lkotlin/Function2;", "callback", "(Lkotlin/jvm/functions/Function2;)V", "removePagedListListener", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "addLoadStateListener", "removeLoadStateListener", "Lghe;", "updateCallback", "Lghe;", "getUpdateCallback$paging_runtime_release", "()Lghe;", "setUpdateCallback$paging_runtime_release", "(Lghe;)V", "Landroidx/recyclerview/widget/c;", q.f13857a, "Landroidx/recyclerview/widget/c;", "getConfig$paging_runtime_release", "()Landroidx/recyclerview/widget/c;", "getConfig$paging_runtime_release$annotations", "()V", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime_release", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime_release", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release$annotations", "Landroidx/paging/PagedList;", "getPagedList$annotations", "snapshot", "getSnapshot$annotations", "maxScheduledGeneration", "I", "getMaxScheduledGeneration$paging_runtime_release", "()I", "setMaxScheduledGeneration$paging_runtime_release", "(I)V", "getMaxScheduledGeneration$paging_runtime_release$annotations", "Landroidx/paging/PagedList$LoadStateManager;", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager$annotations", "Lkotlin/reflect/KFunction2;", "Lkotlin/ParameterName;", "name", "type", "state", "loadStateListener", "Lkotlin/reflect/KFunction;", "", "loadStateListeners", "Ljava/util/List;", "getLoadStateListeners$paging_runtime_release", "()Ljava/util/List;", "Landroidx/paging/PagedList$Callback;", "pagedListCallback", "Landroidx/paging/PagedList$Callback;", "getPagedListCallback$annotations", "getItemCount", "itemCount", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/h$f;)V", "listUpdateCallback", "(Lghe;Landroidx/recyclerview/widget/c;)V", "OnCurrentListChangedWrapper", "PagedListListener", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public class AsyncPagedListDiffer<T> {

    @NotNull
    private final c<T> config;

    @NotNull
    private final CopyOnWriteArrayList<PagedListListener<T>> listeners;
    private final KFunction<Unit> loadStateListener;

    @NotNull
    private final List<Function2<LoadType, LoadState, Unit>> loadStateListeners;
    private final PagedList.LoadStateManager loadStateManager;

    @NotNull
    private Executor mainThreadExecutor;
    private int maxScheduledGeneration;
    private PagedList<T> pagedList;
    private final PagedList.Callback pagedListCallback;
    private PagedList<T> snapshot;
    public ghe updateCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B/\u0012(\u0010\u0004\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ(\u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H\u0016R3\u0010\u0004\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$OnCurrentListChangedWrapper;", "T", "", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "callback", "Lkotlin/Function2;", "Landroidx/paging/PagedList;", "", "(Lkotlin/jvm/functions/Function2;)V", "getCallback", "()Lkotlin/jvm/functions/Function2;", "onCurrentListChanged", "previousList", "currentList", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class OnCurrentListChangedWrapper<T> implements PagedListListener<T> {

        @NotNull
        private final Function2<PagedList<T>, PagedList<T>, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public OnCurrentListChangedWrapper(@NotNull Function2<? super PagedList<T>, ? super PagedList<T>, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
        }

        @NotNull
        public final Function2<PagedList<T>, PagedList<T>, Unit> getCallback() {
            return this.callback;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
        public void onCurrentListChanged(@Nullable PagedList<T> previousList, @Nullable PagedList<T> currentList) {
            this.callback.invoke(previousList, currentList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002J(\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H&¨\u0006\b"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "T", "", "onCurrentListChanged", "", "previousList", "Landroidx/paging/PagedList;", "currentList", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
    public interface PagedListListener<T> {
        void onCurrentListChanged(@Nullable PagedList<T> previousList, @Nullable PagedList<T> currentList);
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                config.diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(@NotNull ghe listUpdateCallback, @NotNull c<T> config) {
        Intrinsics.checkNotNullParameter(listUpdateCallback, "listUpdateCallback");
        Intrinsics.checkNotNullParameter(config, "config");
        Executor executorI = bj1.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        this.mainThreadExecutor = executorI;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager() { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(@NotNull LoadType type, @NotNull LoadState state) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime_release().iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(type, state);
                }
            }
        };
        this.loadStateManager = loadStateManager;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(loadStateManager);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new PagedList.Callback() { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            @Override // androidx.paging.PagedList.Callback
            public void onChanged(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onChanged(position, count, null);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onInserted(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(position, count);
            }
        };
        this.updateCallback = listUpdateCallback;
        this.config = config;
    }

    public static /* synthetic */ void getConfig$paging_runtime_release$annotations() {
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getListeners$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getLoadStateManager$annotations() {
    }

    public static /* synthetic */ void getMaxScheduledGeneration$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getPagedList$annotations() {
    }

    private static /* synthetic */ void getPagedListCallback$annotations() {
    }

    private static /* synthetic */ void getSnapshot$annotations() {
    }

    private final void onCurrentListChanged(PagedList<T> previousList, PagedList<T> currentList, Runnable commitCallback) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((PagedListListener) it.next()).onCurrentListChanged(previousList, currentList);
        }
        if (commitCallback != null) {
            commitCallback.run();
        }
    }

    public void addLoadStateListener(@NotNull Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.addWeakLoadStateListener(listener);
        } else {
            this.loadStateManager.dispatchCurrentLoadState(listener);
        }
        this.loadStateListeners.add(listener);
    }

    public void addPagedListListener(@NotNull PagedListListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @NotNull
    public final c<T> getConfig$paging_runtime_release() {
        return this.config;
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        PagedList<T> pagedList = this.snapshot;
        return pagedList != null ? pagedList : this.pagedList;
    }

    @Nullable
    public T getItem(int index) {
        PagedList<T> pagedList = this.snapshot;
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList != null) {
            return pagedList.get(index);
        }
        if (pagedList2 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList2.loadAround(index);
        return pagedList2.get(index);
    }

    public int getItemCount() {
        PagedList<T> currentList = getCurrentList();
        if (currentList != null) {
            return currentList.size();
        }
        return 0;
    }

    @NotNull
    public final CopyOnWriteArrayList<PagedListListener<T>> getListeners$paging_runtime_release() {
        return this.listeners;
    }

    @NotNull
    public final List<Function2<LoadType, LoadState, Unit>> getLoadStateListeners$paging_runtime_release() {
        return this.loadStateListeners;
    }

    @NotNull
    /* JADX INFO: renamed from: getMainThreadExecutor$paging_runtime_release, reason: from getter */
    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }

    /* JADX INFO: renamed from: getMaxScheduledGeneration$paging_runtime_release, reason: from getter */
    public final int getMaxScheduledGeneration() {
        return this.maxScheduledGeneration;
    }

    @NotNull
    public final ghe getUpdateCallback$paging_runtime_release() {
        ghe gheVar = this.updateCallback;
        if (gheVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
        }
        return gheVar;
    }

    public final void latchPagedList$paging_runtime_release(@NotNull PagedList<T> newList, @NotNull PagedList<T> diffSnapshot, @NotNull NullPaddedDiffResult diffResult, @NotNull RecordingCallback recordingCallback, int lastAccessIndex, @Nullable Runnable commitCallback) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffSnapshot, "diffSnapshot");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(recordingCallback, "recordingCallback");
        PagedList<T> pagedList = this.snapshot;
        if (pagedList == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.pagedList = newList;
        newList.addWeakLoadStateListener((Function2) this.loadStateListener);
        this.snapshot = null;
        NullPaddedList<T> nullPaddedList = pagedList.getNullPaddedList();
        ghe gheVar = this.updateCallback;
        if (gheVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
        }
        NullPaddedListDiffHelperKt.dispatchDiff(nullPaddedList, gheVar, diffSnapshot.getNullPaddedList(), diffResult);
        recordingCallback.dispatchRecordingTo(this.pagedListCallback);
        newList.addWeakCallback(this.pagedListCallback);
        if (!newList.isEmpty()) {
            newList.loadAround(RangesKt___RangesKt.coerceIn(NullPaddedListDiffHelperKt.transformAnchorIndex(pagedList.getNullPaddedList(), diffResult, diffSnapshot.getNullPaddedList(), lastAccessIndex), 0, newList.size() - 1));
        }
        onCurrentListChanged(pagedList, this.pagedList, commitCallback);
    }

    public void removeLoadStateListener(@NotNull Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.loadStateListeners.remove(listener);
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.removeWeakLoadStateListener(listener);
        }
    }

    public void removePagedListListener(@NotNull PagedListListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void setMainThreadExecutor$paging_runtime_release(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.mainThreadExecutor = executor;
    }

    public final void setMaxScheduledGeneration$paging_runtime_release(int i) {
        this.maxScheduledGeneration = i;
    }

    public final void setUpdateCallback$paging_runtime_release(@NotNull ghe gheVar) {
        Intrinsics.checkNotNullParameter(gheVar, "<set-?>");
        this.updateCallback = gheVar;
    }

    public void submitList(@Nullable PagedList<T> pagedList) {
        submitList(pagedList, null);
    }

    public final void addPagedListListener(@NotNull Function2<? super PagedList<T>, ? super PagedList<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.listeners.add(new OnCurrentListChangedWrapper(callback));
    }

    public final void removePagedListListener(@NotNull final Function2<? super PagedList<T>, ? super PagedList<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.listeners, (Function1) new Function1<PagedListListener<T>, Boolean>() { // from class: androidx.paging.AsyncPagedListDiffer.removePagedListListener.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(Object obj) {
                return Boolean.valueOf(invoke((PagedListListener) obj));
            }

            public final boolean invoke(PagedListListener<T> pagedListListener) {
                return (pagedListListener instanceof OnCurrentListChangedWrapper) && ((OnCurrentListChangedWrapper) pagedListListener).getCallback() == callback;
            }
        });
    }

    public void submitList(@Nullable final PagedList<T> pagedList, @Nullable final Runnable commitCallback) {
        final int i = this.maxScheduledGeneration + 1;
        this.maxScheduledGeneration = i;
        if (pagedList == this.pagedList) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        PagedList<T> currentList = getCurrentList();
        if (pagedList == null) {
            int itemCount = getItemCount();
            PagedList<T> pagedList2 = this.pagedList;
            if (pagedList2 != null) {
                pagedList2.removeWeakCallback(this.pagedListCallback);
                pagedList2.removeWeakLoadStateListener((Function2) this.loadStateListener);
                this.pagedList = null;
            } else if (this.snapshot != null) {
                this.snapshot = null;
            }
            ghe gheVar = this.updateCallback;
            if (gheVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
            }
            gheVar.onRemoved(0, itemCount);
            onCurrentListChanged(currentList, null, commitCallback);
            return;
        }
        if (getCurrentList() == null) {
            this.pagedList = pagedList;
            pagedList.addWeakLoadStateListener((Function2) this.loadStateListener);
            pagedList.addWeakCallback(this.pagedListCallback);
            ghe gheVar2 = this.updateCallback;
            if (gheVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
            }
            gheVar2.onInserted(0, pagedList.size());
            onCurrentListChanged(null, pagedList, commitCallback);
            return;
        }
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList3 != null) {
            pagedList3.removeWeakCallback(this.pagedListCallback);
            pagedList3.removeWeakLoadStateListener((Function2) this.loadStateListener);
            List<T> listSnapshot = pagedList3.snapshot();
            if (listSnapshot == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagedList<T>");
            }
            this.snapshot = (PagedList) listSnapshot;
            this.pagedList = null;
        }
        final PagedList<T> pagedList4 = this.snapshot;
        if (pagedList4 == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List<T> listSnapshot2 = pagedList.snapshot();
        if (listSnapshot2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagedList<T>");
        }
        final PagedList pagedList5 = (PagedList) listSnapshot2;
        final RecordingCallback recordingCallback = new RecordingCallback();
        pagedList.addWeakCallback(recordingCallback);
        this.config.a().execute(new Runnable() { // from class: androidx.paging.AsyncPagedListDiffer.submitList.2
            @Override // java.lang.Runnable
            public final void run() {
                NullPaddedList<T> nullPaddedList = pagedList4.getNullPaddedList();
                NullPaddedList<T> nullPaddedList2 = pagedList5.getNullPaddedList();
                h.f<T> fVarB = AsyncPagedListDiffer.this.getConfig$paging_runtime_release().b();
                Intrinsics.checkNotNullExpressionValue(fVarB, "config.diffCallback");
                final NullPaddedDiffResult nullPaddedDiffResultComputeDiff = NullPaddedListDiffHelperKt.computeDiff(nullPaddedList, nullPaddedList2, fVarB);
                AsyncPagedListDiffer.this.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.paging.AsyncPagedListDiffer.submitList.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int maxScheduledGeneration = AsyncPagedListDiffer.this.getMaxScheduledGeneration();
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (maxScheduledGeneration == i) {
                            AsyncPagedListDiffer.this.latchPagedList$paging_runtime_release(pagedList, pagedList5, nullPaddedDiffResultComputeDiff, recordingCallback, pagedList4.lastLoad(), commitCallback);
                        }
                    }
                });
            }
        });
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(@NotNull RecyclerView.Adapter<?> adapter, @NotNull h.f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Executor executorI = bj1.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        this.mainThreadExecutor = executorI;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager() { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(@NotNull LoadType type, @NotNull LoadState state) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime_release().iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(type, state);
                }
            }
        };
        this.loadStateManager = loadStateManager;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(loadStateManager);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new PagedList.Callback() { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            @Override // androidx.paging.PagedList.Callback
            public void onChanged(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onChanged(position, count, null);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onInserted(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(position, count);
            }
        };
        this.updateCallback = new b(adapter);
        c<T> cVarA = new c.a(diffCallback).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "AsyncDifferConfig.Builder(diffCallback).build()");
        this.config = cVarA;
    }
}
