package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcy0/i;", "<anonymous>", "(Lo53/b0;)Lcy0/i;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getHealthStats$result$1", f = "MultiDayActivityDataSource.kt", l = {470}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super cy0.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f22058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f22059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.o f22060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b63.o f22061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a aVar, b63.o oVar, b63.o oVar2, b63.o oVar3, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f22058c = aVar;
        this.f22059d = oVar;
        this.f22060e = oVar2;
        this.f22061f = oVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f22058c, this.f22059d, this.f22060e, this.f22061f, dVar);
        tVar.f22057b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super cy0.i> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        o53.b0 b0Var = (o53.b0) this.f22057b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f22056a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = a.f21686d;
            ey0.g0 g0VarP = this.f22058c.p();
            fz0.c cVarA = fz0.d.a(this.f22059d);
            fz0.c cVarA2 = fz0.d.a(this.f22060e);
            fz0.c cVarA3 = fz0.d.a(this.f22061f);
            this.f22057b = b0Var;
            this.f22056a = 1;
            obj = g0VarP.d(cVarA, cVarA2, cVarA3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF = b71.i.f("GetHealthStatsUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (cy0.i) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetHealthStatsUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
