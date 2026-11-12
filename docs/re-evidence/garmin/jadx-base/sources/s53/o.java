package s53;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import o53.d0;
import o53.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m1 f157549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f157550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f157551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f157552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f157553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r53.j<Object> f157554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f157555g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.t f157556a;

        public a(o53.t tVar) {
            this.f157556a = tVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            o53.t tVar = this.f157556a;
            if (tVar.isActive()) {
                tVar.c(new AbortFlowException(tVar));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<Unit, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object> f157558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t13.g f157559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f157560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q53.v<Object> f157561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r53.j<Object> f157562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f157563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ o53.t f157564h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t13.g f157565a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f157566b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q53.v<Object> f157567c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r53.j<Object> f157568d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f157569e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ o53.t f157570f;

            /* JADX INFO: renamed from: s53.o$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
            public static final class C2975a extends v13.i implements e23.p<Unit, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public r53.j f157571a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f157572b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ q53.v<Object> f157573c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ r53.j<Object> f157574d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f157575e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Object f157576f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ o53.t f157577g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2975a(q53.v<? extends Object> vVar, r53.j<Object> jVar, e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, Object obj, o53.t tVar, t13.d<? super C2975a> dVar) {
                    super(2, dVar);
                    this.f157573c = vVar;
                    this.f157574d = jVar;
                    this.f157575e = qVar;
                    this.f157576f = obj;
                    this.f157577g = tVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2975a(this.f157573c, this.f157574d, this.f157575e, this.f157576f, this.f157577g, dVar);
                }

                @Override // e23.p
                public final Object invoke(Unit unit, t13.d<? super Unit> dVar) {
                    return ((C2975a) create(unit, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
                
                    if (r1.emit(r7, r6) == r0) goto L34;
                 */
                @Override // v13.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objB;
                    r53.j<Object> jVar;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f157572b;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        this.f157572b = 1;
                        objB = this.f157573c.b(this);
                        if (objB != aVar) {
                        }
                        return aVar;
                    }
                    if (i14 == 1) {
                        o13.r.b(obj);
                        objB = ((q53.m) obj).f143000a;
                    } else if (i14 == 2) {
                        jVar = this.f157571a;
                        o13.r.b(obj);
                        this.f157571a = null;
                        this.f157572b = 3;
                    } else {
                        if (i14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                    if (objB instanceof q53.m.c) {
                        q53.m.c cVar = (q53.m.c) objB;
                        q53.m.b bVar = q53.m.f142998b;
                        q53.m.a aVar2 = cVar instanceof q53.m.a ? (q53.m.a) cVar : null;
                        Throwable th3 = aVar2 != null ? aVar2.f143001a : null;
                        if (th3 == null) {
                            throw new AbortFlowException(this.f157577g);
                        }
                        throw th3;
                    }
                    if (objB == w.f157598a) {
                        objB = null;
                    }
                    jVar = this.f157574d;
                    this.f157571a = jVar;
                    this.f157572b = 2;
                    obj = this.f157575e.invoke(this.f157576f, objB, this);
                    if (obj != aVar) {
                        this.f157571a = null;
                        this.f157572b = 3;
                    }
                    return aVar;
                }
            }

            /* JADX INFO: renamed from: s53.o$b$a$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", l = {125}, m = "emit")
            public static final class C2976b extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f157578a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f157579b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f157580c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2976b(a<? super T> aVar, t13.d<? super C2976b> dVar) {
                    super(dVar);
                    this.f157579b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f157578a = obj;
                    this.f157580c |= Integer.MIN_VALUE;
                    return this.f157579b.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(t13.g gVar, Object obj, q53.v<? extends Object> vVar, r53.j<Object> jVar, e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, o53.t tVar) {
                this.f157565a = gVar;
                this.f157566b = obj;
                this.f157567c = vVar;
                this.f157568d = jVar;
                this.f157569e = qVar;
                this.f157570f = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d<? super Unit> dVar) {
                C2976b c2976b;
                if (dVar instanceof C2976b) {
                    c2976b = (C2976b) dVar;
                    int i14 = c2976b.f157580c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2976b.f157580c = i14 - Integer.MIN_VALUE;
                    } else {
                        c2976b = new C2976b(this, dVar);
                    }
                } else {
                    c2976b = new C2976b(this, dVar);
                }
                Object obj2 = c2976b.f157578a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2976b.f157580c;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Unit unit = Unit.INSTANCE;
                    C2975a c2975a = new C2975a(this.f157567c, this.f157568d, this.f157569e, obj, this.f157570f, null);
                    c2976b.f157580c = 1;
                    if (s53.b.a(this.f157565a, unit, this.f157566b, c2975a, c2976b) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(r53.i<Object> iVar, t13.g gVar, Object obj, q53.v<? extends Object> vVar, r53.j<Object> jVar, e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, o53.t tVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f157558b = iVar;
            this.f157559c = gVar;
            this.f157560d = obj;
            this.f157561e = vVar;
            this.f157562f = jVar;
            this.f157563g = qVar;
            this.f157564h = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f157558b, this.f157559c, this.f157560d, this.f157561e, this.f157562f, this.f157563g, this.f157564h, dVar);
        }

        @Override // e23.p
        public final Object invoke(Unit unit, t13.d<? super Unit> dVar) {
            return ((b) create(unit, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157557a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(this.f157559c, this.f157560d, this.f157561e, this.f157562f, this.f157563g, this.f157564h);
                this.f157557a = 1;
                if (this.f157558b.collect(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {86}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<q53.t<? super Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f157582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object> f157583c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q53.t<Object> f157584a;

            /* JADX INFO: renamed from: s53.o$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", l = {87}, m = "emit")
            public static final class C2977a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f157585a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f157586b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f157587c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2977a(a<? super T> aVar, t13.d<? super C2977a> dVar) {
                    super(dVar);
                    this.f157586b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f157585a = obj;
                    this.f157587c |= Integer.MIN_VALUE;
                    return this.f157586b.emit(null, this);
                }
            }

            public a(q53.t<Object> tVar) {
                this.f157584a = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // r53.j
            public final Object emit(Object obj, t13.d<? super Unit> dVar) {
                C2977a c2977a;
                if (dVar instanceof C2977a) {
                    c2977a = (C2977a) dVar;
                    int i14 = c2977a.f157587c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2977a.f157587c = i14 - Integer.MIN_VALUE;
                    } else {
                        c2977a = new C2977a(this, dVar);
                    }
                } else {
                    c2977a = new C2977a(this, dVar);
                }
                Object obj2 = c2977a.f157585a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2977a.f157587c;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    q53.s channel = this.f157584a.getChannel();
                    if (obj == null) {
                        obj = w.f157598a;
                    }
                    c2977a.f157587c = 1;
                    if (channel.f142997d.h((E) obj, c2977a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r53.i<Object> iVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f157583c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f157583c, dVar);
            cVar.f157582b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(q53.t<? super Object> tVar, t13.d<? super Unit> dVar) {
            return ((c) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157581a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a((q53.t) this.f157582b);
                this.f157581a = 1;
                if (this.f157583c.collect(aVar2, this) == aVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public o(r53.i<Object> iVar, r53.i<Object> iVar2, r53.j<Object> jVar, e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f157552d = iVar;
        this.f157553e = iVar2;
        this.f157554f = jVar;
        this.f157555g = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f157552d, this.f157553e, this.f157554f, this.f157555g, dVar);
        oVar.f157551c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:31:0x009a, B:36:0x00a2), top: B:41:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, o53.a, q53.s, q53.v, q53.w] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [q53.v] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [q53.v] */
    /* JADX WARN: Type inference failed for: r3v9, types: [q53.v] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m1 m1Var;
        ?? r14;
        ?? r15;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157550b;
        ?? r16 = 1;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f157551c;
                c cVar = new c(this.f157552d, null);
                t13.h hVar = t13.h.f161748a;
                q53.a aVar2 = q53.a.SUSPEND;
                d0 d0Var = d0.DEFAULT;
                ?? sVar = new q53.s(o53.y.b(b0Var, hVar), q53.l.a(0, 4, aVar2));
                sVar.v0(d0Var, sVar, cVar);
                m1 m1VarC = g8.i.c();
                sVar.m(new a(m1VarC));
                try {
                    try {
                        t13.g f136462d = b0Var.getF136462d();
                        Object objB = u53.z.b(f136462d);
                        t13.g gVarPlus = b0Var.getF136462d().plus(m1VarC);
                        Unit unit = Unit.INSTANCE;
                        try {
                            b bVar = new b(this.f157553e, f136462d, objB, sVar, this.f157554f, this.f157555g, m1VarC, null);
                            this.f157551c = sVar;
                            this.f157549a = m1VarC;
                            this.f157550b = 1;
                            if (s53.b.a(gVarPlus, unit, u53.z.b(gVarPlus), bVar, this) == aVar) {
                                return aVar;
                            }
                            r15 = sVar;
                        } catch (AbortFlowException e4) {
                            e = e4;
                            m1VarC = m1VarC;
                            m1Var = m1VarC;
                            r14 = sVar;
                            r15 = r14;
                            if (e.owner != m1Var) {
                                throw e;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r16 = sVar;
                        r16.c(null);
                        throw th;
                    }
                } catch (AbortFlowException e14) {
                    e = e14;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m1Var = this.f157549a;
                r14 = (q53.v) this.f157551c;
                try {
                    o13.r.b(obj);
                    r15 = r14;
                } catch (AbortFlowException e15) {
                    e = e15;
                    r15 = r14;
                    if (e.owner != m1Var) {
                        throw e;
                    }
                }
            }
            r15.c(null);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
