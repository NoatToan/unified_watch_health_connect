package com.xiaomi.hm.health.smalltool;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolMyToolsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/smalltool/MyToolHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "items", "updateData", "update", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "a", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "viewModel", "", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Lcom/xiaomi/hm/health/smalltool/ToolViewModel;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolMyToolsAdapter extends RecyclerView.Adapter<MyToolHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ToolViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Tool> items = new ArrayList();

    public ToolMyToolsAdapter(@NotNull ToolViewModel toolViewModel) {
        this.viewModel = toolViewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.items.size();
    }

    @NotNull
    public final List<Tool> getItems() {
        return this.items;
    }

    public final void update(@NotNull List<? extends Tool> items) {
        if (ToolMyToolsAdapterKt.a(items, this.items)) {
            return;
        }
        updateData(items);
        notifyDataSetChanged();
    }

    public final void updateData(@NotNull List<? extends Tool> items) {
        this.items.clear();
        this.items.addAll(items);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MyToolHolder holder, int position) {
        holder.bindTo(this.items.get(position), this.viewModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MyToolHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new MyToolHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_tools_grid_item, parent, false));
    }
}
