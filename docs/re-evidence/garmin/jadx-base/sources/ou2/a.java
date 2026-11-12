package ou2;

import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import com.garmin.proto.generated.GDIConnectedDevicesReportingExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private a() {
    }

    public static GDIConnectedDevicesReporting.Service a(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectedDevicesReporting.Service> generatedExtension = GDIConnectedDevicesReportingExtension.connectedDevicesReportingService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDIConnectedDevicesReporting.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }
}
