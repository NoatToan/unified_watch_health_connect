package aj1;

import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Preference.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Preference f3430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sd2.f f3431c;

    public /* synthetic */ e(Preference preference, sd2.f fVar, int i14) {
        this.f3429a = i14;
        this.f3430b = preference;
        this.f3431c = fVar;
    }

    @Override // androidx.preference.Preference.d
    public final boolean X3(Preference preference) {
        int i14 = this.f3429a;
        sd2.f fVar = this.f3431c;
        Preference preference2 = this.f3430b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                RTSSettingsLauncherActivity.a aVar2 = RTSSettingsLauncherActivity.f34352a;
                Context context = preference2.f10148b.f17488a;
                context.getClass();
                aVar2.getClass();
                Intent intentA = RTSSettingsLauncherActivity.a.a(context, this.f3431c, GDIRealtimeSettingsProto.WellKnownCompositionId.NOTIFICATION_SETTINGS_VALUE, true, null, null);
                intentA.addFlags(268435456);
                preference2.f10148b.f17488a.startActivity(intentA);
                break;
            case 1:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                Context context2 = preference2.f10148b.f17488a;
                context2.getClass();
                com.garmin.android.apps.connectmobile.settings.notifications.b.w6(context2, fVar.getDisplayName());
                break;
            case 2:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                Context context3 = preference2.f10148b.f17488a;
                context3.getClass();
                com.garmin.android.apps.connectmobile.settings.notifications.b.w6(context3, fVar.getDisplayName());
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar5 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                RTSSettingsLauncherActivity.a aVar6 = RTSSettingsLauncherActivity.f34352a;
                Context context4 = preference2.f10148b.f17488a;
                context4.getClass();
                aVar6.getClass();
                Intent intentA2 = RTSSettingsLauncherActivity.a.a(context4, this.f3431c, GDIRealtimeSettingsProto.WellKnownCompositionId.POWER_MANAGER_VALUE, true, null, null);
                intentA2.addFlags(268435456);
                preference2.f10148b.f17488a.startActivity(intentA2);
                break;
        }
        return true;
    }

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.settings.notifications.b bVar, Preference preference, sd2.f fVar, int i14) {
        this.f3429a = i14;
        this.f3430b = preference;
        this.f3431c = fVar;
    }
}
