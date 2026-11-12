package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeviceStatusExtension {
    public static final int DEVICE_STATUS_SERVICE_FIELD_NUMBER = 8;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> deviceStatusService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIDeviceStatus.DeviceStatusService.class, GDIDeviceStatus.DeviceStatusService.getDefaultInstance());
        deviceStatusService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIDeviceStatusExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIDeviceStatus.proto:b\n\u0015device_status_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\b \u0001(\u000b2+.GDI.Proto.DeviceStatus.DeviceStatusServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIDeviceStatusExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIDeviceStatus.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIDeviceStatus.getDescriptor();
    }

    private GDIDeviceStatusExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(deviceStatusService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
