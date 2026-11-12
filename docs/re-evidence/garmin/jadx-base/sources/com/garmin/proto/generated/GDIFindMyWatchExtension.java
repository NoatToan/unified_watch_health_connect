package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIFindMyWatchExtension {
    public static final int FIND_MY_WATCH_SERVICE_FIELD_NUMBER = 12;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIFindMyWatch.FindMyWatchService> findMyWatchService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIFindMyWatch.FindMyWatchService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIFindMyWatch.FindMyWatchService.class, GDIFindMyWatch.FindMyWatchService.getDefaultInstance());
        findMyWatchService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIFindMyWatchExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0014GDIFindMyWatch.proto:`\n\u0015find_my_watch_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\f \u0001(\u000b2).GDI.Proto.FindMyWatch.FindMyWatchServiceB7\n\u001acom.garmin.proto.generatedB\u0017GDIFindMyWatchExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIFindMyWatch.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIFindMyWatch.getDescriptor();
    }

    private GDIFindMyWatchExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(findMyWatchService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
