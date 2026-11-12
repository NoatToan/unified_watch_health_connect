package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRealtimeSettingsExtension {
    public static final int REALTIME_SETTINGS_SERVICE_FIELD_NUMBER = 42;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRealtimeSettingsProto.RealtimeSettingsService> realtimeSettingsService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRealtimeSettingsProto.RealtimeSettingsService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIRealtimeSettingsProto.RealtimeSettingsService.class, GDIRealtimeSettingsProto.RealtimeSettingsService.getDefaultInstance());
        realtimeSettingsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"GDIRealtimeSettingsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0019GDIRealtimeSettings.proto:n\n\u0019realtime_settings_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018* \u0001(\u000b23.GDI.Proto.RealtimeSettings.RealtimeSettingsServiceB<\n\u001acom.garmin.proto.generatedB\u001cGDIRealtimeSettingsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIRealtimeSettingsProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIRealtimeSettingsProto.getDescriptor();
    }

    private GDIRealtimeSettingsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(realtimeSettingsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
