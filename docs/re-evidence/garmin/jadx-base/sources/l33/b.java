package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o33.f f109705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<o33.n, Boolean> f109706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f109707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f109708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f109709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f109710f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(o33.f fVar, e23.l<? super o33.n, Boolean> lVar) {
        fVar.getClass();
        lVar.getClass();
        this.f109705a = fVar;
        this.f109706b = lVar;
        a aVar = new a(this);
        this.f109707c = aVar;
        c53.g gVarH = c53.c0.h(p13.h0.M(fVar.e()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c53.g.a aVar2 = new c53.g.a(gVarH);
        while (aVar2.hasNext()) {
            Object next = aVar2.next();
            x33.f name = ((o33.o) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f109708d = linkedHashMap;
        c53.g gVarH2 = c53.c0.h(p13.h0.M(this.f109705a.E()), this.f109706b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        c53.g.a aVar3 = new c53.g.a(gVarH2);
        while (aVar3.hasNext()) {
            Object next2 = aVar3.next();
            linkedHashMap2.put(((o33.m) next2).getName(), next2);
        }
        this.f109709e = linkedHashMap2;
        ArrayList arrayListV = this.f109705a.v();
        e23.l<o33.n, Boolean> lVar2 = this.f109706b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListV) {
            if (lVar2.invoke((o33.n) obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iA = p13.t0.a(p13.y.r(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((o33.s) obj2).getName(), obj2);
        }
        this.f109710f = linkedHashMap3;
    }

    @Override // l33.c
    public final o33.s a(x33.f fVar) {
        fVar.getClass();
        return (o33.s) this.f109710f.get(fVar);
    }

    @Override // l33.c
    public final Set<x33.f> b() {
        c53.g gVarH = c53.c0.h(p13.h0.M(this.f109705a.e()), this.f109707c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c53.g.a aVar = new c53.g.a(gVarH);
        while (aVar.hasNext()) {
            linkedHashSet.add(((o33.o) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // l33.c
    public final Collection<o33.o> c(x33.f fVar) {
        fVar.getClass();
        List list = (List) this.f109708d.get(fVar);
        return list != null ? list : p13.j0.f134944a;
    }

    @Override // l33.c
    public final Set<x33.f> d() {
        return this.f109710f.keySet();
    }

    @Override // l33.c
    public final o33.m e(x33.f fVar) {
        fVar.getClass();
        return (o33.m) this.f109709e.get(fVar);
    }

    @Override // l33.c
    public final Set<x33.f> f() {
        c53.g gVarH = c53.c0.h(p13.h0.M(this.f109705a.E()), this.f109706b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c53.g.a aVar = new c53.g.a(gVarH);
        while (aVar.hasNext()) {
            linkedHashSet.add(((o33.m) aVar.next()).getName());
        }
        return linkedHashSet;
    }
}
