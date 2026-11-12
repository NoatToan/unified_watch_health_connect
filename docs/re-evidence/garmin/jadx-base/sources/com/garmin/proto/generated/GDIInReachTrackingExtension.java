package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachTrackingExtension {
    public static final int INREACH_TRACKING_SERVICE_FIELD_NUMBER = 28;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachTracking.InReachTrackingService> inreachTrackingService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachTracking.InReachTrackingService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachTracking.InReachTrackingService.class, GDIInReachTracking.InReachTrackingService.getDefaultInstance());
        inreachTrackingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIInReachTrackingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDIInReachTracking.proto:k\n\u0018inreach_tracking_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u001c \u0001(\u000b21.GDI.Proto.InReachTracking.InReachTrackingServiceB;\n\u001acom.garmin.proto.generatedB\u001bGDIInReachTrackingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachTracking.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachTracking.getDescriptor();
    }

    private GDIInReachTrackingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachTrackingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
