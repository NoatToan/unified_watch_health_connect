package w23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f181607a;

    public h0(i0 i0Var) {
        this.f181607a = i0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        i0 i0Var = this.f181607a;
        f0 f0Var = i0Var.f181625g;
        if (f0Var == null) {
            String str = i0Var.getName().f188605a;
            str.getClass();
            p6.b.o("Dependencies of module ", str, " were not set before querying module content");
            return null;
        }
        List<i0> list = f0Var.f181595a;
        i0Var.T();
        list.contains(i0Var);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((i0) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            t23.i0 i0Var2 = ((i0) it3.next()).f181626h;
            i0Var2.getClass();
            arrayList.add(i0Var2);
        }
        return new n(arrayList, "CompositeProvider@ModuleDescriptor for " + i0Var.getName());
    }
}
