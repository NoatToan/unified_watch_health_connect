package dt2;

import com.garmin.proto.generated.GDICore;
import com.google.protobuf.ExtensionRegistryLite;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface c extends dt2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f61142a = a.f61143a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldt2/c$a;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f61143a = new a();

        private a() {
        }
    }

    void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder);

    void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification);

    void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse);
}
