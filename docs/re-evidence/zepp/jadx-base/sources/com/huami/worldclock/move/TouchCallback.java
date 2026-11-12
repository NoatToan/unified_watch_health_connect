package com.huami.worldclock.move;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.worldclock.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/worldclock/move/TouchCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "getMovementFlags", "target", "", "onMove", "direction", "", "onSwiped", "actionState", "onSelectedChanged", "isLongPressDragEnabled", "isItemViewSwipeEnabled", "enableDrag", "setEnableDrag", "enableSwipe", "setEnableSwipe", "Lcom/huami/worldclock/move/OnItemTouchCallbackListener;", "a", "Lcom/huami/worldclock/move/OnItemTouchCallbackListener;", "callbackListener", "b", "Z", "isEnableSwipe", "c", "isEnableDrag", GoogleApiAvailabilityLight.a, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "lastViewHolder", "<init>", "(Lcom/huami/worldclock/move/OnItemTouchCallbackListener;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class TouchCallback extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final OnItemTouchCallbackListener callbackListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isEnableSwipe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isEnableDrag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private RecyclerView.ViewHolder lastViewHolder;

    public TouchCallback(@Nullable OnItemTouchCallbackListener onItemTouchCallbackListener) {
        this.callbackListener = onItemTouchCallbackListener;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int i = 0;
        if (layoutManager instanceof GridLayoutManager) {
            return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
        int i2 = 12;
        if (orientation == 0) {
            i2 = 3;
            i = 12;
        } else if (orientation != 1) {
            i2 = 0;
        } else {
            i = 3;
        }
        return ItemTouchHelper.Callback.makeMovementFlags(i, i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isItemViewSwipeEnabled, reason: from getter */
    public boolean getIsEnableSwipe() {
        return this.isEnableSwipe;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled, reason: from getter */
    public boolean getIsEnableDrag() {
        return this.isEnableDrag;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        OnItemTouchCallbackListener onItemTouchCallbackListener = this.callbackListener;
        if (onItemTouchCallbackListener == null) {
            return false;
        }
        onItemTouchCallbackListener.onMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
        View view;
        View view2;
        super.onSelectedChanged(viewHolder, actionState);
        if (actionState == 0) {
            RecyclerView.ViewHolder viewHolder2 = this.lastViewHolder;
            if (viewHolder2 != null && (view = viewHolder2.itemView) != null) {
                view.setBackgroundResource(R.drawable.shape_item_normal);
            }
            this.lastViewHolder = null;
            return;
        }
        if (actionState != 2) {
            return;
        }
        this.lastViewHolder = viewHolder;
        if (viewHolder == null || (view2 = viewHolder.itemView) == null) {
            return;
        }
        view2.setBackgroundResource(R.drawable.shape_item_drap);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
        OnItemTouchCallbackListener onItemTouchCallbackListener = this.callbackListener;
        if (onItemTouchCallbackListener != null) {
            onItemTouchCallbackListener.onSwiped(viewHolder.getAdapterPosition());
        }
    }

    public final void setEnableDrag(boolean enableDrag) {
        this.isEnableDrag = enableDrag;
    }

    public final void setEnableSwipe(boolean enableSwipe) {
        this.isEnableSwipe = enableSwipe;
    }
}
