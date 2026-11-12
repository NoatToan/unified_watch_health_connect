package ei;

import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/n0$a;", "D", "Lvh/f;", "response", "", "<anonymous>", "(Lvh/f;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$3$1", f = "WatcherInterceptor.kt", l = {}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<vh.f<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f64160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0<Set<String>> f64161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f64162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f64163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f64164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r0<Set<String>> r0Var, s sVar, vh.e<Object> eVar, z zVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f64161b = r0Var;
        this.f64162c = sVar;
        this.f64163d = eVar;
        this.f64164e = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f64161b, this.f64162c, this.f64163d, this.f64164e, dVar);
        qVar.f64160a = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(vh.f<Object> fVar, t13.d<? super Unit> dVar) {
        return ((q) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.util.Set] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        n0.a aVar2 = ((vh.f) this.f64160a).f178309c;
        if (aVar2 != null) {
            this.f64161b.f105810a = ci.l.a(this.f64162c.f64169a.d(this.f64163d.f178288a, aVar2, this.f64164e).values());
        }
        return Unit.INSTANCE;
    }
}
