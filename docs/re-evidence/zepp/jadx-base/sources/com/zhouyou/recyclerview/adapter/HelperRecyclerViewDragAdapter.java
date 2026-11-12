package com.zhouyou.recyclerview.adapter;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.listener.OnItemDragListener;
import com.zhouyou.recyclerviewsdk.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class HelperRecyclerViewDragAdapter<T> extends HelperRecyclerViewAdapter<T> {
    private static final int m = 0;
    private int d;
    private ItemTouchHelper e;
    private boolean f;
    private boolean g;
    private OnItemDragListener h;
    private boolean i;
    private View.OnTouchListener j;
    private View.OnLongClickListener k;
    private Object l;

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (HelperRecyclerViewDragAdapter.this.e == null || !HelperRecyclerViewDragAdapter.this.f) {
                return true;
            }
            HelperRecyclerViewDragAdapter.this.e.startDrag((RecyclerView.ViewHolder) view.getTag(R.id.BaseQuickAdapter_viewholder_support));
            return true;
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (MotionEventCompat.getActionMasked(motionEvent) != 0 || HelperRecyclerViewDragAdapter.this.i) {
                return false;
            }
            if (HelperRecyclerViewDragAdapter.this.e == null || !HelperRecyclerViewDragAdapter.this.f) {
                return true;
            }
            HelperRecyclerViewDragAdapter.this.e.startDrag((RecyclerView.ViewHolder) view.getTag(R.id.BaseQuickAdapter_viewholder_support));
            return true;
        }
    }

    public HelperRecyclerViewDragAdapter(List<T> list, Context context, int... iArr) {
        super(list, context, iArr);
        this.d = 0;
        this.f = false;
        this.g = false;
        this.i = true;
        this.l = new Object();
    }

    public void disableDragItem() {
        this.f = false;
        this.e = null;
    }

    public void disableSwipeItem() {
        this.g = false;
    }

    public void enableDragItem(@NonNull ItemTouchHelper itemTouchHelper) {
        enableDragItem(itemTouchHelper, 0, true);
    }

    public void enableSwipeItem() {
        this.g = true;
    }

    public int getViewHolderPosition(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition();
    }

    public boolean isItemDraggable() {
        return this.f;
    }

    public boolean isItemSwipeEnable() {
        return this.g;
    }

    public void onItemDragEnd(RecyclerView.ViewHolder viewHolder) {
        OnItemDragListener onItemDragListener = this.h;
        if (onItemDragListener == null || !this.f) {
            return;
        }
        onItemDragListener.onItemDragEnd(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        synchronized (this.l) {
            int viewHolderPosition = getViewHolderPosition(viewHolder);
            int viewHolderPosition2 = getViewHolderPosition(viewHolder2);
            if (viewHolderPosition < viewHolderPosition2) {
                int i = viewHolderPosition;
                while (i < viewHolderPosition2) {
                    int i2 = i + 1;
                    if (i2 < getA()) {
                        Collections.swap(getList(), i, i2);
                    }
                    i = i2;
                }
            } else {
                for (int i3 = viewHolderPosition; i3 > viewHolderPosition2; i3--) {
                    if (i3 + 1 < getA()) {
                        Collections.swap(getList(), i3, i3 - 1);
                    }
                }
            }
            notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            OnItemDragListener onItemDragListener = this.h;
            if (onItemDragListener != null && this.f) {
                onItemDragListener.onItemDragMoving(viewHolder, viewHolderPosition, viewHolder2, viewHolderPosition2);
            }
        }
    }

    public void onItemDragStart(RecyclerView.ViewHolder viewHolder) {
        OnItemDragListener onItemDragListener = this.h;
        if (onItemDragListener == null || !this.f) {
            return;
        }
        onItemDragListener.onItemDragStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.h = onItemDragListener;
    }

    public void setToggleDragOnLongPress(boolean z) {
        this.i = z;
        if (z) {
            this.j = null;
            this.k = new a();
        } else {
            this.j = new b();
            this.k = null;
        }
    }

    public void setToggleViewId(int i) {
        this.d = i;
    }

    public void enableDragItem(@NonNull ItemTouchHelper itemTouchHelper, int i, boolean z) {
        this.f = true;
        this.e = itemTouchHelper;
        setToggleViewId(i);
        setToggleDragOnLongPress(z);
    }

    @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BH bh, int i) {
        super.onBindViewHolder(bh, i);
        if (this.e == null || !this.f) {
            return;
        }
        int i2 = this.d;
        if (i2 == 0) {
            bh.itemView.setTag(R.id.BaseQuickAdapter_viewholder_support, bh);
            bh.itemView.setOnLongClickListener(this.k);
            return;
        }
        View view = ((BaseRecyclerViewHolder) bh).getView(i2);
        if (view != null) {
            view.setTag(R.id.BaseQuickAdapter_viewholder_support, bh);
            if (this.i) {
                view.setOnLongClickListener(this.k);
            } else {
                view.setOnTouchListener(this.j);
            }
        }
    }

    public HelperRecyclerViewDragAdapter(Context context, int... iArr) {
        super(context, iArr);
        this.d = 0;
        this.f = false;
        this.g = false;
        this.i = true;
        this.l = new Object();
    }

    public HelperRecyclerViewDragAdapter(List<T> list, Context context) {
        super(list, context);
        this.d = 0;
        this.f = false;
        this.g = false;
        this.i = true;
        this.l = new Object();
    }
}
