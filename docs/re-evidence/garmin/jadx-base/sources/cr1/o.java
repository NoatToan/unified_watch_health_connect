package cr1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ldr1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.storage.device.DeviceStorageRepo$getDeviceLottieTutorialsSetup$result$1", f = "DeviceStorageRepo.kt", l = {335}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<dr1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, String str, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f55424b = fVar;
        this.f55425c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f55424b, this.f55425c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<dr1.a>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55423a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<dr1.a>> i0VarC = this.f55424b.f55364b.c(this.f55425c);
        this.f55423a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
