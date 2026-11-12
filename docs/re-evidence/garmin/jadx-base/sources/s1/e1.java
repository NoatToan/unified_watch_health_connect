package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {458}, m = "invokeSuspend", v = 1)
public final class e1 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1<Object> f155565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f155566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1<Object> f155567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a1<Object> a1Var, Object obj, t1<Object> t1Var, t13.d<? super e1> dVar) {
        super(1, dVar);
        this.f155565b = a1Var;
        this.f155566c = obj;
        this.f155567d = t1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e1(this.f155565b, this.f155566c, this.f155567d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((e1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        float f14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155564a;
        t1<Object> t1Var = this.f155567d;
        if (i14 == 0) {
            o13.r.b(obj);
            a1.a aVar2 = a1.f155458r;
            a1<Object> a1Var = this.f155565b;
            a1Var.l();
            p3.c2 c2Var = a1Var.f155462b;
            a1Var.f155472l = Long.MIN_VALUE;
            a1Var.p(0.0f);
            T f182175a = a1Var.f155463c.getF182175a();
            Object obj2 = this.f155566c;
            if (p005kotlin.jvm.internal.s.g(obj2, f182175a)) {
                f14 = -4.0f;
            } else {
                f14 = p005kotlin.jvm.internal.s.g(obj2, c2Var.getF182175a()) ? -5.0f : -3.0f;
            }
            t1Var.r(obj2);
            t1Var.p(0L);
            c2Var.setValue(obj2);
            a1Var.p(0.0f);
            a1Var.c(obj2);
            t1Var.l(f14);
            if (f14 == -3.0f) {
                this.f155564a = 1;
                if (a1.i(a1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        t1Var.k();
        return Unit.INSTANCE;
    }
}
