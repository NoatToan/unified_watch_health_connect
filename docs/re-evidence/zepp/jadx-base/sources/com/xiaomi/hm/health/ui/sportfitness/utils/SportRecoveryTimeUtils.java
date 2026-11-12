package com.xiaomi.hm.health.ui.sportfitness.utils;

import android.content.Context;
import com.huami.firstbeat.FbtTimeUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.FbtEteResult;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class SportRecoveryTimeUtils {
    public static final int MILLI_SECOND_AMOUNT_OF_SECOND = 1000;
    private static final int a = 60;
    private static final int b = 60;
    private static final String c = "yyyy-MM-dd HH:mm";
    private static final String d = "MM-dd HH:mm";
    private static final String e = "HH:mm";

    private static float a(float recoveryMin) {
        if (recoveryMin <= 0.0f) {
            return 0.0f;
        }
        return recoveryMin / 60.0f;
    }

    private static String b(Context context, long baseTime, long compareTime, boolean isThroughYear, boolean hasRecovery) {
        long j = 1000 * compareTime;
        float fDifferentDays = FbtTimeUtil.differentDays(baseTime * 1000, j);
        if (fDifferentDays < -2.0f) {
            String strC = c(compareTime, isThroughYear ? "yyyy-MM-dd HH:mm" : d);
            return hasRecovery ? context.getString(R.string.sport_recovery_time_reached_tips, strC) : strC;
        }
        if (fDifferentDays < -1.0f) {
            String string = context.getString(R.string.sport_recovery_time_slang_desc_the_day_before_yesterday, c(compareTime, "HH:mm"));
            return hasRecovery ? context.getString(R.string.sport_recovery_time_reached_tips, string) : string;
        }
        if (fDifferentDays < 0.0f) {
            String string2 = context.getString(R.string.sport_recovery_time_slang_desc_yesterday, c(compareTime, "HH:mm"));
            return hasRecovery ? context.getString(R.string.sport_recovery_time_reached_tips, string2) : string2;
        }
        if (fDifferentDays == 0.0f) {
            String string3 = context.getString(R.string.sport_recovery_time_slang_desc_today, c(compareTime, "HH:mm"));
            if (hasRecovery) {
                return baseTime - compareTime < 0 ? context.getString(R.string.sport_recovery_remain_time_tips, string3) : context.getString(R.string.sport_recovery_time_reached_tips, string3);
            }
            return string3;
        }
        if (fDifferentDays <= 1.0f) {
            String string4 = context.getString(R.string.sport_recovery_time_slang_desc_tomorrow, c(compareTime, "HH:mm"));
            return hasRecovery ? context.getString(R.string.sport_recovery_remain_time_tips, string4) : string4;
        }
        if (fDifferentDays <= 2.0f) {
            String string5 = context.getString(R.string.sport_recovery_time_slang_desc_the_day_after_tomorrow, c(compareTime, "HH:mm"));
            return hasRecovery ? context.getString(R.string.sport_recovery_remain_time_tips, string5) : string5;
        }
        String dateTime_y = isThroughYear ? TimeUtils.formatDateTime_y(context, j) : TimeUtils.formatDateTime_no_y(context, j, false);
        return hasRecovery ? context.getString(R.string.sport_recovery_remain_time_tips, dateTime_y) : dateTime_y;
    }

    private static String c(long timestamp, String pattern) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(new Date(timestamp * 1000));
    }

    public static float calculateCurrentRemainRecoveryTimeInHour(FbtEteResult fbtEteResult) {
        if (fbtEteResult == null) {
            return -1.0f;
        }
        return a(fbtEteResult.getRecoveryTime() - (((int) ((System.currentTimeMillis() / 1000) - fbtEteResult.getEndTime())) / 60));
    }

    public static int calculatePassTimeRelativeToCurrentTimeInMiN(FbtEteResult fbtEteResult) {
        if (fbtEteResult == null) {
            return -1;
        }
        return ((int) ((System.currentTimeMillis() / 1000) - fbtEteResult.getEndTime())) / 60;
    }

    public static int calculateRemianRecoveryTimeProgress(FbtEteResult fbtEteResult) {
        if (fbtEteResult == null) {
            return 0;
        }
        int recoveryTime = fbtEteResult.getRecoveryTime();
        int iCurrentTimeMillis = ((int) ((System.currentTimeMillis() / 1000) - fbtEteResult.getEndTime())) / 60;
        if (recoveryTime - iCurrentTimeMillis <= 0) {
            return 100;
        }
        float f = (iCurrentTimeMillis / recoveryTime) * 100.0f;
        if (f < 2.0f) {
            return 2;
        }
        return (int) f;
    }

    private static boolean d(long startTimestamp, long endTimestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(startTimestamp * 1000);
        int i = calendar.get(1);
        calendar.clear();
        calendar.setTimeInMillis(endTimestamp * 1000);
        return i == calendar.get(1);
    }

    public static String generateRemainTimeDescByRemainTimeInHour(Context context, FbtEteResult fbtEteResult) {
        long endTime = fbtEteResult.getEndTime();
        long recoveryTime = endTime + ((long) (fbtEteResult.getRecoveryTime() * 60));
        return b(context, System.currentTimeMillis() / 1000, recoveryTime, d(endTime, recoveryTime), true);
    }

    public static String[] generateRemainTimeProgressBarStartAndEndTimeDesc(Context context, FbtEteResult fbtEteResult) {
        long endTime = fbtEteResult.getEndTime();
        long recoveryTime = endTime + ((long) (fbtEteResult.getRecoveryTime() * 60));
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return new String[]{b(context, jCurrentTimeMillis, endTime, d(endTime, jCurrentTimeMillis), false), b(context, jCurrentTimeMillis, recoveryTime, d(jCurrentTimeMillis, recoveryTime), false)};
    }
}
