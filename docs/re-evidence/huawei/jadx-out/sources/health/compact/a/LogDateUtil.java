package health.compact.a;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class LogDateUtil {
    private LogDateUtil() {
    }

    public static long c(String str, String str2) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.ENGLISH);
        if (!TextUtils.isEmpty(str)) {
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException e) {
                com.huawei.hwlogsmodel.LogUtil.e("LogDateUtil", "dateStringToLong ParseException :", e.getMessage());
            }
        }
        return date.getTime();
    }

    public static String b(long j, String str) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(j));
    }
}
