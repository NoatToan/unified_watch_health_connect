package iz1;

import androidx.lifecycle.v1;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a f95864c;

    public /* synthetic */ b(String str, com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar, int i14) {
        this.f95862a = i14;
        this.f95863b = str;
        this.f95864c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95862a;
        final com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar = this.f95864c;
        String str = this.f95863b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1029500527, new b(str, aVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (str == null) {
                        str = "";
                    }
                    boolean zR = mVar2.r(aVar);
                    Object objQ = mVar2.q();
                    m.a aVar2 = m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: iz1.c
                            @Override // e23.a
                            public final Object invoke() {
                                fg0.k kVar;
                                fg0.k kVar2;
                                int i16 = objArr2;
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar3 = aVar;
                                switch (i16) {
                                    case 0:
                                        aVar3.f46183b = true;
                                        i iVarU6 = aVar3.u6();
                                        jz1.a aVar4 = iVarU6.I0;
                                        if (aVar4 != null && (kVar = iVarU6.I) != null) {
                                            ge1.b.T(v1.a(iVarU6), null, null, new j(iVarU6, kVar, aVar4, null), 3);
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                                        i iVarU7 = aVar3.u6();
                                        jz1.a aVar5 = iVarU7.I0;
                                        if (aVar5 != null && (kVar2 = iVarU7.I) != null) {
                                            ge1.b.T(v1.a(iVarU7), null, null, new j(iVarU7, kVar2, aVar5, null), 3);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: iz1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    fg0.k kVar;
                                    fg0.k kVar2;
                                    int i16 = objArr3;
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar3 = aVar;
                                    switch (i16) {
                                        case 0:
                                            aVar3.f46183b = true;
                                            i iVarU6 = aVar3.u6();
                                            jz1.a aVar4 = iVarU6.I0;
                                            if (aVar4 != null && (kVar = iVarU6.I) != null) {
                                                ge1.b.T(v1.a(iVarU6), null, null, new j(iVarU6, kVar, aVar4, null), 3);
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                                            i iVarU7 = aVar3.u6();
                                            jz1.a aVar5 = iVarU7.I0;
                                            if (aVar5 != null && (kVar2 = iVarU7.I) != null) {
                                                ge1.b.T(v1.a(iVarU7), null, null, new j(iVarU7, kVar2, aVar5, null), 3);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(aVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: iz1.c
                            @Override // e23.a
                            public final Object invoke() {
                                fg0.k kVar;
                                fg0.k kVar2;
                                int i16 = i15;
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar4 = aVar;
                                switch (i16) {
                                    case 0:
                                        aVar4.f46183b = true;
                                        i iVarU6 = aVar4.u6();
                                        jz1.a aVar5 = iVarU6.I0;
                                        if (aVar5 != null && (kVar = iVarU6.I) != null) {
                                            ge1.b.T(v1.a(iVarU6), null, null, new j(iVarU6, kVar, aVar5, null), 3);
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                                        i iVarU7 = aVar4.u6();
                                        jz1.a aVar6 = iVarU7.I0;
                                        if (aVar6 != null && (kVar2 = iVarU7.I) != null) {
                                            ge1.b.T(v1.a(iVarU7), null, null, new j(iVarU7, kVar2, aVar6, null), 3);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: iz1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    fg0.k kVar;
                                    fg0.k kVar2;
                                    int i16 = i15;
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a aVar4 = aVar;
                                    switch (i16) {
                                        case 0:
                                            aVar4.f46183b = true;
                                            i iVarU6 = aVar4.u6();
                                            jz1.a aVar5 = iVarU6.I0;
                                            if (aVar5 != null && (kVar = iVarU6.I) != null) {
                                                ge1.b.T(v1.a(iVarU6), null, null, new j(iVarU6, kVar, aVar5, null), 3);
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.C0894a c0894a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e;
                                            i iVarU7 = aVar4.u6();
                                            jz1.a aVar6 = iVarU7.I0;
                                            if (aVar6 != null && (kVar2 = iVarU7.I) != null) {
                                                ge1.b.T(v1.a(iVarU7), null, null, new j(iVarU7, kVar2, aVar6, null), 3);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    yy1.a.a(str, aVar3, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
