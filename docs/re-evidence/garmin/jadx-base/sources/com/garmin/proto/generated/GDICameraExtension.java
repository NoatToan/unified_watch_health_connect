package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes11.dex */
public final class GDICameraExtension {
    public static final int CAMERA_SERVICE_FIELD_NUMBER = 73;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICamera.Service> cameraService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICamera.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDICamera.Service.class, GDICamera.Service.getDefaultInstance());
        cameraService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDICameraExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u000fGDICamera.proto:I\n\u000ecamera_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018I \u0001(\u000b2\u0019.GDI.Proto.Camera.ServiceB2\n\u001acom.garmin.proto.generatedB\u0012GDICameraExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDICamera.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDICamera.getDescriptor();
    }

    private GDICameraExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(cameraService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
