package ry0;

import am.w0;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import b63.o;
import c2.a0;
import c2.b0;
import c2.c1;
import c2.h2;
import c2.q2;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.q;
import fn1.v;
import fn1.w;
import h4.r;
import h5.e0;
import i3.fe;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import ky0.d2;
import l72.p2;
import l72.y2;
import lc.m0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r70.x;
import rk0.a1;
import rx1.u;
import s5.x0;
import s70.j1;
import sg0.c0;
import sg0.e1;
import sk0.i0;
import sm1.p;
import tn2.s0;
import u1.n1;
import u1.z0;
import v62.v3;
import w5.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f155077c;

    public /* synthetic */ g(i53.c cVar, w0 w0Var) {
        this.f155075a = 1;
        this.f155077c = cVar;
        this.f155076b = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        ti1.a aVar = (ti1.a) this.f155076b;
        e23.a aVar2 = (e23.a) this.f155077c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar4, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            r rVarF = x2.f(aVar3, 1.0f);
            boolean zB = mVar.B(aVar) | mVar.B(aVar2);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new j1(8, aVar, aVar2);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j1(8, aVar, aVar2);
                    mVar.K(objQ);
                }
            }
            si1.d.a(6, (e23.a) objQ, rVarF, mVar);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarA = c2.l.A(aVar3, eVar2.f97920e, 0.0f, 2);
            z zVarA2 = y.a(kVar, aVar4, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC2 = h4.k.c(rVarA, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar, zVarA2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            r rVarC3 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
            h4.g.a aVar6 = h4.d.a.f81537o;
            r rVarB = b0Var.b(rVarC3, aVar6);
            boolean z14 = aVar.f164579e;
            Integer num = aVar.f164580f;
            String strQ = gl1.y.Q(mVar, z14 ? R.string.lte_activation_redirect_free_trial_title : R.string.onboarding_lte_service_item_list_title);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, mVar);
            d6.h.f57752b.getClass();
            int i14 = d6.h.f57755e;
            mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            r rVarB2 = b0Var.b(c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar2.f97919d, 0.0f, 0.0f, 13), aVar6);
            String strQ2 = gl1.y.Q(mVar, R.string.lte_activation_redirect_screen_subtitle);
            x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar);
            f0.f182097b.getClass();
            mh.c(strQ2, rVarB2, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0.a(x0VarB2, 0L, 0L, f0.f182104i, null, 0L, null, null, 0, 0L, null, null, 16777211), mVar, 0, 0, 130044);
            r rVarC4 = c2.l.C(aVar3, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
            z zVarA3 = y.a(c2.j.i(eVar2.f97919d), aVar4, mVar, 0);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            r rVarC5 = h4.k.c(rVarC4, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar, zVarA3, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC5, mVar);
            si1.j.b(6, x2.f(aVar3, 1.0f), gl1.y.Q(mVar, R.string.lte_activation_redirect_screen_paragraph_1), mVar);
            si1.j.b(6, x2.f(aVar3, 1.0f), gl1.y.Q(mVar, R.string.lte_activation_redirect_screen_paragraph_2_updated), mVar);
            si1.j.b(6, x2.f(aVar3, 1.0f), gl1.y.Q(mVar, R.string.lte_activation_redirect_screen_paragraph_3_updated), mVar);
            if (!aVar.f164579e || num == null) {
                mVar.C(-1363352412);
                mVar.f();
            } else {
                mVar.C(-1363800238);
                si1.j.b(6, x2.f(aVar3, 1.0f), gl1.y.P(R.string.lbl_free_trial_with_custom_duration_in_days, new Object[]{num}, mVar), mVar);
                mVar.f();
            }
            mVar.y();
            si1.j.e(c2.l.A(x2.f(aVar3, 1.0f), 0.0f, eVar2.f97920e, 1), mVar, 0);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        int i14;
        w wVar;
        w wVar2;
        String strH;
        String strP;
        j23.g<e53.c> gVar;
        j23.g<e53.c> gVar2;
        com.garmin.android.apps.connectmobile.sleep.presentation.a aVar = (com.garmin.android.apps.connectmobile.sleep.presentation.a) this.f155076b;
        u00.a aVar2 = (u00.a) this.f155077c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = (iIntValue << 3) & 112;
            rVar.D(R.string.lbl_your_sleep_recommendations, mVar, i16);
            rVar.l(R.string.msg_sleep_coach_help_intro_description, (iIntValue << 6) & 896, 2, null, mVar);
            String strValueOf = null;
            int iU = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).u();
            Integer numValueOf = Integer.valueOf(iU);
            if (iU <= 0) {
                numValueOf = null;
            }
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 35;
            v.f72251a.getClass();
            int i17 = 19;
            if (8 > iIntValue2 || iIntValue2 >= 13) {
                if (13 > iIntValue2 || iIntValue2 >= 19) {
                    i14 = i16;
                    if (19 <= iIntValue2 && iIntValue2 < 35) {
                        wVar2 = new w(v.a(8, null), j23.s.a(e53.c.c(v.a(7, null)), e53.c.c(v.a(9, null))), null);
                    } else if (35 <= iIntValue2 && iIntValue2 < 50) {
                        wVar2 = new w(v.a(7, 50), j23.s.a(e53.c.c(v.a(7, null)), e53.c.c(v.a(9, null))), null);
                    } else if (50 <= iIntValue2 && iIntValue2 < 65) {
                        wVar2 = new w(v.a(7, 40), j23.s.a(e53.c.c(v.a(7, null)), e53.c.c(v.a(9, null))), null);
                    } else if (65 > iIntValue2 || iIntValue2 > Integer.MAX_VALUE) {
                        wVar = null;
                    } else {
                        wVar2 = new w(v.a(7, 30), j23.s.a(e53.c.c(v.a(7, null)), e53.c.c(v.a(9, null))), null);
                    }
                } else {
                    i14 = i16;
                    wVar2 = new w(v.a(9, null), j23.s.a(e53.c.c(v.a(8, null)), e53.c.c(v.a(10, null))), null);
                }
                wVar = wVar2;
            } else {
                wVar = new w(v.a(10, null), null, 2, null);
                i14 = i16;
            }
            if (wVar != null) {
                long j8 = wVar.f72252a;
                e53.c.a aVar3 = e53.c.f63094b;
                strH = aVar2.e((int) e53.c.j(j8, e53.f.SECONDS));
            } else {
                strH = null;
            }
            if (strH == null) {
                strH = sn.a.h(mVar, 696697778, R.string.no_value, mVar);
            } else {
                mVar.C(696693500);
                mVar.f();
            }
            String strValueOf2 = (wVar == null || (gVar2 = wVar.f72253b) == null) ? null : String.valueOf(e53.c.j(((e53.c) gVar2.getStart()).f63098a, e53.f.HOURS));
            if (wVar != null && (gVar = wVar.f72253b) != null) {
                strValueOf = String.valueOf(e53.c.j(((e53.c) gVar.b()).f63098a, e53.f.HOURS));
            }
            if (strValueOf2 == null || strValueOf == null) {
                mVar.C(123504943);
                strP = gl1.y.P(R.string.msg_sleep_coach_recommended_sleep_need_description, new Object[]{strH}, mVar);
                mVar.f();
            } else {
                mVar.C(123104640);
                strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.P(R.string.msg_sleep_coach_recommended_sleep_need_description, new Object[]{strH}, mVar), gl1.y.P(R.string.msg_sleep_coach_recommended_sleep_need_recommendation_description, new Object[]{strValueOf2, strValueOf}, mVar)}, mVar);
                mVar.f();
            }
            int i18 = i14;
            rVar.q(strP, mVar, i18);
            if (aVar.f44254f.f44257c) {
                mVar.C(123707745);
                rVar.j(z3.f.c(-57973640, new sm1.a(rVar, 18), mVar), mVar, i18 | 6);
                mVar.f();
            } else {
                mVar.C(123925179);
                rVar.j(z3.f.c(-326159601, new sm1.a(rVar, i17), mVar), mVar, i18 | 6);
                mVar.f();
            }
            int i19 = i18 | 6;
            rVar.j(z3.f.c(-1799620045, new sm1.a(rVar, 20), mVar), mVar, i19);
            rVar.j(z3.f.c(-578568420, new sm1.a(rVar, 21), mVar), mVar, i19);
            rVar.j(z3.f.c(1540482555, new sm1.a(rVar, 22), mVar), mVar, i19);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        ClimbDTO climbDTO = (ClimbDTO) this.f155076b;
        y30.a aVar = (y30.a) this.f155077c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            com.garmin.android.apps.connectmobile.courses.model.b category = climbDTO.getCategory();
            String strQ = gl1.y.Q(mVar, R.string.common_difficulty);
            String strB = aVar.b(category);
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String strA = aVar.a(category, true);
            b92.a aVarA = wz1.a.a(strQ + ", " + strB);
            int i15 = b92.a.f16960b;
            int i16 = (l72.x0.f111348c << 24) | (i14 & 14);
            x0Var.a(i16, 60, aVarA, t2Var, null, null, strA, strQ, null, null, mVar);
            String str = l3.f23126d.format(Double.valueOf(climbDTO.getAvgGrade()));
            str.getClass();
            String strP = gl1.y.P(R.string.lbl_value_percent, new Object[]{str}, mVar);
            x0Var.a(i16, 60, wz1.a.a(gl1.y.Q(mVar, R.string.lbl_average_grade) + ", " + strP), t2Var, null, null, strP, gl1.y.Q(mVar, R.string.lbl_avg_grade), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009b  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        t31.g gVar = (t31.g) this.f155076b;
        Context context = (Context) this.f155077c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = t31.g.f162217g;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = (iIntValue << 6) & 896;
            rVar.E(gl1.y.Q(mVar, R.string.ohrv_status), mVar, i16);
            rVar.m(i16, 2, gl1.y.Q(mVar, R.string.ohrv_help_description), null, mVar);
            int i17 = ((iIntValue << 3) & 112) | 6;
            rVar.j(z3.f.c(999151082, new c70.b(rVar, context, 8), mVar), mVar, i17);
            rVar.j(z3.f.c(1074673377, new t12.a(rVar, 6), mVar), mVar, i17);
            Context context2 = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = mVar.r(gVar) | mVar.r(context2);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new t31.d(gVar, context2, i15);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t31.d(gVar, context2, i15);
                    mVar.K(objQ);
                }
            }
            rVar.i((e23.a) objQ, R.string.ohrv_help_link, mVar, i16);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0154  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        final t72.f fVar = (t72.f) this.f155076b;
        final Context context = (Context) this.f155077c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = t72.f.f163126f;
        rVar.getClass();
        final int i15 = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        final int i16 = 0;
        final int i17 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i18 = (iIntValue << 3) & 112;
            rVar.D(R.string.main_help_action_1, mVar, i18);
            String strQ = gl1.y.Q(mVar, R.string.main_help_intro_with_link);
            boolean zR = mVar.r(fVar) | mVar.r(context);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: t72.b
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i16;
                        Context context2 = context;
                        f fVar2 = fVar;
                        switch (i19) {
                            case 0:
                                int i24 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            case 1:
                                int i25 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                            case 2:
                                int i26 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            default:
                                int i27 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a() { // from class: t72.b
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i16;
                            Context context2 = context;
                            f fVar2 = fVar;
                            switch (i19) {
                                case 0:
                                    int i24 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                case 1:
                                    int i25 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                                case 2:
                                    int i26 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                default:
                                    int i27 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zR2 = mVar.r(fVar) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: t72.b
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i17;
                        Context context2 = context;
                        f fVar2 = fVar;
                        switch (i19) {
                            case 0:
                                int i24 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            case 1:
                                int i25 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                            case 2:
                                int i26 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            default:
                                int i27 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: t72.b
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i17;
                            Context context2 = context;
                            f fVar2 = fVar;
                            switch (i19) {
                                case 0:
                                    int i24 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                case 1:
                                    int i25 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                                case 2:
                                    int i26 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                default:
                                    int i27 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                }
            }
            int i19 = (iIntValue << 6) & 896;
            rVar.n(a92.b.b(strQ, i53.a.a(aVar2, (e23.a) objQ2), mVar), null, mVar, i19, 2);
            rVar.t(R.string.lbl_simple_paragraph, mVar, i18);
            rVar.o(R.string.simple_paragraph_description, i19, 2, null, mVar);
            boolean zR3 = mVar.r(fVar) | mVar.r(context);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new e23.a() { // from class: t72.b
                    @Override // e23.a
                    public final Object invoke() {
                        int i110 = i15;
                        Context context2 = context;
                        f fVar2 = fVar;
                        switch (i110) {
                            case 0:
                                int i24 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            case 1:
                                int i25 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                            case 2:
                                int i26 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            default:
                                int i27 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e23.a() { // from class: t72.b
                        @Override // e23.a
                        public final Object invoke() {
                            int i110 = i15;
                            Context context2 = context;
                            f fVar2 = fVar;
                            switch (i110) {
                                case 0:
                                    int i24 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                case 1:
                                    int i25 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                                case 2:
                                    int i26 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                default:
                                    int i27 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                }
            }
            int i24 = (iIntValue << 12) & 57344;
            rVar.u(i24 | 384, (e23.a) objQ3, "https://www.lipsum.com/", mVar);
            boolean zR4 = mVar.r(fVar) | mVar.r(context);
            Object objQ4 = mVar.q();
            if (zR4) {
                objQ4 = new e23.l() { // from class: t72.c
                    @Override // e23.l
                    public final Object invoke(Object obj4) {
                        int i25 = i16;
                        Context context2 = context;
                        f fVar2 = fVar;
                        String str = (String) obj4;
                        switch (i25) {
                            case 0:
                                int i26 = f.f163126f;
                                str.getClass();
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            default:
                                int i27 = f.f163126f;
                                str.getClass();
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new e23.l() { // from class: t72.c
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            int i25 = i16;
                            Context context2 = context;
                            f fVar2 = fVar;
                            String str = (String) obj4;
                            switch (i25) {
                                case 0:
                                    int i26 = f.f163126f;
                                    str.getClass();
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                default:
                                    int i27 = f.f163126f;
                                    str.getClass();
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                }
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR5 = mVar.r(fVar) | mVar.r(context);
            Object objQ5 = mVar.q();
            if (zR5) {
                objQ5 = new e23.l() { // from class: t72.c
                    @Override // e23.l
                    public final Object invoke(Object obj4) {
                        int i25 = i17;
                        Context context2 = context;
                        f fVar2 = fVar;
                        String str = (String) obj4;
                        switch (i25) {
                            case 0:
                                int i26 = f.f163126f;
                                str.getClass();
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            default:
                                int i27 = f.f163126f;
                                str.getClass();
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new e23.l() { // from class: t72.c
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            int i25 = i17;
                            Context context2 = context;
                            f fVar2 = fVar;
                            String str = (String) obj4;
                            switch (i25) {
                                case 0:
                                    int i26 = f.f163126f;
                                    str.getClass();
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                default:
                                    int i27 = f.f163126f;
                                    str.getClass();
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ5);
                }
            }
            rVar.y("Here we have with multiple links: <link>first</link> and <link>second</link>.", null, null, i53.a.a(lVar, (e23.l) objQ5), mVar, i24 | 6, 6);
            boolean zR6 = mVar.r(fVar) | mVar.r(context);
            Object objQ6 = mVar.q();
            if (zR6) {
                final int i25 = 3;
                objQ6 = new e23.a() { // from class: t72.b
                    @Override // e23.a
                    public final Object invoke() {
                        int i110 = i25;
                        Context context2 = context;
                        f fVar2 = fVar;
                        switch (i110) {
                            case 0:
                                int i26 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            case 1:
                                int i27 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                            case 2:
                                int i28 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                break;
                            default:
                                int i29 = f.f163126f;
                                h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ6);
            } else {
                aVar.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    final int i26 = 3;
                    objQ6 = new e23.a() { // from class: t72.b
                        @Override // e23.a
                        public final Object invoke() {
                            int i110 = i26;
                            Context context2 = context;
                            f fVar2 = fVar;
                            switch (i110) {
                                case 0:
                                    int i27 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                case 1:
                                    int i28 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                                case 2:
                                    int i29 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://www.lipsum.com/");
                                    break;
                                default:
                                    int i210 = f.f163126f;
                                    h82.c.f(fVar2, context2, "https://en.wikipedia.org/wiki/English_language");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ6);
                }
            }
            rVar.h(i19 | 6, (e23.a) objQ6, "Simple Link", mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f155076b;
        t72.f fVar = (t72.f) this.f155077c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = t72.f.f163126f;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i15 = ((iIntValue << 3) & 112) | 6;
            rVar.k(z3.f.c(-1751488432, new t12.a(rVar, 9), mVar), mVar, i15);
            rVar.a(z3.f.c(-1438984953, new u(rVar, 24, str, fVar), mVar), mVar, i15);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    private final Object g(Object obj, Object obj2, Object obj3) {
        sg1.c cVar = (sg1.c) this.f155076b;
        e23.l lVar = (e23.l) this.f155077c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t2) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            p2 p2Var = p2.f111205a;
            String str = cVar.f159204b;
            String str2 = cVar.f159205c;
            z3.e eVarC = z3.f.c(1423538306, new s5.a(cVar, 25), mVar);
            boolean zB = mVar.B(lVar) | mVar.r(cVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new tb0.d(2, lVar, cVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new tb0.d(2, lVar, cVar);
                    mVar.K(objQ);
                }
            }
            p2Var.h(str, str2, null, null, null, false, false, eVarC, null, (e23.a) objQ, null, mVar, 12582912, 0, 1404);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ActiveTrainingPlansActivity activeTrainingPlansActivity = (ActiveTrainingPlansActivity) this.f155076b;
        List list = (List) this.f155077c;
        Long l14 = (Long) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        rt1.j jVar = (rt1.j) obj3;
        ut1.e eVar = activeTrainingPlansActivity.f45108n;
        if (eVar != null) {
            ge1.b.T(v1.a(eVar), null, null, new ut1.g(eVar, l14, zBooleanValue, jVar, list, null), 3);
            return Unit.INSTANCE;
        }
        s.m("viewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f155076b;
        r0 r0Var = (r0) this.f155077c;
        t tVar = (t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            tw.c.d(tVar, str, (String) r0Var.f105810a, mVar, iIntValue & 14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        kw.m mVar = (kw.m) this.f155076b;
        List list = (List) this.f155077c;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c1) obj).getClass();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            for (Map.Entry<kw.b, kw.f> entry : mVar.f106878b.entrySet()) {
                if (entry.getKey() == kw.b.FIVE) {
                    ArrayList arrayListL = androidx.core.view.j.l(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String categoryName = ((pw.a) it.next()).getCategoryName();
                        if (categoryName != null) {
                            arrayListL.add(categoryName);
                        }
                    }
                    Iterator it3 = arrayListL.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (s.g((String) it3.next(), "HYPERTENSIVE_CRISIS")) {
                                mVar2.C(-380150370);
                                tw.d.a(entry.getValue().f106844i, 0, entry.getValue().f106837b, mVar2);
                                mVar2.f();
                            }
                        }
                    }
                }
                if (entry.getKey() != kw.b.FIVE) {
                    mVar2.C(-380001570);
                    tw.d.a(entry.getValue().f106844i, 0, entry.getValue().f106837b, mVar2);
                    mVar2.f();
                } else {
                    mVar2.C(-379912197);
                    mVar2.f();
                }
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.e) this.f155076b;
        fg0.k kVar = (fg0.k) this.f155077c;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) obj2;
        String str = (String) obj3;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
        str.getClass();
        ht.a.f85464a.getClass();
        ht.a.a(null, "AddlegGoalsClicked");
        if ((kVar2 != null ? kVar2.getEventLegActivityType() : null) != null) {
            f.c<Intent> cVar2 = eVar.f45941m;
            EventGoalActivity.a aVar2 = EventGoalActivity.f45976e;
            Context contextRequireContext = eVar.requireContext();
            contextRequireContext.getClass();
            m52.c eventLegActivityType = kVar2.getEventLegActivityType();
            aVar2.getClass();
            kVar.getClass();
            Intent intent = new Intent(contextRequireContext, (Class<?>) EventGoalActivity.class);
            intent.putExtra("GCM_extra_sharable_event_dto", kVar);
            intent.putExtra("LEG_TARGET_TYPE", eventLegActivityType);
            cVar2.a(intent, null);
        } else if (cVar != null) {
            og0.a aVar3 = og0.a.f131967a;
            androidx.fragment.app.v parentFragmentManager = eVar.getParentFragmentManager();
            parentFragmentManager.getClass();
            Context contextRequireContext2 = eVar.requireContext();
            contextRequireContext2.getClass();
            s0 s0Var = new s0(cVar, 5, kVar, eVar);
            aVar3.getClass();
            og0.a.E(parentFragmentManager, contextRequireContext2, str, cVar, s0Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0036  */
    private final Object l(Object obj, Object obj2, Object obj3) {
        z0 z0Var = (z0) this.f155076b;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        mVar.C(-353972293);
        x1 x1Var = n.f135158a;
        z0Var.getClass();
        mVar.C(1257603829);
        n1 n1Var = n1.f167636a;
        mVar.f();
        boolean zB = mVar.B(n1Var);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new u1.c1(n1Var);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new u1.c1(n1Var);
                mVar.K(objQ);
            }
        }
        u1.c1 c1Var = (u1.c1) objQ;
        mVar.f();
        return c1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2, Object obj3) {
        String strQ;
        u70.b bVar = (u70.b) this.f155076b;
        p1 p1Var = (p1) this.f155077c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            if (bVar.f169392b != null) {
                mVar.C(-343012521);
                strQ = gl1.d.W(bVar.f169392b);
                mVar.f();
            } else {
                mVar.C(-342921505);
                strQ = gl1.y.Q(mVar, bVar.f169391a);
                mVar.f();
            }
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarF, eVar.f97920e);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar, 0, 0, 131068);
            if (bVar instanceof u70.b.a) {
                mVar.C(-980881877);
                u70.b.a aVar2 = (u70.b.a) bVar;
                u70.a aVar3 = (u70.a) p1Var.getF182175a();
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sk0.n(p1Var, 19);
                    mVar.K(objQ);
                }
                u70.g.b(aVar2, aVar3, (e23.l) objQ, mVar, 384);
                mVar.f();
            } else if (bVar instanceof u70.b.C3169b) {
                mVar.C(-980872396);
                u70.g.e((u70.b.C3169b) bVar, mVar, 0);
                mVar.f();
            } else {
                if (!(bVar instanceof u70.b.c)) {
                    throw n23.j.m(mVar, -980884070);
                }
                mVar.C(-980869514);
                u70.g.f((u70.b.c) bVar, mVar, 0);
                mVar.f();
            }
            Integer num = bVar.f169393c;
            if (num == null) {
                mVar.C(-342092039);
                mVar.f();
            } else {
                mVar.C(-342092038);
                mh.c(gl1.y.Q(mVar, num.intValue()), c2.l.y(x2.f(aVar, 1.0f), eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar), mVar, 0, 0, 131068);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    private final Object o(Object obj, Object obj2, Object obj3) {
        yg2.h hVar = (yg2.h) this.f155076b;
        m0 m0Var = (m0) this.f155077c;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarX = c2.l.x(u1.n.e(r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), h2Var);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarX, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            i53.c cVarE = i53.a.e((Iterable) p0.c(hVar.f197003k, mVar, 0).getF182175a());
            i53.c cVarE2 = i53.a.e((Iterable) p0.c(hVar.f196999g, mVar, 0).getF182175a());
            i53.c cVarE3 = i53.a.e((Iterable) p0.c(hVar.f197001i, mVar, 0).getF182175a());
            boolean zR = mVar.r(hVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ug2.z(hVar, i14);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ug2.z(hVar, i14);
                    mVar.K(objQ);
                }
            }
            yg2.m.a(cVarE, cVarE2, cVarE3, m0Var, (e23.l) objQ, mVar, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        xv1.a aVar = (xv1.a) this.f155076b;
        fg0.k kVar = (fg0.k) this.f155077c;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) obj2;
        String str = (String) obj3;
        str.getClass();
        if ((kVar2 != null ? kVar2.getEventLegActivityType() : null) != null) {
            m52.c eventLegActivityType = kVar2.getEventLegActivityType();
            eventLegActivityType.getClass();
            aVar.b0(kVar, eventLegActivityType);
        } else if (cVar != null) {
            aVar.i5(str, cVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x0348  */
    /* JADX WARN: Code duplicated, block: B:223:0x072f  */
    /* JADX WARN: Code duplicated, block: B:360:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:380:0x0b9b  */
    /* JADX WARN: Code duplicated, block: B:433:0x0ce1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objC;
        int i14;
        int i15;
        Object obj4;
        g6.f fVar;
        String strQ;
        g6.f fVar2;
        String strQ2;
        g6.f fVar3;
        byte b14;
        String strQ3;
        p3.m mVar;
        int i16 = this.f155075a;
        int i17 = 24;
        p3.m.a aVar = p3.m.f135153a;
        int i18 = 16;
        int i19 = 17;
        Object obj5 = this.f155077c;
        Object obj6 = this.f155076b;
        switch (i16) {
            case 0:
                w0 w0Var = (w0) obj6;
                l22.a aVar2 = (l22.a) obj5;
                t2 t2Var = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    Map<String, am.i2> map = w0Var.f().get(TtmlNode.COMBINE_ALL);
                    if (map != null) {
                        d2 d2Var = d2.f107276a;
                        ls.e eVar = ls.e.TOTAL_DISTANCE;
                        d2Var.getClass();
                        am.i2 i2Var = map.get(d2.a(eVar));
                        if (i2Var != null) {
                            objC = d2.c(eVar, i2Var);
                        } else {
                            objC = null;
                        }
                    } else {
                        objC = null;
                    }
                    String strB = ss.k.b(ls.e.TOTAL_DISTANCE, aVar2, objC, 16);
                    if (strB == null) {
                        strB = sn.a.h(mVar2, 1093900866, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(1093897766);
                        mVar2.f();
                    }
                    String str = strB;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_distance);
                    if (zY) {
                        i14 = 1093906556;
                        i15 = R.string.f28709km;
                    } else {
                        i14 = 1093907612;
                        i15 = R.string.f28711mi;
                    }
                    x0Var.f((iIntValue & 14) | (l72.x0.f111348c << 24), 116, null, t2Var, null, null, str, strQ4, sn.a.h(mVar2, i14, i15, mVar2), null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                i53.c cVar = (i53.c) obj5;
                w0 w0Var2 = (w0) obj6;
                t2 t2Var2 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : cVar) {
                        c cVar2 = (c) obj7;
                        cVar2.getClass();
                        DateTime dateTimeG = cVar2.f155064a.g();
                        LocalDate localDate = dateTimeG != null ? dateTimeG.toLocalDate() : null;
                        LocalDate localDateH = g22.l.h(g22.l.d(o.INSTANCE));
                        if (localDate == null || localDate.compareTo((ReadablePartial) localDateH) <= 0) {
                            arrayList.add(obj7);
                        }
                    }
                    int size = arrayList.size();
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    String strValueOf = String.valueOf(size);
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23492ka);
                    int i24 = (iIntValue2 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i24, 124, null, t2Var2, null, null, strValueOf, strW, null, null, mVar3);
                    x0Var2.a(i24, 124, null, t2Var2, null, null, String.valueOf(w0Var2.getCountOfActivities()), gl1.y.Q(mVar3, R.string.concept_activities), null, null, mVar3);
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                Object obj8 = (s52.g) obj6;
                Object obj9 = (Context) obj5;
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i25 = s52.g.f157408g;
                rVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i26 = (iIntValue3 << 3) & 112;
                    rVar.D(R.string.lbl_benchmark_exercises, mVar4, i26);
                    int i27 = (iIntValue3 << 6) & 896;
                    rVar.l(R.string.msg_benchmark_exercises_usage, i27, 2, null, mVar4);
                    int i28 = i26 | 6;
                    rVar.j(z3.f.c(2063313832, new a1(7, rVar, obj8), mVar4), mVar4, i28);
                    rVar.o(R.string.msg_using_benchmarks_max_weight, i27, 2, null, mVar4);
                    rVar.j(z3.f.c(2144810847, new pk1.g(rVar, 25), mVar4), mVar4, i28);
                    rVar.j(z3.f.c(-2027252512, new pk1.g(rVar, 26), mVar4), mVar4, i28);
                    rVar.j(z3.f.c(-1904348575, new pk1.g(rVar, 27), mVar4), mVar4, i28);
                    String strQ5 = gl1.y.Q(mVar4, xx0.a.EnumC3592a.AMERICAN_ACADEMY_OF_FAMILY_PHYSICIANS.getId());
                    boolean zR = mVar4.r(obj8) | mVar4.r(obj9);
                    Object objQ = mVar4.q();
                    if (zR) {
                        obj4 = objQ;
                        Object fVar4 = new rk0.f(19, obj8, obj9);
                        mVar4.K(fVar4);
                        obj4 = fVar4;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            Object fVar5 = new rk0.f(19, obj8, obj9);
                            mVar4.K(fVar5);
                            obj4 = fVar5;
                        }
                    }
                    obj4 = objQ;
                    rVar.h(i27, (e23.a) obj4, strQ5, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                z90.a aVar3 = (z90.a) obj6;
                s70.e0 e0Var = (s70.e0) obj5;
                p3.m mVar5 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var5 = n.f135158a;
                r rVarX = x2.x(x2.f(r.S, 1.0f), null, 3);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                boolean zR2 = mVar5.r(e0Var) | mVar5.r(aVar3);
                Object objQ2 = mVar5.q();
                if (zR2) {
                    objQ2 = new rk0.f(i17, e0Var, aVar3);
                    mVar5.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new rk0.f(i17, e0Var, aVar3);
                        mVar5.K(objQ2);
                    }
                }
                s70.f0.a(rVarC, aVar3, (e23.a) objQ2, mVar5, 0);
                return Unit.INSTANCE;
            case 4:
                x xVar = (x) obj6;
                e23.l lVar = (e23.l) obj5;
                fe feVar = (fe) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                feVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar6.B(feVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    s70.p1.a(xVar, feVar, lVar, mVar6, (iIntValue4 << 3) & 112);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj6;
                j70.a0 a0Var = (j70.a0) obj5;
                c2.w wVar = (c2.w) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar7.B(wVar) ? 4 : 2;
                }
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    float fS0 = ((g6.c) mVar7.A(t1.f91490h)).s0(wVar.j());
                    r rVarD = x2.d(r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    r rVarC2 = h4.k.c(rVarD, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar4);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar7);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarE = d92.c.e(j92.f.f97931h);
                    mVar7.C(2127735583);
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        j70.a0 a0Var2 = (j70.a0) it.next();
                        String strQ6 = a0Var2.f97486l;
                        if (strQ6 == null) {
                            mVar7.C(1471287605);
                            strQ6 = gl1.y.Q(mVar7, a0Var2.f97478d);
                        } else {
                            mVar7.C(1471287078);
                        }
                        mVar7.f();
                        g6.f fVarA = g6.f.a(i70.b.b(strQ6, x0VarE, fS0, mVar7));
                        while (it.hasNext()) {
                            j70.a0 a0Var3 = (j70.a0) it.next();
                            String strQ7 = a0Var3.f97486l;
                            if (strQ7 == null) {
                                mVar7.C(1471287605);
                                strQ7 = gl1.y.Q(mVar7, a0Var3.f97478d);
                            } else {
                                mVar7.C(1471287078);
                            }
                            mVar7.f();
                            g6.f fVarA2 = g6.f.a(i70.b.b(strQ7, x0VarE, fS0, mVar7));
                            if (fVarA.compareTo(fVarA2) < 0) {
                                fVarA = fVarA2;
                            }
                        }
                        fVar = fVarA;
                    } else {
                        fVar = null;
                    }
                    mVar7.f();
                    boolean z14 = a0Var instanceof j70.a0.d;
                    if (z14) {
                        mVar7.C(1535572356);
                        mVar7.f();
                        strQ = a0Var.f97486l;
                    } else {
                        mVar7.C(1535641300);
                        strQ = gl1.y.Q(mVar7, a0Var.f97478d);
                        mVar7.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97932i;
                    mVar7.C(2127752966);
                    Iterator it3 = list.iterator();
                    if (it3.hasNext()) {
                        j70.a0 a0Var4 = (j70.a0) it3.next();
                        String strQ8 = a0Var4.f97487m;
                        if (strQ8 == null) {
                            mVar7.C(1549535432);
                            strQ8 = gl1.y.Q(mVar7, a0Var4.f97479e);
                        } else {
                            mVar7.C(1549534936);
                        }
                        mVar7.f();
                        g6.f fVarA3 = g6.f.a(i70.b.b(strQ8, x0Var3, fS0, mVar7));
                        while (it3.hasNext()) {
                            j70.a0 a0Var5 = (j70.a0) it3.next();
                            String strQ9 = a0Var5.f97487m;
                            if (strQ9 == null) {
                                mVar7.C(1549535432);
                                strQ9 = gl1.y.Q(mVar7, a0Var5.f97479e);
                            } else {
                                mVar7.C(1549534936);
                            }
                            mVar7.f();
                            g6.f fVarA4 = g6.f.a(i70.b.b(strQ9, x0Var3, fS0, mVar7));
                            if (fVarA3.compareTo(fVarA4) < 0) {
                                fVarA3 = fVarA4;
                            }
                        }
                        fVar2 = fVarA3;
                    } else {
                        fVar2 = null;
                    }
                    mVar7.f();
                    if (z14) {
                        mVar7.C(1536115941);
                        mVar7.f();
                        strQ2 = a0Var.f97487m;
                    } else {
                        mVar7.C(1536183986);
                        strQ2 = gl1.y.Q(mVar7, a0Var.f97479e);
                        mVar7.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarE2 = d92.c.e(j92.f.f97932i);
                    mVar7.C(2127770619);
                    Iterator it4 = list.iterator();
                    if (it4.hasNext()) {
                        j70.a0 a0Var6 = (j70.a0) it4.next();
                        String strQ10 = a0Var6.f97488n;
                        if (strQ10 == null) {
                            mVar7.C(-1074135420);
                            strQ10 = gl1.y.Q(mVar7, a0Var6.f97480f);
                        } else {
                            mVar7.C(-1074135885);
                        }
                        mVar7.f();
                        g6.f fVarA5 = g6.f.a(i70.b.b(strQ10, x0VarE2, fS0, mVar7));
                        while (it4.hasNext()) {
                            j70.a0 a0Var7 = (j70.a0) it4.next();
                            String strQ11 = a0Var7.f97488n;
                            if (strQ11 == null) {
                                mVar7.C(-1074135420);
                                strQ11 = gl1.y.Q(mVar7, a0Var7.f97480f);
                                mVar7.f();
                                b14 = -1074135885;
                            } else {
                                b14 = -1074135885;
                                mVar7.C(-1074135885);
                                mVar7.f();
                            }
                            g6.f fVarA6 = g6.f.a(i70.b.b(strQ11, x0VarE2, fS0, mVar7));
                            if (fVarA5.compareTo(fVarA6) < 0) {
                                fVarA5 = fVarA6;
                            }
                        }
                        fVar3 = fVarA5;
                    } else {
                        fVar3 = null;
                    }
                    mVar7.f();
                    if (z14) {
                        mVar7.C(1536651590);
                        mVar7.f();
                        strQ3 = a0Var.f97488n;
                    } else {
                        mVar7.C(1536718581);
                        strQ3 = gl1.y.Q(mVar7, a0Var.f97480f);
                        mVar7.f();
                    }
                    i70.b.a(strQ == null ? "" : strQ, strQ2 == null ? "" : strQ2, strQ3 == null ? "" : strQ3, x0VarE, x0Var3, x0VarE2, fVar, fVar2, fVar3, x2.d(r.S, 1.0f), mVar7, C.ENCODING_PCM_32BIT, 1024);
                    mVar7.y();
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 6:
                k2.h hVar = (k2.h) obj6;
                e23.a aVar5 = (e23.a) obj5;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    String strQ12 = gl1.y.Q(mVar8, R.string.activity_add_manually_label);
                    boolean zB = mVar8.B(aVar5);
                    Object objQ3 = mVar8.q();
                    if (zB) {
                        objQ3 = new rk0.y(aVar5, 21);
                        mVar8.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new rk0.y(aVar5, 21);
                            mVar8.K(objQ3);
                        }
                    }
                    sa0.j.a(strQ12, hVar, false, false, (e23.a) objQ3, mVar8, 384, 8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 7:
                sc.i iVar = (sc.i) obj6;
                sc.h hVar2 = (sc.h) obj5;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if (mVar9.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    iVar.f158456b.invoke(hVar2, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 8:
                ManageFamilyActivity manageFamilyActivity = (ManageFamilyActivity) obj6;
                Context context = (Context) obj5;
                long jLongValue = ((Long) obj).longValue();
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                sg0.f0 f0VarDa = manageFamilyActivity.da();
                f0VarDa.getClass();
                ge1.b.T(v1.a(f0VarDa), null, null, new sg0.m0(f0VarDa, jLongValue, null), 3);
                ((e1) manageFamilyActivity.f35179a.getValue()).z4();
                m0 m0Var = manageFamilyActivity.f35182d;
                if (m0Var == null) {
                    s.m("navController");
                    throw null;
                }
                lc.y.l(m0Var, c0.INSTANCE);
                manageFamilyActivity.f35187i.a(manageFamilyActivity.f35181c.h(context, new hl.a.b(jLongValue, str2, null, str3, 4, null)), null);
                return Unit.INSTANCE;
            case 9:
                Float f14 = (Float) obj6;
                LottieCompositionResult lottieCompositionResult = (LottieCompositionResult) obj5;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    r.a aVar7 = r.S;
                    r rVarD2 = x2.d(aVar7, 1.0f);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode2 = Long.hashCode(mVar10.getU());
                    i2 i2VarX2 = mVar10.x();
                    r rVarC3 = h4.k.c(rVarD2, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar8);
                    } else {
                        mVar10.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar10);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar10);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar10, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar6 = h5.g.a.f81807d;
                    b4.c(fVar6, rVarC3, mVar10);
                    c2.u uVar = c2.u.f22885a;
                    r rVarD3 = x2.d(aVar7, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = c2.l.y(rVarD3, j92.b.f97899b.f97920e);
                    c2.j.f22691a.getClass();
                    z zVarA2 = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode3 = Long.hashCode(mVar10.getU());
                    i2 i2VarX3 = mVar10.x();
                    r rVarC4 = h4.k.c(rVarY, mVar10);
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar8);
                    } else {
                        mVar10.c();
                    }
                    b4.c(eVar2, zVarA2, mVar10);
                    b4.c(c1623g, i2VarX3, mVar10);
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar10, iHashCode3, bVar2);
                    }
                    b4.c(fVar6, rVarC4, mVar10);
                    b0 b0Var2 = b0.f22601a;
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar10, 0);
                    int iHashCode4 = Long.hashCode(mVar10.getU());
                    i2 i2VarX4 = mVar10.x();
                    r rVarC5 = h4.k.c(aVar7, mVar10);
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar8);
                    } else {
                        mVar10.c();
                    }
                    b4.c(eVar2, s2VarA, mVar10);
                    b4.c(c1623g, i2VarX4, mVar10);
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar10, iHashCode4, bVar2);
                    }
                    b4.c(fVar6, rVarC5, mVar10);
                    c2.l.f(u2.f22900a.a(aVar7, 1.0f, true), mVar10);
                    s62.a.f157643a.getClass();
                    i7.b(v3.a(t62.b.f162798a), "", x2.q(aVar7, j92.b.f97901d.f97904c), sn.a.b(mVar10), mVar10, 48, 0);
                    mVar10.y();
                    c2.l.f(b0Var2.a(aVar7, 1.0f, true), mVar10);
                    if (f14 == null) {
                        mVar10.C(-1899073143);
                        mVar10.f();
                        mVar = mVar10;
                    } else {
                        mVar10.C(-1899073142);
                        mVar = mVar10;
                        y2.f111386a.a(f14.floatValue(), 0.0f, 0, 48, 116, fb1.c.i(gl.c.f77766a, mVar10), 0L, x2.f(aVar7, 1.0f), mVar);
                        Unit unit = Unit.INSTANCE;
                        mVar.f();
                    }
                    mVar.y();
                    p3.m mVar11 = mVar;
                    LottieAnimationKt.LottieAnimation(lottieCompositionResult.getF182175a(), null, false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, true, false, null, false, null, mVar11, 1572864, 1572864, 0, 2031550);
                    mVar11.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                return a(obj, obj2, obj3);
            case 11:
                return b(obj, obj2, obj3);
            case 12:
                com.garmin.android.apps.connectmobile.sleep.presentation.a aVar9 = (com.garmin.android.apps.connectmobile.sleep.presentation.a) obj6;
                x3 x3Var = (x3) obj5;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i29 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                rVar2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar12.B(rVar2) ? 4 : 2;
                }
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    int i30 = (iIntValue9 << 3) & 112;
                    rVar2.D(R.string.lbl_value_tracking_sleep, mVar12, i30);
                    rVar2.l(R.string.msg_tracking_sleep_intro_description, (iIntValue9 << 6) & 896, 2, null, mVar12);
                    int i34 = i30 | 6;
                    rVar2.j(z3.f.c(-266163340, new sm1.a(rVar2, 15), mVar12), mVar12, i34);
                    rVar2.j(z3.f.c(-515269845, new sm1.a(rVar2, i18), mVar12), mVar12, i34);
                    ql1.a aVar10 = (ql1.a) x3Var.getF182175a();
                    aVar10.getClass();
                    if (!aVar10.f145228a || aVar10.f145229b == null) {
                        mVar12.C(-221223275);
                        rVar2.j(z3.f.c(1548600143, new sm1.a(rVar2, i19), mVar12), mVar12, i34);
                        mVar12.f();
                    } else {
                        mVar12.C(-221012165);
                        aVar9.t(((ql1.a) x3Var.getF182175a()).f145229b, mVar12, 0);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                sm1.s sVar = (sm1.s) obj6;
                pm1.g gVar = (pm1.g) obj5;
                p3.m mVar13 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var13 = n.f135158a;
                g82.c cVar3 = g82.c.f76436a;
                g82.c.b bVar3 = new g82.c.b(R.drawable.skin_temp_onboarding, null, null, 6, null);
                String strQ13 = gl1.y.Q(mVar13, R.string.lbl_know_your_body_better);
                String strQ14 = gl1.y.Q(mVar13, R.string.msg_device_detects_skin_temp);
                String strQ15 = gl1.y.Q(mVar13, R.string.lbl_ok);
                boolean zR3 = mVar13.r(sVar) | mVar13.r(gVar);
                Object objQ4 = mVar13.q();
                if (zR3) {
                    objQ4 = new p(sVar, gVar, true ? 1 : 0);
                    mVar13.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new p(sVar, gVar, true ? 1 : 0);
                        mVar13.K(objQ4);
                    }
                }
                e23.a aVar11 = (e23.a) objQ4;
                Object objQ5 = mVar13.q();
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new i0(13);
                    mVar13.K(objQ5);
                }
                cVar3.c(bVar3, strQ13, strQ14, 0, strQ15, aVar11, null, null, false, (e23.a) objQ5, mVar13, 905969664, 200);
                return Unit.INSTANCE;
            case 14:
                return c(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                i53.f fVar7 = (i53.f) obj6;
                e23.a aVar12 = (e23.a) obj5;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar14.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var14 = n.f135158a;
                    b82.s sVar2 = b82.s.f16758a;
                    String strQ16 = gl1.y.Q(mVar14, R.string.lbl_what_is_new);
                    String strQ17 = gl1.y.Q(mVar14, R.string.index_s2_smart_scale_updates);
                    String strQ18 = gl1.y.Q(mVar14, R.string.gak_lbl_continue);
                    boolean zB2 = mVar14.B(aVar12);
                    Object objQ6 = mVar14.q();
                    if (zB2) {
                        objQ6 = new t21.a(aVar12, 24);
                        mVar14.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new t21.a(aVar12, 24);
                            mVar14.K(objQ6);
                        }
                    }
                    int i35 = b82.s.b.f16761e;
                    sVar2.a(strQ16, strQ17, strQ18, fVar7, (e23.a) objQ6, mVar14, 0, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 17:
                t70.x0 x0Var4 = (t70.x0) obj6;
                e23.a aVar13 = (e23.a) obj5;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar15.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var15 = n.f135158a;
                    t70.s0.c(x0Var4, aVar13, mVar15, 0, 0);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 18:
                return e(obj, obj2, obj3);
            case 19:
                return f(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return n(obj, obj2, obj3);
            case 27:
                return o(obj, obj2, obj3);
            case 28:
                return q(obj, obj2, obj3);
            default:
                final MultipleImagesShareSampleActivity multipleImagesShareSampleActivity = (MultipleImagesShareSampleActivity) obj6;
                final p1 p1Var = (p1) obj5;
                h2 h2Var = (h2) obj;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i36 = MultipleImagesShareSampleActivity.f30169a;
                h2Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar16.B(h2Var) ? 4 : 2;
                }
                if (mVar16.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var16 = n.f135158a;
                    r.a aVar14 = r.S;
                    r rVarX2 = c2.l.x(aVar14, h2Var);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar2, h4.d.a.f81536n, mVar16, 0);
                    int iHashCode5 = Long.hashCode(mVar16.getU());
                    i2 i2VarX5 = mVar16.x();
                    r rVarC6 = h4.k.c(rVarX2, mVar16);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar16.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar16.z();
                    if (mVar16.getT()) {
                        mVar16.M(aVar15);
                    } else {
                        mVar16.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar16);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar16);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar16.getT() || !s.g(mVar16.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar16, iHashCode5, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar16);
                    b0 b0Var3 = b0.f22601a;
                    Object objQ7 = mVar16.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ7 == c2565a) {
                        objQ7 = p0.n("");
                        mVar16.K(objQ7);
                    }
                    final p1 p1Var2 = (p1) objQ7;
                    String str4 = (String) p1Var2.getF182175a();
                    Object objQ8 = mVar16.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new vd0.d(p1Var2, 10);
                        mVar16.K(objQ8);
                    }
                    l72.p1.a(str4, null, "Text to be shared - max char 300", 300, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ8, mVar16, 28032, 24576, 16354);
                    p2 p2Var = p2.f111205a;
                    z3.e eVarC = z3.f.c(545457304, new sk0.c(p1Var, 9), mVar16);
                    Object objQ9 = mVar16.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new vd0.c(p1Var, 17);
                        mVar16.K(objQ9);
                    }
                    p2Var.h("Use android share sheet", "On: use share sheet; Off: use intent resolve", null, null, null, false, false, null, eVarC, null, (e23.a) objQ9, mVar16, 100663350, 6, 764);
                    l72.f0 f0Var = l72.f0.f110999a;
                    r rVarF = x2.f(aVar14, 1.0f);
                    boolean zR4 = mVar16.r(multipleImagesShareSampleActivity);
                    Object objQ10 = mVar16.q();
                    if (zR4 || objQ10 == c2565a) {
                        final int i37 = false ? 1 : 0;
                        objQ10 = new e23.a() { // from class: vt.d
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                int i38 = i37;
                                p1 p1Var3 = p1Var;
                                p1 p1Var4 = p1Var2;
                                MultipleImagesShareSampleActivity multipleImagesShareSampleActivity2 = multipleImagesShareSampleActivity;
                                switch (i38) {
                                    case 0:
                                        int i39 = MultipleImagesShareSampleActivity.f30169a;
                                        String str5 = (String) p1Var4.getF182175a();
                                        boolean zK9 = MultipleImagesShareSampleActivity.K9(p1Var3);
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.addFlags(1);
                                        intent.putExtra("android.intent.extra.TEXT", (CharSequence) str5);
                                        if (zK9) {
                                            intent = Intent.createChooser(intent, "Share Title.");
                                        }
                                        multipleImagesShareSampleActivity2.startActivity(intent);
                                        break;
                                    default:
                                        int i44 = MultipleImagesShareSampleActivity.f30169a;
                                        String str6 = (String) p1Var4.getF182175a();
                                        ge1.b.T(o53.f0.w(multipleImagesShareSampleActivity2), null, null, new g(multipleImagesShareSampleActivity2, MultipleImagesShareSampleActivity.K9(p1Var3), str6, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ10);
                    }
                    f0Var.d(432, 9, (e23.a) objQ10, rVarF, "Share Text", mVar16, null, false);
                    r rVarF2 = x2.f(aVar14, 1.0f);
                    boolean zR5 = mVar16.r(multipleImagesShareSampleActivity);
                    Object objQ11 = mVar16.q();
                    if (zR5 || objQ11 == c2565a) {
                        final int i38 = false ? 1 : 0;
                        objQ11 = new e23.a() { // from class: vt.e
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i38) {
                                    case 0:
                                        boolean zK9 = MultipleImagesShareSampleActivity.K9(p1Var);
                                        MultipleImagesShareSampleActivity multipleImagesShareSampleActivity2 = multipleImagesShareSampleActivity;
                                        ge1.b.T(o53.f0.w(multipleImagesShareSampleActivity2), null, null, new f(multipleImagesShareSampleActivity2, zK9, null), 3);
                                        break;
                                    default:
                                        boolean zK10 = MultipleImagesShareSampleActivity.K9(p1Var);
                                        MultipleImagesShareSampleActivity multipleImagesShareSampleActivity3 = multipleImagesShareSampleActivity;
                                        ge1.b.T(o53.f0.w(multipleImagesShareSampleActivity3), null, null, new h(multipleImagesShareSampleActivity3, zK10, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ11);
                    }
                    f0Var.d(432, 9, (e23.a) objQ11, rVarF2, "Share Image", mVar16, null, false);
                    r rVarF3 = x2.f(aVar14, 1.0f);
                    boolean zR6 = mVar16.r(multipleImagesShareSampleActivity);
                    Object objQ12 = mVar16.q();
                    if (zR6 || objQ12 == c2565a) {
                        final int i39 = true ? 1 : 0;
                        objQ12 = new e23.a() { // from class: vt.e
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i39) {
                                    case 0:
                                        boolean zK9 = MultipleImagesShareSampleActivity.K9(p1Var);
                                        MultipleImagesShareSampleActivity multipleImagesShareSampleActivity2 = multipleImagesShareSampleActivity;
                                        ge1.b.T(o53.f0.w(multipleImagesShareSampleActivity2), null, null, new f(multipleImagesShareSampleActivity2, zK9, null), 3);
                                        break;
                                    default:
                                        boolean zK10 = MultipleImagesShareSampleActivity.K9(p1Var);
                                        MultipleImagesShareSampleActivity multipleImagesShareSampleActivity3 = multipleImagesShareSampleActivity;
                                        ge1.b.T(o53.f0.w(multipleImagesShareSampleActivity3), null, null, new h(multipleImagesShareSampleActivity3, zK10, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ12);
                    }
                    f0Var.d(432, 9, (e23.a) objQ12, rVarF3, "Share Multiple Images", mVar16, null, false);
                    r rVarF4 = x2.f(aVar14, 1.0f);
                    boolean zR7 = mVar16.r(multipleImagesShareSampleActivity);
                    Object objQ13 = mVar16.q();
                    if (zR7 || objQ13 == c2565a) {
                        final int i44 = true ? 1 : 0;
                        objQ13 = new e23.a() { // from class: vt.d
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                int i310 = i44;
                                p1 p1Var3 = p1Var;
                                p1 p1Var4 = p1Var2;
                                MultipleImagesShareSampleActivity multipleImagesShareSampleActivity2 = multipleImagesShareSampleActivity;
                                switch (i310) {
                                    case 0:
                                        int i311 = MultipleImagesShareSampleActivity.f30169a;
                                        String str5 = (String) p1Var4.getF182175a();
                                        boolean zK9 = MultipleImagesShareSampleActivity.K9(p1Var3);
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.addFlags(1);
                                        intent.putExtra("android.intent.extra.TEXT", (CharSequence) str5);
                                        if (zK9) {
                                            intent = Intent.createChooser(intent, "Share Title.");
                                        }
                                        multipleImagesShareSampleActivity2.startActivity(intent);
                                        break;
                                    default:
                                        int i45 = MultipleImagesShareSampleActivity.f30169a;
                                        String str6 = (String) p1Var4.getF182175a();
                                        ge1.b.T(o53.f0.w(multipleImagesShareSampleActivity2), null, null, new g(multipleImagesShareSampleActivity2, MultipleImagesShareSampleActivity.K9(p1Var3), str6, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ13);
                    }
                    f0Var.d(432, 9, (e23.a) objQ13, rVarF4, "Share Image With Text", mVar16, null, false);
                    mVar16.y();
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f155075a = i14;
        this.f155076b = obj;
        this.f155077c = obj2;
    }
}
