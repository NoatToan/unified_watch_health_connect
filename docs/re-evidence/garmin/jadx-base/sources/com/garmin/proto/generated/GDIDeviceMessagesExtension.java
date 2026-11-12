package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeviceMessagesExtension {
    public static final int DEVICE_MESSAGE_SERVICE_FIELD_NUMBER = 24;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceMessages.DeviceMessageService> deviceMessageService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceMessages.DeviceMessageService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIDeviceMessages.DeviceMessageService.class, GDIDeviceMessages.DeviceMessageService.getDefaultInstance());
        deviceMessageService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDIDeviceMessagesExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0017GDIDeviceMessages.proto:f\n\u0016device_message_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0018 \u0001(\u000b2..GDI.Proto.DeviceMessages.DeviceMessageServiceB:\n\u001acom.garmin.proto.generatedB\u001aGDIDeviceMessagesExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIDeviceMessages.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIDeviceMessages.getDescriptor();
    }

    private GDIDeviceMessagesExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(deviceMessageService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
