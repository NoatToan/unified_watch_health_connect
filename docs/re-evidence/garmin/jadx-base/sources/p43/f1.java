package p43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f135831c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f135832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135833b;

    static {
        new f1(h1.a.f135854a, false);
    }

    public f1(h1 h1Var, boolean z14) {
        h1Var.getClass();
        this.f135832a = h1Var;
        this.f135833b = z14;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static k1 b(f2 f2Var, k1 k1Var) {
        q qVarA;
        if (o72.t.R(f2Var)) {
            return f2Var.E0();
        }
        k1 k1VarE0 = f2Var.E0();
        k1Var.getClass();
        k1.a aVar = k1.f135863b;
        k1VarE0.getClass();
        if (k1Var.isEmpty() && k1VarE0.isEmpty()) {
            return k1Var;
        }
        ArrayList arrayList = new ArrayList();
        Collection<Integer> collectionValues = aVar.f182062a.values();
        collectionValues.getClass();
        Iterator<Integer> it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            i1 i1Var = (i1) k1Var.f181997a.get(iIntValue);
            i1 i1Var2 = (i1) k1VarE0.f181997a.get(iIntValue);
            if (i1Var == null) {
                qVarA = i1Var2 != null ? i1Var2.a(i1Var) : null;
            } else {
                qVarA = i1Var.a(i1Var2);
            }
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        return k1.a.a(arrayList);
    }

    public final void a(u23.h hVar, u23.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator<u23.c> it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        for (u23.c cVar : hVar2) {
            if (hashSet.contains(cVar.c())) {
                this.f135832a.a(cVar);
            }
        }
    }

    public final v0 c(g1 g1Var, k1 k1Var, boolean z14, int i14, boolean z15) {
        g2 g2Var = g2.INVARIANT;
        t23.c1 c1Var = g1Var.f135840b;
        t1 t1VarD = d(new v1(g2Var, c1Var.z0()), g1Var, null, i14);
        n0 type = t1VarD.getType();
        type.getClass();
        v0 v0VarA = y1.a(type);
        if (o72.t.R(v0VarA)) {
            return v0VarA;
        }
        t1VarD.a();
        a(v0VarA.getAnnotations(), r.a(k1Var));
        if (!o72.t.R(v0VarA)) {
            v0VarA = y1.d(v0VarA, null, b(v0VarA, k1Var), 1);
        }
        v0 v0VarK = d2.k(v0VarA, z14);
        if (!z15) {
            return v0VarK;
        }
        m1 m1VarH = c1Var.h();
        m1VarH.getClass();
        return z0.c(v0VarK, q0.g(m1VarH, g1Var.f135841c, k1Var, z14, i43.l.b.f91061b));
    }

    public final t1 d(t1 t1Var, g1 g1Var, t23.d1 d1Var, int i14) {
        g2 g2VarM;
        n0 b0Var;
        g2 g2Var;
        g2 g2Var2;
        t23.c1 c1Var = g1Var.f135840b;
        f135831c.getClass();
        if (i14 > 100) {
            o2.c.l(c1Var.getName(), "Too deep recursion while expanding type alias ");
            return null;
        }
        if (t1Var.b()) {
            d1Var.getClass();
            return d2.l(d1Var);
        }
        n0 type = t1Var.getType();
        type.getClass();
        m1 m1VarF0 = type.F0();
        m1VarF0.getClass();
        t23.h hVarT = m1VarF0.t();
        t1 t1Var2 = hVarT instanceof t23.d1 ? g1Var.f135842d.get(hVarT) : null;
        h1 h1Var = this.f135832a;
        if (t1Var2 != null) {
            if (t1Var2.b()) {
                d1Var.getClass();
                return d2.l(d1Var);
            }
            f2 f2VarI0 = t1Var2.getType().I0();
            g2 g2VarA = t1Var2.a();
            g2VarA.getClass();
            g2 g2VarA2 = t1Var.a();
            g2VarA2.getClass();
            if (g2VarA2 != g2VarA && g2VarA2 != (g2Var2 = g2.INVARIANT)) {
                if (g2VarA == g2Var2) {
                    g2VarA = g2VarA2;
                } else {
                    h1Var.c(c1Var, f2VarI0);
                }
            }
            if (d1Var == null || (g2VarM = d1Var.m()) == null) {
                g2VarM = g2.INVARIANT;
            }
            if (g2VarM != g2VarA && g2VarM != (g2Var = g2.INVARIANT)) {
                if (g2VarA == g2Var) {
                    g2VarA = g2Var;
                } else {
                    h1Var.c(c1Var, f2VarI0);
                }
            }
            a(type.getAnnotations(), f2VarI0.getAnnotations());
            if (f2VarI0 instanceof b0) {
                b0 b0Var2 = (b0) f2VarI0;
                k1 k1VarB = b(b0Var2, type.E0());
                k1VarB.getClass();
                b0Var = new b0(o72.t.D(b0Var2.f135830c), k1VarB);
            } else {
                v0 v0VarK = d2.k(y1.a(f2VarI0), type.G0());
                k1 k1VarE0 = type.E0();
                if (!o72.t.R(v0VarK)) {
                    v0VarK = y1.d(v0VarK, null, b(v0VarK, k1VarE0), 1);
                }
                b0Var = v0VarK;
            }
            return new v1(g2VarA, b0Var);
        }
        f2 f2VarI1 = t1Var.getType().I0();
        if (!(f2VarI1 instanceof b0)) {
            v0 v0VarA = y1.a(f2VarI1);
            if (!o72.t.R(v0VarA)) {
                u43.c cVar = u43.c.f168629a;
                cVar.getClass();
                if (d2.d(v0VarA, cVar, null)) {
                    m1 m1VarF1 = v0VarA.F0();
                    t23.h hVarT2 = m1VarF1.t();
                    m1VarF1.getParameters().size();
                    v0VarA.D0().size();
                    if (!(hVarT2 instanceof t23.d1)) {
                        int i15 = 0;
                        if (hVarT2 instanceof t23.c1) {
                            t23.c1 c1Var2 = (t23.c1) hVarT2;
                            if (g1Var.a(c1Var2)) {
                                h1Var.d(c1Var2);
                                g2 g2Var3 = g2.INVARIANT;
                                r43.k kVar = r43.k.f150367f;
                                String str = c1Var2.getName().f188605a;
                                str.getClass();
                                return new v1(g2Var3, r43.l.c(kVar, str));
                            }
                            List<t1> listD0 = v0VarA.D0();
                            ArrayList arrayList = new ArrayList(p13.y.r(listD0, 10));
                            for (Object obj : listD0) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    p13.x.q();
                                    throw null;
                                }
                                arrayList.add(d((t1) obj, g1Var, m1VarF1.getParameters().get(i15), i14 + 1));
                                i15 = i16;
                            }
                            g1.f135838e.getClass();
                            return new v1(t1Var.a(), z0.c(c(g1.a.a(g1Var, c1Var2, arrayList), v0VarA.E0(), v0VarA.G0(), i14 + 1, false), e(v0VarA, g1Var, i14)));
                        }
                        v0 v0VarE = e(v0VarA, g1Var, i14);
                        a2 a2VarD = a2.d(v0VarE);
                        for (Object obj2 : v0VarE.D0()) {
                            int i17 = i15 + 1;
                            if (i15 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            t1 t1Var3 = (t1) obj2;
                            if (!t1Var3.b()) {
                                n0 type2 = t1Var3.getType();
                                type2.getClass();
                                u43.b bVar = u43.b.f168628a;
                                bVar.getClass();
                                if (!d2.d(type2, bVar, null)) {
                                    t1 t1Var4 = v0VarA.D0().get(i15);
                                    t23.d1 d1Var2 = v0VarA.F0().getParameters().get(i15);
                                    if (this.f135833b) {
                                        n0 type3 = t1Var4.getType();
                                        type3.getClass();
                                        n0 type4 = t1Var3.getType();
                                        type4.getClass();
                                        d1Var2.getClass();
                                        h1Var.b(a2VarD, type3, type4, d1Var2);
                                    }
                                }
                            }
                            i15 = i17;
                        }
                        return new v1(t1Var.a(), v0VarE);
                    }
                }
            }
        }
        return t1Var;
    }

    public final v0 e(v0 v0Var, g1 g1Var, int i14) {
        m1 m1VarF0 = v0Var.F0();
        List<t1> listD0 = v0Var.D0();
        ArrayList arrayList = new ArrayList(p13.y.r(listD0, 10));
        int i15 = 0;
        for (Object obj : listD0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            t1 t1Var = (t1) obj;
            t1 t1VarD = d(t1Var, g1Var, m1VarF0.getParameters().get(i15), i14 + 1);
            if (!t1VarD.b()) {
                t1VarD = new v1(t1VarD.a(), d2.j(t1VarD.getType(), t1Var.getType().G0()));
            }
            arrayList.add(t1VarD);
            i15 = i16;
        }
        return y1.d(v0Var, arrayList, null, 2);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
