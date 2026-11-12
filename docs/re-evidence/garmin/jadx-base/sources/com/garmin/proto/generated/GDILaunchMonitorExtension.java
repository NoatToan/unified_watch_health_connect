package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDILaunchMonitorExtension {
    public static final int LAUNCH_MONITOR_SERVICE_FIELD_NUMBER = 38;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILaunchMonitorProto.Service> launchMonitorService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILaunchMonitorProto.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDILaunchMonitorProto.Service.class, GDILaunchMonitorProto.Service.getDefaultInstance());
        launchMonitorService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDILaunchMonitorExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0016GDILaunchMonitor.proto:X\n\u0016launch_monitor_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018& \u0001(\u000b2 .GDI.Proto.LaunchMonitor.ServiceB9\n\u001acom.garmin.proto.generatedB\u0019GDILaunchMonitorExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDILaunchMonitorProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDILaunchMonitorProto.getDescriptor();
    }

    private GDILaunchMonitorExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(launchMonitorService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
