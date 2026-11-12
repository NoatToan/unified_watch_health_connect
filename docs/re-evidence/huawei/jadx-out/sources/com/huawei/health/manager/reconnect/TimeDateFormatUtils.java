package com.huawei.health.manager.reconnect;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class TimeDateFormatUtils {
    private TimeDateFormatUtils() {
    }

    public static boolean e(String str, String str2) throws ParseException {
        String str3 = new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS).format(new Date(System.currentTimeMillis()));
        LogUtil.a("TimeDateFormatUtils", "nowTimeStr: ", str3);
        boolean zB = b(new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS).parse(str3), new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS).parse(str), new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS).parse(str2));
        LogUtil.a("TimeDateFormatUtils", "isEffectiveDate: ", Boolean.valueOf(zB));
        return zB;
    }

    private static boolean b(Date date, Date date2, Date date3) {
        if (date.getTime() == date2.getTime() || date.getTime() == date3.getTime()) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date3);
        return calendar.after(calendar2) && calendar.before(calendar3);
    }
}
