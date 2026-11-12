package ei;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f implements r53.i<vh.f<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f64102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f64103b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f64104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f64105b;

        /* JADX INFO: renamed from: ei.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2", f = "ApolloCacheInterceptor.kt", l = {223}, m = "emit")
        public static final class C1359a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f64106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f64107b;

            public C1359a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f64106a = obj;
                this.f64107b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, long j8) {
            this.f64104a = jVar;
            this.f64105b = j8;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1359a c1359a;
            if (dVar instanceof C1359a) {
                c1359a = (C1359a) dVar;
                int i14 = c1359a.f64107b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1359a.f64107b = i14 - Integer.MIN_VALUE;
                } else {
                    c1359a = new C1359a(dVar);
                }
            } else {
                c1359a = new C1359a(dVar);
            }
            Object obj2 = c1359a.f64106a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1359a.f64107b;
            if (i15 == 0) {
                o13.r.b(obj2);
                vh.f.a aVarA = ((vh.f) obj).a();
                bi.c.a aVar2 = new bi.c.a();
                aVar2.f17932c = this.f64105b;
                int i16 = mi.a.f118679a;
                aVar2.f17933d = System.currentTimeMillis();
                aVarA.a(aVar2.a());
                vh.f fVarB = aVarA.b();
                c1359a.f64107b = 1;
                if (this.f64104a.emit(fVarB, c1359a) == aVar) {
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

    public f(r53.i iVar, long j8) {
        this.f64102a = iVar;
        this.f64103b = j8;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super vh.f<Object>> jVar, t13.d dVar) {
        Object objCollect = this.f64102a.collect(new a(jVar, this.f64103b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
