package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.k1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.core.SwipeableV2State$swipe$2", f = "SwipeableV2.kt", l = {493}, m = "invokeSuspend")
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0<Object> f225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(r0<Object> r0Var, k1 k1Var, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f225b = r0Var;
        this.f226c = k1Var;
        this.f227d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f225b, this.f226c, this.f227d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f224a;
        if (i14 == 0) {
            o13.r.b(obj);
            d0 d0Var = this.f225b.f174e;
            this.f224a = 1;
            d0Var.getClass();
            if (o53.c0.e(new e0(this.f226c, d0Var, this.f227d, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
