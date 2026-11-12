package tu2;

import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.proto.generated.GDISaMD;
import com.garmin.proto.generated.GDISaMDExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    private a() {
    }

    public static GDISmartProto.Smart a(GDIGarminHealth.Service.Builder builder) {
        return GDISmartProto.Smart.newBuilder().setExtension(GDISaMDExtension.samdService, GDISaMD.Service.newBuilder().setGarminHealthService(builder.build().toByteString()).build()).build();
    }

    public static GDISaMD.Service b(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISaMD.Service> generatedExtension = GDISaMDExtension.samdService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDISaMD.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }
}
