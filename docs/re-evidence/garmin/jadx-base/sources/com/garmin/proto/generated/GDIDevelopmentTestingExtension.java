package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDevelopmentTestingExtension {
    public static final int DEVELOPMENT_TESTING_SERVICE_FIELD_NUMBER = 65;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDevelopmentTesting.Service> developmentTestingService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDevelopmentTesting.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIDevelopmentTesting.Service.class, GDIDevelopmentTesting.Service.getDefaultInstance());
        developmentTestingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$GDIDevelopmentTestingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001bGDIDevelopmentTesting.proto:b\n\u001bdevelopment_testing_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018A \u0001(\u000b2%.GDI.Proto.DevelopmentTesting.ServiceB>\n\u001acom.garmin.proto.generatedB\u001eGDIDevelopmentTestingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIDevelopmentTesting.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIDevelopmentTesting.getDescriptor();
    }

    private GDIDevelopmentTestingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(developmentTestingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
