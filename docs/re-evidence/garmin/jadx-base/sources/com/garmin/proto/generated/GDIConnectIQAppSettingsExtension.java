package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes11.dex */
public final class GDIConnectIQAppSettingsExtension {
    public static final int CONNECT_IQ_APP_SETTINGS_SERVICE_FIELD_NUMBER = 4;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService> connectIqAppSettingsService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.class, GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.getDefaultInstance());
        connectIqAppSettingsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&GDIConnectIQAppSettingsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001dGDIConnectIQAppSettings.proto:|\n\u001fconnect_iq_app_settings_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0004 \u0001(\u000b2;.GDI.Proto.ConnectIQAppSettings.ConnectIQAppSettingsServiceB@\n\u001acom.garmin.proto.generatedB GDIConnectIQAppSettingsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIConnectIQAppSettingsProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIConnectIQAppSettingsProto.getDescriptor();
    }

    private GDIConnectIQAppSettingsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(connectIqAppSettingsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
