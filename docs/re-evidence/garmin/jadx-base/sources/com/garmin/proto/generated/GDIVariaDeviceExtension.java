package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIVariaDeviceExtension {
    public static final int VARIA_DEVICE_SERVICE_FIELD_NUMBER = 76;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIVariaDevice.Service> variaDeviceService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIVariaDevice.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIVariaDevice.Service.class, GDIVariaDevice.Service.getDefaultInstance());
        variaDeviceService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIVariaDeviceExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDIVariaDevice.proto:T\n\u0014varia_device_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018L \u0001(\u000b2\u001e.GDI.Proto.VariaDevice.ServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDIVariaDeviceExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIVariaDevice.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIVariaDevice.getDescriptor();
    }

    private GDIVariaDeviceExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(variaDeviceService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
