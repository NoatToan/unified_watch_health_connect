package l70;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivitiesAndWorkouts$$inlined$flatMapLatest$1", f = "DashboardRepositoryImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.q<r53.j<? super j70.k.c>, List<? extends j70.v>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f110701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f110703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t13.d dVar, e eVar) {
        super(3, dVar);
        this.f110703d = eVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super j70.k.c> jVar, List<? extends j70.v> list, t13.d<? super Unit> dVar) {
        j jVar2 = new j(dVar, this.f110703d);
        jVar2.f110701b = jVar;
        jVar2.f110702c = list;
        return jVar2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110700a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f110701b;
            List list = (List) this.f110702c;
            e eVar = this.f110703d;
            l lVar = new l(eVar.f110616b.b(new j70.h(j70.g.f(list), null, null, null, 14, null)), eVar);
            this.f110701b = null;
            this.f110702c = null;
            this.f110700a = 1;
            if (r53.s.v(jVar, lVar, this) == aVar) {
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
