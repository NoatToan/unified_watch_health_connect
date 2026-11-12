package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import health.compact.a.LanguageUtil;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class qjj {
    private static String[] d = e();

    public static int b(String str, Date date) {
        try {
            return Integer.parseInt(new SimpleDateFormat(str).format(date));
        } catch (NumberFormatException e) {
            LogUtil.e("HealthCalendarUtil", "getDate exception" + e.getMessage());
            return 0;
        }
    }

    public static int d(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(i, i2 - 1, 1));
        return calendar.getActualMaximum(5);
    }

    public static int c(int i, int i2, qjo qjoVar) {
        int iD = d(i, i2);
        int iA = a(i, i2, qjoVar.aa());
        int iC = c(i, i2, qjoVar.aa());
        HealthCalendar healthCalendarS = qjoVar.s();
        boolean z = healthCalendarS.getYear() == i && healthCalendarS.getMonth() == i2;
        if (!qjoVar.ao() && z) {
            iD = healthCalendarS.getDay();
            iA = d(healthCalendarS, qjoVar.aa());
        }
        return ((iC + iD) + iA) / 7;
    }

    public static boolean i(HealthCalendar healthCalendar, qjo qjoVar) {
        return healthCalendar.transformCalendar().getTimeInMillis() > qjoVar.s().transformCalendar().getTimeInMillis();
    }

    public static int c(HealthCalendar healthCalendar, qjo qjoVar) {
        int iL;
        int iC = qjoVar.an() ? c(healthCalendar.getYear(), healthCalendar.getMonth(), qjoVar) : c(qjoVar.r(), qjoVar.m(), qjoVar.aa());
        int[] iArrD = qjoVar.d(healthCalendar.toString());
        int iO = 0;
        if (iArrD == null || iC <= 0 || iC + 1 != iArrD.length) {
            iL = 0;
        } else {
            iO = iArrD[iC] * qjoVar.o();
            iL = iArrD[iArrD.length + (-1)] != iArrD[iArrD.length + (-2)] ? qjoVar.l() : 0;
        }
        return (iC * qjoVar.c()) + iO + iL;
    }

    public static int a(int i, int i2, qjo qjoVar) {
        return c(new HealthCalendar(i, i2, 1), qjoVar);
    }

    public static int e(HealthCalendar healthCalendar, int i) {
        return (((healthCalendar.getDay() + a(healthCalendar, i)) - 1) / 7) + 1;
    }

    public static int a(HealthCalendar healthCalendar, int i) {
        return healthCalendar.getDayOfWeekOffset(i);
    }

    static int c(int i, int i2, int i3) {
        return new HealthCalendar(i, i2, 1).getDayOfWeekOffset(i3);
    }

    public static int a(int i, int i2, int i3) {
        return 6 - new HealthCalendar(i, i2, d(i, i2)).getDayOfWeekOffset(i3);
    }

    public static boolean e(HealthCalendar healthCalendar, HealthCalendar healthCalendar2, HealthCalendar healthCalendar3) {
        long timeInMillis = healthCalendar2.transformCalendar().getTimeInMillis();
        long timeInMillis2 = healthCalendar3.transformCalendar().getTimeInMillis();
        long timeInMillis3 = healthCalendar.transformCalendar().getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    public static boolean e(HealthCalendar healthCalendar, qjo qjoVar) {
        return e(healthCalendar, qjoVar.r(), qjoVar.m());
    }

    public static int c(HealthCalendar healthCalendar, HealthCalendar healthCalendar2, int i) {
        return ((((int) ((healthCalendar2.transformCalendar().getTimeInMillis() - healthCalendar.transformCalendar().getTimeInMillis()) / 86400000)) + 1) + (healthCalendar.getDayOfWeekOffset(i) + d(healthCalendar2, i))) / 7;
    }

    public static int d(HealthCalendar healthCalendar, HealthCalendar healthCalendar2, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(healthCalendar2.getYear(), healthCalendar2.getMonth() - 1, healthCalendar2.getDay());
        long timeInMillis = healthCalendar2.transformCalendar().getTimeInMillis();
        int dayOfWeekOffset = healthCalendar2.getDayOfWeekOffset(i);
        int dayOfWeekOffset2 = healthCalendar.getDayOfWeekOffset(i);
        int year = healthCalendar.getYear();
        int month = healthCalendar.getMonth();
        int day = healthCalendar.getDay();
        if (dayOfWeekOffset2 == 0) {
            day++;
        }
        calendar.set(year, month - 1, day);
        return ((dayOfWeekOffset + ((int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000))) / 7) + 1;
    }

    public static HealthCalendar c(HealthCalendar healthCalendar, int i, int i2) {
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        calendarTransformCalendar.add(5, (i - 1) * 7);
        calendarTransformCalendar.add(5, -d(calendarTransformCalendar).getDayOfWeekOffset(i2));
        return d(calendarTransformCalendar);
    }

    public static List<HealthCalendar> d(int i, int i2, qjo qjoVar) {
        HealthCalendar healthCalendar = new HealthCalendar(i, i2, 1);
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        int iA = a(healthCalendar, qjoVar.aa());
        HealthCalendar healthCalendarS = qjoVar.s();
        calendarTransformCalendar.add(5, -iA);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 42; i3++) {
            if (i3 != 0) {
                calendarTransformCalendar.add(5, 1);
            }
            HealthCalendar healthCalendarD = d(calendarTransformCalendar);
            if (healthCalendarD.getMonth() == i2) {
                healthCalendarD.setPresentMonth(true);
            }
            arrayList.add(healthCalendarD);
            if (healthCalendarD.equals(healthCalendarS)) {
                healthCalendarD.setPresentDay(true);
            }
        }
        return arrayList;
    }

    public static List<HealthCalendar> d(qjo qjoVar, int i) {
        HealthCalendar healthCalendarR = qjoVar.r();
        Calendar calendarTransformCalendar = healthCalendarR.transformCalendar();
        int dayOfWeekOffset = healthCalendarR.getDayOfWeekOffset(qjoVar.aa());
        HealthCalendar healthCalendarS = qjoVar.s();
        calendarTransformCalendar.add(5, -dayOfWeekOffset);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i * 7; i2++) {
            if (i2 != 0) {
                calendarTransformCalendar.add(5, 1);
            }
            HealthCalendar healthCalendarD = d(calendarTransformCalendar);
            arrayList.add(healthCalendarD);
            if (healthCalendarD.equals(healthCalendarS)) {
                healthCalendarD.setPresentDay(true);
            }
            if (e(healthCalendarD, qjoVar)) {
                healthCalendarD.setInRange(true);
            }
        }
        return arrayList;
    }

    public static List<HealthCalendar> a(HealthCalendar healthCalendar, qjo qjoVar) {
        int dayOfWeekOffset = healthCalendar.getDayOfWeekOffset(qjoVar.aa());
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        calendarTransformCalendar.add(5, -dayOfWeekOffset);
        return e(d(calendarTransformCalendar), qjoVar, qjoVar.aa());
    }

    public static List<HealthCalendar> e(HealthCalendar healthCalendar, qjo qjoVar, int i) {
        ArrayList arrayList = new ArrayList();
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        for (int i2 = 0; i2 < 7; i2++) {
            if (i2 != 0) {
                calendarTransformCalendar.add(5, 1);
            }
            HealthCalendar healthCalendarD = d(calendarTransformCalendar);
            healthCalendarD.setPresentDay(healthCalendarD.equals(qjoVar.s()));
            healthCalendarD.setPresentMonth(true);
            arrayList.add(healthCalendarD);
        }
        return arrayList;
    }

    private static HealthCalendar d(Calendar calendar) {
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(calendar.get(1));
        healthCalendar.setMonth(calendar.get(2) + 1);
        healthCalendar.setDay(calendar.get(5));
        return healthCalendar;
    }

    public static int d(HealthCalendar healthCalendar, int i) {
        return 6 - healthCalendar.getDayOfWeekOffset(i);
    }

    public static HealthCalendar b(int i, qjo qjoVar) {
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(a(i, qjoVar));
        healthCalendar.setMonth(e(i, qjoVar));
        if (qjoVar.g() != 0) {
            int iD = d(healthCalendar.getYear(), healthCalendar.getMonth());
            HealthCalendar healthCalendar2 = qjoVar.f46318a;
            if (healthCalendar2 == null || healthCalendar2.getDay() == 0) {
                iD = 1;
            } else if (iD >= healthCalendar2.getDay()) {
                iD = healthCalendar2.getDay();
            }
            healthCalendar.setDay(iD);
        } else {
            healthCalendar.setDay(1);
        }
        if (!e(healthCalendar, qjoVar)) {
            if (h(healthCalendar, qjoVar)) {
                healthCalendar = qjoVar.r();
            } else {
                healthCalendar = qjoVar.m();
            }
        }
        healthCalendar.setPresentMonth(healthCalendar.getYear() == qjoVar.s().getYear() && healthCalendar.getMonth() == qjoVar.s().getMonth());
        healthCalendar.setPresentDay(healthCalendar.equals(qjoVar.s()));
        return healthCalendar;
    }

    public static HealthCalendar d(HealthCalendar healthCalendar, qjo qjoVar) {
        if (e(qjoVar.s(), qjoVar) && qjoVar.g() != 2) {
            return qjoVar.b();
        }
        if (e(healthCalendar, qjoVar)) {
            return healthCalendar;
        }
        if (qjoVar.r().isSameMonth(healthCalendar)) {
            return qjoVar.r();
        }
        return qjoVar.m();
    }

    private static boolean h(HealthCalendar healthCalendar, qjo qjoVar) {
        return healthCalendar.transformCalendar().getTimeInMillis() < qjoVar.r().transformCalendar().getTimeInMillis();
    }

    public static int d(qjo qjoVar) {
        return (((qjoVar.m().getYear() - qjoVar.r().getYear()) * 12) - qjoVar.r().getMonth()) + 1 + qjoVar.m().getMonth();
    }

    public static int c(qjo qjoVar) {
        return b(qjoVar.s(), qjoVar);
    }

    public static int b(HealthCalendar healthCalendar, qjo qjoVar) {
        return (((healthCalendar.getYear() - qjoVar.r().getYear()) * 12) + healthCalendar.getMonth()) - qjoVar.r().getMonth();
    }

    public static int a(int i, qjo qjoVar) {
        HealthCalendar healthCalendarR = qjoVar.r();
        return (((i + healthCalendarR.getMonth()) - 1) / 12) + healthCalendarR.getYear();
    }

    public static int e(int i, qjo qjoVar) {
        return (((i + qjoVar.r().getMonth()) - 1) % 12) + 1;
    }

    public static long e(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, 1, 0, 0, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long c(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long d(HealthCalendar healthCalendar) {
        if (healthCalendar == null) {
            return 0L;
        }
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        calendarTransformCalendar.set(11, 0);
        calendarTransformCalendar.set(14, 0);
        return calendarTransformCalendar.getTimeInMillis();
    }

    public static long e(HealthCalendar healthCalendar) {
        if (healthCalendar == null) {
            return 0L;
        }
        Calendar calendarTransformCalendar = healthCalendar.transformCalendar();
        calendarTransformCalendar.set(11, 23);
        calendarTransformCalendar.set(12, 59);
        calendarTransformCalendar.set(13, 59);
        calendarTransformCalendar.set(14, 999);
        return calendarTransformCalendar.getTimeInMillis();
    }

    public static String b(int i, int i2) {
        if (i2 == 2) {
            i = i == 6 ? 0 : i + 1;
        } else if (i2 == 7) {
            i = i == 0 ? 6 : i - 1;
        }
        String str = d[i];
        return str == null ? "" : str;
    }

    public static String e(Context context, int i, int i2) {
        String strB = b(i, i2);
        if (!LanguageUtil.f(context) || TextUtils.isEmpty(strB)) {
            return strB;
        }
        if (LanguageUtil.l(context)) {
            return strB.replace("周", "");
        }
        return strB.replace("週", "");
    }

    public static String[] e() {
        d = new String[7];
        String[] shortWeekdays = DateFormatSymbols.getInstance(Locale.getDefault()).getShortWeekdays();
        int length = shortWeekdays.length;
        String[] strArr = d;
        if (length > strArr.length) {
            System.arraycopy(shortWeekdays, 1, strArr, 0, strArr.length);
        }
        return d;
    }

    public static String d() {
        if (LanguageUtil.f(BaseApplication.b())) {
            return "今";
        }
        return BaseApplication.b().getString(R.string.IDS_detail_sleep_bottom_btu_day_txt);
    }
}
