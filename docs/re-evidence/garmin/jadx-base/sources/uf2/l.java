package uf2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionUpdateInteractorMock$registerListener$1", f = "LSVSessionUpdateInteractorMock.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f170424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f170424b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f170424b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170423a;
        k kVar = this.f170424b;
        if (i14 == 0) {
            o13.r.b(obj);
            e2 e2Var = kVar.f170500a;
            sf2.c.C3003c c3003c = sf2.c.C3003c.f158899a;
            this.f170423a = 1;
            if (e2Var.emit(c3003c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        kVar.getClass();
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        kVar.v(0.0d);
        p0Var.f105807a++;
        new j(kVar, p0Var).start();
        return Unit.INSTANCE;
    }
}
