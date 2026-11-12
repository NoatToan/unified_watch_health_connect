package defpackage;

import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class k0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk3 f23290a;

    @FunctionalInterface
    public interface a {
        void a(wuo wuoVar);
    }

    public k0a(lgi lgiVar) {
        this.f23290a = (nk3) lgiVar.b(nk3.class);
    }

    public final void a(Set<wuo> set) {
        for (wuo wuoVar : set) {
            wuoVar.b().o(wuoVar);
        }
    }

    public final void b(Set<wuo> set) {
        for (wuo wuoVar : set) {
            wuoVar.b().p(wuoVar);
        }
    }

    public void c(wuo wuoVar, List<wuo> list, List<wuo> list2, a aVar) {
        wuo next;
        wuo next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<wuo> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != wuoVar) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(wuoVar);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<wuo> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != wuoVar) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f23290a != null;
    }
}
