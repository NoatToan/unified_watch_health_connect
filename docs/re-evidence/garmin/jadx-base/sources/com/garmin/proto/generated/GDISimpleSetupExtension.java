package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDISimpleSetupExtension {
    public static final int SIMPLE_SETUP_SERVICE_FIELD_NUMBER = 36;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISimpleSetup.SimpleSetupService> simpleSetupService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISimpleSetup.SimpleSetupService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISimpleSetup.SimpleSetupService.class, GDISimpleSetup.SimpleSetupService.getDefaultInstance());
        simpleSetupService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDISimpleSetupExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDISimpleSetup.proto:_\n\u0014simple_setup_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018$ \u0001(\u000b2).GDI.Proto.SimpleSetup.SimpleSetupServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDISimpleSetupExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISimpleSetup.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISimpleSetup.getDescriptor();
    }

    private GDISimpleSetupExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(simpleSetupService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
