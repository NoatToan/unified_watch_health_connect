package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDataTransferExtension {
    public static final int DATA_TRANSFER_SERVICE_FIELD_NUMBER = 7;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDataTransferProto.DataTransferService> dataTransferService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDataTransferProto.DataTransferService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIDataTransferProto.DataTransferService.class, GDIDataTransferProto.DataTransferService.getDefaultInstance());
        dataTransferService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIDataTransferExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIDataTransfer.proto:b\n\u0015data_transfer_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0007 \u0001(\u000b2+.GDI.Proto.DataTransfer.DataTransferServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIDataTransferExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIDataTransferProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIDataTransferProto.getDescriptor();
    }

    private GDIDataTransferExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(dataTransferService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
