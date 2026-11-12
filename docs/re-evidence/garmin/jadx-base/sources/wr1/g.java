package wr1;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.gfdi.framework.FileManagerCompat;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.w;
import d6.i;
import g22.k;
import g6.q;
import gl1.y;
import gs1.l;
import gs1.s;
import gs1.t;
import h4.r;
import h5.e0;
import i3.mh;
import in1.o;
import j21.p;
import java.util.List;
import java.util.Locale;
import o4.m1;
import o4.q1;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.i0;
import s5.x0;
import v.h;
import w5.b0;
import w5.c0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static final void a(r rVar, l lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        int i16;
        o0 o0VarE = mVar.E(-758823006);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (lVar == null) {
                o0VarE.C(-1683189698);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-1683189697);
                Integer averageStressLevel = lVar.getAverageStressLevel();
                Integer numValueOf = null;
                if ((averageStressLevel != null ? averageStressLevel.intValue() : -1) >= 0) {
                    DateTime dateTimeO = lVar.o();
                    boolean zK = dateTimeO != null ? k.k(dateTimeO) : false;
                    s sVarF = lVar.F();
                    if (p005kotlin.jvm.internal.s.g(sVarF, s.c.f78864c) || p005kotlin.jvm.internal.s.g(sVarF, s.d.f78865c)) {
                        numValueOf = Integer.valueOf(zK ? R.string.alldaystress_calm_present_message : R.string.alldaystress_calm_past_message);
                    } else if (p005kotlin.jvm.internal.s.g(sVarF, s.a.f78862c) || p005kotlin.jvm.internal.s.g(sVarF, s.b.f78863c)) {
                        numValueOf = Integer.valueOf(zK ? R.string.alldaystress_balanced_present_message : R.string.alldaystress_balanced_past_message);
                    } else if (p005kotlin.jvm.internal.s.g(sVarF, s.f.f78866c) || p005kotlin.jvm.internal.s.g(sVarF, s.g.f78867c)) {
                        numValueOf = Integer.valueOf(zK ? R.string.alldaystress_stressfull_present_message : R.string.alldaystress_stressfull_past_message);
                    } else if (p005kotlin.jvm.internal.s.g(sVarF, s.i.f78869c) || p005kotlin.jvm.internal.s.g(sVarF, s.j.f78870c)) {
                        numValueOf = Integer.valueOf(zK ? R.string.alldaystress_very_stressfull_present_message : R.string.alldaystress_very_stressfull_past_message);
                    } else if (p005kotlin.jvm.internal.s.g(sVarF, s.h.f78868c)) {
                        if (zK) {
                            DateTime dateTime = new DateTime();
                            i16 = dateTime.isAfter(dateTime.withHourOfDay(12).withMinuteOfHour(0).withSecondOfMinute(0)) ? R.string.allday_stress_unmeasurable_today_desc : R.string.alldaystress_unknown_pending_present;
                        } else {
                            i16 = R.string.allday_stress_unmeasurable_desc;
                        }
                        numValueOf = Integer.valueOf(i16);
                    }
                }
                if (numValueOf != null) {
                    o0VarE.C(-1822807667);
                    String strQ = y.Q(o0VarE, numValueOf.intValue());
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVar, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i15 << 3) & 112, 0, 131068);
                    o0Var = o0VarE;
                    z14 = false;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    z14 = false;
                    o0Var.C(-1822627650);
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(rVar, lVar, i14, 10);
        }
    }

    public static final void b(t2 t2Var, String str, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(968111555);
        int i16 = (i14 & 6) == 0 ? (o0VarE.B(t2Var) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.sleep_my_day_hour_unit);
            Locale locale = Locale.ROOT;
            String lowerCase = strQ.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = y.Q(o0VarE, R.string.sleep_my_day_minute_unit).toLowerCase(locale);
            lowerCase2.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            i0 i0Var = new i0(0L, f0.H(q.d(j92.f.f97932i.f157322a.fontSize), 4294967296L), (w5.f0) null, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (i) null, (q1) null, (s5.b0) null, (q4.g) null, FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX, (j) null);
            y02.b bVar = y02.b.f193048a;
            List listK = x.k(lowerCase, lowerCase2);
            bVar.getClass();
            str.getClass();
            listK.getClass();
            s5.c.b bVar2 = new s5.c.b(0, 1, null);
            for (String str2 : w.W(str, new String[]{StringUtils.SPACE})) {
                if (listK.contains(str2)) {
                    int iJ = bVar2.j(i0Var);
                    try {
                        bVar2.b(str2);
                        Unit unit = Unit.INSTANCE;
                        bVar2.f(iJ);
                    } catch (Throwable th3) {
                        bVar2.f(iJ);
                        throw th3;
                    }
                } else {
                    bVar2.b(str2);
                }
                bVar2.b(StringUtils.SPACE);
            }
            s5.c cVarK = bVar2.k();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97929f, o0VarE);
            o0Var = o0VarE;
            i15 = 1;
            mh.d(cVarK, t2Var.b(r.S), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarB, o0Var, 0, 0, 262140);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(t2Var, str, i14, i15);
        }
    }

    public static final void c(final Integer num, final Integer num2, final int i14, final int i15, final long j8, final long j14, m mVar, final int i16) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1500860944);
        int i17 = i16 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.B(num2) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192) | (o0VarE.l(j14) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new qr1.a(context);
                o0VarE.K(objQ);
            }
            qr1.a aVar = (qr1.a) objQ;
            String strQ = y.Q(o0VarE, R.string.no_value);
            String strA = num != null ? qr1.a.a(aVar, num.intValue()) : strQ;
            if (num2 != null) {
                strQ = qr1.a.a(aVar, num2.intValue());
            }
            l72.x0 x0Var = l72.x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            final String str = strA;
            final String str2 = strQ;
            o0Var = o0VarE;
            x0Var.e(c2.l.C(aVar2, f14, eVar.f97920e, f15, 0.0f, 8), z3.f.c(1827809847, new e23.q() { // from class: wr1.e
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t2 t2Var = (t2) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        String strQ2 = y.Q(mVar2, i14);
                        l72.x0 x0Var2 = l72.x0.f111346a;
                        z3.e eVarC = z3.f.c(1285324059, new p(str, 26), mVar2);
                        l72.x0.a aVar3 = new l72.x0.a(j8, null);
                        o13.p pVar = new o13.p(num, strQ2);
                        Context context2 = context;
                        b92.a aVarA = qr1.b.a(context2, pVar);
                        int i18 = b92.a.f16960b;
                        int i19 = (iIntValue & 14) | 48 | (l72.x0.f111348c << 18);
                        x0Var2.c(t2Var, eVarC, strQ2, aVar3, null, aVarA, mVar2, i19, 8);
                        String strQ3 = y.Q(mVar2, i15);
                        x0Var2.c(t2Var, z3.f.c(-1485281198, new p(str2, 27), mVar2), strQ3, new l72.x0.a(j14, null), null, qr1.b.a(context2, new o13.p(num2, strQ3)), mVar2, i19, 8);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, (l72.x0.f111348c << 6) | 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(num, num2, i14, i15, j8, j14, i16) { // from class: wr1.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Integer f186822a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Integer f186823b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f186824c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f186825d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f186826e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f186827f;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    g.c(this.f186822a, this.f186823b, this.f186824c, this.f186825d, this.f186826e, this.f186827f, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    public static final void d(l lVar, m mVar, int i14) {
        String strJ;
        Integer highStressDuration;
        Integer mediumStressDuration;
        Integer lowStressDuration;
        Integer restStressDuration;
        o0 o0VarE = mVar.E(-56533552);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer averageStressLevel = lVar != null ? lVar.getAverageStressLevel() : null;
            if ((averageStressLevel != null ? averageStressLevel.intValue() : 0) > 0) {
                o0VarE.C(982547481);
                o0VarE.g0(false);
                strJ = String.valueOf(averageStressLevel);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 982548021, R.string.no_value, o0VarE, false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarQ = x2.q(c2.l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1), gl.b.q(o0VarE, R.dimen.gauge_chart_size_small));
            boolean zB = o0VarE.B(strJ) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a42.b(strJ, context, 17);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a42.b(strJ, context, 17);
                    o0VarE.K(objQ);
                }
            }
            vr1.g.a(v.c((e23.l) objQ, rVarQ, true), (lVar == null || (restStressDuration = lVar.getRestStressDuration()) == null) ? 0 : restStressDuration.intValue(), (lVar == null || (lowStressDuration = lVar.getLowStressDuration()) == null) ? 0 : lowStressDuration.intValue(), (lVar == null || (mediumStressDuration = lVar.getMediumStressDuration()) == null) ? 0 : mediumStressDuration.intValue(), (lVar == null || (highStressDuration = lVar.getHighStressDuration()) == null) ? 0 : highStressDuration.intValue(), z3.f.c(-1261031294, new vd0.b(strJ, 15), o0VarE), 0.0f, o0VarE, 196608, 64);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    public static final void e(DateTime dateTime, t tVar, boolean z14, tf0.i iVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super b63.o, Unit> lVar2, e23.l<? super Boolean, Unit> lVar3, e23.l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        int i15;
        boolean z15;
        tf0.i iVar2;
        e23.l<? super Boolean, Unit> lVar5;
        e23.l<? super b63.o, Unit> lVar6;
        e23.l<? super Boolean, Unit> lVar7;
        e23.l<? super Boolean, Unit> lVar8;
        o0 o0Var;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(2125688597);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            iVar2 = iVar;
            i15 |= o0VarE.r(iVar2) ? 2048 : 1024;
        } else {
            iVar2 = iVar;
        }
        if ((i14 & 24576) == 0) {
            lVar5 = lVar;
            i15 |= o0VarE.r(lVar5) ? 16384 : 8192;
        } else {
            lVar5 = lVar;
        }
        if ((196608 & i14) == 0) {
            lVar6 = lVar2;
            i15 |= o0VarE.r(lVar6) ? 131072 : 65536;
        } else {
            lVar6 = lVar2;
        }
        if ((1572864 & i14) == 0) {
            lVar7 = lVar3;
            i15 |= o0VarE.r(lVar7) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar7 = lVar3;
        }
        if ((12582912 & i14) == 0) {
            lVar8 = lVar4;
            i15 |= o0VarE.r(lVar8) ? 8388608 : 4194304;
        } else {
            lVar8 = lVar4;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            boolean zB = o0VarE.B(configuration);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = p0.n(Boolean.valueOf(f0.E(configuration)));
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(Boolean.valueOf(f0.E(configuration)));
                    o0VarE.K(objQ);
                }
            }
            z3.e eVarC = z3.f.c(-320978869, new f21.r(tVar, dateTime, z15, iVar2, lVar5, lVar6, lVar7, lVar8, (p1) objQ), o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, eVarC, o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(dateTime, tVar, z14, iVar, lVar, lVar2, lVar3, lVar4, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e6  */
    public static final void f(DateTime dateTime, t tVar, boolean z14, tf0.i iVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super b63.o, Unit> lVar2, e23.l<? super Boolean, Unit> lVar3, e23.l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        int i15;
        e23.l<? super Boolean, Unit> lVar5;
        e23.l<? super b63.o, Unit> lVar6;
        e23.l<? super Boolean, Unit> lVar7;
        o0 o0Var;
        CustomBarChart customBarChart;
        boolean z15;
        boolean z16;
        Integer restStressDuration;
        Integer highStressDuration;
        Integer mediumStressDuration;
        Integer lowStressDuration;
        Throwable th3;
        String strJ;
        o0 o0VarE = mVar.E(-1600167676);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(iVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            lVar5 = lVar;
            i15 |= o0VarE.r(lVar5) ? 16384 : 8192;
        } else {
            lVar5 = lVar;
        }
        if ((196608 & i14) == 0) {
            lVar6 = lVar2;
            i15 |= o0VarE.r(lVar6) ? 131072 : 65536;
        } else {
            lVar6 = lVar2;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            lVar7 = lVar4;
            i15 |= o0VarE.r(lVar7) ? 8388608 : 4194304;
        } else {
            lVar7 = lVar4;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomBarChart(context);
                o0VarE.K(objQ);
            }
            CustomBarChart customBarChart2 = (CustomBarChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                customBarChart = customBarChart2;
                objQ2 = new rz.a(customBarChart, new gt.c(context, false, false, false, false, 30, null), new gt.g(customBarChart2, customBarChart2), new gt.e(customBarChart2, new ub0.h(lVar3, 17)), new gt.f(customBarChart2), null, 32, null);
                o0VarE.K(objQ2);
            } else {
                customBarChart = customBarChart2;
            }
            rz.a aVar = (rz.a) objQ2;
            String strP = y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.title_stress)}, o0VarE);
            boolean z17 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.B(tVar));
            Object objQ3 = o0VarE.q();
            if (z17 || objQ3 == c2565a) {
                if (tVar == null) {
                    z15 = false;
                } else {
                    gs1.e allDayStressDTO = tVar.getAllDayStressDTO();
                    gs1.e.c payload = allDayStressDTO != null ? allDayStressDTO.getPayload() : null;
                    if ((payload != null ? payload.getCalendarDate() : null) == null || tVar.getSleepTimesDTO() == null || payload.g() == null) {
                        gs1.z userDailySummary = tVar.getUserDailySummary();
                        l payload2 = userDailySummary != null ? userDailySummary.getPayload() : null;
                        if (((payload2 == null || (lowStressDuration = payload2.getLowStressDuration()) == null) ? 0 : lowStressDuration.intValue()) > 0) {
                            z16 = true;
                        } else {
                            if (((payload2 == null || (mediumStressDuration = payload2.getMediumStressDuration()) == null) ? 0 : mediumStressDuration.intValue()) > 0) {
                                z16 = true;
                            } else {
                                if (((payload2 == null || (highStressDuration = payload2.getHighStressDuration()) == null) ? 0 : highStressDuration.intValue()) > 0) {
                                    z16 = true;
                                } else {
                                    if (((payload2 == null || (restStressDuration = payload2.getRestStressDuration()) == null) ? 0 : restStressDuration.intValue()) > 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                }
                            }
                        }
                        if (z16) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                }
                objQ3 = hb.a.n(z15, o0VarE);
            }
            p1 p1Var = (p1) objQ3;
            boolean z18 = ((Context) o0VarE.A(y3Var)).getResources().getConfiguration().orientation == 2;
            if (z18) {
                o0VarE.C(-751899662);
                strJ = new pi0.e((Context) o0VarE.A(y3Var)).j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
                o0VarE.g0(false);
                th3 = null;
            } else {
                th3 = null;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -751757093, R.string.lbl_daily_timeline, o0VarE, false);
            }
            String str = strJ;
            String strQ = y.Q(o0VarE, z18 ? R.string.msg_double_tap_to_enable_functions : R.string.msg_press_hold_chart_for_more);
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarD, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            r rVarE = u1.n.e(aVar2, ds.e0.f(o0VarE), m1.f128891a);
            z3.e eVarC = z3.f.c(-763272070, new ds.b(dateTime, iVar, lVar6, lVar5, p1Var, tVar, z14, strQ, lVar3, lVar7, customBarChart, aVar, strP), o0VarE);
            o0Var = o0VarE;
            m92.o.a(rVarE, str, null, null, eVarC, null, null, o0Var, 24576, 108);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(dateTime, tVar, z14, iVar, lVar, lVar2, lVar3, lVar4, i14, 1);
        }
    }

    public static final void g(l lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1932183975);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Integer restStressDuration = lVar != null ? lVar.getRestStressDuration() : null;
            Integer lowStressDuration = lVar != null ? lVar.getLowStressDuration() : null;
            Integer mediumStressDuration = lVar != null ? lVar.getMediumStressDuration() : null;
            Integer highStressDuration = lVar != null ? lVar.getHighStressDuration() : null;
            f02.b0.f67725a.getClass();
            gl.c cVar = gl.c.f77766a;
            cVar.getClass();
            long jB = gl.c.a(o0VarE).b();
            cVar.getClass();
            gl.e eVar = gl.c.f77767b;
            c(restStressDuration, lowStressDuration, R.string.stress_level_rest, R.string.stress_level_low, jB, eVar.K, o0VarE, 0);
            cVar.getClass();
            long j8 = eVar.N;
            cVar.getClass();
            c(mediumStressDuration, highStressDuration, R.string.stress_level_medium, R.string.stress_level_high, j8, eVar.P, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(lVar, i14, 1);
        }
    }
}
