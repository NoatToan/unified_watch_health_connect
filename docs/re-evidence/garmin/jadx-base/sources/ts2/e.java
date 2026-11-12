package ts2;

import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import com.garmin.proto.generated.GDISmartProto;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler$notifyDisconnection$1", f = "ConnectedDevicesHandler.kt", l = {326}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GDIConnectedDevicesReporting.ConnectedDevice f166225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f166226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GDIConnectedDevicesReporting.ConnectedDevice connectedDevice, b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f166225b = connectedDevice;
        this.f166226c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f166225b, this.f166226c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166224a;
        GDIConnectedDevicesReporting.ConnectedDevice connectedDevice = this.f166225b;
        b bVar = this.f166226c;
        if (i14 == 0) {
            r.b(obj);
            GDIConnectedDevicesReporting.Service.Builder deviceDisconnectedRequest = GDIConnectedDevicesReporting.Service.newBuilder().setDeviceDisconnectedRequest(GDIConnectedDevicesReporting.DevicesDisconnectedRequest.newBuilder().addOther(connectedDevice));
            deviceDisconnectedRequest.getClass();
            this.f166224a = 1;
            az2.a<Long, Set<GDIConnectedDevicesReporting.ConnectedDevice>> aVar2 = b.f166194i;
            obj = bVar.s(deviceDisconnectedRequest, this);
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
        GDISmartProto.Smart smart = (GDISmartProto.Smart) obj;
        if (smart == null) {
            return Unit.INSTANCE;
        }
        az2.a<Long, Set<GDIConnectedDevicesReporting.ConnectedDevice>> aVar3 = b.f166194i;
        bVar.getClass();
        GDIConnectedDevicesReporting.Service serviceA = ou2.a.a(smart);
        GDIConnectedDevicesReporting.DevicesDisconnectedResponse deviceDisconnectedResponse = (serviceA == null || !serviceA.hasDeviceDisconnectedResponse()) ? null : serviceA.getDeviceDisconnectedResponse();
        bVar.l().info("notifyDisconnection: ".concat(a.a(w.c(connectedDevice), deviceDisconnectedResponse != null ? deviceDisconnectedResponse.getStatusList() : null)));
        return Unit.INSTANCE;
    }
}
