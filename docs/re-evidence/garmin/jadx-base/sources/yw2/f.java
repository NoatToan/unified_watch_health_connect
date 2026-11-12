package yw2;

import android.content.DialogInterface;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializerActivity;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import e23.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsDeviceActivity f199997b;

    public /* synthetic */ f(SettingsDeviceActivity settingsDeviceActivity, int i14) {
        this.f199996a = i14;
        this.f199997b = settingsDeviceActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f199996a;
        SettingsDeviceActivity settingsDeviceActivity = this.f199997b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                SettingsDeviceActivity.a aVar = SettingsDeviceActivity.f52599w;
                dialogInterface.getClass();
                settingsDeviceActivity.finish();
                break;
            default:
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar2 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                dialogInterface.getClass();
                RealTimeSettingsInitializerActivity.a.a(RealTimeSettingsInitializerActivity.f52581r, settingsDeviceActivity, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, false, 12);
                break;
        }
        return Unit.INSTANCE;
    }
}
