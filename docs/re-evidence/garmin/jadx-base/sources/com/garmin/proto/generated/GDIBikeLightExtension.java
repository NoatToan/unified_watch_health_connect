package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes11.dex */
public final class GDIBikeLightExtension {
    public static final int BIKE_LIGHT_SERVICE_FIELD_NUMBER = 78;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIBikeLight.Service> bikeLightService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIBikeLight.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIBikeLight.Service.class, GDIBikeLight.Service.getDefaultInstance());
        bikeLightService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDIBikeLightExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0012GDIBikeLight.proto:P\n\u0012bike_light_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018N \u0001(\u000b2\u001c.GDI.Proto.BikeLight.ServiceB5\n\u001acom.garmin.proto.generatedB\u0015GDIBikeLightExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIBikeLight.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIBikeLight.getDescriptor();
    }

    private GDIBikeLightExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(bikeLightService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
