package hz1;

import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhz1/d;", "Landroidx/recyclerview/widget/y;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f86532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.e f86533b;

    public d(c cVar, o.e eVar) {
        this.f86532a = cVar;
        this.f86533b = eVar;
    }

    @Override // androidx.recyclerview.widget.y
    public final void a(int i14, int i15) {
        c cVar = this.f86532a;
        cVar.f86527i.delete(i14 + 2);
        cVar.u();
        c.r(cVar);
        cVar.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.y
    public final void b(int i14, int i15, Object obj) {
    }

    @Override // androidx.recyclerview.widget.y
    public final void c(int i14, int i15) {
        c cVar = this.f86532a;
        SparseBooleanArray sparseBooleanArrayClone = cVar.f86527i.clone();
        sparseBooleanArrayClone.getClass();
        int i16 = 0;
        cVar.f86527i = new SparseBooleanArray(0);
        int size = sparseBooleanArrayClone.size();
        while (true) {
            SparseBooleanArray sparseBooleanArray = cVar.f86527i;
            if (i16 >= size) {
                sparseBooleanArray.put(2, true);
                cVar.u();
                c.r(cVar);
                o.e eVar = this.f86533b;
                eVar.getClass();
                eVar.b(new androidx.recyclerview.widget.b(cVar));
                return;
            }
            sparseBooleanArray.put(sparseBooleanArrayClone.keyAt(i16) + 1, sparseBooleanArrayClone.get(sparseBooleanArrayClone.keyAt(i16)));
            i16++;
        }
    }

    @Override // androidx.recyclerview.widget.y
    public final void d(int i14, int i15) {
    }
}
