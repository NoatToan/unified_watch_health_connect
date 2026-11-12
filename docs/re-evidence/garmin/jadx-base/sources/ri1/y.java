package ri1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzd0/c;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lzd0/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$observeDeviceConnectionState$1", f = "InReachSubscriptionManagerViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<zd0.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f152942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f152942c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f152942c, dVar);
        yVar.f152941b = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(zd0.c cVar, t13.d<? super Unit> dVar) {
        return ((y) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        zd0.c cVar = (zd0.c) this.f152941b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152940a;
        s sVar = this.f152942c;
        if (i14 == 0) {
            o13.r.b(obj);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InReachSubscriptionManagerViewModel", "Device connection state changed: " + cVar);
            if (cVar instanceof zd0.c.a) {
                p2 p2Var = sVar.f152894h;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, si1.k.b((si1.k) value2, false, false, null, false, true, false, false, false, null, 1983)));
                ui1.l lVar = sVar.f152890d;
                long j8 = sVar.f152887a;
                this.f152941b = null;
                this.f152940a = 1;
                lVar.getClass();
                ui1.e eVarB = ui1.l.b(j8, "messagingSubscribeRequest");
                if ((eVarB != null ? eVarB.l(this) : null) == aVar) {
                    return aVar;
                }
            } else if (cVar instanceof zd0.c.b) {
                p2 p2Var2 = sVar.f152894h;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, si1.k.b((si1.k) value, false, false, null, false, false, false, false, false, si1.e.INACTIVE, 959)));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i15 = s.f152886m;
        sVar.z4();
        return Unit.INSTANCE;
    }
}
