package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRemoteDeviceManagementExtension {
    public static final int REMOTE_DEVICE_MANAGEMENT_SERVICE_FIELD_NUMBER = 75;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRemoteDeviceManagement.Service> remoteDeviceManagementService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRemoteDeviceManagement.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIRemoteDeviceManagement.Service.class, GDIRemoteDeviceManagement.Service.getDefaultInstance());
        remoteDeviceManagementService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n(GDIRemoteDeviceManagementExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001fGDIRemoteDeviceManagement.proto:k\n remote_device_management_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018K \u0001(\u000b2).GDI.Proto.RemoteDeviceManagement.ServiceBB\n\u001acom.garmin.proto.generatedB\"GDIRemoteDeviceManagementExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIRemoteDeviceManagement.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIRemoteDeviceManagement.getDescriptor();
    }

    private GDIRemoteDeviceManagementExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(remoteDeviceManagementService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
