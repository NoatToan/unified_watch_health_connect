package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class phq {
    public static long c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return calendar.getTimeInMillis();
    }

    public static long e(String str) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (!TextUtils.isEmpty(str)) {
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException e) {
                LogUtil.e("DateUtil", "dateStringToLong ParseException :", e.getMessage());
            }
        }
        return date.getTime();
    }

    public static long a(String str) {
        Date date;
        LogUtil.a("DateUtil", "getTime:", str);
        Date date2 = new Date();
        if (!TextUtils.isEmpty(str)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd ");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                int length = str.split(":").length;
                if (length == 2) {
                    date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str + ":00");
                } else if (length == 1) {
                    if (str.endsWith(":")) {
                        date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str + "00:00");
                    } else {
                        date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str + ":00:00");
                    }
                } else {
                    date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str);
                }
                date2 = date;
            } catch (ParseException e) {
                LogUtil.e("DateUtil", "ParseException=", e.getMessage());
            }
        }
        return date2.getTime();
    }
}
