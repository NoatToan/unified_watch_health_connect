package cx1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyw1/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.repo.FitnessStatsRepo$getFitnessAge$2", f = "FitnessStatsRepo.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super a0<yw1.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f56622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, String str, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f56621b = oVar;
        this.f56622c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f56621b, this.f56622c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<yw1.k>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56620a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<yw1.k>> i0VarN = this.f56621b.f56664a.n(this.f56622c);
        this.f56620a = 1;
        Object objAwait = i0VarN.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
