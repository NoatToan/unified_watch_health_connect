package di1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.InvalidProtocolBufferException;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class h extends s<r> {

    public class a extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: di1.h$a$a, reason: collision with other inner class name */
        public class C1276a implements wm2.b {
            public C1276a() {
            }

            @Override // wm2.b
            public final void onResponseFailed(int i14) {
                r rVar = new r();
                i2.a(a2.SETTINGS, "RetrieveWiFiNetworksOperation", "RetrieveWiFiNetworksOperation - SendAccessPointScanRequestTask:onResponseFailed. result=" + rVar);
                a aVar = a.this;
                h.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, rVar);
                aVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }

            @Override // wm2.b
            public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                i2.a(a2.SETTINGS, "RetrieveWiFiNetworksOperation", "RetrieveWiFiNetworksOperation - SendAccessPointScanRequestTask:onResponseReceived");
                GDIWifiSetup.WifiSetupService wifiSetupService = ProtoUtil.getWifiSetupService(smart);
                a aVar = a.this;
                WifiSetup.WifiSetupDevice from = null;
                if (wifiSetupService != null && wifiSetupService.hasAccessPointScanResponse()) {
                    GDIWifiSetup.AccessPointScanResponse accessPointScanResponse = wifiSetupService.getAccessPointScanResponse();
                    if (accessPointScanResponse.hasEncryptedWifiProtobuf()) {
                        try {
                            from = WifiSetup.WifiSetupDevice.parseFrom(p.a(h.this.f59776l, accessPointScanResponse.getEncryptedWifiProtobuf().toByteArray()));
                        } catch (InvalidProtocolBufferException unused) {
                        }
                    }
                }
                if (from != null) {
                    r rVar = new r(from);
                    i2.a(a2.SETTINGS, "RetrieveWiFiNetworksOperation", "RetrieveWiFiNetworksOperation - SendAccessPointScanRequestTask:onResponseReceived. result=" + rVar);
                    h.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, rVar);
                } else {
                    r rVar2 = new r();
                    i2.a(a2.SETTINGS, "RetrieveWiFiNetworksOperation", "RetrieveWiFiNetworksOperation - SendAccessPointScanRequestTask. result=" + rVar2);
                    h.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, rVar2);
                }
                aVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }

        public a() {
            super(h.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            h hVar = h.this;
            hVar.getClass();
            GDIWifiSetup.AccessPointScanRequest.Builder builderNewBuilder = GDIWifiSetup.AccessPointScanRequest.newBuilder();
            GDIWifiSetup.WifiSetupService.Builder builderNewBuilder2 = GDIWifiSetup.WifiSetupService.newBuilder();
            builderNewBuilder2.setAccessPointScanRequest(builderNewBuilder.build());
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.setExtension(GDIWifiSetupExtension.wifiSetupService, builderNewBuilder2.build());
            GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
            i2.a(a2.SETTINGS, "RetrieveWiFiNetworksOperation", "RetrieveWiFiNetworksOperation - SendAccessPointScanRequestTask:executeTask. Smart=" + smartBuild);
            ((l80.b) KoinJavaComponent.get(l80.b.class)).c(smartBuild, hVar.f59776l, new C1276a());
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    public h(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(aVar);
        this.f59776l = j8;
        b(new a());
    }
}
