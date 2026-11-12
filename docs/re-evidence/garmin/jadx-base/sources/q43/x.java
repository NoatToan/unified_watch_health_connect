package q43;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import lc.u0;
import p13.h0;
import p13.j0;
import p43.e1;
import p43.f2;
import p43.i1;
import p43.k1;
import p43.l1;
import p43.m0;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.v0;
import p43.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f142818a = new x();

    private x() {
    }

    public static ArrayList a(AbstractCollection abstractCollection, e23.p pVar) {
        ArrayList<v0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            if (!arrayList.isEmpty()) {
                for (v0 v0Var2 : arrayList) {
                    if (v0Var2 != v0Var) {
                        v0Var2.getClass();
                        v0Var.getClass();
                        if (((Boolean) pVar.invoke(v0Var2, v0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [p43.k1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, p43.k1, w43.a, w43.e] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v18, types: [p43.v0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, p43.n0, p43.v0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
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
    public final v0 b(ArrayList arrayList) {
        v0 v0VarA;
        Set setH0;
        arrayList.size();
        ArrayList<v0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            if (v0Var.F0() instanceof m0) {
                Collection<n0> collectionB = v0Var.F0().b();
                collectionB.getClass();
                Collection<n0> collection = collectionB;
                ArrayList arrayList3 = new ArrayList(p13.y.r(collection, 10));
                for (n0 n0Var : collection) {
                    n0Var.getClass();
                    v0 v0VarY = oi0.c.Y(n0Var);
                    if (v0Var.G0()) {
                        v0VarY = v0VarY.J0(true);
                    }
                    arrayList3.add(v0VarY);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(v0Var);
            }
        }
        a aVarA = a.f142819a;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            aVarA = aVarA.a((f2) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v0 v0VarJ0 : arrayList2) {
            if (aVarA == a.f142822d) {
                if (v0VarJ0 instanceof h) {
                    h hVar = (h) v0VarJ0;
                    v0VarJ0 = new h(hVar.f142790b, hVar.f142791c, hVar.f142792d, hVar.f142793e, hVar.f142794f, true);
                }
                v0VarJ0.getClass();
                v0 v0VarA2 = p43.w.a.a(p43.w.f135930d, v0VarJ0, false);
                v0VarJ0 = (v0VarA2 == null && (v0VarA2 = z0.b(v0VarJ0)) == null) ? v0VarJ0.J0(false) : v0VarA2;
            }
            linkedHashSet.add(v0VarJ0);
        }
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((v0) it4.next()).E0());
        }
        Iterator it5 = arrayList4.iterator();
        v0 v0Var2 = null;
        if (!it5.hasNext()) {
            org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            k1 k1Var = (k1) it5.next();
            next = (k1) next;
            next.getClass();
            k1.a aVar = k1.f135863b;
            k1Var.getClass();
            if (!next.isEmpty() || !k1Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection<Integer> collectionValues = aVar.f182062a.values();
                collectionValues.getClass();
                Iterator<Integer> it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = it6.next().intValue();
                    i1 i1Var = (i1) next.f181997a.get(iIntValue);
                    i1 i1Var2 = (i1) k1Var.f181997a.get(iIntValue);
                    p43.q qVarC = i1Var == null ? i1Var2 != null ? i1Var2.c(i1Var) : null : i1Var.c(i1Var2);
                    if (qVarC != null) {
                        arrayList5.add(qVarC);
                    }
                }
                next = k1.a.a(arrayList5);
            }
        }
        k1 k1Var2 = (k1) next;
        if (linkedHashSet.size() == 1) {
            v0VarA = (v0) h0.H0(linkedHashSet);
        } else {
            new w(linkedHashSet);
            ArrayList arrayListA = a(linkedHashSet, new y(this));
            arrayListA.isEmpty();
            d43.q.f57490f.getClass();
            d43.q.a.EnumC1228a enumC1228a = d43.q.a.EnumC1228a.INTERSECTION_TYPE;
            if (!arrayListA.isEmpty()) {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it7.next();
                while (it7.hasNext()) {
                    v0 v0Var3 = (v0) it7.next();
                    next2 = (v0) next2;
                    d43.q.f57490f.getClass();
                    if (next2 != 0 && v0Var3 != null) {
                        m1 m1VarF0 = next2.F0();
                        m1 m1VarF1 = v0Var3.F0();
                        boolean z14 = m1VarF0 instanceof d43.q;
                        if (z14 && (m1VarF1 instanceof d43.q)) {
                            d43.q qVar = (d43.q) m1VarF0;
                            Set<n0> set = qVar.f57493c;
                            Set<n0> set2 = ((d43.q) m1VarF1).f57493c;
                            int i14 = d43.q.a.b.f57499a[enumC1228a.ordinal()];
                            if (i14 == 1) {
                                setH0 = h0.h0(set, set2);
                            } else {
                                if (i14 != 2) {
                                    u0.r();
                                    return null;
                                }
                                setH0 = h0.h1(set, set2);
                            }
                            d43.q qVar2 = new d43.q(qVar.f57491a, qVar.f57492b, setH0, null);
                            k1.f135863b.getClass();
                            k1 k1Var3 = k1.f135864c;
                            q0 q0Var = q0.f135904a;
                            k1Var3.getClass();
                            next2 = q0.g(qVar2, j0.f134944a, k1Var3, false, r43.l.a(r43.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
                        } else if (z14) {
                            if (((d43.q) m1VarF0).f57493c.contains(v0Var3)) {
                                next2 = v0Var3;
                            }
                        } else if (!(m1VarF1 instanceof d43.q) || !((d43.q) m1VarF1).f57493c.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                v0Var2 = (v0) next2;
            }
            if (v0Var2 != null) {
                v0VarA = v0Var2;
            } else {
                n.f142806b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new z(n.a.f142808b));
                arrayListA2.isEmpty();
                v0VarA = arrayListA2.size() < 2 ? (v0) h0.H0(arrayListA2) : new m0(linkedHashSet).a();
            }
        }
        return v0VarA.L0(k1Var2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f142819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2685a f142820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f142821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f142822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f142823e;

        /* JADX INFO: renamed from: q43.x$a$a, reason: collision with other inner class name */
        public static final class C2685a extends a {
            public C2685a(String str, int i14) {
                super(str, i14, null);
            }

            @Override // q43.x.a
            public final a a(f2 f2Var) {
                f2Var.getClass();
                return a.b(f2Var);
            }
        }

        public static final class b extends a {
            public b(String str, int i14) {
                super(str, i14, null);
            }

            @Override // q43.x.a
            public final a a(f2 f2Var) {
                f2Var.getClass();
                return this;
            }
        }

        public static final class c extends a {
            public c(String str, int i14) {
                super(str, i14, null);
            }

            @Override // q43.x.a
            public final a a(f2 f2Var) {
                f2Var.getClass();
                return a.b(f2Var);
            }
        }

        public static final class d extends a {
            public d(String str, int i14) {
                super(str, i14, null);
            }

            @Override // q43.x.a
            public final a a(f2 f2Var) {
                f2Var.getClass();
                a aVarB = a.b(f2Var);
                return aVarB == a.f142820b ? this : aVarB;
            }
        }

        static {
            c cVar = new c("START", 0);
            f142819a = cVar;
            C2685a c2685a = new C2685a("ACCEPT_NULL", 1);
            f142820b = c2685a;
            d dVar = new d("UNKNOWN", 2);
            f142821c = dVar;
            b bVar = new b("NOT_NULL", 3);
            f142822d = bVar;
            f142823e = new a[]{cVar, c2685a, dVar, bVar};
        }

        public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static a b(f2 f2Var) {
            f2Var.getClass();
            if (f2Var.G0()) {
                return f142820b;
            }
            if (!(f2Var instanceof p43.w) || !(((p43.w) f2Var).f135931b instanceof e1)) {
                boolean z14 = f2Var instanceof e1;
                d dVar = f142821c;
                if (z14) {
                    return dVar;
                }
                q.f142812a.getClass();
                p43.c cVar = p43.c.f135803a;
                s sVar = s.f142813a;
                sVar.getClass();
                l1 l1VarA = q43.a.a(false, sVar, null, null, 24);
                v0 v0VarQ = oi0.c.Q(f2Var);
                l1.c.b bVar = l1.c.b.f135881a;
                cVar.getClass();
                if (!p43.c.a(l1VarA, v0VarQ, bVar)) {
                    return dVar;
                }
            }
            return f142822d;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f142823e.clone();
        }

        public abstract a a(f2 f2Var);

        private a(String str, int i14) {
            super(str, i14);
        }
    }
}
