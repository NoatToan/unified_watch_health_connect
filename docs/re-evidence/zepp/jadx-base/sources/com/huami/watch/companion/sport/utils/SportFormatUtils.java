package com.huami.watch.companion.sport.utils;

import android.content.Context;
import android.text.format.DateFormat;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.util.ChartTimeUtil;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.TimeUtil;
import com.huami.watch.util.UnitUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes16.dex */
public class SportFormatUtils {
    public static final int MAX_HR_VALUE = 221;
    public static final float MAX_STRIDE_SCALE = 1.0f;
    public static final int MIN_HR_VALUE = 39;
    public static final float MIN_STRIDE_SCALE = 0.25f;

    public static float convertSecondValue(float f) {
        int i = (int) (f / 3600.0f);
        int i2 = (int) ((f - ((i * 60) * 60)) / 60.0f);
        int i3 = i * 3600;
        int i4 = i2 * 60;
        return ((int) ((f - ((float) i3)) - ((float) i4))) < 30 ? i3 + i4 : i3 + i4 + 60;
    }

    public static float convertSpeed(float f) {
        float f2 = f * 1000.0f;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return NumberFormatter.format(3600.0f / f2, 2, 4);
    }

    public static String format(int i) {
        return i <= 0 ? "--" : String.valueOf(i);
    }

    public static String formatDate(Context context, long j) {
        if (DateFormat.is24HourFormat(context)) {
            return I18nUtil.isSupportDDMM(context) ? TimeUtil.formatDateTime(j, "dd/MM HH:mm") : TimeUtil.formatDateTime(j, "MM/dd HH:mm");
        }
        if (!I18nUtil.isZh(context)) {
            return I18nUtil.isSupportDDMM(context) ? TimeUtil.formatDateTime(j, "dd/MM hh:mm a") : TimeUtil.formatDateTime(j, "MM/dd hh:mm a");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return TimeUtil.formatDateTime(j, "MM/dd ") + ChartTimeUtil.getTimeUnit(context, calendar.get(11)) + TimeUtil.formatDateTime(j, " hh:mm");
    }

    public static String formatDistance(double d, int... iArr) {
        int i;
        if (d <= 0.0d) {
            return "--";
        }
        double d2 = d / 1000.0d;
        if (d2 < 100.0d) {
            i = 2;
        } else {
            i = d2 < 1000.0d ? 1 : 0;
        }
        return NumberFormatter.formatDouble2String(d2, i, iArr);
    }

    public static String formatDistanceWithYard(int i) {
        return i <= 0 ? "--" : String.valueOf((int) (((double) i) / 0.9144d));
    }

    public static String formatHR(int i) {
        return (i <= 39 || i >= 221) ? "--" : String.valueOf(i);
    }

    public static String formatPace(float f) {
        return formatTimeInSportForm((long) (f * 1000.0f));
    }

    public static String formatSpeed(float f) {
        double d = ((double) f) * 1000.0d;
        return d <= 0.0d ? "--" : NumberFormatter.formatDouble2String(3600.0d / d, 2, 4);
    }

    public static String formatStride(int i) {
        if (i <= 0) {
            return "--";
        }
        int height = UserInfoManager.get().getHeight();
        if (height > 0) {
            float f = height;
            float f2 = 1.0f * f;
            float f3 = f * 0.25f;
            float f4 = i;
            if (f4 >= f2 || f4 <= f3) {
                return "--";
            }
        }
        return String.valueOf(i);
    }

    public static String formatTimeInSportForm(long j) {
        if (j <= 0) {
            return "00\u202a'00\"";
        }
        long j2 = ((j % TimeUtils.TIME_1_HOURS) / 60) + ((j / TimeUtils.TIME_1_HOURS) * 60);
        long j3 = j % 60;
        StringBuilder sb = new StringBuilder();
        if (j2 <= 0) {
            sb.append("00\u202a'");
        } else if (j2 < 10) {
            sb.append('0');
            sb.append(j2);
            sb.append((char) 8234);
            sb.append('\'');
        } else {
            sb.append(j2);
            sb.append((char) 8234);
            sb.append('\'');
        }
        if (j3 <= 0) {
            sb.append("00\"");
        } else if (j3 < 10) {
            sb.append('0');
            sb.append(j3);
            sb.append('\"');
        } else {
            sb.append(j3);
            sb.append('\"');
        }
        return sb.toString();
    }

    public static int parsePaceStr(String str) {
        int length = str.length();
        return (Integer.parseInt(str.substring(0, length - 4)) * 60) + Integer.parseInt(str.substring(length - 3, length - 1));
    }

    public static String format(int i, String str) {
        if (i <= 0) {
            return "--";
        }
        return String.valueOf(i) + str;
    }

    public static String formatDistance(double d, boolean z, int... iArr) {
        int i;
        if (d <= 0.0d) {
            return "--";
        }
        double dKmToMi = d / 1000.0d;
        if (z) {
            dKmToMi = UnitUtil.kmToMi(dKmToMi);
        }
        if (dKmToMi < 100.0d) {
            i = 2;
        } else {
            i = dKmToMi < 1000.0d ? 1 : 0;
        }
        return NumberFormatter.formatDouble2String(dKmToMi, i, iArr);
    }

    public static String formatPace(float f, boolean z) {
        float f2 = f * 1000.0f;
        if (z) {
            f2 /= 0.6213712f;
        }
        return formatTimeInSportForm((long) f2);
    }

    public static String formatSpeed(float f, boolean z) {
        double d = ((double) f) * 1000.0d;
        if (d <= 0.0d) {
            return "--";
        }
        double dKmToMi = 3600.0d / d;
        if (z) {
            dKmToMi = UnitUtil.kmToMi(dKmToMi);
        }
        return NumberFormatter.formatDouble2String(dKmToMi, 2, 4);
    }

    public static String format(double d) {
        return d <= 0.0d ? "--" : String.valueOf(d);
    }

    public static String format(float f) {
        return f <= 0.0f ? "--" : String.valueOf(f);
    }

    public static String formatSpeed(double d, boolean z) {
        double d2 = d * 1000.0d;
        if (d2 <= 0.0d) {
            return "--";
        }
        double dKmToMi = 3600.0d / d2;
        if (z) {
            dKmToMi = UnitUtil.kmToMi(dKmToMi);
        }
        return NumberFormatter.formatDouble2String(dKmToMi, 2, 4);
    }

    public static String formatSpeed(double d) {
        return d <= 0.0d ? "--" : NumberFormatter.formatDouble2String(3600.0d / d, 2, 4);
    }
}
