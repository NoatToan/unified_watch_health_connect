package b21;

import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l9 implements e23.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f15024d;

    public /* synthetic */ l9(lc.v vVar, lc.m0 m0Var, e23.a aVar, int i14) {
        this.f15021a = i14;
        this.f15022b = vVar;
        this.f15023c = m0Var;
        this.f15024d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x032a  */
    /* JADX WARN: Code duplicated, block: B:106:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee A[LOOP:0: B:16:0x007e->B:39:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Code duplicated, block: B:67:0x01df  */
    /* JADX WARN: Code duplicated, block: B:92:0x0271  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.u
    public final Object m(androidx.lifecycle.u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, Integer num) {
        p3.m.a aVar;
        fe feVar;
        int i14;
        int i15;
        boolean z14;
        p3.p1 p1Var;
        String str;
        l01.d dVar;
        String str2;
        Object next;
        int i16 = this.f15021a;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj5 = this.f15024d;
        lc.v vVar = this.f15022b;
        switch (i16) {
            case 0:
                Object obj6 = (x01.b) obj5;
                s21.a0 a0Var = (s21.a0) obj;
                a0Var.getClass();
                ((e23.l) obj2).getClass();
                ((e23.a) obj3).getClass();
                ((fe) obj4).getClass();
                p3.x1 x1Var = p3.n.f135158a;
                Object obj7 = (l4.j0) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(l4.j0.class));
                boolean zG = p005kotlin.jvm.internal.s.g(a0Var.f156037b, Boolean.TRUE);
                boolean zR = mVar.r(a0Var);
                Object obj8 = this.f15023c;
                boolean zR2 = zR | mVar.r(obj8) | mVar.r(obj7) | mVar.B(obj6);
                Object objQ = mVar.q();
                if (zR2) {
                    Object eVar = new af0.e(a0Var, obj8, obj7, obj6, 7);
                    mVar.K(eVar);
                    objQ = eVar;
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        Object eVar2 = new af0.e(a0Var, obj8, obj7, obj6, 7);
                        mVar.K(eVar2);
                        objQ = eVar2;
                    }
                }
                t21.r0.b(zG, (e23.a) objQ, mVar, 0);
                return Unit.INSTANCE;
            default:
                NutritionActivity.f fVar = (NutritionActivity.f) obj5;
                u21.u0 u0Var = (u21.u0) u1Var;
                s21.a0 a0Var2 = (s21.a0) obj;
                Object obj9 = (e23.l) obj2;
                fe feVar2 = (fe) obj4;
                int iIntValue = num.intValue();
                a0Var2.getClass();
                obj9.getClass();
                ((e23.a) obj3).getClass();
                feVar2.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                if (a0Var2.f156060y) {
                    mVar.C(-727534160);
                    a.f14484a.getClass();
                    g02.s0.a(null, true, a.f14486c, mVar, 432, 1);
                    mVar.f();
                } else {
                    mVar.C(-727314990);
                    l4.o0 o0Var = (l4.o0) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(l4.o0.class));
                    boolean z15 = o0Var.f14942b;
                    l01.k kVar = o0Var.f14943c;
                    if (z15) {
                        String str3 = kVar != null ? kVar.f107888k : null;
                        String str4 = kVar != null ? kVar.f107889l : null;
                        r53.p2 p2Var = u0Var.f168159j;
                        while (true) {
                            Object value = p2Var.getValue();
                            s21.t tVar = (s21.t) value;
                            Map<String, String> map = ((s21.t) p2Var.getValue()).f156173b;
                            if (map == null || (str = map.get(str4)) == null) {
                                str = tVar.f156172a;
                            }
                            List<l01.d> list = ((s21.t) p2Var.getValue()).f156175d;
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        aVar = aVar2;
                                        if (!p005kotlin.jvm.internal.s.g(((l01.d) next).f107844a, str3)) {
                                            aVar2 = aVar;
                                        }
                                    } else {
                                        aVar = aVar2;
                                        next = null;
                                    }
                                }
                                l01.d dVar2 = (l01.d) next;
                                if (dVar2 != null) {
                                    dVar = dVar2;
                                }
                                str2 = str4;
                                if (p2Var.b(value, new s21.t(str, tVar.f156173b, dVar, tVar.f156175d))) {
                                } else {
                                    str4 = str2;
                                    aVar2 = aVar;
                                }
                            } else {
                                aVar = aVar2;
                            }
                            dVar = tVar.f156174c;
                            str2 = str4;
                            if (p2Var.b(value, new s21.t(str, tVar.f156173b, dVar, tVar.f156175d))) {
                            } else {
                                str4 = str2;
                                aVar2 = aVar;
                            }
                        }
                    } else {
                        aVar = aVar2;
                    }
                    boolean zR3 = mVar.r(u0Var);
                    Object objQ2 = mVar.q();
                    if (zR3) {
                        objQ2 = new u8(u0Var, 2);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new u8(u0Var, 2);
                            mVar.K(objQ2);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ2;
                    mVar.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.j0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar3);
                    mVar.R();
                    u21.j0 j0Var = (u21.j0) u1VarResolveViewModel;
                    p3.p1 p1VarC = s9.c.c(j0Var.f168017e, mVar);
                    String strQ = gl1.y.Q(mVar, R.string.generic_error_message);
                    Boolean boolValueOf = Boolean.valueOf(((s21.u) p1VarC.getF182175a()).f156177b);
                    boolean zB = mVar.B(p1VarC) | ((((57344 & iIntValue) ^ 24576) > 16384 && mVar.B(feVar2)) || (iIntValue & 24576) == 16384) | mVar.B(strQ) | mVar.r(j0Var);
                    Object objQ3 = mVar.q();
                    if (zB) {
                        objQ3 = new ha(feVar2, strQ, j0Var, p1VarC, null);
                        feVar = feVar2;
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ha(feVar2, strQ, j0Var, p1VarC, null);
                            feVar = feVar2;
                            mVar.K(objQ3);
                        } else {
                            feVar = feVar2;
                        }
                    }
                    p3.l0.e((e23.p) objQ3, boolValueOf, mVar);
                    Boolean boolValueOf2 = Boolean.valueOf(((s21.u) p1VarC.getF182175a()).f156178c);
                    boolean zB2 = mVar.B(p1VarC);
                    lc.m0 m0Var = this.f15023c;
                    boolean zR4 = zB2 | mVar.r(m0Var) | mVar.r(j0Var) | mVar.B(fVar);
                    Object objQ4 = mVar.q();
                    if (zR4) {
                        objQ4 = new ia(m0Var, j0Var, fVar, p1VarC, null);
                        mVar.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ia(m0Var, j0Var, fVar, p1VarC, null);
                            mVar.K(objQ4);
                        }
                    }
                    p3.l0.e((e23.p) objQ4, boolValueOf2, mVar);
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_region_and_language);
                    if (z15) {
                        i14 = 2054816391;
                        i15 = R.string.lbl_save;
                    } else {
                        i14 = 2054817639;
                        i15 = R.string.lbl_next;
                    }
                    String strH = sn.a.h(mVar, i14, i15, mVar);
                    boolean z16 = ((s21.u) p1VarC.getF182175a()).f156176a;
                    j53.j jVarB = j53.l.b();
                    i53.h<s21.z> hVarA4 = u0Var.A4();
                    s21.v vVar2 = (((s21.u) p1VarC.getF182175a()).f156179d == null || ((s21.u) p1VarC.getF182175a()).f156182g == null) ? s21.v.DISABLED : s21.v.ENABLED;
                    boolean zR5 = ((((iIntValue & 896) ^ 384) > 256 && mVar.B(obj9)) || (iIntValue & 384) == 256) | mVar.r(u0Var) | mVar.B(p1VarC) | mVar.h(z15) | mVar.r(j0Var);
                    Object objQ5 = mVar.q();
                    if (zR5) {
                        z14 = z15;
                        Object o9Var = new o9(u0Var, z14, j0Var, obj9, p1VarC, 0);
                        p1Var = p1VarC;
                        mVar.K(o9Var);
                        objQ5 = o9Var;
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            z14 = z15;
                            Object o9Var2 = new o9(u0Var, z14, j0Var, obj9, p1VarC, 0);
                            p1Var = p1VarC;
                            mVar.K(o9Var2);
                            objQ5 = o9Var2;
                        } else {
                            z14 = z15;
                            p1Var = p1VarC;
                        }
                    }
                    t21.d1.a(strQ2, feVar, m0Var, strH, z16, false, jVarB, null, (e23.a) objQ5, vVar2, hVarA4, false, null, fVar, z3.f.c(1715505337, new p9(z14, j0Var, p1Var, 0), mVar), mVar, ((iIntValue >> 9) & 112) | 3866624, 24576, 6272);
                    mVar.f();
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                return Unit.INSTANCE;
        }
    }
}
