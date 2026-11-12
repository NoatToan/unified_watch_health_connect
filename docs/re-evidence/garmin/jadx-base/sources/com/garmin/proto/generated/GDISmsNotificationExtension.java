package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDISmsNotificationExtension {
    public static final int SMS_NOTIFICATION_SERVICE_FIELD_NUMBER = 16;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISmsNotificationProto.SmsNotificationService> smsNotificationService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISmsNotificationProto.SmsNotificationService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISmsNotificationProto.SmsNotificationService.class, GDISmsNotificationProto.SmsNotificationService.getDefaultInstance());
        smsNotificationService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDISmsNotificationExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0018GDISmsNotification.proto:k\n\u0018sms_notification_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0010 \u0001(\u000b21.GDI.Proto.SmsNotification.SmsNotificationServiceB;\n\u001acom.garmin.proto.generatedB\u001bGDISmsNotificationExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISmsNotificationProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISmsNotificationProto.getDescriptor();
    }

    private GDISmsNotificationExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(smsNotificationService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
