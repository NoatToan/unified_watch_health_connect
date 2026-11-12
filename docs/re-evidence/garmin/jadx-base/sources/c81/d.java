package c81;

import android.content.Context;
import g81.g0;
import java.util.ArrayList;
import java.util.List;
import m92.c0;
import m92.e0;
import m92.h0;
import m92.w;
import o13.p;
import o4.d0;
import o4.f0;
import o4.u1;
import p13.x;
import p13.y;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    public static final e23.l a(i53.c cVar, float f14, float f15, float f16, float f17, long j8, p3.m mVar) {
        cVar.getClass();
        x1 x1Var = n.f135158a;
        boolean zL = mVar.l(j8) | mVar.r(cVar) | mVar.i(f14) | mVar.i(f16) | mVar.i(f15) | mVar.i(f17);
        Object objQ = mVar.q();
        if (zL) {
            objQ = new a(j8, cVar, f14, f16, f15, f17, 0);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a(j8, cVar, f14, f16, f15, f17, 0);
                mVar.K(objQ);
            }
        }
        return (e23.l) objQ;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035 A[PHI: r1
      0x0035: PHI (r1v10 i53.c) = (r1v8 i53.c), (r1v11 i53.c) binds: [B:9:0x0033, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    public static final e23.l b(final List list, final float f14, final float f15, final float f16, final float f17, i53.c cVar, final Context context, p3.m mVar, int i14) {
        i53.c cVar2;
        boolean z14;
        boolean zR;
        Object objQ;
        list.getClass();
        context.getClass();
        d92.b.f58623a.getClass();
        final long jE = d92.b.a(mVar).j().e();
        x1 x1Var = n.f135158a;
        if (((i14 & 458752) ^ 196608) > 131072) {
            cVar2 = cVar;
            if (mVar.B(cVar2)) {
                z14 = true;
            }
            zR = z14 | mVar.r(context) | mVar.l(jE) | mVar.r(list) | mVar.i(f14) | mVar.i(f16) | mVar.i(f15) | mVar.i(f17);
            objQ = mVar.q();
            if (zR) {
                final i53.c cVar3 = cVar2;
                e23.l lVar = new e23.l() { // from class: c81.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        m92.m bVar;
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f18 = 3;
                        g6.f.a aVar = g6.f.f75994b;
                        i53.c<p> cVar4 = cVar3;
                        if (cVar4 != null) {
                            ArrayList arrayList = new ArrayList(y.r(cVar4, 10));
                            for (p pVar : cVar4) {
                                arrayList.add(new p(pVar.f128594a, d0.a(f0.b(context.getColor(((Number) pVar.f128595b).intValue())))));
                            }
                            u1.f129010b.getClass();
                            bVar = new m92.m.c(arrayList, 0, null);
                        } else {
                            Float fValueOf = Float.valueOf(0.0f);
                            long j8 = jE;
                            List listK = x.k(new p(fValueOf, d0.a(j8)), new p(Float.valueOf(1.0f), d0.a(j8)));
                            u1.f129010b.getClass();
                            bVar = new m92.m.b(listK, 0, null);
                        }
                        List<g0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                        for (g0 g0Var : list2) {
                            arrayList2.add(new h0.e.a(g0Var.f76332a, g0Var.f76333b));
                        }
                        return c0.e(fVar, f18, bVar, false, 0.0f, null, null, arrayList2, null, Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), Float.valueOf(f17), e0.LINEAR, false, null, 24760);
                    }
                };
                mVar.K(lVar);
                objQ = lVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final i53.c cVar4 = cVar2;
                    e23.l lVar2 = new e23.l() { // from class: c81.b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            m92.m bVar;
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            float f18 = 3;
                            g6.f.a aVar = g6.f.f75994b;
                            i53.c<p> cVar5 = cVar4;
                            if (cVar5 != null) {
                                ArrayList arrayList = new ArrayList(y.r(cVar5, 10));
                                for (p pVar : cVar5) {
                                    arrayList.add(new p(pVar.f128594a, d0.a(f0.b(context.getColor(((Number) pVar.f128595b).intValue())))));
                                }
                                u1.f129010b.getClass();
                                bVar = new m92.m.c(arrayList, 0, null);
                            } else {
                                Float fValueOf = Float.valueOf(0.0f);
                                long j8 = jE;
                                List listK = x.k(new p(fValueOf, d0.a(j8)), new p(Float.valueOf(1.0f), d0.a(j8)));
                                u1.f129010b.getClass();
                                bVar = new m92.m.b(listK, 0, null);
                            }
                            List<g0> list2 = list;
                            ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                            for (g0 g0Var : list2) {
                                arrayList2.add(new h0.e.a(g0Var.f76332a, g0Var.f76333b));
                            }
                            return c0.e(fVar, f18, bVar, false, 0.0f, null, null, arrayList2, null, Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), Float.valueOf(f17), e0.LINEAR, false, null, 24760);
                        }
                    };
                    mVar.K(lVar2);
                    objQ = lVar2;
                }
            }
            return (e23.l) objQ;
        }
        cVar2 = cVar;
        if ((i14 & 196608) == 131072) {
            z14 = true;
        } else {
            z14 = false;
        }
        zR = z14 | mVar.r(context) | mVar.l(jE) | mVar.r(list) | mVar.i(f14) | mVar.i(f16) | mVar.i(f15) | mVar.i(f17);
        objQ = mVar.q();
        if (zR) {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                final i53.c cVar5 = cVar2;
                e23.l lVar3 = new e23.l() { // from class: c81.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        m92.m bVar;
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        float f18 = 3;
                        g6.f.a aVar = g6.f.f75994b;
                        i53.c<p> cVar6 = cVar5;
                        if (cVar6 != null) {
                            ArrayList arrayList = new ArrayList(y.r(cVar6, 10));
                            for (p pVar : cVar6) {
                                arrayList.add(new p(pVar.f128594a, d0.a(f0.b(context.getColor(((Number) pVar.f128595b).intValue())))));
                            }
                            u1.f129010b.getClass();
                            bVar = new m92.m.c(arrayList, 0, null);
                        } else {
                            Float fValueOf = Float.valueOf(0.0f);
                            long j8 = jE;
                            List listK = x.k(new p(fValueOf, d0.a(j8)), new p(Float.valueOf(1.0f), d0.a(j8)));
                            u1.f129010b.getClass();
                            bVar = new m92.m.b(listK, 0, null);
                        }
                        List<g0> list2 = list;
                        ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                        for (g0 g0Var : list2) {
                            arrayList2.add(new h0.e.a(g0Var.f76332a, g0Var.f76333b));
                        }
                        return c0.e(fVar, f18, bVar, false, 0.0f, null, null, arrayList2, null, Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), Float.valueOf(f17), e0.LINEAR, false, null, 24760);
                    }
                };
                mVar.K(lVar3);
                objQ = lVar3;
            }
        } else {
            final i53.c cVar6 = cVar2;
            e23.l lVar4 = new e23.l() { // from class: c81.b
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    m92.m bVar;
                    q4.f fVar = (q4.f) obj;
                    fVar.getClass();
                    float f18 = 3;
                    g6.f.a aVar = g6.f.f75994b;
                    i53.c<p> cVar7 = cVar6;
                    if (cVar7 != null) {
                        ArrayList arrayList = new ArrayList(y.r(cVar7, 10));
                        for (p pVar : cVar7) {
                            arrayList.add(new p(pVar.f128594a, d0.a(f0.b(context.getColor(((Number) pVar.f128595b).intValue())))));
                        }
                        u1.f129010b.getClass();
                        bVar = new m92.m.c(arrayList, 0, null);
                    } else {
                        Float fValueOf = Float.valueOf(0.0f);
                        long j8 = jE;
                        List listK = x.k(new p(fValueOf, d0.a(j8)), new p(Float.valueOf(1.0f), d0.a(j8)));
                        u1.f129010b.getClass();
                        bVar = new m92.m.b(listK, 0, null);
                    }
                    List<g0> list2 = list;
                    ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                    for (g0 g0Var : list2) {
                        arrayList2.add(new h0.e.a(g0Var.f76332a, g0Var.f76333b));
                    }
                    return c0.e(fVar, f18, bVar, false, 0.0f, null, null, arrayList2, null, Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), Float.valueOf(f17), e0.LINEAR, false, null, 24760);
                }
            };
            mVar.K(lVar4);
            objQ = lVar4;
        }
        return (e23.l) objQ;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static final e23.l c(final Context context, final i53.c cVar, final float f14, final float f15, final float f16, final float f17, final long j8, p3.m mVar) {
        cVar.getClass();
        x1 x1Var = n.f135158a;
        boolean zR = mVar.r(cVar) | mVar.r(context) | mVar.l(j8) | mVar.i(f14) | mVar.i(f16) | mVar.i(f15) | mVar.i(f17);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new e23.l() { // from class: c81.c
                @Override // e23.l
                public final Object invoke(Object obj) {
                    q4.f fVar = (q4.f) obj;
                    fVar.getClass();
                    i53.c<g81.f0> cVar2 = cVar;
                    ArrayList arrayList = new ArrayList(y.r(cVar2, 10));
                    for (g81.f0 f0Var : cVar2) {
                        arrayList.add(new h0.e.d(new h0.e.a(f0Var.f76322a, f0Var.f76323b), new o92.b(o92.e.CIRCLE, f0.b(context.getColor(f0Var.f76324c)), new o92.a(j8, 2.0f, null), null), null, 4, null));
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    return w.c(fVar, arrayList, null, j92.b.f97901d.f97902a, Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), Float.valueOf(f17), 26);
                }
            };
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new e23.l() { // from class: c81.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        i53.c<g81.f0> cVar2 = cVar;
                        ArrayList arrayList = new ArrayList(y.r(cVar2, 10));
                        for (g81.f0 f0Var : cVar2) {
                            arrayList.add(new h0.e.d(new h0.e.a(f0Var.f76322a, f0Var.f76323b), new o92.b(o92.e.CIRCLE, f0.b(context.getColor(f0Var.f76324c)), new o92.a(j8, 2.0f, null), null), null, 4, null));
                        }
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        return w.c(fVar, arrayList, null, j92.b.f97901d.f97902a, Float.valueOf(f14), Float.valueOf(f16), Float.valueOf(f15), Float.valueOf(f17), 26);
                    }
                };
                mVar.K(objQ);
            }
        }
        return (e23.l) objQ;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0052  */
    public static final e23.l d(i53.c cVar, float f14, float f15, float f16, float f17, p3.m mVar) {
        cVar.getClass();
        x1 x1Var = n.f135158a;
        d92.b.f58623a.getClass();
        long jC = d0.c(0.5f, d92.b.a(mVar).e().f(), 14);
        boolean zR = mVar.r(cVar) | mVar.l(jC) | mVar.i(f14) | mVar.i(f16) | mVar.i(f15) | mVar.i(f17);
        Object objQ = mVar.q();
        if (zR) {
            a aVar = new a(cVar, jC, f14, f16, f15, f17, 1);
            mVar.K(aVar);
            objQ = aVar;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                a aVar2 = new a(cVar, jC, f14, f16, f15, f17, 1);
                mVar.K(aVar2);
                objQ = aVar2;
            }
        }
        return (e23.l) objQ;
    }
}
