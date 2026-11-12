package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceStatusProtobufRequestManager {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager$1, reason: invalid class name */
    public class AnonymousClass1 implements wm2.b {
        final /* synthetic */ BatteryStatusResponseListener val$listener;
        final /* synthetic */ long val$remoteDeviceId;

        public AnonymousClass1(BatteryStatusResponseListener batteryStatusResponseListener, long j8) {
            this.val$listener = batteryStatusResponseListener;
            this.val$remoteDeviceId = j8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResponseFailed$1(BatteryStatusResponseListener batteryStatusResponseListener, long j8) {
            batteryStatusResponseListener.onBatteryStatusRequestFailed(j8, BatteryStatusResponseListener.ErrorStatus.PROTOBUF_REQUEST_FAILED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResponseReceived$0(GDISmartProto.Smart smart, BatteryStatusResponseListener batteryStatusResponseListener, long j8) {
            GDIDeviceStatus.DeviceStatusService deviceStatusService = ProtoUtil.getDeviceStatusService(smart);
            if (deviceStatusService == null) {
                batteryStatusResponseListener.onBatteryStatusRequestFailed(j8, BatteryStatusResponseListener.ErrorStatus.RESPONSE_MISSING_DATA);
                return;
            }
            int i14 = AnonymousClass2.$SwitchMap$com$garmin$proto$generated$GDIDeviceStatus$RemoteDeviceBatteryStatusResponse$ResponseStatus[deviceStatusService.getRemoteDeviceBatteryStatusResponse().getStatus().ordinal()];
            if (i14 == 1) {
                batteryStatusResponseListener.onBatteryStatusRetrieved(j8, deviceStatusService.getRemoteDeviceBatteryStatusResponse().getCurrentBatteryLevel());
            } else if (i14 == 2) {
                batteryStatusResponseListener.onBatteryStatusRequestFailed(j8, BatteryStatusResponseListener.ErrorStatus.NO_REMOTE_DEVICE);
            } else {
                if (i14 != 3) {
                    return;
                }
                batteryStatusResponseListener.onBatteryStatusRequestFailed(j8, BatteryStatusResponseListener.ErrorStatus.UNKNOWN_ERROR);
            }
        }

        @Override // wm2.b
        public void onResponseFailed(int i14) {
            if (this.val$listener != null) {
                Handler handler = new Handler(Looper.getMainLooper());
                final BatteryStatusResponseListener batteryStatusResponseListener = this.val$listener;
                final long j8 = this.val$remoteDeviceId;
                handler.post(new Runnable() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceStatusProtobufRequestManager.AnonymousClass1.lambda$onResponseFailed$1(batteryStatusResponseListener, j8);
                    }
                });
            }
        }

        @Override // wm2.b
        public void onResponseReceived(int i14, final GDISmartProto.Smart smart) {
            if (this.val$listener == null) {
                return;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final BatteryStatusResponseListener batteryStatusResponseListener = this.val$listener;
            final long j8 = this.val$remoteDeviceId;
            handler.post(new Runnable() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.c
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceStatusProtobufRequestManager.AnonymousClass1.lambda$onResponseReceived$0(smart, batteryStatusResponseListener, j8);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$proto$generated$GDIDeviceStatus$RemoteDeviceBatteryStatusResponse$ResponseStatus;

        static {
            int[] iArr = new int[GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.values().length];
            $SwitchMap$com$garmin$proto$generated$GDIDeviceStatus$RemoteDeviceBatteryStatusResponse$ResponseStatus = iArr;
            try {
                iArr[GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDIDeviceStatus$RemoteDeviceBatteryStatusResponse$ResponseStatus[GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.NO_REMOTE_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDIDeviceStatus$RemoteDeviceBatteryStatusResponse$ResponseStatus[GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.UNKNOWN_RESPONSE_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface BatteryStatusResponseListener {

        public enum ErrorStatus {
            UNKNOWN_ERROR,
            PROTOBUF_REQUEST_FAILED,
            RESPONSE_MISSING_DATA,
            NO_REMOTE_DEVICE
        }

        void onBatteryStatusRequestFailed(long j8, ErrorStatus errorStatus);

        void onBatteryStatusRetrieved(long j8, int i14);
    }

    public static void getBatteryStatus(Context context, long j8, BatteryStatusResponseListener batteryStatusResponseListener) {
        GDIDeviceStatus.RemoteDeviceBatteryStatusRequest.Builder builderNewBuilder = GDIDeviceStatus.RemoteDeviceBatteryStatusRequest.newBuilder();
        GDIDeviceStatus.DeviceStatusService.Builder builderNewBuilder2 = GDIDeviceStatus.DeviceStatusService.newBuilder();
        builderNewBuilder2.setRemoteDeviceBatteryStatusRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIDeviceStatusExtension.deviceStatusService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), j8, new AnonymousClass1(batteryStatusResponseListener, j8));
    }
}
