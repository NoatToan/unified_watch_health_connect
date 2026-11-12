package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import di1.s;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class j extends s<e> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f43312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k.c f43313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f43314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f43315r;

    public class a extends com.garmin.android.library.backgroundtaskmanagement.d {
        public a() {
            super(j.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            j jVar = j.this;
            long j8 = jVar.f59776l;
            String str = jVar.f43312o;
            k.c cVar = jVar.f43313p;
            String str2 = jVar.f43314q;
            boolean z14 = jVar.f43315r;
            WifiSetup.StoredAccessPoint.Builder builderNewBuilder = WifiSetup.StoredAccessPoint.newBuilder();
            builderNewBuilder.setSsid(str);
            k.f43319i.getClass();
            builderNewBuilder.setSecurityType(k.b.b(cVar));
            if (TextUtils.isEmpty(str2)) {
                builderNewBuilder.setPasswordLen(0);
            } else {
                builderNewBuilder.setPassword(ByteString.copyFrom(str2.getBytes()));
                builderNewBuilder.setPasswordLen(str2.length());
            }
            builderNewBuilder.setPasswordIsHex(z14);
            WifiSetup.OAuthCredentials.Builder builderNewBuilder2 = WifiSetup.OAuthCredentials.newBuilder();
            dd2.b bVarB = ((f12.b) KoinJavaComponent.get(f12.b.class)).b();
            sc2.j jVarD = ((f12.b) KoinJavaComponent.get(f12.b.class)).d();
            builderNewBuilder2.setConsumerKey(bVarB.f59210a);
            builderNewBuilder2.setConsumerSecret(bVarB.f59211b);
            builderNewBuilder2.setOauthToken(jVarD.f158514a);
            builderNewBuilder2.setOauthSecret(jVarD.f158515b);
            WifiSetup.WifiSetupAgent.Builder builderNewBuilder3 = WifiSetup.WifiSetupAgent.newBuilder();
            builderNewBuilder3.setCredentials(builderNewBuilder2);
            builderNewBuilder3.addStoredAps(builderNewBuilder);
            builderNewBuilder3.setGcsLocation(zb1.b.a());
            byte[] bArrB = di1.p.b(j8, builderNewBuilder3.build().toByteArray());
            GDIWifiSetup.StoreAccessPointNotification.Builder builderNewBuilder4 = GDIWifiSetup.StoreAccessPointNotification.newBuilder();
            builderNewBuilder4.setEncryptedWifiProtobuf(ByteString.copyFrom(bArrB));
            GDIWifiSetup.WifiSetupService.Builder builderNewBuilder5 = GDIWifiSetup.WifiSetupService.newBuilder();
            builderNewBuilder5.setStoreAccessPointNotification(builderNewBuilder4);
            GDISmartProto.Smart.Builder builderNewBuilder6 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder6.setExtension(GDIWifiSetupExtension.wifiSetupService, builderNewBuilder5.build());
            GDISmartProto.Smart smartBuild = builderNewBuilder6.build();
            StringBuilder sb3 = new StringBuilder("hasWifiSetupService()=");
            GDIWifiSetup.WifiSetupService wifiSetupService = ProtoUtil.getWifiSetupService(smartBuild);
            sb3.append(wifiSetupService != null);
            if (wifiSetupService != null) {
                sb3.append("; hasAccessPointScanRequest()=");
                sb3.append(wifiSetupService.hasAccessPointScanRequest());
                sb3.append("; hasStoreAccessPointNotification()=");
                sb3.append(wifiSetupService.hasStoreAccessPointNotification());
                sb3.append("; hasVerifyConnectionRequest()=");
                sb3.append(wifiSetupService.hasVerifyConnectionRequest());
            }
            i2.a(a2.SETTINGS, "StoreWiFiNetworkOperation", "StoreWiFiNetworkOperation - SendStoreAccessPointNotificationTask:executeTask. Smart=" + smartBuild + "; " + sb3.toString());
            jVar.l();
            ((l80.b) KoinJavaComponent.get(l80.b.class)).s(smartBuild, jVar.f59776l);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            jVar.b(jVar.new b());
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
            j.this.m();
        }
    }

    public class b extends com.garmin.android.library.backgroundtaskmanagement.d {

        public class a implements wm2.b {
            public a() {
            }

            @Override // wm2.b
            public final void onResponseFailed(int i14) {
                b bVar = b.this;
                j.this.m();
                j jVar = j.this;
                e eVar = new e(jVar.f43312o, jVar.f43313p, e.f43291d);
                i2.a(a2.SETTINGS, "StoreWiFiNetworkOperation", "StoreWiFiNetworkOperation - SendVerifyConnectionRequestTask:onResponseFailed. result=" + eVar);
                jVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, eVar);
                bVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x003c  */
            @Override // wm2.b
            public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                WifiSetup.WifiSetupDevice from;
                i2.a(a2.SETTINGS, "StoreWiFiNetworkOperation", "StoreWiFiNetworkOperation - SendVerifyConnectionRequestTask:onResponseReceived");
                b bVar = b.this;
                j jVar = j.this;
                j jVar2 = j.this;
                jVar.m();
                GDIWifiSetup.WifiSetupService wifiSetupService = ProtoUtil.getWifiSetupService(smart);
                e eVar = null;
                if (wifiSetupService == null || !wifiSetupService.hasVerifyConnectionResponse()) {
                    from = null;
                } else {
                    GDIWifiSetup.VerifyConnectionResponse verifyConnectionResponse = wifiSetupService.getVerifyConnectionResponse();
                    if (verifyConnectionResponse.hasEncryptedWifiProtobuf()) {
                        try {
                            from = WifiSetup.WifiSetupDevice.parseFrom(di1.p.a(jVar2.f59776l, verifyConnectionResponse.getEncryptedWifiProtobuf().toByteArray()));
                        } catch (InvalidProtocolBufferException unused) {
                            from = null;
                        }
                    } else {
                        from = null;
                    }
                }
                if (from != null && from.getStoredApsCount() > 0) {
                    for (WifiSetup.StoredAccessPoint storedAccessPoint : from.getStoredApsList()) {
                        if (storedAccessPoint.getSsid().equals(jVar2.f43312o)) {
                            eVar = new e(storedAccessPoint);
                            break;
                        }
                    }
                }
                if (eVar == null) {
                    eVar = new e(jVar2.f43312o, jVar2.f43313p, e.f43291d);
                }
                i2.a(a2.SETTINGS, "StoreWiFiNetworkOperation", "StoreWiFiNetworkOperation - SendVerifyConnectionRequestTask:onResponseReceived. result=" + eVar);
                jVar2.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, eVar);
                bVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }

        public b() {
            super(j.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            j jVar = j.this;
            jVar.getClass();
            GDIWifiSetup.VerifyConnectionRequest.Builder builderNewBuilder = GDIWifiSetup.VerifyConnectionRequest.newBuilder();
            GDIWifiSetup.WifiSetupService.Builder builderNewBuilder2 = GDIWifiSetup.WifiSetupService.newBuilder();
            builderNewBuilder2.setVerifyConnectionRequest(builderNewBuilder.build());
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.setExtension(GDIWifiSetupExtension.wifiSetupService, builderNewBuilder2.build());
            GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
            i2.a(a2.SETTINGS, "StoreWiFiNetworkOperation", "StoreWiFiNetworkOperation - SendVerifyConnectionRequestTask.executeTask. Smart=" + smartBuild);
            ((l80.b) KoinJavaComponent.get(l80.b.class)).c(smartBuild, jVar.f59776l, new a());
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
            j.this.m();
        }
    }

    public j(long j8, String str, k.c cVar, String str2, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(aVar);
        this.f43315r = false;
        this.f59776l = j8;
        this.f43312o = str;
        this.f43313p = cVar;
        this.f43314q = str2;
        k.f43319i.getClass();
        this.f43315r = hd0.a.a(str2, k.b.b(cVar));
        b(new a());
    }

    public j(long j8, String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        this(j8, str, k.c.OPEN, null, aVar);
    }
}
