package xm0;

import androidx.lifecycle.v1;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupLeaderboardListViewModel$getFetchFlow$$inlined$flatMapLatest$1", f = "GroupLeaderboardListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.q<r53.j<? super v2<k>>, v, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f191456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f191457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f191458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t13.d dVar, p pVar) {
        super(3, dVar);
        this.f191458d = pVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super v2<k>> jVar, v vVar, t13.d<? super Unit> dVar) {
        q qVar = new q(dVar, this.f191458d);
        qVar.f191456b = jVar;
        qVar.f191457c = vVar;
        return qVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191455a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f191456b;
            v vVar = (v) this.f191457c;
            u2 u2Var = new u2(20, 0, false, 20, 0, 0, 54, null);
            p pVar = this.f191458d;
            a2 a2VarA = yc.o.a(new t2(u2Var, null, new r(pVar, vVar), 2, null).f196485a, v1.a(pVar));
            this.f191456b = null;
            this.f191457c = null;
            this.f191455a = 1;
            if (r53.s.v(jVar, a2VarA, this) == aVar) {
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
