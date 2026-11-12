package gn;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.domain.dashboard.GetActivityTrendsCardDataUseCase$invoke$$inlined$flatMapLatest$1", f = "GetActivityTrendsCardDataUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.q<r53.j<? super List<? extends in.e>>, List<? extends zd0.o.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f78029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f78030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f78031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t13.d dVar, f fVar) {
        super(3, dVar);
        this.f78031d = fVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super List<? extends in.e>> jVar, List<? extends zd0.o.a> list, t13.d<? super Unit> dVar) {
        h hVar = new h(dVar, this.f78031d);
        hVar.f78029b = jVar;
        hVar.f78030c = list;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78028a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f78029b;
            List list = (List) this.f78030c;
            k kVar = this.f78031d.f78025c;
            list.getClass();
            j jVar2 = new j(kVar.f78043a.a(), list);
            this.f78029b = null;
            this.f78030c = null;
            this.f78028a = 1;
            if (r53.s.v(jVar, jVar2, this) == aVar) {
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
