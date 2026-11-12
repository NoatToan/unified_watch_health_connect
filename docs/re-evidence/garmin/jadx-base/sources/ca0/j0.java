package ca0;

import java.lang.annotation.Annotation;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26299a;

    public /* synthetic */ j0(int i14) {
        this.f26299a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26299a) {
            case 0:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationRoute.LteSubscriptionDeviceSelector", i0.s.INSTANCE, new Annotation[0]);
            case 1:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationRoute.LteSubscriptionTransfer", i0.t.INSTANCE, new Annotation[0]);
            case 2:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationRoute.SensorBackup", i0.u.INSTANCE, new Annotation[0]);
            case 3:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationRoute.SensorBackupConfirmation", i0.v.INSTANCE, new Annotation[0]);
            case 4:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationRoute.WearLocation", i0.w.INSTANCE, new Annotation[0]);
            case 5:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationRoute.WristSelection", i0.x.INSTANCE, new Annotation[0]);
            case 6:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.Detection", b1.c.INSTANCE, new Annotation[0]);
            case 7:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceList", b1.g.INSTANCE, new Annotation[0]);
            case 8:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.DeviceNotFound", b1.h.INSTANCE, new Annotation[0]);
            case 9:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.More", b1.o.INSTANCE, new Annotation[0]);
            case 10:
                b1.p.Companion companion = b1.p.INSTANCE;
                return new m63.e(l90.k.a.f111583a);
            case 11:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryRoute.ScanPermissions", b1.q.INSTANCE, new Annotation[0]);
            case 12:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceMigrationRoute.BrowseAllBackups", f1.a.INSTANCE, new Annotation[0]);
            case 13:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceMigrationRoute.Loading", f1.c.INSTANCE, new Annotation[0]);
            case 14:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceMigrationRoute.MultipleBackups", f1.d.INSTANCE, new Annotation[0]);
            case 15:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.CompanionDeviceLink", n1.b.INSTANCE, new Annotation[0]);
            case 16:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBle", n1.c.INSTANCE, new Annotation[0]);
            case 17:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBleProgress", n1.d.INSTANCE, new Annotation[0]);
            case 18:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DevicePairingRoute.PairBluetoothClassic", n1.f.INSTANCE, new Annotation[0]);
            case 19:
                return Unit.INSTANCE;
            case 20:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.BleConnectionMode", z1.a.INSTANCE, new Annotation[0]);
            case 21:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.DeviceCustomization", z1.d.INSTANCE, new Annotation[0]);
            case 22:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.DeviceMigration", z1.e.INSTANCE, new Annotation[0]);
            case 23:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.Discovery", z1.f.INSTANCE, new Annotation[0]);
            case 24:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.EndFlow", z1.g.INSTANCE, new Annotation[0]);
            case 25:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.FavoriteActivities", z1.h.INSTANCE, new Annotation[0]);
            case 26:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.GestureTutorial", z1.i.INSTANCE, new Annotation[0]);
            case 27:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.InReach", z1.j.INSTANCE, new Annotation[0]);
            case 28:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.Launchpad", z1.k.INSTANCE, new Annotation[0]);
            default:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupPhase.Pairing", z1.l.INSTANCE, new Annotation[0]);
        }
    }
}
