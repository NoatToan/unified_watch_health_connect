package di1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ldi1/t;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceId", "", "requestId", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "requestMsg", "<init>", "(Landroid/content/Context;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends ProtobufRequestHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f59781c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mapbox.maps.renderer.e f59782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59783b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"di1/t$b", "Ld80/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements d80.b {
        public b() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            if (bVar != lj0.b.f112951e) {
                int i14 = t.f59781c;
                t.this.c();
            }
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            aVar.getClass();
            if (obj == null) {
                a(lj0.b.f112956j);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            int i14 = 0;
            while (true) {
                t tVar = t.this;
                if (i14 >= size) {
                    int i15 = t.f59781c;
                    tVar.c();
                    return;
                } else {
                    if (p005kotlin.jvm.internal.s.g(((u) arrayList.get(i14)).f59787c, "DEVICE")) {
                        Object obj2 = arrayList.get(i14);
                        obj2.getClass();
                        t.a((t) tVar.f59782a.f54611b, (u) obj2);
                        return;
                    }
                    i14++;
                }
            }
        }
    }

    static {
        new a(null);
    }

    public t(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        this.f59782a = new com.mapbox.maps.renderer.e(this, 10);
    }

    public static void a(t tVar, u uVar) {
        if (uVar != null) {
            WifiSetup.OAuthCredentials.Builder builderNewBuilder = WifiSetup.OAuthCredentials.newBuilder();
            b0 b0Var = uVar.f59785a;
            b0 b0Var2 = uVar.f59786b;
            b0Var.getClass();
            builderNewBuilder.setConsumerKey(b0Var.f59737a);
            builderNewBuilder.setConsumerSecret(b0Var.f59738b);
            b0Var2.getClass();
            builderNewBuilder.setOauthToken(b0Var2.f59737a);
            builderNewBuilder.setOauthSecret(b0Var2.f59738b);
            GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
            GDIWifiSetup.OAuthCredentialsResponse.Builder builderNewBuilder3 = GDIWifiSetup.OAuthCredentialsResponse.newBuilder();
            GDIWifiSetup.WifiSetupService.Builder builderNewBuilder4 = GDIWifiSetup.WifiSetupService.newBuilder();
            if (tVar.f59783b) {
                WifiSetup.WifiSetupAgent.Builder builderNewBuilder5 = WifiSetup.WifiSetupAgent.newBuilder();
                builderNewBuilder5.setCredentials(builderNewBuilder);
                builderNewBuilder5.setGcsLocation(zb1.b.a());
                builderNewBuilder3.setEncryptedWifiProtobuf(ByteString.copyFrom(p.b(tVar.deviceId, builderNewBuilder5.build().toByteArray())));
                builderNewBuilder4.setOauthCredentialsResponseWithAgentMsg(builderNewBuilder3);
                builderNewBuilder2.setExtension(GDIWifiSetupExtension.wifiSetupService, builderNewBuilder4.build());
            } else {
                builderNewBuilder3.setEncryptedWifiProtobuf(ByteString.copyFrom(p.b(tVar.deviceId, builderNewBuilder.build().toByteArray())));
                builderNewBuilder4.setOauthCredentialsResponse(builderNewBuilder3);
                builderNewBuilder2.setExtension(GDIWifiSetupExtension.wifiSetupService, builderNewBuilder4.build());
            }
            ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
            int i14 = tVar.requestId;
            long j8 = tVar.deviceId;
            GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
            smartBuild.getClass();
            protobufRequestManager.respondToRequest(i14, j8, smartBuild);
        }
    }

    public final void b() {
        String applicationKey;
        if (!hb2.i.a(this.contextRef.get())) {
            c();
            return;
        }
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    applicationKey = null;
                    break;
                }
                sd2.f fVar = (sd2.f) it.next();
                if (fVar.getUnitID() == this.deviceId) {
                    applicationKey = fVar.getApplicationKey();
                    break;
                }
            }
        } else {
            applicationKey = null;
            break;
        }
        if (applicationKey != null) {
            zb0.d dVarM = zb0.d.M();
            b bVar = new b();
            dVarM.getClass();
            d80.f.b bVar2 = new d80.f.b(new Object[]{applicationKey}, lj0.f.A);
            bVar2.f58273c = u.class;
            bVar2.f58274d = bVar;
            bVar2.f58275e = d80.g.JSON_ARRAY;
            bVar2.a().b();
        }
    }

    public final void c() {
        if (this.requestId == 1) {
            Object obj = this.f59782a.f54611b;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.f(a2Var, "WiFiOAuthRequestHandler", "WifiOauthRequestHandler run()");
        if (this.contextRef.get() == null) {
            i2.a.f(a2Var, "WiFiOAuthRequestHandler", "Aborting WifiOauthRequestHandler. Context is null.");
            return;
        }
        if (this.requestId == 1) {
            b();
            return;
        }
        GDIWifiSetup.WifiSetupService wifiSetupService = ProtoUtil.INSTANCE.getWifiSetupService(this.requestMsg);
        if (wifiSetupService != null && wifiSetupService.hasOauthCredentialsRequest()) {
            this.f59783b = false;
            b();
        } else {
            if (wifiSetupService == null || !wifiSetupService.hasOauthCredentialsRequestWithAgentMsg()) {
                return;
            }
            this.f59783b = true;
            b();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldi1/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "VERIFY_WIFI_CONNECTION_REQUEST_ID", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
