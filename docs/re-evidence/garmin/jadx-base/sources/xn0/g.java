package xn0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.l;
import c2.x2;
import c2.z;
import c22.b0;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import in0.k;
import java.util.ArrayList;
import java.util.Locale;
import lc.u0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    public static final void a(in0.h.a.C1802a.EnumC1803a enumC1803a, k kVar, m mVar, int i14) {
        int i15;
        int i16;
        enumC1803a.getClass();
        o0 o0VarE = mVar.E(-1360272012);
        int i17 = 4;
        int i18 = 2;
        int i19 = (o0VarE.k(enumC1803a.ordinal()) ? 4 : 2) | i14 | (o0VarE.k(kVar == null ? -1 : kVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            rn0.a aVar = rn0.a.f153638a;
            l22.a aVarS = a0.s(o0VarE);
            aVar.getClass();
            int i24 = rn0.a.C2909a.f153640b[enumC1803a.ordinal()];
            if (i24 == 1) {
                i15 = R.string.lbl_below_range_message;
            } else if (i24 == 2) {
                i15 = R.string.lbl_above_range_message;
            } else {
                if (i24 != 3) {
                    u0.r();
                    return;
                }
                i15 = R.string.lbl_within_range_message;
            }
            String string = aVarS.getString(i15);
            s5.c cVarB = null;
            if (kVar == null) {
                o0VarE.C(-846682433);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-846682432);
                int[] iArr = rn0.a.C2909a.f153641c;
                int i25 = iArr[kVar.ordinal()];
                Iterable<String> iterableC = (i25 == 16 || i25 == 17) ? w.c("https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930") : j0.f134944a;
                l22.a aVarS2 = a0.s(o0VarE);
                boolean zEqualsIgnoreCase = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry());
                switch (iArr[kVar.ordinal()]) {
                    case 1:
                        i16 = R.string.msg_off_your_baseline_feedback_hrv_below_range_hrv_status_poor_1;
                        break;
                    case 2:
                        i16 = R.string.msg_off_your_baseline_feedback_hrv_in_range_hrv_status_poor_1;
                        break;
                    case 3:
                        i16 = R.string.msg_off_your_baseline_feedback_hrv_above_range_hrv_status_poor_1;
                        break;
                    case 4:
                        i16 = R.string.msg_off_your_baseline_feedback_hrv_below_range_1;
                        break;
                    case 5:
                        i16 = R.string.msg_off_your_baseline_feedback_hrv_in_range_1;
                        break;
                    case 6:
                        i16 = R.string.msg_off_your_baseline_feedback_hrv_above_range_1;
                        break;
                    case 7:
                        i16 = R.string.msg_off_your_baseline_feedback_skin_temperature_below_range_1;
                        break;
                    case 8:
                        i16 = R.string.msg_off_your_baseline_feedback_skin_temperature_in_range_1;
                        break;
                    case 9:
                        i16 = R.string.msg_off_your_baseline_feedback_skin_temperature_above_range_1;
                        break;
                    case 10:
                        i16 = R.string.msg_off_your_baseline_feedback_heart_rate_below_range_1;
                        break;
                    case 11:
                        i16 = R.string.msg_off_your_baseline_feedback_heart_rate_in_range_1;
                        break;
                    case 12:
                        i16 = R.string.msg_off_your_baseline_feedback_heart_rate_above_range_1;
                        break;
                    case 13:
                        i16 = R.string.msg_off_your_baseline_feedback_respiration_rate_below_range_1;
                        break;
                    case 14:
                        i16 = R.string.msg_off_your_baseline_feedback_respiration_rate_in_range_1;
                        break;
                    case 15:
                        i16 = R.string.msg_off_your_baseline_feedback_respiration_rate_above_range_1;
                        break;
                    case 16:
                        i16 = zEqualsIgnoreCase ? R.string.msg_off_your_baseline_feedback_blood_oxygen_below_range_jpn_1 : R.string.msg_off_your_baseline_feedback_blood_oxygen_below_range_1;
                        break;
                    case 17:
                        i16 = zEqualsIgnoreCase ? R.string.msg_off_your_baseline_feedback_blood_oxygen_in_range_jpn_1 : R.string.msg_off_your_baseline_feedback_blood_oxygen_in_range_1;
                        break;
                    default:
                        i16 = R.string.msg_not_enough_data_feedback;
                        break;
                }
                String string2 = aVarS2.getString(i16);
                o0VarE.C(-1551323684);
                ArrayList arrayList = new ArrayList(y.r(iterableC, 10));
                for (String str : iterableC) {
                    boolean zR = o0VarE.r(context) | o0VarE.B(str);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new ry0.a(context, str, i18);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ry0.a(context, str, i18);
                            o0VarE.K(objQ);
                        }
                    }
                    arrayList.add((e23.a) objQ);
                }
                o0VarE.g0(false);
                cVarB = a92.b.b(string2, arrayList, o0VarE);
                o0VarE.g0(false);
            }
            b(string, cVarB, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(enumC1803a, kVar, i14, i17);
        }
    }

    public static final void b(String str, s5.c cVar, m mVar, int i14) {
        s5.c cVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(-335348497);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(rVarF, eVar.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, i15 & 14, 0, 131070);
            if (cVar != null) {
                o0VarE.C(-35730307);
                fVar.getClass();
                x0 x0VarF = d92.c.f(x0Var, o0VarE);
                bVar.getClass();
                cVar2 = cVar;
                mh.d(cVar2, l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF, o0VarE, (i15 >> 3) & 14, 0, 262140);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                cVar2 = cVar;
                o0Var.C(-35535875);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            cVar2 = cVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(str, cVar2, i14, 5);
        }
    }
}
