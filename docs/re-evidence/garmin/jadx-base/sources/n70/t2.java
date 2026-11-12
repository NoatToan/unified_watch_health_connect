package n70;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$$inlined$flatMapLatest$1", f = "GetKeyStatsItemsUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class t2 extends v13.i implements e23.q<r53.j<? super o70.p>, o13.p<? extends List<? extends o70.r>, ? extends Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f124582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2 f124584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f124585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f124586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f124587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a f124588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a f124589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.a f124590j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(t13.d dVar, p2 p2Var, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6) {
        super(3, dVar);
        this.f124584d = p2Var;
        this.f124585e = aVar;
        this.f124586f = aVar2;
        this.f124587g = aVar3;
        this.f124588h = aVar4;
        this.f124589i = aVar5;
        this.f124590j = aVar6;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super o70.p> jVar, o13.p<? extends List<? extends o70.r>, ? extends Boolean> pVar, t13.d<? super Unit> dVar) {
        t2 t2Var = new t2(dVar, this.f124584d, this.f124585e, this.f124586f, this.f124587g, this.f124588h, this.f124589i, this.f124590j);
        t2Var.f124582b = jVar;
        t2Var.f124583c = pVar;
        return t2Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.i iVarL;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124581a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f124582b;
            o13.p pVar = (o13.p) this.f124583c;
            List list = (List) pVar.f128594a;
            int size = list != null ? list.size() : 0;
            int i15 = p2.f124482f;
            p2 p2Var = this.f124584d;
            p2Var.getClass();
            if (size == 6) {
                iVarL = new r53.c2(new r2(null));
            } else {
                q2 q2Var = new q2((r53.i) this.f124585e.invoke());
                iVarL = r53.s.l(r53.s.s(q2Var), r53.s.s((r53.i) this.f124586f.invoke()), r53.s.s(p2Var.f124485c.c()), new s2(p2Var, q2Var, null));
            }
            r53.u1 u1Var = new r53.u1(r53.s.s(iVarL), r53.s.s((r53.i) this.f124587g.invoke()), new u2(this.f124584d, pVar, this.f124588h, this.f124587g, this.f124589i, this.f124590j, this.f124585e, null));
            this.f124582b = null;
            this.f124583c = null;
            this.f124581a = 1;
            if (r53.s.v(jVar, u1Var, this) == aVar) {
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
