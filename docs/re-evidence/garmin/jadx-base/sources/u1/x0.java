package u1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu1/x0;", "Lh5/u1;", "Lh4/r$c;", "La2/j;", "interactionSource", "<init>", "(La2/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 extends h4.r.c implements h5.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.j f167713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2.e f167714b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167715a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167715a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167715a = 1;
                if (x0.U1(x0.this, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167717a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167717a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167717a = 1;
                if (x0.V1(x0.this, this) == aVar) {
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

    public x0(a2.j jVar) {
        this.f167713a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object U1(x0 x0Var, v13.c cVar) {
        v0 v0Var;
        a2.e eVar;
        x0Var.getClass();
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i14 = v0Var.f167695d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f167695d = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(x0Var, cVar);
            }
        } else {
            v0Var = new v0(x0Var, cVar);
        }
        Object obj = v0Var.f167693b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f167695d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (x0Var.f167714b == null) {
                a2.e eVar2 = new a2.e();
                a2.j jVar = x0Var.f167713a;
                v0Var.f167692a = eVar2;
                v0Var.f167695d = 1;
                if (jVar.b(eVar2, v0Var) == aVar) {
                    return aVar;
                }
                eVar = eVar2;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eVar = v0Var.f167692a;
        o13.r.b(obj);
        x0Var.f167714b = eVar;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object V1(x0 x0Var, v13.c cVar) {
        w0 w0Var;
        x0Var.getClass();
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f167705c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f167705c = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(x0Var, cVar);
            }
        } else {
            w0Var = new w0(x0Var, cVar);
        }
        Object obj = w0Var.f167703a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f167705c;
        if (i15 == 0) {
            o13.r.b(obj);
            a2.e eVar = x0Var.f167714b;
            if (eVar != null) {
                a2.f fVar = new a2.f(eVar);
                a2.j jVar = x0Var.f167713a;
                w0Var.f167705c = 1;
                if (jVar.b(fVar, w0Var) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x0Var.f167714b = null;
        return Unit.INSTANCE;
    }

    public final void W1() {
        a2.e eVar = this.f167714b;
        if (eVar != null) {
            this.f167713a.a(new a2.f(eVar));
            this.f167714b = null;
        }
    }

    @Override // h5.u1
    public final void a1() {
        W1();
    }

    @Override // h4.r.c
    public final void onDetach() {
        W1();
    }

    @Override // h5.u1
    public final void u1(b5.q qVar, b5.s sVar, long j8) {
        if (sVar == b5.s.Main) {
            int i14 = qVar.f15875f;
            b5.t.f15887b.getClass();
            if (i14 == b5.t.f15891f) {
                ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
            } else if (i14 == b5.t.f15892g) {
                ge1.b.T(getCoroutineScope(), null, null, new b(null), 3);
            }
        }
    }
}
