package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGenericItemTransferExtension {
    public static final int GENERIC_ITEM_TRANSFER_SERVICE_FIELD_NUMBER = 31;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGenericItemTransferProto.GenericItemTransferService> genericItemTransferService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGenericItemTransferProto.GenericItemTransferService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIGenericItemTransferProto.GenericItemTransferService.class, GDIGenericItemTransferProto.GenericItemTransferService.getDefaultInstance());
        genericItemTransferService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%GDIGenericItemTransferExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001cGDIGenericItemTransfer.proto:x\n\u001dgeneric_item_transfer_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u001f \u0001(\u000b29.GDI.Proto.GenericItemTransfer.GenericItemTransferServiceB?\n\u001acom.garmin.proto.generatedB\u001fGDIGenericItemTransferExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIGenericItemTransferProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIGenericItemTransferProto.getDescriptor();
    }

    private GDIGenericItemTransferExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(genericItemTransferService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
