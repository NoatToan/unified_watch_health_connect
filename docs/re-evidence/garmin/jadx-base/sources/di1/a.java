package di1;

import android.content.DialogInterface;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import zb0.n0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DisplayWiFiNetworksActivity f59723b;

    public /* synthetic */ a(DisplayWiFiNetworksActivity displayWiFiNetworksActivity, int i14) {
        this.f59722a = i14;
        this.f59723b = displayWiFiNetworksActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f59722a;
        DisplayWiFiNetworksActivity displayWiFiNetworksActivity = this.f59723b;
        switch (i15) {
            case 0:
                displayWiFiNetworksActivity.f43236f = null;
                displayWiFiNetworksActivity.f43237g.postDelayed(displayWiFiNetworksActivity.f43242l, AbstractComponentTracker.LINGERING_TIMEOUT);
                break;
            default:
                DisplayWiFiNetworksActivity.a aVar = DisplayWiFiNetworksActivity.f43230m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                n0.a(displayWiFiNetworksActivity.f43231a, "DisplayWiFiNetworksActivity");
                displayWiFiNetworksActivity.setResult(0);
                displayWiFiNetworksActivity.finish();
                break;
        }
    }
}
