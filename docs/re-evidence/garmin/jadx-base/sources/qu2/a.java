package qu2;

import com.garmin.proto.generated.GDIDataTransferExtension;
import com.garmin.proto.generated.GDIDataTransferProto;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private a() {
    }

    public static GDISmartProto.Smart a(GDIDataTransferProto.DataTransferService.Builder builder) {
        GDIDataTransferProto.DataTransferService dataTransferServiceBuild = builder.build();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDIDataTransferExtension.dataTransferService, dataTransferServiceBuild);
        return builderNewBuilder.build();
    }
}
