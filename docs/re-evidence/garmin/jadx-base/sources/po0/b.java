package po0;

import c2.l;
import c2.x2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomLineChart f139002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tz.a f139003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.c f139004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f139005e;

    public /* synthetic */ b(CustomLineChart customLineChart, tz.a aVar, co0.c cVar, String str, int i14) {
        this.f139001a = i14;
        this.f139002b = customLineChart;
        this.f139003c = aVar;
        this.f139004d = cVar;
        this.f139005e = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f139001a;
        m.a aVar = m.f135153a;
        final String str = this.f139005e;
        final co0.c cVar = this.f139004d;
        final tz.a aVar2 = this.f139003c;
        CustomLineChart customLineChart = this.f139002b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarH = x2.h(l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), g.f139022a);
                    boolean zR = mVar.r(customLineChart);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new b40.a(customLineChart, 8);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new b40.a(customLineChart, 8);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR2 = mVar.r(aVar2) | mVar.r(cVar) | mVar.B(str);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ2 = new e23.l() { // from class: po0.e
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                switch (objArr2) {
                                    case 0:
                                        customLineChart2.getClass();
                                        tz.a aVar3 = aVar2;
                                        aVar3.c();
                                        qz.a.b(aVar3, cVar, str, 4);
                                        break;
                                    default:
                                        customLineChart2.getClass();
                                        tz.a aVar4 = aVar2;
                                        aVar4.c();
                                        qz.a.b(aVar4, cVar, str, 4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ2 = new e23.l() { // from class: po0.e
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                    switch (objArr3) {
                                        case 0:
                                            customLineChart2.getClass();
                                            tz.a aVar3 = aVar2;
                                            aVar3.c();
                                            qz.a.b(aVar3, cVar, str, 4);
                                            break;
                                        default:
                                            customLineChart2.getClass();
                                            tz.a aVar4 = aVar2;
                                            aVar4.c();
                                            qz.a.b(aVar4, cVar, str, 4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarH2 = x2.h(l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), h.f139023a);
                    boolean zR3 = mVar2.r(customLineChart);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new b40.a(customLineChart, 9);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new b40.a(customLineChart, 9);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zR4 = mVar2.r(aVar2) | mVar2.r(cVar) | mVar2.B(str);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new e23.l() { // from class: po0.e
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                switch (i15) {
                                    case 0:
                                        customLineChart2.getClass();
                                        tz.a aVar3 = aVar2;
                                        aVar3.c();
                                        qz.a.b(aVar3, cVar, str, 4);
                                        break;
                                    default:
                                        customLineChart2.getClass();
                                        tz.a aVar4 = aVar2;
                                        aVar4.c();
                                        qz.a.b(aVar4, cVar, str, 4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new e23.l() { // from class: po0.e
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                                    switch (i15) {
                                        case 0:
                                            customLineChart2.getClass();
                                            tz.a aVar3 = aVar2;
                                            aVar3.c();
                                            qz.a.b(aVar3, cVar, str, 4);
                                            break;
                                        default:
                                            customLineChart2.getClass();
                                            tz.a aVar4 = aVar2;
                                            aVar4.c();
                                            qz.a.b(aVar4, cVar, str, 4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    p002j6.c.b(lVar2, rVarH2, (e23.l) objQ4, mVar2, 0, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
