package c22;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/s;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23245a = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23246a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.ADHOC_CHALLENGE_INVITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_INVITATION_WILL_EXPIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.VVFJR_ADHOC_CHALLENGE_INVITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_INVITE_WILL_EXPIRE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_COMMENTED_ON_CHALLENGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n00.c.VVFJR_COMMENTED_ON_CHALLENGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_INVITED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_INVITE_WILL_EXPIRE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n00.c.VVFJR_COMMENTED_ON_TEAM_CHALLENGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_START_TOMORROW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_START.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_ENDING_SOON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_ENDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_FIRST_PLACE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[n00.c.VVFJR_TEAM_CHALLENGE_ENDS_IN_A_TIE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[n00.c.VVFJR_ADHOC_CHALLENGE_ACCEPTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_DECLINED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_START_TOMORROW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_START.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_ENDING_SOON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_ENDED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[n00.c.VVFJR_ADHOC_CHALLENGE_FIRST_PLACE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[n00.c.VVFJR_CHALLENGE_NOT_FIRST_PLACE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_ACCEPTED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_DECLINED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_START_TOMORROW.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_STARTED.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_DAILY_SUMMARY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[n00.c.CHALLENGE_RANKING_UP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[n00.c.CHALLENGE_RANKING_TAKEN.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[n00.c.CHALLENGE_RANKING_DOWN.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_ENDING_SOON.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_ENDED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_FIRST_PLACE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_NOT_FIRST_PLACE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[n00.c.ADHOC_CHALLENGE_ALTERNATE_PRIZE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[n00.c.BADGE_CHALLENGE_REMINDER.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            f23246a = iArr;
        }
    }

    static {
        new s();
    }

    private s() {
    }

    public static final String a(Context context, t00.c cVar) {
        context.getClass();
        switch (a.f23246a[n00.c.a(cVar.f161660a).ordinal()]) {
            case 1:
                return context.getString(R.string.pn_adhoc_challenge_invited_format, cVar.f161665f);
            case 2:
                return context.getString(R.string.pn_adhoc_challenge_invite_will_expire_format, cVar.f161665f);
            case 3:
                return context.getString(R.string.pn_vvfjr_adhoc_challenge_invited_format, cVar.f161665f);
            case 4:
                return context.getString(R.string.pn_vvfjr_challenge_invite_will_expire_format, cVar.f161663d);
            case 5:
                return context.getString(R.string.pn_adhoc_challenge_commented_on_challenge, cVar.f161665f);
            case 6:
                return context.getString(R.string.pn_vvfjr_commented_on_challenge_format, cVar.f161665f, cVar.f161663d);
            case 7:
                return context.getString(R.string.pn_vvfjr_adhoc_challenge_invited_format, cVar.f161665f);
            case 8:
                return context.getString(R.string.pn_vvfjr_challenge_invite_will_expire_format, cVar.f161663d);
            case 9:
                return context.getString(R.string.pn_vvfjr_commented_on_challenge_format, cVar.f161665f, cVar.f161663d);
            case 10:
                return context.getString(R.string.pn_vvfjr_challenge_start_tomorrow_format, cVar.f161663d);
            case 11:
                return context.getString(R.string.pn_vvfjr_challenge_start_format, cVar.f161663d);
            case 12:
                return context.getString(R.string.pn_vvfjr_challenge_ending_soon_format, cVar.f161663d);
            case 13:
                return context.getString(R.string.pn_vvfjr_challenge_ended_format, cVar.f161663d);
            case 14:
                return context.getString(R.string.pn_team_challenge_first_place, cVar.f161665f);
            case 15:
                return context.getString(R.string.pn_team_challenge_tie);
            case 16:
                return context.getString(R.string.pn_vvfjr_adhoc_challenge_accepted_format, cVar.f161665f, cVar.f161663d);
            case 17:
                return context.getString(R.string.pn_vvfjr_adhoc_challenge_declined_format, cVar.f161665f, cVar.f161663d);
            case 18:
                return context.getString(R.string.pn_vvfjr_challenge_start_tomorrow_format, cVar.f161663d);
            case 19:
                return context.getString(R.string.pn_vvfjr_challenge_start_format, cVar.f161663d);
            case 20:
                return context.getString(R.string.pn_vvfjr_challenge_ending_soon_format, cVar.f161663d);
            case 21:
                return context.getString(R.string.pn_vvfjr_challenge_ended_format, cVar.f161663d);
            case 22:
                return context.getString(R.string.pn_vvfjr_adhoc_challenge_first_place_format, cVar.f161665f, cVar.f161663d);
            case 23:
                return context.getString(R.string.pn_vvfjr_challenge_not_first_place_format, cVar.f161663d);
            case 24:
                return context.getString(R.string.pn_adhoc_challenge_accepted_format, cVar.f161665f);
            case 25:
                return context.getString(R.string.pn_adhoc_challenge_declined_format, cVar.f161665f);
            case 26:
                return context.getString(R.string.pn_adhoc_challenge_start_tomorrow_format);
            case 27:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_start_format, context));
            case 28:
                int iA = cVar.a(R.string.pn_adhoc_challenge_summary_format, context);
                return (iA == R.string.pn_adhoc_challenge_summary_format_single || iA == R.string.pn_adhoc_challenge_summary_format_single_2 || iA == R.string.pn_adhoc_challenge_summary_format_single_3 || iA == R.string.pn_adhoc_challenge_summary_format_single_4) ? context.getString(iA, cVar.f161665f) : context.getString(iA);
            case 29:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_rank_up_format, context), cVar.f161665f);
            case 30:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_rank_taken_format, context), cVar.f161665f);
            case 31:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_rank_down_format, context), cVar.f161665f);
            case 32:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_ending_soon_format, context));
            case 33:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_ended_format, context));
            case 34:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_first_place_format, context));
            case 35:
                return context.getString(cVar.a(R.string.pn_adhoc_challenge_not_first_place_format, context));
            case 36:
                return context.getString(R.string.pn_adhoc_challenge_alternate_prize_format);
            case 37:
                String str = cVar.f161663d;
                j0 j0Var = j0.f23099a;
                DateTime dateTime = cVar.f161667h;
                j0Var.getClass();
                return context.getString(R.string.pn_pushnotification_badge_challenge_reminder, str, j0.v(dateTime));
            default:
                return null;
        }
    }
}
