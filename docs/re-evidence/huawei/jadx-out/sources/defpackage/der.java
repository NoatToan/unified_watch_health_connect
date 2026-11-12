package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class der {
    public static boolean e(double d) {
        return d > -1.0E-4d && d < 1.0E-4d;
    }

    public static Drawable b(Context context, Drawable drawable, int i) {
        if (context == null) {
            LogUtil.j("Track_SportHistoryUtils", "getMirrorSportIcon context is null");
            return null;
        }
        if (!LanguageUtil.ba(context)) {
            return null;
        }
        BitmapDrawable bitmapDrawableE = qqz.e(context, drawable);
        LogUtil.a("Track_SportHistoryUtils", "decode  ", bitmapDrawableE);
        return (bitmapDrawableE == null || i == 512) ? bitmapDrawableE : qqf.c(bitmapDrawableE, context.getColor(R.color.common_color_white));
    }

    public static void c(ImageView imageView, Drawable drawable, Drawable drawable2) {
        if (drawable != null) {
            imageView.setBackground(drawable);
        } else {
            imageView.setBackground(drawable2);
        }
    }

    public static String e(Context context) {
        if (context == null) {
            LogUtil.j("Track_SportHistoryUtils", "aquire Run Unit and context is null");
            return "";
        }
        if (UnitUtil.f()) {
            return "/" + context.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return "/" + context.getResources().getString(R.string.IDS_band_data_sport_distance_unit);
    }

    public static String d(Context context, float f) {
        if (context != null) {
            return UnitUtil.f() ? qre.e(R.plurals.IDS_indoor_run_mi, (int) f, "") : qre.e(R.plurals.IDS_indoor_run_km, (int) f, "");
        }
        LogUtil.j("Track_SportHistoryUtils", "getDistanceUnit context is null");
        return "";
    }

    public static String b(double d) {
        return d((d / 1000.0d) / 60.0d, 2);
    }

    public static String d(double d, int i) {
        return UnitUtil.e(d, 1, i);
    }

    public static long e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20002), "in_sport_history_activity_time");
        if (!StringUtils.j(strE) || !strE.contains("##")) {
            return 0L;
        }
        String str = strE.split("##")[0];
        if (StringUtils.j(str) && e(str)) {
            return CommonUtil.i(str);
        }
        return 0L;
    }

    public static boolean e(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException unused) {
            LogUtil.e("Track_SportHistoryUtils", "isLong NumberFormatException");
            return false;
        }
    }

    public static String e(int i, Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        if (i == 1) {
            return context.getString(R.string.IDS_recreational_scuba_diving);
        }
        if (i == 2) {
            return context.getString(R.string.IDS_technical_scuba_diving);
        }
        if (i == 3) {
            return context.getString(R.string.IDS_instrument_scuba_diving);
        }
        return context.getString(R.string.IDS_recreational_scuba_diving);
    }

    public static String a(double d) {
        if (d < 60.0d) {
            return UnitUtil.e(d, 1, 0);
        }
        if (d < 3600.0d) {
            int i = (int) d;
            int i2 = i % 60;
            int i3 = i / 60;
            Resources resources = com.huawei.haf.application.BaseApplication.b().getResources();
            return resources.getString(R.string.IDS_indoor_skipper_minute_and_second, resources.getQuantityString(R.plurals.IDS_min_single_unit, i3, UnitUtil.e(i3, 1, 0)), resources.getQuantityString(R.plurals.IDS_second_single_unit, i2, UnitUtil.e(i2, 1, 0)));
        }
        return UnitUtil.e(d / 3600.0d, 1, 1);
    }

    public static String d(double d) {
        if (d < 60.0d) {
            return qre.e(R.plurals.IDS_second_single_unit, (int) d, UnitUtil.e(d, 1, 0));
        }
        if (d < 3600.0d) {
            int i = (int) d;
            int i2 = i % 60;
            int i3 = i / 60;
            return qre.a(R.string.IDS_indoor_skipper_minute_and_second, qre.e(R.plurals.IDS_min_single_unit, i3, UnitUtil.e(i3, 1, 0)), qre.e(R.plurals.IDS_second_single_unit, i2, UnitUtil.e(i2, 1, 0)));
        }
        return qre.e(R.plurals.IDS_hour_unit, (int) d, UnitUtil.e(d / 3600.0d, 1, 1));
    }

    public static String c(double d) {
        if (d < 60000.0d) {
            return com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_second);
        }
        if (d < 3600000.0d) {
            return "";
        }
        return com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_messagecenter_time_hour_value);
    }
}
