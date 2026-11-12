package eh0;

import b63.o;
import c83.a0;
import dh0.k;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ldh0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.data.repository.FitnessAgeRepositoryImpl$getFitnessAgeDailySummary$2", f = "FitnessAgeRepositoryImpl.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends k>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f64027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f64028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f64029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, o oVar, o oVar2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f64027b = cVar;
        this.f64028c = oVar;
        this.f64029d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f64027b, this.f64028c, this.f64029d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends k>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64026a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<k>>> i0VarA = this.f64027b.f64025a.a(new fz0.f(this.f64028c), new fz0.f(this.f64029d));
        this.f64026a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
