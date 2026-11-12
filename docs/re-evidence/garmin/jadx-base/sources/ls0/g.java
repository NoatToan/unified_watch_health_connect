package ls0;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import java.util.ArrayList;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TripFlightFragment f114720b;

    public /* synthetic */ g(TripFlightFragment tripFlightFragment, int i14) {
        this.f114719a = i14;
        this.f114720b = tripFlightFragment;
    }

    @Override // e23.a
    public final Object invoke() {
        yr0.j jVar;
        int i14 = this.f114719a;
        yr0.i iVarR = null;
        TripFlightFragment tripFlightFragment = this.f114720b;
        switch (i14) {
            case 0:
                int i15 = TripFlightFragment.f37039n;
                Bundle arguments = tripFlightFragment.getArguments();
                boolean z14 = arguments != null ? arguments.getBoolean("ARG_RETURN_FLIGHT") : false;
                Bundle arguments2 = tripFlightFragment.getArguments();
                int i16 = arguments2 != null ? arguments2.getInt("ARG_DESTINATION_INDEX") : 0;
                ArrayList arrayList = tripFlightFragment.y6().f37107e;
                if (z14) {
                    yr0.j jVar2 = tripFlightFragment.y6().f37108f;
                    if (jVar2 != null) {
                        ns0.b.f127812a.getClass();
                        iVarR = ns0.b.r(jVar2);
                    }
                } else {
                    yr0.j jVar3 = (yr0.j) h0.e0(i16, arrayList);
                    if (jVar3 != null) {
                        ns0.b.f127812a.getClass();
                        iVarR = ns0.b.r(jVar3);
                    }
                }
                if (iVarR == null) {
                    iVarR = new yr0.i(null, null, null, null, null, null, null, null, null, null, 1023, null);
                }
                ns0.c.f127813a.getClass();
                if (!ns0.c.a(iVarR)) {
                    yr0.j jVar4 = (yr0.j) h0.e0(i16 - 1, arrayList);
                    if (jVar4 != null) {
                        iVarR.f198995c = jVar4.getDestinationLocation();
                        iVarR.f198996d = jVar4.getDestinationTimezone();
                    }
                    if (z14 && i16 > 0 && (jVar = (yr0.j) h0.d0(arrayList)) != null) {
                        iVarR.f198999g = jVar.getOriginLocation();
                        iVarR.f199000h = jVar.getOriginTimezone();
                    }
                }
                return new s(z14, i16, iVarR);
            case 1:
                int i17 = TripFlightFragment.f37039n;
                tripFlightFragment.C6(tripFlightFragment.w6().f114746c);
                tripFlightFragment.A6();
                return Unit.INSTANCE;
            default:
                int i18 = TripFlightFragment.f37039n;
                tripFlightFragment.C6(tripFlightFragment.w6().f114746c);
                if (tripFlightFragment.w6().f114744a) {
                    NavHostFragment.f10124e.getClass();
                    NavHostFragment.a.a(tripFlightFragment).g(R.id.action_trip_flight_fragment_to_trip_review_fragment, null);
                } else if (tripFlightFragment.w6().f114745b + 1 < tripFlightFragment.y6().f37107e.size()) {
                    tripFlightFragment.A6();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("ARG_RETURN_FLIGHT", true);
                    bundle.putInt("ARG_DESTINATION_INDEX", tripFlightFragment.w6().f114745b + 1);
                    NavHostFragment.f10124e.getClass();
                    NavHostFragment.a.a(tripFlightFragment).g(R.id.action_trip_next_flight_fragment, bundle);
                }
                return Unit.INSTANCE;
        }
    }
}
