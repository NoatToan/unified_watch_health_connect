package sq0;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f160526d;

    public a(b bVar) {
        this.f160526d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.s.d
    public void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        super.b(recyclerView, f0Var);
        f0Var.itemView.setAlpha(1.0f);
        if (f0Var instanceof c) {
            ((c) f0Var).c();
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            if (f0Var.getItemViewType() == p()) {
                return s.d.k(15, 0);
            }
        } else if (f0Var.getItemViewType() == p()) {
            return s.d.k(3, 48);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean i() {
        return false;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean j() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    @Override // androidx.recyclerview.widget.s.d
    public final void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f14, float f15, int i14, boolean z14) {
        float f16;
        if (i14 == 1) {
            f0Var.itemView.setAlpha(1.0f - (Math.abs(f14) / f0Var.itemView.getWidth()));
            f0Var.itemView.setTranslationX(f14);
            return;
        }
        float top = (f0Var.itemView.getTop() + f15) - recyclerView.getChildAt(0).getHeight();
        float height = f0Var.itemView.getHeight() + top + recyclerView.getChildAt(0).getHeight();
        if (top >= 0.0f) {
            b bVar = this.f160526d;
            if (recyclerView.getChildAt(bVar.K0()) == null || top >= recyclerView.getChildAt(bVar.K0()).getTop()) {
                if (recyclerView.getChildAt(bVar.z1()) != null && height > recyclerView.getChildAt(bVar.z1()).getTop()) {
                    f15 = (recyclerView.getChildAt(bVar.z1()).getTop() - f0Var.itemView.getHeight()) - f0Var.itemView.getTop();
                }
                f16 = f15;
            } else {
                f16 = 0.0f;
            }
        } else {
            f16 = 0.0f;
        }
        super.l(canvas, recyclerView, f0Var, f14, f16, i14, z14);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        if (f0Var.getItemViewType() != f0Var2.getItemViewType()) {
            return false;
        }
        this.f160526d.f(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        if (i14 != 0 && (f0Var instanceof c)) {
            ((c) f0Var).a();
        }
        super.n(i14, f0Var);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        this.f160526d.h8(f0Var.getBindingAdapterPosition());
    }

    public abstract int p();
}
