package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGarminConnectExtension {
    public static final int GARMIN_CONNECT_SERVICE_FIELD_NUMBER = 47;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGarminConnect.Service> garminConnectService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIGarminConnect.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIGarminConnect.Service.class, GDIGarminConnect.Service.getDefaultInstance());
        garminConnectService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDIGarminConnectExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0016GDIGarminConnect.proto:X\n\u0016garmin_connect_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018/ \u0001(\u000b2 .GDI.Proto.GarminConnect.ServiceB9\n\u001acom.garmin.proto.generatedB\u0019GDIGarminConnectExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIGarminConnect.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIGarminConnect.getDescriptor();
    }

    private GDIGarminConnectExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(garminConnectService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
