package ot;

import am.x0;
import am.z0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import ps.c1;
import ps.f1;
import xg0.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lot/h;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements com.garmin.android.library.mapsdkadapter.i.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f133596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f133597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GCMMapView f133598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f133599d;

    public h(f fVar, Context context, GCMMapView gCMMapView, o53.b0 b0Var) {
        this.f133596a = fVar;
        this.f133597b = context;
        this.f133598c = gCMMapView;
        this.f133599d = b0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        this.f133598c.c();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        tt.e maxDistanceActivity;
        to.o activityType;
        tt.e maxDistanceActivity2;
        ps.n activityPolylineDto;
        String str = f.f133585v;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, str, "onMapReady");
        f fVar = this.f133596a;
        tt.c cVar = fVar.f133586r;
        ps.m activityPolylineDMO = (cVar == null || (maxDistanceActivity2 = cVar.getMaxDistanceActivity()) == null || (activityPolylineDto = maxDistanceActivity2.getActivityPolylineDto()) == null) ? null : activityPolylineDto.getActivityPolylineDMO();
        String strJ = (cVar == null || (maxDistanceActivity = cVar.getMaxDistanceActivity()) == null || (activityType = maxDistanceActivity.getActivityType()) == null) ? null : activityType.j();
        i2.a.b(a2Var, str, "Polyline of " + fVar.r() + ": polylineDmo = [" + activityPolylineDMO + "], activityTypeLKey = [" + strJ + "]");
        GCMMapView gCMMapView = this.f133598c;
        if (strJ == null || strJ.length() <= 0 || activityPolylineDMO == null) {
            v22.e.l(gCMMapView);
            return;
        }
        x0 x0VarL = z0.l(x0.f4346x, strJ);
        c1 c1VarC = wg0.e.c(activityPolylineDMO);
        o13.p<com.garmin.android.library.mapsdkadapter.f, com.garmin.android.library.mapsdkadapter.f> pVarA = wg0.e.a(activityPolylineDMO);
        wg0.d dVar = new wg0.d(x0VarL, c1VarC, pVarA.f128594a, pVarA.f128595b, null, null, null, null, null, null, null, false, 4080, null);
        Context context = this.f133597b;
        i0 i0Var = new i0(context);
        c1 c1Var = dVar.f185079b;
        ArrayList arrayListB = c1Var != null ? new f1(i0Var.f190777a, c1Var, null, 4, null).b(true, null, null) : null;
        List<com.garmin.android.library.mapsdkadapter.p> listC = i0Var.c(dVar);
        if (!gCMMapView.getMapProxy().f144584a.getF50241b()) {
            i2.a.b(a2Var, str, "Map should be ready at this stage but isn't. At ".concat(fVar.r()));
            return;
        }
        gCMMapView.getMapAdapter().A(new com.google.firebase.remoteconfig.internal.b(gCMMapView, fVar, this.f133599d, activityPolylineDMO, context));
        gCMMapView.setMapType(1);
        if (arrayListB != null) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                gCMMapView.h((com.garmin.android.library.mapsdkadapter.q) it.next());
            }
        }
        Iterator it3 = ((ArrayList) listC).iterator();
        while (it3.hasNext()) {
            gCMMapView.g((com.garmin.android.library.mapsdkadapter.p) it3.next());
        }
        gCMMapView.i();
    }
}
