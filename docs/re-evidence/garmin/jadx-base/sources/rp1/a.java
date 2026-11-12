package rp1;

import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import e23.l;
import e23.p;
import g02.d;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.v;
import p3.x1;
import r53.p2;
import s9.c;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154079a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yp1.a f154080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SolarIntensityActivity f154081c;

    public /* synthetic */ a(SolarIntensityActivity solarIntensityActivity, yp1.a aVar) {
        this.f154081c = solarIntensityActivity;
        this.f154080b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154079a;
        SolarIntensityActivity solarIntensityActivity = this.f154081c;
        final yp1.a aVar = this.f154080b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SolarIntensityActivity.a aVar2 = SolarIntensityActivity.f44787a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    v.a(d.f74342a.c(solarIntensityActivity.getOnBackPressedDispatcher()), f.c(-1745672233, new a(aVar, solarIntensityActivity), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SolarIntensityActivity.a aVar3 = SolarIntensityActivity.f44787a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarC = c.c(aVar.f198693e, mVar2);
                    u82.a<o82.a, xp1.b> aVar4 = aVar.f198695g;
                    boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
                    boolean zR = mVar2.r(aVar);
                    Object objQ = mVar2.q();
                    m.a aVar5 = m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new l() { // from class: rp1.b
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                Object value;
                                Object value2;
                                int i16 = objArr2;
                                yp1.a aVar6 = aVar;
                                switch (i16) {
                                    case 0:
                                        Boolean bool = (Boolean) obj3;
                                        bool.getClass();
                                        SolarIntensityActivity.a aVar7 = SolarIntensityActivity.f44787a;
                                        p2 p2Var = aVar6.f198691c;
                                        do {
                                            value = p2Var.getValue();
                                            ((Boolean) value).getClass();
                                        } while (!p2Var.b(value, bool));
                                        break;
                                    default:
                                        xp1.b bVar = (xp1.b) obj3;
                                        SolarIntensityActivity.a aVar8 = SolarIntensityActivity.f44787a;
                                        p2 p2Var2 = aVar6.f198692d;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, bVar));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new l() { // from class: rp1.b
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    Object value;
                                    Object value2;
                                    int i16 = objArr3;
                                    yp1.a aVar6 = aVar;
                                    switch (i16) {
                                        case 0:
                                            Boolean bool = (Boolean) obj3;
                                            bool.getClass();
                                            SolarIntensityActivity.a aVar7 = SolarIntensityActivity.f44787a;
                                            p2 p2Var = aVar6.f198691c;
                                            do {
                                                value = p2Var.getValue();
                                                ((Boolean) value).getClass();
                                            } while (!p2Var.b(value, bool));
                                            break;
                                        default:
                                            xp1.b bVar = (xp1.b) obj3;
                                            SolarIntensityActivity.a aVar8 = SolarIntensityActivity.f44787a;
                                            p2 p2Var2 = aVar6.f198692d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, bVar));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    l lVar = (l) objQ;
                    boolean zR2 = mVar2.r(aVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new l() { // from class: rp1.b
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                Object value;
                                Object value2;
                                int i16 = i15;
                                yp1.a aVar6 = aVar;
                                switch (i16) {
                                    case 0:
                                        Boolean bool = (Boolean) obj3;
                                        bool.getClass();
                                        SolarIntensityActivity.a aVar7 = SolarIntensityActivity.f44787a;
                                        p2 p2Var = aVar6.f198691c;
                                        do {
                                            value = p2Var.getValue();
                                            ((Boolean) value).getClass();
                                        } while (!p2Var.b(value, bool));
                                        break;
                                    default:
                                        xp1.b bVar = (xp1.b) obj3;
                                        SolarIntensityActivity.a aVar8 = SolarIntensityActivity.f44787a;
                                        p2 p2Var2 = aVar6.f198692d;
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, bVar));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new l() { // from class: rp1.b
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    Object value;
                                    Object value2;
                                    int i16 = i15;
                                    yp1.a aVar6 = aVar;
                                    switch (i16) {
                                        case 0:
                                            Boolean bool = (Boolean) obj3;
                                            bool.getClass();
                                            SolarIntensityActivity.a aVar7 = SolarIntensityActivity.f44787a;
                                            p2 p2Var = aVar6.f198691c;
                                            do {
                                                value = p2Var.getValue();
                                                ((Boolean) value).getClass();
                                            } while (!p2Var.b(value, bool));
                                            break;
                                        default:
                                            xp1.b bVar = (xp1.b) obj3;
                                            SolarIntensityActivity.a aVar8 = SolarIntensityActivity.f44787a;
                                            p2 p2Var2 = aVar6.f198692d;
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, bVar));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    l lVar2 = (l) objQ2;
                    boolean zR3 = mVar2.r(aVar) | mVar2.r(solarIntensityActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new rk0.f(7, aVar, solarIntensityActivity);
                        mVar2.K(objQ3);
                    } else {
                        aVar5.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new rk0.f(7, aVar, solarIntensityActivity);
                            mVar2.K(objQ3);
                        }
                    }
                    up1.b.a(aVar4, zBooleanValue, lVar, lVar2, (e23.a) objQ3, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(yp1.a aVar, SolarIntensityActivity solarIntensityActivity) {
        this.f154080b = aVar;
        this.f154081c = solarIntensityActivity;
    }
}
