package ey0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj61/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getDailyAggregatedCyclingAbility$2", f = "MultiDayActivitiesRepository.kt", l = {211}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super c83.a0<j61.j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f67190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f67191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g0 g0Var, b63.o oVar, b63.o oVar2, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f67189b = g0Var;
        this.f67190c = oVar;
        this.f67191d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f67189b, this.f67190c, this.f67191d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j61.j>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67188a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.b bVar = (dy0.b) this.f67189b.f67180g.getValue();
        fz0.c cVarA = fz0.d.a(this.f67190c);
        fz0.c cVarA2 = fz0.d.a(this.f67191d);
        String str = j61.h.DAILY.f97345a;
        this.f67188a = 1;
        Object objA = bVar.a(cVarA, cVarA2, str, this);
        return objA == aVar ? aVar : objA;
    }
}
