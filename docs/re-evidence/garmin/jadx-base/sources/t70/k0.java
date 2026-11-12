package t70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import kotlin.t1;
import l72.i3;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;
import s70.j1;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162900a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f162900a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(l0 l0Var, e23.a aVar, p3.m mVar, int i14) {
        l0 l0Var2;
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(2018737061);
        int i16 = i14 | 2 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(l0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                i15 = i16 & (-15);
                l0Var2 = (l0) u1VarResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i16 & (-15);
                l0Var2 = l0Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.booleanValue();
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new u(aVar, p1Var2, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, bool, o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(l0Var2);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new sg0.j(l0Var2, 12, p1Var, p1Var2);
                o0VarE.K(objQ4);
            }
            c.w.a(0, 0, (e23.a) objQ4, o0VarE, zBooleanValue);
            p1 p1VarB = s9.c.b(l0Var2.f162911h, Boolean.FALSE, o0VarE, 48);
            String strQ = gl1.y.Q(o0VarE, R.string.title_edit_in_focus);
            b3.b.f15502a.getClass();
            u4.d dVarA = d3.h.a();
            i3 i3Var = new i3("MenuSave", gl1.y.Q(o0VarE, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
            boolean zBooleanValue2 = ((Boolean) p1VarB.getF182175a()).booleanValue();
            boolean zR2 = o0VarE.r(l0Var2);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new s70.b0(l0Var2, 20);
                o0VarE.K(objQ5);
            }
            og.a.k(strQ, i3Var, zBooleanValue2, dVarA, aVar, (e23.l) objQ5, z3.f.c(-1116522752, new ng2.i(l0Var2, 25, p1Var, p1Var2), o0VarE), o0VarE, ((i15 << 9) & 57344) | 1572928, 0);
        } else {
            o0VarE.e();
            l0Var2 = l0Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(l0Var2, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x013d  */
    /* JADX WARN: Code duplicated, block: B:55:0x019c  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x022c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0249  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(l0 l0Var, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-590553489);
        int i16 = (o0VarE.r(l0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            p1 p1VarB = s9.c.b(l0Var.f162907d, p13.j0.f134944a, o0VarE, 48);
            p1 p1VarB2 = s9.c.b(l0Var.f162909f, null, o0VarE, 48);
            r53.p2 p2Var = l0Var.f162913j;
            Boolean bool = Boolean.FALSE;
            p1 p1VarB3 = s9.c.b(p2Var, bool, o0VarE, 48);
            p1 p1VarB4 = s9.c.b(l0Var.f162915l, bool, o0VarE, 48);
            p1 p1VarB5 = s9.c.b(l0Var.f162917n, bool, o0VarE, 48);
            g3 g3Var = (g3) p1VarB2.getF182175a();
            fw.p pVar = g3Var != null ? g3Var.f35300a : null;
            int i17 = pVar == null ? -1 : a.f162900a[pVar.ordinal()];
            p3.m.a aVar2 = p3.m.f135153a;
            if (i17 == 1) {
                o0VarE.C(-586194058);
                Unit unit = Unit.INSTANCE;
                Object objQ = o0VarE.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(aVar, null);
                    o0VarE.K(objQ);
                }
                p3.l0.e((e23.p) objQ, unit, o0VarE);
                o0VarE.g0(false);
            } else if (i17 != 2) {
                o0VarE.C(-991823375);
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
            } else {
                o0VarE.C(-586190440);
                Unit unit3 = Unit.INSTANCE;
                boolean zR = o0VarE.r(context) | o0VarE.r(l0Var);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new w(context, l0Var, aVar, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new w(context, l0Var, aVar, null);
                        o0VarE.K(objQ2);
                    }
                }
                p3.l0.e((e23.p) objQ2, unit3, o0VarE);
                o0VarE.g0(false);
            }
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            boolean zR2 = o0VarE.r(l0Var);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new j0(l0Var, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new j0(l0Var, null);
                    o0VarE.K(objQ3);
                }
            }
            j02.h0 h0VarB = j02.d0.b(i0VarA, (e23.r) objQ3, o0VarE);
            boolean zB = o0VarE.B(p1VarB) | o0VarE.B(h0VarB) | o0VarE.r(l0Var) | o0VarE.i(f75992b);
            Object objQ4 = o0VarE.q();
            if (zB) {
                io0.a aVar3 = new io0.a(f75992b, 2, p1VarB, h0VarB, l0Var);
                o0VarE.K(aVar3);
                objQ4 = aVar3;
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    io0.a aVar4 = new io0.a(f75992b, 2, p1VarB, h0VarB, l0Var);
                    o0VarE.K(aVar4);
                    objQ4 = aVar4;
                }
            }
            e23.l lVar = (e23.l) objQ4;
            i15 = 0;
            e2.c.b(null, i0VarA, null, null, null, null, false, null, lVar, o0VarE, 0, 509);
            o0VarE = o0VarE;
            if (((Boolean) p1VarB3.getF182175a()).booleanValue()) {
                o0VarE.C(-985338516);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.title_one_stat_required);
                String strQ2 = gl1.y.Q(o0VarE, R.string.msg_one_stat_required);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean zR3 = o0VarE.r(l0Var);
                Object objQ5 = o0VarE.q();
                if (zR3) {
                    objQ5 = new s(l0Var, 2);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new s(l0Var, 2);
                        o0VarE.K(objQ5);
                    }
                }
                e23.a<Unit> aVar5 = (e23.a) objQ5;
                boolean zR4 = o0VarE.r(l0Var);
                Object objQ6 = o0VarE.q();
                if (zR4) {
                    objQ6 = new s(l0Var, 3);
                    o0VarE.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new s(l0Var, 3);
                        o0VarE.K(objQ6);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, null, (e23.a) objQ6, o0VarE, 6, 0, 728);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-984870509);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB4.getF182175a()).booleanValue()) {
                o0VarE.C(-984825001);
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_stat_limit_reached);
                String strP = gl1.y.P(R.string.msg_stat_limit_reached, new Object[]{6}, o0VarE);
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean zR5 = o0VarE.r(l0Var);
                Object objQ7 = o0VarE.q();
                if (zR5) {
                    objQ7 = new s(l0Var, 4);
                    o0VarE.K(objQ7);
                } else {
                    aVar2.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new s(l0Var, 4);
                        o0VarE.K(objQ7);
                    }
                }
                e23.a<Unit> aVar6 = (e23.a) objQ7;
                boolean zR6 = o0VarE.r(l0Var);
                Object objQ8 = o0VarE.q();
                if (zR6) {
                    objQ8 = new s(l0Var, 0);
                    o0VarE.K(objQ8);
                } else {
                    aVar2.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new s(l0Var, 0);
                        o0VarE.K(objQ8);
                    }
                }
                p3.o0 o0Var = o0VarE;
                c1Var2.a(false, strQ4, strP, null, null, strQ5, false, false, aVar6, null, (e23.a) objQ8, o0Var, 6, 0, 728);
                o0VarE = o0Var;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-984336813);
                o0VarE.g0(false);
            }
            if (((Boolean) p1VarB5.getF182175a()).booleanValue()) {
                o0VarE.C(-984259747);
                l72.c1 c1Var3 = l72.c1.f110940a;
                String strQ6 = gl1.y.Q(o0VarE, R.string.save_strategy_details_confirmation_title);
                String strQ7 = gl1.y.Q(o0VarE, R.string.msg_training_exit_plan_info);
                String strG = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_common_continue));
                String strG2 = sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_close));
                boolean zR7 = o0VarE.r(l0Var);
                Object objQ9 = o0VarE.q();
                if (zR7) {
                    objQ9 = new j1(24, l0Var, aVar);
                    o0VarE.K(objQ9);
                } else {
                    aVar2.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new j1(24, l0Var, aVar);
                        o0VarE.K(objQ9);
                    }
                }
                e23.a<Unit> aVar7 = (e23.a) objQ9;
                boolean zR8 = o0VarE.r(l0Var);
                Object objQ10 = o0VarE.q();
                if (zR8) {
                    objQ10 = new s(l0Var, 1);
                    o0VarE.K(objQ10);
                } else {
                    aVar2.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new s(l0Var, 1);
                        o0VarE.K(objQ10);
                    }
                }
                p3.o0 o0Var2 = o0VarE;
                c1Var3.a(false, strQ6, strQ7, null, null, strG, false, false, aVar7, strG2, (e23.a) objQ10, o0Var2, 6, 0, 216);
                o0VarE = o0Var2;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-983586861);
                o0VarE.g0(false);
            }
        } else {
            i15 = 0;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(l0Var, aVar, i14, i15);
        }
    }
}
