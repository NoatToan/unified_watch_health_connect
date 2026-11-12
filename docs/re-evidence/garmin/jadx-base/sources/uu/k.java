package uu;

import android.content.Context;
import android.text.TextUtils;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.flexbox.FlexItem;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public class k {
    public static String a(Context context, String str) {
        StringBuilder sbI = sn.a.i(str, "<br\\><br\\>");
        sbI.append(d(context, context.getString(R.string.lbl_challenge_details)));
        return sbI.toString();
    }

    public static String b(Context context, DateTime dateTime, DateTime dateTime2) {
        if (dateTime != null) {
            return (dateTime2 == null || !DateTime.now().isAfter(dateTime2)) ? context.getString(R.string.social_badge_available_since, j0.o(dateTime, 'M')) : context.getString(R.string.social_badge_available_from, new pi0.e(context).l(dateTime, dateTime2, pi0.f.SHORT_MONTH_NO_WEEKDAY));
        }
        return "";
    }

    public static String c(Context context, int i14, String str, String str2, String str3, int i15, int i16, String str4) {
        String strN = j0.n(j0.N(str3, true), 'L');
        com.garmin.android.apps.connectmobile.badges.service.model.a aVarA = com.garmin.android.apps.connectmobile.badges.service.model.a.a(i14);
        if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.NO_LINK) {
            if (i15 > 1) {
                return TextUtils.isEmpty(str4) ? context.getString(R.string.badges_lbl_badge_earned_description_with_times_limit, null, String.valueOf(i15), String.valueOf(i16)) : context.getString(R.string.badges_msg_badge_earned_by_connection_description_with_times_limit, str4, null, String.valueOf(i15), String.valueOf(i16));
            }
            return TextUtils.isEmpty(str4) ? context.getString(R.string.badges_lbl_badge_earned_with_date, strN) : context.getString(R.string.badges_msg_badge_earned_by_connection_with_date, str4, strN);
        }
        if (i15 > 1) {
            String str5 = "#" + Integer.toHexString(a7.b.getColor(context, R.color.gcm_text_primary_action) & FlexItem.MAX_SIZE);
            if (TextUtils.isEmpty(str4)) {
                String strReplaceAll = i16 > 0 ? context.getString(R.string.badges_lbl_badge_earned_description_with_times_limit, str5, String.valueOf(i15), String.valueOf(i16)).replaceAll("“", "\"").replaceAll("”", "\"") : context.getString(R.string.badges_lbl_badge_earned_description_with_times, str5, Integer.valueOf(i15));
                return aVarA != com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE ? strReplaceAll : a(context, strReplaceAll);
            }
            String str6 = aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY ? str5 : null;
            return i16 > 0 ? context.getString(R.string.badges_msg_badge_earned_by_connection_description_with_times_limit, str4, str6, String.valueOf(i15), String.valueOf(i16)).replaceAll("“", "\"").replaceAll("”", "\"") : context.getString(R.string.badges_msg_badge_earned_by_connection_description_with_times, str4, str6, String.valueOf(i15));
        }
        if (TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str4)) {
                return (TextUtils.isEmpty(str) || aVarA != com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) ? context.getString(R.string.badges_msg_badge_earned_by_connection_with_date, str4, strN) : context.getString(R.string.badges_msg_badge_earned_by_connection_with_date, str4, d(context, strN));
            }
            if (TextUtils.isEmpty(str) || aVarA != com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) {
                return aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE ? a(context, context.getString(R.string.badges_lbl_badge_earned_with_date, strN)) : context.getString(R.string.badges_lbl_badge_earned_with_date, strN);
            }
            return context.getString(R.string.badges_lbl_badge_earned_with_date, d(context, strN));
        }
        if (!TextUtils.isEmpty(str4)) {
            return context.getString(R.string.badges_msg_badge_earned_by_connection_with_date_and_activity, str4, strN, d(context, str2));
        }
        String strD = d(context, str2);
        if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.SCORECARD) {
            return context.getString(R.string.lbl_badge_earned_with_date_and_course, strN, strD);
        }
        String string = context.getString(R.string.badges_lbl_badge_earned_with_date_and_activity, strN, strD);
        return aVarA != com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE ? string : a(context, string);
    }

    public static String d(Context context, String str) {
        StringBuilder sb3 = new StringBuilder("<font color= \"");
        sb3.append("#" + Integer.toHexString(a7.b.getColor(context, R.color.gcm_text_primary_action) & FlexItem.MAX_SIZE));
        sb3.append("\" >");
        sb3.append(str);
        sb3.append("</font>");
        return sb3.toString();
    }
}
