package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/t4;", "Lsz0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t4 implements sz0.n {
    @Override // sz0.n
    public final Intent a(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        t00.c cVar = new t00.c();
        cVar.b(bundle);
        int i14 = c22.s.f23245a;
        switch (c22.s.a.f23246a[n00.c.a(cVar.f161660a).ordinal()]) {
            case 1:
            case 2:
                AdHocChallengeDetailsActivity.a aVar = AdHocChallengeDetailsActivity.f37168h;
                String str = cVar.f161662c;
                str.getClass();
                return AdHocChallengeDetailsActivity.a.b(aVar, context, str, cVar.f161664e, 8);
            case 3:
            case 4:
                AdHocChallengeDetailsActivity.a aVar2 = AdHocChallengeDetailsActivity.f37168h;
                String str2 = cVar.f161662c;
                str2.getClass();
                String str3 = cVar.f161664e;
                aVar2.getClass();
                return AdHocChallengeDetailsActivity.a.c(context, str2, str3);
            case 5:
                AdHocChallengeDetailsActivity.a aVar3 = AdHocChallengeDetailsActivity.f37168h;
                String str4 = cVar.f161662c;
                str4.getClass();
                Boolean bool = Boolean.TRUE;
                aVar3.getClass();
                return AdHocChallengeDetailsActivity.a.a(context, str4, null, bool);
            case 6:
                AdHocChallengeDetailsActivity.a aVar4 = AdHocChallengeDetailsActivity.f37168h;
                String str5 = cVar.f161662c;
                str5.getClass();
                aVar4.getClass();
                Intent intent = new Intent(context, (Class<?>) AdHocChallengeDetailsActivity.class);
                intent.putExtra("GCM_challenge_uuid", str5);
                intent.putExtra("GCM_challenge_is_vivokid", true);
                intent.putExtra("GCM_challenge_focus_on_comments", true);
                return intent;
            case 7:
            case 8:
                TeamChallengeActivity.a aVar5 = TeamChallengeActivity.f37278g;
                String str6 = cVar.f161662c;
                str6.getClass();
                String str7 = cVar.f161664e;
                str7.getClass();
                aVar5.getClass();
                return TeamChallengeActivity.a.a(context, str6, str7, false);
            case 9:
                TeamChallengeActivity.a aVar6 = TeamChallengeActivity.f37278g;
                String str8 = cVar.f161662c;
                str8.getClass();
                aVar6.getClass();
                return TeamChallengeActivity.a.a(context, str8, "", true);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                TeamChallengeActivity.a aVar7 = TeamChallengeActivity.f37278g;
                String str9 = cVar.f161662c;
                str9.getClass();
                aVar7.getClass();
                return TeamChallengeActivity.a.a(context, str9, "", false);
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                AdHocChallengeDetailsActivity.a aVar8 = AdHocChallengeDetailsActivity.f37168h;
                String str10 = cVar.f161662c;
                str10.getClass();
                aVar8.getClass();
                return AdHocChallengeDetailsActivity.a.c(context, str10, null);
            default:
                AdHocChallengeDetailsActivity.a aVar9 = AdHocChallengeDetailsActivity.f37168h;
                String str11 = cVar.f161662c;
                str11.getClass();
                return AdHocChallengeDetailsActivity.a.b(aVar9, context, str11, null, 12);
        }
    }
}
