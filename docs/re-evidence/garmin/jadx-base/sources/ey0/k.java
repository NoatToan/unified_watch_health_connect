package ey0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lr61/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getDailyRacePredictorStats$2", f = "MultiDayActivitiesRepository.kt", l = {235}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends r61.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g0 g0Var, String str, fz0.c cVar, fz0.c cVar2, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f67197b = g0Var;
        this.f67198c = str;
        this.f67199d = cVar;
        this.f67200e = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f67197b, this.f67198c, this.f67199d, this.f67200e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends r61.a>>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67196a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.e eVarA = g0.a(this.f67197b);
        this.f67196a = 1;
        Object objA = eVarA.a(this.f67198c, this.f67199d, this.f67200e, this);
        return objA == aVar ? aVar : objA;
    }
}
