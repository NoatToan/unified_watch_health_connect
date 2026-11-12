package f62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Unit;
import p3.x1;
import w52.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69363a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f69364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f69365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.m f69366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f69367e;

    public /* synthetic */ y(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.m mVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar) {
        this.f69364b = qVar;
        this.f69365c = j0Var;
        this.f69366d = mVar;
        this.f69367e = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f69363a;
        p3.m.a aVar = p3.m.f135153a;
        final com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar = this.f69367e;
        final com.garmin.android.apps.connectmobile.workouts.presentation.edit.m mVar = this.f69366d;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = this.f69364b;
        Object[] objArr = 0;
        final int i15 = 2;
        char c14 = 1;
        switch (i14) {
            case 0:
                w52.x0 x0Var = (w52.x0) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? mVar2.B(x0Var) : mVar2.r(x0Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    m52.k kVar = qVar.f49245a;
                    boolean z14 = qVar.f49267w instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.C0967a;
                    boolean zR = mVar2.r(qVar) | mVar2.r(pVar) | mVar2.r(mVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new z(qVar, pVar, mVar);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new z(qVar, pVar, mVar);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(pVar) | mVar2.r(mVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ2 = new e23.a() { // from class: f62.a0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        pVar.z3(mVar.f49082a);
                                        break;
                                    case 1:
                                        pVar.v(mVar.f49082a);
                                        break;
                                    default:
                                        pVar.X0(mVar.f49082a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ2 = new e23.a() { // from class: f62.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr3) {
                                        case 0:
                                            pVar.z3(mVar.f49082a);
                                            break;
                                        case 1:
                                            pVar.v(mVar.f49082a);
                                            break;
                                        default:
                                            pVar.X0(mVar.f49082a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ2;
                    boolean zR3 = mVar2.r(pVar) | mVar2.r(mVar) | mVar2.r(qVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new z(pVar, mVar, qVar);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new z(pVar, mVar, qVar);
                            mVar2.K(objQ3);
                        }
                    }
                    w52.r.c(x0Var, kVar, this.f69365c, z14, aVar2, aVar3, (e23.a) objQ3, mVar2, (iIntValue & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 6));
                } else {
                    mVar2.e();
                }
                break;
            default:
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar4 = mVar.f49082a;
                g1 g1Var = (g1) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                g1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? mVar3.B(g1Var) : mVar3.r(g1Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m52.k kVar2 = qVar.f49245a;
                    l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
                    boolean zF = c22.b.f((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                    boolean z15 = !aVar4.equals(iVar.J());
                    boolean z16 = !aVar4.equals(iVar.K1());
                    boolean zR4 = mVar3.r(pVar) | mVar3.r(mVar);
                    Object objQ4 = mVar3.q();
                    if (zR4) {
                        final char c15 = c14 == true ? 1 : 0;
                        objQ4 = new e23.a() { // from class: f62.a0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (c15) {
                                    case 0:
                                        pVar.z3(mVar.f49082a);
                                        break;
                                    case 1:
                                        pVar.v(mVar.f49082a);
                                        break;
                                    default:
                                        pVar.X0(mVar.f49082a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int c16 = c14 == true ? 1 : 0;
                            objQ4 = new e23.a() { // from class: f62.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (c16) {
                                        case 0:
                                            pVar.z3(mVar.f49082a);
                                            break;
                                        case 1:
                                            pVar.v(mVar.f49082a);
                                            break;
                                        default:
                                            pVar.X0(mVar.f49082a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ4);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ4;
                    boolean zR5 = mVar3.r(pVar) | mVar3.r(mVar);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        objQ5 = new e23.a() { // from class: f62.a0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        pVar.z3(mVar.f49082a);
                                        break;
                                    case 1:
                                        pVar.v(mVar.f49082a);
                                        break;
                                    default:
                                        pVar.X0(mVar.f49082a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new e23.a() { // from class: f62.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            pVar.z3(mVar.f49082a);
                                            break;
                                        case 1:
                                            pVar.v(mVar.f49082a);
                                            break;
                                        default:
                                            pVar.X0(mVar.f49082a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ5);
                        }
                    }
                    w52.r.d(g1Var, kVar2, this.f69365c, zF, z15, z16, aVar5, (e23.a) objQ5, mVar3, (iIntValue2 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 6));
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.m mVar) {
        this.f69364b = qVar;
        this.f69365c = j0Var;
        this.f69367e = pVar;
        this.f69366d = mVar;
    }
}
