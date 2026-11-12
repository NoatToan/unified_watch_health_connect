package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRichNotificationsExtension {
    public static final int RICH_NOTIFICATIONS_SERVICE_FIELD_NUMBER = 87;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRichNotifications.Service> richNotificationsService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRichNotifications.Service> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIRichNotifications.Service.class, GDIRichNotifications.Service.getDefaultInstance());
        richNotificationsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#GDIRichNotificationsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u001aGDIRichNotifications.proto:`\n\u001arich_notifications_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018W \u0001(\u000b2$.GDI.Proto.RichNotifications.ServiceB=\n\u001acom.garmin.proto.generatedB\u001dGDIRichNotificationsExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIRichNotifications.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIRichNotifications.getDescriptor();
    }

    private GDIRichNotificationsExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(richNotificationsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
