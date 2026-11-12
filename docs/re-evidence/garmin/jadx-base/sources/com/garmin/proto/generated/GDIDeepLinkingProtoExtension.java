package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeepLinkingProtoExtension {
    public static final int DEEPLINKING_SERVICE_FIELD_NUMBER = 46;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeepLinkingProto.DeepLinkingService> deeplinkingService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeepLinkingProto.DeepLinkingService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIDeepLinkingProto.DeepLinkingService.class, GDIDeepLinkingProto.DeepLinkingService.getDefaultInstance());
        deeplinkingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIDeepLinkingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDIDeepLinking.proto:^\n\u0013deeplinking_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018. \u0001(\u000b2).GDI.Proto.DeepLinking.DeepLinkingServiceB<\n\u001acom.garmin.proto.generatedB\u001cGDIDeepLinkingProtoExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIDeepLinkingProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIDeepLinkingProto.getDescriptor();
    }

    private GDIDeepLinkingProtoExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(deeplinkingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
