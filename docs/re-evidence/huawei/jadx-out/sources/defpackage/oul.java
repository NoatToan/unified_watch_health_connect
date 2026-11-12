package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LanguageUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class oul {
    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return calendar.getTimeInMillis();
    }

    public static long e(String str) {
        Date date;
        LogUtil.a("DateUtil", "getTime time=", str);
        Date date2 = new Date();
        if (str != null && !str.equals("")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd ", Locale.ENGLISH);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH);
            try {
                int length = str.split(":").length;
                if (length >= 3 || length <= 0) {
                    date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str);
                } else {
                    if (length == 2) {
                        date2 = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str + ":00");
                    }
                    if (length == 1) {
                        if (str.endsWith(":")) {
                            date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str + "00:00");
                        } else {
                            date = simpleDateFormat2.parse(simpleDateFormat.format(new Date()) + str + ":00:00");
                        }
                    }
                }
                date2 = date;
            } catch (ParseException e) {
                LogUtil.a("DateUtil", "getTime e=", e.getMessage());
            }
        }
        return date2.getTime();
    }

    public static String d(Context context, long j) {
        String str;
        String str2;
        String str3;
        if (!LanguageUtil.l(context)) {
            str = Constants.LINK;
            str2 = "";
            str3 = Constants.LINK;
        } else {
            str = "年";
            str3 = "月";
            str2 = "日";
        }
        return new SimpleDateFormat("yyyy" + str + "MM" + str3 + "dd" + str2, Locale.getDefault()).format(new Date(j));
    }

    public static long e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(1, 1);
        return calendar.getTime().getTime();
    }
}
