package tn;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f165482b;

    public /* synthetic */ n(r rVar, int i14) {
        this.f165481a = i14;
        this.f165482b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x034b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0404  */
    /* JADX WARN: Code duplicated, block: B:180:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x016e  */
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
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i14 = this.f165481a;
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 3;
        final int i16 = 2;
        final int i17 = 4;
        final r rVar = this.f165482b;
        boolean z14 = false;
        boolean z15 = true;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i18 = r.f165491f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    rVar.j(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i19 = r.f165491f;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i24 = (iIntValue2 << 3) & 112;
                    rVar2.D(R.string.lbl_tracking_oxygen_saturation, mVar2, i24);
                    int i25 = (iIntValue2 << 6) & 896;
                    rVar2.l(R.string.msg_tracking_oxygen_saturation, i25, 2, null, mVar2);
                    rVar2.t(R.string.lbl_understanding_pulse_ox, mVar2, i24);
                    rVar2.o(R.string.msg_pulseox_meaning, i25, 2, null, mVar2);
                    final Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar2.r(rVar) | mVar2.r(context);
                    Object objQ = mVar2.q();
                    if (zR) {
                        obj4 = objQ;
                        final int i26 = z15 ? 1 : 0;
                        Object obj9 = new e23.a() { // from class: tn.p
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i26;
                                Context context2 = context;
                                r rVar3 = rVar;
                                switch (i27) {
                                    case 0:
                                        int i28 = r.f165491f;
                                        h82.c.f(rVar3, context2, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                        break;
                                    case 1:
                                        int i29 = r.f165491f;
                                        h82.c.f(rVar3, context2, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                        break;
                                    case 2:
                                        int i30 = r.f165491f;
                                        h82.c.f(rVar3, context2, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                        break;
                                    case 3:
                                        int i34 = r.f165491f;
                                        h82.c.f(rVar3, context2, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                        break;
                                    default:
                                        int i35 = r.f165491f;
                                        h82.c.f(rVar3, context2, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(obj9);
                        obj4 = obj9;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            final int i27 = z15 ? 1 : 0;
                            Object obj10 = new e23.a() { // from class: tn.p
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i27;
                                    Context context2 = context;
                                    r rVar3 = rVar;
                                    switch (i28) {
                                        case 0:
                                            int i29 = r.f165491f;
                                            h82.c.f(rVar3, context2, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                            break;
                                        case 1:
                                            int i210 = r.f165491f;
                                            h82.c.f(rVar3, context2, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                            break;
                                        case 2:
                                            int i30 = r.f165491f;
                                            h82.c.f(rVar3, context2, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                            break;
                                        case 3:
                                            int i34 = r.f165491f;
                                            h82.c.f(rVar3, context2, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                            break;
                                        default:
                                            int i35 = r.f165491f;
                                            h82.c.f(rVar3, context2, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj10);
                            obj4 = obj10;
                        }
                    }
                    obj4 = objQ;
                    rVar2.v((e23.a) obj4, R.string.pulse_ox_help_link, mVar2, (iIntValue2 << 9) & 7168);
                    rVar2.o(R.string.msg_pulseox_factors, i25, 2, null, mVar2);
                    rVar.n(mVar2, h82.c.f82429e);
                    rVar2.t(R.string.lbl_value_of_pulse_ox, mVar2, i24);
                    String strQ = y.Q(mVar2, R.string.msg_value_of_pulse_ox_v2);
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    Object obj11 = objQ2;
                    if (objQ2 == p3.m.a.f135155b) {
                        Object cVar = new t52.c(26);
                        mVar2.K(cVar);
                        obj11 = cVar;
                    }
                    rVar2.o(R.string.msg_value_of_pulse_ox_v2, i25, 0, oi0.c.A(context, (e23.l) obj11, strQ), mVar2);
                    rVar2.o(R.string.msg_pulse_ox_reading_help_3, i25, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i28 = r.f165491f;
                rVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i29 = ((iIntValue3 << 3) & 112) | 6;
                    rVar3.k(z3.f.c(-1853501324, new t12.a(rVar3, 11), mVar3), mVar3, i29);
                    rVar3.a(z3.f.c(2035904733, new t21.l(14, rVar3, rVar), mVar3), mVar3, i29);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i30 = r.f165491f;
                rVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i34 = (iIntValue4 << 3) & 112;
                    rVar4.D(R.string.lbl_heart_beats_per_minute, mVar4, i34);
                    int i35 = (iIntValue4 << 6) & 896;
                    rVar4.l(R.string.msg_heart_beats_per_minute_short, i35, 2, null, mVar4);
                    rVar4.o(R.string.msg_heart_beats_range_description, i35, 2, null, mVar4);
                    rVar4.o(R.string.msg_high_heart_rate_description, i35, 2, null, mVar4);
                    rVar4.o(R.string.msg_heart_rate_factors_v2, i35, 2, null, mVar4);
                    rVar4.t(R.string.lbl_how_to_use_reading, mVar4, i34);
                    rVar4.o(R.string.msg_how_to_use_reading_hr, i35, 2, null, mVar4);
                    final Context context2 = (Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strP = y.P(R.string.mct_learn_more_from, new Object[]{y.Q(mVar4, R.string.lbl_aha_title)}, mVar4);
                    boolean zR2 = mVar4.r(rVar) | mVar4.r(context2);
                    Object objQ3 = mVar4.q();
                    if (zR2) {
                        obj5 = objQ3;
                        Object obj12 = new e23.a() { // from class: tn.p
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i17;
                                Context context3 = context2;
                                r rVar5 = rVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = r.f165491f;
                                        h82.c.f(rVar5, context3, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                        break;
                                    case 1:
                                        int i212 = r.f165491f;
                                        h82.c.f(rVar5, context3, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                        break;
                                    case 2:
                                        int i36 = r.f165491f;
                                        h82.c.f(rVar5, context3, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                        break;
                                    case 3:
                                        int i37 = r.f165491f;
                                        h82.c.f(rVar5, context3, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                        break;
                                    default:
                                        int i38 = r.f165491f;
                                        h82.c.f(rVar5, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(obj12);
                        obj5 = obj12;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj5 = objQ3;
                            Object obj13 = new e23.a() { // from class: tn.p
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i17;
                                    Context context3 = context2;
                                    r rVar5 = rVar;
                                    switch (i210) {
                                        case 0:
                                            int i211 = r.f165491f;
                                            h82.c.f(rVar5, context3, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                            break;
                                        case 1:
                                            int i212 = r.f165491f;
                                            h82.c.f(rVar5, context3, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                            break;
                                        case 2:
                                            int i36 = r.f165491f;
                                            h82.c.f(rVar5, context3, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                            break;
                                        case 3:
                                            int i37 = r.f165491f;
                                            h82.c.f(rVar5, context3, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                            break;
                                        default:
                                            int i38 = r.f165491f;
                                            h82.c.f(rVar5, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(obj13);
                            obj5 = obj13;
                        }
                    }
                    obj5 = objQ3;
                    rVar4.h(i35, (e23.a) obj5, strP, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i36 = r.f165491f;
                rVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    final Context context3 = (Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b);
                    int i37 = (iIntValue5 << 3) & 112;
                    rVar5.D(R.string.lbl_analyzing_stress_and_recovery, mVar5, i37);
                    int i38 = (iIntValue5 << 6) & 896;
                    rVar5.l(R.string.msg_analyzing_stress_and_recovery, i38, 2, null, mVar5);
                    rVar5.t(R.string.lbl_understanding_stress_levels, mVar5, i37);
                    rVar5.o(R.string.msg_understanding_stress_levels_v2, i38, 2, null, mVar5);
                    rVar.o(mVar5, h82.c.f82429e);
                    rVar5.t(R.string.stress_help_reading_title_1, mVar5, i37);
                    rVar5.o(R.string.msg_stress_in_your_daily_life, i38, 2, null, mVar5);
                    rVar5.t(R.string.lbl_using_your_stress_data, mVar5, i37);
                    rVar5.o(R.string.msg_using_your_stress_data_v2, i38, 2, null, mVar5);
                    String strM = am.j.m("<link>", y.Q(mVar5, R.string.citation_firstbeat_analytics), "</link>");
                    boolean zR3 = mVar5.r(rVar) | mVar5.r(context3);
                    Object objQ4 = mVar5.q();
                    if (zR3) {
                        obj6 = objQ4;
                        final boolean z16 = z14 ? 1 : 0;
                        Object obj14 = new e23.a() { // from class: tn.p
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = z16;
                                Context context4 = context3;
                                r rVar6 = rVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = r.f165491f;
                                        h82.c.f(rVar6, context4, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                        break;
                                    case 1:
                                        int i212 = r.f165491f;
                                        h82.c.f(rVar6, context4, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                        break;
                                    case 2:
                                        int i39 = r.f165491f;
                                        h82.c.f(rVar6, context4, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                        break;
                                    case 3:
                                        int i310 = r.f165491f;
                                        h82.c.f(rVar6, context4, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                        break;
                                    default:
                                        int i311 = r.f165491f;
                                        h82.c.f(rVar6, context4, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(obj14);
                        obj6 = obj14;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj6 = objQ4;
                            final int z17 = z14 ? 1 : 0;
                            Object obj15 = new e23.a() { // from class: tn.p
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = z17;
                                    Context context4 = context3;
                                    r rVar6 = rVar;
                                    switch (i210) {
                                        case 0:
                                            int i211 = r.f165491f;
                                            h82.c.f(rVar6, context4, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                            break;
                                        case 1:
                                            int i212 = r.f165491f;
                                            h82.c.f(rVar6, context4, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                            break;
                                        case 2:
                                            int i39 = r.f165491f;
                                            h82.c.f(rVar6, context4, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                            break;
                                        case 3:
                                            int i310 = r.f165491f;
                                            h82.c.f(rVar6, context4, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                            break;
                                        default:
                                            int i311 = r.f165491f;
                                            h82.c.f(rVar6, context4, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(obj15);
                            obj6 = obj15;
                        }
                    }
                    obj6 = objQ4;
                    rVar5.w(strM, null, (e23.a) obj6, mVar5, (iIntValue5 << 9) & 7168, 2);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i39 = r.f165491f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar.h(mVar6, h82.c.f82429e);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i44 = r.f165491f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    rVar.i(mVar7, h82.c.f82429e);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i45 = r.f165491f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    rVar.k(mVar8, h82.c.f82429e);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i46 = r.f165491f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    rVar.l(mVar9, h82.c.f82429e);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i47 = r.f165491f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    rVar.m(mVar10, h82.c.f82429e);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i48 = r.f165491f;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    rVar.g(mVar11, h82.c.f82429e);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                h82.r rVar6 = (h82.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i49 = r.f165491f;
                rVar6.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(rVar6) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    final Context context4 = (Context) mVar12.A(AndroidCompositionLocals_androidKt.f6042b);
                    int i54 = (iIntValue12 << 3) & 112;
                    rVar6.D(R.string.lbl_tracking_your_breathing, mVar12, i54);
                    int i55 = (iIntValue12 << 6) & 896;
                    rVar6.l(R.string.msg_respiration_rate_help_2, i55, 2, null, mVar12);
                    rVar6.t(R.string.lbl_understanding_respiration_rate, mVar12, i54);
                    rVar6.o(R.string.msg_interpreting_your_data_help_intro, i55, 2, null, mVar12);
                    rVar6.o(R.string.msg_interpreting_your_data_p1, i55, 2, null, mVar12);
                    rVar6.t(R.string.lbl_using_your_respiration_data, mVar12, i54);
                    rVar6.o(R.string.msg_respiration_rate_change_description, i55, 2, null, mVar12);
                    rVar6.o(R.string.msg_respiration_rate_disclaimer, i55, 2, null, mVar12);
                    String strM2 = am.j.m("<link>", y.Q(mVar12, R.string.citation_firstbeat_analytics), "</link>");
                    boolean zR4 = mVar12.r(rVar) | mVar12.r(context4);
                    Object objQ5 = mVar12.q();
                    if (zR4) {
                        obj7 = objQ5;
                        Object obj16 = new e23.a() { // from class: tn.p
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i15;
                                Context context5 = context4;
                                r rVar7 = rVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = r.f165491f;
                                        h82.c.f(rVar7, context5, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                        break;
                                    case 1:
                                        int i212 = r.f165491f;
                                        h82.c.f(rVar7, context5, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                        break;
                                    case 2:
                                        int i310 = r.f165491f;
                                        h82.c.f(rVar7, context5, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                        break;
                                    case 3:
                                        int i311 = r.f165491f;
                                        h82.c.f(rVar7, context5, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                        break;
                                    default:
                                        int i312 = r.f165491f;
                                        h82.c.f(rVar7, context5, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(obj16);
                        obj7 = obj16;
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            obj7 = objQ5;
                            Object obj17 = new e23.a() { // from class: tn.p
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i15;
                                    Context context5 = context4;
                                    r rVar7 = rVar;
                                    switch (i210) {
                                        case 0:
                                            int i211 = r.f165491f;
                                            h82.c.f(rVar7, context5, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                            break;
                                        case 1:
                                            int i212 = r.f165491f;
                                            h82.c.f(rVar7, context5, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                            break;
                                        case 2:
                                            int i310 = r.f165491f;
                                            h82.c.f(rVar7, context5, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                            break;
                                        case 3:
                                            int i311 = r.f165491f;
                                            h82.c.f(rVar7, context5, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                            break;
                                        default:
                                            int i312 = r.f165491f;
                                            h82.c.f(rVar7, context5, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(obj17);
                            obj7 = obj17;
                        }
                    }
                    obj7 = objQ5;
                    rVar6.w(strM2, null, (e23.a) obj7, mVar12, (iIntValue12 << 9) & 7168, 2);
                } else {
                    mVar12.e();
                }
                break;
            default:
                h82.r rVar7 = (h82.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i56 = r.f165491f;
                rVar7.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(rVar7) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    int i57 = (iIntValue13 << 3) & 112;
                    rVar7.D(R.string.lbl_time_between_heartbeats, mVar13, i57);
                    int i58 = (iIntValue13 << 6) & 896;
                    rVar7.l(R.string.msg_time_between_heartbeats_v2, i58, 2, null, mVar13);
                    rVar7.t(R.string.lbl_sdrr_vs_rmssd, mVar13, i57);
                    rVar7.o(R.string.msg_sdrr_rmssd_description_v2, i58, 2, null, mVar13);
                    rVar7.o(R.string.msg_rmssd_description_v2, i58, 2, null, mVar13);
                    rVar7.t(R.string.lbl_using_hr_variability_reading, mVar13, i57);
                    rVar7.o(R.string.msg_using_hrv_reading_info_v2, i58, 2, null, mVar13);
                    rVar7.o(R.string.msg_using_hrv_reading_description_v2, i58, 2, null, mVar13);
                    rVar7.o(R.string.msg_using_hr_variability_disclaimer, i58, 2, null, mVar13);
                    final Context context5 = (Context) mVar13.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strP2 = y.P(R.string.mct_learn_more_from, new Object[]{y.Q(mVar13, R.string.lbl_source_frontiers_in_public_health)}, mVar13);
                    boolean zR5 = mVar13.r(rVar) | mVar13.r(context5);
                    Object objQ6 = mVar13.q();
                    if (zR5) {
                        obj8 = objQ6;
                        Object obj18 = new e23.a() { // from class: tn.p
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i16;
                                Context context6 = context5;
                                r rVar8 = rVar;
                                switch (i210) {
                                    case 0:
                                        int i211 = r.f165491f;
                                        h82.c.f(rVar8, context6, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                        break;
                                    case 1:
                                        int i212 = r.f165491f;
                                        h82.c.f(rVar8, context6, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                        break;
                                    case 2:
                                        int i310 = r.f165491f;
                                        h82.c.f(rVar8, context6, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                        break;
                                    case 3:
                                        int i311 = r.f165491f;
                                        h82.c.f(rVar8, context6, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                        break;
                                    default:
                                        int i312 = r.f165491f;
                                        h82.c.f(rVar8, context6, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar13.K(obj18);
                        obj8 = obj18;
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            obj8 = objQ6;
                            Object obj19 = new e23.a() { // from class: tn.p
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i16;
                                    Context context6 = context5;
                                    r rVar8 = rVar;
                                    switch (i210) {
                                        case 0:
                                            int i211 = r.f165491f;
                                            h82.c.f(rVar8, context6, "https://www.firstbeatanalytics.com/en/features/all-day-stress-recovery/");
                                            break;
                                        case 1:
                                            int i212 = r.f165491f;
                                            h82.c.f(rVar8, context6, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930");
                                            break;
                                        case 2:
                                            int i310 = r.f165491f;
                                            h82.c.f(rVar8, context6, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/#:~:text=The%20RMSSD%20reflects%20the%20beat,%2Dterm%20HRV%20(37)");
                                            break;
                                        case 3:
                                            int i311 = r.f165491f;
                                            h82.c.f(rVar8, context6, "https://www.firstbeatanalytics.com/en/features/respiration-rate/");
                                            break;
                                        default:
                                            int i312 = r.f165491f;
                                            h82.c.f(rVar8, context6, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/all-about-heart-rate-pulse");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar13.K(obj19);
                            obj8 = obj19;
                        }
                    }
                    obj8 = objQ6;
                    rVar7.h(i58, (e23.a) obj8, strP2, mVar13);
                } else {
                    mVar13.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
