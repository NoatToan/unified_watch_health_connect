package ng1;

import android.view.View;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner935AlertTonesDeviceSettings;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;

/* JADX INFO: loaded from: classes10.dex */
public class s0 implements GCMCheckableRow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Forerunner935AlertTonesDeviceSettings f126007a;

    public s0(Forerunner935AlertTonesDeviceSettings forerunner935AlertTonesDeviceSettings) {
        this.f126007a = forerunner935AlertTonesDeviceSettings;
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow.b
    public final void a(View view2, boolean z14) {
        Forerunner935AlertTonesDeviceSettings forerunner935AlertTonesDeviceSettings = this.f126007a;
        forerunner935AlertTonesDeviceSettings.f42117d.y1(Boolean.valueOf(z14));
        forerunner935AlertTonesDeviceSettings.f42117d.U1(Boolean.valueOf(!z14));
        forerunner935AlertTonesDeviceSettings.ca();
    }
}
