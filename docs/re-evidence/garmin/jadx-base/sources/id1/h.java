package id1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;

/* JADX INFO: loaded from: classes9.dex */
public class h extends s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f93034f;

    public interface a {
        Boolean f(int i14, int i15);
    }

    public h(a aVar, int i14, int i15) {
        this.f93034f = aVar;
        this.f93032d = i14;
        this.f93033e = i15;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        super.b(recyclerView, f0Var);
        this.f93034f.getClass();
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        return s.d.k(this.f93032d, this.f93033e);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean i() {
        return this.f93033e > 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean j() {
        return this.f93032d > 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        return this.f93034f.f(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition()).booleanValue();
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getBindingAdapterPosition();
        this.f93034f.getClass();
    }
}
