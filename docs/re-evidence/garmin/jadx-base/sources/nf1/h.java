package nf1;

import android.content.Context;
import b82.o;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.ve;
import java.util.Arrays;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(String str, String str2, String str3, m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(-1870732911);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            ve.a(x2.f(r.S, 1.0f), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1050118164, new o(str, str3 == null ? str2 : e5.g(str2, StringUtils.SPACE, str3), 25), o0VarE), o0Var, 12582918, 122);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c81.i(i14, 3, str, str2, str3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0289  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e0  */
    public static final void b(Context context, if1.c cVar, of1.a aVar, m mVar, int i14) {
        o0 o0Var;
        Float f14;
        String str;
        context.getClass();
        cVar.getClass();
        String str2 = cVar.f93211b;
        String str3 = cVar.f93210a;
        Float f15 = cVar.f93214e;
        Float f16 = cVar.f93213d;
        Integer num = cVar.f93215f;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1688728556);
        int i15 = i14 | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = n.f135158a;
            String strG = g22.n.g(aVar.c(str3, str2));
            Context context2 = aVar.f131711a;
            if (str3 == null || str2 == null) {
                f14 = f16;
            } else {
                try {
                    LocalDate localDate = LocalDate.parse(str3, DateTimeFormat.forPattern("yyyy-MM-dd"));
                    String strB = j0.b(localDate.toDateTimeAtStartOfDay(), "MMM d", null);
                    if (strB == null) {
                        strB = "--";
                    }
                    String strB2 = j0.b(localDate.toDateTimeAtStartOfDay(), "MMM d, yyyy", null);
                    if (strB2 == null) {
                        strB2 = "--";
                    }
                    f14 = f16;
                    try {
                        String strB3 = j0.b(localDate.toDateTimeAtStartOfDay(), "MMMM d, yyyy", null);
                        if (strB3 == null) {
                            strB3 = "";
                        }
                        LocalDate localDate2 = LocalDate.parse(str2, DateTimeFormat.forPattern("yyyy-MM-dd"));
                        String strB4 = j0.b(localDate2.toDateTimeAtStartOfDay(), "MMM d", null);
                        if (strB4 == null) {
                            strB4 = "--";
                        }
                        String strB5 = j0.b(localDate2.toDateTimeAtStartOfDay(), "MMM d, yyyy", null);
                        if (strB5 == null) {
                            strB5 = "--";
                        }
                        j0.f23099a.getClass();
                        DateTime dateTime = new DateTime(j0.x());
                        boolean z14 = localDate.getYear() < localDate2.getYear();
                        String str4 = strB3;
                        boolean z15 = localDate.getYear() < dateTime.getYear();
                        boolean z16 = localDate2.getYear() < dateTime.getYear();
                        if (localDate2.getYear() == dateTime.getYear() && localDate.getYear() < dateTime.getYear()) {
                            z14 = true;
                        }
                        if (localDate.equals(localDate2)) {
                            if (z15) {
                                strB = str4;
                            }
                        } else if (s.g(localDate.monthOfYear(), localDate2.monthOfYear())) {
                            if (z16) {
                                x0 x0Var = x0.f105818a;
                                String string = a7.b.getString(context2, R.string.string_dash_string_nospace_comma_string);
                                string.getClass();
                                strB = String.format(string, Arrays.copyOf(new Object[]{strB, strB4, String.valueOf(localDate2.getYear())}, 3));
                            } else {
                                x0 x0Var2 = x0.f105818a;
                                String string2 = a7.b.getString(context2, R.string.range_of_days);
                                string2.getClass();
                                strB = String.format(string2, Arrays.copyOf(new Object[]{strB, strB4}, 2));
                            }
                        } else if (z14) {
                            x0 x0Var3 = x0.f105818a;
                            String string3 = a7.b.getString(context2, R.string.string_short_dash_line_string_pattern);
                            string3.getClass();
                            strB = String.format(string3, Arrays.copyOf(new Object[]{strB2, strB5}, 2));
                        } else if (z16) {
                            x0 x0Var4 = x0.f105818a;
                            String string4 = a7.b.getString(context2, R.string.string_short_dash_line_string_pattern);
                            string4.getClass();
                            strB = String.format(string4, Arrays.copyOf(new Object[]{strB, strB5}, 2));
                        } else {
                            x0 x0Var5 = x0.f105818a;
                            String string5 = a7.b.getString(context2, R.string.string_short_dash_line_string_pattern);
                            string5.getClass();
                            strB = String.format(string5, Arrays.copyOf(new Object[]{strB, strB4}, 2));
                        }
                        str = strB;
                    } catch (Exception e4) {
                        e = e4;
                        String strN = fb1.c.n("Date parsing failed content description: ", e.getLocalizedMessage());
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "RunningToleranceFormatter", strN);
                        str = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    f14 = f16;
                }
                if (strG.equals("--") && ((num != null && num.intValue() > 0) || c(f14) || c(f15))) {
                    o0VarE.C(-1959704884);
                    r.a aVar3 = r.S;
                    r rVarE = u1.n.e(aVar3, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f17 = eVar.f97917b;
                    bVar.getClass();
                    r rVarC = l.C(rVarE, 0.0f, f17, 0.0f, eVar.f97917b, 5);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    x1 x1Var2 = n.f135158a;
                    int iHashCode = Long.hashCode(o0VarE.U);
                    p3.i2 i2VarA0 = o0VarE.a0();
                    r rVarC2 = k.c(rVarC, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    b0 b0Var = b0.f22601a;
                    boolean zB = o0VarE.B(str) | o0VarE.B(strG);
                    Object objQ = o0VarE.q();
                    if (zB) {
                        objQ = new cn1.j(str, strG, 13);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new cn1.j(str, strG, 13);
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarC3 = v.c((e23.l) objQ, aVar3, false);
                    bVar.getClass();
                    float f18 = eVar.f97918c;
                    bVar.getClass();
                    r rVarC4 = l.C(rVarC3, f18, 0.0f, 0.0f, eVar.f97917b, 6);
                    d92.b.f58624b.getClass();
                    mh.c(strG, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(j92.f.f97935l), o0VarE), o0VarE, 0, 0, 131068);
                    o0Var = o0VarE;
                    if (num == null || num.intValue() <= 0) {
                        o0Var.C(-341219139);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-341493985);
                        a(gl1.y.Q(o0Var, kf1.e.TOLERANCE.f104633a), String.valueOf(num), gl1.y.Q(o0Var, of1.a.h()), o0Var, 0);
                        o0Var.g0(false);
                    }
                    if (c(f14)) {
                        o0Var.C(-341153419);
                        a(gl1.y.Q(o0Var, kf1.e.NORMAL_IMPACT_LOAD.f104633a), String.valueOf(f14), gl1.y.Q(o0Var, of1.a.h()), o0Var, 0);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-340868963);
                        o0Var.g0(false);
                    }
                    if (c(f15)) {
                        o0Var.C(-340804669);
                        a(gl1.y.Q(o0Var, kf1.e.REAL_DISTANCE.f104633a), of1.a.a(f15, o0Var), gl1.y.Q(o0Var, of1.a.h()), o0Var, 0);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-340502915);
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    o0Var.C(-1958134610);
                    o0Var.g0(false);
                }
                x1 x1Var3 = n.f135158a;
            }
            str = null;
            if (strG.equals("--")) {
                o0Var = o0VarE;
                o0Var.C(-1958134610);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1958134610);
                o0Var.g0(false);
            }
            x1 x1Var4 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(context, cVar, aVar, i14, 10);
        }
    }

    public static final boolean c(Float f14) {
        return f14 != null && f14.floatValue() > 0.0f;
    }
}
