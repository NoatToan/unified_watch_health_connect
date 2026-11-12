package nu2;

import com.garmin.proto.generated.GDIConnectIQHTTPExtension;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    private a() {
    }

    public static GDISmartProto.Smart a(GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builder) {
        GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPServiceBuild = builder.build();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDIConnectIQHTTPExtension.connectIqHttpService, connectIQHTTPServiceBuild);
        return builderNewBuilder.build();
    }
}
