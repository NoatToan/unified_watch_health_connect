package xg0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    public static final void a(boolean z14, final e23.a<Unit> aVar, final int i14, final wg0.a aVar2, final o oVar, p3.m mVar, int i15) {
        aVar.getClass();
        aVar2.getClass();
        oVar.getClass();
        o0 o0VarE = mVar.E(-223750601);
        int i16 = i15 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.B(oVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final boolean zJ = aVar2.j();
            boolean z15 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new wv0.v(aVar, 13);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wv0.v(aVar, 13);
                    o0VarE.K(objQ);
                }
            }
            i3.u.a(z14, (e23.a) objQ, null, 0L, null, null, null, am.j.A(d92.b.f58623a, o0VarE), 0.0f, 0.0f, z3.f.c(682325234, new e23.q() { // from class: xg0.c
                /* JADX WARN: Code duplicated, block: B:16:0x0067  */
                /* JADX WARN: Code duplicated, block: B:21:0x00b3  */
                /* JADX WARN: Code duplicated, block: B:26:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:34:0x0151  */
                /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
                /* JADX WARN: Code duplicated, block: B:50:0x01f8  */
                /* JADX WARN: Code duplicated, block: B:55:0x022e  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        boolean z16 = zJ;
                        o oVar2 = oVar;
                        wg0.a aVar3 = aVar2;
                        e23.a aVar4 = aVar;
                        p3.m.a aVar5 = p3.m.f135153a;
                        if (z16) {
                            mVar2.C(-929110723);
                            w.f190854a.getClass();
                            z3.e eVar = w.f190855b;
                            boolean zR = mVar2.r(oVar2) | mVar2.r(aVar3);
                            int i17 = i14;
                            boolean zK = zR | mVar2.k(i17) | mVar2.B(aVar4);
                            Object objQ2 = mVar2.q();
                            if (zK) {
                                d dVar = new d(oVar2, aVar3, i17, aVar4, 0);
                                mVar2.K(dVar);
                                objQ2 = dVar;
                            } else {
                                aVar5.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    d dVar2 = new d(oVar2, aVar3, i17, aVar4, 0);
                                    mVar2.K(dVar2);
                                    objQ2 = dVar2;
                                }
                            }
                            i3.u.b(eVar, (e23.a) objQ2, null, null, null, false, null, null, mVar2, 6, 508);
                            z3.e eVar2 = w.f190856c;
                            boolean zR2 = mVar2.r(oVar2) | mVar2.r(aVar3) | mVar2.k(i17) | mVar2.B(aVar4);
                            Object objQ3 = mVar2.q();
                            if (zR2) {
                                d dVar3 = new d(oVar2, aVar3, i17, aVar4, 1);
                                mVar2.K(dVar3);
                                objQ3 = dVar3;
                            } else {
                                aVar5.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    d dVar4 = new d(oVar2, aVar3, i17, aVar4, 1);
                                    mVar2.K(dVar4);
                                    objQ3 = dVar4;
                                }
                            }
                            i3.u.b(eVar2, (e23.a) objQ3, null, null, null, false, null, null, mVar2, 6, 508);
                            z3.e eVar3 = w.f190857d;
                            boolean zR3 = mVar2.r(oVar2) | mVar2.r(aVar3) | mVar2.k(i17) | mVar2.B(aVar4);
                            Object objQ4 = mVar2.q();
                            if (zR3) {
                                d dVar5 = new d(oVar2, aVar3, i17, aVar4, 2);
                                mVar2.K(dVar5);
                                objQ4 = dVar5;
                            } else {
                                aVar5.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    d dVar6 = new d(oVar2, aVar3, i17, aVar4, 2);
                                    mVar2.K(dVar6);
                                    objQ4 = dVar6;
                                }
                            }
                            i3.u.b(eVar3, (e23.a) objQ4, null, null, null, false, null, null, mVar2, 6, 508);
                            mVar2.f();
                        } else {
                            mVar2.C(-928164262);
                            if (p005kotlin.jvm.internal.s.g(aVar3.D, Boolean.FALSE)) {
                                mVar2.C(-928182490);
                                w.f190854a.getClass();
                                z3.e eVar4 = w.f190858e;
                                boolean zR4 = mVar2.r(oVar2) | mVar2.r(aVar3) | mVar2.B(aVar4);
                                Object objQ5 = mVar2.q();
                                if (zR4) {
                                    objQ5 = new d(oVar2, aVar3, aVar4, 3);
                                    mVar2.K(objQ5);
                                } else {
                                    aVar5.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new d(oVar2, aVar3, aVar4, 3);
                                        mVar2.K(objQ5);
                                    }
                                }
                                i3.u.b(eVar4, (e23.a) objQ5, null, w.f190859f, null, false, null, null, mVar2, 3078, 500);
                                mVar2.f();
                            } else {
                                mVar2.C(-927619344);
                                mVar2.f();
                            }
                            if (p005kotlin.jvm.internal.s.g(aVar3.D, Boolean.TRUE)) {
                                mVar2.C(-927546587);
                                w.f190854a.getClass();
                                z3.e eVar5 = w.f190860g;
                                boolean zR5 = mVar2.r(oVar2) | mVar2.r(aVar3) | mVar2.B(aVar4);
                                Object objQ6 = mVar2.q();
                                if (zR5) {
                                    objQ6 = new d(oVar2, aVar3, aVar4, 4);
                                    mVar2.K(objQ6);
                                } else {
                                    aVar5.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new d(oVar2, aVar3, aVar4, 4);
                                        mVar2.K(objQ6);
                                    }
                                }
                                i3.u.b(eVar5, (e23.a) objQ6, null, w.f190861h, null, false, null, null, mVar2, 3078, 500);
                                mVar2.f();
                            } else {
                                mVar2.C(-926982480);
                                mVar2.f();
                            }
                            w.f190854a.getClass();
                            z3.e eVar6 = w.f190862i;
                            Context context2 = context;
                            boolean zR6 = mVar2.r(context2) | mVar2.r(aVar3) | mVar2.r(oVar2) | mVar2.B(aVar4);
                            Object objQ7 = mVar2.q();
                            if (zR6) {
                                objQ7 = new e(context2, aVar3, aVar4, oVar2);
                                mVar2.K(objQ7);
                            } else {
                                aVar5.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new e(context2, aVar3, aVar4, oVar2);
                                    mVar2.K(objQ7);
                                }
                            }
                            i3.u.b(eVar6, (e23.a) objQ7, null, w.f190863j, null, false, null, null, mVar2, 3078, 500);
                            z3.e eVar7 = w.f190864k;
                            boolean zR7 = mVar2.r(oVar2) | mVar2.r(aVar3) | mVar2.B(aVar4);
                            Object objQ8 = mVar2.q();
                            if (zR7) {
                                objQ8 = new d(oVar2, aVar3, aVar4, 5);
                                mVar2.K(objQ8);
                            } else {
                                aVar5.getClass();
                                if (objQ8 == p3.m.a.f135155b) {
                                    objQ8 = new d(oVar2, aVar3, aVar4, 5);
                                    mVar2.K(objQ8);
                                }
                            }
                            i3.u.b(eVar7, (e23.a) objQ8, null, w.f190865l, null, false, null, null, mVar2, 3078, 500);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i16 & 14, 48, 1916);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(i14, i15, aVar, aVar2, oVar, z14);
        }
    }
}
