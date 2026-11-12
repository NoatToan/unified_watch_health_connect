package ve;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "", "throwable", "", "attempt", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
public final class z extends v13.i implements e23.r<r53.j<? super Boolean>, Throwable, Long, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f177659b;

    public z(t13.d<? super z> dVar) {
        super(4, dVar);
    }

    @Override // e23.r
    public final Object invoke(r53.j<? super Boolean> jVar, Throwable th3, Long l14, t13.d<? super Boolean> dVar) {
        long jLongValue = l14.longValue();
        z zVar = new z(dVar);
        zVar.f177659b = jLongValue;
        return zVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177658a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f177659b;
            ue.u uVarA = ue.u.a();
            int i15 = b0.f177544b;
            uVarA.getClass();
            long jMin = Math.min(j8 * ((long) 30000), b0.f177543a);
            this.f177658a = 1;
            if (o53.m0.b(jMin, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.TRUE;
    }
}
