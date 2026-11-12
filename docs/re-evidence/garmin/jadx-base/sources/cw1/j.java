package cw1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.b3;
import i3.d3;
import i3.k3;
import i3.m4;
import i3.x3;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x020f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0215  */
    /* JADX WARN: Code duplicated, block: B:82:0x022c  */
    /* JADX WARN: Code duplicated, block: B:83:0x022f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0233  */
    public static final void a(String str, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        long jD;
        Long lG;
        String str2;
        localDate.getClass();
        localDate2.getClass();
        localDate3.getClass();
        localDate4.getClass();
        p3.o0 o0VarE = mVar.E(302491306);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(localDate2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(localDate3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(localDate4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 599187) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            DateTime dateTimeWithTimeAtStartOfDay = DateTime.now(dateTimeZone).withTimeAtStartOfDay();
            LocalDate localDate5 = (localDate4.isAfter(localDate2) || localDate4.isBefore(localDate)) ? localDate3 : localDate4;
            i iVar = new i(localDate, localDate2);
            boolean zB = o0VarE.B(dateTimeWithTimeAtStartOfDay);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new j23.l(localDate.getYear(), localDate2.getYear());
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j23.l(localDate.getYear(), localDate2.getYear());
                    o0VarE.K(objQ);
                }
            }
            m4 m4VarP = x3.p(Long.valueOf(localDate5.toDateTimeAtStartOfDay(dateTimeZone).getMillis()), (j23.l) objQ, iVar, o0VarE, 0, 10);
            d3 d3Var = d3.f87817a;
            long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jG = vb.h.g(o0VarE);
            long jG2 = vb.h.g(o0VarE);
            long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jD5 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jD6 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long j8 = d92.b.a(o0VarE).k().f63527d;
            long jB = d92.b.a(o0VarE).i().a().b();
            long jD7 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            long jG3 = vb.h.g(o0VarE);
            long jC = d92.b.a(o0VarE).k().c();
            long jE = d92.b.a(o0VarE).e().e();
            o0VarE.C(-456967794);
            long jA2 = d92.b.a(o0VarE).j().a();
            o0VarE.g0(false);
            if (iVar.a(DateTime.now(dateTimeZone).withTimeAtStartOfDay().getMillis())) {
                o0VarE.C(-456744625);
                jD = d92.b.a(o0VarE).k().b();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-456691987);
                jD = d92.b.a(o0VarE).k().d();
                o0VarE.g0(false);
            }
            d3Var.getClass();
            b3 b3VarB = d3.b(jA, jD2, jG, jD3, jG2, jD4, jD5, jD6, j8, jB, jD7, jG3, jC, jE, jD, jA2, o0VarE);
            boolean zB2 = o0VarE.B(m4VarP.g());
            Object objQ2 = o0VarE.q();
            if (zB2) {
                lG = m4VarP.g();
                if (lG != null) {
                    str2 = "MMM dd";
                } else if (new LocalDate(lG.longValue(), dateTimeZone).getYear() != LocalDate.now().getYear()) {
                    str2 = "MMM d, yyyy";
                } else {
                    str2 = "MMM d";
                }
                objQ2 = str2;
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    lG = m4VarP.g();
                    if (lG != null) {
                        str2 = "MMM dd";
                    } else if (new LocalDate(lG.longValue(), dateTimeZone).getYear() != LocalDate.now().getYear()) {
                        str2 = "MMM d, yyyy";
                    } else {
                        str2 = "MMM d";
                    }
                    objQ2 = str2;
                    o0VarE.K(objQ2);
                }
            }
            k3.a(aVar, z3.f.c(1439655484, new c42.c0(24, lVar, m4VarP), o0VarE), null, z3.f.c(250862910, new cq0.p(aVar, 4), o0VarE), null, 0.0f, b3VarB, null, z3.f.c(1829330515, new a42.y(m4VarP, b3VarB, (String) objQ2, str, 15), o0VarE), o0VarE, ((i16 >> 18) & 14) | 100666416);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(str, (Object) localDate, (Object) localDate2, (Object) localDate3, (Object) localDate4, lVar, aVar, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, String str, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        LocalDate localDate5;
        LocalDate localDate6;
        String str2;
        int i16;
        String strQ;
        rVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        localDate3.getClass();
        localDate4.getClass();
        p3.o0 o0VarE = mVar.E(-1954049517);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(localDate) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            localDate5 = localDate2;
            i15 |= o0VarE.r(localDate5) ? 2048 : 1024;
        } else {
            localDate5 = localDate2;
        }
        if ((i14 & 24576) == 0) {
            localDate6 = localDate3;
            i15 |= o0VarE.r(localDate6) ? 16384 : 8192;
        } else {
            localDate6 = localDate3;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(localDate4) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.r(lVar) ? 1048576 : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i16 = i15 & (-113);
                strQ = gl1.y.Q(o0VarE, R.string.common_end_date);
            } else {
                o0VarE.e();
                i16 = i15 & (-113);
                strQ = str;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            l72.p2 p2Var = l72.p2.f111205a;
            String string = localDate4.toString(localDate4.getYear() != LocalDate.now().getYear() ? "MMM d, yyyy" : "MMM d");
            string.getClass();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ak0.z(p1Var, 28);
                o0VarE.K(objQ2);
            }
            int i17 = i16 >> 3;
            p2Var.h(strQ, string, null, rVar, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, (i16 << 9) & 7168, 6, 1012);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(898126233);
                boolean z14 = (i16 & 3670016) == 1048576;
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new a11.b0(lVar, p1Var, 4);
                    o0VarE.K(objQ3);
                }
                e23.l lVar2 = (e23.l) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new ak0.z(p1Var, 29);
                    o0VarE.K(objQ4);
                }
                o0VarE = o0VarE;
                a(strQ, localDate, localDate5, localDate6, localDate4, lVar2, (e23.a) objQ4, o0VarE, 1572864 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(898485647);
                o0VarE.g0(false);
            }
            str2 = strQ;
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(rVar, str2, localDate, localDate2, localDate3, localDate4, lVar, i14, 1);
        }
    }
}
