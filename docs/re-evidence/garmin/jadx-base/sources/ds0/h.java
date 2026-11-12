package ds0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f61076b;

    public /* synthetic */ h(l lVar, int i14) {
        this.f61075a = i14;
        this.f61076b = lVar;
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
        int i14 = this.f61075a;
        final l lVar = this.f61076b;
        boolean z14 = false;
        char c14 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = l.f61085f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    lVar.i(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = l.f61085f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    lVar.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = l.f61085f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    lVar.h(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                final r rVar = (r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = l.f61085f;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i19 = (iIntValue4 << 3) & 112;
                    rVar.D(R.string.lbl_actions_to_reduce_jet_lag, mVar4, i19);
                    rVar.l(R.string.msg_jet_lag_factors_intro, (iIntValue4 << 6) & 896, 2, null, mVar4);
                    int i24 = i19 | 6;
                    rVar.j(z3.f.c(516500449, new a42.l(rVar, 26), mVar4), mVar4, i24);
                    rVar.j(z3.f.c(-1697820662, new a42.l(rVar, 27), mVar4), mVar4, i24);
                    rVar.j(z3.f.c(-2125090391, new a42.l(rVar, 20), mVar4), mVar4, i24);
                    rVar.j(z3.f.c(1742607176, new a42.l(rVar, 21), mVar4), mVar4, i24);
                    rVar.j(z3.f.c(1315337447, new a42.l(rVar, 22), mVar4), mVar4, i24);
                    rVar.j(z3.f.c(888067718, new a42.l(rVar, 23), mVar4), mVar4, i24);
                    final int i25 = z14 ? 1 : 0;
                    rVar.j(z3.f.c(460797989, new p() { // from class: ds0.i
                        /* JADX WARN: Code duplicated, block: B:14:0x003a  */
                        /* JADX WARN: Code duplicated, block: B:19:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i26 = i25;
                            p3.m.a aVar = p3.m.f135153a;
                            final l lVar2 = lVar;
                            final int i27 = 0;
                            final int i28 = 1;
                            switch (i26) {
                                case 0:
                                    p3.m mVar5 = (p3.m) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    int i29 = l.f61085f;
                                    if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        Context context = (Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b);
                                        r rVar2 = rVar;
                                        rVar2.t(R.string.lbl_melatonin, mVar5, 0);
                                        boolean zR = mVar5.r(lVar2) | mVar5.r(context);
                                        Object objQ = mVar5.q();
                                        if (zR) {
                                            objQ = new dl0.g(4, lVar2, context);
                                            mVar5.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == p3.m.a.f135155b) {
                                                objQ = new dl0.g(4, lVar2, context);
                                                mVar5.K(objQ);
                                            }
                                        }
                                        rVar2.v((e23.a) objQ, R.string.msg_melatonin_paragraph, mVar5, 0);
                                    } else {
                                        mVar5.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar6 = (p3.m) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    int i30 = l.f61085f;
                                    if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = p3.n.f135158a;
                                        boolean zR2 = mVar6.r(lVar2);
                                        Object objQ2 = mVar6.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: ds0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i34 = i27;
                                                    l lVar3 = lVar2;
                                                    switch (i34) {
                                                        case 0:
                                                            int i35 = l.f61085f;
                                                            lVar3.e("ABOUT_JET_LAG");
                                                            break;
                                                        default:
                                                            int i36 = l.f61085f;
                                                            lVar3.e("JET_LAG_FACTOR");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar6.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: ds0.j
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i34 = i27;
                                                        l lVar3 = lVar2;
                                                        switch (i34) {
                                                            case 0:
                                                                int i35 = l.f61085f;
                                                                lVar3.e("ABOUT_JET_LAG");
                                                                break;
                                                            default:
                                                                int i36 = l.f61085f;
                                                                lVar3.e("JET_LAG_FACTOR");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar6.K(objQ2);
                                            }
                                        }
                                        r rVar3 = rVar;
                                        rVar3.B(R.string.lbl_about_jet_lag, null, false, (e23.a) objQ2, mVar6, 0, 6);
                                        boolean zR3 = mVar6.r(lVar2);
                                        Object objQ3 = mVar6.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: ds0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i34 = i28;
                                                    l lVar3 = lVar2;
                                                    switch (i34) {
                                                        case 0:
                                                            int i35 = l.f61085f;
                                                            lVar3.e("ABOUT_JET_LAG");
                                                            break;
                                                        default:
                                                            int i36 = l.f61085f;
                                                            lVar3.e("JET_LAG_FACTOR");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar6.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: ds0.j
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i34 = i28;
                                                        l lVar3 = lVar2;
                                                        switch (i34) {
                                                            case 0:
                                                                int i35 = l.f61085f;
                                                                lVar3.e("ABOUT_JET_LAG");
                                                                break;
                                                            default:
                                                                int i36 = l.f61085f;
                                                                lVar3.e("JET_LAG_FACTOR");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar6.K(objQ3);
                                            }
                                        }
                                        rVar3.B(R.string.lbl_jet_lag_factors, null, false, (e23.a) objQ3, mVar6, 0, 6);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar4), mVar4, i24);
                    rVar.j(z3.f.c(33528260, new a42.l(rVar, 24), mVar4), mVar4, i24);
                } else {
                    mVar4.e();
                }
                break;
            default:
                final r rVar2 = (r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i26 = l.f61085f;
                rVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i27 = ((iIntValue5 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(113991619, new a42.l(rVar2, 25), mVar5), mVar5, i27);
                    final char c15 = c14 == true ? 1 : 0;
                    rVar2.a(z3.f.c(-269602452, new p() { // from class: ds0.i
                        /* JADX WARN: Code duplicated, block: B:14:0x003a  */
                        /* JADX WARN: Code duplicated, block: B:19:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i28 = c15;
                            p3.m.a aVar = p3.m.f135153a;
                            final l lVar2 = lVar;
                            final int i29 = 0;
                            final int i210 = 1;
                            switch (i28) {
                                case 0:
                                    p3.m mVar6 = (p3.m) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    int i211 = l.f61085f;
                                    if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = p3.n.f135158a;
                                        Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                                        r rVar3 = rVar2;
                                        rVar3.t(R.string.lbl_melatonin, mVar6, 0);
                                        boolean zR = mVar6.r(lVar2) | mVar6.r(context);
                                        Object objQ = mVar6.q();
                                        if (zR) {
                                            objQ = new dl0.g(4, lVar2, context);
                                            mVar6.K(objQ);
                                        } else {
                                            aVar.getClass();
                                            if (objQ == p3.m.a.f135155b) {
                                                objQ = new dl0.g(4, lVar2, context);
                                                mVar6.K(objQ);
                                            }
                                        }
                                        rVar3.v((e23.a) objQ, R.string.msg_melatonin_paragraph, mVar6, 0);
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar7 = (p3.m) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    int i30 = l.f61085f;
                                    if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        x1 x1Var7 = p3.n.f135158a;
                                        boolean zR2 = mVar7.r(lVar2);
                                        Object objQ2 = mVar7.q();
                                        if (zR2) {
                                            objQ2 = new e23.a() { // from class: ds0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i34 = i29;
                                                    l lVar3 = lVar2;
                                                    switch (i34) {
                                                        case 0:
                                                            int i35 = l.f61085f;
                                                            lVar3.e("ABOUT_JET_LAG");
                                                            break;
                                                        default:
                                                            int i36 = l.f61085f;
                                                            lVar3.e("JET_LAG_FACTOR");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ2);
                                        } else {
                                            aVar.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new e23.a() { // from class: ds0.j
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i34 = i29;
                                                        l lVar3 = lVar2;
                                                        switch (i34) {
                                                            case 0:
                                                                int i35 = l.f61085f;
                                                                lVar3.e("ABOUT_JET_LAG");
                                                                break;
                                                            default:
                                                                int i36 = l.f61085f;
                                                                lVar3.e("JET_LAG_FACTOR");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ2);
                                            }
                                        }
                                        r rVar4 = rVar2;
                                        rVar4.B(R.string.lbl_about_jet_lag, null, false, (e23.a) objQ2, mVar7, 0, 6);
                                        boolean zR3 = mVar7.r(lVar2);
                                        Object objQ3 = mVar7.q();
                                        if (zR3) {
                                            objQ3 = new e23.a() { // from class: ds0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    int i34 = i210;
                                                    l lVar3 = lVar2;
                                                    switch (i34) {
                                                        case 0:
                                                            int i35 = l.f61085f;
                                                            lVar3.e("ABOUT_JET_LAG");
                                                            break;
                                                        default:
                                                            int i36 = l.f61085f;
                                                            lVar3.e("JET_LAG_FACTOR");
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar7.K(objQ3);
                                        } else {
                                            aVar.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new e23.a() { // from class: ds0.j
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        int i34 = i210;
                                                        l lVar3 = lVar2;
                                                        switch (i34) {
                                                            case 0:
                                                                int i35 = l.f61085f;
                                                                lVar3.e("ABOUT_JET_LAG");
                                                                break;
                                                            default:
                                                                int i36 = l.f61085f;
                                                                lVar3.e("JET_LAG_FACTOR");
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar7.K(objQ3);
                                            }
                                        }
                                        rVar4.B(R.string.lbl_jet_lag_factors, null, false, (e23.a) objQ3, mVar7, 0, 6);
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar5), mVar5, i27);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
