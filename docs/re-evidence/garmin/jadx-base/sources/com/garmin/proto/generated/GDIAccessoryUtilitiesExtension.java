package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIAccessoryUtilitiesExtension {
    public static final int ACCESSORY_UTILITIES_SERVICE_FIELD_NUMBER = 63;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAccessoryUtilities.Service> accessoryUtilitiesService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAccessoryUtilities.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIAccessoryUtilities.Service.class, GDIAccessoryUtilities.Service.getDefaultInstance());
        accessoryUtilitiesService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$GDIAccessoryUtilitiesExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001bGDIAccessoryUtilities.proto:b\n\u001baccessory_utilities_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018? \u0001(\u000b2%.GDI.Proto.AccessoryUtilities.ServiceB>\n\u001acom.garmin.proto.generatedB\u001eGDIAccessoryUtilitiesExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIAccessoryUtilities.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIAccessoryUtilities.getDescriptor();
    }

    private GDIAccessoryUtilitiesExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(accessoryUtilitiesService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
