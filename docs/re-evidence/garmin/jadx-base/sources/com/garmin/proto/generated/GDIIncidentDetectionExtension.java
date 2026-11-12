package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIIncidentDetectionExtension {
    public static final int INCIDENT_DETECTION_SERVICE_FIELD_NUMBER = 9;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIIncidentDetectionProto.IncidentDetectionService> incidentDetectionService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIIncidentDetectionProto.IncidentDetectionService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIIncidentDetectionProto.IncidentDetectionService.class, GDIIncidentDetectionProto.IncidentDetectionService.getDefaultInstance());
        incidentDetectionService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDIIncidentDetectionExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDIIncidentDetection.proto:q\n\u001aincident_detection_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\t \u0001(\u000b25.GDI.Proto.IncidentDetection.IncidentDetectionServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDIIncidentDetectionExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIIncidentDetectionProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIIncidentDetectionProto.getDescriptor();
    }

    private GDIIncidentDetectionExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(incidentDetectionService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
