package ca0;

import java.lang.annotation.Annotation;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26070a;

    public /* synthetic */ a2(int i14) {
        this.f26070a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26070a) {
            case 0:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.Permissions", z1.m.INSTANCE, new Annotation[0]);
            case 1:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.ProductTutorial", z1.n.INSTANCE, new Annotation[0]);
            case 2:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.StartupConsents", z1.o.INSTANCE, new Annotation[0]);
            case 3:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.Sync", z1.p.INSTANCE, new Annotation[0]);
            case 4:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.UserProfile", z1.q.INSTANCE, new Annotation[0]);
            case 5:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.WiFi", z1.r.INSTANCE, new Annotation[0]);
            case 6:
                b2[] b2VarArrValues = b2.values();
                b2VarArrValues.getClass();
                return new m63.b0("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhaseType", b2VarArrValues);
            case 7:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncRoute.FirmwareUpdateInProgress", k2.c.INSTANCE, new Annotation[0]);
            case 8:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncRoute.FirmwareUpdateSuccess", k2.d.INSTANCE, new Annotation[0]);
            case 9:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncRoute.OrcaFirmwareUpdateInProgress", k2.e.INSTANCE, new Annotation[0]);
            case 10:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncRoute.SyncInProgress", k2.g.INSTANCE, new Annotation[0]);
            case 11:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncRoute.SyncSuccess", k2.h.INSTANCE, new Annotation[0]);
            case 12:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncRoute.SyncTutorial", k2.i.INSTANCE, new Annotation[0]);
            case 13:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.InReachSubscriptionRoute.Loading", q2.b.INSTANCE, new Annotation[0]);
            case 14:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.InReachSubscriptionRoute.Purchase", q2.c.INSTANCE, new Annotation[0]);
            case 15:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.InReachSubscriptionRoute.Status", q2.d.INSTANCE, new Annotation[0]);
            case 16:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.CalendarPermissionScreen", u2.a.INSTANCE, new Annotation[0]);
            case 17:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.CallLogPermissionScreen", u2.b.INSTANCE, new Annotation[0]);
            case 18:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.LocationPermissionScreen", u2.c.INSTANCE, new Annotation[0]);
            case 19:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.ManagePermissionScreen", u2.d.INSTANCE, new Annotation[0]);
            case 20:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.NotificationAccessScreen", u2.e.INSTANCE, new Annotation[0]);
            case 21:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.PhonePermissionScreen", u2.f.INSTANCE, new Annotation[0]);
            case 22:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.SmsPermissionScreen", u2.g.INSTANCE, new Annotation[0]);
            case 23:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsRoute.StartPermissionTypeCheck", u2.h.INSTANCE, new Annotation[0]);
            case 24:
                return Unit.INSTANCE;
            case 25:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ActivityLevel", c4.a.INSTANCE, new Annotation[0]);
            case 26:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Birthday", c4.d.INSTANCE, new Annotation[0]);
            case 27:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Gender", c4.g.INSTANCE, new Annotation[0]);
            case 28:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Height", c4.h.INSTANCE, new Annotation[0]);
            default:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Loading", c4.j.INSTANCE, new Annotation[0]);
        }
    }
}
