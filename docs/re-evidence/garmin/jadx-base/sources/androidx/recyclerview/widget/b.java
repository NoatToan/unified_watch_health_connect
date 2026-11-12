package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public final class b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.h f10412a;

    public b(RecyclerView.h hVar) {
        this.f10412a = hVar;
    }

    @Override // androidx.recyclerview.widget.y
    public final void a(int i14, int i15) {
        this.f10412a.notifyItemRangeRemoved(i14, i15);
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public final void b(int i14, int i15, Object obj) {
        this.f10412a.notifyItemRangeChanged(i14, i15, obj);
    }

    @Override // androidx.recyclerview.widget.y
    public final void c(int i14, int i15) {
        this.f10412a.notifyItemRangeInserted(i14, i15);
    }

    @Override // androidx.recyclerview.widget.y
    public final void d(int i14, int i15) {
        this.f10412a.notifyItemMoved(i14, i15);
    }
}
