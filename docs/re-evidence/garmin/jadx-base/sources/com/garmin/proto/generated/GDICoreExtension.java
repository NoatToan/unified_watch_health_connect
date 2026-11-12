package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDICoreExtension {
    public static final int CORE_SERVICE_FIELD_NUMBER = 13;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICore.CoreService> coreService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICore.CoreService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDICore.CoreService.class, GDICore.CoreService.getDefaultInstance());
        coreService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016GDICoreExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\rGDICore.proto:I\n\fcore_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\r \u0001(\u000b2\u001b.GDI.Proto.Core.CoreServiceB0\n\u001acom.garmin.proto.generatedB\u0010GDICoreExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDICore.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDICore.getDescriptor();
    }

    private GDICoreExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(coreService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
