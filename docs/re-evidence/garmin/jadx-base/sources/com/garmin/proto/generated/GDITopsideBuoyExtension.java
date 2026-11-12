package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDITopsideBuoyExtension {
    public static final int TOPSIDE_BUOY_SERVICE_FIELD_NUMBER = 58;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDITopsideBuoyProto.Service> topsideBuoyService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDITopsideBuoyProto.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDITopsideBuoyProto.Service.class, GDITopsideBuoyProto.Service.getDefaultInstance());
        topsideBuoyService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDITopsideBuoyExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDITopsideBuoy.proto:T\n\u0014topside_buoy_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018: \u0001(\u000b2\u001e.GDI.Proto.TopsideBuoy.ServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDITopsideBuoyExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDITopsideBuoyProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDITopsideBuoyProto.getDescriptor();
    }

    private GDITopsideBuoyExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(topsideBuoyService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
