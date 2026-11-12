package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes13.dex */
public class pat {
    public static String d(Context context, int i) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getMonthDescByTimestamp: context is null");
            return "";
        }
        switch (i) {
            case 1:
                return context.getResources().getString(R.string.IDS_report_january_title);
            case 2:
                return context.getResources().getString(R.string.IDS_report_february_title);
            case 3:
                return context.getResources().getString(R.string.IDS_report_march_title);
            case 4:
                return context.getResources().getString(R.string.IDS_report_april_title);
            case 5:
                return context.getResources().getString(R.string.IDS_report_may_title);
            case 6:
                return context.getResources().getString(R.string.IDS_report_june_title);
            case 7:
                return context.getResources().getString(R.string.IDS_report_july_title);
            case 8:
                return context.getResources().getString(R.string.IDS_report_august_title);
            case 9:
                return context.getResources().getString(R.string.IDS_report_september_title);
            case 10:
                return context.getResources().getString(R.string.IDS_report_october_title);
            case 11:
                return context.getResources().getString(R.string.IDS_report_november_title);
            case 12:
                return context.getResources().getString(R.string.IDS_report_december_title);
            default:
                return "";
        }
    }

    public static CharSequence e(Context context, int i) {
        if (context == null || i < 0) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getAvgDailyStepsDesc: context is null");
            return "";
        }
        if (i <= 3000) {
            String string = context.getResources().getString(R.string.IDS_report_avg_steps_desc1);
            return LanguageUtil.l(context) ? c(string, "多走走") : string;
        }
        if (i <= 6000) {
            String string2 = context.getResources().getString(R.string.IDS_report_avg_steps_desc2);
            return LanguageUtil.l(context) ? c(string2, "脚下的每一步") : string2;
        }
        String string3 = context.getResources().getString(R.string.IDS_report_avg_steps_desc3);
        return LanguageUtil.l(context) ? c(string3, "生活的乐趣") : string3;
    }

    public static CharSequence c(String str, String str2) {
        return e(str, str2, BaseApplication.getContext().getResources().getColor(R.color.report_text_highlight_color));
    }

    public static CharSequence e(String str, String str2, int i) {
        return e(str, str2, i, 0, "");
    }

    public static CharSequence e(String str, String str2, int i, int i2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("PLGACHIEVE_ReportDescUtil", "getHighlightCharSequence() content or highlightText is empty.");
            return str;
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            LogUtil.a("PLGACHIEVE_ReportDescUtil", "getHighlightCharSequence() content not contains highlightText.");
            return str;
        }
        int length = str2.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iIndexOf, length, 34);
        if (i2 > 0) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i2), iIndexOf, length, 34);
        }
        if (!TextUtils.isEmpty(str3)) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str3), iIndexOf, length, 34);
        }
        return spannableStringBuilder;
    }

    public static CharSequence c(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("PLGACHIEVE_ReportDescUtil", "getTextSizeSpanString() content or highlightText is empty.");
            return str;
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            LogUtil.a("PLGACHIEVE_ReportDescUtil", "getTextSizeSpanString() content not contains scaleText.");
            return str;
        }
        int length = str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i), iIndexOf, length + iIndexOf, 34);
        return spannableStringBuilder;
    }

    public static String a(Context context, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (context == null) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getComplianceDaysDesc: context is null");
            return "";
        }
        int i7 = i2 - i3;
        String quantityString = context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_days, i2, UnitUtil.e(i2, 1, 0));
        String quantityString2 = context.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_days, Math.abs(i7), UnitUtil.e(Math.abs(i7), 1, 0));
        if (i7 > 0) {
            Resources resources = context.getResources();
            if (i == 0) {
                i6 = R.string.IDS_report_month_steps_desc2;
            } else {
                i6 = R.string.IDS_report_week_steps_desc2;
            }
            return resources.getString(i6, quantityString, quantityString2);
        }
        if (i7 < 0) {
            Resources resources2 = context.getResources();
            if (i == 0) {
                i5 = R.string.IDS_report_month_steps_desc1;
            } else {
                i5 = R.string.IDS_report_week_steps_desc1;
            }
            return resources2.getString(i5, quantityString, quantityString2);
        }
        Resources resources3 = context.getResources();
        if (i == 0) {
            i4 = R.plurals.IDS_report_month_steps_new;
        } else {
            i4 = R.plurals.IDS_report_week_steps_new;
        }
        return resources3.getQuantityString(i4, i2, Integer.valueOf(i2));
    }

    public static CharSequence e(Context context, int i, int i2) {
        String string;
        if (context == null || i2 <= 0) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getMedalTitleDesc: context is null or medalNumbers is ", Integer.valueOf(i2));
            return "";
        }
        if (i2 == 1) {
            String string2 = context.getResources().getString(R.string.IDS_report_medal_desc_by_one);
            return LanguageUtil.l(context) ? c(string2, "努力") : string2;
        }
        if (i2 == 2) {
            String string3 = context.getResources().getString(R.string.IDS_report_medal_desc_by_two);
            return LanguageUtil.l(context) ? c(string3, "突破") : string3;
        }
        if (i == 0) {
            string = context.getResources().getString(R.string.IDS_report_month_medal_desc3);
        } else {
            string = context.getResources().getString(R.string.IDS_report_week_medal_desc3);
        }
        return LanguageUtil.l(context) ? c(string, "荣誉满满") : string;
    }

    public static CharSequence b(Context context, int i, int i2) {
        if (context == null || i2 < 0) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getExerciseDescByDays: context is null or exerciseCount is ", Integer.valueOf(i2));
            return "";
        }
        int i3 = i == 0 ? 4 : 1;
        int i4 = i == 0 ? 16 : 4;
        if (i2 <= i3) {
            String string = context.getResources().getString(R.string.IDS_report_exercise_desc1);
            return LanguageUtil.l(context) ? c(string, "开始新的挑战") : string;
        }
        if (i2 <= i4) {
            String string2 = context.getResources().getString(R.string.IDS_report_exercise_desc2);
            return LanguageUtil.l(context) ? c(string2, "成就更好的自己") : string2;
        }
        String string3 = context.getResources().getString(R.string.IDS_report_exercise_desc3);
        return LanguageUtil.l(context) ? c(string3, "变成习惯") : string3;
    }

    public static Drawable e(Context context, int i, float f) {
        if (context == null || f < 0.0f) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getDrawableByExerciseTime: context is null or exerciseDays is ", Float.valueOf(f));
            return null;
        }
        int i2 = i == 0 ? 120 : 30;
        int i3 = i == 0 ? 600 : 150;
        if (f - i2 <= 1.0E-6d) {
            return c(ContextCompat.getDrawable(context, R.drawable.img_report_less_exercise_time));
        }
        if (f - i3 <= 1.0E-6d) {
            return c(ContextCompat.getDrawable(context, R.drawable.img_report_moderate_exercise_time));
        }
        return c(ContextCompat.getDrawable(context, R.drawable.img_report_more_exercise_time));
    }

    public static Drawable a(Context context, int i, int i2) {
        if (context == null || i2 < 0) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getDrawableByCalories: context is null or exerciseDays is ", Integer.valueOf(i2));
            return null;
        }
        int i3 = i == 0 ? 5600 : KakaConstants.TASK_RUN_BEHAVIOR;
        int i4 = i == 0 ? 8400 : 2100;
        if (i2 <= i3) {
            return c(ContextCompat.getDrawable(context, R.drawable.img_report_less_heat));
        }
        if (i2 <= i4) {
            return c(ContextCompat.getDrawable(context, R.drawable.img_report_medium_heat));
        }
        return c(ContextCompat.getDrawable(context, R.drawable.img_report_higher_heat));
    }

    private static Drawable c(Drawable drawable) {
        return LanguageUtil.ba(BaseApplication.getContext()) ? qqz.e(BaseApplication.getContext(), drawable) : drawable;
    }

    public static CharSequence c(Context context, int i) {
        if (context == null || i < 0) {
            LogUtil.j("PLGACHIEVE_ReportDescUtil", "getBreakInfoDesc: context is null or breakInfoSize is ", Integer.valueOf(i));
            return "";
        }
        if (i <= 1) {
            String string = context.getResources().getString(R.string.IDS_report_break_info_desc1);
            return LanguageUtil.l(context) ? c(string, "潜力无限") : string;
        }
        if (i == 2 || i == 3) {
            String string2 = context.getResources().getString(R.string.IDS_report_break_info_desc2, String.valueOf(i));
            return LanguageUtil.l(context) ? c(string2, String.valueOf(i)) : string2;
        }
        String string3 = context.getResources().getString(R.string.IDS_report_break_info_desc3);
        return LanguageUtil.l(context) ? c(string3, "更好的自己") : string3;
    }
}
