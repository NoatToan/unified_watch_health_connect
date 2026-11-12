package com.garmin.android.apps.connectmobile.connectiq;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/t;", "Landroidx/recyclerview/widget/s$d;", "Lsq0/b;", "gestureCallbacks", "<init>", "(Lsq0/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends androidx.recyclerview.widget.s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sq0.b f32020d;

    public t(sq0.b bVar) {
        bVar.getClass();
        this.f32020d = bVar;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean a(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        f0Var2.getClass();
        if (!(f0Var instanceof w.a) || !(f0Var2 instanceof w.a)) {
            return false;
        }
        y.a aVar = ((w.a) f0Var).f32060k;
        b bVar = aVar != null ? aVar.f32093b : null;
        y.a aVar2 = ((w.a) f0Var2).f32060k;
        return bVar == (aVar2 != null ? aVar2.f32093b : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        super.b(recyclerView, f0Var);
        if (f0Var instanceof sq0.c) {
            ((sq0.c) f0Var).c();
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        if (f0Var instanceof w.a) {
            return androidx.recyclerview.widget.s.d.k(3, 0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f14, float f15, int i14, boolean z14) {
        recyclerView.getClass();
        f0Var.getClass();
        RecyclerView.f0 f0VarFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(f0Var.getBindingAdapterPosition() - 1);
        RecyclerView.f0 f0VarFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(f0Var.getBindingAdapterPosition() + 1);
        super.l(canvas, recyclerView, f0Var, f14, ((!((f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1)) < 0) || f0VarFindViewHolderForAdapterPosition == null || a(recyclerView, f0Var, f0VarFindViewHolderForAdapterPosition)) && (!(f15 > 0.0f) || f0VarFindViewHolderForAdapterPosition2 == null || a(recyclerView, f0Var, f0VarFindViewHolderForAdapterPosition2))) ? f15 : 0.0f, i14, z14);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        return this.f32020d.f(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        if (i14 != 0 && (f0Var instanceof sq0.c)) {
            ((sq0.c) f0Var).a();
        }
        super.n(i14, f0Var);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
    }
}
