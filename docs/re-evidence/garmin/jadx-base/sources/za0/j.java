package za0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.permissions.DeviceSetupPermissionsViewModel$refreshPermissions$1", f = "DeviceSetupPermissionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f203259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f203260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f203260b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f203260b, dVar);
        jVar.f203259a = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        i.b bVarB;
        b0 b0Var = (b0) this.f203259a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i iVar = this.f203260b;
        ArrayList arrayListA = iVar.f203247b.a(iVar.f203249d.f143495c.f111531p.f58444j);
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "PermissionsAccessViewModel", b0Var + " Refreshed denied permissions: " + arrayListA);
        p2 p2Var = iVar.f203250e;
        do {
            value = p2Var.getValue();
            bVarB = i.b.b((i.b) value, arrayListA);
            iVar.f203246a.f(bVarB, "permissions_state");
        } while (!p2Var.b(value, bVarB));
        return Unit.INSTANCE;
    }
}
