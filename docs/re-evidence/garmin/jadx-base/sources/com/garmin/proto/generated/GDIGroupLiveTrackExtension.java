package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIGroupLiveTrackExtension {
    public static final int GROUP_LIVE_TRACK_SERVICE_FIELD_NUMBER = 14;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGroupLiveTrack.GroupLiveTrackService> groupLiveTrackService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGroupLiveTrack.GroupLiveTrackService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIGroupLiveTrack.GroupLiveTrackService.class, GDIGroupLiveTrack.GroupLiveTrackService.getDefaultInstance());
        groupLiveTrackService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDIGroupLiveTrackExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0017GDIGroupLiveTrack.proto:i\n\u0018group_live_track_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u000e \u0001(\u000b2/.GDI.Proto.GroupLiveTrack.GroupLiveTrackServiceB:\n\u001acom.garmin.proto.generatedB\u001aGDIGroupLiveTrackExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIGroupLiveTrack.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIGroupLiveTrack.getDescriptor();
    }

    private GDIGroupLiveTrackExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(groupLiveTrackService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
