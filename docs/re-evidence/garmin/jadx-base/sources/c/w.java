package c;

import am.e1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o53.b0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    public static final void a(int i14, int i15, e23.a aVar, p3.m mVar, boolean z14) {
        boolean z15;
        int i16;
        boolean z16;
        wc.d dVar;
        wc.c navigationEventDispatcher;
        b.w wVar;
        b.u onBackPressedDispatcher;
        o0 o0VarE = mVar.E(-361453782);
        int i17 = i15 & 1;
        int i18 = 2;
        if (i17 != 0) {
            i16 = i14 | 6;
            z15 = z14;
        } else if ((i14 & 6) == 0) {
            z15 = z14;
            i16 = (o0VarE.h(z15) ? 4 : 2) | i14;
        } else {
            z15 = z14;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        final int i19 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            z16 = i17 != 0 ? true : z15;
            x1 x1Var = p3.n.f135158a;
            xc.b.f189878a.getClass();
            Object objA = xc.b.a(o0VarE);
            if (objA == null) {
                o0VarE.C(535274673);
                p.f22335a.getClass();
                objA = p.a(o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(535271790);
                o0VarE.g0(false);
            }
            if (objA == null) {
                vb.h.z("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zB = o0VarE.B(objA);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                if (objA instanceof wc.d) {
                    dVar = (wc.d) objA;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    navigationEventDispatcher = dVar.getNavigationEventDispatcher();
                } else {
                    navigationEventDispatcher = null;
                }
                if (objA instanceof b.w) {
                    wVar = (b.w) objA;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    onBackPressedDispatcher = wVar.getOnBackPressedDispatcher();
                } else {
                    onBackPressedDispatcher = null;
                }
                objQ = new d.b(navigationEventDispatcher, onBackPressedDispatcher);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (objA instanceof wc.d) {
                        dVar = (wc.d) objA;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        navigationEventDispatcher = dVar.getNavigationEventDispatcher();
                    } else {
                        navigationEventDispatcher = null;
                    }
                    if (objA instanceof b.w) {
                        wVar = (b.w) objA;
                    } else {
                        wVar = null;
                    }
                    if (wVar != null) {
                        onBackPressedDispatcher = wVar.getOnBackPressedDispatcher();
                    } else {
                        onBackPressedDispatcher = null;
                    }
                    objQ = new d.b(navigationEventDispatcher, onBackPressedDispatcher);
                    o0VarE.K(objQ);
                }
            }
            final d.b bVar = (d.b) objQ;
            long j8 = o0VarE.U;
            boolean zB2 = o0VarE.B(bVar) | o0VarE.l(j8);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new k(new c(objA, j8));
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new k(new c(objA, j8));
                    o0VarE.K(objQ2);
                }
            }
            final k kVar = (k) objQ2;
            if (b.a.f13786a) {
                o0VarE.C(-585307852);
                boolean zR = o0VarE.r(kVar) | ((i16 & 112) == 32);
                Object objQ3 = o0VarE.q();
                if (zR) {
                    objQ3 = new bb0.d(15, kVar, aVar);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new bb0.d(15, kVar, aVar);
                        o0VarE.K(objQ3);
                    }
                }
                l0.i((e23.a) objQ3, o0VarE);
                Boolean boolValueOf = Boolean.valueOf(z16);
                int i24 = i16 & 14;
                boolean zR2 = o0VarE.r(kVar) | (i24 == 4);
                Object objQ4 = o0VarE.q();
                if (zR2) {
                    objQ4 = new as2.d(kVar, z16, i18);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new as2.d(kVar, z16, i18);
                        o0VarE.K(objQ4);
                    }
                }
                s9.e.d(boolValueOf, kVar, null, (e23.l) objQ4, o0VarE, i24);
                boolean zR3 = o0VarE.r(bVar) | o0VarE.r(kVar);
                Object objQ5 = o0VarE.q();
                if (zR3) {
                    objQ5 = new e23.l() { // from class: c.d
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    d.b bVar2 = bVar;
                                    k kVar2 = kVar;
                                    bVar2.a(kVar2);
                                    return new h(bVar2, kVar2);
                                default:
                                    d.b bVar3 = bVar;
                                    k kVar3 = kVar;
                                    bVar3.a(kVar3);
                                    return new i((s9.h) obj, bVar3, kVar3);
                            }
                        }
                    };
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new e23.l() { // from class: c.d
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                switch (i19) {
                                    case 0:
                                        d.b bVar2 = bVar;
                                        k kVar2 = kVar;
                                        bVar2.a(kVar2);
                                        return new h(bVar2, kVar2);
                                    default:
                                        d.b bVar3 = bVar;
                                        k kVar3 = kVar;
                                        bVar3.a(kVar3);
                                        return new i((s9.h) obj, bVar3, kVar3);
                                }
                            }
                        };
                        o0VarE.K(objQ5);
                    }
                }
                l0.b(bVar, kVar, (e23.l) objQ5, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-584634160);
                boolean zR4 = o0VarE.r(kVar) | ((i16 & 14) == 4) | ((i16 & 112) == 32);
                Object objQ6 = o0VarE.q();
                if (zR4) {
                    objQ6 = new e(kVar, z16, aVar, i19);
                    o0VarE.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new e(kVar, z16, aVar, i19);
                        o0VarE.K(objQ6);
                    }
                }
                l0.i((e23.a) objQ6, o0VarE);
                boolean zR5 = o0VarE.r(bVar) | o0VarE.r(kVar);
                Object objQ7 = o0VarE.q();
                if (zR5) {
                    final int i25 = 1;
                    objQ7 = new e23.l() { // from class: c.d
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i25) {
                                case 0:
                                    d.b bVar2 = bVar;
                                    k kVar2 = kVar;
                                    bVar2.a(kVar2);
                                    return new h(bVar2, kVar2);
                                default:
                                    d.b bVar3 = bVar;
                                    k kVar3 = kVar;
                                    bVar3.a(kVar3);
                                    return new i((s9.h) obj, bVar3, kVar3);
                            }
                        }
                    };
                    o0VarE.K(objQ7);
                } else {
                    aVar2.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        final int i26 = 1;
                        objQ7 = new e23.l() { // from class: c.d
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                switch (i26) {
                                    case 0:
                                        d.b bVar2 = bVar;
                                        k kVar2 = kVar;
                                        bVar2.a(kVar2);
                                        return new h(bVar2, kVar2);
                                    default:
                                        d.b bVar3 = bVar;
                                        k kVar3 = kVar;
                                        bVar3.a(kVar3);
                                        return new i((s9.h) obj, bVar3, kVar3);
                                }
                            }
                        };
                        o0VarE.K(objQ7);
                    }
                }
                s9.e.d(bVar, kVar, null, (e23.l) objQ7, o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(i14, i15, aVar, z16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0081, please report this as an issue */
    @SuppressLint({"RememberReturnType"})
    public static final void b(boolean z14, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        wc.d dVar;
        wc.c navigationEventDispatcher;
        b.w wVar;
        o0 o0VarE = mVar.E(-642000585);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 16;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            xc.b.f189878a.getClass();
            Object objA = xc.b.a(o0VarE);
            if (objA == null) {
                o0VarE.C(1512740606);
                p.f22335a.getClass();
                objA = p.a(o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1512737723);
                o0VarE.g0(false);
            }
            if (objA == null) {
                vb.h.z("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zB = o0VarE.B(objA);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                if (objA instanceof wc.d) {
                    dVar = (wc.d) objA;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    navigationEventDispatcher = dVar.getNavigationEventDispatcher();
                } else {
                    navigationEventDispatcher = null;
                }
                if (objA instanceof b.w) {
                    wVar = (b.w) objA;
                } else {
                    wVar = null;
                }
                objQ = new d.b(navigationEventDispatcher, wVar != null ? wVar.getOnBackPressedDispatcher() : null);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (objA instanceof wc.d) {
                        dVar = (wc.d) objA;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        navigationEventDispatcher = dVar.getNavigationEventDispatcher();
                    } else {
                        navigationEventDispatcher = null;
                    }
                    if (objA instanceof b.w) {
                        wVar = (b.w) objA;
                    } else {
                        wVar = null;
                    }
                    objQ = new d.b(navigationEventDispatcher, wVar != null ? wVar.getOnBackPressedDispatcher() : null);
                    o0VarE.K(objQ);
                }
            }
            final d.b bVar = (d.b) objQ;
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            long j8 = o0VarE.U;
            boolean zB2 = o0VarE.B(bVar) | o0VarE.l(j8);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new l(b0Var, new r(objA, j8));
                o0VarE.K(objQ3);
            }
            final l lVar = (l) objQ3;
            if (b.a.f13786a) {
                o0VarE.C(-348514256);
                boolean zR = o0VarE.r(lVar) | o0VarE.r(pVar);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new bb0.d(i16, lVar, pVar);
                    o0VarE.K(objQ4);
                }
                l0.i((e23.a) objQ4, o0VarE);
                Boolean boolValueOf = Boolean.valueOf(z14);
                int i18 = i15 & 14;
                boolean zR2 = (i18 == 4) | o0VarE.r(lVar);
                Object objQ5 = o0VarE.q();
                if (zR2 || objQ5 == c2565a) {
                    objQ5 = new as2.d(lVar, z14, 3);
                    o0VarE.K(objQ5);
                }
                s9.e.d(boolValueOf, lVar, null, (e23.l) objQ5, o0VarE, i18);
                boolean zR3 = o0VarE.r(bVar) | o0VarE.r(lVar);
                Object objQ6 = o0VarE.q();
                if (zR3 || objQ6 == c2565a) {
                    objQ6 = new e23.l() { // from class: c.s
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i17) {
                                case 0:
                                    d.b bVar2 = bVar;
                                    l lVar2 = lVar;
                                    bVar2.a(lVar2);
                                    return new u(bVar2, lVar2);
                                default:
                                    d.b bVar3 = bVar;
                                    l lVar3 = lVar;
                                    bVar3.a(lVar3);
                                    return new v((s9.h) obj, bVar3, lVar3);
                            }
                        }
                    };
                    o0VarE.K(objQ6);
                }
                l0.b(bVar, lVar, (e23.l) objQ6, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-347849492);
                boolean zR4 = ((i15 & 14) == 4) | o0VarE.r(lVar) | o0VarE.r(pVar);
                Object objQ7 = o0VarE.q();
                if (zR4 || objQ7 == c2565a) {
                    objQ7 = new e(lVar, z14, pVar, 1);
                    o0VarE.K(objQ7);
                }
                l0.i((e23.a) objQ7, o0VarE);
                boolean zR5 = o0VarE.r(bVar) | o0VarE.r(lVar);
                Object objQ8 = o0VarE.q();
                if (zR5 || objQ8 == c2565a) {
                    final int i19 = 1;
                    objQ8 = new e23.l() { // from class: c.s
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    d.b bVar2 = bVar;
                                    l lVar2 = lVar;
                                    bVar2.a(lVar2);
                                    return new u(bVar2, lVar2);
                                default:
                                    d.b bVar3 = bVar;
                                    l lVar3 = lVar;
                                    bVar3.a(lVar3);
                                    return new v((s9.h) obj, bVar3, lVar3);
                            }
                        }
                    };
                    o0VarE.K(objQ8);
                }
                s9.e.d(bVar, lVar, null, (e23.l) objQ8, o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bv1.v(z14, pVar, i14, 1);
        }
    }

    public static final q c(g.a aVar, e23.l lVar, p3.m mVar, int i14) {
        Object e1Var;
        g.a aVar2;
        x1 x1Var = p3.n.f135158a;
        p1 p1VarQ = p0.q(aVar, mVar);
        Object objQ = p0.q(lVar, mVar);
        Object[] objArr = new Object[0];
        Object objQ2 = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ2 == p3.m.a.f135155b) {
            objQ2 = new bv0.b(15);
            mVar.K(objQ2);
        }
        Object obj = (String) d4.a.e(objArr, (e23.a) objQ2, mVar, 48);
        o.f22333a.getClass();
        f.h hVar = (f.h) mVar.A(o.f22334b);
        if (hVar == null) {
            mVar.C(1213380307);
            Object baseContext = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof f.h) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            hVar = (f.h) baseContext;
        } else {
            mVar.C(1213379439);
        }
        mVar.f();
        x1 x1Var2 = p3.n.f135158a;
        if (hVar == null) {
            vb.h.z("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = hVar.getActivityResultRegistry();
        Object objQ3 = mVar.q();
        Object obj2 = p3.m.a.f135155b;
        if (objQ3 == obj2) {
            objQ3 = new a();
            mVar.K(objQ3);
        }
        a aVar3 = (a) objQ3;
        Object objQ4 = mVar.q();
        if (objQ4 == obj2) {
            objQ4 = new q(aVar3, p1VarQ);
            mVar.K(objQ4);
        }
        q qVar = (q) objQ4;
        boolean zR = mVar.r(aVar3) | mVar.r(activityResultRegistry) | mVar.B(obj) | mVar.r(aVar) | mVar.B(objQ);
        Object objQ5 = mVar.q();
        if (zR || objQ5 == obj2) {
            aVar2 = aVar;
            e1Var = new e1(aVar3, activityResultRegistry, obj, aVar2, objQ, 2);
            mVar.K(e1Var);
        } else {
            e1Var = objQ5;
            aVar2 = aVar;
        }
        l0.c(activityResultRegistry, obj, aVar2, (e23.l) e1Var, mVar);
        return qVar;
    }
}
