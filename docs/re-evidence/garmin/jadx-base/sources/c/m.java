package c;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", l = {231}, m = "invokeSuspend", v = 1)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f22328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f22330c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lb/c;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.q<r53.j<? super b.c>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f22331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f22331a = m0Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super b.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return new a(this.f22331a, dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f22331a.f105804a = true;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f22330c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f22330c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f22329b;
        if (i14 == 0) {
            o13.r.b(obj);
            l lVar = this.f22330c;
            if (lVar.a()) {
                m0 m0Var2 = new m0();
                e23.p<? super r53.i<b.c>, ? super t13.d<? super Unit>, ? extends Object> pVar = lVar.f22324d;
                q53.b bVar = lVar.f22325e;
                bVar.getClass();
                r53.u uVar = new r53.u(r53.s.p(bVar), new a(m0Var2, null));
                this.f22328a = m0Var2;
                this.f22329b = 1;
                if (pVar.invoke(uVar, this) == aVar) {
                    return aVar;
                }
                m0Var = m0Var2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m0Var = this.f22328a;
        o13.r.b(obj);
        if (!m0Var.f105804a) {
            vb.h.z("You must collect the progress flow");
            return null;
        }
        return Unit.INSTANCE;
    }
}
