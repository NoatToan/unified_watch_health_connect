package b21;

import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z6 implements e23.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15442c;

    public /* synthetic */ z6(int i14, Object obj, Object obj2) {
        this.f15440a = i14;
        this.f15441b = obj;
        this.f15442c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x022a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0251  */
    /* JADX WARN: Code duplicated, block: B:78:0x026d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0288  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x01.b bVar;
        int i14 = this.f15440a;
        boolean z14 = false;
        Object obj6 = this.f15442c;
        Object obj7 = this.f15441b;
        switch (i14) {
            case 0:
                x01.b bVar2 = (x01.b) obj7;
                v21.e eVar = (v21.e) obj6;
                q21.r rVar = (q21.r) obj;
                q21.q qVar = (q21.q) obj2;
                fe feVar = (fe) obj3;
                p3.m mVar = (p3.m) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                rVar.getClass();
                qVar.getClass();
                feVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                boolean z15 = (((iIntValue & 112) ^ 48) > 32 && mVar.B(qVar)) || (iIntValue & 48) == 32;
                Object objQ = mVar.q();
                p3.m.a aVar = p3.m.f135153a;
                if (z15) {
                    objQ = new a7(qVar, 1);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a7(qVar, 1);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.p.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar2);
                mVar.R();
                u21.p pVar = (u21.p) u1VarResolveViewModel;
                p3.p1 p1VarC = s9.c.c(pVar.f168093l, mVar);
                Boolean boolValueOf = Boolean.valueOf(((u21.o) p1VarC.getF182175a()).f168050d);
                boolean zB = mVar.B(p1VarC) | mVar.r(rVar) | mVar.r(pVar) | mVar.B(bVar2);
                Object objQ2 = mVar.q();
                if (zB) {
                    bVar = bVar2;
                    c8 c8Var = new c8(rVar, pVar, bVar, p1VarC, null);
                    mVar.K(c8Var);
                    objQ2 = c8Var;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        bVar = bVar2;
                        c8 c8Var2 = new c8(rVar, pVar, bVar, p1VarC, null);
                        mVar.K(c8Var2);
                        objQ2 = c8Var2;
                    } else {
                        bVar = bVar2;
                    }
                }
                p3.l0.e((e23.p) objQ2, boolValueOf, mVar);
                Integer num = ((u21.o) p1VarC.getF182175a()).f168053g;
                boolean zB2 = mVar.B(p1VarC) | mVar.r(rVar) | mVar.r(pVar);
                Object objQ3 = mVar.q();
                if (zB2) {
                    objQ3 = new d8(p1VarC, rVar, pVar, 0);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new d8(p1VarC, rVar, pVar, 0);
                        mVar.K(objQ3);
                    }
                }
                p3.l0.e((e23.p) objQ3, num, mVar);
                Boolean boolValueOf2 = Boolean.valueOf(((u21.o) p1VarC.getF182175a()).f168051e);
                boolean zB3 = mVar.B(p1VarC) | mVar.r(rVar) | mVar.r(pVar) | mVar.B(bVar);
                Object objQ4 = mVar.q();
                if (zB3) {
                    e8 e8Var = new e8(rVar, pVar, bVar, p1VarC, null);
                    mVar.K(e8Var);
                    objQ4 = e8Var;
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        e8 e8Var2 = new e8(rVar, pVar, bVar, p1VarC, null);
                        mVar.K(e8Var2);
                        objQ4 = e8Var2;
                    }
                }
                p3.l0.e((e23.p) objQ4, boolValueOf2, mVar);
                u21.o oVar = (u21.o) p1VarC.getF182175a();
                boolean zR = mVar.r(pVar);
                Object objQ5 = mVar.q();
                int i15 = 2;
                if (zR) {
                    objQ5 = new f(pVar, i15);
                    mVar.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new f(pVar, i15);
                        mVar.K(objQ5);
                    }
                }
                e23.a aVar3 = (e23.a) objQ5;
                boolean zR2 = mVar.r(pVar);
                Object objQ6 = mVar.q();
                int i16 = 3;
                if (zR2) {
                    objQ6 = new f(pVar, i16);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new f(pVar, i16);
                        mVar.K(objQ6);
                    }
                }
                e23.a aVar4 = (e23.a) objQ6;
                boolean zR3 = mVar.r(pVar);
                Object objQ7 = mVar.q();
                if (zR3) {
                    objQ7 = new g(pVar, 2);
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new g(pVar, 2);
                        mVar.K(objQ7);
                    }
                }
                t21.j0.a(oVar, R.string.lbl_save, eVar, feVar, aVar3, aVar4, (e23.p) objQ7, bVar, mVar, (iIntValue << 3) & 7168);
                return Unit.INSTANCE;
            default:
                tj1.e eVar2 = (tj1.e) obj7;
                pj1.s sVar = (pj1.s) obj6;
                androidx.lifecycle.y0<w61.f<o13.p<Integer, Integer>>> y0Var = sVar.L0;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                ((Boolean) obj4).getClass();
                boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                int i17 = pj1.s.f137969j1;
                Integer numValueOf = Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety);
                Integer numValueOf2 = Integer.valueOf(R.string.lte_exit_safety_features);
                if ((eVar2 != null ? p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE) : false) && zBooleanValue && zBooleanValue2) {
                    z14 = true;
                } else {
                    if ((eVar2 != null ? p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.FALSE) : false) && zBooleanValue) {
                        z14 = true;
                    } else {
                        if (eVar2 != null ? p005kotlin.jvm.internal.s.g(eVar2.getAssistancePlusEnabled(), Boolean.TRUE) : false) {
                            if (zBooleanValue3 && zBooleanValue && !zBooleanValue2) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, Integer.valueOf(R.string.lte_assistance_contact_assistance_plus))));
                            } else if (!zBooleanValue) {
                                sVar.a5(false);
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, numValueOf)));
                            } else if (zBooleanValue3) {
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, numValueOf)));
                            } else {
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SAFETY_FEATURES;
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "SafetyFeaturesViewModel", "verifyAllFields(), assistancePlusEnabled why are we here? ");
                            }
                        } else if (zBooleanValue) {
                            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SAFETY_FEATURES;
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "SafetyFeaturesViewModel", "verifyAllFields(), why are we here? ");
                        } else {
                            y0Var.m(new w61.f<>(new o13.p(numValueOf2, Integer.valueOf(R.string.lte_exit_info_assistance_contact_safety_features))));
                        }
                    }
                }
                return Boolean.valueOf(z14);
        }
    }
}
