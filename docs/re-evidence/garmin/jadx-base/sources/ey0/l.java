package ey0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getDailyVO2MaxData$2", f = "MultiDayActivitiesRepository.kt", l = {201}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends o61.p>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g0 g0Var, fz0.c cVar, fz0.c cVar2, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f67202b = g0Var;
        this.f67203c = cVar;
        this.f67204d = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f67202b, this.f67203c, this.f67204d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends o61.p>>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67201a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.e eVarA = g0.a(this.f67202b);
        this.f67201a = 1;
        Object objF = eVarA.f(this.f67203c, this.f67204d, this);
        return objF == aVar ? aVar : objF;
    }
}
