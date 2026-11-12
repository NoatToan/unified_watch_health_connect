package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXeroRangefinderExtension {
    public static final int XERO_RANGEFINDER_SERVICE_FIELD_NUMBER = 89;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXeroRangefinder.Service> xeroRangefinderService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXeroRangefinder.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIXeroRangefinder.Service.class, GDIXeroRangefinder.Service.getDefaultInstance());
        xeroRangefinderService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIXeroRangefinderExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDIXeroRangefinder.proto:\\\n\u0018xero_rangefinder_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018Y \u0001(\u000b2\".GDI.Proto.XeroRangefinder.ServiceB;\n\u001acom.garmin.proto.generatedB\u001bGDIXeroRangefinderExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIXeroRangefinder.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIXeroRangefinder.getDescriptor();
    }

    private GDIXeroRangefinderExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(xeroRangefinderService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
