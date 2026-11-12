package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIHandCalibrationExtension {
    public static final int HAND_CALIBRATION_SERVICE_FIELD_NUMBER = 33;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIHandCalibration.HandCalibrationService> handCalibrationService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIHandCalibration.HandCalibrationService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIHandCalibration.HandCalibrationService.class, GDIHandCalibration.HandCalibrationService.getDefaultInstance());
        handCalibrationService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIHandCalibrationExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDIHandCalibration.proto:k\n\u0018hand_calibration_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018! \u0001(\u000b21.GDI.Proto.HandCalibration.HandCalibrationServiceB;\n\u001acom.garmin.proto.generatedB\u001bGDIHandCalibrationExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIHandCalibration.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIHandCalibration.getDescriptor();
    }

    private GDIHandCalibrationExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(handCalibrationService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
