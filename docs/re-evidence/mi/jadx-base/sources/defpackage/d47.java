package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.chad.library.adapter.base.module.BaseDraggableModule;

/* JADX INFO: loaded from: classes4.dex */
public class d47 extends l.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseDraggableModule f15066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15067b = 0.1f;
    public float c = 0.7f;
    public int d = 15;
    public int e = 32;

    public d47(BaseDraggableModule baseDraggableModule) {
        this.f15066a = baseDraggableModule;
    }

    public final boolean a(RecyclerView.d0 d0Var) {
        int itemViewType = d0Var.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void clearView(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        super.clearView(recyclerView, d0Var);
        if (a(d0Var)) {
            return;
        }
        if (d0Var.itemView.getTag(dqi.f15814a) != null && ((Boolean) d0Var.itemView.getTag(dqi.f15814a)).booleanValue()) {
            BaseDraggableModule baseDraggableModule = this.f15066a;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragEnd(d0Var);
            }
            d0Var.itemView.setTag(dqi.f15814a, Boolean.FALSE);
        }
        if (d0Var.itemView.getTag(dqi.f15815b) == null || !((Boolean) d0Var.itemView.getTag(dqi.f15815b)).booleanValue()) {
            return;
        }
        BaseDraggableModule baseDraggableModule2 = this.f15066a;
        if (baseDraggableModule2 != null) {
            baseDraggableModule2.onItemSwipeClear(d0Var);
        }
        d0Var.itemView.setTag(dqi.f15815b, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.l.e
    public float getMoveThreshold(RecyclerView.d0 d0Var) {
        return this.f15067b;
    }

    @Override // androidx.recyclerview.widget.l.e
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        return a(d0Var) ? l.e.makeMovementFlags(0, 0) : l.e.makeMovementFlags(this.d, this.e);
    }

    @Override // androidx.recyclerview.widget.l.e
    public float getSwipeThreshold(RecyclerView.d0 d0Var) {
        return this.c;
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean isItemViewSwipeEnabled() {
        BaseDraggableModule baseDraggableModule = this.f15066a;
        if (baseDraggableModule != null) {
            return baseDraggableModule.getIsSwipeEnabled();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean isLongPressDragEnabled() {
        BaseDraggableModule baseDraggableModule = this.f15066a;
        return (baseDraggableModule == null || !baseDraggableModule.getIsDragEnabled() || this.f15066a.hasToggleView()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, d0Var, f, f2, i, z);
        if (i != 1 || a(d0Var)) {
            return;
        }
        View view = d0Var.itemView;
        canvas.save();
        if (f > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f, view.getTop());
        }
        BaseDraggableModule baseDraggableModule = this.f15066a;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemSwiping(canvas, d0Var, f, f2, z);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return d0Var.getItemViewType() == d0Var2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onMoved(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
        BaseDraggableModule baseDraggableModule = this.f15066a;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemDragMoving(d0Var, d0Var2);
        }
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSelectedChanged(RecyclerView.d0 d0Var, int i) {
        if (i == 2 && !a(d0Var)) {
            BaseDraggableModule baseDraggableModule = this.f15066a;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragStart(d0Var);
            }
            d0Var.itemView.setTag(dqi.f15814a, Boolean.TRUE);
        } else if (i == 1 && !a(d0Var)) {
            BaseDraggableModule baseDraggableModule2 = this.f15066a;
            if (baseDraggableModule2 != null) {
                baseDraggableModule2.onItemSwipeStart(d0Var);
            }
            d0Var.itemView.setTag(dqi.f15815b, Boolean.TRUE);
        }
        super.onSelectedChanged(d0Var, i);
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(RecyclerView.d0 d0Var, int i) {
        BaseDraggableModule baseDraggableModule;
        if (a(d0Var) || (baseDraggableModule = this.f15066a) == null) {
            return;
        }
        baseDraggableModule.onItemSwiped(d0Var);
    }
}
