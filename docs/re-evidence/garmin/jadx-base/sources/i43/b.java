package i43;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p13.d0;
import p13.j0;
import p13.l0;
import t23.r0;
import t23.x0;
import t23.z;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f91022d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l[] f91024c;

    private b(String str, l[] lVarArr) {
        this.f91023b = str;
        this.f91024c = lVarArr;
    }

    @Override // i43.l
    public final Collection<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        l[] lVarArr = this.f91024c;
        int length = lVarArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return lVarArr[0].a(fVar, bVar);
        }
        Collection<r0> collectionA = null;
        for (l lVar : lVarArr) {
            collectionA = y43.a.a(collectionA, lVar.a(fVar, bVar));
        }
        return collectionA == null ? l0.f134950a : collectionA;
    }

    @Override // i43.l
    public final Set<x33.f> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l lVar : this.f91024c) {
            d0.v(linkedHashSet, lVar.b());
        }
        return linkedHashSet;
    }

    @Override // i43.l
    public final Collection<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        l[] lVarArr = this.f91024c;
        int length = lVarArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return lVarArr[0].c(fVar, bVar);
        }
        Collection<x0> collectionA = null;
        for (l lVar : lVarArr) {
            collectionA = y43.a.a(collectionA, lVar.c(fVar, bVar));
        }
        return collectionA == null ? l0.f134950a : collectionA;
    }

    @Override // i43.l
    public final Set<x33.f> d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l lVar : this.f91024c) {
            d0.v(linkedHashSet, lVar.d());
        }
        return linkedHashSet;
    }

    @Override // i43.l
    public final Set<x33.f> e() {
        l[] lVarArr = this.f91024c;
        lVarArr.getClass();
        return n.a(lVarArr.length == 0 ? j0.f134944a : new p13.t(lVarArr));
    }

    @Override // i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        t23.h hVar = null;
        for (l lVar : this.f91024c) {
            t23.h hVarF = lVar.f(fVar, bVar);
            if (hVarF != null) {
                if (!(hVarF instanceof t23.i) || !((z) hVarF).O()) {
                    return hVarF;
                }
                if (hVar == null) {
                    hVar = hVarF;
                }
            }
        }
        return hVar;
    }

    @Override // i43.o
    public final Collection<t23.l> g(d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        l[] lVarArr = this.f91024c;
        int length = lVarArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return lVarArr[0].g(dVar, lVar);
        }
        Collection<t23.l> collectionA = null;
        for (l lVar2 : lVarArr) {
            collectionA = y43.a.a(collectionA, lVar2.g(dVar, lVar));
        }
        return collectionA == null ? l0.f134950a : collectionA;
    }

    public final String toString() {
        return this.f91023b;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(String str, List list) {
            list.getClass();
            z43.i iVar = new z43.i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar != l.b.f91061b) {
                    if (lVar instanceof b) {
                        d0.w(iVar, ((b) lVar).f91024c);
                    } else {
                        iVar.add(lVar);
                    }
                }
            }
            return b(str, iVar);
        }

        public static l b(String str, z43.i iVar) {
            int i14 = iVar.f202424a;
            if (i14 != 0) {
                return i14 != 1 ? new b(str, (l[]) iVar.toArray(new l[0]), null) : (l) iVar.get(0);
            }
            return l.b.f91061b;
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, l[] lVarArr, p005kotlin.jvm.internal.j jVar) {
        this(str, lVarArr);
    }
}
