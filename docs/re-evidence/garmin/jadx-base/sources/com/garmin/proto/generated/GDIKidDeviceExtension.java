package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIKidDeviceExtension {
    public static final int KID_DEVICE_SERVICE_FIELD_NUMBER = 41;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIKidDevice.KidDeviceService> kidDeviceService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIKidDevice.KidDeviceService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIKidDevice.KidDeviceService.class, GDIKidDevice.KidDeviceService.getDefaultInstance());
        kidDeviceService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDIKidDeviceExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0012GDIKidDevice.proto:Y\n\u0012kid_device_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018) \u0001(\u000b2%.GDI.Proto.KidDevice.KidDeviceServiceB5\n\u001acom.garmin.proto.generatedB\u0015GDIKidDeviceExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIKidDevice.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIKidDevice.getDescriptor();
    }

    private GDIKidDeviceExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(kidDeviceService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
