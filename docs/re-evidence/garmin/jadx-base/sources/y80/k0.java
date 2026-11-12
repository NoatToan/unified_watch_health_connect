package y80;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ldr1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository$getDeviceLottieTutorialsSetup$result$1", f = "DeviceStorageRepository.kt", l = {243}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.l<t13.d<? super c83.a0<dr1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f195166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b0 b0Var, String str, t13.d<? super k0> dVar) {
        super(1, dVar);
        this.f195166b = b0Var;
        this.f195167c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k0(this.f195166b, this.f195167c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<dr1.a>> dVar) {
        return ((k0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195165a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<dr1.a>> i0VarC = this.f195166b.f195092c.c(this.f195167c);
        this.f195165a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
