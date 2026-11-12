package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "", "", "nonExistingResources", "Lcy0/c;", "<anonymous>", "(Lo53/b0;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getActivityResources$result$1", f = "MultiDayActivityDataSource.kt", l = {487}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.q<o53.b0, List<? extends Long>, t13.d<? super List<? extends cy0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ o53.b0 f21886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f21887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f21888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(3, dVar);
        this.f21888d = aVar;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, List<? extends Long> list, t13.d<? super List<? extends cy0.c>> dVar) {
        j jVar = new j(this.f21888d, dVar);
        jVar.f21886b = b0Var;
        jVar.f21887c = list;
        return jVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = this.f21886b;
        List list = this.f21887c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21885a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = a.f21686d;
            ey0.g0 g0VarP = this.f21888d.p();
            this.f21886b = b0Var;
            this.f21887c = null;
            this.f21885a = 1;
            g0VarP.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.f(g0VarP, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), list, null), this);
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
            String strF = e5.f(t7, "GetActivityResources - Result Success - resources:");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (List) t7;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetActivityResources - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return p13.j0.f134944a;
    }
}
