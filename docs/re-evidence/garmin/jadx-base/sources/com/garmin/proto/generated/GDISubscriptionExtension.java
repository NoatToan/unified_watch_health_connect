package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISubscriptionExtension {
    public static final int SUBSCRIPTION_SERVICE_FIELD_NUMBER = 71;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISubscriptionsProto.SubscriptionService> subscriptionService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISubscriptionsProto.SubscriptionService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDISubscriptionsProto.SubscriptionService.class, GDISubscriptionsProto.SubscriptionService.getDefaultInstance());
        subscriptionService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDISubscriptionsExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0016GDISubscriptions.proto:b\n\u0014subscription_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018G \u0001(\u000b2,.GDI.Proto.Subscriptions.SubscriptionServiceB8\n\u001acom.garmin.proto.generatedB\u0018GDISubscriptionExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDISubscriptionsProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDISubscriptionsProto.getDescriptor();
    }

    private GDISubscriptionExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(subscriptionService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
