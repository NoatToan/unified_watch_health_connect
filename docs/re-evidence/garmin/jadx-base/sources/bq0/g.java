package bq0;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class g extends androidx.recyclerview.widget.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f19500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k> f19501b;

    public g(List<k> list, List<k> list2) {
        this.f19500a = list;
        this.f19501b = list2;
    }

    @Override // androidx.recyclerview.widget.o.b
    public final boolean a(int i14, int i15) {
        return f(i14, i15);
    }

    @Override // androidx.recyclerview.widget.o.b
    public final boolean b(int i14, int i15) {
        return f(i14, i15);
    }

    @Override // androidx.recyclerview.widget.o.b
    public final int d() {
        List<k> list = this.f19501b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.o.b
    public final int e() {
        List<k> list = this.f19500a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final boolean f(int i14, int i15) {
        List<k> list;
        List<k> list2 = this.f19500a;
        if (list2 == null || list2.isEmpty() || (list = this.f19501b) == null || list.isEmpty() || i14 >= e() || i15 >= d()) {
            return false;
        }
        k kVar = list2.get(i14);
        k kVar2 = list.get(i15);
        return kVar.f19509a.equals(kVar2.f19509a) && kVar.f19510b.equals(kVar2.f19510b) && kVar.f19511c.equals(kVar2.f19511c);
    }
}
