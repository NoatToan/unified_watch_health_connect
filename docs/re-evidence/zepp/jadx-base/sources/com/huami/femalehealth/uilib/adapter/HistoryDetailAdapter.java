package com.huami.femalehealth.uilib.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.femalehealth.uilib.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0014\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R&\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0016j\b\u0012\u0004\u0012\u00020\n`\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/HistoryDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailViewHolder;", "", "position", "", "a", "type", "b", "", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailVo;", "list", "", "submit", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "onBindViewHolder", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "data", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryDetailAdapter extends RecyclerView.Adapter<HistoryDetailViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<HistoryDetailVo> data = new ArrayList<>();

    private final boolean a(int position) {
        return getItemViewType(position) == 1;
    }

    private final boolean b(int type) {
        return type == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 1 : 2;
    }

    public final void submit(@NotNull List<? extends HistoryDetailVo> list) {
        this.data.clear();
        this.data.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull HistoryDetailViewHolder holder, int position) {
        if (a(position)) {
            if (this.data.get(position) instanceof DetailSummaryVo) {
                holder.bind(this.data.get(position));
            }
        } else if (this.data.get(position) instanceof DetailSymptomVo) {
            holder.bind(this.data.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public HistoryDetailViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return b(viewType) ? new HistoryDetailViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fh_item_history_summary, parent, false)) : new HistoryDetailViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fh_item_history_symptoms, parent, false));
    }
}
