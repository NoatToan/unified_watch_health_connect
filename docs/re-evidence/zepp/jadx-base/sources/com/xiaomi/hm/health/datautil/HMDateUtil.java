package com.xiaomi.hm.health.datautil;

import com.huami.account.service.AccountService;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HMDateUtil {
    public static String formatDateSimple(long time) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(time));
    }

    public static Long getCreateTime() {
        AccountService accountService = AccountModuleKt.getAccountService();
        long registerDate = accountService != null ? accountService.getRegisterDate() / 1000 : 0L;
        if (registerDate <= 0) {
            registerDate = 1451577600;
        }
        return Long.valueOf(registerDate * 1000);
    }

    public static String getHoursOnly(long time) {
        return new SimpleDateFormat("HH", Locale.getDefault()).format(Long.valueOf(time));
    }

    public static String getMinutesOnly(long time) {
        return new SimpleDateFormat(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, Locale.getDefault()).format(Long.valueOf(time));
    }

    public static String getMonthEnd(int which) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, 1);
        if (which != 0) {
            calendar.add(2, which);
        }
        calendar.add(5, -calendar.get(5));
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
    }

    public static String getMonthStart(int which) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (which != 0) {
            calendar.add(2, which);
        }
        calendar.add(5, 1 - calendar.get(5));
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
    }

    public static String getSpecifyDay(String dateS, int witch) {
        Calendar calenday = toCalenday(dateS);
        calenday.add(6, witch);
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calenday.getTime());
    }

    public static String getWeekEndDate(int which) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, 1);
        calendar.add(3, which + 1);
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
    }

    public static String getWeekStartDate(int which) {
        Calendar calendar = Calendar.getInstance();
        if (which != 0) {
            calendar.add(3, which);
        }
        calendar.set(7, 2);
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
    }

    private static Calendar toCalenday(String date) {
        Calendar calendar = Calendar.getInstance();
        try {
            String[] strArrSplit = date.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]) - 1;
            int i3 = Integer.parseInt(strArrSplit[2]);
            calendar.clear();
            calendar.set(i, i2, i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return calendar;
    }
}
