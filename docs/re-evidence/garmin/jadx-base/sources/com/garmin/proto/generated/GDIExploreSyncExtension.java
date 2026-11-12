package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIExploreSyncExtension {
    public static final int EXPLORE_SYNC_SERVICE_FIELD_NUMBER = 22;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIExploreSyncProto.ExploreSyncService> exploreSyncService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIExploreSyncProto.ExploreSyncService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIExploreSyncProto.ExploreSyncService.class, GDIExploreSyncProto.ExploreSyncService.getDefaultInstance());
        exploreSyncService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIExploreSyncExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDIExploreSync.proto:_\n\u0014explore_sync_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0016 \u0001(\u000b2).GDI.Proto.ExploreSync.ExploreSyncServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDIExploreSyncExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIExploreSyncProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIExploreSyncProto.getDescriptor();
    }

    private GDIExploreSyncExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(exploreSyncService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
