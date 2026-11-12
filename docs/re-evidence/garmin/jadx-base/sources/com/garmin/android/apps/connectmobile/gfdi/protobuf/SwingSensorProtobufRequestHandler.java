package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import c22.t3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISwingSensor;
import com.garmin.proto.generated.GDISwingSensorClubs;
import com.garmin.proto.generated.GDISwingSensorExtension;
import com.garmin.proto.generated.GDISwingSensorUserSettings;
import cw.q;
import hk0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import wl0.h;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class SwingSensorProtobufRequestHandler extends ProtobufRequestHandler {
    private com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b mGetUserSettingsListener;
    private final String mMacAddress;
    private com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b mSaveUserSettingsListener;
    private UserSettingsDTO mUserSettingsDTO;
    private JSONObject mUserSettingsJsonCopy;

    public SwingSensorProtobufRequestHandler(Context context, long j8, String str, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        this.mMacAddress = str;
    }

    private void handleClubListChangedNotification() {
        Context context = this.contextRef.get();
        if (context == null) {
            i2.i("TruSwing", "Context is null in handleClubListChangedNotification");
        } else {
            SwingSensorProtobufRequestManager.getGolfClubList(context, this.deviceId, new wl0.e() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestHandler.3
                @Override // wl0.e
                public void onClubListRequestFailed(long j8, wl0.e.a aVar) {
                    h.i().g();
                    i2.d("TruSwing", "Failed to retrieve club list from swing sensor");
                }

                @Override // wl0.e
                public void onClubListRetrieved(long j8, List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list, long j14) {
                    h.i().r(list);
                    h.i().q(j14);
                    for (DeviceProfile deviceProfile : p.d()) {
                        Configuration configuration = deviceProfile.getConfiguration();
                        if (configuration != null) {
                            if (l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                                ProtobufRequestManager.getInstance().initiateRequest(SwingSensorProtobufRequestHandler.this.requestMsg, deviceProfile.getF92746j(), (wm2.b) null);
                                i2.d("TruSwing", "Sending " + list.size() + " clubs to: " + deviceProfile.getF92746j());
                            }
                        }
                    }
                }
            });
        }
    }

    private void handleGetClubListRequest() {
        Context context = this.contextRef.get();
        if (context == null) {
            i2.d("TruSwing", "Context is null in handleGetClubListRequest");
            return;
        }
        if (!h.o()) {
            GDISwingSensorClubs.GetClubListResponse.Builder builderNewBuilder = GDISwingSensorClubs.GetClubListResponse.newBuilder();
            builderNewBuilder.setStatus(GDISwingSensorClubs.GetClubListResponse.ResponseStatus.NO_REMOTE_DEVICE);
            GDISwingSensor.SwingSensorService.Builder builderNewBuilder2 = GDISwingSensor.SwingSensorService.newBuilder();
            builderNewBuilder2.setGetClubListResponse(builderNewBuilder);
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder2.build());
            ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, builderNewBuilder3.build());
            i2.d("TruSwing", "Unable to handle getClubListRequest because there is no swing sensor connected");
            return;
        }
        final ArrayList<com.garmin.android.apps.connectmobile.golf.truswing.model.a> arrayList = new ArrayList();
        if (h.i().h(true) == null) {
            SwingSensorProtobufRequestManager.getGolfClubList(context, this.deviceId, new wl0.e() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestHandler.1
                @Override // wl0.e
                public void onClubListRequestFailed(long j8, wl0.e.a aVar) {
                    GDISwingSensorClubs.GetClubListResponse.Builder builderNewBuilder4 = GDISwingSensorClubs.GetClubListResponse.newBuilder();
                    builderNewBuilder4.setStatus(GDISwingSensorClubs.GetClubListResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS);
                    GDISwingSensor.SwingSensorService.Builder builderNewBuilder5 = GDISwingSensor.SwingSensorService.newBuilder();
                    builderNewBuilder5.setGetClubListResponse(builderNewBuilder4);
                    GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder6.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder5.build());
                    ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
                    SwingSensorProtobufRequestHandler swingSensorProtobufRequestHandler = SwingSensorProtobufRequestHandler.this;
                    protobufRequestManager.respondToRequest(swingSensorProtobufRequestHandler.requestId, swingSensorProtobufRequestHandler.deviceId, builderNewBuilder6.build());
                    i2.d("TruSwing", "Failed to retrieve club list from swing sensor");
                }

                @Override // wl0.e
                public void onClubListRetrieved(long j8, List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list, long j14) {
                    h.i().r(arrayList);
                    h.i().q(j14);
                    arrayList.addAll(list);
                    i2.d("TruSwing", "Retrieved " + list.size() + " clubs from the swing sensor");
                }
            });
            return;
        }
        arrayList.addAll(h.i().h(true));
        i2.d("TruSwing", "Using cached club list from remote sensor");
        GDISwingSensorClubs.GetClubListResponse.Builder builderNewBuilder4 = GDISwingSensorClubs.GetClubListResponse.newBuilder();
        builderNewBuilder4.setActiveClubId(h.i().f185931i);
        for (com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar : arrayList) {
            GDISwingSensorClubs.Club.Builder builderNewBuilder5 = GDISwingSensorClubs.Club.newBuilder();
            builderNewBuilder5.setTimestamp(aVar.f35889a);
            builderNewBuilder5.setClubId(aVar.f35890b);
            builderNewBuilder5.setClubType(aVar.f35891c.f20622a);
            builderNewBuilder5.setClubNickname(aVar.a());
            builderNewBuilder5.setShaftFlex(aVar.f35893e.f20440a);
            builderNewBuilder5.setLengthOffset(aVar.f35894f);
            builderNewBuilder5.setClubLoft(aVar.f35895g);
            builderNewBuilder5.setClubLie(aVar.f35896h);
            builderNewBuilder4.addClubs(builderNewBuilder5);
        }
        builderNewBuilder4.setStatus(GDISwingSensorClubs.GetClubListResponse.ResponseStatus.OK);
        GDISwingSensor.SwingSensorService.Builder builderNewBuilder6 = GDISwingSensor.SwingSensorService.newBuilder();
        builderNewBuilder6.setGetClubListResponse(builderNewBuilder4);
        GDISmartProto.Smart.Builder builderNewBuilder7 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder7.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder6.build());
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, builderNewBuilder7.build());
        i2.d("TruSwing", "Responded to getClubListRequest with " + arrayList.size() + " clubs.");
    }

    private void handleNewSwingNotification(GDISwingSensor.SwingSensorService swingSensorService) {
        int id3 = swingSensorService.getNewSwingNotification().getId();
        int size = swingSensorService.getNewSwingNotification().getSize();
        i2.d("TruSwing", "Received new swing notification.  Id: " + id3 + ", Size: " + size);
        Context context = this.contextRef.get();
        if (context == null) {
            i2.i("TruSwing", "Failed to initiate data request for device: " + this.deviceId);
            return;
        }
        zj2.e eVar = (zj2.e) da2.d.c(context).getCapability(this.mMacAddress, zj2.e.class);
        long j8 = this.deviceId;
        if (eVar == null) {
            i2.i("TruSwing", "Failed to initiate data request for device: " + j8);
        } else {
            DataTransferCompat.receive(j8, eVar, id3, size, h.i().f185927e);
            i2.d("TruSwing", "Data request initiated successfully for device: " + this.deviceId);
        }
    }

    private void handleSetActiveClubRequest(GDISwingSensor.SwingSensorService swingSensorService) {
        final Context context = this.contextRef.get();
        if (context == null) {
            i2.i("TruSwing", "Context is null in handleSetActiveClubRequest");
            return;
        }
        final long clubId = swingSensorService.getSetActiveClubRequest().getClubId();
        ArrayList arrayListH = h.i().h(true);
        if (arrayListH == null) {
            respondToSetActiveClubRequest(context, GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.INVALID_CLUB_ID);
            i2.i("TruSwing", "We do not have a club list to ensure the selected club is valid");
            return;
        }
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            if (((com.garmin.android.apps.connectmobile.golf.truswing.model.a) it.next()).f35890b == clubId) {
                if (!h.o()) {
                    respondToSetActiveClubRequest(context, GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.NO_REMOTE_DEVICE);
                    i2.i("TruSwing", "Unable to set active club.  No swing sensor connected");
                    return;
                }
                for (DeviceProfile deviceProfile : p.d()) {
                    Configuration configuration = deviceProfile.getConfiguration();
                    if (configuration != null) {
                        if (l2.q(SupportedCapability.SWING_SENSOR, configuration.getCapabilityFlagsAsSet())) {
                            ProtobufRequestManager.getInstance().initiateRequest(this.requestMsg, deviceProfile.getF92746j(), new wm2.b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestHandler.2
                                @Override // wm2.b
                                public void onResponseFailed(int i14) {
                                    SwingSensorProtobufRequestHandler.this.respondToSetActiveClubRequest(context, GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.NO_REMOTE_DEVICE);
                                    i2.d("TruSwing", "Failed to set active club on swing sensor");
                                }

                                @Override // wm2.b
                                public void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                                    SwingSensorProtobufRequestHandler.this.respondToSetActiveClubRequest(context, GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.OK);
                                    h.i().q(clubId);
                                    i2.d("TruSwing", "Sent active club to swing sensor");
                                }
                            });
                        }
                    }
                }
                return;
            }
        }
        respondToSetActiveClubRequest(context, GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.INVALID_CLUB_ID);
        i2.d("TruSwing", "Did not find matching club in handleSetActiveClubRequest");
    }

    private void handleSetUserSettingsRequest(GDISwingSensor.SwingSensorService swingSensorService) {
        i2.d("TruSwing", "Received new user settings from sensor");
        final GDISwingSensorUserSettings.UserSettings userSettings = swingSensorService.getSetUserSettingsRequest().getUserSettings();
        if (GDISwingSensorUserSettings.UserSettings.Gender.UNKNOWN_GENDER.equals(userSettings.getGender()) || GDISwingSensorUserSettings.UserSettings.Handedness.UNKNOWN_HANDEDNESS.equals(userSettings.getHandedness())) {
            this.mSaveUserSettingsListener = new com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestHandler.4
                @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
                public void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
                    if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                        i2.d("TruSwing", "Success saving user settings to GC: " + SwingSensorProtobufRequestHandler.this.mUserSettingsDTO.t1().toString() + " .");
                        return;
                    }
                    i2.i("TruSwing", "Error saving user settings to GC [" + cVar.name() + "].");
                }

                @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
                public void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
                }
            };
            this.mGetUserSettingsListener = new com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestHandler.5
                @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
                public void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
                    if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS || SwingSensorProtobufRequestHandler.this.mUserSettingsDTO == null) {
                        i2.i("TruSwing", "Error fetching user settings from GC [" + cVar.name() + "].");
                        return;
                    }
                    if (!GDISwingSensorUserSettings.UserSettings.Gender.UNKNOWN_GENDER.equals(userSettings.getGender())) {
                        SwingSensorProtobufRequestHandler.this.mUserSettingsDTO.P0(GDISwingSensorUserSettings.UserSettings.Gender.MALE.equals(userSettings.getGender()) ? UserSettingsDTO.c.MALE : UserSettingsDTO.c.FEMALE);
                    }
                    if (!GDISwingSensorUserSettings.UserSettings.Handedness.UNKNOWN_HANDEDNESS.equals(userSettings.getHandedness())) {
                        SwingSensorProtobufRequestHandler.this.mUserSettingsDTO.R0(GDISwingSensorUserSettings.UserSettings.Handedness.LEFT_HANDED.equals(userSettings.getHandedness()) ? UserSettingsDTO.d.LEFT : UserSettingsDTO.d.RIGHT);
                    }
                    if (SwingSensorProtobufRequestHandler.this.mUserSettingsDTO != null) {
                        JSONObject jSONObjectB = t3.b(SwingSensorProtobufRequestHandler.this.mUserSettingsDTO.t1(), SwingSensorProtobufRequestHandler.this.mUserSettingsJsonCopy);
                        i2.d("TruSwing", "User Settings JSON delta = " + jSONObjectB);
                        if (jSONObjectB != null) {
                            q.N().O(SwingSensorProtobufRequestHandler.this.mUserSettingsDTO, jSONObjectB, SwingSensorProtobufRequestHandler.this.mSaveUserSettingsListener);
                        }
                    }
                }

                @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
                public void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
                    SwingSensorProtobufRequestHandler.this.mUserSettingsDTO = (UserSettingsDTO) obj;
                    SwingSensorProtobufRequestHandler swingSensorProtobufRequestHandler = SwingSensorProtobufRequestHandler.this;
                    swingSensorProtobufRequestHandler.mUserSettingsJsonCopy = swingSensorProtobufRequestHandler.mUserSettingsDTO.t1();
                }
            };
            q.N().M(this.mGetUserSettingsListener);
            for (DeviceProfile deviceProfile : p.d()) {
                Configuration configuration = deviceProfile.getConfiguration();
                if (configuration != null) {
                    if (l2.q(SupportedCapability.SWING_SENSOR, configuration.getCapabilityFlagsAsSet()) && this.deviceId != deviceProfile.getF92746j()) {
                        ProtobufRequestManager.getInstance().initiateRequest(this.requestMsg, deviceProfile.getF92746j(), new wm2.b(this) { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestHandler.6
                            @Override // wm2.b
                            public void onResponseFailed(int i14) {
                                i2.d("TruSwing", "Failed to set user settings on swing sensor");
                            }

                            @Override // wm2.b
                            public void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                                i2.d("TruSwing", "Sent user settings to swing sensor");
                            }
                        });
                    }
                }
            }
        }
    }

    private void handleSwingMetricsNotification(GDISwingSensor.SwingSensorService swingSensorService) {
        if (this.contextRef.get() == null) {
            i2.i("TruSwing", "Context is null in handleSwingMetricsNotification");
            return;
        }
        if (!swingSensorService.getSwingMetricsNotification().getSwingMetrics().getImpactWasMade()) {
            ol0.c cVar = new ol0.c();
            oi2.a.f132270a.getClass();
            l73.c.b().e(cVar);
        }
        h hVar = h.f185925k;
        if (!((cl0.b) KoinJavaComponent.get(cl0.b.class)).v()) {
            i2.d("TruSwing", "Not forwarding metrics because there are not remote sensors connected.");
            return;
        }
        for (DeviceProfile deviceProfile : p.d()) {
            Configuration configuration = deviceProfile.getConfiguration();
            if (configuration != null) {
                if (l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                    i2.d("TruSwing", "Forwarding metrics data to remote device: " + deviceProfile.getF92746j());
                    ProtobufRequestManager.getInstance().initiateRequest(this.requestMsg, deviceProfile.getF92746j(), (wm2.b) null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void respondToSetActiveClubRequest(Context context, GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus responseStatus) {
        GDISwingSensorClubs.SetActiveClubResponse.Builder builderNewBuilder = GDISwingSensorClubs.SetActiveClubResponse.newBuilder();
        builderNewBuilder.setStatus(responseStatus);
        GDISwingSensor.SwingSensorService.Builder builderNewBuilder2 = GDISwingSensor.SwingSensorService.newBuilder();
        builderNewBuilder2.setSetActiveClubResponse(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, builderNewBuilder3.build());
        i2.d("TruSwing", "Sent setActiveClubRequest response to: " + this.deviceId);
    }

    @Override // java.lang.Runnable
    public void run() {
        GDISwingSensor.SwingSensorService swingSensorService = ProtoUtil.getSwingSensorService(this.requestMsg);
        if (swingSensorService == null) {
            return;
        }
        if (swingSensorService.hasNewSwingNotification()) {
            handleNewSwingNotification(swingSensorService);
            return;
        }
        if (swingSensorService.hasSwingMetricsNotification()) {
            handleSwingMetricsNotification(swingSensorService);
            return;
        }
        if (swingSensorService.hasGetClubListRequest()) {
            handleGetClubListRequest();
            return;
        }
        if (swingSensorService.hasSetActiveClubRequest()) {
            handleSetActiveClubRequest(swingSensorService);
        } else if (swingSensorService.hasClubListChangedNotification()) {
            handleClubListChangedNotification();
        } else if (swingSensorService.hasSetUserSettingsRequest()) {
            handleSetUserSettingsRequest(swingSensorService);
        }
    }
}
