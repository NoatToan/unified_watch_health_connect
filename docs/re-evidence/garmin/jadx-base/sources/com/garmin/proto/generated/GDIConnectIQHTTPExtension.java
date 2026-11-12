package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes11.dex */
public final class GDIConnectIQHTTPExtension {
    public static final int CONNECT_IQ_HTTP_SERVICE_FIELD_NUMBER = 2;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQHTTPProto.ConnectIQHTTPService> connectIqHttpService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQHTTPProto.ConnectIQHTTPService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIConnectIQHTTPProto.ConnectIQHTTPService.class, GDIConnectIQHTTPProto.ConnectIQHTTPService.getDefaultInstance());
        connectIqHttpService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDIConnectIQHTTPExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0016GDIConnectIQHTTP.proto:f\n\u0017connect_iq_http_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0002 \u0001(\u000b2-.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPServiceB9\n\u001acom.garmin.proto.generatedB\u0019GDIConnectIQHTTPExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIConnectIQHTTPProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIConnectIQHTTPProto.getDescriptor();
    }

    private GDIConnectIQHTTPExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(connectIqHttpService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
