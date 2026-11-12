package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDILiveTrackMessagingExtension {
    public static final int LIVE_TRACK_MESSAGING_SERVICE_FIELD_NUMBER = 17;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveTrackMessagingProto.LiveTrackMessagingService> liveTrackMessagingService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveTrackMessagingProto.LiveTrackMessagingService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDILiveTrackMessagingProto.LiveTrackMessagingService.class, GDILiveTrackMessagingProto.LiveTrackMessagingService.getDefaultInstance());
        liveTrackMessagingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$GDILiveTrackMessagingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001bGDILiveTrackMessaging.proto:u\n\u001clive_track_messaging_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0011 \u0001(\u000b27.GDI.Proto.LiveTrackMessaging.LiveTrackMessagingServiceB>\n\u001acom.garmin.proto.generatedB\u001eGDILiveTrackMessagingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDILiveTrackMessagingProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDILiveTrackMessagingProto.getDescriptor();
    }

    private GDILiveTrackMessagingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(liveTrackMessagingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
