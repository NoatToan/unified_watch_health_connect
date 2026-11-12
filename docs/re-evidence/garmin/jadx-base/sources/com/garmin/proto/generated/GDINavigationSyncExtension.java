package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDINavigationSyncExtension {
    public static final int NAVIGATION_SYNC_SERVICE_FIELD_NUMBER = 40;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDINavigationSyncProto.Service> navigationSyncService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDINavigationSyncProto.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDINavigationSyncProto.Service.class, GDINavigationSyncProto.Service.getDefaultInstance());
        navigationSyncService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDINavigationSyncExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0017GDINavigationSync.proto:Z\n\u0017navigation_sync_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018( \u0001(\u000b2!.GDI.Proto.NavigationSync.ServiceB:\n\u001acom.garmin.proto.generatedB\u001aGDINavigationSyncExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDINavigationSyncProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDINavigationSyncProto.getDescriptor();
    }

    private GDINavigationSyncExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(navigationSyncService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
