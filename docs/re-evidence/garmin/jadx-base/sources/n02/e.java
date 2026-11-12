package n02;

import c2.x2;
import h4.r;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.y;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r82.p;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, r rVar, final e23.l lVar, p3.m mVar, int i14) {
        r rVar2;
        Object obj;
        final e23.l lVar2 = lVar;
        fVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(280822153);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14 | 48 | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            final p1 p1VarQ = p0.q(fVar, o0VarE);
            Object[] objArr = new Object[0];
            boolean zB = o0VarE.B(p1VarQ);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new ly0.f(p1VarQ, 28);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ly0.f(p1VarQ, 28);
                    o0VarE.K(objQ);
                }
            }
            final n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            boolean zB2 = o0VarE.B(p1VarQ);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new ly0.f(p1VarQ, 29);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ly0.f(p1VarQ, 29);
                    o0VarE.K(objQ2);
                }
            }
            final n1 n1Var2 = (n1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
            Object[] objArr3 = new Object[0];
            boolean zB3 = o0VarE.B(p1VarQ);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                objQ3 = new c(p1VarQ, 0);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new c(p1VarQ, 0);
                    o0VarE.K(objQ3);
                }
            }
            final n1 n1Var3 = (n1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 0);
            i53.c<Integer> cVarC = ((f) p1VarQ.getF182175a()).c();
            int iB = b(((f) p1VarQ.getF182175a()).c(), (int) ((f) p1VarQ.getF182175a()).f122171b);
            a.f122158a.getClass();
            z3.e eVar = a.f122159b;
            int i16 = i15 & 896;
            boolean zB4 = (i16 == 256) | o0VarE.B(p1VarQ) | o0VarE.B(n1Var) | o0VarE.B(n1Var2) | o0VarE.B(n1Var3);
            Object objQ4 = o0VarE.q();
            if (zB4) {
                final int i17 = 0;
                e23.l lVar3 = new e23.l() { // from class: n02.d
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i18 = i17;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i18) {
                            case 0:
                                p1 p1Var = p1VarQ;
                                Integer num = (Integer) h0.e0(iIntValue, ((f) p1Var.getF182175a()).c());
                                if (num != null) {
                                    int iIntValue2 = num.intValue();
                                    n1 n1Var4 = n1Var;
                                    n1Var4.t(iIntValue2);
                                    e.c(lVar2, n1Var4, n1Var2, p1Var, n1Var3);
                                }
                                break;
                            case 1:
                                p1 p1Var2 = p1VarQ;
                                Integer num2 = (Integer) h0.e0(iIntValue, ((f) p1Var2.getF182175a()).b());
                                if (num2 != null) {
                                    int iIntValue3 = num2.intValue();
                                    n1 n1Var5 = n1Var;
                                    n1Var5.t(iIntValue3);
                                    e.c(lVar2, n1Var2, n1Var5, p1Var2, n1Var3);
                                }
                                break;
                            default:
                                p1 p1Var3 = p1VarQ;
                                g gVar = (g) h0.e0(iIntValue, i53.a.e(((f) p1Var3.getF182175a()).f122172c.keySet()));
                                if (gVar != null) {
                                    int iOrdinal = gVar.ordinal();
                                    n1 n1Var6 = n1Var;
                                    n1Var6.t(iOrdinal);
                                    e.c(lVar2, n1Var2, n1Var3, p1Var3, n1Var6);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                n1Var = n1Var;
                n1Var2 = n1Var2;
                o0VarE.K(lVar3);
                objQ4 = lVar3;
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    final int i18 = 0;
                    e23.l lVar4 = new e23.l() { // from class: n02.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i19 = i18;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i19) {
                                case 0:
                                    p1 p1Var = p1VarQ;
                                    Integer num = (Integer) h0.e0(iIntValue, ((f) p1Var.getF182175a()).c());
                                    if (num != null) {
                                        int iIntValue2 = num.intValue();
                                        n1 n1Var4 = n1Var;
                                        n1Var4.t(iIntValue2);
                                        e.c(lVar2, n1Var4, n1Var2, p1Var, n1Var3);
                                    }
                                    break;
                                case 1:
                                    p1 p1Var2 = p1VarQ;
                                    Integer num2 = (Integer) h0.e0(iIntValue, ((f) p1Var2.getF182175a()).b());
                                    if (num2 != null) {
                                        int iIntValue3 = num2.intValue();
                                        n1 n1Var5 = n1Var;
                                        n1Var5.t(iIntValue3);
                                        e.c(lVar2, n1Var2, n1Var5, p1Var2, n1Var3);
                                    }
                                    break;
                                default:
                                    p1 p1Var3 = p1VarQ;
                                    g gVar = (g) h0.e0(iIntValue, i53.a.e(((f) p1Var3.getF182175a()).f122172c.keySet()));
                                    if (gVar != null) {
                                        int iOrdinal = gVar.ordinal();
                                        n1 n1Var6 = n1Var;
                                        n1Var6.t(iOrdinal);
                                        e.c(lVar2, n1Var2, n1Var3, p1Var3, n1Var6);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    n1Var = n1Var;
                    n1Var2 = n1Var2;
                    o0VarE.K(lVar4);
                    objQ4 = lVar4;
                }
            }
            p pVar = new p(cVarC, iB, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ4, 1004, null);
            i53.c<Integer> cVarB = ((f) p1VarQ.getF182175a()).b();
            i53.c<Integer> cVarB2 = ((f) p1VarQ.getF182175a()).b();
            f fVar2 = (f) p1VarQ.getF182175a();
            double d14 = fVar2.f122171b;
            int iB2 = b(cVarB2, MathKt.b(fVar2.a() * (d14 - ((double) ((int) d14)))));
            boolean zB5 = o0VarE.B(p1VarQ);
            Object objQ5 = o0VarE.q();
            if (zB5) {
                objQ5 = new md0.f(p1VarQ, 2);
                o0VarE.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new md0.f(p1VarQ, 2);
                    o0VarE.K(objQ5);
                }
            }
            e23.l lVar5 = (e23.l) objQ5;
            z3.e eVar2 = a.f122160c;
            boolean zB6 = o0VarE.B(p1VarQ) | o0VarE.B(n1Var2) | o0VarE.B(n1Var) | o0VarE.B(n1Var3) | (i16 == 256);
            Object objQ6 = o0VarE.q();
            if (zB6) {
                final int i19 = 1;
                e23.l lVar6 = new e23.l() { // from class: n02.d
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i110 = i19;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i110) {
                            case 0:
                                p1 p1Var = p1VarQ;
                                Integer num = (Integer) h0.e0(iIntValue, ((f) p1Var.getF182175a()).c());
                                if (num != null) {
                                    int iIntValue2 = num.intValue();
                                    n1 n1Var4 = n1Var2;
                                    n1Var4.t(iIntValue2);
                                    e.c(lVar, n1Var4, n1Var, p1Var, n1Var3);
                                }
                                break;
                            case 1:
                                p1 p1Var2 = p1VarQ;
                                Integer num2 = (Integer) h0.e0(iIntValue, ((f) p1Var2.getF182175a()).b());
                                if (num2 != null) {
                                    int iIntValue3 = num2.intValue();
                                    n1 n1Var5 = n1Var2;
                                    n1Var5.t(iIntValue3);
                                    e.c(lVar, n1Var, n1Var5, p1Var2, n1Var3);
                                }
                                break;
                            default:
                                p1 p1Var3 = p1VarQ;
                                g gVar = (g) h0.e0(iIntValue, i53.a.e(((f) p1Var3.getF182175a()).f122172c.keySet()));
                                if (gVar != null) {
                                    int iOrdinal = gVar.ordinal();
                                    n1 n1Var6 = n1Var2;
                                    n1Var6.t(iOrdinal);
                                    e.c(lVar, n1Var, n1Var3, p1Var3, n1Var6);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar6);
                objQ6 = lVar6;
            } else {
                aVar2.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    final int i110 = 1;
                    e23.l lVar7 = new e23.l() { // from class: n02.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i111 = i110;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i111) {
                                case 0:
                                    p1 p1Var = p1VarQ;
                                    Integer num = (Integer) h0.e0(iIntValue, ((f) p1Var.getF182175a()).c());
                                    if (num != null) {
                                        int iIntValue2 = num.intValue();
                                        n1 n1Var4 = n1Var2;
                                        n1Var4.t(iIntValue2);
                                        e.c(lVar, n1Var4, n1Var, p1Var, n1Var3);
                                    }
                                    break;
                                case 1:
                                    p1 p1Var2 = p1VarQ;
                                    Integer num2 = (Integer) h0.e0(iIntValue, ((f) p1Var2.getF182175a()).b());
                                    if (num2 != null) {
                                        int iIntValue3 = num2.intValue();
                                        n1 n1Var5 = n1Var2;
                                        n1Var5.t(iIntValue3);
                                        e.c(lVar, n1Var, n1Var5, p1Var2, n1Var3);
                                    }
                                    break;
                                default:
                                    p1 p1Var3 = p1VarQ;
                                    g gVar = (g) h0.e0(iIntValue, i53.a.e(((f) p1Var3.getF182175a()).f122172c.keySet()));
                                    if (gVar != null) {
                                        int iOrdinal = gVar.ordinal();
                                        n1 n1Var6 = n1Var2;
                                        n1Var6.t(iOrdinal);
                                        e.c(lVar, n1Var, n1Var3, p1Var3, n1Var6);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(lVar7);
                    objQ6 = lVar7;
                }
            }
            p pVar2 = new p(cVarB, iB2, lVar5, null, eVar2, 0.0f, false, false, null, null, (e23.l) objQ6, 1000, null);
            o0VarE.C(-712757618);
            i53.c cVarE = i53.a.e(((f) p1VarQ.getF182175a()).f122172c.keySet());
            ArrayList arrayList = new ArrayList(y.r(cVarE, 10));
            Iterator<E> it = cVarE.iterator();
            while (it.hasNext()) {
                arrayList.add(gl1.y.Q(o0VarE, ((g) it.next()).f122179a));
            }
            o0VarE.g0(false);
            i53.c cVarE2 = i53.a.e(arrayList);
            int iIndexOf = i53.a.e(((f) p1VarQ.getF182175a()).f122172c.keySet()).indexOf(((f) p1VarQ.getF182175a()).f122170a);
            int i24 = iIndexOf < 0 ? 0 : iIndexOf;
            boolean zB7 = o0VarE.B(p1VarQ) | o0VarE.B(n1Var3) | o0VarE.B(n1Var) | o0VarE.B(n1Var2) | (i16 == 256);
            Object objQ7 = o0VarE.q();
            if (zB7) {
                final int i25 = 2;
                final n1 n1Var4 = n1Var2;
                lVar2 = lVar;
                obj = new e23.l() { // from class: n02.d
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i111 = i25;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i111) {
                            case 0:
                                p1 p1Var = p1VarQ;
                                Integer num = (Integer) h0.e0(iIntValue, ((f) p1Var.getF182175a()).c());
                                if (num != null) {
                                    int iIntValue2 = num.intValue();
                                    n1 n1Var5 = n1Var3;
                                    n1Var5.t(iIntValue2);
                                    e.c(lVar2, n1Var5, n1Var, p1Var, n1Var4);
                                }
                                break;
                            case 1:
                                p1 p1Var2 = p1VarQ;
                                Integer num2 = (Integer) h0.e0(iIntValue, ((f) p1Var2.getF182175a()).b());
                                if (num2 != null) {
                                    int iIntValue3 = num2.intValue();
                                    n1 n1Var6 = n1Var3;
                                    n1Var6.t(iIntValue3);
                                    e.c(lVar2, n1Var, n1Var6, p1Var2, n1Var4);
                                }
                                break;
                            default:
                                p1 p1Var3 = p1VarQ;
                                g gVar = (g) h0.e0(iIntValue, i53.a.e(((f) p1Var3.getF182175a()).f122172c.keySet()));
                                if (gVar != null) {
                                    int iOrdinal = gVar.ordinal();
                                    n1 n1Var7 = n1Var3;
                                    n1Var7.t(iOrdinal);
                                    e.c(lVar2, n1Var, n1Var4, p1Var3, n1Var7);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj);
            } else {
                aVar2.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    final int i26 = 2;
                    final n1 n1Var5 = n1Var2;
                    lVar2 = lVar;
                    obj = new e23.l() { // from class: n02.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i111 = i26;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i111) {
                                case 0:
                                    p1 p1Var = p1VarQ;
                                    Integer num = (Integer) h0.e0(iIntValue, ((f) p1Var.getF182175a()).c());
                                    if (num != null) {
                                        int iIntValue2 = num.intValue();
                                        n1 n1Var6 = n1Var3;
                                        n1Var6.t(iIntValue2);
                                        e.c(lVar2, n1Var6, n1Var, p1Var, n1Var5);
                                    }
                                    break;
                                case 1:
                                    p1 p1Var2 = p1VarQ;
                                    Integer num2 = (Integer) h0.e0(iIntValue, ((f) p1Var2.getF182175a()).b());
                                    if (num2 != null) {
                                        int iIntValue3 = num2.intValue();
                                        n1 n1Var7 = n1Var3;
                                        n1Var7.t(iIntValue3);
                                        e.c(lVar2, n1Var, n1Var7, p1Var2, n1Var5);
                                    }
                                    break;
                                default:
                                    p1 p1Var3 = p1VarQ;
                                    g gVar = (g) h0.e0(iIntValue, i53.a.e(((f) p1Var3.getF182175a()).f122172c.keySet()));
                                    if (gVar != null) {
                                        int iOrdinal = gVar.ordinal();
                                        n1 n1Var8 = n1Var3;
                                        n1Var8.t(iOrdinal);
                                        e.c(lVar2, n1Var, n1Var5, p1Var3, n1Var8);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(obj);
                } else {
                    obj = objQ7;
                    lVar2 = lVar;
                }
            }
            p pVar3 = new p(cVarE2, i24, null, null, null, 0.0f, false, false, null, null, (e23.l) obj, 1020, null);
            o0VarE.N(-712746333, ((f) p1VarQ.getF182175a()).f122170a);
            rVar2 = aVar;
            r82.k.c(x2.y(rVar2, null, 3), i53.a.a(pVar, pVar2, pVar3), o0VarE, 0, 0);
            o0VarE.g0(false);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(fVar, rVar2, lVar2, i14);
        }
    }

    public static final int b(i53.c cVar, int i14) {
        Integer num = (Integer) h0.d0(cVar);
        int iIntValue = num != null ? num.intValue() : i14;
        Integer num2 = (Integer) h0.n0(cVar);
        int iIndexOf = cVar.indexOf(Integer.valueOf(t.e(i14, iIntValue, num2 != null ? num2.intValue() : i14)));
        if (iIndexOf < 0) {
            return 0;
        }
        return iIndexOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(e23.l lVar, n1 n1Var, n1 n1Var2, p1 p1Var, n1 n1Var3) {
        double intValue = (((double) n1Var2.getIntValue()) / ((f) p1Var.getF182175a()).a()) + ((double) n1Var.getIntValue());
        g gVar = (g) g.f122178e.get(n1Var3.getIntValue());
        if (((f) p1Var.getF182175a()).f122170a != gVar && ((f) p1Var.getF182175a()).f122174e) {
            intValue = gVar.a(((f) p1Var.getF182175a()).f122170a.b(intValue));
            n1Var.t((int) intValue);
            n1Var2.t(MathKt.b(((f) p1Var.getF182175a()).a() * (intValue - ((double) n1Var.getIntValue()))));
        }
        f fVar = (f) p1Var.getF182175a();
        i53.d<g, j23.g<Double>> dVar = fVar.f122172c;
        int i14 = fVar.f122173d;
        boolean z14 = fVar.f122174e;
        gVar.getClass();
        dVar.getClass();
        lVar.invoke(new f(gVar, intValue, dVar, i14, z14));
    }
}
