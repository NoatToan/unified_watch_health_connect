package s53;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls53/k;", "T", "R", "Ls53/i;", "Lkotlin/Function3;", "Lr53/j;", "Lt13/d;", "", "", "transform", "Lr53/i;", "flow", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Le23/q;Lr53/i;Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k<T, R> extends i<T, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.q<r53.j<? super R>, T, t13.d<? super Unit>, Object> f157503e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f157505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k<T, R> f157506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r53.j<R> f157507d;

        /* JADX INFO: renamed from: s53.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C2970a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0<l1> f157508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f157509b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k<T, R> f157510c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r53.j<R> f157511d;

            /* JADX INFO: renamed from: s53.k$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
            @v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            public static final class C2971a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f157512a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k<T, R> f157513b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r53.j<R> f157514c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ T f157515d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2971a(k<T, R> kVar, r53.j<? super R> jVar, T t7, t13.d<? super C2971a> dVar) {
                    super(2, dVar);
                    this.f157513b = kVar;
                    this.f157514c = jVar;
                    this.f157515d = t7;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2971a(this.f157513b, this.f157514c, this.f157515d, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C2971a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to s53.k$a$a$a for r3v1 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // v13.a
                public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    /*
                        r3 = this;
                        u13.a r0 = u13.a.COROUTINE_SUSPENDED
                        int r1 = r3.f157512a
                        r2 = 1
                        if (r1 == 0) goto L14
                        if (r1 != r2) goto Ld
                        o13.r.b(r4)
                        goto L28
                    Ld:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        vb.h.z(r4)
                        r4 = 0
                        return r4
                    L14:
                        o13.r.b(r4)
                        s53.k<T, R> r4 = r3.f157513b
                        e23.q<r53.j<? super R>, T, t13.d<? super kotlin.Unit>, java.lang.Object> r4 = r4.f157503e
                        r3.f157512a = r2
                        r53.j<R> r1 = r3.f157514c
                        T r2 = r3.f157515d
                        java.lang.Object r4 = r4.invoke(r1, r2, r3)
                        if (r4 != r0) goto L28
                        return r0
                    L28:
                        kotlin.Unit r4 = p005kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: s53.k.a.C2970a.C2971a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: s53.k$a$a$b */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            public static final class b extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public C2970a f157516a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f157517b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public l1 f157518c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f157519d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C2970a<T> f157520e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public int f157521f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C2970a<? super T> c2970a, t13.d<? super b> dVar) {
                    super(dVar);
                    this.f157520e = c2970a;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f157519d = obj;
                    this.f157521f |= Integer.MIN_VALUE;
                    return this.f157520e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C2970a(r0<l1> r0Var, o53.b0 b0Var, k<T, R> kVar, r53.j<? super R> jVar) {
                this.f157508a = r0Var;
                this.f157509b = b0Var;
                this.f157510c = kVar;
                this.f157511d = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                b bVar;
                C2970a<T> c2970a;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i14 = bVar.f157521f;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bVar.f157521f = i14 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj = bVar.f157519d;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = bVar.f157521f;
                if (i15 == 0) {
                    o13.r.b(obj);
                    l1 l1Var = this.f157508a.f105810a;
                    if (l1Var != null) {
                        l1Var.c(new ChildCancelledException());
                        bVar.f157516a = this;
                        bVar.f157517b = t7;
                        bVar.f157518c = l1Var;
                        bVar.f157521f = 1;
                        if (l1Var.P(bVar) == aVar) {
                            return aVar;
                        }
                    }
                    c2970a = this;
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t7 = (T) bVar.f157517b;
                    c2970a = bVar.f157516a;
                    o13.r.b(obj);
                }
                c2970a.f157508a.f105810a = (T) ge1.b.T(c2970a.f157509b, null, d0.UNDISPATCHED, new C2971a(c2970a.f157510c, c2970a.f157511d, t7, null), 1);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k<T, R> kVar, r53.j<? super R> jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157506c = kVar;
            this.f157507d = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f157506c, this.f157507d, dVar);
            aVar.f157505b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to s53.k$a for r7v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r7.f157504a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                o13.r.b(r8)
                goto L34
            Ld:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r8)
                r8 = 0
                return r8
            L14:
                o13.r.b(r8)
                java.lang.Object r8 = r7.f157505b
                o53.b0 r8 = (o53.b0) r8
                kotlin.jvm.internal.r0 r1 = new kotlin.jvm.internal.r0
                r1.<init>()
                s53.k<T, R> r3 = r7.f157506c
                r53.i<S> r4 = r3.f157502d
                s53.k$a$a r5 = new s53.k$a$a
                r53.j<R> r6 = r7.f157507d
                r5.<init>(r1, r8, r3, r6)
                r7.f157504a = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r8 = p005kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: s53.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ k(e23.q qVar, r53.i iVar, t13.g gVar, int i14, q53.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(qVar, iVar, (i15 & 4) != 0 ? t13.h.f161748a : gVar, (i15 & 8) != 0 ? -2 : i14, (i15 & 16) != 0 ? q53.a.SUSPEND : aVar);
    }

    @Override // s53.f
    public final f<R> i(t13.g gVar, int i14, q53.a aVar) {
        return new k(this.f157503e, this.f157502d, gVar, i14, aVar);
    }

    @Override // s53.i
    public final Object l(r53.j<? super R> jVar, t13.d<? super Unit> dVar) {
        Object objE = o53.c0.e(new a(this, jVar, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.q<? super r53.j<? super R>, ? super T, ? super t13.d<? super Unit>, ? extends Object> qVar, r53.i<? extends T> iVar, t13.g gVar, int i14, q53.a aVar) {
        super(iVar, gVar, i14, aVar);
        this.f157503e = qVar;
    }
}
