package n43;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import t23.c1;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends i43.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f123695f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l43.p f123696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f123697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.j f123698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.k f123699e;

    public interface a {
        Collection<r0> a(x33.f fVar, b33.b bVar);

        Set<x33.f> b();

        Collection<x0> c(x33.f fVar, b33.b bVar);

        Set<x33.f> d();

        c1 e(x33.f fVar);

        Set<x33.f> f();

        void g(ArrayList arrayList, i43.d dVar, e23.l lVar, b33.b bVar);
    }

    public final class b implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ k23.l<Object>[] f123700j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f123701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f123702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f123703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o43.h<x33.f, Collection<x0>> f123704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o43.h<x33.f, Collection<r0>> f123705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o43.i<x33.f, c1> f123706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o43.j f123707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final o43.j f123708h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ z f123709i;

        public static final class a implements e23.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z33.p f123710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ByteArrayInputStream f123711b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f123712c;

            public a(z33.p pVar, ByteArrayInputStream byteArrayInputStream, z zVar) {
                this.f123710a = pVar;
                this.f123711b = byteArrayInputStream;
                this.f123712c = zVar;
            }

            @Override // e23.a
            public final Object invoke() {
                return ((z33.b) this.f123710a).c(this.f123711b, this.f123712c.f123696b.f110085a.f110066p);
            }
        }

        static {
            p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
            t0 t0Var = s0.f105811a;
            f123700j = new k23.l[]{t0Var.h(i0Var), n23.j.l(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, t0Var)};
        }

        public b(z zVar, List<s33.j> list, List<s33.o> list2, List<s33.t> list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f123709i = zVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                x33.f fVarD = x33.f.d(zVar.f123696b.f110086b.getString(((s33.j) ((z33.n) obj)).f156685f));
                Object arrayList = linkedHashMap.get(fVarD);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarD, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f123701a = h(linkedHashMap);
            z zVar2 = this.f123709i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                x33.f fVarD2 = x33.f.d(zVar2.f123696b.f110086b.getString(((s33.o) ((z33.n) obj2)).f156771f));
                Object arrayList2 = linkedHashMap2.get(fVarD2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarD2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f123702b = h(linkedHashMap2);
            this.f123709i.f123696b.f110085a.f110053c.getClass();
            z zVar3 = this.f123709i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list3) {
                x33.f fVarD3 = x33.f.d(zVar3.f123696b.f110086b.getString(((s33.t) ((z33.n) obj3)).f156911e));
                Object arrayList3 = linkedHashMap3.get(fVarD3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(fVarD3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.f123703c = h(linkedHashMap3);
            this.f123704d = this.f123709i.f123696b.f110085a.f110051a.e(new a0(this));
            this.f123705e = this.f123709i.f123696b.f110085a.f110051a.e(new b0(this));
            this.f123706f = this.f123709i.f123696b.f110085a.f110051a.h(new c0(this));
            z zVar4 = this.f123709i;
            this.f123707g = zVar4.f123696b.f110085a.f110051a.g(new d0(this, zVar4));
            z zVar5 = this.f123709i;
            this.f123708h = zVar5.f123696b.f110085a.f110051a.g(new e0(this, zVar5));
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<z33.a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                for (z33.a aVar : iterable) {
                    int serializedSize = aVar.getSerializedSize();
                    int iF = CodedOutputStream.f(serializedSize) + serializedSize;
                    if (iF > 4096) {
                        iF = 4096;
                    }
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(byteArrayOutputStream, iF);
                    codedOutputStreamJ.v(serializedSize);
                    aVar.a(codedOutputStreamJ);
                    codedOutputStreamJ.i();
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // n43.z.a
        public final Collection<r0> a(x33.f fVar, b33.b bVar) {
            fVar.getClass();
            bVar.getClass();
            return !d().contains(fVar) ? p13.j0.f134944a : (Collection) ((o43.e.k) this.f123705e).invoke(fVar);
        }

        @Override // n43.z.a
        public final Set<x33.f> b() {
            return (Set) gl1.d.B(this.f123707g, f123700j[0]);
        }

        @Override // n43.z.a
        public final Collection<x0> c(x33.f fVar, b33.b bVar) {
            fVar.getClass();
            bVar.getClass();
            return !b().contains(fVar) ? p13.j0.f134944a : (Collection) ((o43.e.k) this.f123704d).invoke(fVar);
        }

        @Override // n43.z.a
        public final Set<x33.f> d() {
            return (Set) gl1.d.B(this.f123708h, f123700j[1]);
        }

        @Override // n43.z.a
        public final c1 e(x33.f fVar) {
            fVar.getClass();
            return this.f123706f.invoke(fVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // n43.z.a
        public final Set<x33.f> f() {
            return this.f123703c.keySet();
        }

        @Override // n43.z.a
        public final void g(ArrayList arrayList, i43.d dVar, e23.l lVar, b33.b bVar) {
            dVar.getClass();
            lVar.getClass();
            bVar.getClass();
            i43.d.f91028c.getClass();
            if (dVar.a(i43.d.f91034i)) {
                Set<x33.f> setD = d();
                ArrayList arrayList2 = new ArrayList();
                for (x33.f fVar : setD) {
                    if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                        arrayList2.addAll(a(fVar, bVar));
                    }
                }
                b43.k kVar = b43.k.f15730a;
                kVar.getClass();
                p13.c0.u(arrayList2, kVar);
                arrayList.addAll(arrayList2);
            }
            i43.d.f91028c.getClass();
            if (dVar.a(i43.d.f91033h)) {
                Set<x33.f> setB = b();
                ArrayList arrayList3 = new ArrayList();
                for (x33.f fVar2 : setB) {
                    if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                        arrayList3.addAll(c(fVar2, bVar));
                    }
                }
                b43.k kVar2 = b43.k.f15730a;
                kVar2.getClass();
                p13.c0.u(arrayList3, kVar2);
                arrayList.addAll(arrayList3);
            }
        }
    }

    static {
        p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(z.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        t0 t0Var = s0.f105811a;
        f123695f = new k23.l[]{t0Var.h(i0Var), n23.j.l(z.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, t0Var)};
    }

    public z(l43.p pVar, List<s33.j> list, List<s33.o> list2, List<s33.t> list3, e23.a<? extends Collection<x33.f>> aVar) {
        pVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        aVar.getClass();
        this.f123696b = pVar;
        l43.n nVar = pVar.f110085a;
        nVar.f110053c.getClass();
        this.f123697c = new b(this, list, list2, list3);
        o43.n nVar2 = nVar.f110051a;
        this.f123698d = nVar2.g(new x(aVar));
        this.f123699e = nVar2.a(new y(this));
    }

    @Override // i43.m, i43.l
    public Collection<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return this.f123697c.a(fVar, bVar);
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> b() {
        return this.f123697c.b();
    }

    @Override // i43.m, i43.l
    public Collection<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return this.f123697c.c(fVar, bVar);
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> d() {
        return this.f123697c.d();
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> e() {
        k23.l<Object> lVar = f123695f[1];
        o43.k kVar = this.f123699e;
        kVar.getClass();
        lVar.getClass();
        return (Set) kVar.invoke();
    }

    @Override // i43.m, i43.o
    public t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        if (!q(fVar)) {
            a aVar = this.f123697c;
            if (aVar.f().contains(fVar)) {
                return aVar.e(fVar);
            }
            return null;
        }
        l43.n nVar = this.f123696b.f110085a;
        x33.b bVarL = l(fVar);
        l43.l lVar = nVar.f110070t;
        l43.l.b bVar2 = l43.l.f110040c;
        lVar.getClass();
        return (t23.e) lVar.f110043b.invoke(new l43.l.a(bVarL, null));
    }

    public abstract void h(e23.l lVar, ArrayList arrayList);

    public final List i(i43.d dVar, e23.l lVar, b33.b bVar) {
        c1 c1VarE;
        dVar.getClass();
        lVar.getClass();
        bVar.getClass();
        ArrayList arrayList = new ArrayList(0);
        i43.d.f91028c.getClass();
        if (dVar.a(i43.d.f91030e)) {
            h(lVar, arrayList);
        }
        a aVar = this.f123697c;
        aVar.g(arrayList, dVar, lVar, bVar);
        if (dVar.a(i43.d.f91036k)) {
            for (x33.f fVar : m()) {
                if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                    l43.n nVar = this.f123696b.f110085a;
                    x33.b bVarL = l(fVar);
                    l43.l lVar2 = nVar.f110070t;
                    l43.l.b bVar2 = l43.l.f110040c;
                    lVar2.getClass();
                    t23.e eVar = (t23.e) lVar2.f110043b.invoke(new l43.l.a(bVarL, null));
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
            }
        }
        i43.d.f91028c.getClass();
        if (dVar.a(i43.d.f91031f)) {
            for (x33.f fVar2 : aVar.f()) {
                if (((Boolean) lVar.invoke(fVar2)).booleanValue() && (c1VarE = aVar.e(fVar2)) != null) {
                    arrayList.add(c1VarE);
                }
            }
        }
        return w02.b0.f(arrayList);
    }

    public void j(ArrayList arrayList, x33.f fVar) {
        fVar.getClass();
    }

    public void k(ArrayList arrayList, x33.f fVar) {
        fVar.getClass();
    }

    public abstract x33.b l(x33.f fVar);

    public final Set<x33.f> m() {
        return (Set) gl1.d.B(this.f123698d, f123695f[0]);
    }

    public abstract Set<x33.f> n();

    public abstract Set<x33.f> o();

    public abstract Set<x33.f> p();

    public boolean q(x33.f fVar) {
        fVar.getClass();
        return m().contains(fVar);
    }

    public boolean r(h0 h0Var) {
        return true;
    }
}
