package z10;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201237a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f201238b;

    public /* synthetic */ s0(u0 u0Var) {
        this.f201238b = u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201237a;
        final u0 u0Var = this.f201238b;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                u0.a aVar = u0.f201262b;
                final int i16 = 2;
                final int i17 = 0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.c1 c1Var = l72.c1.f110940a;
                    String strQ = gl1.y.Q(mVar, R.string.title_profile_and_privacy_visibility);
                    String strQ2 = gl1.y.Q(mVar, R.string.label_accept_follow_information);
                    String strQ3 = gl1.y.Q(mVar, R.string.lbl_ok);
                    String strQ4 = gl1.y.Q(mVar, R.string.lbl_ok_and_do_not_show_again);
                    String strQ5 = gl1.y.Q(mVar, R.string.lbl_cancel);
                    boolean zR = mVar.r(u0Var);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new e23.a() { // from class: z10.t0
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                u0 u0Var2 = u0Var;
                                switch (i18) {
                                    case 0:
                                        u0.a aVar3 = u0.f201262b;
                                        u0Var2.dismiss();
                                        d1.a aVar4 = u0Var2.f201263a;
                                        if (aVar4 != null) {
                                            aVar4.a();
                                            return Unit.INSTANCE;
                                        }
                                        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                        throw null;
                                    case 1:
                                        u0.a aVar5 = u0.f201262b;
                                        u0Var2.dismiss();
                                        d1.a aVar6 = u0Var2.f201263a;
                                        if (aVar6 == null) {
                                            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                            throw null;
                                        }
                                        aVar6.a();
                                        ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).G();
                                        return Unit.INSTANCE;
                                    default:
                                        u0.a aVar7 = u0.f201262b;
                                        u0Var2.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e23.a() { // from class: z10.t0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i17;
                                    u0 u0Var2 = u0Var;
                                    switch (i18) {
                                        case 0:
                                            u0.a aVar3 = u0.f201262b;
                                            u0Var2.dismiss();
                                            d1.a aVar4 = u0Var2.f201263a;
                                            if (aVar4 != null) {
                                                aVar4.a();
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                            throw null;
                                        case 1:
                                            u0.a aVar5 = u0.f201262b;
                                            u0Var2.dismiss();
                                            d1.a aVar6 = u0Var2.f201263a;
                                            if (aVar6 == null) {
                                                p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                                throw null;
                                            }
                                            aVar6.a();
                                            ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).G();
                                            return Unit.INSTANCE;
                                        default:
                                            u0.a aVar7 = u0.f201262b;
                                            u0Var2.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    boolean zR2 = mVar.r(u0Var);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: z10.t0
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i15;
                                u0 u0Var2 = u0Var;
                                switch (i18) {
                                    case 0:
                                        u0.a aVar4 = u0.f201262b;
                                        u0Var2.dismiss();
                                        d1.a aVar5 = u0Var2.f201263a;
                                        if (aVar5 != null) {
                                            aVar5.a();
                                            return Unit.INSTANCE;
                                        }
                                        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                        throw null;
                                    case 1:
                                        u0.a aVar6 = u0.f201262b;
                                        u0Var2.dismiss();
                                        d1.a aVar7 = u0Var2.f201263a;
                                        if (aVar7 == null) {
                                            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                            throw null;
                                        }
                                        aVar7.a();
                                        ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).G();
                                        return Unit.INSTANCE;
                                    default:
                                        u0.a aVar8 = u0.f201262b;
                                        u0Var2.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: z10.t0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i15;
                                    u0 u0Var2 = u0Var;
                                    switch (i18) {
                                        case 0:
                                            u0.a aVar4 = u0.f201262b;
                                            u0Var2.dismiss();
                                            d1.a aVar5 = u0Var2.f201263a;
                                            if (aVar5 != null) {
                                                aVar5.a();
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                            throw null;
                                        case 1:
                                            u0.a aVar6 = u0.f201262b;
                                            u0Var2.dismiss();
                                            d1.a aVar7 = u0Var2.f201263a;
                                            if (aVar7 == null) {
                                                p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                                throw null;
                                            }
                                            aVar7.a();
                                            ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).G();
                                            return Unit.INSTANCE;
                                        default:
                                            u0.a aVar8 = u0.f201262b;
                                            u0Var2.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ2;
                    boolean zR3 = mVar.r(u0Var);
                    Object objQ3 = mVar.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: z10.t0
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i16;
                                u0 u0Var2 = u0Var;
                                switch (i18) {
                                    case 0:
                                        u0.a aVar5 = u0.f201262b;
                                        u0Var2.dismiss();
                                        d1.a aVar6 = u0Var2.f201263a;
                                        if (aVar6 != null) {
                                            aVar6.a();
                                            return Unit.INSTANCE;
                                        }
                                        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                        throw null;
                                    case 1:
                                        u0.a aVar7 = u0.f201262b;
                                        u0Var2.dismiss();
                                        d1.a aVar8 = u0Var2.f201263a;
                                        if (aVar8 == null) {
                                            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                            throw null;
                                        }
                                        aVar8.a();
                                        ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).G();
                                        return Unit.INSTANCE;
                                    default:
                                        u0.a aVar9 = u0.f201262b;
                                        u0Var2.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: z10.t0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i16;
                                    u0 u0Var2 = u0Var;
                                    switch (i18) {
                                        case 0:
                                            u0.a aVar5 = u0.f201262b;
                                            u0Var2.dismiss();
                                            d1.a aVar6 = u0Var2.f201263a;
                                            if (aVar6 != null) {
                                                aVar6.a();
                                                return Unit.INSTANCE;
                                            }
                                            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                            throw null;
                                        case 1:
                                            u0.a aVar7 = u0.f201262b;
                                            u0Var2.dismiss();
                                            d1.a aVar8 = u0Var2.f201263a;
                                            if (aVar8 == null) {
                                                p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                                throw null;
                                            }
                                            aVar8.a();
                                            ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).G();
                                            return Unit.INSTANCE;
                                        default:
                                            u0.a aVar9 = u0.f201262b;
                                            u0Var2.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar.K(objQ3);
                        }
                    }
                    c1Var.b(false, strQ, strQ2, strQ3, strQ4, strQ5, false, aVar3, aVar4, (e23.a) objQ3, null, mVar, 6, 0, 18200);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                u0.a aVar5 = u0.f201262b;
                u0Var.u6((p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s0(u0 u0Var, int i14) {
        this.f201238b = u0Var;
    }
}
