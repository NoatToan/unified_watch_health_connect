package ne0;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lpe0/i;", "<anonymous>", "(Lo53/b0;)Lpe0/i;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetAllDogsLifetimeStatsUseCase$invoke$2", f = "GetAllDogsLifetimeStatsUseCase.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super pe0.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f125508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f125508b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f125508b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super pe0.i> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        je0.h.c cVar;
        je0.h.c cVar2;
        je0.h.c cVar3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125507a;
        Integer num = null;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = this.f125508b.f125509a;
            this.f125507a = 1;
            int i15 = me0.w.f118065e;
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.i(wVar, p13.x.k("distance", "duration"), null), this);
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
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                q2.u("Failed to get all dogs lifetime stats");
                return null;
            }
            u0.r();
            return null;
        }
        je0.h hVar = (je0.h) ((v2.b) v2Var).f47386a;
        Map<String, je0.h.c> map = hVar.f98528c.get(TtmlNode.COMBINE_ALL);
        Double d14 = (map == null || (cVar3 = map.get("distance")) == null) ? null : cVar3.f98534e;
        Map<String, je0.h.c> map2 = hVar.f98528c.get(TtmlNode.COMBINE_ALL);
        Double d15 = (map2 == null || (cVar2 = map2.get("duration")) == null) ? null : cVar2.f98534e;
        Map<String, je0.h.c> map3 = hVar.f98528c.get(TtmlNode.COMBINE_ALL);
        if (map3 != null && (cVar = map3.get("duration")) != null) {
            num = cVar.f98530a;
        }
        return new pe0.i(d14, d15, num);
    }
}
