package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGarminLinkExtension {
    public static final int GARMIN_LINK_SERVICE_FIELD_NUMBER = 85;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGarminLink.Service> garminLinkService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGarminLink.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIGarminLink.Service.class, GDIGarminLink.Service.getDefaultInstance());
        garminLinkService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001cGDIGarminLinkExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0013GDIGarminLink.proto:R\n\u0013garmin_link_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018U \u0001(\u000b2\u001d.GDI.Proto.GarminLink.ServiceB6\n\u001acom.garmin.proto.generatedB\u0016GDIGarminLinkExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIGarminLink.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIGarminLink.getDescriptor();
    }

    private GDIGarminLinkExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(garminLinkService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
