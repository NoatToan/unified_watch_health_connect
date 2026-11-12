package ws1;

import com.garmin.android.apps.connectmobile.trails.presentation.TrailElevationFullscreenChartActivity;
import e23.p;
import et1.o0;
import j53.l;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.b f186950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrailElevationFullscreenChartActivity f186951c;

    public /* synthetic */ b(pt1.b bVar, TrailElevationFullscreenChartActivity trailElevationFullscreenChartActivity, int i14) {
        this.f186949a = i14;
        this.f186950b = bVar;
        this.f186951c = trailElevationFullscreenChartActivity;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        i53.c cVarB;
        int i14 = this.f186949a;
        TrailElevationFullscreenChartActivity trailElevationFullscreenChartActivity = this.f186951c;
        pt1.b bVar = this.f186950b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                TrailElevationFullscreenChartActivity.a aVar = TrailElevationFullscreenChartActivity.f45086a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(2125772230, new b(bVar, trailElevationFullscreenChartActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                TrailElevationFullscreenChartActivity.a aVar2 = TrailElevationFullscreenChartActivity.f45086a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String str = bVar.f140814a;
                    if (str == null) {
                        str = "";
                    }
                    List<o20.a> list = bVar.f140815b;
                    if (list == null || (cVarB = i53.a.e(list)) == null) {
                        cVarB = l.b();
                    }
                    boolean zR = mVar2.r(trailElevationFullscreenChartActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new wd.c(trailElevationFullscreenChartActivity, 15);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new wd.c(trailElevationFullscreenChartActivity, 15);
                            mVar2.K(objQ);
                        }
                    }
                    o0.a(str, cVarB, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
