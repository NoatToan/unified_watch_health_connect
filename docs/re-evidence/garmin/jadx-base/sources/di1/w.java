package di1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Spinner;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.n f59791b;

    public /* synthetic */ w(com.garmin.android.apps.connectmobile.settings.devices.wifi.n nVar, int i14) {
        this.f59790a = i14;
        this.f59791b = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        WifiSetup.SecurityType securityTypeValueOf;
        int i15 = this.f59790a;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.n nVar = this.f59791b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.n.a aVar = com.garmin.android.apps.connectmobile.settings.devices.wifi.n.f43372h;
                nVar.v6().y4();
                nVar.requireActivity().getOnBackPressedDispatcher().d();
                dialogInterface.dismiss();
                break;
            case 1:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.n.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.wifi.n.f43372h;
                dialogInterface.getClass();
                Dialog dialog = (Dialog) dialogInterface;
                String string = ((EditText) dialog.findViewById(R.id.ssid)).getText().toString();
                try {
                    securityTypeValueOf = WifiSetup.SecurityType.valueOf(((Spinner) dialog.findViewById(R.id.security_type)).getSelectedItem().toString());
                } catch (Exception unused) {
                    securityTypeValueOf = WifiSetup.SecurityType.OPEN;
                }
                String string2 = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                if (i14 == -1) {
                    nVar.v6().z4(string, securityTypeValueOf, string2);
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.n.a aVar3 = com.garmin.android.apps.connectmobile.settings.devices.wifi.n.f43372h;
                nVar.v6().y4();
                nVar.requireActivity().getOnBackPressedDispatcher().d();
                dialogInterface.dismiss();
                break;
        }
    }
}
