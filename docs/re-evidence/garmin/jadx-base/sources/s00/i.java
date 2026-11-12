package s00;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.text.NumberFormat;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.l<ru.e> f155297a = KoinJavaComponent.inject(ru.e.class);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155298a;

        static {
            int[] iArr = new int[n00.c.values().length];
            f155298a = iArr;
            try {
                iArr[n00.c.BADGE_EARNED_SINGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155298a[n00.c.GOLF_BADGE_EARNED_SINGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155298a[n00.c.LIMITED_BADGE_AVAILABLE_TODAY_ONLY_SINGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f155298a[n00.c.LIMITED_BADGE_AVAILABLE_SINGULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f155298a[n00.c.LIMITED_BADGE_EXPIRING_SINGULAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f155298a[n00.c.BADGE_PARTNER_REWARD_EARNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f155298a[n00.c.LIMITED_BADGE_AVAILABLE_TODAY_ONLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f155298a[n00.c.LIMITED_BADGE_AVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f155298a[n00.c.LIMITED_BADGE_EXPIRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f155298a[n00.c.BADGE_EARNED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f155298a[n00.c.GOLF_BADGE_EARNED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f155298a[n00.c.BADGE_LEVEL_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        String string;
        String string2;
        Intent intentA;
        if (y80.p0.f195202c) {
            return;
        }
        String strA = GsonUtil.a(bundle);
        Parcelable.Creator<t00.b> creator = t00.b.CREATOR;
        t00.b bVar = (t00.b) GsonUtil.f47253b.fromJson(strA, t00.b.class);
        n00.c cVar2 = n00.c.BADGE_PARTNER_REWARD_EARNED;
        int i14 = R.string.launcher_name_garmin_connect;
        if (cVar == cVar2) {
            String strG = bVar.g();
            if (strG != null) {
                int identifier = garminConnectMobileApp.getResources().getIdentifier(strG, "string", garminConnectMobileApp.getPackageName());
                if (identifier != 0) {
                    i14 = identifier;
                } else {
                    i2.m(a2.CHALLENGES, "BadgePushNotificationHandler", "Unknown string handle: ".concat(strG));
                }
            }
            string = garminConnectMobileApp.getString(i14);
        } else {
            string = garminConnectMobileApp.getString(R.string.launcher_name_garmin_connect);
        }
        String str = string;
        int[] iArr = a.f155298a;
        switch (iArr[cVar.ordinal()]) {
            case 1:
            case 2:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_earned_single_format, bVar.f());
                break;
            case 3:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_start_today_only_single_format);
                break;
            case 4:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_start_single_format);
                break;
            case 5:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_expire_single_format, bVar.f());
                break;
            case 6:
                string2 = garminConnectMobileApp.getString(R.string.msg_completed_challenge_reward, bVar.f());
                break;
            case 7:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_start_today_only_format);
                break;
            case 8:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_start_format);
                break;
            case 9:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_expire_format);
                break;
            case 10:
            case 11:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_earned_format, NumberFormat.getInstance().format(bVar.b()));
                break;
            case 12:
                string2 = garminConnectMobileApp.getString(R.string.pn_badge_level_up_format, NumberFormat.getInstance().format(bVar.i()));
                break;
            default:
                vb.h.z("Should never happen.");
                return;
        }
        String str2 = string2;
        switch (iArr[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int iD = bVar.d();
                BadgeDetailsActivity.f30322l.getClass();
                intentA = BadgeDetailsActivity.a.a(iD, garminConnectMobileApp);
                break;
            case 6:
                String strH = bVar.h();
                BadgeChallengeDetailsActivity.f37204e.getClass();
                intentA = BadgeChallengeDetailsActivity.a.a(garminConnectMobileApp, strH);
                break;
            case 7:
            case 8:
            case 9:
                BadgesActivity.f30332j.getClass();
                intentA = BadgesActivity.b.a(garminConnectMobileApp, null, true);
                break;
            case 10:
            case 11:
            case 12:
                BadgesActivity.f30332j.getClass();
                garminConnectMobileApp.getClass();
                intentA = BadgesActivity.b.a(garminConnectMobileApp, null, false);
                break;
            default:
                vb.h.z("Should never happen.");
                return;
        }
        j.e(garminConnectMobileApp, sz0.e.f161368h, d(cVar), str, str2, j.c(garminConnectMobileApp, intentA));
        if (cVar == cVar2) {
            this.f155297a.getValue().b(0L);
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.BADGE_EARNED_SINGULAR, n00.c.BADGE_EARNED, n00.c.BADGE_LEVEL_UP, n00.c.BADGE_PARTNER_REWARD_EARNED, n00.c.LIMITED_BADGE_AVAILABLE_SINGULAR, n00.c.LIMITED_BADGE_AVAILABLE, n00.c.LIMITED_BADGE_AVAILABLE_TODAY_ONLY_SINGULAR, n00.c.LIMITED_BADGE_AVAILABLE_TODAY_ONLY, n00.c.LIMITED_BADGE_EXPIRING_SINGULAR, n00.c.LIMITED_BADGE_EXPIRING, n00.c.GOLF_BADGE_EARNED_SINGULAR, n00.c.GOLF_BADGE_EARNED};
    }
}
