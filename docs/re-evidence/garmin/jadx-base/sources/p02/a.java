package p02;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.l;
import com.garmin.android.apps.connectmobile.R;
import d92.b;
import e23.p;
import f72.kb;
import gl1.y;
import h4.r;
import i3.e5;
import java.util.Locale;
import kg.f;
import l72.s;
import o4.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import ot1.i;
import ov1.o;
import ov1.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s9.c;
import tn.k;
import tn1.d;
import tn1.g;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: p02.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2556a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134651a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.BODY_BATTERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.TRAINING_READINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f134651a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:60:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, d dVar, p<? super m, ? super Integer, Unit> pVar, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        p<? super m, ? super Integer, Unit> pVar2;
        int i16;
        o0 o0Var;
        p<? super m, ? super Integer, Unit> pVar3;
        d dVar2;
        p<? super m, ? super Integer, Unit> pVar4;
        String lowerCase;
        rVar.getClass();
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1918108589);
        int i17 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            i16 = i17 | (o0VarE.r(pVar2) ? 256 : 128);
        }
        int i19 = i16 | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            p<? super m, ? super Integer, Unit> pVar5 = i18 != 0 ? null : pVar2;
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                dVar2 = dVar;
                objQ = new u(dVar2, 3);
                o0VarE.K(objQ);
            } else {
                dVar2 = dVar;
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
            o0VarE.g0(false);
            g gVar = (g) u1VarResolveViewModel;
            if (((Boolean) c.b(gVar.f165520e, Boolean.FALSE, o0VarE, 48).getF182175a()).booleanValue()) {
                o0VarE.C(2128499073);
                s sVar = s.f111232a;
                s62.a.f157643a.getClass();
                u4.d dVarA = kb.a(t62.c.f162799a);
                String strQ = y.Q(o0VarE, R.string.missing_sleep_data_message);
                int i24 = C2556a.f134651a[dVar2.ordinal()];
                if (i24 == 1) {
                    o0VarE.C(1270861232);
                    lowerCase = y.Q(o0VarE, R.string.choose_exp_health).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    o0VarE.g0(false);
                } else if (i24 == 2) {
                    o0VarE.C(1270864464);
                    lowerCase = y.Q(o0VarE, R.string.lbl_fitness).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    o0VarE.g0(false);
                } else if (i24 == 3) {
                    o0VarE.C(1270867568);
                    lowerCase = y.Q(o0VarE, R.string.lbl_performance).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    o0VarE.g0(false);
                } else {
                    if (i24 != 4) {
                        throw f.h(o0VarE, 1270858104, false);
                    }
                    o0VarE.C(742244217);
                    o0VarE.g0(false);
                    lowerCase = "";
                }
                String strP = y.P(R.string.sleep_education_message, new Object[]{lowerCase}, o0VarE);
                String strQ2 = y.Q(o0VarE, R.string.common_learn_more);
                boolean zR = o0VarE.r(gVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new u(gVar, 4);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == c2565a) {
                        objQ2 = new u(gVar, 4);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                boolean z14 = (i19 & 7168) == 2048;
                Object objQ3 = o0VarE.q();
                if (z14) {
                    objQ3 = new o(aVar, 7);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == c2565a) {
                        objQ3 = new o(aVar, 7);
                        o0VarE.K(objQ3);
                    }
                }
                pVar4 = pVar5;
                sVar.c(rVar, dVarA, null, null, strQ, strP, strQ2, false, aVar4, (e23.a) objQ3, o0VarE, i19 & 14, 0, 396);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                pVar4 = pVar5;
                o0Var.C(2129010573);
                if (pVar4 == null) {
                    o0Var.C(2129010572);
                    o0Var.g0(false);
                } else {
                    o0Var.C(761414421);
                    e5.q((i19 >> 6) & 14, pVar4, o0Var, false);
                    Unit unit = Unit.INSTANCE;
                }
                o0Var.g0(false);
            }
            pVar3 = pVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar3 = pVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar, dVar, (p) pVar3, (e23.a) aVar, i14, i15);
        }
    }

    public static final r b(r rVar, m mVar) {
        rVar.getClass();
        x1 x1Var = n.f135158a;
        r rVarE = u1.n.e(rVar, k.a(b.f58623a, mVar), m1.f128891a);
        b.f58625c.getClass();
        return l.y(rVarE, j92.b.f97899b.f97920e);
    }
}
