package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDILiveSessionExtension {
    public static final int LIVE_SESSION_SERVICE_FIELD_NUMBER = 56;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveSessionProto.LiveSessionService> liveSessionService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveSessionProto.LiveSessionService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDILiveSessionProto.LiveSessionService.class, GDILiveSessionProto.LiveSessionService.getDefaultInstance());
        liveSessionService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDILiveSessionExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDILiveSession.proto:_\n\u0014live_session_service\u0012\u0016.GDI.Proto.Smart.Smart\u00188 \u0001(\u000b2).GDI.Proto.LiveSession.LiveSessionServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDILiveSessionExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDILiveSessionProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDILiveSessionProto.getDescriptor();
    }

    private GDILiveSessionExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(liveSessionService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
