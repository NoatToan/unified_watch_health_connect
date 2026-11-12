package rb0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.legacy_devices.LegacySyncAnimationScreenKt$LegacySyncAnimationRoute$1$1", f = "LegacySyncAnimationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<i.a> f151566b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e23.a<Unit> aVar, x3<i.a> x3Var, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f151565a = aVar;
        this.f151566b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f151565a, this.f151566b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (this.f151566b.getF182175a().f151572b) {
            this.f151565a.invoke();
        }
        return Unit.INSTANCE;
    }
}
