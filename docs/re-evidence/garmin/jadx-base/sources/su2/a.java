package su2;

import com.garmin.proto.generated.GDIFileAccess;
import com.garmin.proto.generated.GDIFileAccessExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private a() {
    }

    public static GDIFileAccess.Service a(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIFileAccess.Service> generatedExtension = GDIFileAccessExtension.fileAccessService;
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDIFileAccess.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }
}
