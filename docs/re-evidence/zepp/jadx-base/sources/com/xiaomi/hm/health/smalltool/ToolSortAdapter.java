package com.xiaomi.hm.health.smalltool;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\u0015\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "position", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "a", "getItemCount", "getItemViewType", "", "getItemId", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "", "onBindViewHolder", "", "items", "myItems", "updateData", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "viewModel", "", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "c", "getMyItems", GoogleApiAvailabilityLight.a, LogUtil.I, "myItemsSize", "", "e", "Z", "isEditing", "()Z", "setEditing", "(Z)V", "<init>", "(Lcom/xiaomi/hm/health/smalltool/ToolViewModel;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolSortAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ToolViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Tool> items = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Tool> myItems = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int myItemsSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isEditing;

    public ToolSortAdapter(@NotNull ToolViewModel toolViewModel) {
        this.viewModel = toolViewModel;
    }

    private final Tool a(int position) {
        return position <= this.myItemsSize ? this.items.get(position - 1) : this.items.get(position - 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.items.size() > this.myItemsSize ? this.items.size() + 2 : this.items.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return getItemViewType(position) == 1 ? position : a(position).name().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 || position == this.myItemsSize + 1 ? 1 : 2;
    }

    @NotNull
    public final List<Tool> getItems() {
        return this.items;
    }

    @NotNull
    public final List<Tool> getMyItems() {
        return this.myItems;
    }

    /* JADX INFO: renamed from: isEditing, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        TextView textView;
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            ToolTitleHolder toolTitleHolder = (ToolTitleHolder) holder;
            toolTitleHolder.bindTo(position == 0 ? R.string.small_tool_selected : R.string.small_tool_more);
            if (position != 0 || (textView = toolTitleHolder.getBinding().smallToolDragSortTip) == null) {
                return;
            }
            textView.setVisibility(getIsEditing() ? 0 : 8);
            return;
        }
        if (itemViewType != 2) {
            return;
        }
        ToolHolder toolHolder = (ToolHolder) holder;
        toolHolder.bindTo(a(position), this.viewModel);
        toolHolder.getBinding().bgCardView.setVisibility(getIsEditing() ? 0 : 8);
        toolHolder.getBinding().toolIcon.setVisibility(getIsEditing() ? 8 : 0);
        toolHolder.getBinding().toolName.setVisibility(getIsEditing() ? 8 : 0);
        toolHolder.getBinding().getRoot().setClickable(!getIsEditing());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == 1 ? new ToolTitleHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.small_tool_grid_title, parent, false)) : new ToolHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.small_tool_grid_item, parent, false));
    }

    public final void setEditing(boolean z) {
        this.isEditing = z;
    }

    public final void updateData(@NotNull List<? extends Tool> items, @NotNull List<? extends Tool> myItems) {
        this.items.clear();
        this.items.addAll(items);
        this.myItems.clear();
        this.myItems.addAll(myItems);
        this.myItemsSize = myItems.size();
    }
}
