package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeviceControlReportingExtension {
    public static final int DEVICE_CONTROL_REPORTING_SERVICE_FIELD_NUMBER = 84;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceControlReporting.Service> deviceControlReportingService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceControlReporting.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIDeviceControlReporting.Service.class, GDIDeviceControlReporting.Service.getDefaultInstance());
        deviceControlReportingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n(GDIDeviceControlReportingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001fGDIDeviceControlReporting.proto:k\n device_control_reporting_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018T \u0001(\u000b2).GDI.Proto.DeviceControlReporting.ServiceBB\n\u001acom.garmin.proto.generatedB\"GDIDeviceControlReportingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIDeviceControlReporting.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIDeviceControlReporting.getDescriptor();
    }

    private GDIDeviceControlReportingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(deviceControlReportingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
