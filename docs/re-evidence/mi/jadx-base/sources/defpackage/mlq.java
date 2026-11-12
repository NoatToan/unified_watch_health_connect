package defpackage;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class mlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<vep> f26988a = new AtomicReference<>();

    public static long a(long j) {
        Calendar calendarL = l();
        calendarL.setTimeInMillis(j);
        return e(calendarL).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return d("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return d("MMMEd", locale);
    }

    @TargetApi(24)
    public static DateFormat d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(k());
        return instanceForSkeleton;
    }

    public static Calendar e(Calendar calendar) {
        Calendar calendarM = m(calendar);
        Calendar calendarL = l();
        calendarL.set(calendarM.get(1), calendarM.get(2), calendarM.get(5));
        return calendarL;
    }

    public static SimpleDateFormat f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(i());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(h2j.M);
        String string2 = resources.getString(h2j.L);
        String string3 = resources.getString(h2j.K);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace(PluginDeviceInfo.FICONOFF, string3).replace("M", string2).replace("y", string);
    }

    public static vep h() {
        vep vepVar = f26988a.get();
        return vepVar == null ? vep.c() : vepVar;
    }

    public static TimeZone i() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar j() {
        Calendar calendarA = h().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(i());
        return calendarA;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar l() {
        return m(null);
    }

    public static Calendar m(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(i());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat n(Locale locale) {
        return d("yMMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat o(Locale locale) {
        return d("yMMMEd", locale);
    }
}
