package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachMessagingExtension {
    public static final int INREACH_MESSAGING_SERVICE_FIELD_NUMBER = 29;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> inreachMessagingService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachMessaging.InReachMessagingService.class, GDIInReachMessaging.InReachMessagingService.getDefaultInstance());
        inreachMessagingService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"GDIInReachMessagingExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0019GDIInReachMessaging.proto:n\n\u0019inreach_messaging_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u001d \u0001(\u000b23.GDI.Proto.InReachMessaging.InReachMessagingServiceB<\n\u001acom.garmin.proto.generatedB\u001cGDIInReachMessagingExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachMessaging.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachMessaging.getDescriptor();
    }

    private GDIInReachMessagingExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachMessagingService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
