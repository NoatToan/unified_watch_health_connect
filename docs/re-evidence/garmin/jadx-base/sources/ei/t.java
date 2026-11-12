package ei;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1", f = "WatcherInterceptor.kt", l = {58}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<r53.j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<r53.i<Object>> f64172c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lr53/i;", "value", "", "emit", "(Lr53/i;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j<T> f64173a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.j<? super T> jVar) {
            this.f64173a = jVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) throws Throwable {
            Object objV = r53.s.v(this.f64173a, (r53.i) obj, dVar);
            return objV == u13.a.COROUTINE_SUSPENDED ? objV : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(r53.i<? extends r53.i<Object>> iVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f64172c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f64172c, dVar);
        tVar.f64171b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((t) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64170a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a((r53.j) this.f64171b);
            this.f64170a = 1;
            if (this.f64172c.collect(aVar2, this) == aVar) {
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
