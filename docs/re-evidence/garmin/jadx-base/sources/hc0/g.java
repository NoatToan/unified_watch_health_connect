package hc0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import ca0.o1;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.TroubleConnectingActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f83245b;

    public /* synthetic */ g(k kVar, int i14) {
        this.f83244a = i14;
        this.f83245b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f83244a) {
            case 0:
                k kVar = this.f83245b;
                kVar.startActivity(new Intent(kVar.getActivity(), (Class<?>) TroubleConnectingActivity.class));
                break;
            default:
                Context contextRequireContext = this.f83245b.requireContext();
                DeviceSetupActivity.a aVar = DeviceSetupActivity.f33758b;
                aVar.getClass();
                contextRequireContext.getClass();
                aVar.b(contextRequireContext, o1.ADD_DEVICE, 0);
                break;
        }
    }
}
