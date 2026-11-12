package gn2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.w;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014BI\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012&\b\u0002\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, d2 = {"Lgn2/c;", "Lgn2/a;", "Landroid/content/Context;", "appContext", "Lgn2/c$c;", "delegate", "Lt13/g;", "coroutineContext", "Lkotlin/Function2;", "Lcd2/a;", "Lt13/d;", "Ldd2/c;", "", "gcOAuth1CredentialFetcher", "<init>", "(Landroid/content/Context;Lgn2/c$c;Lt13/g;Le23/p;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lgn2/c$c;)V", "c", "d", "b", "wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends gn2.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List<WifiSetup.ServerCredentialType> f78093q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1576c f78094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.p<cd2.a, t13.d<? super dd2.c>, Object> f78095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f78096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u53.d f78097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dt2.g f78098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public rs2.c f78099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<? extends WifiSetup.ServerCredentialType> f78100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f78101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o53.k f78102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o53.k f78103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set<Integer> f78104p;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcd2/a;", "it", "Ldd2/c;", "<anonymous>", "(Lcd2/a;)Ldd2/c;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.wifi.WifiDataHandler$1", f = "WifiDataHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<cd2.a, t13.d<? super dd2.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f78105a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f78105a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(cd2.a aVar, t13.d<? super dd2.c> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return ((cd2.a) this.f78105a).a();
        }
    }

    /* JADX INFO: renamed from: gn2.c$c, reason: collision with other inner class name */
    public interface InterfaceC1576c extends xc2.a<zi2.a>, xc2.b {
        @o13.e
        dd2.c b();
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78110a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zi2.a.STAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f78110a = iArr;
        }
    }

    static {
        new b(null);
        f78093q = w.c(WifiSetup.ServerCredentialType.CONNECT_OAUTH1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, InterfaceC1576c interfaceC1576c, t13.g gVar, e23.p<? super cd2.a, ? super t13.d<? super dd2.c>, ? extends Object> pVar) {
        super(context, gVar);
        context.getClass();
        interfaceC1576c.getClass();
        gVar.getClass();
        pVar.getClass();
        this.f78094f = interfaceC1576c;
        this.f78095g = pVar;
        this.f78096h = o13.m.b(new g12.m(29));
        this.f78100l = f78093q;
        this.f78104p = a1.b(50);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(c cVar, cd2.a aVar, v13.c cVar2) {
        gn2.e eVar;
        cVar.getClass();
        if (cVar2 instanceof gn2.e) {
            eVar = (gn2.e) cVar2;
            int i14 = eVar.f78119c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f78119c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new gn2.e(cVar, cVar2);
            }
        } else {
            eVar = new gn2.e(cVar, cVar2);
        }
        Object objInvoke = eVar.f78117a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f78119c;
        try {
            if (i15 == 0) {
                r.b(objInvoke);
                e23.p<cd2.a, t13.d<? super dd2.c>, Object> pVar = cVar.f78095g;
                eVar.f78119c = 1;
                objInvoke = pVar.invoke(aVar, eVar);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objInvoke);
            }
            dd2.c cVar3 = (dd2.c) objInvoke;
            if (cVar3 == null) {
                return null;
            }
            return WifiSetup.OAuthCredentials.newBuilder().setConsumerKey(cVar3.f59214c).setConsumerSecret(cVar3.f59215d).setOauthToken(cVar3.f59212a).setOauthSecret(cVar3.f59213b);
        } catch (Exception e4) {
            cVar.m().error("Failed fetchOAuth1GC " + e4.getMessage(), e4);
            return null;
        }
    }

    public static final WifiSetup.GcsLocationType d(c cVar, zi2.a aVar) {
        cVar.getClass();
        int i14 = e.f78110a[aVar.ordinal()];
        if (i14 == 1) {
            return WifiSetup.GcsLocationType.PRODUCTION;
        }
        if (i14 == 2 || i14 == 3) {
            return WifiSetup.GcsLocationType.CHINA;
        }
        return i14 != 4 ? WifiSetup.GcsLocationType.TEST : WifiSetup.GcsLocationType.STAGE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        c0.d(l(), "WifiDataHandler closed");
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        GDIWifiSetupExtension.registerAllExtensions(extensionRegistryLite);
        GDIWifiSetup.registerAllExtensions(extensionRegistryLite);
        builder.setExtension(GDIWifiSetup.CapabilitiesRequest.wifiSetupRequest, GDIWifiSetup.CapabilitiesRequest.newBuilder().setServiceVersion(3).build());
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f78104p;
    }

    public final b0 l() {
        u53.d dVar = this.f78097i;
        if (dVar != null) {
            return dVar;
        }
        s.m("coroutineScope");
        throw null;
    }

    public final zy2.k m() {
        return (zy2.k) this.f78096h.getValue();
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        GDIWifiSetup.WifiSetupService wifiSetupServiceB = uu2.a.b(smart);
        if (wifiSetupServiceB == null) {
            return false;
        }
        if (wifiSetupServiceB.hasConnectionVerificationStatusNotification()) {
            GDIWifiSetup.ConnectionVerificationStatusNotification connectionVerificationStatusNotification = wifiSetupServiceB.getConnectionVerificationStatusNotification();
            connectionVerificationStatusNotification.getClass();
            String str = this.f78101m;
            if (str == null) {
                m().a(null, "handleConnectionVerificationStatusNotification: 'testNetworkConnectionSsid' is null");
                return true;
            }
            o53.k kVar2 = this.f78102n;
            if (kVar2 == null) {
                m().a(null, "handleConnectionVerificationStatusNotification: 'testNetworkConnectionContinuation' is null");
                return true;
            }
            ge1.b.T(l(), null, null, new f(connectionVerificationStatusNotification, this, kVar2, str, null), 3);
            return true;
        }
        if (!wifiSetupServiceB.hasAccessPointScanCompleteNotification()) {
            if (!wifiSetupServiceB.hasMobileCarrierInfoRequest()) {
                return false;
            }
            ge1.b.T(l(), null, null, new g(this, kVar, null), 3);
            return true;
        }
        GDIWifiSetup.AccessPointScanCompleteNotification accessPointScanCompleteNotification = wifiSetupServiceB.getAccessPointScanCompleteNotification();
        accessPointScanCompleteNotification.getClass();
        o53.k kVar3 = this.f78103o;
        if (kVar3 == null) {
            m().a(null, "handleScanCompleteNotification: 'scanContinuation' is null");
            return true;
        }
        ge1.b.T(l(), null, null, new h(accessPointScanCompleteNotification, this, kVar3, null), 3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(v13.c cVar) {
        i iVar;
        GDIWifiSetup.StoredAccessPointResponse accessPointResponse;
        List<WifiSetup.SecurityType> allowedSecurityTypesList;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f78132c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f78132c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f78130a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f78132c;
        if (i15 == 0) {
            r.b(objB);
            zy2.k kVarM = m();
            rs2.c cVar2 = this.f78099k;
            if (cVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            kVarM.debug("retrieveNetworks: using " + cVar2.getF92742f());
            GDISmartProto.Smart smartA = uu2.a.a(GDIWifiSetup.WifiSetupService.newBuilder().setAccessPointRequest(GDIWifiSetup.StoredAccessPointRequest.newBuilder().build()));
            smartA.getClass();
            dt2.g gVar = this.f78098j;
            if (gVar == null) {
                s.m("messenger");
                throw null;
            }
            iVar.f78132c = 1;
            objB = gVar.b(smartA, iVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        GDIWifiSetup.WifiSetupService wifiSetupServiceB = uu2.a.b((GDISmartProto.Smart) objB);
        if (wifiSetupServiceB != null) {
            if (!wifiSetupServiceB.hasAccessPointResponse()) {
                wifiSetupServiceB = null;
            }
            if (wifiSetupServiceB != null && (accessPointResponse = wifiSetupServiceB.getAccessPointResponse()) != null) {
                if (!accessPointResponse.hasEncryptedWifiProtobuf()) {
                    accessPointResponse = null;
                }
                if (accessPointResponse != null) {
                    byte[] byteArray = accessPointResponse.getEncryptedWifiProtobuf().toByteArray();
                    rs2.c cVar3 = this.f78099k;
                    if (cVar3 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    WifiSetup.WifiSetupDevice from = WifiSetup.WifiSetupDevice.parseFrom(gn2.b.a(cVar3.getF92746j(), byteArray));
                    if (from != null) {
                        List<WifiSetup.ServerCredentialType> credentialsTypesList = from.getCredentialsTypesList();
                        credentialsTypesList.getClass();
                        this.f78100l = credentialsTypesList;
                        int maxAccessPoints = (from.hasLimits() && from.getLimits().hasMaxAccessPoints()) ? from.getLimits().getMaxAccessPoints() : 7;
                        List<WifiSetup.ScannedAccessPoint> scannedApsList = from.getScannedApsList();
                        ArrayList arrayListL = androidx.core.view.j.l(scannedApsList);
                        for (Object obj : scannedApsList) {
                            String ssid = ((WifiSetup.ScannedAccessPoint) obj).getSsid();
                            if (ssid != null && ssid.length() != 0) {
                                arrayListL.add(obj);
                            }
                        }
                        List<WifiSetup.StoredAccessPoint> storedApsList = from.getStoredApsList();
                        ArrayList arrayListL2 = androidx.core.view.j.l(storedApsList);
                        for (Object obj2 : storedApsList) {
                            String ssid2 = ((WifiSetup.StoredAccessPoint) obj2).getSsid();
                            if (ssid2 != null && ssid2.length() != 0) {
                                arrayListL2.add(obj2);
                            }
                        }
                        WifiSetup.Limits limits = from.getLimits();
                        limits.getClass();
                        if (limits.getAllowedSecurityTypesList().isEmpty()) {
                            gn2.a.f78088d.getClass();
                            allowedSecurityTypesList = gn2.a.f78089e;
                        } else {
                            allowedSecurityTypesList = limits.getAllowedSecurityTypesList();
                            allowedSecurityTypesList.getClass();
                        }
                        return new d(maxAccessPoints, arrayListL, arrayListL2, allowedSecurityTypesList);
                    }
                }
            }
        }
        rs2.c cVar4 = this.f78099k;
        if (cVar4 != null) {
            throw new IllegalStateException(fb1.c.n("failed to retrieve stored networks from ", cVar4.getF92742f()));
        }
        s.m("deviceInfo");
        throw null;
    }

    public final Object q(v13.c cVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(cVar), 1);
        kVar.q();
        zy2.k kVarM = m();
        rs2.c cVar2 = this.f78099k;
        if (cVar2 == null) {
            s.m("deviceInfo");
            throw null;
        }
        kVarM.debug("scan: using " + cVar2.getF92742f());
        this.f78103o = kVar;
        kVar.r(new j(this));
        GDISmartProto.Smart smartA = uu2.a.a(GDIWifiSetup.WifiSetupService.newBuilder().setAccessPointStartScanNotification(GDIWifiSetup.AccessPointStartScanNotification.newBuilder()));
        smartA.getClass();
        ge1.b.T(l(), null, null, new k(this, smartA, kVar, null), 3);
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @o13.e
    public final Object r(String str, List list, v13.c cVar) throws Exception {
        m mVar;
        InterfaceC1576c interfaceC1576c = this.f78094f;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f78144c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f78144c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object obj = mVar2.f78142a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar2.f78144c;
        try {
            if (i15 == 0) {
                r.b(obj);
                dd2.c cVarB = interfaceC1576c.b();
                if (d53.w.J(str)) {
                    throw new IllegalStateException("'applicationKey' is blank");
                }
                m().debug("storeNetworks: will use oAuth1GC");
                zi2.a aVarA = interfaceC1576c.a();
                if (aVarA == null) {
                    throw new IllegalStateException("delegate provided null 'connectEnvironment'");
                }
                rs2.c cVar2 = this.f78099k;
                if (cVar2 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                cd2.a aVar = new cd2.a(cVar2.getF92746j(), null, aVarA, null, cVarB, str, 10, null);
                mVar2.f78144c = 1;
                x53.c cVar3 = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new gn2.d(this, aVar, "delegate provided null 'oAuth1Credential'", list, aVarA, null), mVar2);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            m().error("storeNetworks", e4);
            throw e4;
        }
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIWifiSetup.CapabilitiesResponse> generatedExtension = GDIWifiSetup.CapabilitiesResponse.wifiSetupResponse;
        if (featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r0 == r8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(List list, v13.c cVar) throws Exception {
        l lVar;
        List list2;
        Object objE;
        cd2.a aVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f78141d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f78141d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object obj = lVar2.f78139b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar2.f78141d;
        InterfaceC1576c interfaceC1576c = this.f78094f;
        try {
            if (i15 == 0) {
                r.b(obj);
                m().debug("storeNetworks: will use oAuth2DI if needed");
                list2 = list;
                lVar2.f78138a = list2;
                lVar2.f78141d = 1;
                objE = interfaceC1576c.e(lVar2);
                if (objE == aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                List list3 = lVar2.f78138a;
                r.b(obj);
                objE = obj;
                list2 = list3;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            String str = (String) objE;
            zi2.a aVarA = interfaceC1576c.a();
            if (aVarA == null) {
                throw new IllegalStateException("delegate provided null 'connectEnvironment'");
            }
            if (str != null) {
                rs2.c cVar2 = this.f78099k;
                if (cVar2 == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                aVar = new cd2.a(cVar2.getF92746j(), cd2.a.C0412a.EnumC0413a.DEVICE, aVarA, str, null, null, 48, null);
            } else {
                aVar = null;
            }
            lVar2.f78138a = null;
            lVar2.f78141d = 2;
            x53.c cVar3 = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new gn2.d(this, aVar, "delegate provided null 'oAuth2DIBearerToken'", list2, aVarA, null), lVar2);
            if (objE0 != aVar2) {
                objE0 = Unit.INSTANCE;
            }
        } catch (Exception e4) {
            m().error("storeNetworks", e4);
            throw e4;
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f78097i = zl.a.e("WifiDataHandler", this.f78091c.plus(ge1.b.h()));
        this.f78098j = gVar;
        this.f78099k = cVar;
        ((dt2.d) gVar).f61154i.add(this);
    }

    public final Object t(WifiSetup.StoredAccessPoint storedAccessPoint, v13.c cVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(cVar), 1);
        kVar.q();
        zy2.k kVarM = m();
        rs2.c cVar2 = this.f78099k;
        if (cVar2 == null) {
            s.m("deviceInfo");
            throw null;
        }
        kVarM.debug(e0.g("testNetworkConnection: using ", cVar2.getF92742f(), " to test ssid[", storedAccessPoint.getSsid(), "] | begin"));
        this.f78101m = storedAccessPoint.getSsid();
        this.f78102n = kVar;
        kVar.r(new n(this));
        WifiSetup.WifiSetupAgent.Builder builderAddStoredAps = WifiSetup.WifiSetupAgent.newBuilder().addStoredAps(storedAccessPoint);
        zi2.a aVarA = this.f78094f.a();
        if (aVarA != null) {
            builderAddStoredAps.setGcsLocation(d(this, aVarA));
        }
        WifiSetup.WifiSetupAgent wifiSetupAgentBuild = builderAddStoredAps.build();
        rs2.c cVar3 = this.f78099k;
        if (cVar3 == null) {
            s.m("deviceInfo");
            throw null;
        }
        GDISmartProto.Smart smartA = uu2.a.a(GDIWifiSetup.WifiSetupService.newBuilder().setVerifyConnectionNotification(GDIWifiSetup.VerifyConnectionNotification.newBuilder().setEncryptedWifiProtobuf(ByteString.copyFrom(gn2.b.b(cVar3.getF92746j(), wifiSetupAgentBuild.toByteArray()))).build()));
        smartA.getClass();
        ge1.b.T(l(), null, null, new o(this, smartA, storedAccessPoint, kVar, null), 3);
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgn2/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_MAX_NETWORKS", "I", "SERVICE_VERSION", "", "Lcom/garmin/proto/generated/WifiSetup$ServerCredentialType;", "DEFAULT_CREDENTIALS_TYPES", "Ljava/util/List;", "wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgn2/c$d;", "", "", "maxNetworks", "", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "scannedNetworks", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "storedNetworks", "Lcom/garmin/proto/generated/WifiSetup$SecurityType;", "allowedSecurityTypes", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<WifiSetup.ScannedAccessPoint> f78107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<WifiSetup.StoredAccessPoint> f78108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<WifiSetup.SecurityType> f78109d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i14, List<WifiSetup.ScannedAccessPoint> list, List<WifiSetup.StoredAccessPoint> list2, List<? extends WifiSetup.SecurityType> list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f78106a = i14;
            this.f78107b = list;
            this.f78108c = list2;
            this.f78109d = list3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(int i14, List list, List list2, List list3, int i15, p005kotlin.jvm.internal.j jVar) {
            if ((i15 & 8) != 0) {
                gn2.a.f78088d.getClass();
                list3 = gn2.a.f78089e;
            }
            this(i14, list, list2, list3);
        }
    }

    public /* synthetic */ c(Context context, InterfaceC1576c interfaceC1576c, t13.g gVar, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, interfaceC1576c, gVar, (i14 & 8) != 0 ? new a(null) : pVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, InterfaceC1576c interfaceC1576c) {
        context.getClass();
        interfaceC1576c.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this(applicationContext, interfaceC1576c, s0.f129406a, null, 8, null);
    }
}
