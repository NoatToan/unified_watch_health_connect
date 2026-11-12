package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends c1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f109712p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o33.f f109713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j33.c f109714o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(k33.i iVar, o33.f fVar, j33.c cVar) {
        super(iVar);
        iVar.getClass();
        fVar.getClass();
        cVar.getClass();
        this.f109713n = fVar;
        this.f109714o = cVar;
    }

    public static t23.r0 v(t23.r0 r0Var) {
        t23.b.a kind = r0Var.getKind();
        kind.getClass();
        if (kind != t23.b.a.FAKE_OVERRIDE) {
            return r0Var;
        }
        Collection<? extends t23.b> collectionO = r0Var.o();
        collectionO.getClass();
        Collection<? extends t23.b> collection = collectionO;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            t23.r0 r0Var2 = (t23.r0) it.next();
            r0Var2.getClass();
            arrayList.add(v(r0Var2));
        }
        return (t23.r0) p13.h0.I0(p13.h0.b1(p13.h0.f1(arrayList)));
    }

    @Override // i43.m, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return null;
    }

    @Override // l33.u0
    public final Set<x33.f> h(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        return p13.l0.f134950a;
    }

    @Override // l33.u0
    public final Set<x33.f> i(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        Set<x33.f> setF1 = p13.h0.f1(this.f109813e.invoke().b());
        j33.c cVar = this.f109714o;
        b1 b1VarB = gg.b.B(cVar);
        Set<x33.f> setB = b1VarB != null ? b1VarB.b() : null;
        if (setB == null) {
            setB = p13.l0.f134950a;
        }
        setF1.addAll(setB);
        if (this.f109713n.A()) {
            setF1.addAll(p13.x.k(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105851c, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105849a));
        }
        k33.i iVar = this.f109810b;
        setF1.addAll(iVar.f102785a.f102774x.h(cVar, iVar));
        return setF1;
    }

    @Override // l33.u0
    public final void j(ArrayList arrayList, x33.f fVar) {
        fVar.getClass();
        k33.i iVar = this.f109810b;
        iVar.f102785a.f102774x.b(this.f109714o, fVar, arrayList, iVar);
    }

    @Override // l33.u0
    public final c k() {
        return new b(this.f109713n, v0.f109830a);
    }

    @Override // l33.u0
    public final void m(LinkedHashSet linkedHashSet, x33.f fVar) {
        fVar.getClass();
        j33.c cVar = this.f109714o;
        b1 b1VarB = gg.b.B(cVar);
        Collection collectionG1 = b1VarB == null ? p13.l0.f134950a : p13.h0.g1(b1VarB.c(fVar, b33.b.WHEN_GET_SUPER_MEMBERS));
        k33.c cVar2 = this.f109810b.f102785a;
        linkedHashSet.addAll(g8.i.Y(linkedHashSet, collectionG1, cVar2.f102771u.c(), cVar2.f102756f, this.f109714o, fVar));
        if (this.f109713n.A()) {
            if (fVar.equals(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105851c)) {
                linkedHashSet.add(b43.h.f(cVar));
            } else if (fVar.equals(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105849a)) {
                linkedHashSet.add(b43.h.g(cVar));
            }
        }
    }

    @Override // l33.c1, l33.u0
    public final void n(ArrayList arrayList, x33.f fVar) {
        x33.f fVar2;
        ArrayList arrayList2;
        w23.n0 n0VarE;
        fVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        x0 x0Var = new x0(fVar);
        j33.c cVar = this.f109714o;
        z43.b.b(p13.w.c(cVar), y0.f109835a, new a1(cVar, linkedHashSet, x0Var));
        boolean zIsEmpty = arrayList.isEmpty();
        k33.i iVar = this.f109810b;
        if (zIsEmpty) {
            ArrayList arrayList3 = arrayList;
            fVar2 = fVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                t23.r0 r0VarV = v((t23.r0) obj);
                Object arrayList4 = linkedHashMap.get(r0VarV);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(r0VarV, arrayList4);
                }
                ((List) arrayList4).add(obj);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                k33.c cVar2 = iVar.f102785a;
                ArrayList arrayList6 = arrayList3;
                p13.d0.v(arrayList5, g8.i.Y(arrayList6, collection, cVar2.f102771u.c(), cVar2.f102756f, this.f109714o, fVar2));
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList2.addAll(arrayList5);
        } else {
            k33.c cVar3 = iVar.f102785a;
            fVar2 = fVar;
            arrayList.addAll(g8.i.Y(arrayList, linkedHashSet, cVar3.f102771u.c(), cVar3.f102756f, this.f109714o, fVar2));
            arrayList2 = arrayList;
        }
        if (this.f109713n.A() && fVar2.equals(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105850b) && (n0VarE = b43.h.e(cVar)) != null) {
            arrayList2.add(n0VarE);
        }
    }

    @Override // l33.u0
    public final Set o(i43.d dVar) {
        dVar.getClass();
        Set setF1 = p13.h0.f1(this.f109813e.invoke().f());
        w0 w0Var = w0.f109832a;
        j33.c cVar = this.f109714o;
        z43.b.b(p13.w.c(cVar), y0.f109835a, new a1(cVar, setF1, w0Var));
        if (this.f109713n.A()) {
            setF1.add(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105850b);
        }
        return setF1;
    }

    @Override // l33.u0
    public final t23.l q() {
        return this.f109714o;
    }
}
