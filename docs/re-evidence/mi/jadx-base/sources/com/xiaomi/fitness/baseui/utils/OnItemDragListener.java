package com.xiaomi.fitness.baseui.utils;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/OnItemDragListener;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "from", "to", "", "onItemSwap", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "", "y", "dY", "", "isCurrentlyActive", "onItemMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFZ)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public interface OnItemDragListener {
    void onItemMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, float y, float dY, boolean isCurrentlyActive);

    void onItemSwap(@NotNull RecyclerView recyclerView, int from, int to);
}
