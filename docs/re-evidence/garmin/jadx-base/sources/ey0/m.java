package ey0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ln61/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getEnduranceScoreData$2", f = "MultiDayActivitiesRepository.kt", l = {229}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<n61.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m61.a f67209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g0 g0Var, fz0.c cVar, fz0.c cVar2, m61.a aVar, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f67206b = g0Var;
        this.f67207c = cVar;
        this.f67208d = cVar2;
        this.f67209e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f67206b, this.f67207c, this.f67208d, this.f67209e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<n61.f>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67205a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.e eVarA = g0.a(this.f67206b);
        String str = this.f67209e.f116886a;
        this.f67205a = 1;
        Object objB = eVarA.b(this.f67207c, this.f67208d, str, this);
        return objB == aVar ? aVar : objB;
    }
}
