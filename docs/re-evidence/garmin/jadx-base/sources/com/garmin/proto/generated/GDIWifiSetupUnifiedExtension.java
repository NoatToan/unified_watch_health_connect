package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWifiSetupUnifiedExtension {
    public static final int WIFI_UNIFIED_SETUP_SERVICE_FIELD_NUMBER = 93;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetupUnified.WifiSetupUnifiedService> wifiUnifiedSetupService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetupUnified.WifiSetupUnifiedService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIWifiSetupUnified.WifiSetupUnifiedService.class, GDIWifiSetupUnified.WifiSetupUnifiedService.getDefaultInstance());
        wifiUnifiedSetupService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"GDIWifiSetupUnifiedExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0019GDIWifiSetupUnified.proto:o\n\u001awifi_unified_setup_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018] \u0001(\u000b23.GDI.Proto.WifiSetupUnified.WifiSetupUnifiedServiceB<\n\u001acom.garmin.proto.generatedB\u001cGDIWifiSetupUnifiedExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIWifiSetupUnified.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIWifiSetupUnified.getDescriptor();
    }

    private GDIWifiSetupUnifiedExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(wifiUnifiedSetupService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
