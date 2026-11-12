package zn2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$cleanUpDeviceServiceProvider$1", f = "NewFitPayDeviceServiceProvider.kt", l = {350}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f205886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f205886b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f205886b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205885a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f205886b;
            tVar.f205820f.l(tVar.f205819e.f205629a.f73101a, tVar);
            try {
                wr2.b.f186831a.getClass();
                wr2.b.a().unregisterNetworkCallback(tVar.f205827m);
            } catch (Exception unused) {
                t.f205814n.error("unRegisterForNetworkListener: already unregistered");
            }
            NewDeviceSyncQueue newDeviceSyncQueue = tVar.f205821g;
            if (newDeviceSyncQueue != null) {
                this.f205885a = 1;
                if (newDeviceSyncQueue.b(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
