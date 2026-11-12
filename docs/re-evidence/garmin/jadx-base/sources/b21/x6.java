package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x6 implements e23.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15389a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21.e f15390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15392d;

    public /* synthetic */ x6(lc.v vVar, lc.m0 m0Var, v21.e eVar) {
        this.f15392d = vVar;
        this.f15390b = eVar;
        this.f15391c = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0384  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x018e  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0246  */
    /* JADX WARN: Code duplicated, block: B:68:0x0289  */
    /* JADX WARN: Code duplicated, block: B:81:0x02db  */
    /* JADX WARN: Code duplicated, block: B:88:0x0326  */
    /* JADX WARN: Code duplicated, block: B:8:0x0060  */
    /* JADX WARN: Code duplicated, block: B:93:0x034b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0368  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i14;
        Object y7Var;
        p3.p1 p1Var;
        lc.m0 m0Var;
        p3.m mVar;
        fe feVar;
        lc.m0 m0Var2;
        p3.p1 p1Var2;
        int i15 = this.f15389a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj6 = this.f15392d;
        final int i16 = 1;
        final int i17 = 0;
        switch (i15) {
            case 0:
                x01.b bVar = (x01.b) obj6;
                q21.r rVar = (q21.r) obj;
                q21.q qVar = (q21.q) obj2;
                fe feVar2 = (fe) obj3;
                p3.m mVar2 = (p3.m) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                rVar.getClass();
                qVar.getClass();
                feVar2.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                l01.k kVar = rVar.f142293f;
                lc.m0 m0Var3 = this.f15391c;
                if (kVar == null) {
                    mVar2.C(587259137);
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar2.r(rVar) | mVar2.r(m0Var3);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new x7(rVar, m0Var3, null);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new x7(rVar, m0Var3, null);
                            mVar2.K(objQ);
                        }
                    }
                    p3.l0.e((e23.p) objQ, unit, mVar2);
                    mVar2.f();
                    return unit;
                }
                mVar2.C(587633927);
                mVar2.f();
                boolean z14 = (((iIntValue & 112) ^ 48) > 32 && mVar2.B(qVar)) || (iIntValue & 48) == 32;
                Object objQ2 = mVar2.q();
                if (z14) {
                    objQ2 = new a7(qVar, 2);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a7(qVar, 2);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.t.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar2);
                mVar2.R();
                u21.t tVar = (u21.t) u1VarResolveViewModel;
                Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                p3.p1 p1VarC = s9.c.c(tVar.f168141k, mVar2);
                Boolean boolValueOf = Boolean.valueOf(((u21.s) p1VarC.getF182175a()).f168124m);
                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(tVar) | mVar2.B(bVar);
                Object objQ3 = mVar2.q();
                if (zB) {
                    i14 = iIntValue;
                    p1Var = p1VarC;
                    m0Var = m0Var3;
                    y7Var = new y7(rVar, tVar, bVar, p1Var, null);
                    mVar2.K(y7Var);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        i14 = iIntValue;
                        p1Var = p1VarC;
                        m0Var = m0Var3;
                        y7Var = new y7(rVar, tVar, bVar, p1Var, null);
                        mVar2.K(y7Var);
                    } else {
                        p1Var = p1VarC;
                        m0Var = m0Var3;
                        y7Var = objQ3;
                        i14 = iIntValue;
                    }
                }
                p3.l0.e((e23.p) y7Var, boolValueOf, mVar2);
                Integer num = ((u21.s) p1Var.getF182175a()).f168127p;
                boolean zB2 = mVar2.B(p1Var) | mVar2.r(rVar) | mVar2.r(tVar);
                Object objQ4 = mVar2.q();
                if (zB2) {
                    objQ4 = new z7(p1Var, rVar, tVar, null);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new z7(p1Var, rVar, tVar, null);
                        mVar2.K(objQ4);
                    }
                }
                p3.l0.e((e23.p) objQ4, num, mVar2);
                Boolean boolValueOf2 = Boolean.valueOf(((u21.s) p1Var.getF182175a()).f168126o);
                boolean zB3 = mVar2.B(p1Var) | ((((i14 & 896) ^ 384) > 256 && mVar2.B(feVar2)) || (i14 & 384) == 256) | mVar2.r(context) | mVar2.r(tVar) | mVar2.r(m0Var);
                Object objQ5 = mVar2.q();
                if (zB3) {
                    p3.p1 p1Var3 = p1Var;
                    mVar = mVar2;
                    lc.m0 m0Var4 = m0Var;
                    feVar = feVar2;
                    a8 a8Var = new a8(feVar, context, tVar, m0Var4, p1Var3, null);
                    m0Var2 = m0Var4;
                    p1Var2 = p1Var3;
                    mVar.K(a8Var);
                    objQ5 = a8Var;
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        p3.p1 p1Var4 = p1Var;
                        mVar = mVar2;
                        lc.m0 m0Var5 = m0Var;
                        feVar = feVar2;
                        a8 a8Var2 = new a8(feVar, context, tVar, m0Var5, p1Var4, null);
                        m0Var2 = m0Var5;
                        p1Var2 = p1Var4;
                        mVar.K(a8Var2);
                        objQ5 = a8Var2;
                    } else {
                        feVar = feVar2;
                        mVar = mVar2;
                        m0Var2 = m0Var;
                        p1Var2 = p1Var;
                    }
                }
                p3.l0.e((e23.p) objQ5, boolValueOf2, mVar);
                Boolean boolValueOf3 = Boolean.valueOf(((u21.s) p1Var2.getF182175a()).f168125n);
                boolean zB4 = mVar.B(p1Var2) | mVar.r(m0Var2) | mVar.r(tVar);
                Object objQ6 = mVar.q();
                if (zB4) {
                    objQ6 = new b8(m0Var2, tVar, p1Var2, null);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new b8(m0Var2, tVar, p1Var2, null);
                        mVar.K(objQ6);
                    }
                }
                p3.l0.e((e23.p) objQ6, boolValueOf3, mVar);
                u21.s sVar = (u21.s) p1Var2.getF182175a();
                boolean zB5 = mVar.B(bVar);
                Object objQ7 = mVar.q();
                if (zB5) {
                    objQ7 = new f7(bVar, 1);
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new f7(bVar, 1);
                        mVar.K(objQ7);
                    }
                }
                e23.a aVar3 = (e23.a) objQ7;
                boolean zR2 = mVar.r(tVar);
                Object objQ8 = mVar.q();
                if (zR2) {
                    objQ8 = new h(tVar, 2);
                    mVar.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new h(tVar, 2);
                        mVar.K(objQ8);
                    }
                }
                e23.a aVar4 = (e23.a) objQ8;
                boolean zR3 = mVar.r(tVar);
                Object objQ9 = mVar.q();
                if (zR3) {
                    objQ9 = new u6(tVar, 3);
                    mVar.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new u6(tVar, 3);
                        mVar.K(objQ9);
                    }
                }
                p3.m mVar3 = mVar;
                p21.i.a(sVar, feVar, aVar3, aVar4, (e23.l) objQ9, z3.f.c(654895270, new a51.l(this.f15390b, tVar, m0Var2, p1Var2, 14), mVar), mVar3, ((i14 >> 3) & 112) | 196608, 0);
                return Unit.INSTANCE;
            default:
                fe feVar3 = (fe) obj3;
                p3.m mVar4 = (p3.m) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((q21.r) obj).getClass();
                ((q21.q) obj2).getClass();
                feVar3.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                l4.s sVar2 = (l4.s) lc.w.a((lc.v) obj6, t0Var.b(l4.s.class));
                String str = sVar2.f14963c;
                long j8 = sVar2.f14962b;
                boolean zB6 = mVar4.B(str) | mVar4.r(sVar2);
                Object objQ10 = mVar4.q();
                if (zB6) {
                    objQ10 = new ao1.i(22, str, sVar2);
                    mVar4.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new ao1.i(22, str, sVar2);
                        mVar4.K(objQ10);
                    }
                }
                e23.a aVar5 = (e23.a) objQ10;
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar4);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(q21.e.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar5);
                mVar4.R();
                final q21.e eVar = (q21.e) u1VarResolveViewModel2;
                q21.d dVar = (q21.d) s9.c.c(eVar.f142235c, mVar4).getF182175a();
                boolean zR4 = mVar4.r(eVar);
                Object objQ11 = mVar4.q();
                if (zR4) {
                    objQ11 = new e23.l() { // from class: b21.i7
                        @Override // e23.l
                        public final Object invoke(Object obj7) {
                            b63.v vVar;
                            switch (i17) {
                                case 0:
                                    q21.e eVar2 = eVar;
                                    boolean z15 = eVar2.f142233a;
                                    b63.v vVar2 = (b63.v) obj7;
                                    vVar2.getClass();
                                    r53.p2 p2Var = eVar2.f142234b;
                                    if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var.getValue()).f142226c, vVar2)) {
                                        b63.v vVar3 = ((q21.d) p2Var.getValue()).f142227d;
                                        v21.f.f175333a.getClass();
                                        b63.v vVarW = z15 ? v21.f.w(vVar2) : v21.f.u(vVar2);
                                        if (!z15 ? vVar3.compareTo(vVar2) <= 0 : vVar3.compareTo(vVarW) < 0) {
                                            vVar3 = vVarW;
                                        }
                                        eVar2.y4(vVar2, vVar3);
                                    }
                                    break;
                                default:
                                    b63.v vVar4 = (b63.v) obj7;
                                    vVar4.getClass();
                                    q21.e eVar3 = eVar;
                                    boolean z16 = eVar3.f142233a;
                                    r53.p2 p2Var2 = eVar3.f142234b;
                                    if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var2.getValue()).f142227d, vVar4)) {
                                        b63.v vVar5 = ((q21.d) p2Var2.getValue()).f142226c;
                                        v21.f.f175333a.getClass();
                                        if (z16) {
                                            vVar = v21.f.t(vVar4);
                                        } else {
                                            int hour = vVar4.f16219a.getHour() - 1;
                                            if (hour < 0) {
                                                hour = 0;
                                            }
                                            vVar = new b63.v(hour, 0, 0, 0);
                                        }
                                        if (!z16 ? vVar5.compareTo(vVar4) >= 0 : vVar5.compareTo(vVar) > 0) {
                                            vVar5 = vVar;
                                        }
                                        eVar3.y4(vVar5, vVar4);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar4.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new e23.l() { // from class: b21.i7
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                b63.v vVar;
                                switch (i17) {
                                    case 0:
                                        q21.e eVar2 = eVar;
                                        boolean z15 = eVar2.f142233a;
                                        b63.v vVar2 = (b63.v) obj7;
                                        vVar2.getClass();
                                        r53.p2 p2Var = eVar2.f142234b;
                                        if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var.getValue()).f142226c, vVar2)) {
                                            b63.v vVar3 = ((q21.d) p2Var.getValue()).f142227d;
                                            v21.f.f175333a.getClass();
                                            b63.v vVarW = z15 ? v21.f.w(vVar2) : v21.f.u(vVar2);
                                            if (!z15 ? vVar3.compareTo(vVar2) <= 0 : vVar3.compareTo(vVarW) < 0) {
                                                vVar3 = vVarW;
                                            }
                                            eVar2.y4(vVar2, vVar3);
                                        }
                                        break;
                                    default:
                                        b63.v vVar4 = (b63.v) obj7;
                                        vVar4.getClass();
                                        q21.e eVar3 = eVar;
                                        boolean z16 = eVar3.f142233a;
                                        r53.p2 p2Var2 = eVar3.f142234b;
                                        if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var2.getValue()).f142227d, vVar4)) {
                                            b63.v vVar5 = ((q21.d) p2Var2.getValue()).f142226c;
                                            v21.f.f175333a.getClass();
                                            if (z16) {
                                                vVar = v21.f.t(vVar4);
                                            } else {
                                                int hour = vVar4.f16219a.getHour() - 1;
                                                if (hour < 0) {
                                                    hour = 0;
                                                }
                                                vVar = new b63.v(hour, 0, 0, 0);
                                            }
                                            if (!z16 ? vVar5.compareTo(vVar4) >= 0 : vVar5.compareTo(vVar) > 0) {
                                                vVar5 = vVar;
                                            }
                                            eVar3.y4(vVar5, vVar4);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ11);
                    }
                }
                e23.l lVar = (e23.l) objQ11;
                boolean zR5 = mVar4.r(eVar);
                Object objQ12 = mVar4.q();
                if (zR5) {
                    objQ12 = new e23.l() { // from class: b21.i7
                        @Override // e23.l
                        public final Object invoke(Object obj7) {
                            b63.v vVar;
                            switch (i16) {
                                case 0:
                                    q21.e eVar2 = eVar;
                                    boolean z15 = eVar2.f142233a;
                                    b63.v vVar2 = (b63.v) obj7;
                                    vVar2.getClass();
                                    r53.p2 p2Var = eVar2.f142234b;
                                    if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var.getValue()).f142226c, vVar2)) {
                                        b63.v vVar3 = ((q21.d) p2Var.getValue()).f142227d;
                                        v21.f.f175333a.getClass();
                                        b63.v vVarW = z15 ? v21.f.w(vVar2) : v21.f.u(vVar2);
                                        if (!z15 ? vVar3.compareTo(vVar2) <= 0 : vVar3.compareTo(vVarW) < 0) {
                                            vVar3 = vVarW;
                                        }
                                        eVar2.y4(vVar2, vVar3);
                                    }
                                    break;
                                default:
                                    b63.v vVar4 = (b63.v) obj7;
                                    vVar4.getClass();
                                    q21.e eVar3 = eVar;
                                    boolean z16 = eVar3.f142233a;
                                    r53.p2 p2Var2 = eVar3.f142234b;
                                    if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var2.getValue()).f142227d, vVar4)) {
                                        b63.v vVar5 = ((q21.d) p2Var2.getValue()).f142226c;
                                        v21.f.f175333a.getClass();
                                        if (z16) {
                                            vVar = v21.f.t(vVar4);
                                        } else {
                                            int hour = vVar4.f16219a.getHour() - 1;
                                            if (hour < 0) {
                                                hour = 0;
                                            }
                                            vVar = new b63.v(hour, 0, 0, 0);
                                        }
                                        if (!z16 ? vVar5.compareTo(vVar4) >= 0 : vVar5.compareTo(vVar) > 0) {
                                            vVar5 = vVar;
                                        }
                                        eVar3.y4(vVar5, vVar4);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar4.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new e23.l() { // from class: b21.i7
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                b63.v vVar;
                                switch (i16) {
                                    case 0:
                                        q21.e eVar2 = eVar;
                                        boolean z15 = eVar2.f142233a;
                                        b63.v vVar2 = (b63.v) obj7;
                                        vVar2.getClass();
                                        r53.p2 p2Var = eVar2.f142234b;
                                        if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var.getValue()).f142226c, vVar2)) {
                                            b63.v vVar3 = ((q21.d) p2Var.getValue()).f142227d;
                                            v21.f.f175333a.getClass();
                                            b63.v vVarW = z15 ? v21.f.w(vVar2) : v21.f.u(vVar2);
                                            if (!z15 ? vVar3.compareTo(vVar2) <= 0 : vVar3.compareTo(vVarW) < 0) {
                                                vVar3 = vVarW;
                                            }
                                            eVar2.y4(vVar2, vVar3);
                                        }
                                        break;
                                    default:
                                        b63.v vVar4 = (b63.v) obj7;
                                        vVar4.getClass();
                                        q21.e eVar3 = eVar;
                                        boolean z16 = eVar3.f142233a;
                                        r53.p2 p2Var2 = eVar3.f142234b;
                                        if (!p005kotlin.jvm.internal.s.g(((q21.d) p2Var2.getValue()).f142227d, vVar4)) {
                                            b63.v vVar5 = ((q21.d) p2Var2.getValue()).f142226c;
                                            v21.f.f175333a.getClass();
                                            if (z16) {
                                                vVar = v21.f.t(vVar4);
                                            } else {
                                                int hour = vVar4.f16219a.getHour() - 1;
                                                if (hour < 0) {
                                                    hour = 0;
                                                }
                                                vVar = new b63.v(hour, 0, 0, 0);
                                            }
                                            if (!z16 ? vVar5.compareTo(vVar4) >= 0 : vVar5.compareTo(vVar) > 0) {
                                                vVar5 = vVar;
                                            }
                                            eVar3.y4(vVar5, vVar4);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ12);
                    }
                }
                e23.l lVar2 = (e23.l) objQ12;
                lc.m0 m0Var6 = this.f15391c;
                boolean zR6 = mVar4.r(m0Var6);
                Object objQ13 = mVar4.q();
                if (zR6) {
                    objQ13 = new aa2.m(m0Var6, 11);
                    mVar4.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new aa2.m(m0Var6, 11);
                        mVar4.K(objQ13);
                    }
                }
                e23.a aVar6 = (e23.a) objQ13;
                boolean zR7 = mVar4.r(m0Var6) | mVar4.l(j8) | mVar4.B(str);
                Object objQ14 = mVar4.q();
                if (zR7) {
                    objQ14 = new a3.l0(m0Var6, j8, str, 1);
                    mVar4.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new a3.l0(m0Var6, j8, str, 1);
                        mVar4.K(objQ14);
                    }
                }
                p21.e.a(dVar, this.f15390b, lVar, lVar2, aVar6, (e23.p) objQ14, feVar3, mVar4, (iIntValue2 << 12) & 3670016);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ x6(lc.m0 m0Var, x01.b bVar, v21.e eVar) {
        this.f15391c = m0Var;
        this.f15392d = bVar;
        this.f15390b = eVar;
    }
}
