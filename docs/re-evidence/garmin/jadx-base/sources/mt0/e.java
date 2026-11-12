package mt0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsFragment$getAdHocChallengeDetails$1$1$1", f = "AdHocChallengeDetailsFragment.kt", l = {751}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.b f120578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f120578b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f120578b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        AdHocChallengeDTO adHocChallengeDTO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120577a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.f120578b;
        if (i14 == 0) {
            o13.r.b(obj);
            ArrayList arrayListV6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.v6(bVar);
            p3 p3Var = (p3) bVar.f37325c.getValue();
            this.f120577a = 1;
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
        if (bVar.f37327e != null) {
            AdHocChallengeDTO adHocChallengeDTO2 = bVar.f37328f;
            if ((adHocChallengeDTO2 != null ? adHocChallengeDTO2.f37998l : null) == null) {
                com.garmin.android.apps.connectmobile.leaderboard.model.v vVarC = adHocChallengeDTO2 != null ? adHocChallengeDTO2.C() : null;
                if (vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED || vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED || vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED) {
                    LeaderboardActivity.a aVar3 = LeaderboardActivity.f37145i;
                    Context contextRequireContext = bVar.requireContext();
                    aVar3.getClass();
                    Intent intentA = LeaderboardActivity.a.a(contextRequireContext);
                    intentA.putExtra("EXTRA_VIEW_DETAIL_RESULT", 701);
                    intentA.setFlags(67108864);
                    bVar.startActivity(intentA);
                    bVar.y6(null);
                } else if (bVar.f37327e == null) {
                    adHocChallengeDTO = bVar.f37328f;
                    adHocChallengeDTO.getClass();
                    if (adHocChallengeDTO.f37998l != null) {
                        bVar.I6();
                    } else {
                        LeaderboardActivity.a aVar4 = LeaderboardActivity.f37145i;
                        androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                        aVar4.getClass();
                        Intent intentA2 = LeaderboardActivity.a.a(mVarRequireActivity);
                        intentA2.addFlags(268468224);
                        bVar.startActivity(intentA2);
                        bVar.y6(null);
                    }
                } else {
                    bVar.I6();
                }
            } else if (bVar.f37327e == null) {
                adHocChallengeDTO = bVar.f37328f;
                adHocChallengeDTO.getClass();
                if (adHocChallengeDTO.f37998l != null) {
                    bVar.I6();
                } else {
                    LeaderboardActivity.a aVar5 = LeaderboardActivity.f37145i;
                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                    aVar5.getClass();
                    Intent intentA3 = LeaderboardActivity.a.a(mVarRequireActivity2);
                    intentA3.addFlags(268468224);
                    bVar.startActivity(intentA3);
                    bVar.y6(null);
                }
            } else {
                bVar.I6();
            }
        } else if (bVar.f37327e == null) {
            adHocChallengeDTO = bVar.f37328f;
            adHocChallengeDTO.getClass();
            if (adHocChallengeDTO.f37998l != null) {
                bVar.I6();
            } else {
                LeaderboardActivity.a aVar6 = LeaderboardActivity.f37145i;
                androidx.fragment.app.m mVarRequireActivity3 = bVar.requireActivity();
                aVar6.getClass();
                Intent intentA4 = LeaderboardActivity.a.a(mVarRequireActivity3);
                intentA4.addFlags(268468224);
                bVar.startActivity(intentA4);
                bVar.y6(null);
            }
        } else {
            bVar.I6();
        }
        return Unit.INSTANCE;
    }
}
