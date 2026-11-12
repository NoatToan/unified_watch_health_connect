package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcy0/k;", "<anonymous>", "(Lo53/b0;)Lcy0/k;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$epicDetails$result$1", f = "MultiDayActivityDataSource.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super cy0.k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f21791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f21791c = aVar;
        this.f21792d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f21791c, this.f21792d, dVar);
        fVar.f21790b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super cy0.k> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f21790b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21789a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = a.f21686d;
            ey0.g0 g0VarP = this.f21791c.p();
            this.f21790b = b0Var;
            this.f21789a = 1;
            g0VarP.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.o(g0VarP, this.f21792d, null), this);
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
            T t7 = ((v2.b) v2Var).f47386a;
            String strF = e5.f(t7, "GetEpicActivityDetail - Result Success - epicDetail:");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (cy0.k) t7;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetEpicActivityDetail - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
