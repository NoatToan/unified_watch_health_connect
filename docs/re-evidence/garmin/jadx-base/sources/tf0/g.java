package tf0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.epoch.component.EpochReloadContainerKt$EpochReloadContainer$6$1", f = "EpochReloadContainer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f164436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<k, Unit> f164437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<l, Unit> f164438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l lVar, e23.l<? super k, Unit> lVar2, e23.l<? super l, Unit> lVar3, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f164436a = lVar;
        this.f164437b = lVar2;
        this.f164438c = lVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f164436a, this.f164437b, this.f164438c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l lVar = this.f164436a;
        boolean z14 = lVar.f164456f;
        e23.l<k, Unit> lVar2 = this.f164437b;
        if (z14) {
            lVar2.invoke(n.f164460a);
            this.f164438c.invoke(l.a(lVar, 31));
        }
        lVar2.invoke(new p(lVar.f164452b));
        return Unit.INSTANCE;
    }
}
