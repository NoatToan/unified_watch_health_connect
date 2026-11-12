package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lr61/a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getDailyRacePredictorData$result$1", f = "MultiDayActivityDataSource.kt", l = {453}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends r61.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f21959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f21960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f21961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b63.o oVar, b63.o oVar2, a aVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f21959c = oVar;
        this.f21960d = oVar2;
        this.f21961e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f21959c, this.f21960d, this.f21961e, dVar);
        nVar.f21958b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends r61.a>> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b63.o oVar;
        o53.b0 b0Var = (o53.b0) this.f21958b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21957a;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVar2 = this.f21959c;
            if (oVar2 != null && (oVar = this.f21960d) != null) {
                String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                int i15 = a.f21686d;
                ey0.g0 g0VarP = this.f21961e.p();
                fz0.c cVarA = fz0.d.a(oVar2);
                fz0.c cVarA2 = fz0.d.a(oVar);
                this.f21958b = b0Var;
                this.f21957a = 1;
                g0VarP.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.k(g0VarP, userDisplayName, cVarA, cVarA2, null), this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF = b71.i.f("GetDailyRacePredictorDataUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetDailyRacePredictorDataUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
