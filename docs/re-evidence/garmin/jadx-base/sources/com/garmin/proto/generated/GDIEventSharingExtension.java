package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIEventSharingExtension {
    public static final int EVENT_SHARING_FIELD_NUMBER = 30;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIEventSharingProto.EventSharingService> eventSharing;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIEventSharingProto.EventSharingService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIEventSharingProto.EventSharingService.class, GDIEventSharingProto.EventSharingService.getDefaultInstance());
        eventSharing = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIEventSharingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIEventSharing.proto:Z\n\revent_sharing\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u001e \u0001(\u000b2+.GDI.Proto.EventSharing.EventSharingServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIEventSharingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIEventSharingProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIEventSharingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(eventSharing);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
