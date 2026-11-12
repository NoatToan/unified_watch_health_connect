package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachCallsExtension {
    public static final int INREACH_CALLS_SERVICE_FIELD_NUMBER = 68;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachCalls.InReachCallsService> inreachCallsService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachCalls.InReachCallsService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachCalls.InReachCallsService.class, GDIInReachCalls.InReachCallsService.getDefaultInstance());
        inreachCallsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIInReachCallsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIInReachCalls.proto:b\n\u0015inreach_calls_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018D \u0001(\u000b2+.GDI.Proto.InReachCalls.InReachCallsServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIInReachCallsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachCalls.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachCalls.getDescriptor();
    }

    private GDIInReachCallsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachCallsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
