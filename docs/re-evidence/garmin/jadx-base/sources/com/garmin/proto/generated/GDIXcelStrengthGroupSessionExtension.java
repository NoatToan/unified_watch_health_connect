package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXcelStrengthGroupSessionExtension {
    public static final int XCEL_STRENGTH_GROUP_SESSION_SERVICE_FIELD_NUMBER = 91;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXcelStrengthGroupSession.Service> xcelStrengthGroupSessionService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIXcelStrengthGroupSession.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIXcelStrengthGroupSession.Service.class, GDIXcelStrengthGroupSession.Service.getDefaultInstance());
        xcelStrengthGroupSessionService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n*GDIXcelStrengthGroupSessionExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a!GDIXcelStrengthGroupSession.proto:p\n#xcel_strength_group_session_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018[ \u0001(\u000b2+.GDI.Proto.XcelStrengthGroupSession.ServiceBD\n\u001acom.garmin.proto.generatedB$GDIXcelStrengthGroupSessionExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIXcelStrengthGroupSession.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIXcelStrengthGroupSession.getDescriptor();
    }

    private GDIXcelStrengthGroupSessionExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(xcelStrengthGroupSessionService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
