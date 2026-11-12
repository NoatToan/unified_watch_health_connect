package com.huami.treadmill.ui.linedetail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.treadmill.R;
import com.huami.treadmill.data.TdRankingItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/treadmill/ui/linedetail/AdapterSpeed;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "getItemViewType", "", "Lcom/huami/treadmill/data/TdRankingItem;", "value", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "", "b", "J", "getLineId", "()J", "setLineId", "(J)V", "lineId", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class AdapterSpeed extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<TdRankingItem> data = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long lineId;

    @NotNull
    public final List<TdRankingItem> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        boolean z = position == 0;
        if (z) {
            return R.layout.item_td_top_rank;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return R.layout.item_td_diligent;
    }

    public final long getLineId() {
        return this.lineId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == R.layout.item_td_top_rank) {
            ((TopRankViewHolder) holder).bindSpeedTopRank(this.lineId, this.data.get(position));
        } else {
            ((DiligentSpeedViewHolder) holder).bindData(this.data.get(position), 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        int i = R.layout.item_td_top_rank;
        return viewType == i ? new TopRankViewHolder(LayoutInflater.from(parent.getContext()).inflate(i, parent, false)) : new DiligentSpeedViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_td_diligent, parent, false));
    }

    public final void setData(@NotNull List<TdRankingItem> list) {
        this.data.clear();
        this.data.addAll(list);
        notifyDataSetChanged();
    }

    public final void setLineId(long j) {
        this.lineId = j;
    }
}
