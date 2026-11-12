package uu2;

import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    private a() {
    }

    public static GDISmartProto.Smart a(GDIWifiSetup.WifiSetupService.Builder builder) {
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDIWifiSetupExtension.wifiSetupService, builder.build());
        return builderNewBuilder.build();
    }

    public static GDIWifiSetup.WifiSetupService b(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetup.WifiSetupService> generatedExtension = GDIWifiSetupExtension.wifiSetupService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDIWifiSetup.WifiSetupService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }
}
