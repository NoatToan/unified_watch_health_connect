package et1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailImagesScreenKt$TrailImagesScreen$4$1", f = "TrailImagesScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f65878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2.j0 f65879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t0(e23.l<? super Integer, Unit> lVar, h2.j0 j0Var, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f65878a = lVar;
        this.f65879b = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f65878a, this.f65879b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f65878a.invoke(new Integer(this.f65879b.l()));
        return Unit.INSTANCE;
    }
}
