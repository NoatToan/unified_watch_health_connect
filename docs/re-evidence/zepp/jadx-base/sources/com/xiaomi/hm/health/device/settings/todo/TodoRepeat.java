package com.xiaomi.hm.health.device.settings.todo;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.assistant.ui.v2.repo.WorkDayRepo;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.nfc.base.PayResponse;
import com.huami.tools.analytics.DbUtils;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH\u0007J+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0013H\u0007J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0007J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0013H\u0002R\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0016\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0016\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u001dR\u0016\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u001d¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoRepeat;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "flag", "", "supportWorkdayRepeat", "", "getDesc", "", "getWeekLoop", "loops", "getFlag", "", "date", "checkFlag", "(ILjava/lang/Long;Z)I", "firstRemind", "Ljava/util/Calendar;", "calculatorNextRepeatDate", "(Ljava/lang/Long;ILjava/util/Calendar;)Ljava/util/Calendar;", "startDate", "calculatorNextWorkDayDate", "repeat", "checkDate", "cal", "a", PayResponse.CODE_UNDEFINED, LogUtil.I, "ONLY_ONCE", "EVERY_DAY", "EVERY_WEEK", "EVERY_MONTH", "EVERY_YEAR", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN", "", "Ljava/util/List;", "getWEEKS", "()Ljava/util/List;", "WEEKS", "WORKDAY", "WEEKEND", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoRepeat {
    public static final int EVERY_DAY = 2;
    public static final int EVERY_MONTH = 8;
    public static final int EVERY_WEEK = 4;
    public static final int EVERY_YEAR = 16;
    public static final int FRI = 512;
    public static final int MON = 32;
    public static final int ONLY_ONCE = 1;
    public static final int SAT = 1024;
    public static final int SUN = 2048;
    public static final int THU = 256;
    public static final int TUE = 64;
    public static final int UNDEFINED = 0;
    public static final int WED = 128;
    public static final int WEEKEND = 3072;
    public static final int WORKDAY = 4096;

    @NotNull
    public static final TodoRepeat INSTANCE = new TodoRepeat();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<Integer> WEEKS = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{32, 64, 128, 256, 512, 1024, 2048});

    private TodoRepeat() {
    }

    private final int a(Calendar cal) {
        return ((cal.get(7) - 1) + 6) % 7;
    }

    @JvmStatic
    @NotNull
    public static final Calendar calculatorNextRepeatDate(@Nullable Long firstRemind, int flag, @NotNull Calendar date) {
        if ((flag != 8 && flag != 16) || firstRemind == null) {
            return calculatorNextRepeatDate(flag, date);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(firstRemind.longValue());
        int i = calendar.get(5);
        Calendar calendarCalculatorNextRepeatDate = calculatorNextRepeatDate(flag, date);
        int actualMaximum = calendarCalculatorNextRepeatDate.getActualMaximum(5);
        if (calendarCalculatorNextRepeatDate.get(5) == i) {
            return calendarCalculatorNextRepeatDate;
        }
        calendarCalculatorNextRepeatDate.set(5, Math.min(i, actualMaximum));
        return calendarCalculatorNextRepeatDate;
    }

    @JvmStatic
    @NotNull
    public static final Calendar calculatorNextWorkDayDate(@NotNull Calendar startDate) {
        boolean z;
        WorkDayRepo companion = WorkDayRepo.INSTANCE.getInstance(DeviceXBuilder.INSTANCE.getContext());
        do {
            z = true;
            startDate.add(6, 1);
            int i = startDate.get(7);
            if (((2 <= i && i <= 6) && !companion.containRestDay(startDate)) || ((i == 1 || i == 7) && companion.containUnRestDay(startDate))) {
                z = false;
            }
        } while (z);
        return startDate;
    }

    @JvmStatic
    public static final long checkDate(long date, int repeat) {
        boolean z;
        boolean z2 = true;
        if ((repeat & 4) <= 0) {
            List<Integer> list = WEEKS;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if ((((Number) it2.next()).intValue() & repeat) > 0) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            return date;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -1);
        return calculatorNextRepeatDate(repeat, calendar).getTimeInMillis();
    }

    @JvmStatic
    public static final int checkFlag(int flag, @Nullable Long date, boolean supportWorkdayRepeat) {
        Calendar calendar;
        TodoRepeat todoRepeat = INSTANCE;
        int iIntValue = 1;
        if (flag == 4) {
            if (date == null) {
                calendar = null;
            } else {
                long jLongValue = date.longValue();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jLongValue);
                calendar = calendar2;
            }
            if (calendar == null) {
                return 1;
            }
            return flag | WEEKS.get(todoRepeat.a(calendar)).intValue();
        }
        int i = 0;
        if (flag != 4096 || supportWorkdayRepeat) {
            List<Integer> list = WEEKS;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if ((((Number) obj).intValue() & flag) > 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            TodoRepeat todoRepeat2 = INSTANCE;
            List<Integer> list2 = WEEKS;
            if (size == list2.size() && (flag & 2) == 0) {
                return 2;
            }
            if (arrayList.size() == 1 && (flag & 4) == 0) {
                return flag | 4;
            }
            if (arrayList.size() != 1 || date == null) {
                return flag;
            }
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(date.longValue());
            int iIntValue2 = list2.get(todoRepeat2.a(calendar3)).intValue();
            return (flag & iIntValue2) == 0 ? iIntValue2 | 4 : flag;
        }
        while (true) {
            int i2 = i + 1;
            iIntValue |= WEEKS.get(i).intValue();
            if (i2 > 4) {
                return iIntValue;
            }
            i = i2;
        }
    }

    public static /* synthetic */ int checkFlag$default(int i, Long l, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return checkFlag(i, l, z);
    }

    @JvmStatic
    @NotNull
    public static final String getDesc(@NotNull Context context, int flag, boolean supportWorkdayRepeat) {
        if (flag == 0 || flag == 1) {
            return context.getString(R.string.todo_only_once);
        }
        if (flag == 2) {
            return context.getString(R.string.event_remind_everyday);
        }
        if (flag == 8) {
            return context.getString(R.string.event_remind_every_month);
        }
        if (flag == 16) {
            return context.getString(R.string.event_remind_every_year);
        }
        if (flag == 4096) {
            return context.getString(R.string.repeat_every_workday);
        }
        if (flag == 4) {
            return context.getString(R.string.event_remind_every_week);
        }
        List<Integer> list = WEEKS;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((((Number) obj).intValue() & flag) > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 2) {
            return context.getString(R.string.event_remind_every_week);
        }
        if (arrayList.size() == 2 && flag == 3072 && supportWorkdayRepeat) {
            return context.getString(R.string.repeat_every_weekend);
        }
        String[] stringArray = context.getResources().getStringArray(R.array.weeks_short);
        StringBuilder sb = new StringBuilder(context.getString(R.string.event_remind_every_week) + " ");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append(stringArray[WEEKS.indexOf(Integer.valueOf(((Number) it2.next()).intValue()))]);
            sb.append(StringUtil.SPACE);
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static /* synthetic */ String getDesc$default(Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return getDesc(context, i, z);
    }

    @JvmStatic
    public static final int getFlag(@NotNull boolean[] loops) {
        if (loops.length != WEEKS.size()) {
            throw new IllegalArgumentException("Illegal loop size!");
        }
        int i = 0;
        int i2 = 0;
        for (boolean z : loops) {
            if (z) {
                i2++;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        int i3 = -1;
        if (i2 == 1) {
            List<Integer> list = WEEKS;
            int length = loops.length;
            while (i < length) {
                if (loops[i]) {
                    i3 = i;
                    break;
                }
                i++;
            }
            return 4 | list.get(i3).intValue();
        }
        if (i2 == 7) {
            return 2;
        }
        int size = WEEKS.size() - 1;
        if (size >= 0) {
            int iIntValue = 0;
            while (true) {
                int i4 = i + 1;
                if (loops[i]) {
                    iIntValue = WEEKS.get(i).intValue() | iIntValue;
                }
                if (i4 > size) {
                    break;
                }
                i = i4;
            }
            i = iIntValue;
        }
        return i;
    }

    @JvmStatic
    @NotNull
    public static final boolean[] getWeekLoop(int flag) {
        TodoRepeat todoRepeat = INSTANCE;
        if (flag == 2) {
            return new boolean[]{true, true, true, true, true, true, true};
        }
        if ((flag == 1 || flag == 8) || flag == 16) {
            return new boolean[]{false, false, false, false, false, false, false};
        }
        boolean[] zArr = {false, false, false, false, false, false, false};
        Iterator<Integer> it2 = todoRepeat.getWEEKS().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if ((flag & iIntValue) > 0) {
                zArr[INSTANCE.getWEEKS().indexOf(Integer.valueOf(iIntValue))] = true;
            }
        }
        return zArr;
    }

    @NotNull
    public final List<Integer> getWEEKS() {
        return WEEKS;
    }

    @JvmStatic
    @NotNull
    public static final Calendar calculatorNextRepeatDate(int flag, @NotNull Calendar date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTimeInMillis());
        if (flag == 0 || flag == 1) {
            return calendar;
        }
        if (flag == 2) {
            calendar.add(6, 1);
            return calendar;
        }
        if (flag == 4) {
            calendar.add(6, 7);
            return calendar;
        }
        if (flag == 8) {
            calendar.add(2, 1);
            return calendar;
        }
        if (flag == 16) {
            calendar.add(1, 1);
            return calendar;
        }
        if (flag == 4096) {
            return calculatorNextWorkDayDate(calendar);
        }
        calendar.add(6, 1);
        while (true) {
            TodoRepeat todoRepeat = INSTANCE;
            if ((todoRepeat.getWEEKS().get(todoRepeat.a(calendar)).intValue() & flag) > 0) {
                return calendar;
            }
            calendar.add(6, 1);
        }
    }
}
