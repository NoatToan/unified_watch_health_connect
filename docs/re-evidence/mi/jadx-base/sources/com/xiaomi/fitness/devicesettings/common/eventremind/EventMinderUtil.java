package com.xiaomi.fitness.devicesettings.common.eventremind;

import android.content.Context;
import android.text.format.DateUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.lhi;
import defpackage.v84;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\tJ\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d00J#\u00101\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000103¢\u0006\u0002\u00104R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderUtil;", "", "<init>", "()V", "eventMinderModel", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "getEventMinderModel", "()Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "calendarWeekToLoop", "", "week", "", "getCalendarWeekByLoop", "loop", "getLoopByStartDate", "mindItem", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "getWeekStrByLoop", "context", "Landroid/content/Context;", "loops", "", "getCalendarByMonthMode", "Ljava/util/Calendar;", "year", DialWidgetType.DATE, "getNextCalendarYearMode", "month", "getNextReminderTime", "", "startDate", "toFlag", "getWeek", "getEventMinderYearMonthDayTime", "timeDate", "is24Hour", "", "getEventMinderTime", "isCurrentLanguageInCN", "get2HorM", "value", "localToUTC", "Ljava/util/Date;", "localTime", "localTimeInMillis", "utcToLocal", "utcTime", "createRemindDateRange", "Lkotlin/Pair;", "getWeeksByType", "days", "", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventMinderUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMinderUtil.kt\ncom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,365:1\n37#2:366\n36#2,3:367\n37#2:370\n36#2,3:371\n*S KotlinDebug\n*F\n+ 1 EventMinderUtil.kt\ncom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderUtil\n*L\n145#1:366\n145#1:367,3\n178#1:370\n178#1:371,3\n*E\n"})
public final class EventMinderUtil {

    @NotNull
    public static final EventMinderUtil INSTANCE = new EventMinderUtil();

    @NotNull
    private static final EventMinderModel eventMinderModel = new EventMinderModel();

    private EventMinderUtil() {
    }

    private final String get2HorM(int value) {
        if (value >= 10) {
            return String.valueOf(value);
        }
        return "0" + value;
    }

    private final Calendar getCalendarByMonthMode(int year, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        do {
            calendar.add(2, 1);
            if (date <= v84.c(year, calendar.get(2))) {
                calendar.set(5, date);
                Intrinsics.checkNotNull(calendar);
                return calendar;
            }
        } while (calendar.get(2) != 12);
        return getCalendarByMonthMode(year + 1, date);
    }

    private final Calendar getNextCalendarYearMode(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month);
        if (date > v84.c(calendar.get(1), calendar.get(2))) {
            return getNextCalendarYearMode(year + 1, month, date);
        }
        calendar.set(5, date);
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    private final int getWeek(int week) {
        return 1 << (week + 4);
    }

    private final boolean isCurrentLanguageInCN() {
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        return StringsKt__StringsJVMKt.startsWith$default(currentLocale$default, "zh_", false, 2, null) || Intrinsics.areEqual(currentLocale$default, "ug_rcn");
    }

    @NotNull
    public final String calendarWeekToLoop(int week) {
        if (week == 1) {
            return UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP;
        }
        if (week == 3) {
            return "2";
        }
        if (week == 4) {
            return "3";
        }
        if (week == 5) {
            return "4";
        }
        if (week != 6) {
            return week != 7 ? "1" : "6";
        }
        return UserConfig.KEY_DEVICE_LITE_SORT_GROUP;
    }

