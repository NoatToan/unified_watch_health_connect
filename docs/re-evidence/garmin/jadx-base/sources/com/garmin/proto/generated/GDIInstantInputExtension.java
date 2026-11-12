package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInstantInputExtension {
    public static final int INSTANT_INPUT_SERVICE_FIELD_NUMBER = 18;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInstantInput.InstantInputService> instantInputService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInstantInput.InstantInputService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInstantInput.InstantInputService.class, GDIInstantInput.InstantInputService.getDefaultInstance());
        instantInputService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIInstantInputExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIInstantInput.proto:b\n\u0015instant_input_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0012 \u0001(\u000b2+.GDI.Proto.InstantInput.InstantInputServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIInstantInputExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInstantInput.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInstantInput.getDescriptor();
    }

    private GDIInstantInputExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(instantInputService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
