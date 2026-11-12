package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIAntiTheftAlarmExtension {
    public static final int ANTI_THEFT_ALARM_SERVICE_FIELD_NUMBER = 26;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAntiTheftAlarmProto.AntiTheftAlarmService> antiTheftAlarmService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAntiTheftAlarmProto.AntiTheftAlarmService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIAntiTheftAlarmProto.AntiTheftAlarmService.class, GDIAntiTheftAlarmProto.AntiTheftAlarmService.getDefaultInstance());
        antiTheftAlarmService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDIAntiTheftAlarmExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0017GDIAntiTheftAlarm.proto:i\n\u0018anti_theft_alarm_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u001a \u0001(\u000b2/.GDI.Proto.AntiTheftAlarm.AntiTheftAlarmServiceB:\n\u001acom.garmin.proto.generatedB\u001aGDIAntiTheftAlarmExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIAntiTheftAlarmProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIAntiTheftAlarmProto.getDescriptor();
    }

    private GDIAntiTheftAlarmExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(antiTheftAlarmService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