    @NotNull
    public final Pair<Long, Long> createRemindDateRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.set(1, calendar2.get(1) + 35);
        return TuplesKt.to(Long.valueOf(timeInMillis), Long.valueOf(calendar2.getTimeInMillis()));
    }

    public final int getCalendarWeekByLoop(@NotNull String loop) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        switch (loop.hashCode()) {
            case 49:
                return !loop.equals("1") ? 1 : 2;
            case 50:
                return !loop.equals("2") ? 1 : 3;
            case 51:
                return !loop.equals("3") ? 1 : 4;
            case 52:
                return !loop.equals("4") ? 1 : 5;
            case 53:
                return !loop.equals(UserConfig.KEY_DEVICE_LITE_SORT_GROUP) ? 1 : 6;
            case 54:
                return !loop.equals("6") ? 1 : 7;
            case 55:
                loop.equals(UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP);
                return 1;
            default:
                return 1;
        }
    }

    @NotNull
    public final EventMinderModel getEventMinderModel() {
        return eventMinderModel;
    }

    @NotNull
    public final String getEventMinderTime(long timeDate, boolean is24Hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeDate);
        int i = calendar.get(11);
        int i2 = i == 12 ? i : calendar.get(10);
        int i3 = calendar.get(12);
        String timePeriod = TimeDateUtil.INSTANCE.getTimePeriod(timeDate / ((long) 1000));
        if (is24Hour) {
            return get2HorM(i) + ":" + get2HorM(i3);
        }
        if (isCurrentLanguageInCN()) {
            return timePeriod + i2 + ":" + get2HorM(i3);
        }
        return i2 + ":" + get2HorM(i3) + " " + timePeriod;
    }

    @NotNull
    public final String getEventMinderYearMonthDayTime(@NotNull Context context, long timeDate, boolean is24Hour) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeDate);
        int i = calendar.get(11);
        int i2 = i == 12 ? i : calendar.get(10);
        int i3 = calendar.get(12);
        String timePeriod = TimeDateUtil.INSTANCE.getTimePeriod(timeDate / ((long) 1000));
        if (is24Hour) {
            str = get2HorM(i) + ":" + get2HorM(i3);
        } else if (isCurrentLanguageInCN()) {
            str = timePeriod + i2 + ":" + get2HorM(i3);
        } else {
            str = i2 + ":" + get2HorM(i3) + " " + timePeriod;
        }
        return DateUtils.formatDateTime(context, timeDate, 524308) + " " + str;
    }

    @NotNull
    public final String getLoopByStartDate(@NotNull EventReMinderItem mindItem) {
        Intrinsics.checkNotNullParameter(mindItem, "mindItem");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mindItem.getStartDateLong());
        return calendarWeekToLoop(calendar.get(7));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd A[LOOP:0: B:45:0x00ec->B:52:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0100 A[SYNTHETIC] */
    public final long getNextReminderTime(@NotNull String loop, long startDate) {
        String[] strArr;
        boolean z;
        int i;
        int i2;
        int length;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(loop, "loop");
        if (Intrinsics.areEqual(loop, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
            return startDate;
        }
        Calendar calendar = Calendar.getInstance();
        int iHashCode = loop.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 56) {
                if (iHashCode != 57 || !loop.equals(UserConfig.KEY_LITE_SCENE_ORDER)) {
                    if (calendar.getTimeInMillis() > startDate) {
                        calendar.setTimeInMillis(startDate);
                        calendar.set(1, Calendar.getInstance().get(1));
                        calendar.set(2, Calendar.getInstance().get(2));
                        calendar.set(5, Calendar.getInstance().get(5));
                        if (calendar.getTimeInMillis() <= Calendar.getInstance().getTimeInMillis()) {
                            calendar.add(5, 1);
                        }
                    } else {
                        calendar.setTimeInMillis(startDate);
                    }
                    strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (strArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        i = calendar.get(7);
                        if (i == 1) {
                            i2 = 7;
                        } else {
                            i2 = i - 1;
                        }
                        length = strArr.length;
                        i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i4 = -1;
                                break;
                            }
                            i5 = Integer.parseInt(strArr[i3]);
                            if (i5 > i2) {
                                i4 = i5 - i2;
                                break;
                            }
                            if (i5 == i2) {
                                i4 = 0;
                                break;
                            }
                            i3++;
                        }
                        if (i4 == -1) {
                            i4 = (7 - i2) + Integer.parseInt(strArr[0]);
                        }
                        if (i4 > 0) {
                            calendar.add(5, i4);
                        }
                    }
                } else {
                    if (calendar.getTimeInMillis() < startDate) {
                        return startDate;
                    }
                    calendar.setTimeInMillis(startDate);
                    calendar = getNextCalendarYearMode(calendar.get(1) + 1, calendar.get(2), calendar.get(5));
                }
            } else if (!loop.equals(UserConfig.KEY_MI_BRAIN_SETTING)) {
                if (calendar.getTimeInMillis() > startDate) {
                    calendar.setTimeInMillis(startDate);
                    calendar.set(1, Calendar.getInstance().get(1));
                    calendar.set(2, Calendar.getInstance().get(2));
                    calendar.set(5, Calendar.getInstance().get(5));
                    if (calendar.getTimeInMillis() <= Calendar.getInstance().getTimeInMillis()) {
                        calendar.add(5, 1);
                    }
                } else {
                    calendar.setTimeInMillis(startDate);
                }
                strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i = calendar.get(7);
                    if (i == 1) {
                        i2 = 7;
                    } else {
                        i2 = i - 1;
                    }
                    length = strArr.length;
                    i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i4 = -1;
                            break;
                        }
                        i5 = Integer.parseInt(strArr[i3]);
                        if (i5 > i2) {
                            i4 = i5 - i2;
                            break;
                        }
                        if (i5 == i2) {
                            i4 = 0;
                            break;
                        }
                        i3++;
                    }
                    if (i4 == -1) {
                        i4 = (7 - i2) + Integer.parseInt(strArr[0]);
                    }
                    if (i4 > 0) {
                        calendar.add(5, i4);
                    }
                }
            } else {
                if (calendar.getTimeInMillis() < startDate) {
                    return startDate;
                }
                calendar.setTimeInMillis(startDate);
                calendar = getCalendarByMonthMode(calendar.get(1), calendar.get(5));
            }
        } else if (!loop.equals("0")) {
            if (calendar.getTimeInMillis() > startDate) {
                calendar.setTimeInMillis(startDate);
                calendar.set(1, Calendar.getInstance().get(1));
                calendar.set(2, Calendar.getInstance().get(2));
                calendar.set(5, Calendar.getInstance().get(5));
                if (calendar.getTimeInMillis() <= Calendar.getInstance().getTimeInMillis()) {
                    calendar.add(5, 1);
                }
            } else {
                calendar.setTimeInMillis(startDate);
            }
            strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = calendar.get(7);
                if (i == 1) {
                    i2 = 7;
                } else {
                    i2 = i - 1;
                }
                length = strArr.length;
                i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i4 = -1;
                        break;
                    }
                    i5 = Integer.parseInt(strArr[i3]);
                    if (i5 > i2) {
                        i4 = i5 - i2;
                        break;
                    }
                    if (i5 == i2) {
                        i4 = 0;
                        break;
                    }
                    i3++;
                }
                if (i4 == -1) {
                    i4 = (7 - i2) + Integer.parseInt(strArr[0]);
                }
                if (i4 > 0) {
                    calendar.add(5, i4);
                }
            }
        } else {
            if (calendar.getTimeInMillis() < startDate) {
                return startDate;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(startDate);
            calendar.set(1, Calendar.getInstance().get(1));
            calendar.set(2, Calendar.getInstance().get(2));
            calendar.set(5, Calendar.getInstance().get(5));
            calendar.set(11, calendar2.get(11));
            calendar.set(12, calendar2.get(12));
            calendar.set(13, calendar2.get(13));
            if (calendar.getTimeInMillis() - System.currentTimeMillis() < 0) {
                calendar.add(5, 1);
            }
        }
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String getWeekStrByLoop(@NotNull Context context, @NotNull List<String> loops) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loops, "loops");
        String[] stringArray = context.getResources().getStringArray(lhi.i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = loops.iterator();
        while (it.hasNext()) {
            sb.append(stringArray[Integer.parseInt(it.next()) - 1]);
            sb.append("/");
        }
        String string = sb.deleteCharAt(sb.toString().length() - 1).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String getWeeksByType(@NotNull Context context, @Nullable String[] days) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (days == null) {
            return "";
        }
        if (!(!(days.length == 0))) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] stringArray = context.getResources().getStringArray(lhi.i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        Iterator it = ArrayIteratorKt.iterator(days);
        while (it.hasNext()) {
            sb.append(stringArray[Integer.parseInt((String) it.next()) - 1]);
            sb.append("/");
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Date localToUTC(@NotNull String localTime) {
        Intrinsics.checkNotNullParameter(localTime, "localTime");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(localTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time = date.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return new Date(calendar.getTimeInMillis());
    }

    public final int toFlag(@NotNull String loop) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        if (!StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
            return Intrinsics.areEqual(loop, "0") ? getWeek(1) | getWeek(2) | getWeek(3) | getWeek(4) | getWeek(5) | getWeek(6) | getWeek(7) : getWeek(Integer.parseInt(loop));
        }
        int week = 0;
        for (String str : (String[]) StringsKt__StringsKt.split$default((CharSequence) loop, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0])) {
            week |= getWeek(Integer.parseInt(str));
        }
        return week;
    }

    @NotNull
    public final Date utcToLocal(@NotNull String utcTime) {
        Date date;
        Intrinsics.checkNotNullParameter(utcTime, "utcTime");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            date = simpleDateFormat.parse(utcTime);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        Date date2 = new Date();
        Intrinsics.checkNotNull(date);
        try {
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(date.getTime())));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return date2;
        }
    }

    public final long localToUTC(long localTimeInMillis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(localTimeInMillis);
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return calendar.getTimeInMillis();
    }
}
