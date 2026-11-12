package defpackage;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4933b;
    public static final long c;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f4932a = timeUnit.toMillis(24L);
        f4933b = timeUnit.toSeconds(24L);
        c = timeUnit.toMinutes(24L);
    }

    public static int a(float f, long j, float f2) {
        return (int) (f + (j * f2) + (f2 * 0.5f));
    }

    public static float b(float f, long j, float f2) {
        return f + (j * f2) + (f2 * 0.5f);
    }

    public static int c(float f, long j) {
        float f2 = j;
        return (int) (((f - f2) + 1.0f) / f2);
    }

    public static float d(float f, long j) {
        return (f * 1.0f) / j;
    }

    public static void e(Calendar calendar) {
        TimeDateUtil.INSTANCE.zeroCalendar(calendar);
    }
}
