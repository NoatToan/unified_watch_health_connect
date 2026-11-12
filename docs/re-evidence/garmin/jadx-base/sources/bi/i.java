package bi;

import com.apollographql.apollo3.exception.ApolloCompositeException;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.CacheMissException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import r53.s;
import r53.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", l = {186, PsExtractor.PRIVATE_STREAM_1, 211}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<r53.j<? super vh.f<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f17951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f17952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ki.b f17955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f17956f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "throwable", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1$cacheResponse$1", f = "FetchPolicyInterceptors.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.q<r53.j<? super vh.f<Object>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Throwable f17957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<ApolloException> f17958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0<ApolloException> r0Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f17958b = r0Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super vh.f<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            a aVar = new a(this.f17958b, dVar);
            aVar.f17957a = th3;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ?? r14 = this.f17957a;
            if (!(r14 instanceof ApolloException)) {
                throw r14;
            }
            this.f17958b.f105810a = r14;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements r53.i<vh.f<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f17959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0 f17960b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f17961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f17962b;

            /* JADX INFO: renamed from: bi.i$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2", f = "FetchPolicyInterceptors.kt", l = {223}, m = "emit")
            public static final class C0261a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f17963a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f17964b;

                public C0261a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f17963a = obj;
                    this.f17964b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, r0 r0Var) {
                this.f17961a = jVar;
                this.f17962b = r0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0261a c0261a;
                if (dVar instanceof C0261a) {
                    c0261a = (C0261a) dVar;
                    int i14 = c0261a.f17964b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0261a.f17964b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0261a = new C0261a(dVar);
                    }
                } else {
                    c0261a = new C0261a(dVar);
                }
                Object obj2 = c0261a.f17963a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0261a.f17964b;
                if (i15 == 0) {
                    r.b(obj2);
                    vh.f fVar = (vh.f) obj;
                    vh.f.a aVarA = fVar.a();
                    bi.c cVarB = m.b(fVar);
                    cVarB.getClass();
                    bi.c.a aVarD = cVarB.d();
                    T t7 = this.f17962b.f105810a;
                    aVarD.f17935f = t7 instanceof CacheMissException ? (CacheMissException) t7 : null;
                    aVarA.a(aVarD.a());
                    vh.f fVarB = aVarA.b();
                    c0261a.f17964b = 1;
                    if (this.f17961a.emit(fVarB, c0261a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar, r0 r0Var) {
            this.f17959a = iVar;
            this.f17960b = r0Var;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super vh.f<Object>> jVar, t13.d dVar) {
            Object objCollect = this.f17959a.collect(new a(jVar, this.f17960b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1$networkResponses$1", f = "FetchPolicyInterceptors.kt", l = {}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.q<r53.j<? super vh.f<Object>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Throwable f17966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<ApolloException> f17967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0<ApolloException> r0Var, t13.d<? super c> dVar) {
            super(3, dVar);
            this.f17967b = r0Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super vh.f<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            c cVar = new c(this.f17967b, dVar);
            cVar.f17966a = th3;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ?? r14 = this.f17966a;
            if (!(r14 instanceof ApolloException)) {
                throw r14;
            }
            this.f17967b.f105810a = r14;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ki.b bVar, vh.e<Object> eVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f17955e = bVar;
        this.f17956f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f17955e, this.f17956f, dVar);
        iVar.f17954d = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super vh.f<Object>> jVar, t13.d<? super Unit> dVar) {
        return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        r53.j jVar;
        r0 r0Var;
        r0 r0Var2;
        r0 r0Var3;
        r53.j jVar2;
        b bVar;
        r0 r0Var4;
        r0 r0Var5;
        T t7;
        T t14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f17953c;
        vh.e<Object> eVar = this.f17956f;
        ki.b bVar2 = this.f17955e;
        if (i14 == 0) {
            r.b(obj);
            r53.j jVar3 = (r53.j) this.f17954d;
            r0 r0Var6 = new r0();
            r0 r0Var7 = new r0();
            vh.e.a<D> aVarA = eVar.a();
            aVarA.a(new f(true));
            w wVar = new w(bVar2.a(aVarA.b()), new a(r0Var6, null));
            this.f17954d = jVar3;
            this.f17951a = r0Var6;
            this.f17952b = r0Var7;
            this.f17953c = 1;
            Object objI = s.I(wVar, this);
            if (objI != aVar) {
                jVar = jVar3;
                obj = objI;
                r0Var = r0Var6;
                r0Var2 = r0Var7;
            }
            return aVar;
        }
        if (i14 == 1) {
            r0Var2 = this.f17952b;
            r0Var = this.f17951a;
            jVar = (r53.j) this.f17954d;
            r.b(obj);
        } else {
            if (i14 == 2) {
                r0Var2 = this.f17952b;
                r0Var3 = this.f17951a;
                jVar2 = (r53.j) this.f17954d;
                r.b(obj);
                jVar = jVar2;
                bVar = new b(new w(bVar2.a(eVar), new c(r0Var2, null)), r0Var3);
                this.f17954d = r0Var3;
                this.f17951a = r0Var2;
                this.f17952b = null;
                this.f17953c = 3;
                if (s.v(jVar, bVar, this) != aVar) {
                    r0Var4 = r0Var2;
                    r0Var5 = r0Var3;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var4 = this.f17951a;
            r0Var5 = (r0) this.f17954d;
            r.b(obj);
        }
        t7 = r0Var4.f105810a;
        if (t7 == 0) {
            return Unit.INSTANCE;
        }
        t14 = r0Var5.f105810a;
        if (t14 != 0) {
            throw new ApolloCompositeException((Throwable) t14, (Throwable) t7);
        }
        throw ((Throwable) t7);
        vh.f fVar = (vh.f) obj;
        if (fVar != null) {
            vh.f.a aVarA2 = fVar.a();
            aVarA2.f178320g = false;
            vh.f fVarB = aVarA2.b();
            this.f17954d = jVar;
            this.f17951a = r0Var;
            this.f17952b = r0Var2;
            this.f17953c = 2;
            if (jVar.emit(fVarB, this) != aVar) {
                r0Var3 = r0Var;
                jVar2 = jVar;
                jVar = jVar2;
                bVar = new b(new w(bVar2.a(eVar), new c(r0Var2, null)), r0Var3);
                this.f17954d = r0Var3;
                this.f17951a = r0Var2;
                this.f17952b = null;
                this.f17953c = 3;
                if (s.v(jVar, bVar, this) != aVar) {
                    r0Var4 = r0Var2;
                    r0Var5 = r0Var3;
                    t7 = r0Var4.f105810a;
                    if (t7 == 0) {
                        return Unit.INSTANCE;
                    }
                    t14 = r0Var5.f105810a;
                    if (t14 != 0) {
                        throw new ApolloCompositeException((Throwable) t14, (Throwable) t7);
                    }
                    throw ((Throwable) t7);
                }
            }
        } else {
            r0Var3 = r0Var;
            bVar = new b(new w(bVar2.a(eVar), new c(r0Var2, null)), r0Var3);
            this.f17954d = r0Var3;
            this.f17951a = r0Var2;
            this.f17952b = null;
            this.f17953c = 3;
            if (s.v(jVar, bVar, this) != aVar) {
                r0Var4 = r0Var2;
                r0Var5 = r0Var3;
                t7 = r0Var4.f105810a;
                if (t7 == 0) {
                    return Unit.INSTANCE;
                }
                t14 = r0Var5.f105810a;
                if (t14 != 0) {
                    throw new ApolloCompositeException((Throwable) t14, (Throwable) t7);
                }
                throw ((Throwable) t7);
            }
        }
        return aVar;
    }
}
