package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes11.dex */
public final class GDICompanionRangefinderExtension {
    public static final int COMPANION_RANGEFINDER_SERVICE_FIELD_NUMBER = 54;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICompanionRangefinder.CompanionRangefinderService> companionRangefinderService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICompanionRangefinder.CompanionRangefinderService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDICompanionRangefinder.CompanionRangefinderService.class, GDICompanionRangefinder.CompanionRangefinderService.getDefaultInstance());
        companionRangefinderService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&GDICompanionRangefinderExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001dGDICompanionRangefinder.proto:z\n\u001dcompanion_rangefinder_service\u0012\u0016.GDI.Proto.Smart.Smart\u00186 \u0001(\u000b2;.GDI.Proto.CompanionRangefinder.CompanionRangefinderServiceB@\n\u001acom.garmin.proto.generatedB GDICompanionRangefinderExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDICompanionRangefinder.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDICompanionRangefinder.getDescriptor();
    }

    private GDICompanionRangefinderExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(companionRangefinderService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
