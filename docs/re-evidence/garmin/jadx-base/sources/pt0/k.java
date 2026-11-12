package pt0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Comparator;
import lc.u0;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.AutoChallengeLeaderboardViewModel$getPreviousChallenge$1", f = "AutoChallengeLeaderboardViewModel.kt", l = {108, 114, 117}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<t0<v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.i>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f140720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f140721c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.model.f) t14;
            com.garmin.android.apps.connectmobile.leaderboard.model.f fVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.f) t7;
            return r13.a.b(fVar != null ? fVar.f38141f : null, fVar2 != null ? fVar2.f38141f : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f140721c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f140721c, dVar);
        kVar.f140720b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.i>> t0Var, t13.d<? super Unit> dVar) {
        return ((k) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r0.emit(r7, r14) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r0.emit(r5, r14) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws JSONException {
        t0 t0Var = (t0) this.f140720b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140719a;
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
        yt0.q qVar = this.f140721c.f140675b;
        this.f140720b = t0Var;
        this.f140719a = 1;
        qVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(qVar, new yt0.u(qVar, null, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.leaderboard.model.i.b bVar = com.garmin.android.apps.connectmobile.leaderboard.model.i.f38187d;
            v2.b bVar2 = (v2.b) v2Var;
            JSONObject jSONObject = new JSONObject((String) bVar2.f47386a);
            bVar.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.i iVarA = com.garmin.android.apps.connectmobile.leaderboard.model.i.b.a(jSONObject);
            com.garmin.android.apps.connectmobile.leaderboard.model.f[] fVarArr = iVarA.f38190c;
            iVarA.f38190c = fVarArr != null ? (com.garmin.android.apps.connectmobile.leaderboard.model.f[]) p13.u.Y(fVarArr, new a()).toArray(new com.garmin.android.apps.connectmobile.leaderboard.model.f[0]) : null;
            v2.b bVar3 = new v2.b(iVarA, bVar2.f47387b, null, null, 12, null);
            this.f140720b = null;
            this.f140719a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            v2.a aVar3 = new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
            this.f140720b = null;
            this.f140719a = 3;
        }
    }
}
