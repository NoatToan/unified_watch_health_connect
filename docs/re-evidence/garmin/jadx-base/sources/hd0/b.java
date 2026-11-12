package hd0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import d53.w;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhd0/b;", "Landroidx/lifecycle/u1;", "", "deviceId", "<init>", "(J)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f83307f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<h> f83309b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f83310c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83311d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<? extends WifiSetup.SecurityType> f83312e;

    /* JADX INFO: renamed from: hd0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$storeNetwork$1", f = "WifiNetworksViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class C1642b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WifiSetup.StoredAccessPoint f83313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f83314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f83315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WifiSetup.SecurityType f83316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f83317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f83318f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1642b(String str, WifiSetup.SecurityType securityType, String str2, b bVar, t13.d<? super C1642b> dVar) {
            super(2, dVar);
            this.f83315c = str;
            this.f83316d = securityType;
            this.f83317e = str2;
            this.f83318f = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1642b(this.f83315c, this.f83316d, this.f83317e, this.f83318f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1642b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            WifiSetup.StoredAccessPoint storedAccessPoint;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83314b;
            b bVar = this.f83318f;
            if (i14 == 0) {
                r.b(obj);
                WifiSetup.StoredAccessPoint.Builder builderNewBuilder = WifiSetup.StoredAccessPoint.newBuilder();
                builderNewBuilder.setSsid(this.f83315c);
                WifiSetup.SecurityType securityType = this.f83316d;
                builderNewBuilder.setSecurityType(securityType);
                String str = this.f83317e;
                builderNewBuilder.setPasswordIsHex(hd0.a.b(str));
                if (str == null || !(!w.J(str)) || securityType == WifiSetup.SecurityType.OPEN) {
                    builderNewBuilder.setPasswordLen(0);
                } else {
                    byte[] bytes = str.getBytes(d53.c.f57666b);
                    bytes.getClass();
                    builderNewBuilder.setPassword(ByteString.copyFrom(bytes));
                    builderNewBuilder.setPasswordLen(str.length());
                }
                WifiSetup.StoredAccessPoint storedAccessPointBuild = builderNewBuilder.build();
                ArrayList arrayList = bVar.f83310c;
                storedAccessPointBuild.getClass();
                arrayList.add(storedAccessPointBuild);
                ArrayList arrayList2 = bVar.f83310c;
                this.f83313a = storedAccessPointBuild;
                this.f83314b = 1;
                Object objX4 = b.x4(bVar, arrayList2, this);
                if (objX4 == aVar) {
                    return aVar;
                }
                storedAccessPoint = storedAccessPointBuild;
                obj = objX4;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                storedAccessPoint = this.f83313a;
                r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!zBooleanValue) {
                bVar.f83310c.remove(storedAccessPoint);
            }
            y0<h> y0Var = bVar.f83309b;
            storedAccessPoint.getClass();
            y0Var.j(new h.d(storedAccessPoint, zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$testNetworkConnection$1", f = "WifiNetworksViewModel.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83319a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WifiSetup.StoredAccessPoint f83321c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/WifiSetup$StatusType;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/WifiSetup$StatusType;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$testNetworkConnection$1$testNetworkResult$1", f = "WifiNetworksViewModel.kt", l = {200}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super WifiSetup.StatusType>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f83322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f83323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f83324c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ WifiSetup.StoredAccessPoint f83325d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, WifiSetup.StoredAccessPoint storedAccessPoint, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f83324c = bVar;
                this.f83325d = storedAccessPoint;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f83324c, this.f83325d, dVar);
                aVar.f83323b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super WifiSetup.StatusType> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                b0 b0Var = (b0) this.f83323b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f83322a;
                b bVar = this.f83324c;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        gn2.c cVar = (gn2.c) k.b(gn2.c.class, bVar.f83308a);
                        if (cVar == null) {
                            return null;
                        }
                        WifiSetup.StoredAccessPoint storedAccessPoint = this.f83325d;
                        this.f83323b = b0Var;
                        this.f83322a = 1;
                        obj = cVar.t(storedAccessPoint, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return (WifiSetup.StatusType) obj;
                } catch (Exception e4) {
                    a2 a2Var = a2.DEVICES;
                    String strN = wr.g.n("testNetworkConnection FAILED deviceId[", bVar.f83308a, "] ", e4);
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "WifiNetworksViewModel", strN);
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WifiSetup.StoredAccessPoint storedAccessPoint, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f83321c = storedAccessPoint;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f83321c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83319a;
            WifiSetup.StoredAccessPoint storedAccessPoint = this.f83321c;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                a aVar2 = new a(bVar, storedAccessPoint, null);
                this.f83319a = 1;
                obj = ge1.b.e0(bVar2, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            WifiSetup.StatusType statusType = (WifiSetup.StatusType) obj;
            y0<h> y0Var = bVar.f83309b;
            if (statusType == null) {
                statusType = WifiSetup.StatusType.Unknown;
            }
            y0Var.j(new h.e(storedAccessPoint, statusType));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b(long j8) {
        this.f83308a = j8;
    }

    public static final Object x4(b bVar, ArrayList arrayList, i iVar) {
        bVar.getClass();
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new f(bVar, arrayList, null), iVar);
    }

    public final void A4(WifiSetup.StoredAccessPoint storedAccessPoint) {
        storedAccessPoint.getClass();
        a2 a2Var = a2.DEVICES;
        String str = "testNetworkConnection deviceId[" + this.f83308a + "] " + storedAccessPoint;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "WifiNetworksViewModel", str);
        this.f83309b.j(h.a.f83351a);
        ge1.b.T(v1.a(this), null, null, new c(storedAccessPoint, null), 3);
    }

    public final y0 y4() {
        a2 a2Var = a2.DEVICES;
        String strF = a0.f(this.f83308a, "retrieveNetworks deviceId[", "]");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "WifiNetworksViewModel", strF);
        y0 y0Var = new y0();
        this.f83309b.j(h.a.f83351a);
        ge1.b.T(v1.a(this), null, null, new d(this, y0Var, null), 3);
        return y0Var;
    }

    public final void z4(String str, WifiSetup.SecurityType securityType, String str2) {
        str.getClass();
        securityType.getClass();
        a2 a2Var = a2.DEVICES;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f83308a, "storeNetwork deviceId[", "] ssid[", str);
        sbK.append("] securityType[");
        sbK.append(securityType);
        sbK.append("]");
        String string = sbK.toString();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "WifiNetworksViewModel", string);
        this.f83309b.j(h.a.f83351a);
        ge1.b.T(v1.a(this), null, null, new C1642b(str, securityType, str2, this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhd0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_MAX_NETWORKS", "I", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
