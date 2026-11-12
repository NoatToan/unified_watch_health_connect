package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyo2/a;", "<anonymous>", "(Lo53/b0;)Lyo2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue$executeCreditCardCommit$2", f = "NewDeviceSyncQueue.kt", l = {639}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super yo2.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f179153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xo2.g f179154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo2.a f179155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NewDeviceSyncQueue newDeviceSyncQueue, xo2.g gVar, yo2.a aVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f179153b = newDeviceSyncQueue;
        this.f179154c = gVar;
        this.f179155d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f179153b, this.f179154c, this.f179155d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super yo2.a> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179152a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f179152a = 1;
            Object objA = NewDeviceSyncQueue.a(this.f179153b, this.f179154c, this.f179155d, this);
            return objA == aVar ? aVar : objA;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
