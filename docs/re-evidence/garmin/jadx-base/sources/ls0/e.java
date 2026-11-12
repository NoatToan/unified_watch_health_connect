package ls0;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import java.util.ArrayList;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TripFlightFragment f114715b;

    public /* synthetic */ e(TripFlightFragment tripFlightFragment, int i14) {
        this.f114714a = i14;
        this.f114715b = tripFlightFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f114714a;
        int i15 = 2;
        int i16 = 1;
        TripFlightFragment tripFlightFragment = this.f114715b;
        switch (i14) {
            case 0:
                int i17 = TripFlightFragment.f37039n;
                tripFlightFragment.v6();
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarY6 = tripFlightFragment.y6();
                int i18 = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.f37102n;
                eVarY6.B4(true);
                tripFlightFragment.y6().f37113k.f(tripFlightFragment.getViewLifecycleOwner(), new n(tripFlightFragment));
                break;
            case 1:
                int i19 = TripFlightFragment.f37039n;
                tripFlightFragment.y6().f37108f = null;
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a(tripFlightFragment).n();
                NavHostFragment.a.a(tripFlightFragment).g(R.id.action_trip_flight_fragment_to_trip_review_fragment, null);
                break;
            case 2:
                int i24 = TripFlightFragment.f37039n;
                if (tripFlightFragment.w6().f114744a) {
                    tripFlightFragment.y6().f37108f = null;
                } else {
                    com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarY7 = tripFlightFragment.y6();
                    int i25 = tripFlightFragment.w6().f114745b;
                    ArrayList arrayList = eVarY7.f37107e;
                    if (i25 < arrayList.size()) {
                        arrayList.remove(i25);
                    }
                }
                tripFlightFragment.requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 3:
                int i26 = TripFlightFragment.f37039n;
                tripFlightFragment.v6();
                tripFlightFragment.S6(new g(tripFlightFragment, i16));
                break;
            case 4:
                int i27 = TripFlightFragment.f37039n;
                tripFlightFragment.v6();
                tripFlightFragment.S6(new g(tripFlightFragment, i15));
                break;
            case 5:
                int i28 = TripFlightFragment.f37039n;
                tripFlightFragment.v6();
                q qVarW6 = tripFlightFragment.w6();
                if (!p005kotlin.jvm.internal.s.g(qVarW6.f114746c, qVarW6.f114752i)) {
                    o0.a.b(o0.f149771c, tripFlightFragment.getString(R.string.title_are_you_sure), tripFlightFragment.getString(R.string.msg_confirm_one_way_trip), R.string.lbl_common_continue, new e(tripFlightFragment, i16), R.string.lbl_cancel, null, 32).u6(tripFlightFragment);
                } else {
                    NavHostFragment.f10124e.getClass();
                    NavHostFragment.a.a(tripFlightFragment).n();
                    NavHostFragment.a.a(tripFlightFragment).g(R.id.action_trip_flight_fragment_to_trip_review_fragment, null);
                }
                break;
            case 6:
                int i29 = TripFlightFragment.f37039n;
                tripFlightFragment.v6();
                o0.a.b(o0.f149771c, tripFlightFragment.getString(R.string.msg_remove_destination_question), tripFlightFragment.getString(R.string.msg_destination_details_will_be_lost), R.string.lbl_remove, new e(tripFlightFragment, i15), R.string.lbl_cancel, null, 32).u6(tripFlightFragment);
                break;
            case 7:
                int i30 = TripFlightFragment.f37039n;
                tripFlightFragment.requireActivity().finish();
                break;
            default:
                int i34 = TripFlightFragment.f37039n;
                tripFlightFragment.requireActivity().finish();
                break;
        }
    }
}
