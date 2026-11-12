package d10;

import a73.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f57034a;

    public e(boolean[] zArr) {
        this.f57034a = zArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f57034a.length;
    }

    @Override // d10.h, androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r */
    public final void onBindViewHolder(h.a aVar, int i14) {
        aVar.f57035a.c(this.f57034a[i14]);
        aVar.f57035a.setOnCheckChangeListener(new m(this, i14, 4));
        t(aVar, i14);
    }

    public abstract void t(h.a aVar, int i14);

    public abstract void u(boolean[] zArr, int i14);
}
