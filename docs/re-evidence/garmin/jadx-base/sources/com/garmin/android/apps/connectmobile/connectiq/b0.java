package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import com.garmin.proto.generated.GDIConnectIQInstalledAppsExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b0 f31822d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f31824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f31825c;

    public class a implements wm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f31826a;

        public a(b0 b0Var, e eVar) {
            this.f31826a = eVar;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            e eVar = this.f31826a;
            if (eVar != null) {
                new Handler(Looper.getMainLooper()).post(new a0(eVar, 1));
            }
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            e eVar = this.f31826a;
            if (eVar != null) {
                GDIConnectIQInstalledApps.ConnectIQInstalledAppsService connectIQInstalledAppsServiceC = b0.c(smart);
                if (connectIQInstalledAppsServiceC == null || !connectIQInstalledAppsServiceC.hasDeleteAppResponse()) {
                    new Handler(Looper.getMainLooper()).post(new a0(eVar, 1));
                } else if (connectIQInstalledAppsServiceC.getDeleteAppResponse().getStatus() == GDIConnectIQInstalledApps.DeleteAppResponse.Status.OK) {
                    new Handler(Looper.getMainLooper()).post(new a0(eVar, 0));
                } else {
                    new Handler(Looper.getMainLooper()).post(new a0(eVar, 1));
                }
            }
        }
    }

    public class b implements wm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31827a;

        public b(g gVar) {
            this.f31827a = gVar;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            g gVar = this.f31827a;
            if (gVar != null) {
                new Handler(Looper.getMainLooper()).post(new cd0.h0(gVar, 7));
            }
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            GDIConnectIQInstalledApps.ConnectIQInstalledAppsService connectIQInstalledAppsServiceC;
            g gVar = this.f31827a;
            if (gVar == null || (connectIQInstalledAppsServiceC = b0.c(smart)) == null || !connectIQInstalledAppsServiceC.hasGetInstalledAppsResponse()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new at0.c(this, gVar, connectIQInstalledAppsServiceC.getGetInstalledAppsResponse(), smart, 1));
        }
    }

    public class c implements wm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f31829a;

        public c(b0 b0Var, k kVar) {
            this.f31829a = kVar;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            k kVar = this.f31829a;
            if (kVar != null) {
                new Handler(Looper.getMainLooper()).post(new c0(kVar, 0));
            }
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            GDIConnectIQInstalledApps.ConnectIQInstalledAppsService connectIQInstalledAppsServiceC;
            k kVar = this.f31829a;
            if (kVar == null || (connectIQInstalledAppsServiceC = b0.c(smart)) == null || !connectIQInstalledAppsServiceC.hasUpdateInstalledAppResponse()) {
                return;
            }
            if (connectIQInstalledAppsServiceC.getUpdateInstalledAppResponse().getStatus() == GDIConnectIQInstalledApps.UpdateInstalledAppsResponse.Status.OK) {
                new Handler(Looper.getMainLooper()).post(new c0(kVar, 1));
            } else {
                new Handler(Looper.getMainLooper()).post(new c0(kVar, 0));
            }
        }
    }

    public class d implements wm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f31831b;

        public d(b0 b0Var, f fVar, int i14) {
            this.f31830a = fVar;
            this.f31831b = i14;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            f fVar = this.f31830a;
            if (fVar != null) {
                new Handler(Looper.getMainLooper()).post(new f0(fVar, this.f31831b, 2));
            }
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            GDIConnectIQInstalledApps.ConnectIQInstalledAppsService connectIQInstalledAppsServiceC;
            f fVar = this.f31830a;
            if (fVar == null || (connectIQInstalledAppsServiceC = b0.c(smart)) == null || !connectIQInstalledAppsServiceC.hasEnableNativeAppResponse()) {
                return;
            }
            GDIConnectIQInstalledApps.EnableNativeAppResponse enableNativeAppResponse = connectIQInstalledAppsServiceC.getEnableNativeAppResponse();
            GDIConnectIQInstalledApps.EnableNativeAppResponse.Status status = enableNativeAppResponse.getStatus();
            GDIConnectIQInstalledApps.EnableNativeAppResponse.Status status2 = GDIConnectIQInstalledApps.EnableNativeAppResponse.Status.OK;
            int i15 = this.f31831b;
            if (status == status2) {
                new Handler(Looper.getMainLooper()).post(new f0(fVar, i15, 0));
            } else {
                new Handler(Looper.getMainLooper()).post(new f0(fVar, i15, enableNativeAppResponse.getStatus().name()));
            }
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
        void a(long j8, long j14, ArrayList arrayList);

        void b();
    }

    public interface h {
    }

    public interface i {
        void a();

        void b(byte[] bArr);
    }

    public interface j {
        void a();

        void b();
    }

    public interface k {
        void K3();

        void R7();
    }

    public b0(long j8) {
        this.f31825c = new byte[0];
        this.f31823a = j8;
    }

    public static GDIConnectIQInstalledApps.ConnectIQInstalledAppsService c(GDISmartProto.SmartOrBuilder smartOrBuilder) {
        if (smartOrBuilder == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQInstalledApps.ConnectIQInstalledAppsService> generatedExtension = GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService;
        if (smartOrBuilder.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return (GDIConnectIQInstalledApps.ConnectIQInstalledAppsService) smartOrBuilder.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        }
        return null;
    }

    public static b0 e() {
        if (f31822d == null) {
            f31822d = new b0();
        }
        return f31822d;
    }

    public final void a(UUID uuid, GDIConnectIQInstalledApps.AppType appType, e eVar) {
        i2.d("ConnectIQRequestManager", "#deleteApp " + appType.toString() + ", " + uuid.toString());
        GDIConnectIQInstalledApps.DeleteAppRequest.Builder builderNewBuilder = GDIConnectIQInstalledApps.DeleteAppRequest.newBuilder();
        builderNewBuilder.setStoreAppId(ByteString.copyFrom(p0.d(uuid)));
        builderNewBuilder.setAppType(appType);
        GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.Builder builderNewBuilder2 = GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.newBuilder();
        builderNewBuilder2.setDeleteAppRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), this.f31823a, new a(this, eVar));
    }

    public final void b(int i14, GDIConnectIQInstalledApps.AppType appType, UUID uuid, f fVar) {
        i2.d("ConnectIQRequestManager", "#enableNativeItem " + appType.toString() + ", " + uuid.toString());
        GDIConnectIQInstalledApps.EnableNativeAppRequest.Builder builderNewBuilder = GDIConnectIQInstalledApps.EnableNativeAppRequest.newBuilder();
        builderNewBuilder.setAppType(appType);
        builderNewBuilder.setNativeAppId(i14);
        builderNewBuilder.setAppId(ByteString.copyFrom(p0.d(uuid)));
        GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.Builder builderNewBuilder2 = GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.newBuilder();
        builderNewBuilder2.setEnableNativeAppRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), this.f31823a, new d(this, fVar, i14));
    }

    public final void d(GDIConnectIQInstalledApps.AppType appType, g gVar) {
        i2.d("ConnectIQRequestManager", "#getInstalledItems " + appType.toString());
        GDIConnectIQInstalledApps.GetInstalledAppsRequest.Builder builderNewBuilder = GDIConnectIQInstalledApps.GetInstalledAppsRequest.newBuilder();
        builderNewBuilder.setAppType(appType);
        GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.Builder builderNewBuilder2 = GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.newBuilder();
        builderNewBuilder2.setGetInstalledAppsRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), this.f31823a, new b(gVar));
    }

    public final void f(List<com.garmin.android.apps.connectmobile.connectiq.e> list, GDIConnectIQInstalledApps.AppType appType, k kVar) {
        i2.d("ConnectIQRequestManager", "#updateInstalledItems " + appType.toString() + StringUtils.SPACE + list.size());
        GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.Builder builderNewBuilder = GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.newBuilder();
        for (com.garmin.android.apps.connectmobile.connectiq.e eVar : list) {
            GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledApp.Builder builderNewBuilder2 = GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledApp.newBuilder();
            builderNewBuilder2.setAppType(appType);
            builderNewBuilder2.setAppId(ByteString.copyFrom(p0.d(eVar.f31857a)));
            builderNewBuilder2.setDisabled(eVar.f31860d);
            builderNewBuilder2.setFavorite(eVar.f31863g);
            builderNewBuilder.addInstalledApp(builderNewBuilder2.build());
        }
        GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.Builder builderNewBuilder3 = GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.newBuilder();
        builderNewBuilder3.setUpdateInstalledAppRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder4 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder4.setExtension(GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService, builderNewBuilder3.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder4.build(), this.f31823a, new c(this, kVar));
    }

    public b0() {
        this.f31825c = new byte[0];
    }
}
