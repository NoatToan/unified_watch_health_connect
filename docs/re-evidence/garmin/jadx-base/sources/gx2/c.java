package gx2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.SaMDHelper$clearLocalRepoDeviceData$2", f = "SaMDHelper.kt", l = {}, m = "invokeSuspend")
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f80069a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j8, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f80069a = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f80069a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        qx2.a aVar2 = qx2.a.f148445a;
        long j8 = this.f80069a;
        synchronized (aVar2) {
            qx2.a.g(null, aVar2.b(qx2.b.DEVICE_SAMD_CAPABILITIES, j8));
        }
        synchronized (aVar2) {
            qx2.a.f().edit().remove(aVar2.b(qx2.b.DEVICE_FEATURES_THAT_SHOULD_BE_ENABLED, j8)).commit();
            synchronized (aVar2) {
                qx2.a.f().edit().remove(aVar2.b(qx2.b.ANALYTIC_RECORDED_DEVICE_FEATURES_ENABLED, j8)).commit();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
