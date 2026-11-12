package ix0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import f02.t;
import gl1.y;
import h82.r;
import o4.d0;
import o4.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f95678b;

    public /* synthetic */ c(i iVar, int i14) {
        this.f95677a = i14;
        this.f95678b = iVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        long j8;
        int i14 = this.f95677a;
        int i15 = 2;
        final i iVar = this.f95678b;
        boolean z14 = false;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = i.f95700f;
                if (mVar.n(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    iVar.m(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                boolean z15 = true;
                final r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = i.f95700f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    z15 = false;
                }
                if (mVar2.n(iIntValue2 & 1, z15)) {
                    x1 x1Var2 = n.f135158a;
                    int i19 = ((iIntValue2 << 3) & 112) | 6;
                    rVar.k(z3.f.c(308883223, new i40.a(rVar, 26), mVar2), mVar2, i19);
                    rVar.o(R.string.mct_this_feature_is_not_contraception, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    final int i24 = z14 ? 1 : 0;
                    rVar.a(z3.f.c(1406556480, new p() { // from class: ix0.e
                        /* JADX WARN: Code duplicated, block: B:14:0x0070  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
                        /* JADX WARN: Code duplicated, block: B:39:0x010a  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0134  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i25 = i24;
                            m.a aVar = m.f135153a;
                            final i iVar2 = iVar;
                            final int i26 = 2;
                            final int i27 = 0;
                            final int i28 = 1;
                            switch (i25) {
                                case 0:
                                    m mVar3 = (m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i29 = i.f95700f;
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = n.f135158a;
                                        boolean zR = mVar3.r(iVar2);
                                        Object objQ = mVar3.q();
                                        if (zR) {
                                            objQ = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i30 = i27;
                                                    i iVar3 = iVar2;
                                                    switch (i30) {
                                                        case 0:
                                                            int i34 = i.f95700f;
                                                            iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i35 = i.f95700f;
                                                            iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i36 = i.f95700f;
                                                            iVar3.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i37 = i.f95700f;
                                                            iVar3.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i30 = i27;
                                                        i iVar3 = iVar2;
                                                        switch (i30) {
                                                            case 0:
                                                                int i34 = i.f95700f;
                                                                iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i35 = i.f95700f;
                                                                iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i36 = i.f95700f;
                                                                iVar3.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i37 = i.f95700f;
                                                                iVar3.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ);
                                            }
                                        }
                                        e23.a<Unit> aVar2 = (e23.a) objQ;
                                        r rVar2 = rVar;
                                        rVar2.B(R.string.mct_about_menstrual_cycles, null, false, aVar2, mVar3, 0, 6);
                                        boolean zR2 = mVar3.r(iVar2);
                                        Object objQ2 = mVar3.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i30 = i28;
                                                    i iVar3 = iVar2;
                                                    switch (i30) {
                                                        case 0:
                                                            int i34 = i.f95700f;
                                                            iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i35 = i.f95700f;
                                                            iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i36 = i.f95700f;
                                                            iVar3.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i37 = i.f95700f;
                                                            iVar3.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i30 = i28;
                                                        i iVar3 = iVar2;
                                                        switch (i30) {
                                                            case 0:
                                                                int i34 = i.f95700f;
                                                                iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i35 = i.f95700f;
                                                                iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i36 = i.f95700f;
                                                                iVar3.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i37 = i.f95700f;
                                                                iVar3.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ2);
                                            }
                                        }
                                        rVar2.B(R.string.mct_cycle_types_predictions, null, false, (e23.a) objQ2, mVar3, 0, 6);
                                        boolean zR3 = mVar3.r(iVar2);
                                        Object objQ3 = mVar3.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i30 = i26;
                                                    i iVar3 = iVar2;
                                                    switch (i30) {
                                                        case 0:
                                                            int i34 = i.f95700f;
                                                            iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i35 = i.f95700f;
                                                            iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i36 = i.f95700f;
                                                            iVar3.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i37 = i.f95700f;
                                                            iVar3.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i30 = i26;
                                                        i iVar3 = iVar2;
                                                        switch (i30) {
                                                            case 0:
                                                                int i34 = i.f95700f;
                                                                iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i35 = i.f95700f;
                                                                iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i36 = i.f95700f;
                                                                iVar3.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i37 = i.f95700f;
                                                                iVar3.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ3);
                                            }
                                        }
                                        rVar2.B(R.string.pregnancy_tracking, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                        boolean zR4 = mVar3.r(iVar2);
                                        Object objQ4 = mVar3.q();
                                        if (zR4) {
                                            final int i30 = 3;
                                            objQ4 = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i34 = i30;
                                                    i iVar3 = iVar2;
                                                    switch (i34) {
                                                        case 0:
                                                            int i35 = i.f95700f;
                                                            iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i36 = i.f95700f;
                                                            iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i37 = i.f95700f;
                                                            iVar3.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i38 = i.f95700f;
                                                            iVar3.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                final int i34 = 3;
                                                objQ4 = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i35 = i34;
                                                        i iVar3 = iVar2;
                                                        switch (i35) {
                                                            case 0:
                                                                int i36 = i.f95700f;
                                                                iVar3.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i37 = i.f95700f;
                                                                iVar3.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i38 = i.f95700f;
                                                                iVar3.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i39 = i.f95700f;
                                                                iVar3.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ4);
                                            }
                                        }
                                        rVar2.B(R.string.mct_calendar_legend, null, false, (e23.a) objQ4, mVar3, 0, 6);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    m mVar4 = (m) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    int i35 = i.f95700f;
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        r rVar3 = rVar;
                                        rVar3.t(R.string.mct_no_period, mVar4, 0);
                                        rVar3.o(R.string.mct_none_body_1, 0, 2, null, mVar4);
                                        rVar3.q(y.P(R.string.mct_none_body_2, new Object[]{y.Q(mVar4, R.string.mct_no_period)}, mVar4), mVar4, 0);
                                        rVar3.o(R.string.mct_none_footnote, 0, 2, null, mVar4);
                                        Context context = (Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR5 = mVar4.r(iVar2) | mVar4.r(context);
                                        Object objQ5 = mVar4.q();
                                        if (zR5) {
                                            objQ5 = new i91.c(17, iVar2, context);
                                            mVar4.K(objQ5);
                                        } else {
                                            aVar.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                objQ5 = new i91.c(17, iVar2, context);
                                                mVar4.K(objQ5);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ5, R.string.pregnancy_learn_more_mayo_clinic, mVar4, 0);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, i19);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i25 = i.f95700f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    iVar.g(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i26 = i.f95700f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    iVar.l(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i27 = i.f95700f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    iVar.n(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i28 = i.f95700f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    iVar.k(mVar6, h82.c.f82429e);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i29 = i.f95700f;
                ((r) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ = y.Q(mVar7, R.string.mct_period_day);
                    t.f67748a.getClass();
                    gl.c cVar = gl.c.f77766a;
                    cVar.getClass();
                    gl.e eVar = gl.c.f77767b;
                    d0 d0VarA = d0.a(eVar.f77800p0);
                    int i30 = h82.c.f82429e << 21;
                    int i34 = i30 | 24576;
                    i iVar2 = this.f95678b;
                    iVar2.j(strQ, null, d0VarA, null, true, false, null, mVar7, i34, 106);
                    String strQ2 = y.Q(mVar7, R.string.mct_predicted_period_day);
                    cVar.getClass();
                    iVar2.j(strQ2, null, d0.a(eVar.f77806s0), null, true, false, null, mVar7, i34, 106);
                    iVar2.j(y.Q(mVar7, R.string.lbl_estimated_ovulation_day), null, d0.a(gl.c.a(mVar7).j()), null, true, false, null, mVar7, i34, 106);
                    String strQ3 = y.Q(mVar7, R.string.mct_fertile_day);
                    cVar.getClass();
                    iVar2.j(strQ3, null, d0.a(eVar.f77817y), null, true, false, null, mVar7, i34, 106);
                    iVar2.j(y.Q(mVar7, R.string.mct_predicted_fertile_day), null, d0.a(f0.d(4278681435L)), null, true, false, null, mVar7, i34, 106);
                    String strQ4 = y.Q(mVar7, R.string.mct_ovulation_day_logged);
                    cVar.getClass();
                    iVar2.j(strQ4, null, d0.a(eVar.f77817y), null, false, false, null, mVar7, i30, 122);
                    String strQ5 = y.Q(mVar7, R.string.mct_symptoms_logged);
                    d92.b.f58623a.getClass();
                    iVar2.j(strQ5, null, d0.a(f0.d(d92.b.d(mVar7) ? 4282071867L : 4292401368L)), null, false, false, null, mVar7, i30, 122);
                    String strQ6 = y.Q(mVar7, R.string.mct_notes_logged);
                    if (d92.b.d(mVar7)) {
                        mVar7.C(-1307049707);
                        j8 = d92.b.a(mVar7).f().f63508c;
                    } else {
                        mVar7.C(-1307048651);
                        j8 = d92.b.a(mVar7).f().f63509d;
                    }
                    mVar7.f();
                    iVar2.j(strQ6, null, d0.a(j8), null, false, false, null, mVar7, i30 | 196608, 90);
                    iVar2.j(y.Q(mVar7, R.string.pregnancy_start_date_title), null, null, Integer.valueOf(R.drawable.ic_pregnancy_calendar), false, false, null, mVar7, i30, 118);
                } else {
                    mVar7.e();
                }
                break;
            default:
                final r rVar2 = (r) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i35 = i.f95700f;
                rVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    int i36 = (iIntValue8 << 3) & 112;
                    rVar2.D(R.string.lbl_cycle_types_and_predictions, mVar8, i36);
                    int i37 = i36 | 6;
                    rVar2.j(z3.f.c(189894934, new i40.a(rVar2, 27), mVar8), mVar8, i37);
                    rVar2.j(z3.f.c(-942391169, new i40.a(rVar2, 28), mVar8), mVar8, i37);
                    rVar2.j(z3.f.c(2017202398, new p() { // from class: ix0.e
                        /* JADX WARN: Code duplicated, block: B:14:0x0070  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
                        /* JADX WARN: Code duplicated, block: B:39:0x010a  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0134  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i210 = i16;
                            m.a aVar = m.f135153a;
                            final i iVar3 = iVar;
                            final int i211 = 2;
                            final int i212 = 0;
                            final int i213 = 1;
                            switch (i210) {
                                case 0:
                                    m mVar9 = (m) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    int i214 = i.f95700f;
                                    if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        x1 x1Var9 = n.f135158a;
                                        boolean zR = mVar9.r(iVar3);
                                        Object objQ = mVar9.q();
                                        if (zR) {
                                            objQ = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i212;
                                                    i iVar4 = iVar3;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = i.f95700f;
                                                            iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i310 = i.f95700f;
                                                            iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i311 = i.f95700f;
                                                            iVar4.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i312 = i.f95700f;
                                                            iVar4.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i212;
                                                        i iVar4 = iVar3;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = i.f95700f;
                                                                iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i310 = i.f95700f;
                                                                iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i311 = i.f95700f;
                                                                iVar4.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i312 = i.f95700f;
                                                                iVar4.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ);
                                            }
                                        }
                                        e23.a<Unit> aVar2 = (e23.a) objQ;
                                        r rVar3 = rVar2;
                                        rVar3.B(R.string.mct_about_menstrual_cycles, null, false, aVar2, mVar9, 0, 6);
                                        boolean zR2 = mVar9.r(iVar3);
                                        Object objQ2 = mVar9.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i213;
                                                    i iVar4 = iVar3;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = i.f95700f;
                                                            iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i310 = i.f95700f;
                                                            iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i311 = i.f95700f;
                                                            iVar4.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i312 = i.f95700f;
                                                            iVar4.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i213;
                                                        i iVar4 = iVar3;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = i.f95700f;
                                                                iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i310 = i.f95700f;
                                                                iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i311 = i.f95700f;
                                                                iVar4.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i312 = i.f95700f;
                                                                iVar4.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ2);
                                            }
                                        }
                                        rVar3.B(R.string.mct_cycle_types_predictions, null, false, (e23.a) objQ2, mVar9, 0, 6);
                                        boolean zR3 = mVar9.r(iVar3);
                                        Object objQ3 = mVar9.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i211;
                                                    i iVar4 = iVar3;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = i.f95700f;
                                                            iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i310 = i.f95700f;
                                                            iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i311 = i.f95700f;
                                                            iVar4.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i312 = i.f95700f;
                                                            iVar4.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i211;
                                                        i iVar4 = iVar3;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = i.f95700f;
                                                                iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i310 = i.f95700f;
                                                                iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i311 = i.f95700f;
                                                                iVar4.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i312 = i.f95700f;
                                                                iVar4.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ3);
                                            }
                                        }
                                        rVar3.B(R.string.pregnancy_tracking, null, false, (e23.a) objQ3, mVar9, 0, 6);
                                        boolean zR4 = mVar9.r(iVar3);
                                        Object objQ4 = mVar9.q();
                                        if (zR4) {
                                            final int i38 = 3;
                                            objQ4 = new e23.a() { // from class: ix0.h
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i39 = i38;
                                                    i iVar4 = iVar3;
                                                    switch (i39) {
                                                        case 0:
                                                            int i310 = i.f95700f;
                                                            iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                            break;
                                                        case 1:
                                                            int i311 = i.f95700f;
                                                            iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                            break;
                                                        case 2:
                                                            int i312 = i.f95700f;
                                                            iVar4.e("PREGNANCY_TRACKING");
                                                            break;
                                                        default:
                                                            int i313 = i.f95700f;
                                                            iVar4.e("CALENDAR_LEGEND");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                final int i39 = 3;
                                                objQ4 = new e23.a() { // from class: ix0.h
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i39;
                                                        i iVar4 = iVar3;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = i.f95700f;
                                                                iVar4.e("ABOUT_MENSTRUAL_CYCLES");
                                                                break;
                                                            case 1:
                                                                int i312 = i.f95700f;
                                                                iVar4.e("CYCLE_TYPES_AND_PREDICTIONS");
                                                                break;
                                                            case 2:
                                                                int i313 = i.f95700f;
                                                                iVar4.e("PREGNANCY_TRACKING");
                                                                break;
                                                            default:
                                                                int i314 = i.f95700f;
                                                                iVar4.e("CALENDAR_LEGEND");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ4);
                                            }
                                        }
                                        rVar3.B(R.string.mct_calendar_legend, null, false, (e23.a) objQ4, mVar9, 0, 6);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                                default:
                                    m mVar10 = (m) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    int i310 = i.f95700f;
                                    if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        x1 x1Var10 = n.f135158a;
                                        r rVar4 = rVar2;
                                        rVar4.t(R.string.mct_no_period, mVar10, 0);
                                        rVar4.o(R.string.mct_none_body_1, 0, 2, null, mVar10);
                                        rVar4.q(y.P(R.string.mct_none_body_2, new Object[]{y.Q(mVar10, R.string.mct_no_period)}, mVar10), mVar10, 0);
                                        rVar4.o(R.string.mct_none_footnote, 0, 2, null, mVar10);
                                        Context context = (Context) mVar10.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR5 = mVar10.r(iVar3) | mVar10.r(context);
                                        Object objQ5 = mVar10.q();
                                        if (zR5) {
                                            objQ5 = new i91.c(17, iVar3, context);
                                            mVar10.K(objQ5);
                                        } else {
                                            aVar.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                objQ5 = new i91.c(17, iVar3, context);
                                                mVar10.K(objQ5);
                                            }
                                        }
                                        rVar4.v((e23.a) objQ5, R.string.pregnancy_learn_more_mayo_clinic, mVar10, 0);
                                    } else {
                                        mVar10.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar8), mVar8, i37);
                    rVar2.j(z3.f.c(681828669, new i40.a(rVar2, 29), mVar8), mVar8, i37);
                    rVar2.j(z3.f.c(-653545060, new f(rVar2, z14 ? 1 : 0), mVar8), mVar8, i37);
                    rVar2.j(z3.f.c(-1988918789, new f(rVar2, i16), mVar8), mVar8, i37);
                    rVar2.j(z3.f.c(970674778, new f(rVar2, i15), mVar8), mVar8, i37);
                    rVar2.o(R.string.mct_this_feature_is_not_contraception, (iIntValue8 << 6) & 896, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
