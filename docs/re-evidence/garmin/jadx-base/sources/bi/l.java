package bi;

import ch.qos.logback.core.net.SyslogConstants;
import com.apollographql.apollo3.exception.ApolloCompositeException;
import com.apollographql.apollo3.exception.ApolloException;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import r53.s;
import r53.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1", f = "FetchPolicyInterceptors.kt", l = {125, 141, SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<r53.j<? super vh.f<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f17991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f17992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ki.b f17995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f17996f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$cacheResponse$1", f = "FetchPolicyInterceptors.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.q<r53.j<? super vh.f<Object>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Throwable f17997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<ApolloException> f17998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0<ApolloException> r0Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f17998b = r0Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super vh.f<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            a aVar = new a(this.f17998b, dVar);
            aVar.f17997a = th3;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ?? r14 = this.f17997a;
            if (!(r14 instanceof ApolloException)) {
                throw r14;
            }
            this.f17998b.f105810a = r14;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @v13.e(c = "com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1", f = "FetchPolicyInterceptors.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.q<r53.j<? super vh.f<Object>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Throwable f17999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<ApolloException> f18000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0<ApolloException> r0Var, t13.d<? super b> dVar) {
            super(3, dVar);
            this.f18000b = r0Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super vh.f<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f18000b, dVar);
            bVar.f17999a = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ?? r14 = this.f17999a;
            if (!(r14 instanceof ApolloException)) {
                throw r14;
            }
            this.f18000b.f105810a = r14;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ki.b bVar, vh.e<Object> eVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f17995e = bVar;
        this.f17996f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f17995e, this.f17996f, dVar);
        lVar.f17994d = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super vh.f<Object>> jVar, t13.d<? super Unit> dVar) {
        return ((l) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        if (r3.emit(r14, r13) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar;
        r0 r0Var;
        r0 r0Var2;
        r53.j jVar2;
        r0 r0Var3;
        vh.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f17993c;
        vh.e<Object> eVar = this.f17996f;
        ki.b bVar = this.f17995e;
        if (i14 == 0) {
            r.b(obj);
            jVar = (r53.j) this.f17994d;
            r0 r0Var4 = new r0();
            r0 r0Var5 = new r0();
            w wVar = new w(bVar.a(eVar), new b(r0Var5, null));
            this.f17994d = jVar;
            this.f17991a = r0Var4;
            this.f17992b = r0Var5;
            this.f17993c = 1;
            if (s.v(jVar, wVar, this) != aVar) {
                r0Var = r0Var4;
                r0Var2 = r0Var5;
            }
            return aVar;
        }
        if (i14 == 1) {
            r0Var2 = this.f17992b;
            r0Var = this.f17991a;
            r53.j jVar3 = (r53.j) this.f17994d;
            r.b(obj);
            jVar = jVar3;
        } else if (i14 == 2) {
            r0Var2 = this.f17992b;
            r0Var3 = this.f17991a;
            jVar2 = (r53.j) this.f17994d;
            r.b(obj);
            fVar = (vh.f) obj;
            if (fVar != null) {
                throw new ApolloCompositeException((Throwable) r0Var2.f105810a, (Throwable) r0Var3.f105810a);
            }
            vh.f.a aVarA = fVar.a();
            c cVarB = m.b(fVar);
            cVarB.getClass();
            c.a aVarD = cVarB.d();
            aVarD.f17936g = (ApolloException) r0Var2.f105810a;
            aVarA.a(aVarD.a());
            vh.f fVarB = aVarA.b();
            this.f17994d = null;
            this.f17991a = null;
            this.f17992b = null;
            this.f17993c = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        if (r0Var2.f105810a == 0) {
            return Unit.INSTANCE;
        }
        vh.e.a<D> aVarA2 = eVar.a();
        aVarA2.a(new f(true));
        w wVar2 = new w(bVar.a(aVarA2.b()), new a(r0Var, null));
        this.f17994d = jVar;
        this.f17991a = r0Var;
        this.f17992b = r0Var2;
        this.f17993c = 2;
        Object objI = s.I(wVar2, this);
        if (objI != aVar) {
            jVar2 = jVar;
            obj = objI;
            r0Var3 = r0Var;
            fVar = (vh.f) obj;
            if (fVar != null) {
                throw new ApolloCompositeException((Throwable) r0Var2.f105810a, (Throwable) r0Var3.f105810a);
            }
            vh.f.a aVarA3 = fVar.a();
            c cVarB2 = m.b(fVar);
            cVarB2.getClass();
            c.a aVarD2 = cVarB2.d();
            aVarD2.f17936g = (ApolloException) r0Var2.f105810a;
            aVarA3.a(aVarD2.a());
            vh.f fVarB2 = aVarA3.b();
            this.f17994d = null;
            this.f17991a = null;
            this.f17992b = null;
            this.f17993c = 3;
        }
        return aVar;
    }
}
