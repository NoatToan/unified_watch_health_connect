package hn;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.k1;
import gl1.y;
import h4.g;
import h5.e0;
import i3.mh;
import is.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.p;
import lc.u0;
import ls.e;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import r53.i;
import r70.q;
import r70.r;
import s9.c;
import ss.k;
import u4.d;
import v.h;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhn/b;", "Lr70/r;", "Ljn/a;", "stateHolder", "<init>", "(Ljn/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn.a f84506a;

    public b(jn.a aVar) {
        aVar.getClass();
        this.f84506a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0221  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        ArrayList arrayList;
        String strT;
        String strK0;
        ActivityListItemDTO activityListItemDTO;
        String str;
        z zVar;
        ActivityListItemDTO activityListItemDTO2;
        boolean zR;
        Object objQ;
        x0 x0Var;
        x0 x0Var2;
        ArrayList arrayList2;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1112317813);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarQ.n(i16 & 1, (i16 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarQ.q();
            m.f135153a.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = (i) this.f84506a.f99602a.invoke();
                o0VarQ.K(objQ2);
            }
            a aVar = (a) c.b((i) objQ2, null, o0VarQ, 48).getF182175a();
            String strQ = y.Q(o0VarQ, R.string.lbl_last_activity);
            ActivityListItemDTO activityListItemDTO3 = aVar != null ? aVar.f84504b : null;
            jr.q qVar2 = aVar != null ? aVar.f84505c : null;
            ps.q qVarA = activityListItemDTO3 != null ? ss.c.a(activityListItemDTO3) : null;
            if (qVarA != null) {
                if (qVar2 != null) {
                    context.getClass();
                    List listS0 = h0.S0(o.a(qVar2.g(), qVarA), 3);
                    arrayList2 = new ArrayList();
                    Iterator it = listS0.iterator();
                    while (it.hasNext()) {
                        e eVarA = is.m.a((p) it.next());
                        Object objK = k.k(eVarA, qVarA);
                        sr.b bVar = new sr.b(context);
                        int iD = k.d(eVarA);
                        Iterator it3 = it;
                        c3 c3Var = eVarA.f114679b;
                        if (c3Var == null) {
                            c3Var = eVarA.f114678a;
                        }
                        String strN = bVar.n(c3Var);
                        l22.a aVar2 = bVar.f160541b;
                        String strB = k.b(eVarA, aVar2, objK, iD);
                        Integer numValueOf = (k.n(eVarA) && qVarA.getIsDecoDive()) ? Integer.valueOf(R.string.abbrev_decompression_dive) : null;
                        String strB2 = k.b(eVarA, aVar2, objK, 32);
                        if (strB2 == null) {
                            strB2 = "";
                        }
                        aq.c cVar = strB != null ? new aq.c(strN, null, strB, strB2, numValueOf, 2, null) : null;
                        if (cVar != null) {
                            arrayList2.add(cVar);
                        }
                        it = it3;
                    }
                } else {
                    arrayList2 = null;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            d dVarS = (activityListItemDTO3 == null || (x0Var2 = activityListItemDTO3.f29265g) == null) ? null : x0Var2.s(k1.f37122a.l0());
            c3 c3Var2 = (activityListItemDTO3 == null || (x0Var = activityListItemDTO3.f29265g) == null) ? null : x0Var.f4360c;
            if (c3Var2 == null) {
                o0VarQ.C(1388180978);
                o0VarQ.g0(false);
                strT = null;
            } else {
                o0VarQ.C(1388180979);
                strT = gl1.d.T(c3Var2, o0VarQ, 0);
                o0VarQ.g0(false);
            }
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(String.valueOf(((aq.c) it4.next()).f11850d));
                }
                strK0 = h0.k0(arrayList3, ". ", null, null, null, 62);
            } else {
                strK0 = null;
            }
            String strP = oi0.c.P(x.k(strT, strK0));
            yz1.d dVar = aVar != null ? aVar.f84503a : null;
            s62.a.f157643a.getClass();
            d dVarA = u62.a.a(t62.a.f162797a);
            long jD = hb.a.d(d92.b.f58623a, o0VarQ);
            if (aVar != null) {
                ActivityListItemDTO activityListItemDTO4 = aVar.f84504b;
                activityListItemDTO = activityListItemDTO3;
                str = strP;
                zVar = ((activityListItemDTO4 != null ? Long.valueOf(activityListItemDTO4.f29250b) : null) == null || aVar.f84505c == null) ? z.EMPTY : z.VALID_DATA;
                if (zVar == null) {
                }
                z zVar2 = zVar;
                String strQ2 = y.Q(o0VarQ, R.string.last_activity_card_no_data_state_message);
                d0 d0VarA = d0.a(jD);
                activityListItemDTO2 = activityListItemDTO;
                z3.e eVarC = f.c(-791374184, new et.p(str, dVarS, arrayList, activityListItemDTO2, this, 20), o0VarQ);
                zR = o0VarQ.r(aVar) | o0VarQ.r(context) | o0VarQ.r(activityListItemDTO2);
                objQ = o0VarQ.q();
                if (zR || objQ == m.a.f135155b) {
                    objQ = new fk0.a(26, context, aVar, activityListItemDTO2);
                    o0VarQ.K(objQ);
                }
                o0Var = o0VarQ;
                yz1.y.c(rVar, dVar, strQ, null, dVarA, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, zVar2, strQ2, null, null, o0Var, i16 & 14, 24576, 802760);
                x1 x1Var2 = n.f135158a;
            } else {
                activityListItemDTO = activityListItemDTO3;
                str = strP;
            }
            zVar = z.EMPTY;
            z zVar3 = zVar;
            String strQ3 = y.Q(o0VarQ, R.string.last_activity_card_no_data_state_message);
            d0 d0VarA2 = d0.a(jD);
            activityListItemDTO2 = activityListItemDTO;
            z3.e eVarC2 = f.c(-791374184, new et.p(str, dVarS, arrayList, activityListItemDTO2, this, 20), o0VarQ);
            zR = o0VarQ.r(aVar) | o0VarQ.r(context) | o0VarQ.r(activityListItemDTO2);
            objQ = o0VarQ.q();
            if (zR) {
                objQ = new fk0.a(26, context, aVar, activityListItemDTO2);
                o0VarQ.K(objQ);
            } else {
                objQ = new fk0.a(26, context, aVar, activityListItemDTO2);
                o0VarQ.K(objQ);
            }
            o0Var = o0VarQ;
            yz1.y.c(rVar, dVar, strQ, null, dVarA, d0VarA2, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC2, (e23.a) objQ, zVar3, strQ3, null, null, o0Var, i16 & 14, 24576, 802760);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(this, rVar, qVar, i14, 2);
        }
    }

    public final void b(String str, String str2, Integer num, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1644644837);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(num) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = l.C(aVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            j jVar = j.f22691a;
            g6.f.a aVar2 = g6.f.f75994b;
            jVar.getClass();
            j.i iVarI = j.i(8);
            h4.d.f81522a.getClass();
            g.b bVar = h4.d.a.f81534l;
            s2 s2VarA = q2.a(iVarI, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131070);
            if (num == null) {
                o0VarE.C(-1619506310);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1619506309);
                int iIntValue = num.intValue();
                h4.r rVarC3 = u2Var.c(aVar, bVar);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ha0.b(17);
                    o0VarE.K(objQ);
                }
                g02.g.a(y.Q(o0VarE, iIntValue), 0L, 0L, v.c((e23.l) objQ, rVarC3, false), 0.0f, 0.0f, o0VarE, 0, 54);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            fVar.getClass();
            o0Var = o0VarE;
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, (i15 >> 3) & 14, 0, 131070);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(this, str, str2, num, i14, 13);
        }
    }
}
