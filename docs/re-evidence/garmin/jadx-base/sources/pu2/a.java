package pu2;

import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private a() {
    }

    public static GDISmartProto.Smart a(GDICore.CoreService.Builder builder) {
        GDICore.CoreService coreServiceBuild = builder.build();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDICoreExtension.coreService, coreServiceBuild);
        return builderNewBuilder.build();
    }

    public static GDICore.CoreService b(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICore.CoreService> generatedExtension = GDICoreExtension.coreService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDICore.CoreService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }
}
