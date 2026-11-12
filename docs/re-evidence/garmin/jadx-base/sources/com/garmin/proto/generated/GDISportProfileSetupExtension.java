package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISportProfileSetupExtension {
    public static final int SPORT_PROFILE_SETUP_SERVICE_FIELD_NUMBER = 19;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISportProfileSetup.SportProfileSetupService> sportProfileSetupService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISportProfileSetup.SportProfileSetupService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISportProfileSetup.SportProfileSetupService.class, GDISportProfileSetup.SportProfileSetupService.getDefaultInstance());
        sportProfileSetupService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDISportProfileSetupExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDISportProfileSetup.proto:r\n\u001bsport_profile_setup_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0013 \u0001(\u000b25.GDI.Proto.SportProfileSetup.SportProfileSetupServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDISportProfileSetupExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISportProfileSetup.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISportProfileSetup.getDescriptor();
    }

    private GDISportProfileSetupExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(sportProfileSetupService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
