package gc0;

import android.view.View;
import android.widget.TextView;
import c22.e1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class c {
    public static void a(TextView textView, sd2.f fVar) {
        if (textView == null || fVar == null) {
            return;
        }
        boolean zL = u0.l(fVar.getProductNumber());
        int i14 = R.string.devices_not_connected;
        if (zL) {
            if (e1.a()) {
                i14 = R.string.devices_ready_to_sync;
            }
            textView.setText(i14);
        } else {
            if (u0.n(fVar.getProductNumber(), u0.S5, u0.P5, u0.H0)) {
                if (!fVar.T()) {
                    textView.setText("");
                    return;
                } else {
                    textView.setText(new d(new l22.a(textView.getContext())).a(fVar.S2()));
                    return;
                }
            }
            if (!e1.a()) {
                textView.setText(R.string.devices_bluetooth_turned_off);
                return;
            }
            if (hk0.p.m(fVar)) {
                i14 = R.string.txt_garmin_device_connected;
            }
            textView.setText(i14);
        }
    }

    public static void b(View view2, sd2.f fVar) {
        if (view2 == null || fVar == null) {
            return;
        }
        long unitID = fVar.getUnitID();
        if (km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, unitID) && hk0.p.m(fVar) && !hk0.p.j(unitID)) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }
}
