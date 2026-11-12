package androidx.paging;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b!\u0010\"J\u001d\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\b\u0010\u0015J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/paging/LoadStateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroidx/paging/LoadState;", "loadState", "(Landroid/view/ViewGroup;Landroidx/paging/LoadState;)Landroidx/recyclerview/widget/RecyclerView$d0;", "(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/paging/LoadState;)V", "getStateViewType", "(Landroidx/paging/LoadState;)I", "", "displayLoadStateAsItem", "(Landroidx/paging/LoadState;)Z", "Landroidx/paging/LoadState;", "getLoadState", "()Landroidx/paging/LoadState;", "setLoadState", "(Landroidx/paging/LoadState;)V", "<init>", "()V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public abstract class LoadStateAdapter<VH extends RecyclerView.d0> extends RecyclerView.Adapter<VH> {

    @NotNull
    private LoadState loadState = new LoadState.NotLoading(false);

    public boolean displayLoadStateAsItem(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return (loadState instanceof LoadState.Loading) || (loadState instanceof LoadState.Error);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return displayLoadStateAsItem(this.loadState) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        return getStateViewType(this.loadState);
    }

    @NotNull
    public final LoadState getLoadState() {
        return this.loadState;
    }

    public int getStateViewType(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder(holder, this.loadState);
    }

    public abstract void onBindViewHolder(@NotNull VH holder, @NotNull LoadState loadState);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final VH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return (VH) onCreateViewHolder(parent, this.loadState);
    }

    @NotNull
    public abstract VH onCreateViewHolder(@NotNull ViewGroup parent, @NotNull LoadState loadState);

    public final void setLoadState(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        if (!Intrinsics.areEqual(this.loadState, loadState)) {
            boolean zDisplayLoadStateAsItem = displayLoadStateAsItem(this.loadState);
            boolean zDisplayLoadStateAsItem2 = displayLoadStateAsItem(loadState);
            if (zDisplayLoadStateAsItem && !zDisplayLoadStateAsItem2) {
                notifyItemRemoved(0);
            } else if (zDisplayLoadStateAsItem2 && !zDisplayLoadStateAsItem) {
                notifyItemInserted(0);
            } else if (zDisplayLoadStateAsItem && zDisplayLoadStateAsItem2) {
                notifyItemChanged(0);
            }
            this.loadState = loadState;
        }
    }
}
