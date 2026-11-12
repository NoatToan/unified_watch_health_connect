package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import defpackage.ghe;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ghe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f2857a;

    public b(RecyclerView.Adapter adapter) {
        this.f2857a = adapter;
    }

    @Override // defpackage.ghe
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i, int i2, Object obj) {
        this.f2857a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.ghe
    public void onInserted(int i, int i2) {
        this.f2857a.notifyItemRangeInserted(i, i2);
    }

    @Override // defpackage.ghe
    public void onMoved(int i, int i2) {
        this.f2857a.notifyItemMoved(i, i2);
    }

    @Override // defpackage.ghe
    public void onRemoved(int i, int i2) {
        this.f2857a.notifyItemRangeRemoved(i, i2);
    }
}
