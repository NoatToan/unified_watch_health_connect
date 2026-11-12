package km1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkm1/x;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f105620a;

    public x(Context context) {
        context.getClass();
        this.f105620a = context;
    }

    public final String a(String str) {
        Integer numValueOf;
        if (str != null) {
            switch (str) {
                case "NEGATIVE_POOR_STRUCTURE":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_74);
                    break;
                case "NEGATIVE_SHORT_AND_POOR_QUALITY":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_and_43);
                    break;
                case "NEGATIVE_LONG_BUT_POOR_QUALITY":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_long_enough_but_56);
                    break;
                case "NEGATIVE_LONG_BUT_LIGHT":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_long_enough_but_69);
                    break;
                case "POSITIVE_SHORT_BUT_CONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_but_56);
                    break;
                case "NEGATIVE_LONG_BUT_RESTLESS":
                    numValueOf = Integer.valueOf(R.string.msg_your_total_sleep_was_long_52);
                    break;
                case "NEGATIVE_LONG_BUT_TOO_MUCH_REM":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_long_enough_but_76);
                    break;
                case "POSITIVE_HIGHLY_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.msg_you_had_extremely_restorative_sleep_38);
                    break;
                case "POSITIVE_OPTIMAL_STRUCTURE":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_showed_good_balance_70);
                    break;
                case "NEGATIVE_TOO_MUCH_REM":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_91);
                    break;
                case "POSITIVE_SHORT_BUT_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_but_54);
                    break;
                case "NEGATIVE_LONG_BUT_DISCONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.msg_your_total_sleep_was_long_70);
                    break;
                case "POSITIVE_REFRESHING":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_a_bit_57);
                    break;
                case "NEGATIVE_SHORT_AND_POOR_STRUCTURE":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_too_little_and_57);
                    break;
                case "POSITIVE_CONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_a_bit_62);
                    break;
                case "NEGATIVE_SHORT_AND_NONRECOVERING":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_and_58);
                    break;
                case "NEGATIVE_LONG_BUT_NOT_ENOUGH_REM":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_long_enough_but_62);
                    break;
                case "POSITIVE_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_a_bit_60);
                    break;
                case "NEGATIVE_RESTLESS":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_59);
                    break;
                case "POSITIVE_SHORT_BUT_CALM":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_but_63);
                    break;
                case "POSITIVE_SHORT_BUT_DEEP":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_but_51);
                    break;
                case "POSITIVE_LONG_AND_REFRESHING":
                    numValueOf = Integer.valueOf(R.string.msg_you_had_a_refreshing_amount_42);
                    break;
                case "NEGATIVE_DISCONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_70);
                    break;
                case "NEGATIVE_NOT_RESTORATIVE":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_75);
                    break;
                case "POSITIVE_LONG_AND_CALM":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_long_and_31);
                    break;
                case "POSITIVE_LONG_AND_DEEP":
                    numValueOf = Integer.valueOf(R.string.msg_you_had_long_deep_sleep_26);
                    break;
                case "NEGATIVE_NOT_ENOUGH_REM":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_78);
                    break;
                case "NEGATIVE_LIGHT":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_a_bit_less_73);
                    break;
                case "POSITIVE_LONG_AND_CONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.msg_you_had_long_and_continuous_35);
                    break;
                case "POSITIVE_CALM":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_a_bit_79);
                    break;
                case "POSITIVE_DEEP":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_a_bit_59);
                    break;
                case "NEGATIVE_LONG_BUT_NOT_RESTORATIVE":
                    numValueOf = Integer.valueOf(R.string.msg_you_slept_long_enough_but_87);
                    break;
                case "POSITIVE_LONG_AND_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_very_restorative_34);
                    break;
                case "POSITIVE_SHORT_BUT_REFRESHING":
                    numValueOf = Integer.valueOf(R.string.msg_your_sleep_was_short_but_68);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            if (numValueOf != null) {
                return this.f105620a.getString(numValueOf.intValue());
            }
        }
        return null;
    }

    public final String b(String str) {
        Integer numValueOf;
        if (str != null) {
            switch (str) {
                case "NEGATIVE_POOR_STRUCTURE":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_unbalanced_sleep_stages);
                    break;
                case "NEGATIVE_SHORT_AND_POOR_QUALITY":
                    numValueOf = Integer.valueOf(R.string.lbl_short_poor_quality);
                    break;
                case "NEGATIVE_LONG_BUT_POOR_QUALITY":
                    numValueOf = Integer.valueOf(R.string.lbl_poor_quality);
                    break;
                case "NEGATIVE_LONG_BUT_LIGHT":
                    numValueOf = Integer.valueOf(R.string.lbl_not_enough_deep);
                    break;
                case "POSITIVE_SHORT_BUT_CONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.lbl_short_continuous);
                    break;
                case "NEGATIVE_LONG_BUT_RESTLESS":
                    numValueOf = Integer.valueOf(R.string.lbl_restless);
                    break;
                case "NEGATIVE_LONG_BUT_TOO_MUCH_REM":
                    numValueOf = Integer.valueOf(R.string.lbl_too_much_rem);
                    break;
                case "POSITIVE_HIGHLY_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.lbl_highly_restorative);
                    break;
                case "POSITIVE_OPTIMAL_STRUCTURE":
                    numValueOf = Integer.valueOf(R.string.lbl_optimal_sleep_stages);
                    break;
                case "NEGATIVE_TOO_MUCH_REM":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_too_much_rem);
                    break;
                case "POSITIVE_SHORT_BUT_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.lbl_short_restorative);
                    break;
                case "NEGATIVE_LONG_BUT_DISCONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.lbl_interrupted);
                    break;
                case "POSITIVE_REFRESHING":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_plenty_of_rem);
                    break;
                case "NEGATIVE_SHORT_AND_POOR_STRUCTURE":
                    numValueOf = Integer.valueOf(R.string.lbl_short_unbalanced_sleep_stages);
                    break;
                case "POSITIVE_CONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_continuous);
                    break;
                case "NEGATIVE_SHORT_AND_NONRECOVERING":
                    numValueOf = Integer.valueOf(R.string.lbl_short_non_restorative);
                    break;
                case "NEGATIVE_LONG_BUT_NOT_ENOUGH_REM":
                    numValueOf = Integer.valueOf(R.string.lbl_not_enough_rem);
                    break;
                case "POSITIVE_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_restorative);
                    break;
                case "NEGATIVE_RESTLESS":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_restless);
                    break;
                case "POSITIVE_SHORT_BUT_CALM":
                    numValueOf = Integer.valueOf(R.string.lbl_short_calm);
                    break;
                case "POSITIVE_SHORT_BUT_DEEP":
                    numValueOf = Integer.valueOf(R.string.lbl_short_plenty_of_deep);
                    break;
                case "POSITIVE_LONG_AND_REFRESHING":
                    numValueOf = Integer.valueOf(R.string.lbl_plenty_of_rem);
                    break;
                case "NEGATIVE_DISCONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_interrupted);
                    break;
                case "NEGATIVE_NOT_RESTORATIVE":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_non_restorative);
                    break;
                case "POSITIVE_LONG_AND_CALM":
                    numValueOf = Integer.valueOf(R.string.lbl_calm);
                    break;
                case "POSITIVE_LONG_AND_DEEP":
                    numValueOf = Integer.valueOf(R.string.lbl_plenty_of_deep);
                    break;
                case "NEGATIVE_NOT_ENOUGH_REM":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_not_enough_rem);
                    break;
                case "NEGATIVE_LIGHT":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_not_enough_deep);
                    break;
                case "POSITIVE_LONG_AND_CONTINUOUS":
                    numValueOf = Integer.valueOf(R.string.lbl_continuous);
                    break;
                case "POSITIVE_CALM":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_calm);
                    break;
                case "POSITIVE_DEEP":
                    numValueOf = Integer.valueOf(R.string.lbl_shorter_than_ideal_plenty_of_deep);
                    break;
                case "NEGATIVE_LONG_BUT_NOT_RESTORATIVE":
                    numValueOf = Integer.valueOf(R.string.lbl_non_restorative);
                    break;
                case "POSITIVE_LONG_AND_RECOVERING":
                    numValueOf = Integer.valueOf(R.string.lbl_restorative);
                    break;
                case "POSITIVE_SHORT_BUT_REFRESHING":
                    numValueOf = Integer.valueOf(R.string.lbl_short_plenty_of_rem);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            if (numValueOf != null) {
                return this.f105620a.getString(numValueOf.intValue());
            }
        }
        return null;
    }
}
