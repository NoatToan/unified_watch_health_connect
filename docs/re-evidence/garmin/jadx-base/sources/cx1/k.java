package cx1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyw1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.repo.FitnessStatsRepo$getPersonalRecordTypes$2", f = "FitnessStatsRepo.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super a0<List<? extends yw1.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f56652b = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f56652b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends yw1.h>>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56651a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<yw1.h>>> i0VarC = this.f56652b.f56664a.c();
        this.f56651a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
