package mk1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.thirdpartyapps.ThirdPartyAppListScreenKt$ThirdPartyAppListScreen$3$1", f = "ThirdPartyAppListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f119152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<h.a> f119153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e23.a<Unit> aVar, x3<h.a> x3Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f119152a = aVar;
        this.f119153b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f119152a, this.f119153b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (this.f119153b.getF182175a().f119166e) {
            this.f119152a.invoke();
        }
        return Unit.INSTANCE;
    }
}
