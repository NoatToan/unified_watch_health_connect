package eh0;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ldh0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.data.repository.FitnessAgeRepositoryImpl$getFitnessAgeDetails$result$1", f = "FitnessAgeRepositoryImpl.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<dh0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f64034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f64035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, o oVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f64034b = cVar;
        this.f64035c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f64034b, this.f64035c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<dh0.c>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64033a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<dh0.c>> i0VarC = this.f64034b.f64025a.c(new fz0.f(this.f64035c));
        this.f64033a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
