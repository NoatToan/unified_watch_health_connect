package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {641}, m = "invokeSuspend")
public final class q6 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f89414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f89415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(w6 w6Var, t6 t6Var, t13.d<? super q6> dVar) {
        super(2, dVar);
        this.f89414b = w6Var;
        this.f89415c = t6Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q6(this.f89414b, this.f89415c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q6) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f89413a;
        if (i14 == 0) {
            o13.r.b(obj);
            t6 t6Var = this.f89415c;
            float f14 = t6Var.f89761a;
            float f15 = t6Var.f89762b;
            float f16 = t6Var.f89764d;
            float f17 = t6Var.f89763c;
            this.f89413a = 1;
            w6 w6Var = this.f89414b;
            w6Var.f90093a = f14;
            w6Var.f90094b = f15;
            w6Var.f90095c = f16;
            w6Var.f90096d = f17;
            Object objB = w6Var.b(this);
            if (objB != aVar) {
                objB = Unit.INSTANCE;
            }
            if (objB == aVar) {
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
