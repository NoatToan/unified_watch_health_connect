package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIMessengerOnDeviceExtension {
    public static final int MESSENGER_ON_DEVICE_SERVICE_FIELD_NUMBER = 53;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIMessengerOnDevice.MessengerOnDeviceService> messengerOnDeviceService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIMessengerOnDevice.MessengerOnDeviceService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIMessengerOnDevice.MessengerOnDeviceService.class, GDIMessengerOnDevice.MessengerOnDeviceService.getDefaultInstance());
        messengerOnDeviceService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDIMessengerOnDeviceExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDIMessengerOnDevice.proto:r\n\u001bmessenger_on_device_service\u0012\u0016.GDI.Proto.Smart.Smart\u00185 \u0001(\u000b25.GDI.Proto.MessengerOnDevice.MessengerOnDeviceServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDIMessengerOnDeviceExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIMessengerOnDevice.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIMessengerOnDevice.getDescriptor();
    }

    private GDIMessengerOnDeviceExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(messengerOnDeviceService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
