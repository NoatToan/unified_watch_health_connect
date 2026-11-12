package jd;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {231}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f98274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<f> f98276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f98277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r0<f> r0Var, q qVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f98276c = r0Var;
        this.f98277d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f98276c, this.f98277d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r0<f> r0Var;
        T t7;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f98275b;
        if (i14 == 0) {
            o13.r.b(obj);
            r0<f> r0Var2 = this.f98276c;
            this.f98274a = r0Var2;
            this.f98275b = 1;
            Object objA = this.f98277d.a(this);
            if (objA == aVar) {
                return aVar;
            }
            r0Var = r0Var2;
            t7 = objA;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = this.f98274a;
            o13.r.b(obj);
            t7 = obj;
        }
        r0Var.f105810a = t7;
        return Unit.INSTANCE;
    }
}
