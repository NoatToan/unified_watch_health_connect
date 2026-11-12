package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes14.dex */
public final class GDIAudioPromptsExtension {
    public static final int AUDIO_PROMPTS_SERVICE_FIELD_NUMBER = 10;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAudioPromptsProto.AudioPromptsService> audioPromptsService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAudioPromptsProto.AudioPromptsService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIAudioPromptsProto.AudioPromptsService.class, GDIAudioPromptsProto.AudioPromptsService.getDefaultInstance());
        audioPromptsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001eGDIAudioPromptsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0015GDIAudioPrompts.proto:b\n\u0015audio_prompts_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\n \u0001(\u000b2+.GDI.Proto.AudioPrompts.AudioPromptsServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDIAudioPromptsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIAudioPromptsProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIAudioPromptsProto.getDescriptor();
    }

    private GDIAudioPromptsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(audioPromptsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
