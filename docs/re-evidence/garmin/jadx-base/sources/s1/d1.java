package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {489}, m = "invokeSuspend", v = 1)
public final class d1 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f155533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1<Object> f155534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1<Object> f155535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f155536f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {511}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f155538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f155539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f155540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a1<Object> f155541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t1<Object> f155542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f155543g;

        /* JADX INFO: renamed from: s1.d1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {507}, m = "invokeSuspend", v = 1)
        public static final class C2946a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f155544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1<Object> f155545b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2946a(a1<Object> a1Var, t13.d<? super C2946a> dVar) {
                super(2, dVar);
                this.f155545b = a1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2946a(this.f155545b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2946a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f155544a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f155544a = 1;
                    if (a1.g(this.f155545b, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, a1<Object> a1Var, t1<Object> t1Var, float f14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155539c = obj;
            this.f155540d = obj2;
            this.f155541e = a1Var;
            this.f155542f = t1Var;
            this.f155543g = f14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f155539c, this.f155540d, this.f155541e, this.f155542f, this.f155543g, dVar);
            aVar.f155538b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155537a;
            a1<Object> a1Var = this.f155541e;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f155538b;
                Object obj2 = this.f155539c;
                Object obj3 = this.f155540d;
                if (p005kotlin.jvm.internal.s.g(obj2, obj3)) {
                    a1Var.f155474n = null;
                    if (p005kotlin.jvm.internal.s.g(a1Var.f155463c.getF182175a(), obj2)) {
                        return Unit.INSTANCE;
                    }
                } else {
                    a1.f(a1Var);
                }
                boolean zG = p005kotlin.jvm.internal.s.g(obj2, obj3);
                float f14 = this.f155543g;
                if (!zG) {
                    t1<Object> t1Var = this.f155542f;
                    t1Var.r(obj2);
                    t1Var.p(0L);
                    a1Var.f155462b.setValue(obj2);
                    t1Var.l(f14);
                }
                a1.a aVar2 = a1.f155458r;
                a1Var.p(f14);
                if (a1Var.f155473m.e()) {
                    ge1.b.T(b0Var, null, null, new C2946a(a1Var, null), 3);
                } else {
                    a1Var.f155472l = Long.MIN_VALUE;
                }
                this.f155537a = 1;
                if (a1.i(a1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            a1.a aVar3 = a1.f155458r;
            a1Var.o();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Object obj, Object obj2, a1<Object> a1Var, t1<Object> t1Var, float f14, t13.d<? super d1> dVar) {
        super(1, dVar);
        this.f155532b = obj;
        this.f155533c = obj2;
        this.f155534d = a1Var;
        this.f155535e = t1Var;
        this.f155536f = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d1(this.f155532b, this.f155533c, this.f155534d, this.f155535e, this.f155536f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((d1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155531a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f155532b, this.f155533c, this.f155534d, this.f155535e, this.f155536f, null);
            this.f155531a = 1;
            if (o53.c0.e(aVar2, this) == aVar) {
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
