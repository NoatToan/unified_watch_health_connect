package androidx.paging;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.c.q;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @ReplaceWith(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b6\u00107B\u0017\b\u0014\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008¢\u0006\u0004\b6\u0010:J\u001f\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\nJ/\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J)\u0010\u001c\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\"\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020!2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u001f¢\u0006\u0004\b%\u0010#J%\u0010&\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u001f¢\u0006\u0004\b&\u0010'R&\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R<\u0010\u001b\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010/\u0012\u0004\b0\u0010.R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068VX\u0096\u0004¢\u0006\f\u0012\u0004\b3\u0010.\u001a\u0004\b1\u00102¨\u0006;"}, d2 = {"Landroidx/paging/PagedListAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$d0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/paging/PagedList;", "pagedList", "", "submitList", "(Landroidx/paging/PagedList;)V", "Ljava/lang/Runnable;", "commitCallback", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "", "position", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "()I", "currentList", "onCurrentListChanged", "previousList", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLoadStateListener", "(Lkotlin/jvm/functions/Function2;)V", "removeLoadStateListener", "Landroidx/paging/LoadStateAdapter;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "Landroidx/paging/AsyncPagedListDiffer;", "differ", "Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release", "()Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release$annotations", "()V", "Lkotlin/jvm/functions/Function2;", "getListener$annotations", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/h$f;)V", "Landroidx/recyclerview/widget/c;", q.f13857a, "(Landroidx/recyclerview/widget/c;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public abstract class PagedListAdapter<T, VH extends RecyclerView.d0> extends RecyclerView.Adapter<VH> {

    @NotNull
    private final AsyncPagedListDiffer<T> differ;
    private final Function2<PagedList<T>, PagedList<T>, Unit> listener;

    public PagedListAdapter(@NotNull h.f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Function2<PagedList<T>, PagedList<T>, Unit> function2 = new Function2<PagedList<T>, PagedList<T>, Unit>() { // from class: androidx.paging.PagedListAdapter$listener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                invoke((PagedList) obj, (PagedList) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
                this.this$0.onCurrentListChanged(pagedList2);
                this.this$0.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.listener = function2;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(this, diffCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(function2);
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getListener$annotations() {
    }

    public void addLoadStateListener(@NotNull Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        return this.differ.getCurrentList();
    }

    @NotNull
    public final AsyncPagedListDiffer<T> getDiffer$paging_runtime_release() {
        return this.differ;
    }

    @Nullable
    public T getItem(int position) {
        return this.differ.getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.differ.getItemCount();
    }

    @Deprecated(message = "Use the two argument variant instead.", replaceWith = @ReplaceWith(expression = "onCurrentListChanged(previousList, currentList)", imports = {}))
    public void onCurrentListChanged(@Nullable PagedList<T> currentList) {
    }

    public void removeLoadStateListener(@NotNull Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public void submitList(@Nullable PagedList<T> pagedList) {
        this.differ.submitList(pagedList);
    }

    @NotNull
    public final ConcatAdapter withLoadStateFooter(@NotNull final LoadStateAdapter<?> footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        addLoadStateListener(new Function2<LoadType, LoadState, Unit>() { // from class: androidx.paging.PagedListAdapter.withLoadStateFooter.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
                invoke2(loadType, loadState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LoadType loadType, @NotNull LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (loadType == LoadType.APPEND) {
                    footer.setLoadState(loadState);
                }
            }
        });
        return new ConcatAdapter(this, footer);
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeader(@NotNull final LoadStateAdapter<?> header) {
        Intrinsics.checkNotNullParameter(header, "header");
        addLoadStateListener(new Function2<LoadType, LoadState, Unit>() { // from class: androidx.paging.PagedListAdapter.withLoadStateHeader.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
                invoke2(loadType, loadState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LoadType loadType, @NotNull LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    header.setLoadState(loadState);
                }
            }
        });
        return new ConcatAdapter(header, this);
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeaderAndFooter(@NotNull final LoadStateAdapter<?> header, @NotNull final LoadStateAdapter<?> footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        addLoadStateListener(new Function2<LoadType, LoadState, Unit>() { // from class: androidx.paging.PagedListAdapter.withLoadStateHeaderAndFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
                invoke2(loadType, loadState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LoadType loadType, @NotNull LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    header.setLoadState(loadState);
                } else if (loadType == LoadType.APPEND) {
                    footer.setLoadState(loadState);
                }
            }
        });
        return new ConcatAdapter(header, this, footer);
    }

    public void onCurrentListChanged(@Nullable PagedList<T> previousList, @Nullable PagedList<T> currentList) {
    }

    public void submitList(@Nullable PagedList<T> pagedList, @Nullable Runnable commitCallback) {
        this.differ.submitList(pagedList, commitCallback);
    }

    public PagedListAdapter(@NotNull c<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Function2<PagedList<T>, PagedList<T>, Unit> function2 = new Function2<PagedList<T>, PagedList<T>, Unit>() { // from class: androidx.paging.PagedListAdapter$listener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                invoke((PagedList) obj, (PagedList) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable PagedList<T> pagedList, @Nullable PagedList<T> pagedList2) {
                this.this$0.onCurrentListChanged(pagedList2);
                this.this$0.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.listener = function2;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(new b(this), config);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(function2);
    }
}
