package k80;

import am.j1;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.q;
import c2.u;
import c2.x2;
import e23.p;
import f5.z0;
import g02.s0;
import h4.r;
import h5.e0;
import i3.ve;
import java.util.List;
import java.util.Map;
import l72.c1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import ta0.f1;
import ta0.h1;
import ta0.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103354a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f103355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f103356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f103357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f103358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f103359f;

    public /* synthetic */ j(List list, x xVar, l lVar, p1 p1Var, p1 p1Var2) {
        this.f103355b = list;
        this.f103356c = xVar;
        this.f103357d = lVar;
        this.f103358e = p1Var;
        this.f103359f = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x0209  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar;
        p1 p1Var;
        int i14 = this.f103354a;
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 2;
        final int i16 = 1;
        final int i17 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    final p1 p1Var2 = this.f103358e;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    final l lVar2 = this.f103357d;
                    final p1 p1Var3 = this.f103359f;
                    if (zBooleanValue) {
                        mVar.C(2011123108);
                        c1 c1Var = c1.f110940a;
                        boolean zR = mVar.r(lVar2);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new e23.a() { // from class: k80.k
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    g gVar;
                                    g gVar2;
                                    g gVar3;
                                    switch (i17) {
                                        case 0:
                                            p1 p1Var4 = p1Var3;
                                            l90.b bVar = (l90.b) p1Var4.getF182175a();
                                            if (bVar != null && (gVar = lVar2.f103364a) != null) {
                                                gVar.B2(bVar, m.GESTURE);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var4.setValue(null);
                                            break;
                                        case 1:
                                            p1 p1Var5 = p1Var3;
                                            l90.b bVar2 = (l90.b) p1Var5.getF182175a();
                                            if (bVar2 != null && (gVar2 = lVar2.f103364a) != null) {
                                                gVar2.B2(bVar2, m.PAIR);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var5.setValue(null);
                                            break;
                                        default:
                                            p1 p1Var6 = p1Var3;
                                            l90.b bVar3 = (l90.b) p1Var6.getF182175a();
                                            if (bVar3 != null && (gVar3 = lVar2.f103364a) != null) {
                                                gVar3.B2(bVar3, m.REVISIT_TUTORIALS);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var6.setValue(null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e23.a() { // from class: k80.k
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        g gVar;
                                        g gVar2;
                                        g gVar3;
                                        switch (i17) {
                                            case 0:
                                                p1 p1Var4 = p1Var3;
                                                l90.b bVar = (l90.b) p1Var4.getF182175a();
                                                if (bVar != null && (gVar = lVar2.f103364a) != null) {
                                                    gVar.B2(bVar, m.GESTURE);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var4.setValue(null);
                                                break;
                                            case 1:
                                                p1 p1Var5 = p1Var3;
                                                l90.b bVar2 = (l90.b) p1Var5.getF182175a();
                                                if (bVar2 != null && (gVar2 = lVar2.f103364a) != null) {
                                                    gVar2.B2(bVar2, m.PAIR);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var5.setValue(null);
                                                break;
                                            default:
                                                p1 p1Var6 = p1Var3;
                                                l90.b bVar3 = (l90.b) p1Var6.getF182175a();
                                                if (bVar3 != null && (gVar3 = lVar2.f103364a) != null) {
                                                    gVar3.B2(bVar3, m.REVISIT_TUTORIALS);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var6.setValue(null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar2 = (e23.a) objQ;
                        boolean zR2 = mVar.r(lVar2);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: k80.k
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    g gVar;
                                    g gVar2;
                                    g gVar3;
                                    switch (i16) {
                                        case 0:
                                            p1 p1Var4 = p1Var3;
                                            l90.b bVar = (l90.b) p1Var4.getF182175a();
                                            if (bVar != null && (gVar = lVar2.f103364a) != null) {
                                                gVar.B2(bVar, m.GESTURE);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var4.setValue(null);
                                            break;
                                        case 1:
                                            p1 p1Var5 = p1Var3;
                                            l90.b bVar2 = (l90.b) p1Var5.getF182175a();
                                            if (bVar2 != null && (gVar2 = lVar2.f103364a) != null) {
                                                gVar2.B2(bVar2, m.PAIR);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var5.setValue(null);
                                            break;
                                        default:
                                            p1 p1Var6 = p1Var3;
                                            l90.b bVar3 = (l90.b) p1Var6.getF182175a();
                                            if (bVar3 != null && (gVar3 = lVar2.f103364a) != null) {
                                                gVar3.B2(bVar3, m.REVISIT_TUTORIALS);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var6.setValue(null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: k80.k
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        g gVar;
                                        g gVar2;
                                        g gVar3;
                                        switch (i16) {
                                            case 0:
                                                p1 p1Var4 = p1Var3;
                                                l90.b bVar = (l90.b) p1Var4.getF182175a();
                                                if (bVar != null && (gVar = lVar2.f103364a) != null) {
                                                    gVar.B2(bVar, m.GESTURE);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var4.setValue(null);
                                                break;
                                            case 1:
                                                p1 p1Var5 = p1Var3;
                                                l90.b bVar2 = (l90.b) p1Var5.getF182175a();
                                                if (bVar2 != null && (gVar2 = lVar2.f103364a) != null) {
                                                    gVar2.B2(bVar2, m.PAIR);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var5.setValue(null);
                                                break;
                                            default:
                                                p1 p1Var6 = p1Var3;
                                                l90.b bVar3 = (l90.b) p1Var6.getF182175a();
                                                if (bVar3 != null && (gVar3 = lVar2.f103364a) != null) {
                                                    gVar3.B2(bVar3, m.REVISIT_TUTORIALS);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var6.setValue(null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ2);
                            }
                        }
                        e23.a aVar3 = (e23.a) objQ2;
                        boolean zR3 = mVar.r(lVar2);
                        Object objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new e23.a() { // from class: k80.k
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    g gVar;
                                    g gVar2;
                                    g gVar3;
                                    switch (i15) {
                                        case 0:
                                            p1 p1Var4 = p1Var3;
                                            l90.b bVar = (l90.b) p1Var4.getF182175a();
                                            if (bVar != null && (gVar = lVar2.f103364a) != null) {
                                                gVar.B2(bVar, m.GESTURE);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var4.setValue(null);
                                            break;
                                        case 1:
                                            p1 p1Var5 = p1Var3;
                                            l90.b bVar2 = (l90.b) p1Var5.getF182175a();
                                            if (bVar2 != null && (gVar2 = lVar2.f103364a) != null) {
                                                gVar2.B2(bVar2, m.PAIR);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var5.setValue(null);
                                            break;
                                        default:
                                            p1 p1Var6 = p1Var3;
                                            l90.b bVar3 = (l90.b) p1Var6.getF182175a();
                                            if (bVar3 != null && (gVar3 = lVar2.f103364a) != null) {
                                                gVar3.B2(bVar3, m.REVISIT_TUTORIALS);
                                            }
                                            p1Var2.setValue(Boolean.FALSE);
                                            p1Var6.setValue(null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new e23.a() { // from class: k80.k
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        g gVar;
                                        g gVar2;
                                        g gVar3;
                                        switch (i15) {
                                            case 0:
                                                p1 p1Var4 = p1Var3;
                                                l90.b bVar = (l90.b) p1Var4.getF182175a();
                                                if (bVar != null && (gVar = lVar2.f103364a) != null) {
                                                    gVar.B2(bVar, m.GESTURE);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var4.setValue(null);
                                                break;
                                            case 1:
                                                p1 p1Var5 = p1Var3;
                                                l90.b bVar2 = (l90.b) p1Var5.getF182175a();
                                                if (bVar2 != null && (gVar2 = lVar2.f103364a) != null) {
                                                    gVar2.B2(bVar2, m.PAIR);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var5.setValue(null);
                                                break;
                                            default:
                                                p1 p1Var6 = p1Var3;
                                                l90.b bVar3 = (l90.b) p1Var6.getF182175a();
                                                if (bVar3 != null && (gVar3 = lVar2.f103364a) != null) {
                                                    gVar3.B2(bVar3, m.REVISIT_TUTORIALS);
                                                }
                                                p1Var2.setValue(Boolean.FALSE);
                                                p1Var6.setValue(null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ3);
                            }
                        }
                        e23.a aVar4 = (e23.a) objQ3;
                        Object objQ4 = mVar.q();
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new j1(p1Var2, p1Var3, 13);
                            mVar.K(objQ4);
                        }
                        lVar = lVar2;
                        p1Var = p1Var3;
                        c1Var.b(false, "Choose tutorial", null, "Gesture/Product", "Pair", "Revisit tutorials (Settings)", false, aVar2, aVar3, aVar4, (e23.a) objQ4, mVar, 14352432, 24576, 1821);
                        mVar.f();
                    } else {
                        lVar = lVar2;
                        p1Var = p1Var3;
                        mVar.C(2012169637);
                        mVar.f();
                    }
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(-1448284392, new j(this.f103355b, this.f103356c, lVar, p1Var, p1Var2), mVar), mVar, 12582918, 122);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    List list = this.f103355b;
                    if (list == null || list.isEmpty()) {
                        mVar2.C(1401189842);
                        r.a aVar5 = r.S;
                        r rVarD = x2.d(aVar5, 1.0f);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        s0.b(u.f22885a.c(aVar5, h4.d.a.f81528f), 0.0f, mVar2, 0, 2);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(1401403246);
                        p1 p1VarC = s9.c.c(this.f103356c.f163471o, mVar2);
                        boolean zB = mVar2.B(p1VarC);
                        Object objQ5 = mVar2.q();
                        if (zB) {
                            objQ5 = new by1.h(p1VarC, 4);
                            mVar2.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new by1.h(p1VarC, 4);
                                mVar2.K(objQ5);
                            }
                        }
                        e23.a aVar7 = (e23.a) objQ5;
                        mVar2.L(-1614864554);
                        v9.a.f176280a.getClass();
                        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                        if (viewModelStoreOwnerA == null) {
                            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return null;
                        }
                        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(f1.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar7);
                        mVar2.R();
                        f1 f1Var = (f1) u1VarResolveViewModel;
                        zb0.l lVar3 = zb0.l.ALL;
                        List list2 = (List) ((Map) p1VarC.getF182175a()).get(lVar3);
                        if (list2 == null) {
                            list2 = j0.f134944a;
                        }
                        List list3 = list2;
                        Object objQ6 = mVar2.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ6 == c2565a) {
                            objQ6 = new am.c1(this.f103358e, this.f103359f, 16);
                            mVar2.K(objQ6);
                        }
                        e23.l lVar4 = (e23.l) objQ6;
                        Object objQ7 = mVar2.q();
                        if (objQ7 == c2565a) {
                            objQ7 = new k62.l(6);
                            mVar2.K(objQ7);
                        }
                        e23.a aVar8 = (e23.a) objQ7;
                        l lVar5 = this.f103357d;
                        boolean zR4 = mVar2.r(lVar5);
                        Object objQ8 = mVar2.q();
                        if (zR4 || objQ8 == c2565a) {
                            objQ8 = new i(lVar5, 0);
                            mVar2.K(objQ8);
                        }
                        h1.a(f1Var, lVar3, list3, lVar4, aVar8, (e23.a) objQ8, mVar2, 27704);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(l lVar, p1 p1Var, p1 p1Var2, List list, x xVar) {
        this.f103357d = lVar;
        this.f103358e = p1Var;
        this.f103359f = p1Var2;
        this.f103355b = list;
        this.f103356c = xVar;
    }
}
