package pb1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f136837b;

    public /* synthetic */ c(h hVar, int i14) {
        this.f136836a = i14;
        this.f136837b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f136836a;
        final int i15 = 3;
        final int i16 = 2;
        final h hVar = this.f136837b;
        Object[] objArr = 0;
        char c14 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = h.f136849f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    hVar.h(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = h.f136849f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    hVar.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = h.f136849f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    hVar.i(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = h.f136849f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    hVar.j(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                final r rVar = (r) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = h.f136849f;
                rVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i26 = (iIntValue5 << 3) & 112;
                    rVar.D(R.string.pregnancy_help_training_title, mVar5, i26);
                    rVar.l(R.string.pregnancy_help_training_subtitle, (iIntValue5 << 6) & 896, 2, null, mVar5);
                    int i27 = i26 | 6;
                    rVar.j(z3.f.c(1475030925, new or0.f(rVar, 4), mVar5), mVar5, i27);
                    rVar.j(z3.f.c(342744822, new or0.f(rVar, 5), mVar5), mVar5, i27);
                    rVar.j(z3.f.c(-992628907, new or0.f(rVar, 6), mVar5), mVar5, i27);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    rVar.j(z3.f.c(1966964660, new p() { // from class: pb1.e
                        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
                        /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0115  */
                        /* JADX WARN: Code duplicated, block: B:54:0x013c  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0199  */
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
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i28 = objArr2;
                            r rVar2 = rVar;
                            m.a aVar = m.f135153a;
                            final h hVar2 = hVar;
                            final int i29 = 2;
                            final int i30 = 1;
                            final int i34 = 0;
                            switch (i28) {
                                case 0:
                                    m mVar6 = (m) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    int i35 = h.f136849f;
                                    if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = n.f135158a;
                                        rVar2.t(R.string.pregnancy_help_train_with_caution_title, mVar6, 0);
                                        final Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR = mVar6.r(hVar2) | mVar6.r(context);
                                        Object objQ = mVar6.q();
                                        if (zR) {
                                            objQ = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i36 = i34;
                                                    Context context2 = context;
                                                    h hVar3 = hVar2;
                                                    switch (i36) {
                                                        case 0:
                                                            int i37 = h.f136849f;
                                                            h82.c.f(hVar3, context2, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i38 = h.f136849f;
                                                            h82.c.f(hVar3, context2, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i39 = h.f136849f;
                                                            h82.c.f(hVar3, context2, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar6.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i36 = i34;
                                                        Context context2 = context;
                                                        h hVar3 = hVar2;
                                                        switch (i36) {
                                                            case 0:
                                                                int i37 = h.f136849f;
                                                                h82.c.f(hVar3, context2, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i38 = h.f136849f;
                                                                h82.c.f(hVar3, context2, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i39 = h.f136849f;
                                                                h82.c.f(hVar3, context2, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar6.K(objQ);
                                            }
                                        }
                                        rVar2.v((e23.a) objQ, R.string.pregnancy_help_train_with_caution_body, mVar6, 0);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                                case 1:
                                    m mVar7 = (m) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    int i36 = h.f136849f;
                                    if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        boolean zR2 = mVar7.r(hVar2);
                                        Object objQ2 = mVar7.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i37 = i34;
                                                    h hVar3 = hVar2;
                                                    switch (i37) {
                                                        case 0:
                                                            int i38 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i37 = i34;
                                                        h hVar3 = hVar2;
                                                        switch (i37) {
                                                            case 0:
                                                                int i38 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ2);
                                            }
                                        }
                                        r rVar3 = rVar;
                                        rVar3.B(R.string.lbl_overview, null, false, (e23.a) objQ2, mVar7, 0, 6);
                                        boolean zR3 = mVar7.r(hVar2);
                                        Object objQ3 = mVar7.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i37 = i30;
                                                    h hVar3 = hVar2;
                                                    switch (i37) {
                                                        case 0:
                                                            int i38 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i37 = i30;
                                                        h hVar3 = hVar2;
                                                        switch (i37) {
                                                            case 0:
                                                                int i38 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ3);
                                            }
                                        }
                                        rVar3.B(R.string.pregnancy_help_wellness_tracking, null, false, (e23.a) objQ3, mVar7, 0, 6);
                                        boolean zR4 = mVar7.r(hVar2);
                                        Object objQ4 = mVar7.q();
                                        if (zR4) {
                                            objQ4 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i37 = i29;
                                                    h hVar3 = hVar2;
                                                    switch (i37) {
                                                        case 0:
                                                            int i38 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                objQ4 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i37 = i29;
                                                        h hVar3 = hVar2;
                                                        switch (i37) {
                                                            case 0:
                                                                int i38 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ4);
                                            }
                                        }
                                        rVar3.B(R.string.pregnancy_help_training_performance, null, false, (e23.a) objQ4, mVar7, 0, 6);
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                                case 2:
                                    m mVar8 = (m) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    int i37 = h.f136849f;
                                    if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        rVar2.t(R.string.lbl_heart_rate_cap, mVar8, 0);
                                        final Context context2 = (Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR5 = mVar8.r(hVar2) | mVar8.r(context2);
                                        Object objQ5 = mVar8.q();
                                        if (zR5) {
                                            objQ5 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i29;
                                                    Context context3 = context2;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            h82.c.f(hVar3, context3, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            h82.c.f(hVar3, context3, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context3, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ5);
                                        } else {
                                            aVar.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                objQ5 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i29;
                                                        Context context3 = context2;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                h82.c.f(hVar3, context3, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                h82.c.f(hVar3, context3, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context3, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ5);
                                            }
                                        }
                                        rVar2.v((e23.a) objQ5, R.string.pregnancy_help_wellness_tracking_hr_body, mVar8, 0);
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                default:
                                    m mVar9 = (m) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    int i38 = h.f136849f;
                                    if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        x1 x1Var9 = n.f135158a;
                                        rVar2.t(R.string.lbl_calories, mVar9, 0);
                                        final Context context3 = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR6 = mVar9.r(hVar2) | mVar9.r(context3);
                                        Object objQ6 = mVar9.q();
                                        if (zR6) {
                                            objQ6 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i39 = i30;
                                                    Context context4 = context3;
                                                    h hVar3 = hVar2;
                                                    switch (i39) {
                                                        case 0:
                                                            int i310 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ6);
                                        } else {
                                            aVar.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                objQ6 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i39 = i30;
                                                        Context context4 = context3;
                                                        h hVar3 = hVar2;
                                                        switch (i39) {
                                                            case 0:
                                                                int i310 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ6);
                                            }
                                        }
                                        rVar2.v((e23.a) objQ6, R.string.pregnancy_help_wellness_tracking_calories_body1, mVar9, 0);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar5), mVar5, i27);
                    rVar.j(z3.f.c(631590931, new or0.f(rVar, 7), mVar5), mVar5, i27);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                boolean z14 = false;
                final r rVar2 = (r) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i28 = h.f136849f;
                rVar2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar2) ? 4 : 2;
                }
                if ((iIntValue6 & 19) != 18) {
                    z14 = true;
                }
                if (mVar6.n(iIntValue6 & 1, z14)) {
                    x1 x1Var6 = n.f135158a;
                    int i29 = (iIntValue6 << 3) & 112;
                    rVar2.D(R.string.pregnancy_help_wellness_tracking_title, mVar6, i29);
                    rVar2.l(R.string.pregnancy_help_wellness_tracking_subtitle, (iIntValue6 << 6) & 896, 2, null, mVar6);
                    int i30 = i29 | 6;
                    rVar2.j(z3.f.c(618244906, new p() { // from class: pb1.e
                        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
                        /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0115  */
                        /* JADX WARN: Code duplicated, block: B:54:0x013c  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0199  */
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
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i210 = i16;
                            r rVar3 = rVar2;
                            m.a aVar = m.f135153a;
                            final h hVar2 = hVar;
                            final int i211 = 2;
                            final int i34 = 1;
                            final int i35 = 0;
                            switch (i210) {
                                case 0:
                                    m mVar7 = (m) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    int i36 = h.f136849f;
                                    if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        rVar3.t(R.string.pregnancy_help_train_with_caution_title, mVar7, 0);
                                        final Context context = (Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR = mVar7.r(hVar2) | mVar7.r(context);
                                        Object objQ = mVar7.q();
                                        if (zR) {
                                            objQ = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i39 = i35;
                                                    Context context4 = context;
                                                    h hVar3 = hVar2;
                                                    switch (i39) {
                                                        case 0:
                                                            int i310 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i39 = i35;
                                                        Context context4 = context;
                                                        h hVar3 = hVar2;
                                                        switch (i39) {
                                                            case 0:
                                                                int i310 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ, R.string.pregnancy_help_train_with_caution_body, mVar7, 0);
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                                case 1:
                                    m mVar8 = (m) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    int i37 = h.f136849f;
                                    if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        boolean zR2 = mVar8.r(hVar2);
                                        Object objQ2 = mVar8.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i35;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i35;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ2);
                                            }
                                        }
                                        r rVar4 = rVar2;
                                        rVar4.B(R.string.lbl_overview, null, false, (e23.a) objQ2, mVar8, 0, 6);
                                        boolean zR3 = mVar8.r(hVar2);
                                        Object objQ3 = mVar8.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i34;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i34;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ3);
                                            }
                                        }
                                        rVar4.B(R.string.pregnancy_help_wellness_tracking, null, false, (e23.a) objQ3, mVar8, 0, 6);
                                        boolean zR4 = mVar8.r(hVar2);
                                        Object objQ4 = mVar8.q();
                                        if (zR4) {
                                            objQ4 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i211;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                objQ4 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i211;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ4);
                                            }
                                        }
                                        rVar4.B(R.string.pregnancy_help_training_performance, null, false, (e23.a) objQ4, mVar8, 0, 6);
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                case 2:
                                    m mVar9 = (m) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    int i38 = h.f136849f;
                                    if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        x1 x1Var9 = n.f135158a;
                                        rVar3.t(R.string.lbl_heart_rate_cap, mVar9, 0);
                                        final Context context2 = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR5 = mVar9.r(hVar2) | mVar9.r(context2);
                                        Object objQ5 = mVar9.q();
                                        if (zR5) {
                                            objQ5 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i39 = i211;
                                                    Context context4 = context2;
                                                    h hVar3 = hVar2;
                                                    switch (i39) {
                                                        case 0:
                                                            int i310 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ5);
                                        } else {
                                            aVar.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                objQ5 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i39 = i211;
                                                        Context context4 = context2;
                                                        h hVar3 = hVar2;
                                                        switch (i39) {
                                                            case 0:
                                                                int i310 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ5);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ5, R.string.pregnancy_help_wellness_tracking_hr_body, mVar9, 0);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                                default:
                                    m mVar10 = (m) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    int i39 = h.f136849f;
                                    if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        x1 x1Var10 = n.f135158a;
                                        rVar3.t(R.string.lbl_calories, mVar10, 0);
                                        final Context context3 = (Context) mVar10.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR6 = mVar10.r(hVar2) | mVar10.r(context3);
                                        Object objQ6 = mVar10.q();
                                        if (zR6) {
                                            objQ6 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i34;
                                                    Context context4 = context3;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar10.K(objQ6);
                                        } else {
                                            aVar.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                objQ6 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i34;
                                                        Context context4 = context3;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar10.K(objQ6);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ6, R.string.pregnancy_help_wellness_tracking_calories_body1, mVar10, 0);
                                    } else {
                                        mVar10.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar6), mVar6, i30);
                    rVar2.j(z3.f.c(-514041197, new or0.f(rVar2, 9), mVar6), mVar6, i30);
                    rVar2.j(z3.f.c(-1849414926, new or0.f(rVar2, 10), mVar6), mVar6, i30);
                    rVar2.j(z3.f.c(1110178641, new p() { // from class: pb1.e
                        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
                        /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0115  */
                        /* JADX WARN: Code duplicated, block: B:54:0x013c  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0199  */
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
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i210 = i15;
                            r rVar3 = rVar2;
                            m.a aVar = m.f135153a;
                            final h hVar2 = hVar;
                            final int i211 = 2;
                            final int i34 = 1;
                            final int i35 = 0;
                            switch (i210) {
                                case 0:
                                    m mVar7 = (m) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    int i36 = h.f136849f;
                                    if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        x1 x1Var7 = n.f135158a;
                                        rVar3.t(R.string.pregnancy_help_train_with_caution_title, mVar7, 0);
                                        final Context context = (Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR = mVar7.r(hVar2) | mVar7.r(context);
                                        Object objQ = mVar7.q();
                                        if (zR) {
                                            objQ = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i35;
                                                    Context context4 = context;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i35;
                                                        Context context4 = context;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ, R.string.pregnancy_help_train_with_caution_body, mVar7, 0);
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                                case 1:
                                    m mVar8 = (m) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    int i37 = h.f136849f;
                                    if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        boolean zR2 = mVar8.r(hVar2);
                                        Object objQ2 = mVar8.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i35;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i35;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ2);
                                            }
                                        }
                                        r rVar4 = rVar2;
                                        rVar4.B(R.string.lbl_overview, null, false, (e23.a) objQ2, mVar8, 0, 6);
                                        boolean zR3 = mVar8.r(hVar2);
                                        Object objQ3 = mVar8.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i34;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i34;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ3);
                                            }
                                        }
                                        rVar4.B(R.string.pregnancy_help_wellness_tracking, null, false, (e23.a) objQ3, mVar8, 0, 6);
                                        boolean zR4 = mVar8.r(hVar2);
                                        Object objQ4 = mVar8.q();
                                        if (zR4) {
                                            objQ4 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i38 = i211;
                                                    h hVar3 = hVar2;
                                                    switch (i38) {
                                                        case 0:
                                                            int i39 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i310 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                objQ4 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i38 = i211;
                                                        h hVar3 = hVar2;
                                                        switch (i38) {
                                                            case 0:
                                                                int i39 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i310 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ4);
                                            }
                                        }
                                        rVar4.B(R.string.pregnancy_help_training_performance, null, false, (e23.a) objQ4, mVar8, 0, 6);
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                case 2:
                                    m mVar9 = (m) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    int i38 = h.f136849f;
                                    if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        x1 x1Var9 = n.f135158a;
                                        rVar3.t(R.string.lbl_heart_rate_cap, mVar9, 0);
                                        final Context context2 = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR5 = mVar9.r(hVar2) | mVar9.r(context2);
                                        Object objQ5 = mVar9.q();
                                        if (zR5) {
                                            objQ5 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i211;
                                                    Context context4 = context2;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ5);
                                        } else {
                                            aVar.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                objQ5 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i211;
                                                        Context context4 = context2;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ5);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ5, R.string.pregnancy_help_wellness_tracking_hr_body, mVar9, 0);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                                default:
                                    m mVar10 = (m) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    int i39 = h.f136849f;
                                    if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        x1 x1Var10 = n.f135158a;
                                        rVar3.t(R.string.lbl_calories, mVar10, 0);
                                        final Context context3 = (Context) mVar10.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR6 = mVar10.r(hVar2) | mVar10.r(context3);
                                        Object objQ6 = mVar10.q();
                                        if (zR6) {
                                            objQ6 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i34;
                                                    Context context4 = context3;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar10.K(objQ6);
                                        } else {
                                            aVar.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                objQ6 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i34;
                                                        Context context4 = context3;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar10.K(objQ6);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ6, R.string.pregnancy_help_wellness_tracking_calories_body1, mVar10, 0);
                                    } else {
                                        mVar10.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar6), mVar6, i30);
                    rVar2.j(z3.f.c(-225195088, new or0.f(rVar2, 11), mVar6), mVar6, i30);
                } else {
                    mVar6.e();
                }
                break;
            default:
                final r rVar3 = (r) obj;
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i34 = h.f136849f;
                rVar3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(rVar3) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    int i35 = ((iIntValue7 << 3) & 112) | 6;
                    rVar3.k(z3.f.c(-1675862574, new or0.f(rVar3, 8), mVar7), mVar7, i35);
                    final char c15 = c14 == true ? 1 : 0;
                    rVar3.a(z3.f.c(1522112265, new p() { // from class: pb1.e
                        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
                        /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0115  */
                        /* JADX WARN: Code duplicated, block: B:54:0x013c  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0199  */
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
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i210 = c15;
                            r rVar4 = rVar3;
                            m.a aVar = m.f135153a;
                            final h hVar2 = hVar;
                            final int i211 = 2;
                            final int i36 = 1;
                            final int i37 = 0;
                            switch (i210) {
                                case 0:
                                    m mVar8 = (m) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    int i38 = h.f136849f;
                                    if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        x1 x1Var8 = n.f135158a;
                                        rVar4.t(R.string.pregnancy_help_train_with_caution_title, mVar8, 0);
                                        final Context context = (Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR = mVar8.r(hVar2) | mVar8.r(context);
                                        Object objQ = mVar8.q();
                                        if (zR) {
                                            objQ = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i37;
                                                    Context context4 = context;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar8.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == m.a.f135155b) {
                                                objQ = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i37;
                                                        Context context4 = context;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar8.K(objQ);
                                            }
                                        }
                                        rVar4.v((e23.a) objQ, R.string.pregnancy_help_train_with_caution_body, mVar8, 0);
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                case 1:
                                    m mVar9 = (m) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    int i39 = h.f136849f;
                                    if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        x1 x1Var9 = n.f135158a;
                                        boolean zR2 = mVar9.r(hVar2);
                                        Object objQ2 = mVar9.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i37;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i37;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ2);
                                            }
                                        }
                                        r rVar5 = rVar3;
                                        rVar5.B(R.string.lbl_overview, null, false, (e23.a) objQ2, mVar9, 0, 6);
                                        boolean zR3 = mVar9.r(hVar2);
                                        Object objQ3 = mVar9.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i36;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i36;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ3);
                                            }
                                        }
                                        rVar5.B(R.string.pregnancy_help_wellness_tracking, null, false, (e23.a) objQ3, mVar9, 0, 6);
                                        boolean zR4 = mVar9.r(hVar2);
                                        Object objQ4 = mVar9.q();
                                        if (zR4) {
                                            objQ4 = new e23.a() { // from class: pb1.g
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i310 = i211;
                                                    h hVar3 = hVar2;
                                                    switch (i310) {
                                                        case 0:
                                                            int i311 = h.f136849f;
                                                            hVar3.e("Overview");
                                                            break;
                                                        case 1:
                                                            int i312 = h.f136849f;
                                                            hVar3.e("Wellness Tracking");
                                                            break;
                                                        default:
                                                            int i44 = h.f136849f;
                                                            hVar3.e("Training and Performance");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar9.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == m.a.f135155b) {
                                                objQ4 = new e23.a() { // from class: pb1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i310 = i211;
                                                        h hVar3 = hVar2;
                                                        switch (i310) {
                                                            case 0:
                                                                int i311 = h.f136849f;
                                                                hVar3.e("Overview");
                                                                break;
                                                            case 1:
                                                                int i312 = h.f136849f;
                                                                hVar3.e("Wellness Tracking");
                                                                break;
                                                            default:
                                                                int i44 = h.f136849f;
                                                                hVar3.e("Training and Performance");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar9.K(objQ4);
                                            }
                                        }
                                        rVar5.B(R.string.pregnancy_help_training_performance, null, false, (e23.a) objQ4, mVar9, 0, 6);
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                                case 2:
                                    m mVar10 = (m) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    int i310 = h.f136849f;
                                    if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        x1 x1Var10 = n.f135158a;
                                        rVar4.t(R.string.lbl_heart_rate_cap, mVar10, 0);
                                        final Context context2 = (Context) mVar10.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR5 = mVar10.r(hVar2) | mVar10.r(context2);
                                        Object objQ5 = mVar10.q();
                                        if (zR5) {
                                            objQ5 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i311 = i211;
                                                    Context context4 = context2;
                                                    h hVar3 = hVar2;
                                                    switch (i311) {
                                                        case 0:
                                                            int i312 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i314 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar10.K(objQ5);
                                        } else {
                                            aVar.getClass();
                                            if (objQ5 == m.a.f135155b) {
                                                objQ5 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i311 = i211;
                                                        Context context4 = context2;
                                                        h hVar3 = hVar2;
                                                        switch (i311) {
                                                            case 0:
                                                                int i312 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i314 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar10.K(objQ5);
                                            }
                                        }
                                        rVar4.v((e23.a) objQ5, R.string.pregnancy_help_wellness_tracking_hr_body, mVar10, 0);
                                    } else {
                                        mVar10.e();
                                    }
                                    break;
                                default:
                                    m mVar11 = (m) obj4;
                                    int iIntValue11 = ((Integer) obj5).intValue();
                                    int i311 = h.f136849f;
                                    if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                        x1 x1Var11 = n.f135158a;
                                        rVar4.t(R.string.lbl_calories, mVar11, 0);
                                        final Context context3 = (Context) mVar11.A(AndroidCompositionLocals_androidKt.f6042b);
                                        boolean zR6 = mVar11.r(hVar2) | mVar11.r(context3);
                                        Object objQ6 = mVar11.q();
                                        if (zR6) {
                                            objQ6 = new e23.a() { // from class: pb1.f
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i312 = i36;
                                                    Context context4 = context3;
                                                    h hVar3 = hVar2;
                                                    switch (i312) {
                                                        case 0:
                                                            int i313 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                            break;
                                                        case 1:
                                                            int i314 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                            break;
                                                        default:
                                                            int i315 = h.f136849f;
                                                            h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar11.K(objQ6);
                                        } else {
                                            aVar.getClass();
                                            if (objQ6 == m.a.f135155b) {
                                                objQ6 = new e23.a() { // from class: pb1.f
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i312 = i36;
                                                        Context context4 = context3;
                                                        h hVar3 = hVar2;
                                                        switch (i312) {
                                                            case 0:
                                                                int i313 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.acog.org/Patients/FAQs/Exercise-During-Pregnancy?IsMobileSet=false");
                                                                break;
                                                            case 1:
                                                                int i314 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.eatright.org/health/pregnancy/prenatal-wellness/healthy-weight-during-pregnancy");
                                                                break;
                                                            default:
                                                                int i315 = h.f136849f;
                                                                h82.c.f(hVar3, context4, "https://www.mayoclinic.org/healthy-lifestyle/pregnancy-week-by-week/in-depth/pregnancy/art-20045977");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar11.K(objQ6);
                                            }
                                        }
                                        rVar4.v((e23.a) objQ6, R.string.pregnancy_help_wellness_tracking_calories_body1, mVar11, 0);
                                    } else {
                                        mVar11.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar7), mVar7, i35);
                } else {
                    mVar7.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
