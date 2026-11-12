package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes8.dex */
public class CoreProtobufRequestManager {
    public static void sendLocationUpdatedNotification(long j8, i22.d dVar) {
        GDICore.LocationUpdatedNotification.Builder builderNewBuilder = GDICore.LocationUpdatedNotification.newBuilder();
        builderNewBuilder.addLocationData(zb1.b.b(dVar));
        GDICore.CoreService.Builder builderNewBuilder2 = GDICore.CoreService.newBuilder();
        builderNewBuilder2.setLocationUpdatedNotification(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDICoreExtension.coreService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateNotification(builderNewBuilder3.build(), j8);
    }
}
