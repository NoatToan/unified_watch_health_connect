package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDICyclingTorsoSensorExtension {
    public static final int CYCLING_TORSO_SENSOR_SERVICE_FIELD_NUMBER = 81;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICyclingTorsoSensor.Service> cyclingTorsoSensorService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICyclingTorsoSensor.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDICyclingTorsoSensor.Service.class, GDICyclingTorsoSensor.Service.getDefaultInstance());
        cyclingTorsoSensorService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$GDICyclingTorsoSensorExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001bGDICyclingTorsoSensor.proto:c\n\u001ccycling_torso_sensor_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018Q \u0001(\u000b2%.GDI.Proto.CyclingTorsoSensor.ServiceB>\n\u001acom.garmin.proto.generatedB\u001eGDICyclingTorsoSensorExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDICyclingTorsoSensor.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDICyclingTorsoSensor.getDescriptor();
    }

    private GDICyclingTorsoSensorExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(cyclingTorsoSensorService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
