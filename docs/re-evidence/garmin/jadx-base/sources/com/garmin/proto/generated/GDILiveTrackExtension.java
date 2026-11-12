package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDILiveTrackExtension {
    public static final int LIVE_TRACK_SERVICE_FIELD_NUMBER = 21;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveTrackProto.LiveTrackService> liveTrackService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveTrackProto.LiveTrackService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDILiveTrackProto.LiveTrackService.class, GDILiveTrackProto.LiveTrackService.getDefaultInstance());
        liveTrackService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDILiveTrackExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0012GDILiveTrack.proto:Y\n\u0012live_track_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0015 \u0001(\u000b2%.GDI.Proto.LiveTrack.LiveTrackServiceB5\n\u001acom.garmin.proto.generatedB\u0015GDILiveTrackExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDILiveTrackProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDILiveTrackProto.getDescriptor();
    }

    private GDILiveTrackExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(liveTrackService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
