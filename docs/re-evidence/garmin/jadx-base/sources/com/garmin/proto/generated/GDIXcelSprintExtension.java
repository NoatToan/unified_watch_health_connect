package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXcelSprintExtension {
    public static final int XCEL_SPRINT_SERVICE_FIELD_NUMBER = 80;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXcelSprint.XcelSprintService> xcelSprintService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXcelSprint.XcelSprintService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIXcelSprint.XcelSprintService.class, GDIXcelSprint.XcelSprintService.getDefaultInstance());
        xcelSprintService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001cGDIXcelSprintExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0013GDIXcelSprint.proto:\\\n\u0013xcel_sprint_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018P \u0001(\u000b2'.GDI.Proto.XcelSprint.XcelSprintServiceB6\n\u001acom.garmin.proto.generatedB\u0016GDIXcelSprintExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIXcelSprint.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIXcelSprint.getDescriptor();
    }

    private GDIXcelSprintExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(xcelSprintService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
