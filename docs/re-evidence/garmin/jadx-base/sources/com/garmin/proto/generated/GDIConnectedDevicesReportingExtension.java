package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIConnectedDevicesReportingExtension {
    public static final int CONNECTED_DEVICES_REPORTING_SERVICE_FIELD_NUMBER = 77;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectedDevicesReporting.Service> connectedDevicesReportingService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectedDevicesReporting.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIConnectedDevicesReporting.Service.class, GDIConnectedDevicesReporting.Service.getDefaultInstance());
        connectedDevicesReportingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n+GDIConnectedDevicesReportingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\"GDIConnectedDevicesReporting.proto:q\n#connected_devices_reporting_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018M \u0001(\u000b2,.GDI.Proto.ConnectedDevicesReporting.ServiceBE\n\u001acom.garmin.proto.generatedB%GDIConnectedDevicesReportingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIConnectedDevicesReporting.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIConnectedDevicesReporting.getDescriptor();
    }

    private GDIConnectedDevicesReportingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(connectedDevicesReportingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
