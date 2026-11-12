package l70;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchRealTimeData$$inlined$flatMapLatest$1", f = "DashboardRepositoryImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.q<r53.j<? super j70.i>, a0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f110832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f110834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t13.d dVar, e eVar) {
        super(3, dVar);
        this.f110834d = eVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super j70.i> jVar, a0 a0Var, t13.d<? super Unit> dVar) {
        y yVar = new y(dVar, this.f110834d);
        yVar.f110832b = jVar;
        yVar.f110833c = a0Var;
        return yVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110831a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f110832b;
            a0 a0Var = (a0) this.f110833c;
            r53.i<j70.i> iVarA = this.f110834d.f110626l.a(a0Var.f110593a, a0Var.f110594b, a0Var.f110595c);
            this.f110832b = null;
            this.f110833c = null;
            this.f110831a = 1;
            if (r53.s.v(jVar, iVarA, this) == aVar) {
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
