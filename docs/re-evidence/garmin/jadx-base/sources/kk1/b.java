package kk1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.details.ThirdPartyAppDetailsScreenKt$ThirdPartyDetailsScreen$1$1", f = "ThirdPartyAppDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f105136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f105137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<j> f105138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e23.a<Unit> aVar, e23.a<Unit> aVar2, x3<j> x3Var, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f105136a = aVar;
        this.f105137b = aVar2;
        this.f105138c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f105136a, this.f105137b, this.f105138c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        float f14 = d.f105141a;
        if (this.f105138c.getF182175a().f105170f) {
            this.f105136a.invoke();
            this.f105137b.invoke();
        }
        return Unit.INSTANCE;
    }
}
