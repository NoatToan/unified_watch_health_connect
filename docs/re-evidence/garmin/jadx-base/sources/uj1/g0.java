package uj1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import l72.v1;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f171513b;

    public /* synthetic */ g0(i0 i0Var, int i14) {
        this.f171512a = i14;
        this.f171513b = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f171512a;
        final i0 i0Var = this.f171513b;
        final int i15 = 1;
        final int i16 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = i0.f171523j;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    i0Var.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                final h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = i0.f171523j;
                rVar.getClass();
                final int i19 = 2;
                int i24 = 4;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    final Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    int i25 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.device_settings_safety_features, mVar2, i25);
                    rVar.l(R.string.incident_safety_features_description, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    int i26 = i25 | 6;
                    rVar.j(z3.f.c(-1379812092, new e23.p() { // from class: uj1.h0
                        /* JADX WARN: Code duplicated, block: B:14:0x0057  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
                        /* JADX WARN: Code duplicated, block: B:44:0x011a  */
                        /* JADX WARN: Code duplicated, block: B:59:0x0177  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i27 = i16;
                            p3.m.a aVar = p3.m.f135153a;
                            Context context2 = context;
                            i0 i0Var2 = i0Var;
                            switch (i27) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i28 = i0.f171523j;
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        h82.r rVar2 = rVar;
                                        rVar2.t(R.string.incident_detection_assistance, mVar3, 0);
                                        rVar2.o(R.string.msg_assistance_info, 0, 2, null, mVar3);
                                        String strQ = gl1.y.Q(mVar3, R.string.lbl_learn_more_about_assistance);
                                        boolean zR = mVar3.r(i0Var2) | mVar3.r(context2);
                                        Object objQ = mVar3.q();
                                        if (zR) {
                                            objQ = new f0(i0Var2, context2, 1);
                                            mVar3.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == p3.m.a.f135155b) {
                                                objQ = new f0(i0Var2, context2, 1);
                                                mVar3.K(objQ);
                                            }
                                        }
                                        v1.a(0, (e23.a) objQ, strQ, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar4 = (p3.m) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    int i29 = i0.f171523j;
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        h82.r rVar3 = rVar;
                                        rVar3.t(R.string.incident_detection_concept, mVar4, 0);
                                        rVar3.o(R.string.msg_incident_detection_description, 0, 2, null, mVar4);
                                        String strQ2 = gl1.y.Q(mVar4, R.string.lbl_learn_more_incident_detection);
                                        boolean zR2 = mVar4.r(i0Var2) | mVar4.r(context2);
                                        Object objQ2 = mVar4.q();
                                        if (zR2) {
                                            objQ2 = new f0(i0Var2, context2, 2);
                                            mVar4.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new f0(i0Var2, context2, 2);
                                                mVar4.K(objQ2);
                                            }
                                        }
                                        v1.a(0, (e23.a) objQ2, strQ2, mVar4);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                                case 2:
                                    p3.m mVar5 = (p3.m) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    int i30 = i0.f171523j;
                                    if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        String strQ3 = gl1.y.Q(mVar5, R.string.lbl_fall_detection);
                                        h82.r rVar4 = rVar;
                                        rVar4.s(0, 2, strQ3, null, mVar5);
                                        rVar4.q(gl1.y.Q(mVar5, R.string.msg_fall_detection_description), mVar5, 0);
                                        String strQ4 = gl1.y.Q(mVar5, R.string.lbl_learn_more_about_fall_detection);
                                        boolean zR3 = mVar5.r(i0Var2) | mVar5.r(context2);
                                        Object objQ3 = mVar5.q();
                                        if (zR3) {
                                            objQ3 = new f0(i0Var2, context2, 3);
                                            mVar5.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new f0(i0Var2, context2, 3);
                                                mVar5.K(objQ3);
                                            }
                                        }
                                        v1.a(0, (e23.a) objQ3, strQ4, mVar5);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar6 = (p3.m) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    int i34 = i0.f171523j;
                                    if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = p3.n.f135158a;
                                        h82.r rVar5 = rVar;
                                        rVar5.t(R.string.incident_detection_assistance_plus, mVar6, 0);
                                        rVar5.o(R.string.msg_assistance_plus_description, 0, 2, null, mVar6);
                                        String strQ5 = gl1.y.Q(mVar6, R.string.lbl_learn_more_about_assistance_plus);
                                        boolean zR4 = mVar6.r(i0Var2) | mVar6.r(context2);
                                        Object objQ4 = mVar6.q();
                                        if (zR4) {
                                            objQ4 = new f0(i0Var2, context2, 0);
                                            mVar6.K(objQ4);
                                        } else {
                                            aVar.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new f0(i0Var2, context2, 0);
                                                mVar6.K(objQ4);
                                            }
                                        }
                                        v1.a(0, (e23.a) objQ4, strQ5, mVar6);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, i26);
                    if (!i0Var.f171526h || i0Var.f171527i) {
                        mVar2.C(-346801361);
                        rVar.j(z3.f.c(1872264393, new e23.p() { // from class: uj1.h0
                            /* JADX WARN: Code duplicated, block: B:14:0x0057  */
                            /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
                            /* JADX WARN: Code duplicated, block: B:44:0x011a  */
                            /* JADX WARN: Code duplicated, block: B:59:0x0177  */
                            @Override // e23.p
                            public final Object invoke(Object obj4, Object obj5) {
                                int i27 = i15;
                                p3.m.a aVar = p3.m.f135153a;
                                Context context2 = context;
                                i0 i0Var2 = i0Var;
                                switch (i27) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        int i28 = i0.f171523j;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            h82.r rVar2 = rVar;
                                            rVar2.t(R.string.incident_detection_assistance, mVar3, 0);
                                            rVar2.o(R.string.msg_assistance_info, 0, 2, null, mVar3);
                                            String strQ = gl1.y.Q(mVar3, R.string.lbl_learn_more_about_assistance);
                                            boolean zR = mVar3.r(i0Var2) | mVar3.r(context2);
                                            Object objQ = mVar3.q();
                                            if (zR) {
                                                objQ = new f0(i0Var2, context2, 1);
                                                mVar3.K(objQ);
                                            } else {
                                                aVar.getClass();
                                                if (objQ == p3.m.a.f135155b) {
                                                    objQ = new f0(i0Var2, context2, 1);
                                                    mVar3.K(objQ);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ, strQ, mVar3);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        p3.m mVar4 = (p3.m) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        int i29 = i0.f171523j;
                                        if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            h82.r rVar3 = rVar;
                                            rVar3.t(R.string.incident_detection_concept, mVar4, 0);
                                            rVar3.o(R.string.msg_incident_detection_description, 0, 2, null, mVar4);
                                            String strQ2 = gl1.y.Q(mVar4, R.string.lbl_learn_more_incident_detection);
                                            boolean zR2 = mVar4.r(i0Var2) | mVar4.r(context2);
                                            Object objQ2 = mVar4.q();
                                            if (zR2) {
                                                objQ2 = new f0(i0Var2, context2, 2);
                                                mVar4.K(objQ2);
                                            } else {
                                                aVar.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    objQ2 = new f0(i0Var2, context2, 2);
                                                    mVar4.K(objQ2);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ2, strQ2, mVar4);
                                        } else {
                                            mVar4.e();
                                        }
                                        break;
                                    case 2:
                                        p3.m mVar5 = (p3.m) obj4;
                                        int iIntValue5 = ((Integer) obj5).intValue();
                                        int i30 = i0.f171523j;
                                        if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            String strQ3 = gl1.y.Q(mVar5, R.string.lbl_fall_detection);
                                            h82.r rVar4 = rVar;
                                            rVar4.s(0, 2, strQ3, null, mVar5);
                                            rVar4.q(gl1.y.Q(mVar5, R.string.msg_fall_detection_description), mVar5, 0);
                                            String strQ4 = gl1.y.Q(mVar5, R.string.lbl_learn_more_about_fall_detection);
                                            boolean zR3 = mVar5.r(i0Var2) | mVar5.r(context2);
                                            Object objQ3 = mVar5.q();
                                            if (zR3) {
                                                objQ3 = new f0(i0Var2, context2, 3);
                                                mVar5.K(objQ3);
                                            } else {
                                                aVar.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    objQ3 = new f0(i0Var2, context2, 3);
                                                    mVar5.K(objQ3);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ3, strQ4, mVar5);
                                        } else {
                                            mVar5.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar6 = (p3.m) obj4;
                                        int iIntValue6 = ((Integer) obj5).intValue();
                                        int i34 = i0.f171523j;
                                        if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            h82.r rVar5 = rVar;
                                            rVar5.t(R.string.incident_detection_assistance_plus, mVar6, 0);
                                            rVar5.o(R.string.msg_assistance_plus_description, 0, 2, null, mVar6);
                                            String strQ5 = gl1.y.Q(mVar6, R.string.lbl_learn_more_about_assistance_plus);
                                            boolean zR4 = mVar6.r(i0Var2) | mVar6.r(context2);
                                            Object objQ4 = mVar6.q();
                                            if (zR4) {
                                                objQ4 = new f0(i0Var2, context2, 0);
                                                mVar6.K(objQ4);
                                            } else {
                                                aVar.getClass();
                                                if (objQ4 == p3.m.a.f135155b) {
                                                    objQ4 = new f0(i0Var2, context2, 0);
                                                    mVar6.K(objQ4);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ4, strQ5, mVar6);
                                        } else {
                                            mVar6.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        mVar2.f();
                    } else {
                        mVar2.C(-346411195);
                        mVar2.f();
                    }
                    if (i0Var.f171526h) {
                        mVar2.C(-346350435);
                        rVar.j(z3.f.c(-1191131150, new e23.p() { // from class: uj1.h0
                            /* JADX WARN: Code duplicated, block: B:14:0x0057  */
                            /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
                            /* JADX WARN: Code duplicated, block: B:44:0x011a  */
                            /* JADX WARN: Code duplicated, block: B:59:0x0177  */
                            @Override // e23.p
                            public final Object invoke(Object obj4, Object obj5) {
                                int i27 = i19;
                                p3.m.a aVar = p3.m.f135153a;
                                Context context2 = context;
                                i0 i0Var2 = i0Var;
                                switch (i27) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        int i28 = i0.f171523j;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            h82.r rVar2 = rVar;
                                            rVar2.t(R.string.incident_detection_assistance, mVar3, 0);
                                            rVar2.o(R.string.msg_assistance_info, 0, 2, null, mVar3);
                                            String strQ = gl1.y.Q(mVar3, R.string.lbl_learn_more_about_assistance);
                                            boolean zR = mVar3.r(i0Var2) | mVar3.r(context2);
                                            Object objQ = mVar3.q();
                                            if (zR) {
                                                objQ = new f0(i0Var2, context2, 1);
                                                mVar3.K(objQ);
                                            } else {
                                                aVar.getClass();
                                                if (objQ == p3.m.a.f135155b) {
                                                    objQ = new f0(i0Var2, context2, 1);
                                                    mVar3.K(objQ);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ, strQ, mVar3);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        p3.m mVar4 = (p3.m) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        int i29 = i0.f171523j;
                                        if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            h82.r rVar3 = rVar;
                                            rVar3.t(R.string.incident_detection_concept, mVar4, 0);
                                            rVar3.o(R.string.msg_incident_detection_description, 0, 2, null, mVar4);
                                            String strQ2 = gl1.y.Q(mVar4, R.string.lbl_learn_more_incident_detection);
                                            boolean zR2 = mVar4.r(i0Var2) | mVar4.r(context2);
                                            Object objQ2 = mVar4.q();
                                            if (zR2) {
                                                objQ2 = new f0(i0Var2, context2, 2);
                                                mVar4.K(objQ2);
                                            } else {
                                                aVar.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    objQ2 = new f0(i0Var2, context2, 2);
                                                    mVar4.K(objQ2);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ2, strQ2, mVar4);
                                        } else {
                                            mVar4.e();
                                        }
                                        break;
                                    case 2:
                                        p3.m mVar5 = (p3.m) obj4;
                                        int iIntValue5 = ((Integer) obj5).intValue();
                                        int i30 = i0.f171523j;
                                        if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            String strQ3 = gl1.y.Q(mVar5, R.string.lbl_fall_detection);
                                            h82.r rVar4 = rVar;
                                            rVar4.s(0, 2, strQ3, null, mVar5);
                                            rVar4.q(gl1.y.Q(mVar5, R.string.msg_fall_detection_description), mVar5, 0);
                                            String strQ4 = gl1.y.Q(mVar5, R.string.lbl_learn_more_about_fall_detection);
                                            boolean zR3 = mVar5.r(i0Var2) | mVar5.r(context2);
                                            Object objQ3 = mVar5.q();
                                            if (zR3) {
                                                objQ3 = new f0(i0Var2, context2, 3);
                                                mVar5.K(objQ3);
                                            } else {
                                                aVar.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    objQ3 = new f0(i0Var2, context2, 3);
                                                    mVar5.K(objQ3);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ3, strQ4, mVar5);
                                        } else {
                                            mVar5.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar6 = (p3.m) obj4;
                                        int iIntValue6 = ((Integer) obj5).intValue();
                                        int i34 = i0.f171523j;
                                        if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            h82.r rVar5 = rVar;
                                            rVar5.t(R.string.incident_detection_assistance_plus, mVar6, 0);
                                            rVar5.o(R.string.msg_assistance_plus_description, 0, 2, null, mVar6);
                                            String strQ5 = gl1.y.Q(mVar6, R.string.lbl_learn_more_about_assistance_plus);
                                            boolean zR4 = mVar6.r(i0Var2) | mVar6.r(context2);
                                            Object objQ4 = mVar6.q();
                                            if (zR4) {
                                                objQ4 = new f0(i0Var2, context2, 0);
                                                mVar6.K(objQ4);
                                            } else {
                                                aVar.getClass();
                                                if (objQ4 == p3.m.a.f135155b) {
                                                    objQ4 = new f0(i0Var2, context2, 0);
                                                    mVar6.K(objQ4);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ4, strQ5, mVar6);
                                        } else {
                                            mVar6.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        mVar2.f();
                    } else {
                        mVar2.C(-345942971);
                        mVar2.f();
                    }
                    if (i0Var.f171525g) {
                        mVar2.C(-345880010);
                        rVar.j(z3.f.c(-2079168687, new t12.a(rVar, 12), mVar2), mVar2, i26);
                        String strQ = gl1.y.Q(mVar2, R.string.lbl_learn_more_about_emergency_calling);
                        boolean zR = mVar2.r(i0Var) | mVar2.r(context);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new f0(i0Var, context, i24);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(i0Var, context, i24);
                                mVar2.K(objQ);
                            }
                        }
                        v1.a(0, (e23.a) objQ, strQ, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-345496571);
                        mVar2.f();
                    }
                    if (i0Var.f171524f) {
                        mVar2.C(-345448118);
                        final int i27 = 3;
                        rVar.j(z3.f.c(1327761072, new e23.p() { // from class: uj1.h0
                            /* JADX WARN: Code duplicated, block: B:14:0x0057  */
                            /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
                            /* JADX WARN: Code duplicated, block: B:44:0x011a  */
                            /* JADX WARN: Code duplicated, block: B:59:0x0177  */
                            @Override // e23.p
                            public final Object invoke(Object obj4, Object obj5) {
                                int i28 = i27;
                                p3.m.a aVar = p3.m.f135153a;
                                Context context2 = context;
                                i0 i0Var2 = i0Var;
                                switch (i28) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        int i29 = i0.f171523j;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            h82.r rVar2 = rVar;
                                            rVar2.t(R.string.incident_detection_assistance, mVar3, 0);
                                            rVar2.o(R.string.msg_assistance_info, 0, 2, null, mVar3);
                                            String strQ2 = gl1.y.Q(mVar3, R.string.lbl_learn_more_about_assistance);
                                            boolean zR2 = mVar3.r(i0Var2) | mVar3.r(context2);
                                            Object objQ2 = mVar3.q();
                                            if (zR2) {
                                                objQ2 = new f0(i0Var2, context2, 1);
                                                mVar3.K(objQ2);
                                            } else {
                                                aVar.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    objQ2 = new f0(i0Var2, context2, 1);
                                                    mVar3.K(objQ2);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ2, strQ2, mVar3);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        p3.m mVar4 = (p3.m) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        int i210 = i0.f171523j;
                                        if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            h82.r rVar3 = rVar;
                                            rVar3.t(R.string.incident_detection_concept, mVar4, 0);
                                            rVar3.o(R.string.msg_incident_detection_description, 0, 2, null, mVar4);
                                            String strQ3 = gl1.y.Q(mVar4, R.string.lbl_learn_more_incident_detection);
                                            boolean zR3 = mVar4.r(i0Var2) | mVar4.r(context2);
                                            Object objQ3 = mVar4.q();
                                            if (zR3) {
                                                objQ3 = new f0(i0Var2, context2, 2);
                                                mVar4.K(objQ3);
                                            } else {
                                                aVar.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    objQ3 = new f0(i0Var2, context2, 2);
                                                    mVar4.K(objQ3);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ3, strQ3, mVar4);
                                        } else {
                                            mVar4.e();
                                        }
                                        break;
                                    case 2:
                                        p3.m mVar5 = (p3.m) obj4;
                                        int iIntValue5 = ((Integer) obj5).intValue();
                                        int i30 = i0.f171523j;
                                        if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            String strQ4 = gl1.y.Q(mVar5, R.string.lbl_fall_detection);
                                            h82.r rVar4 = rVar;
                                            rVar4.s(0, 2, strQ4, null, mVar5);
                                            rVar4.q(gl1.y.Q(mVar5, R.string.msg_fall_detection_description), mVar5, 0);
                                            String strQ5 = gl1.y.Q(mVar5, R.string.lbl_learn_more_about_fall_detection);
                                            boolean zR4 = mVar5.r(i0Var2) | mVar5.r(context2);
                                            Object objQ4 = mVar5.q();
                                            if (zR4) {
                                                objQ4 = new f0(i0Var2, context2, 3);
                                                mVar5.K(objQ4);
                                            } else {
                                                aVar.getClass();
                                                if (objQ4 == p3.m.a.f135155b) {
                                                    objQ4 = new f0(i0Var2, context2, 3);
                                                    mVar5.K(objQ4);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ4, strQ5, mVar5);
                                        } else {
                                            mVar5.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar6 = (p3.m) obj4;
                                        int iIntValue6 = ((Integer) obj5).intValue();
                                        int i34 = i0.f171523j;
                                        if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            h82.r rVar5 = rVar;
                                            rVar5.t(R.string.incident_detection_assistance_plus, mVar6, 0);
                                            rVar5.o(R.string.msg_assistance_plus_description, 0, 2, null, mVar6);
                                            String strQ6 = gl1.y.Q(mVar6, R.string.lbl_learn_more_about_assistance_plus);
                                            boolean zR5 = mVar6.r(i0Var2) | mVar6.r(context2);
                                            Object objQ5 = mVar6.q();
                                            if (zR5) {
                                                objQ5 = new f0(i0Var2, context2, 0);
                                                mVar6.K(objQ5);
                                            } else {
                                                aVar.getClass();
                                                if (objQ5 == p3.m.a.f135155b) {
                                                    objQ5 = new f0(i0Var2, context2, 0);
                                                    mVar6.K(objQ5);
                                                }
                                            }
                                            v1.a(0, (e23.a) objQ5, strQ6, mVar6);
                                        } else {
                                            mVar6.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        mVar2.f();
                    } else {
                        mVar2.C(-345053147);
                        mVar2.f();
                    }
                    rVar.j(z3.f.c(299558253, new u91.i(8, rVar, i0Var), mVar2), mVar2, i26);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
