package q43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.u0;
import p43.a2;
import p43.b0;
import p43.b2;
import p43.d2;
import p43.e1;
import p43.f0;
import p43.f2;
import p43.g2;
import p43.m0;
import p43.m1;
import p43.n0;
import p43.n1;
import p43.o1;
import p43.q0;
import p43.t1;
import p43.v0;
import p43.v1;
import p43.y0;
import p43.z0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends b2, t43.p {

    public static final class a {
        public static boolean A(t43.i iVar, t43.i iVar2) {
            iVar.getClass();
            iVar2.getClass();
            if (!(iVar instanceof v0)) {
                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb3.append(iVar);
                sb3.append(", ");
                vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
                return false;
            }
            if (iVar2 instanceof v0) {
                return ((v0) iVar).D0() == ((v0) iVar2).D0();
            }
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(iVar2);
            sb4.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar2.getClass(), sb4));
            return false;
        }

        public static boolean B(t43.m mVar) {
            if (mVar instanceof m1) {
                return p005kotlin.reflect.jvm.internal.impl.builtins.d.J((m1) mVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b);
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return false;
        }

        public static boolean C(t43.h hVar) {
            if (hVar instanceof n0) {
                return p005kotlin.reflect.jvm.internal.impl.builtins.d.z((n0) hVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return false;
        }

        public static boolean D(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                return ((m1) mVar).t() instanceof t23.e;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return false;
        }

        public static boolean E(t43.m mVar) {
            if (mVar instanceof m1) {
                t23.h hVarT = ((m1) mVar).t();
                t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
                return (eVar == null || eVar.g() != t23.a0.FINAL || eVar.getKind() == t23.f.ENUM_CLASS || eVar.getKind() == t23.f.ENUM_ENTRY || eVar.getKind() == t23.f.ANNOTATION_CLASS) ? false : true;
            }
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ")));
            return false;
        }

        public static boolean F(t43.m mVar) {
            if (mVar instanceof m1) {
                return ((m1) mVar).C();
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return false;
        }

        public static boolean G(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return o72.t.R((n0) hVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return false;
        }

        public static boolean H(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                t23.h hVarT = ((m1) mVar).t();
                t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
                return (eVar != null ? eVar.J() : null) instanceof t23.w;
            }
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ")));
            return false;
        }

        public static boolean I(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                return mVar instanceof d43.q;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return false;
        }

        public static boolean J(t43.m mVar) {
            if (mVar instanceof m1) {
                return mVar instanceof m0;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return false;
        }

        public static boolean K(t43.h hVar) {
            hVar.getClass();
            return (hVar instanceof v0) && ((v0) hVar).G0();
        }

        public static boolean L(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                return p005kotlin.reflect.jvm.internal.impl.builtins.d.J((m1) mVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105871c);
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return false;
        }

        public static boolean M(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return d2.g((n0) hVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean N(t43.j jVar) {
            if (jVar instanceof n0) {
                return p005kotlin.reflect.jvm.internal.impl.builtins.d.H((n0) jVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(jVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, jVar.getClass(), sb3));
            return false;
        }

        public static boolean O(t43.d dVar) {
            if (dVar instanceof h) {
                return ((h) dVar).f142795g;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(dVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, dVar.getClass(), sb3));
            return false;
        }

        public static boolean P(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return hVar instanceof m33.j;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return false;
        }

        public static boolean Q(t43.l lVar) {
            lVar.getClass();
            if (lVar instanceof t1) {
                return ((t1) lVar).b();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(lVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, lVar.getClass(), sb3));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean R(t43.i iVar) {
            iVar.getClass();
            if (iVar instanceof v0) {
                n0 n0Var = (n0) iVar;
                if (n0Var instanceof p43.e) {
                    return true;
                }
                return (n0Var instanceof p43.w) && (((p43.w) n0Var).f135931b instanceof p43.e);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(t43.i iVar) {
            if (iVar instanceof v0) {
                n0 n0Var = (n0) iVar;
                if (n0Var instanceof e1) {
                    return true;
                }
                return (n0Var instanceof p43.w) && (((p43.w) n0Var).f135931b instanceof e1);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return false;
        }

        public static v0 T(t43.f fVar) {
            if (fVar instanceof f0) {
                return ((f0) fVar).f135829b;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(fVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, fVar.getClass(), sb3));
            return null;
        }

        public static f2 U(t43.d dVar) {
            if (dVar instanceof h) {
                return ((h) dVar).f142792d;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(dVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, dVar.getClass(), sb3));
            return null;
        }

        public static f2 V(t43.h hVar) {
            if (hVar instanceof f2) {
                return z0.a((f2) hVar, false);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static int W(t43.m mVar) {
            if (mVar instanceof m1) {
                return ((m1) mVar).getParameters().size();
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return 0;
        }

        public static Collection<t43.h> X(b bVar, t43.i iVar) {
            t43.m mVarF0 = bVar.F0(iVar);
            if (mVarF0 instanceof d43.q) {
                return ((d43.q) mVarF0).f57493c;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return null;
        }

        public static t1 Y(t43.c cVar) {
            if (cVar instanceof m) {
                return ((m) cVar).f142801a;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(cVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, cVar.getClass(), sb3));
            return null;
        }

        public static n0 Z(t43.o oVar, t43.h hVar) {
            oVar.getClass();
            hVar.getClass();
            if (!(hVar instanceof f2)) {
                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb3.append(hVar);
                sb3.append(", ");
                vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
                return null;
            }
            if (oVar instanceof a2) {
                return ((a2) oVar).h(g2.INVARIANT, (n0) hVar);
            }
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(oVar);
            sb4.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, oVar.getClass(), sb4));
            return null;
        }

        public static boolean a(t43.m mVar, t43.m mVar2) {
            mVar.getClass();
            mVar2.getClass();
            if (!(mVar instanceof m1)) {
                StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
                vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
                return false;
            }
            if (mVar2 instanceof m1) {
                return mVar.equals(mVar2);
            }
            StringBuilder sbJ2 = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar2, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar2.getClass(), sbJ2));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static c a0(b bVar, t43.i iVar) {
            if (iVar instanceof v0) {
                o1.a aVar = o1.f135897b;
                n0 n0Var = (n0) iVar;
                aVar.getClass();
                return new c(bVar, a2.e(aVar.a(n0Var.F0(), n0Var.D0())));
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return null;
        }

        public static int b(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return ((n0) hVar).D0().size();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return 0;
        }

        public static Collection b0(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                Collection<n0> collectionB = ((m1) mVar).b();
                collectionB.getClass();
                return collectionB;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return null;
        }

        public static v0 c(b bVar, t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                bVar.e();
                throw null;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(bVar);
            sb3.append(", ");
            throw new IllegalArgumentException(p6.b.h(s0.f105811a, bVar.getClass(), sb3).toString());
        }

        public static m1 c0(t43.i iVar) {
            iVar.getClass();
            if (iVar instanceof v0) {
                return ((v0) iVar).F0();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return null;
        }

        public static t43.k d(t43.i iVar) {
            iVar.getClass();
            if (iVar instanceof v0) {
                return (t43.k) iVar;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return null;
        }

        public static m d0(t43.d dVar) {
            if (dVar instanceof h) {
                return ((h) dVar).f142791c;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(dVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, dVar.getClass(), sb3));
            return null;
        }

        public static t43.d e(b bVar, t43.j jVar) {
            jVar.getClass();
            if (jVar instanceof v0) {
                if (jVar instanceof y0) {
                    return bVar.y(((y0) jVar).f135942b);
                }
                if (jVar instanceof h) {
                    return (h) jVar;
                }
                return null;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(jVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, jVar.getClass(), sb3));
            return null;
        }

        public static a2 e0(Map map) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                t43.m mVar = (t43.m) entry.getKey();
                t43.h hVar = (t43.h) entry.getValue();
                mVar.getClass();
                hVar.getClass();
                arrayList.add(new o13.p((m1) mVar, new v1((n0) hVar)));
            }
            Map mapL = u0.l(arrayList);
            a2 a2Var = a2.f135794b;
            o1.f135897b.getClass();
            return a2.e(new n1(mapL, false));
        }

        public static p43.w f(t43.i iVar) {
            iVar.getClass();
            if (iVar instanceof v0) {
                if (iVar instanceof p43.w) {
                    return (p43.w) iVar;
                }
                return null;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return null;
        }

        public static v0 f0(t43.f fVar) {
            if (fVar instanceof f0) {
                return ((f0) fVar).f135830c;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(fVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, fVar.getClass(), sb3));
            return null;
        }

        public static b0 g(f0 f0Var) {
            if (f0Var instanceof b0) {
                return (b0) f0Var;
            }
            return null;
        }

        public static v0 g0(t43.i iVar, boolean z14) {
            iVar.getClass();
            if (iVar instanceof v0) {
                return ((v0) iVar).J0(z14);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
            return null;
        }

        public static f0 h(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                f2 f2VarI0 = ((n0) hVar).I0();
                if (f2VarI0 instanceof f0) {
                    return (f0) f2VarI0;
                }
                return null;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static t43.h h0(b bVar, t43.h hVar) {
            if (hVar instanceof t43.i) {
                return bVar.c((t43.i) hVar);
            }
            if (hVar instanceof t43.f) {
                t43.f fVar = (t43.f) hVar;
                return bVar.q(bVar.c((t43.i) bVar.b(fVar)), bVar.c((t43.i) bVar.a(fVar)));
            }
            vb.h.z("sealed");
            return null;
        }

        public static v0 i(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                f2 f2VarI0 = ((n0) hVar).I0();
                if (f2VarI0 instanceof v0) {
                    return (v0) f2VarI0;
                }
                return null;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static v1 j(t43.h hVar) {
            if (hVar instanceof n0) {
                return new v1((n0) hVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static v0 k(t43.i iVar, t43.b bVar) {
            List<t1> listD0;
            ArrayList arrayList;
            bVar.getClass();
            if (!(iVar instanceof v0)) {
                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb3.append(iVar);
                sb3.append(", ");
                vb.h.x(p6.b.h(s0.f105811a, iVar.getClass(), sb3));
                return null;
            }
            v0 v0Var = (v0) iVar;
            if (v0Var.D0().size() == v0Var.F0().getParameters().size() && ((listD0 = v0Var.D0()) == null || !listD0.isEmpty())) {
                Iterator<T> it = listD0.iterator();
                while (it.hasNext()) {
                    if (((t1) it.next()).a() != g2.INVARIANT) {
                        List<d1> parameters = v0Var.F0().getParameters();
                        parameters.getClass();
                        ArrayList<o13.p> arrayListK1 = h0.k1(listD0, parameters);
                        arrayList = new ArrayList(p13.y.r(arrayListK1, 10));
                        for (o13.p pVar : arrayListK1) {
                            t1 v1Var = (t1) pVar.f128594a;
                            d1 d1Var = (d1) pVar.f128595b;
                            if (v1Var.a() != g2.INVARIANT) {
                                f2 f2VarI0 = (v1Var.b() || v1Var.a() != g2.IN_VARIANCE) ? null : v1Var.getType().I0();
                                d1Var.getClass();
                                v1Var = new v1(new h(bVar, f2VarI0, v1Var, d1Var));
                            }
                            arrayList.add(v1Var);
                        }
                        a2 a2VarE = a2.e(o1.f135897b.a(v0Var.F0(), arrayList));
                        int size = listD0.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            t1 t1Var = listD0.get(i14);
                            t1 t1Var2 = (t1) arrayList.get(i14);
                            if (t1Var.a() != g2.INVARIANT) {
                                List<n0> upperBounds = v0Var.F0().getParameters().get(i14).getUpperBounds();
                                ArrayList arrayListL = androidx.core.view.j.l(upperBounds);
                                Iterator<T> it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    arrayListL.add(e.a.f142787a.a(a2VarE.h(g2.INVARIANT, (n0) it3.next()).I0()));
                                }
                                if (!t1Var.b() && t1Var.a() == g2.OUT_VARIANCE) {
                                    arrayListL.add(e.a.f142787a.a(t1Var.getType().I0()));
                                }
                                n0 type = t1Var2.getType();
                                type.getClass();
                                m mVar = ((h) type).f142791c;
                                mVar.getClass();
                                mVar.f142802b = new k(arrayListL);
                            }
                        }
                    }
                }
                arrayList = null;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                return q0.e(v0Var.E0(), v0Var.F0(), arrayList, v0Var.G0(), null);
            }
            return null;
        }

        public static t43.b l(t43.d dVar) {
            if (dVar instanceof h) {
                return ((h) dVar).f142790b;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(dVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, dVar.getClass(), sb3));
            return null;
        }

        public static f2 m(b bVar, t43.i iVar, t43.i iVar2) {
            iVar.getClass();
            iVar2.getClass();
            if (!(iVar instanceof v0)) {
                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb3.append(bVar);
                sb3.append(", ");
                vb.h.x(p6.b.h(s0.f105811a, bVar.getClass(), sb3));
                return null;
            }
            if (iVar2 instanceof v0) {
                return q0.b((v0) iVar, (v0) iVar2);
            }
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(bVar);
            sb4.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, bVar.getClass(), sb4));
            return null;
        }

        public static t43.l n(t43.h hVar, int i14) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return ((n0) hVar).D0().get(i14);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static List o(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return ((n0) hVar).D0();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static t43.n p(t43.m mVar, int i14) {
            if (mVar instanceof m1) {
                d1 d1Var = ((m1) mVar).getParameters().get(i14);
                d1Var.getClass();
                return d1Var;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return null;
        }

        public static List q(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                List<d1> parameters = ((m1) mVar).getParameters();
                parameters.getClass();
                return parameters;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return null;
        }

        public static n0 r(t43.n nVar) {
            nVar.getClass();
            if (nVar instanceof d1) {
                return o72.t.M((d1) nVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(nVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, nVar.getClass(), sb3));
            return null;
        }

        public static f2 s(b bVar, t43.l lVar) {
            lVar.getClass();
            if (bVar.H(lVar)) {
                return null;
            }
            if (lVar instanceof t1) {
                return ((t1) lVar).getType().I0();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(lVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, lVar.getClass(), sb3));
            return null;
        }

        public static m1 t(t43.n nVar) {
            nVar.getClass();
            if (nVar instanceof d1) {
                m1 m1VarH = ((d1) nVar).h();
                m1VarH.getClass();
                return m1VarH;
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(nVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, nVar.getClass(), sb3));
            return null;
        }

        public static d1 u(t43.s sVar) {
            if (sVar instanceof p) {
                return ((p) sVar).c();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(sVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, sVar.getClass(), sb3));
            return null;
        }

        public static d1 v(t43.m mVar) {
            mVar.getClass();
            if (mVar instanceof m1) {
                t23.h hVarT = ((m1) mVar).t();
                if (hVarT instanceof d1) {
                    return (d1) hVarT;
                }
                return null;
            }
            StringBuilder sbJ = p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVar, ", ");
            vb.h.x(p6.b.h(s0.f105811a, mVar.getClass(), sbJ));
            return null;
        }

        public static v0 w(t43.h hVar) {
            hVar.getClass();
            if (hVar instanceof n0) {
                return b43.j.g((n0) hVar);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(hVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
            return null;
        }

        public static t43.t x(t43.l lVar) {
            lVar.getClass();
            if (lVar instanceof t1) {
                g2 g2VarA = ((t1) lVar).a();
                g2VarA.getClass();
                return t43.q.a(g2VarA);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(lVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, lVar.getClass(), sb3));
            return null;
        }

        public static t43.t y(t43.n nVar) {
            nVar.getClass();
            if (nVar instanceof d1) {
                g2 g2VarM = ((d1) nVar).m();
                g2VarM.getClass();
                return t43.q.a(g2VarM);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(nVar);
            sb3.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, nVar.getClass(), sb3));
            return null;
        }

        public static boolean z(t43.n nVar, t43.m mVar) {
            if (!(nVar instanceof d1)) {
                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb3.append(nVar);
                sb3.append(", ");
                vb.h.x(p6.b.h(s0.f105811a, nVar.getClass(), sb3));
                return false;
            }
            d1 d1Var = (d1) nVar;
            if (mVar == null ? true : mVar instanceof m1) {
                return o72.t.Q(d1Var, (m1) mVar, null);
            }
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(d1Var);
            sb4.append(", ");
            vb.h.x(p6.b.h(s0.f105811a, d1Var.getClass(), sb4));
            return false;
        }
    }

    @Override // t43.p
    v0 a(t43.f fVar);

    @Override // t43.p
    v0 b(t43.f fVar);

    @Override // t43.p
    v0 c(t43.i iVar);

    p005kotlin.reflect.jvm.internal.impl.builtins.d e();

    v0 m0(n0 n0Var);

    f2 q(t43.j jVar, t43.j jVar2);
}
