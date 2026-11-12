package an2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$handleDeviceMissingBond$1", f = "SharedDeviceManager.kt", l = {}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f4551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedDeviceInfo f4552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, SharedDeviceInfo sharedDeviceInfo, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f4551a = aVar;
        this.f4552b = sharedDeviceInfo;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f4551a, this.f4552b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f4551a.f4494a.e(this.f4552b);
        return Unit.INSTANCE;
    }
}
