package com.huami.watch.companion.app;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;

/* JADX INFO: loaded from: classes16.dex */
public class ItemDragCallback extends ItemDragAndSwipeCallback {
    private BaseItemDraggableAdapter a;

    public ItemDragCallback(BaseItemDraggableAdapter baseItemDraggableAdapter) {
        super(baseItemDraggableAdapter);
        this.a = baseItemDraggableAdapter;
    }

    @Override // com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled */
    public boolean getIsEnableDrag() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        if (viewHolder.getAdapterPosition() == this.a.getHeaderLayoutCount() && f2 < 0.0f) {
            f2 = 0.0f;
        }
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
    }
}
