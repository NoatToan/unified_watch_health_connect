package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIExpresspayCommandExtension {
    public static final int EXPRESSPAY_COMMAND_SERVICE_FIELD_NUMBER = 15;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIExpresspayCommand.ExpresspayCommandService> expresspayCommandService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIExpresspayCommand.ExpresspayCommandService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIExpresspayCommand.ExpresspayCommandService.class, GDIExpresspayCommand.ExpresspayCommandService.getDefaultInstance());
        expresspayCommandService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDIExpresspayCommandExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDIExpresspayCommand.proto:q\n\u001aexpresspay_command_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u000f \u0001(\u000b25.GDI.Proto.ExpresspayCommand.ExpresspayCommandServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDIExpresspayCommandExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIExpresspayCommand.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIExpresspayCommand.getDescriptor();
    }

    private GDIExpresspayCommandExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(expresspayCommandService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
