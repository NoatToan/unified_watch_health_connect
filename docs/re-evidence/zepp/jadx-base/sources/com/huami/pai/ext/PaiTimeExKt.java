package com.huami.pai.ext;

import android.content.Context;
import com.huami.pai.lib.R;
import com.huami.tools.analytics.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005\u001a\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005\u001a\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005\"\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "timeStart", "timeEnd", "", "differDays", "Ljava/util/Date;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "date", "", "formatTimeMD", "formatTimeYMD", "time", "Ljava/util/Locale;", "locale", "formatDate_no_y", "a", "Ljava/lang/String;", "TAG", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PaiTimeExKt {

    @NotNull
    private static final String a = "PaiTimeEx";

    public static final int differDays(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return differDays(time, calendar2.getTime());
    }

    public static /* synthetic */ int differDays$default(long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        return differDays(j, j2);
    }

    @NotNull
    public static final String formatDate_no_y(@NotNull Context context, @NotNull Date date) {
        return new SimpleDateFormat(context.getString(R.string.date_Md_unit_pattern), Locale.getDefault()).format(date);
    }

    @NotNull
    public static final String formatTimeMD(@NotNull Context context, @NotNull Date date) {
        return new SimpleDateFormat(context.getString(R.string.pai_pai_histroy_date_pattern), Locale.getDefault()).format(date);
    }

    @NotNull
    public static final String formatTimeYMD(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return formatTimeYMD$default(calendar.getTimeInMillis(), null, 2, null);
    }

    public static /* synthetic */ String formatTimeYMD$default(long j, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.ENGLISH;
        }
        return formatTimeYMD(j, locale);
    }

    @NotNull
    public static final String formatTimeYMD(long j, @NotNull Locale locale) {
        return new SimpleDateFormat("yyyy-MM-dd", locale).format(new Date(j));
    }

    public static final int differDays(@NotNull Date date, @NotNull Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        if (i3 == i4) {
            return i2 - i;
        }
        int i5 = 0;
        if (i3 < i4) {
            while (true) {
                int i6 = i3 + 1;
                i5 += ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? 365 : 366;
                if (i6 >= i4) {
                    break;
                }
                i3 = i6;
            }
        }
        return i5 + (i2 - i);
    }
}
