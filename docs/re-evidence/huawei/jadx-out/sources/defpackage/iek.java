package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.huawei.health.basefitnessadvice.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class iek {
    public static SpannableString c(Context context, double d) {
        double d2 = d / 1000.0d;
        return gzx.c(context, "\\d|[/]", gzx.d(R.plurals.sug_km, (int) d2, UnitUtil.e(d2, 1, 0)), com.huawei.health.suggestion.R.style.sug_detail_bigsize, com.huawei.health.suggestion.R.style.sug_detail_smasize);
    }

    public static SpannableString a(Context context, double d) {
        double d2 = d / 60.0d;
        return gzx.c(context, "\\d|[/]", gzx.d(com.huawei.health.suggestion.R.plurals.IDS_plugin_fitnessadvice_min, (int) d2, UnitUtil.e(d2, 1, 0)), com.huawei.health.suggestion.R.style.sug_detail_bigsize, com.huawei.health.suggestion.R.style.sug_detail_smasize);
    }

    public static SpannableString b(Context context, double d) {
        double d2 = d / 60.0d;
        return gzx.c(context, "\\d|[/]", gzx.d(com.huawei.health.suggestion.R.plurals.IDS_plugin_fitnessadvice_min, (int) d2, UnitUtil.e(d2, 1, 0)), com.huawei.health.suggestion.R.style.sug_detail_bigsize_no_finished_course, com.huawei.health.suggestion.R.style.sug_detail_smasize_no_finished_course);
    }

    public static String a(Context context, int i, int i2, int i3) {
        if (LanguageUtil.ba(context)) {
            return gzx.c(context, com.huawei.health.suggestion.R.string.sug_fitness_grop_sec_rtl, UnitUtil.e(Math.round((i2 * 1.0f) / 1000.0f), 1, 0), UnitUtil.e(i, 1, 0));
        }
        if (i3 == 0) {
            if (i2 < 1000) {
                return gzx.c(context, com.huawei.health.suggestion.R.string.sug_fitness_grop_sec_more_distance_m, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
            }
            return gzx.c(context, com.huawei.health.suggestion.R.string.sug_fitness_grop_sec_more_distance_km, UnitUtil.e(i, 1, 0), UnitUtil.e((i2 * 1.0f) / 1000.0f, 1, 1));
        }
        if (i3 == 1) {
            int iRound = Math.round((i2 * 1.0f) / 1000.0f);
            int i4 = iRound / 60;
            if (i4 >= 1) {
                return gzx.c(context, com.huawei.health.suggestion.R.string.sug_fitness_grop_sec_more, UnitUtil.e(i, 1, 0), UnitUtil.e(i4, 1, 0), UnitUtil.e(iRound % 60, 1, 0));
            }
            return gzx.c(context, com.huawei.health.suggestion.R.string.sug_fitness_grop_sec, UnitUtil.e(i, 1, 0), UnitUtil.e(iRound, 1, 0));
        }
        return gzx.c(context, com.huawei.health.suggestion.R.string.sug_fitness_grop_sec, UnitUtil.e(i, 1, 0), UnitUtil.e(Math.round((i2 * 1.0f) / 1000.0f), 1, 0));
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = Pattern.compile("\\d").matcher(str);
        if (matcher.find()) {
            return matcher.start();
        }
        return -1;
    }
}
