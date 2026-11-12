package au0;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.liveactivity.DistanceCalibrationActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DistanceCalibrationActivity f12856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DistanceCalibrationActivity.b f12857c;

    public /* synthetic */ b(DistanceCalibrationActivity distanceCalibrationActivity, DistanceCalibrationActivity.b bVar, int i14) {
        this.f12855a = i14;
        this.f12856b = distanceCalibrationActivity;
        this.f12857c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12855a;
        DistanceCalibrationActivity.b bVar = this.f12857c;
        DistanceCalibrationActivity distanceCalibrationActivity = this.f12856b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DistanceCalibrationActivity.a aVar = DistanceCalibrationActivity.f38470b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    q qVar = (q) distanceCalibrationActivity.f38471a.getValue();
                    Resources resources = (Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c);
                    qVar.getClass();
                    resources.getClass();
                    f12.l.f68084a.getClass();
                    c22.l lVarE2 = f12.l.a.a().E2();
                    h0.f12930a.getClass();
                    og2.k.j(h0.a.b(lVarE2, resources), null, null, z3.f.c(798222353, new b(distanceCalibrationActivity, bVar, i15), mVar), mVar, 3072);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DistanceCalibrationActivity.a aVar2 = DistanceCalibrationActivity.f38470b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zY = ((q) distanceCalibrationActivity.f38471a.getValue()).f12984a.y();
                    zf2.d dVar = bVar.f38475c;
                    boolean z14 = bVar.f38477e;
                    zf2.d dVar2 = zf2.d.f204609p;
                    boolean z15 = dVar != dVar2 || z14;
                    boolean z16 = dVar == dVar2 && z14;
                    int i16 = bVar.f38476d;
                    boolean z17 = dVar == zf2.d.Z0;
                    boolean zR = mVar2.r(distanceCalibrationActivity) | mVar2.B(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new a42.i(16, distanceCalibrationActivity, bVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a42.i(16, distanceCalibrationActivity, bVar);
                            mVar2.K(objQ);
                        }
                    }
                    p.c(zY, z15, z16, i16, z17, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
