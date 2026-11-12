package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISoftwareUpdateStatusExtension {
    public static final int SOFTWARE_UPDATE_STATUS_SERVICE_FIELD_NUMBER = 96;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISoftwareUpdateStatus.Service> softwareUpdateStatusService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISoftwareUpdateStatus.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISoftwareUpdateStatus.Service.class, GDISoftwareUpdateStatus.Service.getDefaultInstance());
        softwareUpdateStatusService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&GDISoftwareUpdateStatusExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001dGDISoftwareUpdateStatus.proto:g\n\u001esoftware_update_status_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018` \u0001(\u000b2'.GDI.Proto.SoftwareUpdateStatus.ServiceB@\n\u001acom.garmin.proto.generatedB GDISoftwareUpdateStatusExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISoftwareUpdateStatus.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISoftwareUpdateStatus.getDescriptor();
    }

    private GDISoftwareUpdateStatusExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(softwareUpdateStatusService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
