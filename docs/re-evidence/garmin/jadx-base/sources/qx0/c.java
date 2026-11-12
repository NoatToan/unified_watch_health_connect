package qx0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lqx0/e;", "<anonymous>", "(Lo53/b0;)Lqx0/e;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.screen.init.MctInitViewModel$getInitialState$2", f = "MctInitViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super e>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f148406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f148406a = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f148406a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super e> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f148406a.getClass();
        i52.a.f91796a.getClass();
        return (i52.a.l() != ww0.a.INACTIVE || i52.a.a() > 1) ? e.REPORTS : e.GENESIS;
    }
}
