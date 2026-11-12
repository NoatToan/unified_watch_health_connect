package s00;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class m extends j {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155316a;

        static {
            int[] iArr = new int[n00.c.values().length];
            f155316a = iArr;
            try {
                iArr[n00.c.ADHOC_CHALLENGE_INVITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_DECLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_INVITATION_WILL_EXPIRE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_START_TOMORROW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_DAILY_SUMMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f155316a[n00.c.CHALLENGE_RANKING_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f155316a[n00.c.CHALLENGE_RANKING_TAKEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f155316a[n00.c.CHALLENGE_RANKING_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_ENDING_SOON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_ENDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_FIRST_PLACE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_NOT_FIRST_PLACE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_ALTERNATE_PRIZE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f155316a[n00.c.VVFJR_ADHOC_CHALLENGE_INVITED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_INVITE_WILL_EXPIRE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f155316a[n00.c.VVFJR_ADHOC_CHALLENGE_ACCEPTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_DECLINED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_START_TOMORROW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_START.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_ENDING_SOON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_ENDED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f155316a[n00.c.VVFJR_ADHOC_CHALLENGE_FIRST_PLACE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f155316a[n00.c.VVFJR_CHALLENGE_NOT_FIRST_PLACE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_INVITED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_INVITE_WILL_EXPIRE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_START_TOMORROW.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_START.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_ENDING_SOON.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_ENDED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_FIRST_PLACE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f155316a[n00.c.VVFJR_TEAM_CHALLENGE_ENDS_IN_A_TIE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f155316a[n00.c.ADHOC_CHALLENGE_COMMENTED_ON_CHALLENGE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f155316a[n00.c.VVFJR_COMMENTED_ON_CHALLENGE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f155316a[n00.c.VVFJR_COMMENTED_ON_TEAM_CHALLENGE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f155316a[n00.c.BADGE_CHALLENGE_REMINDER.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
        }
    }

    public static void f(Context context, Bundle bundle, Boolean bool) {
        t00.c cVar = new t00.c();
        cVar.b(bundle);
        po1.i iVar = new po1.i(context, cVar.f161662c, bool.booleanValue(), Objects.hash(Integer.valueOf(cVar.hashCode())), context.getString(R.string.launcher_name_garmin_connect), c22.s.a(context, cVar), bundle);
        oi2.a.f132270a.getClass();
        l73.c.b().e(iVar);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        if (y80.p0.f195202c) {
            return;
        }
        switch (a.f155316a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                f(garminConnectMobileApp, bundle, Boolean.FALSE);
                break;
            case 34:
            case 35:
            case 36:
                f(garminConnectMobileApp, bundle, Boolean.TRUE);
                break;
            case 37:
                t00.c cVar2 = new t00.c();
                cVar2.b(bundle);
                int iD = d(cVar);
                String string = garminConnectMobileApp.getString(R.string.pn_title_challenge_reminder);
                String strA = c22.s.a(garminConnectMobileApp, cVar2);
                sz0.e eVar = sz0.e.f161369i;
                String str = cVar2.f161670k;
                BadgeChallengeDetailsActivity.f37204e.getClass();
                j.e(garminConnectMobileApp, eVar, iD, string, strA, j.c(garminConnectMobileApp, BadgeChallengeDetailsActivity.a.a(garminConnectMobileApp, str)));
                break;
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.ADHOC_CHALLENGE_INVITED, n00.c.ADHOC_CHALLENGE_ACCEPTED, n00.c.ADHOC_CHALLENGE_DECLINED, n00.c.ADHOC_CHALLENGE_STARTED, n00.c.ADHOC_CHALLENGE_INVITATION_WILL_EXPIRE, n00.c.ADHOC_CHALLENGE_START_TOMORROW, n00.c.ADHOC_CHALLENGE_DAILY_SUMMARY, n00.c.CHALLENGE_RANKING_UP, n00.c.CHALLENGE_RANKING_TAKEN, n00.c.CHALLENGE_RANKING_DOWN, n00.c.ADHOC_CHALLENGE_ENDING_SOON, n00.c.ADHOC_CHALLENGE_ENDED, n00.c.ADHOC_CHALLENGE_FIRST_PLACE, n00.c.ADHOC_CHALLENGE_NOT_FIRST_PLACE, n00.c.ADHOC_CHALLENGE_ALTERNATE_PRIZE, n00.c.ADHOC_CHALLENGE_COMMENTED_ON_CHALLENGE, n00.c.VVFJR_ADHOC_CHALLENGE_INVITED, n00.c.VVFJR_CHALLENGE_INVITE_WILL_EXPIRE, n00.c.VVFJR_ADHOC_CHALLENGE_ACCEPTED, n00.c.VVFJR_CHALLENGE_DECLINED, n00.c.VVFJR_CHALLENGE_START_TOMORROW, n00.c.VVFJR_CHALLENGE_START, n00.c.VVFJR_CHALLENGE_ENDING_SOON, n00.c.VVFJR_CHALLENGE_ENDED, n00.c.VVFJR_ADHOC_CHALLENGE_FIRST_PLACE, n00.c.VVFJR_CHALLENGE_NOT_FIRST_PLACE, n00.c.VVFJR_COMMENTED_ON_CHALLENGE, n00.c.VVFJR_TEAM_CHALLENGE_INVITED, n00.c.VVFJR_COMMENTED_ON_TEAM_CHALLENGE, n00.c.VVFJR_TEAM_CHALLENGE_INVITE_WILL_EXPIRE, n00.c.VVFJR_TEAM_CHALLENGE_START_TOMORROW, n00.c.VVFJR_TEAM_CHALLENGE_START, n00.c.VVFJR_TEAM_CHALLENGE_ENDING_SOON, n00.c.VVFJR_TEAM_CHALLENGE_ENDED, n00.c.VVFJR_TEAM_CHALLENGE_FIRST_PLACE, n00.c.VVFJR_TEAM_CHALLENGE_ENDS_IN_A_TIE, n00.c.BADGE_CHALLENGE_REMINDER};
    }
}
