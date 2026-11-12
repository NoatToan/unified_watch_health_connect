package sa0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lsa0/n;", "Landroidx/lifecycle/u1;", "", "deviceId", "Ll90/b;", "compatibleDevice", "<init>", "(JLl90/b;)V", "b", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f158209e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f158210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l90.b f158211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f158212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f158213d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lsa0/n$b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel$uiState$1", f = "WiFiNetworksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super b>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super b> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = n.f158209e;
            n nVar = n.this;
            nVar.getClass();
            w9.a aVarA = v1.a(nVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new o(nVar, null), 2);
            p2 p2Var = nVar.f158212c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, b.a((b) value, false, nVar.f158211b.f111531p.f58445k != d90.g.INDEX, false, false, null, null, null, 253)));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public n(long j8, l90.b bVar) {
        bVar.getClass();
        this.f158210a = j8;
        this.f158211b = bVar;
        p2 p2VarA = q2.a(new b(false, false, false, false, bVar, null, null, null, 239, null));
        this.f158212c = p2VarA;
        this.f158213d = r53.s.K(new v(new c(null), r53.s.d(p2VarA)), v1.a(this), k2.a.a(k2.f150703a, 2), new b(false, false, false, false, null, null, null, null, 255, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(n nVar, long j8, v13.c cVar) throws Throwable {
        q qVar;
        nVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f158234d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f158234d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(nVar, cVar);
            }
        } else {
            qVar = new q(nVar, cVar);
        }
        Object objQ = qVar.f158232b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f158234d;
        try {
            if (i15 == 0) {
                o13.r.b(objQ);
                gn2.c cVar2 = (gn2.c) zb0.k.b(gn2.c.class, j8);
                if (cVar2 == null) {
                    return null;
                }
                qVar.f158231a = j8;
                qVar.f158234d = 1;
                objQ = cVar2.q(qVar);
                if (objQ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = qVar.f158231a;
                o13.r.b(objQ);
            }
            return (List) objQ;
        } catch (Exception e4) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = wr.g.n("Scanning networks failed for deviceId[", j8, "], error ", e4);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WiFiNetworksViewModel", strN);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(n nVar, gn2.c cVar, List list, v13.c cVar2) {
        s sVar;
        nVar.getClass();
        if (cVar2 instanceof s) {
            sVar = (s) cVar2;
            int i14 = sVar.f158249c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f158249c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(nVar, cVar2);
            }
        } else {
            sVar = new s(nVar, cVar2);
        }
        Object obj = sVar.f158247a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f158249c;
        boolean z14 = true;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                sVar.f158249c = 1;
                Object objS = cVar.s(list, sVar);
                nVar = objS;
                if (objS == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                nVar = nVar;
            }
        } catch (Exception e4) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = wr.g.n("Storing networks failed for deviceId[", nVar.f158210a, "], error ", e4);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WiFiNetworksViewModel", strN);
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Enum z4(n nVar, gn2.c cVar, WifiSetup.StoredAccessPoint storedAccessPoint, v13.c cVar2) throws Throwable {
        t tVar;
        nVar.getClass();
        if (cVar2 instanceof t) {
            tVar = (t) cVar2;
            int i14 = tVar.f158252c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f158252c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(nVar, cVar2);
            }
        } else {
            tVar = new t(nVar, cVar2);
        }
        Object objT = tVar.f158250a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f158252c;
        try {
            if (i15 == 0) {
                o13.r.b(objT);
                tVar.f158252c = 1;
                objT = cVar.t(storedAccessPoint, tVar);
                if (objT == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objT);
            }
            return (WifiSetup.StatusType) objT;
        } catch (Exception e4) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = wr.g.n("Testing network connection failed for deviceId[", nVar.f158210a, "], error ", e4);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WiFiNetworksViewModel", strN);
            return WifiSetup.StatusType.Unknown;
        }
    }

    public final void A4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f158212c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, false, false, false, false, null, null, null, 247)));
    }

    public final void B4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f158212c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, false, false, false, false, null, null, null, 251)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lsa0/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SCAN_TIMEOUT_IN_MILLISECONDS", "J", "CONNECTION_TIMEOUT_IN_MILLISECONDS", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsa0/n$b;", "", "", "isConnecting", "isNetworkSetupOptional", "isNetworkScanComplete", "showSetupLaterDialog", "Ll90/b;", "compatibleDevice", "", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "scannedNetworks", "Lcom/garmin/proto/generated/WifiSetup$StatusType;", "connectionStatus", "Lcom/garmin/proto/generated/WifiSetup$SecurityType;", "allowedSecurityTypes", "<init>", "(ZZZZLl90/b;Ljava/util/List;Lcom/garmin/proto/generated/WifiSetup$StatusType;Ljava/util/List;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f158214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f158215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f158216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f158217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l90.b f158218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<WifiSetup.ScannedAccessPoint> f158219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WifiSetup.StatusType f158220g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<WifiSetup.SecurityType> f158221h;

        public b(boolean z14, boolean z15, boolean z16, boolean z17, l90.b bVar, List list, WifiSetup.StatusType statusType, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? null : bVar, (i14 & 32) != 0 ? j0.f134944a : list, (i14 & 64) != 0 ? WifiSetup.StatusType.Unknown : statusType, (i14 & 128) != 0 ? null : list2);
        }

        public static b a(b bVar, boolean z14, boolean z15, boolean z16, boolean z17, List list, WifiSetup.StatusType statusType, List list2, int i14) {
            if ((i14 & 1) != 0) {
                z14 = bVar.f158214a;
            }
            boolean z18 = z14;
            if ((i14 & 2) != 0) {
                z15 = bVar.f158215b;
            }
            boolean z19 = z15;
            if ((i14 & 4) != 0) {
                z16 = bVar.f158216c;
            }
            boolean z24 = z16;
            if ((i14 & 8) != 0) {
                z17 = bVar.f158217d;
            }
            boolean z25 = z17;
            l90.b bVar2 = bVar.f158218e;
            if ((i14 & 32) != 0) {
                list = bVar.f158219f;
            }
            List list3 = list;
            if ((i14 & 64) != 0) {
                statusType = bVar.f158220g;
            }
            WifiSetup.StatusType statusType2 = statusType;
            List list4 = (i14 & 128) != 0 ? bVar.f158221h : list2;
            bVar.getClass();
            statusType2.getClass();
            return new b(z18, z19, z24, z25, bVar2, list3, statusType2, list4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f158214a == bVar.f158214a && this.f158215b == bVar.f158215b && this.f158216c == bVar.f158216c && this.f158217d == bVar.f158217d && p005kotlin.jvm.internal.s.g(this.f158218e, bVar.f158218e) && p005kotlin.jvm.internal.s.g(this.f158219f, bVar.f158219f) && this.f158220g == bVar.f158220g && p005kotlin.jvm.internal.s.g(this.f158221h, bVar.f158221h);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f158214a) * 31, 31, this.f158215b), 31, this.f158216c), 31, this.f158217d);
            l90.b bVar = this.f158218e;
            int iHashCode = (iG + (bVar == null ? 0 : bVar.hashCode())) * 31;
            List<WifiSetup.ScannedAccessPoint> list = this.f158219f;
            int iHashCode2 = (this.f158220g.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            List<WifiSetup.SecurityType> list2 = this.f158221h;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("WiFiUiState(isConnecting=", ", isNetworkSetupOptional=", ", isNetworkScanComplete=", this.f158214a, this.f158215b);
            kg.f.q(", showSetupLaterDialog=", ", compatibleDevice=", sbM, this.f158216c, this.f158217d);
            sbM.append(this.f158218e);
            sbM.append(", scannedNetworks=");
            sbM.append(this.f158219f);
            sbM.append(", connectionStatus=");
            sbM.append(this.f158220g);
            sbM.append(", allowedSecurityTypes=");
            sbM.append(this.f158221h);
            sbM.append(")");
            return sbM.toString();
        }

        public b() {
            this(false, false, false, false, null, null, null, null, 255, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z14, boolean z15, boolean z16, boolean z17, l90.b bVar, List<WifiSetup.ScannedAccessPoint> list, WifiSetup.StatusType statusType, List<? extends WifiSetup.SecurityType> list2) {
            statusType.getClass();
            this.f158214a = z14;
            this.f158215b = z15;
            this.f158216c = z16;
            this.f158217d = z17;
            this.f158218e = bVar;
            this.f158219f = list;
            this.f158220g = statusType;
            this.f158221h = list2;
        }
    }
}
