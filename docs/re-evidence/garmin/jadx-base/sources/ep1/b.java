package ep1;

import com.garmin.android.apps.connectmobile.solarcharge.EdgeSolarChargeChartActivity;
import e23.p;
import lp1.l;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EdgeSolarChargeChartActivity f64921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f64922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f64923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f64924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f64925f;

    public /* synthetic */ b(EdgeSolarChargeChartActivity edgeSolarChargeChartActivity, long j8, long j14, long j15, long j16, int i14) {
        this.f64920a = i14;
        this.f64921b = edgeSolarChargeChartActivity;
        this.f64922c = j8;
        this.f64923d = j14;
        this.f64924e = j15;
        this.f64925f = j16;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        boolean z14 = false;
        final int i14 = 1;
        switch (this.f64920a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                EdgeSolarChargeChartActivity.a aVar = EdgeSolarChargeChartActivity.f44767b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1455955159, new b(this.f64921b, this.f64922c, this.f64923d, this.f64924e, this.f64925f, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                EdgeSolarChargeChartActivity.a aVar2 = EdgeSolarChargeChartActivity.f44767b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    final EdgeSolarChargeChartActivity edgeSolarChargeChartActivity = this.f64921b;
                    e eVar = (e) edgeSolarChargeChartActivity.f44768a.getValue();
                    DateTime dateTime = new DateTime(this.f64923d);
                    DateTime dateTime2 = new DateTime(this.f64924e);
                    boolean zR = mVar2.r(edgeSolarChargeChartActivity);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        obj3 = objQ;
                        final boolean z15 = z14 ? 1 : 0;
                        e23.a aVar4 = new e23.a() { // from class: ep1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i15 = z15;
                                EdgeSolarChargeChartActivity edgeSolarChargeChartActivity2 = edgeSolarChargeChartActivity;
                                switch (i15) {
                                    case 0:
                                        EdgeSolarChargeChartActivity.a aVar5 = EdgeSolarChargeChartActivity.f44767b;
                                        edgeSolarChargeChartActivity2.displayFailedMessage();
                                        break;
                                    default:
                                        EdgeSolarChargeChartActivity.a aVar6 = EdgeSolarChargeChartActivity.f44767b;
                                        edgeSolarChargeChartActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar4);
                        obj3 = aVar4;
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            obj3 = objQ;
                            final int z16 = z14 ? 1 : 0;
                            e23.a aVar5 = new e23.a() { // from class: ep1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = z16;
                                    EdgeSolarChargeChartActivity edgeSolarChargeChartActivity2 = edgeSolarChargeChartActivity;
                                    switch (i15) {
                                        case 0:
                                            EdgeSolarChargeChartActivity.a aVar6 = EdgeSolarChargeChartActivity.f44767b;
                                            edgeSolarChargeChartActivity2.displayFailedMessage();
                                            break;
                                        default:
                                            EdgeSolarChargeChartActivity.a aVar7 = EdgeSolarChargeChartActivity.f44767b;
                                            edgeSolarChargeChartActivity2.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar5);
                            obj3 = aVar5;
                        }
                    }
                    obj3 = objQ;
                    e23.a aVar6 = (e23.a) obj3;
                    boolean zR2 = mVar2.r(edgeSolarChargeChartActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        obj4 = objQ2;
                        e23.a aVar7 = new e23.a() { // from class: ep1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i15 = i14;
                                EdgeSolarChargeChartActivity edgeSolarChargeChartActivity2 = edgeSolarChargeChartActivity;
                                switch (i15) {
                                    case 0:
                                        EdgeSolarChargeChartActivity.a aVar8 = EdgeSolarChargeChartActivity.f44767b;
                                        edgeSolarChargeChartActivity2.displayFailedMessage();
                                        break;
                                    default:
                                        EdgeSolarChargeChartActivity.a aVar9 = EdgeSolarChargeChartActivity.f44767b;
                                        edgeSolarChargeChartActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar7);
                        obj4 = aVar7;
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            obj4 = objQ2;
                            e23.a aVar8 = new e23.a() { // from class: ep1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = i14;
                                    EdgeSolarChargeChartActivity edgeSolarChargeChartActivity2 = edgeSolarChargeChartActivity;
                                    switch (i15) {
                                        case 0:
                                            EdgeSolarChargeChartActivity.a aVar9 = EdgeSolarChargeChartActivity.f44767b;
                                            edgeSolarChargeChartActivity2.displayFailedMessage();
                                            break;
                                        default:
                                            EdgeSolarChargeChartActivity.a aVar10 = EdgeSolarChargeChartActivity.f44767b;
                                            edgeSolarChargeChartActivity2.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar8);
                            obj4 = aVar8;
                        }
                    }
                    obj4 = objQ2;
                    l.a(eVar, this.f64922c, dateTime, dateTime2, this.f64925f, aVar6, (e23.a) obj4, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
