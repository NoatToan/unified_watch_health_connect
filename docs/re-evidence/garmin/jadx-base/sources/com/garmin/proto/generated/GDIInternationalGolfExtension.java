package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInternationalGolfExtension {
    public static final int INTERNATIONAL_GOLF_SERVICE_FIELD_NUMBER = 5;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInternationalGolf.InternationalGolfService> internationalGolfService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInternationalGolf.InternationalGolfService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInternationalGolf.InternationalGolfService.class, GDIInternationalGolf.InternationalGolfService.getDefaultInstance());
        internationalGolfService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDIInternationalGolfExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDIInternationalGolf.proto:q\n\u001ainternational_golf_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0005 \u0001(\u000b25.GDI.Proto.InternationalGolf.InternationalGolfServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDIInternationalGolfExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInternationalGolf.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInternationalGolf.getDescriptor();
    }

    private GDIInternationalGolfExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(internationalGolfService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
