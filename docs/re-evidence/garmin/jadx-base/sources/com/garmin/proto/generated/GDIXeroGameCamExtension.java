package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXeroGameCamExtension {
    public static final int XERO_GAME_CAM_SERVICE_FIELD_NUMBER = 66;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXeroGameCamProto.Service> xeroGameCamService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXeroGameCamProto.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIXeroGameCamProto.Service.class, GDIXeroGameCamProto.Service.getDefaultInstance());
        xeroGameCamService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIXeroGameCamExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDIXeroGameCam.proto:U\n\u0015xero_game_cam_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018B \u0001(\u000b2\u001e.GDI.Proto.XeroGameCam.ServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDIXeroGameCamExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIXeroGameCamProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIXeroGameCamProto.getDescriptor();
    }

    private GDIXeroGameCamExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(xeroGameCamService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
