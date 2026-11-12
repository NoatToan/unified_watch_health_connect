package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.f0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<T> f10698a;

    public class a implements d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public final void a() {
            x.this.getClass();
        }
    }

    public x(o.f<T> fVar) {
        a aVar = new a();
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.f10698a = dVar;
        dVar.f10424d.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f10698a.f10426f.size();
    }

    public final T r(int i14) {
        return this.f10698a.f10426f.get(i14);
    }

    public void t(List<T> list) {
        this.f10698a.b(list, null);
    }

    public x(c<T> cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(new b(this), cVar);
        this.f10698a = dVar;
        dVar.f10424d.add(aVar);
    }
}
