package ll;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import kd0.h6;
import l30.i0;
import lc.u0;
import o53.s0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r53.s;
import r70.q;
import r70.r;
import w2.a0;
import yz1.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lll/d;", "Lr70/r;", "Lml/a;", "stateHolder", "<init>", "(Lml/a;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ml.a f113334a;

    public d(ml.a aVar) {
        aVar.getClass();
        this.f113334a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        String strD;
        String strL;
        String strP;
        boolean z14;
        String strP2;
        String strP3;
        String strP4;
        String str;
        z zVar;
        Integer num;
        x61.a aVar;
        x61.a aVar2;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 69832508);
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
            ac1.a aVar3 = new ac1.a(new l22.a(context));
            String strD2 = null;
            il.b bVar = (il.b) KoinJavaComponent.get$default(il.b.class, null, null, 6, null);
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                kl.e eVar = this.f113334a.f119194a;
                kl.c cVar = eVar.f105202a;
                kl.a aVar4 = new kl.a(cVar.f105194a, cVar);
                x53.c cVar2 = s0.f129406a;
                objQ = s.A(new kl.d(s.A(aVar4, cVar2), eVar), cVar2);
                o0VarQ.K(objQ);
            }
            jl.a aVar5 = (jl.a) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            String strQ = y.Q(o0VarQ, R.string.lbl_altitude_acclimation);
            gg1.o0 o0Var = aVar5 != null ? aVar5.f99443f : null;
            if (o0Var == null) {
                o0VarQ.C(1616787658);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1616787659);
                strD2 = bVar.d(a0.s(o0VarQ), aVar5.f99439b, o0Var, false);
                o0VarQ.g0(false);
            }
            if (o0Var == null) {
                o0VarQ.C(1617141027);
                o0VarQ.g0(false);
                strD = null;
            } else {
                o0VarQ.C(1617141028);
                strD = bVar.d(a0.s(o0VarQ), aVar5.f99440c, o0Var, false);
                o0VarQ.g0(false);
            }
            Integer num2 = (aVar5 == null || (aVar2 = aVar5.f99442e) == null) ? null : aVar2.f189182h;
            if (num2 == null) {
                o0VarQ.C(1617538912);
                o0VarQ.g0(false);
                strL = null;
            } else {
                strL = u0.l(o0VarQ, 1617538913, num2, o0VarQ, false);
            }
            if (strD2 == null) {
                o0VarQ.C(1617688332);
                o0VarQ.g0(false);
                strP = null;
            } else {
                o0VarQ.C(1617688333);
                strP = y.P(R.string.msg_current_acclimation, new Object[]{strD2}, o0VarQ);
                o0VarQ.g0(false);
            }
            o0VarQ.C(-1610379407);
            Integer num3 = aVar5 != null ? aVar5.f99439b : null;
            Integer num4 = aVar5 != null ? aVar5.f99440c : null;
            Integer num5 = aVar5 != null ? aVar5.f99441d : null;
            if (num3 == null || num4 == null || num5 == null || strD == null) {
                z14 = false;
                strP2 = null;
            } else {
                int iIntValue = num5.intValue();
                if (num4.intValue() >= num3.intValue()) {
                    o0VarQ.C(-1744610251);
                    strP2 = y.P(R.string.msg_altitude_acclimatization, new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(iIntValue)}, o0VarQ), strD}, o0VarQ);
                    z14 = false;
                    o0VarQ.g0(false);
                } else {
                    z14 = false;
                    o0VarQ.C(-1744306482);
                    o0VarQ.g0(false);
                    strP2 = "";
                }
            }
            o0VarQ.g0(z14);
            String str2 = aVar5 != null ? aVar5.f99444g : null;
            if (str2 == null) {
                o0VarQ.C(1618797729);
                o0VarQ.g0(z14);
                strP3 = null;
            } else {
                o0VarQ.C(1618797730);
                strP3 = y.P(R.string.lbl_updated_date, new Object[]{str2}, o0VarQ);
                o0VarQ.g0(z14);
            }
            String strQ2 = y.Q(o0VarQ, R.string.no_data_label);
            String strP5 = (strL == null || strP == null || strP2 == null || strP3 == null) ? null : oi0.c.P(x.k(strL, strP, strP2, strP3));
            if (strP5 != null) {
                strQ2 = strP5;
            }
            String strB = o0Var != null ? aVar3.b(o0Var, 800) : null;
            if (strB == null) {
                o0VarQ.C(1619401516);
                o0VarQ.g0(false);
                strP4 = null;
            } else {
                o0VarQ.C(1619401517);
                strP4 = y.P(R.string.altitude_acclimation_card_no_data_state_message, new Object[]{strB}, o0VarQ);
                o0VarQ.g0(false);
            }
            yz1.d dVar = aVar5 != null ? aVar5.f99438a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = f72.b.a(t62.c.f162799a);
            Integer num6 = (aVar5 == null || (aVar = aVar5.f99442e) == null) ? null : aVar.f189181g;
            if (o0Var == null) {
                o0VarQ.C(1619936948);
                o0VarQ.g0(false);
                str = null;
            } else {
                o0VarQ.C(1619936949);
                String strD3 = bVar.d(a0.s(o0VarQ), aVar5.f99439b, o0Var, true);
                o0VarQ.g0(false);
                str = strD3;
            }
            boolean zR = o0VarQ.r(bVar) | o0VarQ.r(context);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new i0(12, bVar, context);
                o0VarQ.K(objQ2);
            }
            e23.a aVar6 = (e23.a) objQ2;
            if (aVar5 == null || aVar5.f99444g == null || aVar5.f99441d == null || (num = aVar5.f99439b) == null || num.intValue() == 0) {
                zVar = z.EMPTY;
            } else {
                LocalDate localDate = aVar5.f99445h;
                zVar = (localDate == null || localDate.equals(LocalDate.now())) ? z.VALID_DATA : z.EMPTY;
            }
            c.a(rVar, dVar, strQ, dVarA, strQ2, num6, str, strP2, strP3, aVar6, zVar, strP4, o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, qVar, i14, 21);
        }
    }
}
