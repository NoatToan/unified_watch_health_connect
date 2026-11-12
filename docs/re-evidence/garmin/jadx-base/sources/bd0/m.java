package bd0;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    public static final void a(com.garmin.android.apps.connectmobile.c cVar) {
        new androidx.appcompat.app.e.a(cVar).setTitle("").setMessage(R.string.permissions_msg_location_services_needed_for_ble).setCancelable(false).setNeutralButton(R.string.lbl_cancel, new l(cVar, 0)).setPositiveButton(R.string.lbl_settings, new l(cVar, 1)).show().getClass();
    }

    public static final androidx.appcompat.app.e b(com.garmin.android.apps.connectmobile.c cVar) {
        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(cVar).setTitle("").setMessage(R.string.permissions_msg_location_denied_for_ble_scanning).setCancelable(false).setNeutralButton(R.string.lbl_cancel, new l(cVar, 2)).setPositiveButton(R.string.lbl_settings, new l(cVar, 3)).show();
        eVarShow.getClass();
        return eVarShow;
    }

    public static final androidx.appcompat.app.e c(com.garmin.android.apps.connectmobile.c cVar) {
        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(cVar).setTitle("").setMessage(R.string.permissions_msg_location_for_ble_rationale).setCancelable(false).setNeutralButton(R.string.lbl_ok, new l(cVar, 4)).show();
        eVarShow.getClass();
        return eVarShow;
    }
}
