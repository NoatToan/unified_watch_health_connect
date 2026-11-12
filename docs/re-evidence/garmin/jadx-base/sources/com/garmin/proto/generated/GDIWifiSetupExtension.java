package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWifiSetupExtension {
    public static final int WIFI_SETUP_SERVICE_FIELD_NUMBER = 11;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetup.WifiSetupService> wifiSetupService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetup.WifiSetupService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIWifiSetup.WifiSetupService.class, GDIWifiSetup.WifiSetupService.getDefaultInstance());
        wifiSetupService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIWifiSetupLegacyExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDIWifiSetupLegacy.proto:Y\n\u0012wifi_setup_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u000b \u0001(\u000b2%.GDI.Proto.WifiSetup.WifiSetupServiceB5\n\u001acom.garmin.proto.generatedB\u0015GDIWifiSetupExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIWifiSetup.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIWifiSetup.getDescriptor();
    }

    private GDIWifiSetupExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(wifiSetupService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
