package by0;

import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lk61/b;", "<anonymous>", "(Lo53/b0;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getCyclingAbilityData$result$1", f = "MultiDayActivityDataSource.kt", l = {327}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super k61.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f21922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f21923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f21924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b63.o oVar, b63.o oVar2, a aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f21922c = oVar;
        this.f21923d = oVar2;
        this.f21924e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f21922c, this.f21923d, this.f21924e, dVar);
        lVar.f21921b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super k61.b> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b63.o oVar;
        o53.b0 b0Var = (o53.b0) this.f21921b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21920a;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVar2 = this.f21922c;
            if (oVar2 != null && (oVar = this.f21923d) != null) {
                this.f21921b = b0Var;
                this.f21920a = 1;
                obj = a.a(this.f21924e, oVar2, oVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        j61.j jVar = (j61.j) obj;
        if (jVar != null) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "GetCyclingAbilityDataUseCase - Result Success");
            return i61.a.a(jVar, null, null);
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        i2.f36769a.getClass();
        i2.a.e(a2Var2, "GetCyclingAbilityDataUseCase - Result Error: one or more chunks failed");
        return null;
    }
}
