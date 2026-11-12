package yc;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/a1;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$h;", "<init>", "()V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a1<VH extends RecyclerView.f0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f195724a = new z0.c(false);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return r(this.f195724a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        this.f195724a.getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(VH vh3, int i14) {
        vh3.getClass();
        t(vh3, this.f195724a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final VH onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return (VH) u(viewGroup, this.f195724a);
    }

    public boolean r(z0 z0Var) {
        z0Var.getClass();
        return (z0Var instanceof z0.b) || (z0Var instanceof z0.a);
    }

    public abstract void t(VH vh3, z0 z0Var);

    public abstract VH u(ViewGroup viewGroup, z0 z0Var);

    public final void x(z0 z0Var) {
        z0Var.getClass();
        if (p005kotlin.jvm.internal.s.g(this.f195724a, z0Var)) {
            return;
        }
        boolean zR = r(this.f195724a);
        boolean zR2 = r(z0Var);
        if (zR && !zR2) {
            notifyItemRemoved(0);
        } else if (zR2 && !zR) {
            notifyItemInserted(0);
        } else if (zR && zR2) {
            notifyItemChanged(0);
        }
        this.f195724a = z0Var;
    }
}
