package fx0;

import com.garmin.android.apps.connectmobile.R;
import f21.a0;
import f72.ma;
import f72.r9;
import gl1.y;
import lc.u0;
import o4.d0;
import o53.s0;
import o70.t;
import p005kotlin.Metadata;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.s;
import r70.q;
import r70.r;
import yz1.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfx0/k;", "Lr70/r;", "Lgx0/a;", "stateHolder", "<init>", "(Lgx0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx0.a f73803a;

    public k(gx0.a aVar) {
        aVar.getClass();
        this.f73803a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 516577695);
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
            bx0.d.C0334d c0334d = new bx0.d.C0334d(new yz1.d(u.LOADING, null, false, 6, null));
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                bx0.a aVar = this.f73803a.f80043a;
                objQ = s.A(new bx0.b(aVar.f21650a, aVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            bx0.d dVar = (bx0.d) s9.c.b((r53.i) objQ, c0334d, o0VarQ, 0).getF182175a();
            if (dVar instanceof bx0.d.b) {
                o0VarQ.C(498666860);
                int i16 = i15;
                String strQ = y.Q(o0VarQ, R.string.mct_menstrual_cycle);
                s62.a.f157643a.getClass();
                d.a(rVar, strQ, r9.a(t62.c.f162799a), (bx0.d.b) dVar, o0VarQ, i16 & 14);
                o0VarQ.g0(false);
            } else {
                int i17 = i15;
                if (dVar instanceof bx0.d.g) {
                    o0VarQ.C(499030986);
                    yz1.d dVar2 = ((bx0.d.g) dVar).f21682a;
                    String strQ2 = y.Q(o0VarQ, R.string.onboarding_womens_health);
                    s62.a.f157643a.getClass();
                    m.a(rVar, dVar2, strQ2, r9.a(t62.c.f162799a), null, y.Q(o0VarQ, R.string.mct_card_stale_data_state_message), R.string.smart_scale_label_get_started, o0VarQ, i17 & 14, 16);
                    o0VarQ.g0(false);
                } else if (dVar instanceof bx0.d.a) {
                    o0VarQ.C(499580461);
                    yz1.d dVar3 = ((bx0.d.a) dVar).f21660a;
                    String strQ3 = y.Q(o0VarQ, R.string.onboarding_womens_health);
                    s62.a.f157643a.getClass();
                    m.a(rVar, dVar3, strQ3, r9.a(t62.c.f162799a), null, y.Q(o0VarQ, R.string.mct_card_no_data_state_message), R.string.smart_scale_label_get_started, o0VarQ, i17 & 14, 16);
                    o0VarQ.g0(false);
                } else if (dVar instanceof bx0.d.c) {
                    o0VarQ.C(500121380);
                    String strQ4 = y.Q(o0VarQ, R.string.mct_menstrual_cycle);
                    s62.a.f157643a.getClass();
                    h.b(rVar, strQ4, r9.a(t62.c.f162799a), (bx0.d.c) dVar, o0VarQ, i17 & 14);
                    o0VarQ.g0(false);
                } else if (dVar instanceof bx0.d.C0334d) {
                    o0VarQ.C(500497069);
                    yz1.d dVar4 = ((bx0.d.C0334d) dVar).f21674a;
                    String strQ5 = y.Q(o0VarQ, R.string.onboarding_womens_health);
                    s62.a.f157643a.getClass();
                    m.a(rVar, dVar4, strQ5, r9.a(t62.c.f162799a), null, y.Q(o0VarQ, R.string.mct_card_no_data_state_message), R.string.smart_scale_label_get_started, o0VarQ, i17 & 14, 16);
                    o0VarQ.g0(false);
                } else if (dVar instanceof bx0.d.e) {
                    o0VarQ.C(501038422);
                    String strQ6 = y.Q(o0VarQ, R.string.pregnancy_title);
                    s62.a.f157643a.getClass();
                    j.a(rVar, strQ6, ma.a(t62.c.f162799a), (bx0.d.e) dVar, o0VarQ, i17 & 14);
                    o0VarQ.g0(false);
                } else {
                    if (!(dVar instanceof bx0.d.f)) {
                        throw kg.f.h(o0VarQ, -1785032478, false);
                    }
                    o0VarQ.C(501409399);
                    yz1.d dVar5 = ((bx0.d.f) dVar).f21681a;
                    String strQ7 = y.Q(o0VarQ, R.string.pregnancy_title);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = ma.a(t62.c.f162799a);
                    t.a aVar2 = t.f130062f;
                    t.b bVar = t.b.f130094i;
                    aVar2.getClass();
                    m.a(rVar, dVar5, strQ7, dVarA, d0.a(t.a.b(bVar, o0VarQ)), y.Q(o0VarQ, R.string.msg_pregnancy_tracking_stopped), R.string.lbl_view_details, o0VarQ, i17 & 14, 0);
                    o0VarQ.g0(false);
                }
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r) this, rVar, qVar, i14, 15);
        }
    }
}
