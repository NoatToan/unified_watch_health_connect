package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import c22.u1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftAlarmProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIAntiTheftAlarmExtension;
import com.garmin.proto.generated.GDIConnectIQAppSettingsExtension;
import com.garmin.proto.generated.GDIConnectIQHTTPExtension;
import com.garmin.proto.generated.GDIConnectIQInstalledAppsExtension;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDICredentialsExtension;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDIGroupLiveTrackExtension;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIInstantInputExtension;
import com.garmin.proto.generated.GDIInternationalGolfExtension;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackMessagingExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISimpleSetupExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISmsNotificationExtension;
import com.garmin.proto.generated.GDISportProfileSetupExtension;
import com.garmin.proto.generated.GDISwingSensorExtension;
import com.garmin.proto.generated.GDIWaypointTransferExtension;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import di1.t;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class ProtobufRequestManager extends wm2.a {
    private static ProtobufRequestManager sInstance = null;
    private static final String sTAG = "ProtobufRequestManager";

    private ProtobufRequestManager(Context context) {
        super(context, new c50.a(28));
    }

    public static ProtobufRequestManager getInstance() {
        if (sInstance == null) {
            sInstance = new ProtobufRequestManager(GarminConnectMobileApp.f28687i);
        }
        return sInstance;
    }

    @Override // wm2.a
    public String getMacAddressPreferBLE(long j8) {
        return u1.a(j8);
    }

    @Override // wm2.a
    public String getMacAddressPreferBTC(long j8) {
        return u1.b(j8);
    }

    @Override // wm2.a
    public boolean handleRequestMessage(Context context, long j8, String str, int i14, GDISmartProto.Smart smart) {
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService)) {
            com.google.protobuf.a.m();
            return false;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIConnectIQAppSettingsExtension.connectIqAppSettingsService)) {
            new Thread(new ConnectIQAppSettingsRequestHandler(context, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIDeviceStatusExtension.deviceStatusService)) {
            new Thread(new DeviceStatusProtobufRequestHandler(context, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIGroupLiveTrackExtension.groupLiveTrackService)) {
            new Thread(new GrouptrackProtobufRequestHandler(context, j8, str, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIIncidentDetectionExtension.incidentDetectionService)) {
            new Thread(new hq0.a(context, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIInternationalGolfExtension.internationalGolfService)) {
            new Thread(new InternationalGolfProtobufRequestHandler(context, j8, str, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDILTEExtension.lteService)) {
            new Thread(new LTEProtobufRequestHandler(context, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDILiveTrackMessagingExtension.liveTrackMessagingService)) {
            new Thread(new LiveTrackMessagingProtobufRequestHandler(context, j8, i14, str, smart)).start();
            return true;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveTrackProto.LiveTrackService> generatedExtension = GDILiveTrackExtension.liveTrackService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            GDILiveTrackProto.LiveTrackService liveTrackService = (GDILiveTrackProto.LiveTrackService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            if (liveTrackService.hasConsentNotification() && liveTrackService.getConsentNotification().hasPromptGroupRideConsent()) {
                new Thread(new GroupRideEnableProtobufRequestHandler(context, j8, smart, i14)).start();
                return true;
            }
            if (liveTrackService.hasGroupRideNotification()) {
                new Thread(new GroupRideShareProtobufRequestHandler(context, j8, smart, i14)).start();
                return true;
            }
            new Thread(new LiveTrackServiceProtobufRequestHandler(context, str, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDISwingSensorExtension.swingSensorService)) {
            new Thread(new SwingSensorProtobufRequestHandler(context, j8, str, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDICoreExtension.coreService)) {
            new Thread(new CoreProtobufRequestHandler(context, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIWaypointTransferExtension.wayPointTransferService)) {
            new Thread(new WaypointTransferProtobufRequestHandler(context, j8, i14, smart)).start();
            return true;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetup.WifiSetupService> generatedExtension2 = GDIWifiSetupExtension.wifiSetupService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension2)) {
            GDIWifiSetup.WifiSetupService wifiSetupService = (GDIWifiSetup.WifiSetupService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension2);
            if (wifiSetupService.hasOauthCredentialsRequest() || wifiSetupService.hasOauthCredentialsRequestWithAgentMsg()) {
                new Thread(new t(context, j8, i14, smart)).start();
                return true;
            }
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIInstantInputExtension.instantInputService)) {
            new Thread(new com.garmin.android.apps.connectmobile.instantinput.a(context, j8, i14, smart)).start();
            return true;
        }
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIAntiTheftAlarmExtension.antiTheftAlarmService)) {
            new Thread(new AntiTheftAlarmProtobufRequestHandler(context, j8, i14, smart)).start();
            return true;
        }
        i2.i(sTAG, "Received invalid protocol buffer request.");
        return false;
    }

    @Override // wm2.a, dt2.a
    public void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(GDIAntiTheftAlarmExtension.antiTheftAlarmService);
        extensionRegistryLite.add(GDIConnectIQAppSettingsExtension.connectIqAppSettingsService);
        extensionRegistryLite.add(GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService);
        extensionRegistryLite.add(GDIConnectIQHTTPExtension.connectIqHttpService);
        extensionRegistryLite.add(GDICoreExtension.coreService);
        extensionRegistryLite.add(GDICredentialsExtension.credentialsService);
        extensionRegistryLite.add(GDIDeviceStatusExtension.deviceStatusService);
        extensionRegistryLite.add(GDIGroupLiveTrackExtension.groupLiveTrackService);
        extensionRegistryLite.add(GDIIncidentDetectionExtension.incidentDetectionService);
        extensionRegistryLite.add(GDIInstantInputExtension.instantInputService);
        extensionRegistryLite.add(GDIInternationalGolfExtension.internationalGolfService);
        extensionRegistryLite.add(GDILiveTrackExtension.liveTrackService);
        extensionRegistryLite.add(GDILiveTrackMessagingExtension.liveTrackMessagingService);
        extensionRegistryLite.add(GDILTEExtension.lteService);
        extensionRegistryLite.add(GDISimpleSetupExtension.simpleSetupService);
        extensionRegistryLite.add(GDISmsNotificationExtension.smsNotificationService);
        extensionRegistryLite.add(GDISportProfileSetupExtension.sportProfileSetupService);
        extensionRegistryLite.add(GDISwingSensorExtension.swingSensorService);
        extensionRegistryLite.add(GDIWaypointTransferExtension.wayPointTransferService);
        extensionRegistryLite.add(GDIWifiSetupExtension.wifiSetupService);
        super.start(cVar, gVar, extensionRegistryLite);
    }
}
