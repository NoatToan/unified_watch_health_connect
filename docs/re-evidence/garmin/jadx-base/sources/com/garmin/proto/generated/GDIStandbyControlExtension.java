package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIStandbyControlExtension {
    public static final int STANDBY_CONTROL_SERVICE_FIELD_NUMBER = 88;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIStandbyControl.Service> standbyControlService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIStandbyControl.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIStandbyControl.Service.class, GDIStandbyControl.Service.getDefaultInstance());
        standbyControlService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDIStandbyControlExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0017GDIStandbyControl.proto:Z\n\u0017standby_control_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018X \u0001(\u000b2!.GDI.Proto.StandbyControl.ServiceB:\n\u001acom.garmin.proto.generatedB\u001aGDIStandbyControlExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIStandbyControl.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIStandbyControl.getDescriptor();
    }

    private GDIStandbyControlExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(standbyControlService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
