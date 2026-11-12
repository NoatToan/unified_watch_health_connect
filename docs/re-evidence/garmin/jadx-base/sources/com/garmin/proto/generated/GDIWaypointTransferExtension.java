package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWaypointTransferExtension {
    public static final int WAY_POINT_TRANSFER_SERVICE_FIELD_NUMBER = 23;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWaypointTransferProto.WaypointTransferService> wayPointTransferService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWaypointTransferProto.WaypointTransferService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIWaypointTransferProto.WaypointTransferService.class, GDIWaypointTransferProto.WaypointTransferService.getDefaultInstance());
        wayPointTransferService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"GDIWaypointTransferExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0019GDIWaypointTransfer.proto:o\n\u001away_point_transfer_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0017 \u0001(\u000b23.GDI.Proto.WaypointTransfer.WaypointTransferServiceB<\n\u001acom.garmin.proto.generatedB\u001cGDIWaypointTransferExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIWaypointTransferProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIWaypointTransferProto.getDescriptor();
    }

    private GDIWaypointTransferExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(wayPointTransferService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
