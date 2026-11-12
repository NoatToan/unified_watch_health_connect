package h2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
public final class n0 extends v13.i implements e23.p<o2, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f80979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f80980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j0 j0Var, float f14, int i14, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f80979b = j0Var;
        this.f80980c = f14;
        this.f80981d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f80979b, this.f80980c, this.f80981d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, t13.d<? super Unit> dVar) {
        return ((n0) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80978a;
        j0 j0Var = this.f80979b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f80978a = 1;
            if (j0Var.i(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        float f14 = this.f80980c;
        double d14 = f14;
        if (-0.5d > d14 || d14 > 0.5d) {
            b2.e.a("pageOffsetFraction " + f14 + " is not within the range -0.5 to 0.5");
        }
        j0Var.x(j0Var.k(this.f80981d), f14, true);
        return Unit.INSTANCE;
    }
}
