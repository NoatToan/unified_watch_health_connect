package com.xiaomi.fitness.baseui.utils;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFIZ)V", "Lcom/xiaomi/fitness/baseui/utils/OnItemDragListener;", "onItemDragListener", "Lcom/xiaomi/fitness/baseui/utils/OnItemDragListener;", "<init>", "(Lcom/xiaomi/fitness/baseui/utils/OnItemDragListener;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public class ItemDragHelperCallBack extends l.h {

    @NotNull
    private final OnItemDragListener onItemDragListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDragHelperCallBack(@NotNull OnItemDragListener onItemDragListener) {
        super(3, 0);
        Intrinsics.checkNotNullParameter(onItemDragListener, "onItemDragListener");
        this.onItemDragListener = onItemDragListener;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onChildDraw(@NotNull Canvas c, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        this.onItemDragListener.onItemMove(recyclerView, viewHolder, viewHolder.itemView.getTop() + dY + viewHolder.itemView.getHeight(), dY, isCurrentlyActive);
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, @NotNull RecyclerView.d0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        this.onItemDragListener.onItemSwap(recyclerView, viewHolder.getBindingAdapterPosition(), target.getBindingAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(@NotNull RecyclerView.d0 viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
