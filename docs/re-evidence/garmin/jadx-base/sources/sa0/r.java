package sa0;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import d53.w;
import java.util.List;
import o53.b0;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel$storeAndTestNetwork$1", f = "WiFiNetworksViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f158237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f158238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiSetup.SecurityType f158239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f158240f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/WifiSetup$StatusType;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/WifiSetup$StatusType;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel$storeAndTestNetwork$1$connectionStatus$1", f = "WiFiNetworksViewModel.kt", l = {103, 105}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super WifiSetup.StatusType>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public gn2.c f158241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f158242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f158243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f158244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<WifiSetup.StoredAccessPoint> f158245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WifiSetup.StoredAccessPoint f158246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, List<WifiSetup.StoredAccessPoint> list, WifiSetup.StoredAccessPoint storedAccessPoint, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f158244d = nVar;
            this.f158245e = list;
            this.f158246f = storedAccessPoint;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f158244d, this.f158245e, this.f158246f, dVar);
            aVar.f158243c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super WifiSetup.StatusType> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        
            if (r9 == r0) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            gn2.c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158242b;
            n nVar = this.f158244d;
            if (i14 != 0) {
                if (i14 == 1) {
                    cVar = this.f158241a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (WifiSetup.StatusType) obj;
            }
            o13.r.b(obj);
            cVar = (gn2.c) zb0.k.b(gn2.c.class, nVar.f158210a);
            if (cVar == null) {
                a2 a2Var = a2.DEVICE_SETUP;
                String strF = a0.f(nVar.f158210a, "Cannot get WifiDataHandler capability for deviceId[", "]");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "WiFiNetworksViewModel", strF);
                return WifiSetup.StatusType.Unknown;
            }
            this.f158243c = null;
            this.f158241a = cVar;
            this.f158242b = 1;
            obj = n.y4(nVar, cVar, this.f158245e, this);
            if (obj != aVar) {
            }
            return aVar;
            if (!((Boolean) obj).booleanValue()) {
                return WifiSetup.StatusType.Unknown;
            }
            this.f158243c = null;
            this.f158241a = null;
            this.f158242b = 2;
            obj = n.z4(nVar, cVar, this.f158246f, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n nVar, String str, WifiSetup.SecurityType securityType, String str2, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f158237c = nVar;
        this.f158238d = str;
        this.f158239e = securityType;
        this.f158240f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f158237c, this.f158238d, this.f158239e, this.f158240f, dVar);
        rVar.f158236b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objC;
        Object value2;
        b0 b0Var = (b0) this.f158236b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158235a;
        n nVar = this.f158237c;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            long j8 = nVar.f158210a;
            String str = this.f158238d;
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Storing and testing network, deviceId[", "] on network ssid[", str);
            sbK.append("]/securityType[");
            WifiSetup.SecurityType securityType = this.f158239e;
            sbK.append(securityType);
            sbK.append("]");
            String string = sbK.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "WiFiNetworksViewModel", string);
            p2 p2Var = nVar.f158212c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, n.b.a((n.b) value, true, false, false, false, null, null, null, 254)));
            WifiSetup.StoredAccessPoint.Builder builderNewBuilder = WifiSetup.StoredAccessPoint.newBuilder();
            builderNewBuilder.setSsid(str);
            builderNewBuilder.setSecurityType(securityType);
            String str2 = this.f158240f;
            builderNewBuilder.setPasswordIsHex(hd0.a.b(str2));
            if (str2 == null || !(!w.J(str2)) || securityType == WifiSetup.SecurityType.OPEN) {
                builderNewBuilder.setPasswordLen(0);
            } else {
                byte[] bytes = str2.getBytes(d53.c.f57666b);
                bytes.getClass();
                builderNewBuilder.setPassword(ByteString.copyFrom(bytes));
                builderNewBuilder.setPasswordLen(str2.length());
            }
            WifiSetup.StoredAccessPoint storedAccessPointBuild = builderNewBuilder.build();
            storedAccessPointBuild.getClass();
            a aVar2 = new a(nVar, p13.w.c(storedAccessPointBuild), storedAccessPointBuild, null);
            this.f158236b = b0Var;
            this.f158235a = 1;
            objC = j2.c(60000L, aVar2, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objC = obj;
        }
        WifiSetup.StatusType statusType = (WifiSetup.StatusType) objC;
        if (statusType == null) {
            statusType = WifiSetup.StatusType.Unknown;
        }
        WifiSetup.StatusType statusType2 = statusType;
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "WiFiNetworksViewModel", "Storing and testing network finished, status " + statusType2);
        p2 p2Var2 = nVar.f158212c;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, n.b.a((n.b) value2, false, false, false, false, null, statusType2, null, 190)));
        return Unit.INSTANCE;
    }
}
