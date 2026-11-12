package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.c f10700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.d f10701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.f0> f10702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f10703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10704e;

    public interface b {
    }

    public z(RecyclerView.h<RecyclerView.f0> hVar, b bVar, m0 m0Var, j0.d dVar) {
        a aVar = new a();
        this.f10702c = hVar;
        this.f10703d = bVar;
        this.f10700a = m0Var.b(this);
        this.f10701b = dVar;
        this.f10704e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(aVar);
    }

    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            z zVar = z.this;
            zVar.f10704e = zVar.f10702c.getItemCount();
            h hVar = (h) zVar.f10703d;
            hVar.f10465a.notifyDataSetChanged();
            hVar.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15) {
            z zVar = z.this;
            h hVar = (h) zVar.f10703d;
            hVar.f10465a.notifyItemRangeChanged(i14 + hVar.c(zVar), i15, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i14, int i15) {
            z zVar = z.this;
            zVar.f10704e += i15;
            h hVar = (h) zVar.f10703d;
            hVar.f10465a.notifyItemRangeInserted(i14 + hVar.c(zVar), i15);
            if (zVar.f10704e <= 0 || zVar.f10702c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((h) zVar.f10703d).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i14, int i15, int i16) {
            k7.h.b(i16 == 1, "moving more than 1 item is not supported in RecyclerView");
            z zVar = z.this;
            h hVar = (h) zVar.f10703d;
            int iC = hVar.c(zVar);
            hVar.f10465a.notifyItemMoved(i14 + iC, i15 + iC);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i14, int i15) {
            z zVar = z.this;
            zVar.f10704e -= i15;
            h hVar = (h) zVar.f10703d;
            hVar.f10465a.notifyItemRangeRemoved(i14 + hVar.c(zVar), i15);
            if (zVar.f10704e >= 1 || zVar.f10702c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((h) zVar.f10703d).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onStateRestorationPolicyChanged() {
            ((h) z.this.f10703d).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15, Object obj) {
            z zVar = z.this;
            h hVar = (h) zVar.f10703d;
            hVar.f10465a.notifyItemRangeChanged(i14 + hVar.c(zVar), i15, obj);
        }
    }
}
