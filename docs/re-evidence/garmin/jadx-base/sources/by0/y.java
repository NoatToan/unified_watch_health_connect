package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/j;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getLiveTrackDetails$result$1", f = "MultiDayActivityDataSource.kt", l = {504}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f22139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a aVar, String str, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f22139c = aVar;
        this.f22140d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f22139c, this.f22140d, dVar);
        yVar.f22138b = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.j>> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f22138b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f22137a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = a.f21686d;
            ey0.g0 g0VarP = this.f22139c.p();
            this.f22138b = b0Var;
            this.f22137a = 1;
            g0VarP.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.r(g0VarP, this.f22140d, null), this);
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
            String strF = b71.i.f("GetLiveTrackDetails - Result Success: ", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetLiveTrackDetails - Result Error: ", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return p13.j0.f134944a;
    }
}
