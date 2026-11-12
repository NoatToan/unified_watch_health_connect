package ux;

import c2.l;
import c2.x2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.p;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomLineChart f173037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tz.a f173038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f173039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f173040e;

    public /* synthetic */ e(CustomLineChart customLineChart, tz.a aVar, List list, String str, int i14) {
        this.f173036a = i14;
        this.f173037b = customLineChart;
        this.f173038c = aVar;
        this.f173039d = list;
        this.f173040e = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f173036a;
        m.a aVar = m.f135153a;
        final String str = this.f173040e;
        final List list = this.f173039d;
        final tz.a aVar2 = this.f173038c;
        CustomLineChart customLineChart = this.f173037b;
        boolean z14 = false;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarA = l.A(x2.h(x2.f(r.S, 1.0f), 290), 16, 0.0f, 2);
                    boolean zR = mVar.r(customLineChart);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new b40.a(customLineChart, 15);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new b40.a(customLineChart, 15);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR2 = mVar.r(aVar2) | mVar.r(list) | mVar.B(str);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        final int i17 = z14 ? 1 : 0;
                        objQ2 = new e23.l() { // from class: ux.d
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                switch (i17) {
                                    case 0:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                    case 1:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                    default:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            final int i18 = z14 ? 1 : 0;
                            objQ2 = new e23.l() { // from class: ux.d
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                    switch (i18) {
                                        case 0:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                        case 1:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                        default:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    p002j6.c.b(lVar, rVarA, (e23.l) objQ2, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarH = x2.h(l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 290);
                    boolean zR3 = mVar2.r(customLineChart);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new b40.a(customLineChart, 16);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new b40.a(customLineChart, 16);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zR4 = mVar2.r(aVar2) | mVar2.r(list) | mVar2.B(str);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new e23.l() { // from class: ux.d
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                switch (i16) {
                                    case 0:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                    case 1:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                    default:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new e23.l() { // from class: ux.d
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                    switch (i16) {
                                        case 0:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                        case 1:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                        default:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    p002j6.c.b(lVar2, rVarH, (e23.l) objQ4, mVar2, 0, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar5 = g6.f.f75994b;
                    r rVarH2 = x2.h(l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), 290);
                    boolean zR5 = mVar3.r(customLineChart);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        objQ5 = new b40.a(customLineChart, 17);
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new b40.a(customLineChart, 17);
                            mVar3.K(objQ5);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ5;
                    boolean zR6 = mVar3.r(aVar2) | mVar3.r(list) | mVar3.B(str);
                    Object objQ6 = mVar3.q();
                    if (zR6) {
                        objQ6 = new e23.l() { // from class: ux.d
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                switch (i15) {
                                    case 0:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                    case 1:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                    default:
                                        customLineChart2.getClass();
                                        qz.a.b(aVar2, list, str, 4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new e23.l() { // from class: ux.d
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                    switch (i15) {
                                        case 0:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                        case 1:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                        default:
                                            customLineChart2.getClass();
                                            qz.a.b(aVar2, list, str, 4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ6);
                        }
                    }
                    p002j6.c.b(lVar3, rVarH2, (e23.l) objQ6, mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
