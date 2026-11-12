package lo;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.map.LocationPickerMapActivity;
import com.garmin.android.apps.connectmobile.view.LocationTextPickerActivity;

/* JADX INFO: loaded from: classes7.dex */
public class t1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(f0 f0Var) {
        super(f0Var, 0);
        this.f113958b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113958b;
        double d14 = f0Var.V1;
        double d15 = f0Var.W1;
        boolean z14 = f0Var.f113782g2;
        t tVar = (t) dVar;
        tVar.getClass();
        Double dValueOf = Double.valueOf(Double.NaN);
        com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        po.x xVar = new po.x(new com.garmin.android.library.mapsdkadapter.f(d14, d15, bVar), po.y.END);
        Double dU = tVar.f113949a.u();
        if (dU == null) {
            dU = dValueOf;
        }
        Double dV = tVar.f113949a.v();
        if (dV != null) {
            dValueOf = dV;
        }
        po.x xVar2 = new po.x(new com.garmin.android.library.mapsdkadapter.f(dU.doubleValue(), dValueOf.doubleValue(), bVar), po.y.START);
        if (z14) {
            LocationPickerMapActivity.ca(tVar.requireActivity(), tVar.getString(R.string.activity_details_dive_exit_location), xVar);
        } else {
            LocationTextPickerActivity.ca(tVar, tVar.getString(R.string.activity_details_dive_exit_location), xVar, xVar2, 17);
        }
    }
}
