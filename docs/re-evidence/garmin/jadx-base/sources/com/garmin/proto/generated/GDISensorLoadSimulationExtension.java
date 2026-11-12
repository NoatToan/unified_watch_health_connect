package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDISensorLoadSimulationExtension {
    public static final int SENSOR_LOAD_SIMULATION_SERVICE_FIELD_NUMBER = 90;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISensorLoadSimulation.Service> sensorLoadSimulationService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISensorLoadSimulation.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISensorLoadSimulation.Service.class, GDISensorLoadSimulation.Service.getDefaultInstance());
        sensorLoadSimulationService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&GDISensorLoadSimulationExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001dGDISensorLoadSimulation.proto:g\n\u001esensor_load_simulation_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018Z \u0001(\u000b2'.GDI.Proto.SensorLoadSimulation.ServiceB@\n\u001acom.garmin.proto.generatedB GDISensorLoadSimulationExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISensorLoadSimulation.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISensorLoadSimulation.getDescriptor();
    }

    private GDISensorLoadSimulationExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(sensorLoadSimulationService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
