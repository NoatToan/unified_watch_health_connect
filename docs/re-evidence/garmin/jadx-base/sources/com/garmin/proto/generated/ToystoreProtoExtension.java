package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class ToystoreProtoExtension {
    public static final int TOYSTORE_SERVICE_FIELD_NUMBER = 44;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, ToystoreProto.ToystoreService> toystoreService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, ToystoreProto.ToystoreService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(ToystoreProto.ToystoreService.class, ToystoreProto.ToystoreService.getDefaultInstance());
        toystoreService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDIToystoreExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0011GDIToystore.proto:U\n\u0010toystore_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018, \u0001(\u000b2#.GDI.Proto.Toystore.ToystoreServiceB6\n\u001acom.garmin.proto.generatedB\u0016ToystoreProtoExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), ToystoreProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        ToystoreProto.getDescriptor();
    }

    private ToystoreProtoExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(toystoreService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
