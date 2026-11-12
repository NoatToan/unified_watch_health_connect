package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lj70/k$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActiveCampaign$1", f = "DashboardRepositoryImpl.kt", l = {584}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<r53.j<? super j70.k.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f110671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f110672c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j<j70.k.a> f110673a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.j<? super j70.k.a> jVar) {
            this.f110673a = jVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.f fVar = (com.garmin.android.apps.connectmobile.dashboard.data.datasource.f) obj;
            j70.k.a aVar = new j70.k.a(fVar.f33190a, fVar.f33191b);
            a2 a2Var = a2.DASHBOARD;
            String str = "fetchActiveCampaign() status[" + aVar.f97545a + "]";
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DashboardRepository", str);
            Object objEmit = this.f110673a.emit(aVar, dVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f110672c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f110672c, dVar);
        fVar.f110671b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super j70.k.a> jVar, t13.d<? super Unit> dVar) {
        return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f110671b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110670a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2VarB = this.f110672c.f110624j.b();
            a aVar2 = new a(jVar);
            this.f110671b = null;
            this.f110670a = 1;
            if (p2VarB.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
