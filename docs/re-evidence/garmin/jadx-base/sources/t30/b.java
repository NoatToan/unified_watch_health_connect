package t30;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import me2.z;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f162147b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f162146a = i14;
        this.f162147b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f162146a;
        c cVar = this.f162147b;
        switch (i14) {
            case 0:
                c.b bVar = c.f162148z;
                cVar.dismiss();
                Bundle bundle = new Bundle(1);
                bundle.putString("Screen", "Courses");
                ht.a.f85464a.getClass();
                ht.a.a(bundle, "AddFullClimbToCourse");
                c.a aVar = cVar.f162159w;
                if (aVar != null) {
                    ClimbDTO climbDTO = cVar.f162150l;
                    if (climbDTO == null) {
                        s.m("climbDTO");
                        throw null;
                    }
                    aVar.b(climbDTO.m());
                }
                return Unit.INSTANCE;
            case 1:
                ClimbDTO climbDTO2 = cVar.f162150l;
                if (climbDTO2 == null) {
                    s.m("climbDTO");
                    throw null;
                }
                GeoPointDTO geoPointDTO = (GeoPointDTO) h0.d0(climbDTO2.m());
                if (geoPointDTO != null) {
                    cVar.dismiss();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("Screen", "Courses");
                    ht.a.f85464a.getClass();
                    ht.a.a(bundle2, "AddStartOfClimbToCourse");
                    Double d14 = geoPointDTO.latitude;
                    double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                    Double d15 = geoPointDTO.longitude;
                    com.garmin.android.library.mapsdkadapter.f fVarB = z.b(new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d));
                    c.a aVar2 = cVar.f162159w;
                    if (aVar2 != null) {
                        aVar2.a(fVarB);
                    }
                }
                return Unit.INSTANCE;
            default:
                c.b bVar2 = c.f162148z;
                androidx.fragment.app.m activity = cVar.getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                }
                androidx.fragment.app.m activity2 = cVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                return Unit.INSTANCE;
        }
    }
}
