package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISwingSensorExtension {
    public static final int SWING_SENSOR_SERVICE_FIELD_NUMBER = 6;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISwingSensor.SwingSensorService> swingSensorService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISwingSensor.SwingSensorService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISwingSensor.SwingSensorService.class, GDISwingSensor.SwingSensorService.getDefaultInstance());
        swingSensorService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDISwingSensorExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDISwingSensor.proto:_\n\u0014swing_sensor_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0006 \u0001(\u000b2).GDI.Proto.SwingSensor.SwingSensorServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDISwingSensorExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISwingSensor.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISwingSensor.getDescriptor();
    }

    private GDISwingSensorExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(swingSensorService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
