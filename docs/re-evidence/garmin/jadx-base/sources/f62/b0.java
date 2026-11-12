package f62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.List;
import p005kotlin.Unit;
import p3.x1;
import w52.g1;
import w52.q1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69213a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f69214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.n f69215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f69216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.p f69217e;

    public /* synthetic */ b0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.n nVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar) {
        this.f69214b = qVar;
        this.f69216d = j0Var;
        this.f69215c = nVar;
        this.f69217e = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0224  */
    /* JADX WARN: Code duplicated, block: B:111:0x023e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0245  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x019a  */
    /* JADX WARN: Code duplicated, block: B:88:0x019d  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z14;
        m52.k kVar;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        boolean zR3;
        Object objQ3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i14 = this.f69213a;
        p3.m.a aVar = p3.m.f135153a;
        final com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar = this.f69217e;
        final com.garmin.android.apps.connectmobile.workouts.presentation.edit.n nVar = this.f69215c;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = this.f69214b;
        final int i15 = 1;
        switch (i14) {
            case 0:
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = nVar.f49207a;
                w52.x0 x0Var = (w52.x0) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? mVar.B(x0Var) : mVar.r(x0Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    m52.k kVar2 = qVar.f49245a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a aVar3 = qVar.f49267w;
                    if (aVar3 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b) {
                        l52.e.b bVarN3 = qVar.f49250f.n3(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b) aVar3).f49271a);
                        if (bVarN3 != null) {
                            boolean z19 = aVar2 == bVarN3 || aVar2.getParent() == bVarN3;
                            z15 = true;
                            if (z19) {
                                z16 = true;
                            }
                            if (z16) {
                                z14 = z15;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z15 = true;
                        }
                        z16 = false;
                        if (z16) {
                            z14 = z15;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    boolean z24 = aVar3 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.C0967a;
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = qVar.f49252h;
                    PowerZonesDTO powerZonesDTO = qVar.f49253i;
                    int i16 = powerZonesDTO != null ? powerZonesDTO.f43987b : 0;
                    double d14 = qVar.f49254j;
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar = qVar.f49256l;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar = qVar.f49260p;
                    boolean zIsFirst = aVar2.isFirst();
                    boolean z25 = qVar.f49264t;
                    o13.p<Boolean, Double> pVar2 = qVar.f49255k;
                    boolean zR4 = mVar.r(pVar) | mVar.r(nVar);
                    Object objQ4 = mVar.q();
                    if (zR4) {
                        kVar = kVar2;
                    } else {
                        aVar.getClass();
                        kVar = kVar2;
                        if (objQ4 == p3.m.a.f135155b) {
                        }
                        e23.a aVar4 = (e23.a) objQ4;
                        zR = mVar.r(pVar) | mVar.r(nVar);
                        objQ = mVar.q();
                        if (zR) {
                            final int i17 = 3;
                            objQ = new e23.a() { // from class: f62.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            pVar.v(nVar.f49207a);
                                            break;
                                        case 1:
                                            pVar.X0(nVar.f49207a);
                                            break;
                                        case 2:
                                            pVar.L0(nVar.f49207a);
                                            break;
                                        default:
                                            pVar.z3(nVar.f49207a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final int i18 = 3;
                                objQ = new e23.a() { // from class: f62.c0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                pVar.v(nVar.f49207a);
                                                break;
                                            case 1:
                                                pVar.X0(nVar.f49207a);
                                                break;
                                            case 2:
                                                pVar.L0(nVar.f49207a);
                                                break;
                                            default:
                                                pVar.z3(nVar.f49207a);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        zR2 = mVar.r(pVar) | mVar.r(nVar) | mVar.r(qVar);
                        objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new cw1.g0(pVar, 24, nVar, qVar);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cw1.g0(pVar, 24, nVar, qVar);
                                mVar.K(objQ2);
                            }
                        }
                        e23.a aVar6 = (e23.a) objQ2;
                        String str = qVar.f49266v;
                        zR3 = mVar.r(pVar);
                        objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.n.a(pVar);
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.n.a(pVar);
                                mVar.K(objQ3);
                            }
                        }
                        q1.n(x0Var, kVar, this.f69216d, z14, z24, list, i16, d14, cVar, dVar, zIsFirst, z25, pVar2, aVar4, aVar5, aVar6, str, (e23.q) ((k23.g) objQ3), mVar, (iIntValue & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 6) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 24));
                    }
                    final int i19 = 2;
                    objQ4 = new e23.a() { // from class: f62.c0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    pVar.v(nVar.f49207a);
                                    break;
                                case 1:
                                    pVar.X0(nVar.f49207a);
                                    break;
                                case 2:
                                    pVar.L0(nVar.f49207a);
                                    break;
                                default:
                                    pVar.z3(nVar.f49207a);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                    e23.a aVar7 = (e23.a) objQ4;
                    zR = mVar.r(pVar) | mVar.r(nVar);
                    objQ = mVar.q();
                    if (zR) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i110 = 3;
                            objQ = new e23.a() { // from class: f62.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i110) {
                                        case 0:
                                            pVar.v(nVar.f49207a);
                                            break;
                                        case 1:
                                            pVar.X0(nVar.f49207a);
                                            break;
                                        case 2:
                                            pVar.L0(nVar.f49207a);
                                            break;
                                        default:
                                            pVar.z3(nVar.f49207a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    } else {
                        final int i111 = 3;
                        objQ = new e23.a() { // from class: f62.c0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i111) {
                                    case 0:
                                        pVar.v(nVar.f49207a);
                                        break;
                                    case 1:
                                        pVar.X0(nVar.f49207a);
                                        break;
                                    case 2:
                                        pVar.L0(nVar.f49207a);
                                        break;
                                    default:
                                        pVar.z3(nVar.f49207a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    }
                    e23.a aVar8 = (e23.a) objQ;
                    zR2 = mVar.r(pVar) | mVar.r(nVar) | mVar.r(qVar);
                    objQ2 = mVar.q();
                    if (zR2) {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cw1.g0(pVar, 24, nVar, qVar);
                            mVar.K(objQ2);
                        }
                    } else {
                        objQ2 = new cw1.g0(pVar, 24, nVar, qVar);
                        mVar.K(objQ2);
                    }
                    e23.a aVar9 = (e23.a) objQ2;
                    String str2 = qVar.f49266v;
                    zR3 = mVar.r(pVar);
                    objQ3 = mVar.q();
                    if (zR3) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.n.a(pVar);
                            mVar.K(objQ3);
                        }
                    } else {
                        objQ3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.n.a(pVar);
                        mVar.K(objQ3);
                    }
                    q1.n(x0Var, kVar, this.f69216d, z14, z24, list, i16, d14, cVar, dVar, zIsFirst, z25, pVar2, aVar7, aVar8, aVar9, str2, (e23.q) ((k23.g) objQ3), mVar, (iIntValue & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 6) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 24));
                } else {
                    mVar.e();
                }
                break;
            default:
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar10 = nVar.f49207a;
                g1 g1Var = (g1) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                g1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? mVar2.B(g1Var) : mVar2.r(g1Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m52.k kVar3 = qVar.f49245a;
                    l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a aVar11 = qVar.f49267w;
                    if (aVar11 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b) {
                        l52.e.b bVarN4 = iVar.n3(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b) aVar11).f49271a);
                        if (bVarN4 == null) {
                            z18 = false;
                        } else {
                            if (aVar10 == bVarN4 || aVar10.getParent() == bVarN4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        if (z18) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    } else {
                        z17 = false;
                    }
                    boolean zF = c22.b.f((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list2 = qVar.f49252h;
                    PowerZonesDTO powerZonesDTO2 = qVar.f49253i;
                    int i24 = powerZonesDTO2 != null ? powerZonesDTO2.f43987b : 0;
                    double d15 = qVar.f49254j;
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = qVar.f49256l;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar2 = qVar.f49260p;
                    boolean zIsFirst2 = aVar10.isFirst();
                    boolean z26 = qVar.f49264t;
                    o13.p<Boolean, Double> pVar3 = qVar.f49255k;
                    boolean z27 = !aVar10.equals(iVar.J());
                    boolean z28 = !aVar10.equals(iVar.K1());
                    boolean zR5 = mVar2.r(pVar) | mVar2.r(nVar);
                    Object objQ5 = mVar2.q();
                    if (zR5) {
                        final int i25 = 0;
                        objQ5 = new e23.a() { // from class: f62.c0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        pVar.v(nVar.f49207a);
                                        break;
                                    case 1:
                                        pVar.X0(nVar.f49207a);
                                        break;
                                    case 2:
                                        pVar.L0(nVar.f49207a);
                                        break;
                                    default:
                                        pVar.z3(nVar.f49207a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            final int i26 = 0;
                            objQ5 = new e23.a() { // from class: f62.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            pVar.v(nVar.f49207a);
                                            break;
                                        case 1:
                                            pVar.X0(nVar.f49207a);
                                            break;
                                        case 2:
                                            pVar.L0(nVar.f49207a);
                                            break;
                                        default:
                                            pVar.z3(nVar.f49207a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ5);
                        }
                    }
                    e23.a aVar12 = (e23.a) objQ5;
                    boolean zR6 = mVar2.r(pVar) | mVar2.r(nVar);
                    Object objQ6 = mVar2.q();
                    if (zR6) {
                        objQ6 = new e23.a() { // from class: f62.c0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        pVar.v(nVar.f49207a);
                                        break;
                                    case 1:
                                        pVar.X0(nVar.f49207a);
                                        break;
                                    case 2:
                                        pVar.L0(nVar.f49207a);
                                        break;
                                    default:
                                        pVar.z3(nVar.f49207a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new e23.a() { // from class: f62.c0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            pVar.v(nVar.f49207a);
                                            break;
                                        case 1:
                                            pVar.X0(nVar.f49207a);
                                            break;
                                        case 2:
                                            pVar.L0(nVar.f49207a);
                                            break;
                                        default:
                                            pVar.z3(nVar.f49207a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ6);
                        }
                    }
                    q1.o(g1Var, kVar3, this.f69216d, z17, zF, list2, i24, d15, cVar2, zIsFirst2, dVar2, z26, pVar3, z27, z28, aVar12, (e23.a) objQ6, mVar2, (iIntValue2 & 14) | (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 6) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 24));
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.n nVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar) {
        this.f69214b = qVar;
        this.f69215c = nVar;
        this.f69216d = j0Var;
        this.f69217e = pVar;
    }
}
