package com.huami.sleep.sleepstatefeel.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.sleepstatefeel.vo.MonthSleepStateFeelInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001e\u0010\u0011\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fR&\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/StateFeelRatioAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Ljava/util/ArrayList;", "Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelInfo;", "Lkotlin/collections/ArrayList;", "dataList", "updateData", "a", "Ljava/util/ArrayList;", "stateFeelList", "<init>", "(Ljava/util/ArrayList;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class StateFeelRatioAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<MonthSleepStateFeelInfo> stateFeelList;

    public StateFeelRatioAdapter(@NotNull ArrayList<MonthSleepStateFeelInfo> arrayList) {
        this.stateFeelList = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.stateFeelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof StateFeelViewHolder) {
            ((StateFeelViewHolder) holder).bindTo(this.stateFeelList.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new StateFeelViewHolder(parent);
    }

    public final void updateData(@NotNull ArrayList<MonthSleepStateFeelInfo> dataList) {
        ArrayList<MonthSleepStateFeelInfo> arrayList = this.stateFeelList;
        arrayList.clear();
        if (!dataList.isEmpty()) {
            arrayList.addAll(dataList);
        }
        notifyDataSetChanged();
    }
}
