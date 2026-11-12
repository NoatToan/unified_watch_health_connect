package sa0;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel$retrieveAllowedSecurityTypes$1", f = "WiFiNetworksViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f158225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f158225c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f158225c, dVar);
        oVar.f158224b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<WifiSetup.SecurityType> list;
        p2 p2Var;
        Object value;
        Object objP;
        b0 b0Var = (b0) this.f158224b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158223a;
        List<WifiSetup.SecurityType> list2 = null;
        n nVar = this.f158225c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                a2 a2Var = a2.DEVICE_SETUP;
                String strF = a0.f(nVar.f158210a, "Retrieving allowed WiFi security types for deviceId[", "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "WiFiNetworksViewModel", strF);
                gn2.c cVar = (gn2.c) zb0.k.b(gn2.c.class, nVar.f158210a);
                if (cVar != null) {
                    this.f158224b = b0Var;
                    this.f158223a = 1;
                    objP = cVar.p(this);
                    if (objP == aVar) {
                        return aVar;
                    }
                }
                list = list2;
                p2Var = nVar.f158212c;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, n.b.a((n.b) value, false, false, false, false, null, null, list, 127)));
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objP = obj;
            gn2.c.d dVar = (gn2.c.d) objP;
            if (dVar != null) {
                list2 = dVar.f78109d;
            }
        } catch (Exception e4) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            String strN = wr.g.n("Retrieving allowed WiFi security types failed for deviceId[", nVar.f158210a, "], error ", e4);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "WiFiNetworksViewModel", strN);
        }
        list = list2;
        p2Var = nVar.f158212c;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, n.b.a((n.b) value, false, false, false, false, null, null, list, 127)));
        return Unit.INSTANCE;
    }
}
