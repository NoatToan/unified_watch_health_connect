package ru2;

import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private a() {
    }

    public static GDISmartProto.Smart a(GDIDeviceStatus.DeviceStatusService.Builder builder) {
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDIDeviceStatusExtension.deviceStatusService, builder.build());
        return builderNewBuilder.build();
    }

    public static GDIDeviceStatus.DeviceStatusService b(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> generatedExtension = GDIDeviceStatusExtension.deviceStatusService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDIDeviceStatus.DeviceStatusService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }
}
