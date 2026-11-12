package ey0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmm1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getSleepResultsDailySummary$2", f = "MultiDayActivitiesRepository.kt", l = {183}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<mm1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f67262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f67263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, b63.o oVar, b63.o oVar2, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f67261b = g0Var;
        this.f67262c = oVar;
        this.f67263d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f67261b, this.f67262c, this.f67263d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<mm1.b>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67260a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<mm1.b>> i0VarE = ((im1.a) this.f67261b.f67178e.getValue()).e(fz0.d.a(this.f67262c), fz0.d.a(this.f67263d));
        this.f67260a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
