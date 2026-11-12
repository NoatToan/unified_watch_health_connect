package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIStoreAndForwardExtension {
    public static final int STORE_AND_FORWARD_SERVICE_FIELD_NUMBER = 60;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIStoreAndForward.Service> storeAndForwardService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIStoreAndForward.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIStoreAndForward.Service.class, GDIStoreAndForward.Service.getDefaultInstance());
        storeAndForwardService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIStoreAndForwardExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDIStoreAndForward.proto:]\n\u0019store_and_forward_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018< \u0001(\u000b2\".GDI.Proto.StoreAndForward.ServiceB;\n\u001acom.garmin.proto.generatedB\u001bGDIStoreAndForwardExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIStoreAndForward.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIStoreAndForward.getDescriptor();
    }

    private GDIStoreAndForwardExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(storeAndForwardService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
