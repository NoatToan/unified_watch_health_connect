package mt0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsFragment$getVivoKidChallengeDetails$1$1", f = "AdHocChallengeDetailsFragment.kt", l = {802}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.b f120591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f120591b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f120591b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120590a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.f120591b;
        if (i14 == 0) {
            o13.r.b(obj);
            ArrayList arrayListV6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.v6(bVar);
            p3 p3Var = (p3) bVar.f37325c.getValue();
            this.f120590a = 1;
            if (p3Var.x4(arrayListV6, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
        bVar.J6();
        g22.e.f(bVar);
        if (bVar.f37327e == null) {
            AdHocChallengeDTO adHocChallengeDTO = bVar.f37328f;
            adHocChallengeDTO.getClass();
            if (adHocChallengeDTO.f37998l != null) {
                bVar.I6();
            } else {
                LeaderboardActivity.a aVar3 = LeaderboardActivity.f37145i;
                androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                aVar3.getClass();
                Intent intentA = LeaderboardActivity.a.a(mVarRequireActivity);
                intentA.addFlags(268468224);
                bVar.startActivity(intentA);
                bVar.y6(null);
            }
        } else {
            bVar.I6();
        }
        return Unit.INSTANCE;
    }
}
