package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachConfigurationExtension {
    public static final int INREACH_CONFIGURATION_SERVICE_FIELD_NUMBER = 50;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachConfiguration.Service> inreachConfigurationService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachConfiguration.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachConfiguration.Service.class, GDIInReachConfiguration.Service.getDefaultInstance());
        inreachConfigurationService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&GDIInReachConfigurationExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001dGDIInReachConfiguration.proto:f\n\u001dinreach_configuration_service\u0012\u0016.GDI.Proto.Smart.Smart\u00182 \u0001(\u000b2'.GDI.Proto.InReachConfiguration.ServiceB@\n\u001acom.garmin.proto.generatedB GDIInReachConfigurationExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachConfiguration.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachConfiguration.getDescriptor();
    }

    private GDIInReachConfigurationExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachConfigurationService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
