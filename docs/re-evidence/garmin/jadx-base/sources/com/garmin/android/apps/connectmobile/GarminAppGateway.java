package com.garmin.android.apps.connectmobile;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.golf.DownloadGolfAppDeepLinkActivity;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.settings.devices.CannedTextResponsesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import com.garmin.android.apps.connectmobile.startup.StartupChecksActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessActivity;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class GarminAppGateway extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28684b;

    public final void a() {
        i2.d("GarminAppGateway", "returnToCallingApp()");
        GarminConnectMobileApp.f28687i.f28691c = false;
        if (this.f28683a == null || this.f28684b == null) {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(67108864);
        try {
            String str = this.f28683a;
            intent.setComponent(new ComponentName(str, str.concat(this.f28684b)));
            startActivity(intent);
        } catch (SecurityException e4) {
            i2.i("GarminAppGateway", "returnToCallingApp: " + intent + "\nreturn activity is likely not exported \n" + e4);
        } catch (ActivityNotFoundException e14) {
            i2.i("GarminAppGateway", "returnToCallingApp: unable to launch activity: " + intent.toString() + "\n" + e14.toString());
        } catch (NullPointerException e15) {
            i2.i("GarminAppGateway", "returnToCallingApp: NPE " + intent.toString() + "\n" + e15.toString());
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f28683a = intent.getStringExtra("returnPackageName");
        this.f28684b = intent.getStringExtra("returnIntentName");
        if (bundle == null) {
            GarminConnectMobileApp.f28687i.f28691c = false;
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (GarminConnectMobileApp.f28687i.f28691c) {
            i2.d("GarminAppGateway", "calling returnToCallingApp()");
            a();
        }
        if (!((f12.b) KoinJavaComponent.get(f12.b.class)).c()) {
            GarminConnectMobileApp.f28687i.d();
            return;
        }
        StartupChecksActivity.f44788d.getClass();
        if (StartupChecksActivity.a.a()) {
            StartupChecksActivity.a.b(this, getIntent());
            finish();
            return;
        }
        i2.d("GarminAppGateway", "executeRemoteRequest()");
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("requestType", -1);
        if (intExtra == -1) {
            a();
            return;
        }
        GarminConnectMobileApp.f28687i.f28691c = true;
        long longExtra = intent.getLongExtra("GCM_dateMillis", -1L);
        DateTime dateTime = longExtra > -1 ? new DateTime(longExtra) : null;
        switch (intExtra) {
            case 0:
            case 2:
                UserDevicesActivity.ca(this);
                break;
            case 1:
                long longExtra2 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                if (longExtra2 == -1) {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                } else {
                    DeviceDetailsActivity.na(this, longExtra2);
                }
                break;
            case 3:
                DownloadGolfAppDeepLinkActivity.f35745a.getClass();
                Intent intent2 = new Intent(this, (Class<?>) DownloadGolfAppDeepLinkActivity.class);
                intent2.putExtra("action", "scorecard.list");
                startActivity(intent2);
                break;
            case 4:
                DeviceSetupActivity.a aVar = DeviceSetupActivity.f33758b;
                aVar.getClass();
                aVar.b(this, ca0.o1.ADD_DEVICE, 0);
                break;
            case 5:
                long longExtra3 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = rd2.j.i(longExtra3, null);
                if (fVarI != null) {
                    kj0.c.f104941a.getClass();
                    if (!fVarI.i1()) {
                        i2.i("GarminAppGateway", "Device is not Garmin Pay capable. Activity will finish()");
                        a();
                    } else {
                        GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
                        kj0.a.c cVar = new kj0.a.c(Long.valueOf(fVarI.getUnitID()), fVarI.getImageURL(), fVarI.getProductDisplayName());
                        aVar2.getClass();
                        startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(this, cVar)));
                    }
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 6:
                long longExtra4 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI2 = rd2.j.i(longExtra4, null);
                if (fVarI2 == null) {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                } else if (!hb2.i.a(this)) {
                    i2.i("GarminAppGateway", "No network connection, it is necessary for the target activity. Activity will finish()");
                    a();
                } else {
                    MusicSetupActivity.ea(this, fVarI2.getUnitID(), fVarI2.getProductDisplayName());
                }
                break;
            case 7:
                long longExtra5 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                if (longExtra5 != -1) {
                    DeviceOnboardingActivity.f39726b.getClass();
                    startActivity(DeviceOnboardingActivity.a.a(this, longExtra5));
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 8:
                startActivity(new Intent(this, (Class<?>) IncidentDetectionTermsActivity.class));
                break;
            case 9:
                long longExtra6 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                if (longExtra6 != -1) {
                    SolarIntensityActivity.f44787a.getClass();
                    startActivity(SolarIntensityActivity.a.a(this, longExtra6));
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 10:
                long longExtra7 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI3 = rd2.j.i(longExtra7, null);
                if (fVarI3 != null) {
                    long unitID = fVarI3.getUnitID();
                    String productNumber = fVarI3.getProductNumber();
                    String productDisplayName = fVarI3.getProductDisplayName();
                    String strD0 = fVarI3.d0();
                    String imageURL = fVarI3.getImageURL();
                    CannedTextResponsesActivity.f41931o.getClass();
                    startActivity(CannedTextResponsesActivity.a.a(this, unitID, productNumber, productDisplayName, strD0, imageURL));
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 11:
                long longExtra8 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI4 = rd2.j.i(longExtra8, null);
                if (fVarI4 != null) {
                    com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.APPS;
                    Intent intent3 = new Intent(this, (Class<?>) ConnectIQDownloadListActivity.class);
                    intent3.putExtra("CONNECT_IQ_CATEGORY", lVar);
                    intent3.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", fVarI4.getUnitID());
                    startActivity(intent3);
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 12:
                long longExtra9 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI5 = rd2.j.i(longExtra9, null);
                if (fVarI5 != null) {
                    com.garmin.android.apps.connectmobile.connectiq.l lVar2 = com.garmin.android.apps.connectmobile.connectiq.l.WIDGETS;
                    Intent intent4 = new Intent(this, (Class<?>) ConnectIQDownloadListActivity.class);
                    intent4.putExtra("CONNECT_IQ_CATEGORY", lVar2);
                    intent4.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", fVarI5.getUnitID());
                    startActivity(intent4);
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 13:
                long longExtra10 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI6 = rd2.j.i(longExtra10, null);
                if (fVarI6 != null) {
                    GCMWiFiNetworksActivity.f43245f.g(this, fVarI6.getUnitID(), fVarI6.getProductNumber(), fVarI6.getDisplayName(), fVarI6.getImageURL());
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 14:
                LiveTrackActivity.a aVar3 = LiveTrackActivity.f38637g;
                aVar3.getClass();
                aVar3.c(this, null);
                break;
            case 15:
                PrimaryDeviceActivity.f43662f.getClass();
                startActivity(PrimaryDeviceActivity.a.a(this, true, null));
                break;
            case 16:
                PrimaryDeviceActivity.f43662f.getClass();
                startActivity(PrimaryDeviceActivity.a.a(this, false, null));
                break;
            case 17:
                Bundle bundle = new Bundle();
                bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
                Intent intent5 = new Intent(this, (Class<?>) MoreActivity.class);
                intent5.putExtras(bundle);
                startActivity(intent5);
                break;
            case 18:
                long longExtra11 = intent.getLongExtra("GCM_deviceUnitID", -1L);
                if (longExtra11 != -1) {
                    DeviceBackupActivity.f42558c.getClass();
                    startActivity(DeviceBackupActivity.a.a(this, longExtra11));
                } else {
                    i2.i("GarminAppGateway", "Invalid DeviceId offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            case 19:
                JetLagActivity.f36950d.getClass();
                startActivity(JetLagActivity.a.a(this, false));
                break;
            case 20:
                SleepReportsActivity.a aVar4 = SleepReportsActivity.f44239b;
                en1.c cVar2 = en1.c.SCORE;
                aVar4.getClass();
                startActivity(SleepReportsActivity.a.a(this, dateTime, cVar2, false, null, null));
                break;
            case 21:
                startActivity(dh.b.z(TrainingReadinessActivity.class, this, dateTime, false));
                break;
            case 22:
                startActivity(dh.b.z(BodyBatteryReportsActivity.class, this, dateTime, false));
                break;
            case 23:
                SleepReportsActivity.a aVar5 = SleepReportsActivity.f44239b;
                en1.c cVar3 = en1.c.SCORE;
                aVar5.getClass();
                startActivity(SleepReportsActivity.a.a(this, dateTime, cVar3, true, null, null));
                break;
            case 24:
                TrainingStatusSummaryActivity.f40068w.getClass();
                TrainingStatusSummaryActivity.a.b(this, false);
                break;
            case 25:
                BadgesActivity.f30332j.getClass();
                startActivity(BadgesActivity.b.a(this, null, false));
                break;
            case 26:
                int intExtra2 = intent.getIntExtra("GCM_badgeID", -1);
                if (intExtra2 != -1) {
                    BadgeDetailsActivity.f30322l.getClass();
                    startActivity(BadgeDetailsActivity.a.a(intExtra2, this));
                } else {
                    i2.i("GarminAppGateway", "Invalid BadgeID offered to GarminAppGateway. Activity will finish()");
                    a();
                }
                break;
            default:
                i2.n("GarminAppGateway", "Fix me developer, I am not handling RequestType : " + intExtra);
                a();
                break;
        }
    }
}
