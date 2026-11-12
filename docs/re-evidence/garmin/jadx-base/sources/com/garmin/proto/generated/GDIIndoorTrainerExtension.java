package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIIndoorTrainerExtension {
    public static final int INDOOR_TRAINER_SERVICE_FIELD_NUMBER = 95;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIIndoorTrainer.Service> indoorTrainerService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIIndoorTrainer.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIIndoorTrainer.Service.class, GDIIndoorTrainer.Service.getDefaultInstance());
        indoorTrainerService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDIIndoorTrainerExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0016GDIIndoorTrainer.proto:X\n\u0016indoor_trainer_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018_ \u0001(\u000b2 .GDI.Proto.IndoorTrainer.ServiceB9\n\u001acom.garmin.proto.generatedB\u0019GDIIndoorTrainerExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIIndoorTrainer.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIIndoorTrainer.getDescriptor();
    }

    private GDIIndoorTrainerExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(indoorTrainerService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
