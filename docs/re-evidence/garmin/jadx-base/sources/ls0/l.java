package ls0;

import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import lc.u0;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TripFlightFragment f114734b;

    public /* synthetic */ l(TripFlightFragment tripFlightFragment, int i14) {
        this.f114733a = i14;
        this.f114734b = tripFlightFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f114733a;
        TripFlightFragment tripFlightFragment = this.f114734b;
        switch (i14) {
            case 0:
                b.s sVar = (b.s) obj;
                int i15 = TripFlightFragment.f37039n;
                sVar.getClass();
                if (tripFlightFragment.y6().z4()) {
                    tripFlightFragment.C6(tripFlightFragment.w6().f114746c);
                    com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarY6 = tripFlightFragment.y6();
                    if (eVarY6.x4().equals(eVarY6.f37103a)) {
                        sVar.f(false);
                        tripFlightFragment.requireActivity().getOnBackPressedDispatcher().d();
                    } else {
                        o0.a.b(o0.f149771c, tripFlightFragment.getString(R.string.title_exit_without_saving), tripFlightFragment.getString(R.string.msg_training_exit_plan_info), R.string.lbl_exit, new e(tripFlightFragment, 8), R.string.lbl_cancel, null, 32).u6(tripFlightFragment);
                    }
                } else {
                    ns0.c cVar = ns0.c.f127813a;
                    yr0.i iVar = tripFlightFragment.w6().f114746c;
                    cVar.getClass();
                    if (ns0.c.a(iVar)) {
                        o0.a.b(o0.f149771c, tripFlightFragment.getString(R.string.msg_discard_trip_details_question), tripFlightFragment.getString(R.string.msg_trip_details_will_be_lost), R.string.lbl_discard, new e(tripFlightFragment, 7), R.string.lbl_cancel, null, 32).u6(tripFlightFragment);
                    } else {
                        sVar.f(false);
                        tripFlightFragment.requireActivity().getOnBackPressedDispatcher().d();
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                int i16 = TripFlightFragment.f37039n;
                int i17 = TripFlightFragment.c.f37058a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    g22.e.l(tripFlightFragment);
                } else if (i17 == 2) {
                    g22.e.f(tripFlightFragment);
                    yr0.n nVar = (yr0.n) g3Var.f35301b;
                    if (nVar != null) {
                        tripFlightFragment.w6().f114746c.f198995c = nVar.f199033a;
                        tripFlightFragment.w6().f114746c.f198996d = nVar.f199034b;
                        ms0.e eVar = tripFlightFragment.f37047h;
                        if (eVar == null) {
                            p005kotlin.jvm.internal.s.m("departureViewHolder");
                            throw null;
                        }
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar.f120466b;
                        EditText editText = styledInlineTextFieldViewDark.editText;
                        editText.clearFocus();
                        v22.e.c(editText, styledInlineTextFieldViewDark);
                        ms0.e eVar2 = tripFlightFragment.f37047h;
                        if (eVar2 == null) {
                            p005kotlin.jvm.internal.s.m("departureViewHolder");
                            throw null;
                        }
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = eVar2.f120466b;
                        styledInlineTextFieldViewDark2.getClass();
                        EditText editText2 = styledInlineTextFieldViewDark2.editText;
                        editText2.getClass();
                        editText2.setText(tripFlightFragment.w6().f114746c.f198995c);
                        editText2.setVisibility(0);
                        Unit unit = Unit.INSTANCE;
                        tripFlightFragment.M6();
                    } else {
                        g22.e.a(tripFlightFragment, new fw.g());
                    }
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(tripFlightFragment);
                    g22.e.a(tripFlightFragment, hb2.i.a(tripFlightFragment.requireContext()) ? new fw.r() : new fw.h());
                }
                return Unit.INSTANCE;
        }
    }
}
