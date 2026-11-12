package gn2;

import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler$fetchDeviceCredentialAndStoreNetworks$2", f = "WifiDataHandler.kt", l = {449, 475}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd2.a f78113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f78114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<WifiSetup.StoredAccessPoint> f78115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.a f78116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, cd2.a aVar, String str, List<WifiSetup.StoredAccessPoint> list, zi2.a aVar2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f78112b = cVar;
        this.f78113c = aVar;
        this.f78114d = str;
        this.f78115e = list;
        this.f78116f = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f78112b, this.f78113c, this.f78114d, this.f78115e, this.f78116f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0278  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0 A[LOOP:1: B:37:0x00da->B:39:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x026e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0274  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r14 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        if (r14 == r0) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00e0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, java.lang.String] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WifiSetup.OAuthCredentials.Builder builder;
        List<WifiSetup.StoredAccessPoint> list;
        WifiSetup.WifiSetupAgent.Builder gcsLocation;
        rs2.c cVar;
        GDISmartProto.Smart smartA;
        r0 r0Var;
        rs2.c cVar2;
        dt2.g gVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78111a;
        c cVar3 = this.f78112b;
        if (i14 == 0) {
            r.b(obj);
            List<WifiSetup.ServerCredentialType> listT = h0.T(cVar3.f78100l);
            if (listT.isEmpty()) {
                listT = c.f78093q;
            }
            List<WifiSetup.ServerCredentialType> list2 = listT;
            if (list2.contains(WifiSetup.ServerCredentialType.NONE) && list2.size() > 1) {
                cVar3.m().a(null, "Ignoring NONE type since other types present ".concat(h0.k0(list2, null, null, null, null, 63)));
            }
            if (list2.contains(WifiSetup.ServerCredentialType.CONNECT_OAUTH1)) {
                cd2.a aVar2 = this.f78113c;
                if (aVar2 == null) {
                    vb.h.z(this.f78114d);
                    return null;
                }
                this.f78111a = 1;
                obj = c.c(cVar3, aVar2, this);
            } else {
                builder = null;
                WifiSetup.WifiSetupAgent.Builder builderNewBuilder = WifiSetup.WifiSetupAgent.newBuilder();
                list = this.f78115e;
                gcsLocation = builderNewBuilder.addAllStoredAps(list).setGcsLocation(c.d(cVar3, this.f78116f));
                if (builder != null) {
                    gcsLocation.setCredentials(builder);
                }
                cVar = cVar3.f78099k;
                if (cVar != null) {
                    s.m("deviceInfo");
                    throw null;
                }
                smartA = uu2.a.a(GDIWifiSetup.WifiSetupService.newBuilder().setUpdateAccessPointRequest(GDIWifiSetup.UpdateAccessPointRequest.newBuilder().setEncryptedWifiProtobuf(ByteString.copyFrom(b.b(cVar.getF92746j(), gcsLocation.build().toByteArray())))));
                smartA.getClass();
                r0Var = new r0();
                cVar2 = cVar3.f78099k;
                if (cVar2 != null) {
                    s.m("deviceInfo");
                    throw null;
                }
                r0Var.f105810a = am.j.m("fetchDeviceCredentialAndStoreNetworks: sending proto to ", cVar2.getF92742f(), " to store ->");
                for (WifiSetup.StoredAccessPoint storedAccessPoint : list) {
                    r0Var.f105810a = r0Var.f105810a + "\n  " + storedAccessPoint.getSsid();
                }
                cVar3.m().debug((String) r0Var.f105810a);
                gVar = cVar3.f78098j;
                if (gVar != null) {
                    s.m("messenger");
                    throw null;
                }
                this.f78111a = 2;
                obj = gVar.b(smartA, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        GDIWifiSetup.WifiSetupService wifiSetupServiceB = uu2.a.b((GDISmartProto.Smart) obj);
        if (wifiSetupServiceB == null) {
            rs2.c cVar4 = cVar3.f78099k;
            if (cVar4 != null) {
                e0.n(am.j.m("fetchDeviceCredentialAndStoreNetworks: ", cVar4.getF92742f(), " response missing 'WifiSetupService'"));
                return null;
            }
            s.m("deviceInfo");
            throw null;
        }
        if (!wifiSetupServiceB.hasUpdateAccessPointResponse()) {
            rs2.c cVar5 = cVar3.f78099k;
            if (cVar5 != null) {
                e0.n(am.j.m("fetchDeviceCredentialAndStoreNetworks: ", cVar5.getF92742f(), " response missing 'UpdateAccessPointResponse'"));
                return null;
            }
            s.m("deviceInfo");
            throw null;
        }
        GDIWifiSetup.UpdateAccessPointResponse updateAccessPointResponse = wifiSetupServiceB.getUpdateAccessPointResponse();
        updateAccessPointResponse.getClass();
        List<WifiSetup.ServerCredentialType> list3 = c.f78093q;
        cVar3.getClass();
        StringBuilder sb3 = new StringBuilder("handleUpdateAccessPointResponse: ");
        boolean zHasEncryptedWifiProtobuf = updateAccessPointResponse.hasEncryptedWifiProtobuf();
        rs2.c cVar6 = cVar3.f78099k;
        if (!zHasEncryptedWifiProtobuf) {
            if (cVar6 == null) {
                s.m("deviceInfo");
                throw null;
            }
            sb3.append(cVar6.getF92742f() + " sent proto missing 'encryptedWifiProtobuf' message");
            String string = sb3.toString();
            cVar3.m().error(string, null);
            e0.n(string);
            return null;
        }
        if (cVar6 == null) {
            s.m("deviceInfo");
            throw null;
        }
        WifiSetup.WifiSetupDevice from = WifiSetup.WifiSetupDevice.parseFrom(b.a(cVar6.getF92746j(), updateAccessPointResponse.getEncryptedWifiProtobuf().toByteArray()));
        int size = from.getStoredApsList().size();
        rs2.c cVar7 = cVar3.f78099k;
        if (cVar7 == null) {
            s.m("deviceInfo");
            throw null;
        }
        sb3.append(cVar7.getF92742f() + " reports " + size + " stored access points");
        if (size > 0) {
            sb3.append(" ->");
            List<WifiSetup.StoredAccessPoint> storedApsList = from.getStoredApsList();
            storedApsList.getClass();
            for (WifiSetup.StoredAccessPoint storedAccessPoint2 : storedApsList) {
                sb3.append("\n  ssid=");
                if (storedAccessPoint2.hasSsid()) {
                    sb3.append(storedAccessPoint2.getSsid());
                } else {
                    sb3.append("");
                }
                sb3.append(", security_type=");
                if (storedAccessPoint2.hasSecurityType()) {
                    sb3.append(storedAccessPoint2.getSecurityType().name());
                } else {
                    sb3.append("");
                }
                sb3.append(", status_type=");
                if (storedAccessPoint2.hasStatusType()) {
                    sb3.append(storedAccessPoint2.getStatusType().name());
                } else {
                    sb3.append("");
                }
            }
            cVar3.m().debug(sb3.toString());
        } else {
            cVar3.m().a(null, sb3.toString());
        }
        return Unit.INSTANCE;
        builder = (WifiSetup.OAuthCredentials.Builder) obj;
        WifiSetup.WifiSetupAgent.Builder builderNewBuilder2 = WifiSetup.WifiSetupAgent.newBuilder();
        list = this.f78115e;
        gcsLocation = builderNewBuilder2.addAllStoredAps(list).setGcsLocation(c.d(cVar3, this.f78116f));
        if (builder != null) {
            gcsLocation.setCredentials(builder);
        }
        cVar = cVar3.f78099k;
        if (cVar != null) {
            s.m("deviceInfo");
            throw null;
        }
        smartA = uu2.a.a(GDIWifiSetup.WifiSetupService.newBuilder().setUpdateAccessPointRequest(GDIWifiSetup.UpdateAccessPointRequest.newBuilder().setEncryptedWifiProtobuf(ByteString.copyFrom(b.b(cVar.getF92746j(), gcsLocation.build().toByteArray())))));
        smartA.getClass();
        r0Var = new r0();
        cVar2 = cVar3.f78099k;
        if (cVar2 != null) {
            s.m("deviceInfo");
            throw null;
        }
        r0Var.f105810a = am.j.m("fetchDeviceCredentialAndStoreNetworks: sending proto to ", cVar2.getF92742f(), " to store ->");
        while (r2.hasNext()) {
            r0Var.f105810a = r0Var.f105810a + "\n  " + storedAccessPoint.getSsid();
        }
        cVar3.m().debug((String) r0Var.f105810a);
        gVar = cVar3.f78098j;
        if (gVar != null) {
            s.m("messenger");
            throw null;
        }
        this.f78111a = 2;
        obj = gVar.b(smartA, this);
    }
}
