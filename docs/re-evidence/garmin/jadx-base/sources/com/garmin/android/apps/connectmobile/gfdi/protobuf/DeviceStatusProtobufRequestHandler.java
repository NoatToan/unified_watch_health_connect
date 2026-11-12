package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import hk0.p;
import org.koin.java.KoinJavaComponent;
import wl0.h;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceStatusProtobufRequestHandler extends ProtobufRequestHandler {
    private static final String sTAG = "DeviceStatusProtobufRequestHandler";

    public DeviceStatusProtobufRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
    }

    private void handleBatteryStatusChangedNotification() {
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        DeviceStatusProtobufRequestManager.getBatteryStatus(context, this.deviceId, new DeviceStatusProtobufRequestManager.BatteryStatusResponseListener() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestHandler.1
            @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager.BatteryStatusResponseListener
            public void onBatteryStatusRequestFailed(long j8, DeviceStatusProtobufRequestManager.BatteryStatusResponseListener.ErrorStatus errorStatus) {
            }

            @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager.BatteryStatusResponseListener
            public void onBatteryStatusRetrieved(long j8, int i14) {
                h.i().s(i14);
                if (((cl0.b) KoinJavaComponent.get(cl0.b.class)).v()) {
                    for (DeviceProfile deviceProfile : p.d()) {
                        Configuration configuration = deviceProfile.getConfiguration();
                        if (configuration != null) {
                            if (l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                                DeviceStatusProtobufRequestHandler.this.sendBatteryStatusChangedNotification(deviceProfile.getF92746j());
                            }
                        }
                    }
                }
            }
        });
    }

    private void handleBatteryStatusRequest() {
        if (this.contextRef.get() == null) {
            return;
        }
        if (!h.o()) {
            sendBatteryStatusResponse(0, GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.NO_REMOTE_DEVICE);
        } else if (h.i().f185932j == -1) {
            sendBatteryStatusResponse(0, GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS);
        } else {
            sendBatteryStatusResponse(h.i().f185932j, GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.OK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBatteryStatusChangedNotification(long j8) {
        i2.d(sTAG, "Sending battery status changed notification to device: " + j8);
        GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotification.Builder builderNewBuilder = GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotification.newBuilder();
        GDIDeviceStatus.DeviceStatusService.Builder builderNewBuilder2 = GDIDeviceStatus.DeviceStatusService.newBuilder();
        builderNewBuilder2.setRemoteDeviceBatteryStatusChangedNotification(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIDeviceStatusExtension.deviceStatusService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), j8, (wm2.b) null);
    }

    private void sendBatteryStatusResponse(int i14, GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus responseStatus) {
        i2.d(sTAG, "sending response to battery status request with status: " + responseStatus.name() + ", batteryLevel: " + i14);
        GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.Builder builderNewBuilder = GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.newBuilder();
        builderNewBuilder.setStatus(responseStatus);
        if (responseStatus == GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.OK) {
            builderNewBuilder.setCurrentBatteryLevel(i14);
        }
        GDIDeviceStatus.DeviceStatusService.Builder builderNewBuilder2 = GDIDeviceStatus.DeviceStatusService.newBuilder();
        builderNewBuilder2.setRemoteDeviceBatteryStatusResponse(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIDeviceStatusExtension.deviceStatusService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, builderNewBuilder3.build());
    }

    @Override // java.lang.Runnable
    public void run() {
        GDIDeviceStatus.DeviceStatusService deviceStatusService = ProtoUtil.getDeviceStatusService(this.requestMsg);
        if (deviceStatusService == null) {
            return;
        }
        if (deviceStatusService.hasRemoteDeviceBatteryStatusChangedNotification()) {
            handleBatteryStatusChangedNotification();
        } else if (deviceStatusService.hasRemoteDeviceBatteryStatusRequest()) {
            handleBatteryStatusRequest();
        }
    }
}
