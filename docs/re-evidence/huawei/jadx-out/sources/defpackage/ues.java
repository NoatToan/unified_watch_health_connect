package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class ues {
    private final int d;
    private final int e;

    ues(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public static long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        if (i == 3) {
            return c(j);
        }
        if (i == 5) {
            return d(j);
        }
        if (i == 6) {
            return a(j);
        }
        LogUtil.j("QueryExtension", "correctTimeStamp not support uniteType:", Integer.valueOf(i));
        return -1L;
    }

    private static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(5, 1);
        calendar.set(2, 5);
        return calendar.getTimeInMillis();
    }

    private static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(5, 15);
        return calendar.getTimeInMillis();
    }

    private static long c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 12);
        return calendar.getTimeInMillis();
    }

    public int e() {
        return this.d;
    }

    public int c() {
        return this.e;
    }
}
