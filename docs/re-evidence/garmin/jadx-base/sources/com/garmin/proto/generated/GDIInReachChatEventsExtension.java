package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachChatEventsExtension {
    public static final int INREACH_CHAT_EVENTS_SERVICE_FIELD_NUMBER = 93;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachChatEvents.InReachChatEventsService> inreachChatEventsService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachChatEvents.InReachChatEventsService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachChatEvents.InReachChatEventsService.class, GDIInReachChatEvents.InReachChatEventsService.getDefaultInstance());
        inreachChatEventsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDIInReachChatEventsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDIInReachChatEvents.proto:r\n\u001binreach_chat_events_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018] \u0001(\u000b25.GDI.Proto.InReachChatEvents.InReachChatEventsServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDIInReachChatEventsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachChatEvents.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachChatEvents.getDescriptor();
    }

    private GDIInReachChatEventsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachChatEventsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
