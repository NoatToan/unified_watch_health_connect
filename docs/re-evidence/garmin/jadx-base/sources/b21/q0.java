package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import java.util.ArrayList;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21.e f15161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity.g f15162d;

    public /* synthetic */ q0(lc.m0 m0Var, NutritionActivity.g gVar, v21.e eVar) {
        this.f15159a = 0;
        this.f15160b = m0Var;
        this.f15162d = gVar;
        this.f15161c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        p3.p1 p1Var;
        p3.p1 p1Var2;
        t13.d dVar;
        int i14 = this.f15159a;
        v21.e eVar = this.f15161c;
        lc.m0 m0Var = this.f15160b;
        NutritionActivity.g gVar = this.f15162d;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                int iB = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                lc.m0 m0Var2 = this.f15160b;
                d1.a(vVar, m0Var2, z3.f.c(-1899558473, new a42.d0((Object) vVar, (Object) m0Var2, (Object) this.f15162d, (Object) this.f15161c, 1), mVar), mVar, ((iB >> 3) & 14) | 384);
                return Unit.INSTANCE;
            case 1:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new fe();
                    mVar2.K(objQ);
                }
                fe feVar = (fe) objQ;
                Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                l4.f fVar = (l4.f) lc.w.a(vVar2, t0Var.b(l4.f.class));
                mVar2.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(f11.m.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), null);
                mVar2.R();
                f11.m mVar3 = (f11.m) u1VarResolveViewModel;
                boolean zR = mVar2.r(fVar);
                Object objQ2 = mVar2.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new a03.e(fVar, 23);
                    mVar2.K(objQ2);
                }
                e23.a aVar = (e23.a) objQ2;
                mVar2.L(-1614864554);
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar2);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(f11.f.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar);
                mVar2.R();
                final f11.f fVar2 = (f11.f) u1VarResolveViewModel2;
                p3.p1 p1VarC = s9.c.c(fVar2.f67922g, mVar2);
                Boolean boolValueOf = Boolean.valueOf(((d11.i) p1VarC.getF182175a()).f57089k);
                boolean zB = mVar2.B(p1VarC) | mVar2.r(fVar);
                lc.m0 m0Var3 = this.f15160b;
                boolean zR2 = zB | mVar2.r(m0Var3) | mVar2.r(fVar2);
                Object objQ3 = mVar2.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new o1(fVar, m0Var3, fVar2, p1VarC, null);
                    p1Var = p1VarC;
                    mVar2.K(objQ3);
                } else {
                    p1Var = p1VarC;
                }
                p3.l0.e((e23.p) objQ3, boolValueOf, mVar2);
                Boolean boolValueOf2 = Boolean.valueOf(((d11.i) p1Var.getF182175a()).f57088j);
                boolean zB2 = mVar2.B(p1Var) | mVar2.r(mVar3) | mVar2.r(m0Var3) | mVar2.r(fVar) | mVar2.r(fVar2);
                Object objQ4 = mVar2.q();
                if (zB2 || objQ4 == c2565a) {
                    p3.p1 p1Var3 = p1Var;
                    p1 p1Var4 = new p1(mVar3, m0Var3, fVar, fVar2, p1Var3, null);
                    fVar = fVar;
                    p1Var2 = p1Var3;
                    mVar2.K(p1Var4);
                    objQ4 = p1Var4;
                } else {
                    p1Var2 = p1Var;
                }
                p3.l0.e((e23.p) objQ4, boolValueOf2, mVar2);
                p3.p1 p1VarN = n23.j.n(vVar2, "recipeIngredientsUpdatedResult", null, mVar2);
                Boolean bool = (Boolean) p1VarN.getF182175a();
                boolean zB3 = mVar2.B(p1VarN) | mVar2.r(fVar2) | mVar2.r(mVar3) | mVar2.r(vVar2);
                Object objQ5 = mVar2.q();
                if (zB3 || objQ5 == c2565a) {
                    dVar = null;
                    q1 q1Var = new q1(fVar2, mVar3, vVar2, p1VarN, null);
                    mVar2.K(q1Var);
                    objQ5 = q1Var;
                } else {
                    dVar = null;
                }
                p3.l0.e((e23.p) objQ5, bool, mVar2);
                p3.p1 p1VarN2 = n23.j.n(vVar2, "standaloneConsumableFoodUpdatedResult", dVar, mVar2);
                b11.v vVar3 = (b11.v) p1VarN2.getF182175a();
                boolean zB4 = mVar2.B(p1VarN2) | mVar2.r(fVar2) | mVar2.r(vVar2);
                Object objQ6 = mVar2.q();
                if (zB4 || objQ6 == c2565a) {
                    objQ6 = new r1(vVar2, p1VarN2, fVar2, dVar);
                    mVar2.K(objQ6);
                }
                p3.l0.e((e23.p) objQ6, vVar3, mVar2);
                d11.i iVar = (d11.i) p1Var2.getF182175a();
                boolean zR3 = mVar2.r(fVar2) | mVar2.r(context);
                Object objQ7 = mVar2.q();
                if (zR3 || objQ7 == c2565a) {
                    objQ7 = new ao1.i(8, fVar2, context);
                    mVar2.K(objQ7);
                }
                e23.a aVar2 = (e23.a) objQ7;
                boolean zB5 = mVar2.B(gVar);
                Object objQ8 = mVar2.q();
                final int i15 = 2;
                if (zB5 || objQ8 == c2565a) {
                    objQ8 = new k0(gVar, 2);
                    mVar2.K(objQ8);
                }
                e23.a aVar3 = (e23.a) objQ8;
                boolean zR4 = mVar2.r(fVar2);
                Object objQ9 = mVar2.q();
                if (zR4 || objQ9 == c2565a) {
                    objQ9 = new e23.l() { // from class: b21.t0
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            d11.i iVar2;
                            ArrayList arrayListY0;
                            Object value2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i15) {
                                case 0:
                                    d11.f fVar3 = (d11.f) obj5;
                                    fVar3.getClass();
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                        iVar2 = (d11.i) value;
                                        arrayListY0 = p13.h0.y0(iVar2.f57082d, fVar3);
                                    } while (!p2Var.b(value, d11.i.a(iVar2, null, null, i53.a.j(arrayListY0), null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 123), null, iVar2.f57086h && !arrayListY0.isEmpty(), false, false, false, null, 3927)));
                                    break;
                                case 1:
                                    List list = (List) obj5;
                                    list.getClass();
                                    y22.x xVar = (y22.x) p13.h0.d0(list);
                                    if (xVar != null) {
                                        r53.p2 p2Var2 = fVar2.f67921f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, d11.i.a((d11.i) value2, null, null, null, null, null, xVar, false, false, false, false, null, 4031)));
                                    }
                                    break;
                                case 2:
                                    String str = (String) obj5;
                                    str.getClass();
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, d11.g.a(iVar3.f57080b, str, null, null, null, null, 30), null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 126), null, false, false, false, false, null, 4061)));
                                    break;
                                case 3:
                                    String str2 = (String) obj5;
                                    str2.getClass();
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, str2, null, null, null, 29), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                case 4:
                                    String str3 = (String) obj5;
                                    str3.getClass();
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, d11.g.a(iVar5.f57080b, null, null, str3, null, null, 27), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj5).intValue();
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    i53.c<g01.c> cVar = ((d11.i) p2Var6.getValue()).f57081c;
                                    g01.c cVar2 = (iIntValue < 0 || iIntValue >= cVar.size()) ? g01.c.SERVING : cVar.get(iIntValue);
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, d11.i.a(iVar6, d11.g.a(iVar6.f57080b, null, null, null, null, cVar2, 15), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ9);
                }
                e23.l lVar = (e23.l) objQ9;
                boolean zR5 = mVar2.r(fVar2);
                Object objQ10 = mVar2.q();
                if (zR5 || objQ10 == c2565a) {
                    final int i16 = 3;
                    objQ10 = new e23.l() { // from class: b21.t0
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            d11.i iVar2;
                            ArrayList arrayListY0;
                            Object value2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i16) {
                                case 0:
                                    d11.f fVar3 = (d11.f) obj5;
                                    fVar3.getClass();
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                        iVar2 = (d11.i) value;
                                        arrayListY0 = p13.h0.y0(iVar2.f57082d, fVar3);
                                    } while (!p2Var.b(value, d11.i.a(iVar2, null, null, i53.a.j(arrayListY0), null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 123), null, iVar2.f57086h && !arrayListY0.isEmpty(), false, false, false, null, 3927)));
                                    break;
                                case 1:
                                    List list = (List) obj5;
                                    list.getClass();
                                    y22.x xVar = (y22.x) p13.h0.d0(list);
                                    if (xVar != null) {
                                        r53.p2 p2Var2 = fVar2.f67921f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, d11.i.a((d11.i) value2, null, null, null, null, null, xVar, false, false, false, false, null, 4031)));
                                    }
                                    break;
                                case 2:
                                    String str = (String) obj5;
                                    str.getClass();
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, d11.g.a(iVar3.f57080b, str, null, null, null, null, 30), null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 126), null, false, false, false, false, null, 4061)));
                                    break;
                                case 3:
                                    String str2 = (String) obj5;
                                    str2.getClass();
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, str2, null, null, null, 29), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                case 4:
                                    String str3 = (String) obj5;
                                    str3.getClass();
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, d11.g.a(iVar5.f57080b, null, null, str3, null, null, 27), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj5).intValue();
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    i53.c<g01.c> cVar = ((d11.i) p2Var6.getValue()).f57081c;
                                    g01.c cVar2 = (iIntValue < 0 || iIntValue >= cVar.size()) ? g01.c.SERVING : cVar.get(iIntValue);
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, d11.i.a(iVar6, d11.g.a(iVar6.f57080b, null, null, null, null, cVar2, 15), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ10);
                }
                e23.l lVar2 = (e23.l) objQ10;
                boolean zR6 = mVar2.r(fVar2);
                Object objQ11 = mVar2.q();
                final int i17 = 4;
                if (zR6 || objQ11 == c2565a) {
                    objQ11 = new e23.l() { // from class: b21.t0
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            d11.i iVar2;
                            ArrayList arrayListY0;
                            Object value2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i17) {
                                case 0:
                                    d11.f fVar3 = (d11.f) obj5;
                                    fVar3.getClass();
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                        iVar2 = (d11.i) value;
                                        arrayListY0 = p13.h0.y0(iVar2.f57082d, fVar3);
                                    } while (!p2Var.b(value, d11.i.a(iVar2, null, null, i53.a.j(arrayListY0), null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 123), null, iVar2.f57086h && !arrayListY0.isEmpty(), false, false, false, null, 3927)));
                                    break;
                                case 1:
                                    List list = (List) obj5;
                                    list.getClass();
                                    y22.x xVar = (y22.x) p13.h0.d0(list);
                                    if (xVar != null) {
                                        r53.p2 p2Var2 = fVar2.f67921f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, d11.i.a((d11.i) value2, null, null, null, null, null, xVar, false, false, false, false, null, 4031)));
                                    }
                                    break;
                                case 2:
                                    String str = (String) obj5;
                                    str.getClass();
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, d11.g.a(iVar3.f57080b, str, null, null, null, null, 30), null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 126), null, false, false, false, false, null, 4061)));
                                    break;
                                case 3:
                                    String str2 = (String) obj5;
                                    str2.getClass();
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, str2, null, null, null, 29), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                case 4:
                                    String str3 = (String) obj5;
                                    str3.getClass();
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, d11.g.a(iVar5.f57080b, null, null, str3, null, null, 27), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj5).intValue();
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    i53.c<g01.c> cVar = ((d11.i) p2Var6.getValue()).f57081c;
                                    g01.c cVar2 = (iIntValue < 0 || iIntValue >= cVar.size()) ? g01.c.SERVING : cVar.get(iIntValue);
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, d11.i.a(iVar6, d11.g.a(iVar6.f57080b, null, null, null, null, cVar2, 15), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ11);
                }
                e23.l lVar3 = (e23.l) objQ11;
                boolean zR7 = mVar2.r(fVar2);
                Object objQ12 = mVar2.q();
                if (zR7 || objQ12 == c2565a) {
                    objQ12 = new a61.d(fVar2, 9);
                    mVar2.K(objQ12);
                }
                e23.p pVar = (e23.p) objQ12;
                boolean zR8 = mVar2.r(fVar2);
                Object objQ13 = mVar2.q();
                final int i18 = 5;
                if (zR8 || objQ13 == c2565a) {
                    objQ13 = new e23.l() { // from class: b21.t0
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            d11.i iVar2;
                            ArrayList arrayListY0;
                            Object value2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i18) {
                                case 0:
                                    d11.f fVar3 = (d11.f) obj5;
                                    fVar3.getClass();
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                        iVar2 = (d11.i) value;
                                        arrayListY0 = p13.h0.y0(iVar2.f57082d, fVar3);
                                    } while (!p2Var.b(value, d11.i.a(iVar2, null, null, i53.a.j(arrayListY0), null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 123), null, iVar2.f57086h && !arrayListY0.isEmpty(), false, false, false, null, 3927)));
                                    break;
                                case 1:
                                    List list = (List) obj5;
                                    list.getClass();
                                    y22.x xVar = (y22.x) p13.h0.d0(list);
                                    if (xVar != null) {
                                        r53.p2 p2Var2 = fVar2.f67921f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, d11.i.a((d11.i) value2, null, null, null, null, null, xVar, false, false, false, false, null, 4031)));
                                    }
                                    break;
                                case 2:
                                    String str = (String) obj5;
                                    str.getClass();
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, d11.g.a(iVar3.f57080b, str, null, null, null, null, 30), null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 126), null, false, false, false, false, null, 4061)));
                                    break;
                                case 3:
                                    String str2 = (String) obj5;
                                    str2.getClass();
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, str2, null, null, null, 29), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                case 4:
                                    String str3 = (String) obj5;
                                    str3.getClass();
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, d11.g.a(iVar5.f57080b, null, null, str3, null, null, 27), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj5).intValue();
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    i53.c<g01.c> cVar = ((d11.i) p2Var6.getValue()).f57081c;
                                    g01.c cVar2 = (iIntValue < 0 || iIntValue >= cVar.size()) ? g01.c.SERVING : cVar.get(iIntValue);
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, d11.i.a(iVar6, d11.g.a(iVar6.f57080b, null, null, null, null, cVar2, 15), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ13);
                }
                e23.l lVar4 = (e23.l) objQ13;
                boolean zR9 = mVar2.r(fVar2);
                Object objQ14 = mVar2.q();
                if (zR9 || objQ14 == c2565a) {
                    objQ14 = new e23.a() { // from class: b21.u0
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            d11.i iVar2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i17) {
                                case 0:
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 4031)));
                                    break;
                                case 1:
                                    r53.p2 p2Var2 = fVar2.f67921f;
                                    do {
                                        value2 = p2Var2.getValue();
                                        iVar2 = (d11.i) value2;
                                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 95), null, false, false, false, false, null, 4063)));
                                    break;
                                case 2:
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 111), null, false, false, false, true, null, 3039)));
                                    break;
                                case 3:
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, null, null, null, null, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                                case 4:
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, null, null, null, null, null, null, !iVar5.f57086h, false, false, false, null, 3967)));
                                    break;
                                default:
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, iVar6.f57082d.size() < 50 ? d11.i.a(iVar6, null, null, null, null, null, null, false, false, true, false, null, 3583) : d11.i.a(iVar6, null, null, null, null, d11.e.a(iVar6.f57084f, false, false, false, true, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ14);
                }
                e23.a aVar4 = (e23.a) objQ14;
                boolean zR10 = mVar2.r(fVar2);
                Object objQ15 = mVar2.q();
                if (zR10 || objQ15 == c2565a) {
                    objQ15 = new e23.a() { // from class: b21.u0
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            d11.i iVar2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i18) {
                                case 0:
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 4031)));
                                    break;
                                case 1:
                                    r53.p2 p2Var2 = fVar2.f67921f;
                                    do {
                                        value2 = p2Var2.getValue();
                                        iVar2 = (d11.i) value2;
                                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 95), null, false, false, false, false, null, 4063)));
                                    break;
                                case 2:
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 111), null, false, false, false, true, null, 3039)));
                                    break;
                                case 3:
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, null, null, null, null, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                                case 4:
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, null, null, null, null, null, null, !iVar5.f57086h, false, false, false, null, 3967)));
                                    break;
                                default:
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, iVar6.f57082d.size() < 50 ? d11.i.a(iVar6, null, null, null, null, null, null, false, false, true, false, null, 3583) : d11.i.a(iVar6, null, null, null, null, d11.e.a(iVar6.f57084f, false, false, false, true, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ15);
                }
                e23.a aVar5 = (e23.a) objQ15;
                boolean zR11 = mVar2.r(fVar2) | mVar2.r(fVar) | mVar2.r(m0Var3);
                Object objQ16 = mVar2.q();
                if (zR11 || objQ16 == c2565a) {
                    objQ16 = new a4.a(fVar2, 10, fVar, m0Var3);
                    mVar2.K(objQ16);
                }
                e23.l lVar5 = (e23.l) objQ16;
                boolean zR12 = mVar2.r(fVar2);
                Object objQ17 = mVar2.q();
                if (zR12 || objQ17 == c2565a) {
                    final int i19 = 0;
                    objQ17 = new e23.l() { // from class: b21.t0
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            d11.i iVar2;
                            ArrayList arrayListY0;
                            Object value2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i19) {
                                case 0:
                                    d11.f fVar3 = (d11.f) obj5;
                                    fVar3.getClass();
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                        iVar2 = (d11.i) value;
                                        arrayListY0 = p13.h0.y0(iVar2.f57082d, fVar3);
                                    } while (!p2Var.b(value, d11.i.a(iVar2, null, null, i53.a.j(arrayListY0), null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 123), null, iVar2.f57086h && !arrayListY0.isEmpty(), false, false, false, null, 3927)));
                                    break;
                                case 1:
                                    List list = (List) obj5;
                                    list.getClass();
                                    y22.x xVar = (y22.x) p13.h0.d0(list);
                                    if (xVar != null) {
                                        r53.p2 p2Var2 = fVar2.f67921f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, d11.i.a((d11.i) value2, null, null, null, null, null, xVar, false, false, false, false, null, 4031)));
                                    }
                                    break;
                                case 2:
                                    String str = (String) obj5;
                                    str.getClass();
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, d11.g.a(iVar3.f57080b, str, null, null, null, null, 30), null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 126), null, false, false, false, false, null, 4061)));
                                    break;
                                case 3:
                                    String str2 = (String) obj5;
                                    str2.getClass();
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, str2, null, null, null, 29), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                case 4:
                                    String str3 = (String) obj5;
                                    str3.getClass();
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, d11.g.a(iVar5.f57080b, null, null, str3, null, null, 27), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj5).intValue();
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    i53.c<g01.c> cVar = ((d11.i) p2Var6.getValue()).f57081c;
                                    g01.c cVar2 = (iIntValue < 0 || iIntValue >= cVar.size()) ? g01.c.SERVING : cVar.get(iIntValue);
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, d11.i.a(iVar6, d11.g.a(iVar6.f57080b, null, null, null, null, cVar2, 15), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ17);
                }
                e23.l lVar6 = (e23.l) objQ17;
                boolean zR13 = mVar2.r(fVar2);
                Object objQ18 = mVar2.q();
                final int i24 = 1;
                if (zR13 || objQ18 == c2565a) {
                    objQ18 = new e23.l() { // from class: b21.t0
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            d11.i iVar2;
                            ArrayList arrayListY0;
                            Object value2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i24) {
                                case 0:
                                    d11.f fVar3 = (d11.f) obj5;
                                    fVar3.getClass();
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                        iVar2 = (d11.i) value;
                                        arrayListY0 = p13.h0.y0(iVar2.f57082d, fVar3);
                                    } while (!p2Var.b(value, d11.i.a(iVar2, null, null, i53.a.j(arrayListY0), null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 123), null, iVar2.f57086h && !arrayListY0.isEmpty(), false, false, false, null, 3927)));
                                    break;
                                case 1:
                                    List list = (List) obj5;
                                    list.getClass();
                                    y22.x xVar = (y22.x) p13.h0.d0(list);
                                    if (xVar != null) {
                                        r53.p2 p2Var2 = fVar2.f67921f;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, d11.i.a((d11.i) value2, null, null, null, null, null, xVar, false, false, false, false, null, 4031)));
                                    }
                                    break;
                                case 2:
                                    String str = (String) obj5;
                                    str.getClass();
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, d11.g.a(iVar3.f57080b, str, null, null, null, null, 30), null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 126), null, false, false, false, false, null, 4061)));
                                    break;
                                case 3:
                                    String str2 = (String) obj5;
                                    str2.getClass();
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, d11.g.a(iVar4.f57080b, null, str2, null, null, null, 29), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                case 4:
                                    String str3 = (String) obj5;
                                    str3.getClass();
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, d11.g.a(iVar5.f57080b, null, null, str3, null, null, 27), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                                default:
                                    int iIntValue = ((Integer) obj5).intValue();
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    i53.c<g01.c> cVar = ((d11.i) p2Var6.getValue()).f57081c;
                                    g01.c cVar2 = (iIntValue < 0 || iIntValue >= cVar.size()) ? g01.c.SERVING : cVar.get(iIntValue);
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, d11.i.a(iVar6, d11.g.a(iVar6.f57080b, null, null, null, null, cVar2, 15), null, null, null, null, null, false, false, false, false, null, 4093)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ18);
                }
                e23.l lVar7 = (e23.l) objQ18;
                boolean zR14 = mVar2.r(fVar2);
                Object objQ19 = mVar2.q();
                if (zR14 || objQ19 == c2565a) {
                    final int i25 = 0;
                    objQ19 = new e23.a() { // from class: b21.u0
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            d11.i iVar2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i25) {
                                case 0:
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 4031)));
                                    break;
                                case 1:
                                    r53.p2 p2Var2 = fVar2.f67921f;
                                    do {
                                        value2 = p2Var2.getValue();
                                        iVar2 = (d11.i) value2;
                                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 95), null, false, false, false, false, null, 4063)));
                                    break;
                                case 2:
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 111), null, false, false, false, true, null, 3039)));
                                    break;
                                case 3:
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, null, null, null, null, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                                case 4:
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, null, null, null, null, null, null, !iVar5.f57086h, false, false, false, null, 3967)));
                                    break;
                                default:
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, iVar6.f57082d.size() < 50 ? d11.i.a(iVar6, null, null, null, null, null, null, false, false, true, false, null, 3583) : d11.i.a(iVar6, null, null, null, null, d11.e.a(iVar6.f57084f, false, false, false, true, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ19);
                }
                e23.a aVar6 = (e23.a) objQ19;
                boolean zR15 = mVar2.r(fVar2);
                Object objQ20 = mVar2.q();
                if (zR15 || objQ20 == c2565a) {
                    objQ20 = new e23.a() { // from class: b21.u0
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            d11.i iVar2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i24) {
                                case 0:
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 4031)));
                                    break;
                                case 1:
                                    r53.p2 p2Var2 = fVar2.f67921f;
                                    do {
                                        value2 = p2Var2.getValue();
                                        iVar2 = (d11.i) value2;
                                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 95), null, false, false, false, false, null, 4063)));
                                    break;
                                case 2:
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 111), null, false, false, false, true, null, 3039)));
                                    break;
                                case 3:
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, null, null, null, null, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                                case 4:
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, null, null, null, null, null, null, !iVar5.f57086h, false, false, false, null, 3967)));
                                    break;
                                default:
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, iVar6.f57082d.size() < 50 ? d11.i.a(iVar6, null, null, null, null, null, null, false, false, true, false, null, 3583) : d11.i.a(iVar6, null, null, null, null, d11.e.a(iVar6.f57084f, false, false, false, true, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ20);
                }
                e23.a aVar7 = (e23.a) objQ20;
                boolean zR16 = mVar2.r(fVar2);
                Object objQ21 = mVar2.q();
                if (zR16 || objQ21 == c2565a) {
                    objQ21 = new e23.a() { // from class: b21.u0
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            d11.i iVar2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i15) {
                                case 0:
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 4031)));
                                    break;
                                case 1:
                                    r53.p2 p2Var2 = fVar2.f67921f;
                                    do {
                                        value2 = p2Var2.getValue();
                                        iVar2 = (d11.i) value2;
                                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 95), null, false, false, false, false, null, 4063)));
                                    break;
                                case 2:
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 111), null, false, false, false, true, null, 3039)));
                                    break;
                                case 3:
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, null, null, null, null, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                                case 4:
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, null, null, null, null, null, null, !iVar5.f57086h, false, false, false, null, 3967)));
                                    break;
                                default:
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, iVar6.f57082d.size() < 50 ? d11.i.a(iVar6, null, null, null, null, null, null, false, false, true, false, null, 3583) : d11.i.a(iVar6, null, null, null, null, d11.e.a(iVar6.f57084f, false, false, false, true, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ21);
                }
                e23.a aVar8 = (e23.a) objQ21;
                boolean zR17 = mVar2.r(fVar2) | mVar2.r(m0Var3);
                Object objQ22 = mVar2.q();
                if (zR17 || objQ22 == c2565a) {
                    objQ22 = new ao1.i(7, fVar2, m0Var3);
                    mVar2.K(objQ22);
                }
                e23.a aVar9 = (e23.a) objQ22;
                boolean zR18 = mVar2.r(fVar2);
                Object objQ23 = mVar2.q();
                if (zR18 || objQ23 == c2565a) {
                    final int i26 = 3;
                    objQ23 = new e23.a() { // from class: b21.u0
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            Object value2;
                            d11.i iVar2;
                            Object value3;
                            d11.i iVar3;
                            Object value4;
                            d11.i iVar4;
                            Object value5;
                            d11.i iVar5;
                            Object value6;
                            d11.i iVar6;
                            switch (i26) {
                                case 0:
                                    r53.p2 p2Var = fVar2.f67921f;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, false, false, false, null, 4031)));
                                    break;
                                case 1:
                                    r53.p2 p2Var2 = fVar2.f67921f;
                                    do {
                                        value2 = p2Var2.getValue();
                                        iVar2 = (d11.i) value2;
                                    } while (!p2Var2.b(value2, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, false, false, 95), null, false, false, false, false, null, 4063)));
                                    break;
                                case 2:
                                    r53.p2 p2Var3 = fVar2.f67921f;
                                    do {
                                        value3 = p2Var3.getValue();
                                        iVar3 = (d11.i) value3;
                                    } while (!p2Var3.b(value3, d11.i.a(iVar3, null, null, null, null, d11.e.a(iVar3.f57084f, false, false, false, false, false, false, false, 111), null, false, false, false, true, null, 3039)));
                                    break;
                                case 3:
                                    r53.p2 p2Var4 = fVar2.f67921f;
                                    do {
                                        value4 = p2Var4.getValue();
                                        iVar4 = (d11.i) value4;
                                    } while (!p2Var4.b(value4, d11.i.a(iVar4, null, null, null, null, d11.e.a(iVar4.f57084f, false, false, false, false, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                                case 4:
                                    r53.p2 p2Var5 = fVar2.f67921f;
                                    do {
                                        value5 = p2Var5.getValue();
                                        iVar5 = (d11.i) value5;
                                    } while (!p2Var5.b(value5, d11.i.a(iVar5, null, null, null, null, null, null, !iVar5.f57086h, false, false, false, null, 3967)));
                                    break;
                                default:
                                    r53.p2 p2Var6 = fVar2.f67921f;
                                    do {
                                        value6 = p2Var6.getValue();
                                        iVar6 = (d11.i) value6;
                                    } while (!p2Var6.b(value6, iVar6.f57082d.size() < 50 ? d11.i.a(iVar6, null, null, null, null, null, null, false, false, true, false, null, 3583) : d11.i.a(iVar6, null, null, null, null, d11.e.a(iVar6.f57084f, false, false, false, true, false, false, false, 119), null, false, false, false, false, null, 4063)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ23);
                }
                e11.x.a(iVar, this.f15161c, feVar, aVar2, aVar3, lVar, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, lVar6, lVar7, aVar6, aVar7, aVar8, aVar9, (e23.a) objQ23, mVar2, 384, 0);
                return Unit.INSTANCE;
            case 2:
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                int iB2 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar4);
                p3.x1 x1Var3 = p3.n.f135158a;
                e5.a(vVar4, m0Var, z3.f.c(-1894806807, new x4(vVar4, eVar, m0Var, gVar), mVar4), mVar4, ((iB2 >> 3) & 14) | 384);
                return Unit.INSTANCE;
            default:
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                int iB3 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar5);
                p3.x1 x1Var4 = p3.n.f135158a;
                e5.a(vVar5, m0Var, z3.f.c(1241486226, new x4(vVar5, m0Var, eVar, gVar), mVar5), mVar5, ((iB3 >> 3) & 14) | 384);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q0(lc.m0 m0Var, v21.e eVar, NutritionActivity.g gVar, int i14) {
        this.f15159a = i14;
        this.f15160b = m0Var;
        this.f15161c = eVar;
        this.f15162d = gVar;
    }
}
