package vd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.EditDogPageKt$EditDogPageContent$7$1", f = "EditDogPage.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f177327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0.s f177328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(e23.a<Unit> aVar, oe0.s sVar, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f177327a = aVar;
        this.f177328b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f177327a, this.f177328b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f177327a.invoke();
        p2 p2Var = this.f177328b.f131410f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, oe0.o.a((oe0.o) value, false, false, false, false, false, 251)));
        return Unit.INSTANCE;
    }
}
