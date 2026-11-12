package et;

import a03.n0;
import a42.z;
import am.l1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import gl1.y;
import i3.e9;
import i3.mc;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l72.c1;
import o53.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:102:0x0260  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final zs.c cVar, e23.l lVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        String str;
        mc mcVar;
        boolean z14;
        boolean z15;
        int i15;
        boolean z16;
        int i16;
        Object value;
        ys.b bVar;
        int iIntValue;
        List<vs.c> list;
        Object next;
        Integer num;
        e23.a aVar3 = aVar;
        lVar.getClass();
        aVar3.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1351541780);
        int i17 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(cVar.f206792h, o0VarE);
            bt.a aVar4 = new bt.a(new l22.a(context));
            p1 p1VarC2 = s9.c.c(cVar.f206795k, o0VarE);
            vs.d dVar = (vs.d) p1VarC2.getF182175a();
            if (dVar == null || (str = dVar.f179703a) == null) {
                str = "";
            }
            Object[] objArr = new Object[0];
            boolean zB = o0VarE.B(p1VarC);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zB) {
                objQ = new by1.h(p1VarC, 1);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new by1.h(p1VarC, 1);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object objQ2 = o0VarE.q();
            aVar5.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a11.m(p1Var2, 25);
                o0VarE.K(objQ3);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ3, o0VarE, 54, 0);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0 b0Var = (b0) objQ4;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                mcVar = mcVarF;
                objQ5 = new n0(b0Var, mcVar, p1Var2, p1Var, 28);
                o0VarE.K(objQ5);
            } else {
                mcVar = mcVarF;
            }
            final e23.l lVar2 = (e23.l) objQ5;
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.getClass();
            boolean zB2 = o0VarE.B(p1Var);
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                objQ6 = new i(p1Var, p1Var2, null);
                o0VarE.K(objQ6);
            }
            l0.e((e23.p) objQ6, bool, o0VarE);
            vs.a aVar6 = ((ys.b) p1VarC.getF182175a()).f199162d;
            boolean zG = s.g(aVar6 != null ? aVar6.f179693b : null, ys.a.c.f199154a);
            boolean zB3 = ((i17 & 112) == 32) | o0VarE.B(p1VarC);
            Object objQ7 = o0VarE.q();
            if (zB3 || objQ7 == c2565a) {
                objQ7 = new a51.k(lVar, p1VarC, 26);
                o0VarE.K(objQ7);
            }
            final int i18 = 0;
            w.a(0, 0, (e23.a) objQ7, o0VarE, zG);
            vs.d dVar2 = (vs.d) p1VarC2.getF182175a();
            xs.c cVar2 = dVar2 != null ? dVar2.f179705c : null;
            z3.e eVarC = z3.f.c(-838808406, new h(str, lVar, p1VarC, aVar2), o0VarE);
            String str2 = str;
            z3.e eVarC2 = z3.f.c(1782206701, new z(p1Var, cVar, aVar4, p1VarC, str, 29), o0VarE);
            int i19 = i17 & 896;
            at.c.a(cVar2 instanceof xs.c.b, false, aVar3, eVarC, null, eVarC2, o0VarE, 1575936 | i19, 50);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                vs.d dVar3 = (vs.d) p1VarC2.getF182175a();
                if ((dVar3 != null ? dVar3.f179705c : null) instanceof xs.c.a) {
                    o0VarE.C(1751768506);
                    vs.e eVar = ((ys.b) p1VarC.getF182175a()).f199161c;
                    if (eVar == null) {
                        o0VarE.C(-1529751161);
                        o0VarE.g0(false);
                        z14 = true;
                    } else {
                        o0VarE.C(-1529751160);
                        vs.a aVar7 = ((ys.b) p1VarC.getF182175a()).f199162d;
                        if (aVar7 == null || (list = aVar7.f179694c) == null) {
                            iIntValue = 0;
                        } else {
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((vs.c) next).f179700a != vs.b.TIMESTAMP);
                            vs.c cVar3 = (vs.c) next;
                            if (cVar3 == null || (num = cVar3.f179702c) == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = num.intValue();
                            }
                        }
                        o13.p pVarA = aVar4.a(iIntValue, y.Q(o0VarE, R.string.run_options_timer));
                        boolean zB4 = o0VarE.B(lVar2) | o0VarE.r(cVar);
                        Object objQ8 = o0VarE.q();
                        if (zB4 || objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e23.a() { // from class: et.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            lVar2.invoke(new dt.d(cVar, 3));
                                            break;
                                        default:
                                            lVar2.invoke(new dt.d(cVar, 2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ8);
                        }
                        e23.a aVar8 = (e23.a) objQ8;
                        boolean zB5 = o0VarE.B(lVar2) | o0VarE.r(cVar);
                        Object objQ9 = o0VarE.q();
                        if (zB5 || objQ9 == p3.m.a.f135155b) {
                            final int i24 = 1;
                            objQ9 = new e23.a() { // from class: et.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            lVar2.invoke(new dt.d(cVar, 3));
                                            break;
                                        default:
                                            lVar2.invoke(new dt.d(cVar, 2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ9);
                        }
                        e23.a aVar9 = (e23.a) objQ9;
                        boolean zR2 = o0VarE.r(cVar);
                        Object objQ10 = o0VarE.q();
                        if (zR2 || objQ10 == p3.m.a.f135155b) {
                            z14 = true;
                            objQ10 = new dt.d(cVar, 1);
                            o0VarE.K(objQ10);
                        } else {
                            z14 = true;
                        }
                        at.e.b(mcVar, eVar, pVarA, aVar8, aVar9, (e23.a) objQ10, o0VarE, 0);
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    aVar = aVar;
                    z14 = true;
                    o0VarE.C(-1528939890);
                    o0VarE.g0(false);
                }
            } else {
                aVar = aVar;
                z14 = true;
                o0VarE.C(-1528939890);
                o0VarE.g0(false);
            }
            if (((ys.b) p1VarC.getF182175a()).f199159a) {
                o0VarE.C(-1528861522);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.lbl_discard_activity_question_mark);
                String strQ2 = y.Q(o0VarE, R.string.msg_discard_activity_recording);
                String strQ3 = y.Q(o0VarE, R.string.lbl_discard);
                String strQ4 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean zR3 = o0VarE.r(cVar) | o0VarE.B(p1Var);
                Object objQ11 = o0VarE.q();
                if (zR3 || objQ11 == p3.m.a.f135155b) {
                    objQ11 = new e(cVar, p1Var, 0);
                    o0VarE.K(objQ11);
                }
                e23.a<Unit> aVar10 = (e23.a) objQ11;
                boolean zR4 = o0VarE.r(cVar);
                Object objQ12 = o0VarE.q();
                if (zR4 || objQ12 == p3.m.a.f135155b) {
                    objQ12 = new dt.d(cVar, 4);
                    o0VarE.K(objQ12);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, true, false, aVar10, strQ4, (e23.a) objQ12, o0VarE, 1572870, 0, SyslogConstants.LOG_LOCAL3);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1528240530);
                o0VarE.g0(false);
            }
            vs.a aVar11 = ((ys.b) p1VarC.getF182175a()).f199162d;
            ys.a aVar12 = aVar11 != null ? aVar11.f179693b : null;
            if (s.g(aVar12, ys.a.d.f199155a)) {
                o0VarE.C(-1528129550);
                o0VarE.g0(false);
                p2 p2Var = cVar.f206791g;
                do {
                    value = p2Var.getValue();
                    bVar = (ys.b) p2Var.getValue();
                    bVar.getClass();
                } while (!p2Var.b(value, ys.b.b(bVar, false, true, null, null, null, null, 61)));
                cVar.f206785a.f(p2Var.getValue(), "ui_state");
                Unit unit2 = Unit.INSTANCE;
                z15 = z14;
                aVar3 = aVar;
                i15 = i19;
                z16 = false;
                i16 = 256;
            } else if (s.g(aVar12, ys.a.f.f199157a)) {
                o0VarE.C(-1528002140);
                z15 = z14;
                ct.b bVar2 = ct.b.DEVICE_RECONNECTED_ACTIVITY_SAVED_DIALOG;
                i16 = 256;
                boolean z17 = i19 == 256 ? z15 : false;
                Object objQ13 = o0VarE.q();
                if (z17 || objQ13 == p3.m.a.f135155b) {
                    objQ13 = new e52.c(aVar, 13);
                    o0VarE.K(objQ13);
                }
                i15 = i19;
                aVar3 = aVar;
                z16 = false;
                at.g.a(str2, bVar2, null, (e23.a) objQ13, o0VarE, 48);
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
            } else {
                z15 = z14;
                aVar3 = aVar;
                i15 = i19;
                z16 = false;
                i16 = 256;
                if (s.g(aVar12, ys.a.e.f199156a)) {
                    o0VarE.C(-1527650848);
                    Unit unit4 = Unit.INSTANCE;
                    boolean zR5 = o0VarE.r(context) | o0VarE.r(cVar);
                    Object objQ14 = o0VarE.q();
                    if (zR5 || objQ14 == p3.m.a.f135155b) {
                        objQ14 = new j(context, cVar, null);
                        o0VarE.K(objQ14);
                    }
                    l0.e((e23.p) objQ14, unit4, o0VarE);
                    o0VarE.g0(false);
                } else if (s.g(aVar12, ys.a.b.f199153a)) {
                    o0VarE.C(-1527404894);
                    o0VarE.g0(false);
                    lVar.invoke(aVar12);
                    Unit unit5 = Unit.INSTANCE;
                } else {
                    o0VarE.C(-1527341158);
                    o0VarE.g0(false);
                    String str3 = a2.ACTIVITY_RECORDING.f28756a;
                    Objects.toString(aVar12);
                }
            }
            if (((ys.b) p1VarC.getF182175a()).f199160b) {
                o0VarE.C(-1527177695);
                ct.b bVar3 = ct.b.SAVING_ACTIVITY_DIALOG;
                boolean zR6 = o0VarE.r(cVar) | (i15 == i16 ? z15 : z16);
                Object objQ15 = o0VarE.q();
                if (zR6 || objQ15 == p3.m.a.f135155b) {
                    objQ15 = new dl0.g(14, aVar3, cVar);
                    o0VarE.K(objQ15);
                }
                at.g.a(str2, bVar3, null, (e23.a) objQ15, o0VarE, 48);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-1526888434);
                o0VarE.g0(z16);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i((Object) cVar, lVar, aVar3, aVar2, i14, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(zs.c cVar, bt.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        String str;
        o0 o0VarE = mVar.E(911922837);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(cVar.f206795k, o0VarE);
            l72.p2 p2Var = l72.p2.f111205a;
            vs.d dVar = (vs.d) p1VarC.getF182175a();
            if (dVar == null || (str = dVar.f179703a) == null) {
                str = "";
            }
            vs.d dVar2 = (vs.d) p1VarC.getF182175a();
            o0Var = o0VarE;
            p2Var.h(str, aVar.f21031a.getString((dVar2 != null ? dVar2.f179705c : null) instanceof xs.c.a ? R.string.devices_connected : R.string.txt_garmin_device_disconnected), null, null, null, false, false, z3.f.c(-263185337, new l1(p1VarC, 7, (byte) 0), o0VarE), null, null, null, o0Var, 12582912, 0, 1916);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(cVar, aVar, i14, 20);
        }
    }
}
