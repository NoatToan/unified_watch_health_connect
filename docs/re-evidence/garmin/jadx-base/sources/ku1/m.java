package ku1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import h5.e0;
import i3.e5;
import l72.x0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.lang.String] */
    public static final void a(fg0.k kVar, boolean z14, Double d14, Double d15, p3.m mVar, int i14) {
        fy1.f fVarN;
        int i15;
        int i16;
        int i17;
        int i18;
        fy1.f fVarM;
        String strJ;
        String strJ2;
        boolean z15;
        String str;
        r0 r0Var;
        final fy1.f fVar;
        int i19;
        int i24;
        int i25;
        int i26;
        fg0.j eventCustomization;
        fg0.d completionTarget;
        gg0.f eventType;
        o0 o0VarE = mVar.E(-372280506);
        int i27 = i14 | ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(d14) ? 256 : 128) | (o0VarE.B(d15) ? 2048 : 1024);
        if (o0VarE.n(i27 & 1, (i27 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z16 = (kVar == null || (eventType = kVar.getEventType()) == null || !eventType.e()) ? false : true;
            boolean z17 = (kVar == null || (completionTarget = kVar.getCompletionTarget()) == null || !completionTarget.o()) ? false : true;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            Unit unit = null;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r0 r0Var2 = new r0();
            r0 r0Var3 = new r0();
            if (((kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? null : eventCustomization.getCustomGoal()) == null) {
                o0VarE.C(-1498872746);
                o0VarE.g0(false);
                fVarN = null;
            } else {
                o0VarE.C(-1498872745);
                fy1.i.f73924a.getClass();
                fVarN = fy1.i.a.n(context, kVar, true);
                if (z17) {
                    i15 = -2135781453;
                    i16 = R.string.goal_distance;
                } else {
                    i15 = -2135706061;
                    i16 = R.string.lbl_goal_time;
                }
                r0Var2.f105810a = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                if (z16) {
                    i17 = -2135580821;
                    i18 = R.string.lbl_course_goal_speed;
                } else {
                    i17 = -2135497524;
                    i18 = R.string.lbl_course_goal_pace;
                }
                r0Var3.f105810a = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            if (!z14 || d15 == null || d14 == null) {
                o0VarE.C(-1497448698);
                o0VarE.g0(false);
                fVarM = null;
                strJ = null;
                strJ2 = null;
            } else {
                o0VarE.C(-1498167526);
                fy1.i.a aVar3 = fy1.i.f73924a;
                double dDoubleValue = d14.doubleValue();
                double dDoubleValue2 = d15.doubleValue();
                aVar3.getClass();
                fVarM = fy1.i.a.m(context, dDoubleValue, dDoubleValue2, z16, z17, true);
                if (z17) {
                    i19 = -1497809538;
                    i24 = R.string.actual_distance;
                } else {
                    i19 = -1497732286;
                    i24 = R.string.actual_time;
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i19, i24, o0VarE, false);
                if (z16) {
                    i25 = -1497606147;
                    i26 = R.string.lbl_actual_speed;
                } else {
                    i25 = -1497527810;
                    i26 = R.string.lbl_actual_pace;
                }
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i25, i26, o0VarE, false);
                o0VarE.g0(false);
            }
            o0VarE.C(782983742);
            T t7 = r0Var2.f105810a;
            T t14 = r0Var3.f105810a;
            if (fVarN == null || t7 == 0 || t14 == 0) {
                z15 = false;
            } else {
                final String str2 = (String) t14;
                final String str3 = (String) t7;
                final String strG = e5.g(fVarN.f73917b, StringUtils.SPACE, str3);
                final String str4 = fVarN.f73920e + StringUtils.SPACE + str2;
                o0VarE.C(782995055);
                if (fVarM == null || strJ == null || strJ2 == null) {
                    str = str4;
                    r0Var = r0Var3;
                    fVar = fVarN;
                } else {
                    final String strG2 = e5.g(fVarM.f73917b, StringUtils.SPACE, strJ);
                    final String strG3 = e5.g(fVarM.f73920e, StringUtils.SPACE, strJ2);
                    x0 x0Var = x0.f111346a;
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    final String str5 = strJ;
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = c2.l.y(aVar, eVar.f97920e);
                    final int i28 = 0;
                    fVar = fVarN;
                    final fy1.f fVar2 = fVarM;
                    z3.e eVarC = z3.f.c(1930013867, new q() { // from class: ku1.k
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i29 = i28;
                            String str6 = strG2;
                            fy1.f fVar3 = fVar2;
                            String str7 = strG;
                            fy1.f fVar4 = fVar;
                            switch (i29) {
                                case 0:
                                    t2 t2Var = (t2) obj;
                                    p3.m mVar2 = (p3.m) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    t2Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                    }
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        x0 x0Var2 = x0.f111346a;
                                        String str8 = fVar4.f73916a;
                                        b92.a aVarA = wz1.a.a(str7);
                                        int i30 = b92.a.f16960b;
                                        int i34 = (iIntValue & 14) | (x0.f111348c << 24);
                                        x0Var2.a(i34, 60, aVarA, t2Var, null, null, str8, str3, null, null, mVar2);
                                        x0Var2.a(i34, 60, wz1.a.a(str6), t2Var, null, null, fVar3.f73916a, str5, null, null, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    t2 t2Var2 = (t2) obj;
                                    p3.m mVar3 = (p3.m) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    t2Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        int i35 = iIntValue2;
                                        x0 x0Var3 = x0.f111346a;
                                        String str9 = fVar4.f73919d;
                                        b92.a aVarA2 = wz1.a.a(str7);
                                        int i36 = b92.a.f16960b;
                                        int i37 = (i35 & 14) | (x0.f111348c << 24);
                                        x0Var3.a(i37, 60, aVarA2, t2Var2, null, null, str9, str3, null, null, mVar3);
                                        x0Var3.a(i37, 60, wz1.a.a(str6), t2Var2, null, null, fVar3.f73919d, str5, null, null, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE);
                    int i29 = (x0.f111348c << 6) | 48;
                    r0Var = r0Var3;
                    x0Var.e(rVarY, eVarC, o0VarE, i29, 0);
                    bVar2.getClass();
                    r rVarY2 = c2.l.y(aVar, eVar.f97920e);
                    final int i30 = 1;
                    final String str6 = strJ2;
                    q qVar = new q() { // from class: ku1.k
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i210 = i30;
                            String str7 = strG3;
                            fy1.f fVar3 = fVar2;
                            String str8 = str4;
                            fy1.f fVar4 = fVar;
                            switch (i210) {
                                case 0:
                                    t2 t2Var = (t2) obj;
                                    p3.m mVar2 = (p3.m) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    t2Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                                    }
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        x0 x0Var2 = x0.f111346a;
                                        String str9 = fVar4.f73916a;
                                        b92.a aVarA = wz1.a.a(str8);
                                        int i34 = b92.a.f16960b;
                                        int i35 = (iIntValue & 14) | (x0.f111348c << 24);
                                        x0Var2.a(i35, 60, aVarA, t2Var, null, null, str9, str2, null, null, mVar2);
                                        x0Var2.a(i35, 60, wz1.a.a(str7), t2Var, null, null, fVar3.f73916a, str6, null, null, mVar2);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    t2 t2Var2 = (t2) obj;
                                    p3.m mVar3 = (p3.m) obj2;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    t2Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        int i36 = iIntValue2;
                                        x0 x0Var3 = x0.f111346a;
                                        String str10 = fVar4.f73919d;
                                        b92.a aVarA2 = wz1.a.a(str8);
                                        int i37 = b92.a.f16960b;
                                        int i38 = (i36 & 14) | (x0.f111348c << 24);
                                        x0Var3.a(i38, 60, aVarA2, t2Var2, null, null, str10, str2, null, null, mVar3);
                                        x0Var3.a(i38, 60, wz1.a.a(str7), t2Var2, null, null, fVar3.f73919d, str6, null, null, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    str = str4;
                    x0Var.e(rVarY2, z3.f.c(-425529836, qVar, o0VarE), o0VarE, i29, 0);
                    unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
                if (unit == null) {
                    o0VarE.C(465821626);
                    x0 x0Var2 = x0.f111346a;
                    d92.b.f58625c.getClass();
                    x0Var2.e(c2.l.y(aVar, j92.b.f97899b.f97920e), z3.f.c(2076016923, new l((Object) fVar, (Object) r0Var2, strG, (Object) r0Var, (Object) str, 0), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                    Unit unit3 = Unit.INSTANCE;
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(14968255);
                    o0VarE.g0(false);
                }
                Unit unit4 = Unit.INSTANCE;
            }
            o0VarE.g0(z15);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(kVar, z14, d14, d15, i14, 9);
        }
    }
}
