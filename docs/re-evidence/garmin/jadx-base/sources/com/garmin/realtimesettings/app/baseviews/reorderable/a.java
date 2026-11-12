package com.garmin.realtimesettings.app.baseviews.reorderable;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import p005kotlin.Metadata;
import wv2.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/baseviews/reorderable/a;", "Landroidx/recyclerview/widget/s$d;", "Lcom/garmin/realtimesettings/app/baseviews/reorderable/a$a;", "helperAdapter", "<init>", "(Lcom/garmin/realtimesettings/app/baseviews/reorderable/a$a;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1125a f52546d;

    /* JADX INFO: renamed from: com.garmin.realtimesettings.app.baseviews.reorderable.a$a, reason: collision with other inner class name */
    public interface InterfaceC1125a {
        void b(int i14, int i15);

        void l(d dVar);

        void o(d dVar);
    }

    public a(InterfaceC1125a interfaceC1125a) {
        interfaceC1125a.getClass();
        this.f52546d = interfaceC1125a;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        super.b(recyclerView, f0Var);
        if (f0Var instanceof d) {
            this.f52546d.l((d) f0Var);
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        return s.d.k(3, 0);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean i() {
        return false;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean j() {
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        this.f52546d.b(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        super.n(i14, f0Var);
        if ((f0Var instanceof d) && i14 == 2) {
            this.f52546d.o((d) f0Var);
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
    }
}
