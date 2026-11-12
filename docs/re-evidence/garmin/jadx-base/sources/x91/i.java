package x91;

import android.content.Context;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.e5;
import i3.fe;
import i3.mh;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static final void a(ba1.d dVar, aa1.a aVar, fe feVar, e23.p pVar, e23.p pVar2, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        fe feVar2;
        dVar.getClass();
        aVar.getClass();
        feVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        o0 o0VarE = mVar.E(-1375898118);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(pVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            feVar2 = feVar;
            z02.d.a(aVar.f2218a, z3.f.c(-569983169, new w21.d((Object) aVar, (Object) aVar3, (Object) aVar2, p1Var, 20), o0VarE), z3.f.c(-1080995328, new f(feVar2, 0), o0VarE), null, null, z3.f.c(1680935491, new wv0.e(2, pVar2, aVar, dVar, pVar, p1Var), o0VarE), o0VarE, 197040, 24);
        } else {
            feVar2 = feVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(dVar, aVar, feVar2, pVar, pVar2, aVar2, aVar3, i14);
        }
    }

    public static final boolean b(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final void c(int i14, h4.r rVar, String str, p3.m mVar) {
        o0 o0VarE = mVar.E(1187502663);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = u2Var.a(c2.l.y(aVar2, j92.b.f97899b.f97920e), 1.0f, true);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            mh.c(str, rVarA, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, (i15 >> 3) & 14, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar, str, i14, 12);
        }
    }

    public static final aa1.d d(dn.a aVar, Context context, q91.d dVar, pi0.e eVar) {
        aVar.getClass();
        context.getClass();
        DateTime dateTime = new DateTime(aVar.f60489f);
        String strA = eVar.a(dateTime, qi0.a.YEAR_ABBREV_MONTH_DAY);
        LocalDateTime localDateTime = new LocalDateTime(dateTime, DateTimeZone.getDefault());
        qi0.f fVar = qi0.f.RELATIVE_24H_AM_PM_TIME;
        fVar.getClass();
        String strG = e5.g(strA, ", ", eVar.c(g22.k.r(localDateTime), fVar));
        String strG2 = z91.a.g(context, dVar, aVar.getTime(), true);
        if (strG2 == null) {
            strG2 = context.getString(R.string.no_value);
            strG2.getClass();
        }
        String str = strG2;
        String string = aVar.f60488e;
        if (string == null) {
            string = context.getString(R.string.txt_untitle);
            string.getClass();
        }
        return new aa1.d(string, null, strG, dateTime.withZone(DateTimeZone.UTC).getMillis(), str, null, Long.valueOf(aVar.getActivityId()), null, null, aVar.getTime() / ((double) 1000), 34, null);
    }
}
