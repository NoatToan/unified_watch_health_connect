package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Landroidx/lifecycle/b0$a;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {376}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<q53.t<? super b0.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f7955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f7955c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f7955c, dVar);
            aVar.f7954b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(q53.t<? super b0.a> tVar, t13.d<? super Unit> dVar) {
            return ((a) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f7953a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.t tVar = (q53.t) this.f7954b;
                a0 a0Var = new a0(tVar, 1);
                b0 b0Var = this.f7955c;
                b0Var.a(a0Var);
                a11.n nVar = new a11.n(29, b0Var, a0Var);
                this.f7953a = 1;
                if (q53.r.a(tVar, nVar, this) == aVar) {
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

    public static final r53.i<b0.a> a(b0 b0Var) {
        b0Var.getClass();
        r53.b bVarF = r53.s.f(new a(b0Var, null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(bVarF, u53.o.f168762a.H());
    }
}
