package ei;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import r53.m1;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class p implements r53.i<r53.i<? extends vh.f<Object>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f64145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ki.b f64146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh.e f64147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f64148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f64149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f64150f;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f64151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ki.b f64152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vh.e f64153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0 f64154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s f64155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ z f64156f;

        /* JADX INFO: renamed from: ei.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$map$1$2", f = "WatcherInterceptor.kt", l = {223}, m = "emit")
        public static final class C1361a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f64157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f64158b;

            public C1361a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f64157a = obj;
                this.f64158b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, ki.b bVar, vh.e eVar, r0 r0Var, s sVar, z zVar) {
            this.f64151a = jVar;
            this.f64152b = bVar;
            this.f64153c = eVar;
            this.f64154d = r0Var;
            this.f64155e = sVar;
            this.f64156f = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1361a c1361a;
            if (dVar instanceof C1361a) {
                c1361a = (C1361a) dVar;
                int i14 = c1361a.f64158b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1361a.f64158b = i14 - Integer.MIN_VALUE;
                } else {
                    c1361a = new C1361a(dVar);
                }
            } else {
                c1361a = new C1361a(dVar);
            }
            Object obj2 = c1361a.f64157a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1361a.f64158b;
            if (i15 == 0) {
                o13.r.b(obj2);
                m1 m1Var = new m1(this.f64152b.a(this.f64153c.a().b()), new q(this.f64154d, this.f64155e, this.f64153c, this.f64156f, null));
                c1361a.f64158b = 1;
                if (this.f64151a.emit(m1Var, c1361a) == aVar) {
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

    public p(r53.i iVar, ki.b bVar, vh.e eVar, r0 r0Var, s sVar, z zVar) {
        this.f64145a = iVar;
        this.f64146b = bVar;
        this.f64147c = eVar;
        this.f64148d = r0Var;
        this.f64149e = sVar;
        this.f64150f = zVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super r53.i<? extends vh.f<Object>>> jVar, t13.d dVar) {
        Object objCollect = this.f64145a.collect(new a(jVar, this.f64146b, this.f64147c, this.f64148d, this.f64149e, this.f64150f), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
