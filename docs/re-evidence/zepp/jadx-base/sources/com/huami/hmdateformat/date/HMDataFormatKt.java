package com.huami.hmdateformat.date;

import android.icu.text.DateFormat;
import android.os.Build;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a \u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Ljava/util/Calendar;", "Lcom/huami/hmdateformat/date/HMPattern;", "skeleton", "Ljava/util/Locale;", "locale", "", "getFormatTime", "", "Ljava/util/Date;", "pattern", "date", "a", "time", "", "b", "adaptHMPattern", "library_release"}, k = 2, mv = {1, 5, 1})
public final class HMDataFormatKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMPattern.values().length];
            iArr[HMPattern.YEAR_MONTH_DAY.ordinal()] = 1;
            iArr[HMPattern.YEAR_ABBR_MONTH_DAY.ordinal()] = 2;
            iArr[HMPattern.YEAR_ABBR_MONTH_DAY_HOUR24_MINUTE.ordinal()] = 3;
            iArr[HMPattern.MONTH_DAY.ordinal()] = 4;
            iArr[HMPattern.ABBR_MONTH_DAY.ordinal()] = 5;
            iArr[HMPattern.ABBR_MONTH_DAY_HOUR24_MINUTE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String a(String str, Date date, Locale locale) {
        try {
            return new SimpleDateFormat(str, locale).format(date);
        } catch (Exception e) {
            Log.w("HMDataFormat", ((Object) e.getMessage()) + "\nlocale:" + Locale.getDefault() + "\npattern:" + str);
            return "";
        }
    }

    @NotNull
    public static final HMPattern adaptHMPattern(@NotNull HMPattern hMPattern, long j) {
        if (b(j)) {
            int i = WhenMappings.$EnumSwitchMapping$0[hMPattern.ordinal()];
            if (i == 1) {
                return HMPattern.MONTH_DAY;
            }
            if (i != 2) {
                return i != 3 ? hMPattern : HMPattern.ABBR_MONTH_DAY_HOUR24_MINUTE;
            }
            return HMPattern.ABBR_MONTH_DAY;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[hMPattern.ordinal()];
        if (i2 == 4) {
            return HMPattern.YEAR_MONTH_DAY;
        }
        if (i2 != 5) {
            return i2 != 6 ? hMPattern : HMPattern.YEAR_ABBR_MONTH_DAY_HOUR24_MINUTE;
        }
        return HMPattern.YEAR_ABBR_MONTH_DAY;
    }

    private static final boolean b(long j) {
        int i = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return i == calendar.get(1);
    }

    @NotNull
    public static final String getFormatTime(@NotNull Calendar calendar, @NotNull HMPattern hMPattern, @NotNull Locale locale) {
        return getFormatTime(calendar.getTime(), hMPattern, locale);
    }

    public static /* synthetic */ String getFormatTime$default(Calendar calendar, HMPattern hMPattern, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return getFormatTime(calendar, hMPattern, locale);
    }

    @NotNull
    public static final String getFormatTime(long j, @NotNull HMPattern hMPattern, @NotNull Locale locale) {
        return getFormatTime(new Date(j), hMPattern, locale);
    }

    public static /* synthetic */ String getFormatTime$default(long j, HMPattern hMPattern, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return getFormatTime(j, hMPattern, locale);
    }

    @NotNull
    public static final String getFormatTime(@NotNull Date date, @NotNull HMPattern hMPattern, @NotNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return DateFormat.getPatternInstance(hMPattern.getValue(), locale).format(date);
        }
        return a(android.text.format.DateFormat.getBestDateTimePattern(locale, hMPattern.getValue()), date, locale);
    }

    public static /* synthetic */ String getFormatTime$default(Date date, HMPattern hMPattern, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        return getFormatTime(date, hMPattern, locale);
    }
}
