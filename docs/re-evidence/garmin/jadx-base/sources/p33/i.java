package p33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p43.d2;
import p43.f2;
import p43.g2;
import p43.t1;
import p43.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p43.n0 f135450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f135451b;

        public a(p43.n0 n0Var, int i14) {
            this.f135450a = n0Var;
            this.f135451b = i14;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p43.v0 f135452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f135453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f135454c;

        public b(p43.v0 v0Var, int i14, boolean z14) {
            this.f135452a = v0Var;
            this.f135453b = i14;
            this.f135454c = z14;
        }
    }

    public i(k33.d dVar) {
        dVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    public final b a(p43.v0 v0Var, d dVar, int i14, q1 q1Var, boolean z14, boolean z15) {
        t23.h hVarT;
        t23.e eVarA;
        Boolean bool;
        p43.m1 m1VarF0;
        a aVar;
        p43.n0 n0Var;
        u1 u1VarL;
        d dVar2 = dVar;
        q1Var.getClass();
        q1 q1Var2 = q1.INFLEXIBLE;
        int i15 = 0;
        boolean z16 = q1Var != q1Var2;
        boolean z17 = (z15 && z14) ? false : true;
        p43.n0 n0Var2 = null;
        if ((z16 || !v0Var.D0().isEmpty()) && (hVarT = v0Var.F0().t()) != null) {
            j jVar = (j) dVar2.invoke(Integer.valueOf(i14));
            h hVar = s1.f135515a;
            s23.d dVar3 = s23.d.f156251a;
            if (q1Var == q1Var2 || !(hVarT instanceof t23.e)) {
                eVarA = null;
            } else if (jVar.f135461b == k.READ_ONLY && q1Var == q1.FLEXIBLE_LOWER) {
                t23.e eVar = (t23.e) hVarT;
                dVar3.getClass();
                if (s23.d.b(eVar)) {
                    x33.d dVarF = b43.i.f(eVar);
                    s23.c.f156232a.getClass();
                    x33.c cVar = s23.c.f156242k.get(dVarF);
                    if (cVar == null) {
                        org.apache.commons.lang3.e.l("Given class ", eVar, " is not a mutable collection");
                        return null;
                    }
                    eVarA = f43.e.e(eVar).j(cVar);
                    eVarA.getClass();
                } else if (jVar.f135461b == k.MUTABLE) {
                    eVarA = null;
                } else {
                    eVarA = null;
                }
            } else if (jVar.f135461b == k.MUTABLE || q1Var != q1.FLEXIBLE_UPPER) {
                eVarA = null;
            } else {
                t23.e eVar2 = (t23.e) hVarT;
                dVar3.getClass();
                s23.c cVar2 = s23.c.f156232a;
                x33.d dVarF2 = b43.i.f(eVar2);
                cVar2.getClass();
                if (s23.c.f156243l.containsKey(dVarF2)) {
                    eVarA = s23.d.a(eVar2);
                } else {
                    eVarA = null;
                }
            }
            if (q1Var == q1Var2) {
                bool = null;
            } else {
                m mVar = jVar.f135460a;
                int i16 = mVar == null ? -1 : s1.a.f135517a[mVar.ordinal()];
                if (i16 == 1) {
                    bool = Boolean.TRUE;
                } else if (i16 != 2) {
                    bool = null;
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (eVarA == null || (m1VarF0 = eVarA.h()) == null) {
                m1VarF0 = v0Var.F0();
            }
            int i17 = i14 + 1;
            List<t1> listD0 = v0Var.D0();
            List<t23.d1> parameters = m1VarF0.getParameters();
            parameters.getClass();
            Iterator<T> it = listD0.iterator();
            Iterator<T> it3 = parameters.iterator();
            ArrayList arrayList = new ArrayList(Math.min(p13.y.r(listD0, 10), p13.y.r(parameters, 10)));
            while (it.hasNext() && it3.hasNext()) {
                Object next = it.next();
                t23.d1 d1Var = (t23.d1) it3.next();
                t1 t1Var = (t1) next;
                if (z17) {
                    if (!t1Var.b()) {
                        aVar = b(t1Var.getType().I0(), dVar2, i17, z15);
                    } else if (((j) dVar2.invoke(Integer.valueOf(i17))).f135460a == m.FORCE_FLEXIBILITY) {
                        f2 f2VarI0 = t1Var.getType().I0();
                        aVar = new a(p43.q0.b(oi0.c.Q(f2VarI0).J0(false), oi0.c.Y(f2VarI0).J0(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                    i17 += aVar.f135451b;
                    n0Var = aVar.f135450a;
                    if (n0Var != null) {
                        g2 g2VarA = t1Var.a();
                        g2VarA.getClass();
                        u1VarL = o72.t.t(n0Var, g2VarA, d1Var);
                    } else if (eVarA == null && !t1Var.b()) {
                        p43.n0 type = t1Var.getType();
                        type.getClass();
                        g2 g2VarA2 = t1Var.a();
                        g2VarA2.getClass();
                        u1VarL = o72.t.t(type, g2VarA2, d1Var);
                    } else if (eVarA != null) {
                        u1VarL = d2.l(d1Var);
                    } else {
                        u1VarL = null;
                    }
                    arrayList.add(u1VarL);
                    dVar2 = dVar;
                    bool = bool;
                    i15 = 0;
                    n0Var2 = null;
                } else {
                    aVar = new a(n0Var2, i15);
                }
                i17 += aVar.f135451b;
                n0Var = aVar.f135450a;
                if (n0Var != null) {
                    g2 g2VarA3 = t1Var.a();
                    g2VarA3.getClass();
                    u1VarL = o72.t.t(n0Var, g2VarA3, d1Var);
                } else if (eVarA == null) {
                    if (eVarA != null) {
                        u1VarL = d2.l(d1Var);
                    } else {
                        u1VarL = null;
                    }
                } else if (eVarA != null) {
                    u1VarL = d2.l(d1Var);
                } else {
                    u1VarL = null;
                }
                arrayList.add(u1VarL);
                dVar2 = dVar;
                bool = bool;
                i15 = 0;
                n0Var2 = null;
            }
            Boolean bool2 = bool;
            int i18 = i17 - i14;
            if (eVarA == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    do {
                        if (it4.hasNext()) {
                        }
                    } while (((t1) it4.next()) == null);
                }
                return new b(null, i18, false);
            }
            u23.h annotations = v0Var.getAnnotations();
            h hVar2 = s1.f135516b;
            if (eVarA == null) {
                hVar2 = null;
            }
            h hVar3 = s1.f135515a;
            if (bool2 == null) {
                hVar3 = null;
            }
            ArrayList arrayListC = p13.u.C(new u23.h[]{annotations, hVar2, hVar3});
            int size = arrayListC.size();
            if (size == 0) {
                vb.h.z("At least one Annotations object expected");
                return null;
            }
            u23.h nVar = size != 1 ? new u23.n((List<? extends u23.h>) p13.h0.b1(arrayListC)) : (u23.h) p13.h0.I0(arrayListC);
            nVar.getClass();
            p43.k1 k1VarA = p43.v.f135927a.a(nVar);
            List<t1> listD1 = v0Var.D0();
            Iterator it5 = arrayList.iterator();
            Iterator<T> it6 = listD1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(p13.y.r(arrayList, 10), p13.y.r(listD1, 10)));
            while (it5.hasNext() && it6.hasNext()) {
                Object next2 = it5.next();
                t1 t1Var2 = (t1) it6.next();
                t1 t1Var3 = (t1) next2;
                if (t1Var3 != null) {
                    t1Var2 = t1Var3;
                }
                arrayList2.add(t1Var2);
            }
            p43.v0 v0VarE = p43.q0.e(k1VarA, m1VarF0, arrayList2, bool2 != null ? bool2.booleanValue() : v0Var.G0(), null);
            if (jVar.f135462c) {
                v0VarE = new l(v0VarE);
            }
            return new b(v0VarE, i18, bool2 != null && jVar.f135463d);
        }
        return new b(null, 1, false);
    }

    public final a b(f2 f2Var, d dVar, int i14, boolean z14) {
        f2 f2VarB;
        p43.v0 v0Var;
        p43.n0 n0VarE0 = null;
        if (o72.t.R(f2Var)) {
            return new a(null, 1);
        }
        if (!(f2Var instanceof p43.f0)) {
            if (!(f2Var instanceof p43.v0)) {
                lc.u0.r();
                return null;
            }
            b bVarA = a((p43.v0) f2Var, dVar, i14, q1.INFLEXIBLE, false, z14);
            boolean z15 = bVarA.f135454c;
            p43.n0 n0VarE1 = bVarA.f135452a;
            if (z15) {
                n0VarE1 = og.a.e0(f2Var, n0VarE1);
            }
            return new a(n0VarE1, bVarA.f135453b);
        }
        boolean z16 = f2Var instanceof m33.j;
        p43.f0 f0Var = (p43.f0) f2Var;
        p43.v0 v0Var2 = f0Var.f135830c;
        p43.v0 v0Var3 = f0Var.f135829b;
        b bVarA2 = a(v0Var3, dVar, i14, q1.FLEXIBLE_LOWER, z16, z14);
        b bVarA3 = a(f0Var.f135830c, dVar, i14, q1.FLEXIBLE_UPPER, z16, z14);
        p43.v0 v0Var4 = bVarA3.f135452a;
        p43.v0 v0Var5 = bVarA2.f135452a;
        if (v0Var5 != null || v0Var4 != null) {
            if (bVarA2.f135454c || bVarA3.f135454c) {
                if (v0Var4 != null) {
                    if (v0Var5 == null) {
                        v0Var5 = v0Var4;
                    }
                    f2VarB = p43.q0.b(v0Var5, v0Var4);
                } else {
                    v0Var5.getClass();
                    f2VarB = v0Var5;
                }
                n0VarE0 = og.a.e0(f2Var, f2VarB);
            } else if (z16) {
                p43.v0 v0Var6 = v0Var5;
                if (v0Var5 == null) {
                }
                if (v0Var4 != null) {
                    v0Var6 = v0Var3;
                    v0Var2 = v0Var4;
                }
                v0Var6 = v0Var3;
                n0VarE0 = new m33.j(v0Var6, v0Var2);
            } else {
                if (v0Var5 == null) {
                }
                if (v0Var4 != null) {
                    v0Var = v0Var3;
                    v0Var2 = v0Var4;
                }
                v0Var = v0Var3;
                n0VarE0 = p43.q0.b(v0Var, v0Var2);
            }
        }
        return new a(n0VarE0, bVarA2.f135453b);
    }
}
