package vy0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreViewModel$updateSearchQuery$1", f = "MoreViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f180698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f180699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, String str, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f180698a = a0Var;
        this.f180699b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f180698a, this.f180699b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z14;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f180698a.f180679g;
        do {
            value = p2Var.getValue();
            z14 = ((g0) value).f180719a;
            str = this.f180699b;
            str.getClass();
        } while (!p2Var.b(value, new g0(z14, str)));
        return Unit.INSTANCE;
    }
}
