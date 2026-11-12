package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXeroChronographExtension {
    public static final int XERO_CHRONOGRAPH_SERVICE_FIELD_NUMBER = 48;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXeroChronographProto.Service> xeroChronographService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXeroChronographProto.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIXeroChronographProto.Service.class, GDIXeroChronographProto.Service.getDefaultInstance());
        xeroChronographService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIXeroChronographExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDIXeroChronograph.proto:\\\n\u0018xero_chronograph_service\u0012\u0016.GDI.Proto.Smart.Smart\u00180 \u0001(\u000b2\".GDI.Proto.XeroChronograph.ServiceB;\n\u001acom.garmin.proto.generatedB\u001bGDIXeroChronographExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIXeroChronographProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIXeroChronographProto.getDescriptor();
    }

    private GDIXeroChronographExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(xeroChronographService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
