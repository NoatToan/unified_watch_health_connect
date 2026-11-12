package b21;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15029b;

    public /* synthetic */ m(lc.m0 m0Var, int i14) {
        this.f15028a = i14;
        this.f15029b = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0425  */
    /* JADX WARN: Code duplicated, block: B:112:0x0459  */
    /* JADX WARN: Code duplicated, block: B:119:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x0518  */
    /* JADX WARN: Code duplicated, block: B:138:0x057a  */
    /* JADX WARN: Code duplicated, block: B:143:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:148:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:153:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0605  */
    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0621  */
    /* JADX WARN: Code duplicated, block: B:168:0x063e  */
    /* JADX WARN: Code duplicated, block: B:173:0x065b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0679  */
    /* JADX WARN: Code duplicated, block: B:183:0x0697  */
    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x014e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0184  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x032d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0348  */
    /* JADX WARN: Code duplicated, block: B:83:0x0365  */
    /* JADX WARN: Code duplicated, block: B:88:0x0382  */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Code duplicated, block: B:93:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x03db  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        p3.p1 p1Var;
        Object lVar;
        int i14 = this.f15028a;
        int i15 = 9;
        int i16 = 26;
        final int i17 = 2;
        final int i18 = 1;
        final int i19 = 0;
        p3.m.a aVar = p3.m.f135153a;
        lc.m0 m0Var = this.f15029b;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                Object objQ = mVar.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new fe();
                    mVar.K(objQ);
                }
                fe feVar = (fe) objQ;
                lc.m0 m0Var2 = this.f15029b;
                u21.t tVarA = h0.a(vVar, m0Var2, mVar);
                if (tVarA == null) {
                    return Unit.INSTANCE;
                }
                p3.p1 p1VarC = s9.c.c(tVarA.f168141k, mVar);
                boolean zR = mVar.r(tVarA) | mVar.B(p1VarC);
                Object objQ2 = mVar.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new d(tVarA, p1VarC, 1);
                    mVar.K(objQ2);
                }
                e23.a aVar2 = (e23.a) objQ2;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.n.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar2);
                mVar.R();
                final u21.n nVar = (u21.n) u1VarResolveViewModel;
                p3.p1 p1VarC2 = s9.c.c(nVar.f168045c, mVar);
                Boolean boolValueOf = Boolean.valueOf(((u21.m) p1VarC2.getF182175a()).f168040c);
                boolean zB = mVar.B(p1VarC2) | mVar.r(tVarA) | mVar.r(m0Var2) | mVar.r(nVar);
                Object objQ3 = mVar.q();
                if (zB || objQ3 == c2565a) {
                    p1Var = p1VarC2;
                    o oVar = new o(tVarA, m0Var2, nVar, p1Var, null);
                    mVar.K(oVar);
                    objQ3 = oVar;
                } else {
                    p1Var = p1VarC2;
                }
                p3.l0.e((e23.p) objQ3, boolValueOf, mVar);
                u21.m mVar2 = (u21.m) p1Var.getF182175a();
                boolean zR2 = mVar.r(nVar);
                Object objQ4 = mVar.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new a61.d(nVar, 8);
                    mVar.K(objQ4);
                }
                e23.p pVar = (e23.p) objQ4;
                boolean zR3 = mVar.r(nVar);
                Object objQ5 = mVar.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new e23.a() { // from class: b21.n
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            switch (i19) {
                                case 0:
                                    r53.p2 p2Var = nVar.f168044b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.m.a((u21.m) value, null, false, true, 3)));
                                    break;
                                default:
                                    r53.p2 p2Var2 = nVar.f168044b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.m.a((u21.m) value2, null, false, false, 5)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ5);
                }
                e23.a aVar3 = (e23.a) objQ5;
                boolean zR4 = mVar.r(m0Var2);
                Object objQ6 = mVar.q();
                if (zR4 || objQ6 == c2565a) {
                    objQ6 = new aa2.m(m0Var2, 5);
                    mVar.K(objQ6);
                }
                e23.a aVar4 = (e23.a) objQ6;
                boolean zR5 = mVar.r(nVar);
                Object objQ7 = mVar.q();
                if (zR5 || objQ7 == c2565a) {
                    objQ7 = new e23.a() { // from class: b21.n
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            switch (i18) {
                                case 0:
                                    r53.p2 p2Var = nVar.f168044b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.m.a((u21.m) value, null, false, true, 3)));
                                    break;
                                default:
                                    r53.p2 p2Var2 = nVar.f168044b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.m.a((u21.m) value2, null, false, false, 5)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ7);
                }
                t21.i0.a(mVar2, feVar, pVar, aVar3, aVar4, (e23.a) objQ7, mVar, 48);
                return Unit.INSTANCE;
            case 1:
                b63.u uVar = (b63.u) obj;
                b11.k kVar = (b11.k) obj2;
                b11.i iVar = (b11.i) obj3;
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                uVar.getClass();
                iVar.getClass();
                if (!z10.d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    lc.y.l(m0Var, new l4.u0((z10.f0) null, 1, (p005kotlin.jvm.internal.j) null));
                    return Unit.INSTANCE;
                }
                b11.m mVar3 = new b11.m(zBooleanValue, kVar);
                if (iVar instanceof b11.i.c) {
                    lVar = new l4.w0(uVar, ((b11.i.c) iVar).f14315a, mVar3);
                } else if (iVar instanceof b11.i.a) {
                    b11.i.a aVar5 = (b11.i.a) iVar;
                    String str = aVar5.f14295a;
                    if (str == null) {
                        com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.NUTRITION;
                        String str2 = "Cannot edit food log with null logId for foodId: " + aVar5.f14301g.f14253a;
                        aVar6.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.e(a2Var, str2);
                        return Unit.INSTANCE;
                    }
                    lVar = new l4.k(uVar, str, aVar5.f14296b, j11.c.DAILY_LOG, mVar3);
                } else {
                    if (!(iVar instanceof b11.i.b)) {
                        lc.u0.r();
                        return null;
                    }
                    b11.i.b bVar = (b11.i.b) iVar;
                    b11.d dVar = bVar.f14311g;
                    String str3 = bVar.f14305a;
                    if (str3 == null) {
                        com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.NUTRITION;
                        String str4 = "Cannot edit recipe log with null logId for foodId: " + dVar.f14253a;
                        aVar7.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.e(a2Var2, str4);
                        return Unit.INSTANCE;
                    }
                    lVar = new l4.l(uVar, dVar.f14253a, str3, bVar.f14306b, j11.c.DAILY_LOG, mVar3);
                }
                lc.y.l(m0Var, lVar);
                return Unit.INSTANCE;
            case 2:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar2.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                l4.c0 c0Var = (l4.c0) lc.w.a(vVar2, t0Var.b(l4.c0.class));
                boolean zR6 = mVar4.r(c0Var);
                Object objQ8 = mVar4.q();
                if (zR6) {
                    objQ8 = new s4(c0Var, i15);
                    mVar4.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new s4(c0Var, i15);
                        mVar4.K(objQ8);
                    }
                }
                e23.a aVar8 = (e23.a) objQ8;
                mVar4.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar4);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(u21.l.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar8);
                mVar4.R();
                final u21.l lVar2 = (u21.l) u1VarResolveViewModel2;
                p3.p1 p1VarC3 = s9.c.c(lVar2.f168027c, mVar4);
                s21.o oVar2 = ((u21.i) p1VarC3.getF182175a()).f168003d;
                boolean zB2 = mVar4.B(p1VarC3) | mVar4.r(m0Var) | mVar4.r(lVar2);
                Object objQ9 = mVar4.q();
                if (zB2) {
                    objQ9 = new aa(p1VarC3, m0Var, lVar2, null);
                    mVar4.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new aa(p1VarC3, m0Var, lVar2, null);
                        mVar4.K(objQ9);
                    }
                }
                p3.l0.e((e23.p) objQ9, oVar2, mVar4);
                s21.o oVar3 = ((u21.i) p1VarC3.getF182175a()).f168004e;
                boolean zB3 = mVar4.B(p1VarC3) | mVar4.r(m0Var);
                Object objQ10 = mVar4.q();
                if (zB3) {
                    objQ10 = new ba(p1VarC3, m0Var, null);
                    mVar4.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new ba(p1VarC3, m0Var, null);
                        mVar4.K(objQ10);
                    }
                }
                p3.l0.e((e23.p) objQ10, oVar3, mVar4);
                u21.i iVar2 = (u21.i) p1VarC3.getF182175a();
                boolean zR7 = mVar4.r(lVar2);
                Object objQ11 = mVar4.q();
                if (zR7) {
                    objQ11 = new a03.f(lVar2, 28);
                    mVar4.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new a03.f(lVar2, 28);
                        mVar4.K(objQ11);
                    }
                }
                e23.l lVar3 = (e23.l) objQ11;
                boolean zR8 = mVar4.r(lVar2);
                Object objQ12 = mVar4.q();
                if (zR8) {
                    objQ12 = new a61.d(lVar2, 14);
                    mVar4.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new a61.d(lVar2, 14);
                        mVar4.K(objQ12);
                    }
                }
                e23.p pVar2 = (e23.p) objQ12;
                boolean zR9 = mVar4.r(lVar2);
                Object objQ13 = mVar4.q();
                if (zR9) {
                    objQ13 = new e23.a() { // from class: b21.k9
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            Object value4;
                            Object value5;
                            Object value6;
                            switch (i19) {
                                case 0:
                                    r53.p2 p2Var = lVar2.f168026b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                    return Unit.INSTANCE;
                                case 1:
                                    r53.p2 p2Var2 = lVar2.f168026b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                    return Unit.INSTANCE;
                                case 2:
                                    s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                    r53.p2 p2Var3 = lVar2.f168026b;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                    return Unit.INSTANCE;
                                case 3:
                                    r53.p2 p2Var4 = lVar2.f168026b;
                                    do {
                                        value4 = p2Var4.getValue();
                                    } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                    return Unit.INSTANCE;
                                default:
                                    u21.l lVar4 = lVar2;
                                    r53.p2 p2Var5 = lVar4.f168026b;
                                    ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                    int i24 = 0;
                                    if (!arrayListY4.isEmpty()) {
                                        Iterator it = arrayListY4.iterator();
                                        while (it.hasNext()) {
                                            if (((s21.n) it.next()).f156151a && (i24 = i24 + 1) < 0) {
                                                p13.x.p();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i24 < 2) {
                                        do {
                                            value6 = p2Var5.getValue();
                                            c22.x0.f23314a.getClass();
                                        } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                    } else {
                                        s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                        do {
                                            value5 = p2Var5.getValue();
                                        } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar4.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new e23.a() { // from class: b21.k9
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                Object value4;
                                Object value5;
                                Object value6;
                                switch (i19) {
                                    case 0:
                                        r53.p2 p2Var = lVar2.f168026b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        r53.p2 p2Var2 = lVar2.f168026b;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                        return Unit.INSTANCE;
                                    case 2:
                                        s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                        r53.p2 p2Var3 = lVar2.f168026b;
                                        do {
                                            value3 = p2Var3.getValue();
                                        } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                        return Unit.INSTANCE;
                                    case 3:
                                        r53.p2 p2Var4 = lVar2.f168026b;
                                        do {
                                            value4 = p2Var4.getValue();
                                        } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                        return Unit.INSTANCE;
                                    default:
                                        u21.l lVar4 = lVar2;
                                        r53.p2 p2Var5 = lVar4.f168026b;
                                        ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                        int i24 = 0;
                                        if (!arrayListY4.isEmpty()) {
                                            Iterator it = arrayListY4.iterator();
                                            while (it.hasNext()) {
                                                if (((s21.n) it.next()).f156151a && (i24 = i24 + 1) < 0) {
                                                    p13.x.p();
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (i24 < 2) {
                                            do {
                                                value6 = p2Var5.getValue();
                                                c22.x0.f23314a.getClass();
                                            } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                        } else {
                                            s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                            do {
                                                value5 = p2Var5.getValue();
                                            } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar4.K(objQ13);
                    }
                }
                e23.a aVar9 = (e23.a) objQ13;
                boolean zR10 = mVar4.r(lVar2);
                Object objQ14 = mVar4.q();
                if (zR10) {
                    objQ14 = new e23.a() { // from class: b21.k9
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            Object value4;
                            Object value5;
                            Object value6;
                            switch (i18) {
                                case 0:
                                    r53.p2 p2Var = lVar2.f168026b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                    return Unit.INSTANCE;
                                case 1:
                                    r53.p2 p2Var2 = lVar2.f168026b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                    return Unit.INSTANCE;
                                case 2:
                                    s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                    r53.p2 p2Var3 = lVar2.f168026b;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                    return Unit.INSTANCE;
                                case 3:
                                    r53.p2 p2Var4 = lVar2.f168026b;
                                    do {
                                        value4 = p2Var4.getValue();
                                    } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                    return Unit.INSTANCE;
                                default:
                                    u21.l lVar4 = lVar2;
                                    r53.p2 p2Var5 = lVar4.f168026b;
                                    ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                    int i24 = 0;
                                    if (!arrayListY4.isEmpty()) {
                                        Iterator it = arrayListY4.iterator();
                                        while (it.hasNext()) {
                                            if (((s21.n) it.next()).f156151a && (i24 = i24 + 1) < 0) {
                                                p13.x.p();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i24 < 2) {
                                        do {
                                            value6 = p2Var5.getValue();
                                            c22.x0.f23314a.getClass();
                                        } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                    } else {
                                        s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                        do {
                                            value5 = p2Var5.getValue();
                                        } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar4.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new e23.a() { // from class: b21.k9
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                Object value4;
                                Object value5;
                                Object value6;
                                switch (i18) {
                                    case 0:
                                        r53.p2 p2Var = lVar2.f168026b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        r53.p2 p2Var2 = lVar2.f168026b;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                        return Unit.INSTANCE;
                                    case 2:
                                        s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                        r53.p2 p2Var3 = lVar2.f168026b;
                                        do {
                                            value3 = p2Var3.getValue();
                                        } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                        return Unit.INSTANCE;
                                    case 3:
                                        r53.p2 p2Var4 = lVar2.f168026b;
                                        do {
                                            value4 = p2Var4.getValue();
                                        } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                        return Unit.INSTANCE;
                                    default:
                                        u21.l lVar4 = lVar2;
                                        r53.p2 p2Var5 = lVar4.f168026b;
                                        ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                        int i24 = 0;
                                        if (!arrayListY4.isEmpty()) {
                                            Iterator it = arrayListY4.iterator();
                                            while (it.hasNext()) {
                                                if (((s21.n) it.next()).f156151a && (i24 = i24 + 1) < 0) {
                                                    p13.x.p();
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (i24 < 2) {
                                            do {
                                                value6 = p2Var5.getValue();
                                                c22.x0.f23314a.getClass();
                                            } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                        } else {
                                            s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                            do {
                                                value5 = p2Var5.getValue();
                                            } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar4.K(objQ14);
                    }
                }
                e23.a aVar10 = (e23.a) objQ14;
                boolean zR11 = mVar4.r(lVar2);
                Object objQ15 = mVar4.q();
                if (zR11) {
                    objQ15 = new e23.a() { // from class: b21.k9
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            Object value4;
                            Object value5;
                            Object value6;
                            switch (i17) {
                                case 0:
                                    r53.p2 p2Var = lVar2.f168026b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                    return Unit.INSTANCE;
                                case 1:
                                    r53.p2 p2Var2 = lVar2.f168026b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                    return Unit.INSTANCE;
                                case 2:
                                    s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                    r53.p2 p2Var3 = lVar2.f168026b;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                    return Unit.INSTANCE;
                                case 3:
                                    r53.p2 p2Var4 = lVar2.f168026b;
                                    do {
                                        value4 = p2Var4.getValue();
                                    } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                    return Unit.INSTANCE;
                                default:
                                    u21.l lVar4 = lVar2;
                                    r53.p2 p2Var5 = lVar4.f168026b;
                                    ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                    int i24 = 0;
                                    if (!arrayListY4.isEmpty()) {
                                        Iterator it = arrayListY4.iterator();
                                        while (it.hasNext()) {
                                            if (((s21.n) it.next()).f156151a && (i24 = i24 + 1) < 0) {
                                                p13.x.p();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i24 < 2) {
                                        do {
                                            value6 = p2Var5.getValue();
                                            c22.x0.f23314a.getClass();
                                        } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                    } else {
                                        s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                        do {
                                            value5 = p2Var5.getValue();
                                        } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar4.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new e23.a() { // from class: b21.k9
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                Object value4;
                                Object value5;
                                Object value6;
                                switch (i17) {
                                    case 0:
                                        r53.p2 p2Var = lVar2.f168026b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        r53.p2 p2Var2 = lVar2.f168026b;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                        return Unit.INSTANCE;
                                    case 2:
                                        s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                        r53.p2 p2Var3 = lVar2.f168026b;
                                        do {
                                            value3 = p2Var3.getValue();
                                        } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                        return Unit.INSTANCE;
                                    case 3:
                                        r53.p2 p2Var4 = lVar2.f168026b;
                                        do {
                                            value4 = p2Var4.getValue();
                                        } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                        return Unit.INSTANCE;
                                    default:
                                        u21.l lVar4 = lVar2;
                                        r53.p2 p2Var5 = lVar4.f168026b;
                                        ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                        int i24 = 0;
                                        if (!arrayListY4.isEmpty()) {
                                            Iterator it = arrayListY4.iterator();
                                            while (it.hasNext()) {
                                                if (((s21.n) it.next()).f156151a && (i24 = i24 + 1) < 0) {
                                                    p13.x.p();
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (i24 < 2) {
                                            do {
                                                value6 = p2Var5.getValue();
                                                c22.x0.f23314a.getClass();
                                            } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                        } else {
                                            s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                            do {
                                                value5 = p2Var5.getValue();
                                            } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar4.K(objQ15);
                    }
                }
                e23.a aVar11 = (e23.a) objQ15;
                boolean zR12 = mVar4.r(lVar2);
                Object objQ16 = mVar4.q();
                if (zR12) {
                    final int i24 = 3;
                    objQ16 = new e23.a() { // from class: b21.k9
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            Object value4;
                            Object value5;
                            Object value6;
                            switch (i24) {
                                case 0:
                                    r53.p2 p2Var = lVar2.f168026b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                    return Unit.INSTANCE;
                                case 1:
                                    r53.p2 p2Var2 = lVar2.f168026b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                    return Unit.INSTANCE;
                                case 2:
                                    s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                    r53.p2 p2Var3 = lVar2.f168026b;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                    return Unit.INSTANCE;
                                case 3:
                                    r53.p2 p2Var4 = lVar2.f168026b;
                                    do {
                                        value4 = p2Var4.getValue();
                                    } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                    return Unit.INSTANCE;
                                default:
                                    u21.l lVar4 = lVar2;
                                    r53.p2 p2Var5 = lVar4.f168026b;
                                    ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                    int i25 = 0;
                                    if (!arrayListY4.isEmpty()) {
                                        Iterator it = arrayListY4.iterator();
                                        while (it.hasNext()) {
                                            if (((s21.n) it.next()).f156151a && (i25 = i25 + 1) < 0) {
                                                p13.x.p();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i25 < 2) {
                                        do {
                                            value6 = p2Var5.getValue();
                                            c22.x0.f23314a.getClass();
                                        } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                    } else {
                                        s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                        do {
                                            value5 = p2Var5.getValue();
                                        } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar4.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        final int i25 = 3;
                        objQ16 = new e23.a() { // from class: b21.k9
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                Object value4;
                                Object value5;
                                Object value6;
                                switch (i25) {
                                    case 0:
                                        r53.p2 p2Var = lVar2.f168026b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        r53.p2 p2Var2 = lVar2.f168026b;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                        return Unit.INSTANCE;
                                    case 2:
                                        s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                        r53.p2 p2Var3 = lVar2.f168026b;
                                        do {
                                            value3 = p2Var3.getValue();
                                        } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                        return Unit.INSTANCE;
                                    case 3:
                                        r53.p2 p2Var4 = lVar2.f168026b;
                                        do {
                                            value4 = p2Var4.getValue();
                                        } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                        return Unit.INSTANCE;
                                    default:
                                        u21.l lVar4 = lVar2;
                                        r53.p2 p2Var5 = lVar4.f168026b;
                                        ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                        int i26 = 0;
                                        if (!arrayListY4.isEmpty()) {
                                            Iterator it = arrayListY4.iterator();
                                            while (it.hasNext()) {
                                                if (((s21.n) it.next()).f156151a && (i26 = i26 + 1) < 0) {
                                                    p13.x.p();
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (i26 < 2) {
                                            do {
                                                value6 = p2Var5.getValue();
                                                c22.x0.f23314a.getClass();
                                            } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                        } else {
                                            s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                            do {
                                                value5 = p2Var5.getValue();
                                            } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar4.K(objQ16);
                    }
                }
                e23.a aVar12 = (e23.a) objQ16;
                boolean zR13 = mVar4.r(lVar2);
                Object objQ17 = mVar4.q();
                if (zR13) {
                    final int i26 = 4;
                    objQ17 = new e23.a() { // from class: b21.k9
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            Object value3;
                            Object value4;
                            Object value5;
                            Object value6;
                            switch (i26) {
                                case 0:
                                    r53.p2 p2Var = lVar2.f168026b;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                    return Unit.INSTANCE;
                                case 1:
                                    r53.p2 p2Var2 = lVar2.f168026b;
                                    do {
                                        value2 = p2Var2.getValue();
                                    } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                    return Unit.INSTANCE;
                                case 2:
                                    s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                    r53.p2 p2Var3 = lVar2.f168026b;
                                    do {
                                        value3 = p2Var3.getValue();
                                    } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                    return Unit.INSTANCE;
                                case 3:
                                    r53.p2 p2Var4 = lVar2.f168026b;
                                    do {
                                        value4 = p2Var4.getValue();
                                    } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                    return Unit.INSTANCE;
                                default:
                                    u21.l lVar4 = lVar2;
                                    r53.p2 p2Var5 = lVar4.f168026b;
                                    ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                    int i27 = 0;
                                    if (!arrayListY4.isEmpty()) {
                                        Iterator it = arrayListY4.iterator();
                                        while (it.hasNext()) {
                                            if (((s21.n) it.next()).f156151a && (i27 = i27 + 1) < 0) {
                                                p13.x.p();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i27 < 2) {
                                        do {
                                            value6 = p2Var5.getValue();
                                            c22.x0.f23314a.getClass();
                                        } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                    } else {
                                        s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                        do {
                                            value5 = p2Var5.getValue();
                                        } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar4.K(objQ17);
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        final int i27 = 4;
                        objQ17 = new e23.a() { // from class: b21.k9
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                Object value4;
                                Object value5;
                                Object value6;
                                switch (i27) {
                                    case 0:
                                        r53.p2 p2Var = lVar2.f168026b;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.i.a((u21.i) value, null, null, false, null, null, 29)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        r53.p2 p2Var2 = lVar2.f168026b;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, u21.i.a((u21.i) value2, null, null, true, null, null, 27)));
                                        return Unit.INSTANCE;
                                    case 2:
                                        s21.o oVar4 = new s21.o(false, p13.j0.f134944a);
                                        r53.p2 p2Var3 = lVar2.f168026b;
                                        do {
                                            value3 = p2Var3.getValue();
                                        } while (!p2Var3.b(value3, u21.i.a((u21.i) value3, null, null, false, null, oVar4, 11)));
                                        return Unit.INSTANCE;
                                    case 3:
                                        r53.p2 p2Var4 = lVar2.f168026b;
                                        do {
                                            value4 = p2Var4.getValue();
                                        } while (!p2Var4.b(value4, u21.i.a((u21.i) value4, null, null, false, null, null, 27)));
                                        return Unit.INSTANCE;
                                    default:
                                        u21.l lVar4 = lVar2;
                                        r53.p2 p2Var5 = lVar4.f168026b;
                                        ArrayList arrayListY4 = u21.l.y4(((u21.i) p2Var5.getValue()).f168000a);
                                        int i28 = 0;
                                        if (!arrayListY4.isEmpty()) {
                                            Iterator it = arrayListY4.iterator();
                                            while (it.hasNext()) {
                                                if (((s21.n) it.next()).f156151a && (i28 = i28 + 1) < 0) {
                                                    p13.x.p();
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (i28 < 2) {
                                            do {
                                                value6 = p2Var5.getValue();
                                                c22.x0.f23314a.getClass();
                                            } while (!p2Var5.b(value6, u21.i.a((u21.i) value6, null, new u21.e(c22.g2.b(c22.x0.f23695we), c22.g2.b(c22.x0.Gf), 2), false, null, null, 29)));
                                        } else {
                                            s21.o oVarB = s21.o.b(lVar4.f168025a, arrayListY4);
                                            do {
                                                value5 = p2Var5.getValue();
                                            } while (!p2Var5.b(value5, u21.i.a((u21.i) value5, null, null, false, oVarB, null, 23)));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar4.K(objQ17);
                    }
                }
                e23.a aVar13 = (e23.a) objQ17;
                boolean zR14 = mVar4.r(m0Var);
                Object objQ18 = mVar4.q();
                if (zR14) {
                    objQ18 = new aa2.m(m0Var, 16);
                    mVar4.K(objQ18);
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new aa2.m(m0Var, 16);
                        mVar4.K(objQ18);
                    }
                }
                t21.h0.b(iVar2, lVar3, pVar2, aVar9, aVar10, aVar11, aVar12, aVar13, (e23.a) objQ18, mVar4, 0, 0);
                return Unit.INSTANCE;
            case 3:
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar3.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                l90.b bVar2 = ((ca0.b1.r) lc.w.a(vVar3, p005kotlin.jvm.internal.s0.f105811a.b(ca0.b1.r.class))).f26122a;
                ta0.x xVarA = ca0.y0.a(vVar3, m0Var, mVar5);
                boolean zR15 = mVar5.r(m0Var) | mVar5.r(bVar2);
                Object objQ19 = mVar5.q();
                if (zR15) {
                    objQ19 = new ca0.n0(m0Var, bVar2);
                    mVar5.K(objQ19);
                } else {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new ca0.n0(m0Var, bVar2);
                        mVar5.K(objQ19);
                    }
                }
                e23.a aVar14 = (e23.a) objQ19;
                boolean zR16 = mVar5.r(m0Var);
                Object objQ20 = mVar5.q();
                if (zR16) {
                    objQ20 = new aa2.m(m0Var, 24);
                    mVar5.K(objQ20);
                } else {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new aa2.m(m0Var, 24);
                        mVar5.K(objQ20);
                    }
                }
                ta0.g1.c(xVarA, bVar2, aVar14, (e23.a) objQ20, mVar5, 0);
                return Unit.INSTANCE;
            case 4:
                p3.m mVar6 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var4 = p3.n.f135158a;
                boolean zR17 = mVar6.r(m0Var);
                Object objQ21 = mVar6.q();
                if (zR17) {
                    objQ21 = new aa2.m(m0Var, i16);
                    mVar6.K(objQ21);
                } else {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new aa2.m(m0Var, i16);
                        mVar6.K(objQ21);
                    }
                }
                ta0.f0.a((e23.a) objQ21, mVar6, 0);
                return Unit.INSTANCE;
            case 5:
                p3.m mVar7 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var5 = p3.n.f135158a;
                Unit unit = Unit.INSTANCE;
                boolean zR18 = mVar7.r(m0Var);
                Object objQ22 = mVar7.q();
                if (zR18) {
                    objQ22 = new ca0.x1.b(m0Var, null);
                    mVar7.K(objQ22);
                } else {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        objQ22 = new ca0.x1.b(m0Var, null);
                        mVar7.K(objQ22);
                    }
                }
                p3.l0.e((e23.p) objQ22, unit, mVar7);
                return unit;
            case 6:
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar8 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar4.getClass();
                p3.x1 x1Var6 = p3.n.f135158a;
                lc.m0 m0Var3 = this.f15029b;
                kb0.r rVarB = ca0.b4.b(vVar4, m0Var3, mVar8);
                ca0.c4.c cVar = (ca0.c4.c) lc.w.a(vVar4, p005kotlin.jvm.internal.s0.f105811a.b(ca0.c4.c.class));
                p3.p1 p1VarC4 = s9.c.c(rVarB.f103808b, mVar8);
                boolean zB4 = mVar8.B(cVar) | mVar8.r(rVarB) | mVar8.r(m0Var3);
                Object objQ23 = mVar8.q();
                if (zB4) {
                    objQ23 = new ak0.m(cVar, 23, rVarB, m0Var3);
                    mVar8.K(objQ23);
                } else {
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new ak0.m(cVar, 23, rVarB, m0Var3);
                        mVar8.K(objQ23);
                    }
                }
                e23.a aVar15 = (e23.a) objQ23;
                boolean zB5 = mVar8.B(aVar15);
                Object objQ24 = mVar8.q();
                if (zB5) {
                    objQ24 = new ca0.v0(aVar15, 9);
                    mVar8.K(objQ24);
                } else {
                    aVar.getClass();
                    if (objQ24 == p3.m.a.f135155b) {
                        objQ24 = new ca0.v0(aVar15, 9);
                        mVar8.K(objQ24);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ24, mVar8, false);
                b63.v.Companion companion = b63.v.INSTANCE;
                int i28 = ((mb0.f) p1VarC4.getF182175a()).f117731b.f117710a;
                companion.getClass();
                b63.v vVarA = b63.v.Companion.a(i28);
                b63.v vVarA2 = b63.v.Companion.a(((mb0.f) p1VarC4.getF182175a()).f117731b.f117711b);
                boolean z14 = ((mb0.f) p1VarC4.getF182175a()).f117731b.f117714e;
                List<mb0.b> list = ((mb0.f) p1VarC4.getF182175a()).f117731b.f117713d;
                String str5 = ((mb0.f) p1VarC4.getF182175a()).f117734e;
                boolean zR19 = mVar8.r(rVarB);
                Object objQ25 = mVar8.q();
                if (zR19) {
                    objQ25 = new ca0.j3(rVarB);
                    mVar8.K(objQ25);
                } else {
                    aVar.getClass();
                    if (objQ25 == p3.m.a.f135155b) {
                        objQ25 = new ca0.j3(rVarB);
                        mVar8.K(objQ25);
                    }
                }
                k23.g gVar = (k23.g) objQ25;
                boolean zR20 = mVar8.r(rVarB);
                Object objQ26 = mVar8.q();
                if (zR20) {
                    objQ26 = new ca0.k3(rVarB);
                    mVar8.K(objQ26);
                } else {
                    aVar.getClass();
                    if (objQ26 == p3.m.a.f135155b) {
                        objQ26 = new ca0.k3(rVarB);
                        mVar8.K(objQ26);
                    }
                }
                k23.g gVar2 = (k23.g) objQ26;
                boolean zR21 = mVar8.r(rVarB);
                Object objQ27 = mVar8.q();
                if (zR21) {
                    objQ27 = new ca0.l3(rVarB);
                    mVar8.K(objQ27);
                } else {
                    aVar.getClass();
                    if (objQ27 == p3.m.a.f135155b) {
                        objQ27 = new ca0.l3(rVarB);
                        mVar8.K(objQ27);
                    }
                }
                k23.g gVar3 = (k23.g) objQ27;
                boolean zR22 = mVar8.r(rVarB);
                Object objQ28 = mVar8.q();
                if (zR22) {
                    objQ28 = new ca0.m3(rVarB);
                    mVar8.K(objQ28);
                } else {
                    aVar.getClass();
                    if (objQ28 == p3.m.a.f135155b) {
                        objQ28 = new ca0.m3(rVarB);
                        mVar8.K(objQ28);
                    }
                }
                e23.l lVar4 = (e23.l) gVar2;
                e23.l lVar5 = (e23.l) gVar;
                e23.l lVar6 = (e23.l) gVar3;
                e23.a aVar16 = (e23.a) ((k23.g) objQ28);
                boolean zR23 = mVar8.r(rVarB) | mVar8.r(m0Var3) | mVar8.B(cVar) | mVar8.B(p1VarC4);
                Object objQ29 = mVar8.q();
                if (zR23) {
                    af0.e eVar = new af0.e((Object) rVarB, (Object) m0Var3, (Object) cVar, (Object) p1VarC4, 13);
                    mVar8.K(eVar);
                    objQ29 = eVar;
                } else {
                    aVar.getClass();
                    if (objQ29 == p3.m.a.f135155b) {
                        af0.e eVar2 = new af0.e((Object) rVarB, (Object) m0Var3, (Object) cVar, (Object) p1VarC4, 13);
                        mVar8.K(eVar2);
                        objQ29 = eVar2;
                    }
                }
                e23.a aVar17 = (e23.a) objQ29;
                boolean zB6 = mVar8.B(aVar15);
                Object objQ30 = mVar8.q();
                if (zB6) {
                    objQ30 = new ca0.v0(aVar15, 10);
                    mVar8.K(objQ30);
                } else {
                    aVar.getClass();
                    if (objQ30 == p3.m.a.f135155b) {
                        objQ30 = new ca0.v0(aVar15, 10);
                        mVar8.K(objQ30);
                    }
                }
                kb0.c.a(vVarA, vVarA2, list, z14, str5, lVar4, lVar5, lVar6, aVar16, aVar17, (e23.a) objQ30, mVar8, 0, 0);
                return Unit.INSTANCE;
            case 7:
                p3.m mVar9 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                RunningToleranceReportsActivity.a aVar18 = RunningToleranceReportsActivity.f41161b;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var7 = p3.n.f135158a;
                z02.b.a(false, null, null, null, false, z3.f.c(565348797, new j0(m0Var, 12), mVar9), mVar9, 196608, 31);
                return Unit.INSTANCE;
            case 8:
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar10 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                CustomerManagementLibMainActivity.a aVar19 = CustomerManagementLibMainActivity.f50711h;
                ((r1.l) obj).getClass();
                vVar5.getClass();
                p3.x1 x1Var8 = p3.n.f135158a;
                Bundle bundleA = vVar5.f111888h.a();
                String string = bundleA != null ? bundleA.getString("addressId") : null;
                if (string == null) {
                    mVar10.C(1885705672);
                    mVar10.f();
                } else {
                    mVar10.C(1885705673);
                    lj2.f.a(null, this.f15029b, null, string, "AddressesListRoute", mVar10, 24576, 5);
                    mVar10.f();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar11 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                CustomerManagementLibMainActivity.a aVar20 = CustomerManagementLibMainActivity.f50711h;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var9 = p3.n.f135158a;
                boolean zR24 = mVar11.r(m0Var);
                Object objQ31 = mVar11.q();
                if (zR24) {
                    objQ31 = new d7(m0Var, 27);
                    mVar11.K(objQ31);
                } else {
                    aVar.getClass();
                    if (objQ31 == p3.m.a.f135155b) {
                        objQ31 = new d7(m0Var, 27);
                        mVar11.K(objQ31);
                    }
                }
                lj2.i.a(m0Var, null, (e23.l) objQ31, mVar11, 0);
                return Unit.INSTANCE;
            case 10:
                p3.m mVar12 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var10 = p3.n.f135158a;
                boolean zR25 = mVar12.r(m0Var);
                Object objQ32 = mVar12.q();
                if (zR25) {
                    objQ32 = new nk0.l(m0Var, 25);
                    mVar12.K(objQ32);
                } else {
                    aVar.getClass();
                    if (objQ32 == p3.m.a.f135155b) {
                        objQ32 = new nk0.l(m0Var, 25);
                        mVar12.K(objQ32);
                    }
                }
                u72.c.b((e23.a) objQ32, mVar12, 0);
                return Unit.INSTANCE;
            case 11:
                p3.m mVar13 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var11 = p3.n.f135158a;
                boolean zR26 = mVar13.r(m0Var);
                Object objQ33 = mVar13.q();
                if (zR26) {
                    objQ33 = new nk0.l(m0Var, 26);
                    mVar13.K(objQ33);
                } else {
                    aVar.getClass();
                    if (objQ33 == p3.m.a.f135155b) {
                        objQ33 = new nk0.l(m0Var, 26);
                        mVar13.K(objQ33);
                    }
                }
                u72.c.c((e23.a) objQ33, mVar13, 0);
                return Unit.INSTANCE;
            case 12:
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar14 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                int i29 = PromotionsDevMenuActivity.f41027b;
                ((r1.l) obj).getClass();
                vVar6.getClass();
                p3.x1 x1Var12 = p3.n.f135158a;
                z02.d.a(false, z3.f.c(-112067432, new ug2.v(m0Var, i17), mVar14), null, null, null, z3.f.c(1944600340, new wb1.i(i17, m0Var, vVar6), mVar14), mVar14, 196656, 29);
                return Unit.INSTANCE;
            case 13:
                p3.m mVar15 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                RunningEconomyReportsActivity.a aVar21 = RunningEconomyReportsActivity.f41149c;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var13 = p3.n.f135158a;
                z02.b.a(false, null, null, null, false, z3.f.c(-494303474, new ug2.v(m0Var, 6), mVar15), mVar15, 196608, 31);
                return Unit.INSTANCE;
            case 14:
                p3.m mVar16 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var14 = p3.n.f135158a;
                boolean zR27 = mVar16.r(m0Var);
                Object objQ34 = mVar16.q();
                if (zR27) {
                    objQ34 = new yk1.f(m0Var, i18);
                    mVar16.K(objQ34);
                } else {
                    aVar.getClass();
                    if (objQ34 == p3.m.a.f135155b) {
                        objQ34 = new yk1.f(m0Var, i18);
                        mVar16.K(objQ34);
                    }
                }
                e23.l lVar7 = (e23.l) objQ34;
                boolean zR28 = mVar16.r(m0Var);
                Object objQ35 = mVar16.q();
                if (zR28) {
                    objQ35 = new zq0.d.a(m0Var);
                    mVar16.K(objQ35);
                } else {
                    aVar.getClass();
                    if (objQ35 == p3.m.a.f135155b) {
                        objQ35 = new zq0.d.a(m0Var);
                        mVar16.K(objQ35);
                    }
                }
                wq0.k.a(null, lVar7, (e23.a) objQ35, mVar16, 0);
                return Unit.INSTANCE;
            default:
                p3.m mVar17 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                p3.x1 x1Var15 = p3.n.f135158a;
                boolean zR29 = mVar17.r(m0Var);
                Object objQ36 = mVar17.q();
                if (zR29) {
                    objQ36 = new zq0.d.b(m0Var);
                    mVar17.K(objQ36);
                } else {
                    aVar.getClass();
                    if (objQ36 == p3.m.a.f135155b) {
                        objQ36 = new zq0.d.b(m0Var);
                        mVar17.K(objQ36);
                    }
                }
                xq0.b.a((e23.a) objQ36, mVar17, 0);
                return Unit.INSTANCE;
        }
    }
}
