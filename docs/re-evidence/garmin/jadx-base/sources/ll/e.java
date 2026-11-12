package ll;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f72.qd;
import gl1.y;
import kd0.h6;
import kl.f;
import kl.g;
import lc.u0;
import o53.s0;
import org.joda.time.LocalDate;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lll/e;", "Lr70/r;", "Lml/b;", "stateHolder", "<init>", "(Lml/b;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ml.b f113335a;

    public e(ml.b bVar) {
        bVar.getClass();
        this.f113335a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        String strP;
        String strP2;
        String strP3;
        z zVar;
        Integer num;
        x61.a aVar;
        x61.a aVar2;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1822956120);
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
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                g gVar = this.f113335a.f119195a;
                kl.c cVar = gVar.f105211a;
                kl.a aVar3 = new kl.a(cVar.f105194a, cVar);
                x53.c cVar2 = s0.f129406a;
                objQ = s.A(new f(s.A(aVar3, cVar2), gVar), cVar2);
                o0VarQ.K(objQ);
            }
            jl.b bVar = (jl.b) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarQ, R.string.lbl_heat_acclimation);
            Integer num2 = bVar != null ? bVar.f99447b : null;
            if (num2 == null) {
                o0VarQ.C(2119713894);
                o0VarQ.g0(false);
                strP = null;
            } else {
                o0VarQ.C(2119713895);
                strP = y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(num2.intValue())}, o0VarQ);
                o0VarQ.g0(false);
            }
            if (strP == null) {
                o0VarQ.C(2119892144);
                o0VarQ.g0(false);
                strP2 = null;
            } else {
                o0VarQ.C(2119892145);
                strP2 = y.P(R.string.msg_current_acclimation, new Object[]{strP}, o0VarQ);
                o0VarQ.g0(false);
            }
            o0VarQ.C(-485801103);
            Integer num3 = (bVar == null || (aVar2 = bVar.f99448c) == null) ? null : aVar2.f189183i;
            Integer num4 = bVar != null ? bVar.f99449d : null;
            String strP4 = (num3 == null || num4 == null) ? null : y.P(num3.intValue(), new Object[]{y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(num4.intValue())}, o0VarQ)}, o0VarQ);
            o0VarQ.g0(false);
            String str = bVar != null ? bVar.f99450e : null;
            if (str == null) {
                o0VarQ.C(2120525381);
                o0VarQ.g0(false);
                strP3 = null;
            } else {
                o0VarQ.C(2120525382);
                strP3 = y.P(R.string.lbl_updated_date, new Object[]{str}, o0VarQ);
                o0VarQ.g0(false);
            }
            String strQ2 = y.Q(o0VarQ, R.string.no_data_label);
            String strP5 = (strP2 == null || strP4 == null || strP3 == null) ? null : oi0.c.P(x.k(strP2, strP4, strP3));
            if (strP5 != null) {
                strQ2 = strP5;
            }
            l3.a aVar4 = l3.f23124b;
            l22.a aVarS = a0.s(o0VarQ);
            boolean z14 = bVar != null ? bVar.f99451f : false;
            aVar4.getClass();
            String strP6 = y.P(R.string.heat_acclimation_card_no_data_state_message, new Object[]{l3.a.U0(aVarS, 22.0d, !z14, false, true)}, o0VarQ);
            yz1.d dVar = bVar != null ? bVar.f99446a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = qd.a(t62.c.f162799a);
            Integer num5 = (bVar == null || (aVar = bVar.f99448c) == null) ? null : aVar.f189181g;
            boolean zR = o0VarQ.r(context);
            Integer num6 = num5;
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new l71.g(context, 3);
                o0VarQ.K(objQ2);
            }
            e23.a aVar5 = (e23.a) objQ2;
            if (bVar == null) {
                zVar = z.EMPTY;
            } else {
                Integer num7 = bVar.f99449d;
                if (bVar.f99450e == null || (num = bVar.f99447b) == null || num7 == null || num.intValue() == 0 || num7.intValue() == 0) {
                    zVar = z.EMPTY;
                } else {
                    LocalDate localDate = bVar.f99452g;
                    zVar = (localDate == null || localDate.equals(LocalDate.now())) ? z.VALID_DATA : z.EMPTY;
                }
            }
            c.a(rVar, dVar, strQ, dVarA, strQ2, num6, strP, strP4, strP3, aVar5, zVar, strP6, o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, rVar, qVar, i14, 22);
        }
    }
}
