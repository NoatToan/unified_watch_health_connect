package xe1;

import android.content.Context;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Arrays;
import m92.y;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0087 -> B:36:0x009d). Please report as a decompilation issue!!! */
    public static final void a(final ve1.b bVar, final bf1.a aVar, m mVar, final int i14) {
        String strB;
        o0 o0VarE = mVar.E(252507914);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Integer num = bVar.f177671b;
            if (num == null || (num != null && num.intValue() == 0)) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(bVar, aVar, i14, i16) { // from class: xe1.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f190439a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ve1.b f190440b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ bf1.a f190441c;

                        {
                            this.f190439a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f190439a;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    j.a(this.f190440b, this.f190441c, mVar2, p0.t(1));
                                    break;
                                default:
                                    j.a(this.f190440b, this.f190441c, mVar2, p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            String str = bVar.f177670a;
            if (str != null) {
                try {
                    j0.f23099a.getClass();
                    DateTime dateTime = new DateTime(j0.x());
                    LocalDate localDate = LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
                    if (localDate.getYear() < dateTime.getYear()) {
                        strB = j0.b(localDate.toDateTimeAtStartOfDay(), "MMMM d, yyyy", null);
                        if (strB == null) {
                            strB = "";
                        }
                    } else {
                        strB = j0.b(localDate.toDateTimeAtStartOfDay(), "MMMM d", null);
                        if (strB == null) {
                            strB = "--";
                        }
                    }
                } catch (Exception e4) {
                    String strN = fb1.c.n("Date parsing failed: ", e4.getLocalizedMessage());
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "RunningEconomyFormatter", strN);
                }
            } else {
                strB = "--";
            }
            String str2 = bVar.f177672c;
            Integer numValueOf = str2 != null ? Integer.valueOf(af1.e.valueOf(str2).f3082a) : null;
            if (strB.equals("--")) {
                o0VarE.C(1976817304);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1976085022);
                y.a(strB, z3.f.c(-296330837, new wb1.i(24, bVar, numValueOf), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new p(bVar, aVar, i14, i17) { // from class: xe1.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f190439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ve1.b f190440b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bf1.a f190441c;

                {
                    this.f190439a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f190439a;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            j.a(this.f190440b, this.f190441c, mVar2, p0.t(1));
                            break;
                        default:
                            j.a(this.f190440b, this.f190441c, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0114  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:46:0x0150  */
    /* JADX WARN: Code duplicated, block: B:48:0x0157  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0176  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01dc  */
    public static final void b(int i14, long j8, String str, String str2, m mVar) {
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        u2 u2Var;
        z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        r rVarC;
        s2 s2VarA;
        int iHashCode2;
        p3.i2 i2VarA1;
        r rVarC2;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -1850889587);
        p3.c<?> cVar2 = o0VarK.f135177b;
        int i15 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16) | (o0VarK.l(j8) ? 256 : 128);
        if (o0VarK.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarK, 0);
            int iHashCode3 = Long.hashCode(o0VarK.U);
            p3.i2 i2VarA2 = o0VarK.a0();
            r rVarC3 = k.c(aVar, o0VarK);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA2, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarK);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarK.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarK.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarK);
                u2Var = u2.f22900a;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                bVar3.getClass();
                r rVarC4 = l.C(aVar, 0.0f, f14, eVar2.f97917b, 0.0f, 9);
                bVar3.getClass();
                q.a(u1.n.e(l4.k.b(x2.q(rVarC4, j92.b.f97901d.f97902a), k2.i.f102406a), j8, m1.f128891a), o0VarK, 0);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, 0);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = k.c(aVar, o0VarK);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(eVar, zVarA, o0VarK);
                b4.c(c1623g, i2VarA0, o0VarK);
                if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarK);
                b0 b0Var = b0.f22601a;
                s2VarA = q2.a(c0343j, bVar, o0VarK, 0);
                iHashCode2 = Long.hashCode(o0VarK.U);
                i2VarA1 = o0VarK.a0();
                rVarC2 = k.c(aVar, o0VarK);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(eVar, s2VarA, o0VarK);
                b4.c(c1623g, i2VarA1, o0VarK);
                if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarK);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarK);
                u2Var.getClass();
                mh.c(str, u2Var.d(aVar, f5.b.f68892a), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarK, i15 & 14, 0, 131068);
                o0Var = o0VarK;
                o0Var.g0(true);
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var), o0VarK, (i15 >> 3) & 14, 0, 131070);
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarK, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarK);
            u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f15 = eVar3.f97917b;
            bVar4.getClass();
            r rVarC5 = l.C(aVar, 0.0f, f15, eVar3.f97917b, 0.0f, 9);
            bVar4.getClass();
            q.a(u1.n.e(l4.k.b(x2.q(rVarC5, j92.b.f97901d.f97902a), k2.i.f102406a), j8, m1.f128891a), o0VarK, 0);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, 0);
            iHashCode = Long.hashCode(o0VarK.U);
            i2VarA0 = o0VarK.a0();
            rVarC = k.c(aVar, o0VarK);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, zVarA, o0VarK);
            b4.c(c1623g, i2VarA0, o0VarK);
            if (o0VarK.T) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarK);
            b0 b0Var2 = b0.f22601a;
            s2VarA = q2.a(c0343j, bVar, o0VarK, 0);
            iHashCode2 = Long.hashCode(o0VarK.U);
            i2VarA1 = o0VarK.a0();
            rVarC2 = k.c(aVar, o0VarK);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarK);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0VarK);
            u2Var.getClass();
            mh.c(str, u2Var.d(aVar, f5.b.f68892a), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarK, i15 & 14, 0, 131068);
            o0Var = o0VarK;
            o0Var.g0(true);
            fVar3.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var), o0VarK, (i15 >> 3) & 14, 0, 131070);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h81.d(i14, 1, j8, str, str2);
        }
    }

    public static final void c(final qe1.k kVar, final bf1.a aVar, m mVar, final int i14) {
        String strB;
        o0 o0VarE = mVar.E(-1042935758);
        int i15 = (o0VarE.B(kVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Integer num = kVar.f144560c;
            if (num == null || (num != null && num.intValue() == 0)) {
                final int i16 = 0;
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(kVar, aVar, i14, i16) { // from class: xe1.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f190442a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ qe1.k f190443b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ bf1.a f190444c;

                        {
                            this.f190442a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = this.f190442a;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i17) {
                                case 0:
                                    j.c(this.f190443b, this.f190444c, mVar2, p0.t(1));
                                    break;
                                default:
                                    j.c(this.f190443b, this.f190444c, mVar2, p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            String str = kVar.f144558a;
            String str2 = kVar.f144559b;
            Context context = aVar.f17823a;
            if (str == null || str2 == null) {
                strB = "--";
            } else {
                try {
                    LocalDate localDate = LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
                    strB = j0.b(localDate.toDateTimeAtStartOfDay(), "MMM d", null);
                    if (strB == null) {
                        strB = "--";
                    }
                    String strB2 = j0.b(localDate.toDateTimeAtStartOfDay(), "MMM d, yyyy", null);
                    if (strB2 == null) {
                        strB2 = "--";
                    }
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
                    String strB6 = j0.b(localDate2.toDateTimeAtStartOfDay(), "d", null);
                    if (strB6 == null) {
                        strB6 = "--";
                    }
                    j0.f23099a.getClass();
                    DateTime dateTime = new DateTime(j0.x());
                    String str3 = strB3;
                    boolean z14 = localDate.getYear() < localDate2.getYear();
                    boolean z15 = localDate.getYear() < dateTime.getYear();
                    boolean z16 = localDate2.getYear() < dateTime.getYear();
                    boolean z17 = (localDate2.getYear() != dateTime.getYear() || localDate.getYear() >= dateTime.getYear()) ? z14 : true;
                    if (localDate.equals(localDate2)) {
                        if (z15) {
                            strB = str3;
                        }
                    } else if (s.g(localDate.monthOfYear(), localDate2.monthOfYear())) {
                        if (z16) {
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            String string = a7.b.getString(context, R.string.string_dash_string_nospace_comma_string);
                            string.getClass();
                            strB = String.format(string, Arrays.copyOf(new Object[]{strB, strB6, String.valueOf(localDate2.getYear())}, 3));
                        } else {
                            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                            String string2 = a7.b.getString(context, R.string.range_of_days);
                            string2.getClass();
                            strB = String.format(string2, Arrays.copyOf(new Object[]{strB, strB6}, 2));
                        }
                    } else if (z17) {
                        p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                        String string3 = a7.b.getString(context, R.string.string_short_dash_line_string_pattern);
                        string3.getClass();
                        strB = String.format(string3, Arrays.copyOf(new Object[]{strB2, strB5}, 2));
                    } else if (z16) {
                        p005kotlin.jvm.internal.x0 x0Var4 = p005kotlin.jvm.internal.x0.f105818a;
                        String string4 = a7.b.getString(context, R.string.string_short_dash_line_string_pattern);
                        string4.getClass();
                        strB = String.format(string4, Arrays.copyOf(new Object[]{strB, strB5}, 2));
                    } else {
                        p005kotlin.jvm.internal.x0 x0Var5 = p005kotlin.jvm.internal.x0.f105818a;
                        String string5 = a7.b.getString(context, R.string.string_short_dash_line_string_pattern);
                        string5.getClass();
                        strB = String.format(string5, Arrays.copyOf(new Object[]{strB, strB4}, 2));
                    }
                } catch (Exception e4) {
                    String strN = fb1.c.n("Date parsing failed: ", e4.getLocalizedMessage());
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "RunningEconomyFormatter", strN);
                    strB = "--";
                }
            }
            String str4 = kVar.f144561d;
            Integer numValueOf = str4 != null ? Integer.valueOf(af1.e.valueOf(str4).f3082a) : null;
            if (strB.equals("--")) {
                o0VarE.C(-304452752);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-305166775);
                y.a(strB, z3.f.c(-195998061, new wb1.i(25, kVar, numValueOf), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            final int i17 = 1;
            p2VarI1.f135219d = new p(kVar, aVar, i14, i17) { // from class: xe1.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f190442a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ qe1.k f190443b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bf1.a f190444c;

                {
                    this.f190442a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f190442a;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            j.c(this.f190443b, this.f190444c, mVar2, p0.t(1));
                            break;
                        default:
                            j.c(this.f190443b, this.f190444c, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
