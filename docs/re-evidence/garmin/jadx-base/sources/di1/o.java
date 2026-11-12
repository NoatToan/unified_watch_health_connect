package di1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class o extends s<List<com.garmin.android.apps.connectmobile.settings.devices.wifi.e>> {

    public class a extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: di1.o$a$a, reason: collision with other inner class name */
        public class C1277a implements wm2.b {
            public C1277a() {
            }

            @Override // wm2.b
            public final void onResponseFailed(int i14) {
                a aVar = a.this;
                o.this.m();
                ArrayList arrayList = new ArrayList();
                i2.a(a2.SETTINGS, "VerifyWiFiNetworkConnectivityOperation", "VerifyWiFiNetworkOperation - SendVerifyConnectionRequestTask:onResponseFailed. result=" + arrayList);
                o.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, arrayList);
                aVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }

            @Override // wm2.b
            public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                i2.a(a2.SETTINGS, "VerifyWiFiNetworkConnectivityOperation", "VerifyWiFiNetworkOperation - SendVerifyConnectionRequestTask:onResponseReceived");
                a aVar = a.this;
                o oVar = o.this;
                o oVar2 = o.this;
                oVar.m();
                GDIWifiSetup.WifiSetupService wifiSetupService = ProtoUtil.getWifiSetupService(smart);
                WifiSetup.WifiSetupDevice from = null;
                if (wifiSetupService != null && wifiSetupService.hasVerifyConnectionResponse()) {
                    GDIWifiSetup.VerifyConnectionResponse verifyConnectionResponse = wifiSetupService.getVerifyConnectionResponse();
                    if (verifyConnectionResponse.hasEncryptedWifiProtobuf()) {
                        try {
                            from = WifiSetup.WifiSetupDevice.parseFrom(p.a(oVar2.f59776l, verifyConnectionResponse.getEncryptedWifiProtobuf().toByteArray()));
                        } catch (InvalidProtocolBufferException unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (from != null) {
                    if (from.getStoredApsCount() > 0) {
                        Iterator<WifiSetup.StoredAccessPoint> it = from.getStoredApsList().iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.garmin.android.apps.connectmobile.settings.devices.wifi.e(it.next()));
                        }
                    } else {
                        arrayList.add(new com.garmin.android.apps.connectmobile.settings.devices.wifi.e());
                    }
                }
                i2.a(a2.SETTINGS, "VerifyWiFiNetworkConnectivityOperation", "VerifyWiFiNetworkOperation - SendVerifyConnectionRequestTask:onResponseReceived. result=" + arrayList);
                oVar2.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, arrayList);
                aVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }

        public a() {
            super(o.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            o oVar = o.this;
            oVar.getClass();
            GDIWifiSetup.VerifyConnectionRequest.Builder builderNewBuilder = GDIWifiSetup.VerifyConnectionRequest.newBuilder();
            GDIWifiSetup.WifiSetupService.Builder builderNewBuilder2 = GDIWifiSetup.WifiSetupService.newBuilder();
            builderNewBuilder2.setVerifyConnectionRequest(builderNewBuilder.build());
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.setExtension(GDIWifiSetupExtension.wifiSetupService, builderNewBuilder2.build());
            GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
            i2.a(a2.SETTINGS, "VerifyWiFiNetworkConnectivityOperation", "VerifyWiFiNetworkOperation - SendVerifyConnectionRequestTask.executeTask. Smart=" + smartBuild);
            oVar.l();
            ((l80.b) KoinJavaComponent.get(l80.b.class)).c(smartBuild, oVar.f59776l, new C1277a());
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
            o.this.m();
        }
    }

    public o(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(aVar);
        this.f59776l = j8;
        b(new a());
    }
}
