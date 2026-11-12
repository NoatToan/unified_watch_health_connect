package l43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<A> implements h<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k43.a f109984a;

    /* JADX INFO: renamed from: l43.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2102a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109985a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f109985a = iArr;
        }
    }

    public a(k43.a aVar) {
        aVar.getClass();
        this.f109984a = aVar;
    }

    @Override // l43.h
    public final List<A> a(o0 o0Var, z33.n nVar, d dVar) {
        List list;
        nVar.getClass();
        dVar.getClass();
        boolean z14 = nVar instanceof s33.e;
        k43.a aVar = this.f109984a;
        if (z14) {
            list = (List) ((s33.e) nVar).f(aVar.f102883b);
        } else if (nVar instanceof s33.j) {
            list = (List) ((s33.j) nVar).f(aVar.f102885d);
        } else {
            if (!(nVar instanceof s33.o)) {
                ds.e0.t(nVar, "Unknown message: ");
                return null;
            }
            int i14 = C2102a.f109985a[dVar.ordinal()];
            if (i14 == 1) {
                list = (List) ((s33.o) nVar).f(aVar.f102887f);
            } else if (i14 == 2) {
                list = (List) ((s33.o) nVar).f(aVar.f102888g);
            } else {
                if (i14 != 3) {
                    vb.h.z("Unsupported callable kind with property proto");
                    return null;
                }
                list = (List) ((s33.o) nVar).f(aVar.f102889h);
            }
        }
        if (list == null) {
            list = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), o0Var.f110076a));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> b(o0 o0Var, z33.n nVar, d dVar, int i14, s33.w wVar) {
        o0Var.getClass();
        nVar.getClass();
        dVar.getClass();
        List<A> listH = wVar != null ? h(o0Var, nVar, dVar, i14, wVar) : null;
        return listH == null ? p13.j0.f134944a : listH;
    }

    @Override // l43.h
    public final List<A> d(o0 o0Var, s33.o oVar) {
        oVar.getClass();
        z33.g.f<s33.o, List<s33.b>> fVar = this.f109984a.f102891j;
        List list = fVar != null ? (List) oVar.f(fVar) : null;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), o0Var.f110076a));
        }
        return arrayList;
    }

    @Override // l43.h
    public final ArrayList f(s33.u uVar, u33.d dVar) {
        uVar.getClass();
        Iterable iterable = (List) uVar.f(this.f109984a.f102897p);
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> g(o0 o0Var, s33.o oVar) {
        oVar.getClass();
        z33.g.f<s33.o, List<s33.b>> fVar = this.f109984a.f102892k;
        List list = fVar != null ? (List) oVar.f(fVar) : null;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), o0Var.f110076a));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> h(o0 o0Var, z33.n nVar, d dVar, int i14, s33.w wVar) {
        o0Var.getClass();
        nVar.getClass();
        dVar.getClass();
        wVar.getClass();
        Iterable iterable = (List) wVar.f(this.f109984a.f102895n);
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), o0Var.f110076a));
        }
        return arrayList;
    }

    @Override // l43.h
    public final ArrayList i(s33.s sVar, u33.d dVar) {
        sVar.getClass();
        Iterable iterable = (List) sVar.f(this.f109984a.f102896o);
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> j(o0 o0Var, s33.h hVar) {
        o0Var.getClass();
        hVar.getClass();
        Iterable iterable = (List) hVar.f(this.f109984a.f102893l);
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), o0Var.f110076a));
        }
        return arrayList;
    }

    @Override // l43.h
    public final ArrayList k(o0.a aVar) {
        aVar.getClass();
        Iterable iterable = (List) aVar.f110079d.f(this.f109984a.f102884c);
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), aVar.f110076a));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> l(o0 o0Var, z33.n nVar, d dVar) {
        nVar.getClass();
        dVar.getClass();
        boolean z14 = nVar instanceof s33.j;
        List list = null;
        k43.a aVar = this.f109984a;
        if (z14) {
            z33.g.f<s33.j, List<s33.b>> fVar = aVar.f102886e;
            if (fVar != null) {
                list = (List) ((s33.j) nVar).f(fVar);
            }
        } else {
            if (!(nVar instanceof s33.o)) {
                ds.e0.t(nVar, "Unknown message: ");
                return null;
            }
            int i14 = C2102a.f109985a[dVar.ordinal()];
            if (i14 != 1 && i14 != 2 && i14 != 3) {
                ds.e0.t(dVar, "Unsupported callable kind with property proto for receiver annotations: ");
                return null;
            }
            z33.g.f<s33.o, List<s33.b>> fVar2 = aVar.f102890i;
            if (fVar2 != null) {
                list = (List) ((s33.o) nVar).f(fVar2);
            }
        }
        if (list == null) {
            list = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) this).m((s33.b) it.next(), o0Var.f110076a));
        }
        return arrayList;
    }
}
