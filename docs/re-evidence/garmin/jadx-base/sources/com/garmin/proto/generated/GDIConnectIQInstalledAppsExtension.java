package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIConnectIQInstalledAppsExtension {
    public static final int CONNECT_IQ_INSTALLED_APPS_SERVICE_FIELD_NUMBER = 3;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQInstalledApps.ConnectIQInstalledAppsService> connectIqInstalledAppsService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQInstalledApps.ConnectIQInstalledAppsService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.class, GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.getDefaultInstance());
        connectIqInstalledAppsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n(GDIConnectIQInstalledAppsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001fGDIConnectIQInstalledApps.proto:\u0082\u0001\n!connect_iq_installed_apps_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0003 \u0001(\u000b2?.GDI.Proto.ConnectIQInstalledApps.ConnectIQInstalledAppsServiceBB\n\u001acom.garmin.proto.generatedB\"GDIConnectIQInstalledAppsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIConnectIQInstalledApps.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIConnectIQInstalledApps.getDescriptor();
    }

    private GDIConnectIQInstalledAppsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(connectIqInstalledAppsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
