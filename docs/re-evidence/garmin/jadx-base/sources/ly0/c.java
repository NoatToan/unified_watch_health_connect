package ly0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapFullscreenActivity f115287b;

    public /* synthetic */ c(MapFullscreenActivity mapFullscreenActivity, int i14) {
        this.f115286a = i14;
        this.f115287b = mapFullscreenActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f115286a;
        MapFullscreenActivity mapFullscreenActivity = this.f115287b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                MapFullscreenActivity.a aVar = MapFullscreenActivity.f39249b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-999745259, new c(mapFullscreenActivity, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                MapFullscreenActivity.a aVar2 = MapFullscreenActivity.f39249b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    o oVar = (o) mapFullscreenActivity.f39250a.getValue();
                    boolean zR = mVar2.r(mapFullscreenActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new b(mapFullscreenActivity, 1);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b(mapFullscreenActivity, 1);
                            mVar2.K(objQ);
                        }
                    }
                    g.a(oVar, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
