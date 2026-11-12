package com.huawei.health.functionsetcard;

import android.view.View;
import android.view.animation.ScaleAnimation;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;

/* JADX INFO: loaded from: classes7.dex */
public class FunctionSetViewTouchHelperCallback extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthRecycleView f6702a;
    private final FunctionSetViewAdapter e;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return (viewHolder == null || viewHolder2 == null) ? false : true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public FunctionSetViewTouchHelperCallback(FunctionSetViewAdapter functionSetViewAdapter, HealthRecycleView healthRecycleView) {
        this.e = functionSetViewAdapter;
        this.f6702a = healthRecycleView;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        HealthRecycleView healthRecycleView = this.f6702a;
        if (healthRecycleView == null || healthRecycleView.getScrollState() != 0 || this.f6702a.isComputingLayout()) {
            return;
        }
        this.f6702a.getRecycledViewPool().clear();
        this.e.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        if (viewHolder != null) {
            b(viewHolder.itemView);
        }
    }

    private void b(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.1f, 1.0f, 1.1f, 1.0f);
        scaleAnimation.setDuration(100L);
        view.startAnimation(scaleAnimation);
    }
}
