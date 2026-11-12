package i43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p43.n0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends i43.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f91078c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f91079b;

    private y(String str, l lVar) {
        this.f91079b = lVar;
    }

    @Override // i43.a, i43.l
    public final Collection<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return b43.w.a(super.a(fVar, bVar), w.f91076a);
    }

    @Override // i43.a, i43.l
    public final Collection<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return b43.w.a(super.c(fVar, bVar), v.f91075a);
    }

    @Override // i43.a, i43.o
    public final Collection<t23.l> g(d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        Collection<t23.l> collectionG = super.g(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionG) {
            if (((t23.l) obj) instanceof t23.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        o13.p pVar = new o13.p(arrayList, arrayList2);
        List list = (List) pVar.f128594a;
        List list2 = (List) pVar.f128595b;
        list.getClass();
        return h0.C0(b43.w.a(list, x.f91077a), list2);
    }

    @Override // i43.a
    public final l i() {
        return this.f91079b;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(String str, Collection collection) {
            collection.getClass();
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(p13.y.r(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((n0) it.next()).i());
            }
            z43.i iVarB = y43.a.b(arrayList);
            b.f91022d.getClass();
            l lVarB = b.a.b(str, iVarB);
            return iVarB.f202424a <= 1 ? lVarB : new y(str, lVarB, null);
        }

        private a() {
        }
    }

    public /* synthetic */ y(String str, l lVar, p005kotlin.jvm.internal.j jVar) {
        this(str, lVar);
    }
}
