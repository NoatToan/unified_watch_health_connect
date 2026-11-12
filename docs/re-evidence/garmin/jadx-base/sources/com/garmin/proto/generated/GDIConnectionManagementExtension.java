package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIConnectionManagementExtension {
    public static final int CONNECTION_MANAGEMENT_SERVICE_FIELD_NUMBER = 67;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectionManagement.Service> connectionManagementService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectionManagement.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIConnectionManagement.Service.class, GDIConnectionManagement.Service.getDefaultInstance());
        connectionManagementService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&GDIConnectionManagementExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001dGDIConnectionManagement.proto:f\n\u001dconnection_management_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018C \u0001(\u000b2'.GDI.Proto.ConnectionManagement.ServiceB@\n\u001acom.garmin.proto.generatedB GDIConnectionManagementExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIConnectionManagement.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIConnectionManagement.getDescriptor();
    }

    private GDIConnectionManagementExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(connectionManagementService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
