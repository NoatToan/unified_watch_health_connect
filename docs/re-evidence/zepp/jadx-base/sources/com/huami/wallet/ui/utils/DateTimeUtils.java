package com.huami.wallet.ui.utils;

import android.content.Context;
import android.text.format.DateUtils;
import com.huami.wallet.ui.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class DateTimeUtils {
    public static String formatDateTime(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 21);
    }

    public static String formatDateY(Context context, Date date) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTime(date);
        return new SimpleDateFormat(i - calendar.get(1) == 0 ? context.getString(R.string.wl_date_Md_unit_pattern) : context.getString(R.string.wl_date_yMd_unit_pattern), Locale.getDefault()).format(date);
    }

    public static String formatDateTime(Date date, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }
}
