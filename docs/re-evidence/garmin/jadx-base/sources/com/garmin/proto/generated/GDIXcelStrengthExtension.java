package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXcelStrengthExtension {
    public static final int XCEL_STRENGTH_SERVICE_FIELD_NUMBER = 83;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXcelStrength.Service> xcelStrengthService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXcelStrength.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIXcelStrength.Service.class, GDIXcelStrength.Service.getDefaultInstance());
        xcelStrengthService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIXcelStrengthExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIXcelStrength.proto:V\n\u0015xcel_strength_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018S \u0001(\u000b2\u001f.GDI.Proto.XcelStrength.ServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIXcelStrengthExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIXcelStrength.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIXcelStrength.getDescriptor();
    }

    private GDIXcelStrengthExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(xcelStrengthService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
