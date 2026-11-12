package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachContactSyncExtension {
    public static final int INREACH_CONTACT_SYNC_SERVICE_FIELD_NUMBER = 32;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachContactSync.InReachContactSyncService> inreachContactSyncService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachContactSync.InReachContactSyncService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachContactSync.InReachContactSyncService.class, GDIInReachContactSync.InReachContactSyncService.getDefaultInstance());
        inreachContactSyncService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$GDIInReachContactSyncExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001bGDIInReachContactSync.proto:u\n\u001cinreach_contact_sync_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018  \u0001(\u000b27.GDI.Proto.InReachContactSync.InReachContactSyncServiceB>\n\u001acom.garmin.proto.generatedB\u001eGDIInReachContactSyncExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachContactSync.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachContactSync.getDescriptor();
    }

    private GDIInReachContactSyncExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachContactSyncService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
