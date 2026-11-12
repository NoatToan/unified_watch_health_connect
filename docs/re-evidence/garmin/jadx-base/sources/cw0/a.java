package cw0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cn1.p;
import com.garmin.android.apps.connectmobile.R;
import cq.t;
import e23.l;
import gl1.y;
import lc.u0;
import o4.d0;
import o53.s0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r53.s;
import r70.q;
import r70.r;
import s9.c;
import u4.d;
import uv0.b;
import yz1.a0;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcw0/a;", "Lr70/r;", "Ldw0/a;", "stateHolder", "<init>", "(Ldw0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw0.a f55956a;

    public a(dw0.a aVar) {
        aVar.getClass();
        this.f55956a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        String strP;
        m.a.C2565a c2565a;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        boolean zR3;
        Object objQ3;
        z zVarC;
        Double d14;
        Double d15;
        Double d16;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1745827773);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ4 = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ4 == c2565a2) {
                b bVar = this.f55956a.f61434a;
                objQ4 = s.A(new uv0.a(bVar.f172911a, bVar), s0.f129406a);
                o0VarQ.K(objQ4);
            }
            a0.a aVar = (a0.a) c.b((i) objQ4, null, o0VarQ, 48).getF182175a();
            String strQ = y.Q(o0VarQ, R.string.lbl_lifestyle_logging);
            String strQ2 = y.Q(o0VarQ, R.string.no_value);
            boolean zB = o0VarQ.B(strQ2);
            Object objQ5 = o0VarQ.q();
            if (zB || objQ5 == c2565a2) {
                objQ5 = new t(strQ2, 2);
                o0VarQ.K(objQ5);
            }
            l lVar = (l) objQ5;
            boolean zR4 = o0VarQ.r(context);
            Object objQ6 = o0VarQ.q();
            if (zR4 || objQ6 == c2565a2) {
                objQ6 = new a51.m(context, 6);
                o0VarQ.K(objQ6);
            }
            l lVar2 = (l) objQ6;
            Integer numValueOf = (aVar == null || (d16 = aVar.f200239b) == null) ? null : Integer.valueOf((int) d16.doubleValue());
            Integer numValueOf2 = (aVar == null || (d15 = aVar.f200240c) == null) ? null : Integer.valueOf((int) d15.doubleValue());
            o0VarQ.C(1593487144);
            if (numValueOf == null || numValueOf2 == null) {
                z14 = false;
                o0VarQ.g0(false);
                strP = "";
            } else {
                if (numValueOf.intValue() == 1) {
                    o0VarQ.C(-697856659);
                    strP = y.P(R.string.lbl_x_day_logged_out_of_x, new Object[]{numValueOf2}, o0VarQ);
                    z14 = false;
                    o0VarQ.g0(false);
                } else {
                    z14 = false;
                    o0VarQ.C(-697773982);
                    strP = y.P(R.string.lbl_x_days_logged_out_of_x, new Object[]{numValueOf, numValueOf2}, o0VarQ);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(z14);
            }
            boolean z15 = ((aVar != null ? aVar.f200239b : null) == null || (d14 = aVar.f200240c) == null || p005kotlin.jvm.internal.s.c(d14, 0.0d)) ? z14 : true;
            String strQ3 = y.Q(o0VarQ, R.string.msg_lifestyle_logging_empty_state);
            d dVarB = o70.t.b(o70.t.I);
            d92.b.f58623a.getClass();
            d0 d0VarA = d0.a(d92.b.a(o0VarQ).f().b());
            String strQ4 = y.Q(o0VarQ, R.string.txt_empty_page_no_data);
            boolean zB2 = o0VarQ.B(strP);
            Object objQ7 = o0VarQ.q();
            if (zB2) {
                c2565a = c2565a2;
            } else {
                if (objQ7 != c2565a) {
                    c2565a = c2565a2;
                }
                l lVar3 = (l) objQ7;
                String strQ5 = y.Q(o0VarQ, R.string.lbl_log_data);
                zR = o0VarQ.r(context);
                objQ = o0VarQ.q();
                if (zR || objQ == c2565a) {
                    objQ = new a42.d(context, 27);
                    o0VarQ.K(objQ);
                }
                e23.a aVar2 = (e23.a) objQ;
                zR2 = o0VarQ.r(context);
                objQ2 = o0VarQ.q();
                if (zR2 || objQ2 == c2565a) {
                    objQ2 = new a42.d(context, 28);
                    o0VarQ.K(objQ2);
                }
                e23.a aVar3 = (e23.a) objQ2;
                zR3 = o0VarQ.r(context);
                objQ3 = o0VarQ.q();
                if (zR3 || objQ3 == c2565a) {
                    objQ3 = new a42.d(context, 29);
                    o0VarQ.K(objQ3);
                }
                e23.a aVar4 = (e23.a) objQ3;
                if (z15) {
                    zVarC = yz1.d0.c(aVar);
                } else {
                    zVarC = z.EMPTY;
                }
                o0Var = o0VarQ;
                yz1.d0.b(rVar, strQ, dVarB, d0VarA, aVar, lVar, lVar2, "", strQ4, null, lVar3, 2131230998, 0.0f, strQ5, aVar2, aVar3, aVar4, zVarC, strQ3, null, null, o0Var, (i15 & 14) | 12582912, 1577472);
            }
            c2565a = c2565a2;
            objQ7 = new defpackage.b(strP, 9);
            o0VarQ.K(objQ7);
            l lVar4 = (l) objQ7;
            String strQ6 = y.Q(o0VarQ, R.string.lbl_log_data);
            zR = o0VarQ.r(context);
            objQ = o0VarQ.q();
            if (zR) {
                objQ = new a42.d(context, 27);
                o0VarQ.K(objQ);
            } else {
                objQ = new a42.d(context, 27);
                o0VarQ.K(objQ);
            }
            e23.a aVar5 = (e23.a) objQ;
            zR2 = o0VarQ.r(context);
            objQ2 = o0VarQ.q();
            if (zR2) {
                objQ2 = new a42.d(context, 28);
                o0VarQ.K(objQ2);
            } else {
                objQ2 = new a42.d(context, 28);
                o0VarQ.K(objQ2);
            }
            e23.a aVar6 = (e23.a) objQ2;
            zR3 = o0VarQ.r(context);
            objQ3 = o0VarQ.q();
            if (zR3) {
                objQ3 = new a42.d(context, 29);
                o0VarQ.K(objQ3);
            } else {
                objQ3 = new a42.d(context, 29);
                o0VarQ.K(objQ3);
            }
            e23.a aVar7 = (e23.a) objQ3;
            if (z15) {
                zVarC = yz1.d0.c(aVar);
            } else {
                zVarC = z.EMPTY;
            }
            o0Var = o0VarQ;
            yz1.d0.b(rVar, strQ, dVarB, d0VarA, aVar, lVar, lVar2, "", strQ4, null, lVar4, 2131230998, 0.0f, strQ6, aVar5, aVar6, aVar7, zVarC, strQ3, null, null, o0Var, (i15 & 14) | 12582912, 1577472);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, rVar, qVar, i14, 3);
        }
    }
}
