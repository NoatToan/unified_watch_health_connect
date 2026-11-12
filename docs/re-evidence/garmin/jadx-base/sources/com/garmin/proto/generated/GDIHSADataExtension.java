package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIHSADataExtension {
    public static final int HSA_DATA_SERVICE_FIELD_NUMBER = 20;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIHSAData.HSADataService> hsaDataService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIHSAData.HSADataService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIHSAData.HSADataService.class, GDIHSAData.HSADataService.getDefaultInstance());
        hsaDataService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019GDIHSADataExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0010GDIHSAData.proto:S\n\u0010hsa_data_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0014 \u0001(\u000b2!.GDI.Proto.HSAData.HSADataServiceB3\n\u001acom.garmin.proto.generatedB\u0013GDIHSADataExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIHSAData.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIHSAData.getDescriptor();
    }

    private GDIHSADataExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(hsaDataService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
