package o53;

import android.content.Context;
import android.content.res.Configuration;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.c3;
import c22.v3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.performance.dto.StrengthStatsDto;
import com.github.mikephil.charting.data.Entry;
import f72.t9;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l72.p2;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f129336a;

    public static final long A(double d14) {
        return H((float) d14, 4294967296L);
    }

    public static final long B(int i14) {
        return H(i14, 4294967296L);
    }

    public static final String C(int i14, ByteBuffer byteBuffer) {
        if (i14 == 0) {
            return "";
        }
        byte[] bArr = new byte[i14];
        byteBuffer.get(bArr);
        return new String(bArr, d53.c.f57666b);
    }

    public static final boolean D(cy0.i iVar) {
        iVar.getClass();
        return (iVar.f56726f == null && iVar.f56727g == null && iVar.f56728h == null && iVar.f56729i == null && iVar.f56730j == null && iVar.f56731k == null && iVar.f56732l == null && iVar.f56733m == null) ? false : true;
    }

    public static final boolean E(Configuration configuration) {
        configuration.getClass();
        return configuration.orientation == 1;
    }

    public static final p3.p1 F(androidx.lifecycle.s0 s0Var, Object obj, p3.m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) mVar.A(s9.j.f158018a);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            if (s0Var.f8014e != androidx.lifecycle.s0.f8009k) {
                obj = s0Var.d();
            }
            objQ = p3.p0.n(obj);
            mVar.K(objQ);
        }
        p3.p1 p1Var = (p3.p1) objQ;
        boolean zR = mVar.r(s0Var) | mVar.r(n0Var);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == c2565a) {
            objQ2 = new a4.a(s0Var, 0, n0Var, p1Var);
            mVar.K(objQ2);
        }
        p3.l0.b(s0Var, n0Var, (e23.l) objQ2, mVar);
        return p1Var;
    }

    public static final p3.p1 G(androidx.lifecycle.s0 s0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        return F(s0Var, s0Var.d(), mVar, 0);
    }

    public static final long H(float f14, long j8) {
        long jFloatToRawIntBits = j8 | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        g6.q.a aVar = g6.q.f76018b;
        return jFloatToRawIntBits;
    }

    public static final c22.h0 I(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        localDate2.getClass();
        return new c22.h0(localDate, localDate2, 0, 4, null);
    }

    public static final boolean J(p43.n0 n0Var) {
        t23.h hVarT = n0Var.F0().t();
        if (hVarT != null && ((b43.j.b(hVarT) && b43.j.e(hVarT) && !f43.e.g((t23.e) hVarT).equals(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105856h)) || b43.j.f(n0Var))) {
            return true;
        }
        t23.h hVarT2 = n0Var.F0().t();
        t23.d1 d1Var = hVarT2 instanceof t23.d1 ? (t23.d1) hVarT2 : null;
        return d1Var != null && J(o72.t.M(d1Var));
    }

    public static final List K(List list) {
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListZ = p13.h0.Z(list);
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListZ, 10));
        int i14 = 0;
        for (Object obj : arrayListZ) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList.add(new wg0.c(i14, (ps.j) obj));
            i14 = i15;
        }
        return arrayList;
    }

    public static final String L(t13.d dVar) {
        Object bVar;
        if (dVar instanceof u53.f) {
            return ((u53.f) dVar).toString();
        }
        try {
            int i14 = o13.q.f128596b;
            bVar = dVar + '@' + u(dVar);
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (o13.q.b(bVar) != null) {
            bVar = dVar.getClass().getName() + '@' + u(dVar);
        }
        return (String) bVar;
    }

    public static final VivoKidAdHocChallengeDTO M(com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var) {
        h0Var.getClass();
        VivoKidAdHocChallengeDTO vivoKidAdHocChallengeDTO = new VivoKidAdHocChallengeDTO();
        vivoKidAdHocChallengeDTO.f37993g = h0Var.getUuid();
        DateTime startDate = h0Var.getStartDate();
        vivoKidAdHocChallengeDTO.f37994h = startDate != null ? startDate.toString(c22.j0.f23101c) : null;
        DateTime dateTimeJ = h0Var.getEndDate();
        vivoKidAdHocChallengeDTO.f37995i = dateTimeJ != null ? dateTimeJ.toString(c22.j0.f23101c) : null;
        Integer numH = h0Var.getChallengeTypeId();
        vivoKidAdHocChallengeDTO.f37987a = numH != null ? numH.intValue() : com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM.f38375a;
        Integer numG = h0Var.getChallengeStatusId();
        vivoKidAdHocChallengeDTO.f37988b = numG != null ? numG.intValue() : com.garmin.android.apps.connectmobile.leaderboard.model.v.UNKNOWN.f38365a;
        Integer numD = h0Var.getChallengeActivityTypeId();
        vivoKidAdHocChallengeDTO.f37989c = numD != null ? numD.intValue() : -1;
        vivoKidAdHocChallengeDTO.f37992f = String.valueOf(h0Var.getOwnerUserProfileId());
        vivoKidAdHocChallengeDTO.f37990d = h0Var.getTeamChallengeName();
        vivoKidAdHocChallengeDTO.f37991e = h0Var.getTeamChallengeDesc();
        Integer numI = h0Var.getDurationTypeId();
        vivoKidAdHocChallengeDTO.f37996j = numI != null ? numI.intValue() : -1;
        return vivoKidAdHocChallengeDTO;
    }

    public static final androidx.lifecycle.j N(e23.l lVar) {
        return androidx.lifecycle.m.a(null, new v3(lVar, null), 3);
    }

    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        rVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-446623319);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(453591188);
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_course_demands);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_see_your_cycling_ability_with_course_demands);
                d50.d.f57519a.getClass();
                p2Var.h(strQ, strQ2, null, rVar, null, false, false, d50.d.f57520b, null, null, aVar, o0VarE, ((i15 << 9) & 7168) | 12582912, (i15 >> 6) & 14, 884);
                o0VarE.g0(false);
            } else {
                o0VarE.C(454155481);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(rVar, z14, aVar, i14, 0);
        }
    }

    public static final void b(wo0.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(-189296343);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.title_conversation_confirm_delete);
            String str = aVar.f186416b;
            if (str == null) {
                str = "";
            }
            c1Var.a(false, strQ, gl1.y.P(R.string.activity_delete_activity_confirm, new Object[]{str}, o0VarE), null, null, gl1.y.Q(o0VarE, R.string.lbl_delete), false, false, aVar2, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar3, o0VarE, (i15 << 21) & 234881024, (i15 >> 6) & 14, 217);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.f0(aVar, aVar2, aVar3, i14, 17);
        }
    }

    public static final void c(c3 c3Var, c3 c3Var2, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -644693482);
        int i15 = (o0VarP.r(c3Var) ? 4 : 2) | i14 | (o0VarP.r(c3Var2) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15;
            l72.c1.f110940a.a(false, gl1.d.T(c3Var, o0VarP, i16 & 14), gl1.d.T(c3Var2, o0VarP, (i16 >> 3) & 14), null, null, gl1.y.Q(o0VarP, R.string.lbl_delete), true, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, ((i16 << 18) & 234881024) | 1572870, (i16 >> 9) & 14, SyslogConstants.LOG_LOCAL3);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(c3Var, c3Var2, aVar, aVar2, i14, 1);
        }
    }

    public static final void d(h4.r rVar, sh0.d dVar, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        int i15;
        Object obj;
        int i16;
        Object obj2;
        rVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(-227123459);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                CustomLineChart customLineChart = new CustomLineChart(context);
                o0VarE.K(customLineChart);
                obj = customLineChart;
            }
            obj = objQ;
            CustomLineChart customLineChart2 = (CustomLineChart) obj;
            Object objQ2 = o0VarE.q();
            Object obj3 = objQ2;
            if (objQ2 == c2565a) {
                tz.a aVar = new tz.a(customLineChart2, new zh0.c(context, new yz.k(DateFormat.is24HourFormat(context)), new xh0.c(context)), new zh0.g(customLineChart2), new zh0.b(customLineChart2, new a40.a(lVar, 23)), new zh0.f(customLineChart2), null, 32, null);
                o0VarE.K(aVar);
                obj3 = aVar;
            }
            tz.a aVar2 = (tz.a) obj3;
            boolean zR = o0VarE.r(customLineChart2);
            Object objQ3 = o0VarE.q();
            Object obj4 = objQ3;
            if (zR || objQ3 == c2565a) {
                b40.a aVar3 = new b40.a(customLineChart2, 1);
                o0VarE.K(aVar3);
                obj4 = aVar3;
            }
            e23.l lVar3 = (e23.l) obj4;
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 290);
            boolean zR2 = ((i15 & 7168) == 2048) | o0VarE.r(customLineChart2);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                i16 = 0;
                ci0.i iVar = new ci0.i(lVar2, customLineChart2, i16);
                o0VarE.K(iVar);
                obj2 = iVar;
            } else {
                i16 = 0;
                obj2 = objQ4;
            }
            h4.r rVarB = wz1.i.b(rVarH, (e23.a) obj2, o0VarE);
            int i17 = (o0VarE.r(aVar2) ? 1 : 0) | (((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(dVar))) ? 1 : i16) | (o0VarE.r(context) ? 1 : 0);
            Object objQ5 = o0VarE.q();
            Object obj5 = objQ5;
            if (i17 != 0 || objQ5 == c2565a) {
                ci0.b bVar = new ci0.b(aVar2, 1, dVar, context);
                o0VarE.K(bVar);
                obj5 = bVar;
            }
            p002j6.c.b(lVar3, rVarB, (e23.l) obj5, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(rVar, dVar, lVar, lVar2, i14, 29);
        }
    }

    public static final void e(String str, boolean z14, boolean z15, boolean z16, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1375973611);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z16) ? 2048 : 1024;
        }
        int i16 = i15 | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            z02.d.a(z14, z3.f.c(945803846, new af1.g(z16, str, aVar, 8, (byte) 0), o0VarE), null, null, null, z3.f.c(1688620994, new a42.e(z15, aVar2, 3), o0VarE), o0VarE, ((i16 >> 3) & 14) | 196656, 28);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ew0.e(str, z14, z15, z16, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    public static final void f(g21.l lVar, List list, e23.l lVar2, p3.m mVar, int i14) {
        int i15;
        int i16;
        int i17;
        list.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(626081904);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0VarE.C(873895072);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (true) {
                int i18 = 3;
                if (!it.hasNext()) {
                    o0VarE.g0(false);
                    p3.x1 x1Var2 = p3.n.f135158a;
                    i53.c cVarE = i53.a.e(arrayList);
                    e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
                    f82.b bVar = new f82.b();
                    boolean zR = ((i15 & 896) == 256) | o0VarE.r(list);
                    Object objQ = o0VarE.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        objQ = new c42.e0(list, lVar2, i18);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c42.e0(list, lVar2, i18);
                            o0VarE.K(objQ);
                        }
                    }
                    e82.a.b(cVarE, bVar, i0VarA, null, null, (e23.p) objQ, o0VarE, 0, 24);
                    boolean zR2 = o0VarE.r(list) | ((i15 & 14) == 4) | o0VarE.B(i0VarA);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new f21.p(list, lVar, i0VarA, null);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f21.p(list, lVar, i0VarA, null);
                            o0VarE.K(objQ2);
                        }
                    }
                    p3.l0.e((e23.p) objQ2, lVar, o0VarE);
                    break;
                }
                g21.l lVar3 = (g21.l) it.next();
                lVar3.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                int i19 = g21.l.a.f75453a[lVar3.ordinal()];
                if (i19 == 1) {
                    i16 = 612340991;
                    i17 = R.string.common_all;
                } else if (i19 == 2) {
                    i16 = 612343036;
                    i17 = R.string.protein;
                } else if (i19 == 3) {
                    i16 = 612344856;
                    i17 = R.string.fat;
                } else if (i19 == 4) {
                    i16 = 612346618;
                    i17 = R.string.carbs;
                } else {
                    if (i19 != 5) {
                        throw kg.f.h(o0VarE, 612340210, false);
                    }
                    i16 = 612348446;
                    i17 = R.string.lbl_other;
                }
                arrayList.add(new l72.j0(com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false), null, null, false, lVar3 == lVar, 14, null));
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(lVar, list, lVar2, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    public static final void g(List list, boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 2083597196);
        int i15 = i14 | (o0VarP.r(list) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(aVar2) ? 2048 : 1024);
        int i16 = 1;
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = (list == null || list.isEmpty()) && !z14;
            Integer numValueOf = Integer.valueOf(R.string.lbl_add_move);
            boolean z16 = (i15 & 896) == 256;
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z16) {
                objQ = new defpackage.c(aVar, 25);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 25);
                    o0VarP.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean z17 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarP.q();
            if (z17) {
                objQ2 = new defpackage.c(aVar2, 26);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new defpackage.c(aVar2, 26);
                    o0VarP.K(objQ2);
                }
            }
            e23.a aVar5 = (e23.a) objQ2;
            as.a.f12615a.getClass();
            as.k.c(R.string.lbl_common_moves, numValueOf, z14, aVar4, aVar5, as.a.f12617c, z15 ? null : new z3.e(-393938391, true, new a31.b(list, i16)), o0VarP, 196608 | ((i15 << 3) & 896), 0);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.g(list, z14, aVar, aVar2, i14, 1);
        }
    }

    public static final void h(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 1816360468);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1.f110940a.a(false, null, gl1.y.Q(o0VarP, R.string.lbl_pacepro_delete_message), null, null, gl1.y.Q(o0VarP, R.string.lbl_yes), true, false, aVar2, gl1.y.Q(o0VarP, R.string.lbl_no), aVar, o0VarP, ((i15 << 21) & 234881024) | 1572870, i15 & 14, 154);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 13);
        }
    }

    public static final void i(e23.a aVar, p3.m mVar, int i14) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1868527719);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.photo_upload_canceled), gl1.y.Q(o0VarE, R.string.review_published_incomplete_photos_message), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.g(aVar, i14, 6);
        }
    }

    public static final ArrayList j(List list) {
        StrengthStatsDto strengthStatsDto;
        LocalDate localDate;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw1.s sVar = (yw1.s) it.next();
            String strA = sVar.getCalendarDate();
            if (strA == null || (localDate = LocalDate.parse(strA)) == null) {
                strengthStatsDto = null;
            } else {
                List<yw1.t> listB = sVar.b();
                if (listB == null) {
                    listB = p13.j0.f134944a;
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(listB, 10));
                for (yw1.t tVar : listB) {
                    String strB = tVar.getCategory();
                    if (strB == null) {
                        strB = "";
                    }
                    String strC = tVar.getSubCategory();
                    Integer numD = tVar.getTotalReps();
                    int iIntValue = numD != null ? numD.intValue() : 0;
                    Integer numE = tVar.getTotalSets();
                    int iIntValue2 = numE != null ? numE.intValue() : 0;
                    Integer numA = tVar.getActiveSets();
                    int iIntValue3 = numA != null ? numA.intValue() : 0;
                    Double dF = tVar.getTotalTimeInSeconds();
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = dF != null ? dF.doubleValue() : 0.0d;
                    Double dG = tVar.getTotalVolume();
                    if (dG != null) {
                        dDoubleValue = dG.doubleValue();
                    }
                    arrayList2.add(new com.garmin.android.apps.connectmobile.performance.dto.d(strB, strC, iIntValue, iIntValue2, iIntValue3, dDoubleValue2, dDoubleValue, null, null));
                }
                strengthStatsDto = new StrengthStatsDto(localDate, arrayList2);
            }
            if (strengthStatsDto != null) {
                arrayList.add(strengthStatsDto);
            }
        }
        return arrayList;
    }

    public static b.v k(b.u uVar, androidx.lifecycle.n0 n0Var, e23.l lVar, int i14) {
        if ((i14 & 1) != 0) {
            n0Var = null;
        }
        uVar.getClass();
        b.v vVar = new b.v(true, lVar);
        if (n0Var != null) {
            uVar.b(vVar, n0Var);
            return vVar;
        }
        uVar.a(vVar);
        return vVar;
    }

    public static final void l(ArrayList arrayList, Context context, int i14, int i15, DateTime dateTime, float f14, rl1.i iVar) {
        zz.l lVar;
        zz.l lVar2;
        int i16 = i14;
        context.getClass();
        iVar.getClass();
        DateTime dateTimePlusMinutes = dateTime.plusMinutes(i16);
        DateTime dateTimePlusMinutes2 = dateTime.plusMinutes(i15);
        if (i16 > i15) {
            return;
        }
        while (true) {
            float f15 = i16;
            em1.d dVar = em1.d.f64623a;
            dateTimePlusMinutes.getClass();
            dateTimePlusMinutes2.getClass();
            dVar.getClass();
            Integer numValueOf = Integer.valueOf(R.color.gcm_chart_default_data_set);
            switch (em1.d.a.f64624a[iVar.ordinal()]) {
                case 1:
                    b10.d dVar2 = new b10.d(context);
                    lVar = new zz.l(null, dVar2.a(Integer.valueOf((int) f14)), dVar2.f14215a.getString(R.string.lbl_breathing_variations), null, null, numValueOf, null, null, 217, null);
                    lVar2 = lVar;
                    break;
                case 2:
                    w00.b bVar = new w00.b(new l22.a(context));
                    new jz.a(new l22.a(context));
                    LocalTime localTime = dateTimePlusMinutes.toLocalTime();
                    localTime.getClass();
                    LocalTime localTime2 = dateTimePlusMinutes2.toLocalTime();
                    localTime2.getClass();
                    lVar = new zz.l(jz.a.d(localTime, localTime2, context), bVar.d((int) f14, false), bVar.f180999a.getString(R.string.lbl_resting_hr), bVar.j(), null, numValueOf, null, null, 208, null);
                    lVar2 = lVar;
                    break;
                case 3:
                    v00.a aVar = new v00.a(new l22.a(context));
                    new jz.a(new l22.a(context));
                    LocalTime localTime3 = dateTimePlusMinutes.toLocalTime();
                    localTime3.getClass();
                    LocalTime localTime4 = dateTimePlusMinutes2.toLocalTime();
                    localTime4.getClass();
                    String strD = jz.a.d(localTime3, localTime4, context);
                    int i17 = (int) f14;
                    l22.b bVar2 = aVar.f174198a;
                    lVar = new zz.l(strD, i17 > 0 ? String.valueOf(i17) : bVar2.getString(R.string.no_value), bVar2.getString(R.string.gcm_body_battery_lbl_body_battery), null, null, numValueOf, null, null, 216, null);
                    lVar2 = lVar;
                    break;
                case 4:
                    a10.a aVar2 = new a10.a(context);
                    new jz.a(new l22.a(context));
                    LocalTime localTime5 = dateTimePlusMinutes.toLocalTime();
                    localTime5.getClass();
                    LocalTime localTime6 = dateTimePlusMinutes2.toLocalTime();
                    localTime6.getClass();
                    lVar = new zz.l(jz.a.d(localTime5, localTime6, context), aVar2.d(Float.valueOf(f14), false, false), aVar2.f242a.getString(R.string.activities_respiration_rate), aVar2.f244c, null, numValueOf, null, null, 208, null);
                    lVar2 = lVar;
                    break;
                case 5:
                    a10.a aVar3 = new a10.a(context);
                    new jz.a(new l22.a(context));
                    LocalTime localTime7 = dateTimePlusMinutes.toLocalTime();
                    localTime7.getClass();
                    LocalTime localTime8 = dateTimePlusMinutes2.toLocalTime();
                    localTime8.getClass();
                    lVar = new zz.l(jz.a.d(localTime7, localTime8, context), aVar3.d(Float.valueOf(f14), false, false), aVar3.f242a.getString(R.string.activities_avg_respiration_rate_title), aVar3.f244c, null, numValueOf, null, null, 208, null);
                    lVar2 = lVar;
                    break;
                case 6:
                    y00.a aVar4 = new y00.a(new l22.a(context));
                    new jz.a(new l22.a(context));
                    LocalTime localTime9 = dateTimePlusMinutes.toLocalTime();
                    localTime9.getClass();
                    LocalTime localTime10 = dateTimePlusMinutes2.toLocalTime();
                    localTime10.getClass();
                    String strD2 = jz.a.d(localTime9, localTime10, context);
                    String strValueOf = String.valueOf((int) f14);
                    l22.b bVar3 = aVar4.f192984a;
                    lVar = new zz.l(strD2, strValueOf, bVar3.getString(R.string.lbl_overnight_hrv), bVar3.getString(R.string.lbl_ms), null, numValueOf, null, null, 208, null);
                    lVar2 = lVar;
                    break;
                default:
                    lVar2 = null;
                    break;
            }
            arrayList.add(new Entry(f15, f14, lVar2));
            if (i16 == i15) {
                return;
            } else {
                i16++;
            }
        }
    }

    public static final void m(ArrayList arrayList, Context context, int i14, int i15, DateTime dateTime, int i16, float f14, rl1.i iVar) {
        context.getClass();
        iVar.getClass();
        if (i16 <= 0) {
            vb.h.s(v.e0.f(i16, "Step must be positive, was: ", "."));
            return;
        }
        int iN = w5.r.n(i14, i15, i16);
        if (i14 > iN) {
            return;
        }
        while (true) {
            int i17 = i14;
            i14 = i17 + i16;
            int i18 = i14 - 1;
            l(arrayList, context, i17, i18 <= i15 ? i18 : i15, dateTime, f14, iVar);
            if (i17 == iN) {
                return;
            }
            arrayList = arrayList;
            context = context;
            dateTime = dateTime;
            f14 = f14;
            iVar = iVar;
        }
    }

    public static final void n(long j8) {
        g6.q.a aVar = g6.q.f76018b;
        if ((j8 & 1095216660480L) == 0) {
            g6.j.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void o(long j8, long j14) {
        g6.q.a aVar = g6.q.f76018b;
        if (!(((j8 & 1095216660480L) == 0 || (1095216660480L & j14) == 0) ? false : true)) {
            g6.j.a("Cannot perform operation for Unspecified type.");
        }
        if (g6.r.b(g6.q.c(j8), g6.q.c(j14))) {
            return;
        }
        g6.j.a("Cannot perform operation for " + ((Object) g6.r.c(g6.q.c(j8))) + " and " + ((Object) g6.r.c(g6.q.c(j14))));
    }

    public static final fw.p p(fw.m mVar, fw.m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        fw.p pVar = mVar.f73769b;
        return pVar != fw.p.SUCCESS ? pVar : mVar2.f73769b;
    }

    public static final ArrayList q(k30.x xVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        ArrayList arrayList;
        xVar.getClass();
        eVar.getClass();
        List<k30.w> listD = xVar.d();
        if (listD == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (k30.w wVar : listD) {
            List<GeoPointDTO> list = eVar.geoPoints;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                    Double d14 = geoPointDTO.distance;
                    if (geoPointDTO.b() && d14 != null) {
                        double d15 = wVar.getStartDistance();
                        double dB = wVar.getEndDistance();
                        double dDoubleValue = d14.doubleValue();
                        if (d15 <= dDoubleValue && dDoubleValue <= dB) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.add(arrayList);
            }
        }
        return arrayList2;
    }

    public static final int r(long j8, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            vb.h.s("List<Long> should not be empty.");
            return 0;
        }
        p13.h0.M0(arrayList);
        int iG = p13.x.g(arrayList, Long.valueOf(j8));
        if (iG >= 0) {
            return iG;
        }
        int i14 = -(iG + 1);
        if (i14 == 0) {
            return 0;
        }
        if (i14 == arrayList.size()) {
            return arrayList.size() - 1;
        }
        int i15 = i14 - 1;
        return Math.abs(j8 - ((Number) arrayList.get(i15)).longValue()) <= Math.abs(j8 - ((Number) arrayList.get(i14)).longValue()) ? i15 : i14;
    }

    public static final wg0.k s(long j8, String str) {
        if (str == null) {
            return null;
        }
        d53.j jVarB = new d53.k("((?<=([vV])/)|(?<=be/)|(?<=([?&])v=)|(?<=embed/))([\\w-]++)").b(0, str);
        String value = jVarB != null ? jVarB.getValue() : null;
        if (value != null) {
            return new wg0.k(j8, value, str);
        }
        return null;
    }

    public static final List t(t9 t9Var) {
        long j8;
        u4.d dVarC;
        t9Var.getClass();
        List list = f129336a;
        if (list != null) {
            return list;
        }
        u4.d dVarC2 = j72.i.f97692a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC2 == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("SkipBack30Sec", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(o4.h1.f128863b, 14.452f, 5.8323f);
            eVarK.d(14.5161f, 5.8271f, 14.5794f, 5.822f, 14.6452f, 5.822f);
            eVarK.d(18.7051f, 5.822f, 22.0f, 9.117f, 22.0f, 13.1768f);
            eVarK.d(22.0f, 17.2366f, 18.7051f, 20.5316f, 14.6452f, 20.5316f);
            q2.w(eVarK, 14.3569f, 18.7664f, 14.6452f);
            eVarK.d(17.7342f, 18.7664f, 20.2349f, 16.2658f, 20.2349f, 13.1768f);
            eVarK.d(20.2349f, 10.0878f, 17.7342f, 7.5872f, 14.6452f, 7.5872f);
            eVarK.d(14.5794f, 7.5872f, 14.5161f, 7.5923f, 14.452f, 7.5974f);
            eVarK.d(14.4187f, 7.6001f, 14.3852f, 7.6028f, 14.351f, 7.6048f);
            u62.z.o(eVarK, 7.5872f, 7.8788f, 9.9407f);
            eVarK.i(2.5893f, 6.7046f);
            tn.k.r(eVarK, 7.8788f, 3.4685f, 5.822f, 14.351f);
            eVarK.o(5.8397f);
            eVarK.d(14.3852f, 5.8377f, 14.4187f, 5.835f, 14.452f, 5.8323f);
            eVarK.c();
            u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(5.9725f, 16.3129f);
            eVarL.d(6.3491f, 16.1364f, 6.6432f, 15.8892f, 6.8609f, 15.5774f);
            eVarL.d(7.0728f, 15.2597f, 7.1846f, 14.9243f, 7.1846f, 14.5713f);
            eVarL.d(7.1846f, 13.8476f, 6.9551f, 13.2827f, 6.4903f, 12.8885f);
            eVarL.d(6.0255f, 12.4943f, 5.4076f, 12.2942f, 4.6427f, 12.2942f);
            eVarL.d(3.872f, 12.2942f, 3.2483f, 12.5002f, 2.7717f, 12.912f);
            eVarL.d(2.2951f, 13.3239f, 2.0656f, 13.8417f, 2.0833f, 14.4536f);
            eVarL.i(2.0951f, 14.4889f);
            eVarL.g(3.3836f);
            eVarL.d(3.3836f, 14.1535f, 3.4954f, 13.877f, 3.7249f, 13.671f);
            eVarL.d(3.9543f, 13.4651f, 4.2603f, 13.3592f, 4.6427f, 13.3592f);
            eVarL.d(5.0252f, 13.3592f, 5.3194f, 13.4651f, 5.5253f, 13.6769f);
            eVarL.d(5.7313f, 13.8887f, 5.8372f, 14.1888f, 5.8372f, 14.5889f);
            eVarL.d(5.8372f, 14.989f, 5.7371f, 15.2891f, 5.543f, 15.495f);
            eVarL.d(5.3488f, 15.7068f, 5.037f, 15.8245f, 4.6133f, 15.8245f);
            q2.w(eVarL, 3.7661f, 17.0013f, 4.3545f);
            eVarL.d(4.4107f, 17.0013f, 4.469f, 17.0007f, 4.5285f, 17.0002f);
            eVarL.d(4.9547f, 16.9963f, 5.4402f, 16.9919f, 5.6312f, 17.1778f);
            eVarL.d(5.8489f, 17.3896f, 5.9607f, 17.7132f, 5.9607f, 18.1486f);
            eVarL.d(5.9607f, 18.584f, 5.8431f, 18.9135f, 5.6077f, 19.1312f);
            eVarL.d(5.3724f, 19.3548f, 5.0487f, 19.4666f, 4.6369f, 19.4666f);
            eVarL.d(4.2309f, 19.4666f, 3.9073f, 19.3548f, 3.666f, 19.1371f);
            eVarL.d(3.4248f, 18.9194f, 3.3071f, 18.6311f, 3.3071f, 18.2722f);
            eVarL.g(2.0127f);
            eVarL.i(2.0009f, 18.3016f);
            eVarL.d(1.9833f, 18.9841f, 2.2186f, 19.5254f, 2.707f, 19.9255f);
            eVarL.d(3.2012f, 20.3315f, 3.8426f, 20.5316f, 4.6251f, 20.5316f);
            eVarL.d(5.4135f, 20.5316f, 6.0549f, 20.3197f, 6.5491f, 19.8961f);
            eVarL.d(7.0434f, 19.4725f, 7.2964f, 18.8959f, 7.2964f, 18.1722f);
            eVarL.d(7.2964f, 17.7309f, 7.1846f, 17.3484f, 6.9669f, 17.0307f);
            eVarL.d(6.7492f, 16.7071f, 6.4197f, 16.4717f, 5.9725f, 16.3129f);
            eVarL.c();
            u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            int i14 = o4.h1.f128864c;
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(10.5266f, 12.2942f);
            eVarL2.d(9.6969f, 12.2942f, 9.0497f, 12.5708f, 8.5849f, 13.1238f);
            eVarL2.d(8.1201f, 13.6769f, 7.8847f, 14.4712f, 7.8847f, 15.495f);
            eVarL2.o(17.3308f);
            eVarL2.d(7.8847f, 18.3663f, 8.1201f, 19.1606f, 8.5849f, 19.7078f);
            eVarL2.d(9.0556f, 20.255f, 9.7028f, 20.5316f, 10.5383f, 20.5316f);
            eVarL2.d(11.368f, 20.5316f, 12.0211f, 20.255f, 12.4859f, 19.7078f);
            eVarL2.d(12.9507f, 19.1606f, 13.1802f, 18.3663f, 13.1802f, 17.3308f);
            eVarL2.o(15.495f);
            eVarL2.d(13.1802f, 14.4712f, 12.9448f, 13.6769f, 12.4741f, 13.1238f);
            eVarL2.d(12.0034f, 12.5708f, 11.3562f, 12.2942f, 10.5266f, 12.2942f);
            eVarL2.c();
            eVarL2.k(11.8328f, 17.5249f);
            eVarL2.d(11.8328f, 18.8194f, 11.4033f, 19.4607f, 10.5442f, 19.4607f);
            eVarL2.d(9.6675f, 19.4607f, 9.2321f, 18.8135f, 9.2321f, 17.5249f);
            eVarL2.o(15.295f);
            eVarL2.d(9.2321f, 14.0064f, 9.6675f, 13.3651f, 10.5325f, 13.3651f);
            eVarL2.d(11.3974f, 13.3651f, 11.8328f, 14.0064f, 11.8328f, 15.295f);
            eVarL2.o(17.5249f);
            eVarL2.c();
            u4.d.a.b(aVar2, eVarL2.f168407a, i14, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar2.c();
            j72.i.f97692a = dVarC2;
        }
        u4.d dVar = dVarC2;
        u4.d dVarC3 = j72.c.f97686a;
        if (dVarC3 != null) {
            j8 = 4278190080L;
        } else {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("Repeat1", f15, f15, 24.0f, 24.0f, 0L, 0, false, 96, null);
            j8 = 4278190080L;
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            o4.h1.f128863b.getClass();
            int i15 = o4.h1.f128864c;
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(18.395f, 2.7f);
            eVarL3.d(19.2f, 3.165f, 19.835f, 3.8f, 20.3f, 4.605f);
            eVarL3.d(20.765f, 5.41f, 21.0f, 6.295f, 21.0f, 7.25f);
            eVarL3.d(21.0f, 8.21f, 20.765f, 9.09f, 20.3f, 9.895f);
            eVarL3.d(19.835f, 10.7f, 19.2f, 11.335f, 18.395f, 11.8f);
            eVarL3.d(17.59f, 12.265f, 16.705f, 12.5f, 15.75f, 12.5f);
            eVarL3.d(14.79f, 12.5f, 13.91f, 12.265f, 13.105f, 11.8f);
            eVarL3.d(12.3f, 11.335f, 11.665f, 10.7f, 11.2f, 9.895f);
            eVarL3.d(10.735f, 9.09f, 10.5f, 8.205f, 10.5f, 7.25f);
            eVarL3.d(10.5f, 6.295f, 10.735f, 5.41f, 11.2f, 4.605f);
            eVarL3.d(11.665f, 3.8f, 12.3f, 3.165f, 13.105f, 2.7f);
            eVarL3.d(13.91f, 2.235f, 14.795f, 2.0f, 15.75f, 2.0f);
            eVarL3.d(16.705f, 2.0f, 17.59f, 2.235f, 18.395f, 2.7f);
            u62.z.w(eVarL3, 15.5f, 10.0f, 16.5f, 4.0f);
            eVarL3.g(15.395f);
            eVarL3.o(4.1f);
            eVarL3.d(15.395f, 4.36f, 15.205f, 4.625f, 15.045f, 4.77f);
            eVarL3.d(14.99f, 4.825f, 14.915f, 4.875f, 14.815f, 4.92f);
            eVarL3.d(14.815f, 4.92f, 14.61f, 5.05f, 14.41f, 5.09f);
            eVarL3.d(14.355f, 5.105f, 14.255f, 5.11f, 14.12f, 5.11f);
            v.e0.x(eVarL3, 14.0f, 6.0f, 15.5f, 10.0f);
            u4.d.a.b(aVar4, eVarL3.f168407a, i15, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(14.0f, 20.5f);
            eVarL4.d(14.0f, 21.3284f, 13.3284f, 22.0f, 12.5f, 22.0f);
            eVarL4.d(11.6716f, 22.0f, 11.0f, 21.3284f, 11.0f, 20.5f);
            eVarL4.d(11.0f, 19.6716f, 11.6716f, 19.0f, 12.5f, 19.0f);
            eVarL4.d(13.3284f, 19.0f, 14.0f, 19.6716f, 14.0f, 20.5f);
            eVarL4.c();
            u4.d.a.b(aVar4, eVarL4.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL5 = com.nimbusds.jose.shaded.gson.internal.a.l(15.5f, 15.5f);
            eVarL5.d(15.48f, 15.5f, 15.4587f, 15.4987f, 15.4375f, 15.4975f);
            eVarL5.d(15.4163f, 15.4963f, 15.395f, 15.495f, 15.375f, 15.495f);
            eVarL5.d(15.355f, 15.495f, 15.3338f, 15.4962f, 15.3126f, 15.4975f);
            eVarL5.d(15.2913f, 15.4987f, 15.27f, 15.5f, 15.25f, 15.5f);
            eVarL5.d(15.1941f, 15.5f, 15.1403f, 15.4957f, 15.0858f, 15.4913f);
            eVarL5.d(15.0576f, 15.489f, 15.0291f, 15.4867f, 15.0f, 15.485f);
            u62.z.o(eVarL5, 15.5f, 9.5f, 13.5f);
            eVarL5.i(5.0f, 16.25f);
            tn.k.r(eVarL5, 9.5f, 19.0f, 17.0f, 15.5f);
            eVarL5.o(16.985f);
            eVarL5.d(17.74f, 16.89f, 19.64f, 15.515f, 20.505f, 13.575f);
            eVarL5.d(19.175f, 14.77f, 17.425f, 15.5f, 15.5f, 15.5f);
            eVarL5.c();
            u4.d.a.b(aVar4, eVarL5.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVar = new u4.e();
            eVar.k(8.0f, 5.56f);
            eVar.o(7.07f);
            eVar.d(6.01f, 7.425f, 4.5f, 9.16f, 4.5f, 11.25f);
            eVar.d(4.5f, 11.78f, 4.6f, 12.29f, 4.78f, 12.76f);
            eVar.i(3.395f, 13.335f);
            eVar.d(3.145f, 12.69f, 3.0f, 11.985f, 3.0f, 11.25f);
            eVar.d(3.0f, 8.33f, 5.18f, 5.925f, 8.0f, 5.56f);
            eVar.c();
            u4.d.a.b(aVar4, eVar.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar4.c();
            j72.c.f97686a = dVarC3;
        }
        u4.d dVarC4 = j72.n.f97697a;
        if (dVarC4 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("Track", f16, f16, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(j8), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarE = u62.z.e(o4.h1.f128863b, 11.0278f, 2.0f, 15.35f);
            eVarE.d(10.4667f, 14.9889f, 9.8f, 14.7778f, 9.0833f, 14.7778f);
            eVarE.d(7.0889f, 14.7778f, 5.4722f, 16.3944f, 5.4722f, 18.3889f);
            eVarE.d(5.4722f, 20.3833f, 7.0889f, 22.0f, 9.0833f, 22.0f);
            eVarE.d(11.0778f, 22.0f, 12.6945f, 20.3833f, 12.6945f, 18.3889f);
            eVarE.d(12.6945f, 18.2944f, 12.6889f, 18.2f, 12.6778f, 18.1056f);
            eVarE.i(12.6945f, 18.1111f);
            eVarE.o(5.3333f);
            eVarE.i(17.6945f, 8.6667f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 18.5278f, 7.2778f, 11.0278f, 2.0f);
            eVarE.k(9.0833f, 20.3333f);
            eVarE.d(8.0111f, 20.3333f, 7.1389f, 19.4611f, 7.1389f, 18.3889f);
            eVarE.d(7.1389f, 17.3167f, 8.0111f, 16.4444f, 9.0833f, 16.4444f);
            eVarE.d(10.1556f, 16.4444f, 11.0278f, 17.3167f, 11.0278f, 18.3889f);
            eVarE.d(11.0278f, 19.4611f, 10.1556f, 20.3333f, 9.0833f, 20.3333f);
            eVarE.c();
            u4.d.a.b(aVar6, eVarE.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar6.c();
            j72.n.f97697a = dVarC4;
        }
        u4.d dVarC5 = j72.j.f97693a;
        if (dVarC5 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("SkipBack", f17, f17, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(j8), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL6 = b71.i.l(o4.h1.f128863b, 13.2929f, 7.3572f, 5.5714f, 11.2857f);
            u62.z.y(eVarL6, 2.7143f, 2.0f, 21.2857f, 5.5714f);
            eVarL6.o(12.7143f);
            eVarL6.i(13.2929f, 16.6429f);
            eVarL6.i(22.0f, 21.2857f);
            u62.z.t(eVarL6, 2.7143f, 13.2929f, 7.3572f);
            u4.d.a.b(aVar8, eVarL6.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar8.c();
            j72.j.f97693a = dVarC5;
        }
        u4.d dVar2 = dVarC5;
        u4.d dVar3 = j72.g.f97690a;
        if (dVar3 != null) {
            dVarC = dVar3;
        } else {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("ShuffleOff", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var10 = new o4.t1(o4.f0.d(j8), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarE2 = u62.z.e(o4.h1.f128863b, 16.5f, 7.02f, 9.0f);
            eVarE2.i(21.0f, 6.25f);
            eVarE2.i(16.5f, 3.5f);
            eVarE2.o(5.52f);
            eVarE2.d(16.35f, 5.495f, 12.845f, 5.02f, 9.38f, 10.34f);
            eVarE2.d(6.0f, 15.285f, 3.03f, 15.505f, 3.0f, 15.5f);
            eVarE2.o(17.0f);
            eVarE2.d(3.008f, 17.0016f, 3.0134f, 17.0001f, 3.0236f, 16.9974f);
            eVarE2.d(3.0453f, 16.9916f, 3.0887f, 16.98f, 3.225f, 16.98f);
            eVarE2.d(4.24f, 16.98f, 7.305f, 16.035f, 10.63f, 11.17f);
            eVarE2.d(13.535f, 6.71f, 16.395f, 7.005f, 16.5f, 7.02f);
            eVarE2.c();
            u4.d.a.b(aVar10, eVarE2.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var11 = new o4.t1(o4.f0.d(j8), jVar);
            u4.e eVarL7 = com.nimbusds.jose.shaded.gson.internal.a.l(16.5f, 15.48f);
            eVarL7.d(16.42f, 15.49f, 14.9f, 15.64f, 12.965f, 14.035f);
            eVarL7.i(11.885f, 15.115f);
            eVarL7.d(14.36f, 17.27f, 16.385f, 16.995f, 16.5f, 16.975f);
            eVarL7.o(19.0f);
            eVarL7.i(21.0f, 16.25f);
            sn.a.w(eVarL7, 16.5f, 13.5f, 15.48f);
            u4.d.a.b(aVar10, eVarL7.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var12 = new o4.t1(o4.f0.d(j8), jVar);
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(8.125f, 7.875f, 7.06f, 8.94f);
            eVarM.d(4.75f, 6.835f, 3.02f, 6.995f, 3.0f, 7.0f);
            eVarM.o(5.5f);
            eVarM.d(3.008f, 5.4984f, 3.0134f, 5.4998f, 3.0236f, 5.5026f);
            eVarM.d(3.0453f, 5.5084f, 3.0887f, 5.52f, 3.225f, 5.52f);
            eVarM.d(3.975f, 5.52f, 5.85f, 5.77f, 8.125f, 7.875f);
            eVarM.c();
            u4.d.a.b(aVar10, eVarM.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar10.c();
            j72.g.f97690a = dVarC;
        }
        t9Var.getClass();
        u4.d dVarC6 = j72.h.f97691a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("ShuffleOn", f19, f19, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var13 = new o4.t1(o4.f0.d(j8), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarE3 = u62.z.e(o4.h1.f128863b, 16.5f, 9.0f, 7.02f);
            eVarE3.d(16.395f, 7.005f, 13.535f, 6.71f, 10.63f, 11.17f);
            eVarE3.d(7.305f, 16.035f, 4.24f, 16.98f, 3.225f, 16.98f);
            eVarE3.d(3.0887f, 16.98f, 3.0453f, 16.9916f, 3.0236f, 16.9974f);
            eVarE3.d(3.0134f, 17.0001f, 3.008f, 17.0016f, 3.0f, 17.0f);
            eVarE3.o(15.5f);
            eVarE3.d(3.03f, 15.505f, 6.0f, 15.285f, 9.38f, 10.34f);
            eVarE3.d(12.845f, 5.02f, 16.35f, 5.495f, 16.5f, 5.52f);
            eVarE3.o(3.5f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE3, 21.0f, 6.25f, 16.5f, 9.0f);
            u4.d.a.b(aVar12, eVarE3.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var14 = new o4.t1(o4.f0.d(j8), jVar);
            u4.e eVarL8 = com.nimbusds.jose.shaded.gson.internal.a.l(12.965f, 14.035f);
            eVarL8.d(14.9f, 15.64f, 16.42f, 15.49f, 16.5f, 15.48f);
            eVarL8.o(13.5f);
            eVarL8.i(21.0f, 16.25f);
            eVarL8.i(16.5f, 19.0f);
            eVarL8.o(16.975f);
            eVarL8.d(16.385f, 16.995f, 14.36f, 17.27f, 11.885f, 15.115f);
            eVarL8.i(12.965f, 14.035f);
            eVarL8.c();
            u4.d.a.b(aVar12, eVarL8.f168407a, 0, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var15 = new o4.t1(o4.f0.d(j8), jVar);
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(7.06f, 8.94f, 8.125f, 7.875f);
            eVarM2.d(5.85f, 5.77f, 3.975f, 5.52f, 3.225f, 5.52f);
            eVarM2.d(3.0887f, 5.52f, 3.0453f, 5.5084f, 3.0236f, 5.5026f);
            eVarM2.d(3.0134f, 5.4998f, 3.008f, 5.4984f, 3.0f, 5.5f);
            eVarM2.o(7.0f);
            eVarM2.d(3.02f, 6.995f, 4.75f, 6.835f, 7.06f, 8.94f);
            eVarM2.c();
            u4.d.a.b(aVar12, eVarM2.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var16 = new o4.t1(o4.f0.d(j8), jVar);
            u4.e eVarL9 = com.nimbusds.jose.shaded.gson.internal.a.l(13.5f, 20.5f);
            eVarL9.d(13.5f, 21.3284f, 12.8284f, 22.0f, 12.0f, 22.0f);
            eVarL9.d(11.1716f, 22.0f, 10.5f, 21.3284f, 10.5f, 20.5f);
            eVarL9.d(10.5f, 19.6716f, 11.1716f, 19.0f, 12.0f, 19.0f);
            eVarL9.d(12.8284f, 19.0f, 13.5f, 19.6716f, 13.5f, 20.5f);
            eVarL9.c();
            u4.d.a.b(aVar12, eVarL9.f168407a, 0, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            j72.h.f97691a = dVarC6;
        }
        u4.d dVar4 = dVarC6;
        u4.d dVarA = j72.d.a(t9Var);
        u4.d dVarA2 = j72.b.a(t9Var);
        u4.d dVarA3 = j72.m.a(t9Var);
        u4.d dVarC7 = j72.l.f97695a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("SkipForward", f22, f22, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var17 = new o4.t1(o4.f0.d(j8), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL10 = b71.i.l(o4.h1.f128863b, 10.7071f, 7.3572f, 18.4286f, 11.2857f);
            u62.z.y(eVarL10, 2.7143f, 22.0f, 21.2857f, 18.4286f);
            eVarL10.o(12.7143f);
            eVarL10.i(10.7071f, 16.6429f);
            eVarL10.i(2.0f, 21.2857f);
            u62.z.t(eVarL10, 2.7143f, 10.7071f, 7.3572f);
            u4.d.a.b(aVar14, eVarL10.f168407a, 0, t1Var17, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            j72.l.f97695a = dVarC7;
        }
        List listK = p13.x.k(dVar, dVarC3, dVarC4, dVar2, dVarC, dVar4, dVarA, dVarA2, dVarA3, dVarC7, j72.e.a(t9Var), j72.a.a(t9Var), j72.k.a(t9Var), j72.o.a(t9Var), j72.p.a(t9Var), j72.f.a(t9Var));
        f129336a = listK;
        listK.getClass();
        return listK;
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, p13.j0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.ArrayList] */
    public static final List v(dc1.a aVar) {
        aVar.getClass();
        DateTimeZone dateTimeZoneB = nz.a.b(aVar.h(), aVar.i());
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = p13.j0.f134944a;
        ArrayList<dc1.e> arrayListQ = aVar.q();
        if (arrayListQ != null && !arrayListQ.isEmpty()) {
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                if (((dc1.e) it.next()).f59145b > 0.0d) {
                    ?? arrayList = new ArrayList(p13.y.r(arrayListQ, 10));
                    for (dc1.e eVar : arrayListQ) {
                        arrayList.add(new hz.d(new DateTime(eVar.f59144a, dateTimeZoneB), (float) eVar.f59145b));
                    }
                    r0Var.f105810a = arrayList;
                    break;
                }
            }
        }
        return (List) r0Var.f105810a;
    }

    public static final androidx.lifecycle.i0 w(androidx.lifecycle.n0 n0Var) {
        n0Var.getClass();
        androidx.lifecycle.b0 lifecycle = n0Var.getF158016a();
        lifecycle.getClass();
        androidx.lifecycle.b<Object> bVar = lifecycle.f7830a;
        while (true) {
            androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) bVar.f7829a.get();
            if (i0Var != null) {
                return i0Var;
            }
            e2 e2VarH = ge1.b.h();
            x53.c cVar = s0.f129406a;
            androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0(lifecycle, t13.g.a.C3052a.d(u53.o.f168762a.H(), e2VarH));
            AtomicReference<Object> atomicReference = bVar.f7829a;
            do {
                if (atomicReference.compareAndSet(null, i0Var2)) {
                    x53.c cVar2 = s0.f129406a;
                    ge1.b.T(i0Var2, u53.o.f168762a.H(), null, new androidx.lifecycle.h0(i0Var2, null), 2);
                    return i0Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final t9 x(t62.c cVar) {
        cVar.getClass();
        return t9.f69810a;
    }

    public static final long y(be1.c cVar) {
        cVar.getClass();
        long j8 = cVar.f17742a;
        DateTime dateTime = new DateTime(j8);
        return dateTime.getMinuteOfHour() != 0 ? dateTime.plusHours(1).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0).getMillis() : j8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, p13.j0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.ArrayList] */
    public static final List z(dc1.a aVar) {
        aVar.getClass();
        DateTimeZone dateTimeZoneB = nz.a.b(aVar.h(), aVar.i());
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = p13.j0.f134944a;
        ArrayList<hc1.c> arrayListR = aVar.r();
        if (arrayListR != null && !arrayListR.isEmpty()) {
            Iterator it = arrayListR.iterator();
            while (it.hasNext()) {
                if (((hc1.c) it.next()).f83278b > 0.0d) {
                    ?? arrayList = new ArrayList(p13.y.r(arrayListR, 10));
                    for (hc1.c cVar : arrayListR) {
                        arrayList.add(new hz.d(new DateTime(cVar.f83277a, dateTimeZoneB), (float) cVar.f83278b));
                    }
                    r0Var.f105810a = arrayList;
                    break;
                }
            }
        }
        return (List) r0Var.f105810a;
    }
}
