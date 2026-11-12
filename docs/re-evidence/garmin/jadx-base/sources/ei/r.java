package ei;

import com.apollographql.apollo3.exception.ApolloException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lvh/n0$a;", "D", "Lr53/j;", "Lvh/f;", "", "cause", "", "attempt", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptor$intercept$4", f = "WatcherInterceptor.kt", l = {48}, m = "invokeSuspend")
public final class r extends v13.i implements e23.r<r53.j<? super vh.f<Object>>, Throwable, Long, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f64166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f64167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi.p f64168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bi.p pVar, t13.d<? super r> dVar) {
        super(4, dVar);
        this.f64168d = pVar;
    }

    @Override // e23.r
    public final Object invoke(r53.j<? super vh.f<Object>> jVar, Throwable th3, Long l14, t13.d<? super Boolean> dVar) {
        long jLongValue = l14.longValue();
        r rVar = new r(this.f64168d, dVar);
        rVar.f64166b = th3;
        rVar.f64167c = jLongValue;
        return rVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64165a;
        if (i14 == 0) {
            o13.r.b(obj);
            Throwable th3 = this.f64166b;
            long j8 = this.f64167c;
            if (th3 instanceof ApolloException) {
                e23.q<Throwable, Long, t13.d<? super Boolean>, Object> qVar = this.f64168d.f18008c;
                Long l14 = new Long(j8);
                this.f64165a = 1;
                obj = qVar.invoke(th3, l14, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        boolean z14 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z14);
    }
}
