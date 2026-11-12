package pt0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.BadgeChallengesViewModel$badgeChallengeRedeem$1", f = "BadgeChallengesViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.p f140780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f140781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f140782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f140783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, long j8, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f140782c = pVar;
        this.f140783d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f140782c, this.f140783d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140781b;
        if (i14 == 0) {
            o13.r.b(obj);
            p pVar2 = this.f140782c;
            g3<com.garmin.android.apps.connectmobile.leaderboard.model.p> g3VarD = pVar2.f140756c.d();
            if (g3VarD == null || (pVar = g3VarD.f35301b) == null) {
                return new v2.a(new IllegalStateException("There is no challenge detail"), null, null);
            }
            r0 r0Var = pVar2.f140755b;
            this.f140780a = pVar;
            this.f140781b = 1;
            obj = r0Var.a(this.f140783d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar3 = this.f140780a;
            o13.r.b(obj);
            pVar = pVar3;
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            return new v2.b(pVar, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
    }
}
