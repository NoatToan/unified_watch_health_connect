package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import i3.ve;
import java.text.DecimalFormat;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class a1 {
    /* JADX WARN: Code duplicated, block: B:101:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x021c  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e9  */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    public static final void a(WorkoutDTO workoutDTO, h4.r rVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        u4.d dVar;
        String strP;
        boolean z14;
        String strQ;
        boolean z15;
        Double d14;
        boolean z16;
        m3 m3Var;
        double dDoubleValue;
        Double dValueOf;
        workoutDTO.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1390596936);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(workoutDTO) : o0VarE.r(workoutDTO) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = com.garmin.android.apps.connectmobile.k1.f37122a.l0();
            m52.k kVar = workoutDTO.f48044e;
            if (!zL0 || (dVar = kVar.f116773i) == null) {
                dVar = kVar.f116772h;
            }
            String str = workoutDTO.f48041b;
            String str2 = workoutDTO.f48043d;
            if (p005kotlin.jvm.internal.s.g(str2, workoutDTO.f48042c)) {
                str2 = null;
            }
            if (str2 == null) {
                o0VarE.C(1981681531);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(1981681532);
                strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(o0VarE, R.string.lbl_modified), c22.j0.p(c22.j0.N(str2, true))}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                o0VarE.C(1981921348);
                strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(o0VarE, R.string.lbl_created), c22.j0.p(c22.j0.N(workoutDTO.f48042c, true))}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-628813014);
                o0VarE.g0(false);
            }
            Integer num = workoutDTO.f48049j;
            Double d15 = workoutDTO.f48050k;
            m52.b bVar = workoutDTO.f48053m;
            m52.j jVar = workoutDTO.f48054n;
            m52.k kVar2 = workoutDTO.f48044e;
            m52.k kVar3 = m52.k.f116758r;
            if (kVar2 != kVar3) {
                z14 = zL0;
            } else if (zf.b.D(workoutDTO.f48047h)) {
                z14 = zL0;
                jVar = null;
            } else {
                m52.j jVar2 = workoutDTO.f48048i;
                z14 = zL0;
                m52.j jVar3 = m52.j.f116748h;
                if (jVar2 == jVar3) {
                    jVar = jVar3;
                }
            }
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            r0Var.f105810a = "";
            u4.d dVar2 = dVar;
            p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
            r0Var2.f105810a = "";
            if (bVar != null) {
                m52.j jVar4 = jVar;
                if (v52.e.e(num, d15, bVar) == v52.e.a.BOTH) {
                    boolean z17 = false;
                    r0Var.f105810a = v52.e.c(context, num != null ? Double.valueOf(num.intValue()) : null, v52.e.j(false, bVar), false);
                    if (num != null) {
                        dValueOf = Double.valueOf(num.intValue());
                        z17 = false;
                    } else {
                        dValueOf = null;
                    }
                    r0Var2.f105810a = v52.e.c(context, dValueOf, v52.e.j(z17, bVar), true);
                    strP = context.getString(R.string.string_space_dot_space_string_space_dot_space_string_space_dot_space_string_pattern, r0Var.f105810a, v52.e.a(context, d15, v52.e.j(true, bVar), m52.a.f116649e, jVar4, false, false, 64), strP);
                } else if (num == null && num.intValue() > 0) {
                    l3.a aVar3 = l3.f23124b;
                    long jIntValue = num.intValue();
                    aVar3.getClass();
                    strP = context.getString(R.string.string_space_dot_space_string_pattern, l3.a.e1(jIntValue), strP);
                } else if (d15 != null && d15.doubleValue() > 0.0d) {
                    if (workoutDTO.f48044e == kVar3) {
                        if (workoutDTO.f48048i == m52.j.f116748h) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        d14 = workoutDTO.f48047h;
                        if (d14 != null || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            m3Var = m3.UNSPECIFIED;
                        } else if (z15) {
                            m3Var = m3.YARD;
                        } else {
                            m3Var = m3.METER;
                        }
                        if (z15 || z16) {
                            dDoubleValue = d15.doubleValue();
                        } else {
                            dDoubleValue = d15.doubleValue() * 0.9144d;
                        }
                        l3.f23124b.getClass();
                        strQ = l3.a.O(context, dDoubleValue, m3Var, l3.f23131i, !z16);
                    } else {
                        f12.l.f68084a.getClass();
                        boolean zA = f12.l.a.a().g().a();
                        l3.a aVar4 = l3.f23124b;
                        double dDoubleValue2 = d15.doubleValue();
                        DecimalFormat decimalFormat = l3.f23125c;
                        aVar4.getClass();
                        strQ = l3.a.Q(context, dDoubleValue2, decimalFormat, true, zA);
                    }
                    strP = context.getString(R.string.string_space_dot_space_string_pattern, strQ, strP);
                }
            } else if (num == null) {
                if (d15 != null) {
                    if (workoutDTO.f48044e == kVar3) {
                        if (workoutDTO.f48048i == m52.j.f116748h) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        d14 = workoutDTO.f48047h;
                        if (d14 != null) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            m3Var = m3.UNSPECIFIED;
                        } else if (z15) {
                            m3Var = m3.YARD;
                        } else {
                            m3Var = m3.METER;
                        }
                        if (z15) {
                            dDoubleValue = d15.doubleValue();
                        } else {
                            dDoubleValue = d15.doubleValue();
                        }
                        l3.f23124b.getClass();
                        strQ = l3.a.O(context, dDoubleValue, m3Var, l3.f23131i, !z16);
                    } else {
                        f12.l.f68084a.getClass();
                        boolean zA2 = f12.l.a.a().g().a();
                        l3.a aVar5 = l3.f23124b;
                        double dDoubleValue3 = d15.doubleValue();
                        DecimalFormat decimalFormat2 = l3.f23125c;
                        aVar5.getClass();
                        strQ = l3.a.Q(context, dDoubleValue3, decimalFormat2, true, zA2);
                    }
                    strP = context.getString(R.string.string_space_dot_space_string_pattern, strQ, strP);
                }
            } else if (d15 != null) {
                if (workoutDTO.f48044e == kVar3) {
                    if (workoutDTO.f48048i == m52.j.f116748h) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    d14 = workoutDTO.f48047h;
                    if (d14 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (z16) {
                        m3Var = m3.UNSPECIFIED;
                    } else if (z15) {
                        m3Var = m3.YARD;
                    } else {
                        m3Var = m3.METER;
                    }
                    if (z15) {
                        dDoubleValue = d15.doubleValue();
                    } else {
                        dDoubleValue = d15.doubleValue();
                    }
                    l3.f23124b.getClass();
                    strQ = l3.a.O(context, dDoubleValue, m3Var, l3.f23131i, !z16);
                } else {
                    f12.l.f68084a.getClass();
                    boolean zA3 = f12.l.a.a().g().a();
                    l3.a aVar6 = l3.f23124b;
                    double dDoubleValue4 = d15.doubleValue();
                    DecimalFormat decimalFormat3 = l3.f23125c;
                    aVar6.getClass();
                    strQ = l3.a.Q(context, dDoubleValue4, decimalFormat3, true, zA3);
                }
                strP = context.getString(R.string.string_space_dot_space_string_pattern, strQ, strP);
            }
            strP.getClass();
            o0Var = o0VarE;
            ve.a(u1.w.f(239, aVar2, aVar, rVar, null, false), null, 0L, 0L, 0.0f, 0.0f, null, z3.f.c(829016573, new z0(workoutDTO, z14, dVar2, str, oi0.c.A(context, new w02.b(12, r0Var, r0Var2), strP), strP), o0VarE), o0Var, 12582912, 126);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) workoutDTO, (Object) rVar, (Object) aVar, (o13.h) aVar2, i14, 12);
        }
    }
}
