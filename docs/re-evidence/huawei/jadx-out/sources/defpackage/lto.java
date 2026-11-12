package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lto {
    public static boolean e(long j, long j2) {
        if (j2 == -1 || j == -1) {
            LogUtil.d("Step_TimeUtil", "isSameDay return false");
            return false;
        }
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public static long c() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        calendar.set(11, 20);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 1000;
    }
}
