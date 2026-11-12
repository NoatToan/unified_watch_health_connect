package ei;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class o implements r53.i<Set<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f64138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f64139b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f64140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0 f64141b;

        /* JADX INFO: renamed from: ei.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$$inlined$filter$1$2", f = "WatcherInterceptor.kt", l = {223}, m = "emit")
        public static final class C1360a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f64142a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f64143b;

            public C1360a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f64142a = obj;
                this.f64143b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, r0 r0Var) {
            this.f64140a = jVar;
            this.f64141b = r0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1360a c1360a;
            if (dVar instanceof C1360a) {
                c1360a = (C1360a) dVar;
                int i14 = c1360a.f64143b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1360a.f64143b = i14 - Integer.MIN_VALUE;
                } else {
                    c1360a = new C1360a(dVar);
                }
            } else {
                c1360a = new C1360a(dVar);
            }
            Object obj2 = c1360a.f64142a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1360a.f64143b;
            if (i15 == 0) {
                o13.r.b(obj2);
                Set set = (Set) obj;
                T t7 = this.f64141b.f105810a;
                if (t7 == null || !h0.h0(set, (Iterable) t7).isEmpty()) {
                    c1360a.f64143b = 1;
                    if (this.f64140a.emit(obj, c1360a) == aVar) {
                        return aVar;
                    }
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

    public o(r53.i iVar, r0 r0Var) {
        this.f64138a = iVar;
        this.f64139b = r0Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Set<? extends String>> jVar, t13.d dVar) {
        Object objCollect = this.f64138a.collect(new a(jVar, this.f64139b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
