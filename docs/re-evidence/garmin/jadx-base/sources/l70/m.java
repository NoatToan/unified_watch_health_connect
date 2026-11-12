package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivityTrendDismissedPrompts$$inlined$flatMapLatest$1", f = "DashboardRepositoryImpl.kt", l = {211, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.q<r53.j<? super j70.k.d>, List<? extends j70.b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f110736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f110738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r53.j f110739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t13.d dVar, e eVar) {
        super(3, dVar);
        this.f110738d = eVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super j70.k.d> jVar, List<? extends j70.b> list, t13.d<? super Unit> dVar) {
        m mVar = new m(dVar, this.f110738d);
        mVar.f110736b = jVar;
        mVar.f110737c = list;
        return mVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b9, code lost:
    
        if (r13 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cf, code lost:
    
        if (r53.s.v(r1, r3, r12) == r0) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar;
        r53.i c2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110735a;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f110739e;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        jVar = this.f110736b;
        List list = (List) this.f110737c;
        a2 a2Var = a2.DASHBOARD;
        String strH = tn.k.h("fetchActivityTrendDismissedPrompts() primaryStats[", "]", list);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DashboardRepository", strH);
        if (list == null || list.size() != 6) {
            Set<o70.c> setB = j70.g.b(list);
            i2.a.b(a2Var, "DashboardRepository", "fetchActivityTrendDismissedPrompts() displayedTypes[" + setB + "]");
            e eVar = this.f110738d;
            Set setG1 = p13.h0.g1(eVar.f110632r.h());
            i2.a.b(a2Var, "DashboardRepository", "fetchActivityTrendDismissedPrompts() dismissedTypes[" + setG1 + "]");
            LinkedHashSet linkedHashSetO0 = p13.h0.O0(p13.h0.O0(o70.c.f129940l, setB), setG1);
            i2.a.b(a2Var, "DashboardRepository", "fetchActivityTrendDismissedPrompts() activityTrendTypes[" + linkedHashSetO0 + "]");
            com.garmin.android.apps.connectmobile.dashboard.data.datasource.o oVar = eVar.f110618d;
            this.f110736b = null;
            this.f110737c = null;
            this.f110739e = jVar;
            this.f110735a = 1;
            obj = oVar.a(linkedHashSetO0);
        } else {
            c2Var = new c2(new o(null));
            this.f110736b = null;
            this.f110737c = null;
            this.f110739e = null;
            this.f110735a = 2;
        }
        return aVar;
        c2Var = new p((r53.i) obj);
        this.f110736b = null;
        this.f110737c = null;
        this.f110739e = null;
        this.f110735a = 2;
    }
}
