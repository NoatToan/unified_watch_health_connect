package pt0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/n;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.AutoChallengeLeaderboardViewModel$addUserToChallenge$1", f = "AutoChallengeLeaderboardViewModel.kt", l = {69, 72, 75}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<t0<v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.n>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f140688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f140689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f140689c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f140689c, dVar);
        hVar.f140688b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.n>> t0Var, t13.d<? super Unit> dVar) {
        return ((h) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r0.emit(r7, r14) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r0.emit(r5, r14) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f140688b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140687a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        yt0.q qVar = this.f140689c.f140675b;
        this.f140688b = t0Var;
        this.f140687a = 1;
        qVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(qVar, new yt0.r(qVar, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.leaderboard.model.n.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.model.n.f38238g;
            v2.b bVar = (v2.b) v2Var;
            JSONObject jSONObject = new JSONObject((String) bVar.f47386a);
            aVar2.getClass();
            v2.b bVar2 = new v2.b(com.garmin.android.apps.connectmobile.leaderboard.model.n.a.a(jSONObject), bVar.f47387b, null, null, 12, null);
            this.f140688b = null;
            this.f140687a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            v2.a aVar4 = new v2.a(aVar3.f47383a, aVar3.f47384b, aVar3.f47385c);
            this.f140688b = null;
            this.f140687a = 3;
        }
    }
}
