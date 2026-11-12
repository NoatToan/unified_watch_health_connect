package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public class qqk {
    private static qqk e = new qqk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46669a;
    private int d;

    public static int a(int i, int i2, int i3) {
        return (i != -1 && (i3 == 0 ? i < i2 : !(i3 != 1 || i < i2))) ? i : i2;
    }

    public static long e(long j, long j2, int i) {
        if (j != 0) {
            if (j2 != 0) {
                if (i != 0) {
                }
            }
            return j;
        }
        if (j2 == 0) {
            return -1L;
        }
        return j2;
    }

    public static qqk c() {
        return e;
    }

    public void d(int i) {
        this.f46669a = i;
    }

    public int b() {
        return this.f46669a;
    }

    public int d() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public static int b(double d, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "+8:00";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((long) d);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        if (i2 < 20) {
            i2 += 24;
        }
        if (1 == i) {
            i2 -= 20;
        }
        return (i2 * 60) + i3;
    }

    public static int e(double d, long j) {
        int i = ((int) (((long) d) - j)) / 60000;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static long c(long j, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "+8:00";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        calendar.add(5, i);
        calendar.set(11, 20);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    public static long a(long j, String str) {
        long jM;
        if (TextUtils.isEmpty(str)) {
            str = "+8:00";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        if (calendar.get(11) >= 20) {
            calendar.add(5, 1);
            jM = ltb.m(calendar.getTime());
        } else {
            jM = ltb.m(calendar.getTime());
        }
        return jM * 1000;
    }

    public static String b(int i) {
        if (LanguageUtil.f(BaseApplication.getContext())) {
            return e(i);
        }
        return h(i);
    }

    private static String e(int i) {
        if (i < 10000) {
            return UnitUtil.e(i, 1, 0);
        }
        if (i < 100000000) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_music_unit_ten_thousand, i, UnitUtil.e(((double) i) / 10000.0d, 1, 1));
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_music_unit_one_hundred_million, i, UnitUtil.e(((double) i) / 1.0E8d, 1, 1));
    }

    private static String h(int i) {
        double d = i;
        if (d < 1000.0d) {
            return UnitUtil.e(d, 1, 0);
        }
        if (d < 1000000.0d) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_music_unit_ten_thousand, i, UnitUtil.e(d / 1000.0d, 1, 1));
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_music_unit_one_hundred_million, i, UnitUtil.e(d / 1000000.0d, 1, 1));
    }

    public static boolean a(int i) {
        return i == Integer.parseInt("00E", 16) || i == Integer.parseInt("011", 16);
    }

    public static int b(double d, long j, String str) {
        return Math.max(e(d, c(j, str, -1)), 0);
    }
}
