package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue$addToQueue$1", f = "NewDeviceSyncQueue.kt", l = {829, 145}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f179123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewDeviceSyncQueue f179124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wo2.f f179125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f179126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo2.f f179129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NewDeviceSyncQueue newDeviceSyncQueue, wo2.f fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f179128f = newDeviceSyncQueue;
        this.f179129g = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f179128f, this.f179129g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        NewDeviceSyncQueue newDeviceSyncQueue;
        z53.a aVar;
        wo2.f fVar;
        int i14;
        z53.a aVar2;
        Throwable th3;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f179127e;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                newDeviceSyncQueue = this.f179128f;
                aVar = newDeviceSyncQueue.f51336j;
                this.f179123a = aVar;
                this.f179124b = newDeviceSyncQueue;
                wo2.f fVar2 = this.f179129g;
                this.f179125c = fVar2;
                this.f179126d = 0;
                this.f179127e = 1;
                if (aVar.c(this) != aVar3) {
                    fVar = fVar2;
                    i14 = 0;
                }
                return aVar3;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f179123a;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            i14 = this.f179126d;
            fVar = this.f179125c;
            newDeviceSyncQueue = this.f179124b;
            z53.a aVar4 = this.f179123a;
            o13.r.b(obj);
            aVar = aVar4;
            newDeviceSyncQueue.f51331e.debug("addToQueue: add sync req. " + fVar.getF186515a());
            newDeviceSyncQueue.f51333g.add(fVar);
            newDeviceSyncQueue.f51331e.debug("addToQueue: sync req. added " + fVar.getF186515a());
            this.f179123a = aVar;
            this.f179124b = null;
            this.f179125c = null;
            this.f179126d = i14;
            this.f179127e = 2;
            if (newDeviceSyncQueue.k(false, this) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return Unit.INSTANCE;
            }
            return aVar3;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th3 = th5;
            aVar2.e(null);
            throw th3;
        }
    }
}
