package pt0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/n;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.ChallengeViewModelDelegateImpl$optInAutoChallenge$1", f = "ChallengeViewModelDelegateImpl.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140792a;

    public x(t13.d<? super x> dVar) {
        super(1, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.n>> dVar) {
        return new x(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140792a;
        if (i14 == 0) {
            o13.r.b(obj);
            yt0.q.f199578b.getClass();
            yt0.q qVarA = yt0.q.a.a();
            this.f140792a = 1;
            obj = com.garmin.android.apps.connectmobile.f0.J(qVarA, new yt0.r(qVarA, null), this);
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
            com.garmin.android.apps.connectmobile.leaderboard.model.n.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.n.f38238g;
            v2.b bVar = (v2.b) v2Var;
            JSONObject jSONObject = new JSONObject((String) bVar.f47386a);
            aVar2.getClass();
            return new v2.b(com.garmin.android.apps.connectmobile.leaderboard.model.n.a.a(jSONObject), bVar.f47387b, null, null, 12, null);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar3 = (v2.a) v2Var;
        return new v2.a(aVar3.f47383a, aVar3.f47384b, aVar3.f47385c);
    }
}
