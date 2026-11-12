package com.xiaomi.hm.health.device;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/ItemTouchHelperAdapter;", "", "", "fromPosition", "toPosition", "", "onItemMove", "position", "onItemDismiss", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "canMove", "actionState", "onSelectedChanged", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ItemTouchHelperAdapter {
    boolean canMove(@NotNull RecyclerView.ViewHolder viewHolder);

    void onItemDismiss(int position);

    void onItemMove(int fromPosition, int toPosition);

    void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState);
}
