package sa0;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import o53.b0;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel$scanNetworks$1", f = "WiFiNetworksViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f158228c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel$scanNetworks$1$scannedNetworks$1", f = "WiFiNetworksViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super List<? extends WifiSetup.ScannedAccessPoint>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f158229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f158230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f158230b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f158230b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends WifiSetup.ScannedAccessPoint>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158229a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            n nVar = this.f158230b;
            long j8 = nVar.f158210a;
            this.f158229a = 1;
            Object objX4 = n.x4(nVar, j8, this);
            return objX4 == aVar ? aVar : objX4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f158228c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f158228c, dVar);
        pVar.f158227b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        b0 b0Var = (b0) this.f158227b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158226a;
        n nVar = this.f158228c;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = a0.f(nVar.f158210a, "Scanning networks for deviceId[", "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "WiFiNetworksViewModel", strF);
            a aVar2 = new a(nVar, null);
            this.f158227b = b0Var;
            this.f158226a = 1;
            objC = j2.c(30000L, aVar2, this);
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
        List list = (List) objC;
        if (list == null) {
            list = j0.f134944a;
        }
        List list2 = list;
        a2 a2Var2 = a2.DEVICE_SETUP;
        String strF2 = e0.f(list2.size(), "Network scan complete, found ", " WiFi networks");
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "WiFiNetworksViewModel", strF2);
        p2 p2Var = nVar.f158212c;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, n.b.a((n.b) value, false, false, true, false, list2, null, null, 219)));
        return Unit.INSTANCE;
    }
}
