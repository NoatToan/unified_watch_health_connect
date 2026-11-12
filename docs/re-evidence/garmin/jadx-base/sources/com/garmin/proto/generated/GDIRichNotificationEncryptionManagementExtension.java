package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRichNotificationEncryptionManagementExtension {
    public static final int RICH_NOTIFICATION_ENCRYPTION_MANAGEMENT_SERVICE_FIELD_NUMBER = 92;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRichNotificationEncryptionManagement.Service> richNotificationEncryptionManagementService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRichNotificationEncryptionManagement.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIRichNotificationEncryptionManagement.Service.class, GDIRichNotificationEncryptionManagement.Service.getDefaultInstance());
        richNotificationEncryptionManagementService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n6GDIRichNotificationEncryptionManagementExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a-GDIRichNotificationEncryptionManagement.proto:\u0088\u0001\n/rich_notification_encryption_management_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\\ \u0001(\u000b27.GDI.Proto.RichNotificationEncryptionManagement.ServiceBP\n\u001acom.garmin.proto.generatedB0GDIRichNotificationEncryptionManagementExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIRichNotificationEncryptionManagement.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIRichNotificationEncryptionManagement.getDescriptor();
    }

    private GDIRichNotificationEncryptionManagementExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(richNotificationEncryptionManagementService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
