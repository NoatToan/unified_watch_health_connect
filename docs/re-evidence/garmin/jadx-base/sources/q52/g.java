package q52;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzr1/c;", "syncStatus", "", "<anonymous>", "(Lzr1/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.details.ObserveDeviceSyncStatusUseCase$invoke$1", f = "ObserveDeviceSyncStatusUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<zr1.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f142934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f142935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f142936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, long j8, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f142935b = fVar;
        this.f142936c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f142935b, this.f142936c, dVar);
        gVar.f142934a = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(zr1.c cVar, t13.d<? super Unit> dVar) {
        return ((g) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        zr1.c cVar = (zr1.c) this.f142934a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        String str = "Sync status update for device[" + this.f142936c + "]: " + cVar;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "ObserveDeviceSyncStatusUseCase", str);
        return Unit.INSTANCE;
    }
}
