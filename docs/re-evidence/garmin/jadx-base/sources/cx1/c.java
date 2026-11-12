package cx1;

import c83.a0;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyw1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.repo.FitnessStatsRepo$getCriticalSwimSpeed$2", f = "FitnessStatsRepo.kt", l = {165}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<yw1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, LocalDate localDate, LocalDate localDate2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f56617b = oVar;
        this.f56618c = localDate;
        this.f56619d = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f56617b, this.f56618c, this.f56619d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<yw1.a>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56616a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<yw1.a>> i0VarI = this.f56617b.f56664a.i(fz0.d.c(this.f56618c), fz0.d.c(this.f56619d));
        this.f56616a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
